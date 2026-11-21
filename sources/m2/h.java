package m2;

import a8.la;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class h implements r0.d, r0.f {
    public final int f20544a;
    public Object f20545b;

    public h() {
        this.f20544a = 0;
        this.f20545b = c.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f20545b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f20545b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new h(((ContentInfo.Builder) this.f20545b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f20545b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f20545b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f20545b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        la.p(((LogSessionId) this.f20545b).equals(c.b()));
        this.f20545b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f20545b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20545b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f20544a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20545b) + "}";
            default:
                return super.toString();
        }
    }

    public h(ContentInfo contentInfo) {
        this.f20544a = 2;
        contentInfo.getClass();
        this.f20545b = contentInfo;
    }

    public h(ClipData clipData, int i7) {
        this.f20544a = 1;
        this.f20545b = r0.c.a(clipData, i7);
    }
}
