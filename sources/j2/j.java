package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f13233a;
    public Object f13234b;

    public j() {
        this.f13233a = 0;
        this.f13234b = e.f();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f13234b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f13234b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f13234b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f13234b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f13234b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f13234b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f13234b).equals(e.f()));
        this.f13234b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f13234b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f13234b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f13233a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13234b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f13233a = 2;
        contentInfo.getClass();
        this.f13234b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f13233a = 1;
        this.f13234b = r0.c.a(clipData, i10);
    }
}
