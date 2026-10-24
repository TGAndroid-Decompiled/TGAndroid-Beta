package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
public final class p implements TextView.OnEditorActionListener {
    public final int f13016a;
    public final int f13017b;
    public final org.telegram.ui.ActionBar.c2[] f13018c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f13019f;

    public p(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.c2[] c2VarArr, View view, int i11) {
        this.f13016a = i11;
        this.e = editTextBoldCursor;
        this.f13017b = i10;
        this.f13019f = obj;
        this.f13018c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f13016a) {
            case 0:
                s sVar = (s) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f13019f;
                if (i10 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                } else {
                    y d = y.d(this.f13017b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.c2[] c2VarArr = this.f13018c;
                    org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                    if (c2Var != null) {
                        c2Var.dismiss();
                    }
                    if (c2VarArr[0] == v.d) {
                        v.d = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                c5 c5Var = (c5) this.e;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f13019f;
                if (i10 != 6) {
                    return false;
                }
                String obj2 = c5Var.getText().toString();
                if (obj2.length() > this.f13017b) {
                    AndroidUtilities.shakeView(c5Var);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.c2 c2Var2 = this.f13018c[0];
                    if (c2Var2 != null) {
                        c2Var2.dismiss();
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
