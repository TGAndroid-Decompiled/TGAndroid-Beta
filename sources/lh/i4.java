package lh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
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
    public int f15715a;
    public int f15716b;
    public int f15717c;
    public Scroller d;
    public float f15718e;
    public float f15719f;
    public float h;
    public int f15720n;
    public int f15721r;
    public int f15722s;
    public boolean v;
    public int f15723w;
    public float f15724x;
    public float f15725y;

    public static void a(i4 i4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i10;
        String str;
        if (storyViews == null) {
            i10 = 0;
        } else {
            i10 = storyViews.views_count;
        }
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new iq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new iq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
            }
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
                int i11 = this.f15722s;
                this.f15718e = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f15720n) * i10);
                invalidate();
                return;
            }
            int i12 = this.f15722s;
            float f9 = (i12 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i12 + this.f15720n) * i10);
            float f10 = this.f15718e;
            if (f9 == f10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new cg.c1(this, 3));
            this.I.addListener(new ag.m0(this, 21));
            this.I.setInterpolator(jr.f29800f);
            this.I.setDuration(200L);
            this.I.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f15722s;
        this.f15719f = (-(measuredWidth - i10)) / 2.0f;
        int i11 = i10 + this.f15720n;
        this.h = ((getMeasuredWidth() - this.f15722s) / 2.0f) + (((this.A.size() * i11) - this.f15720n) - getMeasuredWidth());
    }

    public h4 getCenteredImageReciever() {
        ArrayList arrayList = this.C;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((h4) arrayList.get(i10)).f15659b == this.G) {
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
            ((h4) arrayList.get(i10)).f15658a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i10;
        float f9;
        float f10;
        float z10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i11;
        h4 h4Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.D;
        ArrayList arrayList3 = this.C;
        ArrayList arrayList4 = this.B;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f15718e = scroller.getCurrX();
            invalidate();
            this.H = true;
        } else if (this.H && (i10 = this.G) >= 0) {
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
        while (i14 < this.A.size()) {
            int i16 = this.f15722s;
            float f15 = (-this.f15718e) + ((this.f15720n + i16) * i14);
            float f16 = ((i16 / f13) + f15) - measuredWidth;
            float abs = Math.abs(f16);
            if (abs < this.f15722s) {
                f9 = 1.0f - (Math.abs(f16) / this.f15722s);
                f10 = (0.2f * f9) + 1.0f;
            } else {
                f9 = 0.0f;
                f10 = 1.0f;
            }
            if (i15 == i13 || abs < f14) {
                i15 = i14;
                f14 = abs;
            }
            if (f16 < 0.0f) {
                z10 = th.b(1.0f, f9, this.f15722s * 0.1f, f15);
            } else {
                z10 = com.google.android.recaptcha.internal.a.z(1.0f, f9, this.f15722s * 0.1f, f15);
            }
            if (z10 > getMeasuredWidth() || this.f15722s + z10 < 0.0f) {
                arrayList = arrayList4;
                f11 = measuredWidth;
                f12 = f14;
                i11 = i15;
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList4.size()) {
                        if (((h4) arrayList4.get(i17)).f15659b == i14) {
                            h4Var = (h4) arrayList4.remove(i17);
                            break;
                        }
                        i17++;
                    } else {
                        h4Var = new h4(this);
                        h4Var.a(i14);
                        h4Var.f15659b = i14;
                        break;
                    }
                }
                float f17 = this.f15722s;
                float f18 = f17 * f10;
                float f19 = this.f15721r;
                float f20 = f10 * f19;
                f11 = measuredWidth;
                float a2 = org.telegram.messenger.x3.a(f18, f17, 2.0f, z10);
                float a10 = org.telegram.messenger.x3.a(f20, f19, 2.0f, this.f15724x);
                if (this.f15725y == 0.0f || i14 == (i12 = this.G)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f12 = f14;
                    i11 = i15;
                    h4Var.f15658a.setImageCoords(a2, a10, f18, f20);
                } else {
                    f12 = f14;
                    i11 = i15;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    h4Var.f15658a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i14 - i12), a2, this.f15725y), AndroidUtilities.lerp(this.f15715a, a10, this.f15725y), AndroidUtilities.lerp(this.f15716b, f18, this.f15725y), AndroidUtilities.lerp(this.f15717c, f20, this.f15725y));
                }
                if (this.f15725y != 1.0f && i14 == this.G) {
                    arrayList3 = arrayList2;
                } else {
                    ImageReceiver imageReceiver = h4Var.f15658a;
                    imageReceiver.draw(canvas);
                    if (h4Var.f15660c != null) {
                        int B = (int) com.google.android.recaptcha.internal.a.B(f9, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.F / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - h4Var.f15660c.getHeight());
                        h4Var.d.setAlpha(B);
                        h4Var.f15660c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(h4Var);
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
        if (this.I == null && this.G != i15) {
            this.G = i15;
            b(i15);
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            ((h4) arrayList5.get(i18)).f15658a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.C;
        super.onMeasure(i10, i11);
        this.f15720n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f15721r = dp;
        int i12 = (int) ((dp / 16.0f) * 9.0f);
        this.f15722s = i12;
        float dp2 = i12 - AndroidUtilities.dp(8.0f);
        this.f15724x = ((AndroidUtilities.dp(180.0f) - this.f15721r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f15723w >= 0 && getMeasuredWidth() > 0) {
            this.G = -1;
            c(this.f15723w, false, false);
            this.f15723w = -1;
        }
        if (this.F != dp2) {
            this.F = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((h4) arrayList.get(i13)).a(((h4) arrayList.get(i13)).f15659b);
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

    public void setProgressToOpen(float f9) {
        if (this.f15725y == f9) {
            return;
        }
        this.f15725y = f9;
        invalidate();
    }
}
