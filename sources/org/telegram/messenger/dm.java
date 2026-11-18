package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.zn0;
public final class dm implements RequestDelegate {
    public final int f23547a = 0;
    public final c1 f23548b;
    public final String f23549c;
    public final long d;
    public final Object f23550e;
    public final Object f23551f;
    public final Object f23552g;
    public final TLObject h;

    public dm(mp mpVar, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f23548b = mpVar;
        this.d = j3;
        this.f23549c = str;
        this.f23550e = runnable;
        this.f23552g = h2Var;
        this.h = tL_channels_updateUsername;
        this.f23551f = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        mp mpVar;
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        mp mpVar2;
        String str;
        switch (this.f23547a) {
            case 0:
                mp mpVar3 = (mp) this.f23548b;
                Runnable runnable = (Runnable) this.f23550e;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f23552g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f23551f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.b5.c0(j10.f24773t0, tL_error, h2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    return;
                }
                g0.g3(new fm(mpVar3, this.d, this.f23549c, runnable, 5));
                return;
            case 1:
                mp mpVar4 = (mp) this.f23548b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f23551f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.f23552g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.f23550e;
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
                                mpVar.V3(updates, z10);
                                g0.g3(new fi(18, mpVar, runnable3));
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
                                mpVar4.getFileLoader().getClass();
                                File J = w7.J(w10, null, true, true);
                                mpVar4.getFileLoader().getClass();
                                w7.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                                StringBuilder sb3 = new StringBuilder();
                                mpVar2 = mpVar4;
                                sb3.append(w10.location.volume_id);
                                sb3.append("_");
                                ec.D().R(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), fc.i(w10, photo), true);
                            } else {
                                mpVar2 = mpVar4;
                            }
                            TLRPC.PhotoSize w11 = w7.w(photo.sizes, 800, false, null, false);
                            if (w11 != null && fileLocation2 != null) {
                                mpVar2.getFileLoader().getClass();
                                File J2 = w7.J(w11, null, true, true);
                                mpVar2.getFileLoader().getClass();
                                w7.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.f23549c) != null) {
                                mpVar2.getFileLoader().getClass();
                                new File(str).renameTo(w7.J(videoSize, "mp4", true, true));
                            }
                            mpVar = mpVar2;
                            mpVar.W0(-this.d);
                            z10 = false;
                            mpVar.V3(updates, z10);
                            g0.g3(new fi(18, mpVar, runnable3));
                            return;
                        }
                    }
                    mpVar = mpVar4;
                    mpVar.V3(updates, z10);
                    g0.g3(new fi(18, mpVar, runnable3));
                    return;
                }
                return;
            default:
                final z00 z00Var = (z00) this.f23548b;
                final fj fjVar = (fj) this.f23550e;
                final f3.s sVar = (f3.s) this.f23551f;
                final zn0 zn0Var = (zn0) this.f23552g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                z00Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.f23549c;
                final long j3 = this.d;
                if (z11) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r8) {
                                    case 0:
                                        z00 z00Var2 = z00Var;
                                        z00Var2.getClass();
                                        fj fjVar2 = fjVar;
                                        TLRPC.Message message = fjVar2.f23968k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        tr messagesStorage = z00Var2.getMessagesStorage();
                                        f3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.f11199a, fjVar2.f23968k);
                                        z00Var2.M.remove(sVar2);
                                        g0.h3(zn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        z00 z00Var3 = z00Var;
                                        z00Var3.getClass();
                                        fj fjVar3 = fjVar;
                                        TLRPC.Message message2 = fjVar3.f23968k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        tr messagesStorage2 = z00Var3.getMessagesStorage();
                                        f3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.f11199a, fjVar3.f23968k);
                                        z00Var3.M.remove(sVar3);
                                        g0.h3(zn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.g3(new di.m3(z00Var, fjVar, str2, tL_textWithEntities, arrayList.get(0), sVar, zn0Var, j3));
                        return;
                    }
                }
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                z00 z00Var2 = z00Var;
                                z00Var2.getClass();
                                fj fjVar2 = fjVar;
                                TLRPC.Message message = fjVar2.f23968k;
                                message.translatedToLanguage = str2;
                                message.translatedText = null;
                                tr messagesStorage = z00Var2.getMessagesStorage();
                                f3.s sVar2 = sVar;
                                messagesStorage.X1(sVar2.f11199a, fjVar2.f23968k);
                                z00Var2.M.remove(sVar2);
                                g0.h3(zn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                z00 z00Var3 = z00Var;
                                z00Var3.getClass();
                                fj fjVar3 = fjVar;
                                TLRPC.Message message2 = fjVar3.f23968k;
                                message2.translatedToLanguage = str2;
                                message2.translatedText = null;
                                tr messagesStorage2 = z00Var3.getMessagesStorage();
                                f3.s sVar3 = sVar;
                                messagesStorage2.X1(sVar3.f11199a, fjVar3.f23968k);
                                z00Var3.M.remove(sVar3);
                                g0.h3(zn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public dm(mp mpVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f23548b = mpVar;
        this.f23551f = tL_inputChatPhoto;
        this.f23552g = fileLocation;
        this.h = fileLocation2;
        this.f23549c = str;
        this.d = j3;
        this.f23550e = runnable;
    }

    public dm(z00 z00Var, fj fjVar, String str, f3.s sVar, zn0 zn0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f23548b = z00Var;
        this.f23550e = fjVar;
        this.f23549c = str;
        this.f23551f = sVar;
        this.f23552g = zn0Var;
        this.d = j3;
        this.h = tL_textWithEntities;
    }
}
