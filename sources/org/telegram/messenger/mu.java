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
public final class mu extends View implements org.telegram.ui.Cells.j9 {
    public boolean D;
    public ns E;
    public final int f17188a;
    public org.telegram.ui.ActionBar.p6 f17189b;
    public kj f17190c;
    public TL_iv.RichMessage d;
    public wv e;
    public int f17191f;
    public int h;
    public int f17192n;
    public int f17193r;
    public boolean f17194s;
    public org.telegram.ui.Cells.k9 f17195w;
    public int f17196x;
    public int f17197y;

    public mu(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f17196x = -1;
        this.f17197y = -1;
        this.D = true;
        this.f17188a = i10;
        this.f17189b = p6Var;
        at.i(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        if (this.e != null) {
            int i10 = this.f17191f;
            int i11 = this.h;
            for (int i12 = 0; i12 < this.e.f19339n.size(); i12++) {
                arrayList.add(new bi.o5((org.telegram.ui.Cells.u9) this.e.f19339n.get(i12), i10, i11, 3));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wv wvVar = this.e;
        if (wvVar != null) {
            wvVar.b(this);
            this.e.b0(0);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wv wvVar = this.e;
        if (wvVar != null) {
            wvVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        if (this.e != null) {
            float height = (getHeight() - this.h) - this.f17193r;
            if (this.e.t() > (getHeight() - this.h) - this.f17193r) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.save();
            if (z10) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.f17191f, this.h);
            wv wvVar = this.e;
            wvVar.S(this.f17191f, Math.max(0, (getWidth() - this.e.C) - this.f17191f));
            TextPaint textPaint = wvVar.f19347w;
            if (wvVar.E()) {
                i10 = org.telegram.ui.ActionBar.t6.Vc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Uc;
            }
            textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
            if (height > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            wvVar.h(canvas, null, z11, 0.0f, height);
            if (this.e.C()) {
                this.e.i(canvas, null);
            }
            if (z10) {
                canvas.translate(-this.f17191f, -this.h);
                canvas.save();
                RectF rectF = i0.P;
                rectF.set(0.0f, getHeight() - i0.L(24.0f), getWidth(), getHeight());
                this.e.f19350z.o(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.k9 k9Var = this.f17195w;
            if (k9Var != null && k9Var.x()) {
                int i11 = this.f17191f;
                int i12 = this.h;
                for (int i13 = 0; i13 < this.e.f19339n.size(); i13++) {
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) this.e.f19339n.get(i13);
                    canvas.save();
                    canvas.translate(u9Var.getX() + i11, u9Var.getY() + i12);
                    this.f17195w.Z(canvas, this, i13);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = (size - this.f17191f) - this.f17192n;
        int i13 = 0;
        if (i12 > 0 && (richMessage = this.d) != null) {
            wv wvVar = this.e;
            if (wvVar == null || wvVar.L(richMessage, i12)) {
                wv wvVar2 = this.e;
                if (wvVar2 != null) {
                    wvVar2.f(this);
                }
                wv wvVar3 = new wv(this.f17190c, i12, (wv) null);
                this.e = wvVar3;
                wvVar3.O = this.f17194s;
                wvVar3.D = this.f17189b;
                wvVar3.v = true;
                wvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.b0(0);
                }
            }
        } else {
            this.e = null;
        }
        wv wvVar4 = this.e;
        if (wvVar4 != null) {
            i13 = wvVar4.t();
        }
        int i14 = i13 + this.h + this.f17193r;
        int i15 = this.f17197y;
        if (i15 > 0 && i14 > i15) {
            i14 = i15;
        }
        int i16 = this.f17196x;
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
        ns nsVar;
        if (!this.D) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f17195w != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 2 || action == 3) && (nsVar = this.E) != null) {
                    removeCallbacks(nsVar);
                }
            } else {
                this.f17195w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.E == null) {
                    this.E = new ns(this, 5);
                }
                removeCallbacks(this.E);
                postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
            }
        }
        if (this.e != null) {
            motionEvent.offsetLocation(-this.f17191f, -this.h);
            boolean M = this.e.M(motionEvent);
            motionEvent.offsetLocation(this.f17191f, this.h);
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
        if (this.f17190c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.f17190c = new kj(this.f17188a, tL_message, false, false);
        }
        this.f17190c.f16690k.rich_message = richMessage;
        wv wvVar = this.e;
        if (wvVar != null) {
            wvVar.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.D = z10;
    }

    public void setMaxHeight(int i10) {
        this.f17197y = i10;
    }

    public void setMinHeight(int i10) {
        this.f17196x = i10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        if (this.f17191f == i10 && this.h == i11 && this.f17192n == i12 && this.f17193r == i13) {
            return;
        }
        this.f17191f = i10;
        this.h = i11;
        this.f17192n = i12;
        this.f17193r = i13;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f17189b = p6Var;
        wv wvVar = this.e;
        if (wvVar != null) {
            wvVar.D = p6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.k9 k9Var) {
        this.f17195w = k9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.f17194s = z10;
        wv wvVar = this.e;
        if (wvVar != null) {
            wvVar.O = z10;
        }
        invalidate();
    }
}
