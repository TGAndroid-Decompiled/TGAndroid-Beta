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
import org.telegram.ui.Components.pm0;
public final class v1 extends pm0 {
    public String f6122e;
    public TLRPC.User f6123f;
    public String h;
    public boolean f6124n;
    public final y1 f6126s;
    public final androidx.fragment.app.a0 f6121c = new androidx.fragment.app.a0(this, 11);
    public int d = -1;
    public boolean f6125r = false;

    public v1(y1 y1Var) {
        this.f6126s = y1Var;
    }

    public static void E(v1 v1Var, boolean z10) {
        int i10;
        y1 y1Var = v1Var.f6126s;
        ArrayList arrayList = y1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) y1Var.f6346r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            v1Var.l();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47660f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        y1 y1Var = this.f6126s;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.f6122e)) {
            if (i11 >= 0 && i11 < y1Var.h.size()) {
                return y1Var.h.get(i11);
            }
            i11 -= y1Var.h.size();
        }
        if (!y1Var.f6345n.isEmpty()) {
            if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.f6122e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < y1Var.f6345n.size()) {
                return y1Var.f6345n.get(i11);
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
        y1 y1Var = this.f6126s;
        r2 r2Var = y1Var.f6346r;
        if (!this.f6125r) {
            this.f6125r = true;
            y1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f6123f == null) {
                i14 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f6123f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f6123f;
            if (user == null && !this.f6124n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ai.o8(this, 3));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f6123f);
                String str = this.f6122e;
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
                i11 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new s1(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        y1 y1Var = this.f6126s;
        k2 k2Var = y1Var.d;
        if (!TextUtils.equals(this.f6122e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) y1Var.f6346r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f6125r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f6122e);
        this.f6122e = str;
        androidx.fragment.app.a0 a0Var = this.f6121c;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (TextUtils.isEmpty(str)) {
            y1Var.f6345n.clear();
            k2Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        k2Var.c(true);
        AndroidUtilities.runOnUIThread(a0Var, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        y1 y1Var = this.f6126s;
        int i11 = 0;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.f6122e)) {
            i10 = y1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!y1Var.f6345n.isEmpty()) {
            if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.f6122e)) {
                i11 = 1;
            }
            i11 += y1Var.f6345n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        y1 y1Var = this.f6126s;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.f6122e)) {
            i11 -= y1Var.h.size();
        }
        if (!y1Var.f6345n.isEmpty() && !y1Var.h.isEmpty() && TextUtils.isEmpty(this.f6122e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.q0(-1, (int) this.f6126s.f6346r.f5886n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                f2Var.getClass();
                f2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                f2Var.e((TLRPC.BotInlineResult) F, this.f6123f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Cells.f2 f2Var;
        y1 y1Var = this.f6126s;
        if (i10 == 0) {
            f2Var = new View(y1Var.getContext());
        } else if (i10 == 1) {
            Context context = y1Var.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) y1Var.f6346r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, e6Var, false);
            o8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.q0 q0Var = new s4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(q0Var);
            f2Var = o8Var;
        } else {
            org.telegram.ui.Cells.f2 f2Var2 = new org.telegram.ui.Cells.f2(y1Var.getContext());
            f2Var2.getPhotoImage().setLayerNum(7);
            if (f2Var2.f22061c0 == null) {
                org.telegram.ui.Components.bd bdVar = new org.telegram.ui.Components.bd(f2Var2, 1.0f, 3.0f);
                bdVar.f24974e = 120L;
                f2Var2.f22061c0 = bdVar;
            }
            f2Var2.setIsKeyboard(true);
            f2Var2.setCanPreviewGif(true);
            f2Var = f2Var2;
        }
        return new s4.d1(f2Var);
    }
}
