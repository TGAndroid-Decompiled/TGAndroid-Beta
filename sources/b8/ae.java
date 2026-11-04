package b8;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class ae {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.l3.a(view, charSequence);
            return;
        }
        m.n3 n3Var = m.n3.f18663w;
        if (n3Var != null && n3Var.f18665a == view) {
            m.n3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.n3 n3Var2 = m.n3.f18664x;
            if (n3Var2 != null && n3Var2.f18665a == view) {
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
