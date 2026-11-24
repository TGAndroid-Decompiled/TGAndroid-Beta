package defpackage;

import android.text.Editable;
public final class pw3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile pw3 b;
    public static Class c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new pka(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
