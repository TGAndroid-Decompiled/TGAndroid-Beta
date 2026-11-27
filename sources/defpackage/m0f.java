package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class m0f {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            lxb.a(view, charSequence);
            return;
        }
        nxb nxbVar = nxb.w;
        if (nxbVar != null && nxbVar.a == view) {
            nxb.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            nxb nxbVar2 = nxb.x;
            if (nxbVar2 != null && nxbVar2.a == view) {
                nxbVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new nxb(view, charSequence);
    }
}
