package ei;

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
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x5;
public abstract class x extends FrameLayout {
    public final Paint f8710a;
    public final Paint f8711b;
    public final c6 f8712c;
    public final org.telegram.ui.Components.f5 d;
    public a5.a e;
    public final v[] f8713f;
    public v h;
    public Utilities.Callback f8714n;
    public Runnable f8715r;

    public x(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f8710a = paint;
        Paint paint2 = new Paint(1);
        this.f8711b = paint2;
        qr qrVar = qr.h;
        this.f8712c = new c6(this, 0L, 320L, qrVar);
        this.d = new org.telegram.ui.Components.f5(this, 320L, qrVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.f278c = new Object();
        aVar.d = new Object();
        this.e = aVar;
        this.f8713f = r2;
        setWillNotDraw(false);
        paint2.setColor(i6.l1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int v02 = i6.v0(i6.f18834d6, e6Var);
        aVar2.f277b = v02;
        paint.setColor(v02);
        v[] vVarArr = {new v(this), new v(this)};
    }

    public static void b(m6 m6Var, w wVar, boolean z10) {
        m6Var.b();
        if (wVar.f8691f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) wVar.e);
            spannableStringBuilder.setSpan(new x5(wVar.f8691f, 1.4f, m6Var.f26084a.getFontMetricsInt()), 0, 1, 33);
            m6Var.q(spannableStringBuilder, z10, true);
            return;
        }
        m6Var.q(wVar.e, z10, true);
    }

    public final v a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f8713f;
            if (i10 < vVarArr.length) {
                a5.a aVar = this.e;
                if (i10 == 0) {
                    obj = aVar.f278c;
                } else {
                    obj = aVar.d;
                }
                w wVar = (w) obj;
                if (vVarArr[i10].f8654a.contains(f7, f10) && wVar.f8688a && wVar.f8689b) {
                    return vVarArr[i10];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        Object obj;
        m6 m6Var;
        float f7;
        float d;
        int i11;
        float f10;
        float d10;
        int i12;
        float f11;
        float d11;
        String str;
        org.telegram.ui.Cells.z zVar;
        int i13;
        float height = getHeight() - this.f8712c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f8711b);
        int a2 = this.d.a(this.e.f277b, false);
        Paint paint = this.f8710a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((w) this.e.d).f8693i;
        v[] vVarArr = this.f8713f;
        int i14 = 1;
        if (vVarArr[1].f8655b.f22951c < vVarArr[0].f8655b.f22951c) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i15 = i10;
        while (true) {
            if (i10 != 0) {
                if (i15 < 0) {
                    return;
                }
            } else if (i15 > i14) {
                return;
            }
            v vVar = vVarArr[i15];
            a5.a aVar = this.e;
            if (i15 == 0) {
                obj = aVar.f278c;
            } else {
                obj = aVar.d;
            }
            w wVar = (w) obj;
            c6 c6Var = vVar.f8655b;
            org.telegram.ui.Components.voip.h hVar = vVar.f8666p;
            Paint paint2 = vVar.f8661k;
            c6 c6Var2 = vVar.e;
            c6 c6Var3 = vVar.d;
            c6 c6Var4 = vVar.f8656c;
            org.telegram.ui.Cells.z zVar2 = vVar.f8664n;
            v[] vVarArr2 = vVarArr;
            tp tpVar = vVar.f8665o;
            float f13 = f12;
            org.telegram.ui.Components.f5 f5Var = vVar.f8658g;
            int i16 = i10;
            m6 m6Var2 = vVar.f8662l;
            int i17 = i15;
            RectF rectF = vVar.f8654a;
            float e = c6Var.e(wVar.f8688a);
            if (!wVar.f8688a) {
                d = c6Var4.f22951c;
                m6Var = m6Var2;
            } else {
                a5.a aVar2 = this.e;
                m6Var = m6Var2;
                if (((w) aVar2.d).f8688a && ((w) aVar2.f278c).f8688a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                d = c6Var4.d(f7, false);
            }
            if (!wVar.f8688a) {
                d10 = c6Var3.f22951c;
            } else {
                a5.a aVar3 = this.e;
                if (((w) aVar3.d).f8688a && ((w) aVar3.f278c).f8688a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = c6Var3.d(f10, false);
            }
            if (!wVar.f8688a) {
                d11 = c6Var2.f22951c;
            } else {
                a5.a aVar4 = this.e;
                if (((w) aVar4.d).f8688a && ((w) aVar4.f278c).f8688a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = c6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e7 = vVar.h.e(wVar.f8690c);
            float e10 = vVar.f8659i.e(wVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * vVar.f8660j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(i6.l1(e, vVar.f8657f.a(wVar.f8692g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f14);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f15 = f14 * e;
                int l1 = i6.l1(f15, f5Var.a(wVar.h, false));
                m6 m6Var3 = m6Var;
                if (m6Var3.T != l1) {
                    m6Var3.T = l1;
                    str = str2;
                    m6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                m6Var3.r(i6.l1(f15, f5Var.a(wVar.h, false)));
                m6Var3.m(rectF);
                m6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e7 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e7);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e7) * AndroidUtilities.dp(10.0f));
                tpVar.b(i6.l1(e7 * e, f5Var.a(wVar.h, false)));
                tpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                tpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(i6.l1(e * e10, f5Var.a(wVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (vVar.f8663m != i6.l1(0.15f, wVar.h)) {
                int l12 = i6.l1(0.15f, wVar.h);
                vVar.f8663m = l12;
                zVar = zVar2;
                i14 = 1;
                i6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i14 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            if (i16 != 0) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            i15 = i17 + i13;
            vVarArr = vVarArr2;
            f12 = f13;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f8712c.f22951c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.e;
        boolean z10 = ((w) aVar.f278c).f8688a;
        if (!z10 && !((w) aVar.d).f8688a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            w wVar = (w) aVar.d;
            if (wVar.f8688a && ("top".equalsIgnoreCase(wVar.f8693i) || "bottom".equalsIgnoreCase(((w) this.e.d).f8693i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return AndroidUtilities.dp(58.0f);
        }
        return AndroidUtilities.dp(109.0f);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), vl.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            v a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f8660j.c(true);
                this.h.f8664n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f8664n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                v a10 = a(motionEvent.getX(), motionEvent.getY());
                v vVar = this.h;
                if (a10 == vVar && (callback = this.f8714n) != null) {
                    if (vVar == this.f8713f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f8660j.c(false);
            this.h.f8664n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f8714n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f8715r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        v[] vVarArr = this.f8713f;
        v vVar = vVarArr[0];
        if (vVar.f8664n != drawable && vVar.f8665o != drawable) {
            v vVar2 = vVarArr[1];
            if (vVar2.f8664n != drawable && vVar2.f8665o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
