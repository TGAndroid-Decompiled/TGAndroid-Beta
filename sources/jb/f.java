package jb;

import android.net.Uri;
import java.net.URL;
public final class f {
    public final gb.b f17349a;
    public final id.h f17350b;

    public f(gb.b appInfo, id.h blockingDispatcher) {
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        this.f17349a = appInfo;
        this.f17350b = blockingDispatcher;
    }

    public static final URL a(f fVar) {
        fVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        gb.b bVar = fVar.f17349a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f13284a).appendPath("settings");
        gb.a aVar = bVar.f13285b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f13279c).appendQueryParameter("display_version", aVar.f13278b).build().toString());
    }
}
