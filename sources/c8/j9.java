package c8;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class j9 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.l3.a(view, charSequence);
            return;
        }
        m.n3 n3Var = m.n3.f20170w;
        if (n3Var != null && n3Var.f20172a == view) {
            m.n3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.n3 n3Var2 = m.n3.f20171x;
            if (n3Var2 != null && n3Var2.f20172a == view) {
                n3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m.n3(view, charSequence);
    }
}
