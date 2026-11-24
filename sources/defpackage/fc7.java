package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fc7 {
    public final boolean a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public final vh6 d = new vh6();

    public fc7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static defpackage.fc7 b(int r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc7.b(int, java.lang.String):fc7");
    }

    public static fc7 c(int i, TLRPC.TL_help_peerColors tL_help_peerColors) {
        boolean z;
        try {
            fc7 fc7Var = new fc7(i, tL_help_peerColors.hash);
            for (int i2 = 0; i2 < tL_help_peerColors.colors.size(); i2++) {
                ec7 b = ec7.b(tL_help_peerColors.colors.get(i2));
                if (b != null) {
                    if (b.c < 7 && i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b.b = z;
                    if (!b.d) {
                        fc7Var.c.add(b);
                    }
                    fc7Var.d.k(b, b.c);
                }
            }
            return fc7Var;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public final int a(int i, boolean z) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 < arrayList.size()) {
                ec7 ec7Var = (ec7) arrayList.get(i2);
                if (!ec7Var.d && i >= ec7Var.l(z)) {
                    i3++;
                }
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final ec7 d(int i) {
        return (ec7) this.d.f(i);
    }

    public final int e(boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ec7 ec7Var = (ec7) arrayList.get(i);
                if (!ec7Var.d) {
                    i2 = Math.max(i2, ec7Var.l(z));
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    public final int f() {
        int i = 0;
        int e = e(false);
        while (true) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ec7 ec7Var = (ec7) arrayList.get(i);
                if (!ec7Var.d) {
                    e = Math.min(e, ec7Var.e);
                }
                i++;
            } else {
                return e;
            }
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (true) {
            arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            if (((ec7) arrayList.get(i)).e > 0) {
                z = false;
            }
            if (((ec7) arrayList.get(i)).c < 7) {
                z2 = true;
            }
            i++;
        }
        boolean z3 = this.a;
        if (z3 && !z) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((ec7) obj).f > 0) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        }
        if (z || (!z3 && !z2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i != 0) {
            sb.append("@");
            sb.append(i);
            sb.append("^");
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 < arrayList.size()) {
                ec7 ec7Var = (ec7) arrayList.get(i2);
                if (i2 > 0) {
                    sb.append(";");
                }
                int[] iArr = ec7Var.h;
                int[] iArr2 = ec7Var.g;
                sb.append("#");
                if (ec7Var.d) {
                    sb.append("H");
                }
                if (ec7Var.e != 0 || ec7Var.f != 0) {
                    sb.append("[");
                    sb.append(ec7Var.e);
                    sb.append(",");
                    sb.append(ec7Var.f);
                    sb.append("]");
                }
                sb.append(ec7Var.c);
                sb.append("{");
                sb.append(iArr2[0]);
                if (iArr2[1] != iArr2[0]) {
                    sb.append(",");
                    sb.append(iArr2[1]);
                    int i3 = iArr2[2];
                    int i4 = iArr2[0];
                    if (i3 != i4 || iArr2[3] != i4) {
                        sb.append(",");
                        sb.append(iArr2[2]);
                        sb.append(",");
                        sb.append(iArr2[3]);
                        int i5 = iArr2[4];
                        int i6 = iArr2[0];
                        if (i5 != i6 || iArr2[5] != i6) {
                            sb.append(",");
                            sb.append(iArr2[4]);
                            sb.append(",");
                            sb.append(iArr2[5]);
                        }
                    }
                }
                if (iArr[0] != iArr2[0] || iArr[1] != iArr2[1] || iArr[2] != iArr2[2]) {
                    sb.append("@");
                    sb.append(iArr[0]);
                    if (iArr[1] != iArr[0]) {
                        sb.append(",");
                        sb.append(iArr[1]);
                        int i7 = iArr[2];
                        int i8 = iArr[0];
                        if (i7 != i8 || iArr[3] != i8) {
                            sb.append(",");
                            sb.append(iArr[2]);
                            sb.append(",");
                            sb.append(iArr[3]);
                            int i9 = iArr[4];
                            int i10 = iArr[0];
                            if (i9 != i10 || iArr[5] != i10) {
                                sb.append(",");
                                sb.append(iArr[4]);
                                sb.append(",");
                                sb.append(iArr[5]);
                            }
                        }
                    }
                }
                sb.append("}");
                i2++;
            } else {
                return sb.toString();
            }
        }
    }
}
