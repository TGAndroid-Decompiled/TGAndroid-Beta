package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ae extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public ae(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2 = cmb.H5;
        Drawable f0 = cmb.f0(cmb.v0(i2, ylbVar), 2, -1);
        wmb M = anb.M(i2);
        setBackground(f0);
        anb.j(this, f0, null, M, ylbVar);
        setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.I5, ylbVar, PorterDuff.Mode.MULTIPLY);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, qoe.e(-2, 40, i | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
    }

    public final void a(int i, CharSequence charSequence) {
        int L;
        int i2;
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(56.0f);
            }
            if (jb6.a0) {
                i2 = gm.L(56.0f);
            } else {
                i2 = 0;
            }
            textView.setPadding(L, 0, i2, 0);
            return;
        }
        imageView.setVisibility(4);
        textView.setPadding(0, 0, 0, 0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
