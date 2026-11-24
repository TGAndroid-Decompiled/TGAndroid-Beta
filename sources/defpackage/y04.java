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
public final class y04 extends n39 {
    public eu3 F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final t14 M;
    public final Context c;
    public final boolean d;
    public final a14 e;
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

    public y04(t14 t14Var, Context context, boolean z, int i) {
        a14 a14Var;
        this.M = t14Var;
        this.c = context;
        this.d = z;
        this.f = i;
        if (z) {
            a14Var = null;
        } else {
            a14Var = new a14(t14Var, context);
        }
        this.e = a14Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z, boolean z2, boolean z3, String str3, TLObject tLObject) {
        boolean z4;
        t14 t14Var = this.M;
        wy3 wy3Var = t14Var.i0;
        HashMap hashMap = t14Var.m0;
        y04 y04Var = t14Var.o0;
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
                t14Var.p0.d(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, messages_botresults);
                }
                if (!z3 && messages_botresults.cache_time != 0) {
                    ad7.Y(t14Var.d1).s1(str3, messages_botresults);
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
                                y04Var.getClass();
                                g(i3 + size);
                                int i4 = this.I;
                                y04Var.getClass();
                                p(i4 + size + 1, i);
                            } else {
                                y04Var.getClass();
                                p(i3, i + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            y04Var.getClass();
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
                if (wy3Var.getAdapter() != this) {
                    wy3Var.setAdapter(this);
                }
                if (z2 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    t14Var.j0.g1(0, 0);
                    t14Var.D(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        t14 t14Var = this.M;
        HashMap hashMap = t14Var.m0;
        wy3 wy3Var = t14Var.i0;
        yy3 yy3Var = t14Var.p0;
        int i = t14Var.d1;
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z2;
        a14 a14Var = this.e;
        if (a14Var != null) {
            a14Var.a(z2);
        }
        TLObject a2 = na7.q1(i).a2(na7.q1(i).o3);
        boolean z4 = a2 instanceof TLRPC.User;
        boolean z5 = this.d;
        if (!z4) {
            if (z) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = na7.q1(i).o3;
                    ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new tf(this, (byte) 24));
                }
                if (!z5) {
                    yy3Var.d(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z5 && TextUtils.isEmpty(str2)) {
            yy3Var.d(true);
        }
        this.n = (TLRPC.User) a2;
        final String q = tb4.q("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final y04 y04Var = y04.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z6 = z;
                final boolean z7 = z2;
                final boolean z8 = z3;
                final String str5 = q;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        y04.this.E(str3, str4, z6, z7, z8, str5, tLObject);
                    }
                });
            }
        };
        if (!z3 && !z5 && z2 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (wy3Var.getAdapter() != this) {
                wy3Var.setAdapter(this);
            }
            f();
            t14Var.j0.g1(0, 0);
            t14Var.D(2);
        }
        if (z3 && hashMap.containsKey(q)) {
            E(str, str2, z, z2, true, q, (TLObject) hashMap.get(q));
        } else if (t14Var.l0.a.contains(q)) {
        } else {
            if (z3) {
                this.h = -1;
                ad7.Y(i).L(q, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = na7.q1(i).o1(this.n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z) {
        long j;
        t14 t14Var = this.M;
        wy3 wy3Var = t14Var.i0;
        int i = t14Var.d1;
        if (!this.d) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.w = false;
            a14 a14Var = this.e;
            if (a14Var != null) {
                a14Var.a(false);
            }
            eu3 eu3Var = this.F;
            if (eu3Var != null) {
                gl.r(eu3Var);
            }
            if (TextUtils.isEmpty(str)) {
                this.x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                int currentPosition = t14Var.q0.getCurrentPosition();
                if (currentPosition != t14Var.s0 && currentPosition != t14Var.t0) {
                    H((String) na7.q1(i).x3.get(currentPosition - t14Var.u0));
                    return;
                }
                w39 adapter = wy3Var.getAdapter();
                y04 y04Var = t14Var.o0;
                if (adapter != y04Var) {
                    wy3Var.setAdapter(y04Var);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                eu3 eu3Var2 = new eu3(this, str, (byte) 9);
                this.F = eu3Var2;
                if (z) {
                    j = 300;
                } else {
                    j = 0;
                }
                gl.d3(eu3Var2, j);
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
        t14 t14Var = this.M;
        wy3 wy3Var = t14Var.i0;
        if (this.d && (i = this.f) != 0) {
            if (i == Integer.MAX_VALUE) {
                this.I = t14Var.j1.size();
            } else {
                z04 z04Var = t14Var.j0;
                if (wy3Var.getMeasuredWidth() != 0) {
                    int measuredWidth = wy3Var.getMeasuredWidth();
                    int i2 = z04Var.J;
                    int L = gl.L(100.0f);
                    this.I = 0;
                    int size = t14Var.j1.size();
                    int i3 = i2;
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        TLRPC.Document document = (TLRPC.Document) t14Var.j1.get(i6);
                        via A1 = w64.A1(z04Var.D1(document, document.attributes));
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
    public final void t(s49 s49Var, int i) {
        if (s49Var.f != 0) {
            return;
        }
        bw2 bw2Var = (bw2) s49Var.a;
        int i2 = this.K;
        if (i2 >= 0 && i >= i2) {
            bw2Var.e((TLRPC.BotInlineResult) this.y.get(i - i2), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.j1.get(i);
        bw2Var.getClass();
        bw2Var.d(0, "gif" + document, document);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        if (i != 0) {
            t14 t14Var = this.M;
            if (i != 1) {
                if (i != 2) {
                    e49 e49Var = new e49(-1, -2);
                    view = this.e;
                    view.setLayoutParams(e49Var);
                } else {
                    vza vzaVar = new vza(this.c, false, false, t14Var.a2, t14Var.j2);
                    vzaVar.a(0, k96.M0(2131750822, null));
                    e49 e49Var2 = new e49(-1, -2);
                    ((ViewGroup.MarginLayoutParams) e49Var2).topMargin = gl.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) e49Var2).bottomMargin = gl.L(5.5f);
                    vzaVar.setLayoutParams(e49Var2);
                    view = vzaVar;
                }
            } else {
                view = new View(t14Var.getContext());
                view.setLayoutParams(new e49(-1, t14Var.c1));
            }
        } else {
            bw2 bw2Var = new bw2(this.c);
            bw2Var.setIsKeyboard(true);
            bw2Var.setCanPreviewGif(true);
            view = bw2Var;
        }
        return new s49(view);
    }
}
