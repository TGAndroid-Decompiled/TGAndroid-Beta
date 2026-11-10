package jb;

import android.net.Uri;
import java.net.URL;
public final class f {
    public final gb.b f16620a;
    public final id.h f16621b;

    public f(gb.b appInfo, id.h blockingDispatcher) {
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        this.f16620a = appInfo;
        this.f16621b = blockingDispatcher;
    }

    public static final URL a(f fVar) {
        fVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        gb.b bVar = fVar.f16620a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f13629a).appendPath("settings");
        gb.a aVar = bVar.f13630b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f13625c).appendQueryParameter("display_version", aVar.f13624b).build().toString());
    }
}
