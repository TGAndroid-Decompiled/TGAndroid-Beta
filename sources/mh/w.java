package mh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y5;
public abstract class w extends FrameLayout {
    public final Paint f18174a;
    public final Paint f18175b;
    public final y5 f18176c;
    public final b5 d;
    public a6.a f18177e;
    public final u[] f18178f;
    public u h;
    public Utilities.Callback f18179n;
    public Runnable f18180r;

    public w(Context context, b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f18174a = paint;
        Paint paint2 = new Paint(1);
        this.f18175b = paint2;
        gr grVar = gr.h;
        this.f18176c = new y5(this, 0L, 320L, grVar);
        this.d = new b5(this, 320L, grVar, 0);
        a6.a aVar = new a6.a((char) 0, 15);
        aVar.f101b = new Object();
        aVar.d = new Object();
        this.f18177e = aVar;
        this.f18178f = r2;
        setWillNotDraw(false);
        paint2.setColor(f6.l1(0.1f, -16777216));
        a6.a aVar2 = this.f18177e;
        int v02 = f6.v0(f6.f23001d6, b6Var);
        aVar2.f102c = v02;
        paint.setColor(v02);
        u[] uVarArr = {new u(this), new u(this)};
    }

    public static void b(i6 i6Var, v vVar, boolean z10) {
        i6Var.b();
        if (vVar.f18161f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.f18160e);
            spannableStringBuilder.setSpan(new t5(vVar.f18161f, 1.4f, i6Var.f29332a.getFontMetricsInt()), 0, 1, 33);
            i6Var.q(spannableStringBuilder, z10, true);
            return;
        }
        i6Var.q(vVar.f18160e, z10, true);
    }

    public final u a(float f10, float f11) {
        Object obj;
        int i9 = 0;
        while (true) {
            u[] uVarArr = this.f18178f;
            if (i9 < uVarArr.length) {
                a6.a aVar = this.f18177e;
                if (i9 == 0) {
                    obj = aVar.f101b;
                } else {
                    obj = aVar.d;
                }
                v vVar = (v) obj;
                if (uVarArr[i9].f18134a.contains(f10, f11) && vVar.f18157a && vVar.f18158b) {
                    return uVarArr[i9];
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        Object obj;
        i6 i6Var;
        float f10;
        float d;
        int i10;
        float f11;
        float d9;
        int i11;
        float f12;
        float d10;
        String str;
        org.telegram.ui.Cells.z zVar;
        int i12;
        float height = getHeight() - this.f18176c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f18175b);
        int a2 = this.d.a(this.f18177e.f102c, false);
        Paint paint = this.f18174a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((v) this.f18177e.d).f18163i;
        u[] uVarArr = this.f18178f;
        int i13 = 1;
        if (uVarArr[1].f18135b.f34854c < uVarArr[0].f18135b.f34854c) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i14 = i9;
        while (true) {
            if (i9 != 0) {
                if (i14 < 0) {
                    return;
                }
            } else if (i14 > i13) {
                return;
            }
            u uVar = uVarArr[i14];
            a6.a aVar = this.f18177e;
            if (i14 == 0) {
                obj = aVar.f101b;
            } else {
                obj = aVar.d;
            }
            v vVar = (v) obj;
            y5 y5Var = uVar.f18135b;
            org.telegram.ui.Components.voip.h hVar = uVar.f18147p;
            Paint paint2 = uVar.f18142k;
            y5 y5Var2 = uVar.f18137e;
            y5 y5Var3 = uVar.d;
            y5 y5Var4 = uVar.f18136c;
            org.telegram.ui.Cells.z zVar2 = uVar.f18145n;
            u[] uVarArr2 = uVarArr;
            jp jpVar = uVar.f18146o;
            float f14 = f13;
            b5 b5Var = uVar.f18139g;
            int i15 = i9;
            i6 i6Var2 = uVar.f18143l;
            int i16 = i14;
            RectF rectF = uVar.f18134a;
            float e10 = y5Var.e(vVar.f18157a);
            if (!vVar.f18157a) {
                d = y5Var4.f34854c;
                i6Var = i6Var2;
            } else {
                a6.a aVar2 = this.f18177e;
                i6Var = i6Var2;
                if (((v) aVar2.d).f18157a && ((v) aVar2.f101b).f18157a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                d = y5Var4.d(f10, false);
            }
            if (!vVar.f18157a) {
                d9 = y5Var3.f34854c;
            } else {
                a6.a aVar3 = this.f18177e;
                if (((v) aVar3.d).f18157a && ((v) aVar3.f101b).f18157a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                d9 = y5Var3.d(f11, false);
            }
            if (!vVar.f18157a) {
                d10 = y5Var2.f34854c;
            } else {
                a6.a aVar4 = this.f18177e;
                if (((v) aVar4.d).f18157a && ((v) aVar4.f101b).f18157a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                d10 = y5Var2.d(f12, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d10) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d9) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e11 = uVar.h.e(vVar.f18159c);
            float e12 = uVar.f18140i.e(vVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e10) * uVar.f18141j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(f6.l1(e10, uVar.f18138f.a(vVar.f18162g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e11 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e11;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e11);
                float f16 = f15 * e10;
                int l1 = f6.l1(f16, b5Var.a(vVar.h, false));
                i6 i6Var3 = i6Var;
                if (i6Var3.T != l1) {
                    i6Var3.T = l1;
                    str = str2;
                    i6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                i6Var3.r(f6.l1(f16, b5Var.a(vVar.h, false)));
                i6Var3.m(rectF);
                i6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e11 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e11);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e11) * AndroidUtilities.dp(10.0f));
                jpVar.b(f6.l1(e11 * e10, b5Var.a(vVar.h, false)));
                jpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                jpVar.draw(canvas);
                canvas.restore();
            }
            if (e12 > 0.0f) {
                hVar.b(f6.l1(e10 * e12, b5Var.a(vVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (uVar.f18144m != f6.l1(0.15f, vVar.h)) {
                int l12 = f6.l1(0.15f, vVar.h);
                uVar.f18144m = l12;
                zVar = zVar2;
                i13 = 1;
                f6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i13 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            if (i15 != 0) {
                i12 = -1;
            } else {
                i12 = 1;
            }
            i14 = i16 + i12;
            uVarArr = uVarArr2;
            f13 = f14;
            i9 = i15;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f18176c.f34854c;
    }

    public int getTotalHeight() {
        int i9;
        a6.a aVar = this.f18177e;
        boolean z10 = ((v) aVar.f101b).f18157a;
        if (!z10 && !((v) aVar.d).f18157a) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        if (z10) {
            v vVar = (v) aVar.d;
            if (vVar.f18157a && ("top".equalsIgnoreCase(vVar.f18163i) || "bottom".equalsIgnoreCase(((v) this.f18177e.d).f18163i))) {
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return AndroidUtilities.dp(58.0f);
        }
        return AndroidUtilities.dp(109.0f);
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), ll.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            u a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f18141j.c(true);
                this.h.f18145n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18145n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                u a3 = a(motionEvent.getX(), motionEvent.getY());
                u uVar = this.h;
                if (a3 == uVar && (callback = this.f18179n) != null) {
                    if (uVar == this.f18178f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f18141j.c(false);
            this.h.f18145n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f18179n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f18180r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        u[] uVarArr = this.f18178f;
        u uVar = uVarArr[0];
        if (uVar.f18145n != drawable && uVar.f18146o != drawable) {
            u uVar2 = uVarArr[1];
            if (uVar2.f18145n != drawable && uVar2.f18146o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
