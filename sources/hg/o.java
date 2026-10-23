package hg;

import ai.y9;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.o70;
import yh.l2;
import yh.m2;
public final class o implements Utilities.Callback2 {
    public final int f12026a;
    public final Object f12027b;

    public o(Object obj, int i10) {
        this.f12026a = i10;
        this.f12027b = obj;
    }

    private final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f12027b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
        org.telegram.ui.web.j jVar = lVar.f43186y;
        ArrayList arrayList2 = lVar.f43185x;
        if (!lVar.f43178b && arrayList2.isEmpty()) {
            arrayList.add(m61.k(lVar.d));
        }
        SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
        ArrayList arrayList3 = new ArrayList();
        String string = sharedPreferences.getString("queries_json", null);
        if (string != null) {
            try {
                ArrayList arrayList4 = new ArrayList();
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    kVar.f43167c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(kVar);
                }
                Collections.sort(arrayList4, new o70(13));
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    }
                    arrayList3.add(kVar2.f43165a);
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(m61.k(lVar.v));
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            final String str = (String) arrayList2.get(i12);
            if (i12 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i12 == arrayList2.size() - 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.q qVar = lVar.M;
                            if (qVar != null) {
                                qVar.run(str);
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.q qVar2 = lVar.M;
                            if (qVar2 != null) {
                                qVar2.run(str);
                                return;
                            }
                            return;
                    }
                }
            };
            int i13 = org.telegram.ui.web.e.f43098a;
            m61 J = m61.J(org.telegram.ui.web.e.class);
            J.f28572z = 1;
            J.f28559l = str;
            J.D = onClickListener;
            J.f28564q = z12;
            J.f28565r = z13;
            J.G = Boolean.TRUE;
            J.H = lVar;
            arrayList.add(J);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(m61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new r0(lVar, 15)));
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                final String str2 = (String) arrayList3.get(i14);
                if (i14 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 == arrayList3.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.q qVar = lVar.M;
                                if (qVar != null) {
                                    qVar.run(str2);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.q qVar2 = lVar.M;
                                if (qVar2 != null) {
                                    qVar2.run(str2);
                                    return;
                                }
                                return;
                        }
                    }
                };
                int i15 = org.telegram.ui.web.e.f43098a;
                m61 J2 = m61.J(org.telegram.ui.web.e.class);
                J2.f28572z = 0;
                J2.f28559l = str2;
                J2.D = onClickListener2;
                J2.f28564q = z10;
                J2.f28565r = z11;
                J2.G = Boolean.TRUE;
                J2.H = lVar;
                arrayList.add(J2);
            }
        }
        if (jVar != null) {
            ArrayList arrayList5 = jVar.f43154a;
            if (!arrayList5.isEmpty()) {
                arrayList.add(m61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    MessageObject messageObject = (MessageObject) arrayList5.get(i16);
                    if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                        int i17 = org.telegram.ui.web.h.f43131a;
                        m61 J3 = m61.J(org.telegram.ui.web.h.class);
                        J3.f28572z = 3;
                        J3.f28564q = true;
                        J3.H = messageObject;
                        arrayList.add(J3);
                    }
                }
                if (!jVar.f43157f) {
                    arrayList.add(m61.o(arrayList.size(), 32));
                    arrayList.add(m61.o(arrayList.size(), 32));
                    arrayList.add(m61.o(arrayList.size(), 32));
                }
            }
        }
    }

    private final void b(Object obj, Object obj2) {
        b71 b71Var = (b71) obj2;
        ((ArrayList) obj).add(m61.j(-1, ((yh.v) this.f12027b).Z));
    }

    private final void c(Object obj, Object obj2) {
        b71 b71Var = (b71) obj2;
        ((ArrayList) obj).add(m61.j(-1, ((yh.c0) this.f12027b).Z));
    }

    private final void d(Object obj, Object obj2) {
        int i10;
        float f7;
        int i11;
        boolean z10;
        int i12;
        l2 l2Var = (l2) this.f12027b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
        g6 g6Var = l2Var.f50827c;
        ns0 ns0Var = l2Var.f50825a;
        y9 y9Var = l2Var.e;
        if (y9Var != null) {
            if ((!y9Var.e || y9Var.f2507g != 783) && y9Var.f2511l.size() <= 0) {
                y9 y9Var2 = l2Var.e;
                if (y9Var2.f2509j && !y9Var2.f2508i) {
                    return;
                }
            }
            y9 y9Var3 = l2Var.e;
            if (y9Var3 != null && (i12 = y9Var3.f2513n) != 0) {
                i10 = Math.min(3, i12);
            } else {
                i10 = 3;
            }
            int max = Math.max(1, i10);
            y9 y9Var4 = l2Var.e;
            if (y9Var4 != null) {
                ArrayList arrayList2 = y9Var4.f2511l;
                int size = arrayList2.size();
                int i13 = 3;
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z11 = l2Var.d;
                    int i15 = yh.f1.f50684a;
                    m61 J = m61.J(yh.f1.class);
                    J.f28568u = 1;
                    J.f28572z = 0;
                    J.G = savedStarGift;
                    J.f28564q = true;
                    J.f28554f = false;
                    J.f28565r = z11;
                    if (l2Var.f50829n && (l2Var.e != ns0Var.d || savedStarGift.pinned_to_top)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    J.h = z10;
                    arrayList.add(J);
                    i13--;
                    if (i13 == 0) {
                        i13 = 3;
                    }
                }
                y9 y9Var5 = l2Var.e;
                if (y9Var5.f2508i || !y9Var5.f2509j) {
                    int i16 = 0;
                    while (true) {
                        if (i13 <= 0) {
                            i11 = 3;
                        } else {
                            i11 = i13;
                        }
                        if (i16 >= i11) {
                            break;
                        }
                        i16++;
                        m61 o10 = m61.o(i16, 34);
                        o10.f28568u = 1;
                        arrayList.add(o10);
                    }
                }
            }
            if (ns0Var.d == l2Var.e) {
                arrayList.add(m61.C(AndroidUtilities.dp(20.0f)));
                if (ns0Var.f50926c == UserConfig.getInstance(l2Var.f50826b).getClientUserId()) {
                    int i17 = k6.f21588z6;
                    int w02 = k6.w0(i17, g6Var);
                    String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                    int dp = AndroidUtilities.dp(24.0f);
                    int i18 = m2.f50863a;
                    m61 J2 = m61.J(m2.class);
                    J2.f28559l = string;
                    J2.f28572z = 17;
                    J2.B = w02;
                    J2.A = 14.0f;
                    J2.f28556i = dp;
                    J2.f28558k = 0;
                    J2.f28564q = false;
                    J2.G = g6Var;
                    J2.H = Integer.valueOf(i17);
                    arrayList.add(J2);
                }
                arrayList.add(m61.C(AndroidUtilities.dp(82.0f)));
            } else if (!arrayList.isEmpty()) {
                arrayList.add(m61.C(AndroidUtilities.dp(82.0f)));
            }
            if (!arrayList.isEmpty()) {
                if (l2Var.I) {
                    f7 = 42.0f;
                } else {
                    f7 = 12.0f;
                }
                arrayList.add(0, m61.C(AndroidUtilities.dp(f7)));
            }
            if (l2Var.f50828f.getSpanCount() != max) {
                AndroidUtilities.runOnUIThread(new yh.r1(l2Var, max, 1));
            }
            ns0Var.o();
            ns0Var.post(new tg.p(ns0Var, 19));
        }
    }

    @Override
    public final void run(java.lang.Object r29, java.lang.Object r30) {
        throw new UnsupportedOperationException("Method not decompiled: hg.o.run(java.lang.Object, java.lang.Object):void");
    }
}
