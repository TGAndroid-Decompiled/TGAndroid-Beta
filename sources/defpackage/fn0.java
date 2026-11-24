package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class fn0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public fn0(bu9 bu9Var, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, k27 k27Var, String str) {
        this.a = (byte) 14;
        this.e = bu9Var;
        this.b = decryptedMessage;
        this.c = encryptedChat;
        this.d = message;
        this.f = k27Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String l;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        byte b = this.a;
        String str = "";
        int i = 0;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                gl.c3(new i87(tL_error, (p8c) ((tn0) obj5), tLObject, (na7) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (d) obj2, (p8c) ((tn0) obj), (byte) 2));
                return;
            case 1:
                gl.c3(new i87(tL_error, (p8c) obj5, tLObject, (na7) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (d) obj2, (p8c) obj, (byte) 3));
                return;
            case 2:
                gl.c3(new e57(tLObject, (String[]) obj5, (FrameLayout) obj4, (l46) obj3, (fx0) obj2, (wjb) obj, (byte) 5));
                return;
            case 3:
                gl.c3(new e57((gk7) ((mu1) obj5), (Object) ((op1) obj4), (Object) ((gb2) obj3), (String) obj2, tLObject, (Object) ((CharacterStyle) obj), (byte) 7));
                return;
            case 4:
                gl.c3(new i87((gk7) ((mu1) obj5), tL_error, (TLObject) obj4, (Object) tLObject, (Object) ((jl1) obj3), (Object) ((String) obj2), (Object) ((op1) obj), (byte) 6));
                return;
            case 5:
                gl.c3(new i87((wt1) obj5, (hd) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (k27) obj, tL_error));
                return;
            case 6:
                String str2 = LaunchActivity.C1;
                gl.c3(new i87((LaunchActivity) obj5, (hd) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                return;
            case 7:
                ve6 ve6Var = (ve6) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                e45 e45Var = (e45) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList x0 = na7.x0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = x0.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = x0.get(i2);
                        i2++;
                        gl.c3(new sx5(ve6Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, (byte) 25));
                    }
                    ve6Var.w.getMessagesController().R3(updates, false);
                    ci0.h().d(purchase, tL_payments_canPurchaseStore.purpose, null);
                    gl.c3(new re6(ve6Var, (byte) 4));
                    return;
                } else if (tL_error != null) {
                    gl.c3(new tp5(e45Var, (byte) 25));
                    return;
                } else {
                    return;
                }
            case 8:
                gl.c3(new i87((gk7) ((lf6) obj5), tL_error, tLObject, (Object) ((Bundle) obj4), (Object) ((String) obj3), (Object) ((xl3) obj2), (Object) ((TLObject) obj), (byte) 14));
                return;
            case 9:
                gl.c3(new e57(tL_error, (Context) obj5, (wjb) obj4, (u41) obj3, (i61) obj2, (Runnable) obj, (byte) 18));
                return;
            case 10:
                final na7 na7Var = (na7) obj4;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj5;
                final akb akbVar = (akb) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final zjb zjbVar = (zjb) obj;
                if (tL_theme != null) {
                    l = tL_theme.title;
                } else {
                    l = akbVar.l();
                }
                int lastIndexOf = l.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    l = l.substring(0, lastIndexOf);
                }
                if (tLObject != null) {
                    TLRPC.Document document2 = (TLRPC.Document) tLObject;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.file_reference = document2.file_reference;
                    if (tL_theme != null && tL_theme.creator) {
                        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.id = tL_theme.id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        updatetheme.theme = tL_inputTheme;
                        updatetheme.slug = tL_theme.slug;
                        int i3 = updatetheme.flags;
                        updatetheme.title = l;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i3 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i3 | 15;
                        }
                        updatetheme.format = "android";
                        na7Var.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r4) {
                                    case 0:
                                        final na7 na7Var2 = na7Var;
                                        final akb akbVar2 = akbVar;
                                        final zjb zjbVar2 = zjbVar;
                                        gl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z;
                                                byte b2 = r5;
                                                zjb zjbVar3 = zjbVar2;
                                                akb akbVar3 = akbVar2;
                                                TLObject tLObject3 = tLObject2;
                                                na7 na7Var3 = na7Var2;
                                                switch (b2) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            bkb.G1(akbVar3, zjbVar3, (TLRPC.TL_theme) tLObject3, na7Var3.currentAccount, false);
                                                            if (akbVar3 == bkb.J) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            na7Var3.f2(akbVar3, zjbVar3, z);
                                                            na7Var3.getNotificationCenter().k(182, akbVar3, zjbVar3);
                                                            return;
                                                        }
                                                        na7Var3.getNotificationCenter().k(183, akbVar3, zjbVar3);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            bkb.G1(akbVar3, zjbVar3, (TLRPC.TL_theme) tLObject3, na7Var3.currentAccount, false);
                                                            na7Var3.getNotificationCenter().k(182, akbVar3, zjbVar3);
                                                            return;
                                                        }
                                                        na7Var3.getNotificationCenter().k(183, akbVar3, zjbVar3);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final na7 na7Var3 = na7Var;
                                        final akb akbVar3 = akbVar;
                                        final zjb zjbVar3 = zjbVar;
                                        gl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z;
                                                byte b2 = r5;
                                                zjb zjbVar32 = zjbVar3;
                                                akb akbVar32 = akbVar3;
                                                TLObject tLObject3 = tLObject2;
                                                na7 na7Var32 = na7Var3;
                                                switch (b2) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            bkb.G1(akbVar32, zjbVar32, (TLRPC.TL_theme) tLObject3, na7Var32.currentAccount, false);
                                                            if (akbVar32 == bkb.J) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            na7Var32.f2(akbVar32, zjbVar32, z);
                                                            na7Var32.getNotificationCenter().k(182, akbVar32, zjbVar32);
                                                            return;
                                                        }
                                                        na7Var32.getNotificationCenter().k(183, akbVar32, zjbVar32);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            bkb.G1(akbVar32, zjbVar32, (TLRPC.TL_theme) tLObject3, na7Var32.currentAccount, false);
                                                            na7Var32.getNotificationCenter().k(182, akbVar32, zjbVar32);
                                                            return;
                                                        }
                                                        na7Var32.getNotificationCenter().k(183, akbVar32, zjbVar32);
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
                    createtheme.flags |= 4;
                    if (tL_theme != null && !TextUtils.isEmpty(tL_theme.slug)) {
                        str = tL_theme.slug;
                    }
                    createtheme.slug = str;
                    createtheme.title = l;
                    if (tL_inputThemeSettings != null) {
                        createtheme.settings = tL_inputThemeSettings;
                        createtheme.flags |= 8;
                    }
                    na7Var.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r4) {
                                case 0:
                                    final na7 na7Var2 = na7Var;
                                    final akb akbVar2 = akbVar;
                                    final zjb zjbVar2 = zjbVar;
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z;
                                            byte b2 = r5;
                                            zjb zjbVar32 = zjbVar2;
                                            akb akbVar32 = akbVar2;
                                            TLObject tLObject3 = tLObject2;
                                            na7 na7Var32 = na7Var2;
                                            switch (b2) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        bkb.G1(akbVar32, zjbVar32, (TLRPC.TL_theme) tLObject3, na7Var32.currentAccount, false);
                                                        if (akbVar32 == bkb.J) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        na7Var32.f2(akbVar32, zjbVar32, z);
                                                        na7Var32.getNotificationCenter().k(182, akbVar32, zjbVar32);
                                                        return;
                                                    }
                                                    na7Var32.getNotificationCenter().k(183, akbVar32, zjbVar32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        bkb.G1(akbVar32, zjbVar32, (TLRPC.TL_theme) tLObject3, na7Var32.currentAccount, false);
                                                        na7Var32.getNotificationCenter().k(182, akbVar32, zjbVar32);
                                                        return;
                                                    }
                                                    na7Var32.getNotificationCenter().k(183, akbVar32, zjbVar32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final na7 na7Var3 = na7Var;
                                    final akb akbVar3 = akbVar;
                                    final zjb zjbVar3 = zjbVar;
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z;
                                            byte b2 = r5;
                                            zjb zjbVar32 = zjbVar3;
                                            akb akbVar32 = akbVar3;
                                            TLObject tLObject3 = tLObject2;
                                            na7 na7Var32 = na7Var3;
                                            switch (b2) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        bkb.G1(akbVar32, zjbVar32, (TLRPC.TL_theme) tLObject3, na7Var32.currentAccount, false);
                                                        if (akbVar32 == bkb.J) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        na7Var32.f2(akbVar32, zjbVar32, z);
                                                        na7Var32.getNotificationCenter().k(182, akbVar32, zjbVar32);
                                                        return;
                                                    }
                                                    na7Var32.getNotificationCenter().k(183, akbVar32, zjbVar32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        bkb.G1(akbVar32, zjbVar32, (TLRPC.TL_theme) tLObject3, na7Var32.currentAccount, false);
                                                        na7Var32.getNotificationCenter().k(182, akbVar32, zjbVar32);
                                                        return;
                                                    }
                                                    na7Var32.getNotificationCenter().k(183, akbVar32, zjbVar32);
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
                gl.c3(new lo6(na7Var, akbVar, zjbVar, (byte) 14));
                return;
            case 11:
                na7 na7Var2 = (na7) obj4;
                hd hdVar = (hd) obj5;
                pp1 pp1Var = (pp1) obj3;
                d dVar = (d) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    gl.c3(new e57(na7Var2, hdVar, pp1Var, tLObject, dVar, bundle, (byte) 19));
                    return;
                }
                return;
            case 12:
                gl.c3(new i87((ax7) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (bx7) obj2, tL_error, (wk4) obj));
                return;
            case 13:
                bu9 bu9Var = (bu9) obj5;
                Activity activity = (Activity) obj4;
                hd hdVar2 = (hd) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error == null) {
                    gl.c3(new e57(bu9Var, activity, hdVar2, tLObject, bArr2, user, (byte) 25));
                    return;
                }
                bu9Var.f.clear();
                gl.c3(new yt9(bu9Var, activity, hdVar2, (byte) 1));
                return;
            case 14:
                bu9 bu9Var2 = (bu9) obj5;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                k27 k27Var = (k27) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat Y0 = bu9Var2.getMessagesController().Y0(Integer.valueOf(encryptedChat2.id));
                    if (Y0 == null) {
                        encryptedChat = encryptedChat2;
                    } else {
                        encryptedChat = Y0;
                    }
                    byte[] bArr3 = encryptedChat.key_hash;
                    if (bArr3 == null) {
                        byte[] bArr4 = encryptedChat.auth_key;
                        Typeface typeface = gl.a;
                        byte[] bArr5 = new byte[16];
                        System.arraycopy(Utilities.n(bArr4), 0, bArr5, 0, 16);
                        encryptedChat.key_hash = bArr5;
                        bArr3 = bArr5;
                    }
                    if (bArr3.length == 16) {
                        try {
                            byte[] o = Utilities.o(bArr.length, encryptedChat2.auth_key);
                            byte[] bArr6 = new byte[36];
                            System.arraycopy(encryptedChat2.key_hash, 0, bArr6, 0, 16);
                            System.arraycopy(o, 0, bArr6, 16, 20);
                            encryptedChat.key_hash = bArr6;
                            bu9Var2.getMessagesStorage().S1(encryptedChat);
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                    }
                    bu9Var2.a.remove(Integer.valueOf(encryptedChat.id));
                    int i4 = encryptedChat.layer;
                    Typeface typeface2 = gl.a;
                    encryptedChat.layer = (i4 & (-65536)) | 151;
                    ad7 messagesStorage = bu9Var2.getMessagesStorage();
                    messagesStorage.a.c(new fb7(messagesStorage, encryptedChat, (byte) 2));
                }
                if (tL_error == null) {
                    String str3 = message.attachPath;
                    TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                            message.date = messages_sentencryptedmessage.date;
                        }
                    }
                    if (k27Var != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = k27Var.k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) b00.f(1, photo.sizes);
                                String str4 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                File file = new File(ba4.z(4), str4.concat(".jpg"));
                                bu9Var2.getFileLoader().getClass();
                                file.renameTo(ba4.I(photoSize));
                                fl5.z().N(str4, photoSize.location.volume_id + "_" + photoSize.location.local_id, gl5.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                bu9Var2.getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                messageMedia.document = new TLRPC.TL_documentEncrypted();
                                TLRPC.Document document3 = message2.media.document;
                                document3.id = encryptedFile.id;
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
                                String str5 = message2.attachPath;
                                if (str5 != null && str5.startsWith(ba4.z(4).getAbsolutePath())) {
                                    File file2 = new File(message2.attachPath);
                                    ba4 fileLoader = bu9Var2.getFileLoader();
                                    TLRPC.Document document4 = message2.media.document;
                                    fileLoader.getClass();
                                    if (file2.renameTo(ba4.I(document4))) {
                                        k27Var.z0 = k27Var.y0;
                                        k27Var.y0 = false;
                                        message2.attachPath = "";
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(message2);
                                bu9Var2.getMessagesStorage().g1(arrayList3, false, true, false, 0, false, 0, 0L);
                            }
                            i = k27Var.o1();
                        }
                    }
                    bu9Var2.getMessagesStorage().a.c(new q76(bu9Var2, message, messages_sentencryptedmessage, i, (byte) 24));
                    return;
                }
                bu9Var2.getMessagesStorage().K0(0, message);
                gl.c3(new tj9(bu9Var2, message, (byte) 15));
                return;
            case 15:
                gl.c3(new e57((iy9) obj5, tL_error, (TLRPC.TL_inputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, (byte) 26));
                return;
            case 16:
                gl.c3(new e57((z3a) obj5, tLObject, (TLRPC.InputMedia) obj4, (k3a) obj3, (String) obj2, (k27) obj));
                return;
            case 17:
                gl.c3(new i87((gta) obj5, tLObject, (k27) obj4, (TLRPC.InputInvoice) obj3, (p8c) obj2, (u21) obj, tL_error));
                return;
            case 18:
                gl.c3(new foa((u0b) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, (byte) 7));
                return;
            default:
                gl.c3(new foa((int[]) obj5, tLObject, (na7) obj4, (TLRPC.User[]) obj3, (dsc) obj2, (o42) obj, (byte) 11));
                return;
        }
    }

    public fn0(na7 na7Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = na7Var;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
    }

    public fn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
