package kg;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.za1;
public final class n0 implements RequestDelegate {
    public final int f18488a = 0;
    public final boolean f18489b;
    public final Object f18490c;
    public final Object d;
    public final Object f18491e;
    public final TLObject f18492f;

    public n0(s0 s0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f18490c = s0Var;
        this.d = iArr;
        this.f18491e = arrayList;
        this.f18489b = z10;
        this.f18492f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18488a) {
            case 0:
                org.telegram.messenger.g0.g3(new q0((s0) this.f18490c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f18491e, this.f18489b, (TLRPC.User) this.f18492f));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new q0((za1) this.f18490c, tL_error, this.f18489b, tLObject, (byte[]) this.d, (String) this.f18491e, (TL_account.passwordInputSettings) this.f18492f));
                return;
            default:
                zh.l lVar = (zh.l) this.f18490c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f18492f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f18491e;
                if (tL_error == null) {
                    mp.u1(lVar.f62145k).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new q0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f18489b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(za1 za1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f18490c = za1Var;
        this.f18489b = z10;
        this.d = bArr;
        this.f18491e = str;
        this.f18492f = passwordinputsettings;
    }

    public n0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f18490c = lVar;
        this.d = tL_chatInviteImporter;
        this.f18489b = z10;
        this.f18492f = user;
        this.f18491e = tL_messages_hideChatJoinRequest;
    }
}
