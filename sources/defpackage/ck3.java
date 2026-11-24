package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
public final class ck3 extends LinearLayout {
    public float a;
    public Runnable b;
    public vs2 c;
    public boolean d;
    public ValueAnimator e;
    public final ry8 f;
    public final TextView h;
    public final ajb n;
    public int r;
    public int s;
    public final int w;

    public ck3(Context context) {
        super(context);
        this.r = -1;
        this.w = y6c.t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new jz1((byte) 6));
        ?? imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, nme.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new yj3(this, (byte) 0));
        TextView textView = new TextView(context);
        this.h = textView;
        tb4.w(textView, bkb.l9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, nme.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.n = viewSwitcher;
        viewSwitcher.setFactory(new zj3(context, (byte) 0));
        viewSwitcher.setInAnimation(context, 2130771980);
        viewSwitcher.setOutAnimation(context, 2130771981);
        addView((View) viewSwitcher, nme.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z) {
            String M0 = k96.M0(2131748037, null);
            if (gl.O1() && !gl.N1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(ls3.d);
        this.e.addUpdateListener(new ak3(this, (byte) 0));
        this.e.addListener(new bk3(this, (byte) 1));
        this.e.start();
    }

    public final void b() {
        int i;
        int i2 = 0;
        if ((getParent() instanceof View) && (((i = this.r) == 2 || i == 3 || i == 4) && ((View) getParent()).getPaddingTop() != 0)) {
            i2 = 0 - (getTop() / 2);
        }
        int i3 = this.r;
        if (i3 == 0 || i3 == 1) {
            i2 -= (int) ((1.0f - this.a) * (a.getCurrentActionBarHeight() / 2.0f));
        }
        float f = i2;
        this.f.setTranslationY(f);
        this.h.setTranslationY(f);
        this.n.setTranslationY(f);
    }

    @Override
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        b();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        int i3 = this.r;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= gl.m;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i2);
            }
            if (size2 == 0) {
                size2 = (gl.q.y - a.getCurrentActionBarHeight()) - gl.m;
            }
            if (getParent() instanceof rl0) {
                size2 -= ((rl0) getParent()).f3;
            }
            ArrayList arrayList = na7.q1(this.w).s;
            if (!arrayList.isEmpty()) {
                int L = gl.L(72.0f);
                size2 = ug8.B(50.0f, (arrayList.size() + (arrayList.size() * L)) - 1, size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size = (view2.getMeasuredHeight() - view2.getPaddingTop()) - view2.getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        if (size == 0) {
            size = (gl.q.y - a.getCurrentActionBarHeight()) - gl.m;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((gl.L(320.0f) - size) * this.a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(vs2 vs2Var) {
        this.c = vs2Var;
    }
}
