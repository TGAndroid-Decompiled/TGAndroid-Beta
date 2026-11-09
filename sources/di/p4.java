package di;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public abstract class p4 extends View {
    public float D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public GradientDrawable H;
    public GestureDetector I;
    public float J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public int f9498a;
    public int f9499b;
    public int f9500c;
    public Scroller d;
    public float f9501e;
    public float f9502f;
    public float h;
    public int f9503n;
    public int f9504r;
    public int f9505s;
    public boolean f9506w;
    public int f9507x;
    public float f9508y;

    public static void a(p4 p4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z9) {
        int i7;
        String str;
        if (storyViews == null) {
            i7 = 0;
        } else {
            i7 = storyViews.views_count;
        }
        if (i7 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new wp(2131232424, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(i7, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z9) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new wp(2131231963, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(storyViews.reactions_count, 0));
            }
        }
    }

    public abstract void b(int i7);

    public final void c(int i7, boolean z9, boolean z10) {
        if ((this.K != i7 || z10) && getMeasuredHeight() > 0) {
            if (this.K != i7) {
                this.K = i7;
                b(i7);
            }
            this.d.abortAnimation();
            this.L = false;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.M.cancel();
                this.M = null;
            }
            if (!z9) {
                int i10 = this.f9505s;
                this.f9501e = (i10 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i10 + this.f9503n) * i7);
                invalidate();
                return;
            }
            int i11 = this.f9505s;
            float f10 = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f9503n) * i7);
            float f11 = this.f9501e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new n4(this, 0));
            this.M.addListener(new bi.t5(this, 12));
            this.M.setInterpolator(xq.f40458f);
            this.M.setDuration(200L);
            this.M.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f9505s;
        this.f9502f = (-(measuredWidth - i7)) / 2.0f;
        int i10 = i7 + this.f9503n;
        this.h = ((getMeasuredWidth() - this.f9505s) / 2.0f) + (((this.E.size() * i10) - this.f9503n) - getMeasuredWidth());
    }

    public o4 getCenteredImageReciever() {
        ArrayList arrayList = this.G;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((o4) arrayList.get(i7)).f9433b == this.K) {
                return (o4) arrayList.get(i7);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.K;
    }

    public float getFinalHeight() {
        return org.telegram.messenger.g0.L(180.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9506w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.G;
        super.onDetachedFromWindow();
        this.f9506w = false;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((o4) arrayList.get(i7)).f9432a.R();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i7;
        float f10;
        float f11;
        float z9;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        o4 o4Var;
        ArrayList arrayList2;
        int i11;
        GradientDrawable gradientDrawable = this.H;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = this.F;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f9501e = scroller.getCurrX();
            invalidate();
            this.L = true;
        } else if (this.L && (i7 = this.K) >= 0) {
            c(i7, true, true);
        }
        float f15 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i12 = -1;
        float f16 = 2.1474836E9f;
        int i13 = -1;
        int i14 = 0;
        while (i14 < this.E.size()) {
            int i15 = this.f9505s;
            float f17 = (-this.f9501e) + ((this.f9503n + i15) * i14);
            float f18 = ((i15 / f15) + f17) - measuredWidth;
            float abs = Math.abs(f18);
            if (abs < this.f9505s) {
                f11 = 1.0f - (Math.abs(f18) / this.f9505s);
                f10 = (0.2f * f11) + 1.0f;
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
            }
            if (i13 == i12 || abs < f16) {
                i13 = i14;
                f16 = abs;
            }
            if (f18 < 0.0f) {
                z9 = com.google.android.recaptcha.internal.a.v(1.0f, f11, this.f9505s * 0.1f, f17);
            } else {
                z9 = com.google.android.recaptcha.internal.a.z(1.0f, f11, this.f9505s * 0.1f, f17);
            }
            if (z9 > getMeasuredWidth() || this.f9505s + z9 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f16;
                i10 = i13;
                f14 = 2.0f;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList4.size()) {
                        if (((o4) arrayList4.get(i16)).f9433b == i14) {
                            o4Var = (o4) arrayList4.remove(i16);
                            break;
                        }
                        i16++;
                    } else {
                        o4Var = new o4(this);
                        o4Var.a(i14);
                        o4Var.f9433b = i14;
                        break;
                    }
                }
                float f19 = this.f9505s;
                float f20 = f19 * f10;
                float f21 = this.f9504r;
                float f22 = f10 * f21;
                f12 = measuredWidth;
                float y10 = org.telegram.messenger.k5.y(f20, f19, 2.0f, z9);
                float y11 = org.telegram.messenger.k5.y(f22, f21, 2.0f, this.f9508y);
                if (this.D == 0.0f || i14 == (i11 = this.K)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f16;
                    i10 = i13;
                    o4Var.f9432a.y0(y10, y11, f20, f22);
                } else {
                    f13 = f16;
                    i10 = i13;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    o4Var.f9432a.y0(org.telegram.messenger.g0.T1(getMeasuredWidth() * (i14 - i11), y10, this.D), org.telegram.messenger.g0.T1(this.f9498a, y11, this.D), org.telegram.messenger.g0.T1(this.f9499b, f20, this.D), org.telegram.messenger.g0.T1(this.f9500c, f22, this.D));
                }
                if (this.D != 1.0f && i14 == this.K) {
                    arrayList3 = arrayList2;
                    f14 = 2.0f;
                } else {
                    ImageReceiver imageReceiver = o4Var.f9432a;
                    imageReceiver.h(canvas, null);
                    if (o4Var.f9434c != null) {
                        int B = (int) com.google.android.recaptcha.internal.a.B(f11, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.K0, (int) (imageReceiver.A() - org.telegram.messenger.g0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f14 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.J / 2.0f), (imageReceiver.A() - org.telegram.messenger.g0.L(8.0f)) - o4Var.f9434c.getHeight());
                        o4Var.d.setAlpha(B);
                        o4Var.f9434c.draw(canvas);
                        canvas.restore();
                    } else {
                        f14 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(o4Var);
            }
            i14++;
            f16 = f13;
            f15 = f14;
            measuredWidth = f12;
            i13 = i10;
            arrayList4 = arrayList;
            i12 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.M == null && this.K != i13) {
            this.K = i13;
            b(i13);
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            ((o4) arrayList5.get(i17)).f9432a.R();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.G;
        super.onMeasure(i7, i10);
        this.f9503n = org.telegram.messenger.g0.L(8.0f);
        int L = (int) (org.telegram.messenger.g0.L(180.0f) / 1.2f);
        this.f9504r = L;
        int i11 = (int) ((L / 16.0f) * 9.0f);
        this.f9505s = i11;
        float L2 = i11 - org.telegram.messenger.g0.L(8.0f);
        this.f9508y = ((org.telegram.messenger.g0.L(180.0f) - this.f9504r) / 2.0f) + org.telegram.messenger.g0.L(20.0f);
        d();
        if (this.f9507x >= 0 && getMeasuredWidth() > 0) {
            this.K = -1;
            c(this.f9507x, false, false);
            this.f9507x = -1;
        }
        if (this.J != L2) {
            this.J = L2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((o4) arrayList.get(i12)).a(((o4) arrayList.get(i12)).f9433b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        this.I.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i7 = this.K) >= 0) {
            c(i7, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.D == f10) {
            return;
        }
        this.D = f10;
        invalidate();
    }
}
