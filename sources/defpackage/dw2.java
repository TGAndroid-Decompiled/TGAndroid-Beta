package defpackage;

import org.telegram.messenger.voip.VoIPPendingCall;
public final class dw2 implements jm7 {
    public final byte a;
    public final Object b;

    public dw2(Object obj, byte b) {
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
                c40 c40Var = (c40) obj;
                if (i == 25) {
                    c40Var.o(false);
                    return;
                }
                return;
            case 1:
                vkb vkbVar = (vkb) obj;
                if (i == 264) {
                    vkbVar.getTextView().invalidate();
                    return;
                }
                return;
            case 2:
                ((ey0) obj).invalidate();
                return;
            case 3:
                wy8 wy8Var = (wy8) obj;
                if (objArr.length > 1 && objArr[1] == wy8Var.j2) {
                    wy8Var.y0();
                    return;
                }
                return;
            case 4:
                iib iibVar = (iib) obj;
                if (i == 258) {
                    gm.c3(new zcb(iibVar, (byte) 4));
                    return;
                }
                return;
            case 5:
                VoIPPendingCall.b((VoIPPendingCall) obj, i, i2, objArr);
                return;
            default:
                asc ascVar = (asc) obj;
                if (!ascVar.r && (vaVar = ascVar.a) != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
        }
    }
}
