package ch;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import bi.a4;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.r5;
public final class i implements c20 {
    public final int f6267a;
    public final o f6268b;

    public i(o oVar, int i7) {
        this.f6267a = i7;
        this.f6268b = oVar;
    }

    @Override
    public final void a(Object obj) {
        r5[] r5VarArr;
        r8 r8Var;
        long j3;
        switch (this.f6267a) {
            case 0:
                o oVar = this.f6268b;
                oVar.W = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.e0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.f6268b;
                h hVar = oVar2.f6341a0;
                if (!oVar2.g0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (r5 r5Var : (r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r5.class)) {
                        if (spannableStringBuilder.getSpanEnd(r5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(r5Var.documentId));
                            oVar2.I.remove(Long.valueOf(r5Var.documentId));
                            oVar2.f6342b.A(Long.valueOf(r5Var.documentId));
                            if (r5Var.documentId == -1 && (r8Var = oVar2.f6347r) != null) {
                                r8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.N);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.i3(hVar, 350L);
                                return;
                            }
                            r5Var.setRemoved(new ai.e0(oVar2, r5Var, editTextSelectionEnd, 5));
                            oVar2.c0(r5Var);
                            oVar2.e0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.f6268b;
                if (!oVar3.isFinishing()) {
                    oVar3.f6348s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        return;
                    }
                    a4 a4Var = new a4(16, oVar3, tL_error);
                    if (oVar3.W == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    org.telegram.messenger.g0.i3(a4Var, j3);
                    return;
                }
                return;
            default:
                o oVar4 = this.f6268b;
                oVar4.getClass();
                oVar4.U = ((Integer) obj).intValue();
                return;
        }
    }
}
