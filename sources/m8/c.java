package m8;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import e0.t;
import g7.v;
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
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e10);
            return false;
        }
    }

    public final boolean c(java.lang.String r12, android.content.Intent r13, m8.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: m8.c.c(java.lang.String, android.content.Intent, m8.b):boolean");
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
        if (b("com.google.android.googlequicksearchbox") && (a() || v.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new b(this);
        if (b("com.google.android.apps.assistant") && (a() || v.a(this, "com.google.android.apps.assistant"))) {
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
            if (b10 && !b.a(this.searchActionVerificationServiceConnection)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.dbg) {
                boolean a2 = b.a(this.searchActionVerificationServiceConnection);
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + b10 + " connected " + a2);
            }
            boolean b11 = b("com.google.android.apps.assistant");
            if (b11 && !b.a(this.assistantGoVerificationServiceConnection)) {
                z11 = false;
            }
            if (this.dbg) {
                boolean a3 = b.a(this.assistantGoVerificationServiceConnection);
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + b11 + " connected " + a3);
            }
            if ((!z10 || !z11) && System.nanoTime() - nanoTime < this.connectionTimeout * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e10) {
                    if (this.dbg) {
                        String valueOf = String.valueOf(e10);
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
        NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(2131230720), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        t tVar = new t(getApplicationContext(), "Assistant_verifier");
        tVar.f4775q = "Assistant_verifier";
        tVar.f4764e = t.d(getApplicationContext().getResources().getString(2131230721));
        tVar.E.icon = 17301545;
        tVar.f4768j = -2;
        tVar.f4781x = 1;
        startForeground(10000, tVar.b());
    }
}
