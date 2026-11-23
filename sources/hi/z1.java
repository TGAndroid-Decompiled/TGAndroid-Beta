package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
public final class z1 extends dk0 {
    public String f15892e;
    public TLRPC.User f15893f;
    public String h;
    public boolean f15894n;
    public final b2 f15896s;
    public final w f15891c = new w(this, 6);
    public int d = -1;
    public boolean f15895r = false;

    public z1(b2 b2Var) {
        this.f15896s = b2Var;
    }

    public static void E(z1 z1Var, boolean z10) {
        b2 b2Var = z1Var.f15896s;
        ArrayList arrayList = b2Var.h;
        arrayList.clear();
        r2 r2Var = b2Var.f14220r;
        int i7 = r2.D1;
        arrayList.addAll(new ArrayList(ri.d0(r2Var.f30223a).f26720j0));
        if (z10) {
            z1Var.f();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
        b2 b2Var = this.f15896s;
        if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.f15892e)) {
            if (i10 >= 0 && i10 < b2Var.h.size()) {
                return b2Var.h.get(i10);
            }
            i10 -= b2Var.h.size();
        }
        if (!b2Var.f14219n.isEmpty()) {
            if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.f15892e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < b2Var.f14219n.size()) {
                return b2Var.f14219n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        b2 b2Var = this.f15896s;
        r2 r2Var = b2Var.f14220r;
        if (!this.f15895r) {
            this.f15895r = true;
            b2Var.d.c(true);
            if (this.d >= 0) {
                int i7 = r2.D1;
                ConnectionsManager.getInstance(r2Var.f30223a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f15893f == null) {
                int i10 = r2.D1;
                TLObject h22 = mp.u1(r2Var.f30223a).h2(mp.u1(r2Var.f30223a).N3);
                if (h22 instanceof TLRPC.User) {
                    this.f15893f = (TLRPC.User) h22;
                }
            }
            TLRPC.User user = this.f15893f;
            if (user == null && !this.f15894n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i11 = r2.D1;
                tL_contacts_resolveUsername.username = mp.u1(r2Var.f30223a).N3;
                this.d = ConnectionsManager.getInstance(r2Var.f30223a).sendRequest(tL_contacts_resolveUsername, new ai.b1(this, 9));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i12 = r2.D1;
                tL_messages_getInlineBotResults.bot = mp.u1(r2Var.f30223a).s1(this.f15893f);
                String str = this.f15892e;
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
                tr.a0(r2Var.f30223a).M(str4, new di.j3(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        b2 b2Var = this.f15896s;
        l2 l2Var = b2Var.d;
        if (!TextUtils.equals(this.f15892e, str)) {
            if (this.d != -1) {
                r2 r2Var = b2Var.f14220r;
                int i7 = r2.D1;
                ConnectionsManager.getInstance(r2Var.f30223a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f15895r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f15892e);
        this.f15892e = str;
        w wVar = this.f15891c;
        org.telegram.messenger.g0.r(wVar);
        if (TextUtils.isEmpty(str)) {
            b2Var.f14219n.clear();
            l2Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        l2Var.c(true);
        org.telegram.messenger.g0.h3(wVar, 1500L);
    }

    @Override
    public final int b() {
        int i7;
        b2 b2Var = this.f15896s;
        int i10 = 0;
        if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.f15892e)) {
            i7 = b2Var.h.size();
        } else {
            i7 = 0;
        }
        int i11 = i7 + 1;
        if (!b2Var.f14219n.isEmpty()) {
            if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.f15892e)) {
                i10 = 1;
            }
            i10 += b2Var.f14219n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        b2 b2Var = this.f15896s;
        if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.f15892e)) {
            i10 -= b2Var.h.size();
        }
        if (!b2Var.f14219n.isEmpty() && !b2Var.h.isEmpty() && TextUtils.isEmpty(this.f15892e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) this.f15896s.f14220r.f15281s1));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Object F = F(i7);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                i2Var.getClass();
                i2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                i2Var.e((TLRPC.BotInlineResult) F, this.f15893f, true, false, false, true);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i2 i2Var;
        b2 b2Var = this.f15896s;
        if (i7 == 0) {
            i2Var = new View(b2Var.getContext());
        } else if (i7 == 1) {
            Context context = b2Var.getContext();
            r2 r2Var = b2Var.f14220r;
            int i10 = r2.D1;
            ?? j8Var = new org.telegram.ui.Cells.j8(context, false, false, r2Var.J0, false);
            j8Var.a(0, gd.N0(2131750822, null));
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            j8Var.setLayoutParams(q0Var);
            i2Var = j8Var;
        } else {
            org.telegram.ui.Cells.i2 i2Var2 = new org.telegram.ui.Cells.i2(b2Var.getContext());
            i2Var2.getPhotoImage().F0(7);
            if (i2Var2.f30873e0 == null) {
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(i2Var2, 1.0f, 3.0f);
                lcVar.f37106e = 120L;
                i2Var2.f30873e0 = lcVar;
            }
            i2Var2.setIsKeyboard(true);
            i2Var2.setCanPreviewGif(true);
            i2Var = i2Var2;
        }
        return new v4.f1(i2Var);
    }
}
