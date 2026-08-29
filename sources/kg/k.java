package kg;

import ag.v0;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import jh.w2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.y5;
public final class k implements Utilities.Callback {
    public final int f13748a;
    public final s f13749b;

    public k(s sVar, int i10) {
        this.f13748a = i10;
        this.f13749b = sVar;
    }

    @Override
    public final void run(Object obj) {
        y5[] y5VarArr;
        q8 q8Var;
        long j10;
        switch (this.f13748a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.f13749b;
                h hVar = sVar.Q;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.f13859n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f13859n.getText());
                    for (y5 y5Var : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                        if (spannableStringBuilder.getSpanEnd(y5Var) == editTextSelectionEnd) {
                            sVar.A.remove(Long.valueOf(y5Var.documentId));
                            sVar.B.remove(Long.valueOf(y5Var.documentId));
                            sVar.f13855b.A(Long.valueOf(y5Var.documentId));
                            if (y5Var.documentId == -1 && (q8Var = sVar.f13861s) != null) {
                                q8Var.setChecked(false);
                                sVar.f13859n.setMaxLength(sVar.F);
                            }
                            if (bool.booleanValue()) {
                                sVar.f13859n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            y5Var.setRemoved(new v0(sVar, y5Var, editTextSelectionEnd, 9));
                            sVar.W(y5Var);
                            sVar.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.f13749b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        return;
                    }
                    w2 w2Var = new w2(15, sVar2, tL_error);
                    if (sVar2.M == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(w2Var, j10);
                    return;
                }
                return;
            default:
                s sVar3 = this.f13749b;
                sVar3.getClass();
                sVar3.K = ((Integer) obj).intValue();
                return;
        }
    }
}
