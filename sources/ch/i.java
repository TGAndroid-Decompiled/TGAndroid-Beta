package ch;

import ai.e1;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.x5;
public final class i implements w10 {
    public final int f5366a;
    public final p f5367b;

    public i(p pVar, int i7) {
        this.f5366a = i7;
        this.f5367b = pVar;
    }

    @Override
    public final void a(Object obj) {
        x5[] x5VarArr;
        r8 r8Var;
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
                    for (x5 x5Var : (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class)) {
                        if (spannableStringBuilder.getSpanEnd(x5Var) == editTextSelectionEnd) {
                            pVar2.I.remove(Long.valueOf(x5Var.documentId));
                            pVar2.J.remove(Long.valueOf(x5Var.documentId));
                            pVar2.f5455b.A(Long.valueOf(x5Var.documentId));
                            if (x5Var.documentId == -1 && (r8Var = pVar2.f5461r) != null) {
                                r8Var.setChecked(false);
                                pVar2.h.setMaxLength(pVar2.O);
                            }
                            if (bool.booleanValue()) {
                                pVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.h3(hVar, 350L);
                                return;
                            }
                            x5Var.setRemoved(new e1(pVar2, x5Var, editTextSelectionEnd, 3));
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
                p pVar3 = this.f5367b;
                if (!pVar3.isFinishing()) {
                    pVar3.f5462s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        pVar3.finishFragment();
                        return;
                    }
                    c1.a aVar = new c1.a(4, pVar3, tL_error);
                    if (pVar3.X == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    org.telegram.messenger.g0.h3(aVar, j3);
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
