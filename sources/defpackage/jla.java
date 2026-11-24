package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public final class jla extends FrameLayout implements vlb {
    public final ylb a;
    public final io b;
    public final io c;
    public final io d;
    public final a01 e;
    public int f;
    public int h;
    public qac n;
    public ila r;
    public CharSequence s;
    public float w;
    public float x;
    public ValueAnimator y;

    public jla(Context context, ylb ylbVar) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.x = -1.0f;
        this.a = ylbVar;
        io ioVar = new io(context, true, true, true);
        this.b = ioVar;
        d53 d53Var = d53.h;
        ioVar.b(0.3f, 220L, d53Var);
        ioVar.setTextSize(gm.L(13.0f));
        int i = cmb.x6;
        anb.U(ioVar, i, ylbVar);
        ioVar.setGravity(3);
        ioVar.setEmojiCacheType(19);
        ioVar.setEmojiColor(-1);
        ioVar.setImportantForAccessibility(2);
        addView(ioVar, qoe.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        io ioVar2 = new io(context, false, true, true);
        this.c = ioVar2;
        ioVar2.b(0.3f, 220L, d53Var);
        ioVar2.setTextSize(gm.L(13.0f));
        ioVar2.setGravity(17);
        anb.U(ioVar2, cmb.H6, ylbVar);
        ioVar2.setEmojiColor(-1);
        ioVar2.setEmojiCacheType(19);
        ioVar2.setImportantForAccessibility(2);
        addView(ioVar2, qoe.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        io ioVar3 = new io(context, true, true, true);
        this.d = ioVar3;
        ioVar3.b(0.3f, 220L, d53Var);
        ioVar3.setTextSize(gm.L(13.0f));
        ioVar3.setGravity(5);
        ioVar3.setTextColor(cmb.v0(i, ylbVar));
        ioVar3.setEmojiColor(-1);
        ioVar3.setEmojiCacheType(19);
        ioVar3.setImportantForAccessibility(2);
        addView(ioVar3, qoe.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        a01 a01Var = new a01(context, false, ylbVar, (byte) 2);
        this.e = a01Var;
        a01Var.setReportChanges(true);
        a01Var.setDelegate(new cf9(this, (byte) 9));
        addView(a01Var, qoe.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i) {
        boolean z = false;
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 <= i) {
                i2++;
                if (i3 == i) {
                    z = true;
                }
            }
        }
        if (!z) {
            i2++;
        }
        if (i2 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 <= i) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        if (!z) {
            iArr2[i4] = i;
        }
        return iArr2;
    }

    public final float b(int i) {
        int i2;
        ila ilaVar = this.r;
        if (ilaVar.c != null) {
            int i3 = 1;
            while (true) {
                ila ilaVar2 = this.r;
                int[] iArr = ilaVar2.c;
                if (i3 < iArr.length) {
                    int i4 = iArr[i3 - 1];
                    int i5 = iArr[i3];
                    if (i >= i4 && i <= i5) {
                        return (1.0f / (iArr.length - 1)) * ((Math.round(((i - i4) / (i5 - i4)) * ilaVar2.d) / this.r.d) + i2);
                    }
                    i3++;
                } else {
                    ilaVar = ilaVar2;
                    break;
                }
            }
        }
        return Utilities.l((i - ilaVar.b()) / (this.r.a() - this.r.b()));
    }

    public final int c(int i) {
        if (this.r.c != null) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = i2 - 1;
                int i4 = iArr[i3];
                int i5 = iArr[i2];
                if (i >= i4 && i <= i5) {
                    return i3;
                }
                i2++;
            }
        }
        return i;
    }

    public final void d(int i, ila ilaVar, qac qacVar) {
        this.f = i;
        this.r = ilaVar;
        this.n = qacVar;
        this.e.e(false, b(i));
        e(i, false);
    }

    public final void e(int i, boolean z) {
        int i2;
        float f;
        ila ilaVar = this.r;
        if (ilaVar != null && ilaVar.e != null) {
            io ioVar = this.b;
            ioVar.a();
            io ioVar2 = this.d;
            ioVar2.a();
            io ioVar3 = this.c;
            ioVar3.a();
            ioVar3.c((CharSequence) this.r.e.j(0, Integer.valueOf(i)), z, true);
            ioVar.c((CharSequence) this.r.e.j(-1, Integer.valueOf(this.r.b())), z, true);
            ioVar2.c((CharSequence) this.r.e.j(1, Integer.valueOf(this.r.a())), z, true);
            if (i >= this.r.a()) {
                i2 = cmb.H6;
            } else {
                i2 = cmb.x6;
            }
            ioVar2.c.v(cmb.v0(i2, this.a), z);
            ioVar2.invalidate();
            if (i >= this.r.a()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (Math.abs(this.x - f) >= 0.01f) {
                ValueAnimator valueAnimator = this.y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.y = null;
                }
                this.x = f;
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, f);
                    this.y = ofFloat;
                    ofFloat.addUpdateListener(new rha(this, (byte) 2));
                    this.y.addListener(new t7(this, f, (byte) 7));
                    this.y.setDuration(240L);
                    this.y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.w = f;
                colorMatrix.setSaturation(f);
                if (cmb.I.o()) {
                    gm.h(colorMatrix, (1.0f - this.w) * (-0.3f));
                }
                ioVar2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, gm.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - gm.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setMinValueAllowed(int i) {
        this.h = i;
        if (this.f < i) {
            this.f = i;
        }
        if (this.r == null) {
            return;
        }
        this.e.setMinProgress(b(i));
        e(this.f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        io ioVar;
        int i;
        try {
            ila ilaVar = this.r;
            if (ilaVar != null && (ioVar = this.d) != null) {
                if (this.f >= ilaVar.a()) {
                    i = cmb.H6;
                } else {
                    i = cmb.x6;
                }
                ioVar.c.v(cmb.v0(i, this.a), false);
                ioVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
