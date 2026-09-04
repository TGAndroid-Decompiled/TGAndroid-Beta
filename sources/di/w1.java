package di;

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
import org.telegram.ui.Components.kl0;
public final class w1 extends kl0 {
    public String f8314e;
    public TLRPC.User f8315f;
    public String h;
    public boolean f8316n;
    public final z1 f8318s;
    public final bi.oa f8313c = new bi.oa(this, 17);
    public int d = -1;
    public boolean f8317r = false;

    public w1(z1 z1Var) {
        this.f8318s = z1Var;
    }

    public static void E(w1 w1Var, boolean z10) {
        int i10;
        z1 z1Var = w1Var.f8318s;
        ArrayList arrayList = z1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.f8511r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            w1Var.l();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        z1 z1Var = this.f8318s;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.f8314e)) {
            if (i11 >= 0 && i11 < z1Var.h.size()) {
                return z1Var.h.get(i11);
            }
            i11 -= z1Var.h.size();
        }
        if (!z1Var.f8510n.isEmpty()) {
            if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.f8314e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < z1Var.f8510n.size()) {
                return z1Var.f8510n.get(i11);
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
        z1 z1Var = this.f8318s;
        t2 t2Var = z1Var.f8511r;
        if (!this.f8317r) {
            this.f8317r = true;
            z1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f8315f == null) {
                i14 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f8315f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f8315f;
            if (user == null && !this.f8316n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new bi.v7(this, 3));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f8315f);
                String str = this.f8314e;
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
                i11 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new t1(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        z1 z1Var = this.f8318s;
        l2 l2Var = z1Var.d;
        if (!TextUtils.equals(this.f8314e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) z1Var.f8511r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f8317r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f8314e);
        this.f8314e = str;
        bi.oa oaVar = this.f8313c;
        AndroidUtilities.cancelRunOnUIThread(oaVar);
        if (TextUtils.isEmpty(str)) {
            z1Var.f8510n.clear();
            l2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        l2Var.c(true);
        AndroidUtilities.runOnUIThread(oaVar, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        z1 z1Var = this.f8318s;
        int i11 = 0;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.f8314e)) {
            i10 = z1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!z1Var.f8510n.isEmpty()) {
            if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.f8314e)) {
                i11 = 1;
            }
            i11 += z1Var.f8510n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        z1 z1Var = this.f8318s;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.f8314e)) {
            i11 -= z1Var.h.size();
        }
        if (!z1Var.f8510n.isEmpty() && !z1Var.h.isEmpty() && TextUtils.isEmpty(this.f8314e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) this.f8318s.f8511r.f8171n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                e2Var.e((TLRPC.BotInlineResult) F, this.f8315f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.e2 e2Var;
        z1 z1Var = this.f8318s;
        if (i10 == 0) {
            e2Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            Context context = z1Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.f3) z1Var.f8511r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, f6Var, false);
            o8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.p0 p0Var = new s4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(p0Var);
            e2Var = o8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(z1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.f21837c0 == null) {
                org.telegram.ui.Components.zc zcVar = new org.telegram.ui.Components.zc(e2Var2, 1.0f, 3.0f);
                zcVar.f33121e = 120L;
                e2Var2.f21837c0 = zcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new s4.c1(e2Var);
    }
}
