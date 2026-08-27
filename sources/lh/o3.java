package lh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public abstract class o3 extends yk0 {
    public boolean d;

    public String f16472f;
    public String h;

    public TLRPC.User f16473n;

    public boolean f16474r;

    public final p3 f16476w;

    public final ArrayList f16470c = new ArrayList();

    public int f16471e = -1;

    public final ColorDrawable f16475s = new ColorDrawable(285212671);
    public final kh.c v = new kh.c(this, 14);

    public o3(p3 p3Var) {
        this.f16476w = p3Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f16476w.f16507a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        MessagesController messagesController = MessagesController.getInstance(i10);
        String str = messagesController.imageSearchBot;
        if (this.f16473n == null) {
            TLObject userOrChat = messagesController.getUserOrChat(str);
            if (userOrChat instanceof TLRPC.User) {
                this.f16473n = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f16473n;
        if (user == null && !this.f16474r) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.f16471e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new cg.g0(this, messagesController, 16));
        } else {
            if (user == null) {
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f16473n);
            String str2 = this.f16472f;
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            String str3 = this.h;
            String str4 = str3 != null ? str3 : "";
            tL_messages_getInlineBotResults.offset = str4;
            this.f16471e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new n3(0, this, TextUtils.isEmpty(str4)));
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f16470c.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) o1Var.f5789a;
        TLObject tLObject = (TLObject) this.f16470c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f16475s;
        if (z10) {
            n9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            n9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                n9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                n9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                n9Var.b();
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new hh.b5(this.f16476w.getContext(), 1));
    }
}
