package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.LaunchActivity;
public final class c75 extends d79 {
    public final j95 f3;

    public c75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = j95Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o95 o95Var = (o95) view;
        j95 j95Var = this.f3;
        t85 t85Var = j95Var.J1;
        g75 g75Var = j95Var.T3;
        if (g75Var.r == null && !j95Var.D4.k()) {
            o95Var.setAlpha(1.0f);
            o95Var.setTranslationX(0.0f);
            o95Var.setTranslationY(0.0f);
        }
        c75 c75Var = j95Var.e4;
        o95Var.getClass();
        c75Var.getClass();
        if (RecyclerView.S(o95Var) == -1 && o95Var.getRenderer() != null) {
            return true;
        }
        if (o95Var.getTranslationY() != 0.0f && o95Var.getRenderer() != null && o95Var.getRenderer().c != null) {
            float top = t85Var.getTop() - getTop();
            float measuredHeight = t85Var.getMeasuredHeight() + top;
            float f = g75Var.c;
            canvas.save();
            float f2 = 1.0f - f;
            canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }
}
