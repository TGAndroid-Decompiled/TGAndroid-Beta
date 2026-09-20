package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f12603a;
    public Object f12604b;

    public j() {
        this.f12603a = 0;
        this.f12604b = e.e();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f12604b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f12604b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f12604b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f12604b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f12604b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f12604b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f12604b).equals(e.e()));
        this.f12604b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f12604b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f12604b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f12603a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12604b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f12603a = 2;
        contentInfo.getClass();
        this.f12604b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f12603a = 1;
        this.f12604b = r0.c.a(clipData, i10);
    }
}
