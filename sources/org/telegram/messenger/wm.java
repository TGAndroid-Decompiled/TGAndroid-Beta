package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wm implements RequestDelegate {
    public final int f19068a;
    public final long f19069b;
    public final vs f19070c;
    public final Object d;
    public final Object e;
    public final TLObject f19071f;
    public final Object f19072g;

    public wm(wp wpVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, hp hpVar) {
        this.f19068a = 0;
        this.f19070c = wpVar;
        this.f19069b = j10;
        this.d = runnable;
        this.e = k2Var;
        this.f19071f = tL_messages_editChatAdmin;
        this.f19072g = hpVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19068a) {
            case 0:
                wp wpVar = (wp) this.f19070c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f19071f;
                hp hpVar = (hp) this.f19072g;
                if (tL_error == null) {
                    i0.h3(new cn(wpVar, this.f19069b, runnable, 2), 1000L);
                    return;
                }
                i0.g3(new vl(wpVar, tL_error, k2Var, tL_messages_editChatAdmin, 3));
                if (hpVar != null) {
                    i0.g3(new fn(hpVar, tL_error, 1));
                    return;
                }
                return;
            case 1:
                i0.g3(new f10((org.telegram.ui.zx) this.f19070c, (org.telegram.ui.ActionBar.x1) this.d, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f19071f, this.f19069b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f19072g));
                return;
            default:
                i0.g3(new f10((rh.e4) this.f19070c, (gf.e) this.d, (org.telegram.ui.ActionBar.x1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f19071f, tL_error, this.f19069b, (CharSequence) this.f19072g));
                return;
        }
    }

    public wm(vs vsVar, Object obj, Object obj2, TLObject tLObject, long j10, Object obj3, int i10) {
        this.f19068a = i10;
        this.f19070c = vsVar;
        this.d = obj;
        this.e = obj2;
        this.f19071f = tLObject;
        this.f19069b = j10;
        this.f19072g = obj3;
    }
}
