package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class wa extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i;
        xa xaVar = (xa) view;
        if (c6cVar.H == null) {
            xaVar.setAsShowMore((eb) c6cVar.I);
            return;
        }
        int i2 = c6cVar.A;
        String charSequence = c6cVar.m.toString();
        View.OnClickListener onClickListener = c6cVar.E;
        eb ebVar = (eb) c6cVar.I;
        ImageView imageView = xaVar.a;
        imageView.setVisibility(0);
        int i3 = ebVar.G;
        int i4 = ebVar.I;
        TextView textView = xaVar.b;
        textView.setTextColor(i4);
        int p1 = cmb.p1(0.6f, i4);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
        ImageView imageView2 = xaVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(cmb.p1(0.6f, i4), mode));
        imageView2.setBackground(cmb.Z(0, cmb.p1(0.15f, i4), gm.L(4.0f), gm.L(4.0f)));
        if (i2 == 0) {
            i = 2131232100;
        } else {
            i = 2131232360;
        }
        imageView.setImageResource(i);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        xaVar.d.setColor(cmb.p1(0.1f, ebVar.I));
        xaVar.e = z;
        xaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new xa(context);
    }
}
