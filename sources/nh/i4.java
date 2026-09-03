package nh;

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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ai;
public abstract class i4 extends View {
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public GradientDrawable E;
    public GestureDetector F;
    public float G;
    public int H;
    public boolean I;
    public ValueAnimator J;
    public int f15388a;
    public int f15389b;
    public int f15390c;
    public Scroller d;
    public float e;
    public float f15391f;
    public float h;
    public int f15392n;
    public int f15393r;
    public int f15394s;
    public boolean v;
    public int f15395w;
    public float f15396x;
    public float f15397y;

    public static void a(i4 i4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z4) {
        int i10;
        String str;
        if (storyViews == null) {
            i10 = 0;
        } else {
            i10 = storyViews.views_count;
        }
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new lq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z4) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new lq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
            }
        }
    }

    public abstract void b(int i10);

    public final void c(int i10, boolean z4, boolean z10) {
        if ((this.H != i10 || z10) && getMeasuredHeight() > 0) {
            if (this.H != i10) {
                this.H = i10;
                b(i10);
            }
            this.d.abortAnimation();
            this.I = false;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
                this.J = null;
            }
            if (!z4) {
                int i11 = this.f15394s;
                this.e = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f15392n) * i10);
                invalidate();
                return;
            }
            int i12 = this.f15394s;
            float f10 = (i12 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i12 + this.f15392n) * i10);
            float f11 = this.e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new eg.b1(this, 3));
            this.J.addListener(new cg.l0(this, 22));
            this.J.setInterpolator(mr.f27122f);
            this.J.setDuration(200L);
            this.J.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f15394s;
        this.f15391f = (-(measuredWidth - i10)) / 2.0f;
        int i11 = i10 + this.f15392n;
        this.h = ((getMeasuredWidth() - this.f15394s) / 2.0f) + (((this.B.size() * i11) - this.f15392n) - getMeasuredWidth());
    }

    public h4 getCenteredImageReciever() {
        ArrayList arrayList = this.D;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((h4) arrayList.get(i10)).f15359b == this.H) {
                return (h4) arrayList.get(i10);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.H;
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
        ArrayList arrayList = this.D;
        super.onDetachedFromWindow();
        this.v = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((h4) arrayList.get(i10)).f15358a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i10;
        float f10;
        float f11;
        float w10;
        ArrayList arrayList;
        float f12;
        float f13;
        int i11;
        h4 h4Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.E;
        ArrayList arrayList3 = this.D;
        ArrayList arrayList4 = this.C;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = scroller.getCurrX();
            invalidate();
            this.I = true;
        } else if (this.I && (i10 = this.H) >= 0) {
            c(i10, true, true);
        }
        float f14 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i13 = -1;
        float f15 = 2.1474836E9f;
        int i14 = 0;
        int i15 = -1;
        while (i14 < this.B.size()) {
            int i16 = this.f15394s;
            float f16 = (-this.e) + ((this.f15392n + i16) * i14);
            float f17 = ((i16 / f14) + f16) - measuredWidth;
            float abs = Math.abs(f17);
            if (abs < this.f15394s) {
                f10 = 1.0f - (Math.abs(f17) / this.f15394s);
                f11 = (0.2f * f10) + 1.0f;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            if (i15 == i13 || abs < f15) {
                i15 = i14;
                f15 = abs;
            }
            if (f17 < 0.0f) {
                w10 = ai.c(1.0f, f10, this.f15394s * 0.1f, f16);
            } else {
                w10 = e2.c.w(1.0f, f10, this.f15394s * 0.1f, f16);
            }
            if (w10 > getMeasuredWidth() || this.f15394s + w10 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f15;
                i11 = i15;
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList4.size()) {
                        if (((h4) arrayList4.get(i17)).f15359b == i14) {
                            h4Var = (h4) arrayList4.remove(i17);
                            break;
                        }
                        i17++;
                    } else {
                        h4Var = new h4(this);
                        h4Var.a(i14);
                        h4Var.f15359b = i14;
                        break;
                    }
                }
                float f18 = this.f15394s;
                float f19 = f18 * f11;
                float f20 = this.f15393r;
                float f21 = f11 * f20;
                f12 = measuredWidth;
                float a2 = org.telegram.messenger.y3.a(f19, f18, 2.0f, w10);
                float a10 = org.telegram.messenger.y3.a(f21, f20, 2.0f, this.f15396x);
                if (this.f15397y == 0.0f || i14 == (i12 = this.H)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f15;
                    i11 = i15;
                    h4Var.f15358a.setImageCoords(a2, a10, f19, f21);
                } else {
                    f13 = f15;
                    i11 = i15;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    h4Var.f15358a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i14 - i12), a2, this.f15397y), AndroidUtilities.lerp(this.f15388a, a10, this.f15397y), AndroidUtilities.lerp(this.f15389b, f19, this.f15397y), AndroidUtilities.lerp(this.f15390c, f21, this.f15397y));
                }
                if (this.f15397y != 1.0f && i14 == this.H) {
                    arrayList3 = arrayList2;
                } else {
                    ImageReceiver imageReceiver = h4Var.f15358a;
                    imageReceiver.draw(canvas);
                    if (h4Var.f15360c != null) {
                        int y10 = (int) e2.c.y(f10, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(y10);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.G / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - h4Var.f15360c.getHeight());
                        h4Var.d.setAlpha(y10);
                        h4Var.f15360c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(h4Var);
            }
            i14++;
            f15 = f13;
            measuredWidth = f12;
            i15 = i11;
            arrayList4 = arrayList;
            f14 = 2.0f;
            i13 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.J == null && this.H != i15) {
            this.H = i15;
            b(i15);
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            ((h4) arrayList5.get(i18)).f15358a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.D;
        super.onMeasure(i10, i11);
        this.f15392n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f15393r = dp;
        int i12 = (int) ((dp / 16.0f) * 9.0f);
        this.f15394s = i12;
        float dp2 = i12 - AndroidUtilities.dp(8.0f);
        this.f15396x = ((AndroidUtilities.dp(180.0f) - this.f15393r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f15395w >= 0 && getMeasuredWidth() > 0) {
            this.H = -1;
            c(this.f15395w, false, false);
            this.f15395w = -1;
        }
        if (this.G != dp2) {
            this.G = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((h4) arrayList.get(i13)).a(((h4) arrayList.get(i13)).f15359b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        this.F.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i10 = this.H) >= 0) {
            c(i10, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.f15397y == f10) {
            return;
        }
        this.f15397y = f10;
        invalidate();
    }
}
