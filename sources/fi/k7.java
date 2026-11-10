package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class k7 extends w31 {
    public static final int f12276b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        TLRPC.WebPage webPage;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        l7 l7Var = (l7) view;
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = x31Var.D;
        org.telegram.ui.Components.i6 i6Var = l7Var.f12342e;
        org.telegram.ui.Components.i6 i6Var2 = l7Var.d;
        ImageView imageView = l7Var.f12341c;
        ImageView imageView2 = l7Var.f12340b;
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
            i6Var2.c(str, false, true);
            i6Var.c(webPage.description, false, true);
        } else {
            i6Var2.c(l7Var.h, false, true);
            i6Var.c(l7Var.f12344n, false, true);
        }
        l7Var.f12343f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l7(context);
    }
}
