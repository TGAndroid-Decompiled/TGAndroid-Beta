package m2;

import a8.ia;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class i implements r0.d, r0.f {
    public final int f19559a;
    public Object f19560b;

    public i() {
        this.f19559a = 0;
        this.f19560b = d.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f19560b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f19560b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new i(((ContentInfo.Builder) this.f19560b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f19560b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f19560b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f19560b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        ia.p(((LogSessionId) this.f19560b).equals(d.b()));
        this.f19560b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f19560b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f19560b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f19559a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f19560b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f19559a = 2;
        contentInfo.getClass();
        this.f19560b = contentInfo;
    }

    public i(ClipData clipData, int i7) {
        this.f19559a = 1;
        this.f19560b = r0.c.a(clipData, i7);
    }
}
