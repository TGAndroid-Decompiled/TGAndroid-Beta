package kg;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.cb1;
public final class l0 implements RequestDelegate {
    public final int f17425a = 0;
    public final boolean f17426b;
    public final Object f17427c;
    public final Object d;
    public final Object f17428e;
    public final TLObject f17429f;

    public l0(q0 q0Var, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        this.f17427c = q0Var;
        this.d = iArr;
        this.f17428e = arrayList;
        this.f17426b = z9;
        this.f17429f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17425a) {
            case 0:
                org.telegram.messenger.g0.h3(new o0((q0) this.f17427c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f17428e, this.f17426b, (TLRPC.User) this.f17429f));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o0((cb1) this.f17427c, tL_error, this.f17426b, tLObject, (byte[]) this.d, (String) this.f17428e, (TL_account.passwordInputSettings) this.f17429f));
                return;
            default:
                yh.m mVar = (yh.m) this.f17427c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f17429f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f17428e;
                if (tL_error == null) {
                    qp.s1(mVar.f59558k).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new o0(mVar, tL_error, tLObject, tL_chatInviteImporter, this.f17426b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public l0(cb1 cb1Var, boolean z9, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f17427c = cb1Var;
        this.f17426b = z9;
        this.d = bArr;
        this.f17428e = str;
        this.f17429f = passwordinputsettings;
    }

    public l0(yh.m mVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f17427c = mVar;
        this.d = tL_chatInviteImporter;
        this.f17426b = z9;
        this.f17429f = user;
        this.f17428e = tL_messages_hideChatJoinRequest;
    }
}
