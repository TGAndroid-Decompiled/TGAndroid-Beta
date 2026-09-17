package c9;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import v7.d5;
public abstract class d extends IntentService {
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
    private c assistantGoVerificationServiceConnection;
    private final long connectionTimeout;
    private final boolean dbg;
    private final Intent gsaServiceIntent;
    private c searchActionVerificationServiceConnection;

    public d() {
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
        if (!isTestingMode() && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    public final boolean b(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e7);
            return false;
        }
    }

    public final boolean c(java.lang.String r12, android.content.Intent r13, c9.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: c9.d.c(java.lang.String, android.content.Intent, c9.c):boolean");
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
        this.searchActionVerificationServiceConnection = new c(this);
        if (b("com.google.android.googlequicksearchbox") && (a() || d5.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new c(this);
        if (b("com.google.android.apps.assistant") && (a() || d5.a(this, "com.google.android.apps.assistant"))) {
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
        if (c.a(this.searchActionVerificationServiceConnection)) {
            unbindService(this.searchActionVerificationServiceConnection);
        }
        if (c.a(this.assistantGoVerificationServiceConnection)) {
            unbindService(this.assistantGoVerificationServiceConnection);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        boolean z10;
        if (intent == null) {
            if (this.dbg) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean b10 = b("com.google.android.googlequicksearchbox");
            boolean z11 = true;
            if (b10 && !c.a(this.searchActionVerificationServiceConnection)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.dbg) {
                boolean a2 = c.a(this.searchActionVerificationServiceConnection);
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + b10 + " connected " + a2);
            }
            boolean b11 = b("com.google.android.apps.assistant");
            if (b11 && !c.a(this.assistantGoVerificationServiceConnection)) {
                z11 = false;
            }
            if (this.dbg) {
                boolean a10 = c.a(this.assistantGoVerificationServiceConnection);
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + b11 + " connected " + a10);
            }
            if ((!z10 || !z11) && System.nanoTime() - nanoTime < this.connectionTimeout * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e7) {
                    if (this.dbg) {
                        String valueOf = String.valueOf(e7);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
                        sb2.append("Unexpected InterruptedException: ");
                        sb2.append(valueOf);
                        Log.d("SAVerificationClientS", sb2.toString());
                    }
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
        b.d();
        NotificationChannel b10 = b.b(getApplicationContext().getResources().getString(2131230720));
        b10.enableVibration(false);
        b10.enableLights(false);
        b10.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(b10);
        startForeground(10000, new NotificationCompat.Builder(getApplicationContext(), "Assistant_verifier").setGroup("Assistant_verifier").setContentTitle(getApplicationContext().getResources().getString(2131230721)).setSmallIcon(17301545).setPriority(-2).setVisibility(1).build());
    }
}
