package hi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.gc;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tj0;
public abstract class c3 extends tj0 {
    public boolean d;
    public String f13972f;
    public String h;
    public TLRPC.User f13973n;
    public boolean f13974r;
    public final d3 f13977x;
    public final ArrayList f13970c = new ArrayList();
    public int f13971e = -1;
    public final ColorDrawable f13975s = new ColorDrawable(285212671);
    public final e1 f13976w = new e1(this, 7);

    public c3(d3 d3Var) {
        this.f13977x = d3Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.f13977x.f14099a;
        if (!this.d) {
            this.d = true;
            F(true);
            np s12 = np.s1(i7);
            String str = s12.M3;
            if (this.f13973n == null) {
                TLObject f22 = s12.f2(str);
                if (f22 instanceof TLRPC.User) {
                    this.f13973n = (TLRPC.User) f22;
                }
            }
            TLRPC.User user = this.f13973n;
            if (user == null && !this.f13974r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f13971e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.v2(15, this, s12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f13973n);
                String str2 = this.f13972f;
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
                this.f13971e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new b3(0, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int b() {
        return this.f13970c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) e1Var.f58535a;
        TLObject tLObject = (TLObject) this.f13970c.get(i7);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f13975s;
        if (z10) {
            i9Var.j(gc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            i9Var.j(gc.i(org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                i9Var.j(gc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                i9Var.b();
            }
        } else {
            i9Var.b();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new di.t5(this.f13977x.getContext(), 1));
    }
}
