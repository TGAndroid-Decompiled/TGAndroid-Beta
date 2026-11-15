package ch;

import ai.z0;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.p5;
public final class i implements z10 {
    public final int f5085a;
    public final o f5086b;

    public i(o oVar, int i7) {
        this.f5085a = i7;
        this.f5086b = oVar;
    }

    @Override
    public final void a(Object obj) {
        p5[] p5VarArr;
        q8 q8Var;
        long j3;
        switch (this.f5085a) {
            case 0:
                o oVar = this.f5086b;
                oVar.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.I.keySet().equals(oVar.K.keySet())) {
                    oVar.e0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.f5086b;
                h hVar = oVar2.f5171b0;
                if (!oVar2.g0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (p5 p5Var : (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class)) {
                        if (spannableStringBuilder.getSpanEnd(p5Var) == editTextSelectionEnd) {
                            oVar2.I.remove(Long.valueOf(p5Var.documentId));
                            oVar2.J.remove(Long.valueOf(p5Var.documentId));
                            oVar2.f5170b.A(Long.valueOf(p5Var.documentId));
                            if (p5Var.documentId == -1 && (q8Var = oVar2.f5176r) != null) {
                                q8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.O);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.i3(hVar, 350L);
                                return;
                            }
                            p5Var.setRemoved(new z0(oVar2, p5Var, editTextSelectionEnd, 3));
                            oVar2.c0(p5Var);
                            oVar2.e0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.f5086b;
                if (!oVar3.isFinishing()) {
                    oVar3.f5177s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        return;
                    }
                    c1.c cVar = new c1.c(3, oVar3, tL_error);
                    if (oVar3.X == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    org.telegram.messenger.g0.i3(cVar, j3);
                    return;
                }
                return;
            default:
                o oVar4 = this.f5086b;
                oVar4.getClass();
                oVar4.V = ((Integer) obj).intValue();
                return;
        }
    }
}
