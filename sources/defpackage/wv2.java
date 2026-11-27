package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class wv2 implements xv2 {
    public final ContentInfo.Builder a;

    public wv2(ClipData clipData, int i) {
        this.a = vv2.a(clipData, i);
    }

    @Override
    public final bw2 build() {
        return new bw2(new zv2(this.a.build()));
    }

    @Override
    public final void c(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }
}
