package bi;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.ot;
public final class u5 implements TextView.OnEditorActionListener {
    public final int f4158a;
    public final Object f4159b;
    public final Object f4160c;
    public final Object d;
    public final Object f4161e;

    public u5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4158a = i7;
        this.f4159b = obj;
        this.f4160c = obj2;
        this.d = obj3;
        this.f4161e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f4158a) {
            case 0:
                t5 t5Var = (t5) this.f4159b;
                if (i7 != 6) {
                    return false;
                }
                String obj = t5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((y10) this.f4160c).a(obj);
                    org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.d)[0];
                    if (t1Var != null) {
                        t1Var.dismiss();
                    }
                    View view = (View) this.f4161e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.D3(t5Var);
                }
                return true;
            default:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f4159b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f4160c).confirm(((ot) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.t1) this.f4161e).dismiss();
                }
                return true;
        }
    }
}
