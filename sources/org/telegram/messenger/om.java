package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.hp0;
public final class om implements RequestDelegate {
    public final int f17482a = 2;
    public final f1 f17483b;
    public final String f17484c;
    public final long d;
    public final Object e;
    public final Object f17485f;
    public final Object f17486g;
    public final TLObject h;

    public om(wp wpVar, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f17483b = wpVar;
        this.d = j10;
        this.f17484c = str;
        this.e = runnable;
        this.f17486g = k2Var;
        this.h = tL_channels_updateUsername;
        this.f17485f = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        wp wpVar;
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        wp wpVar2;
        String str;
        switch (this.f17482a) {
            case 0:
                wp wpVar3 = (wp) this.f17483b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f17486g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f17485f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.s4.e0(e20.f15506s0, tL_error, k2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    return;
                }
                i0.g3(new xm(wpVar3, this.d, this.f17484c, runnable, 7));
                return;
            case 1:
                wp wpVar4 = (wp) this.f17483b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f17485f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.f17486g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.Update update = updates.updates.get(i10);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i10++;
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
                                    i10++;
                                }
                                wpVar.L3(updates, z10);
                                i0.g3(new pi(10, wpVar, runnable3));
                                return;
                            }
                            photo = null;
                        }
                        if (photo != null) {
                            TLRPC.PhotoSize w9 = b8.w(photo.sizes, 150, false, null, false);
                            if (photo.video_sizes.isEmpty()) {
                                videoSize = null;
                            } else {
                                videoSize = photo.video_sizes.get(0);
                            }
                            if (w9 != null && fileLocation != null) {
                                wpVar4.getFileLoader().getClass();
                                File K = b8.K(w9, null, true, true);
                                wpVar4.getFileLoader().getClass();
                                b8.K(fileLocation, null, true, true).renameTo(K);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String p5 = a1.g.p(sb2, fileLocation.local_id, "@50_50");
                                StringBuilder sb3 = new StringBuilder();
                                wpVar2 = wpVar4;
                                sb3.append(w9.location.volume_id);
                                sb3.append("_");
                                ic.D().R(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), jc.i(w9, photo), true);
                            } else {
                                wpVar2 = wpVar4;
                            }
                            TLRPC.PhotoSize w10 = b8.w(photo.sizes, 800, false, null, false);
                            if (w10 != null && fileLocation2 != null) {
                                wpVar2.getFileLoader().getClass();
                                File K2 = b8.K(w10, null, true, true);
                                wpVar2.getFileLoader().getClass();
                                b8.K(fileLocation2, null, true, true).renameTo(K2);
                            }
                            if (videoSize != null && (str = this.f17484c) != null) {
                                wpVar2.getFileLoader().getClass();
                                new File(str).renameTo(b8.K(videoSize, "mp4", true, true));
                            }
                            wpVar = wpVar2;
                            wpVar.T0(-this.d);
                            z10 = false;
                            wpVar.L3(updates, z10);
                            i0.g3(new pi(10, wpVar, runnable3));
                            return;
                        }
                    }
                    wpVar = wpVar4;
                    wpVar.L3(updates, z10);
                    i0.g3(new pi(10, wpVar, runnable3));
                    return;
                }
                return;
            default:
                final u10 u10Var = (u10) this.f17483b;
                final kj kjVar = (kj) this.e;
                final c3.s sVar = (c3.s) this.f17485f;
                final hp0 hp0Var = (hp0) this.f17486g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u10Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.f17484c;
                final long j10 = this.d;
                if (z11) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r8) {
                                    case 0:
                                        u10 u10Var2 = u10Var;
                                        u10Var2.getClass();
                                        kj kjVar2 = kjVar;
                                        TLRPC.Message message = kjVar2.f16690k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        is messagesStorage = u10Var2.getMessagesStorage();
                                        c3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.f3687a, kjVar2.f16690k);
                                        u10Var2.L.remove(sVar2);
                                        i0.h3(hp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        return;
                                    default:
                                        u10 u10Var3 = u10Var;
                                        u10Var3.getClass();
                                        kj kjVar3 = kjVar;
                                        TLRPC.Message message2 = kjVar3.f16690k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        is messagesStorage2 = u10Var3.getMessagesStorage();
                                        c3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.f3687a, kjVar3.f16690k);
                                        u10Var3.L.remove(sVar3);
                                        i0.h3(hp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        i0.g3(new f10(u10Var, kjVar, str2, tL_textWithEntities, arrayList.get(0), sVar, hp0Var, j10));
                        return;
                    }
                }
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                u10 u10Var2 = u10Var;
                                u10Var2.getClass();
                                kj kjVar2 = kjVar;
                                TLRPC.Message message = kjVar2.f16690k;
                                message.translatedToLanguage = str2;
                                message.translatedText = null;
                                is messagesStorage = u10Var2.getMessagesStorage();
                                c3.s sVar2 = sVar;
                                messagesStorage.X1(sVar2.f3687a, kjVar2.f16690k);
                                u10Var2.L.remove(sVar2);
                                i0.h3(hp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                return;
                            default:
                                u10 u10Var3 = u10Var;
                                u10Var3.getClass();
                                kj kjVar3 = kjVar;
                                TLRPC.Message message2 = kjVar3.f16690k;
                                message2.translatedToLanguage = str2;
                                message2.translatedText = null;
                                is messagesStorage2 = u10Var3.getMessagesStorage();
                                c3.s sVar3 = sVar;
                                messagesStorage2.X1(sVar3.f3687a, kjVar3.f16690k);
                                u10Var3.L.remove(sVar3);
                                i0.h3(hp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public om(wp wpVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f17483b = wpVar;
        this.f17485f = tL_inputChatPhoto;
        this.f17486g = fileLocation;
        this.h = fileLocation2;
        this.f17484c = str;
        this.d = j10;
        this.e = runnable;
    }

    public om(u10 u10Var, kj kjVar, String str, c3.s sVar, hp0 hp0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f17483b = u10Var;
        this.e = kjVar;
        this.f17484c = str;
        this.f17485f = sVar;
        this.f17486g = hp0Var;
        this.d = j10;
        this.h = tL_textWithEntities;
    }
}
