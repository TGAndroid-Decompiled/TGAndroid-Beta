package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.a;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ym1 implements RequestDelegate {
    public final byte a;
    public final zu1 b;

    public ym1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                zu1Var.o9(tLObject);
                                return;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zu1Var.u8(tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                zu1Var.o9(tLObject);
                                return;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zu1Var.u8(tLObject);
                                return;
                        }
                    }
                });
                return;
            case 2:
                if (tL_error != null) {
                    zu1Var.getClass();
                    return;
                } else {
                    zu1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 3:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                zu1Var.o9(tLObject);
                                return;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zu1Var.u8(tLObject);
                                return;
                        }
                    }
                });
                return;
            case 4:
                zu1Var.E8(tLObject);
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z = false;
                        switch (r3) {
                            case 0:
                                zu1Var.o9(tLObject);
                                return;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131689472, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zu1Var.u8(tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
