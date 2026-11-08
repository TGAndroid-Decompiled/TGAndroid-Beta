package hi;

import a8.wa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;
public abstract class t extends FrameLayout {
    public final Paint f14948a;
    public final Paint f14949b;
    public final w5 f14950c;
    public final z4 d;
    public wa f14951e;
    public final r[] f14952f;
    public r h;
    public c20 f14953n;
    public Runnable f14954r;

    public t(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f14948a = paint;
        Paint paint2 = new Paint(1);
        this.f14949b = paint2;
        xq xqVar = xq.h;
        this.f14950c = new w5(this, 0L, 320L, xqVar);
        this.d = new z4(this, 320L, xqVar, 0);
        wa waVar = new wa((char) 0, 11);
        waVar.f701c = new Object();
        waVar.d = new Object();
        this.f14951e = waVar;
        this.f14952f = r2;
        setWillNotDraw(false);
        paint2.setColor(k6.r1(0.1f, -16777216));
        wa waVar2 = this.f14951e;
        int w02 = k6.w0(k6.f27852d6, f6Var);
        waVar2.f700b = w02;
        paint.setColor(w02);
        r[] rVarArr = {new r(this), new r(this)};
    }

    public static void b(i6 i6Var, s sVar, boolean z9) {
        i6Var.a();
        if (sVar.f14940f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.f14939e);
            spannableStringBuilder.setSpan(new r5(sVar.f14940f, 1.4f, i6Var.f34550a.getFontMetricsInt()), 0, 1, 33);
            i6Var.t(spannableStringBuilder, z9, true);
            return;
        }
        i6Var.t(sVar.f14939e, z9, true);
    }

    public final r a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f14952f;
            if (i7 < rVarArr.length) {
                wa waVar = this.f14951e;
                if (i7 == 0) {
                    obj = waVar.f701c;
                } else {
                    obj = waVar.d;
                }
                s sVar = (s) obj;
                if (rVarArr[i7].f14905a.contains(f10, f11) && sVar.f14936a && sVar.f14937b) {
                    return rVarArr[i7];
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        Object obj;
        i6 i6Var;
        float f10;
        float e10;
        int i10;
        float f11;
        float e11;
        int i11;
        float f12;
        float e12;
        String str;
        char c10;
        float f13;
        boolean z9;
        org.telegram.ui.Cells.y yVar;
        int i12;
        float height = getHeight() - this.f14950c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f14949b);
        int a10 = this.d.a(this.f14951e.f700b, false);
        Paint paint = this.f14948a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((s) this.f14951e.d).f14942i;
        r[] rVarArr = this.f14952f;
        int i13 = 1;
        if (rVarArr[1].f14906b.f39805c < rVarArr[0].f14906b.f39805c) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i14 = i7;
        while (true) {
            if (i7 != 0) {
                if (i14 < 0) {
                    return;
                }
            } else if (i14 > i13) {
                return;
            }
            r rVar = rVarArr[i14];
            wa waVar = this.f14951e;
            if (i14 == 0) {
                obj = waVar.f701c;
            } else {
                obj = waVar.d;
            }
            s sVar = (s) obj;
            w5 w5Var = rVar.f14906b;
            org.telegram.ui.Components.voip.n nVar = rVar.f14918p;
            Paint paint2 = rVar.f14913k;
            w5 w5Var2 = rVar.f14908e;
            w5 w5Var3 = rVar.d;
            w5 w5Var4 = rVar.f14907c;
            org.telegram.ui.Cells.y yVar2 = rVar.f14916n;
            r[] rVarArr2 = rVarArr;
            cp cpVar = rVar.f14917o;
            float f15 = f14;
            z4 z4Var = rVar.f14910g;
            int i15 = i7;
            i6 i6Var2 = rVar.f14914l;
            int i16 = i14;
            RectF rectF = rVar.f14905a;
            float d = w5Var.d(sVar.f14936a);
            if (!sVar.f14936a) {
                e10 = w5Var4.f39805c;
                i6Var = i6Var2;
            } else {
                wa waVar2 = this.f14951e;
                i6Var = i6Var2;
                if (((s) waVar2.d).f14936a && ((s) waVar2.f701c).f14936a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                e10 = w5Var4.e(false, f10);
            }
            if (!sVar.f14936a) {
                e11 = w5Var3.f39805c;
            } else {
                wa waVar3 = this.f14951e;
                if (((s) waVar3.d).f14936a && ((s) waVar3.f701c).f14936a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                e11 = w5Var3.e(false, f11);
            }
            if (!sVar.f14936a) {
                e12 = w5Var2.f39805c;
            } else {
                wa waVar4 = this.f14951e;
                if (((s) waVar4.d).f14936a && ((s) waVar4.f701c).f14936a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e12 = w5Var2.e(false, f12);
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12) / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + T1;
            float L = org.telegram.messenger.g0.L(44.0f) / 2.0f;
            float W1 = f15 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d2 = rVar.h.d(sVar.f14938c);
            float d10 = rVar.f14911i.d(sVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * rVar.f14912j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(k6.r1(d, rVar.f14909f.a(sVar.f14941g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f17 = f16 * d;
                int r12 = k6.r1(f17, z4Var.a(sVar.h, false));
                i6 i6Var3 = i6Var;
                if (i6Var3.Z != r12) {
                    i6Var3.Z = r12;
                    str = str2;
                    i6Var3.f34551a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                i6Var3.u(k6.r1(f17, z4Var.a(sVar.h, false)));
                i6Var3.p(rectF);
                i6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d2 > 0.0f) {
                canvas.save();
                c10 = 0;
                float T15 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d2);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d2) * org.telegram.messenger.g0.L(10.0f));
                cpVar.b(k6.r1(d2 * d, z4Var.a(sVar.h, false)));
                cpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                cpVar.draw(canvas);
                canvas.restore();
                f13 = 0.0f;
            } else {
                c10 = 0;
                f13 = 0.0f;
            }
            if (d10 > f13) {
                z9 = false;
                nVar.b(k6.r1(d * d10, z4Var.a(sVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z9 = false;
            }
            if (rVar.f14915m != k6.r1(0.15f, sVar.h)) {
                int r13 = k6.r1(0.15f, sVar.h);
                rVar.f14915m = r13;
                yVar = yVar2;
                i13 = 1;
                k6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i13 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            if (i15 != 0) {
                i12 = -1;
            } else {
                i12 = i13;
            }
            i14 = i16 + i12;
            rVarArr = rVarArr2;
            f14 = f15;
            i7 = i15;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f14950c.f39805c;
    }

    public int getTotalHeight() {
        int i7;
        wa waVar = this.f14951e;
        boolean z9 = ((s) waVar.f701c).f14936a;
        if (!z9 && !((s) waVar.d).f14936a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z9) {
            s sVar = (s) waVar.d;
            if (sVar.f14936a && ("top".equalsIgnoreCase(sVar.f14942i) || "bottom".equalsIgnoreCase(((s) this.f14951e.d).f14942i))) {
                i7++;
            }
        }
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        return org.telegram.messenger.g0.L(109.0f);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.camera.q.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c20 c20Var;
        boolean z9;
        if (motionEvent.getAction() == 0) {
            r a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f14912j.c(true);
                this.h.f14916n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f14916n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                r a11 = a(motionEvent.getX(), motionEvent.getY());
                r rVar = this.h;
                if (a11 == rVar && (c20Var = this.f14953n) != null) {
                    if (rVar == this.f14952f[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    c20Var.a(Boolean.valueOf(z9));
                }
            }
            this.h.f14912j.c(false);
            this.h.f14916n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(c20 c20Var) {
        this.f14953n = c20Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f14954r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        r[] rVarArr = this.f14952f;
        r rVar = rVarArr[0];
        if (rVar.f14916n != drawable && rVar.f14917o != drawable) {
            r rVar2 = rVarArr[1];
            if (rVar2.f14916n != drawable && rVar2.f14917o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
