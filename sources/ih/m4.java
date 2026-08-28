package ih;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
public abstract class m4 extends View {
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public GradientDrawable D;
    public GestureDetector E;
    public float F;
    public int G;
    public boolean H;
    public ValueAnimator I;
    public int f11756a;
    public int f11757b;
    public int f11758c;
    public Scroller d;
    public float f11759e;
    public float f11760f;
    public float h;
    public int f11761n;
    public int f11762r;
    public int f11763s;
    public boolean v;
    public int f11764w;
    public float f11765x;
    public float f11766y;

    public static void a(m4 m4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i9;
        String str;
        if (storyViews == null) {
            i9 = 0;
        } else {
            i9 = storyViews.views_count;
        }
        if (i9 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new eq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i9, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new eq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
            }
        }
    }

    public abstract void b(int i9);

    public final void c(int i9, boolean z10, boolean z11) {
        if ((this.G != i9 || z11) && getMeasuredHeight() > 0) {
            if (this.G != i9) {
                this.G = i9;
                b(i9);
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
                int i10 = this.f11763s;
                this.f11759e = (i10 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i10 + this.f11761n) * i9);
                invalidate();
                return;
            }
            int i11 = this.f11763s;
            float f10 = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f11761n) * i9);
            float f11 = this.f11759e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new f2.f0(this, 1));
            this.I.addListener(new ag.e(this, 16));
            this.I.setInterpolator(gr.f28844f);
            this.I.setDuration(200L);
            this.I.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i9 = this.f11763s;
        this.f11760f = (-(measuredWidth - i9)) / 2.0f;
        int i10 = i9 + this.f11761n;
        this.h = ((getMeasuredWidth() - this.f11763s) / 2.0f) + (((this.A.size() * i10) - this.f11761n) - getMeasuredWidth());
    }

    public l4 getCenteredImageReciever() {
        ArrayList arrayList = this.C;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((l4) arrayList.get(i9)).f11707b == this.G) {
                return (l4) arrayList.get(i9);
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
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((l4) arrayList.get(i9)).f11706a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i9;
        float f10;
        float f11;
        float z10;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        l4 l4Var;
        ArrayList arrayList2;
        int i11;
        GradientDrawable gradientDrawable = this.D;
        ArrayList arrayList3 = this.C;
        ArrayList arrayList4 = this.B;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f11759e = scroller.getCurrX();
            invalidate();
            this.H = true;
        } else if (this.H && (i9 = this.G) >= 0) {
            c(i9, true, true);
        }
        float f14 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i12 = -1;
        float f15 = 2.1474836E9f;
        int i13 = 0;
        int i14 = -1;
        while (i13 < this.A.size()) {
            int i15 = this.f11763s;
            float f16 = (-this.f11759e) + ((this.f11761n + i15) * i13);
            float f17 = ((i15 / f14) + f16) - measuredWidth;
            float abs = Math.abs(f17);
            if (abs < this.f11763s) {
                f10 = 1.0f - (Math.abs(f17) / this.f11763s);
                f11 = (0.2f * f10) + 1.0f;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            if (i14 == i12 || abs < f15) {
                i14 = i13;
                f15 = abs;
            }
            if (f17 < 0.0f) {
                z10 = j3.r0.C(1.0f, f10, this.f11763s * 0.1f, f16);
            } else {
                z10 = e2.c.z(1.0f, f10, this.f11763s * 0.1f, f16);
            }
            if (z10 > getMeasuredWidth() || this.f11763s + z10 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f15;
                i10 = i14;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList4.size()) {
                        if (((l4) arrayList4.get(i16)).f11707b == i13) {
                            l4Var = (l4) arrayList4.remove(i16);
                            break;
                        }
                        i16++;
                    } else {
                        l4Var = new l4(this);
                        l4Var.a(i13);
                        l4Var.f11707b = i13;
                        break;
                    }
                }
                float f18 = this.f11763s;
                float f19 = f18 * f11;
                float f20 = this.f11762r;
                float f21 = f11 * f20;
                f12 = measuredWidth;
                float a2 = org.telegram.messenger.l0.a(f19, f18, 2.0f, z10);
                float a3 = org.telegram.messenger.l0.a(f21, f20, 2.0f, this.f11765x);
                if (this.f11766y == 0.0f || i13 == (i11 = this.G)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f15;
                    i10 = i14;
                    l4Var.f11706a.setImageCoords(a2, a3, f19, f21);
                } else {
                    f13 = f15;
                    i10 = i14;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    l4Var.f11706a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i13 - i11), a2, this.f11766y), AndroidUtilities.lerp(this.f11756a, a3, this.f11766y), AndroidUtilities.lerp(this.f11757b, f19, this.f11766y), AndroidUtilities.lerp(this.f11758c, f21, this.f11766y));
                }
                if (this.f11766y != 1.0f && i13 == this.G) {
                    arrayList3 = arrayList2;
                } else {
                    ImageReceiver imageReceiver = l4Var.f11706a;
                    imageReceiver.draw(canvas);
                    if (l4Var.f11708c != null) {
                        int B = (int) e2.c.B(f10, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.F / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - l4Var.f11708c.getHeight());
                        l4Var.d.setAlpha(B);
                        l4Var.f11708c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(l4Var);
            }
            i13++;
            f15 = f13;
            measuredWidth = f12;
            i14 = i10;
            arrayList4 = arrayList;
            f14 = 2.0f;
            i12 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.I == null && this.G != i14) {
            this.G = i14;
            b(i14);
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            ((l4) arrayList5.get(i17)).f11706a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ArrayList arrayList = this.C;
        super.onMeasure(i9, i10);
        this.f11761n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.f11762r = dp;
        int i11 = (int) ((dp / 16.0f) * 9.0f);
        this.f11763s = i11;
        float dp2 = i11 - AndroidUtilities.dp(8.0f);
        this.f11765x = ((AndroidUtilities.dp(180.0f) - this.f11762r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.f11764w >= 0 && getMeasuredWidth() > 0) {
            this.G = -1;
            c(this.f11764w, false, false);
            this.f11764w = -1;
        }
        if (this.F != dp2) {
            this.F = dp2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((l4) arrayList.get(i12)).a(((l4) arrayList.get(i12)).f11707b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        this.E.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i9 = this.G) >= 0) {
            c(i9, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.f11766y == f10) {
            return;
        }
        this.f11766y = f10;
        invalidate();
    }
}
