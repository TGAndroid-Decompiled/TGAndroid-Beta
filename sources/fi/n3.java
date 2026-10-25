package fi;

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
import org.telegram.ui.Components.lm0;
public abstract class n3 extends lm0 {
    public boolean d;
    public String f11294f;
    public String h;
    public TLRPC.User f11295n;
    public boolean f11296r;
    public final o3 f11298w;
    public final ArrayList f11293c = new ArrayList();
    public int e = -1;
    public final ColorDrawable f11297s = new ColorDrawable(285212671);
    public final di.s8 v = new di.s8(this, 21);

    public n3(o3 o3Var) {
        this.f11298w = o3Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f11298w.f11336a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f11295n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f11295n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f11295n;
            if (user == null && !this.f11296r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new bi.j(14, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f11295n);
                String str2 = this.f11294f;
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
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new m3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f11293c.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) e1Var.f47735a;
        TLObject tLObject = (TLObject) this.f11293c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f11297s;
        if (z10) {
            y9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            y9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                y9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                y9Var.b();
            }
        } else {
            y9Var.b();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new bi.y6(this.f11298w.getContext(), 1));
    }
}
