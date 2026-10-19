package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.u6;
public final class j implements r0.d, r0.f {
    public final int f13966a;
    public Object f13967b;

    public j() {
        this.f13966a = 0;
        this.f13967b = e.c();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f13967b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f13967b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f13967b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f13967b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f13967b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f13967b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        u6.p(((LogSessionId) this.f13967b).equals(e.c()));
        this.f13967b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f13967b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f13967b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f13966a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13967b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f13966a = 2;
        contentInfo.getClass();
        this.f13967b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f13966a = 1;
        this.f13967b = r0.c.a(clipData, i10);
    }
}
