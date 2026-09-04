package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class j implements r0.d, r0.f {
    public final int f13207a;
    public Object f13208b;

    public j() {
        this.f13207a = 0;
        this.f13208b = e.f();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f13208b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f13208b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f13208b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f13208b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f13208b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f13208b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        e2.d.g(((LogSessionId) this.f13208b).equals(e.f()));
        this.f13208b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f13208b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f13208b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f13207a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13208b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f13207a = 2;
        contentInfo.getClass();
        this.f13208b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f13207a = 1;
        this.f13208b = r0.c.a(clipData, i10);
    }
}
