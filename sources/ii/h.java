package ii;

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
import b8.mf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
public final class h extends FrameLayout {
    public final e6 f14969a;
    public final ImageView f14970b;
    public final FrameLayout.LayoutParams f14971c;
    public final FrameLayout.LayoutParams d;
    public final TextView f14972e;
    public final TextView f14973f;
    public final TextView h;

    public h(Context context, e6 e6Var) {
        super(context);
        this.f14969a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f14970b = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = mf.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f14971c = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d10 = mf.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.d = d10;
        addView(linearLayout, d10);
        TextView textView = new TextView(context);
        this.f14972e = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 15.0f);
        r6.V(textView, k6.G6, e6Var);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f14973f = f10;
        f10.setTextSize(1, 14.0f);
        r6.V(f10, k6.f28290z6, e6Var);
        linearLayout.addView(f10, mf.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        r6.t(imageView2, k6.M6, e6Var, mode);
        imageView2.setImageResource(2131232059);
        imageView2.setScaleType(scaleType);
        addView(imageView2, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        int L = org.telegram.messenger.g0.L(4.0f);
        int i3 = k6.ik;
        ShapeDrawable d02 = k6.d0(L, k6.w0(i3, e6Var));
        n6 N = r6.N(i3);
        textView2.setBackground(d02);
        r6.k(textView2, d02, N, null, e6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, mf.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i3, int i10, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f14970b;
        imageView.setImageResource(i10);
        ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(9.0f), i3);
        int i11 = k6.ik;
        e6 e6Var = this.f14969a;
        if (i3 == k6.w0(i11, e6Var)) {
            r6.C(imageView, d02, r6.N(i11), e6Var);
        } else {
            imageView.setBackground(d02);
        }
        TextView textView = this.f14972e;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f14973f;
        FrameLayout.LayoutParams layoutParams = this.d;
        FrameLayout.LayoutParams layoutParams2 = this.f14971c;
        if (isEmpty) {
            layoutParams2.topMargin = org.telegram.messenger.g0.L(10.0f);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(10.0f);
            textView.setTypeface(null);
            textView.setTextSize(1, 16.0f);
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.gravity = 23;
            textView2.setVisibility(8);
            return;
        }
        layoutParams2.topMargin = org.telegram.messenger.g0.L(14.33f);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(10.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 15.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.66f);
        layoutParams.gravity = 55;
        textView2.setText(charSequence2);
        textView2.setVisibility(0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
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
