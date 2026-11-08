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
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.tw;
import org.telegram.ui.Components.zw;
import org.telegram.ui.an;
import org.telegram.ui.ge;
import org.telegram.ui.gq0;
import org.telegram.ui.he;
import org.telegram.ui.qw;
import org.telegram.ui.ww;
import org.telegram.ui.yf;
public final class z2 implements c20 {
    public final int f5141a;
    public final Object f5142b;
    public final Object f5143c;
    public final Object d;
    public final Object f5144e;
    public final Object f5145f;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f5141a = i7;
        this.f5142b = obj;
        this.f5143c = obj2;
        this.d = obj3;
        this.f5144e = obj4;
        this.f5145f = obj5;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        final TLRPC.UserFull userFull;
        ?? r10;
        int i7 = this.f5141a;
        String str = "";
        Object obj2 = this.f5144e;
        Object obj3 = this.f5145f;
        Object obj4 = this.d;
        Object obj5 = this.f5143c;
        Object obj6 = this.f5142b;
        int i10 = 0;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.jc[] jcVarArr = (org.telegram.ui.Components.jc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new w1(k7Var.getContext(), k7Var.I0, k7Var.f28616a, starGift.title, arrayList, false).show();
                    z9 = false;
                } else {
                    z9 = false;
                    k7Var.p2(jcVarArr[0], org.telegram.messenger.id.a0(null, null, 2131750047, hi.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z9 ? 1 : 0] = z9;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a3((org.telegram.ui.mb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 11));
                return;
            case 2:
                final an anVar = (an) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = anVar.getMessagesController().b2(user.f27105id);
                } else {
                    userFull = null;
                }
                k60 I = k60.I(anVar, q1Var);
                jk0 jk0Var = new jk0(anVar.getParentActivity(), anVar.f44028xa);
                I.f35226p = new ge(jk0Var, 1);
                org.telegram.ui.y yVar = new org.telegram.ui.y(anVar, user, str2, 2);
                k60 J = I.J();
                J.c(2131231240, org.telegram.messenger.id.M0(2131753756, null), new gq0(I, 27), false);
                J.k();
                J.c(2131232044, org.telegram.messenger.id.M0(2131751718, null), new org.telegram.ui.o1(anVar, I, str2), false);
                J.c(2131231780, org.telegram.messenger.id.M0(2131754375, null), new gq0(yVar, 28), false);
                if (tL_contact == null && (user == null || !anVar.getContactsController().f22610f0.containsKey(Long.valueOf(user.f27105id)))) {
                    I.c(2131232099, org.telegram.messenger.id.M0(2131754377, null), new hi.h2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(2131231836, org.telegram.messenger.id.M0(2131749108, null), new he(anVar, str2, 10), false);
                    I.c(2131232085, org.telegram.messenger.id.M0(2131743525, null), new he(anVar, str2, 11), false);
                    I.c(2131232103, org.telegram.messenger.id.M0(2131751760, null), new he(anVar, str2, 12), false);
                    I.k();
                    I.p(13, -1, org.telegram.messenger.id.M0(2131747834, null));
                } else {
                    I.c(2131232113, org.telegram.messenger.id.M0(2131745604, null), new yf(anVar, user, 0), false);
                    if (!t10.B(user)) {
                        I.c(2131232083, org.telegram.messenger.id.M0(2131743524, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            anVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z12, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z122, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                        return;
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            anVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z13, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z132, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(2131232419, org.telegram.messenger.id.M0(2131743611, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            anVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z122, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z1222, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                        return;
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            anVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z132, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z1322, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(2131232085, org.telegram.messenger.id.M0(2131743525, null), new he(anVar, str2, 8), false);
                    I.c(2131232103, org.telegram.messenger.id.M0(2131751760, null), new he(anVar, str2, 9), false);
                    I.k();
                    I.n(user, org.telegram.messenger.id.M0(2131743549, null), new org.telegram.ui.o1(anVar, jk0Var, user, 17));
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
                anVar.showDialog(jk0Var);
                return;
            case 3:
                an anVar2 = (an) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str3 = (String) obj4;
                ej ejVar = (ej) obj3;
                Long l10 = (Long) obj;
                int i11 = anVar2.f43796f4;
                Object obj7 = this.f5144e;
                if (i11 == 1) {
                    org.telegram.ui.Components.v4.J(anVar2.getParentActivity(), anVar2.f43848j6, new a1.d(anVar2, tL_document, str3, obj7, 7), anVar2.f44028xa);
                } else {
                    anVar2.getSendMessagesHelper().v0(tL_document, str3, anVar2.f43848j6, anVar2.D5, anVar2.f43870l4, null, anVar2.B5, ejVar, true, 0, 0, false, obj7, anVar2.W8(), l10.longValue(), anVar2.h9(), anVar2.f44010w5);
                    tL_document = tL_document;
                }
                anVar2.B9(false);
                anVar2.Z.l(tL_document);
                anVar2.Z.setFieldText("");
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                hx hxVar = ((gx) obj6).f34033a;
                String str4 = hxVar.f34385w;
                ArrayList arrayList5 = hxVar.f34383r;
                ArrayList arrayList6 = hxVar.h;
                ArrayList arrayList7 = hxVar.f34384s;
                hy hyVar = hxVar.F;
                if (((String) obj5).equals(str4)) {
                    iv ivVar = hyVar.V;
                    tw twVar = hyVar.P;
                    ivVar.e(false);
                    hxVar.D = true;
                    v4.g0 adapter = twVar.getAdapter();
                    hx hxVar2 = hyVar.S;
                    if (adapter != hxVar2) {
                        twVar.setAdapter(hxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(hxVar.f34382n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        zw zwVar = (zw) obj8;
                        if (longSparseIntArray.indexOfKey(zwVar.f41158c.f26983id) < 0) {
                            longSparseIntArray.append(zwVar.f41158c.f26983id, 1);
                            arrayList7.add(zwVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        Object obj9 = arrayList4.get(i10);
                        i10++;
                        zw zwVar2 = (zw) obj9;
                        if (longSparseIntArray.indexOfKey(zwVar2.f41158c.f26983id) < 0) {
                            longSparseIntArray.append(zwVar2.f41158c.f26983id, 1);
                            arrayList7.add(zwVar2);
                        }
                    }
                    hxVar.f();
                    return;
                }
                return;
            case 5:
                ww wwVar = (ww) obj6;
                Long l11 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                wwVar.getMessagesController().T2(l11, null, 32);
                qw qwVar = wwVar.C2;
                wwVar.removeSelfFromStack();
                ((org.telegram.ui.bd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.f2) obj3).finishFragment();
                if (qwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(xr.a(-l11.longValue(), 0L));
                    qwVar.y(wwVar, arrayList8, null, false, wwVar.J2, wwVar.K2, wwVar.L2, null);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                org.telegram.ui.Wallet.f7 f7Var = (org.telegram.ui.Wallet.f7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.t2) obj6).d = false;
                ((fi.d) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.hc.c0(str5, y2Var.E, f6Var);
                }
                f7Var.run();
                return;
        }
    }
}
