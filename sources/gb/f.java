package gb;

import android.net.Uri;
import java.net.URL;
public final class f {
    public final db.b f12215a;
    public final fd.h f12216b;

    public f(db.b appInfo, fd.h blockingDispatcher) {
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        this.f12215a = appInfo;
        this.f12216b = blockingDispatcher;
    }

    public static final URL a(f fVar) {
        fVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        db.b bVar = fVar.f12215a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f8604a).appendPath("settings");
        db.a aVar = bVar.f8605b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f8597c).appendQueryParameter("display_version", aVar.f8596b).build().toString());
    }
}
