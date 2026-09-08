package bi;

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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
public abstract class w5 extends View {
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public GradientDrawable H;
    public GestureDetector I;
    public float J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public int f3973a;
    public int f3974b;
    public int f3975c;
    public Scroller d;
    public float f3976e;
    public float f3977f;
    public float h;
    public int f3978n;
    public int f3979r;
    public int f3980s;
    public boolean v;
    public int f3981w;
    public float f3982x;
    public float f3983y;

    public static void a(w5 w5Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i10;
        String str;
        if (storyViews == null) {
            i10 = 0;
        } else {
            i10 = storyViews.views_count;
        }
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new nq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new nq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
            }
        }
    }

    public abstract void b(int i10);

    public final void c(int i10, boolean z10, boolean z11) {
        if ((this.K != i10 || z11) && getMeasuredHeight() > 0) {
            if (this.K != i10) {
                this.K = i10;
                b(i10);
            }
            this.d.abortAnimation();
            this.L = false;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.M.cancel();
                this.M = null;
            }
            if (!z10) {
                int i11 = this.f3980s;
                this.f3976e = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f3978n) * i10);
                invalidate();
                return;
            }
            int i12 = this.f3980s;
            float f7 = (i12 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i12 + this.f3978n) * i10);
            float f10 = this.f3976e;
            if (f7 == f10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new u5(this, 0));
            this.M.addListener(new ah.b(this, 10));
            this.M.setInterpolator(pr.f29493f);
            this.M.setDuration(200L);
            this.M.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f3980s;
        this.f3977f = (-(measuredWidth - i10)) / 2.0f;
        int i11 = i10 + this.f3978n;
        this.h = ((getMeasuredWidth() - this.f3980s) / 2.0f) + (((this.E.size() * i11) - this.f3978n) - getMeasuredWidth());
    }

    public v5 getCenteredImageReciever() {
        ArrayList arrayList = this.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v5) arrayList.get(i10)).f3923b == this.K) {
                return (v5) arrayList.get(i10);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.K;
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
        ArrayList arrayList = this.G;
        super.onDetachedFromWindow();
        this.v = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v5) arrayList.get(i10)).f3922a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i10;
        float f7;
        float f10;
        float z10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i11;
        v5 v5Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.H;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = this.F;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f3976e = scroller.getCurrX();
            invalidate();
            this.L = true;
        } else if (this.L && (i10 = this.K) >= 0) {
            c(i10, true, true);
        }
        float f13 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i13 = -1;
        float f14 = 2.1474836E9f;
        int i14 = 0;
        int i15 = -1;
        while (i14 < this.E.size()) {
            int i16 = this.f3980s;
            float f15 = (-this.f3976e) + ((this.f3978n + i16) * i14);
            float f16 = ((i16 / f13) + f15) - measuredWidth;
            float abs = Math.abs(f16);
            if (abs < this.f3980s) {
                f7 = 1.0f - (Math.abs(f16) / this.f3980s);
                f10 = (0.2f * f7) + 1.0f;
            } else {
                f7 = 0.0f;
                f10 = 1.0f;
            }
            if (i15 == i13 || abs < f14) {
                i15 = i14;
                f14 = abs;
            }
            if (f16 < 0.0f) {
                z10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, this.f3980s * 0.1f, f15);
            } else {
                z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f7, this.f3980s * 0.1f, f15);
            }
            if (z10 > getMeasuredWidth() || this.f3980s + z10 < 0.0f) {
                arrayList = arrayList4;
                f11 = measuredWidth;
                f12 = f14;
                i11 = i15;
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList4.size()) {
                        if (((v5) arrayList4.get(i17)).f3923b == i14) {
                            v5Var = (v5) arrayList4.remove(i17);
                            break;
                        }
                        i17++;
                    } else {
                        v5Var = new v5(this);
                        v5Var.a(i14);
                        v5Var.f3923b = i14;
                        break;
                    }
                }
                float f17 = this.f3980s;
                float f18 = f17 * f10;
                float f19 = this.f3979r;
                float f20 = f10 * f19;
                f11 = measuredWidth;
                float y3 = org.telegram.messenger.w1.y(f18, f17, 2.0f, z10);
                float y10 = org.telegram.messenger.w1.y(f20, f19, 2.0f, this.f3982x);
                if (this.f3983y == 0.0f || i14 == (i12 = this.K)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f12 = f14;
                    i11 = i15;
                    v5Var.f3922a.setImageCoords(y3, y10, f18, f20);
                } else {
                    f12 = f14;
                    i11 = i15;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    v5Var.f3922a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i14 - i12), y3, this.f3983y), AndroidUtilities.lerp(this.f3973a, y10, this.f3983y), AndroidUtilities.lerp(this.f3974b, f18, this.f3983y), AndroidUtilities.lerp(this.f3975c, f20, this.f3983y));
                }
                if (this.f3983y != 1.0f && i14 == this.K) {
                    arrayList3 = arrayList2;
                } else {
                    ImageReceiver imageReceiver = v5Var.f3922a;
                    imageReceiver.draw(canvas);
                    if (v5Var.f3924c != null) {
                        int B = (int) com.google.android.gms.internal.vision.e2.B(f7, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.J / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - v5Var.f3924c.getHeight());
                        v5Var.d.setAlpha(B);
                        v5Var.f3924c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(v5Var);
            }
            i14++;
            f14 = f12;
            measuredWidth = f11;
            i15 = i11;
            arrayList4 = arrayList;
            f13 = 2.0f;
            i13 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.M == null && this.K != i15) {
            this.K = i15;
            b(i15);
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            ((v5) arrayList5.get(i18)).f3922a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.G;
        super.onMeasure(i10, i11);
        this.f3978n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f3979r = dp;
        int i12 = (int) ((dp / 16.0f) * 9.0f);
        this.f3980s = i12;
        float dp2 = i12 - AndroidUtilities.dp(8.0f);
        this.f3982x = ((AndroidUtilities.dp(180.0f) - this.f3979r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f3981w >= 0 && getMeasuredWidth() > 0) {
            this.K = -1;
            c(this.f3981w, false, false);
            this.f3981w = -1;
        }
        if (this.J != dp2) {
            this.J = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((v5) arrayList.get(i13)).a(((v5) arrayList.get(i13)).f3923b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        this.I.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i10 = this.K) >= 0) {
            c(i10, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f7) {
        if (this.f3983y == f7) {
            return;
        }
        this.f3983y = f7;
        invalidate();
    }
}
