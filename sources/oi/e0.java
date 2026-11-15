package oi;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.cg;
import org.telegram.messenger.e8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pb;
import org.telegram.messenger.q10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.tl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
public final class e0 implements Runnable {
    public final int f21648a = 0;
    public final int f21649b;
    public final int f21650c;
    public final Object d;
    public final Object f21651e;
    public final Object f21652f;
    public final Object h;

    public e0(ji.j jVar, e1 e1Var, int i7, h9 h9Var, g0 g0Var, int i10) {
        this.d = jVar;
        this.f21651e = e1Var;
        this.f21649b = i7;
        this.f21652f = h9Var;
        this.h = g0Var;
        this.f21650c = i10;
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
        boolean z10;
        int i13 = this.f21648a;
        final int i14 = this.f21650c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f21652f;
        int i15 = this.f21649b;
        Object obj3 = this.f21651e;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                e1 e1Var = (e1) obj3;
                h9 h9Var = (h9) obj2;
                g0 g0Var = (g0) obj;
                h0 h0Var = (h0) ((ji.j) obj4).f17556c;
                if (e1Var.length() >= i15 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && h9Var.j0(g0Var.N(), 0, i14, i15)) {
                    h0Var.d = true;
                    e1Var.setSelection(i15);
                    h0Var.d = false;
                    return;
                }
                return;
            case 1:
                gj gjVar = null;
                pb pbVar = (pb) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                pbVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = w7.E(obj)) != null)) {
                    if (obj instanceof gj) {
                        gjVar = (gj) obj;
                    }
                    long j3 = E.f23279a;
                    if (j3 >= 0) {
                        i7 = 1;
                    } else if (org.telegram.messenger.t3.V(np.s1(i15).M0(Long.valueOf(-j3)))) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    if (org.telegram.messenger.b6.m(i7, E, gjVar, i15)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                ns.f(i15).k(142, str5, file);
                fc fcVar = pbVar.f25921b;
                fcVar.f23479s.c(new cg(fcVar, str5, this.f21650c, file, 5));
                return;
            case 2:
                ij ijVar = (ij) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                ijVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ijVar.h = -1;
                    org.telegram.messenger.g0.h3(new ci.p0(ijVar, ijVar.h, new ArrayList(), new ArrayList(), 19));
                    return;
                }
                String S0 = hd.E0().S0(lowerCase, true, false);
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
                ij ijVar2 = ijVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (true) {
                    String str6 = " ";
                    if (i17 < arrayList.size()) {
                        org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) arrayList.get(i17);
                        ij ijVar3 = ijVar2;
                        String lowerCase2 = org.telegram.messenger.g5.m(r62, d5Var.f23045i, d5Var.f23046j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String S02 = hd.E0().S0(lowerCase2, true, r62);
                        TLRPC.User user = d5Var.f23049m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str3 = hd.E0().S0(lowerCase2, true, r62);
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
                            if ((str2 == null || (!str2.startsWith(str7) && !i5.c.A(" ", str7, str2))) && (str3 == null || (!str3.startsWith(str7) && !i5.c.A(" ", str7, str3)))) {
                                str4 = str2;
                                TLRPC.User user2 = d5Var.f23049m;
                                if (user2 != null && (n10 = q10.n(user2)) != null && n10.startsWith(str7)) {
                                    c10 = 2;
                                } else if (!lowerCase2.startsWith(str7) && !i5.c.A(" ", str7, lowerCase2) && (S02 == null || (!S02.startsWith(str7) && !i5.c.A(" ", str7, S02)))) {
                                    c10 = c11;
                                } else {
                                    c10 = 3;
                                }
                            } else {
                                str4 = str2;
                                c10 = 1;
                            }
                            String str8 = lowerCase2;
                            if (c10 != 0 && (!d5Var.f23042e.isEmpty() || !d5Var.f23044g.isEmpty())) {
                                if (c10 == 3) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f23045i, d5Var.f23046j, str7));
                                } else if (c10 == 1) {
                                    TLRPC.User user3 = d5Var.f23049m;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str7));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + q10.n(d5Var.f23049m), null, "@" + str7));
                                }
                                TLRPC.User user4 = d5Var.f23049m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.f28200id, 1);
                                }
                                arrayList3.add(d5Var);
                                i17++;
                                ijVar2 = ijVar3;
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
                        ijVar2 = ijVar3;
                        arrayList = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    } else {
                        ij ijVar4 = ijVar2;
                        String[] strArr3 = strArr2;
                        int i20 = 0;
                        while (i20 < arrayList2.size()) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i20);
                            if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                                str = str6;
                                i11 = i20;
                            } else {
                                i11 = i20;
                                TLRPC.User a22 = np.s1(i15).a2(Long.valueOf(tL_contact.user_id));
                                String lowerCase4 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                                String S03 = hd.E0().S0(lowerCase4, true, false);
                                if (lowerCase4.equals(S03)) {
                                    S03 = null;
                                }
                                char c12 = 0;
                                int i21 = 0;
                                while (i21 < i16) {
                                    String str9 = strArr3[i21];
                                    if (lowerCase4.startsWith(str9) || i5.c.A(str6, str9, lowerCase4) || (S03 != null && (S03.startsWith(str9) || i5.c.A(str6, str9, S03)))) {
                                        str = str6;
                                        c12 = 1;
                                    } else {
                                        str = str6;
                                        String n11 = q10.n(a22);
                                        if (n11 != null && n11.startsWith(str9)) {
                                            c12 = 2;
                                        }
                                    }
                                    if (c12 != 0 && a22.phone != null) {
                                        if (c12 == 1) {
                                            arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str9));
                                        } else {
                                            arrayList4.add(org.telegram.messenger.g0.r0("@" + q10.n(a22), null, "@" + str9));
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
                        org.telegram.messenger.g0.h3(new ci.p0(ijVar4, this.f21650c, arrayList3, arrayList4, 19));
                        return;
                    }
                }
                break;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                an anVar2 = (an) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
                ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                if (kiVar.A1 && !kiVar.B1) {
                    PhotoViewer.p1().I2(null, e2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.f42830n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (kiVar.C1) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer p13 = PhotoViewer.p1();
                tl tlVar = chatAttachAlertPhotoLayout.f32387i1;
                if (kiVar.C1) {
                    anVar = null;
                } else {
                    anVar = anVar2;
                }
                p13.f2(arrayList6, this.f21650c, i22, false, tlVar, anVar);
                PhotoViewer.p1().v2(kiVar.L1);
                if (kiVar.A1 && !kiVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (kiVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer p14 = PhotoViewer.p1();
                    if (kiVar.P2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p14.Q = z10;
                }
                if (kiVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, kiVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p15 = PhotoViewer.p1();
                    Editable text = kiVar.a1().getText();
                    p15.f42854p7 = true;
                    p15.f42863q7 = text;
                    p15.y2(null, text, false, false);
                    p15.r3(null);
                    return;
                }
                return;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.a1 a1Var = (p4.a1) obj;
                ab.c0 c0Var = ((p4.c1) obj4).f54601b;
                if (!c0Var.z(vVar, i15)) {
                    p4.c1.r1(d0Var, vVar, i14, new p4.m1(-4));
                    return;
                }
                w7.s sVar = d0Var.f54621e;
                d0Var.s(vVar);
                sVar.getClass();
                if (i15 == 27) {
                    a1Var.k(d0Var, vVar, i14);
                    c0Var.c(vVar, i15, new Object());
                    return;
                }
                c0Var.c(vVar, i15, new p4.g() {
                    @Override
                    public final m9.y run() {
                        return (m9.y) a1.this.k(d0Var, vVar, i14);
                    }
                });
                return;
        }
    }

    public e0(pb pbVar, File file, String str, int i7, Object obj, int i10) {
        this.d = pbVar;
        this.f21651e = file;
        this.f21652f = str;
        this.f21649b = i7;
        this.h = obj;
        this.f21650c = i10;
    }

    public e0(ij ijVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = ijVar;
        this.f21651e = str;
        this.f21652f = arrayList;
        this.h = arrayList2;
        this.f21649b = i7;
        this.f21650c = i10;
    }

    public e0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, int i10, an anVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f21649b = i7;
        this.f21651e = e2Var;
        this.f21652f = arrayList;
        this.f21650c = i10;
        this.h = anVar;
    }

    public e0(p4.c1 c1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.a1 a1Var) {
        this.d = c1Var;
        this.f21651e = vVar;
        this.f21649b = i7;
        this.f21652f = d0Var;
        this.f21650c = i10;
        this.h = a1Var;
    }
}
