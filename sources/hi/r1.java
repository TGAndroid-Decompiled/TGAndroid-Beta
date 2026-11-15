package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.tj0;
public final class r1 extends tj0 {
    public String f14965e;
    public TLRPC.User f14966f;
    public String h;
    public boolean f14967n;
    public final t1 f14969s;
    public final e1 f14964c = new e1(this, 1);
    public int d = -1;
    public boolean f14968r = false;

    public r1(t1 t1Var) {
        this.f14969s = t1Var;
    }

    public static void E(r1 r1Var, boolean z10) {
        t1 t1Var = r1Var.f14969s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        i2 i2Var = t1Var.f15141r;
        int i7 = i2.C1;
        arrayList.addAll(new ArrayList(si.b0(i2Var.f29679a).f26491j0));
        if (z10) {
            r1Var.f();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
        t1 t1Var = this.f14969s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f14965e)) {
            if (i10 >= 0 && i10 < t1Var.h.size()) {
                return t1Var.h.get(i10);
            }
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f15140n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f14965e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < t1Var.f15140n.size()) {
                return t1Var.f15140n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        t1 t1Var = this.f14969s;
        i2 i2Var = t1Var.f15141r;
        if (!this.f14968r) {
            this.f14968r = true;
            t1Var.d.c(true);
            if (this.d >= 0) {
                int i7 = i2.C1;
                ConnectionsManager.getInstance(i2Var.f29679a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f14966f == null) {
                int i10 = i2.C1;
                TLObject f22 = np.s1(i2Var.f29679a).f2(np.s1(i2Var.f29679a).L3);
                if (f22 instanceof TLRPC.User) {
                    this.f14966f = (TLRPC.User) f22;
                }
            }
            TLRPC.User user = this.f14966f;
            if (user == null && !this.f14967n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i11 = i2.C1;
                tL_contacts_resolveUsername.username = np.s1(i2Var.f29679a).L3;
                this.d = ConnectionsManager.getInstance(i2Var.f29679a).sendRequest(tL_contacts_resolveUsername, new ai.e1(this, 9));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i12 = i2.C1;
                tL_messages_getInlineBotResults.bot = np.s1(i2Var.f29679a).q1(this.f14966f);
                String str = this.f14965e;
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
                vr.a0(i2Var.f29679a).M(str4, new di.f3(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        t1 t1Var = this.f14969s;
        d2 d2Var = t1Var.d;
        if (!TextUtils.equals(this.f14965e, str)) {
            if (this.d != -1) {
                i2 i2Var = t1Var.f15141r;
                int i7 = i2.C1;
                ConnectionsManager.getInstance(i2Var.f29679a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f14968r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f14965e);
        this.f14965e = str;
        e1 e1Var = this.f14964c;
        org.telegram.messenger.g0.r(e1Var);
        if (TextUtils.isEmpty(str)) {
            t1Var.f15140n.clear();
            d2Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        d2Var.c(true);
        org.telegram.messenger.g0.i3(e1Var, 1500L);
    }

    @Override
    public final int b() {
        int i7;
        t1 t1Var = this.f14969s;
        int i10 = 0;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f14965e)) {
            i7 = t1Var.h.size();
        } else {
            i7 = 0;
        }
        int i11 = i7 + 1;
        if (!t1Var.f15140n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f14965e)) {
                i10 = 1;
            }
            i10 += t1Var.f15140n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        t1 t1Var = this.f14969s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f14965e)) {
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f15140n.isEmpty() && !t1Var.h.isEmpty() && TextUtils.isEmpty(this.f14965e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.p0(-1, (int) this.f14969s.f15141r.f14408s1));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i7);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                h2Var.getClass();
                h2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                h2Var.e((TLRPC.BotInlineResult) F, this.f14966f, true, false, false, true);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h2 h2Var;
        t1 t1Var = this.f14969s;
        if (i7 == 0) {
            h2Var = new View(t1Var.getContext());
        } else if (i7 == 1) {
            Context context = t1Var.getContext();
            i2 i2Var = t1Var.f15141r;
            int i10 = i2.C1;
            ?? i8Var = new org.telegram.ui.Cells.i8(context, false, false, i2Var.J0, false);
            i8Var.a(0, hd.M0(2131750834, null));
            v4.p0 p0Var = new v4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            i8Var.setLayoutParams(p0Var);
            h2Var = i8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(t1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.f30361e0 == null) {
                dc dcVar = new dc(h2Var2, 1.0f, 3.0f);
                dcVar.f33901e = 120L;
                h2Var2.f30361e0 = dcVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new v4.e1(h2Var);
    }
}
