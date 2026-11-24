package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.LaunchActivity;
public final class a55 extends o39 {
    public final h75 f3;

    public a55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = h75Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        m75 m75Var = (m75) view;
        h75 h75Var = this.f3;
        r65 r65Var = h75Var.J1;
        e55 e55Var = h75Var.T3;
        if (e55Var.r == null && !h75Var.D4.k()) {
            m75Var.setAlpha(1.0f);
            m75Var.setTranslationX(0.0f);
            m75Var.setTranslationY(0.0f);
        }
        a55 a55Var = h75Var.e4;
        m75Var.getClass();
        a55Var.getClass();
        if (RecyclerView.R(m75Var) == -1 && m75Var.getRenderer() != null) {
            return true;
        }
        if (m75Var.getTranslationY() != 0.0f && m75Var.getRenderer() != null && m75Var.getRenderer().c != null) {
            float top = r65Var.getTop() - getTop();
            float measuredHeight = r65Var.getMeasuredHeight() + top;
            float f = e55Var.c;
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
