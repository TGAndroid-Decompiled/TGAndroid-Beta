package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gp {
    public final int f22682a;
    public final int f22683b;
    public final ArrayList f22684c = new ArrayList();
    public final a0.h d = new a0.h();

    public gp(int i7, int i10) {
        this.f22682a = i7;
        this.f22683b = i10;
    }

    public static org.telegram.messenger.gp b(int r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gp.b(int, java.lang.String):org.telegram.messenger.gp");
    }

    public static gp c(int i7, TLRPC.TL_help_peerColors tL_help_peerColors) {
        boolean z9;
        try {
            gp gpVar = new gp(i7, tL_help_peerColors.hash);
            for (int i10 = 0; i10 < tL_help_peerColors.colors.size(); i10++) {
                fp b10 = fp.b(tL_help_peerColors.colors.get(i10));
                if (b10 != null) {
                    if (b10.f22432c < 7 && i7 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    b10.f22431b = z9;
                    if (!b10.d) {
                        gpVar.f22684c.add(b10);
                    }
                    gpVar.d.k(b10, b10.f22432c);
                }
            }
            return gpVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final int a(int i7, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22684c;
            if (i10 < arrayList.size()) {
                fp fpVar = (fp) arrayList.get(i10);
                if (!fpVar.d && i7 >= fpVar.l(z9)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final fp d(int i7) {
        return (fp) this.d.f(i7);
    }

    public final int e(boolean z9) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22684c;
            if (i7 < arrayList.size()) {
                fp fpVar = (fp) arrayList.get(i7);
                if (!fpVar.d) {
                    i10 = Math.max(i10, fpVar.l(z9));
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
            ArrayList arrayList = this.f22684c;
            if (i7 < arrayList.size()) {
                fp fpVar = (fp) arrayList.get(i7);
                if (!fpVar.d) {
                    e10 = Math.min(e10, fpVar.f22433e);
                }
                i7++;
            } else {
                return e10;
            }
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z9 = true;
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f22684c;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((fp) arrayList.get(i7)).f22433e > 0) {
                z9 = false;
            }
            if (((fp) arrayList.get(i7)).f22432c < 7) {
                z10 = true;
            }
            i7++;
        }
        int i10 = this.f22682a;
        if (i10 == 1 && !z9) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((fp) obj).f22434f > 0) {
                        z9 = false;
                        break;
                    }
                } else {
                    z9 = true;
                    break;
                }
            }
        }
        if (z9 || (i10 == 0 && !z10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.f22683b;
        if (i7 != 0) {
            sb2.append("@");
            sb2.append(i7);
            sb2.append("^");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22684c;
            if (i10 < arrayList.size()) {
                fp fpVar = (fp) arrayList.get(i10);
                if (i10 > 0) {
                    sb2.append(";");
                }
                int[] iArr = fpVar.h;
                int[] iArr2 = fpVar.f22435g;
                sb2.append("#");
                if (fpVar.d) {
                    sb2.append("H");
                }
                if (fpVar.f22433e != 0 || fpVar.f22434f != 0) {
                    sb2.append("[");
                    sb2.append(fpVar.f22433e);
                    sb2.append(",");
                    sb2.append(fpVar.f22434f);
                    sb2.append("]");
                }
                sb2.append(fpVar.f22432c);
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
