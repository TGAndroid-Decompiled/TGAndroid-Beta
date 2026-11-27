package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
public final class zc5 extends View implements snb {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public boolean E;
    public long F;
    public final int[] G;
    public final vnb H;
    public final boolean I;
    public final byte J;
    public boolean K;
    public int L;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Drawable e;
    public final RectF f;
    public final ImageReceiver h;
    public final StaticLayout n;
    public final rb0 r;
    public final iv2 s;
    public final int w;
    public final float x;
    public float y;

    public zc5(android.content.Context r24, java.lang.Object r25, defpackage.iv2 r26, boolean r27, defpackage.vnb r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc5.<init>(android.content.Context, java.lang.Object, iv2, boolean, vnb):void");
    }

    public final void a() {
        if (!this.E) {
            return;
        }
        this.E = false;
        this.F = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.F = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b = this.r.b();
        int i = aob.G6;
        vnb vnbVar = this.H;
        int p1 = aob.p1(0.05f, aob.v0(i, vnbVar));
        int v0 = aob.v0(aob.Ui, vnbVar);
        int red = Color.red(p1);
        int[] iArr = this.G;
        iArr[0] = red;
        iArr[1] = Color.red(b);
        iArr[2] = Color.green(p1);
        iArr[3] = Color.green(b);
        iArr[4] = Color.blue(p1);
        iArr[5] = Color.blue(b);
        iArr[6] = Color.alpha(p1);
        iArr[7] = Color.alpha(b);
        if (!this.K || v0 != this.L) {
            this.K = true;
            this.L = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(p1);
    }

    public iv2 getContact() {
        return this.s;
    }

    public String getCountryIso2() {
        return this.a;
    }

    public String getKey() {
        return this.c;
    }

    public long getUid() {
        return this.b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        float f3;
        int i4;
        float f4;
        int b;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z = this.E;
        float f9 = this.y;
        if (!z ? f9 != 0.0f : f9 != 1.0f) {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            boolean z2 = this.E;
            float f10 = this.y;
            float f11 = ((float) currentTimeMillis) / 120.0f;
            if (z2) {
                float f12 = f11 + f10;
                this.y = f12;
                if (f12 >= 1.0f) {
                    this.y = 1.0f;
                }
            } else {
                float f13 = f10 - f11;
                this.y = f13;
                if (f13 < 0.0f) {
                    this.y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z3 = this.I;
        if (z3) {
            f = 28.0f;
        } else {
            f = 32.0f;
        }
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, measuredWidth, hl.L(f));
        int[] iArr = this.G;
        int i5 = iArr[6];
        float f14 = this.y;
        int argb = Color.argb(i5 + ((int) ((iArr[7] - i5) * f14)), iArr[0] + ((int) ((iArr[1] - i) * f14)), iArr[2] + ((int) ((iArr[3] - i2) * f14)), iArr[4] + ((int) ((iArr[5] - i3) * f14)));
        Paint paint = N;
        paint.setColor(argb);
        float f15 = 14.0f;
        if (z3) {
            f2 = 14.0f;
        } else {
            f2 = 16.0f;
        }
        float L = hl.L(f2);
        if (z3) {
            f3 = 14.0f;
        } else {
            f3 = 16.0f;
        }
        canvas.drawRoundRect(rectF, L, hl.L(f3), paint);
        if (this.y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.y != 0.0f) {
            paint.setColor(this.r.b());
            paint.setAlpha((int) (this.y * 255.0f * (Color.alpha(b) / 255.0f)));
            if (z3) {
                f5 = 14.0f;
            } else {
                f5 = 16.0f;
            }
            float L2 = hl.L(f5);
            if (z3) {
                f6 = 14.0f;
            } else {
                f6 = 16.0f;
            }
            float L3 = hl.L(f6);
            if (!z3) {
                f15 = 16.0f;
            }
            canvas.drawCircle(L2, L3, hl.L(f15), paint);
            canvas.save();
            canvas.rotate((1.0f - this.y) * 45.0f, hl.L(16.0f), hl.L(16.0f));
            float f16 = 11.0f;
            if (z3) {
                f7 = 9.0f;
            } else {
                f7 = 11.0f;
            }
            int L4 = hl.L(f7);
            if (z3) {
                f16 = 9.0f;
            }
            int L5 = hl.L(f16);
            float f17 = 21.0f;
            if (z3) {
                f8 = 19.0f;
            } else {
                f8 = 21.0f;
            }
            int L6 = hl.L(f8);
            if (z3) {
                f17 = 19.0f;
            }
            int L7 = hl.L(f17);
            Drawable drawable = this.e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z3) {
            i4 = 26;
        } else {
            i4 = 32;
        }
        float L8 = this.x + hl.L(i4 + 9);
        if (z3) {
            f4 = 6.0f;
        } else {
            f4 = 8.0f;
        }
        canvas.translate(L8, hl.L(f4));
        int i6 = aob.Si;
        vnb vnbVar = this.H;
        M.setColor(vm2.f(this.y, aob.v0(i6, vnbVar), aob.v0(aob.J7, vnbVar)));
        this.n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), ob6.M0(2131751563, null)));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        boolean z = this.I;
        if (z) {
            i3 = 20;
        } else {
            i3 = 32;
        }
        int L = hl.L(i3 + 25) + this.w;
        if (z) {
            f = 28.0f;
        } else {
            f = 32.0f;
        }
        setMeasuredDimension(L, hl.L(f));
    }

    @Override
    public final void updateColors() {
        try {
            rb0 rb0Var = this.r;
            if (rb0Var != null) {
                byte b = this.J;
                vnb vnbVar = this.H;
                if (b == 1) {
                    rb0Var.g(aob.v0(aob.Hk, vnbVar));
                } else if (b == 2) {
                    rb0Var.h(aob.v0(aob.T7, vnbVar), aob.v0(aob.a8, vnbVar));
                } else if (b == 3) {
                    rb0Var.g(aob.p1(0.7f, aob.v0(aob.p7, vnbVar)));
                }
            }
            c();
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public zc5(Context context, Object obj) {
        this(context, obj, null, false, null);
    }
}
