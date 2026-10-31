package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vm implements RequestDelegate {
    public final int f18599a;
    public final long f18600b;
    public final us f18601c;
    public final Object d;
    public final Object e;
    public final TLObject f18602f;
    public final Object f18603g;

    public vm(vp vpVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, gp gpVar) {
        this.f18599a = 0;
        this.f18601c = vpVar;
        this.f18600b = j10;
        this.d = runnable;
        this.e = k2Var;
        this.f18602f = tL_messages_editChatAdmin;
        this.f18603g = gpVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18599a) {
            case 0:
                vp vpVar = (vp) this.f18601c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f18602f;
                gp gpVar = (gp) this.f18603g;
                if (tL_error == null) {
                    i0.h3(new bn(vpVar, this.f18600b, runnable, 2), 1000L);
                    return;
                }
                i0.g3(new ul(vpVar, tL_error, k2Var, tL_messages_editChatAdmin, 3));
                if (gpVar != null) {
                    i0.g3(new en(gpVar, tL_error, 1));
                    return;
                }
                return;
            case 1:
                i0.g3(new e10((org.telegram.ui.ay) this.f18601c, (org.telegram.ui.ActionBar.x1) this.d, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f18602f, this.f18600b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f18603g));
                return;
            default:
                i0.g3(new e10((rh.e4) this.f18601c, (gf.e) this.d, (org.telegram.ui.ActionBar.x1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f18602f, tL_error, this.f18600b, (CharSequence) this.f18603g));
                return;
        }
    }

    public vm(us usVar, Object obj, Object obj2, TLObject tLObject, long j10, Object obj3, int i10) {
        this.f18599a = i10;
        this.f18601c = usVar;
        this.d = obj;
        this.e = obj2;
        this.f18602f = tLObject;
        this.f18600b = j10;
        this.f18603g = obj3;
    }
}
