package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
public abstract class ghc {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bw2 b(View view, bw2 bw2Var) {
        ContentInfo e = bw2Var.a.e();
        Objects.requireNonNull(e);
        ContentInfo performReceiveContent = view.performReceiveContent(e);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == e) {
            return bw2Var;
        }
        return new bw2(new zv2(performReceiveContent));
    }
}
