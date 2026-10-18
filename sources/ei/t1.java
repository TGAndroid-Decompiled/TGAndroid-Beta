package ei;

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
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.yc;
public final class t1 extends hm0 {
    public String e;
    public TLRPC.User f9841f;
    public String h;
    public boolean f9842n;
    public final v1 f9844s;
    public final com.google.firebase.messaging.s f9840c = new com.google.firebase.messaging.s(this, 11);
    public int d = -1;
    public boolean f9843r = false;

    public t1(v1 v1Var) {
        this.f9844s = v1Var;
    }

    public static void E(t1 t1Var, boolean z10) {
        int i10;
        v1 v1Var = t1Var.f9844s;
        ArrayList arrayList = v1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) v1Var.f9932r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            t1Var.l();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        v1 v1Var = this.f9844s;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < v1Var.h.size()) {
                return v1Var.h.get(i11);
            }
            i11 -= v1Var.h.size();
        }
        if (!v1Var.f9931n.isEmpty()) {
            if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < v1Var.f9931n.size()) {
                return v1Var.f9931n.get(i11);
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
        v1 v1Var = this.f9844s;
        n2 n2Var = v1Var.f9932r;
        if (!this.f9843r) {
            this.f9843r = true;
            v1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f9841f == null) {
                i14 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f9841f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f9841f;
            if (user == null && !this.f9842n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ai.h(this, 9));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f9841f);
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
                i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new ai.f4(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        v1 v1Var = this.f9844s;
        h2 h2Var = v1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) v1Var.f9932r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f9843r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        com.google.firebase.messaging.s sVar = this.f9840c;
        AndroidUtilities.cancelRunOnUIThread(sVar);
        if (TextUtils.isEmpty(str)) {
            v1Var.f9931n.clear();
            h2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        h2Var.c(true);
        AndroidUtilities.runOnUIThread(sVar, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        v1 v1Var = this.f9844s;
        int i11 = 0;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = v1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!v1Var.f9931n.isEmpty()) {
            if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += v1Var.f9931n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        v1 v1Var = this.f9844s;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= v1Var.h.size();
        }
        if (!v1Var.f9931n.isEmpty() && !v1Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) this.f9844s.f9932r.f9503n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                f2Var.getClass();
                f2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                f2Var.e((TLRPC.BotInlineResult) F, this.f9841f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Cells.f2 f2Var;
        v1 v1Var = this.f9844s;
        if (i10 == 0) {
            f2Var = new View(v1Var.getContext());
        } else if (i10 == 1) {
            Context context = v1Var.getContext();
            d6Var = ((org.telegram.ui.ActionBar.f3) v1Var.f9932r).resourcesProvider;
            ?? n8Var = new org.telegram.ui.Cells.n8(context, false, false, d6Var, false);
            n8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            n8Var.setLayoutParams(o0Var);
            f2Var = n8Var;
        } else {
            org.telegram.ui.Cells.f2 f2Var2 = new org.telegram.ui.Cells.f2(v1Var.getContext());
            f2Var2.getPhotoImage().setLayerNum(7);
            if (f2Var2.f22211c0 == null) {
                yc ycVar = new yc(f2Var2, 1.0f, 3.0f);
                ycVar.e = 120L;
                f2Var2.f22211c0 = ycVar;
            }
            f2Var2.setIsKeyboard(true);
            f2Var2.setCanPreviewGif(true);
            f2Var = f2Var2;
        }
        return new s4.b1(f2Var);
    }
}
