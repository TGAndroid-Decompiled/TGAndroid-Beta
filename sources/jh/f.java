package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.y5;
public final class f extends View implements y5 {
    public ah.e f14151a;
    public ah.e f14152b;
    public int f14153c;
    public int d;
    public fh.c f14154e;
    public int f14155f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f14151a.setBounds(0, 0, getMeasuredWidth(), this.f14153c);
        this.f14152b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ah.c cVar, dh.e eVar) {
        ch.d c10 = cVar.c(this, null, false);
        c10.x(eVar);
        ah.e eVar2 = new ah.e(c10);
        this.f14151a = eVar2;
        eVar2.b(-AndroidUtilities.dp(30.0f), true);
        ch.d c11 = cVar.c(this, null, false);
        c11.x(eVar);
        ah.e eVar3 = new ah.e(c11);
        this.f14152b = eVar3;
        eVar3.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        fh.c cVar = this.f14154e;
        if (cVar != null && (i10 = this.f14155f) != -1) {
            cVar.a(i6.w0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14151a.draw(canvas);
        this.f14152b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f14152b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f14151a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ah.e eVar = this.f14151a;
        if (eVar.f478q != i10) {
            eVar.f478q = i10;
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
        if (this.f14153c != i10) {
            this.f14153c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f14151a.f477p = z10;
        this.f14152b.f477p = z10;
    }

    public void setup(ah.c cVar) {
        b(cVar, null);
    }

    public void setupColorKey(int i10) {
        this.f14155f = i10;
        if (this.f14154e == null) {
            fh.c cVar = new fh.c();
            this.f14154e = cVar;
            cVar.a(i6.w0(null, i10, false));
            setup(new ah.c(this.f14154e));
        }
    }
}
