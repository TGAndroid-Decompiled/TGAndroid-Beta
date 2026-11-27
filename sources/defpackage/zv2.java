package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;
public final class zv2 implements aw2 {
    public final ContentInfo a;

    public zv2(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override
    public final int a() {
        return this.a.getFlags();
    }

    @Override
    public final ClipData b() {
        return this.a.getClip();
    }

    @Override
    public final ContentInfo e() {
        return this.a;
    }

    @Override
    public final int f() {
        return this.a.getSource();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
