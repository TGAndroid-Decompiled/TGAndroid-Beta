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
public final class eo implements RequestDelegate {
    public final int f22264a;
    public final c1 f22265b;
    public final Object f22266c;
    public final Object d;
    public final Object f22267e;
    public final Object f22268f;

    public eo(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f22264a = i7;
        this.f22265b = c1Var;
        this.f22266c = obj;
        this.d = obj2;
        this.f22267e = obj3;
        this.f22268f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String n10;
        ij ijVar;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        int i7 = this.f22264a;
        String str = "";
        int i10 = 0;
        Object obj = this.f22268f;
        Object obj2 = this.f22267e;
        Object obj3 = this.d;
        Object obj4 = this.f22266c;
        c1 c1Var = this.f22265b;
        switch (i7) {
            case 0:
                final qp qpVar = (qp) c1Var;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj4;
                final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (tL_theme != null) {
                    n10 = tL_theme.title;
                } else {
                    n10 = j6Var.n();
                }
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                if (tLObject != null) {
                    TLRPC.Document document2 = (TLRPC.Document) tLObject;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.f26968id = document2.f26962id;
                    tL_inputDocument.file_reference = document2.file_reference;
                    if (tL_theme != null && tL_theme.creator) {
                        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.f27027id = tL_theme.f27095id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        updatetheme.theme = tL_inputTheme;
                        updatetheme.slug = tL_theme.slug;
                        int i11 = updatetheme.flags;
                        updatetheme.title = n10;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i11 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i11 | 15;
                        }
                        updatetheme.format = "android";
                        qpVar.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r4) {
                                    case 0:
                                        final qp qpVar2 = qpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                        final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                        g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z9;
                                                int i12 = r5;
                                                org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                                org.telegram.ui.ActionBar.j6 j6Var3 = j6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                qp qpVar3 = qpVar2;
                                                switch (i12) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var3, h6Var3, (TLRPC.TL_theme) tLObject3, qpVar3.currentAccount, false);
                                                            qpVar3.getNotificationCenter().k(182, j6Var3, h6Var3);
                                                            return;
                                                        }
                                                        qpVar3.getNotificationCenter().k(183, j6Var3, h6Var3);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var3, h6Var3, (TLRPC.TL_theme) tLObject3, qpVar3.currentAccount, false);
                                                            if (j6Var3 == org.telegram.ui.ActionBar.k6.J) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            qpVar3.k2(j6Var3, h6Var3, z9);
                                                            qpVar3.getNotificationCenter().k(182, j6Var3, h6Var3);
                                                            return;
                                                        }
                                                        qpVar3.getNotificationCenter().k(183, j6Var3, h6Var3);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final qp qpVar3 = qpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                        final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var;
                                        g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z9;
                                                int i12 = r5;
                                                org.telegram.ui.ActionBar.h6 h6Var32 = h6Var3;
                                                org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                qp qpVar32 = qpVar3;
                                                switch (i12) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, h6Var32, (TLRPC.TL_theme) tLObject3, qpVar32.currentAccount, false);
                                                            qpVar32.getNotificationCenter().k(182, j6Var32, h6Var32);
                                                            return;
                                                        }
                                                        qpVar32.getNotificationCenter().k(183, j6Var32, h6Var32);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, h6Var32, (TLRPC.TL_theme) tLObject3, qpVar32.currentAccount, false);
                                                            if (j6Var32 == org.telegram.ui.ActionBar.k6.J) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            qpVar32.k2(j6Var32, h6Var32, z9);
                                                            qpVar32.getNotificationCenter().k(182, j6Var32, h6Var32);
                                                            return;
                                                        }
                                                        qpVar32.getNotificationCenter().k(183, j6Var32, h6Var32);
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
                    createtheme.title = n10;
                    if (tL_inputThemeSettings != null) {
                        createtheme.settings = tL_inputThemeSettings;
                        createtheme.flags |= 8;
                    }
                    qpVar.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r4) {
                                case 0:
                                    final qp qpVar2 = qpVar;
                                    final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                    final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                    g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z9;
                                            int i12 = r5;
                                            org.telegram.ui.ActionBar.h6 h6Var32 = h6Var2;
                                            org.telegram.ui.ActionBar.j6 j6Var32 = j6Var2;
                                            TLObject tLObject3 = tLObject2;
                                            qp qpVar32 = qpVar2;
                                            switch (i12) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, h6Var32, (TLRPC.TL_theme) tLObject3, qpVar32.currentAccount, false);
                                                        qpVar32.getNotificationCenter().k(182, j6Var32, h6Var32);
                                                        return;
                                                    }
                                                    qpVar32.getNotificationCenter().k(183, j6Var32, h6Var32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, h6Var32, (TLRPC.TL_theme) tLObject3, qpVar32.currentAccount, false);
                                                        if (j6Var32 == org.telegram.ui.ActionBar.k6.J) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        qpVar32.k2(j6Var32, h6Var32, z9);
                                                        qpVar32.getNotificationCenter().k(182, j6Var32, h6Var32);
                                                        return;
                                                    }
                                                    qpVar32.getNotificationCenter().k(183, j6Var32, h6Var32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final qp qpVar3 = qpVar;
                                    final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                    final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var;
                                    g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z9;
                                            int i12 = r5;
                                            org.telegram.ui.ActionBar.h6 h6Var32 = h6Var3;
                                            org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                            TLObject tLObject3 = tLObject2;
                                            qp qpVar32 = qpVar3;
                                            switch (i12) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, h6Var32, (TLRPC.TL_theme) tLObject3, qpVar32.currentAccount, false);
                                                        qpVar32.getNotificationCenter().k(182, j6Var32, h6Var32);
                                                        return;
                                                    }
                                                    qpVar32.getNotificationCenter().k(183, j6Var32, h6Var32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.k6.I1(j6Var32, h6Var32, (TLRPC.TL_theme) tLObject3, qpVar32.currentAccount, false);
                                                        if (j6Var32 == org.telegram.ui.ActionBar.k6.J) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        qpVar32.k2(j6Var32, h6Var32, z9);
                                                        qpVar32.getNotificationCenter().k(182, j6Var32, h6Var32);
                                                        return;
                                                    }
                                                    qpVar32.getNotificationCenter().k(183, j6Var32, h6Var32);
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
                g0.h3(new lg(qpVar, j6Var, h6Var, 6));
                return;
            case 1:
                qp qpVar2 = (qp) c1Var;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                vf.b bVar = (vf.b) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    g0.h3(new yj(qpVar2, u1Var, bVar, tLObject, f2Var, bundle, 5));
                    return;
                }
                return;
            case 2:
                dw dwVar = (dw) c1Var;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error == null) {
                    g0.h3(new yj(dwVar, context, u1Var2, tLObject, bArr2, user, 8));
                    return;
                }
                dwVar.f22127f.clear();
                g0.h3(new aw(dwVar, context, u1Var2, 1));
                return;
            case 3:
                dw dwVar2 = (dw) c1Var;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                ij ijVar2 = (ij) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat a12 = dwVar2.getMessagesController().a1(Integer.valueOf(encryptedChat2.f26964id));
                    if (a12 == null) {
                        encryptedChat = encryptedChat2;
                    } else {
                        encryptedChat = a12;
                    }
                    if (encryptedChat.key_hash == null) {
                        byte[] bArr3 = encryptedChat.auth_key;
                        Typeface typeface = g0.f22535a;
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(Utilities.n(bArr3), 0, bArr4, 0, 16);
                        encryptedChat.key_hash = bArr4;
                    }
                    if (encryptedChat.key_hash.length == 16) {
                        try {
                            byte[] o4 = Utilities.o(bArr.length, encryptedChat2.auth_key);
                            byte[] bArr5 = new byte[36];
                            System.arraycopy(encryptedChat2.key_hash, 0, bArr5, 0, 16);
                            System.arraycopy(o4, 0, bArr5, 16, 20);
                            encryptedChat.key_hash = bArr5;
                            dwVar2.getMessagesStorage().V1(encryptedChat);
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    dwVar2.f22123a.remove(Integer.valueOf(encryptedChat.f26964id));
                    int i12 = encryptedChat.layer;
                    Typeface typeface2 = g0.f22535a;
                    encryptedChat.layer = (i12 & (-65536)) | 151;
                    yr messagesStorage = dwVar2.getMessagesStorage();
                    messagesStorage.f26719a.c(new eq(messagesStorage, encryptedChat, 2));
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
                    if (ijVar2 != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = ijVar2.f23262k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) jg.g.i(1, photo.sizes);
                                String str3 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                ijVar = ijVar2;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.f26965id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                File file = new File(w7.z(4), rf.b.r(str3, ".jpg"));
                                dwVar2.getFileLoader().getClass();
                                file.renameTo(w7.I(photoSize));
                                gc.D().R(str3, photoSize.location.volume_id + "_" + photoSize.location.local_id, hc.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                dwVar2.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                            } else {
                                ijVar = ijVar2;
                                if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                    messageMedia.document = new TLRPC.TL_documentEncrypted();
                                    TLRPC.Document document3 = message2.media.document;
                                    document3.f26962id = encryptedFile.f26965id;
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
                                        w7 fileLoader = dwVar2.getFileLoader();
                                        TLRPC.Document document4 = message2.media.document;
                                        fileLoader.getClass();
                                        if (file2.renameTo(w7.I(document4))) {
                                            ijVar.f23311x0 = ijVar.f23307w0;
                                            ijVar.f23307w0 = false;
                                            message2.attachPath = "";
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(message2);
                                    dwVar2.getMessagesStorage().j1(arrayList3, false, true, false, 0, false, 0, 0L);
                                }
                            }
                            i10 = ijVar.p1();
                        }
                    }
                    dwVar2.getMessagesStorage().f26719a.c(new dg(dwVar2, message, messages_sentencryptedmessage, i10, 17));
                    return;
                }
                dwVar2.getMessagesStorage().N0(0, message);
                g0.h3(new zq(17, dwVar2, message));
                return;
            default:
                g0.h3(new yj((gz) c1Var, tLObject, (TLRPC.InputMedia) obj4, (sy) obj3, (String) obj2, (ij) obj));
                return;
        }
    }

    public eo(dw dwVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, ij ijVar, String str) {
        this.f22264a = 3;
        this.f22265b = dwVar;
        this.f22266c = decryptedMessage;
        this.d = encryptedChat;
        this.f22267e = message;
        this.f22268f = ijVar;
    }
}
