package ng;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.u5;
public final class k implements Utilities.Callback {
    public final int f16102a;
    public final s f16103b;

    public k(s sVar, int i10) {
        this.f16102a = i10;
        this.f16103b = sVar;
    }

    @Override
    public final void run(Object obj) {
        u5[] u5VarArr;
        s8 s8Var;
        long j10;
        switch (this.f16102a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.f16103b;
                h hVar = sVar.R;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.f16214n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f16214n.getText());
                    for (u5 u5Var : (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class)) {
                        if (spannableStringBuilder.getSpanEnd(u5Var) == editTextSelectionEnd) {
                            sVar.B.remove(Long.valueOf(u5Var.documentId));
                            sVar.C.remove(Long.valueOf(u5Var.documentId));
                            sVar.f16210b.A(Long.valueOf(u5Var.documentId));
                            if (u5Var.documentId == -1 && (s8Var = sVar.f16216s) != null) {
                                s8Var.setChecked(false);
                                sVar.f16214n.setMaxLength(sVar.G);
                            }
                            if (bool.booleanValue()) {
                                sVar.f16214n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            u5Var.setRemoved(new bh.a(sVar, u5Var, editTextSelectionEnd, 11));
                            sVar.W(u5Var);
                            sVar.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.f16103b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        return;
                    }
                    m2 m2Var = new m2(17, sVar2, tL_error);
                    if (sVar2.N == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(m2Var, j10);
                    return;
                }
                return;
            default:
                s sVar3 = this.f16103b;
                sVar3.getClass();
                sVar3.L = ((Integer) obj).intValue();
                return;
        }
    }
}
