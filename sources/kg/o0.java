package kg;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bb1;
public final class o0 implements RequestDelegate {
    public final int f18404a = 0;
    public final boolean f18405b;
    public final Object f18406c;
    public final Object d;
    public final Object f18407e;
    public final TLObject f18408f;

    public o0(t0 t0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f18406c = t0Var;
        this.d = iArr;
        this.f18407e = arrayList;
        this.f18405b = z10;
        this.f18408f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18404a) {
            case 0:
                org.telegram.messenger.g0.g3(new r0((t0) this.f18406c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f18407e, this.f18405b, (TLRPC.User) this.f18408f));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new r0((bb1) this.f18406c, tL_error, this.f18405b, tLObject, (byte[]) this.d, (String) this.f18407e, (TL_account.passwordInputSettings) this.f18408f));
                return;
            default:
                zh.l lVar = (zh.l) this.f18406c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f18408f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f18407e;
                if (tL_error == null) {
                    mp.u1(lVar.f62016k).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new r0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f18405b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(bb1 bb1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f18406c = bb1Var;
        this.f18405b = z10;
        this.d = bArr;
        this.f18407e = str;
        this.f18408f = passwordinputsettings;
    }

    public o0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f18406c = lVar;
        this.d = tL_chatInviteImporter;
        this.f18405b = z10;
        this.f18408f = user;
        this.f18407e = tL_messages_hideChatJoinRequest;
    }
}
