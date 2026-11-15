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
public final class xt extends View implements org.telegram.ui.Cells.g9 {
    public boolean E;
    public as F;
    public final int f27592a;
    public org.telegram.ui.ActionBar.e6 f27593b;
    public gj f27594c;
    public TL_iv.RichMessage d;
    public iv f27595e;
    public int f27596f;
    public int h;
    public int f27597n;
    public int f27598r;
    public boolean f27599s;
    public org.telegram.ui.Cells.h9 f27600w;
    public int f27601x;
    public int f27602y;

    public xt(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f27601x = -1;
        this.f27602y = -1;
        this.E = true;
        this.f27592a = i7;
        this.f27593b = e6Var;
        ns.i(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        if (this.f27595e != null) {
            int i7 = this.f27596f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.f27595e.f24451n.size(); i11++) {
                arrayList.add(new oi.z4((org.telegram.ui.Cells.s9) this.f27595e.f24451n.get(i11), i7, i10, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        iv ivVar = this.f27595e;
        if (ivVar != null) {
            ivVar.b(this);
            this.f27595e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iv ivVar = this.f27595e;
        if (ivVar != null) {
            ivVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        boolean z11;
        if (this.f27595e != null) {
            float height = (getHeight() - this.h) - this.f27598r;
            if (this.f27595e.t() > (getHeight() - this.h) - this.f27598r) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.save();
            if (z10) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f27596f, this.h);
            iv ivVar = this.f27595e;
            ivVar.S(this.f27596f, Math.max(0, (getWidth() - this.f27595e.C) - this.f27596f));
            TextPaint textPaint = ivVar.f24459w;
            if (ivVar.E()) {
                i7 = org.telegram.ui.ActionBar.j6.Yc;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Xc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
            if (height > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            ivVar.h(canvas, null, z11, 0.0f, height);
            if (this.f27595e.C()) {
                this.f27595e.i(canvas, null);
            }
            if (z10) {
                canvas.translate(-this.f27596f, -this.h);
                canvas.save();
                RectF rectF = g0.P;
                rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
                this.f27595e.f24462z.m(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.h9 h9Var = this.f27600w;
            if (h9Var != null && h9Var.x()) {
                int i10 = this.f27596f;
                int i11 = this.h;
                for (int i12 = 0; i12 < this.f27595e.f24451n.size(); i12++) {
                    org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.f27595e.f24451n.get(i12);
                    canvas.save();
                    canvas.translate(s9Var.getX() + i10, s9Var.getY() + i11);
                    this.f27600w.Z(canvas, this, i12);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = (size - this.f27596f) - this.f27597n;
        int i12 = 0;
        if (i11 > 0 && (richMessage = this.d) != null) {
            iv ivVar = this.f27595e;
            if (ivVar == null || ivVar.L(richMessage, i11)) {
                iv ivVar2 = this.f27595e;
                if (ivVar2 != null) {
                    ivVar2.f(this);
                }
                iv ivVar3 = new iv(this.f27594c, i11, (iv) null);
                this.f27595e = ivVar3;
                ivVar3.O = this.f27599s;
                ivVar3.D = this.f27593b;
                ivVar3.v = true;
                ivVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.f27595e.b(this);
                    this.f27595e.b0(0);
                }
            }
        } else {
            this.f27595e = null;
        }
        iv ivVar4 = this.f27595e;
        if (ivVar4 != null) {
            i12 = ivVar4.t();
        }
        int i13 = i12 + this.h + this.f27598r;
        int i14 = this.f27602y;
        if (i14 > 0 && i13 > i14) {
            i13 = i14;
        }
        int i15 = this.f27601x;
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
        as asVar;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27600w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (asVar = this.F) != null) {
                    removeCallbacks(asVar);
                }
            } else {
                this.f27600w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.F == null) {
                    this.F = new as(this, 4);
                }
                removeCallbacks(this.F);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.f27595e != null) {
            motionEvent.offsetLocation(-this.f27596f, -this.h);
            boolean M = this.f27595e.M(motionEvent);
            motionEvent.offsetLocation(this.f27596f, this.h);
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
        if (this.f27594c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f27594c = new gj(this.f27592a, tL_message, false, false);
        }
        this.f27594c.f23817k.rich_message = richMessage;
        iv ivVar = this.f27595e;
        if (ivVar != null) {
            ivVar.f(this);
        }
        this.f27595e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.E = z10;
    }

    public void setMaxHeight(int i7) {
        this.f27602y = i7;
    }

    public void setMinHeight(int i7) {
        this.f27601x = i7;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        if (this.f27596f == i7 && this.h == i10 && this.f27597n == i11 && this.f27598r == i12) {
            return;
        }
        this.f27596f = i7;
        this.h = i10;
        this.f27597n = i11;
        this.f27598r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f27593b = e6Var;
        iv ivVar = this.f27595e;
        if (ivVar != null) {
            ivVar.D = e6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.h9 h9Var) {
        this.f27600w = h9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.f27599s = z10;
        iv ivVar = this.f27595e;
        if (ivVar != null) {
            ivVar.O = z10;
        }
        invalidate();
    }
}
