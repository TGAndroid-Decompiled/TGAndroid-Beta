package org.telegram.messenger;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tn implements RequestDelegate {
    public final int f25569a;
    public final c1 f25570b;
    public final Object f25571c;
    public final Object d;
    public final Object f25572e;
    public final Object f25573f;

    public tn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f25569a = i3;
        this.f25570b = c1Var;
        this.f25571c = obj;
        this.d = obj2;
        this.f25572e = obj3;
        this.f25573f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String n4;
        zi ziVar;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        int i3 = this.f25569a;
        String str = "";
        int i10 = 0;
        Object obj = this.f25573f;
        Object obj2 = this.f25572e;
        Object obj3 = this.d;
        Object obj4 = this.f25571c;
        c1 c1Var = this.f25570b;
        switch (i3) {
            case 0:
                final hp hpVar = (hp) c1Var;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj4;
                final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (tL_theme != null) {
                    n4 = tL_theme.title;
                } else {
                    n4 = j6Var.n();
                }
                int lastIndexOf = n4.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    n4 = n4.substring(0, lastIndexOf);
                }
                if (tLObject != null) {
                    TLRPC.Document document2 = (TLRPC.Document) tLObject;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.f27013id = document2.f27007id;
                    tL_inputDocument.file_reference = document2.file_reference;
                    if (tL_theme != null && tL_theme.creator) {
                        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.f27072id = tL_theme.f27140id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        updatetheme.theme = tL_inputTheme;
                        updatetheme.slug = tL_theme.slug;
                        int i11 = updatetheme.flags;
                        updatetheme.title = n4;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i11 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i11 | 15;
                        }
                        updatetheme.format = "android";
                        hpVar.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r4) {
                                    case 0:
                                        final hp hpVar2 = hpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                        g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z10;
                                                int i12 = r5;
                                                org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                                org.telegram.ui.ActionBar.j6 j6Var3 = j6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                hp hpVar3 = hpVar2;
                                                switch (i12) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var3, g6Var3, (TLRPC.TL_theme) tLObject3, hpVar3.currentAccount, false);
                                                            hpVar3.getNotificationCenter().k(182, j6Var3, g6Var3);
                                                            return;
                                                        }
                                                        hpVar3.getNotificationCenter().k(183, j6Var3, g6Var3);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var3, g6Var3, (TLRPC.TL_theme) tLObject3, hpVar3.currentAccount, false);
                                                            if (j6Var3 == org.telegram.ui.ActionBar.k6.J) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            hpVar3.k2(j6Var3, g6Var3, z10);
                                                            hpVar3.getNotificationCenter().k(182, j6Var3, g6Var3);
                                                            return;
                                                        }
                                                        hpVar3.getNotificationCenter().k(183, j6Var3, g6Var3);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final hp hpVar3 = hpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                        final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var;
                                        g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z10;
                                                int i12 = r5;
                                                org.telegram.ui.ActionBar.g6 g6Var32 = g6Var3;
                                                org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                hp hpVar32 = hpVar3;
                                                switch (i12) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.getNotificationCenter().k(182, j6Var32, g6Var32);
                                                            return;
                                                        }
                                                        hpVar32.getNotificationCenter().k(183, j6Var32, g6Var32);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            if (j6Var32 == org.telegram.ui.ActionBar.k6.J) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            hpVar32.k2(j6Var32, g6Var32, z10);
                                                            hpVar32.getNotificationCenter().k(182, j6Var32, g6Var32);
                                                            return;
                                                        }
                                                        hpVar32.getNotificationCenter().k(183, j6Var32, g6Var32);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.createTheme createtheme = new TL_account.createTheme();
                    createtheme.document = tL_inputDocument;
                    createtheme.flags = 4 | createtheme.flags;
                    if (tL_theme != null && !TextUtils.isEmpty(tL_theme.slug)) {
                        str = tL_theme.slug;
                    }
                    createtheme.slug = str;
                    createtheme.title = n4;
                    if (tL_inputThemeSettings != null) {
                        createtheme.settings = tL_inputThemeSettings;
                        createtheme.flags |= 8;
                    }
                    hpVar.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r4) {
                                case 0:
                                    final hp hpVar2 = hpVar;
                                    final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                    g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z10;
                                            int i12 = r5;
                                            org.telegram.ui.ActionBar.g6 g6Var32 = g6Var2;
                                            org.telegram.ui.ActionBar.j6 j6Var32 = j6Var2;
                                            TLObject tLObject3 = tLObject2;
                                            hp hpVar32 = hpVar2;
                                            switch (i12) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                        hpVar32.getNotificationCenter().k(182, j6Var32, g6Var32);
                                                        return;
                                                    }
                                                    hpVar32.getNotificationCenter().k(183, j6Var32, g6Var32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                        if (j6Var32 == org.telegram.ui.ActionBar.k6.J) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        hpVar32.k2(j6Var32, g6Var32, z10);
                                                        hpVar32.getNotificationCenter().k(182, j6Var32, g6Var32);
                                                        return;
                                                    }
                                                    hpVar32.getNotificationCenter().k(183, j6Var32, g6Var32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final hp hpVar3 = hpVar;
                                    final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                    final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var;
                                    g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z10;
                                            int i12 = r5;
                                            org.telegram.ui.ActionBar.g6 g6Var32 = g6Var3;
                                            org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                            TLObject tLObject3 = tLObject2;
                                            hp hpVar32 = hpVar3;
                                            switch (i12) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                        hpVar32.getNotificationCenter().k(182, j6Var32, g6Var32);
                                                        return;
                                                    }
                                                    hpVar32.getNotificationCenter().k(183, j6Var32, g6Var32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                        if (j6Var32 == org.telegram.ui.ActionBar.k6.J) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        hpVar32.k2(j6Var32, g6Var32, z10);
                                                        hpVar32.getNotificationCenter().k(182, j6Var32, g6Var32);
                                                        return;
                                                    }
                                                    hpVar32.getNotificationCenter().k(183, j6Var32, g6Var32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                    return;
                }
                g0.h3(new dg(hpVar, j6Var, g6Var, 6));
                return;
            case 1:
                hp hpVar2 = (hp) c1Var;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj4;
                sf.b bVar = (sf.b) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    g0.h3(new pj(hpVar2, s1Var, bVar, tLObject, d2Var, bundle, 5));
                    return;
                }
                return;
            case 2:
                vv vvVar = (vv) c1Var;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error == null) {
                    g0.h3(new pj(vvVar, context, s1Var2, tLObject, bArr2, user, 8));
                    return;
                }
                vvVar.f26117f.clear();
                g0.h3(new sv(vvVar, context, s1Var2, 1));
                return;
            case 3:
                vv vvVar2 = (vv) c1Var;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                zi ziVar2 = (zi) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat a12 = vvVar2.getMessagesController().a1(Integer.valueOf(encryptedChat2.f27009id));
                    if (a12 == null) {
                        encryptedChat = encryptedChat2;
                    } else {
                        encryptedChat = a12;
                    }
                    if (encryptedChat.key_hash == null) {
                        byte[] bArr3 = encryptedChat.auth_key;
                        Typeface typeface = g0.f22580a;
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(Utilities.n(bArr3), 0, bArr4, 0, 16);
                        encryptedChat.key_hash = bArr4;
                    }
                    if (encryptedChat.key_hash.length == 16) {
                        try {
                            byte[] o10 = Utilities.o(bArr.length, encryptedChat2.auth_key);
                            byte[] bArr5 = new byte[36];
                            System.arraycopy(encryptedChat2.key_hash, 0, bArr5, 0, 16);
                            System.arraycopy(o10, 0, bArr5, 16, 20);
                            encryptedChat.key_hash = bArr5;
                            vvVar2.getMessagesStorage().V1(encryptedChat);
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    vvVar2.f26113a.remove(Integer.valueOf(encryptedChat.f27009id));
                    int i12 = encryptedChat.layer;
                    Typeface typeface2 = g0.f22580a;
                    encryptedChat.layer = (i12 & (-65536)) | 151;
                    qr messagesStorage = vvVar2.getMessagesStorage();
                    messagesStorage.f24934a.c(new vp(messagesStorage, encryptedChat, 2));
                }
                if (tL_error == null) {
                    String str2 = message.attachPath;
                    TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                            message.date = messages_sentencryptedmessage.date;
                        }
                    }
                    if (ziVar2 != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = ziVar2.f26868k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) k2.p1.h(1, photo.sizes);
                                String str3 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                ziVar = ziVar2;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.f27010id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                File file = new File(w7.z(4), t4.c.q(str3, ".jpg"));
                                vvVar2.getFileLoader().getClass();
                                file.renameTo(w7.I(photoSize));
                                zb.D().R(str3, photoSize.location.volume_id + "_" + photoSize.location.local_id, ac.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                vvVar2.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                            } else {
                                ziVar = ziVar2;
                                if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                    messageMedia.document = new TLRPC.TL_documentEncrypted();
                                    TLRPC.Document document3 = message2.media.document;
                                    document3.f27007id = encryptedFile.f27010id;
                                    document3.access_hash = encryptedFile.access_hash;
                                    document3.date = document.date;
                                    document3.attributes = document.attributes;
                                    document3.mime_type = document.mime_type;
                                    document3.size = encryptedFile.size;
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
                                    document3.key = decryptedMessageMedia2.key;
                                    document3.iv = decryptedMessageMedia2.iv;
                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                    document3.thumbs = arrayList2;
                                    document3.dc_id = encryptedFile.dc_id;
                                    if (arrayList2.isEmpty()) {
                                        TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                        tL_photoSizeEmpty.type = "s";
                                        message2.media.document.thumbs.add(tL_photoSizeEmpty);
                                    }
                                    String str4 = message2.attachPath;
                                    if (str4 != null && str4.startsWith(w7.z(4).getAbsolutePath())) {
                                        File file2 = new File(message2.attachPath);
                                        w7 fileLoader = vvVar2.getFileLoader();
                                        TLRPC.Document document4 = message2.media.document;
                                        fileLoader.getClass();
                                        if (file2.renameTo(w7.I(document4))) {
                                            ziVar.f26917x0 = ziVar.f26913w0;
                                            ziVar.f26913w0 = false;
                                            message2.attachPath = "";
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(message2);
                                    vvVar2.getMessagesStorage().j1(arrayList3, false, true, false, 0, false, 0, 0L);
                                }
                            }
                            i10 = ziVar.p1();
                        }
                    }
                    vvVar2.getMessagesStorage().f24934a.c(new vf(vvVar2, message, messages_sentencryptedmessage, i10, 17));
                    return;
                }
                vvVar2.getMessagesStorage().N0(0, message);
                g0.h3(new pq(17, vvVar2, message));
                return;
            default:
                g0.h3(new pj((yy) c1Var, tLObject, (TLRPC.InputMedia) obj4, (ky) obj3, (String) obj2, (zi) obj));
                return;
        }
    }

    public tn(vv vvVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, zi ziVar, String str) {
        this.f25569a = 3;
        this.f25570b = vvVar;
        this.f25571c = decryptedMessage;
        this.d = encryptedChat;
        this.f25572e = message;
        this.f25573f = ziVar;
    }
}
