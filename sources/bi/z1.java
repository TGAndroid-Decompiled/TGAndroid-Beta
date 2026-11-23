package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class z1 extends n41 {
    public static final int f4283b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ah.r rVar = (ah.r) view;
        TLRPC.Chat chat = (TLRPC.Chat) o41Var.H;
        rVar.h(chat.participants_count, chat);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ah.r rVar = new ah.r(context, false, false, h6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
