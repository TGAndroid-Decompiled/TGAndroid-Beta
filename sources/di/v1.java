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
import org.telegram.ui.Components.lm0;
public final class v1 extends lm0 {
    public String e;
    public TLRPC.User f7972f;
    public String h;
    public boolean f7973n;
    public final y1 f7975s;
    public final bi.la f7971c = new bi.la(this, 20);
    public int d = -1;
    public boolean f7974r = false;

    public v1(y1 y1Var) {
        this.f7975s = y1Var;
    }

    public static void E(v1 v1Var, boolean z10) {
        int i10;
        y1 y1Var = v1Var.f7975s;
        ArrayList arrayList = y1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.e3) y1Var.f8123r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            v1Var.l();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        y1 y1Var = this.f7975s;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < y1Var.h.size()) {
                return y1Var.h.get(i11);
            }
            i11 -= y1Var.h.size();
        }
        if (!y1Var.f8122n.isEmpty()) {
            if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < y1Var.f8122n.size()) {
                return y1Var.f8122n.get(i11);
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
        y1 y1Var = this.f7975s;
        r2 r2Var = y1Var.f8123r;
        if (!this.f7974r) {
            this.f7974r = true;
            y1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f7972f == null) {
                i14 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f7972f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f7972f;
            if (user == null && !this.f7973n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new bi.z7(this, 3));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f7972f);
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
                i11 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new s1(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        y1 y1Var = this.f7975s;
        k2 k2Var = y1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.e3) y1Var.f8123r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f7974r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        bi.la laVar = this.f7971c;
        AndroidUtilities.cancelRunOnUIThread(laVar);
        if (TextUtils.isEmpty(str)) {
            y1Var.f8122n.clear();
            k2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        k2Var.c(true);
        AndroidUtilities.runOnUIThread(laVar, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        y1 y1Var = this.f7975s;
        int i11 = 0;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = y1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!y1Var.f8122n.isEmpty()) {
            if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += y1Var.f8122n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        y1 y1Var = this.f7975s;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= y1Var.h.size();
        }
        if (!y1Var.f8122n.isEmpty() && !y1Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) this.f7975s.f8123r.f7691n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                f2Var.getClass();
                f2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                f2Var.e((TLRPC.BotInlineResult) F, this.f7972f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.f2 f2Var;
        y1 y1Var = this.f7975s;
        if (i10 == 0) {
            f2Var = new View(y1Var.getContext());
        } else if (i10 == 1) {
            Context context = y1Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.e3) y1Var.f8123r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, c6Var, false);
            o8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(o0Var);
            f2Var = o8Var;
        } else {
            org.telegram.ui.Cells.f2 f2Var2 = new org.telegram.ui.Cells.f2(y1Var.getContext());
            f2Var2.getPhotoImage().setLayerNum(7);
            if (f2Var2.f21154c0 == null) {
                org.telegram.ui.Components.ad adVar = new org.telegram.ui.Components.ad(f2Var2, 1.0f, 3.0f);
                adVar.e = 120L;
                f2Var2.f21154c0 = adVar;
            }
            f2Var2.setIsKeyboard(true);
            f2Var2.setCanPreviewGif(true);
            f2Var = f2Var2;
        }
        return new s4.b1(f2Var);
    }
}
