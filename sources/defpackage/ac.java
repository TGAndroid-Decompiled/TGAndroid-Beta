package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ac extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public ac(ylb ylbVar, Context context, boolean z) {
        super(context);
        float f;
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = cmb.F6;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, qoe.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z) {
            f = 2.0f;
        } else {
            f = 9.8f;
        }
        addView(linearLayout, qoe.d(-1, -2.0f, 23, 64.0f, f, 24.0f, z ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, i, ylbVar);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 14.0f);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = m;
        anb.X(m, cmb.y6, ylbVar);
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, qoe.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
