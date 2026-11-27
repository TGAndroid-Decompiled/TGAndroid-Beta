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
public final class r17 extends c79 implements fn7 {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public zh6 E;
    public String E0;
    public n17 F;
    public int F0;
    public String G;
    public nr6 G0;
    public p17 H;
    public zu1 H0;
    public p17 I;
    public final vnb I0;
    public ArrayList J;
    public ArrayList K;
    public final u8a K0;
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
    public final w17 W;
    public zh6 X;
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
    public h04 o0;
    public boolean p0;
    public yg6 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final sv9 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public k17 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = yac.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final j17 J0 = new j17(this, new i17(this));
    public boolean M0 = false;
    public int N0 = -1;

    public r17(Context context, long j, long j2, w17 w17Var, vnb vnbVar, boolean z) {
        this.I0 = vnbVar;
        this.h = context;
        this.W = w17Var;
        this.n = j;
        this.s = z;
        this.r = j2;
        sv9 sv9Var = new sv9(true);
        this.x = sv9Var;
        sv9Var.a = new kj4(this, (byte) 18);
        u8a u8aVar = (u8a) new ou0(jn7.f(this.f), this).b;
        u8aVar.b(jn7.X0);
        u8aVar.b(jn7.x0);
        this.K0 = u8aVar;
        u8aVar.b(jn7.Y1);
        u8aVar.b(jn7.Z1);
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
    public final boolean D(f89 f89Var) {
        if ((this.x0 == null || this.i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (yac.h(this.f).p() || !r47.W3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new q17(str, document));
                this.C0.put(str2, document);
                h04 h04Var = this.o0;
                if (h04Var != null) {
                    h04Var.a();
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
                if ((hashMap == null || !hashMap.containsKey(str2)) && (yac.h(this.f).p() || !r47.W3(document))) {
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
                    this.B0.add(new q17(obj, document));
                    this.C0.put(str2, document);
                }
                i++;
                obj = obj;
            }
        }
    }

    public final void G() {
        zu1 zu1Var = this.H0;
        if (zu1Var != null && zu1Var.getParentActivity() != null) {
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
            q17 q17Var = (q17) this.B0.get(i);
            TLRPC.PhotoSize w = xb4.w(q17Var.a.thumbs, 90, false, null, false);
            if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
                xb4.G(this.f);
                if (!xb4.J(w, "webp", true, true).exists()) {
                    arrayList.add(xb4.r("webp", w));
                    xb4.G(this.f).V(jn5.c(w, q17Var.a), q17Var.b, "webp", 1, 1);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r17.J(int):java.lang.Object");
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
        return ((q17) this.B0.get(i)).b;
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
        j17 j17Var = this.J0;
        if (j17Var != null) {
            j17Var.n();
        }
        k17 k17Var = this.z0;
        if (k17Var != null) {
            hl.r(k17Var);
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
        r17 r17Var;
        zu1 zu1Var;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.n();
        w17 w17Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.x0 = user;
            long j = user.id;
            if (j != this.T) {
                this.U = null;
                this.T = j;
            }
            zu1 zu1Var2 = this.H0;
            if (zu1Var2 != null && (chat = zu1Var2.e) != null) {
                boolean t = xc2.t(chat);
                this.i0 = t;
                if (!t) {
                    f();
                    w17Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = uc7.s1(this.f).W3;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.x0.id, false) && (zu1Var = this.H0) != null && zu1Var.getParentActivity() != null) {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = ob6.M0(2131745151, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131745152, null);
                    boolean[] zArr = new boolean[1];
                    r17Var = this;
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new fu2(r17Var, zArr, user2, false, (byte) 19));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new rm6(r17Var, zArr, (byte) 8));
                    r17Var.H0.showDialog(idVar, new gf(r17Var, zArr, (byte) 11));
                } else {
                    r17Var = this;
                    r17Var.G();
                }
            } else {
                r17Var = this;
            }
        } else {
            r17Var = this;
            r17Var.x0 = null;
            r17Var.U = null;
            r17Var.i0 = true;
        }
        if (r17Var.x0 == null) {
            r17Var.w0 = true;
            r17Var.U = null;
            return;
        }
        if (w17Var != null) {
            w17Var.b(true);
        }
        r17Var.T(true, r17Var.x0, r17Var.s0, "");
    }

    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.x0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.s0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.x0;
            w17 w17Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                }
                w17Var.a(false);
            }
            k17 k17Var = this.z0;
            if (k17Var != null) {
                hl.r(k17Var);
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
                if (w17Var != null) {
                    w17Var.b(false);
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
                if (w17Var != null) {
                    w17Var.b(false);
                    return;
                }
                return;
            }
            if (w17Var != null) {
                if (this.x0 != null) {
                    w17Var.b(true);
                } else if (str.equals("gif")) {
                    this.r0 = "gif";
                    w17Var.b(false);
                }
            }
            uc7 s1 = uc7.s1(this.f);
            jf7 Y = jf7.Y(this.f);
            this.s0 = str2;
            k17 k17Var2 = new k17(this, str2, str, s1, Y);
            this.z0 = k17Var2;
            hl.d3(k17Var2, 400L);
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
                    ik8.z("_", str2, "_", sb);
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
                    jf7 Y = jf7.Y(this.f);
                    h17 h17Var = new h17(this, str, z, user, str2, Y, sb2);
                    long j = user.id;
                    if (j != this.T) {
                        this.U = null;
                        this.T = j;
                    }
                    if (z) {
                        Y.L(sb2, h17Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = uc7.s1(this.f).q1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = hl.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = hl.b0(this.A0.getLongitude());
                    }
                    if (wf3.B(this.n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = uc7.s1(this.f).j1(this.n);
                    }
                    this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, h17Var, 2);
                    return;
                }
                return;
            }
            this.s0 = null;
            return;
        }
        w17 w17Var = this.W;
        if (w17Var != null) {
            w17Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r29, int r30, java.util.ArrayList r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r17.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(TLRPC.ChatFull chatFull) {
        zu1 zu1Var;
        TLRPC.Chat chat;
        this.f = yac.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (zu1Var = this.H0) != null && (chat = zu1Var.e) != null) {
            boolean t = xc2.t(chat);
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

    public final void W(zh6 zh6Var, ArrayList arrayList, boolean z) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || lbc.C(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = zh6Var;
        yg6 yg6Var = this.q0;
        if (yg6Var != null) {
            hl.r(yg6Var);
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
        nr6 nr6Var;
        boolean z = false;
        if (i != jn7.Y1 && i != jn7.Z1) {
            if (i == jn7.X0) {
                nr6 nr6Var2 = this.G0;
                if (nr6Var2 != null) {
                    hl.c3(nr6Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i == jn7.x0 && ((Integer) objArr[0]).intValue() == 0 && (nr6Var = this.G0) != null) {
                hl.c3(nr6Var);
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
        hs6 hs6Var;
        String str;
        String str2;
        int i = this.N0;
        w17 w17Var = this.W;
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
                        if (!(obj instanceof a19)) {
                            if (obj != obj2 && ((!(obj instanceof q17) || !(obj2 instanceof q17) || ((q17) obj).a != ((q17) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof hs6) && (obj2 instanceof hs6) && (str = (hs6Var = (hs6) obj).b) != null) {
                                    hs6 hs6Var2 = (hs6) obj2;
                                    if (str.equals(hs6Var2.b) && (str2 = hs6Var.a) != null && str2.equals(hs6Var2.a)) {
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
            if (z && w17Var != null) {
                w17Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (w17Var != null) {
            this.N0 = K();
            w17Var.c();
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
    public final void t(f89 f89Var, int i) {
        int i2;
        String str;
        TLRPC.User user;
        Boolean bool;
        zu1 zu1Var;
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
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 4) {
            u2b u2bVar = (u2b) view;
            if (i2 >= 0 && i2 < this.B0.size()) {
                q17 q17Var = (q17) this.B0.get(i2);
                TLRPC.Document document = q17Var.a;
                Object obj = q17Var.b;
                cl8 cl8Var = u2bVar.n;
                de0 de0Var = u2bVar.a;
                u2bVar.c = obj;
                boolean W3 = r47.W3(document);
                u2bVar.s = W3;
                if (W3) {
                    cl8Var.setColor(aob.w0(null, aob.d6, false));
                    cl8Var.I = true;
                    cl8Var.J = false;
                    cl8Var.invalidate();
                }
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                ggb f2 = lp3.f(document, aob.a7, 1.0f, u2bVar.w);
                if (r47.p(document)) {
                    if (f2 != null) {
                        de0Var.n(jn5.b(document), "80_80", null, f2, u2bVar.c);
                        f = 1.0f;
                    } else if (w != null) {
                        f = 1.0f;
                        de0Var.h(jn5.b(document), "80_80", jn5.c(w, document), null, 0, u2bVar.c);
                    } else {
                        f = 1.0f;
                        de0Var.n(jn5.b(document), "80_80", null, null, u2bVar.c);
                    }
                } else {
                    f = 1.0f;
                    if (f2 != null) {
                        if (w != null) {
                            de0Var.n(jn5.c(w, document), null, "webp", f2, u2bVar.c);
                        } else {
                            de0Var.n(jn5.b(document), null, "webp", f2, u2bVar.c);
                        }
                    } else {
                        de0Var.n(jn5.c(w, document), null, "webp", null, u2bVar.c);
                    }
                }
                u2bVar.b = document;
                Drawable background = u2bVar.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    yob.x(u2bVar, background, aob.tf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (u2bVar.s) {
                    u2bVar.r = true;
                } else {
                    u2bVar.r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cl8Var.getLayoutParams();
                if (!yac.h(yac.t0).p()) {
                    int L = hl.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                } else {
                    int L2 = hl.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = hl.L(8.0f);
                    layoutParams.rightMargin = hl.L(8.0f);
                    cl8Var.setPadding(hl.L(f), hl.L(f), hl.L(f), hl.L(f));
                }
                cl8Var.setLocked(!yac.h(yac.t0).p());
                hl.T3(cl8Var, u2bVar.r, 0.9f, true, false);
                u2bVar.invalidate();
                u2bVar.setClearsInputField(true);
            }
        } else if (i3 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!xc2.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(ob6.M0(2131749315, null));
                } else if (hl.B1(chat.banned_rights)) {
                    textView.setText(ob6.M0(2131753960, null));
                } else {
                    textView.setText(ob6.a0("AttachInlineRestricted", null, 2131753961, ob6.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i3 == 5) {
            v09 v09Var = (v09) view;
            ArrayList arrayList = this.N;
            if (arrayList != null && i2 >= 0 && i2 < arrayList.size()) {
                v09Var.a((a19) this.N.get(i2), this.M, false);
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
                        pt0 pt0Var = (pt0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.V.text;
                        }
                        pt0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z) {
                    i2--;
                }
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    vw2 vw2Var = (vw2) view;
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
                    vw2Var.e(botInlineResult, user2, z4, z2, z3, "gif".equals(this.r0));
                }
            } else if (i3 == 6) {
                p17 p17Var = (p17) view;
                int i4 = i2 + 2;
                if (i4 == 0) {
                    this.H = p17Var;
                } else {
                    this.I = p17Var;
                }
                TLRPC.Chat chat2 = this.m0;
                if (chat2 == null && (zu1Var = this.H0) != null) {
                    chat2 = zu1Var.e;
                }
                p17Var.a(i4, str3, chat2);
            } else if (i3 == 7) {
            } else {
                f17 f17Var = (f17) view;
                ArrayList arrayList3 = this.y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i2);
                    if (tLObject instanceof TLRPC.User) {
                        f17Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        f17Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null && i2 >= 0 && i2 < arrayList4.size()) {
                        f17Var.setText((String) this.J.get(i2));
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null && i2 >= 0 && i2 < arrayList5.size()) {
                            f17Var.setEmojiSuggestion((hs6) this.O.get(i2));
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
                                xb xbVar = f17Var.b;
                                TextView textView2 = f17Var.c;
                                rb0 rb0Var = f17Var.d;
                                f17Var.a();
                                de0 de0Var2 = f17Var.a;
                                if (user != null) {
                                    de0Var2.setVisibility(0);
                                    rb0Var.q(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        de0Var2.f(user, rb0Var);
                                    } else {
                                        de0Var2.setImageDrawable(rb0Var);
                                    }
                                } else {
                                    de0Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    wm2 wm2Var = new wm2(2131231946, 0);
                                    wm2Var.a(aob.A6);
                                    wm2Var.n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    xbVar.setText(spannableStringBuilder);
                                } else {
                                    xbVar.setText(str4);
                                }
                                textView2.setText(pv3.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                f17Var.setDivider(false);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        TextView textView;
        vw2 vw2Var;
        int i2;
        int v0;
        vnb vnbVar = this.I0;
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
                                    frameLayout.w = vnbVar;
                                    de0 de0Var = new de0(context);
                                    frameLayout.a = de0Var;
                                    de0Var.setAspectFit(true);
                                    de0Var.setLayerNum(1);
                                    frameLayout.addView(de0Var, tre.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    cl8 cl8Var = new cl8(1, null, context);
                                    frameLayout.n = cl8Var;
                                    cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                                    cl8Var.setImageReceiver(de0Var.getImageReceiver());
                                    frameLayout.addView(cl8Var, tre.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View t62Var = new t62(context, (byte) 13);
                                    if (z) {
                                        v0 = aob.p1(0.15f, -1);
                                    } else {
                                        v0 = aob.v0(aob.a7, vnbVar);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(v0);
                                    if (!z) {
                                        yob.x(t62Var, colorDrawable, aob.a7, vnbVar, PorterDuff.Mode.SRC_IN);
                                    }
                                    zm2 zm2Var = new zm2(colorDrawable, aob.V0(context, 2131231232, aob.v0(aob.b7, vnbVar)), 0, 0);
                                    zm2Var.x = true;
                                    t62Var.setBackground(zm2Var);
                                    textView = t62Var;
                                }
                            } else {
                                vw2Var = new p17(vnbVar, context, z);
                            }
                        } else {
                            textView = new v09(vnbVar, context, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        yob.X(textView2, aob.z6, vnbVar);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    yob.X(textView3, aob.uf, null);
                    textView3.setTypeface(hl.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (ob6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView3.setGravity(i2);
                    if (!ob6.a0) {
                        i3 = 3;
                    }
                    frameLayout2.addView(textView3, tre.d(-2, -2.0f, i3 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                vw2 vw2Var2 = new vw2(context);
                vw2Var2.setDelegate(new g17(this));
                vw2Var = vw2Var2;
            }
            textView = vw2Var;
        } else {
            f17 f17Var = new f17(context, vnbVar);
            f17Var.setIsDarkTheme(false);
            textView = f17Var;
        }
        return new f89(textView);
    }
}
