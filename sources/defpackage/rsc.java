package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
public final class rsc extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ssc sscVar = (ssc) view;
        CharSequence charSequence = c4cVar.o;
        String str = (String) c4cVar.m;
        long j = c4cVar.C;
        ImageView imageView = sscVar.a;
        sscVar.b.setText(charSequence);
        xw0 xw0Var = sscVar.c;
        xw0Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            xw0Var.setTranslationY(-gl.L(14.0f));
            xw0Var.setScaleX(1.3f);
            xw0Var.setScaleY(1.3f);
        } else {
            xw0Var.setTranslationY(0.0f);
            xw0Var.setScaleX(1.0f);
            xw0Var.setScaleY(1.0f);
        }
        sscVar.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        vl vlVar = sscVar.d;
        if (vlVar != null) {
            vlVar.o(imageView);
            sscVar.d = null;
        }
        sscVar.h = null;
        if (j != 0) {
            vl m = vl.m(y6c.t0, j, null, 1);
            sscVar.d = m;
            m.b(imageView);
            imageView.setImageDrawable(sscVar.d);
        } else {
            ShapeDrawable b0 = bkb.b0(gl.L(6.0f), bkb.p1(0.1f, bkb.w0(null, bkb.F6, false)));
            sscVar.h = b0;
            fm2 fm2Var = new fm2(b0, new f6(charSequence2));
            int L = gl.L(28.0f);
            int L2 = gl.L(28.0f);
            fm2Var.h = L;
            fm2Var.n = L2;
            imageView.setImageDrawable(fm2Var);
        }
        sscVar.f = z;
        sscVar.invalidate();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ssc(context);
    }
}
