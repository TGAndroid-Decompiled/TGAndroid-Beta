package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.oj0;
public final class r1 extends oj0 {
    public String f12724e;
    public TLRPC.User f12725f;
    public String h;
    public boolean f12726n;
    public final t1 f12728s;
    public final di.f8 f12723c = new di.f8(this, 17);
    public int d = -1;
    public boolean f12727r = false;

    public r1(t1 t1Var) {
        this.f12728s = t1Var;
    }

    public static void E(r1 r1Var, boolean z9) {
        t1 t1Var = r1Var.f12728s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        k2 k2Var = t1Var.f12845r;
        int i7 = k2.B1;
        arrayList.addAll(new ArrayList(ui.b0(k2Var.f28669a).f25824i0));
        if (z9) {
            r1Var.f();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
        t1 t1Var = this.f12728s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f12724e)) {
            if (i10 >= 0 && i10 < t1Var.h.size()) {
                return t1Var.h.get(i10);
            }
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f12844n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f12724e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < t1Var.f12844n.size()) {
                return t1Var.f12844n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        t1 t1Var = this.f12728s;
        k2 k2Var = t1Var.f12845r;
        if (!this.f12727r) {
            this.f12727r = true;
            t1Var.d.c(true);
            if (this.d >= 0) {
                int i7 = k2.B1;
                ConnectionsManager.getInstance(k2Var.f28669a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f12725f == null) {
                int i10 = k2.B1;
                TLObject f22 = qp.s1(k2Var.f28669a).f2(qp.s1(k2Var.f28669a).K3);
                if (f22 instanceof TLRPC.User) {
                    this.f12725f = (TLRPC.User) f22;
                }
            }
            TLRPC.User user = this.f12725f;
            if (user == null && !this.f12726n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i11 = k2.B1;
                tL_contacts_resolveUsername.username = qp.s1(k2Var.f28669a).K3;
                this.d = ConnectionsManager.getInstance(k2Var.f28669a).sendRequest(tL_contacts_resolveUsername, new bi.j0(this, 8));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i12 = k2.B1;
                tL_messages_getInlineBotResults.bot = qp.s1(k2Var.f28669a).q1(this.f12725f);
                String str = this.f12724e;
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
                yr.a0(k2Var.f28669a).M(str4, new bi.d4(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        t1 t1Var = this.f12728s;
        e2 e2Var = t1Var.d;
        if (!TextUtils.equals(this.f12724e, str)) {
            if (this.d != -1) {
                k2 k2Var = t1Var.f12845r;
                int i7 = k2.B1;
                ConnectionsManager.getInstance(k2Var.f28669a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f12727r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f12724e);
        this.f12724e = str;
        di.f8 f8Var = this.f12723c;
        org.telegram.messenger.g0.r(f8Var);
        if (TextUtils.isEmpty(str)) {
            t1Var.f12844n.clear();
            e2Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        e2Var.c(true);
        org.telegram.messenger.g0.i3(f8Var, 1500L);
    }

    @Override
    public final int b() {
        int i7;
        t1 t1Var = this.f12728s;
        int i10 = 0;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f12724e)) {
            i7 = t1Var.h.size();
        } else {
            i7 = 0;
        }
        int i11 = i7 + 1;
        if (!t1Var.f12844n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f12724e)) {
                i10 = 1;
            }
            i10 += t1Var.f12844n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        t1 t1Var = this.f12728s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f12724e)) {
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f12844n.isEmpty() && !t1Var.h.isEmpty() && TextUtils.isEmpty(this.f12724e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.o0(-1, (int) this.f12728s.f12845r.f12258r1));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i7);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                h2Var.getClass();
                h2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                h2Var.e((TLRPC.BotInlineResult) F, this.f12725f, true, false, false, true);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h2 h2Var;
        t1 t1Var = this.f12728s;
        if (i7 == 0) {
            h2Var = new View(t1Var.getContext());
        } else if (i7 == 1) {
            Context context = t1Var.getContext();
            k2 k2Var = t1Var.f12845r;
            int i10 = k2.B1;
            ?? j8Var = new org.telegram.ui.Cells.j8(context, false, false, k2Var.I0, false);
            j8Var.a(0, id.M0(2131750834, null));
            v4.o0 o0Var = new v4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            j8Var.setLayoutParams(o0Var);
            h2Var = j8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(t1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.f29252d0 == null) {
                hc hcVar = new hc(h2Var2, 1.0f, 3.0f);
                hcVar.f34299e = 120L;
                h2Var2.f29252d0 = hcVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new v4.d1(h2Var);
    }
}
