package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class d8 extends m41 {
    public static final int f14318b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        e8 e8Var = (e8) view;
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = n41Var.E;
        org.telegram.ui.Components.n6 n6Var = e8Var.f14403e;
        org.telegram.ui.Components.n6 n6Var2 = e8Var.d;
        ImageView imageView = e8Var.f14402c;
        ImageView imageView2 = e8Var.f14401b;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        imageView2.setScaleX(f11);
        if (z11) {
            f12 = 1.0f;
        } else {
            f12 = 0.4f;
        }
        imageView2.setScaleY(f12);
        if (!z11) {
            f14 = 1.0f;
        }
        imageView.setAlpha(f14);
        if (z11) {
            f13 = 0.4f;
        } else {
            f13 = 1.0f;
        }
        imageView.setScaleX(f13);
        if (z11) {
            f15 = 0.4f;
        }
        imageView.setScaleY(f15);
        if (z11) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            n6Var2.c(str, false, true);
            n6Var.c(webPage.description, false, true);
        } else {
            n6Var2.c(e8Var.h, false, true);
            n6Var.c(e8Var.f14405n, false, true);
        }
        e8Var.f14404f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new e8(context);
    }
}
