package ki;

import a8.xa;
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
import org.telegram.messenger.m10;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.x5;
public abstract class t extends FrameLayout {
    public final Paint f19001a;
    public final Paint f19002b;
    public final c6 f19003c;
    public final f5 d;
    public xa f19004e;
    public final r[] f19005f;
    public r h;
    public w10 f19006n;
    public Runnable f19007r;

    public t(Context context, i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f19001a = paint;
        Paint paint2 = new Paint(1);
        this.f19002b = paint2;
        kr krVar = kr.h;
        this.f19003c = new c6(this, 0L, 320L, krVar);
        this.d = new f5(this, 320L, krVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.f714c = new Object();
        xaVar.d = new Object();
        this.f19004e = xaVar;
        this.f19005f = r2;
        setWillNotDraw(false);
        paint2.setColor(n6.r1(0.1f, -16777216));
        xa xaVar2 = this.f19004e;
        int w02 = n6.w0(n6.f29451d6, i6Var);
        xaVar2.f713b = w02;
        paint.setColor(w02);
        r[] rVarArr = {new r(this), new r(this)};
    }

    public static void b(m6 m6Var, s sVar, boolean z10) {
        m6Var.a();
        if (sVar.f18974f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.f18973e);
            spannableStringBuilder.setSpan(new x5(sVar.f18974f, 1.4f, m6Var.f37392a.getFontMetricsInt()), 0, 1, 33);
            m6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        m6Var.t(sVar.f18973e, z10, true);
    }

    public final r a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f19005f;
            if (i7 < rVarArr.length) {
                xa xaVar = this.f19004e;
                if (i7 == 0) {
                    obj = xaVar.f714c;
                } else {
                    obj = xaVar.d;
                }
                s sVar = (s) obj;
                if (rVarArr[i7].f18948a.contains(f10, f11) && sVar.f18970a && sVar.f18971b) {
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
        m6 m6Var;
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
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i12;
        float height = getHeight() - this.f19003c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f19002b);
        int a10 = this.d.a(this.f19004e.f713b, false);
        Paint paint = this.f19001a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((s) this.f19004e.d).f18976i;
        r[] rVarArr = this.f19005f;
        int i13 = 1;
        if (rVarArr[1].f18949b.f33931c < rVarArr[0].f18949b.f33931c) {
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
            xa xaVar = this.f19004e;
            if (i14 == 0) {
                obj = xaVar.f714c;
            } else {
                obj = xaVar.d;
            }
            s sVar = (s) obj;
            c6 c6Var = rVar.f18949b;
            org.telegram.ui.Components.voip.n nVar = rVar.f18961p;
            Paint paint2 = rVar.f18956k;
            c6 c6Var2 = rVar.f18951e;
            c6 c6Var3 = rVar.d;
            c6 c6Var4 = rVar.f18950c;
            org.telegram.ui.Cells.y yVar2 = rVar.f18959n;
            r[] rVarArr2 = rVarArr;
            rp rpVar = rVar.f18960o;
            float f15 = f14;
            f5 f5Var = rVar.f18953g;
            int i15 = i7;
            m6 m6Var2 = rVar.f18957l;
            int i16 = i14;
            RectF rectF = rVar.f18948a;
            float d = c6Var.d(sVar.f18970a);
            if (!sVar.f18970a) {
                e10 = c6Var4.f33931c;
                m6Var = m6Var2;
            } else {
                xa xaVar2 = this.f19004e;
                m6Var = m6Var2;
                if (((s) xaVar2.d).f18970a && ((s) xaVar2.f714c).f18970a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                e10 = c6Var4.e(false, f10);
            }
            if (!sVar.f18970a) {
                e11 = c6Var3.f33931c;
            } else {
                xa xaVar3 = this.f19004e;
                if (((s) xaVar3.d).f18970a && ((s) xaVar3.f714c).f18970a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                e11 = c6Var3.e(false, f11);
            }
            if (!sVar.f18970a) {
                e12 = c6Var2.f33931c;
            } else {
                xa xaVar4 = this.f19004e;
                if (((s) xaVar4.d).f18970a && ((s) xaVar4.f714c).f18970a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e12 = c6Var2.e(false, f12);
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12) / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + T1;
            float L = org.telegram.messenger.g0.L(44.0f) / 2.0f;
            float W1 = f15 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d2 = rVar.h.d(sVar.f18972c);
            float d10 = rVar.f18954i.d(sVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * rVar.f18955j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(n6.r1(d, rVar.f18952f.a(sVar.f18975g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f17 = f16 * d;
                int r12 = n6.r1(f17, f5Var.a(sVar.h, false));
                m6 m6Var3 = m6Var;
                if (m6Var3.f37393a0 != r12) {
                    m6Var3.f37393a0 = r12;
                    str = str2;
                    m6Var3.f37395b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                m6Var3.u(n6.r1(f17, f5Var.a(sVar.h, false)));
                m6Var3.p(rectF);
                m6Var3.draw(canvas);
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
                rpVar.b(n6.r1(d2 * d, f5Var.a(sVar.h, false)));
                rpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                rpVar.draw(canvas);
                canvas.restore();
                f13 = 0.0f;
            } else {
                c10 = 0;
                f13 = 0.0f;
            }
            if (d10 > f13) {
                z10 = false;
                nVar.b(n6.r1(d * d10, f5Var.a(sVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (rVar.f18958m != n6.r1(0.15f, sVar.h)) {
                int r13 = n6.r1(0.15f, sVar.h);
                rVar.f18958m = r13;
                yVar = yVar2;
                i13 = 1;
                n6.H1(yVar, r13, true);
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
        return this.f19003c.f33931c;
    }

    public int getTotalHeight() {
        int i7;
        xa xaVar = this.f19004e;
        boolean z10 = ((s) xaVar.f714c).f18970a;
        if (!z10 && !((s) xaVar.d).f18970a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z10) {
            s sVar = (s) xaVar.d;
            if (sVar.f18970a && ("top".equalsIgnoreCase(sVar.f18976i) || "bottom".equalsIgnoreCase(((s) this.f19004e.d).f18976i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), m10.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w10 w10Var;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            r a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f18955j.c(true);
                this.h.f18959n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18959n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                r a11 = a(motionEvent.getX(), motionEvent.getY());
                r rVar = this.h;
                if (a11 == rVar && (w10Var = this.f19006n) != null) {
                    if (rVar == this.f19005f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w10Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f18955j.c(false);
            this.h.f18959n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(w10 w10Var) {
        this.f19006n = w10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f19007r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        r[] rVarArr = this.f19005f;
        r rVar = rVarArr[0];
        if (rVar.f18959n != drawable && rVar.f18960o != drawable) {
            r rVar2 = rVarArr[1];
            if (rVar2.f18959n != drawable && rVar2.f18960o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
