package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lv3 extends n39 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final nv3 s;
    public final li3 c = new li3(this, (byte) 20);
    public int d = -1;
    public boolean r = false;

    public lv3(nv3 nv3Var) {
        this.s = nv3Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 2) {
            return true;
        }
        return false;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        nv3 nv3Var = this.s;
        ArrayList arrayList = nv3Var.n;
        ArrayList arrayList2 = nv3Var.h;
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
        nv3 nv3Var = this.s;
        ew3 ew3Var = nv3Var.r;
        if (!this.r) {
            this.r = true;
            nv3Var.d.c(true);
            if (this.d >= 0) {
                int i = ew3.C1;
                ConnectionsManager.getInstance(ew3Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f == null) {
                int i2 = ew3.C1;
                TLObject a2 = na7.q1(ew3Var.a).a2(na7.q1(ew3Var.a).o3);
                if (a2 instanceof TLRPC.User) {
                    this.f = (TLRPC.User) a2;
                }
            }
            if (this.f == null) {
                if (!this.n) {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    int i3 = ew3.C1;
                    tL_contacts_resolveUsername.username = na7.q1(ew3Var.a).o3;
                    this.d = ConnectionsManager.getInstance(ew3Var.a).sendRequest(tL_contacts_resolveUsername, new tf(this, (byte) 22));
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            int i4 = ew3.C1;
            tL_messages_getInlineBotResults.bot = na7.q1(ew3Var.a).o1(this.f);
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
            ad7.Y(ew3Var.a).L(str4, new ji1(this, isEmpty, tL_messages_getInlineBotResults, str4));
        }
    }

    public final void G(String str) {
        nv3 nv3Var = this.s;
        xv3 xv3Var = nv3Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                ew3 ew3Var = nv3Var.r;
                int i = ew3.C1;
                ConnectionsManager.getInstance(ew3Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        li3 li3Var = this.c;
        gl.r(li3Var);
        if (TextUtils.isEmpty(str)) {
            nv3Var.n.clear();
            xv3Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        xv3Var.c(true);
        gl.d3(li3Var, 1500L);
    }

    public final void H(boolean z) {
        nv3 nv3Var = this.s;
        ArrayList arrayList = nv3Var.h;
        arrayList.clear();
        ew3 ew3Var = nv3Var.r;
        int i = ew3.C1;
        arrayList.addAll(new ArrayList(hq6.d0(ew3Var.a).j0));
        if (z) {
            f();
        }
    }

    @Override
    public final int b() {
        int i;
        nv3 nv3Var = this.s;
        ArrayList arrayList = nv3Var.n;
        ArrayList arrayList2 = nv3Var.h;
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
        nv3 nv3Var = this.s;
        ArrayList arrayList = nv3Var.h;
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        if (!arrayList.isEmpty() && TextUtils.isEmpty(this.e)) {
            i2 -= arrayList.size();
        }
        if (!nv3Var.n.isEmpty() && !arrayList.isEmpty() && TextUtils.isEmpty(this.e) && i2 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new e49(-1, (int) this.s.r.r1));
        } else if (i2 == 2) {
            bw2 bw2Var = (bw2) view;
            Object E = E(i);
            if (E instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) E;
                bw2Var.getClass();
                bw2Var.d(0, "gif" + document, document);
            } else if (E instanceof TLRPC.BotInlineResult) {
                bw2Var.e((TLRPC.BotInlineResult) E, this.f, true, false, false, true);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        nv3 nv3Var = this.s;
        if (i == 0) {
            view = new View(nv3Var.getContext());
        } else if (i == 1) {
            Context context = nv3Var.getContext();
            ew3 ew3Var = nv3Var.r;
            int i2 = ew3.C1;
            vza vzaVar = new vza(context, false, false, ew3Var.J0, false);
            vzaVar.a(0, k96.M0(2131750822, null));
            e49 e49Var = new e49(-1, -2);
            ((ViewGroup.MarginLayoutParams) e49Var).topMargin = gl.L(2.5f);
            ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin = gl.L(5.5f);
            vzaVar.setLayoutParams(e49Var);
            view = vzaVar;
        } else {
            bw2 bw2Var = new bw2(nv3Var.getContext());
            bw2Var.getPhotoImage().m0(7);
            if (bw2Var.e0 == null) {
                n41 n41Var = new n41(bw2Var, 1.0f, 3.0f);
                n41Var.e = (byte) 120;
                bw2Var.e0 = n41Var;
            }
            bw2Var.setIsKeyboard(true);
            bw2Var.setCanPreviewGif(true);
            view = bw2Var;
        }
        return new s49(view);
    }
}
