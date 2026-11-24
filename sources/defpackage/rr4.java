package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class rr4 extends n39 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final sr4 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final s54 w = new s54(this, (byte) 26);

    public rr4(sr4 sr4Var) {
        this.x = sr4Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E() {
        int i = this.x.a;
        if (!this.d) {
            this.d = true;
            F(true);
            na7 q1 = na7.q1(i);
            String str = q1.p3;
            if (this.n == null) {
                TLObject a2 = q1.a2(str);
                if (a2 instanceof TLRPC.User) {
                    this.n = (TLRPC.User) a2;
                }
            }
            if (this.n == null) {
                if (!this.r) {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str;
                    this.e = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new rv3(this, q1, (byte) 7));
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = q1.o1(this.n);
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
            this.e = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, new i81((byte) 4, this, TextUtils.isEmpty(str3)));
        }
    }

    public abstract void F(boolean z);

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        be0 be0Var = (be0) s49Var.a;
        TLObject tLObject = (TLObject) this.c.get(i);
        boolean z = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z) {
            be0Var.m(gl5.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            be0Var.m(gl5.i(ba4.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                be0Var.m(gl5.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                be0Var.b();
            }
        } else {
            be0Var.b();
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new qr4(this.x.getContext(), (byte) 0));
    }
}
