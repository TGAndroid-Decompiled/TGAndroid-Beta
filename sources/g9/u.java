package g9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.th;
public final class u {
    public final SharedPreferences f7220a;
    public final u8.g f7221b;
    public final Object f7222c;
    public TaskCompletionSource d;
    public boolean f7223e;
    public boolean f7224f;
    public Boolean f7225g;
    public final TaskCompletionSource h;

    public u(u8.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: g9.u.<init>(u8.g):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f7225g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f7221b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f7225g == null) {
            str2 = "global Firebase setting";
        } else if (this.f7224f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String j10 = th.j("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j10, null);
        }
        return z10;
    }
}
