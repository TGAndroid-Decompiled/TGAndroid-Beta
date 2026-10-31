package ag;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ex0;
import ph.p3;
import ph.q3;
import ph.r3;
import rh.v5;
public final class a implements j20 {
    public final int f452a;
    public final Object f453b;

    public a(Object obj, int i10) {
        this.f452a = i10;
        this.f453b = obj;
    }

    private final void b(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.f453b;
        ArrayList arrayList = (ArrayList) obj;
        p51 p51Var = (p51) obj2;
        org.telegram.ui.web.h hVar = jVar.D;
        ArrayList arrayList2 = jVar.f43073y;
        if (!jVar.f43065b && arrayList2.isEmpty()) {
            arrayList.add(a51.k(jVar.d));
        }
        SharedPreferences sharedPreferences = jVar.getContext().getSharedPreferences("webhistory", 0);
        ArrayList arrayList3 = new ArrayList();
        String string = sharedPreferences.getString("queries_json", null);
        if (string != null) {
            try {
                ArrayList arrayList4 = new ArrayList();
                int i10 = 0;
                for (JSONArray jSONArray = new JSONArray(string); i10 < jSONArray.length(); jSONArray = jSONArray) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    org.telegram.ui.web.i iVar = new org.telegram.ui.web.i(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    iVar.f43059c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(iVar);
                    i10++;
                }
                Collections.sort(arrayList4, new ex0(8));
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    org.telegram.ui.web.i iVar2 = (org.telegram.ui.web.i) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    }
                    arrayList3.add(iVar2.f43057a);
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(a51.k(jVar.f43071w));
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
                            org.telegram.ui.p pVar = jVar.M;
                            if (pVar != null) {
                                pVar.a(str);
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.p pVar2 = jVar.M;
                            if (pVar2 != null) {
                                pVar2.a(str);
                                return;
                            }
                            return;
                    }
                }
            };
            int i13 = org.telegram.ui.web.c.f43003b;
            a51 K = a51.K(org.telegram.ui.web.c.class);
            K.f24305z = 1;
            K.f24292l = str;
            K.D = onClickListener;
            K.f24297q = z12;
            K.f24298r = z13;
            K.G = Boolean.TRUE;
            K.H = jVar;
            arrayList.add(K);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(a51.s(cd.L0(2131742938, null), cd.L0(2131742942, null), new g(jVar, 24)));
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
                                org.telegram.ui.p pVar = jVar.M;
                                if (pVar != null) {
                                    pVar.a(str2);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.p pVar2 = jVar.M;
                                if (pVar2 != null) {
                                    pVar2.a(str2);
                                    return;
                                }
                                return;
                        }
                    }
                };
                int i15 = org.telegram.ui.web.c.f43003b;
                a51 K2 = a51.K(org.telegram.ui.web.c.class);
                K2.f24305z = 0;
                K2.f24292l = str2;
                K2.D = onClickListener2;
                K2.f24297q = z10;
                K2.f24298r = z11;
                K2.G = Boolean.TRUE;
                K2.H = jVar;
                arrayList.add(K2);
            }
        }
        if (hVar != null) {
            ArrayList arrayList5 = hVar.f43048a;
            if (!arrayList5.isEmpty()) {
                arrayList.add(a51.r(cd.L0(2131742939, null)));
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    jj jjVar = (jj) arrayList5.get(i16);
                    if (!TextUtils.isEmpty(org.telegram.ui.web.j.a(jjVar))) {
                        int i17 = org.telegram.ui.web.f.f43027b;
                        a51 K3 = a51.K(org.telegram.ui.web.f.class);
                        K3.f24305z = 3;
                        K3.f24297q = true;
                        K3.H = jjVar;
                        arrayList.add(K3);
                    }
                }
                if (!hVar.f43051f) {
                    arrayList.add(a51.q(arrayList.size(), 32));
                    arrayList.add(a51.q(arrayList.size(), 32));
                    arrayList.add(a51.q(arrayList.size(), 32));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i10;
        float f7;
        int i11;
        boolean z10;
        int i12;
        ph.f2 f2Var = (ph.f2) this.f453b;
        ArrayList arrayList = (ArrayList) obj;
        p51 p51Var = (p51) obj2;
        p6 p6Var = f2Var.f45044c;
        vq0 vq0Var = f2Var.f45042a;
        v5 v5Var = f2Var.e;
        if (v5Var != null) {
            if ((!v5Var.e || v5Var.f47578g != 783) && v5Var.f47582l.size() <= 0) {
                v5 v5Var2 = f2Var.e;
                if (v5Var2.f47580j && !v5Var2.f47579i) {
                    return;
                }
            }
            v5 v5Var3 = f2Var.e;
            if (v5Var3 != null && (i12 = v5Var3.f47584n) != 0) {
                i10 = Math.min(3, i12);
            } else {
                i10 = 3;
            }
            int max = Math.max(1, i10);
            v5 v5Var4 = f2Var.e;
            if (v5Var4 != null) {
                ArrayList arrayList2 = v5Var4.f47582l;
                int size = arrayList2.size();
                int i13 = 3;
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z11 = f2Var.d;
                    int i15 = ph.b1.f44980b;
                    a51 K = a51.K(ph.b1.class);
                    K.f24301u = 1;
                    K.f24305z = 0;
                    K.G = savedStarGift;
                    K.f24297q = true;
                    K.f24287f = false;
                    K.f24298r = z11;
                    if (f2Var.h && (f2Var.e != vq0Var.d || savedStarGift.pinned_to_top)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    K.h = z10;
                    arrayList.add(K);
                    i13--;
                    if (i13 == 0) {
                        i13 = 3;
                    }
                }
                v5 v5Var5 = f2Var.e;
                if (v5Var5.f47579i || !v5Var5.f47580j) {
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
                        a51 q6 = a51.q(i16, 34);
                        q6.f24301u = 1;
                        arrayList.add(q6);
                    }
                }
            }
            if (vq0Var.d == f2Var.e) {
                arrayList.add(a51.D(org.telegram.messenger.i0.L(20.0f)));
                if (vq0Var.f45130c == d20.i(f2Var.f45043b).e()) {
                    int i17 = t6.f21330z6;
                    int w02 = t6.w0(i17, p6Var);
                    String L0 = cd.L0(2131746686, null);
                    int L = org.telegram.messenger.i0.L(24.0f);
                    int i18 = ph.g2.f45066b;
                    a51 K2 = a51.K(ph.g2.class);
                    K2.f24292l = L0;
                    K2.f24305z = 17;
                    K2.B = w02;
                    K2.A = 14.0f;
                    K2.f24289i = L;
                    K2.f24291k = 0;
                    K2.f24297q = false;
                    K2.G = p6Var;
                    K2.H = Integer.valueOf(i17);
                    arrayList.add(K2);
                }
                arrayList.add(a51.D(org.telegram.messenger.i0.L(82.0f)));
            } else if (!arrayList.isEmpty()) {
                arrayList.add(a51.D(org.telegram.messenger.i0.L(82.0f)));
            }
            if (!arrayList.isEmpty()) {
                if (f2Var.H) {
                    f7 = 42.0f;
                } else {
                    f7 = 12.0f;
                }
                arrayList.add(0, a51.D(org.telegram.messenger.i0.L(f7)));
            }
            if (f2Var.f45045f.getSpanCount() != max) {
                org.telegram.messenger.i0.g3(new ph.p1(f2Var, max, 1));
            }
            vq0Var.p();
            vq0Var.post(new ph.x1(vq0Var, 0));
        }
    }

    private final void d(Object obj, Object obj2) {
        float f7;
        float f10;
        r3 r3Var = (r3) this.f453b;
        ArrayList arrayList = (ArrayList) obj;
        p51 p51Var = (p51) obj2;
        ph.h3 h3Var = r3Var.d;
        ArrayList arrayList2 = h3Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            arrayList.add(ph.b1.i(0, (TL_stars.TL_starGiftUnique) obj3, false, false, false, true, false));
        }
        boolean z10 = true;
        if (h3Var.f45105t || !h3Var.f45106u) {
            a51 q6 = a51.q(-1, 34);
            q6.f24301u = 1;
            arrayList.add(q6);
            a51 q10 = a51.q(-2, 34);
            q10.f24301u = 1;
            arrayList.add(q10);
            a51 q11 = a51.q(-3, 34);
            q11.f24301u = 1;
            arrayList.add(q11);
            if (h3Var.d.isEmpty()) {
                a51 q12 = a51.q(-4, 34);
                q12.f24301u = 1;
                arrayList.add(q12);
                a51 q13 = a51.q(-5, 34);
                q13.f24301u = 1;
                arrayList.add(q13);
                a51 q14 = a51.q(-6, 34);
                q14.f24301u = 1;
                arrayList.add(q14);
                a51 q15 = a51.q(-7, 34);
                q15.f24301u = 1;
                arrayList.add(q15);
                a51 q16 = a51.q(-8, 34);
                q16.f24301u = 1;
                arrayList.add(q16);
                a51 q17 = a51.q(-9, 34);
                q17.f24301u = 1;
                arrayList.add(q17);
                a51 q18 = a51.q(-10, 34);
                q18.f24301u = 1;
                arrayList.add(q18);
                a51 q19 = a51.q(-11, 34);
                q19.f24301u = 1;
                arrayList.add(q19);
                a51 q20 = a51.q(-12, 34);
                q20.f24301u = 1;
                arrayList.add(q20);
                a51 q21 = a51.q(-13, 34);
                q21.f24301u = 1;
                arrayList.add(q21);
                a51 q22 = a51.q(-14, 34);
                q22.f24301u = 1;
                arrayList.add(q22);
                a51 q23 = a51.q(-15, 34);
                q23.f24301u = 1;
                arrayList.add(q23);
            }
        }
        if (!arrayList.isEmpty() || h3Var.f45105t) {
            z10 = false;
        }
        if (r3Var.f45301y == z10) {
            return;
        }
        r3Var.f45301y = z10;
        r3Var.f45300x.setVisibility(0);
        ViewPropertyAnimator animate = r3Var.f45300x.animate();
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.95f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.95f;
        }
        scaleX.scaleY(f11).setInterpolator(gr.h).setDuration(320L).setListener(new ph.t2(r3Var, z10, 1)).start();
    }

    private final void e(Object obj, Object obj2) {
        boolean z10;
        q3 q3Var = (q3) this.f453b;
        ArrayList arrayList = (ArrayList) obj;
        p51 p51Var = (p51) obj2;
        p3 p3Var = q3Var.Q1;
        if (p3Var != null) {
            v5 v5Var = p3Var.f45270b;
            ph.h3 h3Var = p3Var.f45271c;
            if (v5Var != null && h3Var != null) {
                int currentTime = ConnectionsManager.getInstance(q3Var.f21583a).getCurrentTime();
                arrayList.add(a51.t(-1, cd.L0(2131749779, null)));
                ArrayList arrayList2 = v5Var.f47582l;
                int size = arrayList2.size();
                boolean z11 = true;
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z12 = z11;
                    if (q3Var.Y1.contains(Long.valueOf(savedStarGift.gift.f20021id))) {
                        z11 = z12;
                    } else {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a51 i12 = ph.b1.i(0, savedStarGift.gift, false, true, false, false, true);
                        i12.f24288g = z10;
                        arrayList.add(i12);
                        i10++;
                        z11 = false;
                    }
                }
                boolean z13 = z11;
                int i13 = 1;
                if (!v5Var.f47579i && v5Var.f47580j) {
                    if (z13) {
                        arrayList.add(a51.g(cd.L0(2131749778, null)));
                    }
                } else {
                    int i14 = i10 % 3;
                    int i15 = 6 - i14;
                    int i16 = 0;
                    while (i16 < i15) {
                        a51 q6 = a51.q((i16 - i14) + 1, 35);
                        q6.f24301u = i13;
                        arrayList.add(q6);
                        i16++;
                        i13 = 1;
                    }
                }
                if (h3Var.e > 0 || q3Var.f45281b2) {
                    q3Var.f45281b2 = true;
                    String L0 = cd.L0(2131749781, null);
                    a51 a51Var = new a51(42);
                    a51Var.d = -2;
                    a51Var.f24295o = L0;
                    arrayList.add(a51Var);
                    HorizontalScrollView horizontalScrollView = q3Var.R1;
                    if (horizontalScrollView != null) {
                        arrayList.add(a51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = h3Var.d;
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList3.get(i17);
                        i17++;
                        arrayList.add(ph.b1.i(0, (TL_stars.TL_starGiftUnique) obj4, false, true, false, true, true));
                    }
                    if (h3Var.f45105t || !h3Var.f45106u) {
                        a51 q10 = a51.q(10, 35);
                        q10.f24301u = 1;
                        arrayList.add(q10);
                        a51 q11 = a51.q(11, 35);
                        q11.f24301u = 1;
                        arrayList.add(q11);
                        a51 q12 = a51.q(12, 35);
                        q12.f24301u = 1;
                        arrayList.add(q12);
                        a51 q13 = a51.q(13, 35);
                        q13.f24301u = 1;
                        arrayList.add(q13);
                        a51 q14 = a51.q(14, 35);
                        q14.f24301u = 1;
                        arrayList.add(q14);
                        a51 q15 = a51.q(15, 35);
                        q15.f24301u = 1;
                        arrayList.add(q15);
                    }
                }
            }
        }
    }

    @Override
    public final void a(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: ag.a.a(java.lang.Object, java.lang.Object):void");
    }
}
