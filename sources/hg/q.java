package hg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q implements TextView.OnEditorActionListener {
    public final int f10374a;
    public final int f10375b;
    public final org.telegram.ui.ActionBar.b2[] f10376c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f10377f;

    public q(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.b2[] b2VarArr, View view, int i11) {
        this.f10374a = i11;
        this.e = editTextBoldCursor;
        this.f10375b = i10;
        this.f10377f = obj;
        this.f10376c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f10374a) {
            case 0:
                u uVar = (u) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f10377f;
                if (i10 != 6) {
                    return false;
                }
                String obj = uVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(uVar);
                } else {
                    a0 d = a0.d(this.f10375b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.b2[] b2VarArr = this.f10376c;
                    org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                    if (b2Var != null) {
                        b2Var.dismiss();
                    }
                    if (b2VarArr[0] == x.d) {
                        x.d = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f10377f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.e;
                String obj2 = editTextBoldCursor.getText().toString();
                if (obj2.length() > this.f10375b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.b2 b2Var2 = this.f10376c[0];
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
