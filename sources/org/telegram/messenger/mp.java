package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mp {
    public final int f17164a;
    public final int f17165b;
    public final ArrayList f17166c = new ArrayList();
    public final a0.h d = new a0.h();

    public mp(int i10, int i11) {
        this.f17164a = i10;
        this.f17165b = i11;
    }

    public static org.telegram.messenger.mp b(int r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mp.b(int, java.lang.String):org.telegram.messenger.mp");
    }

    public static mp c(int i10, TLRPC.TL_help_peerColors tL_help_peerColors) {
        boolean z10;
        try {
            mp mpVar = new mp(i10, tL_help_peerColors.hash);
            for (int i11 = 0; i11 < tL_help_peerColors.colors.size(); i11++) {
                lp b10 = lp.b(tL_help_peerColors.colors.get(i11));
                if (b10 != null) {
                    if (b10.f16986c < 7 && i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b10.f16985b = z10;
                    if (!b10.d) {
                        mpVar.f17166c.add(b10);
                    }
                    mpVar.d.k(b10, b10.f16986c);
                }
            }
            return mpVar;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final int a(int i10, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f17166c;
            if (i11 < arrayList.size()) {
                lp lpVar = (lp) arrayList.get(i11);
                if (!lpVar.d && i10 >= lpVar.l(z10)) {
                    i12++;
                }
                i11++;
            } else {
                return i12;
            }
        }
    }

    public final lp d(int i10) {
        return (lp) this.d.f(i10);
    }

    public final int e(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f17166c;
            if (i10 < arrayList.size()) {
                lp lpVar = (lp) arrayList.get(i10);
                if (!lpVar.d) {
                    i11 = Math.max(i11, lpVar.l(z10));
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final int f() {
        int i10 = 0;
        int e = e(false);
        while (true) {
            ArrayList arrayList = this.f17166c;
            if (i10 < arrayList.size()) {
                lp lpVar = (lp) arrayList.get(i10);
                if (!lpVar.d) {
                    e = Math.min(e, lpVar.e);
                }
                i10++;
            } else {
                return e;
            }
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.f17166c;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((lp) arrayList.get(i10)).e > 0) {
                z10 = false;
            }
            if (((lp) arrayList.get(i10)).f16986c < 7) {
                z11 = true;
            }
            i10++;
        }
        int i11 = this.f17164a;
        if (i11 == 1 && !z10) {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    if (((lp) obj).f16987f > 0) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || (i11 == 0 && !z11)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f17165b;
        if (i10 != 0) {
            sb2.append("@");
            sb2.append(i10);
            sb2.append("^");
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f17166c;
            if (i11 < arrayList.size()) {
                lp lpVar = (lp) arrayList.get(i11);
                if (i11 > 0) {
                    sb2.append(";");
                }
                int[] iArr = lpVar.h;
                int[] iArr2 = lpVar.f16988g;
                sb2.append("#");
                if (lpVar.d) {
                    sb2.append("H");
                }
                if (lpVar.e != 0 || lpVar.f16987f != 0) {
                    sb2.append("[");
                    sb2.append(lpVar.e);
                    sb2.append(",");
                    sb2.append(lpVar.f16987f);
                    sb2.append("]");
                }
                sb2.append(lpVar.f16986c);
                sb2.append("{");
                sb2.append(iArr2[0]);
                if (iArr2[1] != iArr2[0]) {
                    sb2.append(",");
                    sb2.append(iArr2[1]);
                    int i12 = iArr2[2];
                    int i13 = iArr2[0];
                    if (i12 != i13 || iArr2[3] != i13) {
                        sb2.append(",");
                        sb2.append(iArr2[2]);
                        sb2.append(",");
                        sb2.append(iArr2[3]);
                        int i14 = iArr2[4];
                        int i15 = iArr2[0];
                        if (i14 != i15 || iArr2[5] != i15) {
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
                        int i16 = iArr[2];
                        int i17 = iArr[0];
                        if (i16 != i17 || iArr[3] != i17) {
                            sb2.append(",");
                            sb2.append(iArr[2]);
                            sb2.append(",");
                            sb2.append(iArr[3]);
                            int i18 = iArr[4];
                            int i19 = iArr[0];
                            if (i18 != i19 || iArr[5] != i19) {
                                sb2.append(",");
                                sb2.append(iArr[4]);
                                sb2.append(",");
                                sb2.append(iArr[5]);
                            }
                        }
                    }
                }
                sb2.append("}");
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }
}
