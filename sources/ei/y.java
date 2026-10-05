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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.z5;
public abstract class y extends FrameLayout {
    public final Paint f9467a;
    public final Paint f9468b;
    public final e6 f9469c;
    public final h5 d;
    public a5.a f9470e;
    public final w[] f9471f;
    public w h;
    public Utilities.Callback f9472n;
    public Runnable f9473r;

    public y(Context context, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9467a = paint;
        Paint paint2 = new Paint(1);
        this.f9468b = paint2;
        tr trVar = tr.h;
        this.f9469c = new e6(this, 0L, 320L, trVar);
        this.d = new h5(this, 320L, trVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.f300c = new Object();
        aVar.d = new Object();
        this.f9470e = aVar;
        this.f9471f = r2;
        setWillNotDraw(false);
        paint2.setColor(i6.l1(0.1f, -16777216));
        a5.a aVar2 = this.f9470e;
        int v02 = i6.v0(i6.f20827d6, d6Var);
        aVar2.f299b = v02;
        paint.setColor(v02);
        w[] wVarArr = {new w(this), new w(this)};
    }

    public static void b(o6 o6Var, x xVar, boolean z10) {
        o6Var.b();
        if (xVar.f9445f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) xVar.f9444e);
            spannableStringBuilder.setSpan(new z5(xVar.f9445f, 1.4f, o6Var.f29353a.getFontMetricsInt()), 0, 1, 33);
            o6Var.q(spannableStringBuilder, z10, true);
            return;
        }
        o6Var.q(xVar.f9444e, z10, true);
    }

    public final w a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            w[] wVarArr = this.f9471f;
            if (i10 < wVarArr.length) {
                a5.a aVar = this.f9470e;
                if (i10 == 0) {
                    obj = aVar.f300c;
                } else {
                    obj = aVar.d;
                }
                x xVar = (x) obj;
                if (wVarArr[i10].f9403a.contains(f7, f10) && xVar.f9441a && xVar.f9442b) {
                    return wVarArr[i10];
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
        o6 o6Var;
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
        float height = getHeight() - this.f9469c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f9468b);
        int a2 = this.d.a(this.f9470e.f299b, false);
        Paint paint = this.f9467a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((x) this.f9470e.d).f9447i;
        w[] wVarArr = this.f9471f;
        int i14 = 1;
        if (wVarArr[1].f9404b.f25987c < wVarArr[0].f9404b.f25987c) {
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
            w wVar = wVarArr[i15];
            a5.a aVar = this.f9470e;
            if (i15 == 0) {
                obj = aVar.f300c;
            } else {
                obj = aVar.d;
            }
            x xVar = (x) obj;
            e6 e6Var = wVar.f9404b;
            org.telegram.ui.Components.voip.h hVar = wVar.f9416p;
            Paint paint2 = wVar.f9411k;
            e6 e6Var2 = wVar.f9406e;
            e6 e6Var3 = wVar.d;
            e6 e6Var4 = wVar.f9405c;
            org.telegram.ui.Cells.z zVar2 = wVar.f9414n;
            w[] wVarArr2 = wVarArr;
            wp wpVar = wVar.f9415o;
            float f13 = f12;
            h5 h5Var = wVar.f9408g;
            int i16 = i10;
            o6 o6Var2 = wVar.f9412l;
            int i17 = i15;
            RectF rectF = wVar.f9403a;
            float e7 = e6Var.e(xVar.f9441a);
            if (!xVar.f9441a) {
                d = e6Var4.f25987c;
                o6Var = o6Var2;
            } else {
                a5.a aVar2 = this.f9470e;
                o6Var = o6Var2;
                if (((x) aVar2.d).f9441a && ((x) aVar2.f300c).f9441a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                d = e6Var4.d(f7, false);
            }
            if (!xVar.f9441a) {
                d10 = e6Var3.f25987c;
            } else {
                a5.a aVar3 = this.f9470e;
                if (((x) aVar3.d).f9441a && ((x) aVar3.f300c).f9441a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = e6Var3.d(f10, false);
            }
            if (!xVar.f9441a) {
                d11 = e6Var2.f25987c;
            } else {
                a5.a aVar4 = this.f9470e;
                if (((x) aVar4.d).f9441a && ((x) aVar4.f300c).f9441a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = e6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e10 = wVar.h.e(xVar.f9443c);
            float e11 = wVar.f9409i.e(xVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e7) * wVar.f9410j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(i6.l1(e7, wVar.f9407f.a(xVar.f9446g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f14);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f15 = f14 * e7;
                int l1 = i6.l1(f15, h5Var.a(xVar.h, false));
                o6 o6Var3 = o6Var;
                if (o6Var3.T != l1) {
                    o6Var3.T = l1;
                    str = str2;
                    o6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                o6Var3.r(i6.l1(f15, h5Var.a(xVar.h, false)));
                o6Var3.m(rectF);
                o6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                wpVar.b(i6.l1(e10 * e7, h5Var.a(xVar.h, false)));
                wpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                wpVar.draw(canvas);
                canvas.restore();
            }
            if (e11 > 0.0f) {
                hVar.b(i6.l1(e7 * e11, h5Var.a(xVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (wVar.f9413m != i6.l1(0.15f, xVar.h)) {
                int l12 = i6.l1(0.15f, xVar.h);
                wVar.f9413m = l12;
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
            wVarArr = wVarArr2;
            f12 = f13;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f9469c.f25987c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.f9470e;
        boolean z10 = ((x) aVar.f300c).f9441a;
        if (!z10 && !((x) aVar.d).f9441a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            x xVar = (x) aVar.d;
            if (xVar.f9441a && ("top".equalsIgnoreCase(xVar.f9447i) || "bottom".equalsIgnoreCase(((x) this.f9470e.d).f9447i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), bi.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            w a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f9410j.c(true);
                this.h.f9414n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f9414n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                w a10 = a(motionEvent.getX(), motionEvent.getY());
                w wVar = this.h;
                if (a10 == wVar && (callback = this.f9472n) != null) {
                    if (wVar == this.f9471f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f9410j.c(false);
            this.h.f9414n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f9472n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f9473r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        w[] wVarArr = this.f9471f;
        w wVar = wVarArr[0];
        if (wVar.f9414n != drawable && wVar.f9415o != drawable) {
            w wVar2 = wVarArr[1];
            if (wVar2.f9414n != drawable && wVar2.f9415o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
