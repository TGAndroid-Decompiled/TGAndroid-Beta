package bi;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.ft;
public final class k3 implements TextView.OnEditorActionListener {
    public final int f3647a;
    public final Object f3648b;
    public final Object f3649c;
    public final Object d;
    public final Object f3650e;

    public k3(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3647a = i7;
        this.f3648b = obj;
        this.f3649c = obj2;
        this.d = obj3;
        this.f3650e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f3647a) {
            case 0:
                j3 j3Var = (j3) this.f3648b;
                if (i7 != 6) {
                    return false;
                }
                String obj = j3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((z10) this.f3649c).a(obj);
                    org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.d)[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    View view = (View) this.f3650e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.E3(j3Var);
                }
                return true;
            default:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f3648b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f3649c).confirm(((ft) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.t1) this.f3650e).dismiss();
                }
                return true;
        }
    }
}
