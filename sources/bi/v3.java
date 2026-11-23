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
import org.telegram.messenger.n10;
import org.telegram.messenger.ob;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.ti;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
public final class v3 implements Runnable {
    public final int f4139a = 0;
    public final int f4140b;
    public final int f4141c;
    public final Object d;
    public final Object f4142e;
    public final Object f4143f;
    public final Object h;

    public v3(Context context, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.i6 i6Var, u3 u3Var) {
        this.d = context;
        this.f4140b = i7;
        this.f4141c = i10;
        this.f4142e = tL_messageActionStarGiftOnchainOffer;
        this.f4143f = i6Var;
        this.h = u3Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.d8 E;
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
        int i13 = this.f4139a;
        final int i14 = this.f4141c;
        ?? r62 = 0;
        int i15 = this.f4140b;
        Object obj = this.h;
        Object obj2 = this.f4143f;
        Object obj3 = this.f4142e;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                u3 u3Var = (u3) obj;
                l4.f((Context) obj4, this.f4140b, this.f4141c, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3, (org.telegram.ui.ActionBar.i6) obj2, u3Var.k(), new q3(u3Var, 3));
                return;
            case 1:
                oi.f1 f1Var = (oi.f1) obj3;
                i9 i9Var = (i9) obj2;
                oi.h0 h0Var = (oi.h0) obj;
                oi.i0 i0Var = (oi.i0) ((j6.k) obj4).f17344c;
                if (f1Var.length() >= i15 && f1Var.getSelectionStart() != f1Var.getSelectionEnd() && i9Var.j0(h0Var.P(), 0, i14, i15)) {
                    i0Var.d = true;
                    f1Var.setSelection(i15);
                    i0Var.d = false;
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
                    long j3 = E.f23628a;
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
                ec ecVar = obVar.f26146b;
                ecVar.f23797s.c(new dg(ecVar, str5, this.f4141c, file, 5));
                return;
            case 3:
                qj qjVar = (qj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                qjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    qjVar.h = -1;
                    org.telegram.messenger.g0.g3(new ai.x0(qjVar, qjVar.h, new ArrayList(), new ArrayList(), 21));
                    return;
                }
                String T0 = gd.E0().T0(lowerCase, true, false);
                T0 = (lowerCase.equals(T0) || T0.length() == 0) ? null : null;
                if (T0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i16 = i10 + 1;
                String[] strArr2 = new String[i16];
                strArr2[0] = lowerCase;
                if (T0 != null) {
                    strArr2[1] = T0;
                }
                ArrayList arrayList3 = new ArrayList();
                qj qjVar2 = qjVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList.get(i17);
                    qj qjVar3 = qjVar2;
                    String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.f23954i, f5Var.f23955j).toLowerCase();
                    ArrayList arrayList5 = arrayList;
                    String T02 = gd.E0().T0(lowerCase2, true, r62);
                    TLRPC.User user = f5Var.f23958m;
                    if (user != null) {
                        strArr = strArr2;
                        String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        str3 = gd.E0().T0(lowerCase2, true, r62);
                        str2 = lowerCase3;
                    } else {
                        strArr = strArr2;
                        str2 = null;
                        str3 = null;
                    }
                    if (lowerCase2.equals(T02)) {
                        T02 = null;
                    }
                    char c11 = r62;
                    int i18 = r62;
                    while (i18 < i16) {
                        int i19 = i18;
                        String str6 = strArr[i19];
                        if ((str2 == null || (!str2.startsWith(str6) && !i5.c.B(" ", str6, str2))) && (str3 == null || (!str3.startsWith(str6) && !i5.c.B(" ", str6, str3)))) {
                            str4 = str2;
                            TLRPC.User user2 = f5Var.f23958m;
                            if (user2 != null && (o4 = n10.o(user2)) != null && o4.startsWith(str6)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str6) && !i5.c.B(" ", str6, lowerCase2) && (T02 == null || (!T02.startsWith(str6) && !i5.c.B(" ", str6, T02)))) {
                                c10 = c11;
                            } else {
                                c10 = 3;
                            }
                        } else {
                            str4 = str2;
                            c10 = 1;
                        }
                        String str7 = lowerCase2;
                        if (c10 != 0 && (!f5Var.f23951e.isEmpty() || !f5Var.f23953g.isEmpty())) {
                            if (c10 == 3) {
                                arrayList4.add(org.telegram.messenger.g0.r0(f5Var.f23954i, f5Var.f23955j, str6));
                            } else if (c10 == 1) {
                                TLRPC.User user3 = f5Var.f23958m;
                                arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str6));
                            } else {
                                arrayList4.add(org.telegram.messenger.g0.r0("@" + n10.o(f5Var.f23958m), null, "@" + str6));
                            }
                            TLRPC.User user4 = f5Var.f23958m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f28641id, 1);
                            }
                            arrayList3.add(f5Var);
                            i17++;
                            qjVar2 = qjVar3;
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
                    qjVar2 = qjVar3;
                    arrayList = arrayList5;
                    strArr2 = strArr;
                    r62 = 0;
                }
                qj qjVar4 = qjVar2;
                String[] strArr3 = strArr2;
                for (int i20 = 0; i20 < arrayList2.size(); i20 = i11 + 1) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i20);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                        i11 = i20;
                    } else {
                        i11 = i20;
                        TLRPC.User c22 = mp.u1(i15).c2(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                        String T03 = gd.E0().T0(lowerCase4, true, false);
                        if (lowerCase4.equals(T03)) {
                            T03 = null;
                        }
                        char c12 = 0;
                        int i21 = 0;
                        while (i21 < i16) {
                            String str8 = strArr3[i21];
                            if (lowerCase4.startsWith(str8) || i5.c.B(" ", str8, lowerCase4) || (T03 != null && (T03.startsWith(str8) || i5.c.B(" ", str8, T03)))) {
                                str = lowerCase4;
                                c12 = 1;
                            } else {
                                str = lowerCase4;
                                String o10 = n10.o(c22);
                                if (o10 != null && o10.startsWith(str8)) {
                                    c12 = 2;
                                }
                            }
                            if (c12 != 0 && c22.phone != null) {
                                if (c12 == 1) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str8));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + n10.o(c22), null, "@" + str8));
                                }
                                arrayList3.add(c22);
                            } else {
                                i21++;
                                lowerCase4 = str;
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new ai.x0(qjVar4, this.f4141c, arrayList3, arrayList4, 21));
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                bn bnVar2 = (bn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
                ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                if (tiVar.A1 && !tiVar.B1) {
                    PhotoViewer.p1().J2(null, g2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.f43401n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (tiVar.C1) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer p13 = PhotoViewer.p1();
                am amVar = chatAttachAlertPhotoLayout.f32884i1;
                if (tiVar.C1) {
                    bnVar = null;
                } else {
                    bnVar = bnVar2;
                }
                p13.g2(arrayList6, this.f4141c, i22, false, amVar, bnVar);
                PhotoViewer.p1().w2(tiVar.L1);
                if (tiVar.A1 && !tiVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (tiVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer p14 = PhotoViewer.p1();
                    if (tiVar.P2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p14.Q = z10;
                }
                if (tiVar.B1) {
                    PhotoViewer.p1().T0(null, null, false, tiVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p15 = PhotoViewer.p1();
                    Editable text = tiVar.b1().getText();
                    p15.f43479v7 = true;
                    p15.f43489w7 = text;
                    p15.z2(null, text, false, false);
                    p15.s3(null);
                    return;
                }
                return;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.b1 b1Var = (p4.b1) obj;
                ab.c0 c0Var = ((p4.d1) obj4).f55331b;
                if (!c0Var.D(vVar, i15)) {
                    p4.d1.r1(d0Var, vVar, i14, new p4.n1(-4));
                    return;
                }
                w7.s sVar = d0Var.f55310e;
                d0Var.s(vVar);
                sVar.getClass();
                if (i15 == 27) {
                    b1Var.j(d0Var, vVar, i14);
                    c0Var.c(vVar, i15, new Object());
                    return;
                }
                c0Var.c(vVar, i15, new p4.g() {
                    @Override
                    public final m9.y run() {
                        return (m9.y) b1.this.j(d0Var, vVar, i14);
                    }
                });
                return;
        }
    }

    public v3(j6.k kVar, oi.f1 f1Var, int i7, i9 i9Var, oi.h0 h0Var, int i10) {
        this.d = kVar;
        this.f4142e = f1Var;
        this.f4140b = i7;
        this.f4143f = i9Var;
        this.h = h0Var;
        this.f4141c = i10;
    }

    public v3(ob obVar, File file, String str, int i7, Object obj, int i10) {
        this.d = obVar;
        this.f4142e = file;
        this.f4143f = str;
        this.f4140b = i7;
        this.h = obj;
        this.f4141c = i10;
    }

    public v3(qj qjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = qjVar;
        this.f4142e = str;
        this.f4143f = arrayList;
        this.h = arrayList2;
        this.f4140b = i7;
        this.f4141c = i10;
    }

    public v3(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, int i10, bn bnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f4140b = i7;
        this.f4142e = g2Var;
        this.f4143f = arrayList;
        this.f4141c = i10;
        this.h = bnVar;
    }

    public v3(p4.d1 d1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.b1 b1Var) {
        this.d = d1Var;
        this.f4142e = vVar;
        this.f4140b = i7;
        this.f4143f = d0Var;
        this.f4141c = i10;
        this.h = b1Var;
    }
}
