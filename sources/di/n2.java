package di;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.sr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fe;
import org.telegram.ui.ge;
import org.telegram.ui.gg;
import org.telegram.ui.hq0;
import org.telegram.ui.vw;
public final class n2 implements w10 {
    public final int f9347a;
    public final Object f9348b;
    public final Object f9349c;
    public final Object d;
    public final Object f9350e;
    public final Object f9351f;

    public n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f9347a = i7;
        this.f9348b = obj;
        this.f9349c = obj2;
        this.d = obj3;
        this.f9350e = obj4;
        this.f9351f = obj5;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        final TLRPC.UserFull userFull;
        ?? r15;
        int i7 = this.f9347a;
        String str = "";
        Object obj2 = this.f9350e;
        Object obj3 = this.f9351f;
        Object obj4 = this.d;
        Object obj5 = this.f9349c;
        Object obj6 = this.f9348b;
        int i10 = 0;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.mc[] mcVarArr = (org.telegram.ui.Components.mc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new h1(f6Var.getContext(), f6Var.J0, f6Var.f30223a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    f6Var.C2(mcVarArr[0], gd.a0(null, null, 2131750029, ki.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.n2((org.telegram.ui.lb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 12));
                return;
            case 2:
                final bn bnVar = (bn) obj6;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = bnVar.getMessagesController().d2(user.f28641id);
                } else {
                    userFull = null;
                }
                x60 J = x60.J(bnVar, r1Var);
                yk0 yk0Var = new yk0(bnVar.getParentActivity(), bnVar.Ba);
                J.f41886p = new fe(yk0Var, 1);
                org.telegram.ui.x xVar = new org.telegram.ui.x(bnVar, user, str2, 3);
                x60 K = J.K();
                K.c(2131231243, gd.N0(2131753753, null), new hq0(J, 27), false);
                K.k();
                K.c(2131232049, gd.N0(2131751705, null), new org.telegram.ui.o1(bnVar, J, str2), false);
                K.c(2131231784, gd.N0(2131754372, null), new hq0(xVar, 28), false);
                if (tL_contact == null && (user == null || !bnVar.getContactsController().f24694g0.containsKey(Long.valueOf(user.f28641id)))) {
                    J.c(2131232104, gd.N0(2131754374, null), new bi.a6(J, K, 5), false);
                    J.k();
                }
                if (user == null) {
                    J.c(2131231840, gd.N0(2131748914, null), new ge(bnVar, str2, 10), false);
                    J.c(2131232090, gd.N0(2131743272, null), new ge(bnVar, str2, 11), false);
                    J.c(2131232108, gd.N0(2131751748, null), new ge(bnVar, str2, 12), false);
                    J.k();
                    J.p(13, -1, gd.N0(2131747639, null));
                } else {
                    J.c(2131232118, gd.N0(2131745405, null), new gg(bnVar, user, 0), false);
                    if (!n10.C(user)) {
                        J.c(2131232088, gd.N0(2131743271, null), new Runnable() {
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
                                                org.telegram.ui.Components.voip.c2.m(user, false, z13, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z132, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                        return;
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            bnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z14, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z142, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        J.c(2131232424, gd.N0(2131743361, null), new Runnable() {
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
                                                org.telegram.ui.Components.voip.c2.m(user, false, z132, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z1322, bnVar2.getParentActivity(), userFull2, bnVar2.getAccountInstance());
                                        return;
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            bnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z142, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z1422, bnVar3.getParentActivity(), userFull3, bnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    J.c(2131232090, gd.N0(2131743272, null), new ge(bnVar, str2, 8), false);
                    J.c(2131232108, gd.N0(2131751748, null), new ge(bnVar, str2, 9), false);
                    J.k();
                    J.n(user, gd.N0(2131743296, null), new org.telegram.ui.o1(bnVar, yk0Var, user, 18));
                }
                yk0Var.e(J);
                if (characterStyle instanceof t41) {
                    String url = ((t41) characterStyle).getURL();
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
                int i11 = bnVar2.f46204g4;
                Object obj7 = this.f9350e;
                if (i11 == 1) {
                    org.telegram.ui.Components.b5.J(bnVar2.getParentActivity(), bnVar2.f46271l6, new a1.d(bnVar2, tL_document, str3, obj7, 7), bnVar2.Ba);
                } else {
                    bnVar2.getSendMessagesHelper().v0(tL_document, str3, bnVar2.f46271l6, bnVar2.F5, bnVar2.f46282m4, null, bnVar2.D5, bjVar, true, 0, 0, false, obj7, bnVar2.Y8(), l10.longValue(), bnVar2.j9(), bnVar2.f46436y5);
                    tL_document = tL_document;
                }
                bnVar2.D9(false);
                bnVar2.f46118a0.n(tL_document);
                bnVar2.f46118a0.setFieldText("");
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                px pxVar = ((ox) obj6).f38273a;
                String str4 = pxVar.f38607w;
                ArrayList arrayList5 = pxVar.f38605r;
                ArrayList arrayList6 = pxVar.h;
                ArrayList arrayList7 = pxVar.f38606s;
                qy qyVar = pxVar.G;
                if (((String) obj5).equals(str4)) {
                    sv svVar = qyVar.W;
                    dx dxVar = qyVar.Q;
                    svVar.e(false);
                    pxVar.E = true;
                    v4.i0 adapter = dxVar.getAdapter();
                    px pxVar2 = qyVar.T;
                    if (adapter != pxVar2) {
                        dxVar.setAdapter(pxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(pxVar.f38604n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        jx jxVar = (jx) obj8;
                        if (longSparseIntArray.indexOfKey(jxVar.f36558c.f28519id) < 0) {
                            longSparseIntArray.append(jxVar.f36558c.f28519id, 1);
                            arrayList7.add(jxVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        Object obj9 = arrayList4.get(i10);
                        i10++;
                        jx jxVar2 = (jx) obj9;
                        if (longSparseIntArray.indexOfKey(jxVar2.f36558c.f28519id) < 0) {
                            longSparseIntArray.append(jxVar2.f36558c.f28519id, 1);
                            arrayList7.add(jxVar2);
                        }
                    }
                    pxVar.f();
                    return;
                }
                return;
            case 5:
                bx bxVar = (bx) obj6;
                Long l11 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                bxVar.getMessagesController().Z2(l11, null, 32);
                vw vwVar = bxVar.E2;
                bxVar.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.g2) obj3).finishFragment();
                if (vwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(sr.a(-l11.longValue(), 0L));
                    vwVar.z(bxVar, arrayList8, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.z2) obj6).d = false;
                ((hi.e) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.kc.d0(str5, e3Var.F, i6Var);
                }
                w7Var.run();
                return;
        }
    }
}
