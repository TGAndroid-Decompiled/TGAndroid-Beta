package i9;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.yh;
public final class s {
    public final SharedPreferences f8005a;
    public final w8.g f8006b;
    public final Object f8007c;
    public TaskCompletionSource d;
    public boolean f8008e;
    public boolean f8009f;
    public Boolean f8010g;
    public final TaskCompletionSource h;

    public s(w8.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: i9.s.<init>(w8.g):void");
    }

    public final synchronized boolean a() {
        boolean z4;
        String str;
        String str2;
        Boolean bool = this.f8010g;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            try {
                z4 = this.f8006b.h();
            } catch (IllegalStateException unused) {
                z4 = false;
            }
        }
        if (z4) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f8010g == null) {
            str2 = "global Firebase setting";
        } else if (this.f8009f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String l10 = yh.l("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l10, null);
        }
        return z4;
    }
}
