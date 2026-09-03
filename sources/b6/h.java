package b6;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import vh.w2;
public final class h {
    public final int f1608a;
    public String f1609b;
    public String f1610c;

    public h() {
        this.f1608a = 3;
    }

    public p2.q a() {
        if (!"first_party".equals(this.f1610c)) {
            if (this.f1609b != null) {
                if (this.f1610c != null) {
                    return new p2.q(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f1608a) {
            case 4:
                return this.f1609b + ", " + this.f1610c;
            default:
                return super.toString();
        }
    }

    public h(int i10, String str, String str2) {
        this.f1608a = i10;
        this.f1609b = str;
        this.f1610c = str2;
    }

    public h(String str, String str2) {
        this.f1608a = 0;
        m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f1609b = str;
        this.f1610c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public h(f7.b bVar) {
        this.f1608a = 1;
        Context context = (Context) bVar.f6001b;
        int e = i9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f1609b = "Unity";
            String string = context.getResources().getString(e);
            this.f1610c = string;
            String e6 = w2.e("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e6, null);
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
                this.f1609b = "Flutter";
                this.f1610c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f1609b = null;
                this.f1610c = null;
            }
        }
        this.f1609b = null;
        this.f1610c = null;
    }
}
