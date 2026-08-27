package lh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class u2 extends f2.w0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        int iDp = AndroidUtilities.dp(4.0f);
        rect.top = 0;
        rect.bottom = iDp;
        rect.right = iDp;
        rect.left = iDp;
        recyclerView.getClass();
        if (RecyclerView.R(view) % 3 != 2) {
            rect.right = 0;
        }
    }
}
