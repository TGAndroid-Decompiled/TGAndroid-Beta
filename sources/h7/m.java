package h7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public abstract class m {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.q3.a(view, charSequence);
            return;
        }
        m.s3 s3Var = m.s3.v;
        if (s3Var != null && s3Var.f17458a == view) {
            m.s3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.s3(view, charSequence);
            return;
        }
        m.s3 s3Var2 = m.s3.f17457w;
        if (s3Var2 != null && s3Var2.f17458a == view) {
            s3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
