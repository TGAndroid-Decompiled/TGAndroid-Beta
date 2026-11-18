package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.h0;
public final class a {
    public final int f11243a;
    public String f11244b;
    public String f11245c;

    public a() {
        this.f11243a = 1;
    }

    public p a() {
        if (!"first_party".equals(this.f11245c)) {
            if (this.f11244b != null) {
                if (this.f11245c != null) {
                    return new p(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f11243a) {
            case 3:
                return this.f11244b + ", " + this.f11245c;
            default:
                return super.toString();
        }
    }

    public a(int i7, String str, String str2) {
        this.f11243a = i7;
        this.f11244b = str;
        this.f11245c = str2;
    }

    public a(h0 h0Var) {
        this.f11243a = 5;
        Context context = (Context) h0Var.f57216b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f11244b = "Unity";
            String string = context.getResources().getString(e10);
            this.f11245c = string;
            String k10 = p5.c.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", k10, null);
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
                this.f11244b = "Flutter";
                this.f11245c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f11244b = null;
                this.f11245c = null;
            }
        }
        this.f11244b = null;
        this.f11245c = null;
    }
}
