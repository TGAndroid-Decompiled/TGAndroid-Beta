package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class eo5 implements fo5 {
    public final InputContentInfo a;

    public eo5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override
    public final Uri f() {
        return this.a.getContentUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override
    public final void h() {
        this.a.requestPermission();
    }

    @Override
    public final Uri i() {
        return this.a.getLinkUri();
    }

    @Override
    public final Object l() {
        return this.a;
    }

    @Override
    public final void n() {
        this.a.releasePermission();
    }

    public eo5(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
