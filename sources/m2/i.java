package m2;

import a8.ja;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class i implements r0.d, r0.f {
    public final int f20155a;
    public Object f20156b;

    public i() {
        this.f20155a = 0;
        this.f20156b = c.b();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f20156b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f20156b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new i(((ContentInfo.Builder) this.f20156b).build()));
    }

    @Override
    public void c(int i7) {
        ((ContentInfo.Builder) this.f20156b).setFlags(i7);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f20156b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f20156b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        ja.p(((LogSessionId) this.f20156b).equals(c.b()));
        this.f20156b = logSessionId;
    }

    @Override
    public int l() {
        return ((ContentInfo) this.f20156b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20156b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f20155a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20156b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f20155a = 2;
        contentInfo.getClass();
        this.f20156b = contentInfo;
    }

    public i(ClipData clipData, int i7) {
        this.f20155a = 1;
        this.f20156b = r0.c.a(clipData, i7);
    }
}
