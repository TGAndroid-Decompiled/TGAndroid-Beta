package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
public final class f extends View implements b6 {
    public bh.c f15125a;
    public bh.c f15126b;
    public int f15127c;
    public int d;
    public gh.c e;
    public int f15128f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f15125a.setBounds(0, 0, getMeasuredWidth(), this.f15127c);
        this.f15126b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f15128f));
    }

    public final void b(bh.b bVar, eh.e eVar) {
        dh.d c10 = bVar.c(this, null, false);
        c10.o(eVar);
        bh.c cVar = new bh.c(c10);
        this.f15125a = cVar;
        cVar.b(-AndroidUtilities.dp(30.0f), true);
        dh.d c11 = bVar.c(this, null, false);
        c11.o(eVar);
        bh.c cVar2 = new bh.c(c11);
        this.f15126b = cVar2;
        cVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f15125a.draw(canvas);
        this.f15126b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f15126b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f15125a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        bh.c cVar = this.f15125a;
        if (cVar.G != i10) {
            cVar.G = i10;
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
        if (this.f15127c != i10) {
            this.f15127c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f15125a.F = z10;
        this.f15126b.F = z10;
    }

    public void setup(bh.b bVar) {
        b(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f15128f = i10;
        if (this.e == null) {
            gh.c cVar = new gh.c();
            this.e = cVar;
            cVar.a(k6.x0(null, i10, false));
            setup(new bh.b(this.e));
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        gh.c cVar = this.e;
        if (cVar != null && (i10 = this.f15128f) != -1) {
            cVar.a(k6.x0(null, i10, false));
            invalidate();
        }
    }
}
