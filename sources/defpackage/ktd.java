package defpackage;

import android.content.Context;
import java.util.Locale;
public final class ktd extends l13 {
    public final ae7 b;

    public ktd(ae7 ae7Var) {
        super((byte) 4);
        this.b = ae7Var;
    }

    @Override
    public final Object a(Object obj) {
        String str;
        ekc ekcVar;
        ik5 ik5Var = (ik5) obj;
        Context b = this.b.b();
        dy4.b.getClass();
        if (yy4.a(b) >= 204700000) {
            ekcVar = new ekc(b, ik5Var);
        } else {
            ?? obj2 = new Object();
            obj2.b = b;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            obj2.c = new qme(1, -1, ik5Var.a, 1);
            dy4.b.getClass();
            if (yy4.a(b) >= 200400000) {
                str = "com.google.android.gms.vision.ica";
            } else {
                str = "com.google.android.gms.vision.dynamite";
            }
            obj2.d = str;
            ekcVar = obj2;
        }
        return new kce(ik5Var, ekcVar, l5f.d());
    }
}
