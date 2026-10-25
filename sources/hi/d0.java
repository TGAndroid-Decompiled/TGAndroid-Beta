package hi;

import a8.ng;
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
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
public abstract class d0 extends FrameLayout {
    public final Paint f12932a;
    public final Paint f12933b;
    public final h6 f12934c;
    public final j5 d;
    public ng e;
    public final b0[] f12935f;
    public b0 h;
    public Utilities.Callback f12936n;
    public Runnable f12937r;

    public d0(Context context, u6 u6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f12932a = paint;
        Paint paint2 = new Paint(1);
        this.f12933b = paint2;
        ds dsVar = ds.h;
        this.f12934c = new h6(this, 0L, 320L, dsVar);
        this.d = new j5(this, 320L, dsVar, 0);
        ng ngVar = new ng((char) 0, 10);
        ngVar.f640c = new Object();
        ngVar.d = new Object();
        this.e = ngVar;
        this.f12935f = r2;
        setWillNotDraw(false);
        paint2.setColor(y6.o1(0.1f, -16777216));
        ng ngVar2 = this.e;
        int w02 = y6.w0(y6.f23354d6, u6Var);
        ngVar2.f639b = w02;
        paint.setColor(w02);
        b0[] b0VarArr = {new b0(this), new b0(this)};
    }

    public static void b(r6 r6Var, c0 c0Var, boolean z10) {
        r6Var.a();
        if (c0Var.f12905f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) c0Var.e);
            spannableStringBuilder.setSpan(new c6(c0Var.f12905f, 1.4f, r6Var.f32117a.getFontMetricsInt()), 0, 1, 33);
            r6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        r6Var.t(c0Var.e, z10, true);
    }

    public final b0 a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f12935f;
            if (i10 < b0VarArr.length) {
                ng ngVar = this.e;
                if (i10 == 0) {
                    obj = ngVar.f640c;
                } else {
                    obj = ngVar.d;
                }
                c0 c0Var = (c0) obj;
                if (b0VarArr[i10].f12871a.contains(f7, f10) && c0Var.f12902a && c0Var.f12903b) {
                    return b0VarArr[i10];
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
        r6 r6Var;
        float f7;
        float d;
        int i11;
        float f10;
        float d10;
        int i12;
        float f11;
        float d11;
        String str;
        char c10;
        float f12;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i13;
        float height = getHeight() - this.f12934c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f12933b);
        int a2 = this.d.a(this.e.f639b, false);
        Paint paint = this.f12932a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((c0) this.e.d).f12907i;
        b0[] b0VarArr = this.f12935f;
        int i14 = 1;
        if (b0VarArr[1].f12872b.f28809c < b0VarArr[0].f12872b.f28809c) {
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
            b0 b0Var = b0VarArr[i15];
            ng ngVar = this.e;
            if (i15 == 0) {
                obj = ngVar.f640c;
            } else {
                obj = ngVar.d;
            }
            c0 c0Var = (c0) obj;
            h6 h6Var = b0Var.f12872b;
            org.telegram.ui.Components.voip.h hVar = b0Var.f12883p;
            Paint paint2 = b0Var.f12878k;
            h6 h6Var2 = b0Var.e;
            h6 h6Var3 = b0Var.d;
            h6 h6Var4 = b0Var.f12873c;
            org.telegram.ui.Cells.y yVar2 = b0Var.f12881n;
            b0[] b0VarArr2 = b0VarArr;
            gq gqVar = b0Var.f12882o;
            float f14 = f13;
            j5 j5Var = b0Var.f12875g;
            int i16 = i10;
            r6 r6Var2 = b0Var.f12879l;
            int i17 = i15;
            RectF rectF = b0Var.f12871a;
            float e = h6Var.e(c0Var.f12902a);
            if (!c0Var.f12902a) {
                d = h6Var4.f28809c;
                r6Var = r6Var2;
            } else {
                ng ngVar2 = this.e;
                r6Var = r6Var2;
                if (((c0) ngVar2.d).f12902a && ((c0) ngVar2.f640c).f12902a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                d = h6Var4.d(f7, false);
            }
            if (!c0Var.f12902a) {
                d10 = h6Var3.f28809c;
            } else {
                ng ngVar3 = this.e;
                if (((c0) ngVar3.d).f12902a && ((c0) ngVar3.f640c).f12902a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = h6Var3.d(f10, false);
            }
            if (!c0Var.f12902a) {
                d11 = h6Var2.f28809c;
            } else {
                ng ngVar4 = this.e;
                if (((c0) ngVar4.d).f12902a && ((c0) ngVar4.f640c).f12902a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = h6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e10 = b0Var.h.e(c0Var.f12904c);
            float e11 = b0Var.f12876i.e(c0Var.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * b0Var.f12877j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(y6.o1(e, b0Var.f12874f.a(c0Var.f12906g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f16 = f15 * e;
                int o12 = y6.o1(f16, j5Var.a(c0Var.h, false));
                r6 r6Var3 = r6Var;
                if (r6Var3.Z != o12) {
                    r6Var3.Z = o12;
                    str = str2;
                    r6Var3.f32118a0 = new PorterDuffColorFilter(o12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                r6Var3.u(y6.o1(f16, j5Var.a(c0Var.h, false)));
                r6Var3.p(rectF);
                r6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                c10 = 0;
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                gqVar.b(y6.o1(e10 * e, j5Var.a(c0Var.h, false)));
                gqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                gqVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (e11 > f12) {
                z10 = false;
                hVar.b(y6.o1(e * e11, j5Var.a(c0Var.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (b0Var.f12880m != y6.o1(0.15f, c0Var.h)) {
                int o13 = y6.o1(0.15f, c0Var.h);
                b0Var.f12880m = o13;
                yVar = yVar2;
                i14 = 1;
                y6.E1(yVar, o13, true);
            } else {
                yVar = yVar2;
                i14 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            if (i16 != 0) {
                i13 = -1;
            } else {
                i13 = i14;
            }
            i15 = i17 + i13;
            b0VarArr = b0VarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f12934c.f28809c;
    }

    public int getTotalHeight() {
        int i10;
        ng ngVar = this.e;
        boolean z10 = ((c0) ngVar.f640c).f12902a;
        if (!z10 && !((c0) ngVar.d).f12902a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            c0 c0Var = (c0) ngVar.d;
            if (c0Var.f12902a && ("top".equalsIgnoreCase(c0Var.f12907i) || "bottom".equalsIgnoreCase(((c0) this.e.d).f12907i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), vh.D(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            b0 a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f12877j.c(true);
                this.h.f12881n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f12881n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                b0 a10 = a(motionEvent.getX(), motionEvent.getY());
                b0 b0Var = this.h;
                if (a10 == b0Var && (callback = this.f12936n) != null) {
                    if (b0Var == this.f12935f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f12877j.c(false);
            this.h.f12881n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f12936n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f12937r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        b0[] b0VarArr = this.f12935f;
        b0 b0Var = b0VarArr[0];
        if (b0Var.f12881n != drawable && b0Var.f12882o != drawable) {
            b0 b0Var2 = b0VarArr[1];
            if (b0Var2.f12881n != drawable && b0Var2.f12882o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
