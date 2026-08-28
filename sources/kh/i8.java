package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class i8 extends k41 {
    public static final int f15431a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        j8 j8Var = (j8) view;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = l41Var.D;
        org.telegram.ui.Components.j6 j6Var = j8Var.f15479e;
        org.telegram.ui.Components.j6 j6Var2 = j8Var.d;
        ImageView imageView = j8Var.f15478c;
        ImageView imageView2 = j8Var.f15477b;
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
            j6Var2.c(str, false, true);
            j6Var.c(webPage.description, false, true);
        } else {
            j6Var2.c(j8Var.h, false, true);
            j6Var.c(j8Var.f15481n, false, true);
        }
        j8Var.f15480f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new j8(context);
    }
}
