package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.u6;
public final class i implements r0.d, r0.f {
    public final int f14011a;
    public Object f14012b;

    public i() {
        this.f14011a = 0;
        this.f14012b = d.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f14012b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f14012b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new i(((ContentInfo.Builder) this.f14012b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f14012b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f14012b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f14012b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        u6.p(((LogSessionId) this.f14012b).equals(d.b()));
        this.f14012b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f14012b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f14012b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f14011a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f14012b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f14011a = 2;
        contentInfo.getClass();
        this.f14012b = contentInfo;
    }

    public i(ClipData clipData, int i10) {
        this.f14011a = 1;
        this.f14012b = r0.c.a(clipData, i10);
    }
}
