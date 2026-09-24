package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f12591a;
    public Object f12592b;

    public j() {
        this.f12591a = 0;
        this.f12592b = e.e();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12592b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12592b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12592b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12592b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12592b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12592b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f12592b).equals(e.e()));
        this.f12592b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12592b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12592b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12591a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12592b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12591a = 2;
        contentInfo.getClass();
        this.f12592b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12591a = 1;
        this.f12592b = r0.c.a(clipData, i10);
    }
}
