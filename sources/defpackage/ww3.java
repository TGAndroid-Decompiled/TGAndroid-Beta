package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ww3 extends q59 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final yw3 s;
    public final bi3 c = new bi3(this, (byte) 25);
    public int d = -1;
    public boolean r = false;

    public ww3(yw3 yw3Var) {
        this.s = yw3Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 2) {
            return true;
        }
        return false;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        yw3 yw3Var = this.s;
        ArrayList arrayList = yw3Var.n;
        ArrayList arrayList2 = yw3Var.h;
        if (!arrayList2.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i2 >= 0 && i2 < arrayList2.size()) {
                return arrayList2.get(i2);
            }
            i2 -= arrayList2.size();
        }
        if (!arrayList.isEmpty()) {
            if (!arrayList2.isEmpty() && TextUtils.isEmpty(this.e)) {
                i2--;
            }
            if (i2 >= 0 && i2 < arrayList.size()) {
                return arrayList.get(i2);
            }
            return null;
        }
        return null;
    }

    public final void F() {
        yw3 yw3Var = this.s;
        px3 px3Var = yw3Var.r;
        if (!this.r) {
            this.r = true;
            yw3Var.d.c(true);
            if (this.d >= 0) {
                int i = px3.C1;
                ConnectionsManager.getInstance(px3Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f == null) {
                int i2 = px3.C1;
                TLObject b2 = oc7.r1(px3Var.a).b2(oc7.r1(px3Var.a).o3);
                if (b2 instanceof TLRPC.User) {
                    this.f = (TLRPC.User) b2;
                }
            }
            if (this.f == null) {
                if (!this.n) {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    int i3 = px3.C1;
                    tL_contacts_resolveUsername.username = oc7.r1(px3Var.a).o3;
                    this.d = ConnectionsManager.getInstance(px3Var.a).sendRequest(tL_contacts_resolveUsername, new tg(this, (byte) 22));
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            int i4 = px3.C1;
            tL_messages_getInlineBotResults.bot = oc7.r1(px3Var.a).p1(this.f);
            String str = this.e;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            boolean isEmpty = TextUtils.isEmpty(this.h);
            String str3 = this.h;
            if (str3 != null) {
                str2 = str3;
            }
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            String str4 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
            cf7.Y(px3Var.a).L(str4, new rj1(this, isEmpty, tL_messages_getInlineBotResults, str4));
        }
    }

    public final void G(String str) {
        yw3 yw3Var = this.s;
        ix3 ix3Var = yw3Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                px3 px3Var = yw3Var.r;
                int i = px3.C1;
                ConnectionsManager.getInstance(px3Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        bi3 bi3Var = this.c;
        gm.r(bi3Var);
        if (TextUtils.isEmpty(str)) {
            yw3Var.n.clear();
            ix3Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        ix3Var.c(true);
        gm.d3(bi3Var, 1500L);
    }

    public final void H(boolean z) {
        yw3 yw3Var = this.s;
        ArrayList arrayList = yw3Var.h;
        arrayList.clear();
        px3 px3Var = yw3Var.r;
        int i = px3.C1;
        arrayList.addAll(new ArrayList(hs6.d0(px3Var.a).j0));
        if (z) {
            f();
        }
    }

    @Override
    public final int b() {
        int i;
        yw3 yw3Var = this.s;
        ArrayList arrayList = yw3Var.n;
        ArrayList arrayList2 = yw3Var.h;
        int i2 = 0;
        if (!arrayList2.isEmpty() && TextUtils.isEmpty(this.e)) {
            i = arrayList2.size();
        } else {
            i = 0;
        }
        int i3 = i + 1;
        if (!arrayList.isEmpty()) {
            if (!arrayList2.isEmpty() && TextUtils.isEmpty(this.e)) {
                i2 = 1;
            }
            i2 += arrayList.size();
        }
        return i3 + i2;
    }

    @Override
    public final int d(int i) {
        yw3 yw3Var = this.s;
        ArrayList arrayList = yw3Var.h;
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        if (!arrayList.isEmpty() && TextUtils.isEmpty(this.e)) {
            i2 -= arrayList.size();
        }
        if (!yw3Var.n.isEmpty() && !arrayList.isEmpty() && TextUtils.isEmpty(this.e) && i2 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new g69(-1, (int) this.s.r.r1));
        } else if (i2 == 2) {
            lx2 lx2Var = (lx2) view;
            Object E = E(i);
            if (E instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) E;
                lx2Var.getClass();
                lx2Var.d(0, "gif" + document, document);
            } else if (E instanceof TLRPC.BotInlineResult) {
                lx2Var.e((TLRPC.BotInlineResult) E, this.f, true, false, false, true);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        yw3 yw3Var = this.s;
        if (i == 0) {
            view = new View(yw3Var.getContext());
        } else if (i == 1) {
            Context context = yw3Var.getContext();
            px3 px3Var = yw3Var.r;
            int i2 = px3.C1;
            w1b w1bVar = new w1b(context, false, false, px3Var.J0, false);
            w1bVar.a(0, jb6.M0(2131750771, null));
            g69 g69Var = new g69(-1, -2);
            ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(2.5f);
            ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin = gm.L(5.5f);
            w1bVar.setLayoutParams(g69Var);
            view = w1bVar;
        } else {
            lx2 lx2Var = new lx2(yw3Var.getContext());
            lx2Var.getPhotoImage().m0(7);
            if (lx2Var.e0 == null) {
                u51 u51Var = new u51(lx2Var, 1.0f, 3.0f);
                u51Var.e = (byte) 120;
                lx2Var.e0 = u51Var;
            }
            lx2Var.setIsKeyboard(true);
            lx2Var.setCanPreviewGif(true);
            view = lx2Var;
        }
        return new u69(view);
    }
}
