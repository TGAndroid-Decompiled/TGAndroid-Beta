package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
public final class f extends View implements p6 {
    public ch.c f17038a;
    public ch.c f17039b;
    public int f17040c;
    public int d;
    public hh.c e;
    public int f17041f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f17038a.setBounds(0, 0, getMeasuredWidth(), this.f17040c);
        this.f17039b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f17041f));
    }

    public final void b(ch.b bVar, fh.e eVar) {
        eh.d c10 = bVar.c(this, null, false);
        c10.v(eVar);
        ch.c cVar = new ch.c(c10);
        this.f17038a = cVar;
        cVar.b(-AndroidUtilities.dp(30.0f), true);
        eh.d c11 = bVar.c(this, null, false);
        c11.v(eVar);
        ch.c cVar2 = new ch.c(c11);
        this.f17039b = cVar2;
        cVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17038a.draw(canvas);
        this.f17039b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f17039b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f17038a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ch.c cVar = this.f17038a;
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
        if (this.f17040c != i10) {
            this.f17040c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f17038a.F = z10;
        this.f17039b.F = z10;
    }

    public void setup(ch.b bVar) {
        b(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f17041f = i10;
        if (this.e == null) {
            hh.c cVar = new hh.c();
            this.e = cVar;
            cVar.a(y6.x0(null, i10, false));
            setup(new ch.b(this.e));
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        hh.c cVar = this.e;
        if (cVar != null && (i10 = this.f17041f) != -1) {
            cVar.a(y6.x0(null, i10, false));
            invalidate();
        }
    }
}
