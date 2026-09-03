package i9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.ai;
public final class s {
    public final SharedPreferences f7418a;
    public final w8.g f7419b;
    public final Object f7420c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f7421f;
    public Boolean f7422g;
    public final TaskCompletionSource h;

    public s(w8.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: i9.s.<init>(w8.g):void");
    }

    public final synchronized boolean a() {
        boolean z4;
        String str;
        String str2;
        Boolean bool = this.f7422g;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            try {
                z4 = this.f7419b.h();
            } catch (IllegalStateException unused) {
                z4 = false;
            }
        }
        if (z4) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f7422g == null) {
            str2 = "global Firebase setting";
        } else if (this.f7421f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String k10 = ai.k("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", k10, null);
        }
        return z4;
    }
}
