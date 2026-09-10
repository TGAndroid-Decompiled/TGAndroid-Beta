package di;

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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zp;
public abstract class a0 extends FrameLayout {
    public final Paint f6502a;
    public final Paint f6503b;
    public final d6 f6504c;
    public final org.telegram.ui.Components.g5 d;
    public a5.a e;
    public final y[] f6505f;
    public y h;
    public Utilities.Callback f6506n;
    public Runnable f6507r;

    public a0(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f6502a = paint;
        Paint paint2 = new Paint(1);
        this.f6503b = paint2;
        wr wrVar = wr.h;
        this.f6504c = new d6(this, 0L, 320L, wrVar);
        this.d = new org.telegram.ui.Components.g5(this, 320L, wrVar, 0);
        a5.a aVar = new a5.a((char) 0, 5);
        aVar.f276c = new Object();
        aVar.d = new Object();
        this.e = aVar;
        this.f6505f = r2;
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int v02 = j6.v0(j6.f17928d6, f6Var);
        aVar2.f275b = v02;
        paint.setColor(v02);
        y[] yVarArr = {new y(this), new y(this)};
    }

    public static void b(n6 n6Var, z zVar, boolean z10) {
        n6Var.b();
        if (zVar.f7046f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) zVar.e);
            spannableStringBuilder.setSpan(new y5(zVar.f7046f, 1.4f, n6Var.f25424a.getFontMetricsInt()), 0, 1, 33);
            n6Var.q(spannableStringBuilder, z10, true);
            return;
        }
        n6Var.q(zVar.e, z10, true);
    }

    public final y a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            y[] yVarArr = this.f6505f;
            if (i10 < yVarArr.length) {
                a5.a aVar = this.e;
                if (i10 == 0) {
                    obj = aVar.f276c;
                } else {
                    obj = aVar.d;
                }
                z zVar = (z) obj;
                if (yVarArr[i10].f7009a.contains(f7, f10) && zVar.f7043a && zVar.f7044b) {
                    return yVarArr[i10];
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
        n6 n6Var;
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
        float height = getHeight() - this.f6504c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f6503b);
        int a2 = this.d.a(this.e.f275b, false);
        Paint paint = this.f6502a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((z) this.e.d).f7048i;
        y[] yVarArr = this.f6505f;
        int i14 = 1;
        if (yVarArr[1].f7010b.f22295c < yVarArr[0].f7010b.f22295c) {
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
            y yVar = yVarArr[i15];
            a5.a aVar = this.e;
            if (i15 == 0) {
                obj = aVar.f276c;
            } else {
                obj = aVar.d;
            }
            z zVar2 = (z) obj;
            d6 d6Var = yVar.f7010b;
            org.telegram.ui.Components.voip.h hVar = yVar.f7021p;
            Paint paint2 = yVar.f7016k;
            d6 d6Var2 = yVar.e;
            d6 d6Var3 = yVar.d;
            d6 d6Var4 = yVar.f7011c;
            org.telegram.ui.Cells.z zVar3 = yVar.f7019n;
            y[] yVarArr2 = yVarArr;
            zp zpVar = yVar.f7020o;
            float f13 = f12;
            org.telegram.ui.Components.g5 g5Var = yVar.f7013g;
            int i16 = i10;
            n6 n6Var2 = yVar.f7017l;
            int i17 = i15;
            RectF rectF = yVar.f7009a;
            float e = d6Var.e(zVar2.f7043a);
            if (!zVar2.f7043a) {
                d = d6Var4.f22295c;
                n6Var = n6Var2;
            } else {
                a5.a aVar2 = this.e;
                n6Var = n6Var2;
                if (((z) aVar2.d).f7043a && ((z) aVar2.f276c).f7043a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                d = d6Var4.d(f7, false);
            }
            if (!zVar2.f7043a) {
                d10 = d6Var3.f22295c;
            } else {
                a5.a aVar3 = this.e;
                if (((z) aVar3.d).f7043a && ((z) aVar3.f276c).f7043a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = d6Var3.d(f10, false);
            }
            if (!zVar2.f7043a) {
                d11 = d6Var2.f22295c;
            } else {
                a5.a aVar4 = this.e;
                if (((z) aVar4.d).f7043a && ((z) aVar4.f276c).f7043a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = d6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e7 = yVar.h.e(zVar2.f7045c);
            float e10 = yVar.f7014i.e(zVar2.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * yVar.f7015j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e, yVar.f7012f.a(zVar2.f7047g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f14);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f15 = f14 * e;
                int l1 = j6.l1(f15, g5Var.a(zVar2.h, false));
                n6 n6Var3 = n6Var;
                if (n6Var3.T != l1) {
                    n6Var3.T = l1;
                    str = str2;
                    n6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                n6Var3.r(j6.l1(f15, g5Var.a(zVar2.h, false)));
                n6Var3.m(rectF);
                n6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e7 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e7);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e7) * AndroidUtilities.dp(10.0f));
                zpVar.b(j6.l1(e7 * e, g5Var.a(zVar2.h, false)));
                zpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                zpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(j6.l1(e * e10, g5Var.a(zVar2.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (yVar.f7018m != j6.l1(0.15f, zVar2.h)) {
                int l12 = j6.l1(0.15f, zVar2.h);
                yVar.f7018m = l12;
                zVar = zVar3;
                i14 = 1;
                j6.B1(zVar, l12, true);
            } else {
                zVar = zVar3;
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
            yVarArr = yVarArr2;
            f12 = f13;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f6504c.f22295c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.e;
        boolean z10 = ((z) aVar.f276c).f7043a;
        if (!z10 && !((z) aVar.d).f7043a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            z zVar = (z) aVar.d;
            if (zVar.f7043a && ("top".equalsIgnoreCase(zVar.f7048i) || "bottom".equalsIgnoreCase(((z) this.e.d).f7048i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), em.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            y a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f7015j.c(true);
                this.h.f7019n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f7019n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                y a10 = a(motionEvent.getX(), motionEvent.getY());
                y yVar = this.h;
                if (a10 == yVar && (callback = this.f6506n) != null) {
                    if (yVar == this.f6505f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f7015j.c(false);
            this.h.f7019n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f6506n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f6507r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y[] yVarArr = this.f6505f;
        y yVar = yVarArr[0];
        if (yVar.f7019n != drawable && yVar.f7020o != drawable) {
            y yVar2 = yVarArr[1];
            if (yVar2.f7019n != drawable && yVar2.f7020o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
