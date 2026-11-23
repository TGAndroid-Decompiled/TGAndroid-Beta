package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dp {
    public final int f23555a;
    public final int f23556b;
    public final ArrayList f23557c = new ArrayList();
    public final a0.h d = new a0.h();

    public dp(int i7, int i10) {
        this.f23555a = i7;
        this.f23556b = i10;
    }

    public static org.telegram.messenger.dp b(int r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dp.b(int, java.lang.String):org.telegram.messenger.dp");
    }

    public static dp c(int i7, TLRPC.TL_help_peerColors tL_help_peerColors) {
        boolean z10;
        try {
            dp dpVar = new dp(i7, tL_help_peerColors.hash);
            for (int i10 = 0; i10 < tL_help_peerColors.colors.size(); i10++) {
                cp b10 = cp.b(tL_help_peerColors.colors.get(i10));
                if (b10 != null) {
                    if (b10.f23319c < 7 && i7 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b10.f23318b = z10;
                    if (!b10.d) {
                        dpVar.f23557c.add(b10);
                    }
                    dpVar.d.k(b10, b10.f23319c);
                }
            }
            return dpVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final int a(int i7, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f23557c;
            if (i10 < arrayList.size()) {
                cp cpVar = (cp) arrayList.get(i10);
                if (!cpVar.d && i7 >= cpVar.l(z10)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final cp d(int i7) {
        return (cp) this.d.f(i7);
    }

    public final int e(boolean z10) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23557c;
            if (i7 < arrayList.size()) {
                cp cpVar = (cp) arrayList.get(i7);
                if (!cpVar.d) {
                    i10 = Math.max(i10, cpVar.l(z10));
                }
                i7++;
            } else {
                return i10;
            }
        }
    }

    public final int f() {
        int i7 = 0;
        int e10 = e(false);
        while (true) {
            ArrayList arrayList = this.f23557c;
            if (i7 < arrayList.size()) {
                cp cpVar = (cp) arrayList.get(i7);
                if (!cpVar.d) {
                    e10 = Math.min(e10, cpVar.f23320e);
                }
                i7++;
            } else {
                return e10;
            }
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z10 = true;
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.f23557c;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((cp) arrayList.get(i7)).f23320e > 0) {
                z10 = false;
            }
            if (((cp) arrayList.get(i7)).f23319c < 7) {
                z11 = true;
            }
            i7++;
        }
        int i10 = this.f23555a;
        if (i10 == 1 && !z10) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((cp) obj).f23321f > 0) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || (i10 == 0 && !z11)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.f23556b;
        if (i7 != 0) {
            sb2.append("@");
            sb2.append(i7);
            sb2.append("^");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23557c;
            if (i10 < arrayList.size()) {
                cp cpVar = (cp) arrayList.get(i10);
                if (i10 > 0) {
                    sb2.append(";");
                }
                int[] iArr = cpVar.h;
                int[] iArr2 = cpVar.f23322g;
                sb2.append("#");
                if (cpVar.d) {
                    sb2.append("H");
                }
                if (cpVar.f23320e != 0 || cpVar.f23321f != 0) {
                    sb2.append("[");
                    sb2.append(cpVar.f23320e);
                    sb2.append(",");
                    sb2.append(cpVar.f23321f);
                    sb2.append("]");
                }
                sb2.append(cpVar.f23319c);
                sb2.append("{");
                sb2.append(iArr2[0]);
                if (iArr2[1] != iArr2[0]) {
                    sb2.append(",");
                    sb2.append(iArr2[1]);
                    int i11 = iArr2[2];
                    int i12 = iArr2[0];
                    if (i11 != i12 || iArr2[3] != i12) {
                        sb2.append(",");
                        sb2.append(iArr2[2]);
                        sb2.append(",");
                        sb2.append(iArr2[3]);
                        int i13 = iArr2[4];
                        int i14 = iArr2[0];
                        if (i13 != i14 || iArr2[5] != i14) {
                            sb2.append(",");
                            sb2.append(iArr2[4]);
                            sb2.append(",");
                            sb2.append(iArr2[5]);
                        }
                    }
                }
                if (iArr[0] != iArr2[0] || iArr[1] != iArr2[1] || iArr[2] != iArr2[2]) {
                    sb2.append("@");
                    sb2.append(iArr[0]);
                    if (iArr[1] != iArr[0]) {
                        sb2.append(",");
                        sb2.append(iArr[1]);
                        int i15 = iArr[2];
                        int i16 = iArr[0];
                        if (i15 != i16 || iArr[3] != i16) {
                            sb2.append(",");
                            sb2.append(iArr[2]);
                            sb2.append(",");
                            sb2.append(iArr[3]);
                            int i17 = iArr[4];
                            int i18 = iArr[0];
                            if (i17 != i18 || iArr[5] != i18) {
                                sb2.append(",");
                                sb2.append(iArr[4]);
                                sb2.append(",");
                                sb2.append(iArr[5]);
                            }
                        }
                    }
                }
                sb2.append("}");
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }
}
