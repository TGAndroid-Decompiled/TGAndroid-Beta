package defpackage;

import org.telegram.messenger.a;
public final class wi0 implements Runnable {
    public final byte a;
    public final he[] b;

    public wi0(he[] heVarArr, byte b) {
        this.a = b;
        this.b = heVarArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        he[] heVarArr = this.b;
        switch (b) {
            case 0:
                he heVar = new he(3, null, a.b);
                heVarArr[0] = heVar;
                heVar.q(500L);
                return;
            case 1:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.dismiss();
                    return;
                }
                return;
            case 2:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                heVarArr[0] = null;
                return;
            case 3:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                heVarArr[0] = null;
                return;
            case 4:
                gm.c3(new wi0(heVarArr, (byte) 6));
                return;
            case 5:
                gm.c3(new wi0(heVarArr, (byte) 7));
                return;
            case 6:
                heVarArr[0].dismiss();
                return;
            case 7:
                heVarArr[0].dismiss();
                return;
            case 8:
                he heVar3 = heVarArr[0];
                if (heVar3 != null) {
                    heVar3.dismiss();
                    return;
                }
                return;
            case 9:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused3) {
                }
                heVarArr[0] = null;
                return;
            default:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused4) {
                }
                heVarArr[0] = null;
                return;
        }
    }
}
