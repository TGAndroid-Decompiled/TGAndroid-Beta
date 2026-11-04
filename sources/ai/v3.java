package ai;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xs;
public final class v3 implements TextView.OnEditorActionListener {
    public final int f1036a;
    public final Object f1037b;
    public final Object f1038c;
    public final Object d;
    public final Object f1039e;

    public v3(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f1036a = i3;
        this.f1037b = obj;
        this.f1038c = obj2;
        this.d = obj3;
        this.f1039e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f1036a) {
            case 0:
                u3 u3Var = (u3) this.f1037b;
                if (i3 != 6) {
                    return false;
                }
                String obj = u3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((u10) this.f1038c).a(obj);
                    org.telegram.ui.ActionBar.s1 s1Var = ((org.telegram.ui.ActionBar.s1[]) this.d)[0];
                    if (s1Var != null) {
                        s1Var.dismiss();
                    }
                    View view = (View) this.f1039e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.F3(u3Var);
                }
                return true;
            default:
                if (i3 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f1037b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f1038c).confirm(((xs) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.s1) this.f1039e).dismiss();
                }
                return true;
        }
    }
}
