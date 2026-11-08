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
import bi.md;
import bi.u3;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.ps;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.an;
public final class i1 extends oj0 implements ls {
    public ArrayList A0;
    public HashMap B0;
    public a0.h D;
    public String D0;
    public d1 E;
    public int E0;
    public String F;
    public t0 F0;
    public g1 G;
    public an G0;
    public g1 H;
    public final f6 H0;
    public ArrayList I;
    public ArrayList J;
    public final ab.b0 J0;
    public ArrayList K;
    public Object[] K0;
    public String L;
    public ArrayList M;
    public ArrayList N;
    public String[] O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public long S;
    public TLRPC.TL_inlineBotSwitchPM T;
    public TLRPC.TL_inlineBotWebView U;
    public final b90 V;
    public a0.h W;
    public int X;
    public int Y;
    public String Z;
    public boolean f16774a0;
    public boolean f16775b0;
    public int f16777c0;
    public ArrayList f16778d0;
    public int f16783g0;
    public final Context h;
    public int f16785i0;
    public int f16786j0;
    public boolean f16787k0;
    public TLRPC.Chat f16788l0;
    public long f16789n;
    public e1 f16790n0;
    public boolean f16791o0;
    public fi.x1 f16792p0;
    public String f16793q0;
    public final long f16794r;
    public String f16795r0;
    public final boolean f16796s;
    public String f16797s0;
    public int f16798t0;
    public int f16799u0;
    public boolean f16800v0;
    public TLRPC.ChatFull f16801w;
    public TLRPC.User f16802w0;
    public final z1 f16803x;
    public boolean f16804x0;
    public ArrayList f16805y;
    public z0 f16806y0;
    public Location f16807z0;
    public boolean f16776c = true;
    public boolean d = true;
    public boolean f16779e = true;
    public int f16781f = p10.f24470s0;
    public boolean f16780e0 = true;
    public boolean f16782f0 = true;
    public boolean f16784h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final y0 I0 = new y0(this, new x0(this));
    public boolean L0 = false;
    public int M0 = -1;

    public i1(Context context, long j3, long j10, b90 b90Var, f6 f6Var, boolean z9) {
        this.H0 = f6Var;
        this.h = context;
        this.V = b90Var;
        this.f16789n = j3;
        this.f16796s = z9;
        this.f16794r = j10;
        z1 z1Var = new z1(true);
        this.f16803x = z1Var;
        z1Var.f16992a = new h9.f1(this, 3);
        ab.b0 b0Var = (ab.b0) new ps(qs.f(this.f16781f), this).f24620b;
        b0Var.c(qs.X0);
        b0Var.c(qs.f25104x0);
        this.J0 = b0Var;
        b0Var.c(qs.Y1);
        b0Var.c(qs.Z1);
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
    public final boolean D(v4.d1 d1Var) {
        if ((this.f16802w0 == null || this.f16784h0) && this.A0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f26962id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (p10.i(this.f16781f).q() || !ij.Y3(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new h1(str, document));
                this.B0.put(str2, document);
                e1 e1Var = this.f16790n0;
                if (e1Var != null) {
                    e1Var.a();
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
                String str2 = document.dc_id + "_" + document.f26962id;
                HashMap hashMap = this.B0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (p10.i(this.f16781f).q() || !ij.Y3(document))) {
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
                    if (this.A0 == null) {
                        this.A0 = new ArrayList();
                        this.B0 = new HashMap();
                    }
                    this.A0.add(new h1(obj, document));
                    this.B0.put(str2, document);
                }
                i7++;
                obj = obj;
            }
        }
    }

    public final void G() {
        an anVar = this.G0;
        if (anVar != null && anVar.getParentActivity() != null) {
            if (this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f16802w0;
            if (user != null && user.bot_inline_geo) {
                this.I0.o();
            }
        }
    }

    public final void H() {
        if (this.A0 == null) {
            return;
        }
        ArrayList arrayList = this.C0;
        arrayList.clear();
        int min = Math.min(6, this.A0.size());
        for (int i7 = 0; i7 < min; i7++) {
            h1 h1Var = (h1) this.A0.get(i7);
            TLRPC.PhotoSize w10 = w7.w(h1Var.f16771a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f16781f);
                if (!w7.J(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f16781f).V(hc.c(w10, h1Var.f16771a), h1Var.f16772b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f16802w0;
        if (user != null && user.f27105id != this.S) {
            return null;
        }
        return this.T;
    }

    public final Object J(int i7) {
        String str;
        long j3;
        String str2;
        TLRPC.User user = null;
        if (this.F != null) {
            if (i7 >= 2) {
                i7 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            if (i7 >= 0 && i7 < arrayList.size()) {
                return ((h1) this.A0.get(i7)).f16771a;
            }
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.U;
                if (tL_inlineBotWebView != null) {
                    if (i7 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i7 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i7 >= 0 && i7 < arrayList2.size()) {
                        return this.R.get(i7);
                    }
                }
                i7--;
                if (i7 >= 0) {
                    return this.R.get(i7);
                }
            } else {
                ArrayList arrayList3 = this.f16805y;
                if (arrayList3 != null) {
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        return this.f16805y.get(i7);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null) {
                        if (i7 >= 0 && i7 < arrayList4.size()) {
                            return this.I.get(i7);
                        }
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null) {
                            if (i7 >= 0 && i7 < arrayList5.size()) {
                                return this.N.get(i7);
                            }
                        } else {
                            ArrayList arrayList6 = this.M;
                            if (arrayList6 != null || this.J != null) {
                                if (arrayList6 != null) {
                                    if (i7 >= 0 && i7 < arrayList6.size()) {
                                        return this.M.get(i7);
                                    }
                                    ArrayList arrayList7 = this.M;
                                    if (arrayList7 != null) {
                                        i7 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.J;
                                if (arrayList8 != null && i7 >= 0 && i7 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.P;
                                    if (arrayList9 != null && (this.f16783g0 != 1 || (this.f16801w instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i7) != null) {
                                            user = (TLRPC.User) this.P.get(i7);
                                            Object obj = this.J.get(i7);
                                            if (user != null) {
                                                str2 = t10.n(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.J.get(i7));
                                        }
                                    } else {
                                        str = (String) this.J.get(i7);
                                    }
                                    ArrayList arrayList10 = this.Q;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i7)).booleanValue()) {
                                        if (user != null) {
                                            j3 = user.f27105id;
                                        } else {
                                            j3 = 0;
                                        }
                                        return new f1(str, j3);
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
        if (this.f16802w0 != null && !this.f16784h0) {
            return 1;
        }
        int i12 = 0;
        if (this.F != null) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.T == null && this.U == null) {
                    i11 = 0;
                }
                return size2 + i11 + i7;
            }
            ArrayList arrayList3 = this.f16805y;
            if (arrayList3 != null) {
                i10 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.I;
                if (arrayList4 != null) {
                    i10 = arrayList4.size();
                } else if (this.J == null && this.M == null) {
                    ArrayList arrayList5 = this.N;
                    if (arrayList5 != null) {
                        i10 = arrayList5.size();
                    } else {
                        return i7;
                    }
                } else {
                    ArrayList arrayList6 = this.M;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.J;
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
        if (this.F != null) {
            if (i7 < 2) {
                return null;
            }
            i7 -= 2;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return null;
        }
        return ((h1) this.A0.get(i7)).f16772b;
    }

    public final int M(int i7) {
        if (this.F != null) {
            if (i7 < 2) {
                return 0;
            }
            i7 -= 2;
        }
        if (this.R != null) {
            if (this.T != null || this.U != null) {
                return i7 - 1;
            }
            return i7;
        }
        return i7;
    }

    public final boolean N() {
        if (this.A0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        y0 y0Var = this.I0;
        if (y0Var != null) {
            y0Var.p();
        }
        z0 z0Var = this.f16806y0;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.f16806y0 = null;
        }
        if (this.f16798t0 != 0) {
            ConnectionsManager.getInstance(this.f16781f).cancelRequest(this.f16798t0, true);
            this.f16798t0 = 0;
        }
        if (this.f16799u0 != 0) {
            ConnectionsManager.getInstance(this.f16781f).cancelRequest(this.f16799u0, true);
            this.f16799u0 = 0;
        }
        this.f16802w0 = null;
        this.T = null;
        this.f16784h0 = true;
        this.f16793q0 = null;
        this.f16795r0 = null;
        this.f16800v0 = false;
        this.J0.b();
    }

    public final void Q() {
        TLRPC.User user = this.f16802w0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f16807z0 = location;
            location.setLatitude(-1000.0d);
            this.f16807z0.setLongitude(-1000.0d);
            T(true, this.f16802w0, this.f16795r0, "");
        }
    }

    public final void R(TLRPC.User user) {
        an anVar;
        TLRPC.Chat chat;
        this.f16798t0 = 0;
        this.I0.p();
        b90 b90Var = this.V;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f16802w0 = user;
            long j3 = user.f27105id;
            if (j3 != this.S) {
                this.T = null;
                this.S = j3;
            }
            an anVar2 = this.G0;
            if (anVar2 != null && (chat = anVar2.f43777e) != null) {
                boolean t6 = t3.t(chat);
                this.f16784h0 = t6;
                if (!t6) {
                    f();
                    b90Var.a(true);
                    return;
                }
            }
            if (this.f16802w0.bot_inline_geo) {
                SharedPreferences sharedPreferences = qp.s1(this.f16781f).f24764d7;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.f16802w0.f27105id, false) && (anVar = this.G0) != null && anVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f16802w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    String M0 = id.M0(2131745426, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = id.M0(2131745427, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(id.M0(2131747832, null), new a3.h(this, zArr, user2, 13));
                    alertDialog$Builder.h(id.M0(2131752589, null), new ab.g(17, this, zArr));
                    this.G0.showDialog(u1Var, new u3(this, zArr, 4));
                } else {
                    G();
                }
            }
        } else {
            this.f16802w0 = null;
            this.T = null;
            this.f16784h0 = true;
        }
        if (this.f16802w0 == null) {
            this.f16800v0 = true;
            this.T = null;
            return;
        }
        if (b90Var != null) {
            b90Var.b(true);
        }
        T(true, this.f16802w0, this.f16795r0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.i1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(final boolean z9, final TLRPC.User user, final String str, final String str2) {
        Object obj;
        Location location;
        if (this.f16799u0 != 0) {
            ConnectionsManager.getInstance(this.f16781f).cancelRequest(this.f16799u0, true);
            this.f16799u0 = 0;
        }
        if (this.f16784h0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f16807z0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f16789n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f16789n);
                    sb2.append("_");
                    sb2.append(user.f27105id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f16807z0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f16807z0.getLongitude() + this.f16807z0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    final String sb3 = sb2.toString();
                    final yr a02 = yr.a0(this.f16781f);
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new w0(i1.this, str, z9, tLObject, user, str2, a02, sb3));
                        }
                    };
                    long j3 = user.f27105id;
                    if (j3 != this.S) {
                        this.T = null;
                        this.S = j3;
                    }
                    if (z9) {
                        a02.M(sb3, requestDelegate);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = qp.s1(this.f16781f).q1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f16807z0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.f16807z0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.f16807z0.getLongitude());
                    }
                    if (m5.C(this.f16789n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = qp.s1(this.f16781f).j1(this.f16789n);
                    }
                    this.f16799u0 = ConnectionsManager.getInstance(this.f16781f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
                    return;
                }
                return;
            }
            this.f16795r0 = null;
            return;
        }
        b90 b90Var = this.V;
        if (b90Var != null) {
            b90Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: jg.i1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z9) {
        this.f16776c = z9;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        an anVar;
        TLRPC.Chat chat;
        this.f16781f = p10.f24470s0;
        this.f16801w = chatFull;
        if (!this.f16784h0 && this.f16802w0 != null && (anVar = this.G0) != null && (chat = anVar.f43777e) != null) {
            boolean t6 = t3.t(chat);
            this.f16784h0 = t6;
            if (t6) {
                this.f16805y = null;
                f();
                this.V.a(false);
                R(this.f16802w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.f16777c0, this.f16778d0, this.f16775b0, this.f16774a0);
        }
    }

    public final void X(an anVar) {
        this.G0 = anVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z9) {
        this.f16805y = arrayList;
        if (!this.d || !this.f16779e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f16779e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || t10.A(user.f27105id)) {
                        it.remove();
                    }
                }
            }
        }
        this.D = hVar;
        fi.x1 x1Var = this.f16792p0;
        if (x1Var != null) {
            org.telegram.messenger.g0.r(x1Var);
            this.f16792p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z9) {
            f();
            this.V.a(!this.f16805y.isEmpty());
        }
    }

    @Override
    public final int b() {
        int K = K();
        this.M0 = K;
        return K;
    }

    @Override
    public final int d(int i7) {
        if (this.F != null) {
            if (i7 < 2) {
                return 6;
            }
            i7 -= 2;
        }
        if (this.A0 != null) {
            return 4;
        }
        if (this.f16802w0 != null && !this.f16784h0) {
            return 3;
        }
        if (this.R != null) {
            if (i7 == 0) {
                if (this.T != null || this.U != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t0 t0Var;
        boolean z9 = false;
        if (i7 != qs.Y1 && i7 != qs.Z1) {
            if (i7 == qs.X0) {
                t0 t0Var2 = this.F0;
                if (t0Var2 != null) {
                    org.telegram.messenger.g0.h3(t0Var2);
                    this.F0 = null;
                    return;
                }
                return;
            } else if (i7 == qs.f25104x0 && ((Integer) objArr[0]).intValue() == 0 && (t0Var = this.F0) != null) {
                org.telegram.messenger.g0.h3(t0Var);
                this.F0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.C0;
            if (!arrayList2.isEmpty() && this.f16791o0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z9 = true;
                    }
                    this.V.a(z9);
                }
            }
        }
    }

    @Override
    public final void f() {
        boolean z9;
        qi qiVar;
        String str;
        String str2;
        int i7 = this.M0;
        b90 b90Var = this.V;
        int i10 = 0;
        if (i7 != -1 && this.K0 != null) {
            int K = K();
            this.M0 = K;
            if (i7 != K) {
                z9 = true;
            } else {
                z9 = false;
            }
            int min = Math.min(i7, K);
            Object[] objArr = new Object[K];
            for (int i11 = 0; i11 < K; i11++) {
                objArr[i11] = J(i11);
            }
            while (i10 < min) {
                if (i10 >= 0) {
                    Object[] objArr2 = this.K0;
                    if (i10 < objArr2.length && i10 < K) {
                        Object obj = objArr2[i10];
                        Object obj2 = objArr[i10];
                        if (!(obj instanceof kg.s1)) {
                            if (obj != obj2 && ((!(obj instanceof h1) || !(obj2 instanceof h1) || ((h1) obj).f16771a != ((h1) obj2).f16771a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f27105id != ((TLRPC.User) obj2).f27105id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f26956id != ((TLRPC.Chat) obj2).f26956id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof qi) && (obj2 instanceof qi) && (str = (qiVar = (qi) obj).f24702b) != null) {
                                    qi qiVar2 = (qi) obj2;
                                    if (str.equals(qiVar2.f24702b) && (str2 = qiVar.f24701a) != null && str2.equals(qiVar2.f24701a)) {
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                }
                g(i10);
                z9 = true;
                i10++;
            }
            p(min, i7 - min);
            o(min, K - min);
            if (z9 && b90Var != null) {
                b90Var.c();
            }
            this.K0 = objArr;
            return;
        }
        if (b90Var != null) {
            this.M0 = K();
            b90Var.c();
        }
        super.f();
        int K2 = K();
        this.M0 = K2;
        this.K0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.K0;
            if (i10 < objArr3.length) {
                objArr3[i10] = J(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String str;
        TLRPC.User user;
        Boolean bool;
        an anVar;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str3 = this.F;
        if (str3 != null) {
            i10 = i7 - 2;
        } else {
            i10 = i7;
        }
        int i11 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i11 == 4) {
            x7 x7Var = (x7) view;
            if (i10 >= 0 && i10 < this.A0.size()) {
                h1 h1Var = (h1) this.A0.get(i10);
                TLRPC.Document document = h1Var.f16771a;
                Object obj = h1Var.f16772b;
                ug.z0 z0Var = x7Var.f30900n;
                l9 l9Var = x7Var.f30895a;
                x7Var.f30897c = obj;
                boolean Y3 = ij.Y3(document);
                x7Var.f30902s = Y3;
                if (Y3) {
                    z0Var.setColor(k6.x0(null, k6.f27852d6, false));
                    z0Var.H = true;
                    z0Var.I = false;
                    z0Var.invalidate();
                }
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
                rz f11 = t5.f(document, k6.f27796a7, 1.0f, x7Var.f30903w);
                if (ij.p(document)) {
                    if (f11 != null) {
                        l9Var.k(hc.b(document), "80_80", null, f11, x7Var.f30897c);
                        f10 = 1.0f;
                    } else if (w10 != null) {
                        f10 = 1.0f;
                        l9Var.l(hc.b(document), "80_80", hc.c(w10, document), null, 0, x7Var.f30897c);
                    } else {
                        f10 = 1.0f;
                        l9Var.k(hc.b(document), "80_80", null, null, x7Var.f30897c);
                    }
                } else {
                    f10 = 1.0f;
                    if (f11 != null) {
                        if (w10 != null) {
                            l9Var.k(hc.c(w10, document), null, "webp", f11, x7Var.f30897c);
                        } else {
                            l9Var.k(hc.b(document), null, "webp", f11, x7Var.f30897c);
                        }
                    } else {
                        l9Var.k(hc.c(w10, document), null, "webp", null, x7Var.f30897c);
                    }
                }
                x7Var.f30896b = document;
                Drawable background = x7Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    r6.y(x7Var, background, k6.qf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (x7Var.f30902s) {
                    x7Var.f30901r = true;
                } else {
                    x7Var.f30901r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z0Var.getLayoutParams();
                if (!p10.i(p10.f24470s0).q()) {
                    int L = org.telegram.messenger.g0.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                } else {
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    z0Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                }
                z0Var.setLocked(!p10.i(p10.f24470s0).q());
                org.telegram.messenger.g0.Z3(z0Var, x7Var.f30901r, 0.9f, true, false);
                x7Var.invalidate();
                x7Var.setClearsInputField(true);
            }
        } else if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.f43777e;
            if (chat != null) {
                if (!t3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(id.M0(2131749545, null));
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(id.M0(2131753967, null));
                } else {
                    textView.setText(id.a0("AttachInlineRestricted", null, 2131753968, id.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i11 == 5) {
            kg.p1 p1Var = (kg.p1) view;
            ArrayList arrayList = this.M;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                p1Var.a((kg.s1) this.M.get(i10), this.L, false);
            }
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                if (tL_inlineBotSwitchPM == null && this.U == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (i11 == 2) {
                    if (z9) {
                        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.U.text;
                        }
                        g0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z9) {
                    i10--;
                }
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    h2 h2Var = (h2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.R.get(i10);
                    TLRPC.User user2 = this.f16802w0;
                    boolean z12 = this.f16804x0;
                    if (i10 != this.R.size() - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z9 && i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h2Var.e(botInlineResult, user2, z12, z10, z11, "gif".equals(this.f16793q0));
                }
            } else if (i11 == 6) {
                g1 g1Var = (g1) view;
                int i12 = i10 + 2;
                if (i12 == 0) {
                    this.G = g1Var;
                } else {
                    this.H = g1Var;
                }
                TLRPC.Chat chat2 = this.f16788l0;
                if (chat2 == null && (anVar = this.G0) != null) {
                    chat2 = anVar.f43777e;
                }
                g1Var.a(i12, str3, chat2);
            } else if (i11 == 7) {
            } else {
                f5 f5Var = (f5) view;
                ArrayList arrayList3 = this.f16805y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i10);
                    if (tLObject instanceof TLRPC.User) {
                        f5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        f5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        f5Var.setText((String) this.I.get(i10));
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null && i10 >= 0 && i10 < arrayList5.size()) {
                            f5Var.setEmojiSuggestion((qi) this.N.get(i10));
                        } else {
                            ArrayList arrayList6 = this.J;
                            if (arrayList6 != null && i10 >= 0 && i10 < arrayList6.size()) {
                                ArrayList arrayList7 = this.K;
                                if (arrayList7 != null && i10 >= 0 && i10 < arrayList7.size()) {
                                    str = (String) this.K.get(i10);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.P;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    user = (TLRPC.User) this.P.get(i10);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.Q;
                                if (arrayList9 != null && i10 >= 0 && i10 < arrayList9.size()) {
                                    bool = (Boolean) this.Q.get(i10);
                                } else {
                                    bool = null;
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.J.get(i10);
                                md mdVar = f5Var.f29119b;
                                TextView textView2 = f5Var.f29120c;
                                w8 w8Var = f5Var.d;
                                l9 l9Var2 = f5Var.f29118a;
                                f5Var.a();
                                if (user != null) {
                                    l9Var2.setVisibility(0);
                                    w8Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        l9Var2.e(user, w8Var);
                                    } else {
                                        l9Var2.setImageDrawable(w8Var);
                                    }
                                } else {
                                    l9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    wp wpVar = new wp(2131231942, 0);
                                    wpVar.a(k6.A6);
                                    wpVar.f40019n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    mdVar.setText(spannableStringBuilder);
                                } else {
                                    mdVar.setText(str4);
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
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        TextView textView;
        int i10;
        int w02;
        f6 f6Var = this.H0;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                int i11 = 5;
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            boolean z9 = this.f16796s;
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.f30903w = f6Var;
                                    l9 l9Var = new l9(context);
                                    frameLayout.f30895a = l9Var;
                                    l9Var.setAspectFit(true);
                                    l9Var.setLayerNum(1);
                                    frameLayout.addView(l9Var, ha.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    ug.z0 z0Var = new ug.z0(1, context, null);
                                    frameLayout.f30900n = z0Var;
                                    z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                    z0Var.setImageReceiver(l9Var.getImageReceiver());
                                    frameLayout.addView(z0Var, ha.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View tmVar = new tm(context, 5);
                                    if (z9) {
                                        w02 = k6.r1(0.15f, -1);
                                    } else {
                                        w02 = k6.w0(k6.f27796a7, f6Var);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(w02);
                                    if (!z9) {
                                        r6.y(tmVar, colorDrawable, k6.f27796a7, f6Var, PorterDuff.Mode.SRC_IN);
                                    }
                                    xp xpVar = new xp(colorDrawable, k6.X0(context, 2131231229, k6.w0(k6.f27816b7, f6Var)), 0, 0);
                                    xpVar.f40361x = true;
                                    tmVar.setBackground(xpVar);
                                    view = tmVar;
                                }
                            } else {
                                textView = new g1(context, f6Var, z9);
                            }
                        } else {
                            view = new kg.p1(context, f6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        r6.V(textView2, k6.f28262z6, f6Var);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f29139a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    r6.V(textView3, k6.f28120rf, null);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (id.f23157a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView3.setGravity(i10);
                    if (!id.f23157a0) {
                        i11 = 3;
                    }
                    frameLayout2.addView(textView3, ha.d(-2, -2.0f, i11 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new u0(this));
                textView = h2Var;
            }
            return new v4.d1(textView);
        }
        f5 f5Var = new f5(context, f6Var);
        f5Var.setIsDarkTheme(false);
        view = f5Var;
        textView = view;
        return new v4.d1(textView);
    }
}
