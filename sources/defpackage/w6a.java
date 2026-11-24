package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;
public final class w6a implements RequestDelegate {
    public final byte a;
    public final SessionsActivity b;

    public w6a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                gl.c3(new z6a(sessionsActivity, (byte) 0));
                return;
            case 1:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (b2) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        ir2.v(null, 2131754282, u21.b0(sessionsActivity2), 2131623990, 36);
                                    } else {
                                        ir2.v(null, 2131743640, u21.b0(sessionsActivity2), 2131624012, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ir2.v(null, 2131754287, u21.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ir2.v(null, 2131754287, u21.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i = 0; i < 4; i++) {
                    y6c h = y6c.h(i);
                    if (h.o()) {
                        h.d = false;
                        h.u(false);
                        na7.q1(i).c4(gba.e, gba.f);
                        ConnectionsManager.getInstance(i).setUserId(h.e());
                    }
                }
                return;
            case 2:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (b2) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        ir2.v(null, 2131754282, u21.b0(sessionsActivity2), 2131623990, 36);
                                    } else {
                                        ir2.v(null, 2131743640, u21.b0(sessionsActivity2), 2131624012, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ir2.v(null, 2131754287, u21.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ir2.v(null, 2131754287, u21.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i2 = 0; i2 < 4; i2++) {
                    y6c h2 = y6c.h(i2);
                    if (h2.o()) {
                        h2.d = false;
                        h2.u(false);
                        na7.q1(i2).c4(gba.e, gba.f);
                        ConnectionsManager.getInstance(i2).setUserId(h2.e());
                    }
                }
                return;
            default:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (b2) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        ir2.v(null, 2131754282, u21.b0(sessionsActivity2), 2131623990, 36);
                                    } else {
                                        ir2.v(null, 2131743640, u21.b0(sessionsActivity2), 2131624012, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ir2.v(null, 2131754287, u21.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ir2.v(null, 2131754287, u21.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
