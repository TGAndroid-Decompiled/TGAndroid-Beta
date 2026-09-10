package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.e8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import w7.a6;
public final class s1 extends ab {
    public final int X;
    public final String Y;
    public j61 Z;
    public final p1 f6892a0;
    public boolean f6893b0;
    public boolean f6894c0;
    public final org.telegram.tgnet.g f6895d0;

    public s1(Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        super(context, null, false, false, f6Var);
        ?? r11;
        int i11;
        r1 P;
        char c10;
        char c11;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int lastIndexOf;
        TLRPC.TL_photo tL_photo2;
        this.f6893b0 = false;
        this.f6894c0 = false;
        this.X = i10;
        this.Y = UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f6895d0 = gVar;
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file == null || !file.exists() || webPage != null) {
            r11 = 1;
            i11 = i10;
            P = P(i11, j3, botInlineResult, null, null, webPage);
        } else {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3143036:
                    if (str.equals("file")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106642994:
                    if (str.equals("photo")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
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
                    TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                    tL_document2.f17201id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (str.equals("sticker")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 102340:
                            if (str.equals("gif")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3143036:
                            if (str.equals("file")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 93166550:
                            if (str.equals("audio")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 112202875:
                            if (str.equals("video")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                            tL_documentAttributeImageSize.f17202w = inlineResultWidthAndHeight[0];
                            tL_documentAttributeImageSize.h = inlineResultWidthAndHeight[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap loadBitmap = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (loadBitmap != null) {
                                        TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, false);
                                        if (scaleAndSaveImage != null) {
                                            tL_document2.thumbs.add(scaleAndSaveImage);
                                            tL_document2.flags |= 1;
                                        }
                                        loadBitmap.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                break;
                            }
                            break;
                        case 1:
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            if (absolutePath.endsWith("mp4")) {
                                tL_document2.mime_type = "video/mp4";
                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                break;
                            } else {
                                tL_document2.mime_type = "image/gif";
                                break;
                            }
                        case 2:
                            if (botInlineResult.content.mime_type.lastIndexOf(47) != -1) {
                                tL_documentAttributeFilename.file_name = "file." + botInlineResult.content.mime_type.substring(lastIndexOf + 1);
                                break;
                            } else {
                                tL_documentAttributeFilename.file_name = "file";
                                break;
                            }
                        case 3:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i12 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i12 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i12 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document2.attributes.add(tL_documentAttributeAudio);
                            break;
                        case 4:
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                            tL_documentAttributeVideo.f17202w = inlineResultWidthAndHeight2[0];
                            tL_documentAttributeVideo.h = inlineResultWidthAndHeight2[1];
                            tL_documentAttributeVideo.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap loadBitmap2 = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (loadBitmap2 != null) {
                                        TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(loadBitmap2, 90.0f, 90.0f, 55, false);
                                        if (scaleAndSaveImage2 != null) {
                                            tL_document2.thumbs.add(scaleAndSaveImage2);
                                            tL_document2.flags |= 1;
                                        }
                                        loadBitmap2.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                break;
                            }
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeAudio2.voice = true;
                            tL_documentAttributeFilename.file_name = "audio.ogg";
                            tL_document2.attributes.add(tL_documentAttributeAudio2);
                            break;
                    }
                    if (tL_documentAttributeFilename.file_name == null) {
                        tL_documentAttributeFilename.file_name = "file";
                    }
                    if (tL_document2.mime_type == null) {
                        tL_document2.mime_type = "application/octet-stream";
                    }
                    if (tL_document2.thumbs.isEmpty()) {
                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                        int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                        tL_photoSize.f17220w = inlineResultWidthAndHeight3[0];
                        tL_photoSize.h = inlineResultWidthAndHeight3[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    }
                    tL_document = tL_document2;
                    tL_photo = null;
                    break;
                case 4:
                    if (file.exists()) {
                        tL_photo2 = SendMessagesHelper.getInstance(i10).generatePhotoSizes(absolutePath, null);
                    } else {
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                        tL_photo2.file_reference = new byte[0];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] inlineResultWidthAndHeight4 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                        tL_photoSize2.f17220w = inlineResultWidthAndHeight4[0];
                        tL_photoSize2.h = inlineResultWidthAndHeight4[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i11 = i10;
            r11 = 1;
            P = P(i11, j3, botInlineResult, tL_photo, tL_document, null);
        }
        r1 r1Var = P;
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, f6Var, false);
        w0Var.setDelegate(new Object());
        w0Var.setCustomText(LocaleController.getString(R.string.BotShareMessagePreview));
        org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, i11);
        t1Var.setDelegate(new Object());
        t1Var.X3(r1Var, null, false, false, false, false);
        LinearLayout f7 = em.f(context, r11);
        f7.addView(w0Var, a6.n(-1, -2));
        f7.addView(t1Var, a6.n(-1, -2));
        ?? aw0Var = new aw0(context, null);
        this.f6892a0 = aw0Var;
        aw0Var.V(e8.e(null, i11, j3, j6.I.q()));
        aw0Var.addView(f7, a6.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.d g10 = em.g(24, context, f6Var, r11);
        g10.g(LocaleController.getString(R.string.BotShareMessageShare), false, r11);
        g10.setOnClickListener(new f1(this, tL_messages_preparedInlineMessage, gVar, i11, j3, tVar));
        frameLayout.addView(g10, a6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, a6.f(-2.0f, 87, i13, 0, i13, 0));
        vl0 vl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f) + r11);
        this.d.o1();
        int i15 = j6.f17872a7;
        setBackgroundColor(getThemedColor(i15));
        fixNavigationBar(getThemedColor(i15));
        this.Z.N(false);
    }

    public static di.r1 P(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: di.s1.P(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):di.r1");
    }

    public static void Q(Context context, int i10, long j3, String str, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        d2Var.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i10).getInputUser(j3);
        tL_messages_getPreparedInlineMessage.f17293id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new e1(i10, d2Var, context, j3, f6Var, tVar, gVar));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.f6893b0 && !this.f6894c0) {
            this.f6894c0 = true;
            org.telegram.tgnet.g gVar = this.f6895d0;
            if (gVar != null) {
                gVar.run("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int h;
        super.onCreate(bundle);
        vl0 vl0Var = this.d;
        if (vl0Var.getAdapter() == null) {
            h = 0;
        } else {
            h = vl0Var.getAdapter().h();
        }
        vl0Var.u0(Math.max(h - 1, 0));
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.X, 0, true, new ai.c0(this, 15), this.resourcesProvider);
        this.Z = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
