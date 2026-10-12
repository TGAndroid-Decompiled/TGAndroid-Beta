package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.u6;
public final class j implements r0.d, r0.f {
    public final int f12552a;
    public Object f12553b;

    public j() {
        this.f12552a = 0;
        this.f12553b = e.c();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12553b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12553b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12553b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12553b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12553b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12553b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        u6.p(((LogSessionId) this.f12553b).equals(e.c()));
        this.f12553b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12553b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12553b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12552a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12553b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12552a = 2;
        contentInfo.getClass();
        this.f12553b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12552a = 1;
        this.f12553b = r0.c.a(clipData, i10);
    }
}
