package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.wn0;
public final class jm implements RequestDelegate {
    public final int f24571a = 2;
    public final c1 f24572b;
    public final String f24573c;
    public final long d;
    public final Object f24574e;
    public final Object f24575f;
    public final Object f24576g;
    public final TLObject h;

    public jm(np npVar, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f24572b = npVar;
        this.d = j3;
        this.f24573c = str;
        this.f24574e = runnable;
        this.f24576g = e2Var;
        this.h = tL_channels_updateUsername;
        this.f24575f = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        np npVar;
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        np npVar2;
        String str;
        switch (this.f24571a) {
            case 0:
                np npVar3 = (np) this.f24572b;
                Runnable runnable = (Runnable) this.f24574e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f24576g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f24575f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.t4.c0(m10.f24934t0, tL_error, e2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    return;
                }
                g0.h3(new gm(npVar3, this.d, this.f24573c, runnable, 6));
                return;
            case 1:
                np npVar4 = (np) this.f24572b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f24575f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.f24576g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.f24574e;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size) {
                                TLRPC.Update update = updates.updates.get(i7);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i7++;
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
                                    i7++;
                                }
                                npVar.O3(updates, z10);
                                g0.h3(new fi(15, npVar, runnable3));
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
                                npVar4.getFileLoader().getClass();
                                File J = w7.J(w10, null, true, true);
                                npVar4.getFileLoader().getClass();
                                w7.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                                StringBuilder sb3 = new StringBuilder();
                                npVar2 = npVar4;
                                sb3.append(w10.location.volume_id);
                                sb3.append("_");
                                fc.D().R(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), gc.i(w10, photo), true);
                            } else {
                                npVar2 = npVar4;
                            }
                            TLRPC.PhotoSize w11 = w7.w(photo.sizes, 800, false, null, false);
                            if (w11 != null && fileLocation2 != null) {
                                npVar2.getFileLoader().getClass();
                                File J2 = w7.J(w11, null, true, true);
                                npVar2.getFileLoader().getClass();
                                w7.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.f24573c) != null) {
                                npVar2.getFileLoader().getClass();
                                new File(str).renameTo(w7.J(videoSize, "mp4", true, true));
                            }
                            npVar = npVar2;
                            npVar.U0(-this.d);
                            z10 = false;
                            npVar.O3(updates, z10);
                            g0.h3(new fi(15, npVar, runnable3));
                            return;
                        }
                    }
                    npVar = npVar4;
                    npVar.O3(updates, z10);
                    g0.h3(new fi(15, npVar, runnable3));
                    return;
                }
                return;
            default:
                final c10 c10Var = (c10) this.f24572b;
                final gj gjVar = (gj) this.f24574e;
                final f3.s sVar = (f3.s) this.f24575f;
                final wn0 wn0Var = (wn0) this.f24576g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                c10Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.f24573c;
                final long j3 = this.d;
                if (z11) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r8) {
                                    case 0:
                                        c10 c10Var2 = c10Var;
                                        c10Var2.getClass();
                                        gj gjVar2 = gjVar;
                                        TLRPC.Message message = gjVar2.f23817k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        vr messagesStorage = c10Var2.getMessagesStorage();
                                        f3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.f10877a, gjVar2.f23817k);
                                        c10Var2.M.remove(sVar2);
                                        g0.i3(wn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        c10 c10Var3 = c10Var;
                                        c10Var3.getClass();
                                        gj gjVar3 = gjVar;
                                        TLRPC.Message message2 = gjVar3.f23817k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        vr messagesStorage2 = c10Var3.getMessagesStorage();
                                        f3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.f10877a, gjVar3.f23817k);
                                        c10Var3.M.remove(sVar3);
                                        g0.i3(wn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.h3(new di.n3(c10Var, gjVar, str2, tL_textWithEntities, arrayList.get(0), sVar, wn0Var, j3));
                        return;
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                c10 c10Var2 = c10Var;
                                c10Var2.getClass();
                                gj gjVar2 = gjVar;
                                TLRPC.Message message = gjVar2.f23817k;
                                message.translatedToLanguage = str2;
                                message.translatedText = null;
                                vr messagesStorage = c10Var2.getMessagesStorage();
                                f3.s sVar2 = sVar;
                                messagesStorage.X1(sVar2.f10877a, gjVar2.f23817k);
                                c10Var2.M.remove(sVar2);
                                g0.i3(wn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                c10 c10Var3 = c10Var;
                                c10Var3.getClass();
                                gj gjVar3 = gjVar;
                                TLRPC.Message message2 = gjVar3.f23817k;
                                message2.translatedToLanguage = str2;
                                message2.translatedText = null;
                                vr messagesStorage2 = c10Var3.getMessagesStorage();
                                f3.s sVar3 = sVar;
                                messagesStorage2.X1(sVar3.f10877a, gjVar3.f23817k);
                                c10Var3.M.remove(sVar3);
                                g0.i3(wn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public jm(np npVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f24572b = npVar;
        this.f24575f = tL_inputChatPhoto;
        this.f24576g = fileLocation;
        this.h = fileLocation2;
        this.f24573c = str;
        this.d = j3;
        this.f24574e = runnable;
    }

    public jm(c10 c10Var, gj gjVar, String str, f3.s sVar, wn0 wn0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f24572b = c10Var;
        this.f24574e = gjVar;
        this.f24573c = str;
        this.f24575f = sVar;
        this.f24576g = wn0Var;
        this.d = j3;
        this.h = tL_textWithEntities;
    }
}
