package nh;

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
import org.telegram.ui.Components.il0;
public abstract class m3 extends il0 {
    public boolean d;
    public String f18126f;
    public String h;
    public TLRPC.User f18127n;
    public boolean f18128r;
    public final n3 f18130w;
    public final ArrayList f18124c = new ArrayList();
    public int f18125e = -1;
    public final ColorDrawable f18129s = new ColorDrawable(285212671);
    public final lh.m5 v = new lh.m5(this, 28);

    public m3(n3 n3Var) {
        this.f18130w = n3Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f18130w.f18167a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f18127n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f18127n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f18127n;
            if (user == null && !this.f18128r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f18125e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new bg.h3(17, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f18127n);
                String str2 = this.f18126f;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                tL_messages_getInlineBotResults.query = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                String str4 = this.h;
                if (str4 != null) {
                    str3 = str4;
                }
                tL_messages_getInlineBotResults.offset = str3;
                this.f18125e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new l3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f18124c.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) n1Var.f6432a;
        TLObject tLObject = (TLObject) this.f18124c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f18129s;
        if (z10) {
            t9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            t9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                t9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                t9Var.b();
            }
        } else {
            t9Var.b();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new jh.a5(this.f18130w.getContext(), 1));
    }
}
