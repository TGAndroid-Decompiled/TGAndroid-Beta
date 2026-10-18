package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
public final class f extends View implements y5 {
    public bh.c f15078a;
    public bh.c f15079b;
    public int f15080c;
    public int d;
    public gh.c e;
    public int f15081f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f15078a.setBounds(0, 0, getMeasuredWidth(), this.f15080c);
        this.f15079b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(bh.b bVar, eh.e eVar) {
        dh.d c10 = bVar.c(this, null, false);
        c10.o(eVar);
        bh.c cVar = new bh.c(c10);
        this.f15078a = cVar;
        cVar.b(-AndroidUtilities.dp(30.0f), true);
        dh.d c11 = bVar.c(this, null, false);
        c11.o(eVar);
        bh.c cVar2 = new bh.c(c11);
        this.f15079b = cVar2;
        cVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void d() {
        int i10;
        gh.c cVar = this.e;
        if (cVar != null && (i10 = this.f15081f) != -1) {
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
        this.f15078a.draw(canvas);
        this.f15079b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f15079b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f15078a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        bh.c cVar = this.f15078a;
        if (cVar.f4378q != i10) {
            cVar.f4378q = i10;
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
        if (this.f15080c != i10) {
            this.f15080c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f15078a.f4377p = z10;
        this.f15079b.f4377p = z10;
    }

    public void setup(bh.b bVar) {
        b(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f15081f = i10;
        if (this.e == null) {
            gh.c cVar = new gh.c();
            this.e = cVar;
            cVar.a(h6.x0(null, i10, false));
            setup(new bh.b(this.e));
        }
    }
}
