package bi;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.dg;
import org.telegram.messenger.i20;
import org.telegram.messenger.ic;
import org.telegram.messenger.j8;
import org.telegram.messenger.kj;
import org.telegram.messenger.ks;
import org.telegram.messenger.sb;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.sl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.un;
public final class k0 implements Runnable {
    public final int f3129a = 0;
    public final int f3130b;
    public final int f3131c;
    public final Object d;
    public final Object e;
    public final Object f3132f;
    public final Object h;

    public k0(hf.b bVar, n1 n1Var, int i10, k9 k9Var, m0 m0Var, int i11) {
        this.d = bVar;
        this.e = n1Var;
        this.f3130b = i10;
        this.f3132f = k9Var;
        this.h = m0Var;
        this.f3131c = i11;
    }

    @Override
    public final void run() {
        j8 E;
        kj kjVar;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        String[] strArr;
        String str;
        String str2;
        String str3;
        char c10;
        String n10;
        int i13;
        un unVar;
        boolean z10;
        int i14 = this.f3129a;
        final int i15 = this.f3131c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f3132f;
        Object obj3 = this.e;
        int i16 = this.f3130b;
        Object obj4 = this.d;
        switch (i14) {
            case 0:
                n1 n1Var = (n1) obj3;
                k9 k9Var = (k9) obj2;
                m0 m0Var = (m0) obj;
                n0 n0Var = (n0) ((hf.b) obj4).f7659c;
                if (n1Var.length() >= i16 && n1Var.getSelectionStart() != n1Var.getSelectionEnd() && k9Var.j0(m0Var.J(), 0, i15, i16)) {
                    n0Var.d = true;
                    n1Var.setSelection(i16);
                    n0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.w wVar = (m4.w) obj3;
                final m4.f0 f0Var = (m4.f0) obj2;
                final m4.h1 h1Var = (m4.h1) obj;
                xa.n nVar = ((m4.j1) obj4).f12790b;
                if (!nVar.M(wVar, i16)) {
                    m4.j1.R0(f0Var, wVar, i15, new m4.t1(-4));
                    return;
                }
                oa.d dVar = f0Var.e;
                f0Var.s(wVar);
                dVar.getClass();
                if (i16 == 27) {
                    h1Var.f(f0Var, wVar, i15);
                    nVar.i(wVar, i16, new Object());
                    return;
                }
                nVar.i(wVar, i16, new m4.h() {
                    @Override
                    public final j9.y run() {
                        return (j9.y) h1.this.f(f0Var, wVar, i15);
                    }
                });
                return;
            case 2:
                sb sbVar = (sb) obj4;
                File file = (File) obj3;
                String str4 = (String) obj2;
                sbVar.getClass();
                if (file != null && ((str4.endsWith(".mp4") || str4.endsWith(".jpg")) && (E = b8.E(obj)) != null)) {
                    if (obj instanceof kj) {
                        kjVar = (kj) obj;
                    } else {
                        kjVar = null;
                    }
                    long j10 = E.f16422a;
                    if (j10 >= 0) {
                        i10 = 1;
                    } else if (org.telegram.messenger.w3.V(wp.r1(i16).L0(Long.valueOf(-j10)))) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    if (ks.l(i10, E, kjVar, i16)) {
                        org.telegram.messenger.i0.e(file.toString());
                    }
                }
                at.f(i16).k(142, str4, file);
                ic icVar = sbVar.f18077b;
                icVar.f16261s.c(new dg(icVar, str4, this.f3131c, file, 5));
                return;
            case 3:
                aj ajVar = (aj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ajVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ajVar.h = -1;
                    org.telegram.messenger.i0.g3(new ag.g3(ajVar, ajVar.h, new ArrayList(), new ArrayList(), 14));
                    return;
                }
                String R0 = dd.D0().R0(lowerCase, true, false);
                R0 = (lowerCase.equals(R0) || R0.length() == 0) ? null : null;
                if (R0 != null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                int i17 = i11 + 1;
                String[] strArr2 = new String[i17];
                strArr2[0] = lowerCase;
                if (R0 != null) {
                    strArr2[1] = R0;
                }
                ArrayList arrayList3 = new ArrayList();
                aj ajVar2 = ajVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i18 = 0;
                while (i18 < arrayList2.size()) {
                    org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList2.get(i18);
                    aj ajVar3 = ajVar2;
                    String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.f15697i, f5Var.f15698j).toLowerCase();
                    ArrayList arrayList5 = arrayList2;
                    String R02 = dd.D0().R0(lowerCase2, true, r62);
                    TLRPC.User user = f5Var.f15701m;
                    if (user != null) {
                        strArr = strArr2;
                        String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        str2 = dd.D0().R0(lowerCase2, true, r62);
                        str = lowerCase3;
                    } else {
                        strArr = strArr2;
                        str = null;
                        str2 = null;
                    }
                    if (lowerCase2.equals(R02)) {
                        R02 = null;
                    }
                    char c11 = r62;
                    int i19 = r62;
                    while (i19 < i17) {
                        int i20 = i19;
                        String str5 = strArr[i20];
                        if ((str == null || (!str.startsWith(str5) && !sc.e.y(" ", str5, str))) && (str2 == null || (!str2.startsWith(str5) && !sc.e.y(" ", str5, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = f5Var.f15701m;
                            if (user2 != null && (n10 = i20.n(user2)) != null && n10.startsWith(str5)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str5) && !sc.e.y(" ", str5, lowerCase2) && (R02 == null || (!R02.startsWith(str5) && !sc.e.y(" ", str5, R02)))) {
                                c10 = c11;
                            } else {
                                c10 = 3;
                            }
                        } else {
                            str3 = str;
                            c10 = 1;
                        }
                        String str6 = lowerCase2;
                        if (c10 != 0 && (!f5Var.e.isEmpty() || !f5Var.f15696g.isEmpty())) {
                            if (c10 == 3) {
                                arrayList4.add(org.telegram.messenger.i0.r0(f5Var.f15697i, f5Var.f15698j, str5));
                            } else if (c10 == 1) {
                                TLRPC.User user3 = f5Var.f15701m;
                                arrayList4.add(org.telegram.messenger.i0.r0(user3.first_name, user3.last_name, str5));
                            } else {
                                arrayList4.add(org.telegram.messenger.i0.r0("@" + i20.n(f5Var.f15701m), null, "@" + str5));
                            }
                            TLRPC.User user4 = f5Var.f15701m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f19943id, 1);
                            }
                            arrayList3.add(f5Var);
                            i18++;
                            ajVar2 = ajVar3;
                            arrayList2 = arrayList5;
                            strArr2 = strArr;
                            r62 = 0;
                        } else {
                            lowerCase2 = str6;
                            c11 = c10;
                            str = str3;
                            i19 = i20 + 1;
                        }
                    }
                    i18++;
                    ajVar2 = ajVar3;
                    arrayList2 = arrayList5;
                    strArr2 = strArr;
                    r62 = 0;
                }
                aj ajVar4 = ajVar2;
                String[] strArr3 = strArr2;
                int i21 = 0;
                for (ArrayList arrayList6 = (ArrayList) obj; i21 < arrayList6.size(); arrayList6 = arrayList) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList6.get(i21);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                        i12 = i21;
                        arrayList = arrayList6;
                    } else {
                        arrayList = arrayList6;
                        TLRPC.User Z1 = wp.r1(i16).Z1(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name).toLowerCase();
                        String R03 = dd.D0().R0(lowerCase4, true, false);
                        if (lowerCase4.equals(R03)) {
                            R03 = null;
                        }
                        char c12 = 0;
                        int i22 = 0;
                        while (i22 < i17) {
                            String str7 = strArr3[i22];
                            if (lowerCase4.startsWith(str7) || sc.e.y(" ", str7, lowerCase4) || (R03 != null && (R03.startsWith(str7) || sc.e.y(" ", str7, R03)))) {
                                i12 = i21;
                                c12 = 1;
                            } else {
                                i12 = i21;
                                String n11 = i20.n(Z1);
                                if (n11 != null && n11.startsWith(str7)) {
                                    c12 = 2;
                                }
                            }
                            if (c12 != 0 && Z1.phone != null) {
                                if (c12 == 1) {
                                    arrayList4.add(org.telegram.messenger.i0.r0(Z1.first_name, Z1.last_name, str7));
                                } else {
                                    arrayList4.add(org.telegram.messenger.i0.r0("@" + i20.n(Z1), null, "@" + str7));
                                }
                                arrayList3.add(Z1);
                                i21 = i12 + 1;
                            } else {
                                i22++;
                                i21 = i12;
                            }
                        }
                        i12 = i21;
                    }
                    i21 = i12 + 1;
                }
                org.telegram.messenger.i0.g3(new ag.g3(ajVar4, this.f3131c, arrayList3, arrayList4, 14));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                un unVar2 = (un) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
                bi biVar = chatAttachAlertPhotoLayout.f30964b;
                if (biVar.f24827w1 && !biVar.f24831x1) {
                    PhotoViewer.v1().N2(null, k2Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.h = 0;
                    v12.f33554n = false;
                    i13 = 3;
                } else {
                    i13 = i16;
                }
                if (biVar.f24835y1) {
                    i13 = 13;
                }
                int i23 = i13;
                PhotoViewer v13 = PhotoViewer.v1();
                sl slVar = chatAttachAlertPhotoLayout.f23866h1;
                if (biVar.f24835y1) {
                    unVar = null;
                } else {
                    unVar = unVar2;
                }
                v13.j2(arrayList7, this.f3131c, i23, false, slVar, unVar);
                PhotoViewer.v1().A2(biVar.H1);
                if (biVar.f24827w1 && !biVar.f24831x1) {
                    PhotoViewer.v1().O = false;
                } else if (biVar.K2 != 0) {
                    PhotoViewer.v1().O = true;
                    PhotoViewer v14 = PhotoViewer.v1();
                    if (biVar.L2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v14.P = z10;
                }
                if (biVar.f24831x1) {
                    PhotoViewer.v1().Z0(null, null, false, biVar.A1);
                }
                if (ChatAttachAlertPhotoLayout.U()) {
                    PhotoViewer v15 = PhotoViewer.v1();
                    Editable text = biVar.Z0().getText();
                    v15.f33579p7 = true;
                    v15.f33587q7 = text;
                    v15.D2(null, text, false, false);
                    v15.w3(null);
                    return;
                }
                return;
        }
    }

    public k0(m4.j1 j1Var, m4.w wVar, int i10, m4.f0 f0Var, int i11, m4.h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f3130b = i10;
        this.f3132f = f0Var;
        this.f3131c = i11;
        this.h = h1Var;
    }

    public k0(sb sbVar, File file, String str, int i10, Object obj, int i11) {
        this.d = sbVar;
        this.e = file;
        this.f3132f = str;
        this.f3130b = i10;
        this.h = obj;
        this.f3131c = i11;
    }

    public k0(aj ajVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = ajVar;
        this.e = str;
        this.f3132f = arrayList;
        this.h = arrayList2;
        this.f3130b = i10;
        this.f3131c = i11;
    }

    public k0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, int i11, un unVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f3130b = i10;
        this.e = k2Var;
        this.f3132f = arrayList;
        this.f3131c = i11;
        this.h = unVar;
    }
}
