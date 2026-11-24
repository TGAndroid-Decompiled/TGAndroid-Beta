package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m6a extends View implements vlb {
    public static final ika x;
    public ImageReceiver a;
    public pc0 b;
    public fg0 c;
    public Paint d;
    public Paint e;
    public zna f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;
    public int w;

    static {
        ika ikaVar = new ika(new dq9((byte) 8), new dq9((byte) 9));
        ikaVar.c = 100.0f;
        x = ikaVar;
    }

    public final void a(boolean z, boolean z2, float f) {
        if (z) {
            zna znaVar = this.f;
            if (znaVar != null) {
                znaVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z3 = false;
            this.s = false;
            this.r = false;
            float f2 = this.n;
            if (z2) {
                float f3 = f2 * 100.0f;
                zna znaVar2 = new zna(this, x);
                znaVar2.b = f3;
                znaVar2.c = true;
                this.f = znaVar2;
                if (f < this.n) {
                    z3 = true;
                }
                float f4 = f * 100.0f;
                this.s = z3;
                this.r = !z3;
                aoa aoaVar = new aoa(f4);
                aoaVar.i = f4;
                aoaVar.b(450.0f);
                aoaVar.a(1.0f);
                znaVar2.m = aoaVar;
                this.f.b(new a12(this, z3, f3, f4));
                this.f.a(new hx0(this, (byte) 8));
                this.f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(d53.f);
            this.h.addUpdateListener(new p29(this, (byte) 24));
            this.h.addListener(new c39(this, (byte) 13));
            this.h.start();
            return;
        }
        this.n = f;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f = 1.0f;
        if (this.r) {
            f = 1.0f - this.n;
        } else if (this.s) {
            f = this.n;
        }
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.a.h(canvas, null);
        int i = (int) (this.n * 255.0f);
        paint.setAlpha(i);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i);
        float strokeWidth = paint2.getStrokeWidth() + gm.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.a.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        pc0 pc0Var = this.b;
        if (tLObject instanceof TLRPC.User) {
            str = m9c.k((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(jb6.a0("AccDescrSendAsPeer", null, 2131754774, str));
        pc0Var.k(tLObject);
        this.a.U(tLObject, pc0Var, null);
    }

    public void setProgress(float f) {
        boolean z;
        if (f != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        a(true, z, f);
    }

    @Override
    public final void updateColors() {
        this.d.setColor(cmb.w0(null, cmb.Tf, false));
        this.e.setColor(cmb.w0(null, cmb.Sf, false));
        if (this.c != null) {
            int p1 = cmb.p1(0.2f, cmb.w0(null, cmb.c6, false));
            if (p1 != this.w) {
                this.w = p1;
                cmb.F1(this.c, p1, true);
            }
            invalidate();
            return;
        }
        this.w = cmb.p1(0.2f, cmb.w0(null, cmb.c6, false));
        int L = gm.L(18.0f);
        int i = this.w;
        fg0 i0 = cmb.i0(L, L, L, L, 0, i, i);
        this.c = i0;
        i0.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
