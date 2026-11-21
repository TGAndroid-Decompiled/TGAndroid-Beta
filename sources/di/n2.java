package di;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.messenger.sr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.fe;
import org.telegram.ui.ge;
import org.telegram.ui.gg;
import org.telegram.ui.hq0;
import org.telegram.ui.ww;
public final class n2 implements x10 {
    public final int f9383a;
    public final Object f9384b;
    public final Object f9385c;
    public final Object d;
    public final Object f9386e;
    public final Object f9387f;

    public n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f9383a = i7;
        this.f9384b = obj;
        this.f9385c = obj2;
        this.d = obj3;
        this.f9386e = obj4;
        this.f9387f = obj5;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        final TLRPC.UserFull userFull;
        ?? r15;
        int i7 = this.f9383a;
        String str = "";
        Object obj2 = this.f9386e;
        Object obj3 = this.f9387f;
        Object obj4 = this.d;
        Object obj5 = this.f9385c;
        Object obj6 = this.f9384b;
        int i10 = 0;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.nc[] ncVarArr = (org.telegram.ui.Components.nc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new h1(f6Var.getContext(), f6Var.J0, f6Var.f30170a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    f6Var.C2(ncVarArr[0], gd.a0(null, null, 2131750029, ki.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.l2((org.telegram.ui.lb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 12));
                return;
            case 2:
                final bn bnVar = (bn) obj6;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = bnVar.getMessagesController().d2(user.f28580id);
                } else {
                    userFull = null;
                }
                a70 J = a70.J(bnVar, r1Var);
                yk0 yk0Var = new yk0(bnVar.getParentActivity(), bnVar.Ba);
                J.f33378p = new fe(yk0Var, 1);
                org.telegram.ui.x xVar = new org.telegram.ui.x(bnVar, user, str2, 3);
                a70 K = J.K();
                K.c(2131231240, gd.N0(2131753753, null), new hq0(J, 27), false);
                K.k();
                K.c(2131232046, gd.N0(2131751705, null), new org.telegram.ui.o1(bnVar, J, str2), false);
                K.c(2131231781, gd.N0(2131754372, null), new hq0(xVar, 28), false);
                if (tL_contact == null && (user == null || !bnVar.getContactsController().f24596g0.containsKey(Long.valueOf(user.f28580id)))) {
                    J.c(2131232101, gd.N0(2131754374, null), new bi.y5(J, K, 5), false);
                    J.k();
                }
                if (user == null) {
                    J.c(2131231837, gd.N0(2131748914, null), new ge(bnVar, str2, 10), false);
                    J.c(2131232087, gd.N0(2131743279, null), new ge(bnVar, str2, 11), false);
                    J.c(2131232105, gd.N0(2131751748, null), new ge(bnVar, str2, 12), false);
                    J.k();
                    J.p(13, -1, gd.N0(2131747639, null));
                } else {
                    J.c(2131232115, gd.N0(2131745405, null), new gg(bnVar, user, 0), false);
                    if (!o10.C(user)) {
                        J.c(2131232085, gd.N0(2131743278, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (r4) {
                                    case 0:
                                        bn bnVar2 = bnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            bnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.b2.m(user, false, z13, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.b2.m(user, false, z132, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                        return;
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            bnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.b2.m(user, true, z14, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.b2.m(user, true, z142, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        J.c(2131232421, gd.N0(2131743365, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (r4) {
                                    case 0:
                                        bn bnVar2 = bnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            bnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.b2.m(user, false, z132, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.b2.m(user, false, z1322, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                        return;
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            bnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.b2.m(user, true, z142, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.b2.m(user, true, z1422, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    J.c(2131232087, gd.N0(2131743279, null), new ge(bnVar, str2, 8), false);
                    J.c(2131232105, gd.N0(2131751748, null), new ge(bnVar, str2, 9), false);
                    J.k();
                    J.n(user, gd.N0(2131743303, null), new org.telegram.ui.o1(bnVar, yk0Var, user, 18));
                }
                yk0Var.e(J);
                if (characterStyle instanceof u41) {
                    String url = ((u41) characterStyle).getURL();
                    if (url != null) {
                        str = url;
                    }
                    String trim = str.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r15 = 0;
                        sb2.append(trim.substring(0, 204));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r15 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r15, spannableString.length(), 33);
                    yk0Var.f(r1Var, characterStyle, spannableString, r15);
                } else {
                    yk0Var.f(r1Var, characterStyle, null, false);
                }
                bnVar.showDialog(yk0Var);
                return;
            case 3:
                bn bnVar2 = (bn) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str3 = (String) obj4;
                bj bjVar = (bj) obj3;
                Long l10 = (Long) obj;
                int i11 = bnVar2.f46032g4;
                Object obj7 = this.f9386e;
                if (i11 == 1) {
                    org.telegram.ui.Components.c5.J(bnVar2.getParentActivity(), bnVar2.f46099l6, new a1.d(bnVar2, tL_document, str3, obj7, 7), bnVar2.Ba);
                } else {
                    bnVar2.getSendMessagesHelper().v0(tL_document, str3, bnVar2.f46099l6, bnVar2.F5, bnVar2.f46110m4, null, bnVar2.D5, bjVar, true, 0, 0, false, obj7, bnVar2.Y8(), l10.longValue(), bnVar2.j9(), bnVar2.f46264y5);
                    tL_document = tL_document;
                }
                bnVar2.D9(false);
                bnVar2.f45946a0.n(tL_document);
                bnVar2.f45946a0.setFieldText("");
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                sx sxVar = ((rx) obj6).f39358a;
                String str4 = sxVar.f39723w;
                ArrayList arrayList5 = sxVar.f39721r;
                ArrayList arrayList6 = sxVar.h;
                ArrayList arrayList7 = sxVar.f39722s;
                ty tyVar = sxVar.G;
                if (((String) obj5).equals(str4)) {
                    vv vvVar = tyVar.W;
                    gx gxVar = tyVar.Q;
                    vvVar.e(false);
                    sxVar.E = true;
                    v4.i0 adapter = gxVar.getAdapter();
                    sx sxVar2 = tyVar.T;
                    if (adapter != sxVar2) {
                        gxVar.setAdapter(sxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(sxVar.f39720n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        mx mxVar = (mx) obj8;
                        if (longSparseIntArray.indexOfKey(mxVar.f37659c.f28458id) < 0) {
                            longSparseIntArray.append(mxVar.f37659c.f28458id, 1);
                            arrayList7.add(mxVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        Object obj9 = arrayList4.get(i10);
                        i10++;
                        mx mxVar2 = (mx) obj9;
                        if (longSparseIntArray.indexOfKey(mxVar2.f37659c.f28458id) < 0) {
                            longSparseIntArray.append(mxVar2.f37659c.f28458id, 1);
                            arrayList7.add(mxVar2);
                        }
                    }
                    sxVar.f();
                    return;
                }
                return;
            case 5:
                cx cxVar = (cx) obj6;
                Long l11 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                cxVar.getMessagesController().Z2(l11, null, 32);
                ww wwVar = cxVar.E2;
                cxVar.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.g2) obj3).finishFragment();
                if (wwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(sr.a(-l11.longValue(), 0L));
                    wwVar.y(cxVar, arrayList8, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.Wallet.v7 v7Var = (org.telegram.ui.Wallet.v7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.y2) obj6).d = false;
                ((hi.e) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.lc.d0(str5, d3Var.F, h6Var);
                }
                v7Var.run();
                return;
        }
    }
}
