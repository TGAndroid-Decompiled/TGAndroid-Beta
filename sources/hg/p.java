package hg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p implements TextView.OnEditorActionListener {
    public final int f10384a;
    public final int f10385b;
    public final org.telegram.ui.ActionBar.b2[] f10386c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f10387f;

    public p(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.b2[] b2VarArr, View view, int i11) {
        this.f10384a = i11;
        this.e = editTextBoldCursor;
        this.f10385b = i10;
        this.f10387f = obj;
        this.f10386c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f10384a) {
            case 0:
                s sVar = (s) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f10387f;
                if (i10 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                } else {
                    y d = y.d(this.f10385b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.b2[] b2VarArr = this.f10386c;
                    org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                    if (b2Var != null) {
                        b2Var.dismiss();
                    }
                    if (b2VarArr[0] == v.e) {
                        v.e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f10387f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.e;
                String obj2 = editTextBoldCursor.getText().toString();
                if (obj2.length() > this.f10385b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.b2 b2Var2 = this.f10386c[0];
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
