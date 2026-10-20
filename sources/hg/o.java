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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.jg0;
import yh.l2;
import yh.m2;
public final class o implements Utilities.Callback2 {
    public final int f11999a;
    public final Object f12000b;

    public o(Object obj, int i10) {
        this.f11999a = i10;
        this.f12000b = obj;
    }

    private final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f12000b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        org.telegram.ui.web.i iVar = kVar.f42703y;
        ArrayList arrayList2 = kVar.f42702x;
        if (!kVar.f42695b && arrayList2.isEmpty()) {
            arrayList.add(h61.k(kVar.d));
        }
        SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
        ArrayList arrayList3 = new ArrayList();
        String string = sharedPreferences.getString("queries_json", null);
        if (string != null) {
            try {
                ArrayList arrayList4 = new ArrayList();
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    jVar.f42684c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(jVar);
                }
                Collections.sort(arrayList4, new jg0(12));
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    }
                    arrayList3.add(jVar2.f42682a);
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(h61.k(kVar.v));
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
                            org.telegram.ui.r rVar = kVar.M;
                            if (rVar != null) {
                                rVar.run(str);
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.r rVar2 = kVar.M;
                            if (rVar2 != null) {
                                rVar2.run(str);
                                return;
                            }
                            return;
                    }
                }
            };
            int i13 = org.telegram.ui.web.d.f42619a;
            h61 J = h61.J(org.telegram.ui.web.d.class);
            J.f26795z = 1;
            J.f26782l = str;
            J.D = onClickListener;
            J.f26787q = z12;
            J.f26788r = z13;
            J.G = Boolean.TRUE;
            J.H = kVar;
            arrayList.add(J);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(h61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new r0(kVar, 15)));
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
                                org.telegram.ui.r rVar = kVar.M;
                                if (rVar != null) {
                                    rVar.run(str2);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.r rVar2 = kVar.M;
                                if (rVar2 != null) {
                                    rVar2.run(str2);
                                    return;
                                }
                                return;
                        }
                    }
                };
                int i15 = org.telegram.ui.web.d.f42619a;
                h61 J2 = h61.J(org.telegram.ui.web.d.class);
                J2.f26795z = 0;
                J2.f26782l = str2;
                J2.D = onClickListener2;
                J2.f26787q = z10;
                J2.f26788r = z11;
                J2.G = Boolean.TRUE;
                J2.H = kVar;
                arrayList.add(J2);
            }
        }
        if (iVar != null) {
            ArrayList arrayList5 = iVar.f42671a;
            if (!arrayList5.isEmpty()) {
                arrayList.add(h61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    MessageObject messageObject = (MessageObject) arrayList5.get(i16);
                    if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                        int i17 = org.telegram.ui.web.g.f42648a;
                        h61 J3 = h61.J(org.telegram.ui.web.g.class);
                        J3.f26795z = 3;
                        J3.f26787q = true;
                        J3.H = messageObject;
                        arrayList.add(J3);
                    }
                }
                if (!iVar.f42674f) {
                    arrayList.add(h61.o(arrayList.size(), 32));
                    arrayList.add(h61.o(arrayList.size(), 32));
                    arrayList.add(h61.o(arrayList.size(), 32));
                }
            }
        }
    }

    private final void b(Object obj, Object obj2) {
        u61 u61Var = (u61) obj2;
        ((ArrayList) obj).add(h61.j(-1, ((yh.v) this.f12000b).Z));
    }

    private final void c(Object obj, Object obj2) {
        u61 u61Var = (u61) obj2;
        ((ArrayList) obj).add(h61.j(-1, ((yh.c0) this.f12000b).Z));
    }

    private final void d(Object obj, Object obj2) {
        int i10;
        float f7;
        int i11;
        boolean z10;
        int i12;
        l2 l2Var = (l2) this.f12000b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ks0 ks0Var = l2Var.f50365a;
        y9 y9Var = l2Var.e;
        if (y9Var != null) {
            if ((!y9Var.e || y9Var.f2500g != 783) && y9Var.f2504l.size() <= 0) {
                y9 y9Var2 = l2Var.e;
                if (y9Var2.f2502j && !y9Var2.f2501i) {
                    return;
                }
            }
            y9 y9Var3 = l2Var.e;
            if (y9Var3 != null && (i12 = y9Var3.f2506n) != 0) {
                i10 = Math.min(3, i12);
            } else {
                i10 = 3;
            }
            int max = Math.max(1, i10);
            y9 y9Var4 = l2Var.e;
            if (y9Var4 != null) {
                ArrayList arrayList2 = y9Var4.f2504l;
                int size = arrayList2.size();
                int i13 = 3;
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z11 = l2Var.d;
                    int i15 = yh.f1.f50236a;
                    h61 J = h61.J(yh.f1.class);
                    J.f26791u = 1;
                    J.f26795z = 0;
                    J.G = savedStarGift;
                    J.f26787q = true;
                    J.f26777f = false;
                    J.f26788r = z11;
                    if (l2Var.f50369n && (l2Var.e != ks0Var.d || savedStarGift.pinned_to_top)) {
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
                if (y9Var5.f2501i || !y9Var5.f2502j) {
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
                        h61 o10 = h61.o(i16, 34);
                        o10.f26791u = 1;
                        arrayList.add(o10);
                    }
                }
            }
            if (ks0Var.d == l2Var.e) {
                arrayList.add(h61.C(AndroidUtilities.dp(20.0f)));
                if (ks0Var.f50465c == UserConfig.getInstance(l2Var.f50366b).getClientUserId()) {
                    int w02 = h6.w0(h6.f21395z6, l2Var.f50367c);
                    String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                    int dp = AndroidUtilities.dp(24.0f);
                    int i17 = m2.f50403a;
                    h61 J2 = h61.J(m2.class);
                    J2.f26782l = string;
                    J2.f26795z = 17;
                    J2.B = w02;
                    J2.A = 14.0f;
                    J2.f26779i = dp;
                    J2.f26781k = 0;
                    J2.f26787q = false;
                    arrayList.add(J2);
                }
                arrayList.add(h61.C(AndroidUtilities.dp(82.0f)));
            } else if (!arrayList.isEmpty()) {
                arrayList.add(h61.C(AndroidUtilities.dp(82.0f)));
            }
            if (!arrayList.isEmpty()) {
                if (l2Var.I) {
                    f7 = 42.0f;
                } else {
                    f7 = 12.0f;
                }
                arrayList.add(0, h61.C(AndroidUtilities.dp(f7)));
            }
            if (l2Var.f50368f.getSpanCount() != max) {
                AndroidUtilities.runOnUIThread(new yh.r1(l2Var, max, 1));
            }
            ks0Var.o();
            ks0Var.post(new tg.p(ks0Var, 19));
        }
    }

    @Override
    public final void run(java.lang.Object r33, java.lang.Object r34) {
        throw new UnsupportedOperationException("Method not decompiled: hg.o.run(java.lang.Object, java.lang.Object):void");
    }
}
