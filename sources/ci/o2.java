package ci;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.messenger.pr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xw;
import org.telegram.ui.ad;
import org.telegram.ui.ee;
import org.telegram.ui.fe;
import org.telegram.ui.nw;
import org.telegram.ui.uf;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.xp0;
public final class o2 implements u10 {
    public final int f5672a;
    public final Object f5673b;
    public final Object f5674c;
    public final Object d;
    public final Object f5675e;
    public final Object f5676f;

    public o2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f5672a = i3;
        this.f5673b = obj;
        this.f5674c = obj2;
        this.d = obj3;
        this.f5675e = obj4;
        this.f5676f = obj5;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        final TLRPC.UserFull userFull;
        ?? r15;
        int i3 = this.f5672a;
        String str = "";
        Object obj2 = this.f5675e;
        Object obj3 = this.f5676f;
        Object obj4 = this.d;
        Object obj5 = this.f5674c;
        Object obj6 = this.f5673b;
        int i10 = 0;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.hc[] hcVarArr = (org.telegram.ui.Components.hc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new p1(l6Var.getContext(), l6Var.J0, l6Var.f28583a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    l6Var.p2(hcVarArr[0], bd.a0(null, null, 2131750054, ii.k.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.w1((org.telegram.ui.kb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ta) obj3, 12));
                return;
            case 2:
                final wm wmVar = (wm) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = wmVar.getMessagesController().b2(user.f27150id);
                } else {
                    userFull = null;
                }
                f60 I = f60.I(wmVar, q1Var);
                nk0 nk0Var = new nk0(wmVar.getParentActivity(), wmVar.f51557ya);
                I.f33742p = new ee(nk0Var, 1);
                org.telegram.ui.z zVar = new org.telegram.ui.z(wmVar, user, str2, 2);
                f60 J = I.J();
                J.c(2131231240, bd.M0(2131753756, null), new xp0(I, 27), false);
                J.k();
                J.c(2131232044, bd.M0(2131751718, null), new org.telegram.ui.p1(wmVar, I, str2), false);
                J.c(2131231780, bd.M0(2131754375, null), new xp0(zVar, 28), false);
                if (tL_contact == null && (user == null || !wmVar.getContactsController().f22654g0.containsKey(Long.valueOf(user.f27150id)))) {
                    I.c(2131232099, bd.M0(2131754377, null), new ai.y3(I, J, 5), false);
                    I.k();
                }
                if (user == null) {
                    I.c(2131231836, bd.M0(2131749115, null), new fe(wmVar, str2, 10), false);
                    I.c(2131232085, bd.M0(2131743532, null), new fe(wmVar, str2, 11), false);
                    I.c(2131232103, bd.M0(2131751760, null), new fe(wmVar, str2, 12), false);
                    I.k();
                    I.p(13, -1, bd.M0(2131747841, null));
                } else {
                    I.c(2131232113, bd.M0(2131745611, null), new uf(wmVar, user, 0), false);
                    if (!l10.B(user)) {
                        I.c(2131232083, bd.M0(2131743531, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (r4) {
                                    case 0:
                                        wm wmVar2 = wmVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wmVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.n1.m(user, false, z13, wmVar2.getParentActivity(), userFull2, wmVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.n1.m(user, false, z132, wmVar2.getParentActivity(), userFull2, wmVar2.getAccountInstance());
                                        return;
                                    default:
                                        wm wmVar3 = wmVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wmVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.n1.m(user, true, z14, wmVar3.getParentActivity(), userFull3, wmVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.n1.m(user, true, z142, wmVar3.getParentActivity(), userFull3, wmVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(2131232419, bd.M0(2131743618, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (r4) {
                                    case 0:
                                        wm wmVar2 = wmVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wmVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.n1.m(user, false, z132, wmVar2.getParentActivity(), userFull2, wmVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.n1.m(user, false, z1322, wmVar2.getParentActivity(), userFull2, wmVar2.getAccountInstance());
                                        return;
                                    default:
                                        wm wmVar3 = wmVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wmVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.n1.m(user, true, z142, wmVar3.getParentActivity(), userFull3, wmVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.n1.m(user, true, z1422, wmVar3.getParentActivity(), userFull3, wmVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(2131232085, bd.M0(2131743532, null), new fe(wmVar, str2, 8), false);
                    I.c(2131232103, bd.M0(2131751760, null), new fe(wmVar, str2, 9), false);
                    I.k();
                    I.n(user, bd.M0(2131743556, null), new org.telegram.ui.p1(wmVar, nk0Var, user, 17));
                }
                nk0Var.e(I);
                if (characterStyle instanceof x31) {
                    String url = ((x31) characterStyle).getURL();
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
                    nk0Var.f(q1Var, characterStyle, spannableString, r15);
                } else {
                    nk0Var.f(q1Var, characterStyle, null, false);
                }
                wmVar.showDialog(nk0Var);
                return;
            case 3:
                wm wmVar2 = (wm) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str3 = (String) obj4;
                vi viVar = (vi) obj3;
                Long l10 = (Long) obj;
                int i11 = wmVar2.f51325g4;
                Object obj7 = this.f5675e;
                if (i11 == 1) {
                    org.telegram.ui.Components.t4.L(wmVar2.getParentActivity(), wmVar2.f51376k6, new a1.d(wmVar2, tL_document, str3, obj7, 6), wmVar2.f51557ya);
                } else {
                    wmVar2.getSendMessagesHelper().v0(tL_document, str3, wmVar2.f51376k6, wmVar2.E5, wmVar2.f51397m4, null, wmVar2.C5, viVar, true, 0, 0, false, obj7, wmVar2.W8(), l10.longValue(), wmVar2.h9(), wmVar2.f51540x5);
                    tL_document = tL_document;
                }
                wmVar2.B9(false);
                wmVar2.f51237a0.l(tL_document);
                wmVar2.f51237a0.setFieldText("");
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                ex exVar = ((dx) obj6).f33204a;
                String str4 = exVar.f33497w;
                ArrayList arrayList5 = exVar.f33495r;
                ArrayList arrayList6 = exVar.h;
                ArrayList arrayList7 = exVar.f33496s;
                ey eyVar = exVar.G;
                if (((String) obj5).equals(str4)) {
                    gv gvVar = eyVar.W;
                    rw rwVar = eyVar.Q;
                    gvVar.e(false);
                    exVar.E = true;
                    u4.h0 adapter = rwVar.getAdapter();
                    ex exVar2 = eyVar.T;
                    if (adapter != exVar2) {
                        rwVar.setAdapter(exVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(exVar.f33494n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        xw xwVar = (xw) obj8;
                        if (longSparseIntArray.indexOfKey(xwVar.f40536c.f27028id) < 0) {
                            longSparseIntArray.append(xwVar.f40536c.f27028id, 1);
                            arrayList7.add(xwVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        Object obj9 = arrayList4.get(i10);
                        i10++;
                        xw xwVar2 = (xw) obj9;
                        if (longSparseIntArray.indexOfKey(xwVar2.f40536c.f27028id) < 0) {
                            longSparseIntArray.append(xwVar2.f40536c.f27028id, 1);
                            arrayList7.add(xwVar2);
                        }
                    }
                    exVar.f();
                    return;
                }
                return;
            case 5:
                uw uwVar = (uw) obj6;
                Long l11 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.s1) obj5).dismiss();
                uwVar.getMessagesController().T2(l11, null, 32);
                nw nwVar = uwVar.D2;
                uwVar.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.d2) obj3).finishFragment();
                if (nwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(pr.a(-l11.longValue(), 0L));
                    nwVar.y(uwVar, arrayList8, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.s2) obj6).d = false;
                ((gi.d) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.fc.c0(str5, x2Var.F, e6Var);
                }
                e7Var.run();
                return;
        }
    }
}
