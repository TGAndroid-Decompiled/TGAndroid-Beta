package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hc;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
public abstract class e3 extends pj0 {
    public boolean d;
    public String f11867f;
    public String h;
    public TLRPC.User f11868n;
    public boolean f11869r;
    public final f3 f11872x;
    public final ArrayList f11865c = new ArrayList();
    public int f11866e = -1;
    public final ColorDrawable f11870s = new ColorDrawable(285212671);
    public final di.f8 f11871w = new di.f8(this, 23);

    public e3(f3 f3Var) {
        this.f11872x = f3Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.f11872x.f11956a;
        if (!this.d) {
            this.d = true;
            F(true);
            qp s12 = qp.s1(i7);
            String str = s12.L3;
            if (this.f11868n == null) {
                TLObject f22 = s12.f2(str);
                if (f22 instanceof TLRPC.User) {
                    this.f11868n = (TLRPC.User) f22;
                }
            }
            TLRPC.User user = this.f11868n;
            if (user == null && !this.f11869r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f11866e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.j(13, this, s12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f11868n);
                String str2 = this.f11867f;
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
                this.f11866e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new d3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z9);

    @Override
    public final int b() {
        return this.f11865c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) d1Var.f57056a;
        TLObject tLObject = (TLObject) this.f11865c.get(i7);
        boolean z9 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f11870s;
        if (z9) {
            l9Var.j(hc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            l9Var.j(hc.i(org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                l9Var.j(hc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                l9Var.b();
            }
        } else {
            l9Var.b();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new bi.b7(this.f11872x.getContext(), 1));
    }
}
