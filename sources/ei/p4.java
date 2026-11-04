package ei;

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
    public float E;
    public ArrayList F;
    public ArrayList G;
    public ArrayList H;
    public GradientDrawable I;
    public GestureDetector J;
    public float K;
    public int L;
    public boolean M;
    public ValueAnimator N;
    public int f10758a;
    public int f10759b;
    public int f10760c;
    public Scroller d;
    public float f10761e;
    public float f10762f;
    public float h;
    public int f10763n;
    public int f10764r;
    public int f10765s;
    public boolean f10766w;
    public int f10767x;
    public float f10768y;

    public static void a(p4 p4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i3;
        String str;
        if (storyViews == null) {
            i3 = 0;
        } else {
            i3 = storyViews.views_count;
        }
        if (i3 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new wp(2131232424, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(i3, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
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

    public abstract void b(int i3);

    public final void c(int i3, boolean z10, boolean z11) {
        if ((this.L != i3 || z11) && getMeasuredHeight() > 0) {
            if (this.L != i3) {
                this.L = i3;
                b(i3);
            }
            this.d.abortAnimation();
            this.M = false;
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.N.cancel();
                this.N = null;
            }
            if (!z10) {
                int i10 = this.f10765s;
                this.f10761e = (i10 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i10 + this.f10763n) * i3);
                invalidate();
                return;
            }
            int i11 = this.f10765s;
            float f10 = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f10763n) * i3);
            float f11 = this.f10761e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new n4(this, 0));
            this.N.addListener(new ai.e1(this, 14));
            this.N.setInterpolator(xq.f40452f);
            this.N.setDuration(200L);
            this.N.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f10765s;
        this.f10762f = (-(measuredWidth - i3)) / 2.0f;
        int i10 = i3 + this.f10763n;
        this.h = ((getMeasuredWidth() - this.f10765s) / 2.0f) + (((this.F.size() * i10) - this.f10763n) - getMeasuredWidth());
    }

    public o4 getCenteredImageReciever() {
        ArrayList arrayList = this.H;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((o4) arrayList.get(i3)).f10689b == this.L) {
                return (o4) arrayList.get(i3);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.L;
    }

    public float getFinalHeight() {
        return org.telegram.messenger.g0.L(180.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10766w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.H;
        super.onDetachedFromWindow();
        this.f10766w = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((o4) arrayList.get(i3)).f10688a.R();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i3;
        float f10;
        float f11;
        float y9;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        o4 o4Var;
        ArrayList arrayList2;
        int i11;
        GradientDrawable gradientDrawable = this.I;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.G;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f10761e = scroller.getCurrX();
            invalidate();
            this.M = true;
        } else if (this.M && (i3 = this.L) >= 0) {
            c(i3, true, true);
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
        while (i14 < this.F.size()) {
            int i15 = this.f10765s;
            float f17 = (-this.f10761e) + ((this.f10763n + i15) * i14);
            float f18 = ((i15 / f15) + f17) - measuredWidth;
            float abs = Math.abs(f18);
            if (abs < this.f10765s) {
                f11 = 1.0f - (Math.abs(f18) / this.f10765s);
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
                y9 = a1.g.D(1.0f, f11, this.f10765s * 0.1f, f17);
            } else {
                y9 = com.google.android.recaptcha.internal.a.y(1.0f, f11, this.f10765s * 0.1f, f17);
            }
            if (y9 > getMeasuredWidth() || this.f10765s + y9 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f16;
                i10 = i13;
                f14 = 2.0f;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList4.size()) {
                        if (((o4) arrayList4.get(i16)).f10689b == i14) {
                            o4Var = (o4) arrayList4.remove(i16);
                            break;
                        }
                        i16++;
                    } else {
                        o4Var = new o4(this);
                        o4Var.a(i14);
                        o4Var.f10689b = i14;
                        break;
                    }
                }
                float f19 = this.f10765s;
                float f20 = f19 * f10;
                float f21 = this.f10764r;
                float f22 = f10 * f21;
                f12 = measuredWidth;
                float y10 = org.telegram.messenger.k5.y(f20, f19, 2.0f, y9);
                float y11 = org.telegram.messenger.k5.y(f22, f21, 2.0f, this.f10768y);
                if (this.E == 0.0f || i14 == (i11 = this.L)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f16;
                    i10 = i13;
                    o4Var.f10688a.y0(y10, y11, f20, f22);
                } else {
                    f13 = f16;
                    i10 = i13;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    o4Var.f10688a.y0(org.telegram.messenger.g0.T1(getMeasuredWidth() * (i14 - i11), y10, this.E), org.telegram.messenger.g0.T1(this.f10758a, y11, this.E), org.telegram.messenger.g0.T1(this.f10759b, f20, this.E), org.telegram.messenger.g0.T1(this.f10760c, f22, this.E));
                }
                if (this.E != 1.0f && i14 == this.L) {
                    arrayList3 = arrayList2;
                    f14 = 2.0f;
                } else {
                    ImageReceiver imageReceiver = o4Var.f10688a;
                    imageReceiver.h(canvas, null);
                    if (o4Var.f10690c != null) {
                        int A = (int) com.google.android.recaptcha.internal.a.A(f11, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(A);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.A() - org.telegram.messenger.g0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f14 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.K / 2.0f), (imageReceiver.A() - org.telegram.messenger.g0.L(8.0f)) - o4Var.f10690c.getHeight());
                        o4Var.d.setAlpha(A);
                        o4Var.f10690c.draw(canvas);
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
        if (this.N == null && this.L != i13) {
            this.L = i13;
            b(i13);
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            ((o4) arrayList5.get(i17)).f10688a.R();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList = this.H;
        super.onMeasure(i3, i10);
        this.f10763n = org.telegram.messenger.g0.L(8.0f);
        int L = (int) (org.telegram.messenger.g0.L(180.0f) / 1.2f);
        this.f10764r = L;
        int i11 = (int) ((L / 16.0f) * 9.0f);
        this.f10765s = i11;
        float L2 = i11 - org.telegram.messenger.g0.L(8.0f);
        this.f10768y = ((org.telegram.messenger.g0.L(180.0f) - this.f10764r) / 2.0f) + org.telegram.messenger.g0.L(20.0f);
        d();
        if (this.f10767x >= 0 && getMeasuredWidth() > 0) {
            this.L = -1;
            c(this.f10767x, false, false);
            this.f10767x = -1;
        }
        if (this.K != L2) {
            this.K = L2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((o4) arrayList.get(i12)).a(((o4) arrayList.get(i12)).f10689b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        this.J.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i3 = this.L) >= 0) {
            c(i3, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }
}
