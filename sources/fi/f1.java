package fi;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.w80;
public final class f1 implements Runnable {
    public final int f9269a = 0;
    public final Object f9270b;
    public final long f9271c;
    public final Object d;
    public final int e;
    public final TLObject f9272f;
    public final Object h;
    public final Object f9273n;
    public final Object f9274r;
    public final Object f9275s;

    public f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9270b = a2Var;
        this.d = context;
        this.e = i10;
        this.f9271c = j10;
        this.f9272f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9273n = c6Var;
        this.f9274r = sVar;
        this.f9275s = eVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.g0 g0Var;
        String h;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.f9269a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9272f;
                ((org.telegram.ui.ActionBar.a2) this.f9270b).dismiss();
                new o1(context, this.e, this.f9271c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (c6) this.f9273n, (org.telegram.ui.web.s) this.f9274r, (org.telegram.tgnet.e) this.f9275s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f9270b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                u80 u80Var = (u80) this.f9273n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9274r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9275s;
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f9272f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        u80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    w80.G = joinaspeers.peers;
                    long j10 = this.f9271c;
                    w80.I = j10;
                    w80.H = SystemClock.elapsedRealtime();
                    w80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    w80.x(context2, j10, joinaspeers.peers, m2Var, this.e, peer, u80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f9270b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f9272f;
                org.telegram.ui.Wallet.g0 g0Var2 = (org.telegram.ui.Wallet.g0) this.h;
                String str = (String) this.f9273n;
                byte[] bArr = (byte[]) this.f9274r;
                bi.f0 f0Var = (bi.f0) this.f9275s;
                d2Var.getClass();
                try {
                    g0Var = g0Var2;
                } catch (Exception e7) {
                    e = e7;
                    g0Var = g0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.f(g0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f33043f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.d2.h("decode request", e);
                    z1Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(d2Var, z1Var, f0Var, h, this.f9271c, this.e, g0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(d2Var, z1Var, f0Var, h, this.f9271c, this.e, g0Var));
                return;
        }
    }

    public f1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, u80 u80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f9270b = a2Var;
        this.f9272f = tLObject;
        this.h = accountInstance;
        this.f9273n = u80Var;
        this.f9271c = j10;
        this.d = context;
        this.f9274r = m2Var;
        this.e = i10;
        this.f9275s = peer;
    }

    public f1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.g0 g0Var, String str, byte[] bArr, bi.f0 f0Var, long j10, int i10) {
        this.f9270b = d2Var;
        this.d = tonconnectpending;
        this.f9272f = tonconnectrequest;
        this.h = g0Var;
        this.f9273n = str;
        this.f9274r = bArr;
        this.f9275s = f0Var;
        this.f9271c = j10;
        this.e = i10;
    }
}
