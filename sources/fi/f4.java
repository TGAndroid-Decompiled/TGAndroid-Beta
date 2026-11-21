package fi;

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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
public abstract class f4 extends View {
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
    public int f11971a;
    public int f11972b;
    public int f11973c;
    public Scroller d;
    public float f11974e;
    public float f11975f;
    public float h;
    public int f11976n;
    public int f11977r;
    public int f11978s;
    public boolean f11979w;
    public int f11980x;
    public float f11981y;

    public static void a(f4 f4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i7;
        String str;
        if (storyViews == null) {
            i7 = 0;
        } else {
            i7 = storyViews.views_count;
        }
        if (i7 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new nq(2131232426, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(i7, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new nq(2131231964, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(storyViews.reactions_count, 0));
            }
        }
    }

    public abstract void b(int i7);

    public final void c(int i7, boolean z10, boolean z11) {
        if ((this.L != i7 || z11) && getMeasuredHeight() > 0) {
            if (this.L != i7) {
                this.L = i7;
                b(i7);
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
                int i10 = this.f11978s;
                this.f11974e = (i10 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i10 + this.f11976n) * i7);
                invalidate();
                return;
            }
            int i11 = this.f11978s;
            float f10 = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f11976n) * i7);
            float f11 = this.f11974e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new d4(this, 0));
            this.N.addListener(new ai.k0(this, 14));
            this.N.setInterpolator(nr.f37956f);
            this.N.setDuration(200L);
            this.N.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f11978s;
        this.f11975f = (-(measuredWidth - i7)) / 2.0f;
        int i10 = i7 + this.f11976n;
        this.h = ((getMeasuredWidth() - this.f11978s) / 2.0f) + (((this.F.size() * i10) - this.f11976n) - getMeasuredWidth());
    }

    public e4 getCenteredImageReciever() {
        ArrayList arrayList = this.H;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((e4) arrayList.get(i7)).f11923b == this.L) {
                return (e4) arrayList.get(i7);
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
        this.f11979w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.H;
        super.onDetachedFromWindow();
        this.f11979w = false;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((e4) arrayList.get(i7)).f11922a.R();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i7;
        float f10;
        float f11;
        float z10;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        e4 e4Var;
        ArrayList arrayList2;
        int i11;
        GradientDrawable gradientDrawable = this.I;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.G;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.f11974e = scroller.getCurrX();
            invalidate();
            this.M = true;
        } else if (this.M && (i7 = this.L) >= 0) {
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
        while (i14 < this.F.size()) {
            int i15 = this.f11978s;
            float f17 = (-this.f11974e) + ((this.f11976n + i15) * i14);
            float f18 = ((i15 / f15) + f17) - measuredWidth;
            float abs = Math.abs(f18);
            if (abs < this.f11978s) {
                f11 = 1.0f - (Math.abs(f18) / this.f11978s);
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
                z10 = com.google.android.gms.internal.vision.e2.t(1.0f, f11, this.f11978s * 0.1f, f17);
            } else {
                z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f11, this.f11978s * 0.1f, f17);
            }
            if (z10 > getMeasuredWidth() || this.f11978s + z10 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f16;
                i10 = i13;
                f14 = 2.0f;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList4.size()) {
                        if (((e4) arrayList4.get(i16)).f11923b == i14) {
                            e4Var = (e4) arrayList4.remove(i16);
                            break;
                        }
                        i16++;
                    } else {
                        e4Var = new e4(this);
                        e4Var.a(i14);
                        e4Var.f11923b = i14;
                        break;
                    }
                }
                float f19 = this.f11978s;
                float f20 = f19 * f10;
                float f21 = this.f11977r;
                float f22 = f10 * f21;
                f12 = measuredWidth;
                float y10 = org.telegram.messenger.f3.y(f20, f19, 2.0f, z10);
                float y11 = org.telegram.messenger.f3.y(f22, f21, 2.0f, this.f11981y);
                if (this.E == 0.0f || i14 == (i11 = this.L)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f16;
                    i10 = i13;
                    e4Var.f11922a.y0(y10, y11, f20, f22);
                } else {
                    f13 = f16;
                    i10 = i13;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    e4Var.f11922a.y0(org.telegram.messenger.g0.T1(getMeasuredWidth() * (i14 - i11), y10, this.E), org.telegram.messenger.g0.T1(this.f11971a, y11, this.E), org.telegram.messenger.g0.T1(this.f11972b, f20, this.E), org.telegram.messenger.g0.T1(this.f11973c, f22, this.E));
                }
                if (this.E != 1.0f && i14 == this.L) {
                    arrayList3 = arrayList2;
                    f14 = 2.0f;
                } else {
                    ImageReceiver imageReceiver = e4Var.f11922a;
                    imageReceiver.h(canvas, null);
                    if (e4Var.f11924c != null) {
                        int B = (int) com.google.android.gms.internal.vision.e2.B(f11, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.A() - org.telegram.messenger.g0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f14 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.K / 2.0f), (imageReceiver.A() - org.telegram.messenger.g0.L(8.0f)) - e4Var.f11924c.getHeight());
                        e4Var.d.setAlpha(B);
                        e4Var.f11924c.draw(canvas);
                        canvas.restore();
                    } else {
                        f14 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(e4Var);
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
            ((e4) arrayList5.get(i17)).f11922a.R();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.H;
        super.onMeasure(i7, i10);
        this.f11976n = org.telegram.messenger.g0.L(8.0f);
        int L = (int) (org.telegram.messenger.g0.L(180.0f) / 1.2f);
        this.f11977r = L;
        int i11 = (int) ((L / 16.0f) * 9.0f);
        this.f11978s = i11;
        float L2 = i11 - org.telegram.messenger.g0.L(8.0f);
        this.f11981y = ((org.telegram.messenger.g0.L(180.0f) - this.f11977r) / 2.0f) + org.telegram.messenger.g0.L(20.0f);
        d();
        if (this.f11980x >= 0 && getMeasuredWidth() > 0) {
            this.L = -1;
            c(this.f11980x, false, false);
            this.f11980x = -1;
        }
        if (this.K != L2) {
            this.K = L2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((e4) arrayList.get(i12)).a(((e4) arrayList.get(i12)).f11923b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        this.J.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i7 = this.L) >= 0) {
            c(i7, true, true);
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
