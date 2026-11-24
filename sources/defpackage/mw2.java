package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class mw2 implements nw2 {
    public final ContentInfo.Builder a;

    public mw2(ClipData clipData, int i) {
        this.a = lw2.a(clipData, i);
    }

    @Override
    public final rw2 build() {
        return new rw2(new pw2(this.a.build()));
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
