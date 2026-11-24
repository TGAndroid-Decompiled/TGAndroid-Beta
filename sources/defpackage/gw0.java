package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
public final class gw0 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final boolean[] b;
    public final JsResult c;

    public gw0(boolean[] zArr, JsResult jsResult, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        JsResult jsResult = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.cancel();
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.cancel();
                    return;
                }
                return;
        }
    }
}
