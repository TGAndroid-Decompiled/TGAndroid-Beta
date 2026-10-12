package di;

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
public abstract class u3 extends lm0 {
    public boolean d;
    public String f7886f;
    public String h;
    public TLRPC.User f7887n;
    public boolean f7888r;
    public final v3 f7890w;
    public final ArrayList f7885c = new ArrayList();
    public int e = -1;
    public final ColorDrawable f7889s = new ColorDrawable(285212671);
    public final bi.la v = new bi.la(this, 26);

    public u3(v3 v3Var) {
        this.f7890w = v3Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f7890w.f7977a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f7887n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f7887n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f7887n;
            if (user == null && !this.f7888r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new bi.m1(6, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f7887n);
                String str2 = this.f7886f;
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
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new s3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f7885c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) b1Var.f44838a;
        TLObject tLObject = (TLObject) this.f7885c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f7889s;
        if (z10) {
            z9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            z9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                z9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                z9Var.b();
            }
        } else {
            z9Var.b();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new t3(this.f7890w.getContext(), 0));
    }
}
