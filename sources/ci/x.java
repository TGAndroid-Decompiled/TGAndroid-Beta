package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.df0;
public final class x implements RequestDelegate {
    public final int f6306a;
    public final int f6307b;
    public final long f6308c;
    public final Object d;
    public final Object f6309e;

    public x(int i3, int i10, long j10, Object obj, Object obj2) {
        this.f6306a = i10;
        this.d = obj;
        this.f6309e = obj2;
        this.f6307b = i3;
        this.f6308c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6306a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.k0((i0) this.d, (h0) this.f6309e, this.f6307b, tLObject, this.f6308c, 1));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new f8(this.f6307b, 1, this.f6308c, (gi.d) this.d, (org.telegram.ui.ActionBar.t2[]) this.f6309e));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.k0((ei.z6) this.d, tLObject, this.f6307b, (String) this.f6309e, this.f6308c, 3));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new d8(tLObject, this.f6307b, (gi.d) this.d, (org.telegram.ui.ActionBar.t2) this.f6309e, this.f6308c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new d8((df0) this.d, tL_error, tLObject, this.f6308c, this.f6307b, (TLRPC.Chat) this.f6309e));
                return;
        }
    }

    public x(int i3, gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, long j10) {
        this.f6306a = 3;
        this.f6307b = i3;
        this.d = dVar;
        this.f6309e = t2Var;
        this.f6308c = j10;
    }

    public x(ei.z6 z6Var, int i3, String str, long j10) {
        this.f6306a = 2;
        this.d = z6Var;
        this.f6307b = i3;
        this.f6309e = str;
        this.f6308c = j10;
    }

    public x(df0 df0Var, long j10, int i3, TLRPC.Chat chat) {
        this.f6306a = 4;
        this.d = df0Var;
        this.f6308c = j10;
        this.f6307b = i3;
        this.f6309e = chat;
    }
}
