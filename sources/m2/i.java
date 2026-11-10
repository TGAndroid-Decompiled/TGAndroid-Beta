package m2;

import a8.ia;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class i implements r0.d, r0.f {
    public final int f19564a;
    public Object f19565b;

    public i() {
        this.f19564a = 0;
        this.f19565b = d.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f19565b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f19565b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new i(((ContentInfo.Builder) this.f19565b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f19565b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f19565b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f19565b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        ia.p(((LogSessionId) this.f19565b).equals(d.b()));
        this.f19565b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f19565b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f19565b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f19564a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f19565b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f19564a = 2;
        contentInfo.getClass();
        this.f19565b = contentInfo;
    }

    public i(ClipData clipData, int i7) {
        this.f19564a = 1;
        this.f19565b = r0.c.a(clipData, i7);
    }
}
