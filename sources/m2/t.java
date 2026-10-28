package m2;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.ui.Components.b10;
public final class t {
    public final int f17987a = 0;
    public final String f17988b;
    public final String f17989c;

    public t(String str, String str2) {
        this.f17988b = str;
        this.f17989c = str2;
    }

    public String toString() {
        switch (this.f17987a) {
            case 0:
                return this.f17988b + ", " + this.f17989c;
            default:
                return super.toString();
        }
    }

    public t(m4.c cVar) {
        Context context = (Context) cVar.f18008b;
        int e = y9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f17988b = "Unity";
            String string = context.getResources().getString(e);
            this.f17989c = string;
            String j10 = b10.j("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", j10, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f17988b = "Flutter";
                this.f17989c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f17988b = null;
                this.f17989c = null;
            }
        }
        this.f17988b = null;
        this.f17989c = null;
    }
}
