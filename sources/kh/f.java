package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
public final class f extends View implements y5 {
    public bh.c f15079a;
    public bh.c f15080b;
    public int f15081c;
    public int d;
    public gh.c e;
    public int f15082f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f15079a.setBounds(0, 0, getMeasuredWidth(), this.f15081c);
        this.f15080b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(bh.b bVar, eh.e eVar) {
        dh.d c10 = bVar.c(this, null, false);
        c10.o(eVar);
        bh.c cVar = new bh.c(c10);
        this.f15079a = cVar;
        cVar.b(-AndroidUtilities.dp(30.0f), true);
        dh.d c11 = bVar.c(this, null, false);
        c11.o(eVar);
        bh.c cVar2 = new bh.c(c11);
        this.f15080b = cVar2;
        cVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void d() {
        int i10;
        gh.c cVar = this.e;
        if (cVar != null && (i10 = this.f15082f) != -1) {
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
        this.f15079a.draw(canvas);
        this.f15080b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f15080b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f15079a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        bh.c cVar = this.f15079a;
        if (cVar.f4374q != i10) {
            cVar.f4374q = i10;
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
        if (this.f15081c != i10) {
            this.f15081c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f15079a.f4373p = z10;
        this.f15080b.f4373p = z10;
    }

    public void setup(bh.b bVar) {
        b(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f15082f = i10;
        if (this.e == null) {
            gh.c cVar = new gh.c();
            this.e = cVar;
            cVar.a(h6.x0(null, i10, false));
            setup(new bh.b(this.e));
        }
    }
}
