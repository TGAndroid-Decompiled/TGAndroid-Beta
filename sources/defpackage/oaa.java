package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;
public final class oaa implements RequestDelegate {
    public final byte a;
    public final SessionsActivity b;

    public oaa(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                hl.c3(new ux9(sessionsActivity, (byte) 17));
                return;
            case 1:
                hl.c3(new Runnable() {
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
                                        bs2.v(null, 2131754278, d31.b0(sessionsActivity2), 2131623990, 36);
                                    } else {
                                        bs2.v(null, 2131743534, d31.b0(sessionsActivity2), 2131624012, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    bs2.v(null, 2131754283, d31.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    bs2.v(null, 2131754283, d31.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i = 0; i < 4; i++) {
                    yac h = yac.h(i);
                    if (h.o()) {
                        h.d = false;
                        h.u(false);
                        uc7.s1(i).k4(xea.e, xea.f);
                        ConnectionsManager.getInstance(i).setUserId(h.e());
                    }
                }
                return;
            case 2:
                hl.c3(new Runnable() {
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
                                        bs2.v(null, 2131754278, d31.b0(sessionsActivity2), 2131623990, 36);
                                    } else {
                                        bs2.v(null, 2131743534, d31.b0(sessionsActivity2), 2131624012, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    bs2.v(null, 2131754283, d31.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    bs2.v(null, 2131754283, d31.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i2 = 0; i2 < 4; i2++) {
                    yac h2 = yac.h(i2);
                    if (h2.o()) {
                        h2.d = false;
                        h2.u(false);
                        uc7.s1(i2).k4(xea.e, xea.f);
                        ConnectionsManager.getInstance(i2).setUserId(h2.e());
                    }
                }
                return;
            default:
                hl.c3(new Runnable() {
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
                                        bs2.v(null, 2131754278, d31.b0(sessionsActivity2), 2131623990, 36);
                                    } else {
                                        bs2.v(null, 2131743534, d31.b0(sessionsActivity2), 2131624012, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    bs2.v(null, 2131754283, d31.b0(sessionsActivity2), 2131623990, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    bs2.v(null, 2131754283, d31.b0(sessionsActivity2), 2131623990, 36);
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
