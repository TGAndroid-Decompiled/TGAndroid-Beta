package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.yn0;
public final class mm implements RequestDelegate {
    public final int f24057a = 2;
    public final c1 f24058b;
    public final String f24059c;
    public final long d;
    public final Object f24060e;
    public final Object f24061f;
    public final Object f24062g;
    public final TLObject h;

    public mm(qp qpVar, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f24058b = qpVar;
        this.d = j3;
        this.f24059c = str;
        this.f24060e = runnable;
        this.f24062g = f2Var;
        this.h = tL_channels_updateUsername;
        this.f24061f = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        qp qpVar;
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        qp qpVar2;
        String str;
        switch (this.f24057a) {
            case 0:
                qp qpVar3 = (qp) this.f24058b;
                Runnable runnable = (Runnable) this.f24060e;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f24062g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f24061f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.v4.c0(p10.f24470s0, tL_error, f2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    return;
                }
                g0.h3(new jm(qpVar3, this.d, this.f24059c, runnable, 6));
                return;
            case 1:
                qp qpVar4 = (qp) this.f24058b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f24061f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.f24062g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.f24060e;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z9 = false;
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
                                qpVar.O3(updates, z9);
                                g0.h3(new hi(15, qpVar, runnable3));
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
                                qpVar4.getFileLoader().getClass();
                                File J = w7.J(w10, null, true, true);
                                qpVar4.getFileLoader().getClass();
                                w7.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                                StringBuilder sb3 = new StringBuilder();
                                qpVar2 = qpVar4;
                                sb3.append(w10.location.volume_id);
                                sb3.append("_");
                                gc.D().R(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), hc.i(w10, photo), true);
                            } else {
                                qpVar2 = qpVar4;
                            }
                            TLRPC.PhotoSize w11 = w7.w(photo.sizes, 800, false, null, false);
                            if (w11 != null && fileLocation2 != null) {
                                qpVar2.getFileLoader().getClass();
                                File J2 = w7.J(w11, null, true, true);
                                qpVar2.getFileLoader().getClass();
                                w7.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.f24059c) != null) {
                                qpVar2.getFileLoader().getClass();
                                new File(str).renameTo(w7.J(videoSize, "mp4", true, true));
                            }
                            qpVar = qpVar2;
                            qpVar.U0(-this.d);
                            z9 = false;
                            qpVar.O3(updates, z9);
                            g0.h3(new hi(15, qpVar, runnable3));
                            return;
                        }
                    }
                    qpVar = qpVar4;
                    qpVar.O3(updates, z9);
                    g0.h3(new hi(15, qpVar, runnable3));
                    return;
                }
                return;
            default:
                final f10 f10Var = (f10) this.f24058b;
                final ij ijVar = (ij) this.f24060e;
                final f3.s sVar = (f3.s) this.f24061f;
                final yn0 yn0Var = (yn0) this.f24062g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                f10Var.getClass();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.f24059c;
                final long j3 = this.d;
                if (z10) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r8) {
                                    case 0:
                                        f10 f10Var2 = f10Var;
                                        f10Var2.getClass();
                                        ij ijVar2 = ijVar;
                                        TLRPC.Message message = ijVar2.f23262k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        yr messagesStorage = f10Var2.getMessagesStorage();
                                        f3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.f11070a, ijVar2.f23262k);
                                        f10Var2.L.remove(sVar2);
                                        g0.i3(yn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        f10 f10Var3 = f10Var;
                                        f10Var3.getClass();
                                        ij ijVar3 = ijVar;
                                        TLRPC.Message message2 = ijVar3.f23262k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        yr messagesStorage2 = f10Var3.getMessagesStorage();
                                        f3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.f11070a, ijVar3.f23262k);
                                        f10Var3.L.remove(sVar3);
                                        g0.i3(yn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.h3(new bi.m4(f10Var, ijVar, str2, tL_textWithEntities, arrayList.get(0), sVar, yn0Var, j3));
                        return;
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                f10 f10Var2 = f10Var;
                                f10Var2.getClass();
                                ij ijVar2 = ijVar;
                                TLRPC.Message message = ijVar2.f23262k;
                                message.translatedToLanguage = str2;
                                message.translatedText = null;
                                yr messagesStorage = f10Var2.getMessagesStorage();
                                f3.s sVar2 = sVar;
                                messagesStorage.X1(sVar2.f11070a, ijVar2.f23262k);
                                f10Var2.L.remove(sVar2);
                                g0.i3(yn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                f10 f10Var3 = f10Var;
                                f10Var3.getClass();
                                ij ijVar3 = ijVar;
                                TLRPC.Message message2 = ijVar3.f23262k;
                                message2.translatedToLanguage = str2;
                                message2.translatedText = null;
                                yr messagesStorage2 = f10Var3.getMessagesStorage();
                                f3.s sVar3 = sVar;
                                messagesStorage2.X1(sVar3.f11070a, ijVar3.f23262k);
                                f10Var3.L.remove(sVar3);
                                g0.i3(yn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public mm(qp qpVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f24058b = qpVar;
        this.f24061f = tL_inputChatPhoto;
        this.f24062g = fileLocation;
        this.h = fileLocation2;
        this.f24059c = str;
        this.d = j3;
        this.f24060e = runnable;
    }

    public mm(f10 f10Var, ij ijVar, String str, f3.s sVar, yn0 yn0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f24058b = f10Var;
        this.f24060e = ijVar;
        this.f24059c = str;
        this.f24061f = sVar;
        this.f24062g = yn0Var;
        this.d = j3;
        this.h = tL_textWithEntities;
    }
}
