package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.h0;
public final class a {
    public final int f11275a;
    public String f11276b;
    public String f11277c;

    public a() {
        this.f11275a = 1;
    }

    public p a() {
        if (!"first_party".equals(this.f11277c)) {
            if (this.f11276b != null) {
                if (this.f11277c != null) {
                    return new p(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f11275a) {
            case 3:
                return this.f11276b + ", " + this.f11277c;
            default:
                return super.toString();
        }
    }

    public a(int i7, String str, String str2) {
        this.f11275a = i7;
        this.f11276b = str;
        this.f11277c = str2;
    }

    public a(h0 h0Var) {
        this.f11275a = 5;
        Context context = (Context) h0Var.f57261b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f11276b = "Unity";
            String string = context.getResources().getString(e10);
            this.f11277c = string;
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
                this.f11276b = "Flutter";
                this.f11277c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f11276b = null;
                this.f11277c = null;
            }
        }
        this.f11276b = null;
        this.f11277c = null;
    }
}
