package jb;

import android.net.Uri;
import java.net.URL;
public final class f {
    public final gb.b f16617a;
    public final id.h f16618b;

    public f(gb.b appInfo, id.h blockingDispatcher) {
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        this.f16617a = appInfo;
        this.f16618b = blockingDispatcher;
    }

    public static final URL a(f fVar) {
        fVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        gb.b bVar = fVar.f16617a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f13627a).appendPath("settings");
        gb.a aVar = bVar.f13628b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f13623c).appendQueryParameter("display_version", aVar.f13622b).build().toString());
    }
}
