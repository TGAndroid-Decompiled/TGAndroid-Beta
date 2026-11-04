package dh;

import ai.e3;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.p5;
public final class i implements u10 {
    public final int f9020a;
    public final o f9021b;

    public i(o oVar, int i3) {
        this.f9020a = i3;
        this.f9021b = oVar;
    }

    @Override
    public final void a(Object obj) {
        p5[] p5VarArr;
        q8 q8Var;
        long j10;
        switch (this.f9020a) {
            case 0:
                o oVar = this.f9021b;
                oVar.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.I.keySet().equals(oVar.K.keySet())) {
                    oVar.e0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.f9021b;
                h hVar = oVar2.f9102b0;
                if (!oVar2.g0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (p5 p5Var : (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class)) {
                        if (spannableStringBuilder.getSpanEnd(p5Var) == editTextSelectionEnd) {
                            oVar2.I.remove(Long.valueOf(p5Var.documentId));
                            oVar2.J.remove(Long.valueOf(p5Var.documentId));
                            oVar2.f9101b.A(Long.valueOf(p5Var.documentId));
                            if (p5Var.documentId == -1 && (q8Var = oVar2.f9107r) != null) {
                                q8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.O);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.i3(hVar, 350L);
                                return;
                            }
                            p5Var.setRemoved(new e3(oVar2, p5Var, editTextSelectionEnd, 6));
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
                o oVar3 = this.f9021b;
                if (!oVar3.isFinishing()) {
                    oVar3.f9108s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        return;
                    }
                    ci.e0 e0Var = new ci.e0(21, oVar3, tL_error);
                    if (oVar3.X == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    org.telegram.messenger.g0.i3(e0Var, j10);
                    return;
                }
                return;
            default:
                o oVar4 = this.f9021b;
                oVar4.getClass();
                oVar4.V = ((Integer) obj).intValue();
                return;
        }
    }
}
