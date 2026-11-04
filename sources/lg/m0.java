package lg;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ra1;
public final class m0 implements RequestDelegate {
    public final int f18365a = 0;
    public final boolean f18366b;
    public final Object f18367c;
    public final Object d;
    public final Object f18368e;
    public final TLObject f18369f;

    public m0(r0 r0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f18367c = r0Var;
        this.d = iArr;
        this.f18368e = arrayList;
        this.f18366b = z10;
        this.f18369f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18365a) {
            case 0:
                org.telegram.messenger.g0.h3(new p0((r0) this.f18367c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f18368e, this.f18366b, (TLRPC.User) this.f18369f));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new p0((ra1) this.f18367c, tL_error, this.f18366b, tLObject, (byte[]) this.d, (String) this.f18368e, (TL_account.passwordInputSettings) this.f18369f));
                return;
            default:
                zh.k kVar = (zh.k) this.f18367c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f18369f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f18368e;
                if (tL_error == null) {
                    hp.s1(kVar.f60588k).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new p0(kVar, tL_error, tLObject, tL_chatInviteImporter, this.f18366b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public m0(ra1 ra1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f18367c = ra1Var;
        this.f18366b = z10;
        this.d = bArr;
        this.f18368e = str;
        this.f18369f = passwordinputsettings;
    }

    public m0(zh.k kVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f18367c = kVar;
        this.d = tL_chatInviteImporter;
        this.f18366b = z10;
        this.f18369f = user;
        this.f18368e = tL_messages_hideChatJoinRequest;
    }
}
