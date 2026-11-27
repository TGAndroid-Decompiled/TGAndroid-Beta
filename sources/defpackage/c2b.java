package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c2b {
    public final ul a;
    public zm2 b;

    public c2b(int i, View view) {
        this.a = new ul(hl.L(i), view);
    }

    public final ul a(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i, z);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i, z);
        }
        return b(null, null, i, z);
    }

    public final ul b(TLRPC.User user, TLRPC.Chat chat, int i, boolean z) {
        ul ulVar = this.a;
        if (chat != null) {
            if (chat.verified) {
                zm2 zm2Var = this.b;
                if (zm2Var == null) {
                    zm2Var = new zm2(aob.e1, aob.i1);
                }
                this.b = zm2Var;
                ulVar.g(zm2Var, z);
                ulVar.k(null);
                return ulVar;
            } else if (wf3.f(chat.emoji_status) != 0) {
                ulVar.j(wf3.f(chat.emoji_status), z);
                ulVar.k(Integer.valueOf(i));
                return ulVar;
            }
        }
        if (user != null) {
            if (user.verified) {
                zm2 zm2Var2 = this.b;
                if (zm2Var2 == null) {
                    zm2Var2 = new zm2(aob.e1, aob.i1);
                }
                this.b = zm2Var2;
                ulVar.g(zm2Var2, z);
                ulVar.k(null);
                return ulVar;
            } else if (wf3.f(user.emoji_status) != 0) {
                ulVar.j(wf3.f(user.emoji_status), z);
                ulVar.k(Integer.valueOf(i));
                return ulVar;
            } else if (user.premium) {
                ulVar.g(bl8.d().e, z);
                ulVar.k(Integer.valueOf(i));
                return ulVar;
            }
        }
        ulVar.g(null, z);
        ulVar.k(null);
        return ulVar;
    }

    public c2b(FrameLayout frameLayout) {
        this(18, frameLayout);
    }
}
