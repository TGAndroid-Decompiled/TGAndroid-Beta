package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
public abstract class hdc {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static hv2 b(View view, hv2 hv2Var) {
        ContentInfo e = hv2Var.a.e();
        Objects.requireNonNull(e);
        ContentInfo performReceiveContent = view.performReceiveContent(e);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == e) {
            return hv2Var;
        }
        return new hv2(new fv2(performReceiveContent));
    }
}
