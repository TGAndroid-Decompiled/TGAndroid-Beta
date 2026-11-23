package bi;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.ot;
public final class x5 implements TextView.OnEditorActionListener {
    public final int f4215a;
    public final Object f4216b;
    public final Object f4217c;
    public final Object d;
    public final Object f4218e;

    public x5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4215a = i7;
        this.f4216b = obj;
        this.f4217c = obj2;
        this.d = obj3;
        this.f4218e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f4215a) {
            case 0:
                w5 w5Var = (w5) this.f4216b;
                if (i7 != 6) {
                    return false;
                }
                String obj = w5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((y10) this.f4217c).a(obj);
                    org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.d)[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    View view = (View) this.f4218e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.D3(w5Var);
                }
                return true;
            default:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f4216b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f4217c).confirm(((ot) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.t1) this.f4218e).dismiss();
                }
                return true;
        }
    }
}
