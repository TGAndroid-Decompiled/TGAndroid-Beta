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
public final class j24 extends q59 {
    public pv3 F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final e34 M;
    public final Context c;
    public final boolean d;
    public final l24 e;
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

    public j24(e34 e34Var, Context context, boolean z, int i) {
        l24 l24Var;
        this.M = e34Var;
        this.c = context;
        this.d = z;
        this.f = i;
        if (z) {
            l24Var = null;
        } else {
            l24Var = new l24(e34Var, context);
        }
        this.e = l24Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z, boolean z2, boolean z3, String str3, TLObject tLObject) {
        boolean z4;
        e34 e34Var = this.M;
        g04 g04Var = e34Var.i0;
        HashMap hashMap = e34Var.m0;
        j24 j24Var = e34Var.o0;
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
                e34Var.p0.d(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, messages_botresults);
                }
                if (!z3 && messages_botresults.cache_time != 0) {
                    cf7.Y(e34Var.d1).s1(str3, messages_botresults);
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
                                j24Var.getClass();
                                g(i3 + size);
                                int i4 = this.I;
                                j24Var.getClass();
                                p(i4 + size + 1, i);
                            } else {
                                j24Var.getClass();
                                p(i3, i + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            j24Var.getClass();
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
                if (g04Var.getAdapter() != this) {
                    g04Var.setAdapter(this);
                }
                if (z2 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    e34Var.j0.g1(0, 0);
                    e34Var.C(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        e34 e34Var = this.M;
        HashMap hashMap = e34Var.m0;
        g04 g04Var = e34Var.i0;
        i04 i04Var = e34Var.p0;
        int i = e34Var.d1;
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z2;
        l24 l24Var = this.e;
        if (l24Var != null) {
            l24Var.a(z2);
        }
        TLObject b2 = oc7.r1(i).b2(oc7.r1(i).o3);
        boolean z4 = b2 instanceof TLRPC.User;
        boolean z5 = this.d;
        if (!z4) {
            if (z) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = oc7.r1(i).o3;
                    ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new tg(this, (byte) 24));
                }
                if (!z5) {
                    i04Var.d(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z5 && TextUtils.isEmpty(str2)) {
            i04Var.d(true);
        }
        this.n = (TLRPC.User) b2;
        final String r = td4.r("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final j24 j24Var = j24.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z6 = z;
                final boolean z7 = z2;
                final boolean z8 = z3;
                final String str5 = r;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        j24.this.E(str3, str4, z6, z7, z8, str5, tLObject);
                    }
                });
            }
        };
        if (!z3 && !z5 && z2 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (g04Var.getAdapter() != this) {
                g04Var.setAdapter(this);
            }
            f();
            e34Var.j0.g1(0, 0);
            e34Var.C(2);
        }
        if (z3 && hashMap.containsKey(r)) {
            E(str, str2, z, z2, true, r, (TLObject) hashMap.get(r));
        } else if (e34Var.l0.a.contains(r)) {
        } else {
            if (z3) {
                this.h = -1;
                cf7.Y(i).L(r, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = oc7.r1(i).p1(this.n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z) {
        long j;
        e34 e34Var = this.M;
        g04 g04Var = e34Var.i0;
        int i = e34Var.d1;
        if (!this.d) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.w = false;
            l24 l24Var = this.e;
            if (l24Var != null) {
                l24Var.a(false);
            }
            pv3 pv3Var = this.F;
            if (pv3Var != null) {
                gm.r(pv3Var);
            }
            if (TextUtils.isEmpty(str)) {
                this.x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                int currentPosition = e34Var.q0.getCurrentPosition();
                if (currentPosition != e34Var.s0 && currentPosition != e34Var.t0) {
                    H((String) oc7.r1(i).x3.get(currentPosition - e34Var.u0));
                    return;
                }
                y59 adapter = g04Var.getAdapter();
                j24 j24Var = e34Var.o0;
                if (adapter != j24Var) {
                    g04Var.setAdapter(j24Var);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                pv3 pv3Var2 = new pv3(this, str, (byte) 10);
                this.F = pv3Var2;
                if (z) {
                    j = 300;
                } else {
                    j = 0;
                }
                gm.d3(pv3Var2, j);
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
        e34 e34Var = this.M;
        g04 g04Var = e34Var.i0;
        if (this.d && (i = this.f) != 0) {
            if (i == Integer.MAX_VALUE) {
                this.I = e34Var.j1.size();
            } else {
                k24 k24Var = e34Var.j0;
                if (g04Var.getMeasuredWidth() != 0) {
                    int measuredWidth = g04Var.getMeasuredWidth();
                    int i2 = k24Var.J;
                    int L = gm.L(100.0f);
                    this.I = 0;
                    int size = e34Var.j1.size();
                    int i3 = i2;
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        TLRPC.Document document = (TLRPC.Document) e34Var.j1.get(i6);
                        xka A1 = f84.A1(k24Var.D1(document, document.attributes));
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
    public final void t(u69 u69Var, int i) {
        if (u69Var.f != 0) {
            return;
        }
        lx2 lx2Var = (lx2) u69Var.a;
        int i2 = this.K;
        if (i2 >= 0 && i >= i2) {
            lx2Var.e((TLRPC.BotInlineResult) this.y.get(i - i2), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.j1.get(i);
        lx2Var.getClass();
        lx2Var.d(0, "gif" + document, document);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        if (i != 0) {
            e34 e34Var = this.M;
            if (i != 1) {
                if (i != 2) {
                    g69 g69Var = new g69(-1, -2);
                    view = this.e;
                    view.setLayoutParams(g69Var);
                } else {
                    w1b w1bVar = new w1b(this.c, false, false, e34Var.a2, e34Var.j2);
                    w1bVar.a(0, jb6.M0(2131750771, null));
                    g69 g69Var2 = new g69(-1, -2);
                    ((ViewGroup.MarginLayoutParams) g69Var2).topMargin = gm.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) g69Var2).bottomMargin = gm.L(5.5f);
                    w1bVar.setLayoutParams(g69Var2);
                    view = w1bVar;
                }
            } else {
                view = new View(e34Var.getContext());
                view.setLayoutParams(new g69(-1, e34Var.c1));
            }
        } else {
            lx2 lx2Var = new lx2(this.c);
            lx2Var.setIsKeyboard(true);
            lx2Var.setCanPreviewGif(true);
            view = lx2Var;
        }
        return new u69(view);
    }
}
