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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.mc;
public final class s1 extends bk0 {
    public String f15367e;
    public TLRPC.User f15368f;
    public String h;
    public boolean f15369n;
    public final u1 f15371s;
    public final k f15366c = new k(this, 5);
    public int d = -1;
    public boolean f15370r = false;

    public s1(u1 u1Var) {
        this.f15371s = u1Var;
    }

    public static void E(s1 s1Var, boolean z10) {
        u1 u1Var = s1Var.f15371s;
        ArrayList arrayList = u1Var.h;
        arrayList.clear();
        j2 j2Var = u1Var.f15526r;
        int i7 = j2.C1;
        arrayList.addAll(new ArrayList(ri.d0(j2Var.f30187a).f26619j0));
        if (z10) {
            s1Var.f();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
        u1 u1Var = this.f15371s;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f15367e)) {
            if (i10 >= 0 && i10 < u1Var.h.size()) {
                return u1Var.h.get(i10);
            }
            i10 -= u1Var.h.size();
        }
        if (!u1Var.f15525n.isEmpty()) {
            if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f15367e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < u1Var.f15525n.size()) {
                return u1Var.f15525n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        u1 u1Var = this.f15371s;
        j2 j2Var = u1Var.f15526r;
        if (!this.f15370r) {
            this.f15370r = true;
            u1Var.d.c(true);
            if (this.d >= 0) {
                int i7 = j2.C1;
                ConnectionsManager.getInstance(j2Var.f30187a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f15368f == null) {
                int i10 = j2.C1;
                TLObject h22 = mp.u1(j2Var.f30187a).h2(mp.u1(j2Var.f30187a).N3);
                if (h22 instanceof TLRPC.User) {
                    this.f15368f = (TLRPC.User) h22;
                }
            }
            TLRPC.User user = this.f15368f;
            if (user == null && !this.f15369n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i11 = j2.C1;
                tL_contacts_resolveUsername.username = mp.u1(j2Var.f30187a).N3;
                this.d = ConnectionsManager.getInstance(j2Var.f30187a).sendRequest(tL_contacts_resolveUsername, new ai.e1(this, 9));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i12 = j2.C1;
                tL_messages_getInlineBotResults.bot = mp.u1(j2Var.f30187a).s1(this.f15368f);
                String str = this.f15367e;
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
                tr.a0(j2Var.f30187a).M(str4, new di.j3(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        u1 u1Var = this.f15371s;
        e2 e2Var = u1Var.d;
        if (!TextUtils.equals(this.f15367e, str)) {
            if (this.d != -1) {
                j2 j2Var = u1Var.f15526r;
                int i7 = j2.C1;
                ConnectionsManager.getInstance(j2Var.f30187a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f15370r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f15367e);
        this.f15367e = str;
        k kVar = this.f15366c;
        org.telegram.messenger.g0.r(kVar);
        if (TextUtils.isEmpty(str)) {
            u1Var.f15525n.clear();
            e2Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        e2Var.c(true);
        org.telegram.messenger.g0.h3(kVar, 1500L);
    }

    @Override
    public final int b() {
        int i7;
        u1 u1Var = this.f15371s;
        int i10 = 0;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f15367e)) {
            i7 = u1Var.h.size();
        } else {
            i7 = 0;
        }
        int i11 = i7 + 1;
        if (!u1Var.f15525n.isEmpty()) {
            if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f15367e)) {
                i10 = 1;
            }
            i10 += u1Var.f15525n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        u1 u1Var = this.f15371s;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f15367e)) {
            i10 -= u1Var.h.size();
        }
        if (!u1Var.f15525n.isEmpty() && !u1Var.h.isEmpty() && TextUtils.isEmpty(this.f15367e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) this.f15371s.f15526r.f14798s1));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Object F = F(i7);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                i2Var.getClass();
                i2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                i2Var.e((TLRPC.BotInlineResult) F, this.f15368f, true, false, false, true);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i2 i2Var;
        u1 u1Var = this.f15371s;
        if (i7 == 0) {
            i2Var = new View(u1Var.getContext());
        } else if (i7 == 1) {
            Context context = u1Var.getContext();
            j2 j2Var = u1Var.f15526r;
            int i10 = j2.C1;
            ?? k8Var = new org.telegram.ui.Cells.k8(context, false, false, j2Var.J0, false);
            k8Var.a(0, gd.M0(2131750823, null));
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            k8Var.setLayoutParams(q0Var);
            i2Var = k8Var;
        } else {
            org.telegram.ui.Cells.i2 i2Var2 = new org.telegram.ui.Cells.i2(u1Var.getContext());
            i2Var2.getPhotoImage().E0(7);
            if (i2Var2.f30786e0 == null) {
                mc mcVar = new mc(i2Var2, 1.0f, 3.0f);
                mcVar.f37431e = 120L;
                i2Var2.f30786e0 = mcVar;
            }
            i2Var2.setIsKeyboard(true);
            i2Var2.setCanPreviewGif(true);
            i2Var = i2Var2;
        }
        return new v4.f1(i2Var);
    }
}
