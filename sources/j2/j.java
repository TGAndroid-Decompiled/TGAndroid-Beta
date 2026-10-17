package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.u6;
public final class j implements r0.d, r0.f {
    public final int f13961a;
    public Object f13962b;

    public j() {
        this.f13961a = 0;
        this.f13962b = e.c();
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f13962b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f13962b).setLinkUri(uri);
    }

    @Override
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.f13962b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f13962b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f13962b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f13962b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        u6.p(((LogSessionId) this.f13962b).equals(e.c()));
        this.f13962b = logSessionId;
    }

    @Override
    public int k() {
        return ((ContentInfo) this.f13962b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f13962b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f13961a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13962b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        this.f13961a = 2;
        contentInfo.getClass();
        this.f13962b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.f13961a = 1;
        this.f13962b = r0.c.a(clipData, i10);
    }
}
