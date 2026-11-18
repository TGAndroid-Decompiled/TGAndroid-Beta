package m2;

import a8.la;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class h implements r0.d, r0.f {
    public final int f20516a;
    public Object f20517b;

    public h() {
        this.f20516a = 0;
        this.f20517b = c.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f20517b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f20517b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new h(((ContentInfo.Builder) this.f20517b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f20517b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f20517b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f20517b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        la.p(((LogSessionId) this.f20517b).equals(c.b()));
        this.f20517b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f20517b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20517b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f20516a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20517b) + "}";
            default:
                return super.toString();
        }
    }

    public h(ContentInfo contentInfo) {
        this.f20516a = 2;
        contentInfo.getClass();
        this.f20517b = contentInfo;
    }

    public h(ClipData clipData, int i7) {
        this.f20516a = 1;
        this.f20517b = r0.c.a(clipData, i7);
    }
}
