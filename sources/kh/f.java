package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
public final class f extends View implements z5 {
    public bh.c f14981a;
    public bh.c f14982b;
    public int f14983c;
    public int d;
    public gh.c f14984e;
    public int f14985f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f14981a.setBounds(0, 0, getMeasuredWidth(), this.f14983c);
        this.f14982b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(bh.b bVar, eh.e eVar) {
        dh.d c10 = bVar.c(this, null, false);
        c10.n(eVar);
        bh.c cVar = new bh.c(c10);
        this.f14981a = cVar;
        cVar.b(-AndroidUtilities.dp(30.0f), true);
        dh.d c11 = bVar.c(this, null, false);
        c11.n(eVar);
        bh.c cVar2 = new bh.c(c11);
        this.f14982b = cVar2;
        cVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void d() {
        int i10;
        gh.c cVar = this.f14984e;
        if (cVar != null && (i10 = this.f14985f) != -1) {
            cVar.a(j6.w0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14981a.draw(canvas);
        this.f14982b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f14982b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f14981a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        bh.c cVar = this.f14981a;
        if (cVar.f2696q != i10) {
            cVar.f2696q = i10;
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
        if (this.f14983c != i10) {
            this.f14983c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f14981a.f2695p = z10;
        this.f14982b.f2695p = z10;
    }

    public void setup(bh.b bVar) {
        b(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f14985f = i10;
        if (this.f14984e == null) {
            gh.c cVar = new gh.c();
            this.f14984e = cVar;
            cVar.a(j6.w0(null, i10, false));
            setup(new bh.b(this.f14984e));
        }
    }
}
