package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z5;
public final class f extends View implements z5 {
    public ah.d f14188a;
    public ah.d f14189b;
    public int f14190c;
    public int d;
    public fh.c f14191e;
    public int f14192f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f14188a.setBounds(0, 0, getMeasuredWidth(), this.f14190c);
        this.f14189b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ah.c cVar, dh.e eVar) {
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        ah.d dVar = new ah.d(c10);
        this.f14188a = dVar;
        dVar.b(-AndroidUtilities.dp(30.0f), true);
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        ah.d dVar2 = new ah.d(c11);
        this.f14189b = dVar2;
        dVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        fh.c cVar = this.f14191e;
        if (cVar != null && (i10 = this.f14192f) != -1) {
            cVar.a(i6.x0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14188a.draw(canvas);
        this.f14189b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f14189b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f14188a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ah.d dVar = this.f14188a;
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
        if (this.f14190c != i10) {
            this.f14190c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f14188a.f561p = z10;
        this.f14189b.f561p = z10;
    }

    public void setup(ah.c cVar) {
        b(cVar, null);
    }

    public void setupColorKey(int i10) {
        this.f14192f = i10;
        if (this.f14191e == null) {
            fh.c cVar = new fh.c();
            this.f14191e = cVar;
            cVar.a(i6.x0(null, i10, false));
            setup(new ah.c(this.f14191e));
        }
    }
}
