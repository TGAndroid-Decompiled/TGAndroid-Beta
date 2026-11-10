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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;
public abstract class t extends FrameLayout {
    public final Paint f14950a;
    public final Paint f14951b;
    public final v5 f14952c;
    public final y4 d;
    public wa f14953e;
    public final r[] f14954f;
    public r h;
    public c20 f14955n;
    public Runnable f14956r;

    public t(Context context, h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f14950a = paint;
        Paint paint2 = new Paint(1);
        this.f14951b = paint2;
        wq wqVar = wq.h;
        this.f14952c = new v5(this, 0L, 320L, wqVar);
        this.d = new y4(this, 320L, wqVar, 0);
        wa waVar = new wa((char) 0, 11);
        waVar.f701c = new Object();
        waVar.d = new Object();
        this.f14953e = waVar;
        this.f14954f = r2;
        setWillNotDraw(false);
        paint2.setColor(m6.r1(0.1f, -16777216));
        wa waVar2 = this.f14953e;
        int w02 = m6.w0(m6.f27890d6, h6Var);
        waVar2.f700b = w02;
        paint.setColor(w02);
        r[] rVarArr = {new r(this), new r(this)};
    }

    public static void b(org.telegram.ui.Components.h6 h6Var, s sVar, boolean z9) {
        h6Var.a();
        if (sVar.f14942f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.f14941e);
            spannableStringBuilder.setSpan(new q5(sVar.f14942f, 1.4f, h6Var.f34185a.getFontMetricsInt()), 0, 1, 33);
            h6Var.t(spannableStringBuilder, z9, true);
            return;
        }
        h6Var.t(sVar.f14941e, z9, true);
    }

    public final r a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f14954f;
            if (i7 < rVarArr.length) {
                wa waVar = this.f14953e;
                if (i7 == 0) {
                    obj = waVar.f701c;
                } else {
                    obj = waVar.d;
                }
                s sVar = (s) obj;
                if (rVarArr[i7].f14907a.contains(f10, f11) && sVar.f14938a && sVar.f14939b) {
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
        org.telegram.ui.Components.h6 h6Var;
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
        float height = getHeight() - this.f14952c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f14951b);
        int a10 = this.d.a(this.f14953e.f700b, false);
        Paint paint = this.f14950a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((s) this.f14953e.d).f14944i;
        r[] rVarArr = this.f14954f;
        int i13 = 1;
        if (rVarArr[1].f14908b.f38854c < rVarArr[0].f14908b.f38854c) {
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
            wa waVar = this.f14953e;
            if (i14 == 0) {
                obj = waVar.f701c;
            } else {
                obj = waVar.d;
            }
            s sVar = (s) obj;
            v5 v5Var = rVar.f14908b;
            org.telegram.ui.Components.voip.n nVar = rVar.f14920p;
            Paint paint2 = rVar.f14915k;
            v5 v5Var2 = rVar.f14910e;
            v5 v5Var3 = rVar.d;
            v5 v5Var4 = rVar.f14909c;
            org.telegram.ui.Cells.y yVar2 = rVar.f14918n;
            r[] rVarArr2 = rVarArr;
            cp cpVar = rVar.f14919o;
            float f15 = f14;
            y4 y4Var = rVar.f14912g;
            int i15 = i7;
            org.telegram.ui.Components.h6 h6Var2 = rVar.f14916l;
            int i16 = i14;
            RectF rectF = rVar.f14907a;
            float d = v5Var.d(sVar.f14938a);
            if (!sVar.f14938a) {
                e10 = v5Var4.f38854c;
                h6Var = h6Var2;
            } else {
                wa waVar2 = this.f14953e;
                h6Var = h6Var2;
                if (((s) waVar2.d).f14938a && ((s) waVar2.f701c).f14938a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                e10 = v5Var4.e(false, f10);
            }
            if (!sVar.f14938a) {
                e11 = v5Var3.f38854c;
            } else {
                wa waVar3 = this.f14953e;
                if (((s) waVar3.d).f14938a && ((s) waVar3.f701c).f14938a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                e11 = v5Var3.e(false, f11);
            }
            if (!sVar.f14938a) {
                e12 = v5Var2.f38854c;
            } else {
                wa waVar4 = this.f14953e;
                if (((s) waVar4.d).f14938a && ((s) waVar4.f701c).f14938a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e12 = v5Var2.e(false, f12);
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12) / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + T1;
            float L = org.telegram.messenger.g0.L(44.0f) / 2.0f;
            float W1 = f15 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d2 = rVar.h.d(sVar.f14940c);
            float d10 = rVar.f14913i.d(sVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * rVar.f14914j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(m6.r1(d, rVar.f14911f.a(sVar.f14943g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f17 = f16 * d;
                int r12 = m6.r1(f17, y4Var.a(sVar.h, false));
                org.telegram.ui.Components.h6 h6Var3 = h6Var;
                if (h6Var3.Z != r12) {
                    h6Var3.Z = r12;
                    str = str2;
                    h6Var3.f34186a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                h6Var3.u(m6.r1(f17, y4Var.a(sVar.h, false)));
                h6Var3.p(rectF);
                h6Var3.draw(canvas);
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
                cpVar.b(m6.r1(d2 * d, y4Var.a(sVar.h, false)));
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
                nVar.b(m6.r1(d * d10, y4Var.a(sVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z9 = false;
            }
            if (rVar.f14917m != m6.r1(0.15f, sVar.h)) {
                int r13 = m6.r1(0.15f, sVar.h);
                rVar.f14917m = r13;
                yVar = yVar2;
                i13 = 1;
                m6.H1(yVar, r13, true);
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
        return this.f14952c.f38854c;
    }

    public int getTotalHeight() {
        int i7;
        wa waVar = this.f14953e;
        boolean z9 = ((s) waVar.f701c).f14938a;
        if (!z9 && !((s) waVar.d).f14938a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z9) {
            s sVar = (s) waVar.d;
            if (sVar.f14938a && ("top".equalsIgnoreCase(sVar.f14944i) || "bottom".equalsIgnoreCase(((s) this.f14953e.d).f14944i))) {
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
                a10.f14914j.c(true);
                this.h.f14918n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f14918n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                r a11 = a(motionEvent.getX(), motionEvent.getY());
                r rVar = this.h;
                if (a11 == rVar && (c20Var = this.f14955n) != null) {
                    if (rVar == this.f14954f[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    c20Var.a(Boolean.valueOf(z9));
                }
            }
            this.h.f14914j.c(false);
            this.h.f14918n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(c20 c20Var) {
        this.f14955n = c20Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f14956r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        r[] rVarArr = this.f14954f;
        r rVar = rVarArr[0];
        if (rVar.f14918n != drawable && rVar.f14919o != drawable) {
            r rVar2 = rVarArr[1];
            if (rVar2.f14918n != drawable && rVar2.f14919o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
