package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.tv0;

public final class z7 extends View implements s9 {
    public int A;
    public int B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final a8 F;

    public final PorterDuffColorFilter f14192a;

    public boolean f14193b;

    public final TextPaint f14194c;
    public final TextPaint d;

    public final Paint f14195e;

    public final Paint f14196f;
    public float h;

    public float f14197n;

    public final y7[] f14198r;

    public int f14199s;
    public StaticLayout v;

    public float f14200w;

    public boolean f14201x;

    public final boolean f14202y;

    public z7(a8 a8Var, Context context) {
        super(context);
        this.F = a8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f14194c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f14195e = paint;
        Paint paint2 = new Paint(1);
        this.f14196f = paint2;
        this.f14198r = new y7[]{new y7(this), null};
        this.f14199s = 0;
        new Path();
        this.f14202y = true;
        this.D = false;
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f14192a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(z7 z7Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignmentA;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignmentA = tv0.a();
        } else {
            Layout.Alignment[] alignmentArr = tv0.f32901a;
            alignmentA = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignmentA).build();
    }

    public final void b(CharSequence charSequence, v7 v7Var, v7 v7Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        y7[] y7VarArr = this.f14198r;
        if (MediaDataController.stringsEqual(y7VarArr[0].f14167n, charSequence)) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.f14168o == v7Var && y7Var.f14169p == v7Var2) {
                y7Var.f14170q = z10;
                invalidate();
                return;
            }
        }
        this.f14201x = false;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = false;
        if (!z11) {
            y7VarArr[0].g(charSequence, v7Var, v7Var2);
            y7VarArr[0].f14170q = z10;
            invalidate();
            this.C = 0.0f;
            return;
        }
        if (y7VarArr[1] == null) {
            y7VarArr[1] = new y7(this);
        }
        y7 y7Var2 = y7VarArr[1];
        y7 y7Var3 = y7VarArr[0];
        y7Var2.g(y7Var3.f14167n, y7Var3.f14168o, y7Var3.f14169p);
        y7 y7Var4 = y7VarArr[1];
        y7 y7Var5 = y7VarArr[0];
        y7Var4.f14170q = y7Var5.f14170q;
        y7Var4.f14171r.d(y7Var5.f14171r.f34812c, true);
        y7VarArr[0].g(charSequence, v7Var, v7Var2);
        y7 y7Var6 = y7VarArr[0];
        y7Var6.f14170q = z10;
        y7Var6.f14171r.d(0.0f, true);
        this.C = 1.0f;
        ValueAnimator valueAnimator2 = this.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.D = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.C, 0.0f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 26));
        this.E.addListener(new ag.r1(this, 21));
        this.E.setDuration(180L);
        this.E.setInterpolator(er.f28123g);
        this.E.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ?? r13;
        boolean zContains;
        int iDp;
        boolean z11;
        boolean z12;
        y7 y7Var;
        y7 y7Var2;
        ?? r14;
        v7 v7Var;
        boolean z13;
        a8 a8Var = this.F;
        t9 t9Var = a8Var.S;
        if (motionEvent.getAction() == 0) {
            a8Var.f13048c0 = motionEvent.getX();
            a8Var.f13049d0 = motionEvent.getY();
        }
        a8Var.f13050e0 = motionEvent.getX();
        a8Var.f13051f0 = motionEvent.getY();
        StaticLayout staticLayout = this.v;
        if (staticLayout != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = this.f14197n;
            rectF.set(f10, this.h, staticLayout.getWidth() + f10, this.h + this.v.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        y7[] y7VarArr = this.f14198r;
        y7 y7Var3 = y7VarArr[0];
        if (y7Var3 == null || (v7Var = y7Var3.f14168o) == null) {
            r13 = 0;
            zContains = false;
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(8.0f) + v7Var.b();
            RectF rectF2 = AndroidUtilities.rectTmp;
            int i10 = this.A;
            int i11 = this.B;
            v7 v7Var2 = y7VarArr[0].f14168o;
            rectF2.set(i10, i11, i10 + v7Var2.f14078x, v7Var2.b() + i11);
            zContains = rectF2.contains(motionEvent.getX(), motionEvent.getY());
            if (zContains) {
                z10 = false;
            }
            if (motionEvent.getAction() == 0 && zContains) {
                y7VarArr[0].f14168o.e(motionEvent.getX(), motionEvent.getY(), true);
            } else if (motionEvent.getAction() == 2) {
                v7 v7Var3 = y7VarArr[0].f14168o;
                if (v7Var3.f14064i.h && !zContains) {
                    r13 = 0;
                    v7Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && zContains) {
                    z13 = false;
                    z13 = false;
                    v7 v7Var4 = y7VarArr[0].f14168o;
                    if (v7Var4.f14064i.h) {
                        a8Var.I(v7Var4);
                    }
                } else {
                    z13 = false;
                }
                y7VarArr[z13 ? 1 : 0].f14168o.e(motionEvent.getX(), motionEvent.getY(), z13);
                r13 = z13;
            }
            r13 = 0;
        }
        if (!zContains && (y7Var2 = y7VarArr[r13]) != null && y7Var2.f14169p != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float f11 = this.A;
            float fLerp = (AndroidUtilities.lerp(y7Var2.f14166m, y7Var2.f14165l, this.f14200w) + this.B) - y7VarArr[0].f14169p.b();
            int i12 = this.A;
            y7 y7Var4 = y7VarArr[0];
            rectF3.set(f11, fLerp, i12 + y7Var4.f14169p.f14078x, AndroidUtilities.lerp(y7Var4.f14166m, y7Var4.f14165l, this.f14200w) + this.B);
            boolean zContains2 = rectF3.contains(motionEvent.getX(), motionEvent.getY());
            if (zContains2) {
                z10 = false;
            }
            if (motionEvent.getAction() == 0 && zContains2) {
                y7VarArr[0].f14169p.e(motionEvent.getX(), motionEvent.getY(), true);
            } else if (motionEvent.getAction() == 2) {
                v7 v7Var5 = y7VarArr[0].f14169p;
                if (v7Var5.f14064i.h && !zContains2) {
                    v7Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && zContains2) {
                    r14 = 0;
                    r14 = 0;
                    v7 v7Var6 = y7VarArr[0].f14169p;
                    if (v7Var6.f14064i.h) {
                        a8Var.I(v7Var6);
                    }
                } else {
                    r14 = 0;
                }
                y7VarArr[r14].f14169p.e(motionEvent.getX(), motionEvent.getY(), r14);
            }
            if (zContains2) {
                return true;
            }
        }
        if (z10 && (a8Var.f13062r0 || (y7Var = y7VarArr[0]) == null || y7Var.f14161g == null)) {
            float f12 = this.A;
            float f13 = this.B + iDp;
            Rect rect = t9Var.B;
            s9 s9Var = t9Var.f25685u0;
            Layout staticTextLayout = s9Var.getStaticTextLayout();
            if (staticTextLayout == null) {
                rect.setEmpty();
                t9Var.X = null;
            } else {
                t9Var.X = s9Var;
                int i13 = (int) f12;
                t9Var.f25862c = i13;
                int i14 = (int) f13;
                t9Var.d = i14;
                org.telegram.ui.Cells.m9 m9Var = t9Var.f25859a0;
                m9Var.f24688b = staticTextLayout;
                m9Var.d = f12;
                m9Var.f24689c = f13;
                m9Var.f24687a = 0;
                rect.set(i13, i14, (int) (f12 + staticTextLayout.getWidth()), (int) (f13 + staticTextLayout.getHeight()));
            }
            t9Var.N(motionEvent);
        }
        if (!t9Var.y() && z10 && this.f14202y) {
            z12 = false;
            if (((GestureDetector) y7VarArr[0].f14164k.f5555a.f17823b).onTouchEvent(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                t9Var.f(false);
                return true;
            }
            z11 = true;
        } else {
            z11 = true;
            z12 = false;
        }
        return (super.dispatchTouchEvent(motionEvent) || zContains) ? z11 : z12;
    }

    public float getAnimatedHeight() {
        int i10 = this.B * 2;
        y7[] y7VarArr = this.f14198r;
        int i11 = y7VarArr[0].f14165l;
        y7 y7Var = y7VarArr[1];
        return AndroidUtilities.lerp(i11, y7Var != null ? y7Var.f14165l : 0, this.C) + i10;
    }

    public Paint getPaint() {
        return this.f14194c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f14198r[0].f14159e;
    }

    @Override
    public CharSequence getText() {
        return this.f14198r[0].f14167n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        y7 y7Var = this.f14198r[0];
        z7 z7Var = y7Var.v;
        org.telegram.ui.Components.t5.release(z7Var, y7Var.d);
        org.telegram.ui.Components.t5.release(z7Var, y7Var.f14160f);
        if (y7Var.h == null) {
            return;
        }
        while (true) {
            w7[] w7VarArr = y7Var.h;
            if (i10 >= w7VarArr.length) {
                return;
            }
            w7 w7Var = w7VarArr[i10];
            if (w7Var != null) {
                org.telegram.ui.Components.t5.release(z7Var, w7Var.f14099a);
            }
            i10++;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        y7[] y7VarArr = this.f14198r;
        y7VarArr[0].b(canvas2, 1.0f - this.C);
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            y7Var.b(canvas2, this.C);
        }
        if (this.v != null) {
            float scrollY = this.h + this.F.getScrollY();
            int iClamp = (int) ((1.0f - Utilities.clamp(this.f14200w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f14196f;
            paint.setAlpha(iClamp);
            Paint paint2 = this.f14195e;
            paint2.setAlpha(iClamp);
            this.d.setAlpha(iClamp);
            canvas2.save();
            canvas2.translate(this.f14197n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.B, paint);
            canvas2.restore();
            canvas2.drawRect(this.f14197n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.B, paint2);
            canvas2.save();
            canvas2.translate(this.f14197n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.A = AndroidUtilities.dp(16.0f);
        this.B = AndroidUtilities.dp(8.0f);
        int i13 = this.f14199s;
        y7[] y7VarArr = this.f14198r;
        if (i13 != i12) {
            this.f14199s = i12;
            int iMax = Math.max(0, View.MeasureSpec.getSize(i10) - (this.A * 2));
            y7VarArr[0].e(iMax);
            y7 y7Var = y7VarArr[1];
            if (y7Var != null) {
                y7Var.e(iMax);
            }
        }
        int i14 = this.B * 2;
        int i15 = y7VarArr[0].f14165l;
        y7 y7Var2 = y7VarArr[1];
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i15, y7Var2 != null ? y7Var2.f14165l : 0, this.C) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y7[] y7VarArr;
        org.telegram.ui.Components.t5 t5Var;
        CharacterStyle characterStyle;
        boolean z10;
        CharacterStyle characterStyle2;
        org.telegram.ui.Components.t5[] t5VarArr;
        if (!this.F.f13059o0 && (y7VarArr = this.f14198r) != null) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.f14159e != null) {
                m80 m80Var = y7Var.f14158c;
                z7 z7Var = y7Var.v;
                StaticLayout staticLayout = z7Var.v;
                a8 a8Var = z7Var.F;
                if (staticLayout == null) {
                    if (motionEvent.getAction() != 0) {
                        if (y7Var.f14156a != null) {
                        }
                        if (motionEvent.getAction() == 3) {
                            y7[] y7VarArr2 = z7Var.f14198r;
                            y7VarArr2[0].f14158c.d(true);
                            y7VarArr2[0].f14156a = null;
                            z7Var.invalidate();
                            y7Var.f14157b = null;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                    }
                    return true;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = z7Var.f14197n;
                rectF.set(f10, z7Var.h, staticLayout.getWidth() + f10, z7Var.h + z7Var.v.getHeight());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    if ((y7Var.f14156a != null && y7Var.f14157b == null) || motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 3) {
                            y7[] y7VarArr3 = z7Var.f14198r;
                            y7VarArr3[0].f14158c.d(true);
                            y7VarArr3[0].f14156a = null;
                            z7Var.invalidate();
                            y7Var.f14157b = null;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                } else if (motionEvent.getAction() != 0) {
                    if (y7Var.f14156a != null) {
                    }
                    if (motionEvent.getAction() == 3) {
                        y7[] y7VarArr4 = z7Var.f14198r;
                        y7VarArr4[0].f14158c.d(true);
                        y7VarArr4[0].f14156a = null;
                        z7Var.invalidate();
                        y7Var.f14157b = null;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10 || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                v7 v7Var = y7Var.f14168o;
                int iDp = v7Var == null ? 0 : AndroidUtilities.dp(8.0f) + v7Var.b();
                v7 v7Var2 = y7Var.f14169p;
                int iDp2 = v7Var2 == null ? 0 : AndroidUtilities.dp(8.0f) + v7Var2.b();
                int x8 = (int) (motionEvent.getX() - z7Var.A);
                int y10 = (int) ((motionEvent.getY() - z7Var.B) - (iDp + iDp2));
                int lineForVertical = y7Var.f14159e.getLineForVertical(y10);
                float f11 = x8;
                int offsetForHorizontal = y7Var.f14159e.getOffsetForHorizontal(lineForVertical, f11);
                float lineLeft = y7Var.f14159e.getLineLeft(lineForVertical);
                if (lineLeft > f11 || y7Var.f14159e.getLineWidth(lineForVertical) + lineLeft < f11 || y10 < 0 || y10 > y7Var.f14159e.getHeight()) {
                    t5Var = null;
                    characterStyle = null;
                    z10 = false;
                } else {
                    SpannableString spannableString = new SpannableString(y7Var.f14167n);
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (characterStyleArr == null || characterStyleArr.length == 0) {
                        characterStyleArr = (CharacterStyle[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, q41.class);
                    }
                    if (characterStyleArr == null || characterStyleArr.length == 0) {
                        characterStyle = null;
                    } else {
                        characterStyle = characterStyleArr[0];
                        if (motionEvent.getAction() == 0) {
                            m80Var.d(true);
                            y7Var.f14157b = null;
                            q80 q80Var = new q80(characterStyleArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                            y7Var.f14156a = q80Var;
                            q80Var.d(org.telegram.ui.ActionBar.g6.l1(0.2f, -1));
                            m80Var.a(y7Var.f14156a, null);
                            int spanStart = spannableString.getSpanStart(y7Var.f14156a.f31841i);
                            int spanEnd = spannableString.getSpanEnd(y7Var.f14156a.f31841i);
                            j80 j80VarB = y7Var.f14156a.b();
                            j80VarB.d(y7Var.f14159e, spanStart, z7Var.getPaddingTop());
                            y7Var.f14159e.getSelectionPath(spanStart, spanEnd, j80VarB);
                            q80 q80Var2 = y7Var.f14156a;
                            a8Var.S.f(false);
                            z7Var.postDelayed(new p6(12, y7Var, q80Var2), ViewConfiguration.getLongPressTimeout());
                            z10 = true;
                        }
                        if (y7Var.f14156a == null || z10 || (t5VarArr = (org.telegram.ui.Components.t5[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.t5.class)) == null || t5VarArr.length == 0) {
                            t5Var = null;
                        } else {
                            t5Var = t5VarArr[0];
                            if (motionEvent.getAction() == 0) {
                                y7Var.f14156a = null;
                                y7Var.f14157b = t5VarArr[0];
                                z10 = true;
                            }
                        }
                    }
                    z10 = false;
                    if (y7Var.f14156a == null) {
                        t5Var = null;
                    } else {
                        t5Var = null;
                    }
                }
                if (motionEvent.getAction() == 1) {
                    m80Var.d(true);
                    q80 q80Var3 = y7Var.f14156a;
                    if (q80Var3 == null || (characterStyle2 = q80Var3.f31841i) != characterStyle) {
                        org.telegram.ui.Components.t5 t5Var2 = y7Var.f14157b;
                        if (t5Var2 != null && t5Var2 == t5Var) {
                            a8Var.F(t5Var2);
                        }
                    } else {
                        a8Var.G(characterStyle2, a8Var);
                    }
                    y7Var.f14156a = null;
                    y7Var.f14157b = null;
                    z10 = true;
                }
                if (!z10) {
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11 = z10 != isPressed();
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.F.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y7 y7Var;
        v7 v7Var;
        v7 v7Var2;
        v7 v7Var3;
        v7 v7Var4;
        y7[] y7VarArr = this.f14198r;
        y7 y7Var2 = y7VarArr[0];
        if ((y7Var2 == null || (y7Var2.f14172s != drawable && (((v7Var3 = y7Var2.f14168o) == null || v7Var3.f14065j != drawable) && ((v7Var4 = y7Var2.f14169p) == null || v7Var4.f14065j != drawable)))) && ((y7Var = y7VarArr[1]) == null || (y7Var.f14172s != drawable && (((v7Var = y7Var.f14168o) == null || v7Var.f14065j != drawable) && ((v7Var2 = y7Var.f14169p) == null || v7Var2.f14065j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
