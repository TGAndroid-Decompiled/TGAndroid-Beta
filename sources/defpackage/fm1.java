package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.a;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fm1 implements RequestDelegate {
    public final byte a;
    public final yv1 b;

    public fm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                yv1Var.n9(tLObject);
                                return;
                            case 1:
                                yv1Var.t8(tLObject);
                                return;
                            case 2:
                                yv1 yv1Var2 = yv1Var;
                                TLObject tLObject2 = tLObject;
                                yv1Var2.G5 = 0;
                                if (tLObject2 == null && yv1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var2.Ba, yv1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131751208, null);
                                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                    yv1Var2.showDialog(alertDialog$Builder.a);
                                    ms1 ms1Var = yv1Var2.a0;
                                    if (ms1Var != null) {
                                        ms1Var.G1(null, null, false);
                                        yv1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                yv1 yv1Var3 = yv1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (c41.a(yv1Var3)) {
                                            c41 b0 = c41.b0(yv1Var3);
                                            if (!yv1Var3.j8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                yv1Var.n9(tLObject);
                                return;
                            case 1:
                                yv1Var.t8(tLObject);
                                return;
                            case 2:
                                yv1 yv1Var2 = yv1Var;
                                TLObject tLObject2 = tLObject;
                                yv1Var2.G5 = 0;
                                if (tLObject2 == null && yv1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var2.Ba, yv1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131751208, null);
                                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                    yv1Var2.showDialog(alertDialog$Builder.a);
                                    ms1 ms1Var = yv1Var2.a0;
                                    if (ms1Var != null) {
                                        ms1Var.G1(null, null, false);
                                        yv1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                yv1 yv1Var3 = yv1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (c41.a(yv1Var3)) {
                                            c41 b0 = c41.b0(yv1Var3);
                                            if (!yv1Var3.j8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                yv1Var.n9(tLObject);
                                return;
                            case 1:
                                yv1Var.t8(tLObject);
                                return;
                            case 2:
                                yv1 yv1Var2 = yv1Var;
                                TLObject tLObject2 = tLObject;
                                yv1Var2.G5 = 0;
                                if (tLObject2 == null && yv1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var2.Ba, yv1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131751208, null);
                                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                    yv1Var2.showDialog(alertDialog$Builder.a);
                                    ms1 ms1Var = yv1Var2.a0;
                                    if (ms1Var != null) {
                                        ms1Var.G1(null, null, false);
                                        yv1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                yv1 yv1Var3 = yv1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (c41.a(yv1Var3)) {
                                            c41 b0 = c41.b0(yv1Var3);
                                            if (!yv1Var3.j8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                yv1Var.n9(tLObject);
                                return;
                            case 1:
                                yv1Var.t8(tLObject);
                                return;
                            case 2:
                                yv1 yv1Var2 = yv1Var;
                                TLObject tLObject2 = tLObject;
                                yv1Var2.G5 = 0;
                                if (tLObject2 == null && yv1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var2.Ba, yv1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131751208, null);
                                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                    yv1Var2.showDialog(alertDialog$Builder.a);
                                    ms1 ms1Var = yv1Var2.a0;
                                    if (ms1Var != null) {
                                        ms1Var.G1(null, null, false);
                                        yv1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                yv1 yv1Var3 = yv1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (c41.a(yv1Var3)) {
                                            c41 b0 = c41.b0(yv1Var3);
                                            if (!yv1Var3.j8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
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
                    yv1Var.getClass();
                    return;
                } else {
                    yv1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                yv1Var.D8(tLObject);
                return;
        }
    }
}
