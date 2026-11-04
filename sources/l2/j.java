package l2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import b8.zb;
public final class j implements r0.d, r0.f {
    public final int f17725a;
    public Object f17726b;

    public j() {
        this.f17725a = 0;
        this.f17726b = d.e();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f17726b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f17726b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f17726b).build()));
    }

    @Override
    public void c(int i3) {
        ((ContentInfo.Builder) this.f17726b).setFlags(i3);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f17726b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f17726b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        zb.p(((LogSessionId) this.f17726b).equals(d.e()));
        this.f17726b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f17726b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f17726b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f17725a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f17726b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f17725a = 2;
        contentInfo.getClass();
        this.f17726b = contentInfo;
    }

    public j(ClipData clipData, int i3) {
        this.f17725a = 1;
        this.f17726b = r0.c.a(clipData, i3);
    }
}
