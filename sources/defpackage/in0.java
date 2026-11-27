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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class in0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public in0(wx9 wx9Var, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, r47 r47Var, String str) {
        this.a = (byte) 14;
        this.e = wx9Var;
        this.b = decryptedMessage;
        this.c = encryptedChat;
        this.d = message;
        this.f = r47Var;
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
                hl.c3(new ra7(tL_error, (pcc) ((tn0) obj5), tLObject, (uc7) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (e) obj2, (pcc) ((tn0) obj), (byte) 2));
                return;
            case 1:
                hl.c3(new ra7(tL_error, (pcc) obj5, tLObject, (uc7) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (e) obj2, (pcc) obj, (byte) 3));
                return;
            case 2:
                hl.c3(new z87(tLObject, (String[]) obj5, (FrameLayout) obj4, (p66) obj3, (nx0) obj2, (vnb) obj, (byte) 5));
                return;
            case 3:
                hl.c3(new z87((fn7) ((zu1) obj5), (Object) ((cq1) obj4), (Object) ((wb2) obj3), (String) obj2, tLObject, (Object) ((CharacterStyle) obj), (byte) 7));
                return;
            case 4:
                hl.c3(new ra7((fn7) ((zu1) obj5), tL_error, (TLObject) obj4, (Object) tLObject, (Object) ((pm1) obj3), (Object) ((String) obj2), (Object) ((cq1) obj), (byte) 6));
                return;
            case 5:
                hl.c3(new ra7((ju1) obj5, (id) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (r47) obj, tL_error));
                return;
            case 6:
                String str2 = LaunchActivity.C1;
                hl.c3(new ra7((LaunchActivity) obj5, (id) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                return;
            case 7:
                zg6 zg6Var = (zg6) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                g65 g65Var = (g65) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z0 = uc7.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z0.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = z0.get(i2);
                        i2++;
                        hl.c3(new yg6(zg6Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, (byte) 0));
                    }
                    zg6Var.w.getMessagesController().Y3(updates, false);
                    di0.h().d(purchase, tL_payments_canPurchaseStore.purpose, null);
                    hl.c3(new ug6(zg6Var, (byte) 4));
                    return;
                } else if (tL_error != null) {
                    hl.c3(new z96(g65Var, (byte) 10));
                    return;
                } else {
                    return;
                }
            case 8:
                hl.c3(new ra7((fn7) ((ph6) obj5), tL_error, tLObject, (Object) ((Bundle) obj4), (Object) ((String) obj3), (Object) ((pm3) obj2), (Object) ((TLObject) obj), (byte) 14));
                return;
            case 9:
                hl.c3(new z87(tL_error, (Context) obj5, (vnb) obj4, (c51) obj3, (q61) obj2, (Runnable) obj, (byte) 18));
                return;
            case 10:
                final uc7 uc7Var = (uc7) obj4;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj5;
                final znb znbVar = (znb) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final ynb ynbVar = (ynb) obj;
                if (tL_theme != null) {
                    l = tL_theme.title;
                } else {
                    l = znbVar.l();
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
                        uc7Var.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r4) {
                                    case 0:
                                        final uc7 uc7Var2 = uc7Var;
                                        final znb znbVar2 = znbVar;
                                        final ynb ynbVar2 = ynbVar;
                                        hl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z;
                                                byte b2 = r5;
                                                ynb ynbVar3 = ynbVar2;
                                                znb znbVar3 = znbVar2;
                                                TLObject tLObject3 = tLObject2;
                                                uc7 uc7Var3 = uc7Var2;
                                                switch (b2) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            aob.G1(znbVar3, ynbVar3, (TLRPC.TL_theme) tLObject3, uc7Var3.currentAccount, false);
                                                            if (znbVar3 == aob.J) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            uc7Var3.h2(znbVar3, ynbVar3, z);
                                                            uc7Var3.getNotificationCenter().k(183, znbVar3, ynbVar3);
                                                            return;
                                                        }
                                                        uc7Var3.getNotificationCenter().k(184, znbVar3, ynbVar3);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            aob.G1(znbVar3, ynbVar3, (TLRPC.TL_theme) tLObject3, uc7Var3.currentAccount, false);
                                                            uc7Var3.getNotificationCenter().k(183, znbVar3, ynbVar3);
                                                            return;
                                                        }
                                                        uc7Var3.getNotificationCenter().k(184, znbVar3, ynbVar3);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final uc7 uc7Var3 = uc7Var;
                                        final znb znbVar3 = znbVar;
                                        final ynb ynbVar3 = ynbVar;
                                        hl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z;
                                                byte b2 = r5;
                                                ynb ynbVar32 = ynbVar3;
                                                znb znbVar32 = znbVar3;
                                                TLObject tLObject3 = tLObject2;
                                                uc7 uc7Var32 = uc7Var3;
                                                switch (b2) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            aob.G1(znbVar32, ynbVar32, (TLRPC.TL_theme) tLObject3, uc7Var32.currentAccount, false);
                                                            if (znbVar32 == aob.J) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            uc7Var32.h2(znbVar32, ynbVar32, z);
                                                            uc7Var32.getNotificationCenter().k(183, znbVar32, ynbVar32);
                                                            return;
                                                        }
                                                        uc7Var32.getNotificationCenter().k(184, znbVar32, ynbVar32);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            aob.G1(znbVar32, ynbVar32, (TLRPC.TL_theme) tLObject3, uc7Var32.currentAccount, false);
                                                            uc7Var32.getNotificationCenter().k(183, znbVar32, ynbVar32);
                                                            return;
                                                        }
                                                        uc7Var32.getNotificationCenter().k(184, znbVar32, ynbVar32);
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
                    uc7Var.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r4) {
                                case 0:
                                    final uc7 uc7Var2 = uc7Var;
                                    final znb znbVar2 = znbVar;
                                    final ynb ynbVar2 = ynbVar;
                                    hl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z;
                                            byte b2 = r5;
                                            ynb ynbVar32 = ynbVar2;
                                            znb znbVar32 = znbVar2;
                                            TLObject tLObject3 = tLObject2;
                                            uc7 uc7Var32 = uc7Var2;
                                            switch (b2) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        aob.G1(znbVar32, ynbVar32, (TLRPC.TL_theme) tLObject3, uc7Var32.currentAccount, false);
                                                        if (znbVar32 == aob.J) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        uc7Var32.h2(znbVar32, ynbVar32, z);
                                                        uc7Var32.getNotificationCenter().k(183, znbVar32, ynbVar32);
                                                        return;
                                                    }
                                                    uc7Var32.getNotificationCenter().k(184, znbVar32, ynbVar32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        aob.G1(znbVar32, ynbVar32, (TLRPC.TL_theme) tLObject3, uc7Var32.currentAccount, false);
                                                        uc7Var32.getNotificationCenter().k(183, znbVar32, ynbVar32);
                                                        return;
                                                    }
                                                    uc7Var32.getNotificationCenter().k(184, znbVar32, ynbVar32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final uc7 uc7Var3 = uc7Var;
                                    final znb znbVar3 = znbVar;
                                    final ynb ynbVar3 = ynbVar;
                                    hl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z;
                                            byte b2 = r5;
                                            ynb ynbVar32 = ynbVar3;
                                            znb znbVar32 = znbVar3;
                                            TLObject tLObject3 = tLObject2;
                                            uc7 uc7Var32 = uc7Var3;
                                            switch (b2) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        aob.G1(znbVar32, ynbVar32, (TLRPC.TL_theme) tLObject3, uc7Var32.currentAccount, false);
                                                        if (znbVar32 == aob.J) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        uc7Var32.h2(znbVar32, ynbVar32, z);
                                                        uc7Var32.getNotificationCenter().k(183, znbVar32, ynbVar32);
                                                        return;
                                                    }
                                                    uc7Var32.getNotificationCenter().k(184, znbVar32, ynbVar32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        aob.G1(znbVar32, ynbVar32, (TLRPC.TL_theme) tLObject3, uc7Var32.currentAccount, false);
                                                        uc7Var32.getNotificationCenter().k(183, znbVar32, ynbVar32);
                                                        return;
                                                    }
                                                    uc7Var32.getNotificationCenter().k(184, znbVar32, ynbVar32);
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
                hl.c3(new yg6(uc7Var, znbVar, ynbVar, (byte) 22));
                return;
            case 11:
                uc7 uc7Var2 = (uc7) obj4;
                id idVar = (id) obj5;
                dq1 dq1Var = (dq1) obj3;
                e eVar = (e) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    hl.c3(new z87(uc7Var2, idVar, dq1Var, tLObject, eVar, bundle, (byte) 19));
                    return;
                }
                return;
            case 12:
                hl.c3(new ra7((i08) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (j08) obj2, tL_error, (um4) obj));
                return;
            case 13:
                wx9 wx9Var = (wx9) obj5;
                Activity activity = (Activity) obj4;
                id idVar2 = (id) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error == null) {
                    hl.c3(new z87(wx9Var, activity, idVar2, tLObject, bArr2, user, (byte) 25));
                    return;
                }
                wx9Var.f.clear();
                hl.c3(new sx9(wx9Var, activity, idVar2, (byte) 1));
                return;
            case 14:
                wx9 wx9Var2 = (wx9) obj5;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                r47 r47Var = (r47) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat a1 = wx9Var2.getMessagesController().a1(Integer.valueOf(encryptedChat2.id));
                    if (a1 == null) {
                        encryptedChat = encryptedChat2;
                    } else {
                        encryptedChat = a1;
                    }
                    byte[] bArr3 = encryptedChat.key_hash;
                    if (bArr3 == null) {
                        byte[] bArr4 = encryptedChat.auth_key;
                        Typeface typeface = hl.a;
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
                            wx9Var2.getMessagesStorage().S1(encryptedChat);
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    wx9Var2.a.remove(Integer.valueOf(encryptedChat.id));
                    int i4 = encryptedChat.layer;
                    Typeface typeface2 = hl.a;
                    encryptedChat.layer = (i4 & (-65536)) | 151;
                    jf7 messagesStorage = wx9Var2.getMessagesStorage();
                    messagesStorage.a.c(new id7(messagesStorage, encryptedChat, (byte) 2));
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
                    if (r47Var != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = r47Var.k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) c00.g(1, photo.sizes);
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
                                File file = new File(xb4.z(4), str4.concat(".jpg"));
                                wx9Var2.getFileLoader().getClass();
                                file.renameTo(xb4.I(photoSize));
                                in5.z().N(str4, photoSize.location.volume_id + "_" + photoSize.location.local_id, jn5.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                wx9Var2.getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
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
                                if (str5 != null && str5.startsWith(xb4.z(4).getAbsolutePath())) {
                                    File file2 = new File(message2.attachPath);
                                    xb4 fileLoader = wx9Var2.getFileLoader();
                                    TLRPC.Document document4 = message2.media.document;
                                    fileLoader.getClass();
                                    if (file2.renameTo(xb4.I(document4))) {
                                        r47Var.z0 = r47Var.y0;
                                        r47Var.y0 = false;
                                        message2.attachPath = "";
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(message2);
                                wx9Var2.getMessagesStorage().g1(arrayList3, false, true, false, 0, false, 0, 0L);
                            }
                            i = r47Var.o1();
                        }
                    }
                    wx9Var2.getMessagesStorage().a.c(new y36(wx9Var2, message, messages_sentencryptedmessage, i, (byte) 26));
                    return;
                }
                wx9Var2.getMessagesStorage().K0(0, message);
                hl.c3(new en9(wx9Var2, message, (byte) 14));
                return;
            case 15:
                hl.c3(new z87((b2a) obj5, tL_error, (TLRPC.TL_inputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, (byte) 26));
                return;
            case 16:
                hl.c3(new z87((r7a) obj5, tLObject, (TLRPC.InputMedia) obj4, (d7a) obj3, (String) obj2, (r47) obj));
                return;
            case 17:
                hl.c3(new ra7((jxa) obj5, tLObject, (r47) obj4, (TLRPC.InputInvoice) obj3, (pcc) obj2, (d31) obj, tL_error));
                return;
            case 18:
                hl.c3(new esa((s4b) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, (byte) 7));
                return;
            default:
                hl.c3(new esa((int[]) obj5, tLObject, (uc7) obj4, (TLRPC.User[]) obj3, (twc) obj2, (e52) obj, (byte) 12));
                return;
        }
    }

    public in0(uc7 uc7Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
    }

    public in0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
