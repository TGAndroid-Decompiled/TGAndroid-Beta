package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class k7 extends q31 {
    public static final int f13040b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        l7 l7Var = (l7) view;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = r31Var.D;
        org.telegram.ui.Components.h6 h6Var = l7Var.f13122e;
        org.telegram.ui.Components.h6 h6Var2 = l7Var.d;
        ImageView imageView = l7Var.f13121c;
        ImageView imageView2 = l7Var.f13120b;
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
            h6Var2.c(str, false, true);
            h6Var.c(webPage.description, false, true);
        } else {
            h6Var2.c(l7Var.h, false, true);
            h6Var.c(l7Var.f13124n, false, true);
        }
        l7Var.f13123f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l7(context);
    }
}
