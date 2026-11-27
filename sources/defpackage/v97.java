package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
public final class v97 implements RequestDelegate {
    public final byte a = 3;
    public final Object b;
    public final String c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public v97(uc7 uc7Var, long j, String str, Runnable runnable, e eVar, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = uc7Var;
        this.d = j;
        this.c = str;
        this.e = runnable;
        this.g = eVar;
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
                uc7 uc7Var = (uc7) obj5;
                Runnable runnable = (Runnable) obj4;
                e eVar = (e) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) obj;
                Runnable runnable2 = (Runnable) obj3;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    hl.c3(new la7((Object) uc7Var, tL_error, (Object) eVar, (Object) tL_channels_updateUsername, (Object) runnable2, (byte) 1));
                    return;
                } else {
                    hl.c3(new ba7(uc7Var, this.d, this.c, runnable, (byte) 17));
                    return;
                }
            case 1:
                uc7 uc7Var2 = (uc7) obj5;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) obj4;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj3;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                rj4 rj4Var = (rj4) obj;
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
                            TLRPC.PhotoSize w = xb4.w(photo.sizes, 150, false, null, false);
                            if (photo.video_sizes.isEmpty()) {
                                videoSize = null;
                            } else {
                                videoSize = photo.video_sizes.get(0);
                            }
                            if (w != null && fileLocation != null) {
                                uc7Var2.getFileLoader().getClass();
                                File J = xb4.J(w, null, true, true);
                                uc7Var2.getFileLoader().getClass();
                                xb4.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileLocation.volume_id);
                                sb.append("_");
                                String l = uh9.l(sb, fileLocation.local_id, "@50_50");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(w.location.volume_id);
                                sb2.append("_");
                                String l2 = uh9.l(sb2, w.location.local_id, "@50_50");
                                photo2 = photo;
                                in5.z().N(l, l2, jn5.i(w, photo2), true);
                            } else {
                                photo2 = photo;
                            }
                            TLRPC.PhotoSize w2 = xb4.w(photo2.sizes, 800, false, null, false);
                            if (w2 != null && fileLocation2 != null) {
                                uc7Var2.getFileLoader().getClass();
                                File J2 = xb4.J(w2, null, true, true);
                                uc7Var2.getFileLoader().getClass();
                                xb4.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                uc7Var2.getFileLoader().getClass();
                                new File(str).renameTo(xb4.J(videoSize, "mp4", true, true));
                            }
                            uc7Var2.U0(-this.d);
                        }
                    }
                    uc7Var2.Y3(updates, false);
                    hl.c3(new mn6(uc7Var2, rj4Var, (byte) 28));
                    return;
                }
                return;
            case 2:
                final wua wuaVar = (wua) obj5;
                final id idVar = (id) obj4;
                final TLRPC.Document document = (TLRPC.Document) obj3;
                final String str2 = (String) obj2;
                final String str3 = (String) obj;
                final String str4 = this.c;
                final long j = this.d;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsa.run():void");
                    }
                });
                return;
            default:
                final a5c a5cVar = (a5c) obj5;
                final r47 r47Var = (r47) obj4;
                final v11 v11Var = (v11) obj3;
                final na8 na8Var = (na8) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                a5cVar.getClass();
                boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str5 = this.c;
                final long j2 = this.d;
                if (z) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r8;
                                long j3 = j2;
                                na8 na8Var2 = na8Var;
                                v11 v11Var2 = v11Var;
                                String str6 = str5;
                                r47 r47Var2 = r47Var;
                                a5c a5cVar2 = a5cVar;
                                a5cVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        TLRPC.Message message = r47Var2.k;
                                        message.translatedToLanguage = str6;
                                        message.translatedText = null;
                                        a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                        a5cVar2.M.remove(v11Var2);
                                        hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                    default:
                                        TLRPC.Message message2 = r47Var2.k;
                                        message2.translatedToLanguage = str6;
                                        message2.translatedText = null;
                                        a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                        a5cVar2.M.remove(v11Var2);
                                        hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        hl.c3(new eh3(a5cVar, r47Var, str5, tL_textWithEntities, arrayList.get(0), v11Var, na8Var, j2));
                        return;
                    }
                }
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        long j3 = j2;
                        na8 na8Var2 = na8Var;
                        v11 v11Var2 = v11Var;
                        String str6 = str5;
                        r47 r47Var2 = r47Var;
                        a5c a5cVar2 = a5cVar;
                        a5cVar2.getClass();
                        switch (b2) {
                            case 0:
                                TLRPC.Message message = r47Var2.k;
                                message.translatedToLanguage = str6;
                                message.translatedText = null;
                                a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                a5cVar2.M.remove(v11Var2);
                                hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                            default:
                                TLRPC.Message message2 = r47Var2.k;
                                message2.translatedToLanguage = str6;
                                message2.translatedText = null;
                                a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                a5cVar2.M.remove(v11Var2);
                                hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public v97(uc7 uc7Var, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, rj4 rj4Var) {
        this.b = uc7Var;
        this.e = tL_inputChatPhoto;
        this.f = fileLocation;
        this.g = fileLocation2;
        this.c = str;
        this.d = j;
        this.h = rj4Var;
    }

    public v97(wua wuaVar, id idVar, TLRPC.Document document, String str, String str2, String str3, long j) {
        this.b = wuaVar;
        this.e = idVar;
        this.f = document;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.d = j;
    }

    public v97(a5c a5cVar, r47 r47Var, String str, v11 v11Var, na8 na8Var, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = a5cVar;
        this.e = r47Var;
        this.c = str;
        this.f = v11Var;
        this.g = na8Var;
        this.d = j;
        this.h = tL_textWithEntities;
    }
}
