package fi;

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
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
public abstract class w extends FrameLayout {
    public final Paint f9619a;
    public final Paint f9620b;
    public final g6 f9621c;
    public final j5 d;
    public a5.a e;
    public final u[] f9622f;
    public u h;
    public Utilities.Callback f9623n;
    public Runnable f9624r;

    public w(Context context, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9619a = paint;
        Paint paint2 = new Paint(1);
        this.f9620b = paint2;
        es esVar = es.h;
        this.f9621c = new g6(this, 0L, 320L, esVar);
        this.d = new j5(this, 320L, esVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.f280c = new Object();
        aVar.d = new Object();
        this.e = aVar;
        this.f9622f = r2;
        setWillNotDraw(false);
        paint2.setColor(org.telegram.ui.ActionBar.g6.m1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var);
        aVar2.f279b = w02;
        paint.setColor(w02);
        u[] uVarArr = {new u(this), new u(this)};
    }

    public static void b(r6 r6Var, v vVar, boolean z10) {
        r6Var.a();
        if (vVar.f9596f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.e);
            spannableStringBuilder.setSpan(new b6(vVar.f9596f, 1.4f, r6Var.f28746a.getFontMetricsInt()), 0, 1, 33);
            r6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        r6Var.t(vVar.e, z10, true);
    }

    public final u a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f9622f;
            if (i10 < uVarArr.length) {
                a5.a aVar = this.e;
                if (i10 == 0) {
                    obj = aVar.f280c;
                } else {
                    obj = aVar.d;
                }
                v vVar = (v) obj;
                if (uVarArr[i10].f9558a.contains(f7, f10) && vVar.f9593a && vVar.f9594b) {
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
        org.telegram.ui.Cells.z zVar;
        int i13;
        float height = getHeight() - this.f9621c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f9620b);
        int a2 = this.d.a(this.e.f279b, false);
        Paint paint = this.f9619a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((v) this.e.d).f9598i;
        u[] uVarArr = this.f9622f;
        int i14 = 1;
        if (uVarArr[1].f9559b.f25190c < uVarArr[0].f9559b.f25190c) {
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
                obj = aVar.f280c;
            } else {
                obj = aVar.d;
            }
            v vVar = (v) obj;
            g6 g6Var = uVar.f9559b;
            org.telegram.ui.Components.voip.h hVar = uVar.f9570p;
            Paint paint2 = uVar.f9565k;
            g6 g6Var2 = uVar.e;
            g6 g6Var3 = uVar.d;
            g6 g6Var4 = uVar.f9560c;
            org.telegram.ui.Cells.z zVar2 = uVar.f9568n;
            u[] uVarArr2 = uVarArr;
            gq gqVar = uVar.f9569o;
            float f14 = f13;
            j5 j5Var = uVar.f9562g;
            int i16 = i10;
            r6 r6Var2 = uVar.f9566l;
            int i17 = i15;
            RectF rectF = uVar.f9558a;
            float e = g6Var.e(vVar.f9593a);
            if (!vVar.f9593a) {
                d = g6Var4.f25190c;
                r6Var = r6Var2;
            } else {
                a5.a aVar2 = this.e;
                r6Var = r6Var2;
                if (((v) aVar2.d).f9593a && ((v) aVar2.f280c).f9593a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                d = g6Var4.d(f7, false);
            }
            if (!vVar.f9593a) {
                d10 = g6Var3.f25190c;
            } else {
                a5.a aVar3 = this.e;
                if (((v) aVar3.d).f9593a && ((v) aVar3.f280c).f9593a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = g6Var3.d(f10, false);
            }
            if (!vVar.f9593a) {
                d11 = g6Var2.f25190c;
            } else {
                a5.a aVar4 = this.e;
                if (((v) aVar4.d).f9593a && ((v) aVar4.f280c).f9593a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = g6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e7 = uVar.h.e(vVar.f9595c);
            float e10 = uVar.f9563i.e(vVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * uVar.f9564j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(org.telegram.ui.ActionBar.g6.m1(e, uVar.f9561f.a(vVar.f9597g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f16 = f15 * e;
                int m12 = org.telegram.ui.ActionBar.g6.m1(f16, j5Var.a(vVar.h, false));
                r6 r6Var3 = r6Var;
                if (r6Var3.Z != m12) {
                    r6Var3.Z = m12;
                    str = str2;
                    r6Var3.f28747a0 = new PorterDuffColorFilter(m12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                r6Var3.u(org.telegram.ui.ActionBar.g6.m1(f16, j5Var.a(vVar.h, false)));
                r6Var3.p(rectF);
                r6Var3.draw(canvas);
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
                gqVar.b(org.telegram.ui.ActionBar.g6.m1(e7 * e, j5Var.a(vVar.h, false)));
                gqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                gqVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (e10 > f12) {
                z10 = false;
                hVar.b(org.telegram.ui.ActionBar.g6.m1(e * e10, j5Var.a(vVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (uVar.f9567m != org.telegram.ui.ActionBar.g6.m1(0.15f, vVar.h)) {
                int m13 = org.telegram.ui.ActionBar.g6.m1(0.15f, vVar.h);
                uVar.f9567m = m13;
                zVar = zVar2;
                i14 = 1;
                org.telegram.ui.ActionBar.g6.C1(zVar, m13, true);
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
        return this.f9621c.f25190c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.e;
        boolean z10 = ((v) aVar.f280c).f9593a;
        if (!z10 && !((v) aVar.d).f9593a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            v vVar = (v) aVar.d;
            if (vVar.f9593a && ("top".equalsIgnoreCase(vVar.f9598i) || "bottom".equalsIgnoreCase(((v) this.e.d).f9598i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), yh.D(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            u a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f9564j.c(true);
                this.h.f9568n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f9568n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                u a10 = a(motionEvent.getX(), motionEvent.getY());
                u uVar = this.h;
                if (a10 == uVar && (callback = this.f9623n) != null) {
                    if (uVar == this.f9622f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f9564j.c(false);
            this.h.f9568n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f9623n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f9624r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        u[] uVarArr = this.f9622f;
        u uVar = uVarArr[0];
        if (uVar.f9568n != drawable && uVar.f9569o != drawable) {
            u uVar2 = uVarArr[1];
            if (uVar2.f9568n != drawable && uVar2.f9569o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
