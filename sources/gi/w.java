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
import org.telegram.messenger.lk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
public abstract class w extends FrameLayout {
    public final Paint f11517a;
    public final Paint f11518b;
    public final f6 f11519c;
    public final i5 d;
    public a5.a e;
    public final u[] f11520f;
    public u h;
    public Utilities.Callback f11521n;
    public Runnable f11522r;

    public w(Context context, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f11517a = paint;
        Paint paint2 = new Paint(1);
        this.f11518b = paint2;
        bs bsVar = bs.h;
        this.f11519c = new f6(this, 0L, 320L, bsVar);
        this.d = new i5(this, 320L, bsVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.f281c = new Object();
        aVar.d = new Object();
        this.e = aVar;
        this.f11520f = r2;
        setWillNotDraw(false);
        paint2.setColor(h6.m1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = h6.w0(h6.f20986d6, d6Var);
        aVar2.f280b = w02;
        paint.setColor(w02);
        u[] uVarArr = {new u(this), new u(this)};
    }

    public static void b(p6 p6Var, v vVar, boolean z10) {
        p6Var.a();
        if (vVar.f11507f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.e);
            spannableStringBuilder.setSpan(new a6(vVar.f11507f, 1.4f, p6Var.f29190a.getFontMetricsInt()), 0, 1, 33);
            p6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        p6Var.t(vVar.e, z10, true);
    }

    public final u a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f11520f;
            if (i10 < uVarArr.length) {
                a5.a aVar = this.e;
                if (i10 == 0) {
                    obj = aVar.f281c;
                } else {
                    obj = aVar.d;
                }
                v vVar = (v) obj;
                if (uVarArr[i10].f11481a.contains(f7, f10) && vVar.f11504a && vVar.f11505b) {
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
        p6 p6Var;
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
        float height = getHeight() - this.f11519c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f11518b);
        int a2 = this.d.a(this.e.f280b, false);
        Paint paint = this.f11517a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((v) this.e.d).f11509i;
        u[] uVarArr = this.f11520f;
        int i14 = 1;
        if (uVarArr[1].f11482b.f26093c < uVarArr[0].f11482b.f26093c) {
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
                obj = aVar.f281c;
            } else {
                obj = aVar.d;
            }
            v vVar = (v) obj;
            f6 f6Var = uVar.f11482b;
            org.telegram.ui.Components.voip.h hVar = uVar.f11493p;
            Paint paint2 = uVar.f11488k;
            f6 f6Var2 = uVar.e;
            f6 f6Var3 = uVar.d;
            f6 f6Var4 = uVar.f11483c;
            org.telegram.ui.Cells.z zVar2 = uVar.f11491n;
            u[] uVarArr2 = uVarArr;
            dq dqVar = uVar.f11492o;
            float f14 = f13;
            i5 i5Var = uVar.f11485g;
            int i16 = i10;
            p6 p6Var2 = uVar.f11489l;
            int i17 = i15;
            RectF rectF = uVar.f11481a;
            float e = f6Var.e(vVar.f11504a);
            if (!vVar.f11504a) {
                d = f6Var4.f26093c;
                p6Var = p6Var2;
            } else {
                a5.a aVar2 = this.e;
                p6Var = p6Var2;
                if (((v) aVar2.d).f11504a && ((v) aVar2.f281c).f11504a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                d = f6Var4.d(f7, false);
            }
            if (!vVar.f11504a) {
                d10 = f6Var3.f26093c;
            } else {
                a5.a aVar3 = this.e;
                if (((v) aVar3.d).f11504a && ((v) aVar3.f281c).f11504a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = f6Var3.d(f10, false);
            }
            if (!vVar.f11504a) {
                d11 = f6Var2.f26093c;
            } else {
                a5.a aVar4 = this.e;
                if (((v) aVar4.d).f11504a && ((v) aVar4.f281c).f11504a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = f6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e7 = uVar.h.e(vVar.f11506c);
            float e10 = uVar.f11486i.e(vVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * uVar.f11487j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(h6.m1(e, uVar.f11484f.a(vVar.f11508g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f16 = f15 * e;
                int m12 = h6.m1(f16, i5Var.a(vVar.h, false));
                p6 p6Var3 = p6Var;
                if (p6Var3.f29191a0 != m12) {
                    p6Var3.f29191a0 = m12;
                    str = str2;
                    p6Var3.f29193b0 = new PorterDuffColorFilter(m12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                p6Var3.u(h6.m1(f16, i5Var.a(vVar.h, false)));
                p6Var3.p(rectF);
                p6Var3.draw(canvas);
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
                dqVar.b(h6.m1(e7 * e, i5Var.a(vVar.h, false)));
                dqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                dqVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (e10 > f12) {
                z10 = false;
                hVar.b(h6.m1(e * e10, i5Var.a(vVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (uVar.f11490m != h6.m1(0.15f, vVar.h)) {
                int m13 = h6.m1(0.15f, vVar.h);
                uVar.f11490m = m13;
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
            uVarArr = uVarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f11519c.f26093c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.e;
        boolean z10 = ((v) aVar.f281c).f11504a;
        if (!z10 && !((v) aVar.d).f11504a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            v vVar = (v) aVar.d;
            if (vVar.f11504a && ("top".equalsIgnoreCase(vVar.f11509i) || "bottom".equalsIgnoreCase(((v) this.e.d).f11509i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), lk.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            u a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f11487j.c(true);
                this.h.f11491n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f11491n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                u a10 = a(motionEvent.getX(), motionEvent.getY());
                u uVar = this.h;
                if (a10 == uVar && (callback = this.f11521n) != null) {
                    if (uVar == this.f11520f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f11487j.c(false);
            this.h.f11491n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f11521n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f11522r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        u[] uVarArr = this.f11520f;
        u uVar = uVarArr[0];
        if (uVar.f11491n != drawable && uVar.f11492o != drawable) {
            u uVar2 = uVarArr[1];
            if (uVar2.f11491n != drawable && uVar2.f11492o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
