package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.t6;
public final class k implements r0.d, r0.f {
    public final int f9378a;
    public Object f9379b;

    public k() {
        this.f9378a = 0;
        this.f9379b = e.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f9379b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f9379b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new k(((ContentInfo.Builder) this.f9379b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f9379b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f9379b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f9379b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        t6.p(((LogSessionId) this.f9379b).equals(e.b()));
        this.f9379b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f9379b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f9379b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f9378a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f9379b) + "}";
            default:
                return super.toString();
        }
    }

    public k(ContentInfo contentInfo) {
        this.f9378a = 2;
        contentInfo.getClass();
        this.f9379b = contentInfo;
    }

    public k(ClipData clipData, int i10) {
        this.f9378a = 1;
        this.f9379b = r0.c.a(clipData, i10);
    }
}
