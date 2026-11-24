package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
public final class p77 implements RequestDelegate {
    public final byte a = 3;
    public final Object b;
    public final String c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public p77(na7 na7Var, long j, String str, Runnable runnable, d dVar, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = na7Var;
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
                na7 na7Var = (na7) obj5;
                Runnable runnable = (Runnable) obj4;
                d dVar = (d) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) obj;
                Runnable runnable2 = (Runnable) obj3;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    gl.c3(new b87((Object) na7Var, tL_error, (Object) dVar, (Object) tL_channels_updateUsername, (Object) runnable2, (byte) 1));
                    return;
                } else {
                    gl.c3(new m77(na7Var, this.d, this.c, runnable, (byte) 17));
                    return;
                }
            case 1:
                na7 na7Var2 = (na7) obj5;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) obj4;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj3;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                iu4 iu4Var = (iu4) obj;
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
                            TLRPC.PhotoSize w = ba4.w(photo.sizes, 150, false, null, false);
                            if (photo.video_sizes.isEmpty()) {
                                videoSize = null;
                            } else {
                                videoSize = photo.video_sizes.get(0);
                            }
                            if (w != null && fileLocation != null) {
                                na7Var2.getFileLoader().getClass();
                                File J = ba4.J(w, null, true, true);
                                na7Var2.getFileLoader().getClass();
                                ba4.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileLocation.volume_id);
                                sb.append("_");
                                String l = de9.l(sb, fileLocation.local_id, "@50_50");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(w.location.volume_id);
                                sb2.append("_");
                                String l2 = de9.l(sb2, w.location.local_id, "@50_50");
                                photo2 = photo;
                                fl5.z().N(l, l2, gl5.i(w, photo2), true);
                            } else {
                                photo2 = photo;
                            }
                            TLRPC.PhotoSize w2 = ba4.w(photo2.sizes, 800, false, null, false);
                            if (w2 != null && fileLocation2 != null) {
                                na7Var2.getFileLoader().getClass();
                                File J2 = ba4.J(w2, null, true, true);
                                na7Var2.getFileLoader().getClass();
                                ba4.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                na7Var2.getFileLoader().getClass();
                                new File(str).renameTo(ba4.J(videoSize, "mp4", true, true));
                            }
                            na7Var2.S0(-this.d);
                        }
                    }
                    na7Var2.R3(updates, false);
                    gl.c3(new t67(na7Var2, iu4Var, (byte) 5));
                    return;
                }
                return;
            case 2:
                final vqa vqaVar = (vqa) obj5;
                final hd hdVar = (hd) obj4;
                final TLRPC.Document document = (TLRPC.Document) obj3;
                final String str2 = (String) obj2;
                final String str3 = (String) obj;
                final String str4 = this.c;
                final long j = this.d;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.run():void");
                    }
                });
                return;
            default:
                final b1c b1cVar = (b1c) obj5;
                final k27 k27Var = (k27) obj4;
                final m11 m11Var = (m11) obj3;
                final z68 z68Var = (z68) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b1cVar.getClass();
                boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str5 = this.c;
                final long j2 = this.d;
                if (z) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r8;
                                long j3 = j2;
                                z68 z68Var2 = z68Var;
                                m11 m11Var2 = m11Var;
                                String str6 = str5;
                                k27 k27Var2 = k27Var;
                                b1c b1cVar2 = b1cVar;
                                b1cVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        TLRPC.Message message = k27Var2.k;
                                        message.translatedToLanguage = str6;
                                        message.translatedText = null;
                                        b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                        b1cVar2.M.remove(m11Var2);
                                        gl.d3(z68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        TLRPC.Message message2 = k27Var2.k;
                                        message2.translatedToLanguage = str6;
                                        message2.translatedText = null;
                                        b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                        b1cVar2.M.remove(m11Var2);
                                        gl.d3(z68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        gl.c3(new kg3(b1cVar, k27Var, str5, tL_textWithEntities, arrayList.get(0), m11Var, z68Var, j2));
                        return;
                    }
                }
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        long j3 = j2;
                        z68 z68Var2 = z68Var;
                        m11 m11Var2 = m11Var;
                        String str6 = str5;
                        k27 k27Var2 = k27Var;
                        b1c b1cVar2 = b1cVar;
                        b1cVar2.getClass();
                        switch (b2) {
                            case 0:
                                TLRPC.Message message = k27Var2.k;
                                message.translatedToLanguage = str6;
                                message.translatedText = null;
                                b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                b1cVar2.M.remove(m11Var2);
                                gl.d3(z68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                TLRPC.Message message2 = k27Var2.k;
                                message2.translatedToLanguage = str6;
                                message2.translatedText = null;
                                b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                b1cVar2.M.remove(m11Var2);
                                gl.d3(z68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public p77(na7 na7Var, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, iu4 iu4Var) {
        this.b = na7Var;
        this.e = tL_inputChatPhoto;
        this.f = fileLocation;
        this.g = fileLocation2;
        this.c = str;
        this.d = j;
        this.h = iu4Var;
    }

    public p77(vqa vqaVar, hd hdVar, TLRPC.Document document, String str, String str2, String str3, long j) {
        this.b = vqaVar;
        this.e = hdVar;
        this.f = document;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.d = j;
    }

    public p77(b1c b1cVar, k27 k27Var, String str, m11 m11Var, z68 z68Var, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = b1cVar;
        this.e = k27Var;
        this.c = str;
        this.f = m11Var;
        this.g = z68Var;
        this.d = j;
        this.h = tL_textWithEntities;
    }
}
