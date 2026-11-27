package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class p8b extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        TLRPC.WebPage webPage;
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        String str;
        q8b q8bVar = (q8b) view;
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = b8cVar.E;
        in inVar = q8bVar.e;
        ImageView imageView = q8bVar.b;
        ImageView imageView2 = q8bVar.c;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f5 = 0.0f;
        float f6 = 1.0f;
        if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        imageView.setAlpha(f);
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.4f;
        }
        imageView.setScaleX(f2);
        if (z2) {
            f3 = 1.0f;
        } else {
            f3 = 0.4f;
        }
        imageView.setScaleY(f3);
        if (!z2) {
            f5 = 1.0f;
        }
        imageView2.setAlpha(f5);
        if (z2) {
            f4 = 0.4f;
        } else {
            f4 = 1.0f;
        }
        imageView2.setScaleX(f4);
        if (z2) {
            f6 = 0.4f;
        }
        imageView2.setScaleY(f6);
        in inVar2 = q8bVar.d;
        if (z2) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            inVar2.c(str, false, true);
            inVar.c(webPage.description, false, true);
        } else {
            inVar2.c(q8bVar.h, false, true);
            inVar.c(q8bVar.n, false, true);
        }
        q8bVar.f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new q8b(context);
    }
}
