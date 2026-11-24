package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k17 extends q59 implements jm7 {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public vh6 E;
    public String E0;
    public g17 F;
    public int F0;
    public String G;
    public fr6 G0;
    public i17 H;
    public yv1 H0;
    public i17 I;
    public final ylb I0;
    public ArrayList J;
    public ArrayList K;
    public final e7a K0;
    public ArrayList L;
    public Object[] L0;
    public String M;
    public ArrayList N;
    public ArrayList O;
    public String[] P;
    public ArrayList Q;
    public ArrayList R;
    public ArrayList S;
    public long T;
    public TLRPC.TL_inlineBotSwitchPM U;
    public TLRPC.TL_inlineBotWebView V;
    public final p17 W;
    public vh6 X;
    public int Y;
    public int Z;
    public String a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public ArrayList e0;
    public final Context h;
    public int h0;
    public int j0;
    public int k0;
    public boolean l0;
    public TLRPC.Chat m0;
    public long n;
    public w04 o0;
    public boolean p0;
    public fp6 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final bu9 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public d17 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = z8c.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final c17 J0 = new c17(this, new b17(this));
    public boolean M0 = false;
    public int N0 = -1;

    public k17(Context context, long j, long j2, p17 p17Var, ylb ylbVar, boolean z) {
        this.I0 = ylbVar;
        this.h = context;
        this.W = p17Var;
        this.n = j;
        this.s = z;
        this.r = j2;
        bu9 bu9Var = new bu9(true);
        this.x = bu9Var;
        bu9Var.a = new lj4(this);
        e7a e7aVar = (e7a) new ov0(nm7.f(this.f), this).b;
        e7aVar.b(nm7.X0);
        e7aVar.b(nm7.x0);
        this.K0 = e7aVar;
        e7aVar.b(nm7.Y1);
        e7aVar.b(nm7.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if ((this.x0 == null || this.i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (z8c.h(this.f).p() || !k47.W3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new j17(str, document));
                this.C0.put(str2, document);
                w04 w04Var = this.o0;
                if (w04Var != null) {
                    w04Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            Object obj = str;
            while (i < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
                String str2 = document.dc_id + "_" + document.id;
                HashMap hashMap = this.C0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (z8c.h(this.f).p() || !k47.W3(document))) {
                    int size2 = document.attributes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                        i2++;
                    }
                    if (this.B0 == null) {
                        this.B0 = new ArrayList();
                        this.C0 = new HashMap();
                    }
                    this.B0.add(new j17(obj, document));
                    this.C0.put(str2, document);
                }
                i++;
                obj = obj;
            }
        }
    }

    public final void G() {
        yv1 yv1Var = this.H0;
        if (yv1Var != null && yv1Var.getParentActivity() != null) {
            if (this.H0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.H0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.x0;
            if (user != null && user.bot_inline_geo) {
                this.J0.m();
            }
        }
    }

    public final void H() {
        if (this.B0 == null) {
            return;
        }
        ArrayList arrayList = this.D0;
        arrayList.clear();
        int min = Math.min(6, this.B0.size());
        for (int i = 0; i < min; i++) {
            j17 j17Var = (j17) this.B0.get(i);
            TLRPC.PhotoSize w = bc4.w(j17Var.a.thumbs, 90, false, null, false);
            if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
                bc4.G(this.f);
                if (!bc4.J(w, "webp", true, true).exists()) {
                    arrayList.add(bc4.r("webp", w));
                    bc4.G(this.f).V(gn5.c(w, j17Var.a), j17Var.b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.x0;
        if (user != null && user.id != this.T) {
            return null;
        }
        return this.U;
    }

    public final java.lang.Object J(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k17.J(int):java.lang.Object");
    }

    public final int K() {
        int i;
        int size;
        int size2;
        int i2 = 1;
        if (this.x0 != null && !this.i0) {
            return 1;
        }
        int i3 = 0;
        if (this.G != null) {
            i = 2;
        } else {
            i = 0;
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            size2 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                int size3 = arrayList2.size();
                if (this.U == null && this.V == null) {
                    i2 = 0;
                }
                return size3 + i2 + i;
            }
            ArrayList arrayList3 = this.y;
            if (arrayList3 != null) {
                size2 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null) {
                    size2 = arrayList4.size();
                } else if (this.K == null && this.N == null) {
                    ArrayList arrayList5 = this.O;
                    if (arrayList5 != null) {
                        size2 = arrayList5.size();
                    } else {
                        return i;
                    }
                } else {
                    ArrayList arrayList6 = this.N;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.K;
                    if (arrayList7 != null) {
                        i3 = arrayList7.size();
                    }
                    return size + i3 + i;
                }
            }
        }
        return size2 + i;
    }

    public final Object L(int i) {
        if (this.G != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return ((j17) this.B0.get(i)).b;
    }

    public final int M(int i) {
        if (this.G != null) {
            if (i < 2) {
                return 0;
            }
            i -= 2;
        }
        if (this.S != null) {
            if (this.U != null || this.V != null) {
                return i - 1;
            }
            return i;
        }
        return i;
    }

    public final boolean N() {
        if (this.B0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        c17 c17Var = this.J0;
        if (c17Var != null) {
            c17Var.n();
        }
        d17 d17Var = this.z0;
        if (d17Var != null) {
            gm.r(d17Var);
            this.z0 = null;
        }
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        this.x0 = null;
        this.U = null;
        this.i0 = true;
        this.r0 = null;
        this.s0 = null;
        this.w0 = false;
        this.K0.a();
    }

    public final void Q() {
        TLRPC.User user = this.x0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(-1000.0d);
            this.A0.setLongitude(-1000.0d);
            T(true, this.x0, this.s0, "");
        }
    }

    public final void R(TLRPC.User user) {
        k17 k17Var;
        yv1 yv1Var;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.n();
        p17 p17Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.x0 = user;
            long j = user.id;
            if (j != this.T) {
                this.U = null;
                this.T = j;
            }
            yv1 yv1Var2 = this.H0;
            if (yv1Var2 != null && (chat = yv1Var2.e) != null) {
                boolean t = sd2.t(chat);
                this.i0 = t;
                if (!t) {
                    f();
                    p17Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = oc7.r1(this.f).W3;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.x0.id, false) && (yv1Var = this.H0) != null && yv1Var.getParentActivity() != null) {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = jb6.M0(2131745157, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131745158, null);
                    boolean[] zArr = new boolean[1];
                    k17Var = this;
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new wu2(k17Var, zArr, user2, false, (byte) 19));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new cz6(k17Var, zArr, (byte) 4));
                    k17Var.H0.showDialog(heVar, new dg(k17Var, zArr, (byte) 11));
                } else {
                    k17Var = this;
                    k17Var.G();
                }
            } else {
                k17Var = this;
            }
        } else {
            k17Var = this;
            k17Var.x0 = null;
            k17Var.U = null;
            k17Var.i0 = true;
        }
        if (k17Var.x0 == null) {
            k17Var.w0 = true;
            k17Var.U = null;
            return;
        }
        if (p17Var != null) {
            p17Var.b(true);
        }
        k17Var.T(true, k17Var.x0, k17Var.s0, "");
    }

    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.x0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.s0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.x0;
            p17 p17Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                }
                p17Var.a(false);
            }
            d17 d17Var = this.z0;
            if (d17Var != null) {
                gm.r(d17Var);
                this.z0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.r0) != null && !str3.equals(str))) {
                if (this.u0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                    this.u0 = 0;
                }
                if (this.v0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                    this.v0 = 0;
                }
                this.x0 = null;
                this.U = null;
                this.i0 = true;
                this.r0 = null;
                this.s0 = null;
                this.J0.n();
                this.w0 = false;
                if (p17Var != null) {
                    p17Var.b(false);
                }
                if (str == null || str.length() == 0) {
                    return;
                }
            }
            if (str2 == null) {
                if (this.v0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                    this.v0 = 0;
                }
                this.s0 = null;
                if (p17Var != null) {
                    p17Var.b(false);
                    return;
                }
                return;
            }
            if (p17Var != null) {
                if (this.x0 != null) {
                    p17Var.b(true);
                } else if (str.equals("gif")) {
                    this.r0 = "gif";
                    p17Var.b(false);
                }
            }
            oc7 r1 = oc7.r1(this.f);
            cf7 Y = cf7.Y(this.f);
            this.s0 = str2;
            d17 d17Var2 = new d17(this, str2, str, r1, Y);
            this.z0 = d17Var2;
            gm.d3(d17Var2, 400L);
        }
    }

    public final void T(boolean z, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        if (this.i0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.A0 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.n);
                    sb.append("_");
                    sb.append(str);
                    wi8.z("_", str2, "_", sb);
                    sb.append(this.n);
                    sb.append("_");
                    sb.append(user.id);
                    sb.append("_");
                    if (user.bot_inline_geo && this.A0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    String sb2 = sb.toString();
                    cf7 Y = cf7.Y(this.f);
                    a17 a17Var = new a17(this, str, z, user, str2, Y, sb2);
                    long j = user.id;
                    if (j != this.T) {
                        this.U = null;
                        this.T = j;
                    }
                    if (z) {
                        Y.L(sb2, a17Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = oc7.r1(this.f).p1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = gm.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = gm.b0(this.A0.getLongitude());
                    }
                    if (pg3.B(this.n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = oc7.r1(this.f).i1(this.n);
                    }
                    this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, a17Var, 2);
                    return;
                }
                return;
            }
            this.s0 = null;
            return;
        }
        p17 p17Var = this.W;
        if (p17Var != null) {
            p17Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r29, int r30, java.util.ArrayList r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k17.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(TLRPC.ChatFull chatFull) {
        yv1 yv1Var;
        TLRPC.Chat chat;
        this.f = z8c.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (yv1Var = this.H0) != null && (chat = yv1Var.e) != null) {
            boolean t = sd2.t(chat);
            this.i0 = t;
            if (t) {
                this.y = null;
                f();
                this.W.a(false);
                R(this.x0);
            }
        }
        String str = this.a0;
        if (str != null) {
            U(str, this.d0, this.e0, this.c0, this.b0);
        }
    }

    public final void W(vh6 vh6Var, ArrayList arrayList, boolean z) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || m9c.C(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = vh6Var;
        fp6 fp6Var = this.q0;
        if (fp6Var != null) {
            gm.r(fp6Var);
            this.q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z) {
            f();
            this.W.a(!this.y.isEmpty());
        }
    }

    @Override
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override
    public final int d(int i) {
        if (this.G != null) {
            if (i < 2) {
                return 6;
            }
            i -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.x0 != null && !this.i0) {
            return 3;
        }
        if (this.S != null) {
            if (i == 0) {
                if (this.U != null || this.V != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.N;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fr6 fr6Var;
        boolean z = false;
        if (i != nm7.Y1 && i != nm7.Z1) {
            if (i == nm7.X0) {
                fr6 fr6Var2 = this.G0;
                if (fr6Var2 != null) {
                    gm.c3(fr6Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i == nm7.x0 && ((Integer) objArr[0]).intValue() == 0 && (fr6Var = this.G0) != null) {
                gm.c3(fr6Var);
                this.G0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.D0;
            if (!arrayList2.isEmpty() && this.p0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z = true;
                    }
                    this.W.a(z);
                }
            }
        }
    }

    @Override
    public final void f() {
        boolean z;
        ds6 ds6Var;
        String str;
        String str2;
        int i = this.N0;
        p17 p17Var = this.W;
        int i2 = 0;
        if (i != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            if (i != K) {
                z = true;
            } else {
                z = false;
            }
            int min = Math.min(i, K);
            Object[] objArr = new Object[K];
            for (int i3 = 0; i3 < K; i3++) {
                objArr[i3] = J(i3);
            }
            while (i2 < min) {
                if (i2 >= 0) {
                    Object[] objArr2 = this.L0;
                    if (i2 < objArr2.length && i2 < K) {
                        Object obj = objArr2[i2];
                        Object obj2 = objArr[i2];
                        if (!(obj instanceof oz8)) {
                            if (obj != obj2 && ((!(obj instanceof j17) || !(obj2 instanceof j17) || ((j17) obj).a != ((j17) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof ds6) && (obj2 instanceof ds6) && (str = (ds6Var = (ds6) obj).b) != null) {
                                    ds6 ds6Var2 = (ds6) obj2;
                                    if (str.equals(ds6Var2.b) && (str2 = ds6Var.a) != null && str2.equals(ds6Var2.a)) {
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                g(i2);
                z = true;
                i2++;
            }
            q(min, i - min);
            p(min, K - min);
            if (z && p17Var != null) {
                p17Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (p17Var != null) {
            this.N0 = K();
            p17Var.c();
        }
        super.f();
        int K2 = K();
        this.N0 = K2;
        this.L0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.L0;
            if (i2 < objArr3.length) {
                objArr3[i2] = J(i2);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        String str;
        TLRPC.User user;
        Boolean bool;
        yv1 yv1Var;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f;
        String str3 = this.G;
        if (str3 != null) {
            i2 = i - 2;
        } else {
            i2 = i;
        }
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 4) {
            v0b v0bVar = (v0b) view;
            if (i2 >= 0 && i2 < this.B0.size()) {
                j17 j17Var = (j17) this.B0.get(i2);
                TLRPC.Document document = j17Var.a;
                Object obj = j17Var.b;
                pj8 pj8Var = v0bVar.n;
                bf0 bf0Var = v0bVar.a;
                v0bVar.c = obj;
                boolean W3 = k47.W3(document);
                v0bVar.s = W3;
                if (W3) {
                    pj8Var.setColor(cmb.w0(null, cmb.c6, false));
                    pj8Var.I = true;
                    pj8Var.J = false;
                    pj8Var.invalidate();
                }
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                meb f2 = eq3.f(document, cmb.Z6, 1.0f, v0bVar.w);
                if (k47.p(document)) {
                    if (f2 != null) {
                        bf0Var.n(gn5.b(document), "80_80", null, f2, v0bVar.c);
                        f = 1.0f;
                    } else if (w != null) {
                        f = 1.0f;
                        bf0Var.h(gn5.b(document), "80_80", gn5.c(w, document), null, 0, v0bVar.c);
                    } else {
                        f = 1.0f;
                        bf0Var.n(gn5.b(document), "80_80", null, null, v0bVar.c);
                    }
                } else {
                    f = 1.0f;
                    if (f2 != null) {
                        if (w != null) {
                            bf0Var.n(gn5.c(w, document), null, "webp", f2, v0bVar.c);
                        } else {
                            bf0Var.n(gn5.b(document), null, "webp", f2, v0bVar.c);
                        }
                    } else {
                        bf0Var.n(gn5.c(w, document), null, "webp", null, v0bVar.c);
                    }
                }
                v0bVar.b = document;
                Drawable background = v0bVar.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    anb.x(v0bVar, background, cmb.sf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (v0bVar.s) {
                    v0bVar.r = true;
                } else {
                    v0bVar.r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pj8Var.getLayoutParams();
                if (!z8c.h(z8c.t0).p()) {
                    int L = gm.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
                } else {
                    int L2 = gm.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = gm.L(8.0f);
                    layoutParams.rightMargin = gm.L(8.0f);
                    pj8Var.setPadding(gm.L(f), gm.L(f), gm.L(f), gm.L(f));
                }
                pj8Var.setLocked(!z8c.h(z8c.t0).p());
                gm.T3(pj8Var, v0bVar.r, 0.9f, true, false);
                v0bVar.invalidate();
                v0bVar.setClearsInputField(true);
            }
        } else if (i3 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!sd2.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(jb6.M0(2131749318, null));
                } else if (gm.B1(chat.banned_rights)) {
                    textView.setText(jb6.M0(2131753932, null));
                } else {
                    textView.setText(jb6.a0("AttachInlineRestricted", null, 2131753933, jb6.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i3 == 5) {
            kz8 kz8Var = (kz8) view;
            ArrayList arrayList = this.N;
            if (arrayList != null && i2 >= 0 && i2 < arrayList.size()) {
                kz8Var.a((oz8) this.N.get(i2), this.M, false);
            }
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
                if (tL_inlineBotSwitchPM == null && this.V == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 == 2) {
                    if (z) {
                        pu0 pu0Var = (pu0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.V.text;
                        }
                        pu0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z) {
                    i2--;
                }
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    lx2 lx2Var = (lx2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.S.get(i2);
                    TLRPC.User user2 = this.x0;
                    boolean z4 = this.y0;
                    if (i2 != this.S.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z && i2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    lx2Var.e(botInlineResult, user2, z4, z2, z3, "gif".equals(this.r0));
                }
            } else if (i3 == 6) {
                i17 i17Var = (i17) view;
                int i4 = i2 + 2;
                if (i4 == 0) {
                    this.H = i17Var;
                } else {
                    this.I = i17Var;
                }
                TLRPC.Chat chat2 = this.m0;
                if (chat2 == null && (yv1Var = this.H0) != null) {
                    chat2 = yv1Var.e;
                }
                i17Var.a(i4, str3, chat2);
            } else if (i3 == 7) {
            } else {
                y07 y07Var = (y07) view;
                ArrayList arrayList3 = this.y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i2);
                    if (tLObject instanceof TLRPC.User) {
                        y07Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        y07Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null && i2 >= 0 && i2 < arrayList4.size()) {
                        y07Var.setText((String) this.J.get(i2));
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null && i2 >= 0 && i2 < arrayList5.size()) {
                            y07Var.setEmojiSuggestion((ds6) this.O.get(i2));
                        } else {
                            ArrayList arrayList6 = this.K;
                            if (arrayList6 != null && i2 >= 0 && i2 < arrayList6.size()) {
                                ArrayList arrayList7 = this.L;
                                if (arrayList7 != null && i2 >= 0 && i2 < arrayList7.size()) {
                                    str = (String) this.L.get(i2);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.Q;
                                if (arrayList8 != null && i2 >= 0 && i2 < arrayList8.size()) {
                                    user = (TLRPC.User) this.Q.get(i2);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.R;
                                if (arrayList9 != null && i2 >= 0 && i2 < arrayList9.size()) {
                                    bool = (Boolean) this.R.get(i2);
                                } else {
                                    bool = null;
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.K.get(i2);
                                wb wbVar = y07Var.b;
                                TextView textView2 = y07Var.c;
                                pc0 pc0Var = y07Var.d;
                                y07Var.a();
                                bf0 bf0Var2 = y07Var.a;
                                if (user != null) {
                                    bf0Var2.setVisibility(0);
                                    pc0Var.q(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        bf0Var2.f(user, pc0Var);
                                    } else {
                                        bf0Var2.setImageDrawable(pc0Var);
                                    }
                                } else {
                                    bf0Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    pn2 pn2Var = new pn2(2131231947, 0);
                                    pn2Var.a(cmb.z6);
                                    pn2Var.n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    wbVar.setText(spannableStringBuilder);
                                } else {
                                    wbVar.setText(str4);
                                }
                                textView2.setText(gw3.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                y07Var.setDivider(false);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        TextView textView;
        lx2 lx2Var;
        int i2;
        int v0;
        ylb ylbVar = this.I0;
        Context context = this.h;
        if (i != 0) {
            if (i != 1) {
                int i3 = 5;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            boolean z = this.s;
                            if (i != 6) {
                                if (i != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.w = ylbVar;
                                    bf0 bf0Var = new bf0(context);
                                    frameLayout.a = bf0Var;
                                    bf0Var.setAspectFit(true);
                                    bf0Var.setLayerNum(1);
                                    frameLayout.addView(bf0Var, qoe.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    pj8 pj8Var = new pj8(1, null, context);
                                    frameLayout.n = pj8Var;
                                    pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
                                    pj8Var.setImageReceiver(bf0Var.getImageReceiver());
                                    frameLayout.addView(pj8Var, qoe.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View o72Var = new o72(context, (byte) 13);
                                    if (z) {
                                        v0 = cmb.p1(0.15f, -1);
                                    } else {
                                        v0 = cmb.v0(cmb.Z6, ylbVar);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(v0);
                                    if (!z) {
                                        anb.x(o72Var, colorDrawable, cmb.Z6, ylbVar, PorterDuff.Mode.SRC_IN);
                                    }
                                    sn2 sn2Var = new sn2(colorDrawable, cmb.V0(context, 2131231233, cmb.v0(cmb.a7, ylbVar)), 0, 0);
                                    sn2Var.x = true;
                                    o72Var.setBackground(sn2Var);
                                    textView = o72Var;
                                }
                            } else {
                                lx2Var = new i17(ylbVar, context, z);
                            }
                        } else {
                            textView = new kz8(ylbVar, context, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        anb.X(textView2, cmb.y6, ylbVar);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    anb.X(textView3, cmb.tf, null);
                    textView3.setTypeface(gm.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (jb6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView3.setGravity(i2);
                    if (!jb6.a0) {
                        i3 = 3;
                    }
                    frameLayout2.addView(textView3, qoe.d(-2, -2.0f, i3 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                lx2 lx2Var2 = new lx2(context);
                lx2Var2.setDelegate(new z07(this));
                lx2Var = lx2Var2;
            }
            textView = lx2Var;
        } else {
            y07 y07Var = new y07(context, ylbVar);
            y07Var.setIsDarkTheme(false);
            textView = y07Var;
        }
        return new u69(textView);
    }
}
