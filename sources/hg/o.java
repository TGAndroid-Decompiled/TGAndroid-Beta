package hg;

import ai.x9;
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
import org.telegram.ui.lg0;
import yh.m2;
import yh.n2;
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
        final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f12001b;
        ArrayList arrayList = (ArrayList) obj;
        s61 s61Var = (s61) obj2;
        org.telegram.ui.web.i iVar = kVar.f42655y;
        ArrayList arrayList2 = kVar.f42654x;
        if (!kVar.f42647b && arrayList2.isEmpty()) {
            arrayList.add(f61.k(kVar.d));
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
                    jVar.f42636c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(jVar);
                }
                Collections.sort(arrayList4, new lg0(12));
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    }
                    arrayList3.add(jVar2.f42634a);
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(f61.k(kVar.v));
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
            int i13 = org.telegram.ui.web.d.f42571a;
            f61 J = f61.J(org.telegram.ui.web.d.class);
            J.f26153z = 1;
            J.f26140l = str;
            J.D = onClickListener;
            J.f26145q = z12;
            J.f26146r = z13;
            J.G = Boolean.TRUE;
            J.H = kVar;
            arrayList.add(J);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(f61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new r0(kVar, 15)));
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
                int i15 = org.telegram.ui.web.d.f42571a;
                f61 J2 = f61.J(org.telegram.ui.web.d.class);
                J2.f26153z = 0;
                J2.f26140l = str2;
                J2.D = onClickListener2;
                J2.f26145q = z10;
                J2.f26146r = z11;
                J2.G = Boolean.TRUE;
                J2.H = kVar;
                arrayList.add(J2);
            }
        }
        if (iVar != null) {
            ArrayList arrayList5 = iVar.f42623a;
            if (!arrayList5.isEmpty()) {
                arrayList.add(f61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    MessageObject messageObject = (MessageObject) arrayList5.get(i16);
                    if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                        int i17 = org.telegram.ui.web.g.f42600a;
                        f61 J3 = f61.J(org.telegram.ui.web.g.class);
                        J3.f26153z = 3;
                        J3.f26145q = true;
                        J3.H = messageObject;
                        arrayList.add(J3);
                    }
                }
                if (!iVar.f42626f) {
                    arrayList.add(f61.o(arrayList.size(), 32));
                    arrayList.add(f61.o(arrayList.size(), 32));
                    arrayList.add(f61.o(arrayList.size(), 32));
                }
            }
        }
    }

    private final void b(Object obj, Object obj2) {
        s61 s61Var = (s61) obj2;
        ((ArrayList) obj).add(f61.j(-1, ((yh.w) this.f12001b).Z));
    }

    private final void c(Object obj, Object obj2) {
        s61 s61Var = (s61) obj2;
        ((ArrayList) obj).add(f61.j(-1, ((yh.d0) this.f12001b).Z));
    }

    private final void d(Object obj, Object obj2) {
        int i10;
        float f7;
        int i11;
        boolean z10;
        int i12;
        m2 m2Var = (m2) this.f12001b;
        ArrayList arrayList = (ArrayList) obj;
        s61 s61Var = (s61) obj2;
        is0 is0Var = m2Var.f50394a;
        x9 x9Var = m2Var.e;
        if (x9Var != null) {
            if ((!x9Var.e || x9Var.f2444g != 783) && x9Var.f2448l.size() <= 0) {
                x9 x9Var2 = m2Var.e;
                if (x9Var2.f2446j && !x9Var2.f2445i) {
                    return;
                }
            }
            x9 x9Var3 = m2Var.e;
            if (x9Var3 != null && (i12 = x9Var3.f2450n) != 0) {
                i10 = Math.min(3, i12);
            } else {
                i10 = 3;
            }
            int max = Math.max(1, i10);
            x9 x9Var4 = m2Var.e;
            if (x9Var4 != null) {
                ArrayList arrayList2 = x9Var4.f2448l;
                int size = arrayList2.size();
                int i13 = 3;
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z11 = m2Var.d;
                    int i15 = yh.g1.f50265a;
                    f61 J = f61.J(yh.g1.class);
                    J.f26149u = 1;
                    J.f26153z = 0;
                    J.G = savedStarGift;
                    J.f26145q = true;
                    J.f26135f = false;
                    J.f26146r = z11;
                    if (m2Var.f50398n && (m2Var.e != is0Var.d || savedStarGift.pinned_to_top)) {
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
                x9 x9Var5 = m2Var.e;
                if (x9Var5.f2445i || !x9Var5.f2446j) {
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
            if (is0Var.d == m2Var.e) {
                arrayList.add(f61.C(AndroidUtilities.dp(20.0f)));
                if (is0Var.f50494c == UserConfig.getInstance(m2Var.f50395b).getClientUserId()) {
                    int w02 = h6.w0(h6.f21391z6, m2Var.f50396c);
                    String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                    int dp = AndroidUtilities.dp(24.0f);
                    int i17 = n2.f50432a;
                    f61 J2 = f61.J(n2.class);
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
                if (m2Var.I) {
                    f7 = 42.0f;
                } else {
                    f7 = 12.0f;
                }
                arrayList.add(0, f61.C(AndroidUtilities.dp(f7)));
            }
            if (m2Var.f50397f.getSpanCount() != max) {
                AndroidUtilities.runOnUIThread(new yh.s1(m2Var, max, 1));
            }
            is0Var.o();
            is0Var.post(new tg.p(is0Var, 19));
        }
    }

    @Override
    public final void run(java.lang.Object r33, java.lang.Object r34) {
        throw new UnsupportedOperationException("Method not decompiled: hg.o.run(java.lang.Object, java.lang.Object):void");
    }
}
