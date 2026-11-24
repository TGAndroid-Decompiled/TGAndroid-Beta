package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.CheckBox;
public abstract class ssc extends FrameLayout implements vlb {
    public int a;
    public boolean b;
    public final rsc[] c;
    public byte d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public ssc(Context context, int i) {
        super(context);
        this.b = true;
        this.d = (byte) 3;
        this.c = new rsc[i];
        final int i2 = 0;
        while (true) {
            rsc[] rscVarArr = this.c;
            if (i2 < rscVarArr.length) {
                final rsc rscVar = new rsc(this, context);
                rscVarArr[i2] = rscVar;
                rscVar.setClipToOutline(true);
                addView(rscVar);
                rscVar.setOnClickListener(new wh(this, rscVar, i2, (byte) 21));
                rscVar.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        int i3 = i2;
                        return ssc.this.b(rscVar.h, i3);
                    }
                });
                i2++;
            } else {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = b10.d(context, 2131230881);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(cmb.w0(null, cmb.Bi, false));
                return;
            }
        }
    }

    public abstract void a(int i, Object obj);

    public boolean b(Object obj, int i) {
        return false;
    }

    public final void c(int i, boolean z, boolean z2) {
        float f;
        float f2;
        rsc rscVar = this.c[i];
        kc0 kc0Var = rscVar.a;
        CheckBox checkBox = rscVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z, z2);
        AnimatorSet animatorSet = rscVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            rscVar.f = null;
        }
        float f3 = 1.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            rscVar.f = animatorSet2;
            if (z) {
                f2 = 0.8875f;
            } else {
                f2 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kc0Var, "scaleX", f2);
            if (z) {
                f3 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(kc0Var, "scaleY", f3));
            rscVar.f.setDuration(200L);
            rscVar.f.addListener(new sw9((byte) 17, rscVar, z));
            rscVar.f.start();
        } else {
            if (z) {
                f = 0.8875f;
            } else {
                f = 1.0f;
            }
            kc0Var.setScaleX(f);
            if (z) {
                f3 = 0.8875f;
            }
            kc0Var.setScaleY(f3);
        }
        rscVar.invalidate();
    }

    public final void d(int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        this.d = i;
        this.e = z;
        this.f = z2;
        int i3 = 0;
        while (true) {
            rsc[] rscVarArr = this.c;
            if (i3 < rscVarArr.length) {
                zfc zfcVar = null;
                if ((!z && !z2) || (i3 != 0 && i3 != i - 1)) {
                    rscVarArr[i3].setOutlineProvider(null);
                    z5 = z;
                    z6 = z2;
                } else {
                    rsc rscVar = rscVarArr[i3];
                    int L = gm.L(16.0f);
                    if (i3 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i3 == i - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xj xjVar = agc.a;
                    if ((!z3 && !z4) || (!z && !z2)) {
                        z5 = z;
                        z6 = z2;
                    } else {
                        z5 = z;
                        z6 = z2;
                        zfcVar = new zfc(L, z3, z5, z4, z6);
                    }
                    rscVar.setOutlineProvider(zfcVar);
                }
                rsc rscVar2 = rscVarArr[i3];
                if (i3 < i) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                rscVar2.setVisibility(i2);
                rscVarArr[i3].clearAnimation();
                i3++;
                z = z5;
                z2 = z6;
            } else {
                return;
            }
        }
    }

    public final void e(Object obj, int i, int i2, Object obj2) {
        this.h = i;
        rsc[] rscVarArr = this.c;
        if (obj == null) {
            rscVarArr[i2].setVisibility(8);
            rscVarArr[i2].clearAnimation();
            return;
        }
        rscVarArr[i2].setVisibility(0);
        rscVarArr[i2].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i = 0; i < this.d; i++) {
            this.c[i].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.d == 1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int L = gm.L(12.0f);
        if (this.e) {
            i5 = gm.L(12.0f);
        } else {
            i5 = 0;
        }
        for (int i6 = 0; i6 < this.d; i6++) {
            rsc[] rscVarArr = this.c;
            int measuredWidth = rscVarArr[i6].getMeasuredWidth();
            rsc rscVar = rscVarArr[i6];
            rscVar.layout(L, i5, L + measuredWidth, rscVar.getMeasuredHeight() + i5);
            L = hg9.v(3.0f, measuredWidth, L);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        int i3;
        int i4;
        float f = 3.0f;
        int i5 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, 1073741824), wi8.E(3.0f, this.a, 1073741824));
            setPadding(0, 0, 0, gm.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int L2 = size - gm.L(aq1.h(this.d, 1, 3, 24));
        int i6 = L2 / this.d;
        boolean z = this.h;
        if (z && !z && !z) {
            L = i6;
        } else {
            L = gm.L(180.0f);
        }
        if (this.e) {
            i3 = gm.L(12.0f);
        } else {
            i3 = 0;
        }
        int i7 = i3 + L;
        if (this.f) {
            f = 12.0f;
        }
        setMeasuredDimension(size, gm.L(f) + i7);
        while (true) {
            byte b = this.d;
            if (i5 < b) {
                rsc rscVar = this.c[i5];
                if (i5 == b - 1) {
                    i4 = L2;
                } else {
                    i4 = i6;
                }
                rscVar.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                L2 -= i6;
                i5++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.s.setColor(cmb.w0(null, cmb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
