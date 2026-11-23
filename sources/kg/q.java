package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.sr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
public final class q implements TextView.OnEditorActionListener {
    public final int f18456a;
    public final int f18457b;
    public final org.telegram.ui.ActionBar.t1[] f18458c;
    public final View d;
    public final EditTextBoldCursor f18459e;
    public final Object f18460f;

    public q(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.t1[] t1VarArr, View view, int i10) {
        this.f18456a = i10;
        this.f18459e = editTextBoldCursor;
        this.f18457b = i7;
        this.f18460f = obj;
        this.f18458c = t1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f18456a) {
            case 0:
                s sVar = (s) this.f18459e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f18460f;
                if (i7 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.D3(sVar);
                } else {
                    z d = z.d(this.f18457b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18458c;
                    org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    if (t1VarArr[0] == v.f18539e) {
                        v.f18539e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                b5 b5Var = (b5) this.f18459e;
                sr srVar = (sr) this.f18460f;
                if (i7 != 6) {
                    return false;
                }
                String obj2 = b5Var.getText().toString();
                if (obj2.length() > this.f18457b) {
                    org.telegram.messenger.g0.D3(b5Var);
                } else {
                    srVar.a(obj2);
                    org.telegram.ui.ActionBar.t1 t1Var2 = this.f18458c[0];
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
