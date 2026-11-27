package defpackage;

import org.telegram.messenger.a;
public final class xh0 implements Runnable {
    public final byte a;
    public final id[] b;

    public xh0(id[] idVarArr, byte b) {
        this.a = b;
        this.b = idVarArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id[] idVarArr = this.b;
        switch (b) {
            case 0:
                id idVar = new id(3, null, a.b);
                idVarArr[0] = idVar;
                idVar.q(500L);
                return;
            case 1:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.dismiss();
                    return;
                }
                return;
            case 2:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                idVarArr[0] = null;
                return;
            case 3:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                idVarArr[0] = null;
                return;
            case 4:
                hl.c3(new xh0(idVarArr, (byte) 6));
                return;
            case 5:
                hl.c3(new xh0(idVarArr, (byte) 7));
                return;
            case 6:
                idVarArr[0].dismiss();
                return;
            case 7:
                idVarArr[0].dismiss();
                return;
            case 8:
                id idVar3 = idVarArr[0];
                if (idVar3 != null) {
                    idVar3.dismiss();
                    return;
                }
                return;
            case 9:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused3) {
                }
                idVarArr[0] = null;
                return;
            default:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused4) {
                }
                idVarArr[0] = null;
                return;
        }
    }
}
