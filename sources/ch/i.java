package ch;

import ai.a1;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.x5;
public final class i implements x10 {
    public final int f5371a;
    public final p f5372b;

    public i(p pVar, int i7) {
        this.f5371a = i7;
        this.f5372b = pVar;
    }

    @Override
    public final void a(Object obj) {
        x5[] x5VarArr;
        s8 s8Var;
        long j3;
        switch (this.f5371a) {
            case 0:
                p pVar = this.f5372b;
                pVar.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!pVar.I.keySet().equals(pVar.K.keySet())) {
                    pVar.e0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                p pVar2 = this.f5372b;
                h hVar = pVar2.f5461b0;
                if (!pVar2.g0()) {
                    int editTextSelectionEnd = pVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pVar2.h.getText());
                    for (x5 x5Var : (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class)) {
                        if (spannableStringBuilder.getSpanEnd(x5Var) == editTextSelectionEnd) {
                            pVar2.I.remove(Long.valueOf(x5Var.documentId));
                            pVar2.J.remove(Long.valueOf(x5Var.documentId));
                            pVar2.f5460b.A(Long.valueOf(x5Var.documentId));
                            if (x5Var.documentId == -1 && (s8Var = pVar2.f5466r) != null) {
                                s8Var.setChecked(false);
                                pVar2.h.setMaxLength(pVar2.O);
                            }
                            if (bool.booleanValue()) {
                                pVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.h3(hVar, 350L);
                                return;
                            }
                            x5Var.setRemoved(new a1(pVar2, x5Var, editTextSelectionEnd, 4));
                            pVar2.c0(x5Var);
                            pVar2.e0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                p pVar3 = this.f5372b;
                if (!pVar3.isFinishing()) {
                    pVar3.f5467s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        pVar3.finishFragment();
                        return;
                    }
                    c1.c cVar = new c1.c(2, pVar3, tL_error);
                    if (pVar3.X == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    org.telegram.messenger.g0.h3(cVar, j3);
                    return;
                }
                return;
            default:
                p pVar4 = this.f5372b;
                pVar4.getClass();
                pVar4.V = ((Integer) obj).intValue();
                return;
        }
    }
}
