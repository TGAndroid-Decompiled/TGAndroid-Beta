package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.rr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
public final class q implements TextView.OnEditorActionListener {
    public final int f18453a;
    public final int f18454b;
    public final org.telegram.ui.ActionBar.t1[] f18455c;
    public final View d;
    public final EditTextBoldCursor f18456e;
    public final Object f18457f;

    public q(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.t1[] t1VarArr, View view, int i10) {
        this.f18453a = i10;
        this.f18456e = editTextBoldCursor;
        this.f18454b = i7;
        this.f18457f = obj;
        this.f18455c = t1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f18453a) {
            case 0:
                s sVar = (s) this.f18456e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f18457f;
                if (i7 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.D3(sVar);
                } else {
                    z d = z.d(this.f18454b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18455c;
                    org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    if (t1VarArr[0] == v.f18536e) {
                        v.f18536e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                b5 b5Var = (b5) this.f18456e;
                rr rrVar = (rr) this.f18457f;
                if (i7 != 6) {
                    return false;
                }
                String obj2 = b5Var.getText().toString();
                if (obj2.length() > this.f18454b) {
                    org.telegram.messenger.g0.D3(b5Var);
                } else {
                    rrVar.a(obj2);
                    org.telegram.ui.ActionBar.t1 t1Var2 = this.f18455c[0];
                    if (t1Var2 != null) {
                        t1Var2.dismiss();
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
