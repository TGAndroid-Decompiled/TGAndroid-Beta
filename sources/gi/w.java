package gi;

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
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zr;
public abstract class w extends FrameLayout {
    public final Paint f11543a;
    public final Paint f11544b;
    public final d6 f11545c;
    public final g5 d;
    public a5.a e;
    public final u[] f11546f;
    public u h;
    public Utilities.Callback f11547n;
    public Runnable f11548r;

    public w(Context context, g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f11543a = paint;
        Paint paint2 = new Paint(1);
        this.f11544b = paint2;
        zr zrVar = zr.h;
        this.f11545c = new d6(this, 0L, 320L, zrVar);
        this.d = new g5(this, 320L, zrVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.f282c = new Object();
        aVar.d = new Object();
        this.e = aVar;
        this.f11546f = r2;
        setWillNotDraw(false);
        paint2.setColor(k6.o1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = k6.w0(k6.f21184d6, g6Var);
        aVar2.f281b = w02;
        paint.setColor(w02);
        u[] uVarArr = {new u(this), new u(this)};
    }

    public static void b(n6 n6Var, v vVar, boolean z10) {
        n6Var.a();
        if (vVar.f11532f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.e);
            spannableStringBuilder.setSpan(new y5(vVar.f11532f, 1.4f, n6Var.f28795a.getFontMetricsInt()), 0, 1, 33);
            n6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        n6Var.t(vVar.e, z10, true);
    }

    public final u a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f11546f;
            if (i10 < uVarArr.length) {
                a5.a aVar = this.e;
                if (i10 == 0) {
                    obj = aVar.f282c;
                } else {
                    obj = aVar.d;
                }
                v vVar = (v) obj;
                if (uVarArr[i10].f11506a.contains(f7, f10) && vVar.f11529a && vVar.f11530b) {
                    return uVarArr[i10];
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
        char c10;
        float f12;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i13;
        float height = getHeight() - this.f11545c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f11544b);
        int a2 = this.d.a(this.e.f281b, false);
        Paint paint = this.f11543a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((v) this.e.d).f11534i;
        u[] uVarArr = this.f11546f;
        int i14 = 1;
        if (uVarArr[1].f11507b.f25568c < uVarArr[0].f11507b.f25568c) {
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
            u uVar = uVarArr[i15];
            a5.a aVar = this.e;
            if (i15 == 0) {
                obj = aVar.f282c;
            } else {
                obj = aVar.d;
            }
            v vVar = (v) obj;
            d6 d6Var = uVar.f11507b;
            org.telegram.ui.Components.voip.h hVar = uVar.f11518p;
            Paint paint2 = uVar.f11513k;
            d6 d6Var2 = uVar.e;
            d6 d6Var3 = uVar.d;
            d6 d6Var4 = uVar.f11508c;
            org.telegram.ui.Cells.y yVar2 = uVar.f11516n;
            u[] uVarArr2 = uVarArr;
            cq cqVar = uVar.f11517o;
            float f14 = f13;
            g5 g5Var = uVar.f11510g;
            int i16 = i10;
            n6 n6Var2 = uVar.f11514l;
            int i17 = i15;
            RectF rectF = uVar.f11506a;
            float e = d6Var.e(vVar.f11529a);
            if (!vVar.f11529a) {
                d = d6Var4.f25568c;
                n6Var = n6Var2;
            } else {
                a5.a aVar2 = this.e;
                n6Var = n6Var2;
                if (((v) aVar2.d).f11529a && ((v) aVar2.f282c).f11529a) {
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
            if (!vVar.f11529a) {
                d10 = d6Var3.f25568c;
            } else {
                a5.a aVar3 = this.e;
                if (((v) aVar3.d).f11529a && ((v) aVar3.f282c).f11529a) {
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
            if (!vVar.f11529a) {
                d11 = d6Var2.f25568c;
            } else {
                a5.a aVar4 = this.e;
                if (((v) aVar4.d).f11529a && ((v) aVar4.f282c).f11529a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = d6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e7 = uVar.h.e(vVar.f11531c);
            float e10 = uVar.f11511i.e(vVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * uVar.f11512j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(k6.o1(e, uVar.f11509f.a(vVar.f11533g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f16 = f15 * e;
                int o12 = k6.o1(f16, g5Var.a(vVar.h, false));
                n6 n6Var3 = n6Var;
                if (n6Var3.Z != o12) {
                    n6Var3.Z = o12;
                    str = str2;
                    n6Var3.f28796a0 = new PorterDuffColorFilter(o12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                n6Var3.u(k6.o1(f16, g5Var.a(vVar.h, false)));
                n6Var3.p(rectF);
                n6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e7 > 0.0f) {
                canvas.save();
                c10 = 0;
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e7);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e7) * AndroidUtilities.dp(10.0f));
                cqVar.b(k6.o1(e7 * e, g5Var.a(vVar.h, false)));
                cqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                cqVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (e10 > f12) {
                z10 = false;
                hVar.b(k6.o1(e * e10, g5Var.a(vVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (uVar.f11515m != k6.o1(0.15f, vVar.h)) {
                int o13 = k6.o1(0.15f, vVar.h);
                uVar.f11515m = o13;
                yVar = yVar2;
                i14 = 1;
                k6.E1(yVar, o13, true);
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
            uVarArr = uVarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f11545c.f25568c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.e;
        boolean z10 = ((v) aVar.f282c).f11529a;
        if (!z10 && !((v) aVar.d).f11529a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            v vVar = (v) aVar.d;
            if (vVar.f11529a && ("top".equalsIgnoreCase(vVar.f11534i) || "bottom".equalsIgnoreCase(((v) this.e.d).f11534i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), tl.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            u a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f11512j.c(true);
                this.h.f11516n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f11516n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                u a10 = a(motionEvent.getX(), motionEvent.getY());
                u uVar = this.h;
                if (a10 == uVar && (callback = this.f11547n) != null) {
                    if (uVar == this.f11546f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f11512j.c(false);
            this.h.f11516n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f11547n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f11548r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        u[] uVarArr = this.f11546f;
        u uVar = uVarArr[0];
        if (uVar.f11516n != drawable && uVar.f11517o != drawable) {
            u uVar2 = uVarArr[1];
            if (uVar2.f11516n != drawable && uVar2.f11517o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
