package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.tr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s4;
public final class q implements TextView.OnEditorActionListener {
    public final int f18039a;
    public final int f18040b;
    public final org.telegram.ui.ActionBar.t1[] f18041c;
    public final View d;
    public final EditTextBoldCursor f18042e;
    public final Object f18043f;

    public q(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.t1[] t1VarArr, View view, int i10) {
        this.f18039a = i10;
        this.f18042e = editTextBoldCursor;
        this.f18040b = i7;
        this.f18043f = obj;
        this.f18041c = t1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f18039a) {
            case 0:
                s sVar = (s) this.f18042e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f18043f;
                if (i7 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.E3(sVar);
                } else {
                    y d = y.d(this.f18040b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18041c;
                    org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    if (t1VarArr[0] == v.f18119e) {
                        v.f18119e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                s4 s4Var = (s4) this.f18042e;
                tr trVar = (tr) this.f18043f;
                if (i7 != 6) {
                    return false;
                }
                String obj2 = s4Var.getText().toString();
                if (obj2.length() > this.f18040b) {
                    org.telegram.messenger.g0.E3(s4Var);
                } else {
                    trVar.a(obj2);
                    org.telegram.ui.ActionBar.t1 t1Var2 = this.f18041c[0];
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
