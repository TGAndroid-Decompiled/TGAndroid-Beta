package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
public final class gxc extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        hxc hxcVar = (hxc) view;
        CharSequence charSequence = b8cVar.o;
        String str = (String) b8cVar.m;
        long j = b8cVar.C;
        ImageView imageView = hxcVar.a;
        hxcVar.b.setText(charSequence);
        fx0 fx0Var = hxcVar.c;
        fx0Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            fx0Var.setTranslationY(-hl.L(14.0f));
            fx0Var.setScaleX(1.3f);
            fx0Var.setScaleY(1.3f);
        } else {
            fx0Var.setTranslationY(0.0f);
            fx0Var.setScaleX(1.0f);
            fx0Var.setScaleY(1.0f);
        }
        hxcVar.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        wl wlVar = hxcVar.d;
        if (wlVar != null) {
            wlVar.o(imageView);
            hxcVar.d = null;
        }
        hxcVar.h = null;
        if (j != 0) {
            wl m = wl.m(yac.t0, j, null, 1);
            hxcVar.d = m;
            m.b(imageView);
            imageView.setImageDrawable(hxcVar.d);
        } else {
            ShapeDrawable b0 = aob.b0(hl.L(6.0f), aob.p1(0.1f, aob.w0(null, aob.G6, false)));
            hxcVar.h = b0;
            zm2 zm2Var = new zm2(b0, new g6(charSequence2));
            int L = hl.L(28.0f);
            int L2 = hl.L(28.0f);
            zm2Var.h = L;
            zm2Var.n = L2;
            imageView.setImageDrawable(zm2Var);
        }
        hxcVar.f = z;
        hxcVar.invalidate();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new hxc(context);
    }
}
