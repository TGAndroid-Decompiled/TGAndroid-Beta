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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class fn0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public fn0(uc7 uc7Var, ku0 ku0Var, nm0 nm0Var) {
        this.a = (byte) 3;
        this.b = uc7Var;
        this.c = ku0Var;
        this.d = nm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hl.c3(new la7(tL_error, (pcc) obj3, tLObject, (uc7) obj, (pcc) obj2, (byte) 3));
                return;
            case 1:
                hl.c3(new la7(tL_error, (pcc) ((y0) obj3), tLObject, (uc7) obj, (pcc) ((gt) obj2), (byte) 2));
                return;
            case 2:
                tn0 tn0Var = (tn0) obj3;
                uc7 uc7Var = (uc7) obj;
                wn0 wn0Var = (wn0) obj2;
                if (tL_error != null) {
                    hl.c3(new a30(tn0Var, tL_error, (byte) 10));
                    return;
                } else if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pz(wn0Var, (byte) 16));
                    return;
                } else {
                    return;
                }
            case 3:
                hl.c3(new la7(tLObject, (uc7) obj, (ku0) obj3, (nm0) obj2, tL_error));
                return;
            case 4:
                hl.c3(new o97((lo0) obj3, (CountDownLatch) obj2, tLObject, (bo0) obj, (byte) 11));
                return;
            case 5:
                hl.c3(new o97((lo0) obj3, (CountDownLatch) obj2, tLObject, (bo0) obj, (byte) 10));
                return;
            case 6:
                hl.c3(new o97((c51) obj3, tLObject, (nx0) obj2, (qt0) obj, (byte) 14));
                return;
            case 7:
                hl.c3(new la7((Object) ((rv0) obj3), tL_error, (Object) ((String) obj2), (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) tLObject, (byte) 5));
                return;
            case 8:
                hl.c3(new la7((rv0) obj3, tLObject, (String[]) obj2, tL_error, (id) obj));
                return;
            case 9:
                hl.c3(new o97((r41) obj3, tLObject, (TL_account.TL_businessChatLink) obj2, (fw1) obj, (byte) 16));
                return;
            case 10:
                final ve1 ve1Var = (ve1) obj3;
                final id idVar = (id) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                ve1Var.getClass();
                if (tL_error == null) {
                    hl.c3(new tu0(ve1Var, idVar, (TLRPC.User) tLObject, (byte) 15));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            id idVar2 = idVar;
                            ve1 ve1Var2 = ve1Var;
                            ve1Var2.getClass();
                            switch (b2) {
                                case 0:
                                    try {
                                        idVar2.dismiss();
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    ve1Var2.finishFragment();
                                    return;
                                default:
                                    try {
                                        idVar2.dismiss();
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                    }
                                    ve1Var2.l0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    hl.c3(new o97(ve1Var, idVar, tL_error, updateusername, (byte) 22));
                    return;
                } else {
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            id idVar2 = idVar;
                            ve1 ve1Var2 = ve1Var;
                            ve1Var2.getClass();
                            switch (b2) {
                                case 0:
                                    try {
                                        idVar2.dismiss();
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    ve1Var2.finishFragment();
                                    return;
                                default:
                                    try {
                                        idVar2.dismiss();
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                    }
                                    ve1Var2.l0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 11:
                hl.c3(new la7((e) ((ve1) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TL_account.checkUsername) obj), (byte) 13));
                return;
            case 12:
                hl.c3(new o97((tg1) obj3, (CountDownLatch) obj2, tLObject, (qg1) obj, (byte) 26));
                return;
            case 13:
                hl.c3(new o97((tg1) obj3, (CountDownLatch) obj2, tLObject, (qg1) obj, (byte) 25));
                return;
            case 14:
                hl.c3(new la7((e) ((gi1) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TLRPC.TL_channels_checkUsername) obj), (byte) 16));
                return;
            case 15:
                hl.c3(new o97((zu1) obj3, (cq1) obj2, tLObject, (hu0) obj, (byte) 28));
                return;
            case 16:
                zu1 zu1Var = (zu1) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                hl.c3(new xh0((id[]) obj2, (byte) 3));
                if (tL_error == null) {
                    zu1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    hl.c3(new on1(zu1Var, tL_error, tL_messages_editMessage, (byte) 3));
                    return;
                }
            case 17:
                zu1 zu1Var2 = (zu1) obj3;
                long[] jArr = (long[]) obj;
                hl.r((ao1) obj2);
                zu1Var2.v5.k.voiceTranscriptionRated = true;
                kf7 messagesStorage = zu1Var2.getMessagesStorage();
                messagesStorage.a.c(new r77(messagesStorage, zu1Var2.v5.e1(), r47.B0(zu1Var2.v5.k), zu1Var2.v5.k, (byte) 11));
                gn1 gn1Var = new gn1(zu1Var2, (byte) 21);
                long j = 0;
                if (jArr[0] > 0) {
                    j = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                hl.d3(gn1Var, j);
                return;
            case 18:
                hl.c3(new la7((e) ((v92) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TLRPC.TL_channels_checkUsername) obj), (byte) 22));
                return;
            case 19:
                hl.c3(new on1((dg2) obj3, (TL_account.TL_connectedBot) obj2, (TL_account.TL_businessBotRecipients) obj, (byte) 24));
                return;
            case 20:
                hl.c3(new la7((Object) ((rw2) obj3), tL_error, (Object) tLObject, (Object) ((ArrayList) obj2), (Object) ((TLRPC.TL_messages_getMyStickers) obj), (byte) 26));
                return;
            case 21:
                uj3 uj3Var = (uj3) obj3;
                uj3Var.getClass();
                hl.c3(new la7(uj3Var, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, (byte) 27));
                return;
            case 22:
                hl.c3(new vg3((uj3) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, (byte) 1));
                return;
            case 23:
                hl.c3(new ao1((l14) obj3, (id[]) obj2, tLObject, (z8d) obj, false, (byte) 15));
                return;
            case 24:
                hl.c3(new ao1((i24) obj3, (TLRPC.TL_messages_getStickers) obj2, tLObject, (Runnable) obj, false, (byte) 16));
                return;
            case 25:
                hl.c3(new re4((ih4) obj3, (id) obj2, (ac7) obj, (byte) 4));
                return;
            case 26:
                hl.c3(new re4((qn4) obj3, (e) obj2, (ArrayList) obj, (byte) 5));
                return;
            case 27:
                hl.c3(new tw4((Object) ((bx4) obj3), (Object) tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), (Object) tL_error, (byte) 0));
                return;
            case 28:
                j95 j95Var = (j95) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i = 0;
                    while (true) {
                        if (i < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                hl.c3(new g65(j95Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, (byte) 0));
                            } else {
                                i++;
                            }
                        }
                    }
                    uc7.s1(j95Var.n1.a).Y3(updates, false);
                    return;
                }
                hl.c3(new se4(j95Var, tL_error, (byte) 21));
                return;
            default:
                hl.c3(new tw4((Object) ((j95) obj3), (Object) ((id) obj2), tLObject, (TLObject) ((TL_phone.exportGroupCallInvite) obj), tL_error, (byte) 5));
                return;
        }
    }

    public fn0(pcc pccVar, uc7 uc7Var, pcc pccVar2, byte b) {
        this.a = b;
        this.c = pccVar;
        this.b = uc7Var;
        this.d = pccVar2;
    }

    public fn0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
