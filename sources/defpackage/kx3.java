package defpackage;

import android.text.Editable;
public final class kx3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile kx3 b;
    public static Class c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new joa(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
