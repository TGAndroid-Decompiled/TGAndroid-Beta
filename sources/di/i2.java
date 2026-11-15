package di;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.yw;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.de;
import org.telegram.ui.ee;
import org.telegram.ui.eg;
import org.telegram.ui.fq0;
import org.telegram.ui.sw;
public final class i2 implements z10 {
    public final int f8786a;
    public final Object f8787b;
    public final Object f8788c;
    public final Object d;
    public final Object f8789e;
    public final Object f8790f;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8786a = i7;
        this.f8787b = obj;
        this.f8788c = obj2;
        this.d = obj3;
        this.f8789e = obj4;
        this.f8790f = obj5;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        final TLRPC.UserFull userFull;
        ?? r15;
        int i7 = this.f8786a;
        String str = "";
        Object obj2 = this.f8789e;
        Object obj3 = this.f8790f;
        Object obj4 = this.d;
        Object obj5 = this.f8788c;
        Object obj6 = this.f8787b;
        int i10 = 0;
        switch (i7) {
            case 0:
                c6 c6Var = (c6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new i1(c6Var.getContext(), c6Var.J0, c6Var.f29679a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    c6Var.q2(ecVarArr[0], hd.a0(null, null, 2131750046, ki.k.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new bi.p1((org.telegram.ui.lb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 12));
                return;
            case 2:
                final an anVar = (an) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = anVar.getMessagesController().b2(user.f28200id);
                } else {
                    userFull = null;
                }
                m60 I = m60.I(anVar, q1Var);
                ok0 ok0Var = new ok0(anVar.getParentActivity(), anVar.Aa);
                I.f37106p = new de(ok0Var, 1);
                org.telegram.ui.x xVar = new org.telegram.ui.x(anVar, user, str2, 3);
                m60 J = I.J();
                J.c(2131231240, hd.M0(2131753756, null), new fq0(I, 27), false);
                J.k();
                J.c(2131232045, hd.M0(2131751717, null), new org.telegram.ui.o1(anVar, I, str2), false);
                J.c(2131231780, hd.M0(2131754375, null), new fq0(xVar, 28), false);
                if (tL_contact == null && (user == null || !anVar.getContactsController().f23680g0.containsKey(Long.valueOf(user.f28200id)))) {
                    I.c(2131232100, hd.M0(2131754377, null), new bi.n3(I, J, 5), false);
                    I.k();
                }
                if (user == null) {
                    I.c(2131231836, hd.M0(2131749107, null), new ee(anVar, str2, 10), false);
                    I.c(2131232086, hd.M0(2131743522, null), new ee(anVar, str2, 11), false);
                    I.c(2131232104, hd.M0(2131751760, null), new ee(anVar, str2, 12), false);
                    I.k();
                    I.p(13, -1, hd.M0(2131747833, null));
                } else {
                    I.c(2131232114, hd.M0(2131745601, null), new eg(anVar, user, 0), false);
                    if (!q10.B(user)) {
                        I.c(2131232084, hd.M0(2131743521, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (r4) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            anVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.c2.m(user, false, z13, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z132, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                        return;
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            anVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z14, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z142, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(2131232420, hd.M0(2131743608, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (r4) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            anVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.c2.m(user, false, z132, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z1322, anVar2.getParentActivity(), userFull2, anVar2.getAccountInstance());
                                        return;
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            anVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z142, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z1422, anVar3.getParentActivity(), userFull3, anVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(2131232086, hd.M0(2131743522, null), new ee(anVar, str2, 8), false);
                    I.c(2131232104, hd.M0(2131751760, null), new ee(anVar, str2, 9), false);
                    I.k();
                    I.n(user, hd.M0(2131743546, null), new org.telegram.ui.o1(anVar, ok0Var, user, 18));
                }
                ok0Var.e(I);
                if (characterStyle instanceof h41) {
                    String url = ((h41) characterStyle).getURL();
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
                    ok0Var.f(q1Var, characterStyle, spannableString, r15);
                } else {
                    ok0Var.f(q1Var, characterStyle, null, false);
                }
                anVar.showDialog(ok0Var);
                return;
            case 3:
                an anVar2 = (an) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str3 = (String) obj4;
                cj cjVar = (cj) obj3;
                Long l10 = (Long) obj;
                int i11 = anVar2.f45204g4;
                Object obj7 = this.f8789e;
                if (i11 == 1) {
                    org.telegram.ui.Components.t4.J(anVar2.getParentActivity(), anVar2.f45259k6, new a1.d(anVar2, tL_document, str3, obj7, 7), anVar2.Aa);
                } else {
                    anVar2.getSendMessagesHelper().v0(tL_document, str3, anVar2.f45259k6, anVar2.E5, anVar2.f45281m4, null, anVar2.C5, cjVar, true, 0, 0, false, obj7, anVar2.Y8(), l10.longValue(), anVar2.j9(), anVar2.f45422x5);
                    tL_document = tL_document;
                }
                anVar2.D9(false);
                anVar2.f45118a0.m(tL_document);
                anVar2.f45118a0.setFieldText("");
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                lx lxVar = ((kx) obj6).f36647a;
                String str4 = lxVar.f36924w;
                ArrayList arrayList5 = lxVar.f36922r;
                ArrayList arrayList6 = lxVar.h;
                ArrayList arrayList7 = lxVar.f36923s;
                ly lyVar = lxVar.G;
                if (((String) obj5).equals(str4)) {
                    nv nvVar = lyVar.W;
                    yw ywVar = lyVar.Q;
                    nvVar.e(false);
                    lxVar.E = true;
                    v4.h0 adapter = ywVar.getAdapter();
                    lx lxVar2 = lyVar.T;
                    if (adapter != lxVar2) {
                        ywVar.setAdapter(lxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(lxVar.f36921n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        ex exVar = (ex) obj8;
                        if (longSparseIntArray.indexOfKey(exVar.f34446c.f28078id) < 0) {
                            longSparseIntArray.append(exVar.f34446c.f28078id, 1);
                            arrayList7.add(exVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        Object obj9 = arrayList4.get(i10);
                        i10++;
                        ex exVar2 = (ex) obj9;
                        if (longSparseIntArray.indexOfKey(exVar2.f34446c.f28078id) < 0) {
                            longSparseIntArray.append(exVar2.f34446c.f28078id, 1);
                            arrayList7.add(exVar2);
                        }
                    }
                    lxVar.f();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) obj6;
                Long l11 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                ywVar2.getMessagesController().T2(l11, null, 32);
                sw swVar = ywVar2.E2;
                ywVar2.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.e2) obj3).finishFragment();
                if (swVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(ur.a(-l11.longValue(), 0L));
                    swVar.y(ywVar2, arrayList8, null, false, ywVar2.L2, ywVar2.M2, ywVar2.N2, null);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.r2) obj6).d = false;
                ((hi.d) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.cc.c0(str5, w2Var.F, e6Var);
                }
                g7Var.run();
                return;
        }
    }
}
