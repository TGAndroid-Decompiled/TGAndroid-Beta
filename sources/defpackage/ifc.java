package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
public abstract class ifc {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static rw2 b(View view, rw2 rw2Var) {
        ContentInfo e = rw2Var.a.e();
        Objects.requireNonNull(e);
        ContentInfo performReceiveContent = view.performReceiveContent(e);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == e) {
            return rw2Var;
        }
        return new rw2(new pw2(performReceiveContent));
    }
}
