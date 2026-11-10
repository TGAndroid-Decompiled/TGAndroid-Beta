package bi;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.ej;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.yw;
import org.telegram.ui.cn;
import org.telegram.ui.ge;
import org.telegram.ui.he;
import org.telegram.ui.hg;
import org.telegram.ui.jq0;
import org.telegram.ui.tw;
import org.telegram.ui.zw;
public final class z2 implements c20 {
    public final int f5144a;
    public final Object f5145b;
    public final Object f5146c;
    public final Object d;
    public final Object f5147e;
    public final Object f5148f;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f5144a = i7;
        this.f5145b = obj;
        this.f5146c = obj2;
        this.d = obj3;
        this.f5147e = obj4;
        this.f5148f = obj5;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        final TLRPC.UserFull userFull;
        ?? r10;
        int i7 = this.f5144a;
        String str = "";
        Object obj2 = this.f5147e;
        Object obj3 = this.f5148f;
        Object obj4 = this.d;
        Object obj5 = this.f5146c;
        Object obj6 = this.f5145b;
        int i10 = 0;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.ic[] icVarArr = (org.telegram.ui.Components.ic[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new w1(k7Var.getContext(), k7Var.I0, k7Var.f28669a, starGift.title, arrayList, false).show();
                    z9 = false;
                } else {
                    z9 = false;
                    k7Var.p2(icVarArr[0], org.telegram.messenger.id.a0(null, null, 2131750046, hi.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z9 ? 1 : 0] = z9;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a3((org.telegram.ui.mb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 11));
                return;
            case 2:
                final cn cnVar = (cn) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = cnVar.getMessagesController().b2(user.f27109id);
                } else {
                    userFull = null;
                }
                k60 I = k60.I(cnVar, q1Var);
                jk0 jk0Var = new jk0(cnVar.getParentActivity(), cnVar.f44750za);
                I.f35214p = new ge(jk0Var, 1);
                org.telegram.ui.y yVar = new org.telegram.ui.y(cnVar, user, str2, 3);
                k60 J = I.J();
                J.c(2131231240, org.telegram.messenger.id.M0(2131753756, null), new jq0(I, 27), false);
                J.k();
                J.c(2131232044, org.telegram.messenger.id.M0(2131751717, null), new org.telegram.ui.o1(cnVar, I, str2), false);
                J.c(2131231780, org.telegram.messenger.id.M0(2131754375, null), new jq0(yVar, 28), false);
                if (tL_contact == null && (user == null || !cnVar.getContactsController().f22614f0.containsKey(Long.valueOf(user.f27109id)))) {
                    I.c(2131232099, org.telegram.messenger.id.M0(2131754377, null), new hi.h2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(2131231836, org.telegram.messenger.id.M0(2131749107, null), new he(cnVar, str2, 10), false);
                    I.c(2131232085, org.telegram.messenger.id.M0(2131743522, null), new he(cnVar, str2, 11), false);
                    I.c(2131232103, org.telegram.messenger.id.M0(2131751760, null), new he(cnVar, str2, 12), false);
                    I.k();
                    I.p(13, -1, org.telegram.messenger.id.M0(2131747833, null));
                } else {
                    I.c(2131232113, org.telegram.messenger.id.M0(2131745601, null), new hg(cnVar, user, 0), false);
                    if (!t10.B(user)) {
                        I.c(2131232083, org.telegram.messenger.id.M0(2131743521, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        cn cnVar2 = cnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            cnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z12, cnVar2.getParentActivity(), userFull2, cnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z122, cnVar2.getParentActivity(), userFull2, cnVar2.getAccountInstance());
                                        return;
                                    default:
                                        cn cnVar3 = cnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            cnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z13, cnVar3.getParentActivity(), userFull3, cnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z132, cnVar3.getParentActivity(), userFull3, cnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(2131232419, org.telegram.messenger.id.M0(2131743608, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        cn cnVar2 = cnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            cnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z122, cnVar2.getParentActivity(), userFull2, cnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z1222, cnVar2.getParentActivity(), userFull2, cnVar2.getAccountInstance());
                                        return;
                                    default:
                                        cn cnVar3 = cnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            cnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z132, cnVar3.getParentActivity(), userFull3, cnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z1322, cnVar3.getParentActivity(), userFull3, cnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(2131232085, org.telegram.messenger.id.M0(2131743522, null), new he(cnVar, str2, 8), false);
                    I.c(2131232103, org.telegram.messenger.id.M0(2131751760, null), new he(cnVar, str2, 9), false);
                    I.k();
                    I.n(user, org.telegram.messenger.id.M0(2131743546, null), new org.telegram.ui.o1(cnVar, jk0Var, user, 18));
                }
                jk0Var.e(I);
                if (characterStyle instanceof d41) {
                    String url = ((d41) characterStyle).getURL();
                    if (url != null) {
                        str = url;
                    }
                    String trim = str.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r10 = 0;
                        sb2.append(trim.substring(0, 204));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r10 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r10, spannableString.length(), 33);
                    jk0Var.f(q1Var, characterStyle, spannableString, r10);
                } else {
                    jk0Var.f(q1Var, characterStyle, null, false);
                }
                cnVar.showDialog(jk0Var);
                return;
            case 3:
                cn cnVar2 = (cn) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str3 = (String) obj4;
                ej ejVar = (ej) obj3;
                Long l10 = (Long) obj;
                int i11 = cnVar2.f44492f4;
                Object obj7 = this.f5147e;
                if (i11 == 1) {
                    org.telegram.ui.Components.u4.J(cnVar2.getParentActivity(), cnVar2.f44545j6, new a1.d(cnVar2, tL_document, str3, obj7, 7), cnVar2.f44750za);
                } else {
                    cnVar2.getSendMessagesHelper().v0(tL_document, str3, cnVar2.f44545j6, cnVar2.D5, cnVar2.f44568l4, null, cnVar2.B5, ejVar, true, 0, 0, false, obj7, cnVar2.X8(), l10.longValue(), cnVar2.i9(), cnVar2.f44708w5);
                    tL_document = tL_document;
                }
                cnVar2.C9(false);
                cnVar2.Z.l(tL_document);
                cnVar2.Z.setFieldText("");
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                gx gxVar = ((fx) obj6).f33663a;
                String str4 = gxVar.f34001w;
                ArrayList arrayList5 = gxVar.f33999r;
                ArrayList arrayList6 = gxVar.h;
                ArrayList arrayList7 = gxVar.f34000s;
                gy gyVar = gxVar.F;
                if (((String) obj5).equals(str4)) {
                    hv hvVar = gyVar.V;
                    sw swVar = gyVar.P;
                    hvVar.e(false);
                    gxVar.D = true;
                    v4.g0 adapter = swVar.getAdapter();
                    gx gxVar2 = gyVar.S;
                    if (adapter != gxVar2) {
                        swVar.setAdapter(gxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(gxVar.f33998n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        yw ywVar = (yw) obj8;
                        if (longSparseIntArray.indexOfKey(ywVar.f40766c.f26987id) < 0) {
                            longSparseIntArray.append(ywVar.f40766c.f26987id, 1);
                            arrayList7.add(ywVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        Object obj9 = arrayList4.get(i10);
                        i10++;
                        yw ywVar2 = (yw) obj9;
                        if (longSparseIntArray.indexOfKey(ywVar2.f40766c.f26987id) < 0) {
                            longSparseIntArray.append(ywVar2.f40766c.f26987id, 1);
                            arrayList7.add(ywVar2);
                        }
                    }
                    gxVar.f();
                    return;
                }
                return;
            case 5:
                zw zwVar = (zw) obj6;
                Long l11 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                zwVar.getMessagesController().T2(l11, null, 32);
                tw twVar = zwVar.D2;
                zwVar.removeSelfFromStack();
                ((org.telegram.ui.bd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.f2) obj3).finishFragment();
                if (twVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(xr.a(-l11.longValue(), 0L));
                    twVar.y(zwVar, arrayList8, null, false, zwVar.K2, zwVar.L2, zwVar.M2, null);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.Wallet.h7 h7Var = (org.telegram.ui.Wallet.h7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.s2) obj6).d = false;
                ((fi.d) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.gc.c0(str5, x2Var.E, h6Var);
                }
                h7Var.run();
                return;
        }
    }
}
