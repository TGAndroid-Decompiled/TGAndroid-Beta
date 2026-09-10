package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.j6;
public final class f extends View implements a6 {
    public zg.b f10617a;
    public zg.b f10618b;
    public int f10619c;
    public int d;
    public eh.c e;
    public int f10620f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f10617a.setBounds(0, 0, getMeasuredWidth(), this.f10619c);
        this.f10618b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(zg.a aVar, ch.e eVar) {
        bh.d c10 = aVar.c(this, null, false);
        c10.n(eVar);
        zg.b bVar = new zg.b(c10);
        this.f10617a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        bh.d c11 = aVar.c(this, null, false);
        c11.n(eVar);
        zg.b bVar2 = new zg.b(c11);
        this.f10618b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        eh.c cVar = this.e;
        if (cVar != null && (i10 = this.f10620f) != -1) {
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
        this.f10617a.draw(canvas);
        this.f10618b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f10618b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f10617a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        zg.b bVar = this.f10617a;
        if (bVar.f48097q != i10) {
            bVar.f48097q = i10;
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
        if (this.f10619c != i10) {
            this.f10619c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f10617a.f48096p = z10;
        this.f10618b.f48096p = z10;
    }

    public void setup(zg.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i10) {
        this.f10620f = i10;
        if (this.e == null) {
            eh.c cVar = new eh.c();
            this.e = cVar;
            cVar.a(j6.w0(null, i10, false));
            setup(new zg.a(this.e));
        }
    }
}
