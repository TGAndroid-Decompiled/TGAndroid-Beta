package e9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.j2;
public final class t {
    public final SharedPreferences f5063a;
    public final s8.h f5064b;
    public final Object f5065c;
    public TaskCompletionSource d;
    public boolean f5066e;
    public boolean f5067f;
    public Boolean f5068g;
    public final TaskCompletionSource h;

    public t(s8.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: e9.t.<init>(s8.h):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f5068g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f5064b.h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f5068g == null) {
            str2 = "global Firebase setting";
        } else if (this.f5067f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String h = j2.h("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        return z10;
    }
}
