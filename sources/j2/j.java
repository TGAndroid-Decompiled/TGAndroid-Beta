package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f12602a;
    public Object f12603b;

    public j() {
        this.f12602a = 0;
        this.f12603b = e.d();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12603b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12603b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12603b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12603b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12603b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12603b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f12603b).equals(e.d()));
        this.f12603b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12603b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12603b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12602a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12603b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12602a = 2;
        contentInfo.getClass();
        this.f12603b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12602a = 1;
        this.f12603b = r0.c.a(clipData, i10);
    }
}
