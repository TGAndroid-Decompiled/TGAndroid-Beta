package gg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements TextView.OnEditorActionListener {
    public final int f9021a;
    public final int f9022b;
    public final org.telegram.ui.ActionBar.d2[] f9023c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f9024f;

    public r(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.d2[] d2VarArr, View view, int i11) {
        this.f9021a = i11;
        this.e = editTextBoldCursor;
        this.f9022b = i10;
        this.f9024f = obj;
        this.f9023c = d2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f9021a) {
            case 0:
                u uVar = (u) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f9024f;
                if (i10 != 6) {
                    return false;
                }
                String obj = uVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(uVar);
                } else {
                    b0 d = b0.d(this.f9022b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.d2[] d2VarArr = this.f9023c;
                    org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                    if (d2Var != null) {
                        d2Var.dismiss();
                    }
                    if (d2VarArr[0] == x.d) {
                        x.d = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f9024f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.e;
                String obj2 = editTextBoldCursor.getText().toString();
                if (obj2.length() > this.f9022b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.d2 d2Var2 = this.f9023c[0];
                    if (d2Var2 != null) {
                        d2Var2.dismiss();
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
