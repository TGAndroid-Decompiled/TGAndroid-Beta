package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends s4.n0 {
    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.top = 0;
        rect.bottom = dp;
        rect.right = dp;
        rect.left = dp;
        if (RecyclerView.R(view) % 3 != 2) {
            rect.right = 0;
        }
    }
}
