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
import org.telegram.messenger.ai;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.q6;
public abstract class x extends FrameLayout {
    public final Paint f9469a;
    public final Paint f9470b;
    public final g6 f9471c;
    public final j5 d;
    public a5.a f9472e;
    public final v[] f9473f;
    public v h;
    public Utilities.Callback f9474n;
    public Runnable f9475r;

    public x(Context context, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9469a = paint;
        Paint paint2 = new Paint(1);
        this.f9470b = paint2;
        is isVar = is.h;
        this.f9471c = new g6(this, 0L, 320L, isVar);
        this.d = new j5(this, 320L, isVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.f300c = new Object();
        aVar.d = new Object();
        this.f9472e = aVar;
        this.f9473f = r2;
        setWillNotDraw(false);
        paint2.setColor(h6.m1(0.1f, -16777216));
        a5.a aVar2 = this.f9472e;
        int w02 = h6.w0(h6.f20786d6, d6Var);
        aVar2.f299b = w02;
        paint.setColor(w02);
        v[] vVarArr = {new v(this), new v(this)};
    }

    public static void b(q6 q6Var, w wVar, boolean z10) {
        q6Var.a();
        if (wVar.f9447f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) wVar.f9446e);
            spannableStringBuilder.setSpan(new b6(wVar.f9447f, 1.4f, q6Var.f30017a.getFontMetricsInt()), 0, 1, 33);
            q6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        q6Var.t(wVar.f9446e, z10, true);
    }

    public final v a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f9473f;
            if (i10 < vVarArr.length) {
                a5.a aVar = this.f9472e;
                if (i10 == 0) {
                    obj = aVar.f300c;
                } else {
                    obj = aVar.d;
                }
                w wVar = (w) obj;
                if (vVarArr[i10].f9405a.contains(f7, f10) && wVar.f9443a && wVar.f9444b) {
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
        q6 q6Var;
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
        float height = getHeight() - this.f9471c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f9470b);
        int a2 = this.d.a(this.f9472e.f299b, false);
        Paint paint = this.f9469a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((w) this.f9472e.d).f9449i;
        v[] vVarArr = this.f9473f;
        int i14 = 1;
        if (vVarArr[1].f9406b.f26613c < vVarArr[0].f9406b.f26613c) {
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
            a5.a aVar = this.f9472e;
            if (i15 == 0) {
                obj = aVar.f300c;
            } else {
                obj = aVar.d;
            }
            w wVar = (w) obj;
            g6 g6Var = vVar.f9406b;
            org.telegram.ui.Components.voip.h hVar = vVar.f9418p;
            Paint paint2 = vVar.f9413k;
            g6 g6Var2 = vVar.f9408e;
            g6 g6Var3 = vVar.d;
            g6 g6Var4 = vVar.f9407c;
            org.telegram.ui.Cells.z zVar2 = vVar.f9416n;
            v[] vVarArr2 = vVarArr;
            jq jqVar = vVar.f9417o;
            float f14 = f13;
            j5 j5Var = vVar.f9410g;
            int i16 = i10;
            q6 q6Var2 = vVar.f9414l;
            int i17 = i15;
            RectF rectF = vVar.f9405a;
            float e7 = g6Var.e(wVar.f9443a);
            if (!wVar.f9443a) {
                d = g6Var4.f26613c;
                q6Var = q6Var2;
            } else {
                a5.a aVar2 = this.f9472e;
                q6Var = q6Var2;
                if (((w) aVar2.d).f9443a && ((w) aVar2.f300c).f9443a) {
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
            if (!wVar.f9443a) {
                d10 = g6Var3.f26613c;
            } else {
                a5.a aVar3 = this.f9472e;
                if (((w) aVar3.d).f9443a && ((w) aVar3.f300c).f9443a) {
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
            if (!wVar.f9443a) {
                d11 = g6Var2.f26613c;
            } else {
                a5.a aVar4 = this.f9472e;
                if (((w) aVar4.d).f9443a && ((w) aVar4.f300c).f9443a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
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
            float e10 = vVar.h.e(wVar.f9445c);
            float e11 = vVar.f9411i.e(wVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e7) * vVar.f9412j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(h6.m1(e7, vVar.f9409f.a(wVar.f9448g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f16 = f15 * e7;
                int m12 = h6.m1(f16, j5Var.a(wVar.h, false));
                q6 q6Var3 = q6Var;
                if (q6Var3.Z != m12) {
                    q6Var3.Z = m12;
                    str = str2;
                    q6Var3.f30018a0 = new PorterDuffColorFilter(m12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                q6Var3.u(h6.m1(f16, j5Var.a(wVar.h, false)));
                q6Var3.p(rectF);
                q6Var3.draw(canvas);
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
                jqVar.b(h6.m1(e10 * e7, j5Var.a(wVar.h, false)));
                jqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                jqVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (e11 > f12) {
                z10 = false;
                hVar.b(h6.m1(e7 * e11, j5Var.a(wVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (vVar.f9415m != h6.m1(0.15f, wVar.h)) {
                int m13 = h6.m1(0.15f, wVar.h);
                vVar.f9415m = m13;
                zVar = zVar2;
                i14 = 1;
                h6.C1(zVar, m13, true);
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
            vVarArr = vVarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f9471c.f26613c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.f9472e;
        boolean z10 = ((w) aVar.f300c).f9443a;
        if (!z10 && !((w) aVar.d).f9443a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            w wVar = (w) aVar.d;
            if (wVar.f9443a && ("top".equalsIgnoreCase(wVar.f9449i) || "bottom".equalsIgnoreCase(((w) this.f9472e.d).f9449i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), ai.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            v a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f9412j.c(true);
                this.h.f9416n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f9416n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                v a10 = a(motionEvent.getX(), motionEvent.getY());
                v vVar = this.h;
                if (a10 == vVar && (callback = this.f9474n) != null) {
                    if (vVar == this.f9473f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f9412j.c(false);
            this.h.f9416n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f9474n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f9475r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        v[] vVarArr = this.f9473f;
        v vVar = vVarArr[0];
        if (vVar.f9416n != drawable && vVar.f9417o != drawable) {
            v vVar2 = vVarArr[1];
            if (vVar2.f9416n != drawable && vVar2.f9417o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
