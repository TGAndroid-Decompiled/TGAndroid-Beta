package lg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.or;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s4;
public final class q implements TextView.OnEditorActionListener {
    public final int f18406a;
    public final int f18407b;
    public final org.telegram.ui.ActionBar.s1[] f18408c;
    public final View d;
    public final EditTextBoldCursor f18409e;
    public final Object f18410f;

    public q(EditTextBoldCursor editTextBoldCursor, int i3, Object obj, org.telegram.ui.ActionBar.s1[] s1VarArr, View view, int i10) {
        this.f18406a = i10;
        this.f18409e = editTextBoldCursor;
        this.f18407b = i3;
        this.f18410f = obj;
        this.f18408c = s1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f18406a) {
            case 0:
                s sVar = (s) this.f18409e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f18410f;
                if (i3 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.F3(sVar);
                } else {
                    z d = z.d(this.f18407b);
                    TL_account.TL_businessChatLink c2 = d.c(tL_businessChatLink.link);
                    if (c2 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c2.message;
                        tL_inputBusinessChatLink.entities = c2.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c2, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.s1[] s1VarArr = this.f18408c;
                    org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                    if (s1Var != null) {
                        s1Var.dismiss();
                    }
                    if (s1VarArr[0] == v.f18489e) {
                        v.f18489e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                s4 s4Var = (s4) this.f18409e;
                or orVar = (or) this.f18410f;
                if (i3 != 6) {
                    return false;
                }
                String obj2 = s4Var.getText().toString();
                if (obj2.length() > this.f18407b) {
                    org.telegram.messenger.g0.F3(s4Var);
                } else {
                    orVar.a(obj2);
                    org.telegram.ui.ActionBar.s1 s1Var2 = this.f18408c[0];
                    if (s1Var2 != null) {
                        s1Var2.dismiss();
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
