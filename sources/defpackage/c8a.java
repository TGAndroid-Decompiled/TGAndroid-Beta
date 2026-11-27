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
public final class c8a extends View implements snb {
    public static final bma x;
    public ImageReceiver a;
    public rb0 b;
    public hf0 c;
    public Paint d;
    public Paint e;
    public vpa f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;
    public int w;

    static {
        bma bmaVar = new bma(new vr9((byte) 10), new vr9((byte) 11));
        bmaVar.c = 100.0f;
        x = bmaVar;
    }

    public final void a(boolean z, boolean z2, float f) {
        if (z) {
            vpa vpaVar = this.f;
            if (vpaVar != null) {
                vpaVar.d();
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
                vpa vpaVar2 = new vpa(this, x);
                vpaVar2.b = f3;
                vpaVar2.c = true;
                this.f = vpaVar2;
                if (f < this.n) {
                    z3 = true;
                }
                float f4 = f * 100.0f;
                this.s = z3;
                this.r = !z3;
                wpa wpaVar = new wpa(f4);
                wpaVar.i = f4;
                wpaVar.b(450.0f);
                wpaVar.a(1.0f);
                vpaVar2.m = wpaVar;
                this.f.b(new f02(this, z3, f3, f4));
                this.f.a(new iw0(this, (byte) 9));
                this.f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(k43.f);
            this.h.addUpdateListener(new b49(this, (byte) 24));
            this.h.addListener(new po9(this, (byte) 10));
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
        float strokeWidth = paint2.getStrokeWidth() + hl.L(10.0f);
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
        rb0 rb0Var = this.b;
        if (tLObject instanceof TLRPC.User) {
            str = lbc.k((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(ob6.a0("AccDescrSendAsPeer", null, 2131754770, str));
        rb0Var.k(tLObject);
        this.a.U(tLObject, rb0Var, null);
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
        this.d.setColor(aob.w0(null, aob.Uf, false));
        this.e.setColor(aob.w0(null, aob.Tf, false));
        if (this.c != null) {
            int p1 = aob.p1(0.2f, aob.w0(null, aob.d6, false));
            if (p1 != this.w) {
                this.w = p1;
                aob.F1(this.c, p1, true);
            }
            invalidate();
            return;
        }
        this.w = aob.p1(0.2f, aob.w0(null, aob.d6, false));
        int L = hl.L(18.0f);
        int i = this.w;
        hf0 i0 = aob.i0(L, L, L, L, 0, i, i);
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
