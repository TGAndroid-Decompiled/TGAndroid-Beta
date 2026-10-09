package hg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q implements TextView.OnEditorActionListener {
    public final int f11350a;
    public final int f11351b;
    public final org.telegram.ui.ActionBar.b2[] f11352c;
    public final View d;
    public final EditTextBoldCursor f11353e;
    public final Object f11354f;

    public q(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.b2[] b2VarArr, View view, int i11) {
        this.f11350a = i11;
        this.f11353e = editTextBoldCursor;
        this.f11351b = i10;
        this.f11354f = obj;
        this.f11352c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f11350a) {
            case 0:
                t tVar = (t) this.f11353e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f11354f;
                if (i10 != 6) {
                    return false;
                }
                String obj = tVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(tVar);
                } else {
                    z d = z.d(this.f11351b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.b2[] b2VarArr = this.f11352c;
                    org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                    if (b2Var != null) {
                        b2Var.dismiss();
                    }
                    if (b2VarArr[0] == w.d) {
                        w.d = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f11354f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f11353e;
                String obj2 = editTextBoldCursor.getText().toString();
                if (obj2.length() > this.f11351b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.b2 b2Var2 = this.f11352c[0];
                    if (b2Var2 != null) {
                        b2Var2.dismiss();
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
