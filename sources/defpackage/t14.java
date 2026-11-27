package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t14 extends c79 {
    public vx3 F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final o24 M;
    public final Context c;
    public final boolean d;
    public final v14 e;
    public final int f;
    public int h;
    public TLRPC.User n;
    public String r;
    public boolean s;
    public boolean w;
    public String x;
    public final ArrayList y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public t14(o24 o24Var, Context context, boolean z, int i) {
        v14 v14Var;
        this.M = o24Var;
        this.c = context;
        this.d = z;
        this.f = i;
        if (z) {
            v14Var = null;
        } else {
            v14Var = new v14(o24Var, context);
        }
        this.e = v14Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z, boolean z2, boolean z3, String str3, TLObject tLObject) {
        boolean z4;
        o24 o24Var = this.M;
        rz3 rz3Var = o24Var.i0;
        HashMap hashMap = o24Var.m0;
        t14 t14Var = o24Var.o0;
        if (str != null && str.equals(this.x)) {
            this.h = 0;
            if (z3 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z, z2, false);
                return;
            }
            HashMap hashMap2 = this.E;
            boolean z5 = this.d;
            ArrayList arrayList = this.y;
            if (!z5 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap2.clear();
                o24Var.p0.d(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, messages_botresults);
                }
                if (!z3 && messages_botresults.cache_time != 0) {
                    kf7.a0(o24Var.d1).w1(str3, messages_botresults);
                }
                this.r = messages_botresults.next_offset;
                int i = 0;
                for (int i2 = 0; i2 < messages_botresults.results.size(); i2++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i2);
                    if (!hashMap2.containsKey(botInlineResult.id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap2.put(botInlineResult.id, botInlineResult);
                        i++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.r)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.s = z4;
                if (i != 0) {
                    if (z2 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z5) {
                            int i3 = this.I;
                            if (size != 0) {
                                t14Var.getClass();
                                g(i3 + size);
                                int i4 = this.I;
                                t14Var.getClass();
                                p(i4 + size + 1, i);
                            } else {
                                t14Var.getClass();
                                p(i3, i + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            t14Var.getClass();
                            p(size, i);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    f();
                }
            } else {
                f();
            }
            if (!z5) {
                if (rz3Var.getAdapter() != this) {
                    rz3Var.setAdapter(this);
                }
                if (z2 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    o24Var.j0.g1(0, 0);
                    o24Var.D(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        o24 o24Var = this.M;
        HashMap hashMap = o24Var.m0;
        rz3 rz3Var = o24Var.i0;
        tz3 tz3Var = o24Var.p0;
        int i = o24Var.d1;
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z2;
        v14 v14Var = this.e;
        if (v14Var != null) {
            v14Var.a(z2);
        }
        TLObject c2 = uc7.s1(i).c2(uc7.s1(i).p3);
        boolean z4 = c2 instanceof TLRPC.User;
        boolean z5 = this.d;
        if (!z4) {
            if (z) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = uc7.s1(i).p3;
                    ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new ye(this, (byte) 24));
                }
                if (!z5) {
                    tz3Var.d(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z5 && TextUtils.isEmpty(str2)) {
            tz3Var.d(true);
        }
        this.n = (TLRPC.User) c2;
        final String q = qd4.q("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final t14 t14Var = t14.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z6 = z;
                final boolean z7 = z2;
                final boolean z8 = z3;
                final String str5 = q;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        t14.this.E(str3, str4, z6, z7, z8, str5, tLObject);
                    }
                });
            }
        };
        if (!z3 && !z5 && z2 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (rz3Var.getAdapter() != this) {
                rz3Var.setAdapter(this);
            }
            f();
            o24Var.j0.g1(0, 0);
            o24Var.D(2);
        }
        if (z3 && hashMap.containsKey(q)) {
            E(str, str2, z, z2, true, q, (TLObject) hashMap.get(q));
        } else if (o24Var.l0.a.contains(q)) {
        } else {
            if (z3) {
                this.h = -1;
                kf7.a0(i).N(q, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = uc7.s1(i).q1(this.n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z) {
        long j;
        o24 o24Var = this.M;
        rz3 rz3Var = o24Var.i0;
        int i = o24Var.d1;
        if (!this.d) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.w = false;
            v14 v14Var = this.e;
            if (v14Var != null) {
                v14Var.a(false);
            }
            vx3 vx3Var = this.F;
            if (vx3Var != null) {
                hl.r(vx3Var);
            }
            if (TextUtils.isEmpty(str)) {
                this.x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                int currentPosition = o24Var.q0.getCurrentPosition();
                if (currentPosition != o24Var.s0 && currentPosition != o24Var.t0) {
                    H((String) uc7.s1(i).y3.get(currentPosition - o24Var.u0));
                    return;
                }
                j79 adapter = rz3Var.getAdapter();
                t14 t14Var = o24Var.o0;
                if (adapter != t14Var) {
                    rz3Var.setAdapter(t14Var);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                vx3 vx3Var2 = new vx3(this, str, (byte) 7);
                this.F = vx3Var2;
                if (z) {
                    j = 300;
                } else {
                    j = 0;
                }
                hl.d3(vx3Var2, j);
            }
        }
    }

    public final void H(String str) {
        if (this.w && TextUtils.equals(this.x, str)) {
            this.M.j0.g1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.J = -1;
        this.K = -1;
        this.H = 0;
        boolean z = this.d;
        if (z) {
            this.H = this.I;
        }
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            if (z && this.I > 0) {
                int i = this.H;
                this.H = i + 1;
                this.J = i;
            }
            int i2 = this.H;
            this.K = i2;
            this.H = arrayList.size() + i2;
        } else if (!z) {
            this.H++;
        }
    }

    @Override
    public final int b() {
        return this.H;
    }

    @Override
    public final int d(int i) {
        if (this.d) {
            if (i == this.J) {
                return 2;
            }
            return 0;
        } else if (this.y.isEmpty()) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void f() {
        int i;
        o24 o24Var = this.M;
        rz3 rz3Var = o24Var.i0;
        if (this.d && (i = this.f) != 0) {
            if (i == Integer.MAX_VALUE) {
                this.I = o24Var.j1.size();
            } else {
                u14 u14Var = o24Var.j0;
                if (rz3Var.getMeasuredWidth() != 0) {
                    int measuredWidth = rz3Var.getMeasuredWidth();
                    int i2 = u14Var.J;
                    int L = hl.L(100.0f);
                    this.I = 0;
                    int size = o24Var.j1.size();
                    int i3 = i2;
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        TLRPC.Document document = (TLRPC.Document) o24Var.j1.get(i6);
                        qma A1 = q74.A1(u14Var.D1(document, document.attributes));
                        int min = Math.min(i2, (int) Math.floor((((A1.a / A1.b) * L) / measuredWidth) * i2));
                        if (i3 < min) {
                            this.I += i4;
                            i5++;
                            if (i5 == i) {
                                break;
                            }
                            i3 = i2;
                            i4 = 0;
                        }
                        i4++;
                        i3 -= min;
                    }
                    if (i5 < i) {
                        this.I += i4;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        if (f89Var.f != 0) {
            return;
        }
        vw2 vw2Var = (vw2) f89Var.a;
        int i2 = this.K;
        if (i2 >= 0 && i >= i2) {
            vw2Var.e((TLRPC.BotInlineResult) this.y.get(i - i2), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.j1.get(i);
        vw2Var.getClass();
        vw2Var.d(0, "gif" + document, document);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        if (i != 0) {
            o24 o24Var = this.M;
            if (i != 1) {
                if (i != 2) {
                    r79 r79Var = new r79(-1, -2);
                    view = this.e;
                    view.setLayoutParams(r79Var);
                } else {
                    u3b u3bVar = new u3b(this.c, false, false, o24Var.a2, o24Var.j2);
                    u3bVar.a(0, ob6.M0(2131750799, null));
                    r79 r79Var2 = new r79(-1, -2);
                    ((ViewGroup.MarginLayoutParams) r79Var2).topMargin = hl.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) r79Var2).bottomMargin = hl.L(5.5f);
                    u3bVar.setLayoutParams(r79Var2);
                    view = u3bVar;
                }
            } else {
                view = new View(o24Var.getContext());
                view.setLayoutParams(new r79(-1, o24Var.c1));
            }
        } else {
            vw2 vw2Var = new vw2(this.c);
            vw2Var.setIsKeyboard(true);
            vw2Var.setCanPreviewGif(true);
            view = vw2Var;
        }
        return new f89(view);
    }
}
