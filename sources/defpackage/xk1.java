package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.a;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xk1 implements RequestDelegate {
    public final byte a;
    public final mu1 b;

    public xk1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                mu1Var.b9(tLObject);
                                return;
                            case 1:
                                mu1Var.h8(tLObject);
                                return;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131689472, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                mu1Var.b9(tLObject);
                                return;
                            case 1:
                                mu1Var.h8(tLObject);
                                return;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131689472, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                mu1Var.b9(tLObject);
                                return;
                            case 1:
                                mu1Var.h8(tLObject);
                                return;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131689472, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                mu1Var.b9(tLObject);
                                return;
                            case 1:
                                mu1Var.h8(tLObject);
                                return;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131689472, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                if (tL_error != null) {
                    mu1Var.getClass();
                    return;
                } else {
                    mu1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                mu1Var.r8(tLObject);
                return;
        }
    }
}
