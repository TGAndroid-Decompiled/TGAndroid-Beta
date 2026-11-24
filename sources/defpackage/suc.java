package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
public final class suc extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        tuc tucVar = (tuc) view;
        CharSequence charSequence = c6cVar.o;
        String str = (String) c6cVar.m;
        long j = c6cVar.C;
        ImageView imageView = tucVar.a;
        tucVar.b.setText(charSequence);
        ey0 ey0Var = tucVar.c;
        ey0Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            ey0Var.setTranslationY(-gm.L(14.0f));
            ey0Var.setScaleX(1.3f);
            ey0Var.setScaleY(1.3f);
        } else {
            ey0Var.setTranslationY(0.0f);
            ey0Var.setScaleX(1.0f);
            ey0Var.setScaleY(1.0f);
        }
        tucVar.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        vm vmVar = tucVar.d;
        if (vmVar != null) {
            vmVar.o(imageView);
            tucVar.d = null;
        }
        tucVar.h = null;
        if (j != 0) {
            vm m = vm.m(z8c.t0, j, null, 1);
            tucVar.d = m;
            m.b(imageView);
            imageView.setImageDrawable(tucVar.d);
        } else {
            ShapeDrawable b0 = cmb.b0(gm.L(6.0f), cmb.p1(0.1f, cmb.w0(null, cmb.F6, false)));
            tucVar.h = b0;
            sn2 sn2Var = new sn2(b0, new f6(charSequence2));
            int L = gm.L(28.0f);
            int L2 = gm.L(28.0f);
            sn2Var.h = L;
            sn2Var.n = L2;
            imageView.setImageDrawable(sn2Var);
        }
        tucVar.f = z;
        tucVar.invalidate();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new tuc(context);
    }
}
