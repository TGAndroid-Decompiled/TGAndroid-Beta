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
public final class ke2 extends FrameLayout implements tjb {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final wjb d;
    public int e;

    public ke2(Context context, wjb wjbVar) {
        super(context);
        int i;
        this.d = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(2131232449);
        Drawable background = frameLayout.getBackground();
        int i2 = bkb.wf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(frameLayout, background, i2, wjbVar, mode);
        addView(frameLayout, nme.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(2131231246);
        imageView.setColorFilter(new PorterDuffColorFilter(a(bkb.uf), mode));
        imageView.setPadding(0, gl.L(2.0f), 0, 0);
        frameLayout.addView(imageView, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, gl.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (bkb.g1(wjbVar)) {
            i = bkb.Ea;
        } else {
            i = bkb.vf;
        }
        zkb.X(textView, i, wjbVar);
        textView.setTypeface(gl.o());
        addView(textView, nme.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (bkb.g1(wjbVar)) {
            int i3 = bkb.Da;
            zkb.B(frameLayout, bkb.b0(0, a(i3)), zkb.M(i3), wjbVar);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i) {
        Integer num;
        wjb wjbVar = this.d;
        if (wjbVar != null) {
            num = Integer.valueOf(wjbVar.h(i));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return bkb.w0(null, i, false);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a = a(bkb.uf);
            ImageView imageView = this.b;
            if (imageView != null && a != this.e) {
                this.e = a;
                imageView.setColorFilter(new PorterDuffColorFilter(a, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
