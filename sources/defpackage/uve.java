package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class uve {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ktb.a(view, charSequence);
            return;
        }
        mtb mtbVar = mtb.w;
        if (mtbVar != null && mtbVar.a == view) {
            mtb.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            mtb mtbVar2 = mtb.x;
            if (mtbVar2 != null && mtbVar2.a == view) {
                mtbVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new mtb(view, charSequence);
    }
}
