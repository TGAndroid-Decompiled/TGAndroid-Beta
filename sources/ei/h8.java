package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class h8 extends k61 {
    public static final int f9172a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        String str;
        i8 i8Var = (i8) view;
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = l61Var.D;
        org.telegram.ui.Components.o6 o6Var = i8Var.e;
        org.telegram.ui.Components.o6 o6Var2 = i8Var.d;
        ImageView imageView = i8Var.f9213c;
        ImageView imageView2 = i8Var.f9212b;
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
            o6Var2.c(i8Var.h, false, true);
            o6Var.c(i8Var.f9215n, false, true);
        }
        i8Var.f9214f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new i8(context);
    }
}
