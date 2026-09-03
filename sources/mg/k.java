package mg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import lh.n2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.u5;
public final class k implements Utilities.Callback {
    public final int f14021a;
    public final s f14022b;

    public k(s sVar, int i10) {
        this.f14021a = i10;
        this.f14022b = sVar;
    }

    @Override
    public final void run(Object obj) {
        u5[] u5VarArr;
        r8 r8Var;
        long j10;
        switch (this.f14021a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.f14022b;
                h hVar = sVar.R;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.f14127n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f14127n.getText());
                    for (u5 u5Var : (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class)) {
                        if (spannableStringBuilder.getSpanEnd(u5Var) == editTextSelectionEnd) {
                            sVar.B.remove(Long.valueOf(u5Var.documentId));
                            sVar.C.remove(Long.valueOf(u5Var.documentId));
                            sVar.f14124b.A(Long.valueOf(u5Var.documentId));
                            if (u5Var.documentId == -1 && (r8Var = sVar.f14129s) != null) {
                                r8Var.setChecked(false);
                                sVar.f14127n.setMaxLength(sVar.G);
                            }
                            if (bool.booleanValue()) {
                                sVar.f14127n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            u5Var.setRemoved(new ah.a(sVar, u5Var, editTextSelectionEnd, 11));
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
                s sVar2 = this.f14022b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        return;
                    }
                    n2 n2Var = new n2(17, sVar2, tL_error);
                    if (sVar2.N == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(n2Var, j10);
                    return;
                }
                return;
            default:
                s sVar3 = this.f14022b;
                sVar3.getClass();
                sVar3.L = ((Integer) obj).intValue();
                return;
        }
    }
}
