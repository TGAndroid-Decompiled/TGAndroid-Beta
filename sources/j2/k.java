package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.t6;
public final class k implements r0.d, r0.f {
    public final int f9379a;
    public Object f9380b;

    public k() {
        this.f9379a = 0;
        this.f9380b = e.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f9380b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f9380b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new k(((ContentInfo.Builder) this.f9380b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f9380b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f9380b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f9380b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        t6.p(((LogSessionId) this.f9380b).equals(e.b()));
        this.f9380b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f9380b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f9380b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f9379a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f9380b) + "}";
            default:
                return super.toString();
        }
    }

    public k(ContentInfo contentInfo) {
        this.f9379a = 2;
        contentInfo.getClass();
        this.f9380b = contentInfo;
    }

    public k(ClipData clipData, int i10) {
        this.f9379a = 1;
        this.f9380b = r0.c.a(clipData, i10);
    }
}
