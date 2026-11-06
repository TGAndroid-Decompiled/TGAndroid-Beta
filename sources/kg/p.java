package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.wr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.u4;
public final class p implements TextView.OnEditorActionListener {
    public final int f17466a;
    public final int f17467b;
    public final org.telegram.ui.ActionBar.u1[] f17468c;
    public final View d;
    public final EditTextBoldCursor f17469e;
    public final Object f17470f;

    public p(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.u1[] u1VarArr, View view, int i10) {
        this.f17466a = i10;
        this.f17469e = editTextBoldCursor;
        this.f17467b = i7;
        this.f17470f = obj;
        this.f17468c = u1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f17466a) {
            case 0:
                s sVar = (s) this.f17469e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f17470f;
                if (i7 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.F3(sVar);
                } else {
                    y d = y.d(this.f17467b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.u1[] u1VarArr = this.f17468c;
                    org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
                    }
                    if (u1VarArr[0] == v.f17557e) {
                        v.f17557e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                u4 u4Var = (u4) this.f17469e;
                wr wrVar = (wr) this.f17470f;
                if (i7 != 6) {
                    return false;
                }
                String obj2 = u4Var.getText().toString();
                if (obj2.length() > this.f17467b) {
                    org.telegram.messenger.g0.F3(u4Var);
                } else {
                    wrVar.a(obj2);
                    org.telegram.ui.ActionBar.u1 u1Var2 = this.f17468c[0];
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
