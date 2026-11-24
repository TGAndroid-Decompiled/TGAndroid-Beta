package defpackage;

import org.telegram.messenger.voip.VoIPPendingCall;
public final class su2 implements gk7 {
    public final byte a;
    public final Object b;

    public su2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        va vaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c30 c30Var = (c30) obj;
                if (i == 25) {
                    c30Var.o(false);
                    return;
                }
                return;
            case 1:
                uib uibVar = (uib) obj;
                if (i == 262) {
                    uibVar.getTextView().invalidate();
                    return;
                }
                return;
            case 2:
                ((xw0) obj).invalidate();
                return;
            case 3:
                vw8 vw8Var = (vw8) obj;
                if (objArr.length > 1 && objArr[1] == vw8Var.j2) {
                    vw8Var.y0();
                    return;
                }
                return;
            case 4:
                hgb hgbVar = (hgb) obj;
                if (i == 256) {
                    gl.d3(new kya(hgbVar, (byte) 26));
                    return;
                }
                return;
            case 5:
                VoIPPendingCall.b((VoIPPendingCall) obj, i, i2, objArr);
                return;
            default:
                ypc ypcVar = (ypc) obj;
                if (!ypcVar.r && (vaVar = ypcVar.a) != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
        }
    }
}
