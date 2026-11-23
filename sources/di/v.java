package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mf0;
public final class v implements RequestDelegate {
    public final int f9891a;
    public final int f9892b;
    public final long f9893c;
    public final Object d;
    public final Object f9894e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9891a = i10;
        this.d = obj;
        this.f9894e = obj2;
        this.f9892b = i7;
        this.f9893c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9891a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.f9894e, this.f9892b, tLObject, this.f9893c, 3));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.w3(this.f9892b, 2, this.f9893c, (hi.d) this.d, (org.telegram.ui.ActionBar.w2[]) this.f9894e));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.f9892b, (String) this.f9894e, this.f9893c, 5));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.s4(tLObject, this.f9892b, (hi.d) this.d, (org.telegram.ui.ActionBar.w2) this.f9894e, this.f9893c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new bi.s4((mf0) this.d, tL_error, tLObject, this.f9893c, this.f9892b, (TLRPC.Chat) this.f9894e, 7));
                return;
        }
    }

    public v(int i7, hi.d dVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.f9891a = 3;
        this.f9892b = i7;
        this.d = dVar;
        this.f9894e = w2Var;
        this.f9893c = j3;
    }

    public v(fi.p6 p6Var, int i7, String str, long j3) {
        this.f9891a = 2;
        this.d = p6Var;
        this.f9892b = i7;
        this.f9894e = str;
        this.f9893c = j3;
    }

    public v(mf0 mf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9891a = 4;
        this.d = mf0Var;
        this.f9893c = j3;
        this.f9892b = i7;
        this.f9894e = chat;
    }
}
