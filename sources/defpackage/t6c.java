package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t6c implements RequestDelegate {
    public final byte a;
    public final TwoStepVerificationActivity b;

    public t6c(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
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
                                    alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                                    String M0 = ob6.M0(2131745820, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.M0(2131745794, null);
                                    twoStepVerificationActivity2.showDialog(idVar, new dl8(twoStepVerificationActivity2, (byte) 13));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = ob6.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = ob6.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = ob6.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = ob6.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity2.B0(ob6.M0(2131745820, null), ob6.a0("ResetPasswordWait", null, 2131745819, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new Runnable() {
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
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
                                return;
                            default:
                                twoStepVerificationActivity2.g0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 2:
                hl.c3(new Runnable() {
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
                                    alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                                    String M0 = ob6.M0(2131745820, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.M0(2131745794, null);
                                    twoStepVerificationActivity2.showDialog(idVar, new dl8(twoStepVerificationActivity2, (byte) 13));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = ob6.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = ob6.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = ob6.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = ob6.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity2.B0(ob6.M0(2131745820, null), ob6.a0("ResetPasswordWait", null, 2131745819, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                twoStepVerificationActivity.getClass();
                hl.c3(new Runnable() {
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
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
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
                hl.c3(new Runnable() {
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
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
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
                hl.c3(new Runnable() {
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
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
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
                hl.c3(new Runnable() {
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
                                twoStepVerificationActivity2.o0(tLObject2, tL_error2);
                                return;
                            case 3:
                                twoStepVerificationActivity2.h0(tLObject2, tL_error2);
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
