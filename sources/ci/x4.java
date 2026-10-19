package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yq;
public abstract class x4 extends View {
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public GradientDrawable H;
    public GestureDetector I;
    public float J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public int f6156a;
    public int f6157b;
    public int f6158c;
    public Scroller d;
    public float e;
    public float f6159f;
    public float h;
    public int f6160n;
    public int f6161r;
    public int f6162s;
    public boolean v;
    public int f6163w;
    public float f6164x;
    public float f6165y;

    public static void a(x4 x4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i10;
        String str;
        if (storyViews == null) {
            i10 = 0;
        } else {
            i10 = storyViews.views_count;
        }
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new yq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new yq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
                int i11 = this.f6162s;
                this.e = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f6160n) * i10);
                invalidate();
                return;
            }
            int i12 = this.f6162s;
            float f7 = (i12 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i12 + this.f6160n) * i10);
            float f10 = this.e;
            if (f7 == f10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new v4(this, 0));
            this.M.addListener(new ah.b(this, 12));
            this.M.setInterpolator(bs.f25012f);
            this.M.setDuration(200L);
            this.M.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f6162s;
        this.f6159f = (-(measuredWidth - i10)) / 2.0f;
        int i11 = i10 + this.f6160n;
        this.h = ((getMeasuredWidth() - this.f6162s) / 2.0f) + (((this.E.size() * i11) - this.f6160n) - getMeasuredWidth());
    }

    public w4 getCenteredImageReciever() {
        ArrayList arrayList = this.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((w4) arrayList.get(i10)).f6112b == this.K) {
                return (w4) arrayList.get(i10);
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
            ((w4) arrayList.get(i10)).f6111a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i10;
        float f7;
        float f10;
        float y3;
        ArrayList arrayList;
        float f11;
        float f12;
        int i11;
        float f13;
        w4 w4Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.H;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = this.F;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = scroller.getCurrX();
            invalidate();
            this.L = true;
        } else if (this.L && (i10 = this.K) >= 0) {
            c(i10, true, true);
        }
        float f14 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i13 = -1;
        float f15 = 2.1474836E9f;
        int i14 = -1;
        int i15 = 0;
        while (i15 < this.E.size()) {
            int i16 = this.f6162s;
            float f16 = (-this.e) + ((this.f6160n + i16) * i15);
            float f17 = ((i16 / f14) + f16) - measuredWidth;
            float abs = Math.abs(f17);
            if (abs < this.f6162s) {
                f10 = 1.0f - (Math.abs(f17) / this.f6162s);
                f7 = (0.2f * f10) + 1.0f;
            } else {
                f7 = 1.0f;
                f10 = 0.0f;
            }
            if (i14 == i13 || abs < f15) {
                i14 = i15;
                f15 = abs;
            }
            if (f17 < 0.0f) {
                y3 = com.google.android.gms.internal.play_billing.k3.D(1.0f, f10, this.f6162s * 0.1f, f16);
            } else {
                y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f10, this.f6162s * 0.1f, f16);
            }
            if (y3 > getMeasuredWidth() || this.f6162s + y3 < 0.0f) {
                arrayList = arrayList4;
                f11 = measuredWidth;
                f12 = f15;
                i11 = i14;
                f13 = 2.0f;
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList4.size()) {
                        if (((w4) arrayList4.get(i17)).f6112b == i15) {
                            w4Var = (w4) arrayList4.remove(i17);
                            break;
                        }
                        i17++;
                    } else {
                        w4Var = new w4(this);
                        w4Var.a(i15);
                        w4Var.f6112b = i15;
                        break;
                    }
                }
                float f18 = this.f6162s;
                float f19 = f18 * f7;
                float f20 = this.f6161r;
                float f21 = f7 * f20;
                f11 = measuredWidth;
                float x10 = org.telegram.messenger.g0.x(f19, f18, 2.0f, y3);
                float x11 = org.telegram.messenger.g0.x(f21, f20, 2.0f, this.f6164x);
                if (this.f6165y == 0.0f || i15 == (i12 = this.K)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f12 = f15;
                    i11 = i14;
                    w4Var.f6111a.setImageCoords(x10, x11, f19, f21);
                } else {
                    f12 = f15;
                    i11 = i14;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    w4Var.f6111a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i15 - i12), x10, this.f6165y), AndroidUtilities.lerp(this.f6156a, x11, this.f6165y), AndroidUtilities.lerp(this.f6157b, f19, this.f6165y), AndroidUtilities.lerp(this.f6158c, f21, this.f6165y));
                }
                if (this.f6165y != 1.0f && i15 == this.K) {
                    arrayList3 = arrayList2;
                    f13 = 2.0f;
                } else {
                    ImageReceiver imageReceiver = w4Var.f6111a;
                    imageReceiver.draw(canvas);
                    if (w4Var.f6113c != null) {
                        int A = (int) com.google.android.gms.internal.play_billing.k3.A(f10, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(A);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f13 = 2.0f;
                        canvas.translate(imageReceiver.getCenterX() - (this.J / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - w4Var.f6113c.getHeight());
                        w4Var.d.setAlpha(A);
                        w4Var.f6113c.draw(canvas);
                        canvas.restore();
                    } else {
                        f13 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(w4Var);
            }
            i15++;
            f15 = f12;
            f14 = f13;
            measuredWidth = f11;
            i14 = i11;
            arrayList4 = arrayList;
            i13 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.M == null && this.K != i14) {
            this.K = i14;
            b(i14);
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            ((w4) arrayList5.get(i18)).f6111a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.G;
        super.onMeasure(i10, i11);
        this.f6160n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f6161r = dp;
        int i12 = (int) ((dp / 16.0f) * 9.0f);
        this.f6162s = i12;
        float dp2 = i12 - AndroidUtilities.dp(8.0f);
        this.f6164x = ((AndroidUtilities.dp(180.0f) - this.f6161r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f6163w >= 0 && getMeasuredWidth() > 0) {
            this.K = -1;
            c(this.f6163w, false, false);
            this.f6163w = -1;
        }
        if (this.J != dp2) {
            this.J = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((w4) arrayList.get(i13)).a(((w4) arrayList.get(i13)).f6112b);
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
        if (this.f6165y == f7) {
            return;
        }
        this.f6165y = f7;
        invalidate();
    }
}
