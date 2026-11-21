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
import org.telegram.ui.Components.dk0;
public abstract class c3 extends dk0 {
    public boolean d;
    public String f14321f;
    public String h;
    public TLRPC.User f14322n;
    public boolean f14323r;
    public final d3 f14326x;
    public final ArrayList f14319c = new ArrayList();
    public int f14320e = -1;
    public final ColorDrawable f14324s = new ColorDrawable(285212671);
    public final l f14325w = new l(this, 11);

    public c3(d3 d3Var) {
        this.f14326x = d3Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.f14326x.f14484a;
        if (!this.d) {
            this.d = true;
            F(true);
            mp u12 = mp.u1(i7);
            String str = u12.O3;
            if (this.f14322n == null) {
                TLObject h22 = u12.h2(str);
                if (h22 instanceof TLRPC.User) {
                    this.f14322n = (TLRPC.User) h22;
                }
            }
            TLRPC.User user = this.f14322n;
            if (user == null && !this.f14323r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f14320e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.o1(16, this, u12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = u12.s1(this.f14322n);
                String str2 = this.f14321f;
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
                this.f14320e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new b3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int b() {
        return this.f14319c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f1Var.f59161a;
        TLObject tLObject = (TLObject) this.f14319c.get(i7);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f14324s;
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
        return new v4.f1(new di.w5(this.f14326x.getContext(), 1));
    }
}
