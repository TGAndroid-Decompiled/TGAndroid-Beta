package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f11490a;
    public Object f11491b;

    public j() {
        this.f11490a = 0;
        this.f11491b = h.e();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f11491b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f11491b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f11491b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f11491b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f11491b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f11491b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f11491b).equals(h.e()));
        this.f11491b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f11491b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f11491b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f11490a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f11491b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f11490a = 2;
        contentInfo.getClass();
        this.f11491b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f11490a = 1;
        this.f11491b = r0.c.a(clipData, i10);
    }
}
