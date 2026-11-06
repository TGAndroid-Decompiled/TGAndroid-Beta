package kg;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ya1;
public final class l0 implements RequestDelegate {
    public final int f17419a = 0;
    public final boolean f17420b;
    public final Object f17421c;
    public final Object d;
    public final Object f17422e;
    public final TLObject f17423f;

    public l0(q0 q0Var, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        this.f17421c = q0Var;
        this.d = iArr;
        this.f17422e = arrayList;
        this.f17420b = z9;
        this.f17423f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17419a) {
            case 0:
                org.telegram.messenger.g0.h3(new o0((q0) this.f17421c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f17422e, this.f17420b, (TLRPC.User) this.f17423f));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o0((ya1) this.f17421c, tL_error, this.f17420b, tLObject, (byte[]) this.d, (String) this.f17422e, (TL_account.passwordInputSettings) this.f17423f));
                return;
            default:
                yh.m mVar = (yh.m) this.f17421c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f17423f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f17422e;
                if (tL_error == null) {
                    qp.s1(mVar.f59452k).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new o0(mVar, tL_error, tLObject, tL_chatInviteImporter, this.f17420b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public l0(ya1 ya1Var, boolean z9, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f17421c = ya1Var;
        this.f17420b = z9;
        this.d = bArr;
        this.f17422e = str;
        this.f17423f = passwordinputsettings;
    }

    public l0(yh.m mVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f17421c = mVar;
        this.d = tL_chatInviteImporter;
        this.f17420b = z9;
        this.f17423f = user;
        this.f17422e = tL_messages_hideChatJoinRequest;
    }
}
