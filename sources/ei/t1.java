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
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.wc;
public final class t1 extends km0 {
    public String e;
    public TLRPC.User f9856f;
    public String h;
    public boolean f9857n;
    public final v1 f9859s;
    public final com.google.firebase.messaging.s f9855c = new com.google.firebase.messaging.s(this, 11);
    public int d = -1;
    public boolean f9858r = false;

    public t1(v1 v1Var) {
        this.f9859s = v1Var;
    }

    public static void E(t1 t1Var, boolean z10) {
        int i10;
        v1 v1Var = t1Var.f9859s;
        ArrayList arrayList = v1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) v1Var.f9948r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            t1Var.l();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        v1 v1Var = this.f9859s;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < v1Var.h.size()) {
                return v1Var.h.get(i11);
            }
            i11 -= v1Var.h.size();
        }
        if (!v1Var.f9947n.isEmpty()) {
            if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < v1Var.f9947n.size()) {
                return v1Var.f9947n.get(i11);
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
        v1 v1Var = this.f9859s;
        n2 n2Var = v1Var.f9948r;
        if (!this.f9858r) {
            this.f9858r = true;
            v1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f9856f == null) {
                i14 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f9856f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f9856f;
            if (user == null && !this.f9857n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ai.h(this, 9));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f9856f);
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
                i11 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new ai.i4(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        v1 v1Var = this.f9859s;
        h2 h2Var = v1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.h3) v1Var.f9948r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f9858r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        com.google.firebase.messaging.s sVar = this.f9855c;
        AndroidUtilities.cancelRunOnUIThread(sVar);
        if (TextUtils.isEmpty(str)) {
            v1Var.f9947n.clear();
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
        v1 v1Var = this.f9859s;
        int i11 = 0;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = v1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!v1Var.f9947n.isEmpty()) {
            if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += v1Var.f9947n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        v1 v1Var = this.f9859s;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= v1Var.h.size();
        }
        if (!v1Var.f9947n.isEmpty() && !v1Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) this.f9859s.f9948r.f9513n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                e2Var.e((TLRPC.BotInlineResult) F, this.f9856f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.e2 e2Var;
        v1 v1Var = this.f9859s;
        if (i10 == 0) {
            e2Var = new View(v1Var.getContext());
        } else if (i10 == 1) {
            Context context = v1Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) v1Var.f9948r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, g6Var, false);
            o8Var.a(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(o0Var);
            e2Var = o8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(v1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.f22302c0 == null) {
                wc wcVar = new wc(e2Var2, 1.0f, 3.0f);
                wcVar.e = 120L;
                e2Var2.f22302c0 = wcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new s4.b1(e2Var);
    }
}
