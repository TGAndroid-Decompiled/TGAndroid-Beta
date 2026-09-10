package bi;

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
import org.telegram.ui.Components.ul0;
public abstract class o4 extends ul0 {
    public boolean d;
    public String f3305f;
    public String h;
    public TLRPC.User f3306n;
    public boolean f3307r;
    public final p4 f3309w;
    public final ArrayList f3304c = new ArrayList();
    public int e = -1;
    public final ColorDrawable f3308s = new ColorDrawable(285212671);
    public final a3.d v = new a3.d(this, 23);

    public o4(p4 p4Var) {
        this.f3309w = p4Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f3309w.f3368a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f3306n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f3306n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f3306n;
            if (user == null && !this.f3307r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new o2(1, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f3306n);
                String str2 = this.f3305f;
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
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new m4(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int h() {
        return this.f3304c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) c1Var.f41610a;
        TLObject tLObject = (TLObject) this.f3304c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f3308s;
        if (z10) {
            w9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            w9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                w9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                w9Var.b();
            }
        } else {
            w9Var.b();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new n4(this.f3309w.getContext(), 0));
    }
}
