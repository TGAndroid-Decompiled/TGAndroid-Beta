package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class v8 extends v51 {
    public static final int f5665a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        String str;
        w8 w8Var = (w8) view;
        Object obj = w51Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = w51Var.D;
        org.telegram.ui.Components.o6 o6Var = w8Var.e;
        org.telegram.ui.Components.o6 o6Var2 = w8Var.d;
        ImageView imageView = w8Var.f5714c;
        ImageView imageView2 = w8Var.f5713b;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
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
            o6Var2.c(w8Var.h, false, true);
            o6Var.c(w8Var.f5716n, false, true);
        }
        w8Var.f5715f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w8(context);
    }
}
