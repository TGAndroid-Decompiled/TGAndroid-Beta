package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class cv2 implements dv2 {
    public final ContentInfo.Builder a;

    public cv2(ClipData clipData, int i) {
        this.a = bv2.a(clipData, i);
    }

    @Override
    public final hv2 build() {
        return new hv2(new fv2(this.a.build()));
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
