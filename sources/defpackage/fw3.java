package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fw3 extends c79 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final hw3 s;
    public final zg3 c = new zg3(this, (byte) 29);
    public int d = -1;
    public boolean r = false;

    public fw3(hw3 hw3Var) {
        this.s = hw3Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 2) {
            return true;
        }
        return false;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        hw3 hw3Var = this.s;
        ArrayList arrayList = hw3Var.n;
        ArrayList arrayList2 = hw3Var.h;
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
        hw3 hw3Var = this.s;
        zw3 zw3Var = hw3Var.r;
        if (!this.r) {
            this.r = true;
            hw3Var.d.c(true);
            if (this.d >= 0) {
                int i = zw3.C1;
                ConnectionsManager.getInstance(zw3Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f == null) {
                int i2 = zw3.C1;
                TLObject c2 = uc7.s1(zw3Var.a).c2(uc7.s1(zw3Var.a).p3);
                if (c2 instanceof TLRPC.User) {
                    this.f = (TLRPC.User) c2;
                }
            }
            if (this.f == null) {
                if (!this.n) {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    int i3 = zw3.C1;
                    tL_contacts_resolveUsername.username = uc7.s1(zw3Var.a).p3;
                    this.d = ConnectionsManager.getInstance(zw3Var.a).sendRequest(tL_contacts_resolveUsername, new ye(this, (byte) 22));
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            int i4 = zw3.C1;
            tL_messages_getInlineBotResults.bot = uc7.s1(zw3Var.a).q1(this.f);
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
            kf7.a0(zw3Var.a).N(str4, new si1(this, isEmpty, tL_messages_getInlineBotResults, str4));
        }
    }

    public final void G(String str) {
        hw3 hw3Var = this.s;
        sw3 sw3Var = hw3Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                zw3 zw3Var = hw3Var.r;
                int i = zw3.C1;
                ConnectionsManager.getInstance(zw3Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        zg3 zg3Var = this.c;
        hl.r(zg3Var);
        if (TextUtils.isEmpty(str)) {
            hw3Var.n.clear();
            sw3Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        sw3Var.c(true);
        hl.d3(zg3Var, 1500L);
    }

    public final void H(boolean z) {
        hw3 hw3Var = this.s;
        ArrayList arrayList = hw3Var.h;
        arrayList.clear();
        zw3 zw3Var = hw3Var.r;
        int i = zw3.C1;
        arrayList.addAll(new ArrayList(ls6.d0(zw3Var.a).j0));
        if (z) {
            f();
        }
    }

    @Override
    public final int b() {
        int i;
        hw3 hw3Var = this.s;
        ArrayList arrayList = hw3Var.n;
        ArrayList arrayList2 = hw3Var.h;
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
        hw3 hw3Var = this.s;
        ArrayList arrayList = hw3Var.h;
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        if (!arrayList.isEmpty() && TextUtils.isEmpty(this.e)) {
            i2 -= arrayList.size();
        }
        if (!hw3Var.n.isEmpty() && !arrayList.isEmpty() && TextUtils.isEmpty(this.e) && i2 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new r79(-1, (int) this.s.r.r1));
        } else if (i2 == 2) {
            vw2 vw2Var = (vw2) view;
            Object E = E(i);
            if (E instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) E;
                vw2Var.getClass();
                vw2Var.d(0, "gif" + document, document);
            } else if (E instanceof TLRPC.BotInlineResult) {
                vw2Var.e((TLRPC.BotInlineResult) E, this.f, true, false, false, true);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        hw3 hw3Var = this.s;
        if (i == 0) {
            view = new View(hw3Var.getContext());
        } else if (i == 1) {
            Context context = hw3Var.getContext();
            zw3 zw3Var = hw3Var.r;
            int i2 = zw3.C1;
            u3b u3bVar = new u3b(context, false, false, zw3Var.J0, false);
            u3bVar.a(0, ob6.M0(2131750799, null));
            r79 r79Var = new r79(-1, -2);
            ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(2.5f);
            ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin = hl.L(5.5f);
            u3bVar.setLayoutParams(r79Var);
            view = u3bVar;
        } else {
            vw2 vw2Var = new vw2(hw3Var.getContext());
            vw2Var.getPhotoImage().m0(7);
            if (vw2Var.e0 == null) {
                v41 v41Var = new v41(vw2Var, 1.0f, 3.0f);
                v41Var.e = (byte) 120;
                vw2Var.e0 = v41Var;
            }
            vw2Var.setIsKeyboard(true);
            vw2Var.setCanPreviewGif(true);
            view = vw2Var;
        }
        return new f89(view);
    }
}
