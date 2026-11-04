package kg;

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
import b8.mf;
import ci.ec;
import ci.h3;
import ei.h9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.gs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.jz;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xp;
import org.telegram.ui.wm;
public final class e1 extends sj0 implements cs {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public a0.h E;
    public String E0;
    public z0 F;
    public int F0;
    public String G;
    public q0 G0;
    public c1 H;
    public wm H0;
    public c1 I;
    public final e6 I0;
    public ArrayList J;
    public ArrayList K;
    public final za.p K0;
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
    public final x80 W;
    public a0.h X;
    public int Y;
    public int Z;
    public String f16990a0;
    public boolean f16991b0;
    public boolean f16993c0;
    public int f16994d0;
    public ArrayList f16996e0;
    public final Context h;
    public int f17000h0;
    public int f17002j0;
    public int f17003k0;
    public boolean f17004l0;
    public TLRPC.Chat m0;
    public long f17005n;
    public a1 f17007o0;
    public boolean f17008p0;
    public h9 f17009q0;
    public final long f17010r;
    public String f17011r0;
    public final boolean f17012s;
    public String f17013s0;
    public String f17014t0;
    public int f17015u0;
    public int f17016v0;
    public TLRPC.ChatFull f17017w;
    public boolean f17018w0;
    public final v1 f17019x;
    public TLRPC.User f17020x0;
    public ArrayList f17021y;
    public boolean f17022y0;
    public w0 f17023z0;
    public boolean f16992c = true;
    public boolean d = true;
    public boolean f16995e = true;
    public int f16997f = h10.f22829t0;
    public boolean f16998f0 = true;
    public boolean f16999g0 = true;
    public boolean f17001i0 = true;
    public boolean f17006n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final v0 J0 = new v0(this, new u0(this));
    public boolean M0 = false;
    public int N0 = -1;

    public e1(Context context, long j10, long j11, x80 x80Var, e6 e6Var, boolean z10) {
        this.I0 = e6Var;
        this.h = context;
        this.W = x80Var;
        this.f17005n = j10;
        this.f17012s = z10;
        this.f17010r = j11;
        v1 v1Var = new v1(true);
        this.f17019x = v1Var;
        v1Var.f17206a = new hi.d(this, 5);
        za.p pVar = (za.p) new gs(hs.f(this.f16997f), this).f22762b;
        pVar.b(hs.X0);
        pVar.b(hs.f23333x0);
        this.K0 = pVar;
        pVar.b(hs.Y1);
        pVar.b(hs.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i3++;
        }
        return false;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if ((this.f17020x0 == null || this.f17001i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f27007id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (h10.i(this.f16997f).q() || !zi.Y3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new d1(str, document));
                this.C0.put(str2, document);
                a1 a1Var = this.f17007o0;
                if (a1Var != null) {
                    a1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            Object obj = str;
            while (i3 < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
                String str2 = document.dc_id + "_" + document.f27007id;
                HashMap hashMap = this.C0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (h10.i(this.f16997f).q() || !zi.Y3(document))) {
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
                    this.B0.add(new d1(obj, document));
                    this.C0.put(str2, document);
                }
                i3++;
                obj = obj;
            }
        }
    }

    public final void G() {
        wm wmVar = this.H0;
        if (wmVar != null && wmVar.getParentActivity() != null) {
            if (this.H0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.H0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f17020x0;
            if (user != null && user.bot_inline_geo) {
                this.J0.q();
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
        for (int i3 = 0; i3 < min; i3++) {
            d1 d1Var = (d1) this.B0.get(i3);
            TLRPC.PhotoSize w10 = w7.w(d1Var.f16949a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f16997f);
                if (!w7.K(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f16997f).W(ac.c(w10, d1Var.f16949a), d1Var.f16950b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f17020x0;
        if (user != null && user.f27150id != this.T) {
            return null;
        }
        return this.U;
    }

    public final Object J(int i3) {
        String str;
        long j10;
        String str2;
        TLRPC.User user = null;
        if (this.G != null) {
            if (i3 >= 2) {
                i3 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            if (i3 >= 0 && i3 < arrayList.size()) {
                return ((d1) this.B0.get(i3)).f16949a;
            }
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.V;
                if (tL_inlineBotWebView != null) {
                    if (i3 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i3 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i3 >= 0 && i3 < arrayList2.size()) {
                        return this.S.get(i3);
                    }
                }
                i3--;
                if (i3 >= 0) {
                    return this.S.get(i3);
                }
            } else {
                ArrayList arrayList3 = this.f17021y;
                if (arrayList3 != null) {
                    if (i3 >= 0 && i3 < arrayList3.size()) {
                        return this.f17021y.get(i3);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null) {
                        if (i3 >= 0 && i3 < arrayList4.size()) {
                            return this.J.get(i3);
                        }
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null) {
                            if (i3 >= 0 && i3 < arrayList5.size()) {
                                return this.O.get(i3);
                            }
                        } else {
                            ArrayList arrayList6 = this.N;
                            if (arrayList6 != null || this.K != null) {
                                if (arrayList6 != null) {
                                    if (i3 >= 0 && i3 < arrayList6.size()) {
                                        return this.N.get(i3);
                                    }
                                    ArrayList arrayList7 = this.N;
                                    if (arrayList7 != null) {
                                        i3 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.K;
                                if (arrayList8 != null && i3 >= 0 && i3 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.Q;
                                    if (arrayList9 != null && (this.f17000h0 != 1 || (this.f17017w instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i3) != null) {
                                            user = (TLRPC.User) this.Q.get(i3);
                                            Object obj = this.K.get(i3);
                                            if (user != null) {
                                                str2 = l10.n(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.K.get(i3));
                                        }
                                    } else {
                                        str = (String) this.K.get(i3);
                                    }
                                    ArrayList arrayList10 = this.R;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i3)).booleanValue()) {
                                        if (user != null) {
                                            j10 = user.f27150id;
                                        } else {
                                            j10 = 0;
                                        }
                                        return new b1(str, j10);
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
        int i3;
        int size;
        int i10;
        int i11 = 1;
        if (this.f17020x0 != null && !this.f17001i0) {
            return 1;
        }
        int i12 = 0;
        if (this.G != null) {
            i3 = 2;
        } else {
            i3 = 0;
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
                return size2 + i11 + i3;
            }
            ArrayList arrayList3 = this.f17021y;
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
                        return i3;
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
        return i10 + i3;
    }

    public final Object L(int i3) {
        if (this.G != null) {
            if (i3 < 2) {
                return null;
            }
            i3 -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i3 < 0 || i3 >= arrayList.size()) {
            return null;
        }
        return ((d1) this.B0.get(i3)).f16950b;
    }

    public final int M(int i3) {
        if (this.G != null) {
            if (i3 < 2) {
                return 0;
            }
            i3 -= 2;
        }
        if (this.S != null) {
            if (this.U != null || this.V != null) {
                return i3 - 1;
            }
            return i3;
        }
        return i3;
    }

    public final boolean N() {
        if (this.B0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        v0 v0Var = this.J0;
        if (v0Var != null) {
            v0Var.r();
        }
        w0 w0Var = this.f17023z0;
        if (w0Var != null) {
            org.telegram.messenger.g0.r(w0Var);
            this.f17023z0 = null;
        }
        if (this.f17015u0 != 0) {
            ConnectionsManager.getInstance(this.f16997f).cancelRequest(this.f17015u0, true);
            this.f17015u0 = 0;
        }
        if (this.f17016v0 != 0) {
            ConnectionsManager.getInstance(this.f16997f).cancelRequest(this.f17016v0, true);
            this.f17016v0 = 0;
        }
        this.f17020x0 = null;
        this.U = null;
        this.f17001i0 = true;
        this.f17011r0 = null;
        this.f17013s0 = null;
        this.f17018w0 = false;
        this.K0.a();
    }

    public final void Q() {
        TLRPC.User user = this.f17020x0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(-1000.0d);
            this.A0.setLongitude(-1000.0d);
            T(true, this.f17020x0, this.f17013s0, "");
        }
    }

    public final void R(TLRPC.User user) {
        wm wmVar;
        TLRPC.Chat chat;
        this.f17015u0 = 0;
        this.J0.r();
        x80 x80Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f17020x0 = user;
            long j10 = user.f27150id;
            if (j10 != this.T) {
                this.U = null;
                this.T = j10;
            }
            wm wmVar2 = this.H0;
            if (wmVar2 != null && (chat = wmVar2.f51292e) != null) {
                boolean t10 = t3.t(chat);
                this.f17001i0 = t10;
                if (!t10) {
                    f();
                    x80Var.a(true);
                    return;
                }
            }
            if (this.f17020x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = hp.s1(this.f16997f).f22989d7;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.f17020x0.f27150id, false) && (wmVar = this.H0) != null && wmVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f17020x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = bd.M0(2131745433, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = bd.M0(2131745434, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(bd.M0(2131747839, null), new aa.a(this, zArr, user2, 10));
                    alertDialog$Builder.h(bd.M0(2131752589, null), new ai.n(21, this, zArr));
                    this.H0.showDialog(s1Var, new h3(this, zArr, 4));
                } else {
                    G();
                }
            }
        } else {
            this.f17020x0 = null;
            this.U = null;
            this.f17001i0 = true;
        }
        if (this.f17020x0 == null) {
            this.f17018w0 = true;
            this.U = null;
            return;
        }
        if (x80Var != null) {
            x80Var.b(true);
        }
        T(true, this.f17020x0, this.f17013s0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Object obj;
        Location location;
        if (this.f17016v0 != 0) {
            ConnectionsManager.getInstance(this.f16997f).cancelRequest(this.f17016v0, true);
            this.f17016v0 = 0;
        }
        if (this.f17001i0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.A0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f17005n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f17005n);
                    sb2.append("_");
                    sb2.append(user.f27150id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.A0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    final String sb3 = sb2.toString();
                    final qr a02 = qr.a0(this.f16997f);
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new t0(e1.this, str, z10, tLObject, user, str2, a02, sb3));
                        }
                    };
                    long j10 = user.f27150id;
                    if (j10 != this.T) {
                        this.U = null;
                        this.T = j10;
                    }
                    if (z10) {
                        a02.M(sb3, requestDelegate);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = hp.s1(this.f16997f).q1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.A0.getLongitude());
                    }
                    if (m5.C(this.f17005n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = hp.s1(this.f16997f).j1(this.f17005n);
                    }
                    this.f17016v0 = ConnectionsManager.getInstance(this.f16997f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
                    return;
                }
                return;
            }
            this.f17013s0 = null;
            return;
        }
        x80 x80Var = this.W;
        if (x80Var != null) {
            x80Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r27, int r28, java.util.ArrayList r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f16992c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        wm wmVar;
        TLRPC.Chat chat;
        this.f16997f = h10.f22829t0;
        this.f17017w = chatFull;
        if (!this.f17001i0 && this.f17020x0 != null && (wmVar = this.H0) != null && (chat = wmVar.f51292e) != null) {
            boolean t10 = t3.t(chat);
            this.f17001i0 = t10;
            if (t10) {
                this.f17021y = null;
                f();
                this.W.a(false);
                R(this.f17020x0);
            }
        }
        String str = this.f16990a0;
        if (str != null) {
            U(str, this.f16994d0, this.f16996e0, this.f16993c0, this.f16991b0);
        }
    }

    public final void X(wm wmVar) {
        this.H0 = wmVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f17021y = arrayList;
        if (!this.d || !this.f16995e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f16995e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || l10.A(user.f27150id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = hVar;
        h9 h9Var = this.f17009q0;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f17009q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z10) {
            f();
            this.W.a(!this.f17021y.isEmpty());
        }
    }

    @Override
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override
    public final int d(int i3) {
        if (this.G != null) {
            if (i3 < 2) {
                return 6;
            }
            i3 -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.f17020x0 != null && !this.f17001i0) {
            return 3;
        }
        if (this.S != null) {
            if (i3 == 0) {
                if (this.U != null || this.V != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.N;
        if (arrayList != null && i3 >= 0 && i3 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        q0 q0Var;
        boolean z10 = false;
        if (i3 != hs.Y1 && i3 != hs.Z1) {
            if (i3 == hs.X0) {
                q0 q0Var2 = this.G0;
                if (q0Var2 != null) {
                    org.telegram.messenger.g0.h3(q0Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i3 == hs.f23333x0 && ((Integer) objArr[0]).intValue() == 0 && (q0Var = this.G0) != null) {
                org.telegram.messenger.g0.h3(q0Var);
                this.G0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.D0;
            if (!arrayList2.isEmpty() && this.f17008p0) {
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
        hi hiVar;
        String str;
        String str2;
        int i3 = this.N0;
        x80 x80Var = this.W;
        int i10 = 0;
        if (i3 != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            if (i3 != K) {
                z10 = true;
            } else {
                z10 = false;
            }
            int min = Math.min(i3, K);
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
                        if (!(obj instanceof lg.t1)) {
                            if (obj != obj2 && ((!(obj instanceof d1) || !(obj2 instanceof d1) || ((d1) obj).f16949a != ((d1) obj2).f16949a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f27150id != ((TLRPC.User) obj2).f27150id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f27001id != ((TLRPC.Chat) obj2).f27001id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof hi) && (obj2 instanceof hi) && (str = (hiVar = (hi) obj).f22932b) != null) {
                                    hi hiVar2 = (hi) obj2;
                                    if (str.equals(hiVar2.f22932b) && (str2 = hiVar.f22931a) != null && str2.equals(hiVar2.f22931a)) {
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
            p(min, i3 - min);
            o(min, K - min);
            if (z10 && x80Var != null) {
                x80Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (x80Var != null) {
            this.N0 = K();
            x80Var.c();
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
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String str;
        TLRPC.User user;
        Boolean bool;
        wm wmVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str3 = this.G;
        if (str3 != null) {
            i10 = i3 - 2;
        } else {
            i10 = i3;
        }
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i11 == 4) {
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            if (i10 >= 0 && i10 < this.B0.size()) {
                d1 d1Var2 = (d1) this.B0.get(i10);
                TLRPC.Document document = d1Var2.f16949a;
                Object obj = d1Var2.f16950b;
                vg.y0 y0Var = w7Var.f30818n;
                k9 k9Var = w7Var.f30813a;
                w7Var.f30815c = obj;
                boolean Y3 = zi.Y3(document);
                w7Var.f30820s = Y3;
                if (Y3) {
                    y0Var.setColor(k6.x0(null, k6.f27878d6, false));
                    y0Var.I = true;
                    y0Var.J = false;
                    y0Var.invalidate();
                }
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
                jz f11 = t5.f(document, k6.f27824a7, 1.0f, w7Var.f30821w);
                if (zi.p(document)) {
                    if (f11 != null) {
                        k9Var.k(ac.b(document), "80_80", null, f11, w7Var.f30815c);
                        f10 = 1.0f;
                    } else if (w10 != null) {
                        f10 = 1.0f;
                        k9Var.l(ac.b(document), "80_80", ac.c(w10, document), null, 0, w7Var.f30815c);
                    } else {
                        f10 = 1.0f;
                        k9Var.k(ac.b(document), "80_80", null, null, w7Var.f30815c);
                    }
                } else {
                    f10 = 1.0f;
                    if (f11 != null) {
                        if (w10 != null) {
                            k9Var.k(ac.c(w10, document), null, "webp", f11, w7Var.f30815c);
                        } else {
                            k9Var.k(ac.b(document), null, "webp", f11, w7Var.f30815c);
                        }
                    } else {
                        k9Var.k(ac.c(w10, document), null, "webp", null, w7Var.f30815c);
                    }
                }
                w7Var.f30814b = document;
                Drawable background = w7Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    r6.y(w7Var, background, k6.f28130qf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (w7Var.f30820s) {
                    w7Var.f30819r = true;
                } else {
                    w7Var.f30819r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y0Var.getLayoutParams();
                if (!h10.i(h10.f22829t0).q()) {
                    int L = org.telegram.messenger.g0.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                } else {
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    y0Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                }
                y0Var.setLocked(!h10.i(h10.f22829t0).q());
                org.telegram.messenger.g0.Z3(y0Var, w7Var.f30819r, 0.9f, true, false);
                w7Var.invalidate();
                w7Var.setClearsInputField(true);
            }
        } else if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.f51292e;
            if (chat != null) {
                if (!t3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(bd.M0(2131749552, null));
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(bd.M0(2131753967, null));
                } else {
                    textView.setText(bd.a0("AttachInlineRestricted", null, 2131753968, bd.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i11 == 5) {
            lg.q1 q1Var = (lg.q1) view;
            ArrayList arrayList = this.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                q1Var.a((lg.t1) this.N.get(i10), this.M, false);
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
                        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.V.text;
                        }
                        g0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z10) {
                    i10--;
                }
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    h2 h2Var = (h2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.S.get(i10);
                    TLRPC.User user2 = this.f17020x0;
                    boolean z13 = this.f17022y0;
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
                    h2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f17011r0));
                }
            } else if (i11 == 6) {
                c1 c1Var = (c1) view;
                int i12 = i10 + 2;
                if (i12 == 0) {
                    this.H = c1Var;
                } else {
                    this.I = c1Var;
                }
                TLRPC.Chat chat2 = this.m0;
                if (chat2 == null && (wmVar = this.H0) != null) {
                    chat2 = wmVar.f51292e;
                }
                c1Var.a(i12, str3, chat2);
            } else if (i11 == 7) {
            } else {
                f5 f5Var = (f5) view;
                ArrayList arrayList3 = this.f17021y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i10);
                    if (tLObject instanceof TLRPC.User) {
                        f5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        f5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        f5Var.setText((String) this.J.get(i10));
                    } else {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 != null && i10 >= 0 && i10 < arrayList5.size()) {
                            f5Var.setEmojiSuggestion((hi) this.O.get(i10));
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
                                ec ecVar = f5Var.f29175b;
                                TextView textView2 = f5Var.f29176c;
                                u8 u8Var = f5Var.d;
                                k9 k9Var2 = f5Var.f29174a;
                                f5Var.a();
                                if (user != null) {
                                    k9Var2.setVisibility(0);
                                    u8Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        k9Var2.e(user, u8Var);
                                    } else {
                                        k9Var2.setImageDrawable(u8Var);
                                    }
                                } else {
                                    k9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    wp wpVar = new wp(2131231942, 0);
                                    wpVar.a(k6.A6);
                                    wpVar.f40044n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    ecVar.setText(spannableStringBuilder);
                                } else {
                                    ecVar.setText(str4);
                                }
                                textView2.setText(i6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                f5Var.setDivider(false);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        TextView textView;
        int i10;
        int w02;
        e6 e6Var = this.I0;
        Context context = this.h;
        if (i3 != 0) {
            if (i3 != 1) {
                int i11 = 5;
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 5) {
                            boolean z10 = this.f17012s;
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.f30821w = e6Var;
                                    k9 k9Var = new k9(context);
                                    frameLayout.f30813a = k9Var;
                                    k9Var.setAspectFit(true);
                                    k9Var.setLayerNum(1);
                                    frameLayout.addView(k9Var, mf.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    vg.y0 y0Var = new vg.y0(1, context, null);
                                    frameLayout.f30818n = y0Var;
                                    y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                    y0Var.setImageReceiver(k9Var.getImageReceiver());
                                    frameLayout.addView(y0Var, mf.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View smVar = new sm(context, 6);
                                    if (z10) {
                                        w02 = k6.r1(0.15f, -1);
                                    } else {
                                        w02 = k6.w0(k6.f27824a7, e6Var);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(w02);
                                    if (!z10) {
                                        r6.y(smVar, colorDrawable, k6.f27824a7, e6Var, PorterDuff.Mode.SRC_IN);
                                    }
                                    xp xpVar = new xp(colorDrawable, k6.X0(context, 2131231229, k6.w0(k6.f27843b7, e6Var)), 0, 0);
                                    xpVar.f40447x = true;
                                    smVar.setBackground(xpVar);
                                    view = smVar;
                                }
                            } else {
                                textView = new c1(context, e6Var, z10);
                            }
                        } else {
                            view = new lg.q1(context, e6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        r6.V(textView2, k6.f28290z6, e6Var);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f29253a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    r6.V(textView3, k6.f28148rf, null);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (bd.f21784a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView3.setGravity(i10);
                    if (!bd.f21784a0) {
                        i11 = 3;
                    }
                    frameLayout2.addView(textView3, mf.d(-2, -2.0f, i11 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new r0(this));
                textView = h2Var;
            }
            return new u4.d1(textView);
        }
        f5 f5Var = new f5(context, e6Var);
        f5Var.setIsDarkTheme(false);
        view = f5Var;
        textView = view;
        return new u4.d1(textView);
    }
}
