package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
public final class s97 implements RequestDelegate {
    public final byte a = 3;
    public final Object b;
    public final String c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public s97(oc7 oc7Var, long j, String str, Runnable runnable, d dVar, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = oc7Var;
        this.d = j;
        this.c = str;
        this.e = runnable;
        this.g = dVar;
        this.h = tL_channels_updateUsername;
        this.f = runnable2;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.Photo photo;
        TLRPC.VideoSize videoSize;
        TLRPC.Photo photo2;
        String str;
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj5;
                Runnable runnable = (Runnable) obj4;
                d dVar = (d) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) obj;
                Runnable runnable2 = (Runnable) obj3;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    gm.c3(new da7((Object) oc7Var, tL_error, (Object) dVar, (Object) tL_channels_updateUsername, (Object) runnable2, (byte) 1));
                    return;
                } else {
                    gm.c3(new p97(oc7Var, this.d, this.c, runnable, (byte) 17));
                    return;
                }
            case 1:
                oc7 oc7Var2 = (oc7) obj5;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) obj4;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj3;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                qn4 qn4Var = (qn4) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                TLRPC.Update update = updates.updates.get(i);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i++;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.MessageAction messageAction2 = ((TL_update.TL_updateNewMessage) update).message.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                            photo = messageAction2.photo;
                                            if (!(photo instanceof TLRPC.TL_photo)) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                    i++;
                                }
                            } else {
                                photo = null;
                            }
                        }
                        if (photo != null) {
                            TLRPC.PhotoSize w = bc4.w(photo.sizes, 150, false, null, false);
                            if (photo.video_sizes.isEmpty()) {
                                videoSize = null;
                            } else {
                                videoSize = photo.video_sizes.get(0);
                            }
                            if (w != null && fileLocation != null) {
                                oc7Var2.getFileLoader().getClass();
                                File J = bc4.J(w, null, true, true);
                                oc7Var2.getFileLoader().getClass();
                                bc4.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileLocation.volume_id);
                                sb.append("_");
                                String k = hg9.k(sb, fileLocation.local_id, "@50_50");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(w.location.volume_id);
                                sb2.append("_");
                                String k2 = hg9.k(sb2, w.location.local_id, "@50_50");
                                photo2 = photo;
                                fn5.z().N(k, k2, gn5.i(w, photo2), true);
                            } else {
                                photo2 = photo;
                            }
                            TLRPC.PhotoSize w2 = bc4.w(photo2.sizes, 800, false, null, false);
                            if (w2 != null && fileLocation2 != null) {
                                oc7Var2.getFileLoader().getClass();
                                File J2 = bc4.J(w2, null, true, true);
                                oc7Var2.getFileLoader().getClass();
                                bc4.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                oc7Var2.getFileLoader().getClass();
                                new File(str).renameTo(bc4.J(videoSize, "mp4", true, true));
                            }
                            oc7Var2.T0(-this.d);
                        }
                    }
                    oc7Var2.T3(updates, false);
                    gm.c3(new q87(oc7Var2, qn4Var, (byte) 4));
                    return;
                }
                return;
            case 2:
                final wsa wsaVar = (wsa) obj5;
                final he heVar = (he) obj4;
                final TLRPC.Document document = (TLRPC.Document) obj3;
                final String str2 = (String) obj2;
                final String str3 = (String) obj;
                final String str4 = this.c;
                final long j = this.d;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqa.run():void");
                    }
                });
                return;
            default:
                final b3c b3cVar = (b3c) obj5;
                final k47 k47Var = (k47) obj4;
                final u21 u21Var = (u21) obj3;
                final b98 b98Var = (b98) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b3cVar.getClass();
                boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str5 = this.c;
                final long j2 = this.d;
                if (z) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r8;
                                long j3 = j2;
                                b98 b98Var2 = b98Var;
                                u21 u21Var2 = u21Var;
                                String str6 = str5;
                                k47 k47Var2 = k47Var;
                                b3c b3cVar2 = b3cVar;
                                b3cVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        TLRPC.Message message = k47Var2.k;
                                        message.translatedToLanguage = str6;
                                        message.translatedText = null;
                                        b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                        b3cVar2.M.remove(u21Var2);
                                        gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        TLRPC.Message message2 = k47Var2.k;
                                        message2.translatedToLanguage = str6;
                                        message2.translatedText = null;
                                        b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                        b3cVar2.M.remove(u21Var2);
                                        gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        gm.c3(new xh3(b3cVar, k47Var, str5, tL_textWithEntities, arrayList.get(0), u21Var, b98Var, j2));
                        return;
                    }
                }
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        long j3 = j2;
                        b98 b98Var2 = b98Var;
                        u21 u21Var2 = u21Var;
                        String str6 = str5;
                        k47 k47Var2 = k47Var;
                        b3c b3cVar2 = b3cVar;
                        b3cVar2.getClass();
                        switch (b2) {
                            case 0:
                                TLRPC.Message message = k47Var2.k;
                                message.translatedToLanguage = str6;
                                message.translatedText = null;
                                b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                b3cVar2.M.remove(u21Var2);
                                gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                TLRPC.Message message2 = k47Var2.k;
                                message2.translatedToLanguage = str6;
                                message2.translatedText = null;
                                b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                b3cVar2.M.remove(u21Var2);
                                gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public s97(oc7 oc7Var, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, qn4 qn4Var) {
        this.b = oc7Var;
        this.e = tL_inputChatPhoto;
        this.f = fileLocation;
        this.g = fileLocation2;
        this.c = str;
        this.d = j;
        this.h = qn4Var;
    }

    public s97(wsa wsaVar, he heVar, TLRPC.Document document, String str, String str2, String str3, long j) {
        this.b = wsaVar;
        this.e = heVar;
        this.f = document;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.d = j;
    }

    public s97(b3c b3cVar, k47 k47Var, String str, u21 u21Var, b98 b98Var, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = b3cVar;
        this.e = k47Var;
        this.c = str;
        this.f = u21Var;
        this.g = b98Var;
        this.d = j;
        this.h = tL_textWithEntities;
    }
}
