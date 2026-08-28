package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vk0;
public final class u1 extends vk0 {
    public String f16131e;
    public TLRPC.User f16132f;
    public String h;
    public boolean f16133n;
    public final w1 f16135s;
    public final f1 f16130c = new f1(this, 1);
    public int d = -1;
    public boolean f16134r = false;

    public u1(w1 w1Var) {
        this.f16135s = w1Var;
    }

    public static void E(u1 u1Var, boolean z10) {
        int i9;
        w1 w1Var = u1Var.f16135s;
        ArrayList arrayList = w1Var.h;
        arrayList.clear();
        i9 = ((org.telegram.ui.ActionBar.f3) w1Var.f16233r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i9).getRecentGifs());
        if (z10) {
            u1Var.l();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i9) {
        int i10 = i9 - 1;
        w1 w1Var = this.f16135s;
        if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.f16131e)) {
            if (i10 >= 0 && i10 < w1Var.h.size()) {
                return w1Var.h.get(i10);
            }
            i10 -= w1Var.h.size();
        }
        if (!w1Var.f16232n.isEmpty()) {
            if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.f16131e)) {
                i10--;
            }
            if (i10 >= 0 && i10 < w1Var.f16232n.size()) {
                return w1Var.f16232n.get(i10);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        w1 w1Var = this.f16135s;
        n2 n2Var = w1Var.f16233r;
        if (!this.f16134r) {
            this.f16134r = true;
            w1Var.d.c(true);
            if (this.d >= 0) {
                i15 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                ConnectionsManager.getInstance(i15).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f16132f == null) {
                i13 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i13);
                i14 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i14).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f16132f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f16132f;
            if (user == null && !this.f16133n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i11).gifSearchBot;
                i12 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new bf.a(this, 14));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i9).getInputUser(this.f16132f);
                String str = this.f16131e;
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
                i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                MessagesStorage.getInstance(i10).getBotCache(str4, new t1(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i9;
        w1 w1Var = this.f16135s;
        g2 g2Var = w1Var.d;
        if (!TextUtils.equals(this.f16131e, str)) {
            if (this.d != -1) {
                i9 = ((org.telegram.ui.ActionBar.f3) w1Var.f16233r).currentAccount;
                ConnectionsManager.getInstance(i9).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f16134r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f16131e);
        this.f16131e = str;
        f1 f1Var = this.f16130c;
        AndroidUtilities.cancelRunOnUIThread(f1Var);
        if (TextUtils.isEmpty(str)) {
            w1Var.f16232n.clear();
            g2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        g2Var.c(true);
        AndroidUtilities.runOnUIThread(f1Var, 1500L);
    }

    @Override
    public final int h() {
        int i9;
        w1 w1Var = this.f16135s;
        int i10 = 0;
        if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.f16131e)) {
            i9 = w1Var.h.size();
        } else {
            i9 = 0;
        }
        int i11 = i9 + 1;
        if (!w1Var.f16232n.isEmpty()) {
            if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.f16131e)) {
                i10 = 1;
            }
            i10 += w1Var.f16232n.size();
        }
        return i11 + i10;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = i9 - 1;
        w1 w1Var = this.f16135s;
        if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.f16131e)) {
            i10 -= w1Var.h.size();
        }
        if (!w1Var.f16232n.isEmpty() && !w1Var.h.isEmpty() && TextUtils.isEmpty(this.f16131e) && i10 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.a1(-1, (int) this.f16135s.f16233r.f15737n));
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i9);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                e2Var.e((TLRPC.BotInlineResult) F, this.f16132f, true, false, false, true);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.Cells.e2 e2Var;
        w1 w1Var = this.f16135s;
        if (i9 == 0) {
            e2Var = new View(w1Var.getContext());
        } else if (i9 == 1) {
            Context context = w1Var.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) w1Var.f16233r).resourcesProvider;
            ?? m8Var = new org.telegram.ui.Cells.m8(context, false, false, b6Var, false);
            m8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.a1 a1Var = new f2.a1(-1, -2);
            ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin = AndroidUtilities.dp(5.5f);
            m8Var.setLayoutParams(a1Var);
            e2Var = m8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(w1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.V == null) {
                org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(e2Var2, 1.0f, 3.0f);
                pcVar.f31609e = 120L;
                e2Var2.V = pcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new f2.q1(e2Var);
    }
}
