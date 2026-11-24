package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class d55 extends c49 {
    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        RecyclerView.R(view);
        if (!h75.u5) {
            rect.set(gl.L(4.0f), 0, gl.L(4.0f), 0);
        } else {
            rect.set(0, gl.L(4.0f), 0, gl.L(4.0f));
        }
    }
}
