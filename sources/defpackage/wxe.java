package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class wxe {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            lvb.a(view, charSequence);
            return;
        }
        nvb nvbVar = nvb.w;
        if (nvbVar != null && nvbVar.a == view) {
            nvb.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            nvb nvbVar2 = nvb.x;
            if (nvbVar2 != null && nvbVar2.a == view) {
                nvbVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new nvb(view, charSequence);
    }
}
