package n8;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import e0.t;
import h7.x;

public abstract class c extends IntentService {
    private static final int CONNECTION_TIMEOUT_IN_MS = 1000;
    public static final String EXTRA_INTENT = "SearchActionVerificationClientExtraIntent";
    private static final long MS_TO_NS = 1000000;
    private static final String NOTIFICATION_CHANNEL_ID = "Assistant_verifier";
    private static final int NOTIFICATION_ID = 10000;
    private static final String REMOTE_ASSISTANT_GO_SERVICE_ACTION = "com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE";
    private static final String REMOTE_GSA_SERVICE_ACTION = "com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE";
    private static final String SEND_MESSAGE_ERROR_MESSAGE = "com.google.android.voicesearch.extra.ERROR_MESSAGE";
    private static final String SEND_MESSAGE_RESULT_RECEIVER = "com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER";
    private static final String TAG = "SAVerificationClientS";
    private static final int TIME_TO_SLEEP_IN_MS = 50;
    private final Intent assistantGoServiceIntent;
    private b assistantGoVerificationServiceConnection;
    private final long connectionTimeout;
    private final boolean dbg;
    private final Intent gsaServiceIntent;
    private b searchActionVerificationServiceConnection;

    public c() {
        super("SearchActionVerificationClientService");
        Intent intent = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.gsaServiceIntent = intent;
        Intent intent2 = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.assistantGoServiceIntent = intent2;
        this.dbg = a();
        if (isTestingMode()) {
            intent.setPackage("com.google.verificationdemo.fakeverification");
            intent2.setPackage("com.google.verificationdemo.fakeverification");
        }
        this.connectionTimeout = getConnectionTimeout();
    }

    public final boolean a() {
        return isTestingMode() || !"user".equals(Build.TYPE);
    }

    public final boolean b(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || !applicationInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException e9) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e9);
            return false;
        }
    }

    public final boolean c(String str, Intent intent, b bVar) {
        String message;
        boolean zB;
        if (str.equals("com.google.android.googlequicksearchbox") || str.equals("com.google.android.apps.assistant")) {
            if (a() || x.a(this, str)) {
                if (intent.hasExtra("SearchActionVerificationClientExtraIntent")) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
                    if (this.dbg) {
                        Log.d("SAVerificationClientU", "Intent:");
                        String strValueOf = String.valueOf(intent2);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1);
                        sb2.append("\t");
                        sb2.append(strValueOf);
                        Log.d("SAVerificationClientU", sb2.toString());
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            Log.d("SAVerificationClientU", "Extras:");
                            for (String str2 : extras.keySet()) {
                                Log.d("SAVerificationClientU", String.format("\t%s: %s", str2, extras.get(str2)));
                            }
                        }
                    }
                    if (b.a(bVar)) {
                        try {
                            m8.a aVar = (m8.a) bVar.f18444a;
                            aVar.getClass();
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                            Parcel parcelE0 = aVar.E0(parcelObtain, 2);
                            int i10 = parcelE0.readInt();
                            parcelE0.recycle();
                            Log.i("SAVerificationClientS", str + " Service API version: " + i10);
                            Bundle bundle = new Bundle();
                            zB = bVar.b(intent2, bundle);
                            performAction(intent2, zB, bundle);
                            message = "";
                        } catch (RemoteException e9) {
                            String strValueOf2 = String.valueOf(e9.getMessage());
                            Log.e("SAVerificationClientS", strValueOf2.length() != 0 ? "Remote exception: ".concat(strValueOf2) : new String("Remote exception: "));
                            message = e9.getMessage();
                            zB = false;
                        } catch (Exception e10) {
                            String strValueOf3 = String.valueOf(e10.getMessage());
                            Log.e("SAVerificationClientS", strValueOf3.length() != 0 ? "Exception: ".concat(strValueOf3) : new String("Exception: "));
                            message = e10.getMessage();
                            zB = false;
                        }
                        if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                            ResultReceiver resultReceiver = (ResultReceiver) intent2.getExtras().getParcelable("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER");
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("com.google.android.voicesearch.extra.ERROR_MESSAGE", message);
                            resultReceiver.send(zB ? 0 : -1, bundle2);
                        }
                        return zB;
                    }
                    Object[] objArr = {str, intent};
                    message = "VerificationService is not connected to %s, unable to check intent: %s";
                    Log.e("SAVerificationClientS", String.format("VerificationService is not connected to %s, unable to check intent: %s", objArr));
                    zB = false;
                    if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                        ResultReceiver resultReceiver2 = (ResultReceiver) intent2.getExtras().getParcelable("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER");
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("com.google.android.voicesearch.extra.ERROR_MESSAGE", message);
                        resultReceiver2.send(zB ? 0 : -1, bundle3);
                    }
                    return zB;
                }
                if (this.dbg) {
                    String strValueOf4 = String.valueOf(intent);
                    StringBuilder sb3 = new StringBuilder(strValueOf4.length() + 28);
                    sb3.append("No extra, nothing to check: ");
                    sb3.append(strValueOf4);
                    Log.d("SAVerificationClientS", sb3.toString());
                }
            } else if (this.dbg) {
                Log.d("SAVerificationClientS", "Cannot verify the intent with package " + str + " in unsafe mode.");
                return false;
            }
        } else if (this.dbg) {
            Log.d("SAVerificationClientS", "Unsupported package " + str + " for verification.");
            return false;
        }
        return false;
    }

    public long getConnectionTimeout() {
        return 1000L;
    }

    public boolean isTestingMode() {
        return false;
    }

    @Override
    public final void onCreate() {
        if (this.dbg) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.searchActionVerificationServiceConnection = new b(this);
        if (b("com.google.android.googlequicksearchbox") && (a() || x.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new b(this);
        if (b("com.google.android.apps.assistant") && (a() || x.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.assistantGoServiceIntent, this.assistantGoVerificationServiceConnection, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            postForegroundNotification();
        }
    }

    @Override
    public final void onDestroy() {
        if (this.dbg) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (b.a(this.searchActionVerificationServiceConnection)) {
            unbindService(this.searchActionVerificationServiceConnection);
        }
        if (b.a(this.assistantGoVerificationServiceConnection)) {
            unbindService(this.assistantGoVerificationServiceConnection);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            if (this.dbg) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            boolean zB = b("com.google.android.googlequicksearchbox");
            boolean z10 = true;
            boolean z11 = !zB || b.a(this.searchActionVerificationServiceConnection);
            if (this.dbg) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + zB + " connected " + b.a(this.searchActionVerificationServiceConnection));
            }
            boolean zB2 = b("com.google.android.apps.assistant");
            if (zB2 && !b.a(this.assistantGoVerificationServiceConnection)) {
                z10 = false;
            }
            if (this.dbg) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + zB2 + " connected " + b.a(this.assistantGoVerificationServiceConnection));
            }
            if ((z11 && z10) || System.nanoTime() - jNanoTime >= this.connectionTimeout * 1000000) {
                break;
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e9) {
                if (this.dbg) {
                    String strValueOf = String.valueOf(e9);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33);
                    sb2.append("Unexpected InterruptedException: ");
                    sb2.append(strValueOf);
                    Log.d("SAVerificationClientS", sb2.toString());
                }
            }
        }
        if (c("com.google.android.googlequicksearchbox", intent, this.searchActionVerificationServiceConnection)) {
            Log.i("SAVerificationClientS", "Verified the intent with GSA.");
            return;
        }
        Log.i("SAVerificationClientS", "Unable to verify the intent with GSA.");
        if (c("com.google.android.apps.assistant", intent, this.assistantGoVerificationServiceConnection)) {
            Log.i("SAVerificationClientS", "Verified the intent with Assistant Go.");
        } else {
            Log.i("SAVerificationClientS", "Unable to verify the intent with Assistant Go.");
        }
    }

    public abstract void performAction(Intent intent, boolean z10, Bundle bundle);

    public void postForegroundNotification() {
        NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(2131230720), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        t tVar = new t(getApplicationContext(), "Assistant_verifier");
        tVar.f5132q = "Assistant_verifier";
        tVar.f5121e = t.d(getApplicationContext().getResources().getString(2131230721));
        tVar.E.icon = 17301545;
        tVar.f5125j = -2;
        tVar.f5138x = 1;
        startForeground(10000, tVar.b());
    }
}
