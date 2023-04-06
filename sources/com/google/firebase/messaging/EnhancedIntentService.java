package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable(this, intent, taskCompletionSource) {
            private final EnhancedIntentService arg$1;
            private final Intent arg$2;
            private final TaskCompletionSource arg$3;

            {
                this.arg$1 = this;
                this.arg$2 = intent;
                this.arg$3 = taskCompletionSource;
            }

            @Override
            public void run() {
                this.arg$1.lambda$processIntent$0$EnhancedIntentService(this.arg$2, this.arg$3);
            }
        });
        return taskCompletionSource.getTask();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, Task task) {
        finishTask(intent);
    }

    public final void lambda$processIntent$0$EnhancedIntentService(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() {
                @Override
                public Task<Void> handle(Intent intent2) {
                    return EnhancedIntentService.this.processIntent(intent2);
                }
            });
        }
        return this.binder;
    }

    @Override
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(EnhancedIntentService$$Lambda$1.$instance, new OnCompleteListener(this, intent) {
            private final EnhancedIntentService arg$1;
            private final Intent arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = intent;
            }

            @Override
            public void onComplete(Task task) {
                this.arg$1.lambda$onStartCommand$1$EnhancedIntentService(this.arg$2, task);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
