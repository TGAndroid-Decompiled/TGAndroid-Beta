package defpackage;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class hu0 implements pcc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hu0(rv0 rv0Var, pv0 pv0Var, String str, ot0 ot0Var, String str2) {
        this.a = (byte) 0;
        this.b = rv0Var;
        this.e = pv0Var;
        this.c = str;
        this.f = ot0Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        final TLRPC.UserFull userFull;
        TLRPC.TL_document tL_document;
        byte b = this.a;
        String str = "";
        Object obj2 = this.d;
        int i = 0;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                rv0 rv0Var = (rv0) obj6;
                pv0 pv0Var = (pv0) obj5;
                String str2 = (String) obj4;
                ot0 ot0Var = (ot0) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                if (str4 == null) {
                    rv0Var.u(pv0Var, "secure_storage_failed", rv0.y("req_id", str2, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    ot0Var.j(str4);
                    rv0Var.u(pv0Var, "secure_storage_key_restored", rv0.y("req_id", str2, "value", (String) ot0Var.f(str3).first));
                    return;
                } catch (Exception e) {
                    rv0Var.u(pv0Var, "secure_storage_failed", rv0.y("req_id", str2, "error", e.getMessage()));
                    return;
                }
            case 1:
                hl.c3(new z87((rv0) obj6, (File) obj, (id) obj5, (String) obj4, (String) obj2, (String) obj3));
                return;
            case 2:
                hl.c3(new z87((wf1) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (df1) obj3, (byte) 6));
                return;
            case 3:
                final zu1 zu1Var = (zu1) obj6;
                wb2 wb2Var = (wb2) obj5;
                String str5 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = zu1Var.getMessagesController().Y1(user.id);
                } else {
                    userFull = null;
                }
                fu5 J = fu5.J(zu1Var, wb2Var);
                mu9 mu9Var = new mu9(zu1Var.getParentActivity(), zu1Var.Ba);
                J.p = new dm1(mu9Var, (byte) 1);
                gt gtVar = new gt(zu1Var, user, str5, (byte) 8);
                fu5 K = J.K();
                K.b(2131231243, ob6.M0(2131753749, null), new vn1(J, (byte) 0), false);
                K.j();
                K.b(2131232049, ob6.M0(2131751682, null), new on1(zu1Var, J, str5, (byte) 2), false);
                K.b(2131231784, ob6.M0(2131754368, null), new fv0(gtVar, (byte) 27), false);
                if (tL_contact == null && (user == null || !zu1Var.getContactsController().g0.containsKey(Long.valueOf(user.id)))) {
                    J.b(2131232104, ob6.M0(2131754370, null), new c10(J, K, (byte) 4), false);
                    J.j();
                }
                if (user == null) {
                    J.b(2131231840, ob6.M0(2131748861, null), new hl1(zu1Var, str5, (byte) 8), false);
                    J.b(2131232090, ob6.M0(2131743174, null), new hl1(zu1Var, str5, (byte) 9), false);
                    J.b(2131232108, ob6.M0(2131751725, null), new hl1(zu1Var, str5, (byte) 10), false);
                    J.j();
                    J.o(13, -1, ob6.M0(2131747560, null));
                } else {
                    J.b(2131232118, ob6.M0(2131745329, null), new wn1(zu1Var, user, (byte) 0), false);
                    if (!lbc.D(user)) {
                        J.b(2131232088, ob6.M0(2131743173, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                byte b2 = r4;
                                zu1 zu1Var2 = zu1Var;
                                switch (b2) {
                                    case 0:
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null && userFull2.video_calls_available) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xkc.m(user, false, z, zu1Var2.getParentActivity(), userFull2, zu1Var2.getAccountInstance());
                                        return;
                                    default:
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null && userFull3.video_calls_available) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        xkc.m(user, true, z2, zu1Var2.getParentActivity(), userFull3, zu1Var2.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        J.b(2131232424, ob6.M0(2131743263, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                byte b2 = r4;
                                zu1 zu1Var2 = zu1Var;
                                switch (b2) {
                                    case 0:
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null && userFull2.video_calls_available) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xkc.m(user, false, z, zu1Var2.getParentActivity(), userFull2, zu1Var2.getAccountInstance());
                                        return;
                                    default:
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null && userFull3.video_calls_available) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        xkc.m(user, true, z2, zu1Var2.getParentActivity(), userFull3, zu1Var2.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    J.b(2131232090, ob6.M0(2131743174, null), new hl1(zu1Var, str5, (byte) 6), false);
                    J.b(2131232108, ob6.M0(2131751725, null), new hl1(zu1Var, str5, (byte) 7), false);
                    J.j();
                    J.m(user, ob6.M0(2131743198, null), new on1(zu1Var, mu9Var, user, (byte) 1));
                }
                mu9Var.e(J);
                if (characterStyle instanceof h8c) {
                    String url = ((h8c) characterStyle).getURL();
                    if (url != null) {
                        str = url;
                    }
                    String trim = str.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        trim = trim.substring(0, 204).concat("…");
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    mu9Var.f(wb2Var, characterStyle, spannableString, false);
                } else {
                    mu9Var.f(wb2Var, characterStyle, null, false);
                }
                zu1Var.showDialog(mu9Var);
                return;
            case 4:
                zu1 zu1Var2 = (zu1) obj6;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj5;
                String str6 = (String) obj4;
                n47 n47Var = (n47) obj3;
                Long l = (Long) obj;
                int i2 = zu1Var2.g4;
                Object obj7 = this.d;
                if (i2 == 1) {
                    jj.J(zu1Var2.getParentActivity(), zu1Var2.l6, new pt((Object) zu1Var2, (Object) tL_document2, obj7, str6, (byte) 3), zu1Var2.Ba);
                    tL_document = tL_document2;
                } else {
                    tL_document = tL_document2;
                    zu1Var2.getSendMessagesHelper().t0(tL_document, str6, zu1Var2.l6, zu1Var2.F5, zu1Var2.m4, null, zu1Var2.D5, n47Var, true, 0, 0, false, obj7, zu1Var2.X6(), l.longValue(), zu1Var2.k7(), zu1Var2.y5);
                }
                zu1Var2.E7(false);
                zu1Var2.a0.j(tL_document);
                zu1Var2.a0.setFieldText("");
                return;
            case 5:
                uj3 uj3Var = (uj3) obj6;
                Long l2 = (Long) obj4;
                Runnable runnable = (Runnable) obj;
                ((id) obj5).dismiss();
                uj3Var.getMessagesController().c3(l2, null, 32);
                oj3 oj3Var = uj3Var.E2;
                uj3Var.removeSelfFromStack();
                ((gi1) obj2).removeSelfFromStack();
                ((e) obj3).finishFragment();
                if (oj3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(jf7.a(-l2.longValue(), 0L));
                    oj3Var.q(uj3Var, arrayList, null, false, uj3Var.L2, uj3Var.M2, uj3Var.N2, null);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj5;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable2 = (Runnable) obj;
                o14 o14Var = ((n14) obj6).a;
                String str7 = o14Var.w;
                ArrayList arrayList5 = o14Var.r;
                ArrayList arrayList6 = o14Var.h;
                ArrayList arrayList7 = o14Var.s;
                o24 o24Var = o14Var.G;
                b14 b14Var = o24Var.Q;
                if (((String) obj4).equals(str7)) {
                    o24Var.W.d(false);
                    o14Var.E = true;
                    j79 adapter = b14Var.getAdapter();
                    o14 o14Var2 = o24Var.T;
                    if (adapter != o14Var2) {
                        b14Var.setAdapter(o14Var2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(o14Var.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj8 = arrayList3.get(i3);
                        i3++;
                        h14 h14Var = (h14) obj8;
                        if (longSparseIntArray.indexOfKey(h14Var.c.id) < 0) {
                            longSparseIntArray.append(h14Var.c.id, 1);
                            arrayList7.add(h14Var);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i < size2) {
                        Object obj9 = arrayList4.get(i);
                        i++;
                        h14 h14Var2 = (h14) obj9;
                        if (longSparseIntArray.indexOfKey(h14Var2.c.id) < 0) {
                            longSparseIntArray.append(h14Var2.c.id, 1);
                            arrayList7.add(h14Var2);
                        }
                    }
                    o14Var.f();
                    return;
                }
                return;
            case 7:
                tk7 tk7Var = (tk7) obj4;
                vnb vnbVar = (vnb) obj2;
                ao1 ao1Var = (ao1) obj3;
                String str8 = (String) obj;
                ((n55) obj6).d = false;
                ((c51) obj5).setLoading(false);
                if (str8 != null) {
                    d31.d0(str8, tk7Var.F, vnbVar);
                }
                ao1Var.run();
                return;
            case 8:
                wua wuaVar = (wua) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                y41[] y41VarArr = (y41[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    new gra(wuaVar.getContext(), wuaVar.J0, wuaVar.a, starGift.title, arrayList8, false).show();
                } else {
                    wuaVar.v2(y41VarArr[0], ob6.a0(null, null, 2131750004, cc.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[0] = false;
                return;
            default:
                qsb qsbVar = (qsb) obj4;
                rxc rxcVar = (rxc) obj2;
                pcc pccVar = (pcc) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                qsb.a((psb) obj6);
                if (!((boolean[]) obj5)[0]) {
                    psb d = qsb.d(qsbVar, "parseJSON");
                    try {
                        rxcVar.c = rxcVar.i(rxcVar.a, jSONObject);
                    } catch (Exception e2) {
                        qsb.c(qsbVar, "error: " + e2);
                        cc4.g(e2, true);
                    }
                    qsb.a(d);
                    pccVar.a(rxcVar);
                    TLRPC.TL_webPage tL_webPage = rxcVar.c;
                    if (tL_webPage != null) {
                        rxc.e.put(tL_webPage, rxcVar);
                    }
                    qsb.b(qsbVar);
                    return;
                }
                return;
        }
    }

    public hu0(n14 n14Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 6;
        this.b = n14Var;
        this.c = str;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    public hu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
