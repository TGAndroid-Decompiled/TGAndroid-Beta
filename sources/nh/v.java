package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y5;

public abstract class v extends FrameLayout {

    public final Paint f18991a;

    public final Paint f18992b;

    public final y5 f18993c;
    public final b5 d;

    public b6.a f18994e;

    public final t[] f18995f;
    public t h;

    public Utilities.Callback f18996n;

    public Runnable f18997r;

    public v(Context context, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f18991a = paint;
        Paint paint2 = new Paint(1);
        this.f18992b = paint2;
        er erVar = er.h;
        this.f18993c = new y5(this, 0L, 320L, erVar);
        this.d = new b5(this, 320L, erVar, 0);
        b6.a aVar = new b6.a((char) 0, 15);
        aVar.f2033b = new u();
        aVar.d = new u();
        this.f18994e = aVar;
        this.f18995f = new t[]{new t(this), new t(this)};
        setWillNotDraw(false);
        paint2.setColor(g6.l1(0.1f, -16777216));
        b6.a aVar2 = this.f18994e;
        int iV0 = g6.v0(g6.f23053d6, c6Var);
        aVar2.f2034c = iV0;
        paint.setColor(iV0);
    }

    public static void b(i6 i6Var, u uVar, boolean z10) {
        i6Var.b();
        if (uVar.f18981f == 0) {
            i6Var.q(uVar.f18980e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) uVar.f18980e);
        spannableStringBuilder.setSpan(new t5(uVar.f18981f, 1.4f, i6Var.f29238a.getFontMetricsInt()), 0, 1, 33);
        i6Var.q(spannableStringBuilder, z10, true);
    }

    public final t a(float f10, float f11) {
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f18995f;
            if (i10 >= tVarArr.length) {
                return null;
            }
            b6.a aVar = this.f18994e;
            u uVar = (u) (i10 == 0 ? aVar.f2033b : aVar.d);
            if (tVarArr[i10].f18949a.contains(f10, f11) && uVar.f18977a && uVar.f18978b) {
                return tVarArr[i10];
            }
            i10++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float fD;
        float f11;
        float fD2;
        float fD3;
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.f18993c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f18992b);
        int iA = this.d.a(this.f18994e.f2034c, false);
        Paint paint = this.f18991a;
        paint.setColor(iA);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str = ((u) this.f18994e.d).f18983i;
        t[] tVarArr = this.f18995f;
        int i10 = 1;
        int i11 = tVarArr[1].f18950b.f34812c < tVarArr[0].f18950b.f34812c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            t tVar = tVarArr[i12];
            b6.a aVar = this.f18994e;
            u uVar = (u) (i12 == 0 ? aVar.f2033b : aVar.d);
            y5 y5Var = tVar.f18950b;
            org.telegram.ui.Components.voip.h hVar = tVar.f18962p;
            Paint paint2 = tVar.f18957k;
            y5 y5Var2 = tVar.f18952e;
            y5 y5Var3 = tVar.d;
            y5 y5Var4 = tVar.f18951c;
            org.telegram.ui.Cells.z zVar2 = tVar.f18960n;
            t[] tVarArr2 = tVarArr;
            hp hpVar = tVar.f18961o;
            float f13 = f12;
            b5 b5Var = tVar.f18954g;
            int i13 = i11;
            i6 i6Var = tVar.f18958l;
            int i14 = i12;
            RectF rectF = tVar.f18949a;
            float fE = y5Var.e(uVar.f18977a);
            if (uVar.f18977a) {
                b6.a aVar2 = this.f18994e;
                if (((u) aVar2.d).f18977a && ((u) aVar2.f2033b).f18977a) {
                    f10 = (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                fD = y5Var4.d(f10, false);
            } else {
                fD = y5Var4.f34812c;
            }
            if (uVar.f18977a) {
                b6.a aVar3 = this.f18994e;
                if (((u) aVar3.d).f18977a && ((u) aVar3.f2033b).f18977a) {
                    f11 = (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                fD2 = y5Var3.d(f11, false);
            } else {
                fD2 = y5Var3.f34812c;
            }
            if (uVar.f18977a) {
                b6.a aVar4 = this.f18994e;
                fD3 = y5Var2.d((((u) aVar4.d).f18977a && ((u) aVar4.f2033b).f18977a && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) ? 0.0f : 1.0f, false);
            } else {
                fD3 = y5Var2.f34812c;
            }
            float fLerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), fD3);
            float fDp = AndroidUtilities.dp(44.0f);
            float f14 = fLerp / 2.0f;
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), fD) + f14;
            float f15 = fDp / 2.0f;
            float fLerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), fD2) + f15;
            rectF.set(fLerp2 - f14, fLerp3 - f15, f14 + fLerp2, f15 + fLerp3);
            float fE2 = tVar.h.e(uVar.f18979c);
            float fE3 = tVar.f18955i.e(uVar.d);
            canvas.save();
            float fLerp4 = AndroidUtilities.lerp(0.7f, 1.0f, fE) * tVar.f18956j.a(0.02f);
            canvas.scale(fLerp4, fLerp4, fLerp2, fLerp3);
            paint2.setColor(g6.l1(fE, tVar.f18953f.a(uVar.f18982g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (fE2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - fE2;
                float fLerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(fLerp5, fLerp5, fLerp2, fLerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * fE2);
                float f17 = f16 * fE;
                int iL1 = g6.l1(f17, b5Var.a(uVar.h, false));
                if (i6Var.T != iL1) {
                    i6Var.T = iL1;
                    i6Var.U = new PorterDuffColorFilter(iL1, PorterDuff.Mode.SRC_IN);
                }
                i6Var.r(g6.l1(f17, b5Var.a(uVar.h, false)));
                i6Var.m(rectF);
                i6Var.draw(canvas);
                canvas.restore();
            } else {
                str = str;
            }
            if (fE2 > 0.0f) {
                canvas.save();
                float fLerp6 = AndroidUtilities.lerp(0.75f, 1.0f, fE2);
                canvas.scale(fLerp6, fLerp6, fLerp2, fLerp3);
                canvas.translate(0.0f, (1.0f - fE2) * AndroidUtilities.dp(10.0f));
                hpVar.b(g6.l1(fE2 * fE, b5Var.a(uVar.h, false)));
                hpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                hpVar.draw(canvas);
                canvas.restore();
            }
            if (fE3 > 0.0f) {
                hVar.b(g6.l1(fE * fE3, b5Var.a(uVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (tVar.f18959m != g6.l1(0.15f, uVar.h)) {
                int iL2 = g6.l1(0.15f, uVar.h);
                tVar.f18959m = iL2;
                zVar = zVar2;
                i10 = 1;
                g6.B1(zVar, iL2, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            tVarArr = tVarArr2;
            f12 = f13;
            i11 = i13;
            str = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f18993c.f34812c;
    }

    public int getTotalHeight() {
        b6.a aVar = this.f18994e;
        boolean z10 = ((u) aVar.f2033b).f18977a;
        int i10 = (z10 || ((u) aVar.d).f18977a) ? 1 : 0;
        if (z10) {
            u uVar = (u) aVar.d;
            if (uVar.f18977a && ("top".equalsIgnoreCase(uVar.f18983i) || "bottom".equalsIgnoreCase(((u) this.f18994e.d).f18983i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(109.0f);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), rl.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            t tVarA = a(motionEvent.getX(), motionEvent.getY());
            this.h = tVarA;
            if (tVarA != null) {
                tVarA.f18956j.c(true);
                this.h.f18960n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18960n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t tVarA2 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (tVarA2 == tVar && (callback = this.f18996n) != null) {
                    callback.run(Boolean.valueOf(tVar == this.f18995f[0]));
                }
            }
            this.h.f18956j.c(false);
            this.h.f18960n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f18996n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f18997r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        t[] tVarArr = this.f18995f;
        t tVar = tVarArr[0];
        if (tVar.f18960n != drawable && tVar.f18961o != drawable) {
            t tVar2 = tVarArr[1];
            if (tVar2.f18960n != drawable && tVar2.f18961o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
