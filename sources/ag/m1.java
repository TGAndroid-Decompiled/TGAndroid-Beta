package ag;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.tc1;
public final class m1 implements RequestDelegate {
    public final int f634a = 0;
    public final boolean f635b;
    public final TLObject f636c;
    public final Object d;
    public final Object e;
    public final Object f637f;

    public m1(t1 t1Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = t1Var;
        this.e = iArr;
        this.f637f = arrayList;
        this.f635b = z10;
        this.f636c = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f634a) {
            case 0:
                org.telegram.messenger.i0.g3(new p1((t1) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f637f, this.f635b, (TLRPC.User) this.f636c));
                return;
            case 1:
                oh.q qVar = (oh.q) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f636c;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f637f;
                if (tL_error == null) {
                    vp.r1(qVar.f14299k).L3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new p1(qVar, tL_error, tLObject, tL_chatInviteImporter, this.f635b, user, tL_messages_hideChatJoinRequest));
                return;
            default:
                org.telegram.messenger.i0.g3(new p1((tc1) this.d, tL_error, this.f635b, tLObject, (byte[]) this.e, (String) this.f637f, (TL_account.passwordInputSettings) this.f636c));
                return;
        }
    }

    public m1(oh.q qVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = qVar;
        this.e = tL_chatInviteImporter;
        this.f635b = z10;
        this.f636c = user;
        this.f637f = tL_messages_hideChatJoinRequest;
    }

    public m1(tc1 tc1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = tc1Var;
        this.f635b = z10;
        this.e = bArr;
        this.f637f = str;
        this.f636c = passwordinputsettings;
    }
}
