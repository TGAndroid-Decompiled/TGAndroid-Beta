package hg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q implements TextView.OnEditorActionListener {
    public final int f11349a;
    public final int f11350b;
    public final org.telegram.ui.ActionBar.a2[] f11351c;
    public final View d;
    public final EditTextBoldCursor f11352e;
    public final Object f11353f;

    public q(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.a2[] a2VarArr, View view, int i11) {
        this.f11349a = i11;
        this.f11352e = editTextBoldCursor;
        this.f11350b = i10;
        this.f11353f = obj;
        this.f11351c = a2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f11349a) {
            case 0:
                t tVar = (t) this.f11352e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f11353f;
                if (i10 != 6) {
                    return false;
                }
                String obj = tVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(tVar);
                } else {
                    z d = z.d(this.f11350b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.a2[] a2VarArr = this.f11351c;
                    org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                    if (a2Var != null) {
                        a2Var.dismiss();
                    }
                    if (a2VarArr[0] == w.d) {
                        w.d = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f11353f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f11352e;
                String obj2 = editTextBoldCursor.getText().toString();
                if (obj2.length() > this.f11350b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.a2 a2Var2 = this.f11351c[0];
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
