package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
public final class f extends View implements x5 {
    public ah.d f14187a;
    public ah.d f14188b;
    public int f14189c;
    public int d;
    public fh.c f14190e;
    public int f14191f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f14187a.setBounds(0, 0, getMeasuredWidth(), this.f14189c);
        this.f14188b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ah.c cVar, dh.e eVar) {
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        ah.d dVar = new ah.d(c10);
        this.f14187a = dVar;
        dVar.b(-AndroidUtilities.dp(30.0f), true);
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        ah.d dVar2 = new ah.d(c11);
        this.f14188b = dVar2;
        dVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        fh.c cVar = this.f14190e;
        if (cVar != null && (i10 = this.f14191f) != -1) {
            cVar.a(h6.x0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14187a.draw(canvas);
        this.f14188b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f14188b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f14187a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ah.d dVar = this.f14187a;
        if (dVar.f562q != i10) {
            dVar.f562q = i10;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i10) {
        if (this.f14189c != i10) {
            this.f14189c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f14187a.f561p = z10;
        this.f14188b.f561p = z10;
    }

    public void setup(ah.c cVar) {
        b(cVar, null);
    }

    public void setupColorKey(int i10) {
        this.f14191f = i10;
        if (this.f14190e == null) {
            fh.c cVar = new fh.c();
            this.f14190e = cVar;
            cVar.a(h6.x0(null, i10, false));
            setup(new ah.c(this.f14190e));
        }
    }
}
