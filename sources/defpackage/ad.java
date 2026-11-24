package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ad extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public ad(Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2 = bkb.H5;
        Drawable f0 = bkb.f0(bkb.v0(i2, wjbVar), 2, -1);
        vkb M = zkb.M(i2);
        setBackground(f0);
        zkb.j(this, f0, null, M, wjbVar);
        setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.I5, wjbVar, PorterDuff.Mode.MULTIPLY);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, nme.e(-2, 40, i | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, nme.e(-2, -2, (k96.a0 ? 5 : 3) | 16));
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
            if (k96.a0) {
                L = 0;
            } else {
                L = gl.L(56.0f);
            }
            if (k96.a0) {
                i2 = gl.L(56.0f);
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
