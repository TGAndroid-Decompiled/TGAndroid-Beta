package aa;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.f1;
public final class x {
    public final SharedPreferences f879a;
    public final o9.g f880b;
    public final Object f881c;
    public TaskCompletionSource d;
    public boolean f882e;
    public boolean f883f;
    public Boolean f884g;
    public final TaskCompletionSource h;

    public x(o9.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: aa.x.<init>(o9.g):void");
    }

    public final synchronized boolean a() {
        boolean z9;
        String str;
        String str2;
        Boolean bool = this.f884g;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            try {
                z9 = this.f880b.h();
            } catch (IllegalStateException unused) {
                z9 = false;
            }
        }
        if (z9) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f884g == null) {
            str2 = "global Firebase setting";
        } else if (this.f883f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String m10 = f1.m("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", m10, null);
        }
        return z9;
    }
}
