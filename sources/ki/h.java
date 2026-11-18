package ki;

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
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
public final class h extends FrameLayout {
    public final i6 f18703a;
    public final ImageView f18704b;
    public final FrameLayout.LayoutParams f18705c;
    public final FrameLayout.LayoutParams d;
    public final TextView f18706e;
    public final TextView f18707f;
    public final TextView h;

    public h(Context context, i6 i6Var) {
        super(context);
        this.f18703a = i6Var;
        ImageView imageView = new ImageView(context);
        this.f18704b = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = ma.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f18705c = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d2 = ma.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.d = d2;
        addView(linearLayout, d2);
        TextView textView = new TextView(context);
        this.f18706e = textView;
        n10.p(textView, 1, 15.0f);
        u6.U(textView, n6.G6, i6Var);
        TextView f10 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f18707f = f10;
        f10.setTextSize(1, 14.0f);
        u6.U(f10, n6.f29807z6, i6Var);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        u6.s(imageView2, n6.M6, i6Var, mode);
        imageView2.setImageResource(2131232061);
        imageView2.setScaleType(scaleType);
        addView(imageView2, ma.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        int L = org.telegram.messenger.g0.L(4.0f);
        int i7 = n6.lk;
        ShapeDrawable d02 = n6.d0(L, n6.w0(i7, i6Var));
        q6 M = u6.M(i7);
        textView2.setBackground(d02);
        u6.j(textView2, d02, M, null, i6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, ma.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i7, int i10, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f18704b;
        imageView.setImageResource(i10);
        ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(9.0f), i7);
        int i11 = n6.lk;
        i6 i6Var = this.f18703a;
        if (i7 == n6.w0(i11, i6Var)) {
            u6.B(imageView, d02, u6.M(i11), i6Var);
        } else {
            imageView.setBackground(d02);
        }
        TextView textView = this.f18706e;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f18707f;
        FrameLayout.LayoutParams layoutParams = this.d;
        FrameLayout.LayoutParams layoutParams2 = this.f18705c;
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
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
