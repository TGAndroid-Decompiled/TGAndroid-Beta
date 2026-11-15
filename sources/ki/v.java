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
import org.telegram.messenger.i20;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;
public abstract class v extends FrameLayout {
    public final Paint f18590a;
    public final Paint f18591b;
    public final u5 f18592c;
    public final x4 d;
    public xa f18593e;
    public final t[] f18594f;
    public t h;
    public z10 f18595n;
    public Runnable f18596r;

    public v(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f18590a = paint;
        Paint paint2 = new Paint(1);
        this.f18591b = paint2;
        er erVar = er.h;
        this.f18592c = new u5(this, 0L, 320L, erVar);
        this.d = new x4(this, 320L, erVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.f714c = new Object();
        xaVar.d = new Object();
        this.f18593e = xaVar;
        this.f18594f = r2;
        setWillNotDraw(false);
        paint2.setColor(j6.r1(0.1f, -16777216));
        xa xaVar2 = this.f18593e;
        int w02 = j6.w0(j6.f28849d6, e6Var);
        xaVar2.f713b = w02;
        paint.setColor(w02);
        t[] tVarArr = {new t(this), new t(this)};
    }

    public static void b(g6 g6Var, u uVar, boolean z10) {
        g6Var.a();
        if (uVar.f18577f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) uVar.f18576e);
            spannableStringBuilder.setSpan(new p5(uVar.f18577f, 1.4f, g6Var.f34827a.getFontMetricsInt()), 0, 1, 33);
            g6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        g6Var.t(uVar.f18576e, z10, true);
    }

    public final t a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            t[] tVarArr = this.f18594f;
            if (i7 < tVarArr.length) {
                xa xaVar = this.f18593e;
                if (i7 == 0) {
                    obj = xaVar.f714c;
                } else {
                    obj = xaVar.d;
                }
                u uVar = (u) obj;
                if (tVarArr[i7].f18551a.contains(f10, f11) && uVar.f18573a && uVar.f18574b) {
                    return tVarArr[i7];
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
        char c10;
        float f13;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i12;
        float height = getHeight() - this.f18592c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f18591b);
        int a10 = this.d.a(this.f18593e.f713b, false);
        Paint paint = this.f18590a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((u) this.f18593e.d).f18579i;
        t[] tVarArr = this.f18594f;
        int i13 = 1;
        if (tVarArr[1].f18552b.f39903c < tVarArr[0].f18552b.f39903c) {
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
            t tVar = tVarArr[i14];
            xa xaVar = this.f18593e;
            if (i14 == 0) {
                obj = xaVar.f714c;
            } else {
                obj = xaVar.d;
            }
            u uVar = (u) obj;
            u5 u5Var = tVar.f18552b;
            org.telegram.ui.Components.voip.n nVar = tVar.f18564p;
            Paint paint2 = tVar.f18559k;
            u5 u5Var2 = tVar.f18554e;
            u5 u5Var3 = tVar.d;
            u5 u5Var4 = tVar.f18553c;
            org.telegram.ui.Cells.y yVar2 = tVar.f18562n;
            t[] tVarArr2 = tVarArr;
            lp lpVar = tVar.f18563o;
            float f15 = f14;
            x4 x4Var = tVar.f18556g;
            int i15 = i7;
            g6 g6Var2 = tVar.f18560l;
            int i16 = i14;
            RectF rectF = tVar.f18551a;
            float d = u5Var.d(uVar.f18573a);
            if (!uVar.f18573a) {
                e10 = u5Var4.f39903c;
                g6Var = g6Var2;
            } else {
                xa xaVar2 = this.f18593e;
                g6Var = g6Var2;
                if (((u) xaVar2.d).f18573a && ((u) xaVar2.f714c).f18573a) {
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
            if (!uVar.f18573a) {
                e11 = u5Var3.f39903c;
            } else {
                xa xaVar3 = this.f18593e;
                if (((u) xaVar3.d).f18573a && ((u) xaVar3.f714c).f18573a) {
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
            if (!uVar.f18573a) {
                e12 = u5Var2.f39903c;
            } else {
                xa xaVar4 = this.f18593e;
                if (((u) xaVar4.d).f18573a && ((u) xaVar4.f714c).f18573a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
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
            float d2 = tVar.h.d(uVar.f18575c);
            float d10 = tVar.f18557i.d(uVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * tVar.f18558j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(j6.r1(d, tVar.f18555f.a(uVar.f18578g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f17 = f16 * d;
                int r12 = j6.r1(f17, x4Var.a(uVar.h, false));
                g6 g6Var3 = g6Var;
                if (g6Var3.f34828a0 != r12) {
                    g6Var3.f34828a0 = r12;
                    str = str2;
                    g6Var3.f34830b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                g6Var3.u(j6.r1(f17, x4Var.a(uVar.h, false)));
                g6Var3.p(rectF);
                g6Var3.draw(canvas);
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
                lpVar.b(j6.r1(d2 * d, x4Var.a(uVar.h, false)));
                lpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                lpVar.draw(canvas);
                canvas.restore();
                f13 = 0.0f;
            } else {
                c10 = 0;
                f13 = 0.0f;
            }
            if (d10 > f13) {
                z10 = false;
                nVar.b(j6.r1(d * d10, x4Var.a(uVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (tVar.f18561m != j6.r1(0.15f, uVar.h)) {
                int r13 = j6.r1(0.15f, uVar.h);
                tVar.f18561m = r13;
                yVar = yVar2;
                i13 = 1;
                j6.H1(yVar, r13, true);
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
            i7 = i15;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f18592c.f39903c;
    }

    public int getTotalHeight() {
        int i7;
        xa xaVar = this.f18593e;
        boolean z10 = ((u) xaVar.f714c).f18573a;
        if (!z10 && !((u) xaVar.d).f18573a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z10) {
            u uVar = (u) xaVar.d;
            if (uVar.f18573a && ("top".equalsIgnoreCase(uVar.f18579i) || "bottom".equalsIgnoreCase(((u) this.f18593e.d).f18579i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i20.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z10 z10Var;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            t a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f18558j.c(true);
                this.h.f18562n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18562n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t a11 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (a11 == tVar && (z10Var = this.f18595n) != null) {
                    if (tVar == this.f18594f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z10Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f18558j.c(false);
            this.h.f18562n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(z10 z10Var) {
        this.f18595n = z10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f18596r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        t[] tVarArr = this.f18594f;
        t tVar = tVarArr[0];
        if (tVar.f18562n != drawable && tVar.f18563o != drawable) {
            t tVar2 = tVarArr[1];
            if (tVar2.f18562n != drawable && tVar2.f18563o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
