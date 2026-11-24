package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t2c implements RequestDelegate {
    public final byte a;
    public final TwoStepVerificationActivity b;

    public t2c(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.s0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                                    String M0 = k96.M0(2131745900, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.M0(2131745874, null);
                                    twoStepVerificationActivity2.showDialog(hdVar, new ph8(twoStepVerificationActivity2, (byte) 13));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.C0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = k96.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = k96.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = k96.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = k96.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity2.A0(k96.M0(2131745900, null), k96.a0("ResetPasswordWait", null, 2131745899, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.C0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                return;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                return;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 2:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.s0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                                    String M0 = k96.M0(2131745900, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.M0(2131745874, null);
                                    twoStepVerificationActivity2.showDialog(hdVar, new ph8(twoStepVerificationActivity2, (byte) 13));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.C0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = k96.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = k96.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = k96.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = k96.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity2.A0(k96.M0(2131745900, null), k96.a0("ResetPasswordWait", null, 2131745899, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.C0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                twoStepVerificationActivity.getClass();
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                return;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                return;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 4:
                twoStepVerificationActivity.getClass();
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                return;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                return;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 5:
                twoStepVerificationActivity.getClass();
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                return;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                return;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                twoStepVerificationActivity.getClass();
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (b2) {
                            case 0:
                                twoStepVerificationActivity2.l0(tLObject2, tL_error2);
                                return;
                            case 1:
                                twoStepVerificationActivity2.f0(tLObject2, tL_error2);
                                return;
                            case 2:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
