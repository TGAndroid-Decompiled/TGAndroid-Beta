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
public final class st extends View implements org.telegram.ui.Cells.g9 {
    public boolean E;
    public vs F;
    public final int f25414a;
    public org.telegram.ui.ActionBar.e6 f25415b;
    public zi f25416c;
    public TL_iv.RichMessage d;
    public cv f25417e;
    public int f25418f;
    public int h;
    public int f25419n;
    public int f25420r;
    public boolean f25421s;
    public org.telegram.ui.Cells.h9 f25422w;
    public int f25423x;
    public int f25424y;

    public st(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f25423x = -1;
        this.f25424y = -1;
        this.E = true;
        this.f25414a = i3;
        this.f25415b = e6Var;
        hs.i(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        if (this.f25417e != null) {
            int i3 = this.f25418f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.f25417e.f22076n.size(); i11++) {
                arrayList.add(new mi.c5((org.telegram.ui.Cells.s9) this.f25417e.f22076n.get(i11), i3, i10, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cv cvVar = this.f25417e;
        if (cvVar != null) {
            cvVar.b(this);
            this.f25417e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cv cvVar = this.f25417e;
        if (cvVar != null) {
            cvVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i3;
        boolean z11;
        if (this.f25417e != null) {
            float height = (getHeight() - this.h) - this.f25420r;
            if (this.f25417e.t() > (getHeight() - this.h) - this.f25420r) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.save();
            if (z10) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f25418f, this.h);
            cv cvVar = this.f25417e;
            cvVar.S(this.f25418f, Math.max(0, (getWidth() - this.f25417e.C) - this.f25418f));
            TextPaint textPaint = cvVar.f22084w;
            if (cvVar.E()) {
                i3 = org.telegram.ui.ActionBar.k6.Vc;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.Uc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
            if (height > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            cvVar.h(canvas, null, z11, 0.0f, height);
            if (this.f25417e.C()) {
                this.f25417e.i(canvas, null);
            }
            if (z10) {
                canvas.translate(-this.f25418f, -this.h);
                canvas.save();
                RectF rectF = g0.P;
                rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
                this.f25417e.f22087z.w(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.h9 h9Var = this.f25422w;
            if (h9Var != null && h9Var.x()) {
                int i10 = this.f25418f;
                int i11 = this.h;
                for (int i12 = 0; i12 < this.f25417e.f22076n.size(); i12++) {
                    org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.f25417e.f22076n.get(i12);
                    canvas.save();
                    canvas.translate(s9Var.getX() + i10, s9Var.getY() + i11);
                    this.f25422w.Z(canvas, this, i12);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i3);
        int i11 = (size - this.f25418f) - this.f25419n;
        int i12 = 0;
        if (i11 > 0 && (richMessage = this.d) != null) {
            cv cvVar = this.f25417e;
            if (cvVar == null || cvVar.L(richMessage, i11)) {
                cv cvVar2 = this.f25417e;
                if (cvVar2 != null) {
                    cvVar2.f(this);
                }
                cv cvVar3 = new cv(this.f25416c, i11, (cv) null);
                this.f25417e = cvVar3;
                cvVar3.O = this.f25421s;
                cvVar3.D = this.f25415b;
                cvVar3.v = true;
                cvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.f25417e.b(this);
                    this.f25417e.b0(0);
                }
            }
        } else {
            this.f25417e = null;
        }
        cv cvVar4 = this.f25417e;
        if (cvVar4 != null) {
            i12 = cvVar4.t();
        }
        int i13 = i12 + this.h + this.f25420r;
        int i14 = this.f25424y;
        if (i14 > 0 && i13 > i14) {
            i13 = i14;
        }
        int i15 = this.f25423x;
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
        vs vsVar;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f25422w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (vsVar = this.F) != null) {
                    removeCallbacks(vsVar);
                }
            } else {
                this.f25422w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.F == null) {
                    this.F = new vs(this, 4);
                }
                removeCallbacks(this.F);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.f25417e != null) {
            motionEvent.offsetLocation(-this.f25418f, -this.h);
            boolean M = this.f25417e.M(motionEvent);
            motionEvent.offsetLocation(this.f25418f, this.h);
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
        if (this.f25416c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f25416c = new zi(this.f25414a, tL_message, false, false);
        }
        this.f25416c.f26868k.rich_message = richMessage;
        cv cvVar = this.f25417e;
        if (cvVar != null) {
            cvVar.f(this);
        }
        this.f25417e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.E = z10;
    }

    public void setMaxHeight(int i3) {
        this.f25424y = i3;
    }

    public void setMinHeight(int i3) {
        this.f25423x = i3;
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        if (this.f25418f == i3 && this.h == i10 && this.f25419n == i11 && this.f25420r == i12) {
            return;
        }
        this.f25418f = i3;
        this.h = i10;
        this.f25419n = i11;
        this.f25420r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25415b = e6Var;
        cv cvVar = this.f25417e;
        if (cvVar != null) {
            cvVar.D = e6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.h9 h9Var) {
        this.f25422w = h9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.f25421s = z10;
        cv cvVar = this.f25417e;
        if (cvVar != null) {
            cvVar.O = z10;
        }
        invalidate();
    }
}
