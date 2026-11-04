package mi;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.e8;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jb;
import org.telegram.messenger.l10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vf;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ll;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wm;
public final class g0 implements Runnable {
    public final int f19617a = 0;
    public final int f19618b;
    public final int f19619c;
    public final Object d;
    public final Object f19620e;
    public final Object f19621f;
    public final Object h;

    public g0(h0 h0Var, h1 h1Var, int i3, h9 h9Var, j0 j0Var, int i10) {
        this.d = h0Var;
        this.f19620e = h1Var;
        this.f19618b = i3;
        this.f19621f = h9Var;
        this.h = j0Var;
        this.f19619c = i10;
    }

    @Override
    public final void run() {
        e8 E;
        zi ziVar;
        int i3;
        int i10;
        ArrayList arrayList;
        int i11;
        String[] strArr;
        String str;
        String str2;
        String str3;
        char c2;
        String n4;
        int i12;
        wm wmVar;
        boolean z10;
        int i13 = this.f19617a;
        final int i14 = this.f19619c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f19621f;
        Object obj3 = this.f19620e;
        int i15 = this.f19618b;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                h1 h1Var = (h1) obj3;
                h9 h9Var = (h9) obj2;
                j0 j0Var = (j0) obj;
                k0 k0Var = (k0) ((h0) obj4).f19645c;
                if (h1Var.length() >= i15 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && h9Var.j0(j0Var.e1(), 0, i14, i15)) {
                    k0Var.d = true;
                    h1Var.setSelection(i15);
                    k0Var.d = false;
                    return;
                }
                return;
            case 1:
                final o4.v vVar = (o4.v) obj3;
                final o4.e0 e0Var = (o4.e0) obj2;
                final o4.f1 f1Var = (o4.f1) obj;
                ui.f fVar = ((o4.h1) obj4).f20661b;
                if (!fVar.w(vVar, i15)) {
                    o4.h1.R0(e0Var, vVar, i14, new o4.r1(-4));
                    return;
                }
                kb.a aVar = e0Var.f20622e;
                e0Var.s(vVar);
                aVar.getClass();
                if (i15 == 27) {
                    f1Var.i(e0Var, vVar, i14);
                    fVar.b(vVar, i15, new Object());
                    return;
                }
                fVar.b(vVar, i15, new o4.g() {
                    @Override
                    public final l9.y run() {
                        return (l9.y) f1.this.i(e0Var, vVar, i14);
                    }
                });
                return;
            case 2:
                jb jbVar = (jb) obj4;
                File file = (File) obj3;
                String str4 = (String) obj2;
                jbVar.getClass();
                if (file != null && ((str4.endsWith(".mp4") || str4.endsWith(".jpg")) && (E = w7.E(obj)) != null)) {
                    if (obj instanceof zi) {
                        ziVar = (zi) obj;
                    } else {
                        ziVar = null;
                    }
                    long j10 = E.f22324a;
                    if (j10 >= 0) {
                        i3 = 1;
                    } else if (org.telegram.messenger.t3.V(hp.s1(i15).M0(Long.valueOf(-j10)))) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    if (org.telegram.messenger.b6.k(i3, E, ziVar, i15)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                hs.f(i15).k(142, str4, file);
                zb zbVar = jbVar.f23659b;
                zbVar.f26773s.c(new vf(zbVar, str4, this.f19619c, file, 5));
                return;
            case 3:
                aj ajVar = (aj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ajVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ajVar.h = -1;
                    org.telegram.messenger.g0.h3(new bi.q0(ajVar, ajVar.h, new ArrayList(), new ArrayList(), 20));
                    return;
                }
                String S0 = bd.E0().S0(lowerCase, true, false);
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
                aj ajVar2 = ajVar;
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) arrayList2.get(i17);
                    aj ajVar3 = ajVar2;
                    String lowerCase2 = org.telegram.messenger.g5.m(r62, d5Var.f22153i, d5Var.f22154j).toLowerCase();
                    ArrayList arrayList5 = arrayList2;
                    String S02 = bd.E0().S0(lowerCase2, true, r62);
                    TLRPC.User user = d5Var.f22157m;
                    if (user != null) {
                        strArr = strArr2;
                        String lowerCase3 = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                        str2 = bd.E0().S0(lowerCase2, true, r62);
                        str = lowerCase3;
                    } else {
                        strArr = strArr2;
                        str = null;
                        str2 = null;
                    }
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    char c10 = r62;
                    int i18 = r62;
                    while (i18 < i16) {
                        int i19 = i18;
                        String str5 = strArr[i19];
                        if ((str == null || (!str.startsWith(str5) && !k2.p1.z(" ", str5, str))) && (str2 == null || (!str2.startsWith(str5) && !k2.p1.z(" ", str5, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = d5Var.f22157m;
                            if (user2 != null && (n4 = l10.n(user2)) != null && n4.startsWith(str5)) {
                                c2 = 2;
                            } else if (!lowerCase2.startsWith(str5) && !k2.p1.z(" ", str5, lowerCase2) && (S02 == null || (!S02.startsWith(str5) && !k2.p1.z(" ", str5, S02)))) {
                                c2 = c10;
                            } else {
                                c2 = 3;
                            }
                        } else {
                            str3 = str;
                            c2 = 1;
                        }
                        String str6 = lowerCase2;
                        if (c2 != 0 && (!d5Var.f22150e.isEmpty() || !d5Var.f22152g.isEmpty())) {
                            if (c2 == 3) {
                                arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f22153i, d5Var.f22154j, str5));
                            } else if (c2 == 1) {
                                TLRPC.User user3 = d5Var.f22157m;
                                arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str5));
                            } else {
                                arrayList4.add(org.telegram.messenger.g0.r0("@" + l10.n(d5Var.f22157m), null, "@" + str5));
                            }
                            TLRPC.User user4 = d5Var.f22157m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f27150id, 1);
                            }
                            arrayList3.add(d5Var);
                            i17++;
                            ajVar2 = ajVar3;
                            arrayList2 = arrayList5;
                            strArr2 = strArr;
                            r62 = 0;
                        } else {
                            lowerCase2 = str6;
                            c10 = c2;
                            str = str3;
                            i18 = i19 + 1;
                        }
                    }
                    i17++;
                    ajVar2 = ajVar3;
                    arrayList2 = arrayList5;
                    strArr2 = strArr;
                    r62 = 0;
                }
                aj ajVar4 = ajVar2;
                String[] strArr3 = strArr2;
                int i20 = 0;
                for (ArrayList arrayList6 = (ArrayList) obj; i20 < arrayList6.size(); arrayList6 = arrayList) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList6.get(i20);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                        i11 = i20;
                        arrayList = arrayList6;
                    } else {
                        arrayList = arrayList6;
                        TLRPC.User a22 = hp.s1(i15).a2(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                        String S03 = bd.E0().S0(lowerCase4, true, false);
                        if (lowerCase4.equals(S03)) {
                            S03 = null;
                        }
                        char c11 = 0;
                        int i21 = 0;
                        while (i21 < i16) {
                            String str7 = strArr3[i21];
                            if (lowerCase4.startsWith(str7) || k2.p1.z(" ", str7, lowerCase4) || (S03 != null && (S03.startsWith(str7) || k2.p1.z(" ", str7, S03)))) {
                                i11 = i20;
                                c11 = 1;
                            } else {
                                i11 = i20;
                                String n10 = l10.n(a22);
                                if (n10 != null && n10.startsWith(str7)) {
                                    c11 = 2;
                                }
                            }
                            if (c11 != 0 && a22.phone != null) {
                                if (c11 == 1) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str7));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + l10.n(a22), null, "@" + str7));
                                }
                                arrayList3.add(a22);
                                i20 = i11 + 1;
                            } else {
                                i21++;
                                i20 = i11;
                            }
                        }
                        i11 = i20;
                    }
                    i20 = i11 + 1;
                }
                org.telegram.messenger.g0.h3(new bi.q0(ajVar4, this.f19619c, arrayList3, arrayList4, 20));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                wm wmVar2 = (wm) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
                bi biVar = chatAttachAlertPhotoLayout.f38416b;
                if (biVar.f32290x1 && !biVar.f32294y1) {
                    PhotoViewer.v1().N2(null, d2Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.h = 0;
                    v12.f41486n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (biVar.f32298z1) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer v13 = PhotoViewer.v1();
                ll llVar = chatAttachAlertPhotoLayout.f31280i1;
                if (biVar.f32298z1) {
                    wmVar = null;
                } else {
                    wmVar = wmVar2;
                }
                v13.j2(arrayList7, this.f19619c, i22, false, llVar, wmVar);
                PhotoViewer.v1().A2(biVar.I1);
                if (biVar.f32290x1 && !biVar.f32294y1) {
                    PhotoViewer.v1().P = false;
                } else if (biVar.L2 != 0) {
                    PhotoViewer.v1().P = true;
                    PhotoViewer v14 = PhotoViewer.v1();
                    if (biVar.M2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v14.Q = z10;
                }
                if (biVar.f32294y1) {
                    PhotoViewer.v1().Z0(null, null, false, biVar.B1);
                }
                if (ChatAttachAlertPhotoLayout.V()) {
                    PhotoViewer v15 = PhotoViewer.v1();
                    Editable text = biVar.a1().getText();
                    v15.f41520q7 = true;
                    v15.f41529r7 = text;
                    v15.D2(null, text, false, false);
                    v15.w3(null);
                    return;
                }
                return;
        }
    }

    public g0(o4.h1 h1Var, o4.v vVar, int i3, o4.e0 e0Var, int i10, o4.f1 f1Var) {
        this.d = h1Var;
        this.f19620e = vVar;
        this.f19618b = i3;
        this.f19621f = e0Var;
        this.f19619c = i10;
        this.h = f1Var;
    }

    public g0(jb jbVar, File file, String str, int i3, Object obj, int i10) {
        this.d = jbVar;
        this.f19620e = file;
        this.f19621f = str;
        this.f19618b = i3;
        this.h = obj;
        this.f19619c = i10;
    }

    public g0(aj ajVar, String str, ArrayList arrayList, ArrayList arrayList2, int i3, int i10) {
        this.d = ajVar;
        this.f19620e = str;
        this.f19621f = arrayList;
        this.h = arrayList2;
        this.f19618b = i3;
        this.f19619c = i10;
    }

    public g0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, int i10, wm wmVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f19618b = i3;
        this.f19620e = d2Var;
        this.f19621f = arrayList;
        this.f19619c = i10;
        this.h = wmVar;
    }
}
