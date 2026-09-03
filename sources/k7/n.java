package k7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class n {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.o3.a(view, charSequence);
            return;
        }
        m.q3 q3Var = m.q3.v;
        if (q3Var != null && q3Var.f13309a == view) {
            m.q3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.q3 q3Var2 = m.q3.f13308w;
            if (q3Var2 != null && q3Var2.f13309a == view) {
                q3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m.q3(view, charSequence);
    }
}
