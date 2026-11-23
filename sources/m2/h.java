package m2;

import a8.ma;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class h implements r0.d, r0.f {
    public final int f20609a;
    public Object f20610b;

    public h() {
        this.f20609a = 0;
        this.f20610b = c.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f20610b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f20610b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new h(((ContentInfo.Builder) this.f20610b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f20610b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f20610b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f20610b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        ma.p(((LogSessionId) this.f20610b).equals(c.b()));
        this.f20610b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f20610b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20610b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f20609a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20610b) + "}";
            default:
                return super.toString();
        }
    }

    public h(ContentInfo contentInfo) {
        this.f20609a = 2;
        contentInfo.getClass();
        this.f20610b = contentInfo;
    }

    public h(ClipData clipData, int i7) {
        this.f20609a = 1;
        this.f20610b = r0.c.a(clipData, i7);
    }
}
