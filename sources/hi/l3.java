package hi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
public abstract class l3 extends dk0 {
    public boolean d;
    public String f14834f;
    public String h;
    public TLRPC.User f14835n;
    public boolean f14836r;
    public final m3 f14839x;
    public final ArrayList f14832c = new ArrayList();
    public int f14833e = -1;
    public final ColorDrawable f14837s = new ColorDrawable(285212671);
    public final w f14838w = new w(this, 12);

    public l3(m3 m3Var) {
        this.f14839x = m3Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.f14839x.f14887a;
        if (!this.d) {
            this.d = true;
            F(true);
            mp u12 = mp.u1(i7);
            String str = u12.O3;
            if (this.f14835n == null) {
                TLObject h22 = u12.h2(str);
                if (h22 instanceof TLRPC.User) {
                    this.f14835n = (TLRPC.User) h22;
                }
            }
            TLRPC.User user = this.f14835n;
            if (user == null && !this.f14836r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f14833e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.o1(16, this, u12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = u12.s1(this.f14835n);
                String str2 = this.f14834f;
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
                this.f14833e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new k3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int b() {
        return this.f14832c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) f1Var.f59245a;
        TLObject tLObject = (TLObject) this.f14832c.get(i7);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f14837s;
        if (z10) {
            p9Var.j(org.telegram.messenger.fc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            p9Var.j(org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                p9Var.j(org.telegram.messenger.fc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                p9Var.b();
            }
        } else {
            p9Var.b();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new di.w5(this.f14839x.getContext(), 1));
    }
}
