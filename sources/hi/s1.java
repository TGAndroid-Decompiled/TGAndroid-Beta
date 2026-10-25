package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import fi.o6;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vw0;
public final class s1 extends bb {
    public final int X;
    public final String Y;
    public j71 Z;
    public final p1 f13261a0;
    public boolean f13262b0;
    public boolean f13263c0;
    public final bi.t0 f13264d0;
    public int f13265e0;

    public s1(Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        super(context, null, false, false, u6Var);
        ?? r11;
        int i11;
        r1 P;
        char c10;
        char c11;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int lastIndexOf;
        TLRPC.TL_photo tL_photo2;
        this.f13262b0 = false;
        this.f13263c0 = false;
        this.X = i10;
        this.Y = UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f13264d0 = t0Var;
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file == null || !file.exists() || webPage != null) {
            r11 = 1;
            i11 = i10;
            P = P(i11, j10, botInlineResult, null, null, webPage);
        } else {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            boolean z10 = true;
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
                    tL_document2.f22033id = 0L;
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
                            tL_documentAttributeImageSize.f22034w = inlineResultWidthAndHeight[0];
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
                            tL_documentAttributeVideo.f22034w = inlineResultWidthAndHeight2[0];
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
                        tL_photoSize.f22052w = inlineResultWidthAndHeight3[0];
                        z10 = true;
                        tL_photoSize.h = inlineResultWidthAndHeight3[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    } else {
                        z10 = true;
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
                        tL_photoSize2.f22052w = inlineResultWidthAndHeight4[0];
                        tL_photoSize2.h = inlineResultWidthAndHeight4[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    z10 = true;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i11 = i10;
            r11 = z10;
            P = P(i11, j10, botInlineResult, tL_photo, tL_document, null);
        }
        r1 r1Var = P;
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, u6Var, false);
        v0Var.setDelegate(new Object());
        v0Var.setCustomText(LocaleController.getString(R.string.BotShareMessagePreview));
        org.telegram.ui.Cells.s1 s1Var = new org.telegram.ui.Cells.s1(context, i11);
        s1Var.setDelegate(new Object());
        s1Var.Z3(r1Var, null, false, false, false, false);
        LinearLayout d = vh.d(context, r11);
        d.addView(v0Var, gb1.r(-1, -2));
        d.addView(s1Var, gb1.r(-1, -2));
        ?? vw0Var = new vw0(context, null);
        this.f13261a0 = vw0Var;
        vw0Var.U(o6.e(null, i11, j10, y6.I.q()));
        vw0Var.addView(d, gb1.h(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        fi.d f7 = vh.f(24, context, u6Var, r11);
        f7.i(LocaleController.getString(R.string.BotShareMessageShare), false, r11);
        f7.setOnClickListener(new bi.d1(this, tL_messages_preparedInlineMessage, t0Var, i11, j10, tVar));
        frameLayout.addView(f7, gb1.h(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, gb1.j(-2.0f, 87, i13, 0, i13, 0));
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f) + r11);
        this.d.u1();
        int i15 = y6.f23297a7;
        setBackgroundColor(getThemedColor(i15));
        fixNavigationBarKey(i15);
        this.Z.O(false);
    }

    public static hi.r1 P(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.s1.P(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):hi.r1");
    }

    public static void Q(Context context, int i10, long j10, String str, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
        e2Var.r(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i10).getInputUser(j10);
        tL_messages_getPreparedInlineMessage.f22125id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new g1(i10, e2Var, context, j10, u6Var, tVar, t0Var));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.f13262b0 && !this.f13263c0) {
            this.f13263c0 = true;
            bi.t0 t0Var = this.f13264d0;
            if (t0Var != null) {
                t0Var.run("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int h;
        super.onCreate(bundle);
        mm0 mm0Var = this.d;
        if (mm0Var.getAdapter() == null) {
            h = 0;
        } else {
            h = mm0Var.getAdapter().h();
        }
        mm0Var.v0(Math.max(h - 1, 0));
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(y6.f23297a7);
            if (themedColor != this.f13265e0) {
                this.f13265e0 = themedColor;
                setBackgroundColor(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.X, 0, true, new ai.e(this, 29), this.resourcesProvider);
        this.Z = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
