package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class wa extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i;
        xa xaVar = (xa) view;
        if (c4cVar.H == null) {
            xaVar.setAsShowMore((eb) c4cVar.I);
            return;
        }
        int i2 = c4cVar.A;
        String charSequence = c4cVar.m.toString();
        View.OnClickListener onClickListener = c4cVar.E;
        eb ebVar = (eb) c4cVar.I;
        ImageView imageView = xaVar.a;
        imageView.setVisibility(0);
        int i3 = ebVar.G;
        int i4 = ebVar.I;
        TextView textView = xaVar.b;
        textView.setTextColor(i4);
        int p1 = bkb.p1(0.6f, i4);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
        ImageView imageView2 = xaVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.6f, i4), mode));
        imageView2.setBackground(bkb.Z(0, bkb.p1(0.15f, i4), gl.L(4.0f), gl.L(4.0f)));
        if (i2 == 0) {
            i = 2131232099;
        } else {
            i = 2131232359;
        }
        imageView.setImageResource(i);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        xaVar.d.setColor(bkb.p1(0.1f, ebVar.I));
        xaVar.e = z;
        xaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new xa(context);
    }
}
