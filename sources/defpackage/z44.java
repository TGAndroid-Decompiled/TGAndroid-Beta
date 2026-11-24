package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class z44 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public z44(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static z44 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[d54.F[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new z44(4, 1, wrap.array());
    }

    public static z44 b(b54 b54Var, ByteOrder byteOrder) {
        b54[] b54VarArr = {b54Var};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[d54.F[5]]);
        wrap.order(byteOrder);
        b54 b54Var2 = b54VarArr[0];
        wrap.putInt((int) b54Var2.a);
        wrap.putInt((int) b54Var2.b);
        return new z44(5, 1, wrap.array());
    }

    public static z44 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[d54.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new z44(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g != null) {
            if (g instanceof String) {
                return Double.parseDouble((String) g);
            }
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof double[]) {
                double[] dArr = (double[]) g;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof b54[]) {
                b54[] b54VarArr = (b54[]) g;
                if (b54VarArr.length == 1) {
                    b54 b54Var = b54VarArr[0];
                    return b54Var.a / b54Var.b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g != null) {
            if (g instanceof String) {
                return Integer.parseInt((String) g);
            }
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g != null) {
            if (g instanceof String) {
                return (String) g;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (g instanceof double[]) {
                double[] dArr = (double[]) g;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (g instanceof b54[]) {
                b54[] b54VarArr = (b54[]) g;
                while (i < b54VarArr.length) {
                    sb.append(b54VarArr[i].a);
                    sb.append('/');
                    sb.append(b54VarArr[i].b);
                    i++;
                    if (i != b54VarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }
        return null;
    }

    public final java.io.Serializable g(java.nio.ByteOrder r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z44.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(d54.E[this.a]);
        sb.append(", data length:");
        return de9.l(sb, this.d.length, ")");
    }

    public z44(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}
