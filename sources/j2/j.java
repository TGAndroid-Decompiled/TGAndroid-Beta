package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.u6;
public final class j implements r0.d, r0.f {
    public final int f12556a;
    public Object f12557b;

    public j() {
        this.f12556a = 0;
        this.f12557b = e.c();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12557b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12557b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12557b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12557b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12557b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12557b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        u6.p(((LogSessionId) this.f12557b).equals(e.c()));
        this.f12557b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12557b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12557b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12556a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12557b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12556a = 2;
        contentInfo.getClass();
        this.f12557b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12556a = 1;
        this.f12557b = r0.c.a(clipData, i10);
    }
}
