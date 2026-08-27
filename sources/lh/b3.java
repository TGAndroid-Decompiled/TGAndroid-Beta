package lh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class b3 extends f2.w0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        int iDp = AndroidUtilities.dp(5.0f);
        rect.right = iDp;
        rect.bottom = iDp;
    }
}
