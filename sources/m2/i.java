package m2;

import a8.ia;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class i implements r0.d, r0.f {
    public final int f19556a;
    public Object f19557b;

    public i() {
        this.f19556a = 0;
        this.f19557b = d.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f19557b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f19557b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new i(((ContentInfo.Builder) this.f19557b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f19557b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f19557b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f19557b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        ia.p(((LogSessionId) this.f19557b).equals(d.b()));
        this.f19557b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f19557b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f19557b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f19556a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f19557b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f19556a = 2;
        contentInfo.getClass();
        this.f19557b = contentInfo;
    }

    public i(ClipData clipData, int i7) {
        this.f19556a = 1;
        this.f19557b = r0.c.a(clipData, i7);
    }
}
