package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xo {
    public final int f26417a;
    public final int f26418b;
    public final ArrayList f26419c = new ArrayList();
    public final a0.h d = new a0.h();

    public xo(int i3, int i10) {
        this.f26417a = i3;
        this.f26418b = i10;
    }

    public static org.telegram.messenger.xo b(int r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xo.b(int, java.lang.String):org.telegram.messenger.xo");
    }

    public static xo c(int i3, TLRPC.TL_help_peerColors tL_help_peerColors) {
        boolean z10;
        try {
            xo xoVar = new xo(i3, tL_help_peerColors.hash);
            for (int i10 = 0; i10 < tL_help_peerColors.colors.size(); i10++) {
                wo b10 = wo.b(tL_help_peerColors.colors.get(i10));
                if (b10 != null) {
                    if (b10.f26239c < 7 && i3 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b10.f26238b = z10;
                    if (!b10.d) {
                        xoVar.f26419c.add(b10);
                    }
                    xoVar.d.k(b10, b10.f26239c);
                }
            }
            return xoVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final int a(int i3, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26419c;
            if (i10 < arrayList.size()) {
                wo woVar = (wo) arrayList.get(i10);
                if (!woVar.d && i3 >= woVar.l(z10)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final wo d(int i3) {
        return (wo) this.d.f(i3);
    }

    public final int e(boolean z10) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26419c;
            if (i3 < arrayList.size()) {
                wo woVar = (wo) arrayList.get(i3);
                if (!woVar.d) {
                    i10 = Math.max(i10, woVar.l(z10));
                }
                i3++;
            } else {
                return i10;
            }
        }
    }

    public final int f() {
        int i3 = 0;
        int e10 = e(false);
        while (true) {
            ArrayList arrayList = this.f26419c;
            if (i3 < arrayList.size()) {
                wo woVar = (wo) arrayList.get(i3);
                if (!woVar.d) {
                    e10 = Math.min(e10, woVar.f26240e);
                }
                i3++;
            } else {
                return e10;
            }
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z10 = true;
        int i3 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.f26419c;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((wo) arrayList.get(i3)).f26240e > 0) {
                z10 = false;
            }
            if (((wo) arrayList.get(i3)).f26239c < 7) {
                z11 = true;
            }
            i3++;
        }
        int i10 = this.f26417a;
        if (i10 == 1 && !z10) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((wo) obj).f26241f > 0) {
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
        int i3 = this.f26418b;
        if (i3 != 0) {
            sb2.append("@");
            sb2.append(i3);
            sb2.append("^");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26419c;
            if (i10 < arrayList.size()) {
                wo woVar = (wo) arrayList.get(i10);
                if (i10 > 0) {
                    sb2.append(";");
                }
                int[] iArr = woVar.h;
                int[] iArr2 = woVar.f26242g;
                sb2.append("#");
                if (woVar.d) {
                    sb2.append("H");
                }
                if (woVar.f26240e != 0 || woVar.f26241f != 0) {
                    sb2.append("[");
                    sb2.append(woVar.f26240e);
                    sb2.append(",");
                    sb2.append(woVar.f26241f);
                    sb2.append("]");
                }
                sb2.append(woVar.f26239c);
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
