package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f12599a;
    public Object f12600b;

    public j() {
        this.f12599a = 0;
        this.f12600b = e.e();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12600b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12600b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12600b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12600b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12600b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12600b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f12600b).equals(e.e()));
        this.f12600b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12600b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12600b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12599a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12600b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12599a = 2;
        contentInfo.getClass();
        this.f12600b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12599a = 1;
        this.f12600b = r0.c.a(clipData, i10);
    }
}
