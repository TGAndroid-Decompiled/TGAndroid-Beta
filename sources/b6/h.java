package b6;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import vh.v2;
public final class h {
    public final int f1597a;
    public String f1598b;
    public String f1599c;

    public h() {
        this.f1597a = 3;
    }

    public p2.q a() {
        if (!"first_party".equals(this.f1599c)) {
            if (this.f1598b != null) {
                if (this.f1599c != null) {
                    return new p2.q(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f1597a) {
            case 4:
                return this.f1598b + ", " + this.f1599c;
            default:
                return super.toString();
        }
    }

    public h(int i10, String str, String str2) {
        this.f1597a = i10;
        this.f1598b = str;
        this.f1599c = str2;
    }

    public h(String str, String str2) {
        this.f1597a = 0;
        m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f1598b = str;
        this.f1599c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public h(f7.b bVar) {
        this.f1597a = 1;
        Context context = (Context) bVar.f6012b;
        int e = i9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f1598b = "Unity";
            String string = context.getResources().getString(e);
            this.f1599c = string;
            String e6 = v2.e("Unity Editor version is: ", string);
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
                this.f1598b = "Flutter";
                this.f1599c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f1598b = null;
                this.f1599c = null;
            }
        }
        this.f1598b = null;
        this.f1599c = null;
    }
}
