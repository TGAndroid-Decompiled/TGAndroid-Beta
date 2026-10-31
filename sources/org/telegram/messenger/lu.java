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
public final class lu extends View implements org.telegram.ui.Cells.j9 {
    public boolean D;
    public ms E;
    public final int f16804a;
    public org.telegram.ui.ActionBar.p6 f16805b;
    public jj f16806c;
    public TL_iv.RichMessage d;
    public vv e;
    public int f16807f;
    public int h;
    public int f16808n;
    public int f16809r;
    public boolean f16810s;
    public org.telegram.ui.Cells.k9 f16811w;
    public int f16812x;
    public int f16813y;

    public lu(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f16812x = -1;
        this.f16813y = -1;
        this.D = true;
        this.f16804a = i10;
        this.f16805b = p6Var;
        zs.i(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        if (this.e != null) {
            int i10 = this.f16807f;
            int i11 = this.h;
            for (int i12 = 0; i12 < this.e.f18996n.size(); i12++) {
                arrayList.add(new bi.o5((org.telegram.ui.Cells.u9) this.e.f18996n.get(i12), i10, i11, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.b(this);
            this.e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        if (this.e != null) {
            float height = (getHeight() - this.h) - this.f16809r;
            if (this.e.t() > (getHeight() - this.h) - this.f16809r) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.save();
            if (z10) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f16807f, this.h);
            vv vvVar = this.e;
            vvVar.S(this.f16807f, Math.max(0, (getWidth() - this.e.C) - this.f16807f));
            TextPaint textPaint = vvVar.f19004w;
            if (vvVar.E()) {
                i10 = org.telegram.ui.ActionBar.t6.Vc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Uc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
            if (height > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            vvVar.h(canvas, null, z11, 0.0f, height);
            if (this.e.C()) {
                this.e.i(canvas, null);
            }
            if (z10) {
                canvas.translate(-this.f16807f, -this.h);
                canvas.save();
                RectF rectF = i0.P;
                rectF.set(0.0f, getHeight() - i0.L(24.0f), getWidth(), getHeight());
                this.e.f19007z.o(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.k9 k9Var = this.f16811w;
            if (k9Var != null && k9Var.x()) {
                int i11 = this.f16807f;
                int i12 = this.h;
                for (int i13 = 0; i13 < this.e.f18996n.size(); i13++) {
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) this.e.f18996n.get(i13);
                    canvas.save();
                    canvas.translate(u9Var.getX() + i11, u9Var.getY() + i12);
                    this.f16811w.Z(canvas, this, i13);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = (size - this.f16807f) - this.f16808n;
        int i13 = 0;
        if (i12 > 0 && (richMessage = this.d) != null) {
            vv vvVar = this.e;
            if (vvVar == null || vvVar.L(richMessage, i12)) {
                vv vvVar2 = this.e;
                if (vvVar2 != null) {
                    vvVar2.f(this);
                }
                vv vvVar3 = new vv(this.f16806c, i12, (vv) null);
                this.e = vvVar3;
                vvVar3.O = this.f16810s;
                vvVar3.D = this.f16805b;
                vvVar3.v = true;
                vvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.b0(0);
                }
            }
        } else {
            this.e = null;
        }
        vv vvVar4 = this.e;
        if (vvVar4 != null) {
            i13 = vvVar4.t();
        }
        int i14 = i13 + this.h + this.f16809r;
        int i15 = this.f16813y;
        if (i15 > 0 && i14 > i15) {
            i14 = i15;
        }
        int i16 = this.f16812x;
        if (i16 > 0 && i14 < i16) {
            i14 = i16;
        }
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i14 = View.MeasureSpec.getSize(i11);
            }
        } else {
            i14 = Math.min(i14, View.MeasureSpec.getSize(i11));
        }
        setMeasuredDimension(size, i14);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ms msVar;
        if (!this.D) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f16811w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (msVar = this.E) != null) {
                    removeCallbacks(msVar);
                }
            } else {
                this.f16811w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.E == null) {
                    this.E = new ms(this, 5);
                }
                removeCallbacks(this.E);
                postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.e != null) {
            motionEvent.offsetLocation(-this.f16807f, -this.h);
            boolean M = this.e.M(motionEvent);
            motionEvent.offsetLocation(this.f16807f, this.h);
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
        if (this.f16806c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f16806c = new jj(this.f16804a, tL_message, false, false);
        }
        this.f16806c.f16337k.rich_message = richMessage;
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.D = z10;
    }

    public void setMaxHeight(int i10) {
        this.f16813y = i10;
    }

    public void setMinHeight(int i10) {
        this.f16812x = i10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        if (this.f16807f == i10 && this.h == i11 && this.f16808n == i12 && this.f16809r == i13) {
            return;
        }
        this.f16807f = i10;
        this.h = i11;
        this.f16808n = i12;
        this.f16809r = i13;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f16805b = p6Var;
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.D = p6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.k9 k9Var) {
        this.f16811w = k9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.f16810s = z10;
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.O = z10;
        }
        invalidate();
    }
}
