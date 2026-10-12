package di;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g3 extends s4.m0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int dp = AndroidUtilities.dp(5.0f);
        rect.right = dp;
        rect.bottom = dp;
    }
}
