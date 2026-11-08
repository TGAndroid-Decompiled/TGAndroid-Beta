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
public final class au extends View implements org.telegram.ui.Cells.h9 {
    public boolean D;
    public ds E;
    public final int f21532a;
    public org.telegram.ui.ActionBar.f6 f21533b;
    public ij f21534c;
    public TL_iv.RichMessage d;
    public kv f21535e;
    public int f21536f;
    public int h;
    public int f21537n;
    public int f21538r;
    public boolean f21539s;
    public org.telegram.ui.Cells.i9 f21540w;
    public int f21541x;
    public int f21542y;

    public au(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21541x = -1;
        this.f21542y = -1;
        this.D = true;
        this.f21532a = i7;
        this.f21533b = f6Var;
        qs.i(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        if (this.f21535e != null) {
            int i7 = this.f21536f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.f21535e.f23774n.size(); i11++) {
                arrayList.add(new li.b5((org.telegram.ui.Cells.t9) this.f21535e.f23774n.get(i11), i7, i10, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kv kvVar = this.f21535e;
        if (kvVar != null) {
            kvVar.b(this);
            this.f21535e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kv kvVar = this.f21535e;
        if (kvVar != null) {
            kvVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        int i7;
        boolean z10;
        if (this.f21535e != null) {
            float height = (getHeight() - this.h) - this.f21538r;
            if (this.f21535e.t() > (getHeight() - this.h) - this.f21538r) {
                z9 = true;
            } else {
                z9 = false;
            }
            canvas.save();
            if (z9) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f21536f, this.h);
            kv kvVar = this.f21535e;
            kvVar.S(this.f21536f, Math.max(0, (getWidth() - this.f21535e.C) - this.f21536f));
            TextPaint textPaint = kvVar.f23782w;
            if (kvVar.E()) {
                i7 = org.telegram.ui.ActionBar.k6.Vc;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.Uc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D);
            if (height > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            kvVar.h(canvas, null, z10, 0.0f, height);
            if (this.f21535e.C()) {
                this.f21535e.i(canvas, null);
            }
            if (z9) {
                canvas.translate(-this.f21536f, -this.h);
                canvas.save();
                RectF rectF = g0.P;
                rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
                this.f21535e.f23785z.m(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.i9 i9Var = this.f21540w;
            if (i9Var != null && i9Var.x()) {
                int i10 = this.f21536f;
                int i11 = this.h;
                for (int i12 = 0; i12 < this.f21535e.f23774n.size(); i12++) {
                    org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) this.f21535e.f23774n.get(i12);
                    canvas.save();
                    canvas.translate(t9Var.getX() + i10, t9Var.getY() + i11);
                    this.f21540w.Z(canvas, this, i12);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = (size - this.f21536f) - this.f21537n;
        int i12 = 0;
        if (i11 > 0 && (richMessage = this.d) != null) {
            kv kvVar = this.f21535e;
            if (kvVar == null || kvVar.L(richMessage, i11)) {
                kv kvVar2 = this.f21535e;
                if (kvVar2 != null) {
                    kvVar2.f(this);
                }
                kv kvVar3 = new kv(this.f21534c, i11, (kv) null);
                this.f21535e = kvVar3;
                kvVar3.O = this.f21539s;
                kvVar3.D = this.f21533b;
                kvVar3.v = true;
                kvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.f21535e.b(this);
                    this.f21535e.b0(0);
                }
            }
        } else {
            this.f21535e = null;
        }
        kv kvVar4 = this.f21535e;
        if (kvVar4 != null) {
            i12 = kvVar4.t();
        }
        int i13 = i12 + this.h + this.f21538r;
        int i14 = this.f21542y;
        if (i14 > 0 && i13 > i14) {
            i13 = i14;
        }
        int i15 = this.f21541x;
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
        ds dsVar;
        if (!this.D) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f21540w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (dsVar = this.E) != null) {
                    removeCallbacks(dsVar);
                }
            } else {
                this.f21540w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.E == null) {
                    this.E = new ds(this, 4);
                }
                removeCallbacks(this.E);
                postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.f21535e != null) {
            motionEvent.offsetLocation(-this.f21536f, -this.h);
            boolean M = this.f21535e.M(motionEvent);
            motionEvent.offsetLocation(this.f21536f, this.h);
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
        if (this.f21534c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f21534c = new ij(this.f21532a, tL_message, false, false);
        }
        this.f21534c.f23262k.rich_message = richMessage;
        kv kvVar = this.f21535e;
        if (kvVar != null) {
            kvVar.f(this);
        }
        this.f21535e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z9) {
        this.D = z9;
    }

    public void setMaxHeight(int i7) {
        this.f21542y = i7;
    }

    public void setMinHeight(int i7) {
        this.f21541x = i7;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        if (this.f21536f == i7 && this.h == i10 && this.f21537n == i11 && this.f21538r == i12) {
            return;
        }
        this.f21536f = i7;
        this.h = i10;
        this.f21537n = i11;
        this.f21538r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f21533b = f6Var;
        kv kvVar = this.f21535e;
        if (kvVar != null) {
            kvVar.D = f6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.i9 i9Var) {
        this.f21540w = i9Var;
    }

    public void setTranslationLoading(boolean z9) {
        this.f21539s = z9;
        kv kvVar = this.f21535e;
        if (kvVar != null) {
            kvVar.O = z9;
        }
        invalidate();
    }
}
