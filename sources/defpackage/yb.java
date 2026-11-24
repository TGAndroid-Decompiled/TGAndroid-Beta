package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class yb extends FrameLayout {
    public final wjb a;
    public final ImageView b;
    public final FrameLayout.LayoutParams c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;

    public yb(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = nme.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.c = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d2 = nme.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.d = d2;
        addView(linearLayout, d2);
        TextView textView = new TextView(context);
        this.e = textView;
        ug8.v(textView, 1, 15.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f = m;
        m.setTextSize(1, 14.0f);
        zkb.X(m, bkb.y6, wjbVar);
        linearLayout.addView(m, nme.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        zkb.s(imageView2, bkb.L6, wjbVar, mode);
        imageView2.setImageResource(2131232064);
        imageView2.setScaleType(scaleType);
        addView(imageView2, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        int L = gl.L(4.0f);
        int i = bkb.kk;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        textView2.setBackground(b0);
        zkb.j(textView2, b0, M, null, wjbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(gl.o());
        textView2.setPadding(gl.L(5.0f), 0, gl.L(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, nme.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.b;
        imageView.setImageResource(i2);
        ShapeDrawable b0 = bkb.b0(gl.L(9.0f), i);
        int i3 = bkb.kk;
        wjb wjbVar = this.a;
        if (i == bkb.v0(i3, wjbVar)) {
            zkb.B(imageView, b0, zkb.M(i3), wjbVar);
        } else {
            imageView.setBackground(b0);
        }
        TextView textView = this.e;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f;
        FrameLayout.LayoutParams layoutParams = this.c;
        FrameLayout.LayoutParams layoutParams2 = this.d;
        if (isEmpty) {
            layoutParams.topMargin = gl.L(10.0f);
            layoutParams.bottomMargin = gl.L(10.0f);
            textView.setTypeface(null);
            textView.setTextSize(1, 16.0f);
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.gravity = 23;
            textView2.setVisibility(8);
            return;
        }
        layoutParams.topMargin = gl.L(14.33f);
        layoutParams.bottomMargin = gl.L(10.0f);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 15.0f);
        layoutParams2.topMargin = gl.L(10.0f);
        layoutParams2.bottomMargin = gl.L(8.66f);
        layoutParams2.gravity = 55;
        textView2.setText(charSequence2);
        textView2.setVisibility(0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setPercent(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.h;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
