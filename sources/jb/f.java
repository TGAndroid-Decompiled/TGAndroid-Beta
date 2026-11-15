package jb;

import android.net.Uri;
import java.net.URL;
public final class f {
    public final gb.b f16973a;
    public final id.h f16974b;

    public f(gb.b appInfo, id.h blockingDispatcher) {
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        this.f16973a = appInfo;
        this.f16974b = blockingDispatcher;
    }

    public static final URL a(f fVar) {
        fVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        gb.b bVar = fVar.f16973a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f12975a).appendPath("settings");
        gb.a aVar = bVar.f12976b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f12970c).appendQueryParameter("display_version", aVar.f12969b).build().toString());
    }
}
