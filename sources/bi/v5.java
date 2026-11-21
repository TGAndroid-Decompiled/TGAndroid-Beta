package bi;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.ot;
public final class v5 implements TextView.OnEditorActionListener {
    public final int f4186a;
    public final Object f4187b;
    public final Object f4188c;
    public final Object d;
    public final Object f4189e;

    public v5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4186a = i7;
        this.f4187b = obj;
        this.f4188c = obj2;
        this.d = obj3;
        this.f4189e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f4186a) {
            case 0:
                u5 u5Var = (u5) this.f4187b;
                if (i7 != 6) {
                    return false;
                }
                String obj = u5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((x10) this.f4188c).a(obj);
                    org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.d)[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    View view = (View) this.f4189e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.D3(u5Var);
                }
                return true;
            default:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f4187b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f4188c).confirm(((ot) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.t1) this.f4189e).dismiss();
                }
                return true;
        }
    }
}
