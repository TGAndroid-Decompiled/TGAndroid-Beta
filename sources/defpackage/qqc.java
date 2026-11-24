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
public abstract class qqc extends FrameLayout implements tjb {
    public int a;
    public boolean b;
    public final pqc[] c;
    public byte d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public qqc(Context context, int i) {
        super(context);
        this.b = true;
        this.d = (byte) 3;
        this.c = new pqc[i];
        final int i2 = 0;
        while (true) {
            pqc[] pqcVarArr = this.c;
            if (i2 < pqcVarArr.length) {
                final pqc pqcVar = new pqc(this, context);
                pqcVarArr[i2] = pqcVar;
                pqcVar.setClipToOutline(true);
                addView(pqcVar);
                pqcVar.setOnClickListener(new wg(this, pqcVar, i2, (byte) 21));
                pqcVar.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        int i3 = i2;
                        return qqc.this.b(pqcVar.h, i3);
                    }
                });
                i2++;
            } else {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = b00.d(context, 2131230880);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(bkb.w0(null, bkb.Bi, false));
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
        pqc pqcVar = this.c[i];
        kb0 kb0Var = pqcVar.a;
        CheckBox checkBox = pqcVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z, z2);
        AnimatorSet animatorSet = pqcVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            pqcVar.f = null;
        }
        float f3 = 1.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            pqcVar.f = animatorSet2;
            if (z) {
                f2 = 0.8875f;
            } else {
                f2 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kb0Var, "scaleX", f2);
            if (z) {
                f3 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(kb0Var, "scaleY", f3));
            pqcVar.f.setDuration(200L);
            pqcVar.f.addListener(new pu9((byte) 17, pqcVar, z));
            pqcVar.f.start();
        } else {
            if (z) {
                f = 0.8875f;
            } else {
                f = 1.0f;
            }
            kb0Var.setScaleX(f);
            if (z) {
                f3 = 0.8875f;
            }
            kb0Var.setScaleY(f3);
        }
        pqcVar.invalidate();
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
            pqc[] pqcVarArr = this.c;
            if (i3 < pqcVarArr.length) {
                ydc ydcVar = null;
                if ((!z && !z2) || (i3 != 0 && i3 != i - 1)) {
                    pqcVarArr[i3].setOutlineProvider(null);
                    z5 = z;
                    z6 = z2;
                } else {
                    pqc pqcVar = pqcVarArr[i3];
                    int L = gl.L(16.0f);
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
                    xi xiVar = zdc.a;
                    if ((!z3 && !z4) || (!z && !z2)) {
                        z5 = z;
                        z6 = z2;
                    } else {
                        z5 = z;
                        z6 = z2;
                        ydcVar = new ydc(L, z3, z5, z4, z6);
                    }
                    pqcVar.setOutlineProvider(ydcVar);
                }
                pqc pqcVar2 = pqcVarArr[i3];
                if (i3 < i) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                pqcVar2.setVisibility(i2);
                pqcVarArr[i3].clearAnimation();
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
        pqc[] pqcVarArr = this.c;
        if (obj == null) {
            pqcVarArr[i2].setVisibility(8);
            pqcVarArr[i2].clearAnimation();
            return;
        }
        pqcVarArr[i2].setVisibility(0);
        pqcVarArr[i2].a(obj, obj2);
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
        int L = gl.L(12.0f);
        if (this.e) {
            i5 = gl.L(12.0f);
        } else {
            i5 = 0;
        }
        for (int i6 = 0; i6 < this.d; i6++) {
            pqc[] pqcVarArr = this.c;
            int measuredWidth = pqcVarArr[i6].getMeasuredWidth();
            pqc pqcVar = pqcVarArr[i6];
            pqcVar.layout(L, i5, L + measuredWidth, pqcVar.getMeasuredHeight() + i5);
            L = de9.w(3.0f, measuredWidth, L);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, 1073741824), ug8.E(3.0f, this.a, 1073741824));
            setPadding(0, 0, 0, gl.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int L2 = size - gl.L(oo1.h(this.d, 1, 3, 24));
        int i6 = L2 / this.d;
        boolean z = this.h;
        if (z && !z && !z) {
            L = i6;
        } else {
            L = gl.L(180.0f);
        }
        if (this.e) {
            i3 = gl.L(12.0f);
        } else {
            i3 = 0;
        }
        int i7 = i3 + L;
        if (this.f) {
            f = 12.0f;
        }
        setMeasuredDimension(size, gl.L(f) + i7);
        while (true) {
            byte b = this.d;
            if (i5 < b) {
                pqc pqcVar = this.c[i5];
                if (i5 == b - 1) {
                    i4 = L2;
                } else {
                    i4 = i6;
                }
                pqcVar.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
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
            this.s.setColor(bkb.w0(null, bkb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
