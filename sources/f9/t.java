package f9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.pa;

public final class t {

    public final SharedPreferences f5995a;

    public final t8.h f5996b;

    public final Object f5997c;
    public TaskCompletionSource d;

    public boolean f5998e;

    public boolean f5999f;

    public Boolean f6000g;
    public final TaskCompletionSource h;

    public t(t8.h hVar) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.f5997c = obj;
        this.d = new TaskCompletionSource();
        this.f5998e = false;
        this.f5999f = false;
        this.h = new TaskCompletionSource();
        hVar.a();
        Context context = hVar.f48119a;
        this.f5996b = hVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f5995a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f5999f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e9) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e9);
            }
            if (boolValueOf2 == null) {
                this.f5999f = false;
                boolValueOf = null;
            } else {
                this.f5999f = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f6000g = boolValueOf;
        synchronized (obj) {
            try {
                if (a()) {
                    this.d.trySetResult(null);
                    this.f5998e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zH;
        String str;
        Boolean bool = this.f6000g;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = this.f5996b.h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        String str2 = zH ? "ENABLED" : "DISABLED";
        if (this.f6000g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f5999f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strJ = pa.j("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strJ, null);
        }
        return zH;
    }
}
