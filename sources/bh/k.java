package bh;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.c6;
public final class k implements Utilities.Callback {
    public final int f4073a;
    public final u f4074b;

    public k(u uVar, int i10) {
        this.f4073a = i10;
        this.f4074b = uVar;
    }

    @Override
    public final void run(Object obj) {
        c6[] c6VarArr;
        a9 a9Var;
        long j10;
        switch (this.f4073a) {
            case 0:
                u uVar = this.f4074b;
                uVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!uVar.H.keySet().equals(uVar.J.keySet())) {
                    uVar.a0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                u uVar2 = this.f4074b;
                j jVar = uVar2.Z;
                if (!uVar2.c0()) {
                    int editTextSelectionEnd = uVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uVar2.h.getText());
                    for (c6 c6Var : (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class)) {
                        if (spannableStringBuilder.getSpanEnd(c6Var) == editTextSelectionEnd) {
                            uVar2.H.remove(Long.valueOf(c6Var.documentId));
                            uVar2.I.remove(Long.valueOf(c6Var.documentId));
                            uVar2.f4150b.A(Long.valueOf(c6Var.documentId));
                            if (c6Var.documentId == -1 && (a9Var = uVar2.f4154r) != null) {
                                a9Var.setChecked(false);
                                uVar2.h.setMaxLength(uVar2.M);
                            }
                            if (bool.booleanValue()) {
                                uVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(jVar);
                                AndroidUtilities.runOnUIThread(jVar, 350L);
                                return;
                            }
                            c6Var.setRemoved(new ai.h0(uVar2, c6Var, editTextSelectionEnd, 1));
                            uVar2.Y(c6Var);
                            uVar2.a0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                u uVar3 = this.f4074b;
                if (!uVar3.isFinishing()) {
                    uVar3.f4155s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        uVar3.finishFragment();
                        return;
                    }
                    a1.f fVar = new a1.f(22, uVar3, tL_error);
                    if (uVar3.V == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(fVar, j10);
                    return;
                }
                return;
            default:
                u uVar4 = this.f4074b;
                uVar4.getClass();
                uVar4.T = ((Integer) obj).intValue();
                return;
        }
    }
}
