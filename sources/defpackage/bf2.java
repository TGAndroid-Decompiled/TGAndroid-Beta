package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class bf2 extends FrameLayout implements snb {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final vnb d;
    public int e;

    public bf2(Context context, vnb vnbVar) {
        super(context);
        int i;
        this.d = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(2131232449);
        Drawable background = frameLayout.getBackground();
        int i2 = aob.xf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(frameLayout, background, i2, vnbVar, mode);
        addView(frameLayout, tre.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(2131231246);
        imageView.setColorFilter(new PorterDuffColorFilter(a(aob.vf), mode));
        imageView.setPadding(0, hl.L(2.0f), 0, 0);
        frameLayout.addView(imageView, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, hl.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (aob.g1(vnbVar)) {
            i = aob.Fa;
        } else {
            i = aob.wf;
        }
        yob.X(textView, i, vnbVar);
        textView.setTypeface(hl.o());
        addView(textView, tre.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (aob.g1(vnbVar)) {
            int i3 = aob.Ea;
            yob.B(frameLayout, aob.b0(0, a(i3)), yob.M(i3), vnbVar);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i) {
        Integer num;
        vnb vnbVar = this.d;
        if (vnbVar != null) {
            num = Integer.valueOf(vnbVar.h(i));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return aob.w0(null, i, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.c;
    }

    public ImageView getImageView() {
        return this.b;
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a = a(aob.vf);
            ImageView imageView = this.b;
            if (imageView != null && a != this.e) {
                this.e = a;
                imageView.setColorFilter(new PorterDuffColorFilter(a, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
