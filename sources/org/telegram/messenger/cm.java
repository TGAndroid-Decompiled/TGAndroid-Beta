package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.qn0;
public final class cm implements RequestDelegate {
    public final int f22039a = 0;
    public final c1 f22040b;
    public final String f22041c;
    public final long d;
    public final Object f22042e;
    public final Object f22043f;
    public final Object f22044g;
    public final TLObject h;

    public cm(hp hpVar, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f22040b = hpVar;
        this.d = j10;
        this.f22041c = str;
        this.f22042e = runnable;
        this.f22044g = d2Var;
        this.h = tL_channels_updateUsername;
        this.f22043f = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hp hpVar;
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        hp hpVar2;
        String str;
        switch (this.f22039a) {
            case 0:
                hp hpVar3 = (hp) this.f22040b;
                Runnable runnable = (Runnable) this.f22042e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f22044g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f22043f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.t4.e0(h10.f22829t0, tL_error, d2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    return;
                }
                g0.h3(new zl(hpVar3, this.d, this.f22041c, runnable, 6));
                return;
            case 1:
                hp hpVar4 = (hp) this.f22040b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f22043f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.f22044g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.f22042e;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                TLRPC.Update update = updates.updates.get(i3);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i3++;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.MessageAction messageAction2 = ((TL_update.TL_updateNewMessage) update).message.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                            photo = messageAction2.photo;
                                            if (photo instanceof TLRPC.TL_photo) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                    i3++;
                                }
                                hpVar.O3(updates, z10);
                                g0.h3(new yh(15, hpVar, runnable3));
                                return;
                            }
                            photo = null;
                        }
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = w7.w(photo.sizes, 150, false, null, false);
                            if (photo.video_sizes.isEmpty()) {
                                videoSize = null;
                            } else {
                                videoSize = photo.video_sizes.get(0);
                            }
                            if (w10 != null && fileLocation != null) {
                                hpVar4.getFileLoader().getClass();
                                File K = w7.K(w10, null, true, true);
                                hpVar4.getFileLoader().getClass();
                                w7.K(fileLocation, null, true, true).renameTo(K);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String o10 = a1.g.o(fileLocation.local_id, "@50_50", sb2);
                                StringBuilder sb3 = new StringBuilder();
                                hpVar2 = hpVar4;
                                sb3.append(w10.location.volume_id);
                                sb3.append("_");
                                zb.D().R(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), ac.i(w10, photo), true);
                            } else {
                                hpVar2 = hpVar4;
                            }
                            TLRPC.PhotoSize w11 = w7.w(photo.sizes, 800, false, null, false);
                            if (w11 != null && fileLocation2 != null) {
                                hpVar2.getFileLoader().getClass();
                                File K2 = w7.K(w11, null, true, true);
                                hpVar2.getFileLoader().getClass();
                                w7.K(fileLocation2, null, true, true).renameTo(K2);
                            }
                            if (videoSize != null && (str = this.f22041c) != null) {
                                hpVar2.getFileLoader().getClass();
                                new File(str).renameTo(w7.K(videoSize, "mp4", true, true));
                            }
                            hpVar = hpVar2;
                            hpVar.U0(-this.d);
                            z10 = false;
                            hpVar.O3(updates, z10);
                            g0.h3(new yh(15, hpVar, runnable3));
                            return;
                        }
                    }
                    hpVar = hpVar4;
                    hpVar.O3(updates, z10);
                    g0.h3(new yh(15, hpVar, runnable3));
                    return;
                }
                return;
            default:
                final x00 x00Var = (x00) this.f22040b;
                final zi ziVar = (zi) this.f22042e;
                final e3.s sVar = (e3.s) this.f22043f;
                final qn0 qn0Var = (qn0) this.f22044g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x00Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.f22041c;
                final long j10 = this.d;
                if (z11) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r8) {
                                    case 0:
                                        x00 x00Var2 = x00Var;
                                        x00Var2.getClass();
                                        zi ziVar2 = ziVar;
                                        TLRPC.Message message = ziVar2.f26868k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        qr messagesStorage = x00Var2.getMessagesStorage();
                                        e3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.f9506a, ziVar2.f26868k);
                                        x00Var2.M.remove(sVar2);
                                        g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        return;
                                    default:
                                        x00 x00Var3 = x00Var;
                                        x00Var3.getClass();
                                        zi ziVar3 = ziVar;
                                        TLRPC.Message message2 = ziVar3.f26868k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        qr messagesStorage2 = x00Var3.getMessagesStorage();
                                        e3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.f9506a, ziVar3.f26868k);
                                        x00Var3.M.remove(sVar3);
                                        g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.h3(new ci.w3(x00Var, ziVar, str2, tL_textWithEntities, arrayList.get(0), sVar, qn0Var, j10));
                        return;
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                x00 x00Var2 = x00Var;
                                x00Var2.getClass();
                                zi ziVar2 = ziVar;
                                TLRPC.Message message = ziVar2.f26868k;
                                message.translatedToLanguage = str2;
                                message.translatedText = null;
                                qr messagesStorage = x00Var2.getMessagesStorage();
                                e3.s sVar2 = sVar;
                                messagesStorage.X1(sVar2.f9506a, ziVar2.f26868k);
                                x00Var2.M.remove(sVar2);
                                g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                return;
                            default:
                                x00 x00Var3 = x00Var;
                                x00Var3.getClass();
                                zi ziVar3 = ziVar;
                                TLRPC.Message message2 = ziVar3.f26868k;
                                message2.translatedToLanguage = str2;
                                message2.translatedText = null;
                                qr messagesStorage2 = x00Var3.getMessagesStorage();
                                e3.s sVar3 = sVar;
                                messagesStorage2.X1(sVar3.f9506a, ziVar3.f26868k);
                                x00Var3.M.remove(sVar3);
                                g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public cm(hp hpVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f22040b = hpVar;
        this.f22043f = tL_inputChatPhoto;
        this.f22044g = fileLocation;
        this.h = fileLocation2;
        this.f22041c = str;
        this.d = j10;
        this.f22042e = runnable;
    }

    public cm(x00 x00Var, zi ziVar, String str, e3.s sVar, qn0 qn0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f22040b = x00Var;
        this.f22042e = ziVar;
        this.f22041c = str;
        this.f22043f = sVar;
        this.f22044g = qn0Var;
        this.d = j10;
        this.h = tL_textWithEntities;
    }
}
