package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class eq5 implements fq5 {
    public final InputContentInfo a;

    public eq5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override
    public final Uri e() {
        return this.a.getContentUri();
    }

    @Override
    public final void g() {
        this.a.requestPermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override
    public final Uri h() {
        return this.a.getLinkUri();
    }

    @Override
    public final Object k() {
        return this.a;
    }

    @Override
    public final void n() {
        this.a.releasePermission();
    }

    public eq5(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
