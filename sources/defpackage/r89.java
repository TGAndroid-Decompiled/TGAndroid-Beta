package defpackage;

import android.net.Uri;
import java.net.URL;
public final class r89 {
    public final ss a;
    public final cy2 b;

    public r89(ss ssVar, cy2 cy2Var) {
        ssVar.getClass();
        cy2Var.getClass();
        this.a = ssVar;
        this.b = cy2Var;
    }

    public final URL a() {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ss ssVar = this.a;
        Uri.Builder appendPath2 = appendPath.appendPath(ssVar.a).appendPath("settings");
        xk xkVar = ssVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", xkVar.c).appendQueryParameter("display_version", xkVar.b).build().toString());
    }
}
