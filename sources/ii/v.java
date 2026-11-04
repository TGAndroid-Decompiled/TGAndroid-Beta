package ii;

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
import b8.kg;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;
public abstract class v extends FrameLayout {
    public final Paint f15258a;
    public final Paint f15259b;
    public final u5 f15260c;
    public final x4 d;
    public kg f15261e;
    public final t[] f15262f;
    public t h;
    public u10 f15263n;
    public Runnable f15264r;

    public v(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f15258a = paint;
        Paint paint2 = new Paint(1);
        this.f15259b = paint2;
        xq xqVar = xq.h;
        this.f15260c = new u5(this, 0L, 320L, xqVar);
        this.d = new x4(this, 320L, xqVar, 0);
        kg kgVar = new kg((char) 0, 10);
        kgVar.f2723c = new Object();
        kgVar.d = new Object();
        this.f15261e = kgVar;
        this.f15262f = r2;
        setWillNotDraw(false);
        paint2.setColor(k6.r1(0.1f, -16777216));
        kg kgVar2 = this.f15261e;
        int w02 = k6.w0(k6.f27878d6, e6Var);
        kgVar2.f2722b = w02;
        paint.setColor(w02);
        t[] tVarArr = {new t(this), new t(this)};
    }

    public static void b(g6 g6Var, u uVar, boolean z10) {
        g6Var.a();
        if (uVar.f15246f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) uVar.f15245e);
            spannableStringBuilder.setSpan(new p5(uVar.f15246f, 1.4f, g6Var.f33981a.getFontMetricsInt()), 0, 1, 33);
            g6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        g6Var.t(uVar.f15245e, z10, true);
    }

    public final t a(float f10, float f11) {
        Object obj;
        int i3 = 0;
        while (true) {
            t[] tVarArr = this.f15262f;
            if (i3 < tVarArr.length) {
                kg kgVar = this.f15261e;
                if (i3 == 0) {
                    obj = kgVar.f2723c;
                } else {
                    obj = kgVar.d;
                }
                u uVar = (u) obj;
                if (tVarArr[i3].f15221a.contains(f10, f11) && uVar.f15242a && uVar.f15243b) {
                    return tVarArr[i3];
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        Object obj;
        g6 g6Var;
        float f10;
        float e10;
        int i10;
        float f11;
        float e11;
        int i11;
        float f12;
        float e12;
        String str;
        char c2;
        float f13;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i12;
        float height = getHeight() - this.f15260c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f15259b);
        int a10 = this.d.a(this.f15261e.f2722b, false);
        Paint paint = this.f15258a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((u) this.f15261e.d).f15248i;
        t[] tVarArr = this.f15262f;
        int i13 = 1;
        if (tVarArr[1].f15222b.f38645c < tVarArr[0].f15222b.f38645c) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i14 = i3;
        while (true) {
            if (i3 != 0) {
                if (i14 < 0) {
                    return;
                }
            } else if (i14 > i13) {
                return;
            }
            t tVar = tVarArr[i14];
            kg kgVar = this.f15261e;
            if (i14 == 0) {
                obj = kgVar.f2723c;
            } else {
                obj = kgVar.d;
            }
            u uVar = (u) obj;
            u5 u5Var = tVar.f15222b;
            org.telegram.ui.Components.voip.g gVar = tVar.f15234p;
            Paint paint2 = tVar.f15229k;
            u5 u5Var2 = tVar.f15224e;
            u5 u5Var3 = tVar.d;
            u5 u5Var4 = tVar.f15223c;
            org.telegram.ui.Cells.y yVar2 = tVar.f15232n;
            t[] tVarArr2 = tVarArr;
            cp cpVar = tVar.f15233o;
            float f15 = f14;
            x4 x4Var = tVar.f15226g;
            int i15 = i3;
            g6 g6Var2 = tVar.f15230l;
            int i16 = i14;
            RectF rectF = tVar.f15221a;
            float d = u5Var.d(uVar.f15242a);
            if (!uVar.f15242a) {
                e10 = u5Var4.f38645c;
                g6Var = g6Var2;
            } else {
                kg kgVar2 = this.f15261e;
                g6Var = g6Var2;
                if (((u) kgVar2.d).f15242a && ((u) kgVar2.f2723c).f15242a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                e10 = u5Var4.e(false, f10);
            }
            if (!uVar.f15242a) {
                e11 = u5Var3.f38645c;
            } else {
                kg kgVar3 = this.f15261e;
                if (((u) kgVar3.d).f15242a && ((u) kgVar3.f2723c).f15242a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                e11 = u5Var3.e(false, f11);
            }
            if (!uVar.f15242a) {
                e12 = u5Var2.f38645c;
            } else {
                kg kgVar4 = this.f15261e;
                if (((u) kgVar4.d).f15242a && ((u) kgVar4.f2723c).f15242a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e12 = u5Var2.e(false, f12);
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12) / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + T1;
            float L = org.telegram.messenger.g0.L(44.0f) / 2.0f;
            float W1 = f15 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d10 = tVar.h.d(uVar.f15244c);
            float d11 = tVar.f15227i.d(uVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * tVar.f15228j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(k6.r1(d, tVar.f15225f.a(uVar.f15247g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d10 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d10;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d10);
                float f17 = f16 * d;
                int r12 = k6.r1(f17, x4Var.a(uVar.h, false));
                g6 g6Var3 = g6Var;
                if (g6Var3.Z != r12) {
                    g6Var3.Z = r12;
                    str = str2;
                    g6Var3.f33982a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                g6Var3.u(k6.r1(f17, x4Var.a(uVar.h, false)));
                g6Var3.p(rectF);
                g6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d10 > 0.0f) {
                canvas.save();
                c2 = 0;
                float T15 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d10);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d10) * org.telegram.messenger.g0.L(10.0f));
                cpVar.b(k6.r1(d10 * d, x4Var.a(uVar.h, false)));
                cpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                cpVar.draw(canvas);
                canvas.restore();
                f13 = 0.0f;
            } else {
                c2 = 0;
                f13 = 0.0f;
            }
            if (d11 > f13) {
                z10 = false;
                gVar.b(k6.r1(d * d11, x4Var.a(uVar.h, false)), 64);
                gVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (tVar.f15231m != k6.r1(0.15f, uVar.h)) {
                int r13 = k6.r1(0.15f, uVar.h);
                tVar.f15231m = r13;
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
            tVarArr = tVarArr2;
            f14 = f15;
            i3 = i15;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f15260c.f38645c;
    }

    public int getTotalHeight() {
        int i3;
        kg kgVar = this.f15261e;
        boolean z10 = ((u) kgVar.f2723c).f15242a;
        if (!z10 && !((u) kgVar.d).f15242a) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (z10) {
            u uVar = (u) kgVar.d;
            if (uVar.f15242a && ("top".equalsIgnoreCase(uVar.f15248i) || "bottom".equalsIgnoreCase(((u) this.f15261e.d).f15248i))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        return org.telegram.messenger.g0.L(109.0f);
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), org.telegram.messenger.camera.q.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u10 u10Var;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            t a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f15228j.c(true);
                this.h.f15232n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f15232n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t a11 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (a11 == tVar && (u10Var = this.f15263n) != null) {
                    if (tVar == this.f15262f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u10Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f15228j.c(false);
            this.h.f15232n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(u10 u10Var) {
        this.f15263n = u10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f15264r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        t[] tVarArr = this.f15262f;
        t tVar = tVarArr[0];
        if (tVar.f15232n != drawable && tVar.f15233o != drawable) {
            t tVar2 = tVarArr[1];
            if (tVar2.f15232n != drawable && tVar2.f15233o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
