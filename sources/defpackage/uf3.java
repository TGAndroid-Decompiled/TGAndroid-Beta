package defpackage;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class uf3 extends jf0 {
    public StaticLayout E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public TLRPC.RecentMeUrl f;
    public ImageReceiver h;
    public rb0 n;
    public int r;
    public StaticLayout s;
    public int w;
    public int x;
    public int y;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.H) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), aob.t0);
        } else {
            canvas2 = canvas;
        }
        if (this.s != null) {
            canvas2.save();
            canvas2.translate(this.r, hl.L(13.0f));
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (this.E != null) {
            canvas2.save();
            canvas2.translate(this.y, this.x);
            try {
                this.E.draw(canvas2);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            canvas2.restore();
        }
        if (this.F) {
            jf0.u(this.w, hl.L(16.5f), aob.e1);
            jf0.u(this.w, hl.L(16.5f), aob.i1);
            aob.e1.draw(canvas2);
            aob.i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    @Override
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(72.0f));
    }

    public void setDialogSelected(boolean z) {
        if (this.H != z) {
            invalidate();
        }
        this.H = z;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f = recentMeUrl;
        requestLayout();
    }
}
