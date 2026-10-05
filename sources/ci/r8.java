package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class r8 extends g61 {
    public static final int f5871a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        String str;
        s8 s8Var = (s8) view;
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = h61Var.D;
        org.telegram.ui.Components.p6 p6Var = s8Var.f5921e;
        org.telegram.ui.Components.p6 p6Var2 = s8Var.d;
        ImageView imageView = s8Var.f5920c;
        ImageView imageView2 = s8Var.f5919b;
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
            p6Var2.c(str, false, true);
            p6Var.c(webPage.description, false, true);
        } else {
            p6Var2.c(s8Var.h, false, true);
            p6Var.c(s8Var.f5923n, false, true);
        }
        s8Var.f5922f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s8(context);
    }
}
