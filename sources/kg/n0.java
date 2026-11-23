package kg;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bb1;
public final class n0 implements RequestDelegate {
    public final int f18426a = 0;
    public final boolean f18427b;
    public final Object f18428c;
    public final Object d;
    public final Object f18429e;
    public final TLObject f18430f;

    public n0(s0 s0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f18428c = s0Var;
        this.d = iArr;
        this.f18429e = arrayList;
        this.f18427b = z10;
        this.f18430f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18426a) {
            case 0:
                org.telegram.messenger.g0.g3(new q0((s0) this.f18428c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f18429e, this.f18427b, (TLRPC.User) this.f18430f));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new q0((bb1) this.f18428c, tL_error, this.f18427b, tLObject, (byte[]) this.d, (String) this.f18429e, (TL_account.passwordInputSettings) this.f18430f));
                return;
            default:
                zh.l lVar = (zh.l) this.f18428c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f18430f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f18429e;
                if (tL_error == null) {
                    np.u1(lVar.f62062k).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new q0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f18427b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(bb1 bb1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f18428c = bb1Var;
        this.f18427b = z10;
        this.d = bArr;
        this.f18429e = str;
        this.f18430f = passwordinputsettings;
    }

    public n0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f18428c = lVar;
        this.d = tL_chatInviteImporter;
        this.f18427b = z10;
        this.f18430f = user;
        this.f18429e = tL_messages_hideChatJoinRequest;
    }
}
