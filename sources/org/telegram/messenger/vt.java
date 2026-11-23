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
public final class vt extends View implements org.telegram.ui.Cells.i9 {
    public boolean E;
    public yr F;
    public final int f27569a;
    public org.telegram.ui.ActionBar.h6 f27570b;
    public gj f27571c;
    public TL_iv.RichMessage d;
    public fv f27572e;
    public int f27573f;
    public int h;
    public int f27574n;
    public int f27575r;
    public boolean f27576s;
    public org.telegram.ui.Cells.j9 f27577w;
    public int f27578x;
    public int f27579y;

    public vt(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f27578x = -1;
        this.f27579y = -1;
        this.E = true;
        this.f27569a = i7;
        this.f27570b = h6Var;
        ls.i(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        if (this.f27572e != null) {
            int i7 = this.f27573f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.f27572e.f23951n.size(); i11++) {
                arrayList.add(new oi.a5((org.telegram.ui.Cells.u9) this.f27572e.f23951n.get(i11), i7, i10, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fv fvVar = this.f27572e;
        if (fvVar != null) {
            fvVar.b(this);
            this.f27572e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fv fvVar = this.f27572e;
        if (fvVar != null) {
            fvVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        boolean z11;
        if (this.f27572e != null) {
            float height = (getHeight() - this.h) - this.f27575r;
            if (this.f27572e.t() > (getHeight() - this.h) - this.f27575r) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.save();
            if (z10) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f27573f, this.h);
            fv fvVar = this.f27572e;
            fvVar.S(this.f27573f, Math.max(0, (getWidth() - this.f27572e.C) - this.f27573f));
            TextPaint textPaint = fvVar.f23959w;
            if (fvVar.E()) {
                i7 = org.telegram.ui.ActionBar.m6.Yc;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Xc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.m6.w0(i7, fvVar.D);
            if (height > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            fvVar.h(canvas, null, z11, 0.0f, height);
            if (this.f27572e.C()) {
                this.f27572e.i(canvas, null);
            }
            if (z10) {
                canvas.translate(-this.f27573f, -this.h);
                canvas.save();
                RectF rectF = g0.P;
                rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
                this.f27572e.f23962z.n(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.j9 j9Var = this.f27577w;
            if (j9Var != null && j9Var.x()) {
                int i10 = this.f27573f;
                int i11 = this.h;
                for (int i12 = 0; i12 < this.f27572e.f23951n.size(); i12++) {
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) this.f27572e.f23951n.get(i12);
                    canvas.save();
                    canvas.translate(u9Var.getX() + i10, u9Var.getY() + i11);
                    this.f27577w.Z(canvas, this, i12);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = (size - this.f27573f) - this.f27574n;
        int i12 = 0;
        if (i11 > 0 && (richMessage = this.d) != null) {
            fv fvVar = this.f27572e;
            if (fvVar == null || fvVar.L(richMessage, i11)) {
                fv fvVar2 = this.f27572e;
                if (fvVar2 != null) {
                    fvVar2.f(this);
                }
                fv fvVar3 = new fv(this.f27571c, i11, (fv) null);
                this.f27572e = fvVar3;
                fvVar3.O = this.f27576s;
                fvVar3.D = this.f27570b;
                fvVar3.v = true;
                fvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.f27572e.b(this);
                    this.f27572e.b0(0);
                }
            }
        } else {
            this.f27572e = null;
        }
        fv fvVar4 = this.f27572e;
        if (fvVar4 != null) {
            i12 = fvVar4.t();
        }
        int i13 = i12 + this.h + this.f27575r;
        int i14 = this.f27579y;
        if (i14 > 0 && i13 > i14) {
            i13 = i14;
        }
        int i15 = this.f27578x;
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
        yr yrVar;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27577w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (yrVar = this.F) != null) {
                    removeCallbacks(yrVar);
                }
            } else {
                this.f27577w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.F == null) {
                    this.F = new yr(this, 4);
                }
                removeCallbacks(this.F);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.f27572e != null) {
            motionEvent.offsetLocation(-this.f27573f, -this.h);
            boolean M = this.f27572e.M(motionEvent);
            motionEvent.offsetLocation(this.f27573f, this.h);
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
        if (this.f27571c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f27571c = new gj(this.f27569a, tL_message, false, false);
        }
        this.f27571c.f24177k.rich_message = richMessage;
        fv fvVar = this.f27572e;
        if (fvVar != null) {
            fvVar.f(this);
        }
        this.f27572e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.E = z10;
    }

    public void setMaxHeight(int i7) {
        this.f27579y = i7;
    }

    public void setMinHeight(int i7) {
        this.f27578x = i7;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        if (this.f27573f == i7 && this.h == i10 && this.f27574n == i11 && this.f27575r == i12) {
            return;
        }
        this.f27573f = i7;
        this.h = i10;
        this.f27574n = i11;
        this.f27575r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f27570b = h6Var;
        fv fvVar = this.f27572e;
        if (fvVar != null) {
            fvVar.D = h6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.j9 j9Var) {
        this.f27577w = j9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.f27576s = z10;
        fv fvVar = this.f27572e;
        if (fvVar != null) {
            fvVar.O = z10;
        }
        invalidate();
    }
}
