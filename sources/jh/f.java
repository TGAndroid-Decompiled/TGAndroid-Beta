package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
public final class f extends View implements x5 {
    public ah.d f14185a;
    public ah.d f14186b;
    public int f14187c;
    public int d;
    public fh.c f14188e;
    public int f14189f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f14185a.setBounds(0, 0, getMeasuredWidth(), this.f14187c);
        this.f14186b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ah.c cVar, dh.e eVar) {
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        ah.d dVar = new ah.d(c10);
        this.f14185a = dVar;
        dVar.b(-AndroidUtilities.dp(30.0f), true);
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        ah.d dVar2 = new ah.d(c11);
        this.f14186b = dVar2;
        dVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        fh.c cVar = this.f14188e;
        if (cVar != null && (i10 = this.f14189f) != -1) {
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
        this.f14185a.draw(canvas);
        this.f14186b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f14186b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f14185a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ah.d dVar = this.f14185a;
        if (dVar.f564q != i10) {
            dVar.f564q = i10;
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
        if (this.f14187c != i10) {
            this.f14187c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f14185a.f563p = z10;
        this.f14186b.f563p = z10;
    }

    public void setup(ah.c cVar) {
        b(cVar, null);
    }

    public void setupColorKey(int i10) {
        this.f14189f = i10;
        if (this.f14188e == null) {
            fh.c cVar = new fh.c();
            this.f14188e = cVar;
            cVar.a(h6.x0(null, i10, false));
            setup(new ah.c(this.f14188e));
        }
    }
}
