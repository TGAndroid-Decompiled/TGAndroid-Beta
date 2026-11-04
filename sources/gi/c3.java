package gi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sj0;
public abstract class c3 extends sj0 {
    public boolean d;
    public String f12481f;
    public String h;
    public TLRPC.User f12482n;
    public boolean f12483r;
    public final d3 f12486x;
    public final ArrayList f12479c = new ArrayList();
    public int f12480e = -1;
    public final ColorDrawable f12484s = new ColorDrawable(285212671);
    public final ei.z5 f12485w = new ei.z5(this, 28);

    public c3(d3 d3Var) {
        this.f12486x = d3Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E() {
        int i3 = this.f12486x.f12559a;
        if (!this.d) {
            this.d = true;
            F(true);
            hp s12 = hp.s1(i3);
            String str = s12.M3;
            if (this.f12482n == null) {
                TLObject f22 = s12.f2(str);
                if (f22 instanceof TLRPC.User) {
                    this.f12482n = (TLRPC.User) f22;
                }
            }
            TLRPC.User user = this.f12482n;
            if (user == null && !this.f12483r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f12480e = ConnectionsManager.getInstance(i3).sendRequest(tL_contacts_resolveUsername, new ai.f3(16, this, s12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f12482n);
                String str2 = this.f12481f;
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
                this.f12480e = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getInlineBotResults, new b3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int b() {
        return this.f12479c.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) d1Var.f55540a;
        TLObject tLObject = (TLObject) this.f12479c.get(i3);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f12484s;
        if (z10) {
            k9Var.j(ac.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            k9Var.j(ac.i(org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                k9Var.j(ac.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                k9Var.b();
            }
        } else {
            k9Var.b();
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new ci.c6(this.f12486x.getContext(), 1));
    }
}
