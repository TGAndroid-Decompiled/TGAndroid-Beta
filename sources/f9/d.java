package f9;

import a8.ca;
import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
public abstract class d extends IntentService {
    public final boolean f11600a;
    public final long f11601b;
    public final Intent f11602c;
    public final Intent d;
    public c f11603e;
    public c f11604f;

    public d() {
        super("SearchActionVerificationClientService");
        this.f11602c = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.d = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.f11600a = !"user".equals(Build.TYPE);
        this.f11601b = 1000L;
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
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e10);
            return false;
        }
    }

    public final boolean b(java.lang.String r12, android.content.Intent r13, f9.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: f9.d.b(java.lang.String, android.content.Intent, f9.c):boolean");
    }

    public final void c() {
        b.e();
        NotificationChannel c10 = b.c(getApplicationContext().getResources().getString(2131230720));
        c10.enableVibration(false);
        c10.enableLights(false);
        c10.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(c10);
        startForeground(10000, new NotificationCompat.Builder(getApplicationContext(), "Assistant_verifier").setGroup("Assistant_verifier").setContentTitle(getApplicationContext().getResources().getString(2131230721)).setSmallIcon(17301545).setPriority(-2).setVisibility(1).build());
    }

    @Override
    public final void onCreate() {
        if (this.f11600a) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.f11603e = new c(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || ca.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.f11602c, this.f11603e, 1);
        }
        this.f11604f = new c(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || ca.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f11604f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c();
        }
    }

    @Override
    public final void onDestroy() {
        if (this.f11600a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (c.a(this.f11603e)) {
            unbindService(this.f11603e);
        }
        if (c.a(this.f11604f)) {
            unbindService(this.f11604f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        boolean z10;
        boolean z11 = this.f11600a;
        if (intent == null) {
            if (z11) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean a10 = a("com.google.android.googlequicksearchbox");
            boolean z12 = true;
            if (a10 && !c.a(this.f11603e)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z11) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a10 + " connected " + c.a(this.f11603e));
            }
            boolean a11 = a("com.google.android.apps.assistant");
            if (a11 && !c.a(this.f11604f)) {
                z12 = false;
            }
            if (z11) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a11 + " connected " + c.a(this.f11604f));
            }
            if ((!z10 || !z12) && System.nanoTime() - nanoTime < this.f11601b * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e10) {
                    if (z11) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
                        sb2.append("Unexpected InterruptedException: ");
                        sb2.append(valueOf);
                        Log.d("SAVerificationClientS", sb2.toString());
                    }
                }
            }
        }
        if (b("com.google.android.googlequicksearchbox", intent, this.f11603e)) {
            Log.i("SAVerificationClientS", "Verified the intent with GSA.");
            return;
        }
        Log.i("SAVerificationClientS", "Unable to verify the intent with GSA.");
        if (b("com.google.android.apps.assistant", intent, this.f11604f)) {
            Log.i("SAVerificationClientS", "Verified the intent with Assistant Go.");
        } else {
            Log.i("SAVerificationClientS", "Unable to verify the intent with Assistant Go.");
        }
    }
}
