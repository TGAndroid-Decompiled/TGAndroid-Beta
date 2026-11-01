package ag;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.r4;
public final class a0 implements TextView.OnEditorActionListener {
    public final int f454a;
    public final int f455b;
    public final org.telegram.ui.ActionBar.x1[] f456c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f457f;

    public a0(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.x1[] x1VarArr, View view, int i11) {
        this.f454a = i11;
        this.e = editTextBoldCursor;
        this.f455b = i10;
        this.f457f = obj;
        this.f456c = x1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f454a) {
            case 0:
                f0 f0Var = (f0) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f457f;
                if (i10 != 6) {
                    return false;
                }
                String obj = f0Var.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.i0.E3(f0Var);
                } else {
                    s0 d = s0.d(this.f455b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.x1[] x1VarArr = this.f456c;
                    org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                    if (x1Var != null) {
                        x1Var.dismiss();
                    }
                    if (x1VarArr[0] == i0.e) {
                        i0.e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                r4 r4Var = (r4) this.e;
                gs gsVar = (gs) this.f457f;
                if (i10 != 6) {
                    return false;
                }
                String obj2 = r4Var.getText().toString();
                if (obj2.length() > this.f455b) {
                    org.telegram.messenger.i0.E3(r4Var);
                } else {
                    gsVar.a(obj2);
                    org.telegram.ui.ActionBar.x1 x1Var2 = this.f456c[0];
                    if (x1Var2 != null) {
                        x1Var2.dismiss();
                    }
                    View view2 = this.d;
                    if (view2 != null) {
                        view2.requestFocus();
                    }
                }
                return true;
        }
    }
}
