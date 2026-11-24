package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ig9 extends View implements eib {
    public boolean E;
    public sr8 F;
    public final int a;
    public wjb b;
    public k27 c;
    public TL_iv.RichMessage d;
    public rh9 e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public fib w;
    public int x;
    public int y;

    public ig9(int i, wjb wjbVar, Context context) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.E = true;
        this.a = i;
        this.b = wjbVar;
        kk7.i(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        if (this.e != null) {
            int i = this.f;
            int i2 = this.h;
            for (int i3 = 0; i3 < this.e.n.size(); i3++) {
                arrayList.add(new xh9((pib) this.e.n.get(i3), i, i2, (byte) 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.b(this);
            this.e.a0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        if (this.e != null) {
            float height = (getHeight() - this.h) - this.r;
            if (this.e.t() > (getHeight() - this.h) - this.r) {
                z = true;
            } else {
                z = false;
            }
            canvas.save();
            if (z) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f, this.h);
            rh9 rh9Var = this.e;
            rh9Var.R(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
            TextPaint textPaint = rh9Var.w;
            if (rh9Var.D()) {
                i = bkb.Xc;
            } else {
                i = bkb.Wc;
            }
            textPaint.linkColor = bkb.v0(i, rh9Var.D);
            if (height > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            rh9Var.h(canvas, null, z2, 0.0f, height);
            if (this.e.B()) {
                this.e.i(canvas, null);
            }
            if (z) {
                canvas.translate(-this.f, -this.h);
                canvas.save();
                RectF rectF = gl.P;
                rectF.set(0.0f, getHeight() - gl.L(24.0f), getWidth(), getHeight());
                this.e.z.s(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            fib fibVar = this.w;
            if (fibVar != null && fibVar.w()) {
                int i2 = this.f;
                int i3 = this.h;
                for (int i4 = 0; i4 < this.e.n.size(); i4++) {
                    pib pibVar = (pib) this.e.n.get(i4);
                    canvas.save();
                    canvas.translate(pibVar.getX() + i2, pibVar.getY() + i3);
                    this.w.Y(canvas, this, i4);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i);
        int i3 = (size - this.f) - this.n;
        int i4 = 0;
        if (i3 > 0 && (richMessage = this.d) != null) {
            rh9 rh9Var = this.e;
            if (rh9Var == null || rh9Var.K(richMessage, i3)) {
                rh9 rh9Var2 = this.e;
                if (rh9Var2 != null) {
                    rh9Var2.f(this);
                }
                rh9 rh9Var3 = new rh9(this.c, i3, (rh9) null);
                this.e = rh9Var3;
                rh9Var3.O = this.s;
                rh9Var3.D = this.b;
                rh9Var3.v = true;
                rh9Var3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.a0(0);
                }
            }
        } else {
            this.e = null;
        }
        rh9 rh9Var4 = this.e;
        if (rh9Var4 != null) {
            i4 = rh9Var4.t();
        }
        int i5 = i4 + this.h + this.r;
        int i6 = this.y;
        if (i6 > 0 && i5 > i6) {
            i5 = i6;
        }
        int i7 = this.x;
        if (i7 > 0 && i5 < i7) {
            i5 = i7;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i5 = View.MeasureSpec.getSize(i2);
            }
        } else {
            i5 = Math.min(i5, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(size, i5);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (runnable = this.F) != null) {
                    removeCallbacks(runnable);
                }
            } else {
                this.w.j0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                sr8 sr8Var = this.F;
                if (sr8Var == null) {
                    sr8Var = new sr8(this, (byte) 23);
                    this.F = sr8Var;
                }
                removeCallbacks(sr8Var);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.e != null) {
            motionEvent.offsetLocation(-this.f, -this.h);
            boolean L = this.e.L(motionEvent);
            motionEvent.offsetLocation(this.f, this.h);
            if (L) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void set(TL_iv.RichMessage richMessage) {
        if (this.d == richMessage) {
            return;
        }
        this.d = richMessage;
        k27 k27Var = this.c;
        if (k27Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            k27 k27Var2 = new k27(this.a, tL_message, false, false);
            this.c = k27Var2;
            k27Var = k27Var2;
        }
        k27Var.k.rich_message = richMessage;
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z) {
        this.E = z;
    }

    public void setMaxHeight(int i) {
        this.y = i;
    }

    public void setMinHeight(int i) {
        this.x = i;
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (this.f == i && this.h == i2 && this.n == i3 && this.r == i4) {
            return;
        }
        this.f = i;
        this.h = i2;
        this.n = i3;
        this.r = i4;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(wjb wjbVar) {
        this.b = wjbVar;
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.D = wjbVar;
        }
    }

    public void setTextSelectionHelper(fib fibVar) {
        this.w = fibVar;
    }

    public void setTranslationLoading(boolean z) {
        this.s = z;
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.O = z;
        }
        invalidate();
    }
}
