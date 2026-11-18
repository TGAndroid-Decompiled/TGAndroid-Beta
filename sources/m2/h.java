package m2;

import a8.la;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class h implements r0.d, r0.f {
    public final int f20519a;
    public Object f20520b;

    public h() {
        this.f20519a = 0;
        this.f20520b = c.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f20520b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f20520b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new h(((ContentInfo.Builder) this.f20520b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f20520b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f20520b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f20520b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        la.p(((LogSessionId) this.f20520b).equals(c.b()));
        this.f20520b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f20520b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20520b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f20519a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20520b) + "}";
            default:
                return super.toString();
        }
    }

    public h(ContentInfo contentInfo) {
        this.f20519a = 2;
        contentInfo.getClass();
        this.f20520b = contentInfo;
    }

    public h(ClipData clipData, int i7) {
        this.f20519a = 1;
        this.f20520b = r0.c.a(clipData, i7);
    }
}
