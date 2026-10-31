package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c90;
public final class qz extends f1 implements us {
    public static final r5 I = new r5("mediaSendQueue");
    public static final ThreadPoolExecutor J;
    public static volatile qz[] K;
    public final a0.h D;
    public final HashMap E;
    public final HashMap F;
    public final j2.f G;
    public final HashMap H;
    public final HashMap f17658a;
    public final SparseArray f17659b;
    public final SparseArray f17660c;
    public final SparseArray d;
    public final SparseArray e;
    public final a0.h f17661f;
    public final a0.h h;
    public final HashMap f17662n;
    public final HashMap f17663r;
    public final HashMap f17664s;
    public final HashMap f17665w;
    public final a0.h f17666x;
    public final HashMap f17667y;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        J = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        K = new qz[4];
    }

    public qz(int i10) {
        super(i10);
        this.f17658a = new HashMap();
        this.f17659b = new SparseArray();
        this.f17660c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f17661f = new a0.h();
        this.h = new a0.h();
        this.f17662n = new HashMap();
        this.f17663r = new HashMap();
        this.f17664s = new HashMap();
        this.f17665w = new HashMap();
        this.f17666x = new a0.h();
        this.f17667y = new HashMap();
        this.D = new a0.h();
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new j2.f(new k2.m0(this));
        this.H = new HashMap();
        i0.g3(new ms(this, 13));
    }

    public static void B0(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str3 = message.attachPath;
        if (str3 != null) {
            str2 = str3;
        }
        serializedData.writeString(str2);
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            message.entities.get(i10).serializeToStream(serializedData);
        }
    }

    public static qz C(int i10) {
        qz qzVar;
        qz qzVar2 = K[i10];
        if (qzVar2 == null) {
            synchronized (qz.class) {
                try {
                    qzVar = K[i10];
                    if (qzVar == null) {
                        qz[] qzVarArr = K;
                        qz qzVar3 = new qz(i10);
                        qzVarArr[i10] = qzVar3;
                        qzVar = qzVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return qzVar;
        }
        return qzVar2;
    }

    public static String D(c cVar, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z10, boolean z11) {
        String str;
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF N1 = org.telegram.ui.Cells.q1.N1(photoSize.f19818w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                b8.G(cVar.f14863a);
                File K2 = b8.K(photoSize, null, z11, true);
                FileInputStream fileInputStream = new FileInputStream(K2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / N1.x, options.outHeight / N1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(K2);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        Locale locale = Locale.US;
        if (z10) {
            str = "%d_%d@%d_%d_b";
        } else {
            str = "%d_%d@%d_%d";
        }
        return String.format(locale, str, Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (N1.x / i0.f16025p)), Integer.valueOf((int) (N1.y / i0.f16025p)));
    }

    public static long E() {
        long j10 = 0;
        while (j10 == 0) {
            j10 = Utilities.f14519b.nextLong();
        }
        return j10;
    }

    public static TLRPC.PhotoSize G(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i10);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.f19818w = photoSize.f19818w;
                    tL_photoSize_layer127.h = photoSize.h;
                    tL_photoSize_layer127.size = photoSize.size;
                    byte[] bArr = photoSize.bytes;
                    tL_photoSize_layer127.bytes = bArr;
                    if (bArr == null) {
                        tL_photoSize_layer127.bytes = new byte[0];
                    }
                    TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                    tL_photoSize_layer127.location = tL_fileLocation_layer82;
                    TLRPC.FileLocation fileLocation = photoSize.location;
                    tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                    tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                    tL_fileLocation_layer82.local_id = fileLocation.local_id;
                    tL_fileLocation_layer82.secret = fileLocation.secret;
                    return tL_photoSize_layer127;
                }
            }
            return null;
        }
        return null;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence n12 = i0.n1(charSequence);
        if (n12.length() == 0) {
            return n12;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    public static void K(java.util.ArrayList r96, final long r97, boolean r99, boolean r100, boolean r101, final org.telegram.messenger.c r102, long r103, final org.telegram.messenger.jj r105, final org.telegram.tgnet.TLRPC.TL_inputPollAnswer r106, final org.telegram.messenger.jj r107, final org.telegram.messenger.jj r108, final boolean r109, final int r110, final int r111, final org.telegram.tgnet.tl.TL_stories.StoryItem r112, final org.telegram.ui.kn r113, final org.telegram.messenger.sw r114, final long r115, final boolean r117, final long r118, final long r120, final org.telegram.messenger.oj r122, final ih.i r123, boolean r124, m2.t r125, final boolean r126) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.K(java.util.ArrayList, long, boolean, boolean, boolean, org.telegram.messenger.c, long, org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.messenger.jj, org.telegram.messenger.jj, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.kn, org.telegram.messenger.sw, long, boolean, long, long, org.telegram.messenger.oj, ih.i, boolean, m2.t, boolean):void");
    }

    public static void R(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, jj jjVar, jj jjVar2, org.telegram.ui.kn knVar, boolean z10, int i10, int i11, sw swVar, long j11, long j12, long j13) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i12 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i12 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i12);
            i12++;
            j(pageBlock2, identityHashMap);
        }
        oz c10 = oz.c(null, null, null, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, null, null, z10, i10, i11, 0, null, null, false, false);
        c10.Y = richMessage;
        c10.Z = arrayList4;
        c10.J = knVar;
        c10.K = swVar;
        c10.O = j11;
        c10.R = j12;
        c10.Q = j13;
        C(cVar.f14863a).r0(c10);
    }

    public static void S(final int i10, final long j10, final long j11, final long j12, final HashMap hashMap, final c cVar, final jj jjVar, final jj jjVar2, final sw swVar, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final org.telegram.ui.ActionBar.k2 k2Var, final org.telegram.ui.kn knVar, final boolean z10) {
        oz d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    String h;
                    String str;
                    boolean z11;
                    char c10;
                    long j13;
                    char c11;
                    final String str2;
                    TLRPC.TL_document tL_document;
                    TLRPC.TL_photo tL_photo;
                    int i11;
                    Bitmap K2;
                    String str3;
                    int lastIndexOf;
                    int i12;
                    String str4;
                    TLRPC.BotInlineResult botInlineResult2;
                    TLRPC.TL_document tL_document2;
                    int i13;
                    TLRPC.InputPeer inputPeer;
                    long j14;
                    TLRPC.InputPeer inputPeer2;
                    boolean z12;
                    TLRPC.WebDocument webDocument;
                    long j15 = j10;
                    boolean C = o5.C(j15);
                    TLRPC.BotInlineResult botInlineResult3 = botInlineResult;
                    boolean equals = "game".equals(botInlineResult3.type);
                    final c cVar2 = cVar;
                    if (equals) {
                        if (!C) {
                            TLRPC.TL_game tL_game = new TLRPC.TL_game();
                            tL_game.title = botInlineResult3.title;
                            tL_game.description = botInlineResult3.description;
                            tL_game.short_name = botInlineResult3.f19791id;
                            TLRPC.Photo photo = botInlineResult3.photo;
                            tL_game.photo = photo;
                            if (photo == null) {
                                tL_game.photo = new TLRPC.TL_photoEmpty();
                            }
                            TLRPC.Document document = botInlineResult3.document;
                            if (document instanceof TLRPC.TL_document) {
                                tL_game.document = document;
                                tL_game.flags |= 1;
                            }
                            str4 = tL_game;
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str2 = null;
                        } else {
                            return;
                        }
                    } else if (botInlineResult3 instanceof TLRPC.TL_botInlineMediaResult) {
                        TLRPC.Document document2 = botInlineResult3.document;
                        if (document2 != null) {
                            if (document2 instanceof TLRPC.TL_document) {
                                tL_document = (TLRPC.TL_document) document2;
                                j13 = j15;
                                z11 = C;
                                tL_photo = null;
                                str4 = null;
                                str2 = str4;
                            }
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str4 = null;
                            str2 = null;
                        } else {
                            TLRPC.Photo photo2 = botInlineResult3.photo;
                            if (photo2 != null && (photo2 instanceof TLRPC.TL_photo)) {
                                tL_photo = (TLRPC.TL_photo) photo2;
                                j13 = j15;
                                z11 = C;
                                tL_document = null;
                                str4 = null;
                                str2 = str4;
                            }
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str4 = null;
                            str2 = null;
                        }
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult3.content;
                        if (webDocument2 != null) {
                            String B = hc.B(webDocument2.url, null);
                            if (TextUtils.isEmpty(B)) {
                                h = b8.C(botInlineResult3.content.mime_type);
                            } else {
                                h = sc.e.h(".", B);
                            }
                            File file = new File(b8.z(4), Utilities.a(botInlineResult3.content.url) + h);
                            if (file.exists()) {
                                str = file.getAbsolutePath();
                            } else {
                                str = botInlineResult3.content.url;
                            }
                            String str5 = str;
                            String str6 = botInlineResult3.type;
                            str6.getClass();
                            switch (str6.hashCode()) {
                                case -1890252483:
                                    z11 = C;
                                    if (str6.equals("sticker")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 102340:
                                    z11 = C;
                                    if (str6.equals("gif")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3143036:
                                    z11 = C;
                                    if (str6.equals("file")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 93166550:
                                    z11 = C;
                                    if (str6.equals("audio")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 106642994:
                                    z11 = C;
                                    if (str6.equals("photo")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 112202875:
                                    if (str6.equals("video")) {
                                        z11 = C;
                                        c10 = 5;
                                        break;
                                    }
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                                case 112386354:
                                    if (str6.equals("voice")) {
                                        c10 = 6;
                                        z11 = C;
                                        break;
                                    }
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                                default:
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                    TLRPC.TL_document tL_document3 = new TLRPC.TL_document();
                                    j13 = j15;
                                    tL_document3.f19799id = 0L;
                                    tL_document3.size = 0L;
                                    tL_document3.dc_id = 0;
                                    tL_document3.mime_type = botInlineResult3.content.mime_type;
                                    tL_document3.file_reference = new byte[0];
                                    tL_document3.date = ConnectionsManager.getInstance(cVar2.f14863a).getCurrentTime();
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_document3.attributes.add(tL_documentAttributeFilename);
                                    String str7 = botInlineResult3.type;
                                    str7.getClass();
                                    switch (str7.hashCode()) {
                                        case -1890252483:
                                            if (str7.equals("sticker")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 102340:
                                            if (str7.equals("gif")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3143036:
                                            if (str7.equals("file")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 93166550:
                                            if (str7.equals("audio")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112202875:
                                            if (str7.equals("video")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112386354:
                                            if (str7.equals("voice")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    int i14 = 55;
                                    switch (c11) {
                                        case 0:
                                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                            tL_documentAttributeSticker.alt = "";
                                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                            tL_document3.attributes.add(tL_documentAttributeSticker);
                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                            int[] h12 = jj.h1(botInlineResult3);
                                            tL_documentAttributeImageSize.f19800w = h12[0];
                                            tL_documentAttributeImageSize.h = h12[1];
                                            tL_document3.attributes.add(tL_documentAttributeImageSize);
                                            tL_documentAttributeFilename.file_name = "sticker.webp";
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K3 = hc.K(new File(b8.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + hc.B(botInlineResult3.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K3 != null) {
                                                        TLRPC.PhotoSize Z = hc.Z(K3, 90.0f, 90.0f, 55, false);
                                                        if (Z != null) {
                                                            tL_document3.thumbs.add(Z);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K3.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                f8.g(th2, true);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            tL_documentAttributeFilename.file_name = "animation.gif";
                                            if (str5.endsWith("mp4")) {
                                                tL_document3.mime_type = "video/mp4";
                                                tL_document3.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                            } else {
                                                tL_document3.mime_type = "image/gif";
                                            }
                                            if (z11) {
                                                i11 = 90;
                                            } else {
                                                i11 = 320;
                                            }
                                            try {
                                                if (str5.endsWith("mp4")) {
                                                    K2 = qz.r(1, str5);
                                                    if (K2 == null) {
                                                        TLRPC.WebDocument webDocument3 = botInlineResult3.thumb;
                                                        if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                            String B2 = hc.B(botInlineResult3.thumb.url, null);
                                                            if (TextUtils.isEmpty(B2)) {
                                                                str3 = b8.C(botInlineResult3.thumb.mime_type);
                                                            } else {
                                                                str3 = "." + B2;
                                                            }
                                                            K2 = qz.r(1, new File(b8.z(4), Utilities.a(botInlineResult3.thumb.url) + str3).getAbsolutePath());
                                                        }
                                                    }
                                                } else {
                                                    float f7 = i11;
                                                    K2 = hc.K(str5, null, f7, f7, true);
                                                }
                                                if (K2 != null) {
                                                    float f10 = i11;
                                                    if (i11 > 90) {
                                                        i14 = 80;
                                                    }
                                                    TLRPC.PhotoSize Z2 = hc.Z(K2, f10, f10, i14, false);
                                                    if (Z2 != null) {
                                                        tL_document3.thumbs.add(Z2);
                                                        tL_document3.flags |= 1;
                                                    }
                                                    K2.recycle();
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                f8.g(th3, true);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (botInlineResult3.content.mime_type.lastIndexOf(47) != -1) {
                                                tL_documentAttributeFilename.file_name = "file." + botInlineResult3.content.mime_type.substring(lastIndexOf + 1);
                                                break;
                                            } else {
                                                tL_documentAttributeFilename.file_name = "file";
                                                break;
                                            }
                                        case 3:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio.duration = jj.g1(botInlineResult3);
                                            tL_documentAttributeAudio.title = botInlineResult3.title;
                                            int i15 = tL_documentAttributeAudio.flags;
                                            tL_documentAttributeAudio.flags = i15 | 1;
                                            String str8 = botInlineResult3.description;
                                            if (str8 != null) {
                                                tL_documentAttributeAudio.performer = str8;
                                                tL_documentAttributeAudio.flags = i15 | 3;
                                            }
                                            tL_documentAttributeFilename.file_name = "audio.mp3";
                                            tL_document3.attributes.add(tL_documentAttributeAudio);
                                            break;
                                        case 4:
                                            tL_documentAttributeFilename.file_name = "video.mp4";
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            int[] h13 = jj.h1(botInlineResult3);
                                            tL_documentAttributeVideo.f19800w = h13[0];
                                            tL_documentAttributeVideo.h = h13[1];
                                            tL_documentAttributeVideo.duration = jj.g1(botInlineResult3);
                                            tL_documentAttributeVideo.supports_streaming = true;
                                            tL_document3.attributes.add(tL_documentAttributeVideo);
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K4 = hc.K(new File(b8.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + hc.B(botInlineResult3.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K4 != null) {
                                                        TLRPC.PhotoSize Z3 = hc.Z(K4, 90.0f, 90.0f, 55, false);
                                                        if (Z3 != null) {
                                                            tL_document3.thumbs.add(Z3);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K4.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                f8.g(th4, true);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio2.duration = jj.g1(botInlineResult3);
                                            tL_documentAttributeAudio2.voice = true;
                                            tL_documentAttributeFilename.file_name = "audio.ogg";
                                            tL_document3.attributes.add(tL_documentAttributeAudio2);
                                            break;
                                    }
                                    if (tL_documentAttributeFilename.file_name == null) {
                                        tL_documentAttributeFilename.file_name = "file";
                                    }
                                    if (tL_document3.mime_type == null) {
                                        tL_document3.mime_type = "application/octet-stream";
                                    }
                                    if (tL_document3.thumbs.isEmpty()) {
                                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                        int[] h14 = jj.h1(botInlineResult3);
                                        tL_photoSize.f19818w = h14[0];
                                        tL_photoSize.h = h14[1];
                                        tL_photoSize.size = 0;
                                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize.type = "x";
                                        tL_document3.thumbs.add(tL_photoSize);
                                        tL_document3.flags |= 1;
                                    }
                                    str2 = str5;
                                    tL_document = tL_document3;
                                    tL_photo = null;
                                    break;
                                case 4:
                                    if (file.exists()) {
                                        i12 = 0;
                                        tL_photo = qz.C(cVar2.f14863a).A(str5, null, false);
                                    } else {
                                        i12 = 0;
                                        tL_photo = null;
                                    }
                                    if (tL_photo == null) {
                                        tL_photo = new TLRPC.TL_photo();
                                        tL_photo.date = ConnectionsManager.getInstance(cVar2.f14863a).getCurrentTime();
                                        tL_photo.file_reference = new byte[i12];
                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                        int[] h15 = jj.h1(botInlineResult3);
                                        tL_photoSize2.f19818w = h15[i12];
                                        tL_photoSize2.h = h15[1];
                                        tL_photoSize2.size = 1;
                                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize2.type = "x";
                                        tL_photo.sizes.add(tL_photoSize2);
                                    }
                                    str2 = str5;
                                    j13 = j15;
                                    tL_document = null;
                                    break;
                                default:
                                    str2 = str5;
                                    j13 = j15;
                                    tL_photo = null;
                                    tL_document = null;
                                    break;
                            }
                            str4 = null;
                        }
                        j13 = j15;
                        z11 = C;
                        tL_photo = null;
                        tL_document = null;
                        str4 = null;
                        str2 = null;
                    }
                    final HashMap hashMap2 = hashMap;
                    if (hashMap2 != null && (webDocument = botInlineResult3.content) != null) {
                        hashMap2.put("originalPath", webDocument.url);
                    }
                    final TLRPC.TL_game tL_game2 = str4;
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final String[] strArr = new String[1];
                    if (z11 && tL_document != null) {
                        for (int i16 = 0; i16 < tL_document.attributes.size(); i16++) {
                            if (tL_document.attributes.get(i16) instanceof TLRPC.TL_documentAttributeVideo) {
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = (TLRPC.TL_documentAttributeVideo) tL_document.attributes.get(i16);
                                TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                                tL_documentAttributeVideo_layer159.flags = tL_documentAttributeVideo2.flags;
                                tL_documentAttributeVideo_layer159.round_message = tL_documentAttributeVideo2.round_message;
                                tL_documentAttributeVideo_layer159.supports_streaming = tL_documentAttributeVideo2.supports_streaming;
                                tL_documentAttributeVideo_layer159.duration = tL_documentAttributeVideo2.duration;
                                tL_documentAttributeVideo_layer159.f19800w = tL_documentAttributeVideo2.f19800w;
                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo2.h;
                                tL_document.attributes.set(i16, tL_documentAttributeVideo_layer159);
                            }
                        }
                    }
                    if (jj.s3(tL_document, false)) {
                        TLRPC.PhotoSize w9 = b8.w(tL_document.thumbs, 320, false, null, false);
                        b8.G(cVar2.f14863a);
                        File I2 = b8.I(tL_document);
                        if (!I2.exists()) {
                            b8.G(cVar2.f14863a);
                            z12 = true;
                            I2 = b8.K(tL_document, null, true, true);
                        } else {
                            z12 = true;
                        }
                        inputPeer = null;
                        tL_document2 = tL_document;
                        botInlineResult2 = botInlineResult3;
                        boolean z13 = z12;
                        qz.w(cVar2, z11, tL_document2, I2.getAbsolutePath(), null, 0L, false);
                        strArr[0] = qz.D(cVar2, w9, bitmapArr, z13, z13);
                        i13 = z13;
                    } else {
                        botInlineResult2 = botInlineResult3;
                        tL_document2 = tL_document;
                        i13 = 1;
                        inputPeer = null;
                    }
                    if (!o5.C(j13)) {
                        j14 = j13;
                        inputPeer2 = vp.r1(cVar2.f14863a).i1(j14);
                    } else {
                        j14 = j13;
                        inputPeer2 = inputPeer;
                    }
                    if (inputPeer2 != null && inputPeer2.user_id != 0 && vp.r1(cVar2.f14863a).a2(inputPeer2.user_id) != null && vp.r1(cVar2.f14863a).a2(inputPeer2.user_id).voice_messages_forbidden && tL_document2 != null) {
                        boolean Q4 = jj.Q4(tL_document2);
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        if (Q4) {
                            i0.g3(new xn(i13, k2Var2));
                            return;
                        } else if (jj.i4(tL_document2)) {
                            i0.g3(new xn(2, k2Var2));
                            return;
                        }
                    }
                    final jj jjVar3 = jjVar;
                    final jj jjVar4 = jjVar2;
                    final long j16 = j14;
                    final boolean z14 = z10;
                    final int i17 = i10;
                    final sw swVar2 = swVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.kn knVar2 = knVar;
                    final long j17 = j11;
                    final long j18 = j12;
                    final TLRPC.TL_document tL_document4 = tL_document2;
                    final TLRPC.BotInlineResult botInlineResult4 = botInlineResult2;
                    final TLRPC.TL_photo tL_photo2 = tL_photo;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            oz ozVar;
                            TLRPC.TL_document tL_document5 = TLRPC.TL_document.this;
                            long j19 = j16;
                            jj jjVar5 = jjVar3;
                            jj jjVar6 = jjVar4;
                            TLRPC.BotInlineResult botInlineResult5 = botInlineResult4;
                            HashMap hashMap3 = hashMap2;
                            boolean z15 = z14;
                            int i18 = i17;
                            if (tL_document5 != null) {
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        hc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult5.send_message;
                                ozVar = oz.f(tL_document5, null, str2, j19, jjVar5, jjVar6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z15, i18, 0, 0, botInlineResult5, null, false);
                            } else {
                                TLRPC.TL_photo tL_photo3 = tL_photo2;
                                String str9 = null;
                                if (tL_photo3 != null) {
                                    TLRPC.WebDocument webDocument4 = botInlineResult5.content;
                                    if (webDocument4 != null) {
                                        str9 = webDocument4.url;
                                    }
                                    String str10 = str9;
                                    TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult5.send_message;
                                    ozVar = oz.c(null, botInlineMessage3.message, null, tL_photo3, null, null, null, null, null, null, j19, str10, jjVar5, jjVar6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z15, i18, 0, 0, botInlineResult5, null, false, false);
                                } else {
                                    TLRPC.TL_game tL_game3 = tL_game2;
                                    if (tL_game3 != null) {
                                        ozVar = oz.c(null, null, null, null, null, null, null, tL_game3, null, null, j19, null, jjVar5, jjVar6, null, true, null, null, botInlineResult5.send_message.reply_markup, hashMap3, z15, i18, 0, 0, null, null, false, false);
                                    } else {
                                        ozVar = null;
                                    }
                                }
                            }
                            if (ozVar != null) {
                                ozVar.K = swVar2;
                                ozVar.H = storyItem2;
                                ozVar.J = knVar2;
                                ozVar.Q = j17;
                                ozVar.R = j18;
                                qz.C(cVar2.f14863a).r0(ozVar);
                            }
                        }
                    });
                }
            }).run();
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (o5.C(j10)) {
                for (int i11 = 0; i11 < botInlineResult.send_message.entities.size(); i11++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i11);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str = botInlineResult.send_message.message;
                        int i12 = messageEntity.offset;
                        tL_webPagePending.url = str.substring(i12, messageEntity.length + i12);
                        break;
                    }
                }
            }
            tL_webPagePending = null;
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            oz b10 = oz.b(botInlineMessage2.message, j10, jjVar, jjVar2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i10, 0, null, false);
            b10.K = swVar;
            b10.J = knVar;
            b10.Q = j11;
            b10.R = j12;
            C(cVar.f14863a).r0(b10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
            TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
            oz c10 = oz.c(null, null, null, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z10, i10, 0, 0, null, null, false, false);
            c10.Y = richMessage;
            c10.K = swVar;
            c10.J = knVar;
            c10.Q = j11;
            c10.R = j12;
            C(cVar.f14863a).r0(c10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageWidget) {
            TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineMessage;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            oz d10 = oz.d(tL_messageMediaWidget, j10, jjVar, jjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i10);
            d10.f17367b = tL_botInlineMessageWidget.message;
            d10.f17384w = tL_botInlineMessageWidget.entities;
            d10.L = tL_botInlineMessageWidget.invert_media;
            d10.K = swVar;
            d10.J = knVar;
            d10.Q = j11;
            d10.R = j12;
            C(cVar.f14863a).r0(d10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
            tL_messageMediaVenue.geo = botInlineMessage3.geo;
            tL_messageMediaVenue.address = botInlineMessage3.address;
            tL_messageMediaVenue.title = botInlineMessage3.title;
            tL_messageMediaVenue.provider = botInlineMessage3.provider;
            String str2 = botInlineMessage3.venue_type;
            tL_messageMediaVenue.venue_id = str2;
            tL_messageMediaVenue.venue_type = str2;
            if (str2 == null) {
                tL_messageMediaVenue.venue_type = "";
            }
            oz d11 = oz.d(tL_messageMediaVenue, j10, jjVar, jjVar2, botInlineMessage3.reply_markup, hashMap, z10, i10);
            d11.K = swVar;
            d11.J = knVar;
            d11.Q = j11;
            d11.R = j12;
            C(cVar.f14863a).r0(d11);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage4.geo;
                tL_messageMediaGeo.heading = botInlineMessage4.heading;
                d = oz.d(tL_messageMediaGeo, j10, jjVar, jjVar2, botInlineMessage4.reply_markup, hashMap, z10, i10);
            } else {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                int i13 = botInlineMessage5.period;
                if (i13 == 0) {
                    i13 = 900;
                }
                tL_messageMediaGeoLive.period = i13;
                tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                d = oz.d(tL_messageMediaGeoLive, j10, jjVar, jjVar2, botInlineMessage5.reply_markup, hashMap, z10, i10);
            }
            d.K = swVar;
            d.J = knVar;
            d.Q = j11;
            d.R = j12;
            C(cVar.f14863a).r0(d);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.BotInlineMessage botInlineMessage6 = botInlineResult.send_message;
            tL_user.phone = botInlineMessage6.phone_number;
            tL_user.first_name = botInlineMessage6.first_name;
            tL_user.last_name = botInlineMessage6.last_name;
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = botInlineResult.send_message.vcard;
            restrictionReason.platform = "";
            restrictionReason.reason = "";
            tL_user.restriction_reason.add(restrictionReason);
            oz g10 = oz.g(tL_user, j10, jjVar, jjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i10, 0);
            g10.K = swVar;
            g10.J = knVar;
            g10.Q = j11;
            g10.R = j12;
            C(cVar.f14863a).r0(g10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
            if (o5.C(j10)) {
                return;
            }
            TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineResult.send_message;
            TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
            tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
            tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
            tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
            tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
            TLRPC.WebDocument webDocument = tL_botInlineMessageMediaInvoice.photo;
            if (webDocument != null) {
                tL_messageMediaInvoice.webPhoto = webDocument;
                tL_messageMediaInvoice.flags |= 1;
            }
            tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
            tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
            tL_messageMediaInvoice.start_param = "";
            oz c11 = oz.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j10, null, jjVar, jjVar2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z10, i10, 0, 0, null, null, false, false);
            c11.K = swVar;
            c11.J = knVar;
            c11.Q = j11;
            c11.R = j12;
            C(cVar.f14863a).r0(c11);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
            tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
            TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
            oz b11 = oz.b(botInlineMessage7.message, j10, jjVar, jjVar2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z10, i10, 0, null, false);
            b11.K = swVar;
            b11.J = knVar;
            b11.Q = j11;
            b11.R = j12;
            b11.L = botInlineResult.send_message.invert_media;
            C(cVar.f14863a).r0(b11);
        }
    }

    public static void T(c cVar, String str, String str2, Uri uri, String str3, String str4, long j10, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.kn knVar, boolean z10, m2.t tVar, sw swVar) {
        ArrayList arrayList;
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (str != null) {
            arrayList2.add(str);
            arrayList3.add(str2);
        }
        V(0, j10, 0L, 0L, 0L, null, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, tVar, cVar, jjVar, jjVar2, null, null, swVar, storyItem, knVar, z10, false);
    }

    public static int U(org.telegram.messenger.c r42, java.lang.String r43, java.lang.String r44, android.net.Uri r45, java.lang.String r46, final long r47, final org.telegram.messenger.jj r49, final org.telegram.messenger.jj r50, final org.telegram.tgnet.tl.TL_stories.StoryItem r51, final org.telegram.ui.kn r52, final java.util.ArrayList r53, final org.telegram.messenger.jj r54, long[] r55, boolean r56, java.lang.CharSequence r57, final boolean r58, int r59, final int r60, java.lang.Integer[] r61, boolean r62, final org.telegram.messenger.sw r63, final long r64, final boolean r66, final long r67, final long r69, final org.telegram.messenger.oj r71, final ih.i r72, final int r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.U(org.telegram.messenger.c, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, org.telegram.messenger.jj, org.telegram.messenger.jj, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.kn, java.util.ArrayList, org.telegram.messenger.jj, long[], boolean, java.lang.CharSequence, boolean, int, int, java.lang.Integer[], boolean, org.telegram.messenger.sw, long, boolean, long, long, org.telegram.messenger.oj, ih.i, int):int");
    }

    public static void V(final int i10, final long j10, final long j11, final long j12, final long j13, final ih.i iVar, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final m2.t tVar, final c cVar, final jj jjVar, final jj jjVar2, final jj jjVar3, final oj ojVar, final sw swVar, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final boolean z10, final boolean z11) {
        if (arrayList != null || arrayList2 != null || arrayList3 != null) {
            if (arrayList != null && arrayList2 != null && arrayList.size() != arrayList2.size()) {
                return;
            }
            Utilities.e.c(new Runnable() {
                @Override
                public final void run() {
                    int i11;
                    boolean z12;
                    String str3;
                    ArrayList arrayList7;
                    String str4;
                    long j14;
                    boolean z13;
                    boolean z14;
                    int i12;
                    c cVar2;
                    Uri uri;
                    long j15;
                    int i13;
                    String str5;
                    oj ojVar2;
                    long j16;
                    int i14;
                    ArrayList arrayList8;
                    boolean z15;
                    ArrayList arrayList9;
                    boolean z16;
                    int i15;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j17 = j10;
                    boolean C = o5.C(j17);
                    ArrayList arrayList10 = arrayList;
                    String str6 = str;
                    ih.i iVar2 = iVar;
                    c cVar3 = cVar;
                    int i16 = i10;
                    String str7 = str2;
                    jj jjVar4 = jjVar;
                    jj jjVar5 = jjVar2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str8 = str7;
                    org.telegram.ui.kn knVar2 = knVar;
                    ArrayList arrayList11 = arrayList4;
                    jj jjVar6 = jjVar3;
                    boolean z17 = z10;
                    m2.t tVar2 = tVar;
                    sw swVar2 = swVar;
                    m2.t tVar3 = tVar2;
                    int i17 = i16;
                    long j18 = j11;
                    boolean z18 = z11;
                    String str9 = str6;
                    long j19 = j18;
                    long j20 = j12;
                    long j21 = j13;
                    oj ojVar3 = ojVar;
                    if (arrayList10 != null) {
                        int size = arrayList10.size();
                        int i18 = 0;
                        i11 = 0;
                        int i19 = 0;
                        z12 = true;
                        while (i18 < size) {
                            m2.t tVar4 = tVar3;
                            if (i18 == 0) {
                                str5 = str9;
                            } else {
                                str5 = null;
                            }
                            boolean z19 = z18;
                            if (!C && size > 1 && i19 % 10 == 0 && iVar2 == null) {
                                ojVar2 = ojVar3;
                                j16 = j17;
                                long j22 = jArr[0];
                                if (j22 != 0) {
                                    i14 = i17;
                                    qz.z(cVar3, j22, i14);
                                } else {
                                    i14 = i17;
                                }
                                jArr[0] = Utilities.f14519b.nextLong();
                                i19 = 0;
                            } else {
                                ojVar2 = ojVar3;
                                j16 = j17;
                                i14 = i17;
                            }
                            int i20 = i19 + 1;
                            long j23 = jArr[0];
                            if ((iVar2 == null && i20 == 10) || i18 == size - 1) {
                                arrayList8 = arrayList11;
                                z15 = true;
                            } else {
                                arrayList8 = arrayList11;
                                z15 = false;
                            }
                            String str10 = (String) arrayList10.get(i18);
                            oj ojVar4 = ojVar2;
                            String str11 = (String) arrayList2.get(i18);
                            int i21 = i20;
                            String str12 = str8;
                            if (i18 == 0) {
                                arrayList9 = arrayList8;
                            } else {
                                arrayList9 = null;
                            }
                            String str13 = str9;
                            if (tVar4 == null) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            long j24 = j19;
                            if (!z12) {
                                j19 = 0;
                            }
                            ArrayList arrayList12 = arrayList5;
                            if (arrayList12 != null) {
                                i15 = ((Integer) arrayList12.get(i18)).intValue();
                            } else {
                                i15 = -1;
                            }
                            int i22 = i18;
                            int i23 = size;
                            long j25 = j16;
                            ArrayList arrayList13 = arrayList10;
                            ArrayList arrayList14 = arrayList8;
                            int i24 = i14;
                            j17 = j25;
                            i11 = qz.U(cVar3, str10, str11, null, str12, j17, jjVar4, jjVar5, storyItem2, knVar2, arrayList9, jjVar6, jArr, z15, str5, z17, i24, 0, numArr, z16, swVar2, j19, z19, j20, j21, ojVar4, iVar2, i15);
                            c cVar4 = cVar3;
                            long j26 = jArr[0];
                            i21 = (j23 != j26 || j26 == -1) ? 1 : 1;
                            if (i11 != 0 && z15 && iVar2 == null && j26 != 0) {
                                qz.z(cVar4, j26, i24);
                                jArr[0] = 0;
                                i21 = 0;
                            }
                            int i25 = i22 + 1;
                            i17 = i24;
                            cVar3 = cVar4;
                            str8 = str12;
                            ojVar3 = ojVar4;
                            z12 = false;
                            arrayList10 = arrayList13;
                            arrayList11 = arrayList14;
                            str9 = str13;
                            j19 = j24;
                            tVar3 = tVar4;
                            i18 = i25;
                            z18 = z19;
                            size = i23;
                            i19 = i21;
                        }
                    } else {
                        i11 = 0;
                        z12 = true;
                    }
                    boolean z20 = z18;
                    c cVar5 = cVar3;
                    ArrayList arrayList15 = arrayList10;
                    oj ojVar5 = ojVar3;
                    String str14 = str8;
                    ArrayList arrayList16 = arrayList11;
                    m2.t tVar5 = tVar3;
                    int i26 = i17;
                    String str15 = str9;
                    long j27 = j19;
                    ArrayList arrayList17 = arrayList3;
                    if (arrayList17 != null) {
                        jArr[0] = 0;
                        int size2 = arrayList17.size();
                        boolean z21 = z20;
                        int i27 = 0;
                        int i28 = 0;
                        while (i27 < arrayList17.size()) {
                            if (i27 == 0 && (arrayList15 == null || arrayList15.size() == 0)) {
                                str3 = str15;
                            } else {
                                str3 = null;
                            }
                            if (i27 == 0 && (arrayList15 == null || arrayList15.size() == 0)) {
                                arrayList7 = arrayList16;
                            } else {
                                arrayList7 = null;
                            }
                            ArrayList arrayList18 = arrayList7;
                            if (!C && size2 > 1 && i28 % 10 == 0 && iVar2 == null) {
                                str4 = str14;
                                j14 = j17;
                                long j28 = jArr[0];
                                if (j28 != 0) {
                                    qz.z(cVar5, j28, i26);
                                }
                                jArr[0] = Utilities.f14519b.nextLong();
                                i28 = 0;
                            } else {
                                str4 = str14;
                                j14 = j17;
                            }
                            int i29 = i28 + 1;
                            long j29 = jArr[0];
                            if ((iVar2 == null && i29 == 10) || i27 == size2 - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Uri uri2 = (Uri) arrayList17.get(i27);
                            if (tVar5 == null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z12) {
                                i12 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j17 = j14;
                                j15 = j27;
                            } else {
                                i12 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j17 = j14;
                                j15 = 0;
                            }
                            ArrayList arrayList19 = arrayList17;
                            ArrayList arrayList20 = arrayList6;
                            if (arrayList20 != null) {
                                i13 = ((Integer) arrayList20.get(i27)).intValue();
                            } else {
                                i13 = -1;
                            }
                            int i30 = i27;
                            int i31 = i26;
                            int i32 = i29;
                            str14 = str4;
                            boolean z22 = z21;
                            int i33 = i12;
                            i11 = qz.U(cVar2, null, null, uri, str14, j17, jjVar4, jjVar5, storyItem2, knVar2, arrayList18, jjVar6, jArr, z13, str3, z17, i31, 0, numArr, z14, swVar2, j15, z22, j20, j21, ojVar5, iVar2, i13);
                            i26 = i31;
                            long j30 = jArr[0];
                            if (j29 != j30 || j30 == -1) {
                                i32 = 1;
                            }
                            if (i11 != 0 && z13 && iVar2 == null && j30 != 0) {
                                qz.z(cVar2, j30, i26);
                                jArr[0] = 0;
                                i28 = 0;
                            } else {
                                i28 = i32;
                            }
                            i27 = i30 + 1;
                            cVar5 = cVar2;
                            z21 = z22;
                            z12 = false;
                            size2 = i33;
                            arrayList17 = arrayList19;
                        }
                    }
                    c cVar6 = cVar5;
                    int i34 = i11;
                    if (tVar5 != null) {
                        ((t0.h) tVar5.f12684b).g();
                    }
                    if (i34 != 0) {
                        i0.g3(new a1(i34, cVar6, 12));
                    }
                }
            });
        }
    }

    public static void W(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j10, jj jjVar, jj jjVar2, boolean z10, int i10) {
        c cVar2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        String str2 = null;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            cVar2 = cVar;
            ArrayList W = ui.b0(cVar2.f14863a).W(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = W;
        } else {
            cVar2 = cVar;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        V(i10, j10, 0L, 0L, 0L, null, str2, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, null, cVar2, jjVar, jjVar2, null, null, null, null, null, z10, false);
    }

    public static void X(final c cVar, final ArrayList arrayList, final long j10, final jj jjVar, final jj jjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final boolean z10, boolean z11, final jj jjVar3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z12, final int i10, final int i11, final boolean z13, final m2.t tVar, final sw swVar, final long j11, final boolean z14, final long j12, final long j13, final oj ojVar, final ih.i iVar, final boolean z15) {
        final boolean z16;
        final long j14;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        boolean z17 = false;
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (((pz) arrayList.get(i12)).h > 0) {
                    z16 = false;
                    break;
                }
                i12++;
            } else {
                z16 = z11;
                break;
            }
        }
        if (iVar != null) {
            j14 = iVar.f8557c;
        } else {
            j14 = 0;
        }
        if (j14 != 0) {
            z17 = true;
        }
        final boolean z18 = z17;
        I.c(new Runnable() {
            @Override
            public final void run() {
                qz.K(arrayList, j10, z10, z16, z18, cVar, j14, jjVar3, tL_inputPollAnswer, jjVar, jjVar2, z12, i10, i11, storyItem, knVar, swVar, j11, z14, j12, j13, ojVar, iVar, z15, tVar, z13);
            }
        });
    }

    public static void Y(c cVar, Uri uri, long j10, jj jjVar, jj jjVar2, m2.t tVar, jj jjVar3, boolean z10, int i10, sw swVar) {
        Z(cVar, null, null, uri, j10, jjVar, jjVar2, null, null, null, tVar, 0, jjVar3, null, z10, i10, false, null, swVar, 0L, 0L, 0L, null);
    }

    public static void Z(c cVar, String str, String str2, Uri uri, long j10, jj jjVar, jj jjVar2, org.telegram.ui.kn knVar, ArrayList arrayList, ArrayList arrayList2, m2.t tVar, int i10, jj jjVar3, x20 x20Var, boolean z10, int i11, boolean z11, CharSequence charSequence, sw swVar, long j11, long j12, long j13, oj ojVar) {
        ?? obj = new Object();
        obj.f17515c = str;
        obj.e = str2;
        obj.f17513a = uri;
        if (charSequence != null) {
            obj.d = charSequence.toString();
        }
        obj.f17518i = arrayList;
        obj.h = i10;
        if (arrayList2 != null) {
            obj.f17519j = new ArrayList(arrayList2);
        }
        obj.f17520k = x20Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(obj);
        X(cVar, arrayList3, j10, jjVar, jjVar2, null, knVar, z11, false, jjVar3, null, z10, i11, 0, false, tVar, swVar, j11, false, j12, j13, ojVar, null, false);
    }

    public static void a0(c cVar, CharSequence charSequence, long j10, long j11, boolean z10, int i10, int i11) {
        hs.a0(cVar.f14863a).f15938a.c(new yw(charSequence, cVar, j11, j10, z10, i10, i11, 1));
    }

    public static void b0(final int i10, final int i11, final int i12, final long j10, final long j11, final long j12, final long j13, final CharSequence charSequence, final String str, final String str2, final ArrayList arrayList, final c cVar, final jj jjVar, final jj jjVar2, final jj jjVar3, final oj ojVar, final sw swVar, final x20 x20Var, final TLRPC.Photo photo, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final boolean z10, final boolean z11, final boolean z12) {
        if (str != null && str.length() != 0) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.run():void");
                }
            }).start();
        }
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.o5.class)) {
                if (o5Var.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void i(TL_iv.RichText richText) {
        if (richText != null) {
            richText.parentRichText = null;
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                i(richText2);
            }
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i10);
                    i10++;
                    i(richText3);
                }
            }
        }
    }

    public static void j(TL_iv.PageBlock pageBlock, IdentityHashMap identityHashMap) {
        Field[] fields;
        Field[] fields2;
        if (pageBlock != null && identityHashMap.put(pageBlock, Boolean.TRUE) == null) {
            for (Field field : pageBlock.getClass().getFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(pageBlock);
                        if (obj instanceof TL_iv.RichText) {
                            i((TL_iv.RichText) obj);
                        } else if (obj instanceof TL_iv.PageBlock) {
                            j((TL_iv.PageBlock) obj, identityHashMap);
                        } else if (obj instanceof TL_iv.PageCaption) {
                            i(((TL_iv.PageCaption) obj).text);
                            i(((TL_iv.PageCaption) obj).credit);
                        } else if (obj instanceof List) {
                            for (Object obj2 : (List) obj) {
                                if (obj2 instanceof TL_iv.PageBlock) {
                                    j((TL_iv.PageBlock) obj2, identityHashMap);
                                } else if (obj2 instanceof TL_iv.RichText) {
                                    i((TL_iv.RichText) obj2);
                                } else if ((obj2 instanceof TL_iv.PageListItem) || (obj2 instanceof TL_iv.PageListOrderedItem)) {
                                    for (Field field2 : obj2.getClass().getFields()) {
                                        if (!Modifier.isStatic(field2.getModifiers())) {
                                            try {
                                                Object obj3 = field2.get(obj2);
                                                if (obj3 instanceof TL_iv.RichText) {
                                                    i((TL_iv.RichText) obj3);
                                                } else if (obj3 instanceof List) {
                                                    for (Object obj4 : (List) obj3) {
                                                        if (obj4 instanceof TL_iv.PageBlock) {
                                                            j((TL_iv.PageBlock) obj4, identityHashMap);
                                                        }
                                                    }
                                                }
                                            } catch (IllegalAccessException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException unused2) {
                    }
                }
            }
        }
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f19800w = documentAttribute.f19800w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    public static void m(long j10, long j11, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            channel.position(j10);
            ByteBuffer allocate = ByteBuffer.allocate(262144);
            while (j11 > 0) {
                allocate.clear();
                allocate.limit((int) Math.min(allocate.capacity(), j11));
                int read = channel.read(allocate);
                if (read <= 0) {
                    break;
                }
                allocate.flip();
                channel2.write(allocate);
                j11 -= read;
            }
            channel2.force(true);
            channel2.close();
            channel.close();
        } catch (Throwable th2) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static TL_iv.TL_inputRichMessage m0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage != null) {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                tL_inputRichMessage.blocks.add(y0(richMessage.blocks.get(i10)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.Photo photo = arrayList3.get(i11);
                    i11++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f19812id = photo2.f19817id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                }
            }
            ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                int size2 = arrayList5.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.Document document = arrayList5.get(i12);
                    i12++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f19805id = document2.f19799id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 16;
                tL_inputRichMessage.users.addAll(arrayList);
            }
        }
        return tL_inputRichMessage;
    }

    public static x20 n(long j10, String str) {
        int i10;
        int i11;
        float f7;
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j10);
        if (iArr[0] == 0) {
            if (v2.f18448a) {
                f8.b("video hasn't avc1 atom");
                return null;
            }
            return null;
        }
        long length = new File(str).length();
        int E = MediaController.E(str);
        if (E == -1) {
            E = iArr[3];
        }
        float f10 = iArr[4];
        long j11 = iArr[5];
        int i12 = iArr[7];
        x20 x20Var = new x20();
        x20Var.f19183a = -1L;
        x20Var.f19185b = -1L;
        x20Var.f19194m = E;
        x20Var.f19196o = str;
        x20Var.f19197p = j10;
        x20Var.f19195n = i12;
        x20Var.f19199r = (long) Math.ceil(f10);
        boolean z10 = true;
        int i13 = iArr[1];
        x20Var.h = i13;
        x20Var.f19192k = i13;
        int i14 = iArr[2];
        x20Var.f19190i = i14;
        x20Var.f19193l = i14;
        x20Var.f19189g = iArr[8];
        x20Var.v = f10 * 1000.0f;
        float max = Math.max(i13, i14);
        float f11 = 1280.0f;
        if (max > 1280.0f) {
            i10 = 4;
        } else if (max > 854.0f) {
            i10 = 3;
        } else if (max > 640.0f) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        b6 q6 = b6.q(d20.f15147s0);
        int e = w0.e();
        if (e == 1) {
            i11 = q6.p().h;
        } else if (e == 2) {
            i11 = q6.o().h;
        } else {
            i11 = q6.n().h;
        }
        int round = Math.round(i11 / (100.0f / i10));
        if (round > i10) {
            round = i10;
        }
        if (new File(str).length() < 1048576000) {
            if (round == i10 && Math.max(x20Var.h, x20Var.f19190i) <= 1280) {
                z10 = false;
            } else {
                if (round != 1) {
                    if (round != 2) {
                        if (round == 3) {
                            f11 = 848.0f;
                        }
                    } else {
                        f11 = 640.0f;
                    }
                } else {
                    f11 = 432.0f;
                }
                int i15 = x20Var.h;
                int i16 = x20Var.f19190i;
                if (i15 > i16) {
                    f7 = i15;
                } else {
                    f7 = i16;
                }
                float f12 = f11 / f7;
                x20Var.f19192k = Math.round((i15 * f12) / 2.0f) * 2;
                x20Var.f19193l = Math.round((x20Var.f19190i * f12) / 2.0f) * 2;
            }
            E = MediaController.Q(x20Var.f19190i, x20Var.h, E, x20Var.f19193l, x20Var.f19192k);
        } else {
            z10 = false;
        }
        if (!z10) {
            x20Var.f19192k = x20Var.h;
            x20Var.f19193l = x20Var.f19190i;
            x20Var.f19194m = E;
            x20Var.f19198q = length;
        } else {
            x20Var.f19194m = E;
            x20Var.f19198q = a1.g.A(f10 / 1000.0f, MediaController.v(x20Var.f19192k, x20Var.f19193l, E, false), 8.0f, (float) j11);
        }
        if (x20Var.f19198q == 0) {
            x20Var.f19198q = 1L;
        }
        return x20Var;
    }

    public static Bitmap r(int i10, String str) {
        float f7;
        if (i10 == 2) {
            f7 = 1920.0f;
        } else if (i10 == 3) {
            f7 = 96.0f;
        } else {
            f7 = 512.0f;
        }
        Bitmap s10 = s(str, 0L, null, false);
        if (s10 != null) {
            int width = s10.getWidth();
            int height = s10.getHeight();
            float f10 = width;
            if (f10 > f7 || height > f7) {
                float max = Math.max(width, height) / f7;
                return Bitmap.createScaledBitmap(s10, (int) (f10 / max), (int) (height / max), true);
            }
        }
        return s10;
    }

    public static Bitmap s(String str, long j10, int[] iArr, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q6 = s5Var.q(j10, z10);
            if (iArr != null) {
                iArr[0] = s5Var.d[2];
            }
            s5Var.u();
            if (q6 == null) {
                return s(str, j10, iArr, false);
            }
            return q6;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j10, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j10, 3);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused3) {
            return bitmap;
        }
    }

    public static void w(c cVar, boolean z10, TLObject tLObject, String str, Uri uri, long j10, boolean z11) {
        int i10;
        boolean z12;
        TLRPC.PhotoSize b02;
        TLRPC.PhotoSize b03;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w9 = b8.w(tL_photo.sizes, 90, false, null, false);
            if (!(w9 instanceof TLRPC.TL_photoStrippedSize) && !(w9 instanceof TLRPC.TL_photoPathSize)) {
                b8.G(cVar.f14863a);
                z12 = b8.K(w9, null, true, true).exists();
            } else {
                z12 = true;
            }
            TLRPC.PhotoSize w10 = b8.w(tL_photo.sizes, i0.Z0(z11), false, null, false);
            b8.G(cVar.f14863a);
            boolean exists = b8.K(w10, null, false, true).exists();
            if (!z12 || !exists) {
                Bitmap K2 = hc.K(str, uri, i0.Z0(false), i0.Z0(false), true);
                if (K2 == null) {
                    K2 = hc.K(str, uri, 800.0f, 800.0f, true);
                }
                Bitmap bitmap = K2;
                if (!exists && (b03 = hc.b0(w10, bitmap, Bitmap.CompressFormat.JPEG, i0.Z0(false), i0.Z0(false), 80, false, 101, 101, false)) != w10) {
                    tL_photo.sizes.add(0, b03);
                }
                if (!z12 && (b02 = hc.b0(w9, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w9) {
                    tL_photo.sizes.add(0, b02);
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        } else if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((jj.K4(tL_document) || jj.M3(tL_document)) && jj.W2(tL_document)) {
                int i11 = 320;
                TLRPC.PhotoSize w11 = b8.w(tL_document.thumbs, 320, false, null, false);
                if (!(w11 instanceof TLRPC.TL_photoStrippedSize) && !(w11 instanceof TLRPC.TL_photoPathSize)) {
                    b8.G(cVar.f14863a);
                    if (!b8.K(w11, null, true, true).exists()) {
                        Bitmap s10 = s(str, j10, null, false);
                        if (s10 == null) {
                            s10 = r(1, str);
                        }
                        Bitmap bitmap2 = s10;
                        if (z10) {
                            i11 = 90;
                        }
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                        float f7 = i11;
                        if (i11 > 90) {
                            i10 = 80;
                        } else {
                            i10 = 55;
                        }
                        int i12 = i10;
                        ThreadLocal threadLocal = hc.I;
                        arrayList.set(0, hc.b0(w11, bitmap2, Bitmap.CompressFormat.JPEG, f7, f7, i12, false, 0, 0, true));
                    }
                }
            }
        }
    }

    public static void x(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, x20 x20Var) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = 0;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.f19800w = Integer.parseInt(extractMetadata);
            }
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                tL_documentAttributeVideo.h = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata3 != null) {
                tL_documentAttributeVideo.duration = Long.parseLong(extractMetadata3) / 1000.0d;
            }
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata4 != null) {
                int intValue = Utilities.z(extractMetadata4).intValue();
                if (x20Var != null) {
                    x20Var.f19189g = intValue;
                } else if (intValue == 90 || intValue == 270) {
                    int i10 = tL_documentAttributeVideo.f19800w;
                    tL_documentAttributeVideo.f19800w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i10;
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        } catch (Exception e10) {
            e = e10;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            f8.g(e, true);
            if (mediaMetadataRetriever2 != 0) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
            }
            try {
                MediaPlayer create = MediaPlayer.create(w0.f19025b, Uri.fromFile(new File(str)));
                if (create != null) {
                    mediaMetadataRetriever2 = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.duration = mediaMetadataRetriever2;
                    tL_documentAttributeVideo.f19800w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                }
            } catch (Exception e12) {
                f8.g(e12, true);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e13) {
                    f8.g(e13, true);
                }
            }
            throw th;
        }
    }

    public static boolean x0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                f8.g(e, true);
            }
        } else {
            try {
                InputStream openInputStream = w0.f19025b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } catch (Exception unused) {
            }
        }
        if (options.outWidth < 800 && options.outHeight < 800) {
            return true;
        }
        return false;
    }

    public static TL_iv.PageBlock y0(TL_iv.PageBlock pageBlock) {
        TLRPC.InputGeoPoint inputGeoPoint;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            TL_iv.inputPageBlockMap inputpageblockmap = new TL_iv.inputPageBlockMap();
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            if (!(geoPoint instanceof TLRPC.TL_geoPoint)) {
                inputGeoPoint = new TLRPC.TL_inputGeoPointEmpty();
            } else {
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
                int i10 = geoPoint.accuracy_radius;
                if (i10 != 0) {
                    tL_inputGeoPoint.flags |= 1;
                    tL_inputGeoPoint.accuracy_radius = i10;
                }
                inputGeoPoint = tL_inputGeoPoint;
            }
            inputpageblockmap.geo = inputGeoPoint;
            inputpageblockmap.zoom = pageblockmap.zoom;
            inputpageblockmap.f20015w = pageblockmap.f20017w;
            inputpageblockmap.h = pageblockmap.h;
            inputpageblockmap.caption = pageblockmap.caption;
            return inputpageblockmap;
        }
        return pageBlock;
    }

    public static void z(c cVar, long j10, int i10) {
        i0.g3(new dd(cVar, j10, i10, 4));
    }

    public final TLRPC.TL_photo A(String str, Uri uri, boolean z10) {
        TLRPC.PhotoSize b02;
        Bitmap K2 = hc.K(str, uri, i0.Z0(z10), i0.Z0(z10), true);
        if (K2 == null) {
            K2 = hc.K(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = K2;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize Z = hc.Z(bitmap, 90.0f, 90.0f, 55, true);
        if (Z != null) {
            arrayList.add(Z);
        }
        if (z10) {
            b02 = hc.b0(null, bitmap, Bitmap.CompressFormat.JPEG, i0.Z0(z10), i0.Z0(z10), 99, false, 101, 101, false);
        } else {
            b02 = hc.b0(null, bitmap, Bitmap.CompressFormat.JPEG, i0.Z0(z10), i0.Z0(z10), 80, false, 101, 101, false);
        }
        if (b02 != null) {
            arrayList.add(b02);
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().v(false);
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_photo.date = getConnectionsManager().getCurrentTime();
        tL_photo.sizes = arrayList;
        tL_photo.file_reference = new byte[0];
        return tL_photo;
    }

    public final void A0(cz czVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i10 = zs.W1;
        if (inputMedia != null) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.media = inputMedia;
            TLObject tLObject = czVar.f15109c;
            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messages_sendMultiMedia.multi_media.size()) {
                        break;
                    } else if (tL_messages_sendMultiMedia.multi_media.get(i11).media == inputMedia) {
                        f0((TLRPC.Message) czVar.f15128z.get(i11), czVar.H);
                        getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                        break;
                    } else {
                        i11++;
                    }
                }
            } else {
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                if (z10) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= tL_inputMediaPaidMedia.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia.extended_media.get(i12) == inputMedia) {
                                f0((TLRPC.Message) czVar.f15128z.get(i12), czVar.H);
                                getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (z10) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                    if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                        int a2 = ih.g.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                        int i13 = 0;
                        while (true) {
                            if (i13 >= czVar.C.size()) {
                                break;
                            } else if (((Integer) czVar.C.get(i13)).intValue() == a2) {
                                f0((TLRPC.Message) czVar.f15128z.get(i13), czVar.H);
                                getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                boolean z11 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                if (z11) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_sendMessage.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia2.extended_media.get(i14) == inputMedia) {
                                f0((TLRPC.Message) czVar.f15128z.get(i14), czVar.H);
                                getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                if (z11) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                        int a10 = ih.g.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                        int i15 = 0;
                        while (true) {
                            if (i15 >= czVar.C.size()) {
                                break;
                            } else if (((Integer) czVar.C.get(i15)).intValue() == a10) {
                                f0((TLRPC.Message) czVar.f15128z.get(i15), czVar.H);
                                getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_uploadMedia, new xx(this, inputMedia, czVar, 1));
        } else if (inputEncryptedFile != null) {
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) czVar.d;
            int i16 = 0;
            while (true) {
                if (i16 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                    break;
                } else if (tL_messages_sendEncryptedMultiMedia.files.get(i16) == inputEncryptedFile) {
                    f0((TLRPC.Message) czVar.f15128z.get(i16), czVar.H);
                    getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                    break;
                } else {
                    i16++;
                }
            }
            t0(czVar, false);
        }
    }

    public final hz B(long j10) {
        return (hz) this.D.f(j10);
    }

    public final Boolean F(jj jjVar, TLRPC.TodoItem todoItem) {
        return (Boolean) this.H.get(Integer.valueOf(Objects.hash(Long.valueOf(jj.B0(jjVar.f16337k)), Integer.valueOf(jjVar.f1()), Integer.valueOf(todoItem.f19940id))));
    }

    public final long I(long j10) {
        return ((Long) this.f17666x.g(0L, j10)).longValue();
    }

    public final boolean J(int i10) {
        if (this.f17660c.indexOfKey(i10) < 0 && this.d.indexOfKey(i10) < 0) {
            return false;
        }
        return true;
    }

    public final void L(cz czVar) {
        M(czVar, -1);
    }

    public final void M(cz czVar, int i10) {
        boolean z10;
        int i11;
        TLObject tLObject;
        boolean z11;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        jj jjVar;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList;
        ?? r52;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        TLRPC.MessageMedia messageMedia;
        TLRPC.InputMedia inputMedia3;
        TLRPC.PhotoSize photoSize2;
        int i12;
        TLRPC.InputMedia inputMedia4;
        TLRPC.InputPeer inputPeer2;
        String str2;
        x20 x20Var;
        TLRPC.InputMedia d;
        TLRPC.InputMedia inputMedia5;
        String str3;
        TLRPC.PhotoSize photoSize3;
        qz qzVar = this;
        cz czVar2 = czVar;
        int i13 = czVar2.e;
        boolean z12 = false;
        boolean z13 = true;
        if (i13 == 0) {
            String str4 = czVar2.f15115l;
            if (str4 != null) {
                qzVar.e0(str4, czVar2);
                hc.D().L(qzVar.currentAccount, czVar2.f15115l, "file");
            } else if (czVar2.f15109c != null) {
                b8.G(qzVar.currentAccount);
                String file = b8.I(czVar2.f15111g).toString();
                qzVar.e0(file, czVar2);
                qzVar.getFileLoader().i0(false, 16777216, file, true);
                qzVar.h0(czVar2.f15116m);
            } else {
                b8.G(qzVar.currentAccount);
                String file2 = b8.I(czVar2.f15111g).toString();
                if (czVar2.d != null && (photoSize3 = czVar2.f15111g) != null && photoSize3.location.dc_id != 0) {
                    File file3 = new File(file2);
                    if (!file3.exists()) {
                        b8.G(qzVar.currentAccount);
                        file2 = b8.K(czVar2.f15111g, null, true, true).toString();
                        file3 = new File(file2);
                    }
                    if (!file3.exists()) {
                        qzVar.e0(b8.r(null, czVar2.f15111g), czVar2);
                        qzVar.getFileLoader().W(ic.f(czVar2.f15111g, czVar2.h), czVar2.K, "jpg", 3, 0);
                        return;
                    }
                }
                qzVar.e0(file2, czVar2);
                qzVar.getFileLoader().i0(true, 16777216, file2, true);
                qzVar.h0(czVar2.f15116m);
            }
        } else if (i13 == 1) {
            x20 x20Var2 = czVar2.f15118o;
            if (x20Var2 != null && x20Var2.c() && czVar2.f15119p) {
                jj jjVar2 = czVar2.f15116m;
                String str5 = jjVar2.f16337k.attachPath;
                TLRPC.Document F0 = jjVar2.F0();
                if (str5 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b8.z(4));
                    sb2.append("/");
                    sb2.append(F0.f19799id);
                    sb2.append(".");
                    if (czVar2.f15118o.N) {
                        str3 = "webm";
                    } else {
                        str3 = "mp4";
                    }
                    sb2.append(str3);
                    str5 = sb2.toString();
                }
                qzVar.e0(str5, czVar2);
                czVar2.f15118o.getClass();
                MediaController.B().h0(czVar2.f15116m, false, true, false);
                qzVar.h0(czVar2.f15116m);
                return;
            }
            x20 x20Var3 = czVar2.f15118o;
            if (x20Var3 != null) {
                TLRPC.InputFile inputFile2 = x20Var3.f19203w;
                if (inputFile2 != null) {
                    i12 = 4;
                    TLObject tLObject2 = czVar2.f15109c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        inputMedia5 = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media;
                    } else {
                        inputMedia5 = ((TLRPC.TL_messages_editMessage) tLObject2).media;
                    }
                    inputMedia5.file = inputFile2;
                    x20Var3.f19203w = null;
                } else {
                    i12 = 4;
                    if (x20Var3.f19204x != null) {
                        TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) czVar2.d;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                        decryptedMessageMedia.size = x20Var3.f19198q;
                        decryptedMessageMedia.key = x20Var3.f19205y;
                        decryptedMessageMedia.iv = x20Var3.f19206z;
                        ow secretChatHelper = qzVar.getSecretChatHelper();
                        jj jjVar3 = czVar2.f15116m;
                        secretChatHelper.j(tL_decryptedMessage, jjVar3.f16337k, czVar2.f15117n, czVar2.f15118o.f19204x, czVar2.f15110f, jjVar3);
                        czVar2.f15118o.f19204x = null;
                        return;
                    }
                }
            } else {
                i12 = 4;
            }
            TLObject tLObject3 = czVar2.f15109c;
            if (tLObject3 != null) {
                if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject3;
                    inputMedia4 = tL_messages_sendMedia.media;
                    inputPeer2 = tL_messages_sendMedia.peer;
                } else if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject3;
                    inputMedia4 = tL_sendMessage.media;
                    inputPeer2 = tL_sendMessage.peer;
                } else if (tLObject3 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject3;
                    inputMedia4 = tL_messages_addPollAnswer.answer.input_media;
                    inputPeer2 = tL_messages_addPollAnswer.peer;
                } else {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject3;
                    inputMedia4 = tL_messages_editMessage.media;
                    inputPeer2 = tL_messages_editMessage.peer;
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                        inputMedia4 = tL_inputMediaPaidMedia.extended_media.get(0);
                    }
                }
                if ((inputMedia4 instanceof TLRPC.TL_inputMediaPoll) && (d = ih.g.d((TLRPC.TL_inputMediaPoll) inputMedia4)) != null) {
                    inputMedia4 = d;
                }
                TLRPC.InputFile inputFile3 = inputMedia4.file;
                if (inputFile3 == null && !(inputMedia4 instanceof TLRPC.TL_inputMediaDocument) && czVar2.f15119p) {
                    jj jjVar4 = czVar2.f15116m;
                    String str6 = jjVar4.f16337k.attachPath;
                    TLRPC.Document F02 = jjVar4.F0();
                    TLRPC.TL_document tL_document = czVar2.f15116m.C1;
                    if (tL_document != null) {
                        F02 = tL_document;
                    }
                    if (str6 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b8.z(i12));
                        sb3.append("/");
                        str6 = a1.g.q(sb3, F02.f19799id, ".mp4");
                    }
                    String str7 = str6;
                    qzVar.e0(str7, czVar2);
                    x20 x20Var4 = czVar2.f15116m.f16356p0;
                    if (x20Var4 == null || !x20Var4.P) {
                        if (x20Var4 != null && x20Var4.c()) {
                            qzVar.getFileLoader().h0(str7, false, false, F02.size, 33554432, false);
                        } else {
                            qzVar.getFileLoader().i0(false, 33554432, str7, false);
                        }
                    }
                    qzVar.h0(czVar2.f15116m);
                    return;
                }
                TLRPC.InputPhoto inputPhoto = inputMedia4.video_cover;
                if (inputPhoto == null && czVar2.f15113j == null && czVar2.f15112i != null && czVar2.f15120q) {
                    String str8 = b8.z(i12) + "/" + czVar2.f15112i.location.volume_id + "_" + czVar2.f15112i.location.local_id + ".jpg";
                    qzVar.e0(str8, czVar2);
                    qzVar.getFileLoader().i0(false, 16777216, str8, true);
                    qzVar.h0(czVar2.f15116m);
                    return;
                } else if (czVar2.f15114k && (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && czVar2.f15113j != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = inputPeer2;
                    inputMedia4.flags &= -65;
                    inputMedia4.video_cover = null;
                    tL_messages_uploadMedia.media = inputMedia4;
                    qzVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new v4(9, qzVar, czVar2));
                    return;
                } else if (inputPhoto == null && czVar2.f15113j != null && czVar2.f15120q) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia2.peer = inputPeer2;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = czVar2.f15113j;
                    tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                    qzVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new xx(qzVar, inputMedia4, czVar2, 0));
                    return;
                } else {
                    jj jjVar5 = czVar2.f15116m;
                    if (jjVar5 != null && (x20Var = jjVar5.f16356p0) != null && x20Var.N) {
                        str2 = "webp";
                    } else {
                        str2 = "jpg";
                    }
                    String str9 = b8.z(i12) + "/" + czVar2.f15111g.location.volume_id + "_" + czVar2.f15111g.location.local_id + "." + str2;
                    qzVar.e0(str9, czVar2);
                    qzVar.getFileLoader().i0(false, 16777216, str9, true);
                    qzVar.h0(czVar2.f15116m);
                    return;
                }
            }
            jj jjVar6 = czVar2.f15116m;
            String str10 = jjVar6.f16337k.attachPath;
            TLRPC.Document F03 = jjVar6.F0();
            if (str10 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(b8.z(i12));
                sb4.append("/");
                str10 = a1.g.q(sb4, F03.f19799id, ".mp4");
            }
            if (czVar2.d != null && F03.dc_id != 0) {
                File file4 = new File(str10);
                if (!file4.exists()) {
                    b8 fileLoader = qzVar.getFileLoader();
                    TLRPC.Message message = czVar2.f15116m.f16337k;
                    fileLoader.getClass();
                    file4 = b8.N(message, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message2 = czVar2.f15116m.f16337k;
                        String absolutePath = file4.getAbsolutePath();
                        message2.attachPath = absolutePath;
                        czVar2.f15116m.f16383w0 = true;
                        str10 = absolutePath;
                    }
                }
                if (file4 == null || (!file4.exists() && czVar2.f15116m.F0() != null)) {
                    b8 fileLoader2 = qzVar.getFileLoader();
                    TLRPC.Document F04 = czVar2.f15116m.F0();
                    fileLoader2.getClass();
                    file4 = b8.K(F04, null, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message3 = czVar2.f15116m.f16337k;
                        String absolutePath2 = file4.getAbsolutePath();
                        message3.attachPath = absolutePath2;
                        czVar2.f15116m.f16383w0 = true;
                        str10 = absolutePath2;
                    }
                }
                if (file4 == null || !file4.exists()) {
                    qzVar.e0(b8.r(null, F03), czVar2);
                    qzVar.getFileLoader().X(F03, czVar2.K, 3, 0);
                    return;
                }
            }
            String str11 = str10;
            qzVar.e0(str11, czVar2);
            x20 x20Var5 = czVar2.f15116m.f16356p0;
            if (x20Var5 == null || !x20Var5.P) {
                if (x20Var5 != null && x20Var5.c()) {
                    qzVar.getFileLoader().h0(str11, true, false, F03.size, 33554432, false);
                } else {
                    qzVar.getFileLoader().i0(true, 33554432, str11, false);
                }
            }
            qzVar.h0(czVar2.f15116m);
        } else if (i13 == 2) {
            String str12 = czVar2.f15115l;
            if (str12 != null) {
                qzVar.e0(str12, czVar2);
                hc.D().L(qzVar.currentAccount, czVar2.f15115l, "gif");
                return;
            }
            TLObject tLObject4 = czVar2.f15109c;
            if (tLObject4 != null) {
                if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                    inputMedia3 = ((TLRPC.TL_messages_sendMedia) tLObject4).media;
                } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                    inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject4).media;
                } else if (tLObject4 instanceof TLRPC.TL_messages_addPollAnswer) {
                    inputMedia3 = ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media;
                } else {
                    inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject4).media;
                }
                if (inputMedia3.file == null) {
                    String str13 = czVar2.f15116m.f16337k.attachPath;
                    qzVar.e0(str13, czVar2);
                    b8 fileLoader3 = qzVar.getFileLoader();
                    if (czVar2.f15109c != null) {
                        z13 = false;
                    }
                    fileLoader3.i0(z13, 67108864, str13, false);
                    qzVar.h0(czVar2.f15116m);
                    return;
                } else if (inputMedia3.thumb == null && (photoSize2 = czVar2.f15111g) != null && !(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    String str14 = b8.z(4) + "/" + czVar2.f15111g.location.volume_id + "_" + czVar2.f15111g.location.local_id + ".jpg";
                    qzVar.e0(str14, czVar2);
                    qzVar.getFileLoader().i0(false, 16777216, str14, true);
                    qzVar.h0(czVar2.f15116m);
                    return;
                } else {
                    return;
                }
            }
            jj jjVar7 = czVar2.f15116m;
            String str15 = jjVar7.f16337k.attachPath;
            TLRPC.Document F05 = jjVar7.F0();
            if (czVar2.d != null && F05.dc_id != 0) {
                File file5 = new File(str15);
                if (!file5.exists()) {
                    b8 fileLoader4 = qzVar.getFileLoader();
                    TLRPC.Message message4 = czVar2.f15116m.f16337k;
                    fileLoader4.getClass();
                    file5 = b8.N(message4, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message5 = czVar2.f15116m.f16337k;
                        String absolutePath3 = file5.getAbsolutePath();
                        message5.attachPath = absolutePath3;
                        czVar2.f15116m.f16383w0 = true;
                        str15 = absolutePath3;
                    }
                }
                if (file5 == null || (!file5.exists() && czVar2.f15116m.F0() != null)) {
                    b8 fileLoader5 = qzVar.getFileLoader();
                    TLRPC.Document F06 = czVar2.f15116m.F0();
                    fileLoader5.getClass();
                    file5 = b8.K(F06, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = czVar2.f15116m.f16337k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        czVar2.f15116m.f16383w0 = true;
                        str15 = absolutePath4;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    qzVar.e0(b8.r(null, F05), czVar2);
                    qzVar.getFileLoader().X(F05, czVar2.K, 3, 0);
                    return;
                }
            }
            qzVar.e0(str15, czVar2);
            qzVar.getFileLoader().i0(true, 67108864, str15, false);
            qzVar.h0(czVar2.f15116m);
        } else if (i13 == 3) {
            String str16 = czVar2.f15116m.f16337k.attachPath;
            qzVar.e0(str16, czVar2);
            b8 fileLoader6 = qzVar.getFileLoader();
            if (czVar2.f15109c == null) {
                z12 = true;
            }
            fileLoader6.i0(z12, 50331648, str16, true);
            qzVar.h0(czVar2.f15116m);
        } else if (i13 == 4) {
            if (i10 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!czVar2.f15119p && !czVar2.f15120q) {
                if (!czVar2.f15126x.isEmpty()) {
                    TLRPC.Message message7 = ((jj) i0.a.g(1, czVar2.f15126x)).f16337k;
                    if (czVar2.G != 0) {
                        z12 = true;
                    }
                    qzVar.f0(message7, z12);
                }
            } else {
                if (i10 < 0) {
                    i11 = czVar2.f15126x.size() - 1;
                } else {
                    i11 = i10;
                }
                jj jjVar8 = (jj) czVar2.f15126x.get(i11);
                TLRPC.Document F07 = jjVar8.F0();
                if (F07 == null && (jj.n1(jjVar8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) jj.n1(jjVar8);
                    if (i11 >= tL_messageMediaPaidMedia.extended_media.size()) {
                        messageExtendedMedia = null;
                    } else {
                        messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i11);
                    }
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    } else {
                        messageMedia = null;
                    }
                    F07 = messageMedia == null ? null : messageMedia.document;
                }
                if (F07 == null && (jj.n1(jjVar8) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.MessageMedia f7 = ih.g.f((TLRPC.TL_messageMediaPoll) jj.n1(jjVar8), ((Integer) czVar2.C.get(i11)).intValue());
                    if (f7 == null) {
                        F07 = null;
                    } else {
                        F07 = f7.document;
                    }
                }
                if (F07 != null) {
                    x20 x20Var6 = czVar2.f15118o;
                    if (x20Var6 != null && x20Var6.c() && czVar2.f15119p) {
                        String str17 = jjVar8.f16337k.attachPath;
                        if (str17 == null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(b8.z(4));
                            sb5.append("/");
                            str17 = a1.g.q(sb5, F07.f19799id, ".mp4");
                        }
                        qzVar.e0(str17, czVar2);
                        czVar2.E.put(jjVar8, str17);
                        czVar2.E.put(str17 + "_i", jjVar8);
                        TLRPC.PhotoSize photoSize4 = czVar2.f15111g;
                        if (photoSize4 != null && photoSize4.location != null) {
                            czVar2.E.put(sc.e.A(str17, "_t"), czVar2.f15111g);
                        }
                        TLRPC.PhotoSize photoSize5 = czVar2.f15112i;
                        if (photoSize5 != null && photoSize5.location != null) {
                            czVar2.E.put(sc.e.A(str17, "_ct"), czVar2.f15112i);
                        }
                        czVar2.f15118o.getClass();
                        MediaController.B().h0(jjVar8, false, true, false);
                        czVar2.f15116m = jjVar8;
                        qzVar.h0(jjVar8);
                    } else {
                        String str18 = jjVar8.f16337k.attachPath;
                        if (str18 != null) {
                            str = "_ct";
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(b8.z(4));
                            sb6.append("/");
                            str = "_ct";
                            str18 = a1.g.q(sb6, F07.f19799id, ".mp4");
                        }
                        TLObject tLObject5 = czVar2.f15109c;
                        if (tLObject5 != null) {
                            if (tLObject5 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject5;
                                inputPeer = tL_messages_sendMultiMedia.peer;
                                inputMedia = tL_messages_sendMultiMedia.multi_media.get(i11).media;
                            } else if (tLObject5 instanceof TLRPC.TL_messages_sendMedia) {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject5;
                                inputPeer = tL_messages_sendMedia2.peer;
                                TLRPC.InputMedia inputMedia6 = tL_messages_sendMedia2.media;
                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(i11);
                                } else {
                                    if (inputMedia6 instanceof TLRPC.TL_inputMediaPoll) {
                                        inputMedia = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) czVar2.C.get(i11)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else if (tLObject5 instanceof TL_ephemeral.TL_sendMessage) {
                                TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject5;
                                inputPeer = tL_sendMessage2.peer;
                                TLRPC.InputMedia inputMedia7 = tL_sendMessage2.media;
                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia7).extended_media.get(i11);
                                } else {
                                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                        inputMedia = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia7, ((Integer) czVar2.C.get(i11)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else {
                                inputMedia = null;
                                inputPeer = null;
                            }
                            if (inputMedia != null && inputMedia.file == null && !(inputMedia instanceof TLRPC.TL_inputMediaDocument) && czVar2.f15119p) {
                                qzVar.e0(str18, czVar2);
                                czVar2.E.put(jjVar8, str18);
                                czVar2.E.put(str18, inputMedia);
                                czVar2.E.put(str18 + "_i", jjVar8);
                                TLRPC.PhotoSize photoSize6 = czVar2.f15111g;
                                if (photoSize6 != null && photoSize6.location != null) {
                                    czVar2.E.put(sc.e.A(str18, "_t"), czVar2.f15111g);
                                }
                                TLRPC.PhotoSize photoSize7 = czVar2.f15112i;
                                if (photoSize7 != null && photoSize7.location != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(b8.z(4));
                                    sb7.append("/");
                                    sb7.append(czVar2.f15112i.location.volume_id);
                                    sb7.append("_");
                                    String p5 = a1.g.p(sb7, czVar2.f15112i.location.local_id, ".jpg");
                                    czVar2.E.put(sc.e.A(str18, str), czVar2.f15112i);
                                    czVar2.E.put(p5 + "_doc", str18);
                                }
                                x20 x20Var7 = jjVar8.f16356p0;
                                if (x20Var7 != null && x20Var7.c()) {
                                    qzVar.getFileLoader().h0(str18, false, false, F07.size, 33554432, false);
                                } else {
                                    qzVar.getFileLoader().i0(false, 33554432, str18, false);
                                }
                                qzVar.h0(jjVar8);
                            } else {
                                String str19 = str;
                                String str20 = str18;
                                TLRPC.PhotoSize photoSize8 = czVar2.f15112i;
                                if (photoSize8 != null) {
                                    photoSize = photoSize8;
                                    if (czVar2.f15113j == null && inputMedia != null && inputMedia.video_cover == null) {
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append(b8.z(4));
                                        sb8.append("/");
                                        TLRPC.InputMedia inputMedia8 = inputMedia;
                                        sb8.append(czVar2.f15112i.location.volume_id);
                                        sb8.append("_");
                                        sb8.append(czVar2.f15112i.location.local_id);
                                        sb8.append(".jpg");
                                        String sb9 = sb8.toString();
                                        qzVar.e0(sb9, czVar2);
                                        TLRPC.PhotoSize photoSize9 = czVar2.f15112i;
                                        if (photoSize9 != null && photoSize9.location != null) {
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append(b8.z(4));
                                            sb10.append("/");
                                            sb10.append(czVar2.f15112i.location.volume_id);
                                            sb10.append("_");
                                            String p9 = a1.g.p(sb10, czVar2.f15112i.location.local_id, ".jpg");
                                            czVar2.E.put(sc.e.A(str20, str19), czVar2.f15112i);
                                            czVar2.E.put(p9 + "_doc", str20);
                                        }
                                        czVar2.E.put(sb9 + "_o", str20);
                                        czVar2.E.put(str20 + "_i", jjVar8);
                                        czVar2.E.put(jjVar8, sb9);
                                        czVar2.E.put(sb9, inputMedia8);
                                        qzVar.getFileLoader().i0(false, 16777216, sb9, true);
                                        qzVar.h0(jjVar8);
                                    } else {
                                        inputMedia2 = inputMedia;
                                        jjVar = jjVar8;
                                    }
                                } else {
                                    inputMedia2 = inputMedia;
                                    jjVar = jjVar8;
                                    photoSize = photoSize8;
                                }
                                if (photoSize != null && czVar2.f15113j != null && inputMedia2 != null && inputMedia2.video_cover == null && (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputMedia2.file != null && (czVar2.f15109c instanceof TLRPC.TL_messages_sendMultiMedia) && (arrayList = czVar2.D) != null && i11 >= 0 && i11 < arrayList.size() && Boolean.TRUE.equals(czVar2.D.get(i11))) {
                                    TLRPC.InputFile inputFile4 = czVar2.f15113j;
                                    inputMedia2.flags &= -65;
                                    inputMedia2.video_cover = null;
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    tL_messages_uploadMedia3.media = inputMedia2;
                                    ConnectionsManager connectionsManager = qzVar.getConnectionsManager();
                                    yx yxVar = new yx(qzVar, inputFile4, inputMedia2, czVar2, i11, str20, 0);
                                    czVar2 = czVar2;
                                    connectionsManager.sendRequest(tL_messages_uploadMedia3, yxVar);
                                    r52 = 0;
                                    qzVar = this;
                                    czVar2.f15118o = r52;
                                    czVar2.f15111g = r52;
                                    czVar2.f15112i = r52;
                                    inputFile = r52;
                                } else {
                                    TLRPC.InputMedia inputMedia9 = inputMedia2;
                                    if (czVar2.f15112i != null && czVar2.f15113j != null && inputMedia9 != null && inputMedia9.video_cover == null) {
                                        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                        tL_messages_uploadMedia4.peer = inputPeer;
                                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                        tL_inputMediaUploadedPhoto2.file = czVar2.f15113j;
                                        tL_messages_uploadMedia4.media = tL_inputMediaUploadedPhoto2;
                                        qzVar = this;
                                        getConnectionsManager().sendRequest(tL_messages_uploadMedia4, new ko(qzVar, inputMedia9, czVar2, str20, jjVar, 4));
                                    } else {
                                        qzVar = this;
                                        if (czVar2.f15111g != null) {
                                            String str21 = b8.z(4) + "/" + czVar2.f15111g.location.volume_id + "_" + czVar2.f15111g.location.local_id + ".jpg";
                                            qzVar.e0(str21, czVar2);
                                            czVar2.E.put(str21 + "_o", str20);
                                            czVar2.E.put(jjVar, str21);
                                            czVar2.E.put(str21, inputMedia9);
                                            qzVar.getFileLoader().i0(false, 16777216, str21, true);
                                            qzVar.h0(jjVar);
                                        }
                                    }
                                }
                            }
                        } else {
                            String str22 = str18;
                            qzVar.e0(str22, czVar2);
                            czVar2.E.put(jjVar8, str22);
                            czVar2.E.put(str22, ((TLRPC.TL_messages_sendEncryptedMultiMedia) czVar2.d).files.get(i11));
                            czVar2.E.put(str22 + "_i", jjVar8);
                            TLRPC.PhotoSize photoSize10 = czVar2.f15111g;
                            if (photoSize10 != null && photoSize10.location != null) {
                                czVar2.E.put(sc.e.A(str22, "_t"), czVar2.f15111g);
                            }
                            x20 x20Var8 = jjVar8.f16356p0;
                            if (x20Var8 != null && x20Var8.c()) {
                                qzVar.getFileLoader().h0(str22, true, false, F07.size, 33554432, false);
                            } else {
                                qzVar.getFileLoader().i0(true, 33554432, str22, false);
                            }
                            qzVar.h0(jjVar8);
                        }
                    }
                    r52 = 0;
                    czVar2.f15118o = r52;
                    czVar2.f15111g = r52;
                    czVar2.f15112i = r52;
                    inputFile = r52;
                } else {
                    String str23 = czVar2.f15115l;
                    if (str23 != null) {
                        qzVar.e0(str23, czVar2);
                        czVar2.E.put(jjVar8, czVar2.f15115l);
                        czVar2.E.put(czVar2.f15115l, jjVar8);
                        hc.D().L(qzVar.currentAccount, czVar2.f15115l, "file");
                        inputFile = null;
                        czVar2.f15115l = null;
                    } else {
                        TLObject tLObject6 = czVar2.f15109c;
                        if (tLObject6 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            tLObject = ((TLRPC.TL_messages_sendMultiMedia) tLObject6).multi_media.get(i11).media;
                        } else {
                            boolean z14 = tLObject6 instanceof TLRPC.TL_messages_sendMedia;
                            if (z14) {
                                TLRPC.InputMedia inputMedia10 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                                if (inputMedia10 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia10).extended_media.get(i11);
                                }
                            }
                            if (z14) {
                                TLRPC.InputMedia inputMedia11 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                                if (inputMedia11 instanceof TLRPC.TL_inputMediaPoll) {
                                    tLObject = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia11, ((Integer) czVar2.C.get(i11)).intValue());
                                }
                            }
                            boolean z15 = tLObject6 instanceof TL_ephemeral.TL_sendMessage;
                            if (z15) {
                                TLRPC.InputMedia inputMedia12 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                                if (inputMedia12 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia12).extended_media.get(i11);
                                }
                            }
                            if (z15) {
                                TLRPC.InputMedia inputMedia13 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                                if (inputMedia13 instanceof TLRPC.TL_inputMediaPoll) {
                                    tLObject = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia13, ((Integer) czVar2.C.get(i11)).intValue());
                                }
                            }
                            tLObject = ((TLRPC.TL_messages_sendEncryptedMultiMedia) czVar2.d).files.get(i11);
                        }
                        b8.G(qzVar.currentAccount);
                        String file6 = b8.I(czVar2.f15111g).toString();
                        qzVar.e0(file6, czVar2);
                        czVar2.E.put(file6, tLObject);
                        czVar2.E.put(jjVar8, file6);
                        b8 fileLoader7 = qzVar.getFileLoader();
                        if (czVar2.d != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fileLoader7.i0(z11, 16777216, file6, true);
                        qzVar.h0(jjVar8);
                        inputFile = null;
                        czVar2.f15111g = null;
                    }
                }
                czVar2.f15113j = inputFile;
                czVar2.f15119p = false;
                czVar2.f15120q = false;
            }
            qzVar.t0(czVar2, z10);
        } else if (i13 == 5) {
            String str24 = "stickerset_" + czVar2.f15116m.f1();
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) czVar2.K;
            qzVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ci(qzVar, czVar2, str24, 10));
            qzVar.e0(str24, czVar2);
        }
    }

    public final void N(TLObject tLObject, jj jjVar, String str, cz czVar, Object obj, HashMap hashMap, boolean z10) {
        O(tLObject, jjVar, str, null, false, czVar, obj, hashMap, z10);
    }

    public final void O(TLObject tLObject, final jj jjVar, final String str, final cz czVar, final boolean z10, final cz czVar2, final Object obj, final HashMap hashMap, final boolean z11) {
        cz y3;
        ArrayList arrayList;
        TLObject tLObject2 = tLObject;
        if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_addPollAnswer.answer.input_media;
            if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) && !(inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto)) {
                tLObject2 = tLObject;
            } else {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = tL_messages_addPollAnswer.peer;
                tL_messages_uploadMedia.media = tL_messages_addPollAnswer.answer.input_media;
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new zx(this, tL_messages_addPollAnswer, tLObject, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11));
                return;
            }
        }
        int i10 = 0;
        boolean z12 = false;
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z10 && (y3 = y(jjVar.f1(), jj.B0(jjVar.f16337k))) != null) {
            if (czVar != null) {
                z12 = czVar.H;
            }
            ?? obj2 = new Object();
            obj2.f15329a = tLObject2;
            obj2.f15330b = jjVar;
            obj2.d = str;
            obj2.f15333g = czVar2;
            obj2.h = obj;
            obj2.f15334i = z12;
            if (y3.f15108b == null) {
                y3.f15108b = new ArrayList();
            }
            y3.f15108b.add(obj2);
            if (czVar != null && (arrayList = czVar.f15108b) != null) {
                y3.f15108b.addAll(arrayList);
                return;
            }
            return;
        }
        TLRPC.Message message = jjVar.f16337k;
        f0(message, z11);
        rh.e6 y10 = rh.e6.y(this.currentAccount, false);
        zw zwVar = new zw(this, tLObject2, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11, 1);
        if (jjVar.f16337k != null) {
            int f12 = jjVar.f1();
            if (rh.e6.o(tLObject) > 0 && y10.Q.remove(Integer.valueOf(f12))) {
                y10.R.put(Integer.valueOf(f12), zwVar);
                return;
            }
        }
        if (j2.b(this.currentAccount).a(tLObject, Collections.singletonList(jjVar), new zw(this, tLObject, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11, 2))) {
            if (rf.s.g(this.currentAccount).a(tLObject, Collections.singletonList(jjVar), new q20() {
                @Override
                public final void a(Object obj3) {
                    boolean z13 = z11;
                    qz.this.O((TLObject) obj3, jjVar, str, czVar, z10, czVar2, obj, hashMap, z13);
                }
            })) {
                ConnectionsManager connectionsManager = getConnectionsManager();
                zx zxVar = new zx(this, tLObject, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11, message);
                p pVar = new p(6, this, message);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    i10 = 128;
                }
                message.reqId = connectionsManager.sendRequest(tLObject, zxVar, pVar, i10 | 68);
                if (czVar != null) {
                    czVar.d();
                }
            }
        }
    }

    public final void P(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final cz czVar, final boolean z10) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0(((jj) arrayList.get(i10)).f16337k, z10);
        }
        if (!rh.e6.y(this.currentAccount, false).c(tLObject, arrayList, new Runnable(this) {
            public final qz f17966b;

            {
                this.f17966b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.f17966b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                        return;
                    default:
                        this.f17966b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                        return;
                }
            }
        }) || !j2.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) {
            public final qz f17966b;

            {
                this.f17966b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.f17966b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                        return;
                    default:
                        this.f17966b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                        return;
                }
            }
        }) || !rf.s.g(this.currentAccount).a(tLObject, arrayList, new q20() {
            @Override
            public final void a(Object obj) {
                boolean z11 = z10;
                qz.this.P((TLObject) obj, arrayList, arrayList2, arrayList3, czVar, z11);
            }
        })) {
            return;
        }
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                ArrayList arrayList4;
                boolean z11;
                boolean z12;
                boolean[] zArr;
                Object obj;
                qz qzVar = qz.this;
                TLObject tLObject3 = tLObject;
                ArrayList arrayList5 = arrayList;
                ArrayList arrayList6 = arrayList2;
                boolean z13 = z10;
                if (tL_error != null && w8.r(tL_error.text)) {
                    int c10 = w8.c(tL_error.text);
                    ArrayList arrayList7 = arrayList3;
                    arrayList4 = arrayList6;
                    z11 = z13;
                    cz czVar2 = czVar;
                    if (arrayList7 != null) {
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        if (c10 >= 0) {
                            for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                                if (c10 == i11) {
                                    obj = arrayList8.get(i11);
                                } else {
                                    obj = null;
                                }
                                arrayList8.set(i11, obj);
                            }
                        }
                        qzVar.getFileRefController().u(new Object[]{tLObject3, arrayList5, arrayList4, arrayList8, czVar2, Boolean.valueOf(z11)}, arrayList8);
                        return;
                    } else if (czVar2 != null) {
                        if (c10 >= 0 && (zArr = czVar2.f15122s) != null && c10 < zArr.length) {
                            z12 = zArr[c10];
                        } else {
                            z12 = czVar2.f15121r;
                        }
                        if (!z12) {
                            if (c10 < 0) {
                                czVar2.f15121r = true;
                            } else {
                                if (czVar2.f15122s == null) {
                                    czVar2.f15122s = new boolean[czVar2.f15126x.size()];
                                }
                                czVar2.f15122s[c10] = true;
                            }
                            i0.g3(new b5(qzVar, tLObject3, c10, czVar2, arrayList5, z11));
                            return;
                        }
                    }
                } else {
                    arrayList4 = arrayList6;
                    z11 = z13;
                }
                i0.g3(new gy(qzVar, tL_error, tLObject2, z11, arrayList5, arrayList4, tLObject3));
            }
        }, (QuickAckDelegate) null, 68);
    }

    public final void Q(long j10, Uri uri, ArrayList arrayList, c90 c90Var) {
        if (this.D.f(j10) != null) {
            c90Var.run(0L);
            return;
        }
        if (o5.z(j10)) {
            long j11 = -j10;
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j11));
            if (L0 != null && !L0.megagroup) {
                getMessagesController().T(null, j11, null, new lh(this, uri, arrayList, c90Var), null);
                return;
            }
        }
        new Thread(new ym(this, arrayList, j10, uri, c90Var, 3)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(jj jjVar, long j10, long j11, long j12, oj ojVar) {
        TLRPC.WebPage webPage;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.f16337k;
            TLRPC.MessageMedia messageMedia = message.media;
            ArrayList arrayList = null;
            r4 = null;
            r4 = null;
            HashMap hashMap = null;
            arrayList = null;
            if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty) && !(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && !(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                if (o5.C(j10)) {
                    TLRPC.Message message2 = jjVar.f16337k;
                    if (message2.peer_id != null) {
                        TLRPC.MessageMedia messageMedia2 = message2.media;
                        if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                            hashMap = new HashMap();
                            hashMap.put("parentObject", "sent_" + jjVar.f16337k.peer_id.channel_id + "_" + jjVar.f1() + "_" + jj.B0(jjVar.f16337k) + "_" + jjVar.D + "_" + jjVar.T1());
                        }
                    }
                }
                HashMap hashMap2 = hashMap;
                TLRPC.Message message3 = jjVar.f16337k;
                TLRPC.MessageMedia messageMedia3 = message3.media;
                TLRPC.Photo photo = messageMedia3.photo;
                if (photo instanceof TLRPC.TL_photo) {
                    oz c10 = oz.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j10, null, jjVar.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, jjVar, null, false, false);
                    c10.Q = j11;
                    c10.R = j12;
                    c10.T = ojVar;
                    r0(c10);
                    return;
                }
                TLRPC.Document document = messageMedia3.document;
                if (document instanceof TLRPC.TL_document) {
                    oz f7 = oz.f((TLRPC.TL_document) document, null, message3.attachPath, j10, jjVar.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, jjVar, null, false);
                    f7.Q = j11;
                    f7.R = j12;
                    f7.T = ojVar;
                    r0(f7);
                } else if (!(messageMedia3 instanceof TLRPC.TL_messageMediaVenue) && !(messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                    if (messageMedia3.phone_number != null) {
                        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                        TLRPC.MessageMedia messageMedia4 = jjVar.f16337k.media;
                        tL_userContact_old2.phone = messageMedia4.phone_number;
                        tL_userContact_old2.first_name = messageMedia4.first_name;
                        tL_userContact_old2.last_name = messageMedia4.last_name;
                        tL_userContact_old2.f19942id = messageMedia4.user_id;
                        oz g10 = oz.g(tL_userContact_old2, j10, jjVar.C, null, null, null, true, 0, 0);
                        g10.R = j12;
                        g10.T = ojVar;
                        g10.Q = j11;
                        r0(g10);
                    } else if (!o5.C(j10)) {
                        q0(m5.j(jjVar), j10, true, false, true, 0, 0, null, -1, j11, j12, ojVar);
                    }
                } else {
                    oz d = oz.d(messageMedia3, j10, jjVar.C, null, null, null, true, 0);
                    d.Q = j11;
                    d.R = j12;
                    d.T = ojVar;
                    r0(d);
                }
            } else if (message.message != null) {
                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                    webPage = messageMedia.webpage;
                } else {
                    webPage = null;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jjVar.f16337k.entities.size(); i10++) {
                        TLRPC.MessageEntity messageEntity = jjVar.f16337k.entities.get(i10);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                oz b10 = oz.b(jjVar.f16337k.message, j10, jjVar.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                b10.Q = j11;
                b10.R = j12;
                b10.T = ojVar;
                r0(b10);
            } else if (o5.C(j10)) {
                q0(m5.j(jjVar), j10, true, false, true, 0, 0, null, -1, j11, j12, ojVar);
            }
        }
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(int i10) {
        SparseArray sparseArray = this.f17659b;
        int size = sparseArray.size();
        sparseArray.remove(i10);
        if (size != 0 && sparseArray.size() == 0) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.f15938a.c(new br(messagesStorage, 29));
        }
    }

    @Override
    public final void didReceivedNotification(int r43, int r44, java.lang.Object... r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(String str, cz czVar) {
        HashMap hashMap = this.f17658a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(czVar);
    }

    public final void f(ArrayList arrayList) {
        HashMap hashMap;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        jj jjVar;
        int i14;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        long j11 = 0;
        int i17 = 0;
        boolean z11 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.f17658a;
            if (i17 >= size) {
                break;
            }
            jj jjVar2 = (jj) arrayList.get(i17);
            if (jjVar2.f16357p1) {
                i12 = 1;
            } else {
                i12 = i15;
            }
            long B0 = jj.B0(jjVar2.f16337k);
            arrayList4.add(Integer.valueOf(jjVar2.f1()));
            if (jj.b4(jjVar2.f16337k)) {
                i16 = jj.J1(jjVar2.f16337k);
            }
            TLRPC.Message i02 = i0(jjVar2.f1(), jjVar2.f16357p1);
            if (i02 != null) {
                getConnectionsManager().cancelRequest(i02.reqId, true);
            }
            rh.e6 y3 = rh.e6.y(this.currentAccount, z10);
            rh.z5 z5Var = y3.N;
            ArrayList arrayList5 = arrayList4;
            if (z5Var != null && z5Var.f47810b == jj.B0(jjVar2.f16337k)) {
                rh.z5 z5Var2 = y3.N;
                int f12 = jjVar2.f1();
                rh.y5 y5Var = z5Var2.f47821p;
                org.telegram.ui.Components.qb qbVar = z5Var2.d;
                i13 = i17;
                HashSet hashSet = z5Var2.f47816k;
                j10 = B0;
                if (!z5Var2.f47819n && !z5Var2.f47820o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            jjVar = (jj) it.next();
                            Iterator it2 = it;
                            if (jjVar.f1() == f12) {
                                hashSet.remove(jjVar);
                                break;
                            }
                            it = it2;
                        } else {
                            jjVar = null;
                            break;
                        }
                    }
                    if (hashSet.isEmpty()) {
                        z5Var2.f47819n = true;
                        z5Var2.f47811c.b();
                        y3.N = null;
                    } else {
                        z5Var2.f47813g--;
                        if (jjVar != null && (message = jjVar.f16337k) != null) {
                            z5Var2.h -= message.paid_message_stars;
                        }
                        rh.d6 d6Var = z5Var2.f47812f;
                        if (d6Var != null) {
                            d6Var.f29331b = 3000L;
                            i0.r(y5Var);
                            i0.h3(y5Var, 3000L);
                        }
                        org.telegram.ui.Components.f6 f6Var = qbVar.f29623b;
                        int i18 = z5Var2.f47813g;
                        if (i18 == 1) {
                            G = cd.L0(2131747719, null);
                            i14 = 0;
                        } else {
                            i14 = 0;
                            G = cd.G(i18, "PaidMessageSentTitle", new Object[0]);
                        }
                        f6Var.setText(G);
                        qbVar.f29624c.setText(i0.W2(cd.H(',', "PaidMessageSentSubtitle", Math.max(i14, (int) z5Var2.h))));
                        qbVar.f29622a.d();
                    }
                }
            } else {
                i13 = i17;
                j10 = B0;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        cz czVar = (cz) arrayList6.get(i19);
                        if (czVar.e == 4) {
                            jj jjVar3 = null;
                            int i20 = 0;
                            while (true) {
                                if (i20 < czVar.f15126x.size()) {
                                    jjVar3 = (jj) czVar.f15126x.get(i20);
                                    if (jjVar3.f1() == jjVar2.f1()) {
                                        j0(jjVar2.f1(), jjVar2.f16357p1);
                                        break;
                                    }
                                    i20++;
                                } else {
                                    i20 = -1;
                                    break;
                                }
                            }
                            if (i20 >= 0) {
                                czVar.f15126x.remove(i20);
                                czVar.f15128z.remove(i20);
                                czVar.B.remove(i20);
                                if (!czVar.f15127y.isEmpty()) {
                                    czVar.f15127y.remove(i20);
                                }
                                TLObject tLObject = czVar.f15109c;
                                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i20);
                                } else {
                                    boolean z12 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i20);
                                        }
                                    }
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                                            ih.g.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) czVar.C.get(i20)).intValue());
                                        }
                                    }
                                    boolean z13 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia3).extended_media.remove(i20);
                                        }
                                    }
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                            ih.g.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) czVar.C.get(i20)).intValue());
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) czVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i20);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i20);
                                }
                                MediaController.B().i(jjVar2);
                                String str = (String) czVar.E.get(jjVar3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (czVar.f15126x.isEmpty()) {
                                    czVar.d();
                                } else {
                                    if (czVar.G == jjVar2.f1()) {
                                        jj jjVar4 = (jj) i0.a.g(1, czVar.f15126x);
                                        czVar.G = jjVar4.f1();
                                        jjVar4.f16337k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(jjVar4.f16337k);
                                        getMessagesStorage().h1(-2, 0, i12, czVar.f15107a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(czVar)) {
                                        arrayList3.add(czVar);
                                    }
                                }
                            }
                        } else if (czVar.f15116m.f1() == jjVar2.f1()) {
                            j0(jjVar2.f1(), jjVar2.f16357p1);
                            arrayList6.remove(i19);
                            czVar.d();
                            MediaController.B().i(czVar.f15116m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (czVar.d != null) {
                                    z11 = true;
                                }
                            }
                        } else {
                            i19++;
                        }
                    }
                }
            }
            i17 = i13 + 1;
            i15 = i12;
            arrayList4 = arrayList5;
            j11 = j10;
            z10 = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i21 = 0; i21 < arrayList2.size(); i21++) {
            String str2 = (String) arrayList2.get(i21);
            if (str2.startsWith("http")) {
                hc.D().g(str2);
            } else {
                getFileLoader().b(str2, z11);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i22 = 0; i22 < size2; i22++) {
            t0((cz) arrayList3.get(i22), false);
        }
        if (arrayList.size() == 1 && ((jj) arrayList.get(0)).Y2() && ((jj) arrayList.get(0)).B1 != null) {
            l0((jj) arrayList.get(0));
        } else if (arrayList.size() != 1 || !((jj) arrayList.get(0)).Y2() || !((jj) arrayList.get(0)).T3()) {
            if (!arrayList.isEmpty() && jj.d5(((jj) arrayList.get(0)).f16337k)) {
                i11 = 9;
            } else if (!arrayList.isEmpty() && jj.b4(((jj) arrayList.get(0)).f16337k)) {
                i11 = 5;
            } else {
                if (i15 != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                getMessagesController().Z(arrayList7, null, null, j11, i16, false, i10);
            }
            i10 = i11;
            getMessagesController().Z(arrayList7, null, null, j11, i16, false, i10);
        }
    }

    public final void f0(TLRPC.Message message, boolean z10) {
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            i0.g3(new ex(this, message, z10, 2));
        } else {
            g0(message, z10);
        }
    }

    public final void g(jj jjVar) {
        ArrayList j10 = m5.j(jjVar);
        if (jjVar != null && jjVar.D == 29) {
            cz czVar = null;
            for (Map.Entry entry : this.f17658a.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    cz czVar2 = (cz) arrayList.get(i10);
                    if (czVar2.e == 4) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= czVar2.f15126x.size()) {
                                break;
                            } else if (((jj) czVar2.f15126x.get(i11)).f1() == jjVar.f1()) {
                                czVar = czVar2;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (czVar != null) {
                        break;
                    }
                }
            }
            if (czVar != null) {
                j10.clear();
                j10.addAll(czVar.f15126x);
            }
        }
        f(j10);
    }

    public final void g0(TLRPC.Message message, boolean z10) {
        boolean z11;
        if (message != null) {
            int i10 = message.f19814id;
            if (i10 > 0) {
                this.d.put(i10, message);
                return;
            }
            SparseArray sparseArray = this.f17660c;
            if (sparseArray.indexOfKey(i10) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j0(message.f19814id, z10);
            sparseArray.put(message.f19814id, message);
            if (!z10 && !z11 && !jj.c3(message)) {
                long B0 = jj.B0(message);
                a0.h hVar = this.f17661f;
                hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(zs.f19654n1, new Object[0]);
            }
        }
    }

    public final void h0(jj jjVar) {
        boolean z10;
        if (jjVar != null && jjVar.f1() <= 0 && !jjVar.f16357p1) {
            TLRPC.Message message = jjVar.f16337k;
            int i10 = message.f19814id;
            SparseArray sparseArray = this.e;
            if (sparseArray.indexOfKey(i10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sparseArray.put(message.f19814id, message);
            if (!z10 && !jj.c3(message)) {
                long B0 = jj.B0(message);
                a0.h hVar = this.h;
                hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(zs.f19654n1, new Object[0]);
            }
        }
    }

    public final TLRPC.Message i0(int i10, boolean z10) {
        if (i10 > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i10);
            if (message != null) {
                sparseArray.remove(i10);
            }
            return message;
        }
        SparseArray sparseArray2 = this.f17660c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i10);
        if (message2 != null) {
            sparseArray2.remove(i10);
            if (!z10) {
                long B0 = jj.B0(message2);
                a0.h hVar = this.f17661f;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(zs.f19654n1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void j0(int i10, boolean z10) {
        if (i10 <= 0 && !z10) {
            SparseArray sparseArray = this.e;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i10);
            if (message != null) {
                sparseArray.remove(i10);
                long B0 = jj.B0(message);
                a0.h hVar = this.h;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(zs.f19654n1, new Object[0]);
                }
            }
        }
    }

    public final void k(jj jjVar, TLRPC.Updates updates, boolean z10) {
        int i10;
        if (jjVar == null) {
            return;
        }
        long B0 = jj.B0(jjVar.f16337k);
        long j10 = jjVar.f16337k.random_id;
        boolean z11 = true;
        TLRPC.Message message = null;
        if (updates != null) {
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    TLRPC.Update update = arrayList.get(i11);
                    i11++;
                    TLRPC.Update update2 = update;
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                        if (tL_updateMessageID.random_id == j10) {
                            i10 = tL_updateMessageID.f20050id;
                            break;
                        }
                    }
                } else {
                    i10 = 0;
                    break;
                }
            }
            for (int i12 = 0; i12 < updates.updates.size(); i12++) {
                TLRPC.Update update3 = updates.updates.get(i12);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    TLRPC.Message message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && o5.o(message2.peer_id) == B0 && (i10 == 0 || message2.f19814id == i10)) {
                        updates.updates.remove(i12);
                        Utilities.d.c(new ry(this, tL_updateNewMessage, 0));
                        message = message2;
                        break;
                    }
                }
            }
            if (message != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j10) {
                        updates.updates.remove(size2);
                    }
                }
            }
        } else {
            i10 = 0;
        }
        TLRPC.Message message3 = message;
        int i13 = jjVar.f16337k.local_id;
        if (i13 >= 0) {
            i13 = jjVar.f1();
        }
        int i14 = i13;
        if (message3 == null) {
            if (jjVar.f1() > 0) {
                d0(i14);
                i0(i14, false);
                return;
            }
            if (!z10 && i10 == 0) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.f19814id = i14;
                tL_messageService.dialog_id = B0;
                getMessagesStorage().N0(0, tL_messageService);
                jjVar.f16337k.send_state = 2;
                jjVar.K1 = true;
                getNotificationCenter().k(zs.M, Integer.valueOf(i14));
            } else {
                hs messagesStorage = getMessagesStorage();
                messagesStorage.f15938a.c(new mq(messagesStorage, j10, B0, Integer.valueOf(i14), i14, jjVar.f16337k.date));
                jjVar.f16337k.send_state = 0;
                jjVar.K1 = true;
                getNotificationCenter().k(zs.J, Integer.valueOf(i14));
            }
            d0(i14);
            i0(i14, false);
            return;
        }
        message3.dialog_id = B0;
        message3.local_id = 0;
        message3.send_state = 0;
        Integer num = (Integer) getMessagesController().P.get(Long.valueOf(B0));
        if (num == null) {
            num = Integer.valueOf(getMessagesStorage().U(B0, true));
            getMessagesController().P.put(Long.valueOf(B0), num);
        }
        if (num.intValue() >= message3.f19814id) {
            z11 = false;
        }
        message3.unread = z11;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(message3);
        getMessagesStorage().f15938a.c(new zm(this, j10, B0, i14, message3, arrayList2, jjVar));
    }

    public final boolean k0(long j10, jj jjVar, boolean z10) {
        long j11;
        int i10 = 0;
        if (jjVar.f1() >= 0) {
            if (jjVar.Y2()) {
                t(jjVar, null, null, null, null, null, null, null, true, jjVar.t2(), jjVar);
                return false;
            }
        } else {
            TLRPC.Message message = jjVar.f16337k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                if (z10) {
                    k(jjVar, null, false);
                }
            } else {
                boolean z11 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i11 = zs.f19683s;
                if (z11) {
                    TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (jj.B0(message) & 4294967295L)));
                    if (Z0 == null) {
                        getMessagesStorage().N0(jjVar.f16357p1 ? 1 : 0, jjVar.f16337k);
                        jjVar.f16337k.send_state = 2;
                        getNotificationCenter().k(zs.M, Integer.valueOf(jjVar.f1()));
                        d0(jjVar.f1());
                        return false;
                    }
                    TLRPC.Message message2 = jjVar.f16337k;
                    if (message2.random_id == 0) {
                        message2.random_id = E();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = jjVar.f16337k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(Z0, jjVar.f16337k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(Z0, null, jjVar.f16337k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(Z0, jjVar.f16337k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(Z0, jjVar.f16337k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(Z0, null, jjVar.f16337k);
                        return true;
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                            ow secretChatHelper = getSecretChatHelper();
                            TLRPC.Message message3 = jjVar.f16337k;
                            secretChatHelper.getClass();
                            if (Z0 instanceof TLRPC.TL_encryptedChat) {
                                TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                                if (message3 != null) {
                                    tL_decryptedMessageService.action = message3.action.encryptedAction;
                                } else {
                                    TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                    tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                    tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                    message3 = secretChatHelper.d(Z0, tL_decryptedMessageActionScreenshotMessages);
                                    jj jjVar2 = new jj(secretChatHelper.currentAccount, message3, false, false);
                                    jjVar2.f16337k.send_state = 1;
                                    jjVar2.V1 = true;
                                    secretChatHelper.getMessagesController().i5(0, message3.dialog_id, m5.j(jjVar2));
                                    secretChatHelper.getNotificationCenter().k(i11, new Object[0]);
                                }
                                TLRPC.Message message4 = message3;
                                tL_decryptedMessageService.random_id = message4.random_id;
                                secretChatHelper.j(tL_decryptedMessageService, message4, Z0, null, null, null);
                                return true;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                            if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                                getSecretChatHelper().y(Z0, 0, 0, jjVar.f16337k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                                getSecretChatHelper().s(Z0, jjVar.f16337k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                                getSecretChatHelper().p(Z0, jjVar.f16337k, 0L);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                                getSecretChatHelper().x(Z0, jjVar.f16337k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                                getSecretChatHelper().q(Z0, jjVar.f16337k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                                getSecretChatHelper().v(Z0, jjVar.f16337k);
                            }
                        }
                        return true;
                    }
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(jj.B0(jjVar.f16337k)));
                    int O1 = jjVar.O1();
                    TLRPC.Message message5 = jjVar.f16337k;
                    if (Z1 != null && O1 != 0 && Z1.f19942id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = Z1.access_hash;
                        tL_inputPeerUser.user_id = Z1.f19942id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = O1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = E();
                            message5.dialog_id = Z1.f19942id;
                            message5.unread = true;
                            message5.out = true;
                            int j12 = getUserConfig().j();
                            message5.f19814id = j12;
                            message5.local_id = j12;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= 264;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = O1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = Z1.f19942id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().v(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        jj jjVar3 = new jj(this.currentAccount, message5, false, true);
                        jjVar3.f16337k.send_state = 1;
                        jjVar3.V1 = true;
                        getMessagesController().i5(0, message5.dialog_id, m5.j(jjVar3));
                        getNotificationCenter().k(i11, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                        N(tL_messages_sendScreenshotNotification, jjVar3, null, null, null, null, false);
                    }
                }
                if (z10) {
                    this.f17659b.put(jjVar.f1(), jjVar);
                }
                long B0 = jj.B0(jjVar.f16337k);
                TLRPC.Message message6 = jjVar.f16337k;
                String str = message6.attachPath;
                TLRPC.ReplyMarkup replyMarkup = message6.reply_markup;
                HashMap<String, String> hashMap = message6.params;
                boolean z12 = !message6.silent;
                if (jjVar.f16357p1) {
                    i10 = message6.date;
                }
                oz c10 = oz.c(null, null, null, null, null, null, null, null, null, null, B0, str, null, null, null, true, jjVar, null, replyMarkup, hashMap, z12, i10, 0, 0, null, null, false, false);
                TLRPC.Message message7 = jjVar.f16337k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c10.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c10.N = jj.J1(message7);
                    c10.Q = jjVar.f16337k.paid_message_stars;
                }
                TLRPC.Message message8 = jjVar.f16337k;
                if (message8 != null) {
                    j11 = message8.ephemeralReceiverBotId;
                } else {
                    j11 = 0;
                }
                c10.X = j11;
                c10.Q = j10;
                r0(c10);
                return true;
            }
        }
        return false;
    }

    public final void l0(jj jjVar) {
        jjVar.f16353o1 = true;
        TLRPC.Message message = jjVar.f16337k;
        message.media = jjVar.B1;
        message.message = jjVar.A1;
        ArrayList<TLRPC.MessageEntity> arrayList = jjVar.D1;
        message.entities = arrayList;
        message.attachPath = jjVar.E1;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        jjVar.B1 = null;
        jjVar.A1 = null;
        jjVar.D1 = null;
        jjVar.E1 = null;
        jjVar.f16356p0 = null;
        jjVar.D = -1;
        jjVar.K5();
        jjVar.f16394z = null;
        if (jjVar.D != 0) {
            jjVar.k0();
        } else {
            jjVar.Q1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(jjVar.f16337k);
        getMessagesStorage().j1(arrayList2, false, true, false, 0, false, jjVar.f16357p1 ? 1 : 0, 0L);
        getNotificationCenter().k(zs.m0, Long.valueOf(jj.B0(jjVar.f16337k)), m5.j(jjVar));
    }

    public final void n0(boolean z10, jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, org.telegram.ui.un unVar) {
        boolean z11;
        int i10;
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (jjVar != null && keyboardButtonProto != null && unVar != null) {
            if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                i10 = 3;
                z11 = false;
            } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                z11 = false;
                i10 = 1;
            } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                z11 = z10;
                i10 = 2;
            } else {
                z11 = z10;
                i10 = 0;
            }
            String str = jj.B0(jjVar.f16337k) + "_" + jjVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i10;
            this.f17663r.put(str, Boolean.TRUE);
            HashMap hashMap = this.f17664s;
            List list = (List) hashMap.get(jj.B0(jjVar.f16337k) + "_" + jjVar.f1());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                hashMap.put(jj.B0(jjVar.f16337k) + "_" + jjVar.f1(), arrayList);
                list = arrayList;
            }
            list.add(str);
            TLObject[] tLObjectArr = new TLObject[1];
            zx zxVar = new zx(this, str, list, z11, jjVar, keyboardButtonProto, unVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10);
            if (z11) {
                getMessagesStorage().M(str, zxVar);
                return;
            }
            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
            if (tL_inlineButtonTypeUrlAuth != null) {
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
                tL_messages_requestUrlAuth.msg_id = jjVar.f1();
                tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
                tL_messages_requestUrlAuth.flags |= 2;
                tLObjectArr[0] = tL_messages_requestUrlAuth;
                getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, zxVar, 2);
            } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                if ((jjVar.f16337k.media.flags & 4) == 0) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                    tL_inputInvoiceMessage.msg_id = jjVar.f1();
                    tL_inputInvoiceMessage.peer = getMessagesController().l1(jjVar.f16337k.peer_id);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                    JSONObject u10 = xh.m2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    tLObjectArr[0] = tL_payments_getPaymentForm;
                    getConnectionsManager().sendRequest(tL_payments_getPaymentForm, zxVar, 2);
                    return;
                }
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = jjVar.f16337k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().l1(jjVar.f16337k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, zxVar, 2);
            } else if (jj.c3(jjVar.f16337k)) {
                TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
                tL_getCallbackAnswer.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
                tL_getCallbackAnswer.f20010id = jjVar.P0();
                tL_getCallbackAnswer.data = keyboardButtonProto.getData();
                getConnectionsManager().sendRequest(tL_getCallbackAnswer, zxVar, 2);
            } else {
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
                tL_messages_getBotCallbackAnswer.msg_id = jjVar.f1();
                tL_messages_getBotCallbackAnswer.game = sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
                if (tL_inlineButtonTypeCallback != null && tL_inlineButtonTypeCallback.requires_password) {
                    if (inputCheckPasswordSRP != null) {
                        tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
                    } else {
                        tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_messages_getBotCallbackAnswer.password = tL_inputCheckPasswordEmpty;
                    tL_messages_getBotCallbackAnswer.flags |= 4;
                }
                if (keyboardButtonProto.getData() != null) {
                    tL_messages_getBotCallbackAnswer.flags |= 1;
                    tL_messages_getBotCallbackAnswer.data = keyboardButtonProto.getData();
                }
                getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, zxVar, 2);
            }
        }
    }

    public final TLRPC.TL_inputReplyToMessage o(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i10 = tL_messageReplyHeader.flags;
        if ((i10 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i10 & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = vp.r1(this.currentAccount).l1(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            ArrayList<TL_iv.RichText> arrayList = tL_messageReplyHeader.quote_rich;
            if (arrayList != null) {
                tL_inputReplyToMessage.quote_rich = arrayList;
            } else if ((tL_messageReplyHeader.flags & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if (arrayList == null && (tL_messageReplyHeader.flags & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((tL_messageReplyHeader.flags & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        byte[] bArr = tL_messageReplyHeader.poll_option;
        if (bArr != null) {
            tL_inputReplyToMessage.poll_option = bArr;
        }
        return tL_inputReplyToMessage;
    }

    public final void o0(jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        if (jjVar != null && keyboardButtonProto != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jj.B0(jjVar.f16337k));
            sb2.append("_");
            sb2.append(jjVar.f1());
            sb2.append("_");
            sb2.append(Utilities.f(keyboardButtonProto.getData()));
            sb2.append("_");
            if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(str);
            this.f17662n.put(sb2.toString(), jjVar);
            this.G.B();
        }
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.f20031id;
        tL_inputReplyToStory.peer = getMessagesController().i1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public final void p0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j10, long j11) {
        long E;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null && tL_inputMediaGame != null) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
            tL_messages_sendMedia.peer = inputPeer;
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                tL_messages_sendMedia.silent = vp.r1(this.currentAccount).e7.getBoolean("silent_" + (-inputPeer.channel_id), false);
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                tL_messages_sendMedia.silent = vp.r1(this.currentAccount).e7.getBoolean("silent_" + (-inputPeer.chat_id), false);
            } else {
                tL_messages_sendMedia.silent = vp.r1(this.currentAccount).e7.getBoolean("silent_" + inputPeer.user_id, false);
            }
            if (j10 != 0) {
                E = j10;
            } else {
                E = E();
            }
            tL_messages_sendMedia.random_id = E;
            tL_messages_sendMedia.message = "";
            tL_messages_sendMedia.media = tL_inputMediaGame;
            long M = w3.M(getMessagesController().L0(Long.valueOf(inputPeer.chat_id)), getMessagesController().M0(inputPeer.chat_id), false);
            if (M != d20.i(this.currentAccount).e()) {
                tL_messages_sendMedia.send_as = getMessagesController().i1(M);
            }
            long M1 = getMessagesController().M1(o5.n(inputPeer));
            if (M1 <= 0) {
                M1 = o5.k(getMessagesController().H2(o5.n(inputPeer)));
            }
            if (M1 > 0) {
                tL_messages_sendMedia.flags |= 2097152;
                tL_messages_sendMedia.allow_paid_stars = M1;
            }
            if (j11 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    nativeByteBuffer.writeInt32(3);
                    nativeByteBuffer.writeInt64(j10);
                    inputPeer.serializeToStream(nativeByteBuffer);
                    tL_inputMediaGame.serializeToStream(nativeByteBuffer);
                } catch (Exception e7) {
                    e = e7;
                    nativeByteBuffer2 = nativeByteBuffer;
                    f8.g(e, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j11 = getMessagesStorage().z(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_sendMedia, new s4(this, j11, 4));
                }
                j11 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_sendMedia, new s4(this, j11, 4));
        }
    }

    public final jj q(TLRPC.User user, String str, long j10, String str2, boolean z10, boolean z11, long j11) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        int j12 = getUserConfig().j();
        tL_messageService.f19814id = j12;
        tL_messageService.local_id = j12;
        tL_messageService.random_id = j11;
        tL_messageService.dialog_id = user.f19942id;
        tL_messageService.out = true;
        tL_messageService.unread = true;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.flags |= 256;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_messageService.peer_id = tL_peerUser2;
        tL_peerUser2.user_id = user.f19942id;
        tL_messageService.date = getConnectionsManager().getCurrentTime();
        tL_messageService.send_state = 1;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = new TLRPC.TL_messageActionGramTransfer();
        tL_messageActionGramTransfer.amount = j10;
        tL_messageActionGramTransfer.peer_address = str;
        tL_messageActionGramTransfer.transaction_id = "";
        tL_messageActionGramTransfer.comment = str2;
        tL_messageActionGramTransfer.comment_encrypted = z10;
        tL_messageActionGramTransfer.comment_encrypted_preparing = z11;
        tL_messageService.action = tL_messageActionGramTransfer;
        getUserConfig().v(false);
        jj jjVar = new jj(this.currentAccount, tL_messageService, false, true);
        jjVar.V1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
        getMessagesController().i5(0, user.f19942id, m5.j(jjVar));
        getNotificationCenter().k(zs.f19683s, new Object[0]);
        f0(tL_messageService, false);
        return jjVar;
    }

    public final int q0(final java.util.ArrayList r59, long r60, final boolean r62, final boolean r63, final boolean r64, final int r65, final int r66, final org.telegram.messenger.jj r67, final int r68, long r69, final long r71, final org.telegram.messenger.oj r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.q0(java.util.ArrayList, long, boolean, boolean, boolean, int, int, org.telegram.messenger.jj, int, long, long, org.telegram.messenger.oj):int");
    }

    public final void r0(org.telegram.messenger.oz r109) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.r0(org.telegram.messenger.oz):void");
    }

    public final void s0(jj jjVar, ArrayList arrayList, sg.o0 o0Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.yi yiVar) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (jjVar != null && k2Var != null) {
            TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
            TLRPC.Message message = jjVar.f16337k;
            if (message.isThreadMessage && message.fwd_from != null) {
                tL_messages_sendReaction.peer = getMessagesController().i1(jjVar.Z0());
                tL_messages_sendReaction.msg_id = jjVar.f16337k.fwd_from.saved_from_msg_id;
            } else {
                tL_messages_sendReaction.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
                tL_messages_sendReaction.msg_id = jjVar.f1();
            }
            tL_messages_sendReaction.add_to_recent = z11;
            if (z11 && o0Var != null) {
                ArrayList arrayList2 = ui.b0(this.currentAccount).C1;
                if (o0Var.f48434f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = o0Var.f48434f;
                    tL_reactionCustomEmoji = tL_reactionEmoji;
                } else {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji2.document_id = o0Var.f48435g;
                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                }
                arrayList2.add(0, tL_reactionCustomEmoji);
            }
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sg.o0 o0Var2 = (sg.o0) arrayList.get(i10);
                    if (o0Var2.f48435g != 0) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji3.document_id = o0Var2.f48435g;
                        tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                        tL_messages_sendReaction.flags |= 1;
                    } else if (o0Var2.f48434f != null) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji2.emoticon = o0Var2.f48434f;
                        tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                        tL_messages_sendReaction.flags |= 1;
                    }
                }
            }
            if (z10) {
                tL_messages_sendReaction.flags |= 2;
                tL_messages_sendReaction.big = true;
            }
            getConnectionsManager().sendRequest(tL_messages_sendReaction, new v4(10, this, yiVar));
        }
    }

    public final void t(org.telegram.messenger.jj r33, org.telegram.tgnet.TLRPC.TL_inputPollAnswer r34, org.telegram.tgnet.TLRPC.TL_photo r35, org.telegram.messenger.x20 r36, org.telegram.tgnet.TLRPC.TL_document r37, java.lang.String r38, org.telegram.tgnet.TLRPC.PhotoSize r39, java.util.HashMap r40, boolean r41, boolean r42, java.lang.Object r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.t(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.messenger.x20, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, org.telegram.tgnet.TLRPC$PhotoSize, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public final void t0(org.telegram.messenger.cz r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.t0(org.telegram.messenger.cz, boolean):void");
    }

    public final void u(jj jjVar, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            if (jj.c3(jjVar.f16337k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.f19877id = jj.S(jjVar.f1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.f19877id = jjVar.f1();
                tL_editMessage = tL_messages_editMessage;
            }
            tL_editMessage.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
            TLRPC.Message message = jjVar.f16337k;
            if (message != null && (message.flags & 1073741824) != 0) {
                tL_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_editMessage.flags |= 131072;
            }
            if (i10 != 0) {
                tL_editMessage.schedule_date = i10;
                int i12 = tL_editMessage.flags;
                tL_editMessage.flags = 32768 | i12;
                if (i11 != 0) {
                    tL_editMessage.schedule_repeat_period = i11;
                    tL_editMessage.flags = i12 | 294912;
                }
            }
            getConnectionsManager().sendRequest(tL_editMessage, new ci(this, k2Var, tL_editMessage, 11));
        }
    }

    public final void u0(TLRPC.Document document, String str, final long j10, final CharSequence charSequence, final x20 x20Var, final jj jjVar, final jj jjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final fj fjVar, final boolean z10, final int i10, final int i11, boolean z11, final Object obj, final sw swVar, final long j11, final long j12, final oj ojVar, final boolean z12) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        HashMap hashMap = null;
        if (o5.C(j10)) {
            if (getMessagesController().Z0(Integer.valueOf((int) (j10 & 4294967295L))) == null) {
                return;
            }
            document2 = new TLRPC.TL_document_layer82();
            document2.f19799id = document.f19799id;
            document2.access_hash = document.access_hash;
            document2.date = document.date;
            document2.mime_type = document.mime_type;
            byte[] bArr2 = document.file_reference;
            document2.file_reference = bArr2;
            if (bArr2 == null) {
                document2.file_reference = new byte[0];
            }
            document2.size = document.size;
            document2.dc_id = document.dc_id;
            document2.attributes = new ArrayList<>();
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f19800w = documentAttribute.f19800w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    document2.attributes.add(tL_documentAttributeVideo_layer159);
                } else {
                    document2.attributes.add(documentAttribute);
                }
            }
            if (document2.mime_type == null) {
                document2.mime_type = "";
            }
            TLRPC.PhotoSize w9 = b8.w(document.thumbs, 10, false, null, false);
            if ((w9 instanceof TLRPC.TL_photoSize) || (w9 instanceof TLRPC.TL_photoSizeProgressive) || (w9 instanceof TLRPC.TL_photoStrippedSize)) {
                b8.G(this.currentAccount);
                File K2 = b8.K(w9, null, true, true);
                if ((w9 instanceof TLRPC.TL_photoStrippedSize) || K2.exists()) {
                    try {
                        if (w9 instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = w9.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            K2.length();
                            byte[] bArr3 = new byte[(int) K2.length()];
                            new RandomAccessFile(K2, "r").readFully(bArr3);
                            photoSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = w9.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        photoSize.location = tL_fileLocation_layer82;
                        photoSize.size = w9.size;
                        photoSize.f19818w = w9.f19818w;
                        photoSize.h = w9.h;
                        photoSize.type = w9.type;
                        photoSize.bytes = bArr;
                        document2.thumbs.add(photoSize);
                        document2.flags |= 1;
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
            }
            if (document2.thumbs.isEmpty()) {
                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                tL_photoSizeEmpty.type = "s";
                document2.thumbs.add(tL_photoSizeEmpty);
            }
        } else {
            document2 = document;
        }
        if (jj.s3(document2, false)) {
            I.c(new Runnable() {
                @Override
                public final void run() {
                    String str2;
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final TLRPC.Document document3 = document2;
                    String q6 = ic.b(document3).q(null, null, false);
                    if ("video/mp4".equals(document3.mime_type)) {
                        str2 = ".mp4";
                    } else if ("video/x-matroska".equals(document3.mime_type)) {
                        str2 = ".mkv";
                    } else {
                        str2 = "";
                    }
                    File file = new File(b8.z(3), sc.e.A(q6, str2));
                    if (!file.exists()) {
                        file = new File(b8.z(2), sc.e.A(q6, str2));
                    }
                    final qz qzVar = qz.this;
                    qz.w(qzVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                    final String[] strArr = {qz.D(qzVar.getAccountInstance(), b8.w(document3.thumbs, 320, false, null, false), bitmapArr, true, true)};
                    final x20 x20Var2 = x20Var;
                    final long j13 = j10;
                    final jj jjVar3 = jjVar;
                    final jj jjVar4 = jjVar2;
                    final boolean z13 = z10;
                    final int i13 = i10;
                    final int i14 = i11;
                    final Object obj2 = obj;
                    final fj fjVar2 = fjVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.kn knVar2 = knVar;
                    final sw swVar2 = swVar;
                    final long j14 = j11;
                    final long j15 = j12;
                    final oj ojVar2 = ojVar;
                    final CharSequence charSequence2 = charSequence;
                    final boolean z14 = z12;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            String str3;
                            qz qzVar2 = qz.this;
                            qzVar2.getClass();
                            Bitmap[] bitmapArr2 = bitmapArr;
                            if (bitmapArr2[0] != null) {
                                String[] strArr2 = strArr;
                                if (strArr2[0] != null) {
                                    hc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                }
                            }
                            oz f7 = oz.f((TLRPC.TL_document) document3, x20Var2, null, j13, jjVar3, jjVar4, null, null, null, null, z13, i13, i14, 0, obj2, fjVar2, false);
                            f7.H = storyItem2;
                            f7.J = knVar2;
                            f7.K = swVar2;
                            f7.Q = j14;
                            f7.R = j15;
                            f7.T = ojVar2;
                            CharSequence charSequence3 = charSequence2;
                            if (charSequence3 != null) {
                                str3 = charSequence3.toString();
                            } else {
                                str3 = null;
                            }
                            f7.f17367b = str3;
                            f7.L = z14;
                            qzVar2.r0(f7);
                        }
                    });
                }
            });
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put("query", str);
        }
        oz f7 = oz.f((TLRPC.TL_document) document2, null, null, j10, jjVar, jjVar2, null, null, null, hashMap, z10, i10, i11, 0, obj, fjVar, z11);
        f7.H = storyItem;
        f7.J = knVar;
        f7.K = swVar;
        f7.Q = j11;
        f7.R = j12;
        f7.T = ojVar;
        f7.L = z12;
        r0(f7);
    }

    public final void v(jj jjVar, TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (jjVar != null && richMessage != null && jjVar.f16337k != null) {
            if (jjVar.Y2() && jjVar.f16337k.reqId != 0) {
                getConnectionsManager().cancelRequest(jjVar.f16337k.reqId, true);
                jjVar.f16337k.reqId = 0;
            }
            if (jj.c3(jjVar.f16337k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.f19877id = jj.S(jjVar.f1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.f19877id = jjVar.f1();
                tL_editMessage = tL_messages_editMessage;
            }
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = tL_editMessage;
            tL_messages_editMessage2.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
            tL_messages_editMessage2.rich_message = m0(arrayList, richMessage);
            int i10 = tL_messages_editMessage2.flags;
            tL_messages_editMessage2.flags = 8388608 | i10;
            if (jjVar.f16357p1) {
                tL_messages_editMessage2.schedule_date = jjVar.f16337k.date;
                tL_messages_editMessage2.flags = i10 | 8421376;
            }
            TLRPC.Message message = jjVar.f16337k;
            if ((message.flags & 1073741824) != 0) {
                tL_messages_editMessage2.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_messages_editMessage2.flags |= 131072;
            }
            message.rich_message = richMessage;
            message.send_state = 3;
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage2, new t4(jjVar, this, tL_messages_editMessage2, k2Var, z10));
            TLRPC.Message message2 = jjVar.f16337k;
            if (message2 != null) {
                message2.reqId = sendRequest;
            }
            getNotificationCenter().k(zs.m0, Long.valueOf(jj.B0(jjVar.f16337k)), m5.j(jjVar));
        }
    }

    public final void v0(TLRPC.Document document, String str, long j10, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.kn knVar, fj fjVar, boolean z10, int i10, int i11, boolean z11, Object obj, sw swVar, long j11, long j12, oj ojVar) {
        u0(document, str, j10, null, null, jjVar, jjVar2, storyItem, knVar, fjVar, z10, i10, i11, z11, obj, swVar, j11, j12, ojVar, false);
    }

    public final int w0(jj jjVar, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (jjVar != null) {
            String str = "poll_" + jjVar.E1();
            if (!this.f17663r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = jjVar.f1();
                tL_messages_sendVote.peer = getMessagesController().i1(jj.B0(jjVar.f16337k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i10);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i10] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.f17665w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new r6(this, jjVar, str, runnable, 5));
            }
        }
        return 0;
    }

    public final cz y(int i10, long j10) {
        int i11;
        cz czVar = null;
        int i12 = Integer.MIN_VALUE;
        for (Map.Entry entry : this.f17658a.entrySet()) {
            ArrayList arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                cz czVar2 = (cz) arrayList.get(i13);
                int i14 = czVar2.e;
                if ((i14 == 4 || i14 == 0) && czVar2.f15107a == j10) {
                    jj jjVar = czVar2.f15116m;
                    if (jjVar != null) {
                        i11 = jjVar.f1();
                    } else {
                        ArrayList arrayList2 = czVar2.f15126x;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            i11 = ((jj) i0.a.g(1, czVar2.f15126x)).f1();
                        } else {
                            i11 = 0;
                        }
                    }
                    if (i11 != 0 && i11 > i10 && czVar == null && i12 < i11) {
                        czVar = czVar2;
                        i12 = i11;
                    }
                }
            }
        }
        return czVar;
    }

    public final void z0(org.telegram.messenger.jj r28, org.telegram.tgnet.TLRPC.Message r29, int r30, java.util.List r31, boolean r32, int r33, java.util.HashMap r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.z0(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$Message, int, java.util.List, boolean, int, java.util.HashMap):void");
    }
}
