package m2;

import a8.ma;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class h implements r0.d, r0.f {
    public final int f20513a;
    public Object f20514b;

    public h() {
        this.f20513a = 0;
        this.f20514b = c.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f20514b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f20514b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new h(((ContentInfo.Builder) this.f20514b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f20514b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f20514b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f20514b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        ma.p(((LogSessionId) this.f20514b).equals(c.b()));
        this.f20514b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f20514b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20514b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f20513a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20514b) + "}";
            default:
                return super.toString();
        }
    }

    public h(ContentInfo contentInfo) {
        this.f20513a = 2;
        contentInfo.getClass();
        this.f20514b = contentInfo;
    }

    public h(ClipData clipData, int i7) {
        this.f20513a = 1;
        this.f20514b = r0.c.a(clipData, i7);
    }
}
