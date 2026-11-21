package org.telegram.messenger;

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
public final class ut extends View implements org.telegram.ui.Cells.i9 {
    public boolean E;
    public xr F;
    public final int f27269a;
    public org.telegram.ui.ActionBar.h6 f27270b;
    public fj f27271c;
    public TL_iv.RichMessage d;
    public ev f27272e;
    public int f27273f;
    public int h;
    public int f27274n;
    public int f27275r;
    public boolean f27276s;
    public org.telegram.ui.Cells.j9 f27277w;
    public int f27278x;
    public int f27279y;

    public ut(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f27278x = -1;
        this.f27279y = -1;
        this.E = true;
        this.f27269a = i7;
        this.f27270b = h6Var;
        ks.i(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        if (this.f27272e != null) {
            int i7 = this.f27273f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.f27272e.f23806n.size(); i11++) {
                arrayList.add(new oi.b5((org.telegram.ui.Cells.u9) this.f27272e.f23806n.get(i11), i7, i10, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ev evVar = this.f27272e;
        if (evVar != null) {
            evVar.b(this);
            this.f27272e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ev evVar = this.f27272e;
        if (evVar != null) {
            evVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        boolean z11;
        if (this.f27272e != null) {
            float height = (getHeight() - this.h) - this.f27275r;
            if (this.f27272e.t() > (getHeight() - this.h) - this.f27275r) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.save();
            if (z10) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f27273f, this.h);
            ev evVar = this.f27272e;
            evVar.S(this.f27273f, Math.max(0, (getWidth() - this.f27272e.C) - this.f27273f));
            TextPaint textPaint = evVar.f23814w;
            if (evVar.E()) {
                i7 = org.telegram.ui.ActionBar.m6.Yc;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Xc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.m6.w0(i7, evVar.D);
            if (height > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            evVar.h(canvas, null, z11, 0.0f, height);
            if (this.f27272e.C()) {
                this.f27272e.i(canvas, null);
            }
            if (z10) {
                canvas.translate(-this.f27273f, -this.h);
                canvas.save();
                RectF rectF = g0.P;
                rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
                this.f27272e.f23817z.n(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.j9 j9Var = this.f27277w;
            if (j9Var != null && j9Var.x()) {
                int i10 = this.f27273f;
                int i11 = this.h;
                for (int i12 = 0; i12 < this.f27272e.f23806n.size(); i12++) {
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) this.f27272e.f23806n.get(i12);
                    canvas.save();
                    canvas.translate(u9Var.getX() + i10, u9Var.getY() + i11);
                    this.f27277w.Z(canvas, this, i12);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = (size - this.f27273f) - this.f27274n;
        int i12 = 0;
        if (i11 > 0 && (richMessage = this.d) != null) {
            ev evVar = this.f27272e;
            if (evVar == null || evVar.L(richMessage, i11)) {
                ev evVar2 = this.f27272e;
                if (evVar2 != null) {
                    evVar2.f(this);
                }
                ev evVar3 = new ev(this.f27271c, i11, (ev) null);
                this.f27272e = evVar3;
                evVar3.O = this.f27276s;
                evVar3.D = this.f27270b;
                evVar3.v = true;
                evVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.f27272e.b(this);
                    this.f27272e.b0(0);
                }
            }
        } else {
            this.f27272e = null;
        }
        ev evVar4 = this.f27272e;
        if (evVar4 != null) {
            i12 = evVar4.t();
        }
        int i13 = i12 + this.h + this.f27275r;
        int i14 = this.f27279y;
        if (i14 > 0 && i13 > i14) {
            i13 = i14;
        }
        int i15 = this.f27278x;
        if (i15 > 0 && i13 < i15) {
            i13 = i15;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i13 = View.MeasureSpec.getSize(i10);
            }
        } else {
            i13 = Math.min(i13, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(size, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xr xrVar;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27277w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (xrVar = this.F) != null) {
                    removeCallbacks(xrVar);
                }
            } else {
                this.f27277w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.F == null) {
                    this.F = new xr(this, 4);
                }
                removeCallbacks(this.F);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.f27272e != null) {
            motionEvent.offsetLocation(-this.f27273f, -this.h);
            boolean M = this.f27272e.M(motionEvent);
            motionEvent.offsetLocation(this.f27273f, this.h);
            if (M) {
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
        if (this.f27271c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f27271c = new fj(this.f27269a, tL_message, false, false);
        }
        this.f27271c.f23993k.rich_message = richMessage;
        ev evVar = this.f27272e;
        if (evVar != null) {
            evVar.f(this);
        }
        this.f27272e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.E = z10;
    }

    public void setMaxHeight(int i7) {
        this.f27279y = i7;
    }

    public void setMinHeight(int i7) {
        this.f27278x = i7;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        if (this.f27273f == i7 && this.h == i10 && this.f27274n == i11 && this.f27275r == i12) {
            return;
        }
        this.f27273f = i7;
        this.h = i10;
        this.f27274n = i11;
        this.f27275r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f27270b = h6Var;
        ev evVar = this.f27272e;
        if (evVar != null) {
            evVar.D = h6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.j9 j9Var) {
        this.f27277w = j9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.f27276s = z10;
        ev evVar = this.f27272e;
        if (evVar != null) {
            evVar.O = z10;
        }
        invalidate();
    }
}
