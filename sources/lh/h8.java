package lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class h8 extends m41 {

    public static final int f16076a = 0;

    static {
        m41.setup(new h8());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        i8 i8Var = (i8) view;
        Object obj = n41Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = n41Var.D;
        org.telegram.ui.Components.j6 j6Var = i8Var.f16131e;
        org.telegram.ui.Components.j6 j6Var2 = i8Var.d;
        ImageView imageView = i8Var.f16130c;
        ImageView imageView2 = i8Var.f16129b;
        boolean z11 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z11 ? 1.0f : 0.0f);
        imageView2.setScaleX(z11 ? 1.0f : 0.4f);
        imageView2.setScaleY(z11 ? 1.0f : 0.4f);
        imageView.setAlpha(z11 ? 0.0f : 1.0f);
        imageView.setScaleX(z11 ? 0.4f : 1.0f);
        imageView.setScaleY(z11 ? 0.4f : 1.0f);
        if (z11) {
            j6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            j6Var.c(webPage.description, false, true);
        } else {
            j6Var2.c(i8Var.h, false, true);
            j6Var.c(i8Var.f16133n, false, true);
        }
        i8Var.f16132f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new i8(context);
    }
}
