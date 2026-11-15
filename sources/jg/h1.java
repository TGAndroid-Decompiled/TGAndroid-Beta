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
import c8.ja;
import di.a3;
import di.ub;
import fi.s5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.ms;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.oi;
import org.telegram.messenger.pz;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.an;
public final class h1 extends tj0 implements is {
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
    public an H0;
    public f1 I;
    public final e6 I0;
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
    public final d90 W;
    public a0.h X;
    public int Y;
    public int Z;
    public String f17117a0;
    public boolean f17118b0;
    public boolean f17120c0;
    public int f17121d0;
    public ArrayList f17123e0;
    public final Context h;
    public int f17127h0;
    public int f17129j0;
    public int f17130k0;
    public boolean f17131l0;
    public TLRPC.Chat m0;
    public long f17132n;
    public d1 f17134o0;
    public boolean f17135p0;
    public s5 f17136q0;
    public final long f17137r;
    public String f17138r0;
    public final boolean f17139s;
    public String f17140s0;
    public String f17141t0;
    public int f17142u0;
    public int f17143v0;
    public TLRPC.ChatFull f17144w;
    public boolean f17145w0;
    public final z1 f17146x;
    public TLRPC.User f17147x0;
    public ArrayList f17148y;
    public boolean f17149y0;
    public z0 f17150z0;
    public boolean f17119c = true;
    public boolean d = true;
    public boolean f17122e = true;
    public int f17124f = m10.f24934t0;
    public boolean f17125f0 = true;
    public boolean f17126g0 = true;
    public boolean f17128i0 = true;
    public boolean f17133n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final y0 J0 = new y0(this, new x0(this));
    public boolean M0 = false;
    public int N0 = -1;

    public h1(Context context, long j3, long j10, d90 d90Var, e6 e6Var, boolean z10) {
        this.I0 = e6Var;
        this.h = context;
        this.W = d90Var;
        this.f17132n = j3;
        this.f17139s = z10;
        this.f17137r = j10;
        z1 z1Var = new z1(true);
        this.f17146x = z1Var;
        z1Var.f17344a = new ia.d(this, 3);
        xi.e eVar = (xi.e) new ms(ns.f(this.f17124f), this).f25092b;
        eVar.c(ns.X0);
        eVar.c(ns.f25600x0);
        this.K0 = eVar;
        eVar.c(ns.Y1);
        eVar.c(ns.Z1);
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
        if ((this.f17147x0 == null || this.f17128i0) && this.B0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f28057id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (m10.i(this.f17124f).q() || !gj.X3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new g1(str, document));
                this.C0.put(str2, document);
                d1 d1Var = this.f17134o0;
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
                String str2 = document.dc_id + "_" + document.f28057id;
                HashMap hashMap = this.C0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (m10.i(this.f17124f).q() || !gj.X3(document))) {
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
        an anVar = this.H0;
        if (anVar != null && anVar.getParentActivity() != null) {
            if (this.H0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.H0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f17147x0;
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
            TLRPC.PhotoSize w10 = w7.w(g1Var.f17080a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f17124f);
                if (!w7.J(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f17124f).V(gc.c(w10, g1Var.f17080a), g1Var.f17081b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f17147x0;
        if (user != null && user.f28200id != this.T) {
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
                return ((g1) this.B0.get(i7)).f17080a;
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
                ArrayList arrayList3 = this.f17148y;
                if (arrayList3 != null) {
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        return this.f17148y.get(i7);
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
                                    if (arrayList9 != null && (this.f17127h0 != 1 || (this.f17144w instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i7) != null) {
                                            user = (TLRPC.User) this.Q.get(i7);
                                            Object obj = this.K.get(i7);
                                            if (user != null) {
                                                str2 = q10.n(user);
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
                                            j3 = user.f28200id;
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
        if (this.f17147x0 != null && !this.f17128i0) {
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
            ArrayList arrayList3 = this.f17148y;
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
        return ((g1) this.B0.get(i7)).f17081b;
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
        z0 z0Var = this.f17150z0;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.f17150z0 = null;
        }
        if (this.f17142u0 != 0) {
            ConnectionsManager.getInstance(this.f17124f).cancelRequest(this.f17142u0, true);
            this.f17142u0 = 0;
        }
        if (this.f17143v0 != 0) {
            ConnectionsManager.getInstance(this.f17124f).cancelRequest(this.f17143v0, true);
            this.f17143v0 = 0;
        }
        this.f17147x0 = null;
        this.U = null;
        this.f17128i0 = true;
        this.f17138r0 = null;
        this.f17140s0 = null;
        this.f17145w0 = false;
        this.K0.b();
    }

    public final void Q() {
        TLRPC.User user = this.f17147x0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(-1000.0d);
            this.A0.setLongitude(-1000.0d);
            T(true, this.f17147x0, this.f17140s0, "");
        }
    }

    public final void R(TLRPC.User user) {
        an anVar;
        TLRPC.Chat chat;
        this.f17142u0 = 0;
        this.J0.p();
        d90 d90Var = this.W;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f17147x0 = user;
            long j3 = user.f28200id;
            if (j3 != this.T) {
                this.U = null;
                this.T = j3;
            }
            an anVar2 = this.H0;
            if (anVar2 != null && (chat = anVar2.f45173e) != null) {
                boolean t6 = t3.t(chat);
                this.f17128i0 = t6;
                if (!t6) {
                    f();
                    d90Var.a(true);
                    return;
                }
            }
            if (this.f17147x0.bot_inline_geo) {
                SharedPreferences sharedPreferences = np.s1(this.f17124f).f25270e7;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.f17147x0.f28200id, false) && (anVar = this.H0) != null && anVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f17147x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = hd.M0(2131745423, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = hd.M0(2131745424, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(hd.M0(2131747831, null), new a3.h(this, zArr, user2, 12));
                    alertDialog$Builder.h(hd.M0(2131752589, null), new ab.g(21, this, zArr));
                    this.H0.showDialog(t1Var, new a3(this, zArr, 2));
                } else {
                    G();
                }
            }
        } else {
            this.f17147x0 = null;
            this.U = null;
            this.f17128i0 = true;
        }
        if (this.f17147x0 == null) {
            this.f17145w0 = true;
            this.U = null;
            return;
        }
        if (d90Var != null) {
            d90Var.b(true);
        }
        T(true, this.f17147x0, this.f17140s0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Object obj;
        Location location;
        if (this.f17143v0 != 0) {
            ConnectionsManager.getInstance(this.f17124f).cancelRequest(this.f17143v0, true);
            this.f17143v0 = 0;
        }
        if (this.f17128i0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.A0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f17132n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f17132n);
                    sb2.append("_");
                    sb2.append(user.f28200id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.A0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    final String sb3 = sb2.toString();
                    final vr a02 = vr.a0(this.f17124f);
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new w0(h1.this, str, z10, tLObject, user, str2, a02, sb3));
                        }
                    };
                    long j3 = user.f28200id;
                    if (j3 != this.T) {
                        this.U = null;
                        this.T = j3;
                    }
                    if (z10) {
                        a02.M(sb3, requestDelegate);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = np.s1(this.f17124f).q1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.A0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.A0.getLongitude());
                    }
                    if (m5.C(this.f17132n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = np.s1(this.f17124f).j1(this.f17132n);
                    }
                    this.f17143v0 = ConnectionsManager.getInstance(this.f17124f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
                    return;
                }
                return;
            }
            this.f17140s0 = null;
            return;
        }
        d90 d90Var = this.W;
        if (d90Var != null) {
            d90Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f17119c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        an anVar;
        TLRPC.Chat chat;
        this.f17124f = m10.f24934t0;
        this.f17144w = chatFull;
        if (!this.f17128i0 && this.f17147x0 != null && (anVar = this.H0) != null && (chat = anVar.f45173e) != null) {
            boolean t6 = t3.t(chat);
            this.f17128i0 = t6;
            if (t6) {
                this.f17148y = null;
                f();
                this.W.a(false);
                R(this.f17147x0);
            }
        }
        String str = this.f17117a0;
        if (str != null) {
            U(str, this.f17121d0, this.f17123e0, this.f17120c0, this.f17118b0);
        }
    }

    public final void X(an anVar) {
        this.H0 = anVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f17148y = arrayList;
        if (!this.d || !this.f17122e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f17122e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || q10.A(user.f28200id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = hVar;
        s5 s5Var = this.f17136q0;
        if (s5Var != null) {
            org.telegram.messenger.g0.r(s5Var);
            this.f17136q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z10) {
            f();
            this.W.a(!this.f17148y.isEmpty());
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
        if (this.f17147x0 != null && !this.f17128i0) {
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
        if (i7 != ns.Y1 && i7 != ns.Z1) {
            if (i7 == ns.X0) {
                t0 t0Var2 = this.G0;
                if (t0Var2 != null) {
                    org.telegram.messenger.g0.h3(t0Var2);
                    this.G0 = null;
                    return;
                }
                return;
            } else if (i7 == ns.f25600x0 && ((Integer) objArr[0]).intValue() == 0 && (t0Var = this.G0) != null) {
                org.telegram.messenger.g0.h3(t0Var);
                this.G0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.D0;
            if (!arrayList2.isEmpty() && this.f17135p0) {
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
        d90 d90Var = this.W;
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
                        if (!(obj instanceof kg.u1)) {
                            if (obj != obj2 && ((!(obj instanceof g1) || !(obj2 instanceof g1) || ((g1) obj).f17080a != ((g1) obj2).f17080a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f28200id != ((TLRPC.User) obj2).f28200id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f28051id != ((TLRPC.Chat) obj2).f28051id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof oi) && (obj2 instanceof oi) && (str = (oiVar = (oi) obj).f25765b) != null) {
                                    oi oiVar2 = (oi) obj2;
                                    if (str.equals(oiVar2.f25765b) && (str2 = oiVar.f25764a) != null && str2.equals(oiVar2.f25764a)) {
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
            if (z10 && d90Var != null) {
                d90Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (d90Var != null) {
            this.N0 = K();
            d90Var.c();
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
        an anVar;
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
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i11 == 4) {
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            if (i10 >= 0 && i10 < this.B0.size()) {
                g1 g1Var = (g1) this.B0.get(i10);
                TLRPC.Document document = g1Var.f17080a;
                Object obj = g1Var.f17081b;
                ug.a1 a1Var = w7Var.f31894n;
                i9 i9Var = w7Var.f31889a;
                w7Var.f31891c = obj;
                boolean X3 = gj.X3(document);
                w7Var.f31896s = X3;
                if (X3) {
                    a1Var.setColor(j6.x0(null, j6.f28849d6, false));
                    a1Var.I = true;
                    a1Var.J = false;
                    a1Var.invalidate();
                }
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
                pz f11 = t5.f(document, j6.f28792a7, 1.0f, w7Var.f31897w);
                if (gj.p(document)) {
                    if (f11 != null) {
                        i9Var.k(gc.b(document), "80_80", null, f11, w7Var.f31891c);
                        f10 = 1.0f;
                    } else if (w10 != null) {
                        f10 = 1.0f;
                        i9Var.l(gc.b(document), "80_80", gc.c(w10, document), null, 0, w7Var.f31891c);
                    } else {
                        f10 = 1.0f;
                        i9Var.k(gc.b(document), "80_80", null, null, w7Var.f31891c);
                    }
                } else {
                    f10 = 1.0f;
                    if (f11 != null) {
                        if (w10 != null) {
                            i9Var.k(gc.c(w10, document), null, "webp", f11, w7Var.f31891c);
                        } else {
                            i9Var.k(gc.b(document), null, "webp", f11, w7Var.f31891c);
                        }
                    } else {
                        i9Var.k(gc.c(w10, document), null, "webp", null, w7Var.f31891c);
                    }
                }
                w7Var.f31890b = document;
                Drawable background = w7Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    q6.x(w7Var, background, j6.f29154tf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (w7Var.f31896s) {
                    w7Var.f31895r = true;
                } else {
                    w7Var.f31895r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a1Var.getLayoutParams();
                if (!m10.i(m10.f24934t0).q()) {
                    int L = org.telegram.messenger.g0.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    a1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                } else {
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    a1Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                }
                a1Var.setLocked(!m10.i(m10.f24934t0).q());
                org.telegram.messenger.g0.Y3(a1Var, w7Var.f31895r, 0.9f, true, false);
                w7Var.invalidate();
                w7Var.setClearsInputField(true);
            }
        } else if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.f45173e;
            if (chat != null) {
                if (!t3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(hd.M0(2131749544, null));
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(hd.M0(2131753967, null));
                } else {
                    textView.setText(hd.a0("AttachInlineRestricted", null, 2131753968, hd.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i11 == 5) {
            kg.q1 q1Var = (kg.q1) view;
            ArrayList arrayList = this.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                q1Var.a((kg.u1) this.N.get(i10), this.M, false);
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
                    TLRPC.User user2 = this.f17147x0;
                    boolean z13 = this.f17149y0;
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
                    h2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f17138r0));
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
                if (chat2 == null && (anVar = this.H0) != null) {
                    chat2 = anVar.f45173e;
                }
                f1Var.a(i12, str3, chat2);
            } else if (i11 == 7) {
            } else {
                f5 f5Var = (f5) view;
                ArrayList arrayList3 = this.f17148y;
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
                            f5Var.setEmojiSuggestion((oi) this.O.get(i10));
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
                                ub ubVar = f5Var.f30234b;
                                TextView textView2 = f5Var.f30235c;
                                t8 t8Var = f5Var.d;
                                i9 i9Var2 = f5Var.f30233a;
                                f5Var.a();
                                if (user != null) {
                                    i9Var2.setVisibility(0);
                                    t8Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        i9Var2.f(user, t8Var);
                                    } else {
                                        i9Var2.setImageDrawable(t8Var);
                                    }
                                } else {
                                    i9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    eq eqVar = new eq(2131231942, 0);
                                    eqVar.a(j6.A6);
                                    eqVar.f34414n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    ubVar.setText(spannableStringBuilder);
                                } else {
                                    ubVar.setText(str4);
                                }
                                textView2.setText(org.telegram.messenger.j6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                f5Var.setDivider(false);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        TextView textView;
        int i10;
        int w02;
        e6 e6Var = this.I0;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                int i11 = 5;
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            boolean z10 = this.f17139s;
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.f31897w = e6Var;
                                    i9 i9Var = new i9(context);
                                    frameLayout.f31889a = i9Var;
                                    i9Var.setAspectFit(true);
                                    i9Var.setLayerNum(1);
                                    frameLayout.addView(i9Var, ja.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    ug.a1 a1Var = new ug.a1(1, context, null);
                                    frameLayout.f31894n = a1Var;
                                    a1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                    a1Var.setImageReceiver(i9Var.getImageReceiver());
                                    frameLayout.addView(a1Var, ja.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View bnVar = new bn(context, 4);
                                    if (z10) {
                                        w02 = j6.r1(0.15f, -1);
                                    } else {
                                        w02 = j6.w0(j6.f28792a7, e6Var);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(w02);
                                    if (!z10) {
                                        q6.x(bnVar, colorDrawable, j6.f28792a7, e6Var, PorterDuff.Mode.SRC_IN);
                                    }
                                    fq fqVar = new fq(colorDrawable, j6.X0(context, 2131231229, j6.w0(j6.f28813b7, e6Var)), 0, 0);
                                    fqVar.f34678x = true;
                                    bnVar.setBackground(fqVar);
                                    view = bnVar;
                                }
                            } else {
                                textView = new f1(context, e6Var, z10);
                            }
                        } else {
                            view = new kg.q1(context, e6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        q6.U(textView2, j6.f29260z6, e6Var);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f30312a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    q6.U(textView3, j6.f29174uf, null);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (hd.f24101a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView3.setGravity(i10);
                    if (!hd.f24101a0) {
                        i11 = 3;
                    }
                    frameLayout2.addView(textView3, ja.d(-2, -2.0f, i11 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new u0(this));
                textView = h2Var;
            }
            return new v4.e1(textView);
        }
        f5 f5Var = new f5(context, e6Var);
        f5Var.setIsDarkTheme(false);
        view = f5Var;
        textView = view;
        return new v4.e1(textView);
    }
}
