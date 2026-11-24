package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class i73 {
    public final SharedPreferences a;
    public final li4 b;
    public final Object c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final TaskCompletionSource h;

    public i73(defpackage.li4 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i73.<init>(li4):void");
    }

    public final synchronized boolean a() {
        boolean z;
        String str;
        String str2;
        Boolean bool = this.g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = this.b.h();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.g == null) {
            str2 = "global Firebase setting";
        } else if (this.f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String i = b10.i("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i, null);
        }
        return z;
    }
}
