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
public final class kz6 extends n39 implements gk7 {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public vf6 E;
    public String E0;
    public gz6 F;
    public int F0;
    public String G;
    public fp6 G0;
    public iz6 H;
    public mu1 H0;
    public iz6 I;
    public final wjb I0;
    public ArrayList J;
    public ArrayList K;
    public final wtc K0;
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
    public final pz6 W;
    public vf6 X;
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
    public mz3 o0;
    public boolean p0;
    public lo6 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final zr9 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public dz6 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = y6c.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final cz6 J0 = new cz6(this, new bz6(this));
    public boolean M0 = false;
    public int N0 = -1;

    public kz6(Context context, long j, long j2, pz6 pz6Var, wjb wjbVar, boolean z) {
        this.I0 = wjbVar;
        this.h = context;
        this.W = pz6Var;
        this.n = j;
        this.s = z;
        this.r = j2;
        zr9 zr9Var = new zr9(true);
        this.x = zr9Var;
        zr9Var.a = new gi3(this);
        wtc wtcVar = (wtc) new fu0(kk7.f(this.f), this).b;
        wtcVar.b(kk7.W0);
        wtcVar.b(kk7.w0);
        this.K0 = wtcVar;
        wtcVar.b(kk7.X1);
        wtcVar.b(kk7.Y1);
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
    public final boolean D(s49 s49Var) {
        if ((this.x0 == null || this.i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (y6c.h(this.f).p() || !k27.W3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new jz6(str, document));
                this.C0.put(str2, document);
                mz3 mz3Var = this.o0;
                if (mz3Var != null) {
                    mz3Var.a();
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
                if ((hashMap == null || !hashMap.containsKey(str2)) && (y6c.h(this.f).p() || !k27.W3(document))) {
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
                    this.B0.add(new jz6(obj, document));
                    this.C0.put(str2, document);
                }
                i++;
                obj = obj;
            }
        }
    }

    public final void G() {
        mu1 mu1Var = this.H0;
        if (mu1Var != null && mu1Var.getParentActivity() != null) {
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
            jz6 jz6Var = (jz6) this.B0.get(i);
            TLRPC.PhotoSize w = ba4.w(jz6Var.a.thumbs, 90, false, null, false);
            if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
                ba4.G(this.f);
                if (!ba4.J(w, "webp", true, true).exists()) {
                    arrayList.add(ba4.r("webp", w));
                    ba4.G(this.f).V(gl5.c(w, jz6Var.a), jz6Var.b, "webp", 1, 1);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz6.J(int):java.lang.Object");
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
        return ((jz6) this.B0.get(i)).b;
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
        cz6 cz6Var = this.J0;
        if (cz6Var != null) {
            cz6Var.n();
        }
        dz6 dz6Var = this.z0;
        if (dz6Var != null) {
            gl.r(dz6Var);
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
        kz6 kz6Var;
        mu1 mu1Var;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.n();
        pz6 pz6Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.x0 = user;
            long j = user.id;
            if (j != this.T) {
                this.U = null;
                this.T = j;
            }
            mu1 mu1Var2 = this.H0;
            if (mu1Var2 != null && (chat = mu1Var2.e) != null) {
                boolean t = hc2.t(chat);
                this.i0 = t;
                if (!t) {
                    f();
                    pz6Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = na7.q1(this.f).W3;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.x0.id, false) && (mu1Var = this.H0) != null && mu1Var.getParentActivity() != null) {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = k96.M0(2131745231, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131745232, null);
                    boolean[] zArr = new boolean[1];
                    kz6Var = this;
                    alertDialog$Builder.j(k96.M0(2131747638, null), new lt2(kz6Var, zArr, user2, false, (byte) 19));
                    alertDialog$Builder.g(k96.M0(2131752577, null), new dx6(kz6Var, zArr, (byte) 3));
                    kz6Var.H0.showDialog(hdVar, new cf(kz6Var, zArr, (byte) 11));
                } else {
                    kz6Var = this;
                    kz6Var.G();
                }
            } else {
                kz6Var = this;
            }
        } else {
            kz6Var = this;
            kz6Var.x0 = null;
            kz6Var.U = null;
            kz6Var.i0 = true;
        }
        if (kz6Var.x0 == null) {
            kz6Var.w0 = true;
            kz6Var.U = null;
            return;
        }
        if (pz6Var != null) {
            pz6Var.b(true);
        }
        kz6Var.T(true, kz6Var.x0, kz6Var.s0, "");
    }

    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.x0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.s0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.x0;
            pz6 pz6Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                }
                pz6Var.a(false);
            }
            dz6 dz6Var = this.z0;
            if (dz6Var != null) {
                gl.r(dz6Var);
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
                if (pz6Var != null) {
                    pz6Var.b(false);
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
                if (pz6Var != null) {
                    pz6Var.b(false);
                    return;
                }
                return;
            }
            if (pz6Var != null) {
                if (this.x0 != null) {
                    pz6Var.b(true);
                } else if (str.equals("gif")) {
                    this.r0 = "gif";
                    pz6Var.b(false);
                }
            }
            na7 q1 = na7.q1(this.f);
            ad7 Y = ad7.Y(this.f);
            this.s0 = str2;
            dz6 dz6Var2 = new dz6(this, str2, str, q1, Y);
            this.z0 = dz6Var2;
            gl.d3(dz6Var2, 400L);
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
                    ug8.z("_", str2, "_", sb);
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
                    ad7 Y = ad7.Y(this.f);
                    az6 az6Var = new az6(this, str, z, user, str2, Y, sb2);
                    long j = user.id;
                    if (j != this.T) {
                        this.U = null;
                        this.T = j;
                    }
                    if (z) {
                        Y.L(sb2, az6Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = na7.q1(this.f).o1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = gl.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = gl.b0(this.A0.getLongitude());
                    }
                    if (cf3.B(this.n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = na7.q1(this.f).h1(this.n);
                    }
                    this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, az6Var, 2);
                    return;
                }
                return;
            }
            this.s0 = null;
            return;
        }
        pz6 pz6Var = this.W;
        if (pz6Var != null) {
            pz6Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r29, int r30, java.util.ArrayList r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz6.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(TLRPC.ChatFull chatFull) {
        mu1 mu1Var;
        TLRPC.Chat chat;
        this.f = y6c.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (mu1Var = this.H0) != null && (chat = mu1Var.e) != null) {
            boolean t = hc2.t(chat);
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

    public final void W(vf6 vf6Var, ArrayList arrayList, boolean z) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || l7c.C(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = vf6Var;
        lo6 lo6Var = this.q0;
        if (lo6Var != null) {
            gl.r(lo6Var);
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
        fp6 fp6Var;
        boolean z = false;
        if (i != kk7.X1 && i != kk7.Y1) {
            if (i == kk7.W0) {
                fp6 fp6Var2 = this.G0;
                if (fp6Var2 != null) {
                    gl.c3(fp6Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i == kk7.w0 && ((Integer) objArr[0]).intValue() == 0 && (fp6Var = this.G0) != null) {
                gl.c3(fp6Var);
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
        dq6 dq6Var;
        String str;
        String str2;
        int i = this.N0;
        pz6 pz6Var = this.W;
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
                        if (!(obj instanceof nx8)) {
                            if (obj != obj2 && ((!(obj instanceof jz6) || !(obj2 instanceof jz6) || ((jz6) obj).a != ((jz6) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof dq6) && (obj2 instanceof dq6) && (str = (dq6Var = (dq6) obj).b) != null) {
                                    dq6 dq6Var2 = (dq6) obj2;
                                    if (str.equals(dq6Var2.b) && (str2 = dq6Var.a) != null && str2.equals(dq6Var2.a)) {
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
            if (z && pz6Var != null) {
                pz6Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (pz6Var != null) {
            this.N0 = K();
            pz6Var.c();
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
    public final void t(s49 s49Var, int i) {
        int i2;
        String str;
        TLRPC.User user;
        Boolean bool;
        mu1 mu1Var;
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
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 == 4) {
            uya uyaVar = (uya) view;
            if (i2 >= 0 && i2 < this.B0.size()) {
                jz6 jz6Var = (jz6) this.B0.get(i2);
                TLRPC.Document document = jz6Var.a;
                Object obj = jz6Var.b;
                oh8 oh8Var = uyaVar.n;
                be0 be0Var = uyaVar.a;
                uyaVar.c = obj;
                boolean W3 = k27.W3(document);
                uyaVar.s = W3;
                if (W3) {
                    oh8Var.setColor(bkb.w0(null, bkb.c6, false));
                    oh8Var.I = true;
                    oh8Var.J = false;
                    oh8Var.invalidate();
                }
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                kcb f2 = uo3.f(document, bkb.Z6, 1.0f, uyaVar.w);
                if (k27.p(document)) {
                    if (f2 != null) {
                        be0Var.n(gl5.b(document), "80_80", null, f2, uyaVar.c);
                        f = 1.0f;
                    } else if (w != null) {
                        f = 1.0f;
                        be0Var.h(gl5.b(document), "80_80", gl5.c(w, document), null, 0, uyaVar.c);
                    } else {
                        f = 1.0f;
                        be0Var.n(gl5.b(document), "80_80", null, null, uyaVar.c);
                    }
                } else {
                    f = 1.0f;
                    if (f2 != null) {
                        if (w != null) {
                            be0Var.n(gl5.c(w, document), null, "webp", f2, uyaVar.c);
                        } else {
                            be0Var.n(gl5.b(document), null, "webp", f2, uyaVar.c);
                        }
                    } else {
                        be0Var.n(gl5.c(w, document), null, "webp", null, uyaVar.c);
                    }
                }
                uyaVar.b = document;
                Drawable background = uyaVar.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    zkb.x(uyaVar, background, bkb.sf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (uyaVar.s) {
                    uyaVar.r = true;
                } else {
                    uyaVar.r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh8Var.getLayoutParams();
                if (!y6c.h(y6c.t0).p()) {
                    int L = gl.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    oh8Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                } else {
                    int L2 = gl.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = gl.L(8.0f);
                    layoutParams.rightMargin = gl.L(8.0f);
                    oh8Var.setPadding(gl.L(f), gl.L(f), gl.L(f), gl.L(f));
                }
                oh8Var.setLocked(!y6c.h(y6c.t0).p());
                gl.T3(oh8Var, uyaVar.r, 0.9f, true, false);
                uyaVar.invalidate();
                uyaVar.setClearsInputField(true);
            }
        } else if (i3 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!hc2.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(k96.M0(2131749369, null));
                } else if (gl.B1(chat.banned_rights)) {
                    textView.setText(k96.M0(2131753964, null));
                } else {
                    textView.setText(k96.a0("AttachInlineRestricted", null, 2131753965, k96.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i3 == 5) {
            jx8 jx8Var = (jx8) view;
            ArrayList arrayList = this.N;
            if (arrayList != null && i2 >= 0 && i2 < arrayList.size()) {
                jx8Var.a((nx8) this.N.get(i2), this.M, false);
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
                        ht0 ht0Var = (ht0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.V.text;
                        }
                        ht0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z) {
                    i2--;
                }
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    bw2 bw2Var = (bw2) view;
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
                    bw2Var.e(botInlineResult, user2, z4, z2, z3, "gif".equals(this.r0));
                }
            } else if (i3 == 6) {
                iz6 iz6Var = (iz6) view;
                int i4 = i2 + 2;
                if (i4 == 0) {
                    this.H = iz6Var;
                } else {
                    this.I = iz6Var;
                }
                TLRPC.Chat chat2 = this.m0;
                if (chat2 == null && (mu1Var = this.H0) != null) {
                    chat2 = mu1Var.e;
                }
                iz6Var.a(i4, str3, chat2);
            } else if (i3 == 7) {
            } else {
                yy6 yy6Var = (yy6) view;
                ArrayList arrayList3 = this.y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i2);
                    if (tLObject instanceof TLRPC.User) {
                        yy6Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        yy6Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null && i2 >= 0 && i2 < arrayList4.size()) {
                        yy6Var.setText((String) this.J.get(i2));
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null && i2 >= 0 && i2 < arrayList5.size()) {
                            yy6Var.setEmojiSuggestion((dq6) this.O.get(i2));
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
                                wb wbVar = yy6Var.b;
                                TextView textView2 = yy6Var.c;
                                pb0 pb0Var = yy6Var.d;
                                yy6Var.a();
                                be0 be0Var2 = yy6Var.a;
                                if (user != null) {
                                    be0Var2.setVisibility(0);
                                    pb0Var.q(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        be0Var2.f(user, pb0Var);
                                    } else {
                                        be0Var2.setImageDrawable(pb0Var);
                                    }
                                } else {
                                    be0Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    cm2 cm2Var = new cm2(2131231946, 0);
                                    cm2Var.a(bkb.z6);
                                    cm2Var.n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    wbVar.setText(spannableStringBuilder);
                                } else {
                                    wbVar.setText(str4);
                                }
                                textView2.setText(vu3.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                yy6Var.setDivider(false);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        TextView textView;
        bw2 bw2Var;
        int i2;
        int v0;
        wjb wjbVar = this.I0;
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
                                    frameLayout.w = wjbVar;
                                    be0 be0Var = new be0(context);
                                    frameLayout.a = be0Var;
                                    be0Var.setAspectFit(true);
                                    be0Var.setLayerNum(1);
                                    frameLayout.addView(be0Var, nme.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    oh8 oh8Var = new oh8(1, null, context);
                                    frameLayout.n = oh8Var;
                                    oh8Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                                    oh8Var.setImageReceiver(be0Var.getImageReceiver());
                                    frameLayout.addView(oh8Var, nme.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View d62Var = new d62(context, (byte) 13);
                                    if (z) {
                                        v0 = bkb.p1(0.15f, -1);
                                    } else {
                                        v0 = bkb.v0(bkb.Z6, wjbVar);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(v0);
                                    if (!z) {
                                        zkb.x(d62Var, colorDrawable, bkb.Z6, wjbVar, PorterDuff.Mode.SRC_IN);
                                    }
                                    fm2 fm2Var = new fm2(colorDrawable, bkb.V0(context, 2131231232, bkb.v0(bkb.a7, wjbVar)), 0, 0);
                                    fm2Var.x = true;
                                    d62Var.setBackground(fm2Var);
                                    textView = d62Var;
                                }
                            } else {
                                bw2Var = new iz6(wjbVar, context, z);
                            }
                        } else {
                            textView = new jx8(wjbVar, context, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        zkb.X(textView2, bkb.y6, wjbVar);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    zkb.X(textView3, bkb.tf, null);
                    textView3.setTypeface(gl.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (k96.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView3.setGravity(i2);
                    if (!k96.a0) {
                        i3 = 3;
                    }
                    frameLayout2.addView(textView3, nme.d(-2, -2.0f, i3 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                bw2 bw2Var2 = new bw2(context);
                bw2Var2.setDelegate(new zy6(this));
                bw2Var = bw2Var2;
            }
            textView = bw2Var;
        } else {
            yy6 yy6Var = new yy6(context, wjbVar);
            yy6Var.setIsDarkTheme(false);
            textView = yy6Var;
        }
        return new s49(textView);
    }
}
