package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
public final class td1 implements qt3 {
    public static final td1 c = new td1(new int[]{1, 2});
    public final byte a = 1;
    public final int[] b;

    public td1(String str, Charset charset) {
        int i;
        int i2;
        pt3 pt3Var = new pt3(str, charset);
        CharsetEncoder[] charsetEncoderArr = pt3Var.a;
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
        xf7[][] xf7VarArr = (xf7[][]) Array.newInstance(xf7.class, length + 1, charsetEncoderArr.length);
        c(str, pt3Var, xf7VarArr, 0, null);
        for (int i5 = 1; i5 <= length; i5++) {
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                xf7 xf7Var = xf7VarArr[i5][i6];
                if (xf7Var != null && i5 < length) {
                    c(str, pt3Var, xf7VarArr, i5, xf7Var);
                }
            }
            for (int i7 = 0; i7 < charsetEncoderArr.length; i7++) {
                xf7VarArr[i5 - 1][i7] = null;
            }
        }
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < charsetEncoderArr.length; i9++) {
            xf7 xf7Var2 = xf7VarArr[length][i9];
            if (xf7Var2 != null && (i2 = xf7Var2.d) < i8) {
                i4 = i9;
                i8 = i2;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList = new ArrayList();
            xf7 xf7Var3 = xf7VarArr[length][i4];
            while (xf7Var3 != null) {
                xf7 xf7Var4 = xf7Var3.c;
                int i10 = xf7Var3.b;
                char c2 = xf7Var3.a;
                if (c2 == 1000) {
                    arrayList.add(0, 1000);
                } else {
                    byte[] bytes = String.valueOf(c2).getBytes(charsetEncoderArr[i10].charset());
                    for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                        arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                    }
                }
                if (xf7Var4 == null) {
                    i = 0;
                } else {
                    i = xf7Var4.b;
                }
                if (i != i10) {
                    arrayList.add(0, Integer.valueOf(il1.a(charsetEncoderArr[i10].charset()).a[0] + 256));
                }
                xf7Var3 = xf7Var4;
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
        dq9.m(kt6.o("Failed to encode \"", str, "\""));
        throw null;
    }

    public static void c(String str, pt3 pt3Var, xf7[][] xf7VarArr, int i, xf7 xf7Var) {
        char charAt = str.charAt(i);
        CharsetEncoder[] charsetEncoderArr = pt3Var.a;
        int length = charsetEncoderArr.length;
        int i2 = pt3Var.b;
        if (i2 >= 0 && (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt)))) {
            length = i2 + 1;
        } else {
            i2 = 0;
        }
        while (i2 < length) {
            if (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt))) {
                xf7 xf7Var2 = new xf7(charAt, pt3Var, i2, xf7Var);
                xf7[] xf7VarArr2 = xf7VarArr[i + 1];
                xf7 xf7Var3 = xf7VarArr2[i2];
                if (xf7Var3 == null || xf7Var3.d > xf7Var2.d) {
                    xf7VarArr2[i2] = xf7Var2;
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
                u36.j(td4.o(i, "value at ", " is not an ECI but a character"));
                return 0;
            }
        }
        wa3.i(String.valueOf(i));
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
        wa3.i(String.valueOf(i));
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
                    wa3.i(String.valueOf(i));
                    return (char) 0;
                }
                u36.j(td4.o(i, "value at ", " is not a character but an ECI"));
                return (char) 0;
            }
        }
        wa3.i(String.valueOf(i));
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
                            u36.i(icon, "Unsupported URI scheme for: ");
                            return;
                        }
                        return;
                    }
                }
                u36.j(hg9.j(i, "Custom icon type is not allowed: "));
                return;
            }
            dq9.m("Custom icon does not have a backing IconCompat");
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
                    u36.j(td4.o(i, "value at ", " is not a character but an ECI"));
                    return null;
                }
            }
            return sb;
        }
        wa3.i(String.valueOf(i));
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

    public td1(int[] iArr) {
        this.b = iArr;
    }
}
