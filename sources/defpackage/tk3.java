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
public final class tk3 extends LinearLayout {
    public float a;
    public Runnable b;
    public pt2 c;
    public boolean d;
    public ValueAnimator e;
    public final e29 f;
    public final TextView h;
    public final wmb n;
    public int r;
    public int s;
    public final int w;

    public tk3(Context context) {
        super(context);
        this.r = -1;
        this.w = yac.t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new b02((byte) 6));
        ?? imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, tre.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new mh3(this, (byte) 2));
        TextView textView = new TextView(context);
        this.h = textView;
        qd4.w(textView, aob.m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.n = viewSwitcher;
        viewSwitcher.setFactory(new qk3(context, (byte) 0));
        viewSwitcher.setInAnimation(context, 2130771980);
        viewSwitcher.setOutAnimation(context, 2130771981);
        addView((View) viewSwitcher, tre.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z) {
            String M0 = ob6.M0(2131747960, null);
            if (hl.O1() && !hl.N1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(dt3.d);
        this.e.addUpdateListener(new rk3(this, (byte) 0));
        this.e.addListener(new sk3(this, (byte) 1));
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= hl.m;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i2);
            }
            if (size2 == 0) {
                size2 = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
            }
            if (getParent() instanceof sl0) {
                size2 -= ((sl0) getParent()).f3;
            }
            ArrayList arrayList = uc7.s1(this.w).s;
            if (!arrayList.isEmpty()) {
                int L = hl.L(72.0f);
                size2 = ik8.B(50.0f, (arrayList.size() + (arrayList.size() * L)) - 1, size2);
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
            size = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((hl.L(320.0f) - size) * this.a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(pt2 pt2Var) {
        this.c = pt2Var;
    }
}
