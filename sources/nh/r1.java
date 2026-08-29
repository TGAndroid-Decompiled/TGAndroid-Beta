package nh;

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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.uc;
public final class r1 extends il0 {
    public String f18501e;
    public TLRPC.User f18502f;
    public String h;
    public boolean f18503n;
    public final t1 f18505s;
    public final lh.m5 f18500c = new lh.m5(this, 22);
    public int d = -1;
    public boolean f18504r = false;

    public r1(t1 t1Var) {
        this.f18505s = t1Var;
    }

    public static void E(r1 r1Var, boolean z10) {
        int i10;
        t1 t1Var = r1Var.f18505s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) t1Var.f18584r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            r1Var.l();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        t1 t1Var = this.f18505s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f18501e)) {
            if (i11 >= 0 && i11 < t1Var.h.size()) {
                return t1Var.h.get(i11);
            }
            i11 -= t1Var.h.size();
        }
        if (!t1Var.f18583n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f18501e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < t1Var.f18583n.size()) {
                return t1Var.f18583n.get(i11);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        t1 t1Var = this.f18505s;
        k2 k2Var = t1Var.f18584r;
        if (!this.f18504r) {
            this.f18504r = true;
            t1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f18502f == null) {
                i14 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f18502f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f18502f;
            if (user == null && !this.f18503n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ef.a(this, 14));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f18502f);
                String str = this.f18501e;
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
                i11 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new q1(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        t1 t1Var = this.f18505s;
        d2 d2Var = t1Var.d;
        if (!TextUtils.equals(this.f18501e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) t1Var.f18584r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f18504r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f18501e);
        this.f18501e = str;
        lh.m5 m5Var = this.f18500c;
        AndroidUtilities.cancelRunOnUIThread(m5Var);
        if (TextUtils.isEmpty(str)) {
            t1Var.f18583n.clear();
            d2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        d2Var.c(true);
        AndroidUtilities.runOnUIThread(m5Var, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        t1 t1Var = this.f18505s;
        int i11 = 0;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f18501e)) {
            i10 = t1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!t1Var.f18583n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f18501e)) {
                i11 = 1;
            }
            i11 += t1Var.f18583n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        t1 t1Var = this.f18505s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.f18501e)) {
            i11 -= t1Var.h.size();
        }
        if (!t1Var.f18583n.isEmpty() && !t1Var.h.isEmpty() && TextUtils.isEmpty(this.f18501e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.x0(-1, (int) this.f18505s.f18584r.f17994n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                d2Var.getClass();
                d2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                d2Var.e((TLRPC.BotInlineResult) F, this.f18502f, true, false, false, true);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.d2 d2Var;
        t1 t1Var = this.f18505s;
        if (i10 == 0) {
            d2Var = new View(t1Var.getContext());
        } else if (i10 == 1) {
            Context context = t1Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) t1Var.f18584r).resourcesProvider;
            ?? k8Var = new org.telegram.ui.Cells.k8(context, false, false, c6Var, false);
            k8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.x0 x0Var = new f2.x0(-1, -2);
            ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            k8Var.setLayoutParams(x0Var);
            d2Var = k8Var;
        } else {
            org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(t1Var.getContext());
            d2Var2.getPhotoImage().setLayerNum(7);
            if (d2Var2.V == null) {
                uc ucVar = new uc(d2Var2, 1.0f, 3.0f);
                ucVar.f33190e = 120L;
                d2Var2.V = ucVar;
            }
            d2Var2.setIsKeyboard(true);
            d2Var2.setCanPreviewGif(true);
            d2Var = d2Var2;
        }
        return new f2.n1(d2Var);
    }
}
