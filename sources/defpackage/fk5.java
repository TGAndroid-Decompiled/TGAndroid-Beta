package defpackage;

import java.util.Arrays;
public final class fk5 {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public fk5(float f, int i, String str, String str2) {
        int i2 = ece.a;
        this.a = str == null ? "" : str;
        this.b = f;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fk5)) {
            return false;
        }
        fk5 fk5Var = (fk5) obj;
        if (cqe.a(this.a, fk5Var.a) && Float.compare(this.b, fk5Var.b) == 0 && this.c == fk5Var.c && cqe.a(this.d, fk5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        vk9 vk9Var = new vk9(fk5.class.getSimpleName(), (byte) 29);
        vk9 vk9Var2 = new vk9((byte) 26, false);
        ((vk9) vk9Var.d).d = vk9Var2;
        vk9Var.d = vk9Var2;
        vk9Var2.c = this.a;
        vk9Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        vk9 vk9Var3 = new vk9((byte) 26, false);
        ((vk9) vk9Var.d).d = vk9Var3;
        vk9Var.d = vk9Var3;
        vk9Var3.c = valueOf;
        vk9Var3.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        vk9 vk9Var4 = new vk9((byte) 26, false);
        ((vk9) vk9Var.d).d = vk9Var4;
        vk9Var4.c = valueOf2;
        vk9Var4.b = "index";
        vk9 vk9Var5 = new vk9((byte) 26, false);
        vk9Var4.d = vk9Var5;
        vk9Var.d = vk9Var5;
        vk9Var5.c = this.d;
        vk9Var5.b = "mid";
        return vk9Var.toString();
    }
}
