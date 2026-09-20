package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
public final class f extends View implements z5 {
    public ah.e f13029a;
    public ah.e f13030b;
    public int f13031c;
    public int d;
    public fh.c e;
    public int f13032f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f13029a.setBounds(0, 0, getMeasuredWidth(), this.f13031c);
        this.f13030b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ah.c cVar, dh.e eVar) {
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        ah.e eVar2 = new ah.e(c10);
        this.f13029a = eVar2;
        eVar2.b(-AndroidUtilities.dp(30.0f), true);
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        ah.e eVar3 = new ah.e(c11);
        this.f13030b = eVar3;
        eVar3.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        fh.c cVar = this.e;
        if (cVar != null && (i10 = this.f13032f) != -1) {
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
        this.f13029a.draw(canvas);
        this.f13030b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f13030b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f13029a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ah.e eVar = this.f13029a;
        if (eVar.f443q != i10) {
            eVar.f443q = i10;
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
        if (this.f13031c != i10) {
            this.f13031c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f13029a.f442p = z10;
        this.f13030b.f442p = z10;
    }

    public void setup(ah.c cVar) {
        b(cVar, null);
    }

    public void setupColorKey(int i10) {
        this.f13032f = i10;
        if (this.e == null) {
            fh.c cVar = new fh.c();
            this.e = cVar;
            cVar.a(j6.w0(null, i10, false));
            setup(new ah.c(this.e));
        }
    }
}
