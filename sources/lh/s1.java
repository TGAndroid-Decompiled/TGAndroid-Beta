package lh;

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
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public final class s1 extends yk0 {

    public String f16716e;

    public TLRPC.User f16717f;
    public String h;

    public boolean f16718n;

    public final u1 f16720s;

    public final kh.c f16715c = new kh.c(this, 8);
    public int d = -1;

    public boolean f16719r = false;

    public s1(u1 u1Var) {
        this.f16720s = u1Var;
    }

    public static void E(s1 s1Var, boolean z10) {
        u1 u1Var = s1Var.f16720s;
        ArrayList arrayList = u1Var.h;
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) u1Var.f16901r).currentAccount).getRecentGifs());
        if (z10) {
            s1Var.l();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 2;
    }

    public final Object F(int i10) {
        int size = i10 - 1;
        u1 u1Var = this.f16720s;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f16716e)) {
            if (size >= 0 && size < u1Var.h.size()) {
                return u1Var.h.get(size);
            }
            size -= u1Var.h.size();
        }
        if (u1Var.f16900n.isEmpty()) {
            return null;
        }
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f16716e)) {
            size--;
        }
        if (size < 0 || size >= u1Var.f16900n.size()) {
            return null;
        }
        return u1Var.f16900n.get(size);
    }

    public final void G() {
        u1 u1Var = this.f16720s;
        l2 l2Var = u1Var.f16901r;
        if (this.f16719r) {
            return;
        }
        this.f16719r = true;
        u1Var.d.c(true);
        if (this.d >= 0) {
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f16717f == null) {
            TLObject userOrChat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).getUserOrChat(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f16717f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f16717f;
        if (user == null && !this.f16718n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).gifSearchBot;
            this.d = ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).sendRequest(tL_contacts_resolveUsername, new cf.a(this, 14));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).getInputUser(this.f16717f);
        String str = this.f16716e;
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        boolean zIsEmpty = TextUtils.isEmpty(this.h);
        String str2 = this.h;
        tL_messages_getInlineBotResults.offset = str2 != null ? str2 : "";
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        String str3 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
        MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).getBotCache(str3, new r1(this, zIsEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        u1 u1Var = this.f16720s;
        e2 e2Var = u1Var.d;
        if (!TextUtils.equals(this.f16716e, str)) {
            if (this.d != -1) {
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) u1Var.f16901r).currentAccount).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f16719r = false;
            this.h = "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f16716e);
        this.f16716e = str;
        kh.c cVar = this.f16715c;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        if (TextUtils.isEmpty(str)) {
            u1Var.f16900n.clear();
            e2Var.c(false);
            l();
        } else {
            if (zIsEmpty) {
                l();
            }
            e2Var.c(true);
            AndroidUtilities.runOnUIThread(cVar, 1500L);
        }
    }

    @Override
    public final int h() {
        u1 u1Var = this.f16720s;
        int size = 0;
        int size2 = ((u1Var.h.isEmpty() || !TextUtils.isEmpty(this.f16716e)) ? 0 : u1Var.h.size()) + 1;
        if (!u1Var.f16900n.isEmpty()) {
            if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f16716e)) {
                size = 1;
            }
            size += u1Var.f16900n.size();
        }
        return size2 + size;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int size = i10 - 1;
        u1 u1Var = this.f16720s;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.f16716e)) {
            size -= u1Var.h.size();
        }
        return (u1Var.f16900n.isEmpty() || u1Var.h.isEmpty() || !TextUtils.isEmpty(this.f16716e) || size != 0) ? 2 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.y0(-1, (int) this.f16720s.f16901r.f16289n));
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
            Object objF = F(i10);
            if (!(objF instanceof TLRPC.Document)) {
                if (objF instanceof TLRPC.BotInlineResult) {
                    d2Var.e((TLRPC.BotInlineResult) objF, this.f16717f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) objF;
                d2Var.getClass();
                d2Var.d(0, document, "gif" + document);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        u1 u1Var = this.f16720s;
        if (i10 == 0) {
            view = new View(u1Var.getContext());
        } else if (i10 == 1) {
            org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(u1Var.getContext(), false, false, ((org.telegram.ui.ActionBar.e3) u1Var.f16901r).resourcesProvider, false);
            j8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.y0 y0Var = new f2.y0(-1, -2);
            ((ViewGroup.MarginLayoutParams) y0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            j8Var.setLayoutParams(y0Var);
            view = j8Var;
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(u1Var.getContext());
            d2Var.getPhotoImage().setLayerNum(7);
            if (d2Var.V == null) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(d2Var, 1.0f, 3.0f);
                ncVar.f30947e = 120L;
                d2Var.V = ncVar;
            }
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            view = d2Var;
        }
        return new lk0(view);
    }
}
