package bi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r3 extends s4.n0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.top = 0;
        rect.bottom = dp;
        rect.right = dp;
        rect.left = dp;
        recyclerView.getClass();
        if (RecyclerView.R(view) % 3 != 2) {
            rect.right = 0;
        }
    }
}
