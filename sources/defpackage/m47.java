package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m47 implements RequestDelegate {
    public final byte a;
    public final s47 b;

    public m47(s47 s47Var, byte b) {
        this.a = b;
        this.b = s47Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final s47 s47Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        s47 s47Var2 = s47Var;
                        switch (b2) {
                            case 0:
                                s47Var2.f0(tLObject2, tL_error2);
                                return;
                            case 1:
                                s47Var2.d0(tLObject2, tL_error2);
                                return;
                            default:
                                s47Var2.e0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        s47 s47Var2 = s47Var;
                        switch (b2) {
                            case 0:
                                s47Var2.f0(tLObject2, tL_error2);
                                return;
                            case 1:
                                s47Var2.d0(tLObject2, tL_error2);
                                return;
                            default:
                                s47Var2.e0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        s47 s47Var2 = s47Var;
                        switch (b2) {
                            case 0:
                                s47Var2.f0(tLObject2, tL_error2);
                                return;
                            case 1:
                                s47Var2.d0(tLObject2, tL_error2);
                                return;
                            default:
                                s47Var2.e0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
