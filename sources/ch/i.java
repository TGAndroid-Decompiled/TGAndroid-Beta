package ch;

import ai.d1;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.y5;
public final class i implements y10 {
    public final int f5366a;
    public final p f5367b;

    public i(p pVar, int i7) {
        this.f5366a = i7;
        this.f5367b = pVar;
    }

    @Override
    public final void a(Object obj) {
        y5[] y5VarArr;
        s8 s8Var;
        long j3;
        switch (this.f5366a) {
            case 0:
                p pVar = this.f5367b;
                pVar.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!pVar.I.keySet().equals(pVar.K.keySet())) {
                    pVar.e0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                p pVar2 = this.f5367b;
                h hVar = pVar2.f5456b0;
                if (!pVar2.g0()) {
                    int editTextSelectionEnd = pVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pVar2.h.getText());
                    for (y5 y5Var : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                        if (spannableStringBuilder.getSpanEnd(y5Var) == editTextSelectionEnd) {
                            pVar2.I.remove(Long.valueOf(y5Var.documentId));
                            pVar2.J.remove(Long.valueOf(y5Var.documentId));
                            pVar2.f5455b.A(Long.valueOf(y5Var.documentId));
                            if (y5Var.documentId == -1 && (s8Var = pVar2.f5461r) != null) {
                                s8Var.setChecked(false);
                                pVar2.h.setMaxLength(pVar2.O);
                            }
                            if (bool.booleanValue()) {
                                pVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.h3(hVar, 350L);
                                return;
                            }
                            y5Var.setRemoved(new d1(pVar2, y5Var, editTextSelectionEnd, 3));
                            pVar2.c0(y5Var);
                            pVar2.e0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                p pVar3 = this.f5367b;
                if (!pVar3.isFinishing()) {
                    pVar3.f5462s.setLoading(false);
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
                p pVar4 = this.f5367b;
                pVar4.getClass();
                pVar4.V = ((Integer) obj).intValue();
                return;
        }
    }
}
