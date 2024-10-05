package org.telegram.messenger.support;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;

public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    final ArrayList<CompatWorkItem> mCompatQueue;
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    CompatJobEngine mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        CommandProcessor() {
        }

        @Override
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                try {
                    dequeueWork.complete();
                } catch (Throwable unused) {
                }
            }
        }

        @Override
        public void onCancelled(Void r1) {
            JobIntentService.this.processorFinished();
        }

        @Override
        public void onPostExecute(Void r1) {
            JobIntentService.this.processorFinished();
        }
    }

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(context, componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override
        void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.mLaunchingService) {
                            this.mLaunchingService = true;
                            if (!this.mServiceProcessing) {
                                this.mLaunchWakeLock.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override
        public void serviceProcessingFinished() {
            synchronized (this) {
                try {
                    if (this.mServiceProcessing) {
                        if (this.mLaunchingService) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                        this.mServiceProcessing = false;
                        this.mRunWakeLock.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void serviceProcessingStarted() {
            synchronized (this) {
                try {
                    if (!this.mServiceProcessing) {
                        this.mServiceProcessing = true;
                        try {
                            this.mRunWakeLock.acquire(120000L);
                            this.mLaunchWakeLock.release();
                        } catch (Throwable th) {
                            FileLog.e(th);
                            this.mServiceProcessing = false;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        @Override
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        @Override
        public Intent getIntent() {
            return this.mIntent;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override
            public void complete() {
                synchronized (JobServiceEngineImpl.this.mLock) {
                    try {
                        JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.mJobWork);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override
            public Intent getIntent() {
                Intent intent;
                intent = this.mJobWork.getIntent();
                return intent;
            }
        }

        JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override
        public IBinder compatGetBinder() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override
        public GenericWorkItem dequeueWork() {
            JobWorkItem jobWorkItem;
            Intent intent;
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    jobWorkItem = jobParameters.dequeueWork();
                } catch (Throwable unused) {
                    jobWorkItem = null;
                }
                if (jobWorkItem == null) {
                    return null;
                }
                intent = jobWorkItem.getIntent();
                intent.setExtrasClassLoader(this.mService.getClassLoader());
                return new WrapperWorkItem(jobWorkItem);
            }
        }

        @Override
        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override
        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.mService.doStopCurrentWork();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return doStopCurrentWork;
        }
    }

    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            JobInfo.Builder overrideDeadline;
            JobInfo.Builder requiredNetworkType;
            JobInfo build;
            ensureJobId(i);
            overrideDeadline = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0L);
            requiredNetworkType = overrideDeadline.setRequiredNetworkType(1);
            build = requiredNetworkType.build();
            this.mJobInfo = build;
            this.mJobScheduler = JobInfoScheduler$$ExternalSyntheticApiModelOutline0.m(context.getApplicationContext().getSystemService("jobscheduler"));
        }

        @Override
        void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    public static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        WorkEnqueuer(Context context, ComponentName componentName) {
            this.mComponentName = componentName;
        }

        abstract void enqueueWork(Intent intent);

        void ensureJobId(int i) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else {
                if (this.mJobId == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    public JobIntentService() {
        this.mCompatQueue = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            WorkEnqueuer workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.ensureJobId(i);
            workEnqueuer.enqueueWork(intent);
        }
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, (Class<?>) cls), i, intent);
    }

    static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        WorkEnqueuer compatWorkEnqueuer;
        HashMap<ComponentName, WorkEnqueuer> hashMap = sClassWorkEnqueuer;
        WorkEnqueuer workEnqueuer = hashMap.get(componentName);
        if (workEnqueuer == null) {
            if (Build.VERSION.SDK_INT < 26) {
                compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
            } else {
                if (!z) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i);
            }
            workEnqueuer = compatWorkEnqueuer;
            hashMap.put(componentName, workEnqueuer);
        }
        return workEnqueuer;
    }

    GenericWorkItem dequeueWork() {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.dequeueWork();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean doStopCurrentWork() {
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new JobServiceEngineImpl(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.serviceProcessingFinished();
            }
        }
    }

    protected abstract void onHandleWork(Intent intent);

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.serviceStartReceived();
        synchronized (this.mCompatQueue) {
            ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    void processorFinished() {
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<CompatWorkItem> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.serviceProcessingFinished();
                    }
                } finally {
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }
}
