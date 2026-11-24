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
public final class ija extends FrameLayout implements tjb {
    public final wjb a;
    public final hn b;
    public final hn c;
    public final hn d;
    public final ty0 e;
    public int f;
    public int h;
    public p8c n;
    public hja r;
    public CharSequence s;
    public float w;
    public float x;
    public ValueAnimator y;

    public ija(Context context, wjb wjbVar) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.x = -1.0f;
        this.a = wjbVar;
        hn hnVar = new hn(context, true, true, true);
        this.b = hnVar;
        s33 s33Var = s33.h;
        hnVar.b(0.3f, 220L, s33Var);
        hnVar.setTextSize(gl.L(13.0f));
        int i = bkb.x6;
        zkb.U(hnVar, i, wjbVar);
        hnVar.setGravity(3);
        hnVar.setEmojiCacheType(19);
        hnVar.setEmojiColor(-1);
        hnVar.setImportantForAccessibility(2);
        addView(hnVar, nme.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        hn hnVar2 = new hn(context, false, true, true);
        this.c = hnVar2;
        hnVar2.b(0.3f, 220L, s33Var);
        hnVar2.setTextSize(gl.L(13.0f));
        hnVar2.setGravity(17);
        zkb.U(hnVar2, bkb.H6, wjbVar);
        hnVar2.setEmojiColor(-1);
        hnVar2.setEmojiCacheType(19);
        hnVar2.setImportantForAccessibility(2);
        addView(hnVar2, nme.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        hn hnVar3 = new hn(context, true, true, true);
        this.d = hnVar3;
        hnVar3.b(0.3f, 220L, s33Var);
        hnVar3.setTextSize(gl.L(13.0f));
        hnVar3.setGravity(5);
        hnVar3.setTextColor(bkb.v0(i, wjbVar));
        hnVar3.setEmojiColor(-1);
        hnVar3.setEmojiCacheType(19);
        hnVar3.setImportantForAccessibility(2);
        addView(hnVar3, nme.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        ty0 ty0Var = new ty0(context, false, wjbVar, (byte) 2);
        this.e = ty0Var;
        ty0Var.setReportChanges(true);
        ty0Var.setDelegate(new ln8(this, (byte) 16));
        addView(ty0Var, nme.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        hja hjaVar = this.r;
        if (hjaVar.c != null) {
            int i3 = 1;
            while (true) {
                hja hjaVar2 = this.r;
                int[] iArr = hjaVar2.c;
                if (i3 < iArr.length) {
                    int i4 = iArr[i3 - 1];
                    int i5 = iArr[i3];
                    if (i >= i4 && i <= i5) {
                        return (1.0f / (iArr.length - 1)) * ((Math.round(((i - i4) / (i5 - i4)) * hjaVar2.d) / this.r.d) + i2);
                    }
                    i3++;
                } else {
                    hjaVar = hjaVar2;
                    break;
                }
            }
        }
        return Utilities.l((i - hjaVar.b()) / (this.r.a() - this.r.b()));
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

    public final void d(int i, hja hjaVar, p8c p8cVar) {
        this.f = i;
        this.r = hjaVar;
        this.n = p8cVar;
        this.e.e(false, b(i));
        e(i, false);
    }

    public final void e(int i, boolean z) {
        int i2;
        float f;
        hja hjaVar = this.r;
        if (hjaVar != null && hjaVar.e != null) {
            hn hnVar = this.b;
            hnVar.a();
            hn hnVar2 = this.d;
            hnVar2.a();
            hn hnVar3 = this.c;
            hnVar3.a();
            hnVar3.c((CharSequence) this.r.e.g(0, Integer.valueOf(i)), z, true);
            hnVar.c((CharSequence) this.r.e.g(-1, Integer.valueOf(this.r.b())), z, true);
            hnVar2.c((CharSequence) this.r.e.g(1, Integer.valueOf(this.r.a())), z, true);
            if (i >= this.r.a()) {
                i2 = bkb.H6;
            } else {
                i2 = bkb.x6;
            }
            hnVar2.c.v(bkb.v0(i2, this.a), z);
            hnVar2.invalidate();
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
                    ofFloat.addUpdateListener(new gja(this, (byte) 0));
                    this.y.addListener(new t7(this, f, (byte) 7));
                    this.y.setDuration(240L);
                    this.y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.w = f;
                colorMatrix.setSaturation(f);
                if (bkb.I.o()) {
                    gl.h(colorMatrix, (1.0f - this.w) * (-0.3f));
                }
                hnVar2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, gl.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - gl.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
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
        hn hnVar;
        int i;
        try {
            hja hjaVar = this.r;
            if (hjaVar != null && (hnVar = this.d) != null) {
                if (this.f >= hjaVar.a()) {
                    i = bkb.H6;
                } else {
                    i = bkb.x6;
                }
                hnVar.c.v(bkb.v0(i, this.a), false);
                hnVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
