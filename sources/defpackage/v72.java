package defpackage;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class v72 implements p8c {
    public final byte a;
    public final c82 b;

    public v72(c82 c82Var, byte b) {
        this.a = b;
        this.b = c82Var;
    }

    @Override
    public final void a(Object obj) {
        gm[] gmVarArr;
        ahb ahbVar;
        long j;
        byte b = this.a;
        c82 c82Var = this.b;
        switch (b) {
            case 0:
                c82Var.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!c82Var.I.keySet().equals(c82Var.K.keySet())) {
                    c82Var.d0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                u72 u72Var = c82Var.b0;
                if (!c82Var.f0()) {
                    int editTextSelectionEnd = c82Var.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c82Var.h.getText());
                    for (gm gmVar : (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class)) {
                        if (spannableStringBuilder.getSpanEnd(gmVar) == editTextSelectionEnd) {
                            c82Var.I.remove(Long.valueOf(gmVar.documentId));
                            c82Var.J.remove(Long.valueOf(gmVar.documentId));
                            c82Var.b.A(Long.valueOf(gmVar.documentId));
                            if (gmVar.documentId == -1 && (ahbVar = c82Var.r) != null) {
                                ahbVar.setChecked(false);
                                c82Var.h.setMaxLength(c82Var.O);
                            }
                            if (bool.booleanValue()) {
                                c82Var.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                gl.r(u72Var);
                                gl.e3(u72Var, 350L);
                                return;
                            }
                            gmVar.setRemoved(new va7(c82Var, gmVar, editTextSelectionEnd, (byte) 17));
                            c82Var.b0(gmVar);
                            c82Var.d0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (!c82Var.isFinishing()) {
                    c82Var.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        c82Var.finishFragment();
                        return;
                    }
                    kx1 kx1Var = new kx1(c82Var, tL_error, (byte) 24);
                    if (c82Var.X == null) {
                        j = 200;
                    } else {
                        j = 0;
                    }
                    gl.e3(kx1Var, j);
                    return;
                }
                return;
            default:
                c82Var.V = ((Integer) obj).intValue();
                return;
        }
    }
}
