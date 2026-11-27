package defpackage;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
public abstract class iv9 extends IntentService {
    public final boolean a;
    public final short b;
    public final Intent c;
    public final Intent d;
    public hv9 e;
    public hv9 f;

    public iv9() {
        super("SearchActionVerificationClientService");
        this.c = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.d = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.a = !"user".equals(Build.TYPE);
        this.b = (short) 1000;
    }

    public final boolean a(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e);
            return false;
        }
    }

    public final boolean b(java.lang.String r11, android.content.Intent r12, defpackage.hv9 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv9.b(java.lang.String, android.content.Intent, hv9):boolean");
    }

    @Override
    public final void onCreate() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.e = new hv9(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || jye.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.c, this.e, 1);
        }
        this.f = new hv9(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || jye.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            gk.g();
            NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(2131230720), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            wn7 wn7Var = new wn7(getApplicationContext(), "Assistant_verifier");
            wn7Var.q = "Assistant_verifier";
            wn7Var.e = wn7.c(getApplicationContext().getResources().getString(2131230721));
            wn7Var.F.icon = 17301545;
            wn7Var.j = -2;
            wn7Var.x = 1;
            startForeground(10000, wn7Var.b());
        }
    }

    @Override
    public final void onDestroy() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (this.e.a()) {
            unbindService(this.e);
        }
        if (this.f.a()) {
            unbindService(this.f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2 = this.a;
        if (intent == null) {
            if (z2) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean a = a("com.google.android.googlequicksearchbox");
            boolean z3 = true;
            if (a && !this.e.a()) {
                z = false;
            } else {
                z = true;
            }
            if (z2) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a + " connected " + this.e.a());
            }
            boolean a2 = a("com.google.android.apps.assistant");
            if (a2 && !this.f.a()) {
                z3 = false;
            }
            if (z2) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a2 + " connected " + this.f.a());
            }
            if ((!z || !z3) && System.nanoTime() - nanoTime < this.b * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    if (z2) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 33);
                        sb.append("Unexpected InterruptedException: ");
                        sb.append(valueOf);
                        Log.d("SAVerificationClientS", sb.toString());
                    }
                }
            }
        }
        if (b("com.google.android.googlequicksearchbox", intent, this.e)) {
            Log.i("SAVerificationClientS", "Verified the intent with GSA.");
            return;
        }
        Log.i("SAVerificationClientS", "Unable to verify the intent with GSA.");
        if (b("com.google.android.apps.assistant", intent, this.f)) {
            Log.i("SAVerificationClientS", "Verified the intent with Assistant Go.");
        } else {
            Log.i("SAVerificationClientS", "Unable to verify the intent with Assistant Go.");
        }
    }
}
