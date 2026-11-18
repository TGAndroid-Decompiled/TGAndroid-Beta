package jg;

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
import c8.ma;
import di.ga;
import di.xb;
import hi.u5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.js;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.ni;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.messenger.v3;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q9;
import org.telegram.ui.bn;
public final class h1 extends bk0 implements fs {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public a0.h E;
    public String E0;
    public c1 F;
    public int F0;
    public String G;
    public t0 G0;
    public f1 H;
    public bn H0;
    public f1 I;
    public final i6 I0;
    public ArrayList J;
    public ArrayList K;
    public final xi.e K0;
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
    public final o90 W;
    public a0.h X;
    public int Y;
    public int Z;
    public String f17500a0;
    public boolean f17501b0;
    public boolean f17503c0;
    public int f17504d0;
    public ArrayList f17506e0;
    public final Context h;
    public int f17510h0;
    public int f17512j0;
    public int f17513k0;
    public boolean f17514l0;
    public TLRPC.Chat m0;
    public long f17515n;
    public d1 f17517o0;
    public boolean f17518p0;
    public ga f17519q0;
    public final long f17520r;
    public String f17521r0;
    public final boolean f17522s;
    public String f17523s0;
    public String f17524t0;
    public int f17525u0;
    public int f17526v0;
    public TLRPC.ChatFull f17527w;
    public boolean f17528w0;
    public final z1 f17529x;
    public TLRPC.User f17530x0;
    public ArrayList f17531y;
    public boolean f17532y0;
    public z0 f17533z0;
    public boolean f17502c = true;
    public boolean d = true;
    public boolean f17505e = true;
    public int f17507f = j10.f24770t0;
    public boolean f17508f0 = true;
    public boolean f17509g0 = true;
    public boolean f17511i0 = true;
    public boolean f17516n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final y0 J0 = new y0(this, new x0(this));
    public boolean M0 = false;
    public int N0 = -1;

    public h1(Context context, long j3, long j10, o90 o90Var, i6 i6Var, boolean z10) {
        this.I0 = i6Var;
        this.h = context;
        this.W = o90Var;
        this.f17515n = j3;
        this.f17522s = z10;
        this.f17520r = j10;
        z1 z1Var = new z1(true);
        this.f17529x = z1Var;
        z1Var.f17727a = new u5(this, 6);
        xi.e eVar = (xi.e) new js(ks.f(this.f17507f), this).f24919b;
        eVar.c(ks.X0);
        eVar.c(ks.f25218x0);
        this.K0 = eVar;
        eVar.c(ks.Y1);
        eVar.c(ks.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i7++;
        }
        return false;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if ((this.f17530x0 == null || this.f17511i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f28409id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (j10.i(this.f17507f).q() || !fj.X3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new g1(str, document));
                this.C0.put(str2, document);
                d1 d1Var = this.f17517o0;
                if (d1Var != null) {
                    d1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            Object obj = str;
            while (i7 < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                String str2 = document.dc_id + "_" + document.f28409id;
                HashMap hashMap = this.C0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (j10.i(this.f17507f).q() || !fj.X3(document))) {
                    int size2 = document.attributes.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                        i10++;
                    }
                    if (this.B0 == null) {
                        this.B0 = new ArrayList();
                        this.C0 = new HashMap();
                    }
                    this.B0.add(new g1(obj, document));
                    this.C0.put(str2, document);
                }
                i7++;
                obj = obj;
            }
        }
    }

    public final void G() {
        bn bnVar = this.H0;
        if (bnVar != null && bnVar.getParentActivity() != null) {
            if (this.H0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.H0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f17530x0;
            if (user != null && user.bot_inline_geo) {
                this.J0.o();
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
        for (int i7 = 0; i7 < min; i7++) {
            g1 g1Var = (g1) this.B0.get(i7);
            TLRPC.PhotoSize w10 = w7.w(g1Var.f17463a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f17507f);
                if (!w7.J(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f17507f).V(fc.c(w10, g1Var.f17463a), g1Var.f17464b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f17530x0;
        if (user != null && user.f28552id != this.T) {
            return null;
        }
        return this.U;
    }

    public final Object J(int i7) {
        String str;
        long j3;
        String str2;
        TLRPC.User user = null;
        if (this.G != null) {
            if (i7 >= 2) {
                i7 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            if (i7 >= 0 && i7 < arrayList.size()) {
                return ((g1) this.B0.get(i7)).f17463a;
            }
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.V;
                if (tL_inlineBotWebView != null) {
                    if (i7 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i7 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i7 >= 0 && i7 < arrayList2.size()) {
                        return this.S.get(i7);
                    }
                }
                i7--;
                if (i7 >= 0) {
                    return this.S.get(i7);
                }
            } else {
                ArrayList arrayList3 = this.f17531y;
                if (arrayList3 != null) {
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        return this.f17531y.get(i7);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null) {
                        if (i7 >= 0 && i7 < arrayList4.size()) {
                            return this.J.get(i7);
                        }
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null) {
                            if (i7 >= 0 && i7 < arrayList5.size()) {
                                return this.O.get(i7);
                            }
                        } else {
                            ArrayList arrayList6 = this.N;
                            if (arrayList6 != null || this.K != null) {
                                if (arrayList6 != null) {
                                    if (i7 >= 0 && i7 < arrayList6.size()) {
                                        return this.N.get(i7);
                                    }
                                    ArrayList arrayList7 = this.N;
                                    if (arrayList7 != null) {
                                        i7 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.K;
                                if (arrayList8 != null && i7 >= 0 && i7 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.Q;
                                    if (arrayList9 != null && (this.f17510h0 != 1 || (this.f17527w instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i7) != null) {
                                            user = (TLRPC.User) this.Q.get(i7);
                                            Object obj = this.K.get(i7);
                                            if (user != null) {
                                                str2 = o10.o(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.K.get(i7));
                                        }
                                    } else {
                                        str = (String) this.K.get(i7);
                                    }
                                    ArrayList arrayList10 = this.R;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i7)).booleanValue()) {
                                        if (user != null) {
                                            j3 = user.f28552id;
                                        } else {
                                            j3 = 0;
                                        }
                                        return new e1(str, j3);
                                    }
                                    return str;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int K() {
        int i7;
        int size;
        int i10;
        int i11 = 1;
        if (this.f17530x0 != null && !this.f17511i0) {
            return 1;
        }
        int i12 = 0;
        if (this.G != null) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.U == null && this.V == null) {
                    i11 = 0;
                }
                return size2 + i11 + i7;
            }
            ArrayList arrayList3 = this.f17531y;
            if (arrayList3 != null) {
                i10 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null) {
                    i10 = arrayList4.size();
                } else if (this.K == null && this.N == null) {
                    ArrayList arrayList5 = this.O;
                    if (arrayList5 != null) {
                        i10 = arrayList5.size();
                    } else {
                        return i7;
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
                        i12 = arrayList7.size();
                    }
                    i10 = size + i12;
                }
            }
        }
        return i10 + i7;
    }

    public final Object L(int i7) {
        if (this.G != null) {
            if (i7 < 2) {
                return null;
            }
            i7 -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return null;
        }
        return ((g1) this.B0.get(i7)).f17464b;
    }

    public final int M(int i7) {
        if (this.G != null) {
            if (i7 < 2) {
                return 0;
            }
            i7 -= 2;
        }
        if (this.S != null) {
            if (this.U != null || this.V != null) {
                return i7 - 1;
            }
            return i7;
        }
        return i7;
    }

    public final boolean N() {
        if (this.B0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        y0 y0Var = this.J0;
        if (y0Var != null) {
            y0Var.p();
        }
        z0 z0Var = this.f17533z0;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.f17533z0 = null;
        }
        if (this.f17525u0 != 0) {
            ConnectionsManager.getInstance(this.f17507f).cancelRequest(this.f17525u0, true);
            this.f17525u0 = 0;
        }
        if (this.f17526v0 != 0) {
            ConnectionsManager.getInstance(this.f17507f).cancelRequest(this.f17526v0, true);
            this.f17526v0 = 0;
        }
        this.f17530x0 = null;
        this.U = null;
        this.f17511i0 = true;
        this.f17521r0 = null;
        this.f17523s0 = null;
        this.f17528w0 = false;
        this.K0.b();
    }

    public final void Q() {
        TLRPC.User user = this.f17530x0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(-1000.0d);
            this.A0.setLongitude(-1000.0d);
            T(true, this.f17530x0, this.f17523s0, "");
        }
    }

    public final void R(TLRPC.User user) {
        bn bnVar;
        TLRPC.Chat chat;
        this.f17525u0 = 0;
        this.J0.p();
        o90 o90Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f17530x0 = user;
            long j3 = user.f28552id;
            if (j3 != this.T) {
                this.U = null;
                this.T = j3;
            }
            bn bnVar2 = this.H0;
            if (bnVar2 != null && (chat = bnVar2.f45978e) != null) {
                boolean t6 = v3.t(chat);
                this.f17511i0 = t6;
                if (!t6) {
                    f();
                    o90Var.a(true);
                    return;
                }
            }
            if (this.f17530x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = mp.u1(this.f17507f).f25658g7;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.f17530x0.f28552id, false) && (bnVar = this.H0) != null && bnVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f17530x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = gd.M0(2131745228, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = gd.M0(2131745229, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(gd.M0(2131747638, null), new a3.h(this, zArr, user2, 12));
                    alertDialog$Builder.h(gd.M0(2131752578, null), new ab.g(19, this, zArr));
                    this.H0.showDialog(u1Var, new di.u1(this, zArr, 3));
                } else {
                    G();
                }
            }
        } else {
            this.f17530x0 = null;
            this.U = null;
            this.f17511i0 = true;
        }
        if (this.f17530x0 == null) {
            this.f17528w0 = true;
            this.U = null;
            return;
        }
        if (o90Var != null) {
            o90Var.b(true);
        }
        T(true, this.f17530x0, this.f17523s0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Object obj;
        Location location;
        if (this.f17526v0 != 0) {
            ConnectionsManager.getInstance(this.f17507f).cancelRequest(this.f17526v0, true);
            this.f17526v0 = 0;
        }
        if (this.f17511i0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.A0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f17515n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f17515n);
                    sb2.append("_");
                    sb2.append(user.f28552id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.A0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    final String sb3 = sb2.toString();
                    final tr a02 = tr.a0(this.f17507f);
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new w0(h1.this, str, z10, tLObject, user, str2, a02, sb3));
                        }
                    };
                    long j3 = user.f28552id;
                    if (j3 != this.T) {
                        this.U = null;
                        this.T = j3;
                    }
                    if (z10) {
                        a02.M(sb3, requestDelegate);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = mp.u1(this.f17507f).s1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.A0.getLongitude());
                    }
                    if (n5.C(this.f17515n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = mp.u1(this.f17507f).l1(this.f17515n);
                    }
                    this.f17526v0 = ConnectionsManager.getInstance(this.f17507f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
                    return;
                }
                return;
            }
            this.f17523s0 = null;
            return;
        }
        o90 o90Var = this.W;
        if (o90Var != null) {
            o90Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f17502c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        bn bnVar;
        TLRPC.Chat chat;
        this.f17507f = j10.f24770t0;
        this.f17527w = chatFull;
        if (!this.f17511i0 && this.f17530x0 != null && (bnVar = this.H0) != null && (chat = bnVar.f45978e) != null) {
            boolean t6 = v3.t(chat);
            this.f17511i0 = t6;
            if (t6) {
                this.f17531y = null;
                f();
                this.W.a(false);
                R(this.f17530x0);
            }
        }
        String str = this.f17500a0;
        if (str != null) {
            U(str, this.f17504d0, this.f17506e0, this.f17503c0, this.f17501b0);
        }
    }

    public final void X(bn bnVar) {
        this.H0 = bnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f17531y = arrayList;
        if (!this.d || !this.f17505e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f17505e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || o10.B(user.f28552id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = hVar;
        ga gaVar = this.f17519q0;
        if (gaVar != null) {
            org.telegram.messenger.g0.r(gaVar);
            this.f17519q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z10) {
            f();
            this.W.a(!this.f17531y.isEmpty());
        }
    }

    @Override
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override
    public final int d(int i7) {
        if (this.G != null) {
            if (i7 < 2) {
                return 6;
            }
            i7 -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.f17530x0 != null && !this.f17511i0) {
            return 3;
        }
        if (this.S != null) {
            if (i7 == 0) {
                if (this.U != null || this.V != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.N;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t0 t0Var;
        boolean z10 = false;
        if (i7 != ks.Y1 && i7 != ks.Z1) {
            if (i7 == ks.X0) {
                t0 t0Var2 = this.G0;
                if (t0Var2 != null) {
                    org.telegram.messenger.g0.g3(t0Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i7 == ks.f25218x0 && ((Integer) objArr[0]).intValue() == 0 && (t0Var = this.G0) != null) {
                org.telegram.messenger.g0.g3(t0Var);
                this.G0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.D0;
            if (!arrayList2.isEmpty() && this.f17518p0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z10 = true;
                    }
                    this.W.a(z10);
                }
            }
        }
    }

    @Override
    public final void f() {
        boolean z10;
        ni niVar;
        String str;
        String str2;
        int i7 = this.N0;
        o90 o90Var = this.W;
        int i10 = 0;
        if (i7 != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            if (i7 != K) {
                z10 = true;
            } else {
                z10 = false;
            }
            int min = Math.min(i7, K);
            Object[] objArr = new Object[K];
            for (int i11 = 0; i11 < K; i11++) {
                objArr[i11] = J(i11);
            }
            while (i10 < min) {
                if (i10 >= 0) {
                    Object[] objArr2 = this.L0;
                    if (i10 < objArr2.length && i10 < K) {
                        Object obj = objArr2[i10];
                        Object obj2 = objArr[i10];
                        if (!(obj instanceof kg.v1)) {
                            if (obj != obj2 && ((!(obj instanceof g1) || !(obj2 instanceof g1) || ((g1) obj).f17463a != ((g1) obj2).f17463a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f28552id != ((TLRPC.User) obj2).f28552id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f28403id != ((TLRPC.Chat) obj2).f28403id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof ni) && (obj2 instanceof ni) && (str = (niVar = (ni) obj).f25928b) != null) {
                                    ni niVar2 = (ni) obj2;
                                    if (str.equals(niVar2.f25928b) && (str2 = niVar.f25927a) != null && str2.equals(niVar2.f25927a)) {
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                }
                g(i10);
                z10 = true;
                i10++;
            }
            p(min, i7 - min);
            o(min, K - min);
            if (z10 && o90Var != null) {
                o90Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (o90Var != null) {
            this.N0 = K();
            o90Var.c();
        }
        super.f();
        int K2 = K();
        this.N0 = K2;
        this.L0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.L0;
            if (i10 < objArr3.length) {
                objArr3[i10] = J(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String str;
        TLRPC.User user;
        Boolean bool;
        bn bnVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str3 = this.G;
        if (str3 != null) {
            i10 = i7 - 2;
        } else {
            i10 = i7;
        }
        int i11 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i11 == 4) {
            y7 y7Var = (y7) view;
            if (i10 >= 0 && i10 < this.B0.size()) {
                g1 g1Var = (g1) this.B0.get(i10);
                TLRPC.Document document = g1Var.f17463a;
                Object obj = g1Var.f17464b;
                ug.c1 c1Var = y7Var.f32480n;
                q9 q9Var = y7Var.f32475a;
                y7Var.f32477c = obj;
                boolean X3 = fj.X3(document);
                y7Var.f32482s = X3;
                if (X3) {
                    c1Var.setColor(n6.x0(null, n6.f29394d6, false));
                    c1Var.I = true;
                    c1Var.J = false;
                    c1Var.invalidate();
                }
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
                lz f11 = org.telegram.messenger.u5.f(document, n6.f29337a7, 1.0f, y7Var.f32483w);
                if (fj.p(document)) {
                    if (f11 != null) {
                        q9Var.k(fc.b(document), "80_80", null, f11, y7Var.f32477c);
                        f10 = 1.0f;
                    } else if (w10 != null) {
                        f10 = 1.0f;
                        q9Var.l(fc.b(document), "80_80", fc.c(w10, document), null, 0, y7Var.f32477c);
                    } else {
                        f10 = 1.0f;
                        q9Var.k(fc.b(document), "80_80", null, null, y7Var.f32477c);
                    }
                } else {
                    f10 = 1.0f;
                    if (f11 != null) {
                        if (w10 != null) {
                            q9Var.k(fc.c(w10, document), null, "webp", f11, y7Var.f32477c);
                        } else {
                            q9Var.k(fc.b(document), null, "webp", f11, y7Var.f32477c);
                        }
                    } else {
                        q9Var.k(fc.c(w10, document), null, "webp", null, y7Var.f32477c);
                    }
                }
                y7Var.f32476b = document;
                Drawable background = y7Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    u6.x(y7Var, background, n6.f29699tf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (y7Var.f32482s) {
                    y7Var.f32481r = true;
                } else {
                    y7Var.f32481r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1Var.getLayoutParams();
                if (!j10.i(j10.f24770t0).q()) {
                    int L = org.telegram.messenger.g0.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    c1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                } else {
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    c1Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                }
                c1Var.setLocked(!j10.i(j10.f24770t0).q());
                org.telegram.messenger.g0.X3(c1Var, y7Var.f32481r, 0.9f, true, false);
                y7Var.invalidate();
                y7Var.setClearsInputField(true);
            }
        } else if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.f45978e;
            if (chat != null) {
                if (!v3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(gd.M0(2131749369, null));
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(gd.M0(2131753965, null));
                } else {
                    textView.setText(gd.a0("AttachInlineRestricted", null, 2131753966, gd.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i11 == 5) {
            kg.s1 s1Var = (kg.s1) view;
            ArrayList arrayList = this.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                s1Var.a((kg.v1) this.N.get(i10), this.M, false);
            }
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
                if (tL_inlineBotSwitchPM == null && this.V == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i11 == 2) {
                    if (z10) {
                        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.V.text;
                        }
                        h0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z10) {
                    i10--;
                }
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    i2 i2Var = (i2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.S.get(i10);
                    TLRPC.User user2 = this.f17530x0;
                    boolean z13 = this.f17532y0;
                    if (i10 != this.S.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && i10 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f17521r0));
                }
            } else if (i11 == 6) {
                f1 f1Var2 = (f1) view;
                int i12 = i10 + 2;
                if (i12 == 0) {
                    this.H = f1Var2;
                } else {
                    this.I = f1Var2;
                }
                TLRPC.Chat chat2 = this.m0;
                if (chat2 == null && (bnVar = this.H0) != null) {
                    chat2 = bnVar.f45978e;
                }
                f1Var2.a(i12, str3, chat2);
            } else if (i11 == 7) {
            } else {
                h5 h5Var = (h5) view;
                ArrayList arrayList3 = this.f17531y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i10);
                    if (tLObject instanceof TLRPC.User) {
                        h5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        h5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        h5Var.setText((String) this.J.get(i10));
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null && i10 >= 0 && i10 < arrayList5.size()) {
                            h5Var.setEmojiSuggestion((ni) this.O.get(i10));
                        } else {
                            ArrayList arrayList6 = this.K;
                            if (arrayList6 != null && i10 >= 0 && i10 < arrayList6.size()) {
                                ArrayList arrayList7 = this.L;
                                if (arrayList7 != null && i10 >= 0 && i10 < arrayList7.size()) {
                                    str = (String) this.L.get(i10);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.Q;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    user = (TLRPC.User) this.Q.get(i10);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.R;
                                if (arrayList9 != null && i10 >= 0 && i10 < arrayList9.size()) {
                                    bool = (Boolean) this.R.get(i10);
                                } else {
                                    bool = null;
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.K.get(i10);
                                xb xbVar = h5Var.f30698b;
                                TextView textView2 = h5Var.f30699c;
                                b9 b9Var = h5Var.d;
                                q9 q9Var2 = h5Var.f30697a;
                                h5Var.a();
                                if (user != null) {
                                    q9Var2.setVisibility(0);
                                    b9Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        q9Var2.f(user, b9Var);
                                    } else {
                                        q9Var2.setImageDrawable(b9Var);
                                    }
                                } else {
                                    q9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    lq lqVar = new lq(2131231943, 0);
                                    lqVar.a(n6.A6);
                                    lqVar.f37197n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    xbVar.setText(spannableStringBuilder);
                                } else {
                                    xbVar.setText(str4);
                                }
                                textView2.setText(j6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                h5Var.setDivider(false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        TextView textView;
        int i10;
        int w02;
        i6 i6Var = this.I0;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                int i11 = 5;
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            boolean z10 = this.f17522s;
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.f32483w = i6Var;
                                    q9 q9Var = new q9(context);
                                    frameLayout.f32475a = q9Var;
                                    q9Var.setAspectFit(true);
                                    q9Var.setLayerNum(1);
                                    frameLayout.addView(q9Var, ma.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    ug.c1 c1Var = new ug.c1(1, context, null);
                                    frameLayout.f32480n = c1Var;
                                    c1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                    c1Var.setImageReceiver(q9Var.getImageReceiver());
                                    frameLayout.addView(c1Var, ma.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View jnVar = new jn(context, 4);
                                    if (z10) {
                                        w02 = n6.r1(0.15f, -1);
                                    } else {
                                        w02 = n6.w0(n6.f29337a7, i6Var);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(w02);
                                    if (!z10) {
                                        u6.x(jnVar, colorDrawable, n6.f29337a7, i6Var, PorterDuff.Mode.SRC_IN);
                                    }
                                    mq mqVar = new mq(colorDrawable, n6.X0(context, 2131231229, n6.w0(n6.f29358b7, i6Var)), 0, 0);
                                    mqVar.f37616x = true;
                                    jnVar.setBackground(mqVar);
                                    view = jnVar;
                                }
                            } else {
                                textView = new f1(context, i6Var, z10);
                            }
                        } else {
                            view = new kg.s1(context, i6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        u6.U(textView2, n6.f29805z6, i6Var);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f30690a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    u6.U(textView3, n6.f29719uf, null);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (gd.f24213a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView3.setGravity(i10);
                    if (!gd.f24213a0) {
                        i11 = 3;
                    }
                    frameLayout2.addView(textView3, ma.d(-2, -2.0f, i11 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                i2 i2Var = new i2(context);
                i2Var.setDelegate(new u0(this));
                textView = i2Var;
            }
            return new v4.f1(textView);
        }
        h5 h5Var = new h5(context, i6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        textView = view;
        return new v4.f1(textView);
    }
}
