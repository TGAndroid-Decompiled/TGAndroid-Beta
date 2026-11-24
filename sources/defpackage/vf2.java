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
public final class vf2 extends FrameLayout implements vlb {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final ylb d;
    public int e;

    public vf2(Context context, ylb ylbVar) {
        super(context);
        int i;
        this.d = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(2131232450);
        Drawable background = frameLayout.getBackground();
        int i2 = cmb.wf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(frameLayout, background, i2, ylbVar, mode);
        addView(frameLayout, qoe.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(2131231247);
        imageView.setColorFilter(new PorterDuffColorFilter(a(cmb.uf), mode));
        imageView.setPadding(0, gm.L(2.0f), 0, 0);
        frameLayout.addView(imageView, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, gm.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (cmb.g1(ylbVar)) {
            i = cmb.Ea;
        } else {
            i = cmb.vf;
        }
        anb.X(textView, i, ylbVar);
        textView.setTypeface(gm.o());
        addView(textView, qoe.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (cmb.g1(ylbVar)) {
            int i3 = cmb.Da;
            anb.B(frameLayout, cmb.b0(0, a(i3)), anb.M(i3), ylbVar);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i) {
        Integer num;
        ylb ylbVar = this.d;
        if (ylbVar != null) {
            num = Integer.valueOf(ylbVar.h(i));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return cmb.w0(null, i, false);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a = a(cmb.uf);
            ImageView imageView = this.b;
            if (imageView != null && a != this.e) {
                this.e = a;
                imageView.setColorFilter(new PorterDuffColorFilter(a, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
