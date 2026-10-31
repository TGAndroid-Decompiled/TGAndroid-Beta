package ag;

import org.telegram.messenger.m5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
public final class z1 implements RequestDelegate {
    public final int f817a;
    public final f2 f818b;

    public z1(f2 f2Var, int i10) {
        this.f817a = i10;
        this.f818b = f2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f817a) {
            case 0:
                final f2 f2Var = this.f818b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        f2 f2Var2 = f2Var;
                        switch (i10) {
                            case 0:
                                f2Var2.f516b.b(false);
                                if (tL_error2 != null) {
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    m5.o(null, 2131743904, cc.a0(f2Var2), null);
                                    return;
                                } else {
                                    f2Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    f2Var2.f516b.b(false);
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    f2Var2.f516b.b(false);
                                    m5.o(null, 2131743904, cc.a0(f2Var2), null);
                                    return;
                                } else {
                                    f2Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final f2 f2Var2 = this.f818b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        f2 f2Var22 = f2Var2;
                        switch (i10) {
                            case 0:
                                f2Var22.f516b.b(false);
                                if (tL_error2 != null) {
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    m5.o(null, 2131743904, cc.a0(f2Var22), null);
                                    return;
                                } else {
                                    f2Var22.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    f2Var22.f516b.b(false);
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    f2Var22.f516b.b(false);
                                    m5.o(null, 2131743904, cc.a0(f2Var22), null);
                                    return;
                                } else {
                                    f2Var22.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
