package k7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class m {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.p3.a(view, charSequence);
            return;
        }
        m.r3 r3Var = m.r3.v;
        if (r3Var != null && r3Var.f13620a == view) {
            m.r3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.r3 r3Var2 = m.r3.f13619w;
            if (r3Var2 != null && r3Var2.f13620a == view) {
                r3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m.r3(view, charSequence);
    }
}
