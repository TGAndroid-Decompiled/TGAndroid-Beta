package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0b {
    public final tm a;
    public sn2 b;

    public d0b(int i, View view) {
        this.a = new tm(gm.L(i), view);
    }

    public final tm a(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i, z);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i, z);
        }
        return b(null, null, i, z);
    }

    public final tm b(TLRPC.User user, TLRPC.Chat chat, int i, boolean z) {
        tm tmVar = this.a;
        if (chat != null) {
            if (chat.verified) {
                sn2 sn2Var = this.b;
                if (sn2Var == null) {
                    sn2Var = new sn2(cmb.e1, cmb.h1);
                }
                this.b = sn2Var;
                tmVar.g(sn2Var, z);
                tmVar.k(null);
                return tmVar;
            } else if (pg3.f(chat.emoji_status) != 0) {
                tmVar.j(pg3.f(chat.emoji_status), z);
                tmVar.k(Integer.valueOf(i));
                return tmVar;
            }
        }
        if (user != null) {
            if (user.verified) {
                sn2 sn2Var2 = this.b;
                if (sn2Var2 == null) {
                    sn2Var2 = new sn2(cmb.e1, cmb.h1);
                }
                this.b = sn2Var2;
                tmVar.g(sn2Var2, z);
                tmVar.k(null);
                return tmVar;
            } else if (pg3.f(user.emoji_status) != 0) {
                tmVar.j(pg3.f(user.emoji_status), z);
                tmVar.k(Integer.valueOf(i));
                return tmVar;
            } else if (user.premium) {
                tmVar.g(oj8.d().e, z);
                tmVar.k(Integer.valueOf(i));
                return tmVar;
            }
        }
        tmVar.g(null, z);
        tmVar.k(null);
        return tmVar;
    }

    public d0b(FrameLayout frameLayout) {
        this(18, frameLayout);
    }
}
