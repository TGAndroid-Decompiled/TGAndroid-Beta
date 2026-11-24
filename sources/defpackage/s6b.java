package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class s6b extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        TLRPC.WebPage webPage;
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        String str;
        t6b t6bVar = (t6b) view;
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = c6cVar.E;
        io ioVar = t6bVar.e;
        ImageView imageView = t6bVar.b;
        ImageView imageView2 = t6bVar.c;
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
        io ioVar2 = t6bVar.d;
        if (z2) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            ioVar2.c(str, false, true);
            ioVar.c(webPage.description, false, true);
        } else {
            ioVar2.c(t6bVar.h, false, true);
            ioVar.c(t6bVar.n, false, true);
        }
        t6bVar.f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new t6b(context);
    }
}
