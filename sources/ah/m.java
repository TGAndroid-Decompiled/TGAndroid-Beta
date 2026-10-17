package ah;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.a6;
public final class m implements Utilities.Callback {
    public final int f828a;
    public final a0 f829b;

    public m(a0 a0Var, int i10) {
        this.f828a = i10;
        this.f829b = a0Var;
    }

    @Override
    public final void run(Object obj) {
        a6[] a6VarArr;
        v8 v8Var;
        long j10;
        switch (this.f828a) {
            case 0:
                a0 a0Var = this.f829b;
                a0Var.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!a0Var.E.keySet().equals(a0Var.G.keySet())) {
                    a0Var.Y(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                a0 a0Var2 = this.f829b;
                l lVar = a0Var2.U;
                if (!a0Var2.a0()) {
                    int editTextSelectionEnd = a0Var2.f645n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0Var2.f645n.getText());
                    for (a6 a6Var : (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class)) {
                        if (spannableStringBuilder.getSpanEnd(a6Var) == editTextSelectionEnd) {
                            a0Var2.E.remove(Long.valueOf(a6Var.documentId));
                            a0Var2.F.remove(Long.valueOf(a6Var.documentId));
                            a0Var2.f642b.A(Long.valueOf(a6Var.documentId));
                            if (a6Var.documentId == -1 && (v8Var = a0Var2.f647s) != null) {
                                v8Var.setChecked(false);
                                a0Var2.f645n.setMaxLength(a0Var2.J);
                            }
                            if (bool.booleanValue()) {
                                a0Var2.f645n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(lVar);
                                AndroidUtilities.runOnUIThread(lVar, 350L);
                                return;
                            }
                            a6Var.setRemoved(new o(a0Var2, a6Var, editTextSelectionEnd, 0));
                            a0Var2.W(a6Var);
                            a0Var2.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                a0 a0Var3 = this.f829b;
                if (!a0Var3.isFinishing()) {
                    a0Var3.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        a0Var3.finishFragment();
                        return;
                    }
                    a1.f fVar = new a1.f(8, a0Var3, tL_error);
                    if (a0Var3.Q == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(fVar, j10);
                    return;
                }
                return;
            default:
                a0 a0Var4 = this.f829b;
                a0Var4.getClass();
                a0Var4.O = ((Integer) obj).intValue();
                return;
        }
    }
}
