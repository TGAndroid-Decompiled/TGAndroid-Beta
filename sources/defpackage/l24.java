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
public final class l24 extends LinearLayout implements tjb {
    public final wjb a;
    public final FrameLayout[] b;
    public final be0[] c;
    public final FrameLayout[] d;
    public final FrameLayout[] e;
    public final float[] f;
    public final int[] h;
    public p8c n;
    public c4c r;
    public int s;
    public ValueAnimator w;
    public int x;
    public static final int[] y = {2131624292, 2131624290, 2131624291};
    public static final int[] E = {2131743746, 2131743747, 2131743743};

    public l24(Context context, wjb wjbVar) {
        super(context);
        int i = 3;
        this.b = new FrameLayout[3];
        this.c = new be0[3];
        this.d = new FrameLayout[3];
        this.e = new FrameLayout[3];
        this.f = new float[3];
        this.h = new int[3];
        int i2 = -1;
        this.s = -1;
        this.a = wjbVar;
        ?? r5 = 0;
        setOrientation(0);
        setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        setClipChildren(false);
        int i3 = 0;
        while (i3 < i) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r5);
            ote.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new v0(this, i3, (byte) 6));
            addView(frameLayout, nme.p(r5, i2, 1.0f, 119));
            this.b[i3] = frameLayout;
            be0 be0Var = new be0(context);
            be0Var.setImageDrawable(new oy8(y[i3], gl.L(160.0f), gl.L(160.0f)));
            frameLayout.addView(be0Var, nme.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.c[i3] = be0Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b = hve.b(context, 14.0f, bkb.y6, true, null);
            int[] iArr = E;
            b.setText(k96.M0(iArr[i3], null));
            b.setSingleLine();
            b.setPadding(gl.L(10.0f), r5, gl.L(10.0f), r5);
            frameLayout2.addView(b, nme.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(gl.L(10.0f), r5, gl.L(10.0f), r5);
            int L = gl.L(13.0f);
            int i4 = bkb.Ei;
            ShapeDrawable b0 = bkb.b0(L, bkb.v0(i4, wjbVar));
            vkb M = zkb.M(i4);
            frameLayout3.setBackground(b0);
            zkb.j(frameLayout3, b0, M, null, wjbVar);
            frameLayout2.addView(frameLayout3, nme.e(-2, 26, 17));
            TextView b2 = hve.b(context, 14.0f, bkb.f6, true, null);
            b2.setText(k96.M0(iArr[i3], null));
            b2.setSingleLine();
            frameLayout3.addView(b2, nme.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, nme.e(-2, 26, 49));
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
            int i2 = bkb.B6;
            wjb wjbVar = this.a;
            int f = bm2.f(this.f[i], bkb.v0(i2, wjbVar), bkb.v0(bkb.Ei, wjbVar));
            int[] iArr = this.h;
            if (f != iArr[i]) {
                iArr[i] = f;
                be0[] be0VarArr = this.c;
                be0VarArr[i].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
                be0VarArr[i].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.B6));
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
                    ug8.t(frameLayoutArr[i2].animate().scaleX(f2).scaleY(f2).alpha(f2), s33.h, 320L);
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
                ofFloat.addUpdateListener(new j24(this, (float[]) fArr.clone(), i, (byte) 0));
                this.w.addListener(new im2(this, (byte) 19));
                this.w.setInterpolator(s33.h);
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
            oy8 y2 = this.c[i].getImageReceiver().y();
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
        int max = Math.max(gl.L(48.0f), Math.min(gl.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - gl.L(8.0f)) / 0.61f)));
        if (max != this.x) {
            this.x = max;
            for (int i3 = 0; i3 < 3; i3++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c[i3].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i3].getLayoutParams()).topMargin = gl.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(66.0f) + max, 1073741824));
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
            fa4.g(e, true);
        }
    }
}
