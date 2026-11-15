package aa;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class w {
    public final SharedPreferences f876a;
    public final o9.g f877b;
    public final Object f878c;
    public TaskCompletionSource d;
    public boolean f879e;
    public boolean f880f;
    public Boolean f881g;
    public final TaskCompletionSource h;

    public w(o9.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: aa.w.<init>(o9.g):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f881g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f877b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f881g == null) {
            str2 = "global Firebase setting";
        } else if (this.f880f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String l10 = r.b.l("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l10, null);
        }
        return z10;
    }
}
