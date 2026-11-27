package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class bc extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public bc(vnb vnbVar, Context context, boolean z) {
        super(context);
        float f;
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = aob.G6;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, tre.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z) {
            f = 2.0f;
        } else {
            f = 9.8f;
        }
        addView(linearLayout, tre.d(-1, -2.0f, 23, 64.0f, f, 24.0f, z ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, i, vnbVar);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 14.0f);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = m;
        yob.X(m, aob.z6, vnbVar);
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, tre.t(-1, -2, 55, 0, 0, 0, 0));
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
