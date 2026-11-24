package defpackage;

import org.telegram.messenger.a;
public final class wh0 implements Runnable {
    public final byte a;
    public final hd[] b;

    public wh0(hd[] hdVarArr, byte b) {
        this.a = b;
        this.b = hdVarArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd[] hdVarArr = this.b;
        switch (b) {
            case 0:
                hd hdVar = new hd(3, null, a.b);
                hdVarArr[0] = hdVar;
                hdVar.q(500L);
                return;
            case 1:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.dismiss();
                    return;
                }
                return;
            case 2:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                hdVarArr[0] = null;
                return;
            case 3:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                hdVarArr[0] = null;
                return;
            case 4:
                gl.c3(new wh0(hdVarArr, (byte) 6));
                return;
            case 5:
                gl.c3(new wh0(hdVarArr, (byte) 7));
                return;
            case 6:
                hdVarArr[0].dismiss();
                return;
            case 7:
                hdVarArr[0].dismiss();
                return;
            case 8:
                hd hdVar3 = hdVarArr[0];
                if (hdVar3 != null) {
                    hdVar3.dismiss();
                    return;
                }
                return;
            case 9:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused3) {
                }
                hdVarArr[0] = null;
                return;
            default:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused4) {
                }
                hdVarArr[0] = null;
                return;
        }
    }
}
