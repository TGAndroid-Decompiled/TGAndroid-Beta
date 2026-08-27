package jh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;

public abstract class i4 extends View {
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public GradientDrawable D;
    public GestureDetector E;
    public float F;
    public int G;
    public boolean H;
    public ValueAnimator I;

    public int f13437a;

    public int f13438b;

    public int f13439c;
    public Scroller d;

    public float f13440e;

    public float f13441f;
    public float h;

    public int f13442n;

    public int f13443r;

    public int f13444s;
    public boolean v;

    public int f13445w;

    public float f13446x;

    public float f13447y;

    public static void a(i4 i4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new cq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z10 ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new cq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i10);

    public final void c(int i10, boolean z10, boolean z11) {
        if ((this.G != i10 || z11) && getMeasuredHeight() > 0) {
            if (this.G != i10) {
                this.G = i10;
                b(i10);
            }
            this.d.abortAnimation();
            this.H = false;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
                this.I = null;
            }
            if (!z10) {
                float f10 = (-getMeasuredWidth()) / 2.0f;
                int i11 = this.f13444s;
                this.f13440e = (i11 / 2.0f) + f10 + ((i11 + this.f13442n) * i10);
                invalidate();
                return;
            }
            float f11 = (-getMeasuredWidth()) / 2.0f;
            int i12 = this.f13444s;
            float f12 = (i12 / 2.0f) + f11 + ((i12 + this.f13442n) * i10);
            float f13 = this.f13440e;
            if (f12 == f13) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13, f12);
            this.I = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.q1(this, 3));
            this.I.addListener(new ag.r1(this, 18));
            this.I.setInterpolator(er.f28122f);
            this.I.setDuration(200L);
            this.I.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f13444s;
        this.f13441f = (-(measuredWidth - i10)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.f13444s) / 2.0f) + (((this.A.size() * (i10 + this.f13442n)) - this.f13442n) - getMeasuredWidth());
    }

    public h4 getCenteredImageReciever() {
        ArrayList arrayList = this.C;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((h4) arrayList.get(i10)).f13382b == this.G) {
                return (h4) arrayList.get(i10);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.G;
    }

    public float getFinalHeight() {
        return AndroidUtilities.dp(180.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.C;
        super.onDetachedFromWindow();
        this.v = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((h4) arrayList.get(i10)).f13381a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float fAbs;
        float f10;
        h4 h4Var;
        int i11;
        GradientDrawable gradientDrawable = this.D;
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = this.B;
        super.onDraw(canvas);
        Scroller scroller = this.d;
        if (scroller.computeScrollOffset()) {
            this.f13440e = scroller.getCurrX();
            invalidate();
            this.H = true;
        } else if (this.H && (i10 = this.G) >= 0) {
            c(i10, true, true);
        }
        float f11 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        int i12 = -1;
        float f12 = 2.1474836E9f;
        int i13 = 0;
        int i14 = -1;
        while (i13 < this.A.size()) {
            float f13 = -this.f13440e;
            int i15 = this.f13444s;
            float f14 = f13 + ((this.f13442n + i15) * i13);
            float f15 = ((i15 / f11) + f14) - measuredWidth;
            float fAbs2 = Math.abs(f15);
            if (fAbs2 < this.f13444s) {
                fAbs = 1.0f - (Math.abs(f15) / this.f13444s);
                f10 = (0.2f * fAbs) + 1.0f;
            } else {
                fAbs = 0.0f;
                f10 = 1.0f;
            }
            if (i14 == i12 || fAbs2 < f12) {
                i14 = i13;
                f12 = fAbs2;
            }
            float fB = f15 < 0.0f ? pa.b(1.0f, fAbs, this.f13444s * 0.1f, f14) : com.google.android.recaptcha.internal.a.z(1.0f, fAbs, this.f13444s * 0.1f, f14);
            if (fB > getMeasuredWidth() || this.f13444s + fB < 0.0f) {
                arrayList2 = arrayList2;
                f12 = f12;
                i14 = i14;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList2.size()) {
                        h4Var = new h4(this);
                        h4Var.a(i13);
                        h4Var.f13382b = i13;
                        break;
                    } else {
                        if (((h4) arrayList2.get(i16)).f13382b == i13) {
                            h4Var = (h4) arrayList2.remove(i16);
                            break;
                        }
                        i16++;
                    }
                }
                float f16 = this.f13444s;
                float f17 = f16 * f10;
                float f18 = this.f13443r;
                float f19 = f10 * f18;
                float fA = org.telegram.messenger.y1.a(f17, f16, 2.0f, fB);
                float fA2 = org.telegram.messenger.y1.a(f19, f18, 2.0f, this.f13446x);
                if (this.f13447y == 0.0f || i13 == (i11 = this.G)) {
                    h4Var.f13381a.setImageCoords(fA, fA2, f17, f19);
                } else {
                    h4Var.f13381a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i13 - i11), fA, this.f13447y), AndroidUtilities.lerp(this.f13437a, fA2, this.f13447y), AndroidUtilities.lerp(this.f13438b, f17, this.f13447y), AndroidUtilities.lerp(this.f13439c, f19, this.f13447y));
                }
                if (this.f13447y == 1.0f || i13 != this.G) {
                    ImageReceiver imageReceiver = h4Var.f13381a;
                    imageReceiver.draw(canvas);
                    if (h4Var.f13383c != null) {
                        int iB = (int) com.google.android.recaptcha.internal.a.B(fAbs, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(iB);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.F / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - h4Var.f13383c.getHeight());
                        h4Var.d.setAlpha(iB);
                        h4Var.f13383c.draw(canvas);
                        canvas.restore();
                    }
                }
                arrayList.add(h4Var);
            }
            i13++;
            f12 = f12;
            measuredWidth = measuredWidth;
            i14 = i14;
            arrayList2 = arrayList2;
            f11 = 2.0f;
            i12 = -1;
        }
        ArrayList arrayList3 = arrayList2;
        if (this.I == null && this.G != i14) {
            this.G = i14;
            b(i14);
        }
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            ((h4) arrayList3.get(i17)).f13381a.onDetachedFromWindow();
        }
        arrayList3.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.C;
        super.onMeasure(i10, i11);
        this.f13442n = AndroidUtilities.dp(8.0f);
        int iDp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f13443r = iDp;
        int i12 = (int) ((iDp / 16.0f) * 9.0f);
        this.f13444s = i12;
        float fDp = i12 - AndroidUtilities.dp(8.0f);
        this.f13446x = ((AndroidUtilities.dp(180.0f) - this.f13443r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f13445w >= 0 && getMeasuredWidth() > 0) {
            this.G = -1;
            c(this.f13445w, false, false);
            this.f13445w = -1;
        }
        if (this.F != fDp) {
            this.F = fDp;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((h4) arrayList.get(i13)).a(((h4) arrayList.get(i13)).f13382b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        this.E.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i10 = this.G) >= 0) {
            c(i10, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.f13447y == f10) {
            return;
        }
        this.f13447y = f10;
        invalidate();
    }
}
