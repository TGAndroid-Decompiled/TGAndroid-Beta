package kg;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bb1;
public final class o0 implements RequestDelegate {
    public final int f18401a = 0;
    public final boolean f18402b;
    public final Object f18403c;
    public final Object d;
    public final Object f18404e;
    public final TLObject f18405f;

    public o0(t0 t0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f18403c = t0Var;
        this.d = iArr;
        this.f18404e = arrayList;
        this.f18402b = z10;
        this.f18405f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18401a) {
            case 0:
                org.telegram.messenger.g0.g3(new r0((t0) this.f18403c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f18404e, this.f18402b, (TLRPC.User) this.f18405f));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new r0((bb1) this.f18403c, tL_error, this.f18402b, tLObject, (byte[]) this.d, (String) this.f18404e, (TL_account.passwordInputSettings) this.f18405f));
                return;
            default:
                zh.l lVar = (zh.l) this.f18403c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f18405f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f18404e;
                if (tL_error == null) {
                    mp.u1(lVar.f62017k).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new r0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f18402b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(bb1 bb1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f18403c = bb1Var;
        this.f18402b = z10;
        this.d = bArr;
        this.f18404e = str;
        this.f18405f = passwordinputsettings;
    }

    public o0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f18403c = lVar;
        this.d = tL_chatInviteImporter;
        this.f18402b = z10;
        this.f18405f = user;
        this.f18404e = tL_messages_hideChatJoinRequest;
    }
}
