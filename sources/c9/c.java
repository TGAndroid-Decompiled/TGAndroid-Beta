package c9;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import e0.r;
import v7.f5;
public abstract class c extends IntentService {
    public final boolean f4072a;
    public final long f4073b;
    public final Intent f4074c;
    public final Intent d;
    public b e;
    public b f4075f;

    public c() {
        super("SearchActionVerificationClientService");
        this.f4074c = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.d = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.f4072a = !"user".equals(Build.TYPE);
        this.f4073b = 1000L;
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

    public final boolean b(java.lang.String r12, android.content.Intent r13, c9.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: c9.c.b(java.lang.String, android.content.Intent, c9.b):boolean");
    }

    @Override
    public final void onCreate() {
        if (this.f4072a) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.e = new b(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || f5.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.f4074c, this.e, 1);
        }
        this.f4075f = new b(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || f5.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f4075f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(2131230720), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            r rVar = new r(getApplicationContext(), "Assistant_verifier");
            rVar.f6070q = "Assistant_verifier";
            rVar.e = r.d(getApplicationContext().getResources().getString(2131230721));
            rVar.F.icon = 17301545;
            rVar.f6063j = -2;
            rVar.f6076x = 1;
            startForeground(10000, rVar.b());
        }
    }

    @Override
    public final void onDestroy() {
        if (this.f4072a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (b.a(this.e)) {
            unbindService(this.e);
        }
        if (b.a(this.f4075f)) {
            unbindService(this.f4075f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        boolean z10;
        boolean z11 = this.f4072a;
        if (intent == null) {
            if (z11) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean a2 = a("com.google.android.googlequicksearchbox");
            boolean z12 = true;
            if (a2 && !b.a(this.e)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z11) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a2 + " connected " + b.a(this.e));
            }
            boolean a10 = a("com.google.android.apps.assistant");
            if (a10 && !b.a(this.f4075f)) {
                z12 = false;
            }
            if (z11) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a10 + " connected " + b.a(this.f4075f));
            }
            if ((!z10 || !z12) && System.nanoTime() - nanoTime < this.f4073b * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    if (z11) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
                        sb2.append("Unexpected InterruptedException: ");
                        sb2.append(valueOf);
                        Log.d("SAVerificationClientS", sb2.toString());
                    }
                }
            }
        }
        if (b("com.google.android.googlequicksearchbox", intent, this.e)) {
            Log.i("SAVerificationClientS", "Verified the intent with GSA.");
            return;
        }
        Log.i("SAVerificationClientS", "Unable to verify the intent with GSA.");
        if (b("com.google.android.apps.assistant", intent, this.f4075f)) {
            Log.i("SAVerificationClientS", "Verified the intent with Assistant Go.");
        } else {
            Log.i("SAVerificationClientS", "Unable to verify the intent with Assistant Go.");
        }
    }
}
