package li;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.dg;
import org.telegram.messenger.e8;
import org.telegram.messenger.gc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qb;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ml;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
public final class g0 implements Runnable {
    public final int f18579a = 0;
    public final int f18580b;
    public final int f18581c;
    public final Object d;
    public final Object f18582e;
    public final Object f18583f;
    public final Object h;

    public g0(j2.n nVar, g1 g1Var, int i7, i9 i9Var, i0 i0Var, int i10) {
        this.d = nVar;
        this.f18582e = g1Var;
        this.f18580b = i7;
        this.f18583f = i9Var;
        this.h = i0Var;
        this.f18581c = i10;
    }

    @Override
    public final void run() {
        e8 E;
        int i7;
        int i10;
        int i11;
        String str;
        String[] strArr;
        String str2;
        String str3;
        String str4;
        char c10;
        String n10;
        int i12;
        an anVar;
        boolean z9;
        int i13 = this.f18579a;
        final int i14 = this.f18581c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f18583f;
        int i15 = this.f18580b;
        Object obj3 = this.f18582e;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                g1 g1Var = (g1) obj3;
                i9 i9Var = (i9) obj2;
                i0 i0Var = (i0) obj;
                j0 j0Var = (j0) ((j2.n) obj4).f16457c;
                if (g1Var.length() >= i15 && g1Var.getSelectionStart() != g1Var.getSelectionEnd() && i9Var.j0(i0Var.S0(), 0, i14, i15)) {
                    j0Var.d = true;
                    g1Var.setSelection(i15);
                    j0Var.d = false;
                    return;
                }
                return;
            case 1:
                ij ijVar = null;
                qb qbVar = (qb) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                qbVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = w7.E(obj)) != null)) {
                    if (obj instanceof ij) {
                        ijVar = (ij) obj;
                    }
                    long j3 = E.f22196a;
                    if (j3 >= 0) {
                        i7 = 1;
                    } else if (org.telegram.messenger.t3.V(qp.s1(i15).M0(Long.valueOf(-j3)))) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    if (org.telegram.messenger.b6.k(i7, E, ijVar, i15)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                qs.f(i15).k(142, str5, file);
                gc gcVar = qbVar.f24687b;
                gcVar.f22651s.c(new dg(gcVar, str5, this.f18581c, file, 5));
                return;
            case 2:
                bj bjVar = (bj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                bjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    bjVar.h = -1;
                    org.telegram.messenger.g0.h3(new ai.a1(bjVar, bjVar.h, new ArrayList(), new ArrayList(), 19));
                    return;
                }
                String S0 = id.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                if (S0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i16 = i10 + 1;
                String[] strArr2 = new String[i16];
                strArr2[0] = lowerCase;
                if (S0 != null) {
                    strArr2[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                bj bjVar2 = bjVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (true) {
                    String str6 = " ";
                    if (i17 < arrayList.size()) {
                        org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) arrayList.get(i17);
                        bj bjVar3 = bjVar2;
                        String lowerCase2 = org.telegram.messenger.g5.m(r62, d5Var.f21992i, d5Var.f21993j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String S02 = id.E0().S0(lowerCase2, true, r62);
                        TLRPC.User user = d5Var.f21996m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str3 = id.E0().S0(lowerCase2, true, r62);
                            str2 = lowerCase3;
                        } else {
                            strArr = strArr2;
                            str2 = null;
                            str3 = null;
                        }
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        char c11 = r62;
                        int i18 = r62;
                        while (i18 < i16) {
                            int i19 = i18;
                            String str7 = strArr[i19];
                            if ((str2 == null || (!str2.startsWith(str7) && !jg.g.A(" ", str7, str2))) && (str3 == null || (!str3.startsWith(str7) && !jg.g.A(" ", str7, str3)))) {
                                str4 = str2;
                                TLRPC.User user2 = d5Var.f21996m;
                                if (user2 != null && (n10 = t10.n(user2)) != null && n10.startsWith(str7)) {
                                    c10 = 2;
                                } else if (!lowerCase2.startsWith(str7) && !jg.g.A(" ", str7, lowerCase2) && (S02 == null || (!S02.startsWith(str7) && !jg.g.A(" ", str7, S02)))) {
                                    c10 = c11;
                                } else {
                                    c10 = 3;
                                }
                            } else {
                                str4 = str2;
                                c10 = 1;
                            }
                            String str8 = lowerCase2;
                            if (c10 != 0 && (!d5Var.f21989e.isEmpty() || !d5Var.f21991g.isEmpty())) {
                                if (c10 == 3) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f21992i, d5Var.f21993j, str7));
                                } else if (c10 == 1) {
                                    TLRPC.User user3 = d5Var.f21996m;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str7));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + t10.n(d5Var.f21996m), null, "@" + str7));
                                }
                                TLRPC.User user4 = d5Var.f21996m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.f27105id, 1);
                                }
                                arrayList3.add(d5Var);
                                i17++;
                                bjVar2 = bjVar3;
                                arrayList = arrayList5;
                                strArr2 = strArr;
                                r62 = 0;
                            } else {
                                lowerCase2 = str8;
                                c11 = c10;
                                str2 = str4;
                                i18 = i19 + 1;
                            }
                        }
                        i17++;
                        bjVar2 = bjVar3;
                        arrayList = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    } else {
                        bj bjVar4 = bjVar2;
                        String[] strArr3 = strArr2;
                        int i20 = 0;
                        while (i20 < arrayList2.size()) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i20);
                            if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                                str = str6;
                                i11 = i20;
                            } else {
                                i11 = i20;
                                TLRPC.User a22 = qp.s1(i15).a2(Long.valueOf(tL_contact.user_id));
                                String lowerCase4 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                                String S03 = id.E0().S0(lowerCase4, true, false);
                                if (lowerCase4.equals(S03)) {
                                    S03 = null;
                                }
                                char c12 = 0;
                                int i21 = 0;
                                while (i21 < i16) {
                                    String str9 = strArr3[i21];
                                    if (lowerCase4.startsWith(str9) || jg.g.A(str6, str9, lowerCase4) || (S03 != null && (S03.startsWith(str9) || jg.g.A(str6, str9, S03)))) {
                                        str = str6;
                                        c12 = 1;
                                    } else {
                                        str = str6;
                                        String n11 = t10.n(a22);
                                        if (n11 != null && n11.startsWith(str9)) {
                                            c12 = 2;
                                        }
                                    }
                                    if (c12 != 0 && a22.phone != null) {
                                        if (c12 == 1) {
                                            arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str9));
                                        } else {
                                            arrayList4.add(org.telegram.messenger.g0.r0("@" + t10.n(a22), null, "@" + str9));
                                        }
                                        arrayList3.add(a22);
                                        i20 = i11 + 1;
                                        str6 = str;
                                    } else {
                                        i21++;
                                        str6 = str;
                                    }
                                }
                                str = str6;
                            }
                            i20 = i11 + 1;
                            str6 = str;
                        }
                        org.telegram.messenger.g0.h3(new ai.a1(bjVar4, this.f18581c, arrayList3, arrayList4, 19));
                        return;
                    }
                }
                break;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                an anVar2 = (an) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.f31188q1;
                di diVar = chatAttachAlertPhotoLayout.f39004b;
                if (diVar.f33007w1 && !diVar.f33011x1) {
                    PhotoViewer.p1().H2(null, f2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.f41461n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (diVar.f33015y1) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer p13 = PhotoViewer.p1();
                ml mlVar = chatAttachAlertPhotoLayout.f31208h1;
                if (diVar.f33015y1) {
                    anVar = null;
                } else {
                    anVar = anVar2;
                }
                p13.e2(arrayList6, this.f18581c, i22, false, mlVar, anVar);
                PhotoViewer.p1().u2(diVar.H1);
                if (diVar.f33007w1 && !diVar.f33011x1) {
                    PhotoViewer.p1().O = false;
                } else if (diVar.K2 != 0) {
                    PhotoViewer.p1().O = true;
                    PhotoViewer p14 = PhotoViewer.p1();
                    if (diVar.L2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    p14.P = z9;
                }
                if (diVar.f33011x1) {
                    PhotoViewer.p1().S0(null, null, false, diVar.A1);
                }
                if (ChatAttachAlertPhotoLayout.V()) {
                    PhotoViewer p15 = PhotoViewer.p1();
                    Editable text = diVar.a1().getText();
                    p15.f41476o7 = true;
                    p15.f41485p7 = text;
                    p15.x2(null, text, false, false);
                    p15.q3(null);
                    return;
                }
                return;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.a1 a1Var = (p4.a1) obj;
                ui.e eVar = ((p4.c1) obj4).f53184b;
                if (!eVar.G(vVar, i15)) {
                    p4.c1.r1(d0Var, vVar, i14, new p4.m1(-4));
                    return;
                }
                pb.b bVar = d0Var.f53204e;
                d0Var.s(vVar);
                bVar.getClass();
                if (i15 == 27) {
                    a1Var.l(d0Var, vVar, i14);
                    eVar.f(vVar, i15, new Object());
                    return;
                }
                eVar.f(vVar, i15, new p4.g() {
                    @Override
                    public final m9.y run() {
                        return (m9.y) a1.this.l(d0Var, vVar, i14);
                    }
                });
                return;
        }
    }

    public g0(qb qbVar, File file, String str, int i7, Object obj, int i10) {
        this.d = qbVar;
        this.f18582e = file;
        this.f18583f = str;
        this.f18580b = i7;
        this.h = obj;
        this.f18581c = i10;
    }

    public g0(bj bjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = bjVar;
        this.f18582e = str;
        this.f18583f = arrayList;
        this.h = arrayList2;
        this.f18580b = i7;
        this.f18581c = i10;
    }

    public g0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, int i10, an anVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f18580b = i7;
        this.f18582e = f2Var;
        this.f18583f = arrayList;
        this.f18581c = i10;
        this.h = anVar;
    }

    public g0(p4.c1 c1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.a1 a1Var) {
        this.d = c1Var;
        this.f18582e = vVar;
        this.f18580b = i7;
        this.f18583f = d0Var;
        this.f18581c = i10;
        this.h = a1Var;
    }
}
