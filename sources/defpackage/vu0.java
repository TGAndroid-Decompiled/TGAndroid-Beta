package defpackage;

import android.webkit.JsResult;
public final class vu0 implements ed {
    public final byte a;
    public final boolean[] b;
    public final JsResult c;

    public vu0(boolean[] zArr, JsResult jsResult, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override
    public final void u(hd hdVar, int i) {
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
            case 1:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.confirm();
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.confirm();
                    return;
                }
                return;
        }
    }
}
