package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class w34 extends LinearLayout implements vlb {
    public final ylb a;
    public final FrameLayout[] b;
    public final bf0[] c;
    public final FrameLayout[] d;
    public final FrameLayout[] e;
    public final float[] f;
    public final int[] h;
    public qac n;
    public c6c r;
    public int s;
    public ValueAnimator w;
    public int x;
    public static final int[] y = {2131624293, 2131624291, 2131624292};
    public static final int[] E = {2131743672, 2131743673, 2131743669};

    public w34(Context context, ylb ylbVar) {
        super(context);
        int i = 3;
        this.b = new FrameLayout[3];
        this.c = new bf0[3];
        this.d = new FrameLayout[3];
        this.e = new FrameLayout[3];
        this.f = new float[3];
        this.h = new int[3];
        int i2 = -1;
        this.s = -1;
        this.a = ylbVar;
        ?? r5 = 0;
        setOrientation(0);
        setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        setClipChildren(false);
        int i3 = 0;
        while (i3 < i) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r5);
            rve.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new v0(this, i3, (byte) 6));
            addView(frameLayout, qoe.p(r5, i2, 1.0f, 119));
            this.b[i3] = frameLayout;
            bf0 bf0Var = new bf0(context);
            bf0Var.setImageDrawable(new p09(y[i3], gm.L(160.0f), gm.L(160.0f)));
            frameLayout.addView(bf0Var, qoe.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.c[i3] = bf0Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b = jxe.b(context, 14.0f, cmb.y6, true, null);
            int[] iArr = E;
            b.setText(jb6.M0(iArr[i3], null));
            b.setSingleLine();
            b.setPadding(gm.L(10.0f), r5, gm.L(10.0f), r5);
            frameLayout2.addView(b, qoe.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(gm.L(10.0f), r5, gm.L(10.0f), r5);
            int L = gm.L(13.0f);
            int i4 = cmb.Ei;
            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i4, ylbVar));
            wmb M = anb.M(i4);
            frameLayout3.setBackground(b0);
            anb.j(frameLayout3, b0, M, null, ylbVar);
            frameLayout2.addView(frameLayout3, qoe.e(-2, 26, 17));
            TextView b2 = jxe.b(context, 14.0f, cmb.f6, true, null);
            b2.setText(jb6.M0(iArr[i3], null));
            b2.setSingleLine();
            frameLayout3.addView(b2, qoe.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, qoe.e(-2, 26, 49));
            this.d[i3] = frameLayout2;
            this.e[i3] = frameLayout3;
            i3++;
            i = 3;
            i2 = -1;
            r5 = 0;
        }
        boolean z = r5;
        b(z ? 1 : 0, z);
    }

    public final void a() {
        for (int i = 0; i < 3; i++) {
            int i2 = cmb.B6;
            ylb ylbVar = this.a;
            int f = on2.f(this.f[i], cmb.v0(i2, ylbVar), cmb.v0(cmb.Ei, ylbVar));
            int[] iArr = this.h;
            if (f != iArr[i]) {
                iArr[i] = f;
                bf0[] bf0VarArr = this.c;
                bf0VarArr[i].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
                bf0VarArr[i].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.B6));
    }

    public final void b(int i, boolean z) {
        float f;
        if (this.s != i) {
            this.s = i;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            int i2 = 0;
            while (true) {
                float f2 = 1.0f;
                if (i2 >= 3) {
                    break;
                }
                if (i2 != i) {
                    f2 = 0.0f;
                }
                FrameLayout[] frameLayoutArr = this.e;
                if (z) {
                    wi8.t(frameLayoutArr[i2].animate().scaleX(f2).scaleY(f2).alpha(f2), d53.h, 320L);
                } else {
                    frameLayoutArr[i2].animate().cancel();
                    frameLayoutArr[i2].setScaleX(f2);
                    frameLayoutArr[i2].setScaleY(f2);
                    frameLayoutArr[i2].setAlpha(f2);
                }
                i2++;
            }
            float[] fArr = this.f;
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new u34(this, (float[]) fArr.clone(), i, (byte) 0));
                this.w.addListener(new kh2(this, (byte) 21));
                this.w.setInterpolator(d53.h);
                this.w.setDuration(320L);
                this.w.start();
            } else {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 == i) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    fArr[i3] = f;
                }
                a();
            }
            p09 y2 = this.c[i].getImageReceiver().y();
            if (y2 != null) {
                if (y2.o() > 0.8f) {
                    y2.O(false, 0.0f);
                }
                y2.C(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int max = Math.max(gm.L(48.0f), Math.min(gm.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - gm.L(8.0f)) / 0.61f)));
        if (max != this.x) {
            this.x = max;
            for (int i3 = 0; i3 < 3; i3++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c[i3].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i3].getLayoutParams()).topMargin = gm.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(66.0f) + max, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
