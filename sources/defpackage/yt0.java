package defpackage;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class yt0 implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public yt0(hv0 hv0Var, ev0 ev0Var, String str, gt0 gt0Var, String str2) {
        this.a = (byte) 0;
        this.b = hv0Var;
        this.e = ev0Var;
        this.c = str;
        this.f = gt0Var;
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
                hv0 hv0Var = (hv0) obj6;
                ev0 ev0Var = (ev0) obj5;
                String str2 = (String) obj4;
                gt0 gt0Var = (gt0) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                if (str4 == null) {
                    hv0Var.u(ev0Var, "secure_storage_failed", hv0.y("req_id", str2, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    gt0Var.j(str4);
                    hv0Var.u(ev0Var, "secure_storage_key_restored", hv0.y("req_id", str2, "value", (String) gt0Var.f(str3).first));
                    return;
                } catch (Exception e) {
                    hv0Var.u(ev0Var, "secure_storage_failed", hv0.y("req_id", str2, "error", e.getMessage()));
                    return;
                }
            case 1:
                gl.d3(new e57((hv0) obj6, (File) obj, (hd) obj5, (String) obj4, (String) obj2, (String) obj3));
                return;
            case 2:
                gl.d3(new e57((nf1) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (pe1) obj3, (byte) 6));
                return;
            case 3:
                final mu1 mu1Var = (mu1) obj6;
                gb2 gb2Var = (gb2) obj5;
                String str5 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = mu1Var.getMessagesController().W1(user.id);
                } else {
                    userFull = null;
                }
                cs5 J = cs5.J(mu1Var, gb2Var);
                tq9 tq9Var = new tq9(mu1Var.getParentActivity(), mu1Var.Ba);
                J.p = new zk1(tq9Var, (byte) 1);
                ht htVar = new ht(mu1Var, user, str5, (byte) 8);
                cs5 K = J.K();
                K.b(2131231243, k96.M0(2131753753, null), new en1(J, (byte) 0), false);
                K.j();
                K.b(2131232049, k96.M0(2131751705, null), new fv0((gk7) mu1Var, (Object) J, str5, (byte) 29), false);
                K.b(2131231784, k96.M0(2131754372, null), new nv0(htVar, (byte) 26), false);
                if (tL_contact == null && (user == null || !mu1Var.getContactsController().g0.containsKey(Long.valueOf(user.id)))) {
                    J.b(2131232104, k96.M0(2131754374, null), new c10(J, K, (byte) 3), false);
                    J.j();
                }
                if (user == null) {
                    J.b(2131231840, k96.M0(2131748915, null), new al1(mu1Var, str5, (byte) 10), false);
                    J.b(2131232090, k96.M0(2131743280, null), new al1(mu1Var, str5, (byte) 11), false);
                    J.b(2131232108, k96.M0(2131751748, null), new al1(mu1Var, str5, (byte) 12), false);
                    J.j();
                    J.o(13, -1, k96.M0(2131747640, null));
                } else {
                    J.b(2131232118, k96.M0(2131745409, null), new fn1(mu1Var, user, (byte) 0), false);
                    if (!l7c.C(user)) {
                        J.b(2131232088, k96.M0(2131743279, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                byte b2 = r4;
                                mu1 mu1Var2 = mu1Var;
                                switch (b2) {
                                    case 0:
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null && userFull2.video_calls_available) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        rgc.m(user, false, z, mu1Var2.getParentActivity(), userFull2, mu1Var2.getAccountInstance());
                                        return;
                                    default:
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null && userFull3.video_calls_available) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        rgc.m(user, true, z2, mu1Var2.getParentActivity(), userFull3, mu1Var2.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        J.b(2131232424, k96.M0(2131743369, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                byte b2 = r4;
                                mu1 mu1Var2 = mu1Var;
                                switch (b2) {
                                    case 0:
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null && userFull2.video_calls_available) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        rgc.m(user, false, z, mu1Var2.getParentActivity(), userFull2, mu1Var2.getAccountInstance());
                                        return;
                                    default:
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null && userFull3.video_calls_available) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        rgc.m(user, true, z2, mu1Var2.getParentActivity(), userFull3, mu1Var2.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    J.b(2131232090, k96.M0(2131743280, null), new al1(mu1Var, str5, (byte) 8), false);
                    J.b(2131232108, k96.M0(2131751748, null), new al1(mu1Var, str5, (byte) 9), false);
                    J.j();
                    J.m(user, k96.M0(2131743304, null), new fv0(mu1Var, tq9Var, user, (byte) 28));
                }
                tq9Var.e(J);
                if (characterStyle instanceof i4c) {
                    String url = ((i4c) characterStyle).getURL();
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
                    tq9Var.f(gb2Var, characterStyle, spannableString, false);
                } else {
                    tq9Var.f(gb2Var, characterStyle, null, false);
                }
                mu1Var.showDialog(tq9Var);
                return;
            case 4:
                mu1 mu1Var2 = (mu1) obj6;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj5;
                String str6 = (String) obj4;
                g27 g27Var = (g27) obj3;
                Long l = (Long) obj;
                int i2 = mu1Var2.g4;
                Object obj7 = this.d;
                if (i2 == 1) {
                    ij.J(mu1Var2.getParentActivity(), mu1Var2.l6, new lt((Object) mu1Var2, (Object) tL_document2, obj7, str6, (byte) 3), mu1Var2.Ba);
                    tL_document = tL_document2;
                } else {
                    tL_document = tL_document2;
                    mu1Var2.getSendMessagesHelper().t0(tL_document, str6, mu1Var2.l6, mu1Var2.F5, mu1Var2.m4, null, mu1Var2.D5, g27Var, true, 0, 0, false, obj7, mu1Var2.O6(), l.longValue(), mu1Var2.a7(), mu1Var2.y5);
                }
                mu1Var2.u7(false);
                mu1Var2.a0.k(tL_document);
                mu1Var2.a0.setFieldText("");
                return;
            case 5:
                cj3 cj3Var = (cj3) obj6;
                Long l2 = (Long) obj4;
                Runnable runnable = (Runnable) obj;
                ((hd) obj5).dismiss();
                cj3Var.getMessagesController().V2(l2, null, 32);
                wi3 wi3Var = cj3Var.E2;
                cj3Var.removeSelfFromStack();
                ((yh1) obj2).removeSelfFromStack();
                ((d) obj3).finishFragment();
                if (wi3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zc7.a(-l2.longValue(), 0L));
                    wi3Var.r(cj3Var, arrayList, null, false, cj3Var.L2, cj3Var.M2, cj3Var.N2, null);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj5;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable2 = (Runnable) obj;
                t04 t04Var = ((s04) obj6).a;
                String str7 = t04Var.w;
                ArrayList arrayList5 = t04Var.r;
                ArrayList arrayList6 = t04Var.h;
                ArrayList arrayList7 = t04Var.s;
                t14 t14Var = t04Var.G;
                g04 g04Var = t14Var.Q;
                if (((String) obj4).equals(str7)) {
                    t14Var.W.d(false);
                    t04Var.E = true;
                    w39 adapter = g04Var.getAdapter();
                    t04 t04Var2 = t14Var.T;
                    if (adapter != t04Var2) {
                        g04Var.setAdapter(t04Var2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(t04Var.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj8 = arrayList3.get(i3);
                        i3++;
                        m04 m04Var = (m04) obj8;
                        if (longSparseIntArray.indexOfKey(m04Var.c.id) < 0) {
                            longSparseIntArray.append(m04Var.c.id, 1);
                            arrayList7.add(m04Var);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i < size2) {
                        Object obj9 = arrayList4.get(i);
                        i++;
                        m04 m04Var2 = (m04) obj9;
                        if (longSparseIntArray.indexOfKey(m04Var2.c.id) < 0) {
                            longSparseIntArray.append(m04Var2.c.id, 1);
                            arrayList7.add(m04Var2);
                        }
                    }
                    t04Var.f();
                    return;
                }
                return;
            case 7:
                ki7 ki7Var = (ki7) obj4;
                wjb wjbVar = (wjb) obj2;
                hn1 hn1Var = (hn1) obj3;
                String str8 = (String) obj;
                ((j35) obj6).d = false;
                ((u41) obj5).setLoading(false);
                if (str8 != null) {
                    u21.d0(str8, ki7Var.F, wjbVar);
                }
                hn1Var.run();
                return;
            case 8:
                vqa vqaVar = (vqa) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                q41[] q41VarArr = (q41[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    new kna(vqaVar.getContext(), vqaVar.J0, vqaVar.a, starGift.title, arrayList8, false).show();
                } else {
                    vqaVar.u2(q41VarArr[0], k96.a0(null, null, 2131750030, bc.I0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[0] = false;
                return;
            default:
                qob qobVar = (qob) obj4;
                ctc ctcVar = (ctc) obj2;
                p8c p8cVar = (p8c) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                qob.a((pob) obj6);
                if (!((boolean[]) obj5)[0]) {
                    pob d = qob.d(qobVar, "parseJSON");
                    try {
                        ctcVar.c = ctcVar.i(ctcVar.a, jSONObject);
                    } catch (Exception e2) {
                        qob.c(qobVar, "error: " + e2);
                        fa4.g(e2, true);
                    }
                    qob.a(d);
                    p8cVar.a(ctcVar);
                    TLRPC.TL_webPage tL_webPage = ctcVar.c;
                    if (tL_webPage != null) {
                        ctc.e.put(tL_webPage, ctcVar);
                    }
                    qob.b(qobVar);
                    return;
                }
                return;
        }
    }

    public yt0(s04 s04Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 6;
        this.b = s04Var;
        this.c = str;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    public yt0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
