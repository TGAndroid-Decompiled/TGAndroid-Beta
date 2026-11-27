package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class xa extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i;
        ya yaVar = (ya) view;
        if (b8cVar.H == null) {
            yaVar.setAsShowMore((fb) b8cVar.I);
            return;
        }
        int i2 = b8cVar.A;
        String charSequence = b8cVar.m.toString();
        View.OnClickListener onClickListener = b8cVar.E;
        fb fbVar = (fb) b8cVar.I;
        ImageView imageView = yaVar.a;
        imageView.setVisibility(0);
        int i3 = fbVar.G;
        int i4 = fbVar.I;
        TextView textView = yaVar.b;
        textView.setTextColor(i4);
        int p1 = aob.p1(0.6f, i4);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
        ImageView imageView2 = yaVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(aob.p1(0.6f, i4), mode));
        imageView2.setBackground(aob.Z(0, aob.p1(0.15f, i4), hl.L(4.0f), hl.L(4.0f)));
        if (i2 == 0) {
            i = 2131232099;
        } else {
            i = 2131232359;
        }
        imageView.setImageResource(i);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        yaVar.d.setColor(aob.p1(0.1f, fbVar.I));
        yaVar.e = z;
        yaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ya(context);
    }
}
