package defpackage;

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.TwoStepVerificationActivity;
public final class z3a extends pf0 implements gk7 {
    public static final co3 J = new co3("mediaSendQueue");
    public static final ThreadPoolExecutor K;
    public static volatile z3a[] L;
    public final vf6 E;
    public final HashMap F;
    public final HashMap G;
    public final ep H;
    public final HashMap I;
    public final HashMap a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final vf6 f;
    public final vf6 h;
    public final HashMap n;
    public final HashMap r;
    public final HashMap s;
    public final HashMap w;
    public final vf6 x;
    public final HashMap y;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        K = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        L = new z3a[4];
    }

    public z3a(int i) {
        super(i);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new vf6();
        this.h = new vf6();
        this.n = new HashMap();
        this.r = new HashMap();
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new vf6();
        this.y = new HashMap();
        this.E = new vf6();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new ep(new u39(this, (byte) 10));
        this.I = new HashMap();
        gl.d3(new zk9(this, (byte) 28));
    }

    public static void A0(TLRPC.Message message, SerializedData serializedData) {
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
        for (int i = 0; i < size; i++) {
            message.entities.get(i).serializeToStream(serializedData);
        }
    }

    public static z3a B(int i) {
        z3a z3aVar;
        z3a z3aVar2 = L[i];
        if (z3aVar2 == null) {
            synchronized (z3a.class) {
                z3aVar = L[i];
                if (z3aVar == null) {
                    z3a[] z3aVarArr = L;
                    z3a z3aVar3 = new z3a(i);
                    z3aVarArr[i] = z3aVar3;
                    z3aVar = z3aVar3;
                }
            }
            return z3aVar;
        }
        return z3aVar2;
    }

    public static String C(j5 j5Var, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z, boolean z2) {
        String str;
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF S1 = gb2.S1(photoSize.w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                ba4.G(j5Var.a);
                File J2 = ba4.J(photoSize, null, z2, true);
                FileInputStream fileInputStream = new FileInputStream(J2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / S1.x, options.outHeight / S1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(J2);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        Locale locale = Locale.US;
        if (z) {
            str = "%d_%d@%d_%d_b";
        } else {
            str = "%d_%d@%d_%d";
        }
        return String.format(locale, str, Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (S1.x / gl.p)), Integer.valueOf((int) (S1.y / gl.p)));
    }

    public static long D() {
        long j = 0;
        while (j == 0) {
            j = Utilities.b.nextLong();
        }
        return j;
    }

    public static TLRPC.PhotoSize F(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.w = photoSize.w;
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

    public static CharSequence G(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence m1 = gl.m1(charSequence);
        if (m1.length() == 0) {
            return m1;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    public static void J(java.util.ArrayList r85, final long r86, boolean r88, boolean r89, boolean r90, final defpackage.j5 r91, long r92, final defpackage.k27 r94, final org.telegram.tgnet.TLRPC.TL_inputPollAnswer r95, final defpackage.k27 r96, final defpackage.k27 r97, final boolean r98, final int r99, final int r100, final org.telegram.tgnet.tl.TL_stories.StoryItem r101, final defpackage.bu1 r102, final defpackage.j1a r103, final long r104, final boolean r106, final long r107, final long r109, final defpackage.u47 r111, final defpackage.we8 r112, boolean r113, defpackage.gi3 r114, final boolean r115) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.J(java.util.ArrayList, long, boolean, boolean, boolean, j5, long, k27, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, k27, k27, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, bu1, j1a, long, boolean, long, long, u47, we8, boolean, gi3, boolean):void");
    }

    public static void Q(j5 j5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, k27 k27Var, k27 k27Var2, bu1 bu1Var, boolean z, int i, int i2, j1a j1aVar, long j2, long j3, long j4) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i3 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
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
        while (i3 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i3);
            i3++;
            j(pageBlock2, identityHashMap);
        }
        x3a c = x3a.c(null, null, null, null, null, null, null, null, null, null, j, null, k27Var, k27Var2, null, true, null, null, null, null, z, i, i2, 0, null, null, false, false);
        c.Y = richMessage;
        c.Z = arrayList4;
        c.J = bu1Var;
        c.K = j1aVar;
        c.O = j2;
        c.R = j3;
        c.Q = j4;
        B(j5Var.a).q0(c);
    }

    public static void R(final int i, final long j, final long j2, final long j3, final j5 j5Var, final bu1 bu1Var, final k27 k27Var, final k27 k27Var2, final j1a j1aVar, final HashMap hashMap, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final d dVar, final boolean z) {
        x3a d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult != null) {
            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
                new Thread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2a.run():void");
                    }
                }).run();
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
                if (cf3.B(j)) {
                    for (int i2 = 0; i2 < botInlineResult.send_message.entities.size(); i2++) {
                        TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i2);
                        if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                            tL_webPagePending = new TLRPC.TL_webPagePending();
                            String str = botInlineResult.send_message.message;
                            int i3 = messageEntity.offset;
                            tL_webPagePending.url = str.substring(i3, messageEntity.length + i3);
                            break;
                        }
                    }
                }
                tL_webPagePending = null;
                TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                x3a b = x3a.b(botInlineMessage2.message, j, k27Var, k27Var2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z, i, 0, null, false);
                b.K = j1aVar;
                b.J = bu1Var;
                b.Q = j2;
                b.R = j3;
                B(j5Var.a).q0(b);
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
                TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
                x3a c = x3a.c(null, null, null, null, null, null, null, null, null, null, j, null, k27Var, k27Var2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z, i, 0, 0, null, null, false, false);
                c.Y = richMessage;
                c.K = j1aVar;
                c.J = bu1Var;
                c.Q = j2;
                c.R = j3;
                B(j5Var.a).q0(c);
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
                x3a d2 = x3a.d(tL_messageMediaWidget, j, k27Var, k27Var2, botInlineResult.send_message.reply_markup, hashMap, z, i);
                d2.b = tL_botInlineMessageWidget.message;
                d2.w = tL_botInlineMessageWidget.entities;
                d2.L = tL_botInlineMessageWidget.invert_media;
                d2.K = j1aVar;
                d2.J = bu1Var;
                d2.Q = j2;
                d2.R = j3;
                B(j5Var.a).q0(d2);
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
                x3a d3 = x3a.d(tL_messageMediaVenue, j, k27Var, k27Var2, botInlineMessage3.reply_markup, hashMap, z, i);
                d3.K = j1aVar;
                d3.J = bu1Var;
                d3.Q = j2;
                d3.R = j3;
                B(j5Var.a).q0(d3);
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
                if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                    tL_messageMediaGeo.geo = botInlineMessage4.geo;
                    tL_messageMediaGeo.heading = botInlineMessage4.heading;
                    d = x3a.d(tL_messageMediaGeo, j, k27Var, k27Var2, botInlineMessage4.reply_markup, hashMap, z, i);
                } else {
                    TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                    TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                    int i4 = botInlineMessage5.period;
                    if (i4 == 0) {
                        i4 = 900;
                    }
                    tL_messageMediaGeoLive.period = i4;
                    tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                    tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                    tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                    d = x3a.d(tL_messageMediaGeoLive, j, k27Var, k27Var2, botInlineMessage5.reply_markup, hashMap, z, i);
                }
                d.K = j1aVar;
                d.J = bu1Var;
                d.Q = j2;
                d.R = j3;
                B(j5Var.a).q0(d);
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
                x3a g = x3a.g(tL_user, j, k27Var, k27Var2, botInlineResult.send_message.reply_markup, hashMap, z, i, 0);
                g.K = j1aVar;
                g.J = bu1Var;
                g.Q = j2;
                g.R = j3;
                B(j5Var.a).q0(g);
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                if (cf3.B(j)) {
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
                x3a c2 = x3a.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j, null, k27Var, k27Var2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z, i, 0, 0, null, null, false, false);
                c2.K = j1aVar;
                c2.J = bu1Var;
                c2.Q = j2;
                c2.R = j3;
                B(j5Var.a).q0(c2);
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
                tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
                TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
                x3a b2 = x3a.b(botInlineMessage7.message, j, k27Var, k27Var2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z, i, 0, null, false);
                b2.K = j1aVar;
                b2.J = bu1Var;
                b2.Q = j2;
                b2.R = j3;
                b2.L = botInlineResult.send_message.invert_media;
                B(j5Var.a).q0(b2);
            }
        }
    }

    public static void S(j5 j5Var, String str, String str2, Uri uri, String str3, String str4, long j, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, bu1 bu1Var, boolean z, gi3 gi3Var, j1a j1aVar) {
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
        U(0, j, 0L, 0L, 0L, j5Var, bu1Var, gi3Var, k27Var, k27Var2, null, null, null, j1aVar, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, storyItem, z, false);
    }

    public static int T(defpackage.j5 r40, java.lang.String r41, java.lang.String r42, android.net.Uri r43, java.lang.String r44, final long r45, final defpackage.k27 r47, final defpackage.k27 r48, final org.telegram.tgnet.tl.TL_stories.StoryItem r49, final defpackage.bu1 r50, final java.util.ArrayList r51, final defpackage.k27 r52, long[] r53, boolean r54, java.lang.CharSequence r55, final boolean r56, int r57, java.lang.Integer[] r58, boolean r59, final defpackage.j1a r60, final long r61, final boolean r63, final long r64, final long r66, final defpackage.u47 r68, final defpackage.we8 r69, final int r70) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.T(j5, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, k27, k27, org.telegram.tgnet.tl.TL_stories$StoryItem, bu1, java.util.ArrayList, k27, long[], boolean, java.lang.CharSequence, boolean, int, java.lang.Integer[], boolean, j1a, long, boolean, long, long, u47, we8, int):int");
    }

    public static void U(final int i, final long j, final long j2, final long j3, final long j4, final j5 j5Var, final bu1 bu1Var, final gi3 gi3Var, final k27 k27Var, final k27 k27Var2, final k27 k27Var3, final u47 u47Var, final we8 we8Var, final j1a j1aVar, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final TL_stories.StoryItem storyItem, final boolean z, final boolean z2) {
        if (arrayList != null || arrayList2 != null || arrayList3 != null) {
            if (arrayList != null && arrayList2 != null && arrayList.size() != arrayList2.size()) {
                return;
            }
            Utilities.e.c(new Runnable() {
                @Override
                public final void run() {
                    int i2;
                    boolean z3;
                    String str3;
                    ArrayList arrayList7;
                    String str4;
                    long j5;
                    boolean z4;
                    boolean z5;
                    int i3;
                    j5 j5Var2;
                    Uri uri;
                    long j6;
                    int i4;
                    String str5;
                    u47 u47Var2;
                    long j7;
                    int i5;
                    ArrayList arrayList8;
                    boolean z6;
                    ArrayList arrayList9;
                    boolean z7;
                    int i6;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j8 = j;
                    boolean B = cf3.B(j8);
                    ArrayList arrayList10 = arrayList;
                    String str6 = str;
                    we8 we8Var2 = we8Var;
                    j5 j5Var3 = j5Var;
                    int i7 = i;
                    String str7 = str2;
                    k27 k27Var4 = k27Var;
                    k27 k27Var5 = k27Var2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str8 = str7;
                    bu1 bu1Var2 = bu1Var;
                    ArrayList arrayList11 = arrayList4;
                    k27 k27Var6 = k27Var3;
                    boolean z8 = z;
                    gi3 gi3Var2 = gi3Var;
                    j1a j1aVar2 = j1aVar;
                    gi3 gi3Var3 = gi3Var2;
                    int i8 = i7;
                    long j9 = j2;
                    boolean z9 = z2;
                    String str9 = str6;
                    long j10 = j9;
                    long j11 = j3;
                    long j12 = j4;
                    u47 u47Var3 = u47Var;
                    if (arrayList10 != null) {
                        int size = arrayList10.size();
                        int i9 = 0;
                        i2 = 0;
                        int i10 = 0;
                        z3 = true;
                        while (i9 < size) {
                            gi3 gi3Var4 = gi3Var3;
                            if (i9 == 0) {
                                str5 = str9;
                            } else {
                                str5 = null;
                            }
                            boolean z10 = z9;
                            if (!B && size > 1 && i10 % 10 == 0 && we8Var2 == null) {
                                u47Var2 = u47Var3;
                                j7 = j8;
                                long j13 = jArr[0];
                                if (j13 != 0) {
                                    i5 = i8;
                                    z3a.y(j5Var3, j13, i5);
                                } else {
                                    i5 = i8;
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i10 = 0;
                            } else {
                                u47Var2 = u47Var3;
                                j7 = j8;
                                i5 = i8;
                            }
                            int i11 = i10 + 1;
                            long j14 = jArr[0];
                            if ((we8Var2 == null && i11 == 10) || i9 == size - 1) {
                                arrayList8 = arrayList11;
                                z6 = true;
                            } else {
                                arrayList8 = arrayList11;
                                z6 = false;
                            }
                            String str10 = (String) arrayList10.get(i9);
                            u47 u47Var4 = u47Var2;
                            String str11 = (String) arrayList2.get(i9);
                            int i12 = i11;
                            String str12 = str8;
                            if (i9 == 0) {
                                arrayList9 = arrayList8;
                            } else {
                                arrayList9 = null;
                            }
                            String str13 = str9;
                            if (gi3Var4 == null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            long j15 = j10;
                            if (!z3) {
                                j10 = 0;
                            }
                            ArrayList arrayList12 = arrayList5;
                            if (arrayList12 != null) {
                                i6 = ((Integer) arrayList12.get(i9)).intValue();
                            } else {
                                i6 = -1;
                            }
                            int i13 = i9;
                            int i14 = size;
                            long j16 = j7;
                            ArrayList arrayList13 = arrayList10;
                            ArrayList arrayList14 = arrayList8;
                            int i15 = i5;
                            j8 = j16;
                            i2 = z3a.T(j5Var3, str10, str11, null, str12, j8, k27Var4, k27Var5, storyItem2, bu1Var2, arrayList9, k27Var6, jArr, z6, str5, z8, i15, numArr, z7, j1aVar2, j10, z10, j11, j12, u47Var4, we8Var2, i6);
                            j5 j5Var4 = j5Var3;
                            long j17 = jArr[0];
                            i12 = (j14 != j17 || j17 == -1) ? 1 : 1;
                            if (i2 != 0 && z6 && we8Var2 == null && j17 != 0) {
                                z3a.y(j5Var4, j17, i15);
                                jArr[0] = 0;
                                i12 = 0;
                            }
                            int i16 = i13 + 1;
                            i8 = i15;
                            j5Var3 = j5Var4;
                            str8 = str12;
                            u47Var3 = u47Var4;
                            z3 = false;
                            arrayList10 = arrayList13;
                            arrayList11 = arrayList14;
                            str9 = str13;
                            j10 = j15;
                            gi3Var3 = gi3Var4;
                            i9 = i16;
                            z9 = z10;
                            size = i14;
                            i10 = i12;
                        }
                    } else {
                        i2 = 0;
                        z3 = true;
                    }
                    boolean z11 = z9;
                    j5 j5Var5 = j5Var3;
                    ArrayList arrayList15 = arrayList10;
                    u47 u47Var5 = u47Var3;
                    String str14 = str8;
                    ArrayList arrayList16 = arrayList11;
                    gi3 gi3Var5 = gi3Var3;
                    int i17 = i8;
                    String str15 = str9;
                    long j18 = j10;
                    ArrayList arrayList17 = arrayList3;
                    if (arrayList17 != null) {
                        jArr[0] = 0;
                        int size2 = arrayList17.size();
                        boolean z12 = z11;
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < arrayList17.size()) {
                            if (i18 == 0 && (arrayList15 == null || arrayList15.size() == 0)) {
                                str3 = str15;
                            } else {
                                str3 = null;
                            }
                            if (i18 == 0 && (arrayList15 == null || arrayList15.size() == 0)) {
                                arrayList7 = arrayList16;
                            } else {
                                arrayList7 = null;
                            }
                            ArrayList arrayList18 = arrayList7;
                            if (!B && size2 > 1 && i19 % 10 == 0 && we8Var2 == null) {
                                str4 = str14;
                                j5 = j8;
                                long j19 = jArr[0];
                                if (j19 != 0) {
                                    z3a.y(j5Var5, j19, i17);
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i19 = 0;
                            } else {
                                str4 = str14;
                                j5 = j8;
                            }
                            int i20 = i19 + 1;
                            long j20 = jArr[0];
                            if ((we8Var2 == null && i20 == 10) || i18 == size2 - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Uri uri2 = (Uri) arrayList17.get(i18);
                            if (gi3Var5 == null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z3) {
                                i3 = size2;
                                j5Var2 = j5Var5;
                                uri = uri2;
                                j8 = j5;
                                j6 = j18;
                            } else {
                                i3 = size2;
                                j5Var2 = j5Var5;
                                uri = uri2;
                                j8 = j5;
                                j6 = 0;
                            }
                            ArrayList arrayList19 = arrayList17;
                            ArrayList arrayList20 = arrayList6;
                            if (arrayList20 != null) {
                                i4 = ((Integer) arrayList20.get(i18)).intValue();
                            } else {
                                i4 = -1;
                            }
                            int i21 = i18;
                            int i22 = i17;
                            int i23 = i20;
                            str14 = str4;
                            boolean z13 = z12;
                            int i24 = i3;
                            i2 = z3a.T(j5Var2, null, null, uri, str14, j8, k27Var4, k27Var5, storyItem2, bu1Var2, arrayList18, k27Var6, jArr, z4, str3, z8, i22, numArr, z5, j1aVar2, j6, z13, j11, j12, u47Var5, we8Var2, i4);
                            i17 = i22;
                            long j21 = jArr[0];
                            if (j20 != j21 || j21 == -1) {
                                i23 = 1;
                            }
                            if (i2 != 0 && z4 && we8Var2 == null && j21 != 0) {
                                z3a.y(j5Var2, j21, i17);
                                jArr[0] = 0;
                                i19 = 0;
                            } else {
                                i19 = i23;
                            }
                            i18 = i21 + 1;
                            j5Var5 = j5Var2;
                            z12 = z13;
                            z3 = false;
                            size2 = i24;
                            arrayList17 = arrayList19;
                        }
                    }
                    j5 j5Var6 = j5Var5;
                    int i25 = i2;
                    if (gi3Var5 != null) {
                        ((fo5) gi3Var5.a).n();
                    }
                    if (i25 != 0) {
                        gl.d3(new on7(i25, j5Var6, (byte) 13));
                    }
                }
            });
        }
    }

    public static void V(j5 j5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j, k27 k27Var, k27 k27Var2, boolean z, int i) {
        j5 j5Var2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        String str2 = null;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            j5Var2 = j5Var;
            ArrayList Y = hq6.d0(j5Var2.a).Y(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = Y;
        } else {
            j5Var2 = j5Var;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        U(i, j, 0L, 0L, 0L, j5Var2, null, null, k27Var, k27Var2, null, null, null, null, str2, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, null, z, false);
    }

    public static void W(final j5 j5Var, final ArrayList arrayList, final long j, final k27 k27Var, final k27 k27Var2, final TL_stories.StoryItem storyItem, final bu1 bu1Var, final boolean z, boolean z2, final k27 k27Var3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z3, final int i, final int i2, final boolean z4, final gi3 gi3Var, final j1a j1aVar, final long j2, final boolean z5, final long j3, final long j4, final u47 u47Var, final we8 we8Var, final boolean z6) {
        final boolean z7;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z7 = z2;
                break;
            } else if (((y3a) arrayList.get(i3)).h > 0) {
                z7 = false;
                break;
            } else {
                i3++;
            }
        }
        final long j5 = we8Var != null ? we8Var.c : 0L;
        final boolean z8 = j5 != 0;
        J.c(new Runnable() {
            @Override
            public final void run() {
                z3a.J(arrayList, j, z, z7, z8, j5Var, j5, k27Var3, tL_inputPollAnswer, k27Var, k27Var2, z3, i, i2, storyItem, bu1Var, j1aVar, j2, z5, j3, j4, u47Var, we8Var, z6, gi3Var, z4);
            }
        });
    }

    public static void X(j5 j5Var, Uri uri, long j, k27 k27Var, k27 k27Var2, gi3 gi3Var, k27 k27Var3, boolean z, int i, j1a j1aVar) {
        Y(j5Var, null, null, uri, j, k27Var, k27Var2, null, null, null, gi3Var, 0, k27Var3, null, z, i, false, null, j1aVar, 0L, 0L, 0L, null);
    }

    public static void Y(j5 j5Var, String str, String str2, Uri uri, long j, k27 k27Var, k27 k27Var2, bu1 bu1Var, ArrayList arrayList, ArrayList arrayList2, gi3 gi3Var, int i, k27 k27Var3, oac oacVar, boolean z, int i2, boolean z2, CharSequence charSequence, j1a j1aVar, long j2, long j3, long j4, u47 u47Var) {
        ?? obj = new Object();
        obj.c = str;
        obj.e = str2;
        obj.a = uri;
        if (charSequence != null) {
            obj.d = charSequence.toString();
        }
        obj.i = arrayList;
        obj.h = i;
        if (arrayList2 != null) {
            obj.j = new ArrayList(arrayList2);
        }
        obj.k = oacVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(obj);
        W(j5Var, arrayList3, j, k27Var, k27Var2, null, bu1Var, z2, false, k27Var3, null, z, i2, 0, false, gi3Var, j1aVar, j2, false, j3, j4, u47Var, null, false);
    }

    public static void Z(j5 j5Var, CharSequence charSequence, long j, long j2, boolean z, int i, int i2) {
        ad7.Y(j5Var.a).a.c(new n1a(charSequence, j5Var, j2, j, z, i, i2, (byte) 1));
    }

    public static void a0(int i, int i2, long j, long j2, long j3, long j4, j5 j5Var, bu1 bu1Var, k27 k27Var, k27 k27Var2, k27 k27Var3, u47 u47Var, j1a j1aVar, oac oacVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        if (str != null && str.length() != 0) {
            new Thread(new u2a(i, i2, j, j2, j3, j4, j5Var, bu1Var, k27Var3, k27Var, k27Var2, u47Var, j1aVar, oacVar, charSequence, str, str2, arrayList, photo, storyItem, z3, z, z2)).start();
        }
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (gm gmVar : (gm[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), gm.class)) {
                if (gmVar.fromEmojiKeyboard) {
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
                int i = 0;
                while (i < size) {
                    TL_iv.RichText richText3 = arrayList.get(i);
                    i++;
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
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    public static TL_iv.TL_inputRichMessage l0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage != null) {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i = 0; i < richMessage.blocks.size(); i++) {
                tL_inputRichMessage.blocks.add(x0(richMessage.blocks.get(i)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.Photo photo = arrayList3.get(i2);
                    i2++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.id = photo2.id;
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
                int i3 = 0;
                while (i3 < size2) {
                    TLRPC.Document document = arrayList5.get(i3);
                    i3++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document2.id;
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

    public static void m(long j, long j2, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            channel.position(j);
            ByteBuffer allocate = ByteBuffer.allocate(262144);
            while (j2 > 0) {
                allocate.clear();
                allocate.limit((int) Math.min(allocate.capacity(), j2));
                int read = channel.read(allocate);
                if (read <= 0) {
                    break;
                }
                allocate.flip();
                channel2.write(allocate);
                j2 -= read;
            }
            channel2.force(true);
            channel2.close();
            channel.close();
        } catch (Throwable th) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static oac n(long j, String str) {
        int i;
        int i2;
        long d;
        float f;
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j);
        if (iArr[0] == 0) {
            if (w01.a) {
                fa4.b("video hasn't avc1 atom");
                return null;
            }
            return null;
        }
        long length = new File(str).length();
        int z = MediaController.z(str);
        if (z == -1) {
            z = iArr[3];
        }
        float f2 = iArr[4];
        long j2 = iArr[5];
        int i3 = iArr[7];
        oac oacVar = new oac();
        oacVar.a = -1L;
        oacVar.b = -1L;
        oacVar.m = z;
        oacVar.o = str;
        oacVar.p = j;
        oacVar.n = i3;
        oacVar.r = (long) Math.ceil(f2);
        boolean z2 = true;
        int i4 = iArr[1];
        oacVar.h = i4;
        oacVar.k = i4;
        int i5 = iArr[2];
        oacVar.i = i5;
        oacVar.l = i5;
        oacVar.g = iArr[8];
        oacVar.v = f2 * 1000.0f;
        float max = Math.max(i4, i5);
        float f3 = 1280.0f;
        if (max > 1280.0f) {
            i = 4;
        } else if (max > 854.0f) {
            i = 3;
        } else if (max > 640.0f) {
            i = 2;
        } else {
            i = 1;
        }
        up3 q = up3.q(y6c.t0);
        int e = a.e();
        if (e == 1) {
            i2 = q.p().h;
        } else if (e == 2) {
            i2 = q.o().h;
        } else {
            i2 = q.n().h;
        }
        int round = Math.round(i2 / (100.0f / i));
        if (round > i) {
            round = i;
        }
        if (new File(str).length() < 1048576000) {
            if (round == i && Math.max(oacVar.h, oacVar.i) <= 1280) {
                z2 = false;
            } else {
                if (round != 1) {
                    if (round != 2) {
                        if (round == 3) {
                            f3 = 848.0f;
                        }
                    } else {
                        f3 = 640.0f;
                    }
                } else {
                    f3 = 432.0f;
                }
                int i6 = oacVar.h;
                int i7 = oacVar.i;
                if (i6 > i7) {
                    f = i6;
                } else {
                    f = i7;
                }
                float f4 = f3 / f;
                oacVar.k = Math.round((i6 * f4) / 2.0f) << 1;
                oacVar.l = Math.round((oacVar.i * f4) / 2.0f) << 1;
            }
            z = MediaController.P(oacVar.i, oacVar.h, z, oacVar.l, oacVar.k);
        } else {
            z2 = false;
        }
        if (!z2) {
            oacVar.k = oacVar.h;
            oacVar.l = oacVar.i;
            oacVar.m = z;
            oacVar.q = length;
            d = length;
        } else {
            oacVar.m = z;
            d = ls6.d(f2 / 1000.0f, MediaController.q(oacVar.k, oacVar.l, z, false), 8.0f, (float) j2);
            oacVar.q = d;
        }
        if (d == 0) {
            oacVar.q = 1L;
        }
        return oacVar;
    }

    public static Bitmap q(int i, String str) {
        float f;
        if (i == 2) {
            f = 1920.0f;
        } else if (i == 3) {
            f = 96.0f;
        } else {
            f = 512.0f;
        }
        Bitmap r = r(str, 0L, null, false);
        if (r != null) {
            int width = r.getWidth();
            int height = r.getHeight();
            float f2 = width;
            if (f2 > f || height > f) {
                float max = Math.max(width, height) / f;
                return Bitmap.createScaledBitmap(r, (int) (f2 / max), (int) (height / max), true);
            }
        }
        return r;
    }

    public static Bitmap r(String str, long j, int[] iArr, boolean z) {
        if (z) {
            km kmVar = new km(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q = kmVar.q(j, z);
            if (iArr != null) {
                iArr[0] = kmVar.d[2];
            }
            kmVar.u();
            if (q == null) {
                return r(str, j, iArr, false);
            }
            return q;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j, 3);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused3) {
        }
        return bitmap;
    }

    public static void v(j5 j5Var, boolean z, TLObject tLObject, String str, Uri uri, long j, boolean z2) {
        int i;
        boolean z3;
        TLRPC.PhotoSize W;
        TLRPC.PhotoSize W2;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w = ba4.w(tL_photo.sizes, 90, false, null, false);
            if (!(w instanceof TLRPC.TL_photoStrippedSize) && !(w instanceof TLRPC.TL_photoPathSize)) {
                ba4.G(j5Var.a);
                z3 = ba4.J(w, null, true, true).exists();
            } else {
                z3 = true;
            }
            TLRPC.PhotoSize w2 = ba4.w(tL_photo.sizes, gl.Y0(z2), false, null, false);
            ba4.G(j5Var.a);
            boolean exists = ba4.J(w2, null, false, true).exists();
            if (!z3 || !exists) {
                Bitmap G = fl5.G(str, uri, gl.Y0(false), gl.Y0(false), true);
                if (G == null) {
                    G = fl5.G(str, uri, 800.0f, 800.0f, true);
                }
                Bitmap bitmap = G;
                if (!exists && (W2 = fl5.W(w2, bitmap, Bitmap.CompressFormat.JPEG, gl.Y0(false), gl.Y0(false), 80, false, 101, 101, false)) != w2) {
                    tL_photo.sizes.add(0, W2);
                }
                if (!z3 && (W = fl5.W(w, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w) {
                    tL_photo.sizes.add(0, W);
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        } else if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((k27.J4(tL_document) || k27.M3(tL_document)) && k27.W2(tL_document)) {
                int i2 = 320;
                TLRPC.PhotoSize w3 = ba4.w(tL_document.thumbs, 320, false, null, false);
                if (!(w3 instanceof TLRPC.TL_photoStrippedSize) && !(w3 instanceof TLRPC.TL_photoPathSize)) {
                    ba4.G(j5Var.a);
                    if (!ba4.J(w3, null, true, true).exists()) {
                        Bitmap r = r(str, j, null, false);
                        if (r == null) {
                            r = q(1, str);
                        }
                        Bitmap bitmap2 = r;
                        if (z) {
                            i2 = 90;
                        }
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                        float f = i2;
                        if (i2 > 90) {
                            i = 80;
                        } else {
                            i = 55;
                        }
                        int i3 = i;
                        ThreadLocal threadLocal = fl5.I;
                        arrayList.set(0, fl5.W(w3, bitmap2, Bitmap.CompressFormat.JPEG, f, f, i3, false, 0, 0, true));
                    }
                }
            }
        }
    }

    public static void w(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, oac oacVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.w = Integer.parseInt(extractMetadata);
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
                if (oacVar == null && (intValue == 90 || intValue == 270)) {
                    int i = tL_documentAttributeVideo.w;
                    tL_documentAttributeVideo.w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i;
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            fa4.g(e, true);
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
            }
            try {
                MediaPlayer create = MediaPlayer.create(a.b, Uri.fromFile(new File(str)));
                if (create != null) {
                    tL_documentAttributeVideo.duration = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                }
            } catch (Exception e5) {
                fa4.g(e5, true);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e6) {
                    fa4.g(e6, true);
                }
            }
            throw th;
        }
    }

    public static boolean w0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else {
            try {
                InputStream openInputStream = a.b.getContentResolver().openInputStream(uri);
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

    public static TL_iv.PageBlock x0(TL_iv.PageBlock pageBlock) {
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
                int i = geoPoint.accuracy_radius;
                if (i != 0) {
                    tL_inputGeoPoint.flags |= 1;
                    tL_inputGeoPoint.accuracy_radius = i;
                }
                inputGeoPoint = tL_inputGeoPoint;
            }
            inputpageblockmap.geo = inputGeoPoint;
            inputpageblockmap.zoom = pageblockmap.zoom;
            inputpageblockmap.w = pageblockmap.w;
            inputpageblockmap.h = pageblockmap.h;
            inputpageblockmap.caption = pageblockmap.caption;
            return inputpageblockmap;
        }
        return pageBlock;
    }

    public static void y(j5 j5Var, long j, int i) {
        gl.d3(new va2(j5Var, j, i, (byte) 4));
    }

    public final p3a A(long j) {
        return (p3a) this.E.f(j);
    }

    public final Boolean E(k27 k27Var, TLRPC.TodoItem todoItem) {
        return (Boolean) this.I.get(Integer.valueOf(Objects.hash(Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()), Integer.valueOf(todoItem.id))));
    }

    public final long H(long j) {
        return ((Long) this.x.g(0L, j)).longValue();
    }

    public final boolean I(int i) {
        if (this.c.indexOfKey(i) < 0 && this.d.indexOfKey(i) < 0) {
            return false;
        }
        return true;
    }

    public final void K(k3a k3aVar) {
        L(k3aVar, -1);
    }

    public final void L(k3a k3aVar, int i) {
        boolean z;
        int i2;
        TLObject tLObject;
        boolean z2;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        k27 k27Var;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        TLRPC.MessageMedia messageMedia;
        TLRPC.InputMedia inputMedia3;
        TLRPC.PhotoSize photoSize2;
        int i3;
        TLRPC.InputMedia inputMedia4;
        TLRPC.InputPeer inputPeer2;
        String str2;
        oac oacVar;
        TLRPC.InputMedia d;
        TLRPC.InputMedia inputMedia5;
        String str3;
        TLRPC.PhotoSize photoSize3;
        z3a z3aVar = this;
        k3a k3aVar2 = k3aVar;
        byte b = k3aVar2.e;
        boolean z3 = false;
        boolean z4 = true;
        if (b == 0) {
            String str4 = k3aVar2.l;
            if (str4 != null) {
                z3aVar.d0(str4, k3aVar2);
                fl5.z().H(z3aVar.currentAccount, k3aVar2.l, "file");
                return;
            }
            TLObject tLObject2 = k3aVar2.c;
            int i4 = z3aVar.currentAccount;
            if (tLObject2 != null) {
                ba4.G(i4);
                String file = ba4.I(k3aVar2.g).toString();
                z3aVar.d0(file, k3aVar2);
                z3aVar.getFileLoader().h0(false, 16777216, file, true);
                z3aVar.g0(k3aVar2.m);
                return;
            }
            ba4.G(i4);
            String file2 = ba4.I(k3aVar2.g).toString();
            if (k3aVar2.d != null && (photoSize3 = k3aVar2.g) != null && photoSize3.location.dc_id != 0) {
                File file3 = new File(file2);
                if (!file3.exists()) {
                    ba4.G(z3aVar.currentAccount);
                    file2 = ba4.J(k3aVar2.g, null, true, true).toString();
                    file3 = new File(file2);
                }
                if (!file3.exists()) {
                    z3aVar.d0(ba4.r(null, k3aVar2.g), k3aVar2);
                    z3aVar.getFileLoader().V(gl5.f(k3aVar2.g, k3aVar2.h), k3aVar2.K, "jpg", 3, 0);
                    return;
                }
            }
            z3aVar.d0(file2, k3aVar2);
            z3aVar.getFileLoader().h0(true, 16777216, file2, true);
            z3aVar.g0(k3aVar2.m);
        } else if (b == 1) {
            oac oacVar2 = k3aVar2.o;
            if (oacVar2 != null && oacVar2.b() && k3aVar2.p) {
                k27 k27Var2 = k3aVar2.m;
                String str5 = k27Var2.k.attachPath;
                TLRPC.Document F0 = k27Var2.F0();
                if (str5 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ba4.z(4));
                    sb.append("/");
                    sb.append(F0.id);
                    sb.append(".");
                    if (k3aVar2.o.N) {
                        str3 = "webm";
                    } else {
                        str3 = "mp4";
                    }
                    sb.append(str3);
                    str5 = sb.toString();
                }
                z3aVar.d0(str5, k3aVar2);
                k3aVar2.o.getClass();
                MediaController.w().g0(k3aVar2.m, false, true, false);
                z3aVar.g0(k3aVar2.m);
                return;
            }
            oac oacVar3 = k3aVar2.o;
            if (oacVar3 != null) {
                TLRPC.InputFile inputFile2 = oacVar3.w;
                i3 = 4;
                if (inputFile2 != null) {
                    TLObject tLObject3 = k3aVar2.c;
                    if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                        inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                    } else if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                        inputMedia5 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                    } else if (tLObject3 instanceof TLRPC.TL_messages_addPollAnswer) {
                        inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) tLObject3).answer.input_media;
                    } else {
                        inputMedia5 = ((TLRPC.TL_messages_editMessage) tLObject3).media;
                    }
                    inputMedia5.file = inputFile2;
                    oacVar3.w = null;
                } else if (oacVar3.x != null) {
                    TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) k3aVar2.d;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                    decryptedMessageMedia.size = oacVar3.q;
                    decryptedMessageMedia.key = oacVar3.y;
                    decryptedMessageMedia.iv = oacVar3.z;
                    bu9 secretChatHelper = z3aVar.getSecretChatHelper();
                    k27 k27Var3 = k3aVar2.m;
                    secretChatHelper.j(tL_decryptedMessage, k27Var3.k, k3aVar2.n, k3aVar2.o.x, k3aVar2.f, k27Var3);
                    k3aVar2.o.x = null;
                    return;
                }
            } else {
                i3 = 4;
            }
            TLObject tLObject4 = k3aVar2.c;
            if (tLObject4 != null) {
                if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject4;
                    inputMedia4 = tL_messages_sendMedia.media;
                    inputPeer2 = tL_messages_sendMedia.peer;
                } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject4;
                    inputMedia4 = tL_sendMessage.media;
                    inputPeer2 = tL_sendMessage.peer;
                } else if (tLObject4 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject4;
                    inputMedia4 = tL_messages_addPollAnswer.answer.input_media;
                    inputPeer2 = tL_messages_addPollAnswer.peer;
                } else {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject4;
                    inputMedia4 = tL_messages_editMessage.media;
                    inputPeer2 = tL_messages_editMessage.peer;
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                        inputMedia4 = tL_inputMediaPaidMedia.extended_media.get(0);
                    }
                }
                if ((inputMedia4 instanceof TLRPC.TL_inputMediaPoll) && (d = ud8.d((TLRPC.TL_inputMediaPoll) inputMedia4)) != null) {
                    inputMedia4 = d;
                }
                TLRPC.InputFile inputFile3 = inputMedia4.file;
                if (inputFile3 == null && !(inputMedia4 instanceof TLRPC.TL_inputMediaDocument) && k3aVar2.p) {
                    k27 k27Var4 = k3aVar2.m;
                    String str6 = k27Var4.k.attachPath;
                    TLRPC.Document F02 = k27Var4.F0();
                    TLRPC.TL_document tL_document = k3aVar2.m.E1;
                    if (tL_document != null) {
                        F02 = tL_document;
                    }
                    if (str6 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ba4.z(i3));
                        sb2.append("/");
                        str6 = ls6.p(sb2, F02.id, ".mp4");
                    }
                    String str7 = str6;
                    z3aVar.d0(str7, k3aVar2);
                    oac oacVar4 = k3aVar2.m.r0;
                    if (oacVar4 != null) {
                        if (!oacVar4.O) {
                            if (oacVar4.b()) {
                                z3aVar.getFileLoader().g0(str7, false, false, F02.size, 33554432, false);
                            }
                        }
                        z3aVar.g0(k3aVar2.m);
                        return;
                    }
                    z3aVar.getFileLoader().h0(false, 33554432, str7, false);
                    z3aVar.g0(k3aVar2.m);
                    return;
                }
                TLRPC.InputPhoto inputPhoto = inputMedia4.video_cover;
                if (inputPhoto == null && k3aVar2.j == null && k3aVar2.i != null && k3aVar2.q) {
                    String str8 = ba4.z(i3) + "/" + k3aVar2.i.location.volume_id + "_" + k3aVar2.i.location.local_id + ".jpg";
                    z3aVar.d0(str8, k3aVar2);
                    z3aVar.getFileLoader().h0(false, 16777216, str8, true);
                    z3aVar.g0(k3aVar2.m);
                    return;
                } else if (k3aVar2.k && (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && k3aVar2.j != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = inputPeer2;
                    inputMedia4.flags &= -65;
                    inputMedia4.video_cover = null;
                    tL_messages_uploadMedia.media = inputMedia4;
                    z3aVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new rj3(z3aVar, k3aVar2, inputMedia4.spoiler, inputMedia4.ttl_seconds));
                    return;
                } else if (inputPhoto == null && k3aVar2.j != null && k3aVar2.q) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia2.peer = inputPeer2;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = k3aVar2.j;
                    tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                    z3aVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new h2a(z3aVar, inputMedia4, k3aVar2, (byte) 0));
                    return;
                } else {
                    k27 k27Var5 = k3aVar2.m;
                    if (k27Var5 != null && (oacVar = k27Var5.r0) != null && oacVar.N) {
                        str2 = "webp";
                    } else {
                        str2 = "jpg";
                    }
                    String str9 = ba4.z(i3) + "/" + k3aVar2.g.location.volume_id + "_" + k3aVar2.g.location.local_id + "." + str2;
                    z3aVar.d0(str9, k3aVar2);
                    z3aVar.getFileLoader().h0(false, 16777216, str9, true);
                    z3aVar.g0(k3aVar2.m);
                    return;
                }
            }
            k27 k27Var6 = k3aVar2.m;
            String str10 = k27Var6.k.attachPath;
            TLRPC.Document F03 = k27Var6.F0();
            if (str10 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(ba4.z(i3));
                sb3.append("/");
                str10 = ls6.p(sb3, F03.id, ".mp4");
            }
            if (k3aVar2.d != null && F03.dc_id != 0) {
                File file4 = new File(str10);
                if (!file4.exists()) {
                    ba4 fileLoader = z3aVar.getFileLoader();
                    TLRPC.Message message = k3aVar2.m.k;
                    fileLoader.getClass();
                    file4 = ba4.M(message, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message2 = k3aVar2.m.k;
                        String absolutePath = file4.getAbsolutePath();
                        message2.attachPath = absolutePath;
                        k3aVar2.m.y0 = true;
                        str10 = absolutePath;
                    }
                }
                if (file4 == null || (!file4.exists() && k3aVar2.m.F0() != null)) {
                    ba4 fileLoader2 = z3aVar.getFileLoader();
                    TLRPC.Document F04 = k3aVar2.m.F0();
                    fileLoader2.getClass();
                    file4 = ba4.J(F04, null, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message3 = k3aVar2.m.k;
                        String absolutePath2 = file4.getAbsolutePath();
                        message3.attachPath = absolutePath2;
                        k3aVar2.m.y0 = true;
                        str10 = absolutePath2;
                    }
                }
                if (file4 == null || (!file4.exists() && k3aVar2.m.F0() != null)) {
                    ba4 fileLoader3 = z3aVar.getFileLoader();
                    TLRPC.Document F05 = k3aVar2.m.F0();
                    fileLoader3.getClass();
                    file4 = ba4.J(F05, null, true, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message4 = k3aVar2.m.k;
                        String absolutePath3 = file4.getAbsolutePath();
                        message4.attachPath = absolutePath3;
                        k3aVar2.m.y0 = true;
                        str10 = absolutePath3;
                    }
                }
                if (file4 == null || !file4.exists()) {
                    z3aVar.d0(ba4.r(null, F03), k3aVar2);
                    z3aVar.getFileLoader().X(F03, k3aVar2.K, 3, 0);
                    return;
                }
            }
            String str11 = str10;
            z3aVar.d0(str11, k3aVar2);
            oac oacVar5 = k3aVar2.m.r0;
            if (oacVar5 != null) {
                if (!oacVar5.O) {
                    if (oacVar5.b()) {
                        z3aVar.getFileLoader().g0(str11, true, false, F03.size, 33554432, false);
                    }
                }
                z3aVar.g0(k3aVar2.m);
            }
            z3aVar.getFileLoader().h0(true, 33554432, str11, false);
            z3aVar.g0(k3aVar2.m);
        } else if (b == 2) {
            String str12 = k3aVar2.l;
            if (str12 != null) {
                z3aVar.d0(str12, k3aVar2);
                fl5.z().H(z3aVar.currentAccount, k3aVar2.l, "gif");
                return;
            }
            TLObject tLObject5 = k3aVar2.c;
            if (tLObject5 != null) {
                if (tLObject5 instanceof TLRPC.TL_messages_sendMedia) {
                    inputMedia3 = ((TLRPC.TL_messages_sendMedia) tLObject5).media;
                } else if (tLObject5 instanceof TL_ephemeral.TL_sendMessage) {
                    inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject5).media;
                } else if (tLObject5 instanceof TLRPC.TL_messages_addPollAnswer) {
                    inputMedia3 = ((TLRPC.TL_messages_addPollAnswer) tLObject5).answer.input_media;
                } else {
                    inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject5).media;
                }
                if (inputMedia3.file == null) {
                    String str13 = k3aVar2.m.k.attachPath;
                    z3aVar.d0(str13, k3aVar2);
                    ba4 fileLoader4 = z3aVar.getFileLoader();
                    if (k3aVar2.c != null) {
                        z4 = false;
                    }
                    fileLoader4.h0(z4, 67108864, str13, false);
                    z3aVar.g0(k3aVar2.m);
                    return;
                } else if (inputMedia3.thumb == null && (photoSize2 = k3aVar2.g) != null && !(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    String str14 = ba4.z(4) + "/" + k3aVar2.g.location.volume_id + "_" + k3aVar2.g.location.local_id + ".jpg";
                    z3aVar.d0(str14, k3aVar2);
                    z3aVar.getFileLoader().h0(false, 16777216, str14, true);
                    z3aVar.g0(k3aVar2.m);
                    return;
                } else {
                    return;
                }
            }
            k27 k27Var7 = k3aVar2.m;
            String str15 = k27Var7.k.attachPath;
            TLRPC.Document F06 = k27Var7.F0();
            if (k3aVar2.d != null && F06.dc_id != 0) {
                File file5 = new File(str15);
                if (!file5.exists()) {
                    ba4 fileLoader5 = z3aVar.getFileLoader();
                    TLRPC.Message message5 = k3aVar2.m.k;
                    fileLoader5.getClass();
                    file5 = ba4.M(message5, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = k3aVar2.m.k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        k3aVar2.m.y0 = true;
                        str15 = absolutePath4;
                    }
                }
                if (file5 == null || (!file5.exists() && k3aVar2.m.F0() != null)) {
                    ba4 fileLoader6 = z3aVar.getFileLoader();
                    TLRPC.Document F07 = k3aVar2.m.F0();
                    fileLoader6.getClass();
                    file5 = ba4.J(F07, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message7 = k3aVar2.m.k;
                        String absolutePath5 = file5.getAbsolutePath();
                        message7.attachPath = absolutePath5;
                        k3aVar2.m.y0 = true;
                        str15 = absolutePath5;
                    }
                }
                if (file5 == null || (!file5.exists() && k3aVar2.m.F0() != null)) {
                    ba4 fileLoader7 = z3aVar.getFileLoader();
                    TLRPC.Document F08 = k3aVar2.m.F0();
                    fileLoader7.getClass();
                    file5 = ba4.J(F08, null, true, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message8 = k3aVar2.m.k;
                        String absolutePath6 = file5.getAbsolutePath();
                        message8.attachPath = absolutePath6;
                        k3aVar2.m.y0 = true;
                        str15 = absolutePath6;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    z3aVar.d0(ba4.r(null, F06), k3aVar2);
                    z3aVar.getFileLoader().X(F06, k3aVar2.K, 3, 0);
                    return;
                }
            }
            z3aVar.d0(str15, k3aVar2);
            z3aVar.getFileLoader().h0(true, 67108864, str15, false);
            z3aVar.g0(k3aVar2.m);
        } else if (b == 3) {
            String str16 = k3aVar2.m.k.attachPath;
            z3aVar.d0(str16, k3aVar2);
            ba4 fileLoader8 = z3aVar.getFileLoader();
            if (k3aVar2.c == null) {
                z3 = true;
            }
            fileLoader8.h0(z3, 50331648, str16, true);
            z3aVar.g0(k3aVar2.m);
        } else if (b == 4) {
            if (i < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!k3aVar2.p && !k3aVar2.q) {
                if (!k3aVar2.x.isEmpty()) {
                    TLRPC.Message message9 = ((k27) b00.f(1, k3aVar2.x)).k;
                    if (k3aVar2.G != 0) {
                        z3 = true;
                    }
                    z3aVar.e0(message9, z3);
                }
            } else {
                if (i < 0) {
                    i2 = k3aVar2.x.size() - 1;
                } else {
                    i2 = i;
                }
                k27 k27Var8 = (k27) k3aVar2.x.get(i2);
                TLRPC.Document F09 = k27Var8.F0();
                if (F09 == null && (k27.m1(k27Var8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) k27.m1(k27Var8);
                    if (i2 >= tL_messageMediaPaidMedia.extended_media.size()) {
                        messageExtendedMedia = null;
                    } else {
                        messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                    }
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    } else {
                        messageMedia = null;
                    }
                    F09 = messageMedia == null ? null : messageMedia.document;
                }
                if (F09 == null && (k27.m1(k27Var8) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.MessageMedia f = ud8.f((TLRPC.TL_messageMediaPoll) k27.m1(k27Var8), ((Integer) k3aVar2.C.get(i2)).intValue());
                    if (f == null) {
                        document = null;
                    } else {
                        document = f.document;
                    }
                    F09 = document;
                }
                if (F09 != null) {
                    oac oacVar6 = k3aVar2.o;
                    if (oacVar6 != null && oacVar6.b() && k3aVar2.p) {
                        String str17 = k27Var8.k.attachPath;
                        if (str17 == null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(ba4.z(4));
                            sb4.append("/");
                            str17 = ls6.p(sb4, F09.id, ".mp4");
                        }
                        z3aVar.d0(str17, k3aVar2);
                        k3aVar2.E.put(k27Var8, str17);
                        k3aVar2.E.put(str17.concat("_i"), k27Var8);
                        TLRPC.PhotoSize photoSize4 = k3aVar2.g;
                        if (photoSize4 != null && photoSize4.location != null) {
                            k3aVar2.E.put(str17.concat("_t"), k3aVar2.g);
                        }
                        TLRPC.PhotoSize photoSize5 = k3aVar2.i;
                        if (photoSize5 != null && photoSize5.location != null) {
                            k3aVar2.E.put(str17.concat("_ct"), k3aVar2.i);
                        }
                        k3aVar2.o.getClass();
                        MediaController.w().g0(k27Var8, false, true, false);
                        k3aVar2.m = k27Var8;
                        z3aVar.g0(k27Var8);
                    } else {
                        String str18 = k27Var8.k.attachPath;
                        if (str18 != null) {
                            str = "_i";
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(ba4.z(4));
                            sb5.append("/");
                            str = "_i";
                            str18 = ls6.p(sb5, F09.id, ".mp4");
                        }
                        TLObject tLObject6 = k3aVar2.c;
                        if (tLObject6 != null) {
                            if (tLObject6 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject6;
                                inputPeer = tL_messages_sendMultiMedia.peer;
                                inputMedia = tL_messages_sendMultiMedia.multi_media.get(i2).media;
                            } else if (tLObject6 instanceof TLRPC.TL_messages_sendMedia) {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject6;
                                inputPeer = tL_messages_sendMedia2.peer;
                                TLRPC.InputMedia inputMedia6 = tL_messages_sendMedia2.media;
                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(i2);
                                } else {
                                    if (inputMedia6 instanceof TLRPC.TL_inputMediaPoll) {
                                        inputMedia = ud8.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) k3aVar2.C.get(i2)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else if (tLObject6 instanceof TL_ephemeral.TL_sendMessage) {
                                TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject6;
                                inputPeer = tL_sendMessage2.peer;
                                TLRPC.InputMedia inputMedia7 = tL_sendMessage2.media;
                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia7).extended_media.get(i2);
                                } else {
                                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                        inputMedia = ud8.e((TLRPC.TL_inputMediaPoll) inputMedia7, ((Integer) k3aVar2.C.get(i2)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else {
                                inputMedia = null;
                                inputPeer = null;
                            }
                            if (inputMedia != null && inputMedia.file == null && !(inputMedia instanceof TLRPC.TL_inputMediaDocument) && k3aVar2.p) {
                                z3aVar.d0(str18, k3aVar2);
                                k3aVar2.E.put(k27Var8, str18);
                                k3aVar2.E.put(str18, inputMedia);
                                k3aVar2.E.put(str18.concat(str), k27Var8);
                                TLRPC.PhotoSize photoSize6 = k3aVar2.g;
                                if (photoSize6 != null && photoSize6.location != null) {
                                    k3aVar2.E.put(str18.concat("_t"), k3aVar2.g);
                                }
                                TLRPC.PhotoSize photoSize7 = k3aVar2.i;
                                if (photoSize7 != null && photoSize7.location != null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(ba4.z(4));
                                    sb6.append("/");
                                    sb6.append(k3aVar2.i.location.volume_id);
                                    sb6.append("_");
                                    String l = de9.l(sb6, k3aVar2.i.location.local_id, ".jpg");
                                    k3aVar2.E.put(str18.concat("_ct"), k3aVar2.i);
                                    k3aVar2.E.put(l.concat("_doc"), str18);
                                }
                                oac oacVar7 = k27Var8.r0;
                                if (oacVar7 != null && oacVar7.b()) {
                                    z3aVar.getFileLoader().g0(str18, false, false, F09.size, 33554432, false);
                                } else {
                                    z3aVar.getFileLoader().h0(false, 33554432, str18, false);
                                }
                                z3aVar.g0(k27Var8);
                            } else {
                                String str19 = str;
                                String str20 = str18;
                                TLRPC.PhotoSize photoSize8 = k3aVar2.i;
                                if (photoSize8 != null) {
                                    photoSize = photoSize8;
                                    if (k3aVar2.j == null && inputMedia != null && inputMedia.video_cover == null) {
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(ba4.z(4));
                                        sb7.append("/");
                                        TLRPC.InputMedia inputMedia8 = inputMedia;
                                        sb7.append(k3aVar2.i.location.volume_id);
                                        sb7.append("_");
                                        sb7.append(k3aVar2.i.location.local_id);
                                        sb7.append(".jpg");
                                        String sb8 = sb7.toString();
                                        z3aVar.d0(sb8, k3aVar2);
                                        TLRPC.PhotoSize photoSize9 = k3aVar2.i;
                                        if (photoSize9 != null && photoSize9.location != null) {
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append(ba4.z(4));
                                            sb9.append("/");
                                            sb9.append(k3aVar2.i.location.volume_id);
                                            sb9.append("_");
                                            String l2 = de9.l(sb9, k3aVar2.i.location.local_id, ".jpg");
                                            k3aVar2.E.put(str20.concat("_ct"), k3aVar2.i);
                                            k3aVar2.E.put(l2.concat("_doc"), str20);
                                        }
                                        k3aVar2.E.put(sb8.concat("_o"), str20);
                                        k3aVar2.E.put(str20.concat(str19), k27Var8);
                                        k3aVar2.E.put(k27Var8, sb8);
                                        k3aVar2.E.put(sb8, inputMedia8);
                                        z3aVar.getFileLoader().h0(false, 16777216, sb8, true);
                                        z3aVar.g0(k27Var8);
                                    } else {
                                        inputMedia2 = inputMedia;
                                        k27Var = k27Var8;
                                    }
                                } else {
                                    inputMedia2 = inputMedia;
                                    k27Var = k27Var8;
                                    photoSize = photoSize8;
                                }
                                if (photoSize != null && k3aVar2.j != null && inputMedia2 != null && inputMedia2.video_cover == null && (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputMedia2.file != null && (k3aVar2.c instanceof TLRPC.TL_messages_sendMultiMedia) && (arrayList = k3aVar2.D) != null && i2 >= 0 && i2 < arrayList.size() && Boolean.TRUE.equals(k3aVar2.D.get(i2))) {
                                    TLRPC.InputFile inputFile4 = k3aVar2.j;
                                    inputMedia2.flags &= -65;
                                    inputMedia2.video_cover = null;
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    tL_messages_uploadMedia3.media = inputMedia2;
                                    k3aVar2 = k3aVar;
                                    z3aVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia3, new ot(z3aVar, inputFile4, (TLRPC.TL_inputMediaUploadedDocument) inputMedia2, k3aVar, i2, str20));
                                    z3aVar = this;
                                } else if (k3aVar2.i != null && k3aVar2.j != null && inputMedia2 != null && inputMedia2.video_cover == null) {
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia4.peer = inputPeer;
                                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                    tL_inputMediaUploadedPhoto2.file = k3aVar2.j;
                                    tL_messages_uploadMedia4.media = tL_inputMediaUploadedPhoto2;
                                    z3aVar = this;
                                    getConnectionsManager().sendRequest(tL_messages_uploadMedia4, new fn0(z3aVar, inputMedia2, k3aVar2, str20, k27Var, (byte) 16));
                                } else {
                                    z3aVar = this;
                                    TLRPC.InputMedia inputMedia9 = inputMedia2;
                                    if (k3aVar2.g != null) {
                                        String str21 = ba4.z(4) + "/" + k3aVar2.g.location.volume_id + "_" + k3aVar2.g.location.local_id + ".jpg";
                                        z3aVar.d0(str21, k3aVar2);
                                        k3aVar2.E.put(str21.concat("_o"), str20);
                                        k3aVar2.E.put(k27Var, str21);
                                        k3aVar2.E.put(str21, inputMedia9);
                                        z3aVar.getFileLoader().h0(false, 16777216, str21, true);
                                        z3aVar.g0(k27Var);
                                    }
                                }
                            }
                        } else {
                            String str22 = str18;
                            z3aVar.d0(str22, k3aVar2);
                            k3aVar2.E.put(k27Var8, str22);
                            k3aVar2.E.put(str22, ((TLRPC.TL_messages_sendEncryptedMultiMedia) k3aVar2.d).files.get(i2));
                            k3aVar2.E.put(str22.concat(str), k27Var8);
                            TLRPC.PhotoSize photoSize10 = k3aVar2.g;
                            if (photoSize10 != null && photoSize10.location != null) {
                                k3aVar2.E.put(str22.concat("_t"), k3aVar2.g);
                            }
                            oac oacVar8 = k27Var8.r0;
                            if (oacVar8 != null && oacVar8.b()) {
                                z3aVar.getFileLoader().g0(str22, true, false, F09.size, 33554432, false);
                            } else {
                                z3aVar.getFileLoader().h0(true, 33554432, str22, false);
                            }
                            z3aVar.g0(k27Var8);
                        }
                    }
                    inputFile = null;
                    k3aVar2.o = null;
                    k3aVar2.g = null;
                    k3aVar2.i = null;
                } else {
                    String str23 = k3aVar2.l;
                    if (str23 != null) {
                        z3aVar.d0(str23, k3aVar2);
                        k3aVar2.E.put(k27Var8, k3aVar2.l);
                        k3aVar2.E.put(k3aVar2.l, k27Var8);
                        fl5.z().H(z3aVar.currentAccount, k3aVar2.l, "file");
                        inputFile = null;
                        k3aVar2.l = null;
                    } else {
                        TLObject tLObject7 = k3aVar2.c;
                        if (tLObject7 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            tLObject = ((TLRPC.TL_messages_sendMultiMedia) tLObject7).multi_media.get(i2).media;
                        } else {
                            if (tLObject7 instanceof TLRPC.TL_messages_sendMedia) {
                                TLRPC.InputMedia inputMedia10 = ((TLRPC.TL_messages_sendMedia) tLObject7).media;
                                if (inputMedia10 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia10).extended_media.get(i2);
                                } else {
                                    TLRPC.InputMedia inputMedia11 = ((TLRPC.TL_messages_sendMedia) tLObject7).media;
                                    if (inputMedia11 instanceof TLRPC.TL_inputMediaPoll) {
                                        tLObject = ud8.e((TLRPC.TL_inputMediaPoll) inputMedia11, ((Integer) k3aVar2.C.get(i2)).intValue());
                                    }
                                }
                            }
                            if (tLObject7 instanceof TL_ephemeral.TL_sendMessage) {
                                TLRPC.InputMedia inputMedia12 = ((TL_ephemeral.TL_sendMessage) tLObject7).media;
                                if (inputMedia12 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia12).extended_media.get(i2);
                                } else {
                                    TLRPC.InputMedia inputMedia13 = ((TL_ephemeral.TL_sendMessage) tLObject7).media;
                                    if (inputMedia13 instanceof TLRPC.TL_inputMediaPoll) {
                                        tLObject = ud8.e((TLRPC.TL_inputMediaPoll) inputMedia13, ((Integer) k3aVar2.C.get(i2)).intValue());
                                    }
                                }
                            }
                            tLObject = ((TLRPC.TL_messages_sendEncryptedMultiMedia) k3aVar2.d).files.get(i2);
                        }
                        ba4.G(z3aVar.currentAccount);
                        String file6 = ba4.I(k3aVar2.g).toString();
                        z3aVar.d0(file6, k3aVar2);
                        k3aVar2.E.put(file6, tLObject);
                        k3aVar2.E.put(k27Var8, file6);
                        ba4 fileLoader9 = z3aVar.getFileLoader();
                        if (k3aVar2.d != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fileLoader9.h0(z2, 16777216, file6, true);
                        z3aVar.g0(k27Var8);
                        inputFile = null;
                        k3aVar2.g = null;
                    }
                }
                k3aVar2.j = inputFile;
                k3aVar2.p = false;
                k3aVar2.q = false;
            }
            z3aVar.s0(k3aVar2, z);
        } else if (b == 5) {
            String str24 = "stickerset_" + k3aVar2.m.e1();
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) k3aVar2.K;
            z3aVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ck8(z3aVar, k3aVar2, str24, (byte) 9));
            z3aVar.d0(str24, k3aVar2);
        }
    }

    public final void M(TLObject tLObject, k27 k27Var, String str, k3a k3aVar, Object obj, HashMap hashMap, boolean z) {
        N(tLObject, k27Var, str, null, false, k3aVar, obj, hashMap, z);
    }

    public final void N(TLObject tLObject, final k27 k27Var, final String str, final k3a k3aVar, final boolean z, final k3a k3aVar2, final Object obj, final HashMap hashMap, final boolean z2) {
        k3a x;
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
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new i2a(this, tL_messages_addPollAnswer, tLObject, k27Var, str, k3aVar, z, k3aVar2, obj, hashMap, z2));
                return;
            }
        }
        int i = 0;
        boolean z3 = false;
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z && (x = x(k27Var.e1(), k27.B0(k27Var.k))) != null) {
            if (k3aVar != null) {
                z3 = k3aVar.H;
            }
            ?? obj2 = new Object();
            obj2.a = tLObject2;
            obj2.b = k27Var;
            obj2.d = str;
            obj2.g = k3aVar2;
            obj2.h = obj;
            obj2.i = z3;
            ArrayList arrayList2 = x.b;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                x.b = arrayList2;
            }
            arrayList2.add(obj2);
            if (k3aVar != null && (arrayList = k3aVar.b) != null) {
                x.b.addAll(arrayList);
                return;
            }
            return;
        }
        TLRPC.Message message = k27Var.k;
        e0(message, z2);
        gta v = gta.v(this.currentAccount, false);
        o1a o1aVar = new o1a(this, tLObject2, k27Var, str, k3aVar, z, k3aVar2, obj, hashMap, z2, (byte) 1);
        if (k27Var.k != null) {
            int e1 = k27Var.e1();
            if (gta.l(tLObject) > 0 && v.Q.remove(Integer.valueOf(e1))) {
                v.R.put(Integer.valueOf(e1), o1aVar);
                return;
            }
        }
        if (wp0.b(this.currentAccount).a(tLObject, Collections.singletonList(k27Var), new o1a(this, tLObject, k27Var, str, k3aVar, z, k3aVar2, obj, hashMap, z2, (byte) 2))) {
            if (t34.g(this.currentAccount).a(tLObject, Collections.singletonList(k27Var), new p8c() {
                @Override
                public final void a(Object obj3) {
                    boolean z4 = z2;
                    z3a.this.N((TLObject) obj3, k27Var, str, k3aVar, z, k3aVar2, obj, hashMap, z4);
                }
            })) {
                ConnectionsManager connectionsManager = getConnectionsManager();
                i2a i2aVar = new i2a(this, tLObject, k27Var, str, k3aVar, z, k3aVar2, obj, hashMap, z2, message);
                kq8 kq8Var = new kq8(this, message, (byte) 18);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    i = 128;
                }
                message.reqId = connectionsManager.sendRequest(tLObject, i2aVar, kq8Var, i | 68);
                if (k3aVar != null) {
                    k3aVar.d();
                }
            }
        }
    }

    public final void O(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final k3a k3aVar, final boolean z) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e0(((k27) arrayList.get(i)).k, z);
        }
        if (!gta.v(this.currentAccount, false).a(tLObject, arrayList, new Runnable(this) {
            public final z3a b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.b.O(tLObject, arrayList, arrayList2, arrayList3, k3aVar, z);
                        return;
                    default:
                        this.b.O(tLObject, arrayList, arrayList2, arrayList3, k3aVar, z);
                        return;
                }
            }
        }) || !wp0.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) {
            public final z3a b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.b.O(tLObject, arrayList, arrayList2, arrayList3, k3aVar, z);
                        return;
                    default:
                        this.b.O(tLObject, arrayList, arrayList2, arrayList3, k3aVar, z);
                        return;
                }
            }
        }) || !t34.g(this.currentAccount).a(tLObject, arrayList, new rl8(this, arrayList, arrayList2, arrayList3, k3aVar, z))) {
            return;
        }
        getConnectionsManager().sendRequest(tLObject, new az6(this, arrayList3, tLObject, arrayList, arrayList2, k3aVar, z), (QuickAckDelegate) null, 68);
    }

    public final void P(long j, Uri uri, ArrayList arrayList, ez5 ez5Var) {
        if (this.E.f(j) != null) {
            ez5Var.run(0L);
            return;
        }
        if (cf3.y(j)) {
            long j2 = -j;
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j2));
            if (K0 != null && !K0.megagroup) {
                getMessagesController().P(null, j2, null, new lt(this, uri, arrayList, ez5Var, (byte) 20), null);
                return;
            }
        }
        new Thread(new o77(this, arrayList, j, uri, ez5Var, (byte) 13)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j) {
        if (j != 0) {
            TLRPC.InputPeer h1 = getMessagesController().h1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = h1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = h1;
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j) {
        if (j != 0) {
            TLRPC.InputPeer h1 = getMessagesController().h1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = h1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = h1;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void b0(k27 k27Var, long j, long j2, long j3, u47 u47Var) {
        TLRPC.WebPage webPage;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            TLRPC.MessageMedia messageMedia = message.media;
            ArrayList arrayList = null;
            r4 = null;
            r4 = null;
            HashMap hashMap = null;
            arrayList = null;
            if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty) && !(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && !(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                if (cf3.B(j)) {
                    TLRPC.Message message2 = k27Var.k;
                    if (message2.peer_id != null) {
                        TLRPC.MessageMedia messageMedia2 = message2.media;
                        if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                            hashMap = new HashMap();
                            hashMap.put("parentObject", "sent_" + k27Var.k.peer_id.channel_id + "_" + k27Var.e1() + "_" + k27.B0(k27Var.k) + "_" + k27Var.D + "_" + k27Var.S1());
                        }
                    }
                }
                HashMap hashMap2 = hashMap;
                TLRPC.Message message3 = k27Var.k;
                TLRPC.MessageMedia messageMedia3 = message3.media;
                TLRPC.Photo photo = messageMedia3.photo;
                if (photo instanceof TLRPC.TL_photo) {
                    x3a c = x3a.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j, null, k27Var.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, k27Var, null, false, false);
                    c.Q = j2;
                    c.R = j3;
                    c.T = u47Var;
                    q0(c);
                    return;
                }
                TLRPC.Document document = messageMedia3.document;
                if (document instanceof TLRPC.TL_document) {
                    x3a f = x3a.f((TLRPC.TL_document) document, null, message3.attachPath, j, k27Var.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, k27Var, null, false);
                    f.Q = j2;
                    f.R = j3;
                    f.T = u47Var;
                    q0(f);
                } else if (!(messageMedia3 instanceof TLRPC.TL_messageMediaVenue) && !(messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                    if (messageMedia3.phone_number != null) {
                        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                        TLRPC.MessageMedia messageMedia4 = k27Var.k.media;
                        tL_userContact_old2.phone = messageMedia4.phone_number;
                        tL_userContact_old2.first_name = messageMedia4.first_name;
                        tL_userContact_old2.last_name = messageMedia4.last_name;
                        tL_userContact_old2.id = messageMedia4.user_id;
                        x3a g = x3a.g(tL_userContact_old2, j, k27Var.C, null, null, null, true, 0, 0);
                        g.R = j3;
                        g.T = u47Var;
                        g.Q = j2;
                        q0(g);
                    } else if (!cf3.B(j)) {
                        p0(tb4.t(k27Var), j, true, false, true, 0, 0, null, -1, j2, j3, u47Var);
                    }
                } else {
                    x3a d = x3a.d(messageMedia3, j, k27Var.C, null, null, null, true, 0);
                    d.Q = j2;
                    d.R = j3;
                    d.T = u47Var;
                    q0(d);
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
                    for (int i = 0; i < k27Var.k.entities.size(); i++) {
                        TLRPC.MessageEntity messageEntity = k27Var.k.entities.get(i);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                x3a b = x3a.b(k27Var.k.message, j, k27Var.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                b.Q = j2;
                b.R = j3;
                b.T = u47Var;
                q0(b);
            } else if (cf3.B(j)) {
                p0(tb4.t(k27Var), j, true, false, true, 0, 0, null, -1, j2, j3, u47Var);
            }
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer h1 = getMessagesController().h1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = h1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = h1;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(int i) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        sparseArray.remove(i);
        if (size != 0 && sparseArray.size() == 0) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new vb7(messagesStorage, (byte) 22));
        }
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j) {
        if (j != 0) {
            TLRPC.InputPeer h1 = getMessagesController().h1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = h1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = h1;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(String str, k3a k3aVar) {
        HashMap hashMap = this.a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(k3aVar);
    }

    @Override
    public final void didReceivedNotification(int r43, int r44, java.lang.Object... r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer h1 = getMessagesController().h1(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = h1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = h1;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(TLRPC.Message message, boolean z) {
        if (Thread.currentThread() != a.d.getLooper().getThread()) {
            gl.d3(new s1a(this, message, z, (byte) 2));
        } else {
            f0(message, z);
        }
    }

    public final void f(k27 k27Var) {
        ArrayList t = tb4.t(k27Var);
        if (k27Var != null && k27Var.D == 29) {
            k3a k3aVar = null;
            for (Map.Entry entry : this.a.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int i = 0; i < arrayList.size(); i++) {
                    k3a k3aVar2 = (k3a) arrayList.get(i);
                    if (k3aVar2.e == 4) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= k3aVar2.x.size()) {
                                break;
                            } else if (((k27) k3aVar2.x.get(i2)).e1() == k27Var.e1()) {
                                k3aVar = k3aVar2;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (k3aVar == null) {
                    }
                }
            }
            if (k3aVar != null) {
                t.clear();
                t.addAll(k3aVar.x);
            }
        }
        g(t);
    }

    public final void f0(TLRPC.Message message, boolean z) {
        boolean z2;
        if (message != null) {
            int i = message.id;
            if (i > 0) {
                this.d.put(i, message);
                return;
            }
            SparseArray sparseArray = this.c;
            if (sparseArray.indexOfKey(i) >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            i0(message.id, z);
            sparseArray.put(message.id, message);
            if (!z && !z2 && !k27.c3(message)) {
                long B0 = k27.B0(message);
                vf6 vf6Var = this.f;
                vf6Var.k(Integer.valueOf(((Integer) vf6Var.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(kk7.m1, new Object[0]);
            }
        }
    }

    public final void g(ArrayList arrayList) {
        HashMap hashMap;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        k27 k27Var;
        int i5;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        long j2 = 0;
        int i8 = 0;
        boolean z2 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.a;
            if (i8 >= size) {
                break;
            }
            k27 k27Var2 = (k27) arrayList.get(i8);
            if (k27Var2.r1) {
                i3 = 1;
            } else {
                i3 = i6;
            }
            long B0 = k27.B0(k27Var2.k);
            arrayList4.add(Integer.valueOf(k27Var2.e1()));
            if (k27.a4(k27Var2.k)) {
                i7 = k27.I1(k27Var2.k);
            }
            TLRPC.Message h0 = h0(k27Var2.e1(), k27Var2.r1);
            if (h0 != null) {
                getConnectionsManager().cancelRequest(h0.reqId, true);
            }
            gta v = gta.v(this.currentAccount, z);
            bta btaVar = v.N;
            ArrayList arrayList5 = arrayList4;
            if (btaVar != null && btaVar.b == k27.B0(k27Var2.k)) {
                bta btaVar2 = v.N;
                int e1 = k27Var2.e1();
                ata ataVar = btaVar2.p;
                g21 g21Var = btaVar2.d;
                i4 = i8;
                HashSet hashSet = btaVar2.k;
                j = B0;
                if (!btaVar2.n && !btaVar2.o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            k27Var = (k27) it.next();
                            Iterator it2 = it;
                            if (k27Var.e1() == e1) {
                                hashSet.remove(k27Var);
                                break;
                            }
                            it = it2;
                        } else {
                            k27Var = null;
                            break;
                        }
                    }
                    if (hashSet.isEmpty()) {
                        btaVar2.n = true;
                        btaVar2.c.b();
                        v.N = null;
                    } else {
                        btaVar2.g--;
                        if (k27Var != null && (message = k27Var.k) != null) {
                            btaVar2.h -= message.paid_message_stars;
                        }
                        fta ftaVar = btaVar2.f;
                        if (ftaVar != null) {
                            ftaVar.b = 3000L;
                            gl.r(ataVar);
                            gl.e3(ataVar, 3000L);
                        }
                        hn hnVar = g21Var.b;
                        int i9 = btaVar2.g;
                        if (i9 == 1) {
                            G = k96.M0(2131747510, null);
                            i5 = 0;
                        } else {
                            i5 = 0;
                            G = k96.G(i9, "PaidMessageSentTitle", new Object[0]);
                        }
                        hnVar.setText(G);
                        g21Var.c.setText(gl.T2(k96.H(',', "PaidMessageSentSubtitle", Math.max(i5, (int) btaVar2.h))));
                        g21Var.a.d();
                    }
                }
            } else {
                i4 = i8;
                j = B0;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList6.size()) {
                        k3a k3aVar = (k3a) arrayList6.get(i10);
                        if (k3aVar.e == 4) {
                            k27 k27Var3 = null;
                            int i11 = 0;
                            while (true) {
                                if (i11 < k3aVar.x.size()) {
                                    k27Var3 = (k27) k3aVar.x.get(i11);
                                    if (k27Var3.e1() == k27Var2.e1()) {
                                        i0(k27Var2.e1(), k27Var2.r1);
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 >= 0) {
                                k3aVar.x.remove(i11);
                                k3aVar.z.remove(i11);
                                k3aVar.B.remove(i11);
                                if (!k3aVar.y.isEmpty()) {
                                    k3aVar.y.remove(i11);
                                }
                                TLObject tLObject = k3aVar.c;
                                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i11);
                                } else {
                                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                        TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i11);
                                        } else {
                                            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                            if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                                                ud8.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) k3aVar.C.get(i11)).intValue());
                                            }
                                        }
                                    }
                                    if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                                        TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia3).extended_media.remove(i11);
                                        } else {
                                            TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                            if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                                ud8.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) k3aVar.C.get(i11)).intValue());
                                            }
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) k3aVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i11);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i11);
                                }
                                MediaController.w().d(k27Var2);
                                String str = (String) k3aVar.E.get(k27Var3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (k3aVar.x.isEmpty()) {
                                    k3aVar.d();
                                } else {
                                    if (k3aVar.G == k27Var2.e1()) {
                                        k27 k27Var4 = (k27) b00.f(1, k3aVar.x);
                                        k3aVar.G = k27Var4.e1();
                                        k27Var4.k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(k27Var4.k);
                                        getMessagesStorage().e1(-2, 0, i3, k3aVar.a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(k3aVar)) {
                                        arrayList3.add(k3aVar);
                                    }
                                }
                            }
                        } else if (k3aVar.m.e1() == k27Var2.e1()) {
                            i0(k27Var2.e1(), k27Var2.r1);
                            arrayList6.remove(i10);
                            k3aVar.d();
                            MediaController.w().d(k3aVar.m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (k3aVar.d != null) {
                                    z2 = true;
                                }
                            }
                        } else {
                            i10++;
                        }
                    }
                }
            }
            i8 = i4 + 1;
            i6 = i3;
            arrayList4 = arrayList5;
            j2 = j;
            z = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            String str2 = (String) arrayList2.get(i12);
            if (str2.startsWith("http")) {
                fl5.z().c(str2);
            } else {
                getFileLoader().b(str2, z2);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i13 = 0; i13 < size2; i13++) {
            s0((k3a) arrayList3.get(i13), false);
        }
        if (arrayList.size() == 1 && ((k27) arrayList.get(0)).Y2() && ((k27) arrayList.get(0)).D1 != null) {
            k0((k27) arrayList.get(0));
        } else if (arrayList.size() != 1 || !((k27) arrayList.get(0)).Y2() || !((k27) arrayList.get(0)).S3()) {
            if (!arrayList.isEmpty() && k27.c5(((k27) arrayList.get(0)).k)) {
                i2 = 9;
            } else if (!arrayList.isEmpty() && k27.a4(((k27) arrayList.get(0)).k)) {
                i2 = 5;
            } else {
                if (i6 != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                getMessagesController().V(arrayList7, null, null, j2, i7, false, i);
            }
            i = i2;
            getMessagesController().V(arrayList7, null, null, j2, i7, false, i);
        }
    }

    public final void g0(k27 k27Var) {
        boolean z;
        if (k27Var != null && k27Var.e1() <= 0 && !k27Var.r1) {
            TLRPC.Message message = k27Var.k;
            int i = message.id;
            SparseArray sparseArray = this.e;
            if (sparseArray.indexOfKey(i) >= 0) {
                z = true;
            } else {
                z = false;
            }
            sparseArray.put(message.id, message);
            if (!z && !k27.c3(message)) {
                long B0 = k27.B0(message);
                vf6 vf6Var = this.h;
                vf6Var.k(Integer.valueOf(((Integer) vf6Var.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(kk7.m1, new Object[0]);
            }
        }
    }

    public final TLRPC.Message h0(int i, boolean z) {
        if (i > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i);
            if (message != null) {
                sparseArray.remove(i);
            }
            return message;
        }
        SparseArray sparseArray2 = this.c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i);
        if (message2 != null) {
            sparseArray2.remove(i);
            if (!z) {
                long B0 = k27.B0(message2);
                vf6 vf6Var = this.f;
                Integer num = (Integer) vf6Var.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        vf6Var.l(B0);
                    } else {
                        vf6Var.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(kk7.m1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void i0(int i, boolean z) {
        if (i <= 0 && !z) {
            SparseArray sparseArray = this.e;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i);
            if (message != null) {
                sparseArray.remove(i);
                long B0 = k27.B0(message);
                vf6 vf6Var = this.h;
                Integer num = (Integer) vf6Var.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        vf6Var.l(B0);
                    } else {
                        vf6Var.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(kk7.m1, new Object[0]);
                }
            }
        }
    }

    public final boolean j0(long j, k27 k27Var, boolean z) {
        long j2;
        int i = 0;
        if (k27Var.e1() >= 0) {
            if (k27Var.Y2()) {
                s(k27Var, null, null, null, null, null, null, null, true, k27Var.t2(), k27Var);
                return false;
            }
        } else {
            TLRPC.Message message = k27Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                if (z) {
                    k(k27Var, null, false);
                }
            } else {
                boolean z2 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i2 = kk7.r;
                if (z2) {
                    TLRPC.EncryptedChat Y0 = getMessagesController().Y0(Integer.valueOf((int) (k27.B0(message) & 4294967295L)));
                    if (Y0 == null) {
                        getMessagesStorage().K0(k27Var.r1 ? 1 : 0, k27Var.k);
                        k27Var.k.send_state = 2;
                        getNotificationCenter().k(kk7.L, Integer.valueOf(k27Var.e1()));
                        c0(k27Var.e1());
                        return false;
                    }
                    TLRPC.Message message2 = k27Var.k;
                    if (message2.random_id == 0) {
                        message2.random_id = D();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = k27Var.k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(Y0, k27Var.k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(Y0, null, k27Var.k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(Y0, k27Var.k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(Y0, k27Var.k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(Y0, null, k27Var.k);
                        return true;
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                            bu9 secretChatHelper = getSecretChatHelper();
                            TLRPC.Message message3 = k27Var.k;
                            secretChatHelper.getClass();
                            if (Y0 instanceof TLRPC.TL_encryptedChat) {
                                TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                                if (message3 != null) {
                                    tL_decryptedMessageService.action = message3.action.encryptedAction;
                                } else {
                                    TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                    tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                    tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                    message3 = secretChatHelper.d(Y0, tL_decryptedMessageActionScreenshotMessages);
                                    k27 k27Var2 = new k27(secretChatHelper.currentAccount, message3, false, false);
                                    k27Var2.k.send_state = 1;
                                    k27Var2.X1 = true;
                                    secretChatHelper.getMessagesController().q5(0, message3.dialog_id, tb4.t(k27Var2));
                                    secretChatHelper.getNotificationCenter().k(i2, new Object[0]);
                                }
                                TLRPC.Message message4 = message3;
                                tL_decryptedMessageService.random_id = message4.random_id;
                                secretChatHelper.j(tL_decryptedMessageService, message4, Y0, null, null, null);
                                return true;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                            if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                                getSecretChatHelper().y(Y0, 0, 0, k27Var.k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                                getSecretChatHelper().s(Y0, k27Var.k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                                getSecretChatHelper().p(Y0, k27Var.k, 0L);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                                getSecretChatHelper().x(Y0, k27Var.k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                                getSecretChatHelper().q(Y0, k27Var.k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                                getSecretChatHelper().v(Y0, k27Var.k);
                            }
                        }
                        return true;
                    }
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(k27.B0(k27Var.k)));
                    int N1 = k27Var.N1();
                    TLRPC.Message message5 = k27Var.k;
                    if (V1 != null && N1 != 0 && V1.id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = V1.access_hash;
                        tL_inputPeerUser.user_id = V1.id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = N1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = D();
                            message5.dialog_id = V1.id;
                            message5.unread = true;
                            message5.out = true;
                            int i3 = getUserConfig().i();
                            message5.id = i3;
                            message5.local_id = i3;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= 264;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = N1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = V1.id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().u(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        k27 k27Var3 = new k27(this.currentAccount, message5, false, true);
                        k27Var3.k.send_state = 1;
                        k27Var3.X1 = true;
                        getMessagesController().q5(0, message5.dialog_id, tb4.t(k27Var3));
                        getNotificationCenter().k(i2, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                        M(tL_messages_sendScreenshotNotification, k27Var3, null, null, null, null, false);
                    }
                }
                if (z) {
                    this.b.put(k27Var.e1(), k27Var);
                }
                long B0 = k27.B0(k27Var.k);
                TLRPC.Message message6 = k27Var.k;
                String str = message6.attachPath;
                TLRPC.ReplyMarkup replyMarkup = message6.reply_markup;
                HashMap<String, String> hashMap = message6.params;
                boolean z3 = !message6.silent;
                if (k27Var.r1) {
                    i = message6.date;
                }
                x3a c = x3a.c(null, null, null, null, null, null, null, null, null, null, B0, str, null, null, null, true, k27Var, null, replyMarkup, hashMap, z3, i, 0, 0, null, null, false, false);
                TLRPC.Message message7 = k27Var.k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c.N = k27.I1(message7);
                    message7 = k27Var.k;
                    c.Q = message7.paid_message_stars;
                }
                if (message7 != null) {
                    j2 = message7.ephemeralReceiverBotId;
                } else {
                    j2 = 0;
                }
                c.X = j2;
                c.Q = j;
                q0(c);
                return true;
            }
        }
        return false;
    }

    public final void k(k27 k27Var, TLRPC.Updates updates, boolean z) {
        int i;
        if (k27Var == null) {
            return;
        }
        long B0 = k27.B0(k27Var.k);
        long j = k27Var.k.random_id;
        boolean z2 = true;
        TLRPC.Message message = null;
        if (updates != null) {
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    TLRPC.Update update = arrayList.get(i2);
                    i2++;
                    TLRPC.Update update2 = update;
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                        if (tL_updateMessageID.random_id == j) {
                            i = tL_updateMessageID.id;
                            break;
                        }
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            for (int i3 = 0; i3 < updates.updates.size(); i3++) {
                TLRPC.Update update3 = updates.updates.get(i3);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    TLRPC.Message message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && cf3.n(message2.peer_id) == B0 && (i == 0 || message2.id == i)) {
                        updates.updates.remove(i3);
                        Utilities.d.c(new b3a(this, tL_updateNewMessage, (byte) 1));
                        message = message2;
                        break;
                    }
                }
            }
            if (message != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j) {
                        updates.updates.remove(size2);
                    }
                }
            }
        } else {
            i = 0;
        }
        TLRPC.Message message3 = message;
        int i4 = k27Var.k.local_id;
        if (i4 >= 0) {
            i4 = k27Var.e1();
        }
        int i5 = i4;
        if (message3 == null) {
            if (k27Var.e1() > 0) {
                c0(i5);
                h0(i5, false);
                return;
            }
            if (!z && i == 0) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.id = i5;
                tL_messageService.dialog_id = B0;
                getMessagesStorage().K0(0, tL_messageService);
                k27Var.k.send_state = 2;
                k27Var.M1 = true;
                getNotificationCenter().k(kk7.L, Integer.valueOf(i5));
            } else {
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new hb7(messagesStorage, j, B0, Integer.valueOf(i5), i5, k27Var.k.date));
                k27Var.k.send_state = 0;
                k27Var.M1 = true;
                getNotificationCenter().k(kk7.I, Integer.valueOf(i5));
            }
            c0(i5);
            h0(i5, false);
            return;
        }
        message3.dialog_id = B0;
        message3.local_id = 0;
        message3.send_state = 0;
        Integer num = (Integer) getMessagesController().Q.get(Long.valueOf(B0));
        if (num == null) {
            num = Integer.valueOf(getMessagesStorage().S(B0, true));
            getMessagesController().Q.put(Long.valueOf(B0), num);
        }
        if (num.intValue() >= message3.id) {
            z2 = false;
        }
        message3.unread = z2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(message3);
        getMessagesStorage().a.c(new r77(this, j, B0, i5, message3, arrayList2, k27Var));
    }

    public final void k0(k27 k27Var) {
        k27Var.q1 = true;
        TLRPC.Message message = k27Var.k;
        message.media = k27Var.D1;
        message.message = k27Var.C1;
        ArrayList<TLRPC.MessageEntity> arrayList = k27Var.F1;
        message.entities = arrayList;
        message.attachPath = k27Var.G1;
        message.send_state = 0;
        int i = message.flags;
        if (arrayList != null) {
            message.flags = i | 128;
        } else {
            message.flags = i & (-129);
        }
        k27Var.D1 = null;
        k27Var.C1 = null;
        k27Var.F1 = null;
        k27Var.G1 = null;
        k27Var.r0 = null;
        k27Var.D = -1;
        k27Var.K5();
        k27Var.z = null;
        if (k27Var.D != 0) {
            k27Var.k0();
        } else {
            k27Var.S1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(k27Var.k);
        getMessagesStorage().g1(arrayList2, false, true, false, 0, false, k27Var.r1 ? 1 : 0, 0L);
        getNotificationCenter().k(kk7.l0, Long.valueOf(k27.B0(k27Var.k)), tb4.t(k27Var));
    }

    public final void m0(boolean z, k27 k27Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, mu1 mu1Var) {
        boolean z2;
        int i;
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (k27Var != null && keyboardButtonProto != null && mu1Var != null) {
            if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                i = 3;
                z2 = false;
            } else if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                z2 = false;
                i = 1;
            } else {
                z2 = z;
                if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            String str = k27.B0(k27Var.k) + "_" + k27Var.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i;
            this.r.put(str, Boolean.TRUE);
            HashMap hashMap = this.s;
            List list = (List) hashMap.get(k27.B0(k27Var.k) + "_" + k27Var.e1());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                hashMap.put(k27.B0(k27Var.k) + "_" + k27Var.e1(), arrayList);
                list = arrayList;
            }
            list.add(str);
            TLObject[] tLObjectArr = new TLObject[1];
            i2a i2aVar = new i2a(this, str, list, z2, k27Var, keyboardButtonProto, mu1Var, twoStepVerificationActivity, tLObjectArr, tL_inputCheckPasswordSRP, z);
            if (z2) {
                getMessagesStorage().L(str, i2aVar);
                return;
            }
            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
            if (tL_inlineButtonTypeUrlAuth != null) {
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.peer = getMessagesController().h1(k27.B0(k27Var.k));
                tL_messages_requestUrlAuth.msg_id = k27Var.e1();
                tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
                tL_messages_requestUrlAuth.flags |= 2;
                tLObjectArr[0] = tL_messages_requestUrlAuth;
                getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, i2aVar, 2);
                return;
            }
            boolean c = jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class);
            TLRPC.Message message = k27Var.k;
            if (c) {
                if ((message.media.flags & 4) == 0) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                    tL_inputInvoiceMessage.msg_id = k27Var.e1();
                    tL_inputInvoiceMessage.peer = getMessagesController().k1(k27Var.k.peer_id);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                    JSONObject u = ow0.u(null, false);
                    if (u != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    tLObjectArr[0] = tL_payments_getPaymentForm;
                    getConnectionsManager().sendRequest(tL_payments_getPaymentForm, i2aVar, 2);
                    return;
                }
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = k27Var.k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().k1(k27Var.k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, i2aVar, 2);
            } else if (k27.c3(message)) {
                TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
                tL_getCallbackAnswer.peer = getMessagesController().h1(k27.B0(k27Var.k));
                tL_getCallbackAnswer.id = k27Var.P0();
                tL_getCallbackAnswer.data = keyboardButtonProto.getData();
                getConnectionsManager().sendRequest(tL_getCallbackAnswer, i2aVar, 2);
            } else {
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = getMessagesController().h1(k27.B0(k27Var.k));
                tL_messages_getBotCallbackAnswer.msg_id = k27Var.e1();
                tL_messages_getBotCallbackAnswer.game = jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
                if (tL_inlineButtonTypeCallback != null && tL_inlineButtonTypeCallback.requires_password) {
                    if (tL_inputCheckPasswordSRP != null) {
                        tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
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
                getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, i2aVar, 2);
            }
        }
    }

    public final void n0(k27 k27Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        if (k27Var != null && keyboardButtonProto != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(k27.B0(k27Var.k));
            sb.append("_");
            sb.append(k27Var.e1());
            sb.append("_");
            sb.append(Utilities.f(keyboardButtonProto.getData()));
            sb.append("_");
            if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                str = "1";
            } else {
                str = "0";
            }
            sb.append(str);
            this.n.put(sb.toString(), k27Var);
            this.H.m();
        }
    }

    public final TLRPC.TL_inputReplyToMessage o(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i = tL_messageReplyHeader.flags;
        if ((i & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = na7.q1(this.currentAccount).k1(tL_messageReplyHeader.reply_to_peer_id);
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

    public final void o0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j, long j2) {
        long D;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null && tL_inputMediaGame != null) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
            tL_messages_sendMedia.peer = inputPeer;
            boolean z = inputPeer instanceof TLRPC.TL_inputPeerChannel;
            int i = this.currentAccount;
            if (z) {
                tL_messages_sendMedia.silent = na7.q1(i).W3.getBoolean("silent_" + (-inputPeer.channel_id), false);
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                tL_messages_sendMedia.silent = na7.q1(i).W3.getBoolean("silent_" + (-inputPeer.chat_id), false);
            } else {
                tL_messages_sendMedia.silent = na7.q1(i).W3.getBoolean("silent_" + inputPeer.user_id, false);
            }
            if (j != 0) {
                D = j;
            } else {
                D = D();
            }
            tL_messages_sendMedia.random_id = D;
            tL_messages_sendMedia.message = "";
            tL_messages_sendMedia.media = tL_inputMediaGame;
            long M = hc2.M(getMessagesController().K0(Long.valueOf(inputPeer.chat_id)), getMessagesController().L0(inputPeer.chat_id), false);
            if (M != y6c.h(this.currentAccount).e()) {
                tL_messages_sendMedia.send_as = getMessagesController().h1(M);
            }
            long K1 = getMessagesController().K1(cf3.m(inputPeer));
            if (K1 <= 0) {
                K1 = cf3.j(getMessagesController().I2(cf3.m(inputPeer)));
            }
            if (K1 > 0) {
                tL_messages_sendMedia.flags |= 2097152;
                tL_messages_sendMedia.allow_paid_stars = K1;
            }
            if (j2 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    nativeByteBuffer.writeInt32(3);
                    nativeByteBuffer.writeInt64(j);
                    inputPeer.serializeToStream(nativeByteBuffer);
                    tL_inputMediaGame.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    e = e2;
                    nativeByteBuffer2 = nativeByteBuffer;
                    fa4.g(e, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j2 = getMessagesStorage().y(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_sendMedia, new eu2(this, j2, (byte) 5));
                }
                j2 = getMessagesStorage().y(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_sendMedia, new eu2(this, j2, (byte) 5));
        }
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.id;
        tL_inputReplyToStory.peer = getMessagesController().h1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public final int p0(final java.util.ArrayList r61, long r62, final boolean r64, final boolean r65, final boolean r66, final int r67, final int r68, final defpackage.k27 r69, final int r70, long r71, final long r73, final defpackage.u47 r75) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.p0(java.util.ArrayList, long, boolean, boolean, boolean, int, int, k27, int, long, long, u47):int");
    }

    public final void q0(defpackage.x3a r104) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.q0(x3a):void");
    }

    public final void r0(k27 k27Var, ArrayList arrayList, h19 h19Var, boolean z, boolean z2, d dVar, kp1 kp1Var) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (k27Var != null && dVar != null) {
            TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
            TLRPC.Message message = k27Var.k;
            if (message.isThreadMessage && message.fwd_from != null) {
                tL_messages_sendReaction.peer = getMessagesController().h1(k27Var.Z0());
                tL_messages_sendReaction.msg_id = k27Var.k.fwd_from.saved_from_msg_id;
            } else {
                tL_messages_sendReaction.peer = getMessagesController().h1(k27.B0(k27Var.k));
                tL_messages_sendReaction.msg_id = k27Var.e1();
            }
            tL_messages_sendReaction.add_to_recent = z2;
            if (z2 && h19Var != null) {
                ArrayList arrayList2 = hq6.d0(this.currentAccount).F1;
                if (h19Var.f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = h19Var.f;
                    tL_reactionCustomEmoji = tL_reactionEmoji;
                } else {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji2.document_id = h19Var.g;
                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                }
                arrayList2.add(0, tL_reactionCustomEmoji);
            }
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    h19 h19Var2 = (h19) arrayList.get(i);
                    if (h19Var2.g != 0) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji3.document_id = h19Var2.g;
                        tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                        tL_messages_sendReaction.flags |= 1;
                    } else if (h19Var2.f != null) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji2.emoticon = h19Var2.f;
                        tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                        tL_messages_sendReaction.flags |= 1;
                    }
                }
            }
            if (z) {
                tL_messages_sendReaction.flags |= 2;
                tL_messages_sendReaction.big = true;
            }
            getConnectionsManager().sendRequest(tL_messages_sendReaction, new hj7(this, kp1Var, (byte) 20));
        }
    }

    public final void s(defpackage.k27 r31, org.telegram.tgnet.TLRPC.TL_inputPollAnswer r32, org.telegram.tgnet.TLRPC.TL_photo r33, defpackage.oac r34, org.telegram.tgnet.TLRPC.TL_document r35, java.lang.String r36, org.telegram.tgnet.TLRPC.PhotoSize r37, java.util.HashMap r38, boolean r39, boolean r40, java.lang.Object r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.s(k27, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.tgnet.TLRPC$TL_photo, oac, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, org.telegram.tgnet.TLRPC$PhotoSize, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public final void s0(defpackage.k3a r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.s0(k3a, boolean):void");
    }

    public final void t(k27 k27Var, d dVar, int i, int i2) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (dVar.getParentActivity() == null) {
            return;
        }
        if (k27.c3(k27Var.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
            tL_editMessage2.id = k27.S(k27Var.e1());
            tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage2.welcome = true;
            tL_editMessage = tL_editMessage2;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.id = k27Var.e1();
            tL_editMessage = tL_messages_editMessage;
        }
        tL_editMessage.peer = getMessagesController().h1(k27.B0(k27Var.k));
        TLRPC.Message message = k27Var.k;
        if (message != null && (message.flags & 1073741824) != 0) {
            tL_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_editMessage.flags |= 131072;
        }
        if (i != 0) {
            tL_editMessage.schedule_date = i;
            int i3 = tL_editMessage.flags;
            tL_editMessage.flags = 32768 | i3;
            if (i2 != 0) {
                tL_editMessage.schedule_repeat_period = i2;
                tL_editMessage.flags = i3 | 294912;
            }
        }
        getConnectionsManager().sendRequest(tL_editMessage, new ck8(this, dVar, tL_editMessage, (byte) 10));
    }

    public final void t0(TLRPC.Document document, String str, long j, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, bu1 bu1Var, g27 g27Var, boolean z, int i, int i2, boolean z2, Object obj, j1a j1aVar, long j2, long j3, u47 u47Var) {
        u0(document, str, j, null, null, k27Var, k27Var2, storyItem, bu1Var, g27Var, z, i, i2, z2, obj, j1aVar, j2, j3, u47Var, false);
    }

    public final void u(k27 k27Var, TL_iv.RichMessage richMessage, ArrayList arrayList, d dVar, boolean z) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (k27Var != null && richMessage != null && k27Var.k != null) {
            if (k27Var.Y2() && k27Var.k.reqId != 0) {
                getConnectionsManager().cancelRequest(k27Var.k.reqId, true);
                k27Var.k.reqId = 0;
            }
            if (k27.c3(k27Var.k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.id = k27.S(k27Var.e1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.id = k27Var.e1();
                tL_editMessage = tL_messages_editMessage;
            }
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = tL_editMessage;
            tL_messages_editMessage2.peer = getMessagesController().h1(k27.B0(k27Var.k));
            tL_messages_editMessage2.rich_message = l0(arrayList, richMessage);
            int i = tL_messages_editMessage2.flags;
            int i2 = 8388608 | i;
            tL_messages_editMessage2.flags = i2;
            if (k27Var.r1) {
                tL_messages_editMessage2.schedule_date = k27Var.k.date;
                i2 = 8421376 | i;
                tL_messages_editMessage2.flags = i2;
            }
            TLRPC.Message message = k27Var.k;
            if ((message.flags & 1073741824) != 0) {
                tL_messages_editMessage2.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_messages_editMessage2.flags = i2 | 131072;
            }
            message.rich_message = richMessage;
            message.send_state = 3;
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage2, new pf2(this, z, k27Var, tL_messages_editMessage2, dVar, (byte) 4));
            TLRPC.Message message2 = k27Var.k;
            if (message2 != null) {
                message2.reqId = sendRequest;
            }
            getNotificationCenter().k(kk7.l0, Long.valueOf(k27.B0(k27Var.k)), tb4.t(k27Var));
        }
    }

    public final void u0(TLRPC.Document document, String str, final long j, final CharSequence charSequence, final oac oacVar, final k27 k27Var, final k27 k27Var2, final TL_stories.StoryItem storyItem, final bu1 bu1Var, final g27 g27Var, final boolean z, final int i, final int i2, boolean z2, final Object obj, final j1a j1aVar, final long j2, final long j3, final u47 u47Var, final boolean z3) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document != null) {
            HashMap hashMap = null;
            if (cf3.B(j)) {
                if (getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L))) == null) {
                    return;
                }
                document2 = new TLRPC.TL_document_layer82();
                document2.id = document.id;
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
                for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                        tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                        tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                        tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                        tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                        tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                        tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                        document2.attributes.add(tL_documentAttributeVideo_layer159);
                    } else {
                        document2.attributes.add(documentAttribute);
                    }
                }
                if (document2.mime_type == null) {
                    document2.mime_type = "";
                }
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 10, false, null, false);
                if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive) || (w instanceof TLRPC.TL_photoStrippedSize)) {
                    ba4.G(this.currentAccount);
                    File J2 = ba4.J(w, null, true, true);
                    if ((w instanceof TLRPC.TL_photoStrippedSize) || J2.exists()) {
                        try {
                            if (w instanceof TLRPC.TL_photoStrippedSize) {
                                photoSize = new TLRPC.TL_photoStrippedSize();
                                bArr = w.bytes;
                            } else {
                                TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                                J2.length();
                                byte[] bArr3 = new byte[(int) J2.length()];
                                new RandomAccessFile(J2, "r").readFully(bArr3);
                                photoSize = tL_photoCachedSize;
                                bArr = bArr3;
                            }
                            TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                            TLRPC.FileLocation fileLocation = w.location;
                            tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                            tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                            tL_fileLocation_layer82.local_id = fileLocation.local_id;
                            tL_fileLocation_layer82.secret = fileLocation.secret;
                            photoSize.location = tL_fileLocation_layer82;
                            photoSize.size = w.size;
                            photoSize.w = w.w;
                            photoSize.h = w.h;
                            photoSize.type = w.type;
                            photoSize.bytes = bArr;
                            document2.thumbs.add(photoSize);
                            document2.flags |= 1;
                        } catch (Exception e) {
                            fa4.g(e, true);
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
            if (k27.s3(document2, false)) {
                J.c(new Runnable() {
                    @Override
                    public final void run() {
                        String str2;
                        final Bitmap[] bitmapArr = new Bitmap[1];
                        final TLRPC.Document document3 = document2;
                        String q = gl5.b(document3).q(null, null, false);
                        if ("video/mp4".equals(document3.mime_type)) {
                            str2 = ".mp4";
                        } else if ("video/x-matroska".equals(document3.mime_type)) {
                            str2 = ".mkv";
                        } else {
                            str2 = "";
                        }
                        File file = new File(ba4.z(3), tb4.o(q, str2));
                        if (!file.exists()) {
                            file = new File(ba4.z(2), tb4.o(q, str2));
                        }
                        final z3a z3aVar = z3a.this;
                        z3a.v(z3aVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                        final String[] strArr = {z3a.C(z3aVar.getAccountInstance(), ba4.w(document3.thumbs, 320, false, null, false), bitmapArr, true, true)};
                        final long j4 = j;
                        final oac oacVar2 = oacVar;
                        final k27 k27Var3 = k27Var;
                        final k27 k27Var4 = k27Var2;
                        final boolean z4 = z;
                        final int i4 = i;
                        final int i5 = i2;
                        final Object obj2 = obj;
                        final g27 g27Var2 = g27Var;
                        final TL_stories.StoryItem storyItem2 = storyItem;
                        final bu1 bu1Var2 = bu1Var;
                        final j1a j1aVar2 = j1aVar;
                        final long j5 = j2;
                        final long j6 = j3;
                        final u47 u47Var2 = u47Var;
                        final CharSequence charSequence2 = charSequence;
                        final boolean z5 = z3;
                        gl.d3(new Runnable() {
                            @Override
                            public final void run() {
                                oac oacVar3;
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        fl5.z().K(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) document3;
                                long j7 = j4;
                                String str3 = null;
                                if (cf3.B(j7)) {
                                    oacVar3 = null;
                                } else {
                                    oacVar3 = oacVar2;
                                }
                                x3a f = x3a.f(tL_document, oacVar3, null, j7, k27Var3, k27Var4, null, null, null, null, z4, i4, i5, 0, obj2, g27Var2, false);
                                f.H = storyItem2;
                                f.J = bu1Var2;
                                f.K = j1aVar2;
                                f.Q = j5;
                                f.R = j6;
                                f.T = u47Var2;
                                CharSequence charSequence3 = charSequence2;
                                if (charSequence3 != null) {
                                    str3 = charSequence3.toString();
                                }
                                f.b = str3;
                                f.L = z5;
                                z3a.this.q0(f);
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
            x3a f = x3a.f((TLRPC.TL_document) document2, null, null, j, k27Var, k27Var2, null, null, null, hashMap, z, i, i2, 0, obj, g27Var, z2);
            f.H = storyItem;
            f.J = bu1Var;
            f.K = j1aVar;
            f.Q = j2;
            f.R = j3;
            f.T = u47Var;
            f.L = z3;
            q0(f);
        }
    }

    public final int v0(k27 k27Var, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (k27Var != null) {
            String str = "poll_" + k27Var.D1();
            if (!this.r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = k27Var.e1();
                tL_messages_sendVote.peer = getMessagesController().h1(k27.B0(k27Var.k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new rt0(this, k27Var, str, runnable, (byte) 18));
            }
        }
        return 0;
    }

    public final k3a x(int i, long j) {
        int i2;
        k3a k3aVar = null;
        int i3 = Integer.MIN_VALUE;
        for (Map.Entry entry : this.a.entrySet()) {
            ArrayList arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k3a k3aVar2 = (k3a) arrayList.get(i4);
                byte b = k3aVar2.e;
                if ((b == 4 || b == 0) && k3aVar2.a == j) {
                    k27 k27Var = k3aVar2.m;
                    if (k27Var != null) {
                        i2 = k27Var.e1();
                    } else {
                        ArrayList arrayList2 = k3aVar2.x;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            i2 = ((k27) b00.f(1, k3aVar2.x)).e1();
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 != 0 && i2 > i && k3aVar == null && i3 < i2) {
                        k3aVar = k3aVar2;
                        i3 = i2;
                    }
                }
            }
        }
        return k3aVar;
    }

    public final void y0(defpackage.k27 r28, org.telegram.tgnet.TLRPC.Message r29, int r30, java.util.List r31, boolean r32, int r33, java.util.HashMap r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.y0(k27, org.telegram.tgnet.TLRPC$Message, int, java.util.List, boolean, int, java.util.HashMap):void");
    }

    public final TLRPC.TL_photo z(String str, Uri uri, boolean z) {
        TLRPC.PhotoSize W;
        Bitmap G = fl5.G(str, uri, gl.Y0(z), gl.Y0(z), true);
        if (G == null) {
            G = fl5.G(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = G;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize U = fl5.U(bitmap, 90.0f, 90.0f, 55, true);
        if (U != null) {
            arrayList.add(U);
        }
        if (z) {
            W = fl5.W(null, bitmap, Bitmap.CompressFormat.JPEG, gl.Y0(z), gl.Y0(z), 99, false, 101, 101, false);
        } else {
            W = fl5.W(null, bitmap, Bitmap.CompressFormat.JPEG, gl.Y0(z), gl.Y0(z), 80, false, 101, 101, false);
        }
        if (W != null) {
            arrayList.add(W);
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().u(false);
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_photo.date = getConnectionsManager().getCurrentTime();
        tL_photo.sizes = arrayList;
        tL_photo.file_reference = new byte[0];
        return tL_photo;
    }

    public final void z0(k3a k3aVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i = kk7.V1;
        if (inputMedia != null) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.media = inputMedia;
            TLObject tLObject = k3aVar.c;
            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messages_sendMultiMedia.multi_media.size()) {
                        break;
                    } else if (tL_messages_sendMultiMedia.multi_media.get(i2).media == inputMedia) {
                        e0((TLRPC.Message) k3aVar.z.get(i2), k3aVar.H);
                        getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= tL_inputMediaPaidMedia.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia.extended_media.get(i3) == inputMedia) {
                                e0((TLRPC.Message) k3aVar.z.get(i3), k3aVar.H);
                                getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                        TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                            tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                            int a = ud8.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= k3aVar.C.size()) {
                                    break;
                                } else if (((Integer) k3aVar.C.get(i4)).intValue() == a) {
                                    e0((TLRPC.Message) k3aVar.z.get(i4), k3aVar.H);
                                    getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_sendMessage.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia2.extended_media.get(i5) == inputMedia) {
                                e0((TLRPC.Message) k3aVar.z.get(i5), k3aVar.H);
                                getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                        TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                            tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                            int a2 = ud8.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                            int i6 = 0;
                            while (true) {
                                if (i6 >= k3aVar.C.size()) {
                                    break;
                                } else if (((Integer) k3aVar.C.get(i6)).intValue() == a2) {
                                    e0((TLRPC.Message) k3aVar.z.get(i6), k3aVar.H);
                                    getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_uploadMedia, new h2a(this, inputMedia, k3aVar, (byte) 1));
        } else if (inputEncryptedFile != null) {
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) k3aVar.d;
            int i7 = 0;
            while (true) {
                if (i7 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                    break;
                } else if (tL_messages_sendEncryptedMultiMedia.files.get(i7) == inputEncryptedFile) {
                    e0((TLRPC.Message) k3aVar.z.get(i7), k3aVar.H);
                    getNotificationCenter().k(i, str, -1L, -1L, Boolean.FALSE);
                    break;
                } else {
                    i7++;
                }
            }
            s0(k3aVar, false);
        }
    }
}
