package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class k7 extends v31 {
    public static final int f12275b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        TLRPC.WebPage webPage;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        l7 l7Var = (l7) view;
        Object obj = w31Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = w31Var.D;
        org.telegram.ui.Components.j6 j6Var = l7Var.f12340e;
        org.telegram.ui.Components.j6 j6Var2 = l7Var.d;
        ImageView imageView = l7Var.f12339c;
        ImageView imageView2 = l7Var.f12338b;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        imageView2.setScaleX(f11);
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.4f;
        }
        imageView2.setScaleY(f12);
        if (!z10) {
            f14 = 1.0f;
        }
        imageView.setAlpha(f14);
        if (z10) {
            f13 = 0.4f;
        } else {
            f13 = 1.0f;
        }
        imageView.setScaleX(f13);
        if (z10) {
            f15 = 0.4f;
        }
        imageView.setScaleY(f15);
        if (z10) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            j6Var2.c(str, false, true);
            j6Var.c(webPage.description, false, true);
        } else {
            j6Var2.c(l7Var.h, false, true);
            j6Var.c(l7Var.f12342n, false, true);
        }
        l7Var.f12341f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l7(context);
    }
}
