package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class st4 extends q59 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final tt4 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final qn4 w = new qn4(this, (byte) 3);

    public st4(tt4 tt4Var) {
        this.x = tt4Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E() {
        int i = this.x.a;
        if (!this.d) {
            this.d = true;
            F(true);
            oc7 r1 = oc7.r1(i);
            String str = r1.p3;
            if (this.n == null) {
                TLObject b2 = r1.b2(str);
                if (b2 instanceof TLRPC.User) {
                    this.n = (TLRPC.User) b2;
                }
            }
            if (this.n == null) {
                if (!this.r) {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str;
                    this.e = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new cx3(this, r1, (byte) 7));
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = r1.p1(this.n);
            String str2 = this.f;
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
            this.e = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, new r91((byte) 4, this, TextUtils.isEmpty(str3)));
        }
    }

    public abstract void F(boolean z);

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        bf0 bf0Var = (bf0) u69Var.a;
        TLObject tLObject = (TLObject) this.c.get(i);
        boolean z = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z) {
            bf0Var.m(gn5.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            bf0Var.m(gn5.i(bc4.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                bf0Var.m(gn5.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                bf0Var.b();
            }
        } else {
            bf0Var.b();
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new rt4(this.x.getContext(), (byte) 0));
    }
}
