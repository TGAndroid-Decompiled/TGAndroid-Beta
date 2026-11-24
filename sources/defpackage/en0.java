package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class en0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public en0(na7 na7Var, au0 au0Var, vm0 vm0Var) {
        this.a = (byte) 1;
        this.b = na7Var;
        this.c = au0Var;
        this.d = vm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gl.d3(new b87(tL_error, (p8c) obj3, tLObject, (na7) obj, (p8c) obj2, (byte) 3));
                return;
            case 1:
                gl.d3(new b87(tLObject, (na7) obj, (au0) obj3, (vm0) obj2, tL_error));
                return;
            case 2:
                tn0 tn0Var = (tn0) obj3;
                na7 na7Var = (na7) obj;
                wn0 wn0Var = (wn0) obj2;
                if (tL_error != null) {
                    gl.d3(new z20(tn0Var, tL_error, (byte) 9));
                    return;
                } else if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new oz(wn0Var, (byte) 14));
                    return;
                } else {
                    return;
                }
            case 3:
                gl.d3(new b87(tL_error, (p8c) ((x0) obj3), tLObject, (na7) obj, (p8c) ((ht) obj2), (byte) 2));
                return;
            case 4:
                gl.d3(new s67((lo0) obj3, (CountDownLatch) obj2, tLObject, (bo0) obj, (byte) 11));
                return;
            case 5:
                gl.d3(new s67((lo0) obj3, (CountDownLatch) obj2, tLObject, (bo0) obj, (byte) 10));
                return;
            case 6:
                gl.d3(new s67((u41) obj3, tLObject, (fx0) obj2, (it0) obj, (byte) 14));
                return;
            case 7:
                gl.d3(new b87((Object) ((hv0) obj3), tL_error, (Object) ((String) obj2), (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) tLObject, (byte) 5));
                return;
            case 8:
                gl.d3(new b87((hv0) obj3, tLObject, (String[]) obj2, tL_error, (hd) obj));
                return;
            case 9:
                gl.d3(new s67((j41) obj3, tLObject, (TL_account.TL_businessChatLink) obj2, (av1) obj, (byte) 16));
                return;
            case 10:
                final me1 me1Var = (me1) obj3;
                final hd hdVar = (hd) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                me1Var.getClass();
                if (tL_error == null) {
                    gl.d3(new fv0(me1Var, hdVar, (TLRPC.User) tLObject, (byte) 14));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            hd hdVar2 = hdVar;
                            me1 me1Var2 = me1Var;
                            me1Var2.getClass();
                            switch (b2) {
                                case 0:
                                    try {
                                        hdVar2.dismiss();
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    me1Var2.finishFragment();
                                    return;
                                default:
                                    try {
                                        hdVar2.dismiss();
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                    }
                                    me1Var2.l0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    gl.d3(new s67(me1Var, hdVar, tL_error, updateusername, (byte) 22));
                    return;
                } else {
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            hd hdVar2 = hdVar;
                            me1 me1Var2 = me1Var;
                            me1Var2.getClass();
                            switch (b2) {
                                case 0:
                                    try {
                                        hdVar2.dismiss();
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    me1Var2.finishFragment();
                                    return;
                                default:
                                    try {
                                        hdVar2.dismiss();
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                    }
                                    me1Var2.l0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 11:
                gl.d3(new b87((d) ((me1) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TL_account.checkUsername) obj), (byte) 13));
                return;
            case 12:
                gl.d3(new s67((kg1) obj3, (CountDownLatch) obj2, tLObject, (hg1) obj, (byte) 26));
                return;
            case 13:
                gl.d3(new s67((kg1) obj3, (CountDownLatch) obj2, tLObject, (hg1) obj, (byte) 25));
                return;
            case 14:
                gl.d3(new b87((d) ((yh1) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TLRPC.TL_channels_checkUsername) obj), (byte) 16));
                return;
            case 15:
                gl.d3(new s67((mu1) obj3, (op1) obj2, tLObject, (yt0) obj, (byte) 28));
                return;
            case 16:
                mu1 mu1Var = (mu1) obj3;
                long[] jArr = (long[]) obj;
                gl.r((s67) obj2);
                mu1Var.v5.k.voiceTranscriptionRated = true;
                ad7 messagesStorage = mu1Var.getMessagesStorage();
                messagesStorage.a.c(new o57(messagesStorage, mu1Var.v5.e1(), k27.B0(mu1Var.v5.k), mu1Var.v5.k, (byte) 11));
                vm1 vm1Var = new vm1(mu1Var, (byte) 22);
                long j = 0;
                if (jArr[0] > 0) {
                    j = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                gl.e3(vm1Var, j);
                return;
            case 17:
                mu1 mu1Var2 = (mu1) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                gl.d3(new wh0((hd[]) obj2, (byte) 3));
                if (tL_error == null) {
                    mu1Var2.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    gl.d3(new jn1(mu1Var2, tL_error, tL_messages_editMessage, (byte) 2));
                    return;
                }
            case 18:
                gl.d3(new b87((d) ((f92) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TLRPC.TL_channels_checkUsername) obj), (byte) 21));
                return;
            case 19:
                gl.d3(new jn1((mf2) obj3, (TL_account.TL_connectedBot) obj2, (TL_account.TL_businessBotRecipients) obj, (byte) 20));
                return;
            case 20:
                gl.d3(new b87((Object) ((xv2) obj3), tL_error, (Object) tLObject, (Object) ((ArrayList) obj2), (Object) ((TLRPC.TL_messages_getMyStickers) obj), (byte) 25));
                return;
            case 21:
                cj3 cj3Var = (cj3) obj3;
                cj3Var.getClass();
                gl.d3(new b87(cj3Var, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, (byte) 26));
                return;
            case 22:
                gl.d3(new og3((cj3) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, (byte) 0));
                return;
            case 23:
                gl.d3(new hn1((q04) obj3, (hd[]) obj2, tLObject, (i4d) obj, (byte) 15));
                return;
            case 24:
                gl.d3(new hn1((n14) obj3, (TLRPC.TL_messages_getStickers) obj2, tLObject, (Runnable) obj, (byte) 16));
                return;
            case 25:
                gl.d3(new jf4((kf4) obj3, (hd) obj2, (t97) obj, (byte) 0));
                return;
            case 26:
                gl.d3(new jf4((ll4) obj3, (d) obj2, (ArrayList) obj, (byte) 1));
                return;
            case 27:
                gl.d3(new b87((xu4) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, (byte) 29));
                return;
            case 28:
                h75 h75Var = (h75) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i = 0;
                    while (true) {
                        if (i < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                gl.d3(new e45(h75Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, (byte) 0));
                            } else {
                                i++;
                            }
                        }
                    }
                    na7.q1(h75Var.n1.a).Q3(updates, false);
                    return;
                }
                gl.d3(new vc4(h75Var, tL_error, (byte) 24));
                return;
            default:
                gl.d3(new vz4((h75) obj3, (hd) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error));
                return;
        }
    }

    public en0(p8c p8cVar, na7 na7Var, p8c p8cVar2, byte b) {
        this.a = b;
        this.c = p8cVar;
        this.b = na7Var;
        this.d = p8cVar2;
    }

    public en0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
