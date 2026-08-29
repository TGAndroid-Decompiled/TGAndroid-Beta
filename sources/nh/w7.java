package nh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class w7 extends v41 {
    public static final int f18797a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f9;
        float f10;
        float f11;
        float f12;
        String str;
        x7 x7Var = (x7) view;
        Object obj = w41Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = w41Var.D;
        org.telegram.ui.Components.o6 o6Var = x7Var.f18836e;
        org.telegram.ui.Components.o6 o6Var2 = x7Var.d;
        ImageView imageView = x7Var.f18835c;
        ImageView imageView2 = x7Var.f18834b;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (z11) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        imageView2.setAlpha(f9);
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.4f;
        }
        imageView2.setScaleX(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        imageView2.setScaleY(f11);
        if (!z11) {
            f13 = 1.0f;
        }
        imageView.setAlpha(f13);
        if (z11) {
            f12 = 0.4f;
        } else {
            f12 = 1.0f;
        }
        imageView.setScaleX(f12);
        if (z11) {
            f14 = 0.4f;
        }
        imageView.setScaleY(f14);
        if (z11) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            o6Var2.c(str, false, true);
            o6Var.c(webPage.description, false, true);
        } else {
            o6Var2.c(x7Var.h, false, true);
            o6Var.c(x7Var.f18838n, false, true);
        }
        x7Var.f18837f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x7(context);
    }
}
