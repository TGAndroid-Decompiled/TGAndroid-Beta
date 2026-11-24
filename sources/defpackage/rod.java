package defpackage;

import java.util.Arrays;
public final class rod {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public rod(String str) {
        this.a = (byte) 4;
        vk9 vk9Var = new vk9((byte) 28, false);
        this.c = vk9Var;
        this.d = vk9Var;
        this.b = str;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                vk9 vk9Var = (vk9) ((vk9) this.c).d;
                String str = "";
                while (vk9Var != null) {
                    Object obj = vk9Var.c;
                    sb.append(str);
                    String str2 = (String) vk9Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    vk9Var = (vk9) vk9Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
