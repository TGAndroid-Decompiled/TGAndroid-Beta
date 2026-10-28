package j2;

import a8.yb;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class i implements r0.d, r0.f {
    public final int f15223a;
    public Object f15224b;

    public i() {
        this.f15223a = 0;
        this.f15224b = d.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f15224b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f15224b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new i(((ContentInfo.Builder) this.f15224b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f15224b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f15224b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f15224b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        yb.p(((LogSessionId) this.f15224b).equals(d.b()));
        this.f15224b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f15224b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f15224b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f15223a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f15224b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f15223a = 2;
        contentInfo.getClass();
        this.f15224b = contentInfo;
    }

    public i(ClipData clipData, int i10) {
        this.f15223a = 1;
        this.f15224b = r0.c.a(clipData, i10);
    }
}
