package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class bd extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public bd(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2 = aob.I5;
        Drawable f0 = aob.f0(aob.v0(i2, vnbVar), 2, -1);
        uob M = yob.M(i2);
        setBackground(f0);
        yob.j(this, f0, null, M, vnbVar);
        setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.J5, vnbVar, PorterDuff.Mode.MULTIPLY);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, tre.e(-2, 40, i | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, tre.e(-2, -2, (ob6.a0 ? 5 : 3) | 16));
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
            if (ob6.a0) {
                L = 0;
            } else {
                L = hl.L(56.0f);
            }
            if (ob6.a0) {
                i2 = hl.L(56.0f);
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
