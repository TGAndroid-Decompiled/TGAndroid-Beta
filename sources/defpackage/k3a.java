package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k3a extends FrameLayout implements vlb {
    public final ei7 E;
    public final ln F;
    public final ln G;
    public final ln H;
    public final ho I;
    public final fg0 a;
    public final int b;
    public int c;
    public final int d;
    public final lka e;
    public final lka f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final ylb x;
    public boolean y;

    public k3a(defpackage.ylb r22, android.content.Context r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3a.<init>(ylb, android.content.Context, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j;
        cd6 h = dd6.f(this.d).h(this.n);
        if (h != null) {
            if (this.w) {
                String M0 = jb6.M0(2131744527, null);
                TLRPC.Message message = h.h.k;
                int i = message.edit_date;
                if (i != 0) {
                    j = i;
                } else {
                    j = message.date;
                }
                b(M0, jb6.D(j));
                return;
            }
            b(jb6.M0(2131745128, null), jb6.M0(2131745127, null));
            return;
        }
        b(jb6.M0(2131745352, null), jb6.M0(2131745347, null));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i = this.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public final void b(String str, String str2) {
        this.f.l(str, false);
        this.e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            ei7 ei7Var = this.E;
            gm.r(ei7Var);
            gm.d3(ei7Var, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.E);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e;
        float f;
        int i;
        Paint U0;
        float L;
        int i2;
        boolean z = this.y;
        ylb ylbVar = this.x;
        if (z && (U0 = cmb.U0("paintDivider", ylbVar)) != null) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i2 = gm.L(73.0f);
            } else {
                i2 = 0;
            }
            float f2 = L;
            canvas2 = canvas;
            canvas2.drawRect(f2, measuredHeight, measuredWidth - i2, getMeasuredHeight(), U0);
        } else {
            canvas2 = canvas;
        }
        if (!this.w) {
            int i3 = this.d;
            cd6 h = dd6.f(i3).h(this.n);
            ln lnVar = this.F;
            float f3 = lnVar.c;
            int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
            ln lnVar2 = this.G;
            if (h != null && (i = h.c) >= currentTime && h.d != Integer.MAX_VALUE) {
                f3 = Math.abs(i - currentTime) / h.d;
                e = lnVar2.d(true);
            } else {
                lnVar2.getClass();
                e = lnVar2.e(false, 0.0f);
            }
            float f4 = e;
            float f5 = f3;
            if (f4 <= 0.0f) {
                return;
            }
            boolean z2 = jb6.a0;
            RectF rectF = this.r;
            if (z2) {
                rectF.set(gm.L(13.0f), (getMeasuredHeight() / 2.0f) - gm.L(15.0f), gm.L(43.0f), (getMeasuredHeight() / 2.0f) + gm.L(15.0f));
            } else {
                rectF.set(getMeasuredWidth() - gm.L(43.0f), (getMeasuredHeight() / 2.0f) - gm.L(15.0f), getMeasuredWidth() - gm.L(13.0f), (getMeasuredHeight() / 2.0f) + gm.L(15.0f));
            }
            canvas2.save();
            float R1 = gm.R1(0.6f, 1.0f, f4);
            canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
            int v0 = cmb.v0(cmb.ij, ylbVar);
            cmb.k2.setColor(v0);
            int alpha = cmb.k2.getAlpha();
            float f6 = alpha;
            cmb.k2.setAlpha((int) (0.2f * f6 * f4));
            canvas2.drawArc(this.r, -90.0f, 360.0f, false, cmb.k2);
            cmb.k2.setAlpha((int) (f6 * f4));
            canvas.drawArc(this.r, -90.0f, lnVar.e(false, f5) * (-360.0f), false, cmb.k2);
            cmb.k2.setAlpha(alpha);
            ho hoVar = this.I;
            if (h != null) {
                hoVar.t(jb6.C(Math.abs(h.c - currentTime)), true, true);
            }
            int length = hoVar.i.length();
            if (length > 4) {
                f = 0.75f;
            } else if (length > 3) {
                f = 0.85f;
            } else {
                f = 1.0f;
            }
            float e2 = this.H.e(false, f);
            canvas.scale(e2, e2, rectF.centerX(), rectF.centerY());
            hoVar.u(v0);
            hoVar.C = (int) (f4 * 255.0f);
            hoVar.setBounds((int) rectF.left, (int) (rectF.centerY() - gm.L(13.0f)), (int) rectF.right, (int) (rectF.centerY() + gm.L(12.0f)));
            hoVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
    }

    public void setDialogId(long j) {
        this.n = j;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z) {
        float f;
        float f2;
        if (dd6.f(this.d).h(this.n) == null) {
            float f3 = 0.5f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            this.f.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            this.e.setAlpha(f2);
            if (z) {
                f3 = 1.0f;
            }
            this.h.setAlpha(f3);
        }
        if (this.s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        fg0 fg0Var = this.a;
        if (fg0Var != null) {
            try {
                int i = this.b;
                if (i >= 0 && (v0 = cmb.v0(i, this.x)) != this.c) {
                    this.c = v0;
                    cmb.F1(fg0Var, v0, false);
                    cmb.F1(fg0Var, v0, true);
                    ImageView imageView = this.h;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
