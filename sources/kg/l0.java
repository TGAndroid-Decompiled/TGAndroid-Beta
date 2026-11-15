package kg;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.xa1;
public final class l0 implements RequestDelegate {
    public final int f17985a = 0;
    public final boolean f17986b;
    public final Object f17987c;
    public final Object d;
    public final Object f17988e;
    public final TLObject f17989f;

    public l0(q0 q0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f17987c = q0Var;
        this.d = iArr;
        this.f17988e = arrayList;
        this.f17986b = z10;
        this.f17989f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17985a) {
            case 0:
                org.telegram.messenger.g0.h3(new o0((q0) this.f17987c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f17988e, this.f17986b, (TLRPC.User) this.f17989f));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o0((xa1) this.f17987c, tL_error, this.f17986b, tLObject, (byte[]) this.d, (String) this.f17988e, (TL_account.passwordInputSettings) this.f17989f));
                return;
            default:
                zh.l lVar = (zh.l) this.f17987c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f17989f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f17988e;
                if (tL_error == null) {
                    np.s1(lVar.f61450k).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new o0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f17986b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public l0(xa1 xa1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f17987c = xa1Var;
        this.f17986b = z10;
        this.d = bArr;
        this.f17988e = str;
        this.f17989f = passwordinputsettings;
    }

    public l0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f17987c = lVar;
        this.d = tL_chatInviteImporter;
        this.f17986b = z10;
        this.f17989f = user;
        this.f17988e = tL_messages_hideChatJoinRequest;
    }
}
