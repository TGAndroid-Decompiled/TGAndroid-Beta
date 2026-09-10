package bi;

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
import org.telegram.ui.Components.ul0;
public final class h2 extends ul0 {
    public String e;
    public TLRPC.User f2780f;
    public String h;
    public boolean f2781n;
    public final k2 f2783s;
    public final a3.d f2779c = new a3.d(this, 17);
    public int d = -1;
    public boolean f2782r = false;

    public h2(k2 k2Var) {
        this.f2783s = k2Var;
    }

    public static void E(h2 h2Var, boolean z10) {
        int i10;
        k2 k2Var = h2Var.f2783s;
        ArrayList arrayList = k2Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) k2Var.f2984r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            h2Var.l();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        k2 k2Var = this.f2783s;
        if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < k2Var.h.size()) {
                return k2Var.h.get(i11);
            }
            i11 -= k2Var.h.size();
        }
        if (!k2Var.f2983n.isEmpty()) {
            if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < k2Var.f2983n.size()) {
                return k2Var.f2983n.get(i11);
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
        k2 k2Var = this.f2783s;
        f3 f3Var = k2Var.f2984r;
        if (!this.f2782r) {
            this.f2782r = true;
            k2Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f2780f == null) {
                i14 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f2780f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f2780f;
            if (user == null && !this.f2781n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new c2(this, 0));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f2780f);
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
                i11 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new d2(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        k2 k2Var = this.f2783s;
        x2 x2Var = k2Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.h3) k2Var.f2984r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f2782r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        a3.d dVar = this.f2779c;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        if (TextUtils.isEmpty(str)) {
            k2Var.f2983n.clear();
            x2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        x2Var.c(true);
        AndroidUtilities.runOnUIThread(dVar, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        k2 k2Var = this.f2783s;
        int i11 = 0;
        if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = k2Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!k2Var.f2983n.isEmpty()) {
            if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += k2Var.f2983n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        k2 k2Var = this.f2783s;
        if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= k2Var.h.size();
        }
        if (!k2Var.f2983n.isEmpty() && !k2Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) this.f2783s.f2984r.f2694n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                e2Var.e((TLRPC.BotInlineResult) F, this.f2780f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.e2 e2Var;
        k2 k2Var = this.f2783s;
        if (i10 == 0) {
            e2Var = new View(k2Var.getContext());
        } else if (i10 == 1) {
            Context context = k2Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.h3) k2Var.f2984r).resourcesProvider;
            ?? p8Var = new org.telegram.ui.Cells.p8(context, false, false, f6Var, false);
            p8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.p0 p0Var = new s4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            p8Var.setLayoutParams(p0Var);
            e2Var = p8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(k2Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.f19052c0 == null) {
                org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(e2Var2, 1.0f, 3.0f);
                xcVar.e = 120L;
                e2Var2.f19052c0 = xcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new s4.c1(e2Var);
    }
}
