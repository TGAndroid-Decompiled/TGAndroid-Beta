package kg;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bb1;
public final class n0 implements RequestDelegate {
    public final int f18423a = 0;
    public final boolean f18424b;
    public final Object f18425c;
    public final Object d;
    public final Object f18426e;
    public final TLObject f18427f;

    public n0(s0 s0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f18425c = s0Var;
        this.d = iArr;
        this.f18426e = arrayList;
        this.f18424b = z10;
        this.f18427f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18423a) {
            case 0:
                org.telegram.messenger.g0.g3(new q0((s0) this.f18425c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f18426e, this.f18424b, (TLRPC.User) this.f18427f));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new q0((bb1) this.f18425c, tL_error, this.f18424b, tLObject, (byte[]) this.d, (String) this.f18426e, (TL_account.passwordInputSettings) this.f18427f));
                return;
            default:
                zh.l lVar = (zh.l) this.f18425c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f18427f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f18426e;
                if (tL_error == null) {
                    mp.u1(lVar.f62058k).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new q0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f18424b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(bb1 bb1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f18425c = bb1Var;
        this.f18424b = z10;
        this.d = bArr;
        this.f18426e = str;
        this.f18427f = passwordinputsettings;
    }

    public n0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f18425c = lVar;
        this.d = tL_chatInviteImporter;
        this.f18424b = z10;
        this.f18427f = user;
        this.f18426e = tL_messages_hideChatJoinRequest;
    }
}
