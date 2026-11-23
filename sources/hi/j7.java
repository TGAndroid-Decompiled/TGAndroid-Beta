package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class j7 extends n41 {
    public static final int f14778b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        k7 k7Var = (k7) view;
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = o41Var.E;
        org.telegram.ui.Components.o6 o6Var = k7Var.f14820e;
        org.telegram.ui.Components.o6 o6Var2 = k7Var.d;
        ImageView imageView = k7Var.f14819c;
        ImageView imageView2 = k7Var.f14818b;
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
            o6Var2.c(str, false, true);
            o6Var.c(webPage.description, false, true);
        } else {
            o6Var2.c(k7Var.h, false, true);
            o6Var.c(k7Var.f14822n, false, true);
        }
        k7Var.f14821f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new k7(context);
    }
}
