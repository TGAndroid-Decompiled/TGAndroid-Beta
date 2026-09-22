package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f12601a;
    public Object f12602b;

    public j() {
        this.f12601a = 0;
        this.f12602b = e.e();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12602b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12602b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12602b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12602b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12602b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12602b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f12602b).equals(e.e()));
        this.f12602b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12602b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12602b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12601a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12602b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12601a = 2;
        contentInfo.getClass();
        this.f12602b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12601a = 1;
        this.f12602b = r0.c.a(clipData, i10);
    }
}
