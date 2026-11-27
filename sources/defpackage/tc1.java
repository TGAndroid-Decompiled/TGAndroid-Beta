package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
public final class tc1 implements ys3 {
    public static final tc1 c = new tc1(new int[]{1, 2});
    public final byte a = 1;
    public final int[] b;

    public tc1(String str, Charset charset) {
        int i;
        int i2;
        xs3 xs3Var = new xs3(str, charset);
        CharsetEncoder[] charsetEncoderArr = xs3Var.a;
        int i3 = 0;
        int i4 = -1;
        if (charsetEncoderArr.length == 1) {
            this.b = new int[str.length()];
            while (i3 < this.b.length) {
                char charAt = str.charAt(i3);
                int[] iArr = this.b;
                if (charAt == 65535) {
                    charAt = 1000;
                }
                iArr[i3] = charAt;
                i3++;
            }
            return;
        }
        int length = str.length();
        fg7[][] fg7VarArr = (fg7[][]) Array.newInstance(fg7.class, length + 1, charsetEncoderArr.length);
        c(str, xs3Var, fg7VarArr, 0, null);
        for (int i5 = 1; i5 <= length; i5++) {
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                fg7 fg7Var = fg7VarArr[i5][i6];
                if (fg7Var != null && i5 < length) {
                    c(str, xs3Var, fg7VarArr, i5, fg7Var);
                }
            }
            for (int i7 = 0; i7 < charsetEncoderArr.length; i7++) {
                fg7VarArr[i5 - 1][i7] = null;
            }
        }
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < charsetEncoderArr.length; i9++) {
            fg7 fg7Var2 = fg7VarArr[length][i9];
            if (fg7Var2 != null && (i2 = fg7Var2.d) < i8) {
                i4 = i9;
                i8 = i2;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList = new ArrayList();
            fg7 fg7Var3 = fg7VarArr[length][i4];
            while (fg7Var3 != null) {
                fg7 fg7Var4 = fg7Var3.c;
                int i10 = fg7Var3.b;
                char c2 = fg7Var3.a;
                if (c2 == 1000) {
                    arrayList.add(0, 1000);
                } else {
                    byte[] bytes = String.valueOf(c2).getBytes(charsetEncoderArr[i10].charset());
                    for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                        arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                    }
                }
                if (fg7Var4 == null) {
                    i = 0;
                } else {
                    i = fg7Var4.b;
                }
                if (i != i10) {
                    arrayList.add(0, Integer.valueOf(jk1.a(charsetEncoderArr[i10].charset()).a[0] + 256));
                }
                fg7Var3 = fg7Var4;
            }
            int size = arrayList.size();
            int[] iArr2 = new int[size];
            while (i3 < size) {
                iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                i3++;
            }
            this.b = iArr2;
            return;
        }
        grb.i(qd4.y("Failed to encode \"", str, "\""));
        throw null;
    }

    public static void c(String str, xs3 xs3Var, fg7[][] fg7VarArr, int i, fg7 fg7Var) {
        char charAt = str.charAt(i);
        CharsetEncoder[] charsetEncoderArr = xs3Var.a;
        int length = charsetEncoderArr.length;
        int i2 = xs3Var.b;
        if (i2 >= 0 && (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt)))) {
            length = i2 + 1;
        } else {
            i2 = 0;
        }
        while (i2 < length) {
            if (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt))) {
                fg7 fg7Var2 = new fg7(charAt, xs3Var, i2, fg7Var);
                fg7[] fg7VarArr2 = fg7VarArr[i + 1];
                fg7 fg7Var3 = fg7VarArr2[i2];
                if (fg7Var3 == null || fg7Var3.d > fg7Var2.d) {
                    fg7VarArr2[i2] = fg7Var2;
                }
            }
            i2++;
        }
    }

    @Override
    public final int a(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                if (b(i)) {
                    return iArr[i] - 256;
                }
                lq5.j(qd4.n(i, "value at ", " is not an ECI but a character"));
                return 0;
            }
        }
        su3.g(String.valueOf(i));
        return 0;
    }

    @Override
    public final boolean b(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 > 255 && i2 <= 999) {
                    return true;
                }
                return false;
            }
        }
        su3.g(String.valueOf(i));
        return false;
    }

    @Override
    public final char charAt(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                if (!b(i)) {
                    if (i >= 0 && i < iArr.length) {
                        int i2 = iArr[i];
                        if (i2 == 1000) {
                            return (char) 65535;
                        }
                        return (char) i2;
                    }
                    su3.g(String.valueOf(i));
                    return (char) 0;
                }
                lq5.j(qd4.n(i, "value at ", " is not a character but an ECI"));
                return (char) 0;
            }
        }
        su3.g(String.valueOf(i));
        return (char) 0;
    }

    public final void d(CarIcon carIcon) {
        if (carIcon != null && carIcon.getType() == 1) {
            IconCompat icon = carIcon.getIcon();
            if (icon != null) {
                int i = icon.i();
                for (int i2 : this.b) {
                    if (i == i2) {
                        if (i == 4 && !"content".equalsIgnoreCase(icon.j().getScheme())) {
                            lq5.q(icon, "Unsupported URI scheme for: ");
                            return;
                        }
                        return;
                    }
                }
                lq5.j(uh9.k(i, "Custom icon type is not allowed: "));
                return;
            }
            grb.i("Custom icon does not have a backing IconCompat");
        }
    }

    @Override
    public final int length() {
        return this.b.length;
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.b.length) {
            StringBuilder sb = new StringBuilder();
            while (i < i2) {
                if (!b(i)) {
                    sb.append(charAt(i));
                    i++;
                } else {
                    lq5.j(qd4.n(i, "value at ", " is not a character but an ECI"));
                    return null;
                }
            }
            return sb;
        }
        su3.g(String.valueOf(i));
        return null;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.b.length; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (b(i)) {
                        sb.append("ECI(");
                        sb.append(a(i));
                        sb.append(')');
                    } else if (charAt(i) < 128) {
                        sb.append('\'');
                        sb.append(charAt(i));
                        sb.append('\'');
                    } else {
                        sb.append((int) charAt(i));
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public tc1(int[] iArr) {
        this.b = iArr;
    }
}
