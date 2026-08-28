package hg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.t5;
public final class k implements Utilities.Callback {
    public final int f10629a;
    public final s f10630b;

    public k(s sVar, int i9) {
        this.f10629a = i9;
        this.f10630b = sVar;
    }

    @Override
    public final void run(Object obj) {
        t5[] t5VarArr;
        t8 t8Var;
        long j10;
        switch (this.f10629a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.f10630b;
                h hVar = sVar.Q;
                if (!sVar.Z()) {
                    int editTextSelectionEnd = sVar.f10724n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f10724n.getText());
                    for (t5 t5Var : (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class)) {
                        if (spannableStringBuilder.getSpanEnd(t5Var) == editTextSelectionEnd) {
                            sVar.A.remove(Long.valueOf(t5Var.documentId));
                            sVar.B.remove(Long.valueOf(t5Var.documentId));
                            sVar.f10720b.A(Long.valueOf(t5Var.documentId));
                            if (t5Var.documentId == -1 && (t8Var = sVar.f10726s) != null) {
                                t8Var.setChecked(false);
                                sVar.f10724n.setMaxLength(sVar.F);
                            }
                            if (bool.booleanValue()) {
                                sVar.f10724n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            t5Var.setRemoved(new d5.i(sVar, t5Var, editTextSelectionEnd, 7));
                            sVar.V(t5Var);
                            sVar.X(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.f10630b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        return;
                    }
                    h3.g0 g0Var = new h3.g0(2, sVar2, tL_error);
                    if (sVar2.M == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(g0Var, j10);
                    return;
                }
                return;
            default:
                s sVar3 = this.f10630b;
                sVar3.getClass();
                sVar3.K = ((Integer) obj).intValue();
                return;
        }
    }
}
