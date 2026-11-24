package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class je implements qq7, eja {
    public final byte a;
    public final FrameLayout b;

    public je(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        Rect rect = new Rect();
        int i = Build.VERSION.SDK_INT;
        tzc tzcVar = wzcVar.a;
        if (i >= 30) {
            iq5 f = tzcVar.f(527);
            rect.set(f.a, f.b, f.c, f.d);
        } else {
            rect.set(tzcVar.i().a, tzcVar.i().b, tzcVar.i().c, tzcVar.i().d);
        }
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + gm.n);
        frameLayout.requestLayout();
        return wzcVar;
    }

    @Override
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 1:
                r59 r59Var = (r59) recyclerView;
                tl0.a(r59Var, canvas, rectF, r59Var, frameLayout);
                return;
            default:
                r59 r59Var2 = (r59) recyclerView;
                tl0.a(r59Var2, canvas, rectF, r59Var2, frameLayout);
                return;
        }
    }
}
