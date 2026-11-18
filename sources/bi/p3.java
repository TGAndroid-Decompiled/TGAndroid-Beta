package bi;

import android.content.Context;
import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.dg;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ob;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.si;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
public final class p3 implements Runnable {
    public final int f3931a = 0;
    public final int f3932b;
    public final int f3933c;
    public final Object d;
    public final Object f3934e;
    public final Object f3935f;
    public final Object h;

    public p3(Context context, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var) {
        this.d = context;
        this.f3932b = i7;
        this.f3933c = i10;
        this.f3934e = tL_messageActionStarGiftOnchainOffer;
        this.f3935f = i6Var;
        this.h = o3Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.e8 E;
        int i7;
        int i10;
        int i11;
        String str;
        String[] strArr;
        String str2;
        String str3;
        String str4;
        char c10;
        String o4;
        int i12;
        bn bnVar;
        boolean z10;
        int i13 = this.f3931a;
        final int i14 = this.f3933c;
        ?? r62 = 0;
        int i15 = this.f3932b;
        Object obj = this.h;
        Object obj2 = this.f3935f;
        Object obj3 = this.f3934e;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                o3 o3Var = (o3) obj;
                e4.f((Context) obj4, this.f3932b, this.f3933c, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3, (org.telegram.ui.ActionBar.i6) obj2, o3Var.k(), new k3(o3Var, 3));
                return;
            case 1:
                oi.e1 e1Var = (oi.e1) obj3;
                j9 j9Var = (j9) obj2;
                oi.g0 g0Var = (oi.g0) obj;
                oi.h0 h0Var = (oi.h0) ((ji.j) obj4).f17946c;
                if (e1Var.length() >= i15 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && j9Var.j0(g0Var.a1(), 0, i14, i15)) {
                    h0Var.d = true;
                    e1Var.setSelection(i15);
                    h0Var.d = false;
                    return;
                }
                return;
            case 2:
                fj fjVar = null;
                ob obVar = (ob) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                obVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = org.telegram.messenger.w7.E(obj)) != null)) {
                    if (obj instanceof fj) {
                        fjVar = (fj) obj;
                    }
                    long j3 = E.f23669a;
                    if (j3 >= 0) {
                        i7 = 1;
                    } else if (org.telegram.messenger.v3.V(mp.u1(i15).O0(Long.valueOf(-j3)))) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    if (org.telegram.messenger.c6.m(i7, E, fjVar, i15)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                ks.f(i15).k(142, str5, file);
                ec ecVar = obVar.f26049b;
                ecVar.f23692s.c(new dg(ecVar, str5, this.f3933c, file, 5));
                return;
            case 3:
                pj pjVar = (pj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                pjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    pjVar.h = -1;
                    org.telegram.messenger.g0.g3(new t4(pjVar, pjVar.h, new ArrayList(), new ArrayList(), 20));
                    return;
                }
                String S0 = gd.E0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
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
                pj pjVar2 = pjVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList.get(i17);
                    pj pjVar3 = pjVar2;
                    String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.f23843i, f5Var.f23844j).toLowerCase();
                    ArrayList arrayList5 = arrayList;
                    String S02 = gd.E0().S0(lowerCase2, true, r62);
                    TLRPC.User user = f5Var.f23847m;
                    if (user != null) {
                        strArr = strArr2;
                        String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        str3 = gd.E0().S0(lowerCase2, true, r62);
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
                        String str6 = strArr[i19];
                        if ((str2 == null || (!str2.startsWith(str6) && !i5.c.B(" ", str6, str2))) && (str3 == null || (!str3.startsWith(str6) && !i5.c.B(" ", str6, str3)))) {
                            str4 = str2;
                            TLRPC.User user2 = f5Var.f23847m;
                            if (user2 != null && (o4 = o10.o(user2)) != null && o4.startsWith(str6)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str6) && !i5.c.B(" ", str6, lowerCase2) && (S02 == null || (!S02.startsWith(str6) && !i5.c.B(" ", str6, S02)))) {
                                c10 = c11;
                            } else {
                                c10 = 3;
                            }
                        } else {
                            str4 = str2;
                            c10 = 1;
                        }
                        String str7 = lowerCase2;
                        if (c10 != 0 && (!f5Var.f23840e.isEmpty() || !f5Var.f23842g.isEmpty())) {
                            if (c10 == 3) {
                                arrayList4.add(org.telegram.messenger.g0.r0(f5Var.f23843i, f5Var.f23844j, str6));
                            } else if (c10 == 1) {
                                TLRPC.User user3 = f5Var.f23847m;
                                arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str6));
                            } else {
                                arrayList4.add(org.telegram.messenger.g0.r0("@" + o10.o(f5Var.f23847m), null, "@" + str6));
                            }
                            TLRPC.User user4 = f5Var.f23847m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f28552id, 1);
                            }
                            arrayList3.add(f5Var);
                            i17++;
                            pjVar2 = pjVar3;
                            arrayList = arrayList5;
                            strArr2 = strArr;
                            r62 = 0;
                        } else {
                            lowerCase2 = str7;
                            c11 = c10;
                            str2 = str4;
                            i18 = i19 + 1;
                        }
                    }
                    i17++;
                    pjVar2 = pjVar3;
                    arrayList = arrayList5;
                    strArr2 = strArr;
                    r62 = 0;
                }
                pj pjVar4 = pjVar2;
                String[] strArr3 = strArr2;
                for (int i20 = 0; i20 < arrayList2.size(); i20 = i11 + 1) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i20);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                        i11 = i20;
                    } else {
                        i11 = i20;
                        TLRPC.User c22 = mp.u1(i15).c2(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                        String S03 = gd.E0().S0(lowerCase4, true, false);
                        if (lowerCase4.equals(S03)) {
                            S03 = null;
                        }
                        char c12 = 0;
                        int i21 = 0;
                        while (i21 < i16) {
                            String str8 = strArr3[i21];
                            if (lowerCase4.startsWith(str8) || i5.c.B(" ", str8, lowerCase4) || (S03 != null && (S03.startsWith(str8) || i5.c.B(" ", str8, S03)))) {
                                str = lowerCase4;
                                c12 = 1;
                            } else {
                                str = lowerCase4;
                                String o10 = o10.o(c22);
                                if (o10 != null && o10.startsWith(str8)) {
                                    c12 = 2;
                                }
                            }
                            if (c12 != 0 && c22.phone != null) {
                                if (c12 == 1) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str8));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + o10.o(c22), null, "@" + str8));
                                }
                                arrayList3.add(c22);
                            } else {
                                i21++;
                                lowerCase4 = str;
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new t4(pjVar4, this.f3933c, arrayList3, arrayList4, 20));
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                bn bnVar2 = (bn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f32762r1;
                si siVar = chatAttachAlertPhotoLayout.f36766b;
                if (siVar.A1 && !siVar.B1) {
                    PhotoViewer.p1().I2(null, h2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.f43275n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (siVar.C1) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer p13 = PhotoViewer.p1();
                am amVar = chatAttachAlertPhotoLayout.f32784i1;
                if (siVar.C1) {
                    bnVar = null;
                } else {
                    bnVar = bnVar2;
                }
                p13.f2(arrayList6, this.f3933c, i22, false, amVar, bnVar);
                PhotoViewer.p1().v2(siVar.L1);
                if (siVar.A1 && !siVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (siVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer p14 = PhotoViewer.p1();
                    if (siVar.P2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p14.Q = z10;
                }
                if (siVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, siVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p15 = PhotoViewer.p1();
                    Editable text = siVar.b1().getText();
                    p15.f43299p7 = true;
                    p15.f43308q7 = text;
                    p15.y2(null, text, false, false);
                    p15.r3(null);
                    return;
                }
                return;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj4).f55210b;
                if (!c0Var.C(vVar, i15)) {
                    p4.e1.r1(d0Var, vVar, i14, new p4.o1(-4));
                    return;
                }
                w7.s sVar = d0Var.f55181e;
                d0Var.s(vVar);
                sVar.getClass();
                if (i15 == 27) {
                    c1Var.k(d0Var, vVar, i14);
                    c0Var.c(vVar, i15, new Object());
                    return;
                }
                c0Var.c(vVar, i15, new p4.g() {
                    @Override
                    public final m9.y run() {
                        return (m9.y) c1.this.k(d0Var, vVar, i14);
                    }
                });
                return;
        }
    }

    public p3(ji.j jVar, oi.e1 e1Var, int i7, j9 j9Var, oi.g0 g0Var, int i10) {
        this.d = jVar;
        this.f3934e = e1Var;
        this.f3932b = i7;
        this.f3935f = j9Var;
        this.h = g0Var;
        this.f3933c = i10;
    }

    public p3(ob obVar, File file, String str, int i7, Object obj, int i10) {
        this.d = obVar;
        this.f3934e = file;
        this.f3935f = str;
        this.f3932b = i7;
        this.h = obj;
        this.f3933c = i10;
    }

    public p3(pj pjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = pjVar;
        this.f3934e = str;
        this.f3935f = arrayList;
        this.h = arrayList2;
        this.f3932b = i7;
        this.f3933c = i10;
    }

    public p3(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, int i10, bn bnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f3932b = i7;
        this.f3934e = h2Var;
        this.f3935f = arrayList;
        this.f3933c = i10;
        this.h = bnVar;
    }

    public p3(p4.e1 e1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.f3934e = vVar;
        this.f3932b = i7;
        this.f3935f = d0Var;
        this.f3933c = i10;
        this.h = c1Var;
    }
}
