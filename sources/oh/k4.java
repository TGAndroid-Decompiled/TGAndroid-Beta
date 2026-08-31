package oh;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;
public abstract class k4 extends View {
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public GradientDrawable E;
    public GestureDetector F;
    public float G;
    public int H;
    public boolean I;
    public ValueAnimator J;
    public int f17350a;
    public int f17351b;
    public int f17352c;
    public Scroller d;
    public float f17353e;
    public float f17354f;
    public float h;
    public int f17355n;
    public int f17356r;
    public int f17357s;
    public boolean v;
    public int f17358w;
    public float f17359x;
    public float f17360y;

    public static void a(k4 k4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z4) {
        int i10;
        String str;
        if (storyViews == null) {
            i10 = 0;
        } else {
            i10 = storyViews.views_count;
        }
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new oq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z4) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new oq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
                int i11 = this.f17357s;
                this.f17353e = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f17355n) * i10);
                invalidate();
                return;
            }
            int i12 = this.f17357s;
            float f10 = (i12 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i12 + this.f17355n) * i10);
            float f11 = this.f17353e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new f2.d0(this, 3));
            this.J.addListener(new dg.l0(this, 22));
            this.J.setInterpolator(pr.f30183f);
            this.J.setDuration(200L);
            this.J.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f17357s;
        this.f17354f = (-(measuredWidth - i10)) / 2.0f;
        int i11 = i10 + this.f17355n;
        this.h = ((getMeasuredWidth() - this.f17357s) / 2.0f) + (((this.B.size() * i11) - this.f17355n) - getMeasuredWidth());
    }

    public j4 getCenteredImageReciever() {
        ArrayList arrayList = this.D;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((j4) arrayList.get(i10)).f17331b == this.H) {
                return (j4) arrayList.get(i10);
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
            ((j4) arrayList.get(i10)).f17330a.onDetachedFromWindow();
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
        j4 j4Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.E;
        ArrayList arrayList3 = this.D;
        ArrayList arrayList4 = this.C;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f17353e = scroller.getCurrX();
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
            int i16 = this.f17357s;
            float f16 = (-this.f17353e) + ((this.f17355n + i16) * i14);
            float f17 = ((i16 / f14) + f16) - measuredWidth;
            float abs = Math.abs(f17);
            if (abs < this.f17357s) {
                f10 = 1.0f - (Math.abs(f17) / this.f17357s);
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
                w10 = yh.c(1.0f, f10, this.f17357s * 0.1f, f16);
            } else {
                w10 = e2.c.w(1.0f, f10, this.f17357s * 0.1f, f16);
            }
            if (w10 > getMeasuredWidth() || this.f17357s + w10 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f15;
                i11 = i15;
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList4.size()) {
                        if (((j4) arrayList4.get(i17)).f17331b == i14) {
                            j4Var = (j4) arrayList4.remove(i17);
                            break;
                        }
                        i17++;
                    } else {
                        j4Var = new j4(this);
                        j4Var.a(i14);
                        j4Var.f17331b = i14;
                        break;
                    }
                }
                float f18 = this.f17357s;
                float f19 = f18 * f11;
                float f20 = this.f17356r;
                float f21 = f11 * f20;
                f12 = measuredWidth;
                float a2 = org.telegram.messenger.y3.a(f19, f18, 2.0f, w10);
                float a10 = org.telegram.messenger.y3.a(f21, f20, 2.0f, this.f17359x);
                if (this.f17360y == 0.0f || i14 == (i12 = this.H)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f15;
                    i11 = i15;
                    j4Var.f17330a.setImageCoords(a2, a10, f19, f21);
                } else {
                    f13 = f15;
                    i11 = i15;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    j4Var.f17330a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i14 - i12), a2, this.f17360y), AndroidUtilities.lerp(this.f17350a, a10, this.f17360y), AndroidUtilities.lerp(this.f17351b, f19, this.f17360y), AndroidUtilities.lerp(this.f17352c, f21, this.f17360y));
                }
                if (this.f17360y != 1.0f && i14 == this.H) {
                    arrayList3 = arrayList2;
                } else {
                    ImageReceiver imageReceiver = j4Var.f17330a;
                    imageReceiver.draw(canvas);
                    if (j4Var.f17332c != null) {
                        int y10 = (int) e2.c.y(f10, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(y10);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.G / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - j4Var.f17332c.getHeight());
                        j4Var.d.setAlpha(y10);
                        j4Var.f17332c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(j4Var);
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
            ((j4) arrayList5.get(i18)).f17330a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.D;
        super.onMeasure(i10, i11);
        this.f17355n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f17356r = dp;
        int i12 = (int) ((dp / 16.0f) * 9.0f);
        this.f17357s = i12;
        float dp2 = i12 - AndroidUtilities.dp(8.0f);
        this.f17359x = ((AndroidUtilities.dp(180.0f) - this.f17356r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f17358w >= 0 && getMeasuredWidth() > 0) {
            this.H = -1;
            c(this.f17358w, false, false);
            this.f17358w = -1;
        }
        if (this.G != dp2) {
            this.G = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((j4) arrayList.get(i13)).a(((j4) arrayList.get(i13)).f17331b);
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
        if (this.f17360y == f10) {
            return;
        }
        this.f17360y = f10;
        invalidate();
    }
}
