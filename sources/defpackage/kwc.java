package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kwc implements Runnable {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kwc(int i, String str, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
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
                rb0 rb0Var = (rb0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ((int[]) obj4)[0] = i;
                rb0Var.q(user);
                ((de0) obj).f(user, rb0Var);
                return;
            default:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$36((TLObject) obj3, i, (String) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public kwc(int[] iArr, int i, rb0 rb0Var, TLRPC.User user, de0 de0Var) {
        this.c = iArr;
        this.b = i;
        this.d = rb0Var;
        this.e = user;
        this.f = de0Var;
    }
}
