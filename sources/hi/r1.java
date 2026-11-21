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
import org.telegram.ui.Components.mc;
public final class r1 extends dk0 {
    public String f15319e;
    public TLRPC.User f15320f;
    public String h;
    public boolean f15321n;
    public final t1 f15323s;
    public final l f15318c = new l(this, 5);
    public int d = -1;
    public boolean f15322r = false;

    public r1(t1 t1Var) {
        this.f15323s = t1Var;
    }

    public static void E(r1 r1Var, boolean z10) {
        t1 t1Var = r1Var.f15323s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        i2 i2Var = t1Var.f15497r;
        int i7 = i2.C1;
        arrayList.addAll(new ArrayList(ri.d0(i2Var.f30170a).f26647j0));
        if (z10) {
            r1Var.f();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
        t1 t1Var = this.f15323s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f15319e)) {
            if (i10 >= 0 && i10 < t1Var.h.size()) {
                return t1Var.h.get(i10);
            }
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f15496n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f15319e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < t1Var.f15496n.size()) {
                return t1Var.f15496n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        t1 t1Var = this.f15323s;
        i2 i2Var = t1Var.f15497r;
        if (!this.f15322r) {
            this.f15322r = true;
            t1Var.d.c(true);
            if (this.d >= 0) {
                int i7 = i2.C1;
                ConnectionsManager.getInstance(i2Var.f30170a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f15320f == null) {
                int i10 = i2.C1;
                TLObject h22 = mp.u1(i2Var.f30170a).h2(mp.u1(i2Var.f30170a).N3);
                if (h22 instanceof TLRPC.User) {
                    this.f15320f = (TLRPC.User) h22;
                }
            }
            TLRPC.User user = this.f15320f;
            if (user == null && !this.f15321n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i11 = i2.C1;
                tL_contacts_resolveUsername.username = mp.u1(i2Var.f30170a).N3;
                this.d = ConnectionsManager.getInstance(i2Var.f30170a).sendRequest(tL_contacts_resolveUsername, new ai.g1(this, 9));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i12 = i2.C1;
                tL_messages_getInlineBotResults.bot = mp.u1(i2Var.f30170a).s1(this.f15320f);
                String str = this.f15319e;
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
                tr.a0(i2Var.f30170a).M(str4, new di.j3(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        t1 t1Var = this.f15323s;
        d2 d2Var = t1Var.d;
        if (!TextUtils.equals(this.f15319e, str)) {
            if (this.d != -1) {
                i2 i2Var = t1Var.f15497r;
                int i7 = i2.C1;
                ConnectionsManager.getInstance(i2Var.f30170a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f15322r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f15319e);
        this.f15319e = str;
        l lVar = this.f15318c;
        org.telegram.messenger.g0.r(lVar);
        if (TextUtils.isEmpty(str)) {
            t1Var.f15496n.clear();
            d2Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        d2Var.c(true);
        org.telegram.messenger.g0.h3(lVar, 1500L);
    }

    @Override
    public final int b() {
        int i7;
        t1 t1Var = this.f15323s;
        int i10 = 0;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f15319e)) {
            i7 = t1Var.h.size();
        } else {
            i7 = 0;
        }
        int i11 = i7 + 1;
        if (!t1Var.f15496n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f15319e)) {
                i10 = 1;
            }
            i10 += t1Var.f15496n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        t1 t1Var = this.f15323s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f15319e)) {
            i10 -= t1Var.h.size();
        }
        if (!t1Var.f15496n.isEmpty() && !t1Var.h.isEmpty() && TextUtils.isEmpty(this.f15319e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) this.f15323s.f15497r.f14776s1));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Object F = F(i7);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                i2Var.getClass();
                i2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                i2Var.e((TLRPC.BotInlineResult) F, this.f15320f, true, false, false, true);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i2 i2Var;
        t1 t1Var = this.f15323s;
        if (i7 == 0) {
            i2Var = new View(t1Var.getContext());
        } else if (i7 == 1) {
            Context context = t1Var.getContext();
            i2 i2Var2 = t1Var.f15497r;
            int i10 = i2.C1;
            ?? k8Var = new org.telegram.ui.Cells.k8(context, false, false, i2Var2.J0, false);
            k8Var.a(0, gd.N0(2131750822, null));
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            k8Var.setLayoutParams(q0Var);
            i2Var = k8Var;
        } else {
            org.telegram.ui.Cells.i2 i2Var3 = new org.telegram.ui.Cells.i2(t1Var.getContext());
            i2Var3.getPhotoImage().E0(7);
            if (i2Var3.f30814e0 == null) {
                mc mcVar = new mc(i2Var3, 1.0f, 3.0f);
                mcVar.f37476e = 120L;
                i2Var3.f30814e0 = mcVar;
            }
            i2Var3.setIsKeyboard(true);
            i2Var3.setCanPreviewGif(true);
            i2Var = i2Var3;
        }
        return new v4.f1(i2Var);
    }
}
