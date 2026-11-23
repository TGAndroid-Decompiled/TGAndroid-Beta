package bi;

import android.content.Context;
import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.eg;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.pb;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.ui;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
public final class t3 implements Runnable {
    public final int f4114a = 0;
    public final int f4115b;
    public final int f4116c;
    public final Object d;
    public final Object f4117e;
    public final Object f4118f;
    public final Object h;

    public t3(Context context, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var) {
        this.d = context;
        this.f4115b = i7;
        this.f4116c = i10;
        this.f4117e = tL_messageActionStarGiftOnchainOffer;
        this.f4118f = h6Var;
        this.h = s3Var;
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
        int i13 = this.f4114a;
        final int i14 = this.f4116c;
        ?? r62 = 0;
        int i15 = this.f4115b;
        Object obj = this.h;
        Object obj2 = this.f4118f;
        Object obj3 = this.f4117e;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                s3 s3Var = (s3) obj;
                i4.f((Context) obj4, this.f4115b, this.f4116c, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3, (org.telegram.ui.ActionBar.h6) obj2, s3Var.k(), new o3(s3Var, 3));
                return;
            case 1:
                oi.f1 f1Var = (oi.f1) obj3;
                j9 j9Var = (j9) obj2;
                oi.h0 h0Var = (oi.h0) obj;
                oi.i0 i0Var = (oi.i0) ((ji.l) obj4).f17980c;
                if (f1Var.length() >= i15 && f1Var.getSelectionStart() != f1Var.getSelectionEnd() && j9Var.j0(h0Var.a1(), 0, i14, i15)) {
                    i0Var.d = true;
                    f1Var.setSelection(i15);
                    i0Var.d = false;
                    return;
                }
                return;
            case 2:
                gj gjVar = null;
                pb pbVar = (pb) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                pbVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = org.telegram.messenger.w7.E(obj)) != null)) {
                    if (obj instanceof gj) {
                        gjVar = (gj) obj;
                    }
                    long j3 = E.f23687a;
                    if (j3 >= 0) {
                        i7 = 1;
                    } else if (org.telegram.messenger.v3.V(np.u1(i15).O0(Long.valueOf(-j3)))) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    if (org.telegram.messenger.c6.m(i7, E, gjVar, i15)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                ls.f(i15).k(142, str5, file);
                fc fcVar = pbVar.f26295b;
                fcVar.f23901s.c(new eg(fcVar, str5, this.f4116c, file, 5));
                return;
            case 3:
                rj rjVar = (rj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                rjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    rjVar.h = -1;
                    org.telegram.messenger.g0.g3(new ai.b1(rjVar, rjVar.h, new ArrayList(), new ArrayList(), 21));
                    return;
                }
                String T0 = hd.E0().T0(lowerCase, true, false);
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
                rj rjVar2 = rjVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList.get(i17);
                    rj rjVar3 = rjVar2;
                    String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.f23866i, f5Var.f23867j).toLowerCase();
                    ArrayList arrayList5 = arrayList;
                    String T02 = hd.E0().T0(lowerCase2, true, r62);
                    TLRPC.User user = f5Var.f23870m;
                    if (user != null) {
                        strArr = strArr2;
                        String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        str3 = hd.E0().T0(lowerCase2, true, r62);
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
                            TLRPC.User user2 = f5Var.f23870m;
                            if (user2 != null && (o4 = p10.o(user2)) != null && o4.startsWith(str6)) {
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
                        if (c10 != 0 && (!f5Var.f23863e.isEmpty() || !f5Var.f23865g.isEmpty())) {
                            if (c10 == 3) {
                                arrayList4.add(org.telegram.messenger.g0.r0(f5Var.f23866i, f5Var.f23867j, str6));
                            } else if (c10 == 1) {
                                TLRPC.User user3 = f5Var.f23870m;
                                arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str6));
                            } else {
                                arrayList4.add(org.telegram.messenger.g0.r0("@" + p10.o(f5Var.f23870m), null, "@" + str6));
                            }
                            TLRPC.User user4 = f5Var.f23870m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f28583id, 1);
                            }
                            arrayList3.add(f5Var);
                            i17++;
                            rjVar2 = rjVar3;
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
                    rjVar2 = rjVar3;
                    arrayList = arrayList5;
                    strArr2 = strArr;
                    r62 = 0;
                }
                rj rjVar4 = rjVar2;
                String[] strArr3 = strArr2;
                for (int i20 = 0; i20 < arrayList2.size(); i20 = i11 + 1) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i20);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                        i11 = i20;
                    } else {
                        i11 = i20;
                        TLRPC.User c22 = np.u1(i15).c2(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                        String T03 = hd.E0().T0(lowerCase4, true, false);
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
                                String o10 = p10.o(c22);
                                if (o10 != null && o10.startsWith(str8)) {
                                    c12 = 2;
                                }
                            }
                            if (c12 != 0 && c22.phone != null) {
                                if (c12 == 1) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str8));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + p10.o(c22), null, "@" + str8));
                                }
                                arrayList3.add(c22);
                            } else {
                                i21++;
                                lowerCase4 = str;
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new ai.b1(rjVar4, this.f4116c, arrayList3, arrayList4, 21));
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                bn bnVar2 = (bn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f32798r1;
                ui uiVar = chatAttachAlertPhotoLayout.f37520b;
                if (uiVar.A1 && !uiVar.B1) {
                    PhotoViewer.p1().I2(null, g2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.f43320n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (uiVar.C1) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer p13 = PhotoViewer.p1();
                cm cmVar = chatAttachAlertPhotoLayout.f32820i1;
                if (uiVar.C1) {
                    bnVar = null;
                } else {
                    bnVar = bnVar2;
                }
                p13.f2(arrayList6, this.f4116c, i22, false, cmVar, bnVar);
                PhotoViewer.p1().v2(uiVar.L1);
                if (uiVar.A1 && !uiVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (uiVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer p14 = PhotoViewer.p1();
                    if (uiVar.P2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p14.Q = z10;
                }
                if (uiVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, uiVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p15 = PhotoViewer.p1();
                    Editable text = uiVar.b1().getText();
                    p15.f43344p7 = true;
                    p15.f43353q7 = text;
                    p15.y2(null, text, false, false);
                    p15.r3(null);
                    return;
                }
                return;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.e0 e0Var = (p4.e0) obj2;
                final p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj4).f55256b;
                if (!c0Var.C(vVar, i15)) {
                    p4.e1.r1(e0Var, vVar, i14, new p4.o1(-4));
                    return;
                }
                w7.s sVar = e0Var.f55235e;
                e0Var.s(vVar);
                sVar.getClass();
                if (i15 == 27) {
                    c1Var.k(e0Var, vVar, i14);
                    c0Var.c(vVar, i15, new Object());
                    return;
                }
                c0Var.c(vVar, i15, new p4.g() {
                    @Override
                    public final m9.y run() {
                        return (m9.y) c1.this.k(e0Var, vVar, i14);
                    }
                });
                return;
        }
    }

    public t3(ji.l lVar, oi.f1 f1Var, int i7, j9 j9Var, oi.h0 h0Var, int i10) {
        this.d = lVar;
        this.f4117e = f1Var;
        this.f4115b = i7;
        this.f4118f = j9Var;
        this.h = h0Var;
        this.f4116c = i10;
    }

    public t3(pb pbVar, File file, String str, int i7, Object obj, int i10) {
        this.d = pbVar;
        this.f4117e = file;
        this.f4118f = str;
        this.f4115b = i7;
        this.h = obj;
        this.f4116c = i10;
    }

    public t3(rj rjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = rjVar;
        this.f4117e = str;
        this.f4118f = arrayList;
        this.h = arrayList2;
        this.f4115b = i7;
        this.f4116c = i10;
    }

    public t3(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, int i10, bn bnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f4115b = i7;
        this.f4117e = g2Var;
        this.f4118f = arrayList;
        this.f4116c = i10;
        this.h = bnVar;
    }

    public t3(p4.e1 e1Var, p4.v vVar, int i7, p4.e0 e0Var, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.f4117e = vVar;
        this.f4115b = i7;
        this.f4118f = e0Var;
        this.f4116c = i10;
        this.h = c1Var;
    }
}
