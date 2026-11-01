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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.dx0;
import ph.p3;
import ph.q3;
import ph.r3;
import rh.v5;
public final class a implements k20 {
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
        q51 q51Var = (q51) obj2;
        org.telegram.ui.web.h hVar = jVar.D;
        ArrayList arrayList2 = jVar.f42875y;
        if (!jVar.f42867b && arrayList2.isEmpty()) {
            arrayList.add(b51.k(jVar.d));
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
                    iVar.f42861c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(iVar);
                    i10++;
                }
                Collections.sort(arrayList4, new dx0(8));
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    org.telegram.ui.web.i iVar2 = (org.telegram.ui.web.i) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    }
                    arrayList3.add(iVar2.f42859a);
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(b51.k(jVar.f42873w));
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
            int i13 = org.telegram.ui.web.c.f42805b;
            b51 K = b51.K(org.telegram.ui.web.c.class);
            K.f24656z = 1;
            K.f24643l = str;
            K.D = onClickListener;
            K.f24648q = z12;
            K.f24649r = z13;
            K.G = Boolean.TRUE;
            K.H = jVar;
            arrayList.add(K);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(b51.s(dd.L0(2131742938, null), dd.L0(2131742942, null), new g(jVar, 24)));
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
                int i15 = org.telegram.ui.web.c.f42805b;
                b51 K2 = b51.K(org.telegram.ui.web.c.class);
                K2.f24656z = 0;
                K2.f24643l = str2;
                K2.D = onClickListener2;
                K2.f24648q = z10;
                K2.f24649r = z11;
                K2.G = Boolean.TRUE;
                K2.H = jVar;
                arrayList.add(K2);
            }
        }
        if (hVar != null) {
            ArrayList arrayList5 = hVar.f42850a;
            if (!arrayList5.isEmpty()) {
                arrayList.add(b51.r(dd.L0(2131742939, null)));
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    kj kjVar = (kj) arrayList5.get(i16);
                    if (!TextUtils.isEmpty(org.telegram.ui.web.j.a(kjVar))) {
                        int i17 = org.telegram.ui.web.f.f42829b;
                        b51 K3 = b51.K(org.telegram.ui.web.f.class);
                        K3.f24656z = 3;
                        K3.f24648q = true;
                        K3.H = kjVar;
                        arrayList.add(K3);
                    }
                }
                if (!hVar.f42853f) {
                    arrayList.add(b51.q(arrayList.size(), 32));
                    arrayList.add(b51.q(arrayList.size(), 32));
                    arrayList.add(b51.q(arrayList.size(), 32));
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
        q51 q51Var = (q51) obj2;
        p6 p6Var = f2Var.f45055c;
        wq0 wq0Var = f2Var.f45053a;
        v5 v5Var = f2Var.e;
        if (v5Var != null) {
            if ((!v5Var.e || v5Var.f47592g != 783) && v5Var.f47596l.size() <= 0) {
                v5 v5Var2 = f2Var.e;
                if (v5Var2.f47594j && !v5Var2.f47593i) {
                    return;
                }
            }
            v5 v5Var3 = f2Var.e;
            if (v5Var3 != null && (i12 = v5Var3.f47598n) != 0) {
                i10 = Math.min(3, i12);
            } else {
                i10 = 3;
            }
            int max = Math.max(1, i10);
            v5 v5Var4 = f2Var.e;
            if (v5Var4 != null) {
                ArrayList arrayList2 = v5Var4.f47596l;
                int size = arrayList2.size();
                int i13 = 3;
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z11 = f2Var.d;
                    int i15 = ph.b1.f44991b;
                    b51 K = b51.K(ph.b1.class);
                    K.f24652u = 1;
                    K.f24656z = 0;
                    K.G = savedStarGift;
                    K.f24648q = true;
                    K.f24638f = false;
                    K.f24649r = z11;
                    if (f2Var.h && (f2Var.e != wq0Var.d || savedStarGift.pinned_to_top)) {
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
                if (v5Var5.f47593i || !v5Var5.f47594j) {
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
                        b51 q6 = b51.q(i16, 34);
                        q6.f24652u = 1;
                        arrayList.add(q6);
                    }
                }
            }
            if (wq0Var.d == f2Var.e) {
                arrayList.add(b51.D(org.telegram.messenger.i0.L(20.0f)));
                if (wq0Var.f45141c == e20.i(f2Var.f45054b).e()) {
                    int i17 = t6.f21331z6;
                    int w02 = t6.w0(i17, p6Var);
                    String L0 = dd.L0(2131746686, null);
                    int L = org.telegram.messenger.i0.L(24.0f);
                    int i18 = ph.g2.f45077b;
                    b51 K2 = b51.K(ph.g2.class);
                    K2.f24643l = L0;
                    K2.f24656z = 17;
                    K2.B = w02;
                    K2.A = 14.0f;
                    K2.f24640i = L;
                    K2.f24642k = 0;
                    K2.f24648q = false;
                    K2.G = p6Var;
                    K2.H = Integer.valueOf(i17);
                    arrayList.add(K2);
                }
                arrayList.add(b51.D(org.telegram.messenger.i0.L(82.0f)));
            } else if (!arrayList.isEmpty()) {
                arrayList.add(b51.D(org.telegram.messenger.i0.L(82.0f)));
            }
            if (!arrayList.isEmpty()) {
                if (f2Var.H) {
                    f7 = 42.0f;
                } else {
                    f7 = 12.0f;
                }
                arrayList.add(0, b51.D(org.telegram.messenger.i0.L(f7)));
            }
            if (f2Var.f45056f.getSpanCount() != max) {
                org.telegram.messenger.i0.g3(new ph.p1(f2Var, max, 1));
            }
            wq0Var.p();
            wq0Var.post(new ph.x1(wq0Var, 0));
        }
    }

    private final void d(Object obj, Object obj2) {
        float f7;
        float f10;
        r3 r3Var = (r3) this.f453b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
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
        if (h3Var.f45116t || !h3Var.f45117u) {
            b51 q6 = b51.q(-1, 34);
            q6.f24652u = 1;
            arrayList.add(q6);
            b51 q10 = b51.q(-2, 34);
            q10.f24652u = 1;
            arrayList.add(q10);
            b51 q11 = b51.q(-3, 34);
            q11.f24652u = 1;
            arrayList.add(q11);
            if (h3Var.d.isEmpty()) {
                b51 q12 = b51.q(-4, 34);
                q12.f24652u = 1;
                arrayList.add(q12);
                b51 q13 = b51.q(-5, 34);
                q13.f24652u = 1;
                arrayList.add(q13);
                b51 q14 = b51.q(-6, 34);
                q14.f24652u = 1;
                arrayList.add(q14);
                b51 q15 = b51.q(-7, 34);
                q15.f24652u = 1;
                arrayList.add(q15);
                b51 q16 = b51.q(-8, 34);
                q16.f24652u = 1;
                arrayList.add(q16);
                b51 q17 = b51.q(-9, 34);
                q17.f24652u = 1;
                arrayList.add(q17);
                b51 q18 = b51.q(-10, 34);
                q18.f24652u = 1;
                arrayList.add(q18);
                b51 q19 = b51.q(-11, 34);
                q19.f24652u = 1;
                arrayList.add(q19);
                b51 q20 = b51.q(-12, 34);
                q20.f24652u = 1;
                arrayList.add(q20);
                b51 q21 = b51.q(-13, 34);
                q21.f24652u = 1;
                arrayList.add(q21);
                b51 q22 = b51.q(-14, 34);
                q22.f24652u = 1;
                arrayList.add(q22);
                b51 q23 = b51.q(-15, 34);
                q23.f24652u = 1;
                arrayList.add(q23);
            }
        }
        if (!arrayList.isEmpty() || h3Var.f45116t) {
            z10 = false;
        }
        if (r3Var.f45312y == z10) {
            return;
        }
        r3Var.f45312y = z10;
        r3Var.f45311x.setVisibility(0);
        ViewPropertyAnimator animate = r3Var.f45311x.animate();
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
        q51 q51Var = (q51) obj2;
        p3 p3Var = q3Var.Q1;
        if (p3Var != null) {
            v5 v5Var = p3Var.f45281b;
            ph.h3 h3Var = p3Var.f45282c;
            if (v5Var != null && h3Var != null) {
                int currentTime = ConnectionsManager.getInstance(q3Var.f21584a).getCurrentTime();
                arrayList.add(b51.t(-1, dd.L0(2131749779, null)));
                ArrayList arrayList2 = v5Var.f47596l;
                int size = arrayList2.size();
                boolean z11 = true;
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z12 = z11;
                    if (q3Var.Y1.contains(Long.valueOf(savedStarGift.gift.f20022id))) {
                        z11 = z12;
                    } else {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b51 i12 = ph.b1.i(0, savedStarGift.gift, false, true, false, false, true);
                        i12.f24639g = z10;
                        arrayList.add(i12);
                        i10++;
                        z11 = false;
                    }
                }
                boolean z13 = z11;
                int i13 = 1;
                if (!v5Var.f47593i && v5Var.f47594j) {
                    if (z13) {
                        arrayList.add(b51.g(dd.L0(2131749778, null)));
                    }
                } else {
                    int i14 = i10 % 3;
                    int i15 = 6 - i14;
                    int i16 = 0;
                    while (i16 < i15) {
                        b51 q6 = b51.q((i16 - i14) + 1, 35);
                        q6.f24652u = i13;
                        arrayList.add(q6);
                        i16++;
                        i13 = 1;
                    }
                }
                if (h3Var.e > 0 || q3Var.f45292b2) {
                    q3Var.f45292b2 = true;
                    String L0 = dd.L0(2131749781, null);
                    b51 b51Var = new b51(42);
                    b51Var.d = -2;
                    b51Var.f24646o = L0;
                    arrayList.add(b51Var);
                    HorizontalScrollView horizontalScrollView = q3Var.R1;
                    if (horizontalScrollView != null) {
                        arrayList.add(b51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = h3Var.d;
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList3.get(i17);
                        i17++;
                        arrayList.add(ph.b1.i(0, (TL_stars.TL_starGiftUnique) obj4, false, true, false, true, true));
                    }
                    if (h3Var.f45116t || !h3Var.f45117u) {
                        b51 q10 = b51.q(10, 35);
                        q10.f24652u = 1;
                        arrayList.add(q10);
                        b51 q11 = b51.q(11, 35);
                        q11.f24652u = 1;
                        arrayList.add(q11);
                        b51 q12 = b51.q(12, 35);
                        q12.f24652u = 1;
                        arrayList.add(q12);
                        b51 q13 = b51.q(13, 35);
                        q13.f24652u = 1;
                        arrayList.add(q13);
                        b51 q14 = b51.q(14, 35);
                        q14.f24652u = 1;
                        arrayList.add(q14);
                        b51 q15 = b51.q(15, 35);
                        q15.f24652u = 1;
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
