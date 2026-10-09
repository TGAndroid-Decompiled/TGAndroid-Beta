package ci;

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
import org.telegram.ui.Components.pm0;
public abstract class u3 extends pm0 {
    public boolean d;
    public String f6058f;
    public String h;
    public TLRPC.User f6059n;
    public boolean f6060r;
    public final v3 f6062w;
    public final ArrayList f6056c = new ArrayList();
    public int f6057e = -1;
    public final ColorDrawable f6061s = new ColorDrawable(285212671);
    public final androidx.fragment.app.a0 v = new androidx.fragment.app.a0(this, 17);

    public u3(v3 v3Var) {
        this.f6062w = v3Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f6062w.f6128a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f6059n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f6059n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f6059n;
            if (user == null && !this.f6060r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f6057e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ai.v1(6, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f6059n);
                String str2 = this.f6058f;
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
                this.f6057e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new s3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f6056c.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) d1Var.f47658a;
        TLObject tLObject = (TLObject) this.f6056c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f6061s;
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new t3(this.f6062w.getContext(), 0));
    }
}
