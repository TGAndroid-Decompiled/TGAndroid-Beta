package e5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class a {
    public final int f9553a;
    public String f9554b;
    public String f9555c;

    public a() {
        this.f9553a = 1;
    }

    public o a() {
        if (!"first_party".equals(this.f9555c)) {
            if (this.f9554b != null) {
                if (this.f9555c != null) {
                    return new o(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f9553a) {
            case 2:
                return this.f9554b + ", " + this.f9555c;
            default:
                return super.toString();
        }
    }

    public a(int i3, String str, String str2) {
        this.f9553a = i3;
        this.f9554b = str;
        this.f9555c = str2;
    }

    public a(w9.b bVar) {
        this.f9553a = 3;
        Context context = (Context) bVar.f57424b;
        int e10 = z9.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f9554b = "Unity";
            String string = context.getResources().getString(e10);
            this.f9555c = string;
            String f10 = t4.c.f("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", f10, null);
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
                this.f9554b = "Flutter";
                this.f9555c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f9554b = null;
                this.f9555c = null;
            }
        }
        this.f9554b = null;
        this.f9555c = null;
    }
}
