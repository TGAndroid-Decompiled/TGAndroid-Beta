package ig;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import hh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.t5;

public final class k implements Utilities.Callback {

    public final int f11335a;

    public final s f11336b;

    public k(s sVar, int i10) {
        this.f11335a = i10;
        this.f11336b = sVar;
    }

    @Override
    public final void run(Object obj) {
        p8 p8Var;
        switch (this.f11335a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.f11336b;
                h hVar = sVar.Q;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.f11446n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f11446n.getText());
                    for (t5 t5Var : (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class)) {
                        if (spannableStringBuilder.getSpanEnd(t5Var) == editTextSelectionEnd) {
                            sVar.A.remove(Long.valueOf(t5Var.documentId));
                            sVar.B.remove(Long.valueOf(t5Var.documentId));
                            sVar.f11442b.A(Long.valueOf(t5Var.documentId));
                            if (t5Var.documentId == -1 && (p8Var = sVar.f11448s) != null) {
                                p8Var.setChecked(false);
                                sVar.f11446n.setMaxLength(sVar.F);
                            }
                            if (bool.booleanValue()) {
                                sVar.f11446n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                            } else {
                                t5Var.setRemoved(new d5.i(sVar, t5Var, editTextSelectionEnd, 7));
                                sVar.W(t5Var);
                                sVar.Y(false);
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.f11336b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                    } else {
                        AndroidUtilities.runOnUIThread(new m5(8, sVar2, tL_error), sVar2.M == null ? 200L : 0L);
                    }
                    break;
                }
                break;
            default:
                s sVar3 = this.f11336b;
                sVar3.getClass();
                sVar3.K = ((Integer) obj).intValue();
                break;
        }
    }
}
