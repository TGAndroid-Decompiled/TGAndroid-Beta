package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nf0;
public final class v implements RequestDelegate {
    public final int f9892a;
    public final int f9893b;
    public final long f9894c;
    public final Object d;
    public final Object f9895e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9892a = i10;
        this.d = obj;
        this.f9895e = obj2;
        this.f9893b = i7;
        this.f9894c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9892a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.f9895e, this.f9893b, tLObject, this.f9894c, 3));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.q3(this.f9893b, 2, this.f9894c, (hi.d) this.d, (org.telegram.ui.ActionBar.x2[]) this.f9895e));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.f9893b, (String) this.f9895e, this.f9894c, 5));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.l4(tLObject, this.f9893b, (hi.d) this.d, (org.telegram.ui.ActionBar.x2) this.f9895e, this.f9894c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new bi.l4((nf0) this.d, tL_error, tLObject, this.f9894c, this.f9893b, (TLRPC.Chat) this.f9895e, 7));
                return;
        }
    }

    public v(int i7, hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, long j3) {
        this.f9892a = 3;
        this.f9893b = i7;
        this.d = dVar;
        this.f9895e = x2Var;
        this.f9894c = j3;
    }

    public v(fi.p6 p6Var, int i7, String str, long j3) {
        this.f9892a = 2;
        this.d = p6Var;
        this.f9893b = i7;
        this.f9895e = str;
        this.f9894c = j3;
    }

    public v(nf0 nf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9892a = 4;
        this.d = nf0Var;
        this.f9894c = j3;
        this.f9893b = i7;
        this.f9895e = chat;
    }
}
