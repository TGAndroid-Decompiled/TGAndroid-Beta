package kh;

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
import org.telegram.ui.Components.vk0;
public abstract class p3 extends vk0 {
    public boolean d;
    public String f15828f;
    public String h;
    public TLRPC.User f15829n;
    public boolean f15830r;
    public final q3 f15832w;
    public final ArrayList f15826c = new ArrayList();
    public int f15827e = -1;
    public final ColorDrawable f15831s = new ColorDrawable(285212671);
    public final f1 v = new f1(this, 7);

    public p3(q3 q3Var) {
        this.f15832w = q3Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E() {
        int i9 = this.f15832w.f15858a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i9);
            String str = messagesController.imageSearchBot;
            if (this.f15829n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f15829n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f15829n;
            if (user == null && !this.f15830r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f15827e = ConnectionsManager.getInstance(i9).sendRequest(tL_contacts_resolveUsername, new bg.j0(this, messagesController, 16));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f15829n);
                String str2 = this.f15828f;
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
                this.f15827e = ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getInlineBotResults, new o3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f15826c.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) q1Var.f5501a;
        TLObject tLObject = (TLObject) this.f15826c.get(i9);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f15831s;
        if (z10) {
            o9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            o9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                o9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                o9Var.b();
            }
        } else {
            o9Var.b();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new gh.d5(this.f15832w.getContext(), 1));
    }
}
