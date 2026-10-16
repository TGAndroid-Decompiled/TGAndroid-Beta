package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p implements TextView.OnEditorActionListener {
    public final int f11602a;
    public final int f11603b;
    public final org.telegram.ui.ActionBar.a2[] f11604c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f11605f;

    public p(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.a2[] a2VarArr, View view, int i11) {
        this.f11602a = i11;
        this.e = editTextBoldCursor;
        this.f11603b = i10;
        this.f11605f = obj;
        this.f11604c = a2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f11602a) {
            case 0:
                s sVar = (s) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f11605f;
                if (i10 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                } else {
                    y d = y.d(this.f11603b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.a2[] a2VarArr = this.f11604c;
                    org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                    if (a2Var != null) {
                        a2Var.dismiss();
                    }
                    if (a2VarArr[0] == v.d) {
                        v.d = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f11605f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.e;
                String obj2 = editTextBoldCursor.getText().toString();
                if (obj2.length() > this.f11603b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.a2 a2Var2 = this.f11604c[0];
                    if (a2Var2 != null) {
                        a2Var2.dismiss();
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
