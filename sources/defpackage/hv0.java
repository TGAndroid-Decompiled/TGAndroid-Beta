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
public final class hv0 implements qac {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hv0(qw0 qw0Var, ow0 ow0Var, String str, ou0 ou0Var, String str2) {
        this.a = (byte) 0;
        this.b = qw0Var;
        this.e = ow0Var;
        this.c = str;
        this.f = ou0Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        final TLRPC.UserFull userFull;
        bu5 bu5Var;
        bu5 bu5Var2;
        yv1 yv1Var;
        byte b = this.a;
        String str = "";
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        int i = 0;
        switch (b) {
            case 0:
                qw0 qw0Var = (qw0) obj6;
                ow0 ow0Var = (ow0) obj5;
                String str2 = (String) obj4;
                ou0 ou0Var = (ou0) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                if (str4 == null) {
                    qw0Var.u(ow0Var, "secure_storage_failed", qw0.y("req_id", str2, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    ou0Var.j(str4);
                    qw0Var.u(ow0Var, "secure_storage_key_restored", qw0.y("req_id", str2, "value", (String) ou0Var.f(str3).first));
                    return;
                } catch (Exception e) {
                    qw0Var.u(ow0Var, "secure_storage_failed", qw0.y("req_id", str2, "error", e.getMessage()));
                    return;
                }
            case 1:
                gm.c3(new e77((qw0) obj6, (File) obj, (he) obj5, (String) obj4, (String) obj2, (String) obj3));
                return;
            case 2:
                gm.c3(new e77((vg1) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (xf1) obj3, (byte) 6));
                return;
            case 3:
                final yv1 yv1Var2 = (yv1) obj6;
                rc2 rc2Var = (rc2) obj5;
                String str5 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = yv1Var2.getMessagesController().X1(user.id);
                } else {
                    userFull = null;
                }
                bu5 J = bu5.J(yv1Var2, rc2Var);
                vs9 vs9Var = new vs9(yv1Var2.getParentActivity(), yv1Var2.Ba);
                J.p = new hm1(vs9Var, (byte) 1);
                iu iuVar = new iu(yv1Var2, user, str5, (byte) 7);
                bu5 K = J.K();
                K.b(2131231244, jb6.M0(2131753721, null), new bo1(J, (byte) 0), false);
                K.j();
                K.b(2131232050, jb6.M0(2131751654, null), new co1(yv1Var2, J, str5, (byte) 0), false);
                K.b(2131231785, jb6.M0(2131754372, null), new yt0(iuVar, (byte) 29), false);
                if (tL_contact == null) {
                    if (user != null) {
                        bu5Var2 = J;
                        if (yv1Var2.getContactsController().g0.containsKey(Long.valueOf(user.id))) {
                            bu5Var = bu5Var2;
                        }
                    } else {
                        bu5Var2 = J;
                    }
                    bu5Var = bu5Var2;
                    bu5Var.b(2131232105, jb6.M0(2131754374, null), new c20(bu5Var, K, (byte) 3), false);
                    bu5Var.j();
                } else {
                    bu5Var = J;
                }
                if (user == null) {
                    bu5Var.b(2131231841, jb6.M0(2131748864, null), new lm1(yv1Var2, str5, (byte) 5), false);
                    bu5Var.b(2131232091, jb6.M0(2131743206, null), new lm1(yv1Var2, str5, (byte) 6), false);
                    bu5Var.b(2131232109, jb6.M0(2131751697, null), new lm1(yv1Var2, str5, (byte) 7), false);
                    bu5Var.j();
                    bu5Var.o(13, -1, jb6.M0(2131747566, null));
                } else {
                    bu5Var.b(2131232119, jb6.M0(2131745335, null), new do1(yv1Var2, user, (byte) 0), false);
                    if (!m9c.D(user)) {
                        bu5Var.b(2131232089, jb6.M0(2131743205, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                byte b2 = r4;
                                yv1 yv1Var3 = yv1Var2;
                                switch (b2) {
                                    case 0:
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null && userFull2.video_calls_available) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        sic.m(user, false, z, yv1Var3.getParentActivity(), userFull2, yv1Var3.getAccountInstance());
                                        return;
                                    default:
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null && userFull3.video_calls_available) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        sic.m(user, true, z2, yv1Var3.getParentActivity(), userFull3, yv1Var3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        bu5Var.b(2131232425, jb6.M0(2131743295, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                byte b2 = r4;
                                yv1 yv1Var3 = yv1Var2;
                                switch (b2) {
                                    case 0:
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null && userFull2.video_calls_available) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        sic.m(user, false, z, yv1Var3.getParentActivity(), userFull2, yv1Var3.getAccountInstance());
                                        return;
                                    default:
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null && userFull3.video_calls_available) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        sic.m(user, true, z2, yv1Var3.getParentActivity(), userFull3, yv1Var3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    bu5Var.b(2131232091, jb6.M0(2131743206, null), new lm1(yv1Var2, str5, (byte) 3), false);
                    bu5Var.b(2131232109, jb6.M0(2131751697, null), new lm1(yv1Var2, str5, (byte) 4), false);
                    bu5Var.j();
                    bu5Var.m(user, jb6.M0(2131743230, null), new tv0(yv1Var2, vs9Var, user, (byte) 29));
                }
                vs9Var.e(bu5Var);
                if (characterStyle instanceof i6c) {
                    String url = ((i6c) characterStyle).getURL();
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
                    vs9Var.f(rc2Var, characterStyle, spannableString, false);
                } else {
                    vs9Var.f(rc2Var, characterStyle, null, false);
                }
                yv1Var2.showDialog(vs9Var);
                return;
            case 4:
                yv1 yv1Var3 = (yv1) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str6 = (String) obj4;
                g47 g47Var = (g47) obj3;
                Long l = (Long) obj;
                int i2 = yv1Var3.g4;
                Object obj7 = this.d;
                if (i2 == 1) {
                    yv1Var = yv1Var3;
                    ik.J(yv1Var3.getParentActivity(), yv1Var3.l6, new lu((Object) yv1Var, (Object) tL_document, obj7, str6, (byte) 3), yv1Var.Ba);
                } else {
                    yv1Var = yv1Var3;
                    yv1Var.getSendMessagesHelper().t0(tL_document, str6, yv1Var.l6, yv1Var.F5, yv1Var.m4, null, yv1Var.D5, g47Var, true, 0, 0, false, obj7, yv1Var.X6(), l.longValue(), yv1Var.k7(), yv1Var.y5);
                }
                yv1Var.E7(false);
                yv1Var.a0.k(tL_document);
                yv1Var.a0.setFieldText("");
                return;
            case 5:
                nk3 nk3Var = (nk3) obj6;
                Long l2 = (Long) obj4;
                Runnable runnable = (Runnable) obj;
                ((he) obj5).dismiss();
                nk3Var.getMessagesController().Y2(l2, null, 32);
                hk3 hk3Var = nk3Var.E2;
                nk3Var.removeSelfFromStack();
                ((fj1) obj2).removeSelfFromStack();
                ((d) obj3).finishFragment();
                if (hk3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bf7.a(-l2.longValue(), 0L));
                    hk3Var.q(nk3Var, arrayList, null, false, nk3Var.L2, nk3Var.M2, nk3Var.N2, null);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj5;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                Runnable runnable2 = (Runnable) obj;
                e24 e24Var = ((d24) obj6).a;
                String str7 = e24Var.w;
                ArrayList arrayList5 = e24Var.r;
                ArrayList arrayList6 = e24Var.h;
                ArrayList arrayList7 = e24Var.s;
                e34 e34Var = e24Var.G;
                r14 r14Var = e34Var.Q;
                if (((String) obj4).equals(str7)) {
                    e34Var.W.d(false);
                    e24Var.E = true;
                    y59 adapter = r14Var.getAdapter();
                    e24 e24Var2 = e34Var.T;
                    if (adapter != e24Var2) {
                        r14Var.setAdapter(e24Var2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(e24Var.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj8 = arrayList3.get(i3);
                        i3++;
                        x14 x14Var = (x14) obj8;
                        if (longSparseIntArray.indexOfKey(x14Var.c.id) < 0) {
                            longSparseIntArray.append(x14Var.c.id, 1);
                            arrayList7.add(x14Var);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i < size2) {
                        Object obj9 = arrayList4.get(i);
                        i++;
                        x14 x14Var2 = (x14) obj9;
                        if (longSparseIntArray.indexOfKey(x14Var2.c.id) < 0) {
                            longSparseIntArray.append(x14Var2.c.id, 1);
                            arrayList7.add(x14Var2);
                        }
                    }
                    e24Var.f();
                    return;
                }
                return;
            case 7:
                mk7 mk7Var = (mk7) obj4;
                ylb ylbVar = (ylb) obj2;
                xo1 xo1Var = (xo1) obj3;
                String str8 = (String) obj;
                ((j55) obj6).d = false;
                ((b61) obj5).setLoading(false);
                if (str8 != null) {
                    c41.d0(str8, mk7Var.F, ylbVar);
                }
                xo1Var.run();
                return;
            case 8:
                wsa wsaVar = (wsa) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                x51[] x51VarArr = (x51[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    new kpa(wsaVar.getContext(), wsaVar.J0, wsaVar.a, starGift.title, arrayList8, false).show();
                } else {
                    wsaVar.u2(x51VarArr[0], jb6.a0(null, null, 2131749979, bc.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[0] = false;
                return;
            default:
                rqb rqbVar = (rqb) obj4;
                dvc dvcVar = (dvc) obj2;
                qac qacVar = (qac) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                rqb.a((qqb) obj6);
                if (!((boolean[]) obj5)[0]) {
                    qqb d = rqb.d(rqbVar, "parseJSON");
                    try {
                        dvcVar.c = dvcVar.i(dvcVar.a, jSONObject);
                    } catch (Exception e2) {
                        rqb.c(rqbVar, "error: " + e2);
                        fc4.g(e2, true);
                    }
                    rqb.a(d);
                    qacVar.a(dvcVar);
                    TLRPC.TL_webPage tL_webPage = dvcVar.c;
                    if (tL_webPage != null) {
                        dvc.e.put(tL_webPage, dvcVar);
                    }
                    rqb.b(rqbVar);
                    return;
                }
                return;
        }
    }

    public hv0(d24 d24Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 6;
        this.b = d24Var;
        this.c = str;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    public hv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
