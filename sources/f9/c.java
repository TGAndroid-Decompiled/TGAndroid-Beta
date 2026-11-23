package f9;

import a8.da;
import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import e0.q;
public abstract class c extends IntentService {
    public final boolean f11595a;
    public final long f11596b;
    public final Intent f11597c;
    public final Intent d;
    public b f11598e;
    public b f11599f;

    public c() {
        super("SearchActionVerificationClientService");
        this.f11597c = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.d = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.f11595a = !"user".equals(Build.TYPE);
        this.f11596b = 1000L;
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

    public final boolean b(java.lang.String r12, android.content.Intent r13, f9.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: f9.c.b(java.lang.String, android.content.Intent, f9.b):boolean");
    }

    @Override
    public final void onCreate() {
        if (this.f11595a) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.f11598e = new b(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || da.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.f11597c, this.f11598e, 1);
        }
        this.f11599f = new b(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || da.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f11599f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(2131230720), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            q qVar = new q(getApplicationContext(), "Assistant_verifier");
            qVar.f10254q = "Assistant_verifier";
            qVar.f10243e = q.d(getApplicationContext().getResources().getString(2131230721));
            qVar.F.icon = 17301545;
            qVar.f10247j = -2;
            qVar.f10260x = 1;
            startForeground(10000, qVar.b());
        }
    }

    @Override
    public final void onDestroy() {
        if (this.f11595a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (b.a(this.f11598e)) {
            unbindService(this.f11598e);
        }
        if (b.a(this.f11599f)) {
            unbindService(this.f11599f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        boolean z10;
        boolean z11 = this.f11595a;
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
            if (a10 && !b.a(this.f11598e)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z11) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a10 + " connected " + b.a(this.f11598e));
            }
            boolean a11 = a("com.google.android.apps.assistant");
            if (a11 && !b.a(this.f11599f)) {
                z12 = false;
            }
            if (z11) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a11 + " connected " + b.a(this.f11599f));
            }
            if ((!z10 || !z12) && System.nanoTime() - nanoTime < this.f11596b * 1000000) {
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
        if (b("com.google.android.googlequicksearchbox", intent, this.f11598e)) {
            Log.i("SAVerificationClientS", "Verified the intent with GSA.");
            return;
        }
        Log.i("SAVerificationClientS", "Unable to verify the intent with GSA.");
        if (b("com.google.android.apps.assistant", intent, this.f11599f)) {
            Log.i("SAVerificationClientS", "Verified the intent with Assistant Go.");
        } else {
            Log.i("SAVerificationClientS", "Unable to verify the intent with Assistant Go.");
        }
    }
}
