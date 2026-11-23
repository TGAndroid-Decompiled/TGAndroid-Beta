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
import c8.na;
import di.a8;
import di.xb;
import hi.u5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.bn;
public final class h1 extends dk0 implements gs {
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
    public final h6 I0;
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
    public final q90 W;
    public a0.h X;
    public int Y;
    public int Z;
    public String f17494a0;
    public boolean f17495b0;
    public boolean f17497c0;
    public int f17498d0;
    public ArrayList f17500e0;
    public final Context h;
    public int f17504h0;
    public int f17506j0;
    public int f17507k0;
    public boolean f17508l0;
    public TLRPC.Chat m0;
    public long f17509n;
    public d1 f17511o0;
    public boolean f17512p0;
    public a8 f17513q0;
    public final long f17514r;
    public String f17515r0;
    public final boolean f17516s;
    public String f17517s0;
    public String f17518t0;
    public int f17519u0;
    public int f17520v0;
    public TLRPC.ChatFull f17521w;
    public boolean f17522w0;
    public final z1 f17523x;
    public TLRPC.User f17524x0;
    public ArrayList f17525y;
    public boolean f17526y0;
    public z0 f17527z0;
    public boolean f17496c = true;
    public boolean d = true;
    public boolean f17499e = true;
    public int f17501f = k10.f24932t0;
    public boolean f17502f0 = true;
    public boolean f17503g0 = true;
    public boolean f17505i0 = true;
    public boolean f17510n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final y0 J0 = new y0(this, new x0(this));
    public boolean M0 = false;
    public int N0 = -1;

    public h1(Context context, long j3, long j10, q90 q90Var, h6 h6Var, boolean z10) {
        this.I0 = h6Var;
        this.h = context;
        this.W = q90Var;
        this.f17509n = j3;
        this.f17516s = z10;
        this.f17514r = j10;
        z1 z1Var = new z1(true);
        this.f17523x = z1Var;
        z1Var.f17721a = new u5(this, 6);
        xi.e eVar = (xi.e) new ks(ls.f(this.f17501f), this).f25098b;
        eVar.c(ls.X0);
        eVar.c(ls.f25376x0);
        this.K0 = eVar;
        eVar.c(ls.Y1);
        eVar.c(ls.Z1);
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
    public final boolean D(v4.e1 e1Var) {
        if ((this.f17524x0 == null || this.f17505i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f28404id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (k10.i(this.f17501f).q() || !gj.X3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new g1(str, document));
                this.C0.put(str2, document);
                d1 d1Var = this.f17511o0;
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
                String str2 = document.dc_id + "_" + document.f28404id;
                HashMap hashMap = this.C0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (k10.i(this.f17501f).q() || !gj.X3(document))) {
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
            TLRPC.User user = this.f17524x0;
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
            TLRPC.PhotoSize w10 = w7.w(g1Var.f17457a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f17501f);
                if (!w7.J(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f17501f).V(gc.c(w10, g1Var.f17457a), g1Var.f17458b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f17524x0;
        if (user != null && user.f28547id != this.T) {
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
                return ((g1) this.B0.get(i7)).f17457a;
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
                ArrayList arrayList3 = this.f17525y;
                if (arrayList3 != null) {
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        return this.f17525y.get(i7);
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
                                    if (arrayList9 != null && (this.f17504h0 != 1 || (this.f17521w instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i7) != null) {
                                            user = (TLRPC.User) this.Q.get(i7);
                                            Object obj = this.K.get(i7);
                                            if (user != null) {
                                                str2 = p10.o(user);
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
                                            j3 = user.f28547id;
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
        if (this.f17524x0 != null && !this.f17505i0) {
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
            ArrayList arrayList3 = this.f17525y;
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
        return ((g1) this.B0.get(i7)).f17458b;
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
        z0 z0Var = this.f17527z0;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.f17527z0 = null;
        }
        if (this.f17519u0 != 0) {
            ConnectionsManager.getInstance(this.f17501f).cancelRequest(this.f17519u0, true);
            this.f17519u0 = 0;
        }
        if (this.f17520v0 != 0) {
            ConnectionsManager.getInstance(this.f17501f).cancelRequest(this.f17520v0, true);
            this.f17520v0 = 0;
        }
        this.f17524x0 = null;
        this.U = null;
        this.f17505i0 = true;
        this.f17515r0 = null;
        this.f17517s0 = null;
        this.f17522w0 = false;
        this.K0.b();
    }

    public final void Q() {
        TLRPC.User user = this.f17524x0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(-1000.0d);
            this.A0.setLongitude(-1000.0d);
            T(true, this.f17524x0, this.f17517s0, "");
        }
    }

    public final void R(TLRPC.User user) {
        bn bnVar;
        TLRPC.Chat chat;
        this.f17519u0 = 0;
        this.J0.p();
        q90 q90Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f17524x0 = user;
            long j3 = user.f28547id;
            if (j3 != this.T) {
                this.U = null;
                this.T = j3;
            }
            bn bnVar2 = this.H0;
            if (bnVar2 != null && (chat = bnVar2.f45958e) != null) {
                boolean t6 = v3.t(chat);
                this.f17505i0 = t6;
                if (!t6) {
                    f();
                    q90Var.a(true);
                    return;
                }
            }
            if (this.f17524x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = np.u1(this.f17501f).f25821g7;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.f17524x0.f28547id, false) && (bnVar = this.H0) != null && bnVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f17524x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String N0 = hd.N0(2131745227, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.S = N0;
                    t1Var.U = hd.N0(2131745228, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(hd.N0(2131747637, null), new a3.h(this, zArr, user2, 12));
                    alertDialog$Builder.h(hd.N0(2131752577, null), new ab.g(19, this, zArr));
                    this.H0.showDialog(t1Var, new di.u1(this, zArr, 3));
                } else {
                    G();
                }
            }
        } else {
            this.f17524x0 = null;
            this.U = null;
            this.f17505i0 = true;
        }
        if (this.f17524x0 == null) {
            this.f17522w0 = true;
            this.U = null;
            return;
        }
        if (q90Var != null) {
            q90Var.b(true);
        }
        T(true, this.f17524x0, this.f17517s0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Object obj;
        Location location;
        if (this.f17520v0 != 0) {
            ConnectionsManager.getInstance(this.f17501f).cancelRequest(this.f17520v0, true);
            this.f17520v0 = 0;
        }
        if (this.f17505i0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.A0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f17509n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f17509n);
                    sb2.append("_");
                    sb2.append(user.f28547id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.A0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    final String sb3 = sb2.toString();
                    final ur a02 = ur.a0(this.f17501f);
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new w0(h1.this, str, z10, tLObject, user, str2, a02, sb3));
                        }
                    };
                    long j3 = user.f28547id;
                    if (j3 != this.T) {
                        this.U = null;
                        this.T = j3;
                    }
                    if (z10) {
                        a02.M(sb3, requestDelegate);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = np.u1(this.f17501f).s1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.A0.getLongitude());
                    }
                    if (n5.C(this.f17509n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = np.u1(this.f17501f).l1(this.f17509n);
                    }
                    this.f17520v0 = ConnectionsManager.getInstance(this.f17501f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
                    return;
                }
                return;
            }
            this.f17517s0 = null;
            return;
        }
        q90 q90Var = this.W;
        if (q90Var != null) {
            q90Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f17496c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        bn bnVar;
        TLRPC.Chat chat;
        this.f17501f = k10.f24932t0;
        this.f17521w = chatFull;
        if (!this.f17505i0 && this.f17524x0 != null && (bnVar = this.H0) != null && (chat = bnVar.f45958e) != null) {
            boolean t6 = v3.t(chat);
            this.f17505i0 = t6;
            if (t6) {
                this.f17525y = null;
                f();
                this.W.a(false);
                R(this.f17524x0);
            }
        }
        String str = this.f17494a0;
        if (str != null) {
            U(str, this.f17498d0, this.f17500e0, this.f17497c0, this.f17495b0);
        }
    }

    public final void X(bn bnVar) {
        this.H0 = bnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f17525y = arrayList;
        if (!this.d || !this.f17499e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f17499e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || p10.B(user.f28547id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = hVar;
        a8 a8Var = this.f17513q0;
        if (a8Var != null) {
            org.telegram.messenger.g0.r(a8Var);
            this.f17513q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z10) {
            f();
            this.W.a(!this.f17525y.isEmpty());
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
        if (this.f17524x0 != null && !this.f17505i0) {
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
        if (i7 != ls.Y1 && i7 != ls.Z1) {
            if (i7 == ls.X0) {
                t0 t0Var2 = this.G0;
                if (t0Var2 != null) {
                    org.telegram.messenger.g0.g3(t0Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i7 == ls.f25376x0 && ((Integer) objArr[0]).intValue() == 0 && (t0Var = this.G0) != null) {
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
            if (!arrayList2.isEmpty() && this.f17512p0) {
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
        oi oiVar;
        String str;
        String str2;
        int i7 = this.N0;
        q90 q90Var = this.W;
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
                            if (obj != obj2 && ((!(obj instanceof g1) || !(obj2 instanceof g1) || ((g1) obj).f17457a != ((g1) obj2).f17457a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f28547id != ((TLRPC.User) obj2).f28547id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f28398id != ((TLRPC.Chat) obj2).f28398id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof oi) && (obj2 instanceof oi) && (str = (oiVar = (oi) obj).f26091b) != null) {
                                    oi oiVar2 = (oi) obj2;
                                    if (str.equals(oiVar2.f26091b) && (str2 = oiVar.f26090a) != null && str2.equals(oiVar2.f26090a)) {
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
            if (z10 && q90Var != null) {
                q90Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (q90Var != null) {
            this.N0 = K();
            q90Var.c();
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
    public final void t(v4.e1 e1Var, int i7) {
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
        int i11 = e1Var.f59115f;
        View view = e1Var.f59111a;
        if (i11 == 4) {
            y7 y7Var = (y7) view;
            if (i10 >= 0 && i10 < this.B0.size()) {
                g1 g1Var = (g1) this.B0.get(i10);
                TLRPC.Document document = g1Var.f17457a;
                Object obj = g1Var.f17458b;
                ug.b1 b1Var = y7Var.f32477n;
                q9 q9Var = y7Var.f32472a;
                y7Var.f32474c = obj;
                boolean X3 = gj.X3(document);
                y7Var.f32479s = X3;
                if (X3) {
                    b1Var.setColor(m6.x0(null, m6.f29347d6, false));
                    b1Var.I = true;
                    b1Var.J = false;
                    b1Var.invalidate();
                }
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
                mz f11 = org.telegram.messenger.u5.f(document, m6.f29290a7, 1.0f, y7Var.f32480w);
                if (gj.p(document)) {
                    if (f11 != null) {
                        q9Var.k(gc.b(document), "80_80", null, f11, y7Var.f32474c);
                        f10 = 1.0f;
                    } else if (w10 != null) {
                        f10 = 1.0f;
                        q9Var.l(gc.b(document), "80_80", gc.c(w10, document), null, 0, y7Var.f32474c);
                    } else {
                        f10 = 1.0f;
                        q9Var.k(gc.b(document), "80_80", null, null, y7Var.f32474c);
                    }
                } else {
                    f10 = 1.0f;
                    if (f11 != null) {
                        if (w10 != null) {
                            q9Var.k(gc.c(w10, document), null, "webp", f11, y7Var.f32474c);
                        } else {
                            q9Var.k(gc.b(document), null, "webp", f11, y7Var.f32474c);
                        }
                    } else {
                        q9Var.k(gc.c(w10, document), null, "webp", null, y7Var.f32474c);
                    }
                }
                y7Var.f32473b = document;
                Drawable background = y7Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    t6.x(y7Var, background, m6.f29652tf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (y7Var.f32479s) {
                    y7Var.f32478r = true;
                } else {
                    y7Var.f32478r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
                if (!k10.i(k10.f24932t0).q()) {
                    int L = org.telegram.messenger.g0.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                } else {
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    b1Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                }
                b1Var.setLocked(!k10.i(k10.f24932t0).q());
                org.telegram.messenger.g0.X3(b1Var, y7Var.f32478r, 0.9f, true, false);
                y7Var.invalidate();
                y7Var.setClearsInputField(true);
            }
        } else if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.f45958e;
            if (chat != null) {
                if (!v3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(hd.N0(2131749368, null));
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(hd.N0(2131753964, null));
                } else {
                    textView.setText(hd.a0("AttachInlineRestricted", null, 2131753965, hd.v(chat.banned_rights.until_date)));
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
                    TLRPC.User user2 = this.f17524x0;
                    boolean z13 = this.f17526y0;
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
                    i2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f17515r0));
                }
            } else if (i11 == 6) {
                f1 f1Var = (f1) view;
                int i12 = i10 + 2;
                if (i12 == 0) {
                    this.H = f1Var;
                } else {
                    this.I = f1Var;
                }
                TLRPC.Chat chat2 = this.m0;
                if (chat2 == null && (bnVar = this.H0) != null) {
                    chat2 = bnVar.f45958e;
                }
                f1Var.a(i12, str3, chat2);
            } else if (i11 == 7) {
            } else {
                h5 h5Var = (h5) view;
                ArrayList arrayList3 = this.f17525y;
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
                            h5Var.setEmojiSuggestion((oi) this.O.get(i10));
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
                                xb xbVar = h5Var.f30695b;
                                TextView textView2 = h5Var.f30696c;
                                b9 b9Var = h5Var.d;
                                q9 q9Var2 = h5Var.f30694a;
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
                                    nq nqVar = new nq(2131231943, 0);
                                    nqVar.a(m6.A6);
                                    nqVar.f37906n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        TextView textView;
        int i10;
        int w02;
        h6 h6Var = this.I0;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                int i11 = 5;
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            boolean z10 = this.f17516s;
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.f32480w = h6Var;
                                    q9 q9Var = new q9(context);
                                    frameLayout.f32472a = q9Var;
                                    q9Var.setAspectFit(true);
                                    q9Var.setLayerNum(1);
                                    frameLayout.addView(q9Var, na.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    ug.b1 b1Var = new ug.b1(1, context, null);
                                    frameLayout.f32477n = b1Var;
                                    b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                    b1Var.setImageReceiver(q9Var.getImageReceiver());
                                    frameLayout.addView(b1Var, na.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View lnVar = new ln(context, 4);
                                    if (z10) {
                                        w02 = m6.r1(0.15f, -1);
                                    } else {
                                        w02 = m6.w0(m6.f29290a7, h6Var);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(w02);
                                    if (!z10) {
                                        t6.x(lnVar, colorDrawable, m6.f29290a7, h6Var, PorterDuff.Mode.SRC_IN);
                                    }
                                    oq oqVar = new oq(colorDrawable, m6.X0(context, 2131231229, m6.w0(m6.f29311b7, h6Var)), 0, 0);
                                    oqVar.f38309x = true;
                                    lnVar.setBackground(oqVar);
                                    view = lnVar;
                                }
                            } else {
                                textView = new f1(context, h6Var, z10);
                            }
                        } else {
                            view = new kg.s1(context, h6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        t6.U(textView2, m6.f29758z6, h6Var);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f30687a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    t6.U(textView3, m6.f29672uf, null);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (hd.f24408a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView3.setGravity(i10);
                    if (!hd.f24408a0) {
                        i11 = 3;
                    }
                    frameLayout2.addView(textView3, na.d(-2, -2.0f, i11 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                i2 i2Var = new i2(context);
                i2Var.setDelegate(new u0(this));
                textView = i2Var;
            }
            return new v4.e1(textView);
        }
        h5 h5Var = new h5(context, h6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        textView = view;
        return new v4.e1(textView);
    }
}
