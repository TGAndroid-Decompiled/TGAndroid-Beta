package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f13721a;
    public Object f13722b;

    public j() {
        this.f13721a = 0;
        this.f13722b = e.c();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f13722b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f13722b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f13722b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f13722b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f13722b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f13722b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f13722b).equals(e.c()));
        this.f13722b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f13722b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f13722b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f13721a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13722b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f13721a = 2;
        contentInfo.getClass();
        this.f13722b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f13721a = 1;
        this.f13722b = r0.c.a(clipData, i10);
    }
}
