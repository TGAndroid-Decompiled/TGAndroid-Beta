package aa;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class w {
    public final SharedPreferences f875a;
    public final o9.g f876b;
    public final Object f877c;
    public TaskCompletionSource d;
    public boolean f878e;
    public boolean f879f;
    public Boolean f880g;
    public final TaskCompletionSource h;

    public w(o9.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: aa.w.<init>(o9.g):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f880g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f876b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f880g == null) {
            str2 = "global Firebase setting";
        } else if (this.f879f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String l10 = p5.c.l("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l10, null);
        }
        return z10;
    }
}
