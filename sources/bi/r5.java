package bi;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.mt;
public final class r5 implements TextView.OnEditorActionListener {
    public final int f4008a;
    public final Object f4009b;
    public final Object f4010c;
    public final Object d;
    public final Object f4011e;

    public r5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4008a = i7;
        this.f4009b = obj;
        this.f4010c = obj2;
        this.d = obj3;
        this.f4011e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f4008a) {
            case 0:
                q5 q5Var = (q5) this.f4009b;
                if (i7 != 6) {
                    return false;
                }
                String obj = q5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((x10) this.f4010c).a(obj);
                    org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.d)[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
                    }
                    View view = (View) this.f4011e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.D3(q5Var);
                }
                return true;
            default:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f4009b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f4010c).confirm(((mt) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.u1) this.f4011e).dismiss();
                }
                return true;
        }
    }
}
