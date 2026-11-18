package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.rr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a5;
public final class q implements TextView.OnEditorActionListener {
    public final int f18418a;
    public final int f18419b;
    public final org.telegram.ui.ActionBar.u1[] f18420c;
    public final View d;
    public final EditTextBoldCursor f18421e;
    public final Object f18422f;

    public q(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.u1[] u1VarArr, View view, int i10) {
        this.f18418a = i10;
        this.f18421e = editTextBoldCursor;
        this.f18419b = i7;
        this.f18422f = obj;
        this.f18420c = u1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f18418a) {
            case 0:
                s sVar = (s) this.f18421e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f18422f;
                if (i7 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.D3(sVar);
                } else {
                    y d = y.d(this.f18419b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.u1[] u1VarArr = this.f18420c;
                    org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
                    }
                    if (u1VarArr[0] == v.f18496e) {
                        v.f18496e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                a5 a5Var = (a5) this.f18421e;
                rr rrVar = (rr) this.f18422f;
                if (i7 != 6) {
                    return false;
                }
                String obj2 = a5Var.getText().toString();
                if (obj2.length() > this.f18419b) {
                    org.telegram.messenger.g0.D3(a5Var);
                } else {
                    rrVar.a(obj2);
                    org.telegram.ui.ActionBar.u1 u1Var2 = this.f18420c[0];
                    if (u1Var2 != null) {
                        u1Var2.dismiss();
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
