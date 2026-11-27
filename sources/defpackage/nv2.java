package defpackage;

import org.telegram.messenger.voip.VoIPPendingCall;
public final class nv2 implements fn7 {
    public final byte a;
    public final Object b;

    public nv2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        wa waVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d30 d30Var = (d30) obj;
                if (i == 25) {
                    d30Var.o(false);
                    return;
                }
                return;
            case 1:
                qmb qmbVar = (qmb) obj;
                if (i == 263) {
                    qmbVar.getTextView().invalidate();
                    return;
                }
                return;
            case 2:
                ((fx0) obj).invalidate();
                return;
            case 3:
                g09 g09Var = (g09) obj;
                if (objArr.length > 1 && objArr[1] == g09Var.j2) {
                    g09Var.y0();
                    return;
                }
                return;
            case 4:
                dkb dkbVar = (dkb) obj;
                if (i == 257) {
                    hl.c3(new s8b(dkbVar, (byte) 13));
                    return;
                }
                return;
            case 5:
                VoIPPendingCall.b((VoIPPendingCall) obj, i, i2, objArr);
                return;
            default:
                muc mucVar = (muc) obj;
                if (!mucVar.r && (waVar = mucVar.a) != null) {
                    waVar.g3.O(true);
                    return;
                }
                return;
        }
    }
}
