package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xtc implements Runnable {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public xtc(int i, String str, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.c = voIPService;
        this.d = tLObject;
        this.b = i;
        this.e = str;
        this.f = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                pc0 pc0Var = (pc0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ((int[]) obj4)[0] = i;
                pc0Var.q(user);
                ((bf0) obj).f(user, pc0Var);
                return;
            default:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$36((TLObject) obj3, i, (String) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public xtc(int[] iArr, int i, pc0 pc0Var, TLRPC.User user, bf0 bf0Var) {
        this.c = iArr;
        this.b = i;
        this.d = pc0Var;
        this.e = user;
        this.f = bf0Var;
    }
}
