package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xf implements TextView.OnEditorActionListener {
    public final byte a;
    public final int b;
    public final hd[] c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f;

    public xf(EditTextBoldCursor editTextBoldCursor, int i, Object obj, hd[] hdVarArr, View view, byte b) {
        this.a = b;
        this.e = editTextBoldCursor;
        this.b = i;
        this.f = obj;
        this.c = hdVarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        View view = this.d;
        hd[] hdVarArr = this.c;
        Object obj = this.f;
        int i2 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.e;
        switch (b) {
            case 0:
                hj hjVar = (hj) editTextBoldCursor;
                yc7 yc7Var = (yc7) obj;
                if (i != 6) {
                    return false;
                }
                String obj2 = hjVar.getText().toString();
                if (obj2.length() > i2) {
                    gl.z3(hjVar);
                } else {
                    yc7Var.a(obj2);
                    hd hdVar = hdVarArr[0];
                    if (hdVar != null) {
                        hdVar.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                c41 c41Var = (c41) editTextBoldCursor;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                if (i != 6) {
                    return false;
                }
                String obj3 = c41Var.getText().toString();
                if (obj3.length() > 32) {
                    gl.z3(c41Var);
                } else {
                    j41 d = j41.d(i2);
                    TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                    if (c != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c.message;
                        tL_inputBusinessChatLink.entities = c.entities;
                        tL_inputBusinessChatLink.title = obj3;
                        d.b(c, tL_inputBusinessChatLink, null);
                    }
                    hd hdVar2 = hdVarArr[0];
                    if (hdVar2 != null) {
                        hdVar2.dismiss();
                    }
                    if (hdVarArr[0] == f41.e) {
                        f41.e = null;
                    }
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
        }
    }
}
