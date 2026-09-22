package ci;

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
import org.telegram.ui.Components.xl0;
public final class w1 extends xl0 {
    public String e;
    public TLRPC.User f5682f;
    public String h;
    public boolean f5683n;
    public final z1 f5685s;
    public final androidx.fragment.app.a0 f5681c = new androidx.fragment.app.a0(this, 11);
    public int d = -1;
    public boolean f5684r = false;

    public w1(z1 z1Var) {
        this.f5685s = z1Var;
    }

    public static void E(w1 w1Var, boolean z10) {
        int i10;
        z1 z1Var = w1Var.f5685s;
        ArrayList arrayList = z1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.f5859r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            w1Var.l();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42998f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        z1 z1Var = this.f5685s;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < z1Var.h.size()) {
                return z1Var.h.get(i11);
            }
            i11 -= z1Var.h.size();
        }
        if (!z1Var.f5858n.isEmpty()) {
            if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < z1Var.f5858n.size()) {
                return z1Var.f5858n.get(i11);
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
        z1 z1Var = this.f5685s;
        t2 t2Var = z1Var.f5859r;
        if (!this.f5684r) {
            this.f5684r = true;
            z1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f5682f == null) {
                i14 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f5682f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f5682f;
            if (user == null && !this.f5683n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ai.m8(this, 3));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f5682f);
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
                i11 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new t1(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        z1 z1Var = this.f5685s;
        l2 l2Var = z1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) z1Var.f5859r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f5684r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        androidx.fragment.app.a0 a0Var = this.f5681c;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (TextUtils.isEmpty(str)) {
            z1Var.f5858n.clear();
            l2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        l2Var.c(true);
        AndroidUtilities.runOnUIThread(a0Var, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        z1 z1Var = this.f5685s;
        int i11 = 0;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = z1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!z1Var.f5858n.isEmpty()) {
            if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += z1Var.f5858n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        z1 z1Var = this.f5685s;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= z1Var.h.size();
        }
        if (!z1Var.f5858n.isEmpty() && !z1Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42998f;
        View view = c1Var.f42995a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) this.f5685s.f5859r.f5549n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                f2Var.getClass();
                f2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                f2Var.e((TLRPC.BotInlineResult) F, this.f5682f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.f2 f2Var;
        z1 z1Var = this.f5685s;
        if (i10 == 0) {
            f2Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            Context context = z1Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.f3) z1Var.f5859r).resourcesProvider;
            ?? p8Var = new org.telegram.ui.Cells.p8(context, false, false, f6Var, false);
            p8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.p0 p0Var = new s4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            p8Var.setLayoutParams(p0Var);
            f2Var = p8Var;
        } else {
            org.telegram.ui.Cells.f2 f2Var2 = new org.telegram.ui.Cells.f2(z1Var.getContext());
            f2Var2.getPhotoImage().setLayerNum(7);
            if (f2Var2.f20270c0 == null) {
                org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(f2Var2, 1.0f, 3.0f);
                ycVar.e = 120L;
                f2Var2.f20270c0 = ycVar;
            }
            f2Var2.setIsKeyboard(true);
            f2Var2.setCanPreviewGif(true);
            f2Var = f2Var2;
        }
        return new s4.c1(f2Var);
    }
}
