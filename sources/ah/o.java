package ah;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
public final class o implements Utilities.Callback {
    public final int f659a;
    public final b0 f660b;

    public o(b0 b0Var, int i10) {
        this.f659a = i10;
        this.f660b = b0Var;
    }

    @Override
    public final void run(Object obj) {
        z5[] z5VarArr;
        w8 w8Var;
        long j3;
        switch (this.f659a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b0 b0Var = this.f660b;
                l lVar = b0Var.U;
                if (!b0Var.a0()) {
                    int editTextSelectionEnd = b0Var.f460n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b0Var.f460n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            b0Var.E.remove(Long.valueOf(z5Var.documentId));
                            b0Var.F.remove(Long.valueOf(z5Var.documentId));
                            b0Var.f456b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = b0Var.f462s) != null) {
                                w8Var.setChecked(false);
                                b0Var.f460n.setMaxLength(b0Var.J);
                            }
                            if (bool.booleanValue()) {
                                b0Var.f460n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(lVar);
                                AndroidUtilities.runOnUIThread(lVar, 350L);
                                return;
                            }
                            z5Var.setRemoved(new p(b0Var, z5Var, editTextSelectionEnd, 0));
                            b0Var.W(z5Var);
                            b0Var.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                b0 b0Var2 = this.f660b;
                if (!b0Var2.isFinishing()) {
                    b0Var2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        b0Var2.finishFragment();
                        return;
                    }
                    a1.e eVar = new a1.e(6, b0Var2, tL_error);
                    if (b0Var2.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(eVar, j3);
                    return;
                }
                return;
            default:
                b0 b0Var3 = this.f660b;
                b0Var3.getClass();
                b0Var3.O = ((Integer) obj).intValue();
                return;
        }
    }
}
