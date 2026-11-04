package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sj0;
public final class r1 extends sj0 {
    public String f13486e;
    public TLRPC.User f13487f;
    public String h;
    public boolean f13488n;
    public final t1 f13490s;
    public final ei.z5 f13485c = new ei.z5(this, 22);
    public int d = -1;
    public boolean f13489r = false;

    public r1(t1 t1Var) {
        this.f13490s = t1Var;
    }

    public static void E(r1 r1Var, boolean z10) {
        t1 t1Var = r1Var.f13490s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        i2 i2Var = t1Var.f13606r;
        int i3 = i2.f12950z1;
        arrayList.addAll(new ArrayList(li.b0(i2Var.f28583a).f24031j0));
        if (z10) {
            r1Var.f();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i3) {
        int i10 = i3 - 1;
        t1 t1Var = this.f13490s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f13486e)) {
            if (i10 >= 0 && i10 < t1Var.h.size()) {
                return t1Var.h.get(i10);
            }
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f13605n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f13486e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < t1Var.f13605n.size()) {
                return t1Var.f13605n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        t1 t1Var = this.f13490s;
        i2 i2Var = t1Var.f13606r;
        if (!this.f13489r) {
            this.f13489r = true;
            t1Var.d.c(true);
            if (this.d >= 0) {
                int i3 = i2.f12950z1;
                ConnectionsManager.getInstance(i2Var.f28583a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f13487f == null) {
                int i10 = i2.f12950z1;
                TLObject f22 = hp.s1(i2Var.f28583a).f2(hp.s1(i2Var.f28583a).L3);
                if (f22 instanceof TLRPC.User) {
                    this.f13487f = (TLRPC.User) f22;
                }
            }
            TLRPC.User user = this.f13487f;
            if (user == null && !this.f13488n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i11 = i2.f12950z1;
                tL_contacts_resolveUsername.username = hp.s1(i2Var.f28583a).L3;
                this.d = ConnectionsManager.getInstance(i2Var.f28583a).sendRequest(tL_contacts_resolveUsername, new ci.d0(this, 8));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i12 = i2.f12950z1;
                tL_messages_getInlineBotResults.bot = hp.s1(i2Var.f28583a).q1(this.f13487f);
                String str = this.f13486e;
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
                qr.a0(i2Var.f28583a).M(str4, new ci.o3(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        t1 t1Var = this.f13490s;
        d2 d2Var = t1Var.d;
        if (!TextUtils.equals(this.f13486e, str)) {
            if (this.d != -1) {
                i2 i2Var = t1Var.f13606r;
                int i3 = i2.f12950z1;
                ConnectionsManager.getInstance(i2Var.f28583a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f13489r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f13486e);
        this.f13486e = str;
        ei.z5 z5Var = this.f13485c;
        org.telegram.messenger.g0.r(z5Var);
        if (TextUtils.isEmpty(str)) {
            t1Var.f13605n.clear();
            d2Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        d2Var.c(true);
        org.telegram.messenger.g0.i3(z5Var, 1500L);
    }

    @Override
    public final int b() {
        int i3;
        t1 t1Var = this.f13490s;
        int i10 = 0;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f13486e)) {
            i3 = t1Var.h.size();
        } else {
            i3 = 0;
        }
        int i11 = i3 + 1;
        if (!t1Var.f13605n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f13486e)) {
                i10 = 1;
            }
            i10 += t1Var.f13605n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i10 = i3 - 1;
        t1 t1Var = this.f13490s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f13486e)) {
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f13605n.isEmpty() && !t1Var.h.isEmpty() && TextUtils.isEmpty(this.f13486e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new u4.p0(-1, (int) this.f13490s.f13606r.f12955p1));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i3);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                h2Var.getClass();
                h2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                h2Var.e((TLRPC.BotInlineResult) F, this.f13487f, true, false, false, true);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.h2 h2Var;
        t1 t1Var = this.f13490s;
        if (i3 == 0) {
            h2Var = new View(t1Var.getContext());
        } else if (i3 == 1) {
            Context context = t1Var.getContext();
            i2 i2Var = t1Var.f13606r;
            int i10 = i2.f12950z1;
            ?? i8Var = new org.telegram.ui.Cells.i8(context, false, false, i2Var.J0, false);
            i8Var.a(0, bd.M0(2131750835, null));
            u4.p0 p0Var = new u4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            i8Var.setLayoutParams(p0Var);
            h2Var = i8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(t1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.f29302e0 == null) {
                gc gcVar = new gc(h2Var2, 1.0f, 3.0f);
                gcVar.f34046e = 120L;
                h2Var2.f29302e0 = gcVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new u4.d1(h2Var);
    }
}
