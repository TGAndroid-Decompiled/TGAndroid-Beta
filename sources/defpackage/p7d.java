package defpackage;

import android.util.Log;
public final class p7d extends g6d {
    public final byte i;

    public p7d(vk9 vk9Var, String str, Object obj, byte b) {
        super(vk9Var, str, obj);
        this.i = b;
    }

    @Override
    public final Object d(String str) {
        switch (this.i) {
            case 0:
                if (qhf.c.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (qhf.d.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                String str2 = this.b;
                StringBuilder sb = new StringBuilder(str.length() + str2.length() + 28);
                sb.append("Invalid boolean value for ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            default:
                return str;
        }
    }
}
