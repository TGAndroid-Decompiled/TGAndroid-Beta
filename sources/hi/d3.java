package hi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.fc;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
public abstract class d3 extends bk0 {
    public boolean d;
    public String f14374f;
    public String h;
    public TLRPC.User f14375n;
    public boolean f14376r;
    public final e3 f14379x;
    public final ArrayList f14372c = new ArrayList();
    public int f14373e = -1;
    public final ColorDrawable f14377s = new ColorDrawable(285212671);
    public final k f14378w = new k(this, 11);

    public d3(e3 e3Var) {
        this.f14379x = e3Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.f14379x.f14536a;
        if (!this.d) {
            this.d = true;
            F(true);
            mp u12 = mp.u1(i7);
            String str = u12.O3;
            if (this.f14375n == null) {
                TLObject h22 = u12.h2(str);
                if (h22 instanceof TLRPC.User) {
                    this.f14375n = (TLRPC.User) h22;
                }
            }
            TLRPC.User user = this.f14375n;
            if (user == null && !this.f14376r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f14373e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.k1(16, this, u12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = u12.s1(this.f14375n);
                String str2 = this.f14374f;
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
                this.f14373e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new c3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int b() {
        return this.f14372c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f1Var.f59122a;
        TLObject tLObject = (TLObject) this.f14372c.get(i7);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f14377s;
        if (z10) {
            q9Var.j(fc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            q9Var.j(fc.i(org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                q9Var.j(fc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                q9Var.b();
            }
        } else {
            q9Var.b();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new di.w5(this.f14379x.getContext(), 1));
    }
}
