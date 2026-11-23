package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ao0;
public final class em implements RequestDelegate {
    public final int f23696a = 2;
    public final c1 f23697b;
    public final String f23698c;
    public final long d;
    public final Object f23699e;
    public final Object f23700f;
    public final Object f23701g;
    public final TLObject h;

    public em(np npVar, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f23697b = npVar;
        this.d = j3;
        this.f23698c = str;
        this.f23699e = runnable;
        this.f23701g = g2Var;
        this.h = tL_channels_updateUsername;
        this.f23700f = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        np npVar;
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        np npVar2;
        String str;
        switch (this.f23696a) {
            case 0:
                np npVar3 = (np) this.f23697b;
                Runnable runnable = (Runnable) this.f23699e;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f23701g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f23700f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.c5.c0(k10.f24932t0, tL_error, g2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    return;
                }
                g0.g3(new gm(npVar3, this.d, this.f23698c, runnable, 5));
                return;
            case 1:
                np npVar4 = (np) this.f23697b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f23700f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.f23701g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.f23699e;
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
                                npVar.V3(updates, z10);
                                g0.g3(new gi(18, npVar, runnable3));
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
                            if (videoSize != null && (str = this.f23698c) != null) {
                                npVar2.getFileLoader().getClass();
                                new File(str).renameTo(w7.J(videoSize, "mp4", true, true));
                            }
                            npVar = npVar2;
                            npVar.W0(-this.d);
                            z10 = false;
                            npVar.V3(updates, z10);
                            g0.g3(new gi(18, npVar, runnable3));
                            return;
                        }
                    }
                    npVar = npVar4;
                    npVar.V3(updates, z10);
                    g0.g3(new gi(18, npVar, runnable3));
                    return;
                }
                return;
            default:
                final a10 a10Var = (a10) this.f23697b;
                final gj gjVar = (gj) this.f23699e;
                final f3.s sVar = (f3.s) this.f23700f;
                final ao0 ao0Var = (ao0) this.f23701g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                a10Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.f23698c;
                final long j3 = this.d;
                if (z11) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r8) {
                                    case 0:
                                        a10 a10Var2 = a10Var;
                                        a10Var2.getClass();
                                        gj gjVar2 = gjVar;
                                        TLRPC.Message message = gjVar2.f24177k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        ur messagesStorage = a10Var2.getMessagesStorage();
                                        f3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.f11191a, gjVar2.f24177k);
                                        a10Var2.M.remove(sVar2);
                                        g0.h3(ao0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        a10 a10Var3 = a10Var;
                                        a10Var3.getClass();
                                        gj gjVar3 = gjVar;
                                        TLRPC.Message message2 = gjVar3.f24177k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        ur messagesStorage2 = a10Var3.getMessagesStorage();
                                        f3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.f11191a, gjVar3.f24177k);
                                        a10Var3.M.remove(sVar3);
                                        g0.h3(ao0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.g3(new di.m3(a10Var, gjVar, str2, tL_textWithEntities, arrayList.get(0), sVar, ao0Var, j3));
                        return;
                    }
                }
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                a10 a10Var2 = a10Var;
                                a10Var2.getClass();
                                gj gjVar2 = gjVar;
                                TLRPC.Message message = gjVar2.f24177k;
                                message.translatedToLanguage = str2;
                                message.translatedText = null;
                                ur messagesStorage = a10Var2.getMessagesStorage();
                                f3.s sVar2 = sVar;
                                messagesStorage.X1(sVar2.f11191a, gjVar2.f24177k);
                                a10Var2.M.remove(sVar2);
                                g0.h3(ao0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                a10 a10Var3 = a10Var;
                                a10Var3.getClass();
                                gj gjVar3 = gjVar;
                                TLRPC.Message message2 = gjVar3.f24177k;
                                message2.translatedToLanguage = str2;
                                message2.translatedText = null;
                                ur messagesStorage2 = a10Var3.getMessagesStorage();
                                f3.s sVar3 = sVar;
                                messagesStorage2.X1(sVar3.f11191a, gjVar3.f24177k);
                                a10Var3.M.remove(sVar3);
                                g0.h3(ao0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public em(np npVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f23697b = npVar;
        this.f23700f = tL_inputChatPhoto;
        this.f23701g = fileLocation;
        this.h = fileLocation2;
        this.f23698c = str;
        this.d = j3;
        this.f23699e = runnable;
    }

    public em(a10 a10Var, gj gjVar, String str, f3.s sVar, ao0 ao0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f23697b = a10Var;
        this.f23699e = gjVar;
        this.f23698c = str;
        this.f23700f = sVar;
        this.f23701g = ao0Var;
        this.d = j3;
        this.h = tL_textWithEntities;
    }
}
