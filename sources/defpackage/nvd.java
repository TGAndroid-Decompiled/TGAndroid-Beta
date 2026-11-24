package defpackage;

import android.content.Context;
import java.util.Locale;
public final class nvd extends x23 {
    public final cg7 b;

    public nvd(cg7 cg7Var) {
        super((byte) 4);
        this.b = cg7Var;
    }

    @Override
    public final Object a(Object obj) {
        String str;
        dmc dmcVar;
        im5 im5Var = (im5) obj;
        Context b = this.b.b();
        e05.b.getClass();
        if (x05.a(b) >= 204700000) {
            dmcVar = new dmc(b, im5Var);
        } else {
            ?? obj2 = new Object();
            obj2.b = b;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            obj2.c = new toe(1, -1, im5Var.a, 1);
            e05.b.getClass();
            if (x05.a(b) >= 200400000) {
                str = "com.google.android.gms.vision.ica";
            } else {
                str = "com.google.android.gms.vision.dynamite";
            }
            obj2.d = str;
            dmcVar = obj2;
        }
        return new lee(im5Var, dmcVar, n7f.d());
    }
}
