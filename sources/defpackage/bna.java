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
public final class bna extends FrameLayout implements snb {
    public final vnb a;
    public final in b;
    public final in c;
    public final in d;
    public final bz0 e;
    public int f;
    public int h;
    public pcc n;
    public ana r;
    public CharSequence s;
    public float w;
    public float x;
    public ValueAnimator y;

    public bna(Context context, vnb vnbVar) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.x = -1.0f;
        this.a = vnbVar;
        in inVar = new in(context, true, true, true);
        this.b = inVar;
        k43 k43Var = k43.h;
        inVar.b(0.3f, 220L, k43Var);
        inVar.setTextSize(hl.L(13.0f));
        int i = aob.y6;
        yob.U(inVar, i, vnbVar);
        inVar.setGravity(3);
        inVar.setEmojiCacheType(19);
        inVar.setEmojiColor(-1);
        inVar.setImportantForAccessibility(2);
        addView(inVar, tre.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        in inVar2 = new in(context, false, true, true);
        this.c = inVar2;
        inVar2.b(0.3f, 220L, k43Var);
        inVar2.setTextSize(hl.L(13.0f));
        inVar2.setGravity(17);
        yob.U(inVar2, aob.I6, vnbVar);
        inVar2.setEmojiColor(-1);
        inVar2.setEmojiCacheType(19);
        inVar2.setImportantForAccessibility(2);
        addView(inVar2, tre.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        in inVar3 = new in(context, true, true, true);
        this.d = inVar3;
        inVar3.b(0.3f, 220L, k43Var);
        inVar3.setTextSize(hl.L(13.0f));
        inVar3.setGravity(5);
        inVar3.setTextColor(aob.v0(i, vnbVar));
        inVar3.setEmojiColor(-1);
        inVar3.setEmojiCacheType(19);
        inVar3.setImportantForAccessibility(2);
        addView(inVar3, tre.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        bz0 bz0Var = new bz0(context, false, vnbVar, (byte) 2);
        this.e = bz0Var;
        bz0Var.setReportChanges(true);
        bz0Var.setDelegate(new j09(this, (byte) 14));
        addView(bz0Var, tre.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        ana anaVar = this.r;
        if (anaVar.c != null) {
            int i3 = 1;
            while (true) {
                ana anaVar2 = this.r;
                int[] iArr = anaVar2.c;
                if (i3 < iArr.length) {
                    int i4 = iArr[i3 - 1];
                    int i5 = iArr[i3];
                    if (i >= i4 && i <= i5) {
                        return (1.0f / (iArr.length - 1)) * ((Math.round(((i - i4) / (i5 - i4)) * anaVar2.d) / this.r.d) + i2);
                    }
                    i3++;
                } else {
                    anaVar = anaVar2;
                    break;
                }
            }
        }
        return Utilities.l((i - anaVar.b()) / (this.r.a() - this.r.b()));
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

    public final void d(int i, ana anaVar, pcc pccVar) {
        this.f = i;
        this.r = anaVar;
        this.n = pccVar;
        this.e.e(false, b(i));
        e(i, false);
    }

    public final void e(int i, boolean z) {
        int i2;
        float f;
        ana anaVar = this.r;
        if (anaVar != null && anaVar.e != null) {
            in inVar = this.b;
            inVar.a();
            in inVar2 = this.d;
            inVar2.a();
            in inVar3 = this.c;
            inVar3.a();
            inVar3.c((CharSequence) this.r.e.g(0, Integer.valueOf(i)), z, true);
            inVar.c((CharSequence) this.r.e.g(-1, Integer.valueOf(this.r.b())), z, true);
            inVar2.c((CharSequence) this.r.e.g(1, Integer.valueOf(this.r.a())), z, true);
            if (i >= this.r.a()) {
                i2 = aob.I6;
            } else {
                i2 = aob.y6;
            }
            inVar2.c.v(aob.v0(i2, this.a), z);
            inVar2.invalidate();
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
                    ofFloat.addUpdateListener(new ija(this, (byte) 2));
                    this.y.addListener(new u7(this, f, (byte) 7));
                    this.y.setDuration(240L);
                    this.y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.w = f;
                colorMatrix.setSaturation(f);
                if (aob.I.o()) {
                    hl.h(colorMatrix, (1.0f - this.w) * (-0.3f));
                }
                inVar2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, hl.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - hl.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
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
        in inVar;
        int i;
        try {
            ana anaVar = this.r;
            if (anaVar != null && (inVar = this.d) != null) {
                if (this.f >= anaVar.a()) {
                    i = aob.I6;
                } else {
                    i = aob.y6;
                }
                inVar.c.v(aob.v0(i, this.a), false);
                inVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
