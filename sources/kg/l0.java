package kg;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bb1;
public final class l0 implements RequestDelegate {
    public final int f17422a = 0;
    public final boolean f17423b;
    public final Object f17424c;
    public final Object d;
    public final Object f17425e;
    public final TLObject f17426f;

    public l0(q0 q0Var, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        this.f17424c = q0Var;
        this.d = iArr;
        this.f17425e = arrayList;
        this.f17423b = z9;
        this.f17426f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17422a) {
            case 0:
                org.telegram.messenger.g0.h3(new o0((q0) this.f17424c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f17425e, this.f17423b, (TLRPC.User) this.f17426f));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o0((bb1) this.f17424c, tL_error, this.f17423b, tLObject, (byte[]) this.d, (String) this.f17425e, (TL_account.passwordInputSettings) this.f17426f));
                return;
            default:
                yh.m mVar = (yh.m) this.f17424c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f17426f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f17425e;
                if (tL_error == null) {
                    qp.s1(mVar.f59560k).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new o0(mVar, tL_error, tLObject, tL_chatInviteImporter, this.f17423b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public l0(bb1 bb1Var, boolean z9, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f17424c = bb1Var;
        this.f17423b = z9;
        this.d = bArr;
        this.f17425e = str;
        this.f17426f = passwordinputsettings;
    }

    public l0(yh.m mVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f17424c = mVar;
        this.d = tL_chatInviteImporter;
        this.f17423b = z9;
        this.f17426f = user;
        this.f17425e = tL_messages_hideChatJoinRequest;
    }
}
