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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.kg0;
import yh.l2;
import yh.m2;
public final class o implements Utilities.Callback2 {
    public final int f12000a;
    public final Object f12001b;

    public o(Object obj, int i10) {
        this.f12000a = i10;
        this.f12001b = obj;
    }

    private final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f12001b;
        ArrayList arrayList = (ArrayList) obj;
        s61 s61Var = (s61) obj2;
        org.telegram.ui.web.j jVar = lVar.f42661y;
        ArrayList arrayList2 = lVar.f42660x;
        if (!lVar.f42653b && arrayList2.isEmpty()) {
            arrayList.add(f61.k(lVar.d));
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
                    kVar.f42643c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(kVar);
                }
                Collections.sort(arrayList4, new kg0(12));
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    }
                    arrayList3.add(kVar2.f42641a);
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(f61.k(lVar.v));
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
                            org.telegram.ui.r rVar = lVar.M;
                            if (rVar != null) {
                                rVar.run(str);
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.r rVar2 = lVar.M;
                            if (rVar2 != null) {
                                rVar2.run(str);
                                return;
                            }
                            return;
                    }
                }
            };
            int i13 = org.telegram.ui.web.e.f42577a;
            f61 J = f61.J(org.telegram.ui.web.e.class);
            J.f26153z = 1;
            J.f26140l = str;
            J.D = onClickListener;
            J.f26145q = z12;
            J.f26146r = z13;
            J.G = Boolean.TRUE;
            J.H = lVar;
            arrayList.add(J);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(f61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new r0(lVar, 15)));
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
                                org.telegram.ui.r rVar = lVar.M;
                                if (rVar != null) {
                                    rVar.run(str2);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.r rVar2 = lVar.M;
                                if (rVar2 != null) {
                                    rVar2.run(str2);
                                    return;
                                }
                                return;
                        }
                    }
                };
                int i15 = org.telegram.ui.web.e.f42577a;
                f61 J2 = f61.J(org.telegram.ui.web.e.class);
                J2.f26153z = 0;
                J2.f26140l = str2;
                J2.D = onClickListener2;
                J2.f26145q = z10;
                J2.f26146r = z11;
                J2.G = Boolean.TRUE;
                J2.H = lVar;
                arrayList.add(J2);
            }
        }
        if (jVar != null) {
            ArrayList arrayList5 = jVar.f42628a;
            if (!arrayList5.isEmpty()) {
                arrayList.add(f61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    MessageObject messageObject = (MessageObject) arrayList5.get(i16);
                    if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                        int i17 = org.telegram.ui.web.h.f42599a;
                        f61 J3 = f61.J(org.telegram.ui.web.h.class);
                        J3.f26153z = 3;
                        J3.f26145q = true;
                        J3.H = messageObject;
                        arrayList.add(J3);
                    }
                }
                if (!jVar.f42631f) {
                    arrayList.add(f61.o(arrayList.size(), 32));
                    arrayList.add(f61.o(arrayList.size(), 32));
                    arrayList.add(f61.o(arrayList.size(), 32));
                }
            }
        }
    }

    private final void b(Object obj, Object obj2) {
        s61 s61Var = (s61) obj2;
        ((ArrayList) obj).add(f61.j(-1, ((yh.v) this.f12001b).Z));
    }

    private final void c(Object obj, Object obj2) {
        s61 s61Var = (s61) obj2;
        ((ArrayList) obj).add(f61.j(-1, ((yh.c0) this.f12001b).Z));
    }

    private final void d(Object obj, Object obj2) {
        int i10;
        float f7;
        int i11;
        boolean z10;
        int i12;
        l2 l2Var = (l2) this.f12001b;
        ArrayList arrayList = (ArrayList) obj;
        s61 s61Var = (s61) obj2;
        is0 is0Var = l2Var.f50359a;
        y9 y9Var = l2Var.e;
        if (y9Var != null) {
            if ((!y9Var.e || y9Var.f2495g != 783) && y9Var.f2499l.size() <= 0) {
                y9 y9Var2 = l2Var.e;
                if (y9Var2.f2497j && !y9Var2.f2496i) {
                    return;
                }
            }
            y9 y9Var3 = l2Var.e;
            if (y9Var3 != null && (i12 = y9Var3.f2501n) != 0) {
                i10 = Math.min(3, i12);
            } else {
                i10 = 3;
            }
            int max = Math.max(1, i10);
            y9 y9Var4 = l2Var.e;
            if (y9Var4 != null) {
                ArrayList arrayList2 = y9Var4.f2499l;
                int size = arrayList2.size();
                int i13 = 3;
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z11 = l2Var.d;
                    int i15 = yh.f1.f50230a;
                    f61 J = f61.J(yh.f1.class);
                    J.f26149u = 1;
                    J.f26153z = 0;
                    J.G = savedStarGift;
                    J.f26145q = true;
                    J.f26135f = false;
                    J.f26146r = z11;
                    if (l2Var.f50363n && (l2Var.e != is0Var.d || savedStarGift.pinned_to_top)) {
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
                if (y9Var5.f2496i || !y9Var5.f2497j) {
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
                        f61 o10 = f61.o(i16, 34);
                        o10.f26149u = 1;
                        arrayList.add(o10);
                    }
                }
            }
            if (is0Var.d == l2Var.e) {
                arrayList.add(f61.C(AndroidUtilities.dp(20.0f)));
                if (is0Var.f50459c == UserConfig.getInstance(l2Var.f50360b).getClientUserId()) {
                    int w02 = h6.w0(h6.f21391z6, l2Var.f50361c);
                    String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                    int dp = AndroidUtilities.dp(24.0f);
                    int i17 = m2.f50397a;
                    f61 J2 = f61.J(m2.class);
                    J2.f26140l = string;
                    J2.f26153z = 17;
                    J2.B = w02;
                    J2.A = 14.0f;
                    J2.f26137i = dp;
                    J2.f26139k = 0;
                    J2.f26145q = false;
                    arrayList.add(J2);
                }
                arrayList.add(f61.C(AndroidUtilities.dp(82.0f)));
            } else if (!arrayList.isEmpty()) {
                arrayList.add(f61.C(AndroidUtilities.dp(82.0f)));
            }
            if (!arrayList.isEmpty()) {
                if (l2Var.I) {
                    f7 = 42.0f;
                } else {
                    f7 = 12.0f;
                }
                arrayList.add(0, f61.C(AndroidUtilities.dp(f7)));
            }
            if (l2Var.f50362f.getSpanCount() != max) {
                AndroidUtilities.runOnUIThread(new yh.r1(l2Var, max, 1));
            }
            is0Var.o();
            is0Var.post(new tg.p(is0Var, 19));
        }
    }

    @Override
    public final void run(java.lang.Object r29, java.lang.Object r30) {
        throw new UnsupportedOperationException("Method not decompiled: hg.o.run(java.lang.Object, java.lang.Object):void");
    }
}
