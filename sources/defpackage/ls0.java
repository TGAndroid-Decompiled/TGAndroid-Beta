package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ls0 extends ny0 {
    public final int S1;
    public final String T1;
    public l9c U1;
    public final is0 V1;
    public boolean W1;
    public boolean X1;
    public final p Y1;
    public int Z1;

    public ls0(Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, vnb vnbVar, bu0 bu0Var, p pVar) {
        super(context, null, false, false, vnbVar);
        ?? r11;
        int i2;
        ks0 Z0;
        char c;
        char c2;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int i3;
        TLRPC.TL_photo tL_photo2;
        this.W1 = false;
        this.X1 = false;
        this.S1 = i;
        this.T1 = lbc.r(uc7.s1(i).X1(Long.valueOf(j)));
        this.Y1 = pVar;
        U0();
        this.C1 = hl.L(4.0f);
        this.D1 = hl.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file != null && file.exists() && webPage == null) {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            boolean z = true;
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3143036:
                    if (str.equals("file")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 106642994:
                    if (str.equals("photo")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                    TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                    tL_document2.id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (str.equals("sticker")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 102340:
                            if (str.equals("gif")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3143036:
                            if (str.equals("file")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 93166550:
                            if (str.equals("audio")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 112202875:
                            if (str.equals("video")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] g1 = r47.g1(botInlineResult);
                            tL_documentAttributeImageSize.w = g1[0];
                            tL_documentAttributeImageSize.h = g1[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap G = in5.G(new File(xb4.z(4), Utilities.a(botInlineResult.thumb.url) + "." + in5.x(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (G != null) {
                                        TLRPC.PhotoSize U = in5.U(G, 90.0f, 90.0f, 55, false);
                                        if (U != null) {
                                            tL_document2.thumbs.add(U);
                                            tL_document2.flags |= 1;
                                        }
                                        G.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                cc4.g(th, true);
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
                            int lastIndexOf = botInlineResult.content.mime_type.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                tL_documentAttributeFilename.file_name = "file.".concat(botInlineResult.content.mime_type.substring(lastIndexOf + 1));
                                break;
                            } else {
                                tL_documentAttributeFilename.file_name = "file";
                                break;
                            }
                        case 3:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = r47.f1(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i4 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i4 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i4 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document2.attributes.add(tL_documentAttributeAudio);
                            break;
                        case 4:
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] g12 = r47.g1(botInlineResult);
                            tL_documentAttributeVideo.w = g12[0];
                            tL_documentAttributeVideo.h = g12[1];
                            tL_documentAttributeVideo.duration = r47.f1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap G2 = in5.G(new File(xb4.z(4), Utilities.a(botInlineResult.thumb.url) + "." + in5.x(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (G2 != null) {
                                        TLRPC.PhotoSize U2 = in5.U(G2, 90.0f, 90.0f, 55, false);
                                        if (U2 != null) {
                                            tL_document2.thumbs.add(U2);
                                            tL_document2.flags |= 1;
                                        }
                                        G2.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                cc4.g(th2, true);
                                break;
                            }
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = r47.f1(botInlineResult);
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
                        int[] g13 = r47.g1(botInlineResult);
                        tL_photoSize.w = g13[0];
                        z = true;
                        tL_photoSize.h = g13[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    } else {
                        z = true;
                    }
                    tL_document = tL_document2;
                    tL_photo = null;
                    break;
                case 4:
                    if (file.exists()) {
                        i3 = 0;
                        tL_photo2 = r7a.B(i).z(absolutePath, null, false);
                    } else {
                        i3 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i).getCurrentTime();
                        tL_photo2.file_reference = new byte[i3];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] g14 = r47.g1(botInlineResult);
                        tL_photoSize2.w = g14[i3];
                        tL_photoSize2.h = g14[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    z = true;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i2 = i;
            r11 = z;
            Z0 = Z0(i2, j, botInlineResult, tL_photo, tL_document, null);
        } else {
            r11 = 1;
            i2 = i;
            Z0 = Z0(i2, j, botInlineResult, null, null, webPage);
        }
        ks0 ks0Var = Z0;
        dl1 dl1Var = new dl1(vnbVar, context, false);
        dl1Var.setDelegate(new Object());
        dl1Var.setCustomText(ob6.M0(2131752960, null));
        wb2 wb2Var = new wb2(context, i2);
        wb2Var.setDelegate(new Object());
        wb2Var.z3(ks0Var, null, false, false, false, false);
        LinearLayout j2 = uh9.j(context, r11);
        j2.addView(dl1Var, tre.o(-1, -2));
        j2.addView(wb2Var, tre.o(-1, -2));
        ?? wmaVar = new wma(context, null);
        this.V1 = wmaVar;
        wmaVar.U(mm8.d(null, i2, j, aob.I.o()));
        wmaVar.addView(j2, tre.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        c51 i5 = xnb.i(24, vnbVar, context, r11);
        i5.i(ob6.M0(2131752959, null), false, r11);
        i5.setOnClickListener(new yr0(this, tL_messages_preparedInlineMessage, pVar, i2, j, bu0Var));
        frameLayout.addView(i5, tre.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.b;
        int i6 = this.u0;
        viewGroup.addView(frameLayout, tre.f(-2.0f, -1, 87, i6, 0, i6, 0));
        d79 d79Var = this.n1;
        int i7 = this.u0;
        d79Var.setPadding(i7, 0, i7, hl.L(68.0f) + r11);
        this.n1.s1();
        int i8 = aob.a7;
        s0(aob.v0(i8, this.J0));
        L(i8);
        this.U1.O(false);
    }

    public static defpackage.ks0 Z0(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls0.Z0(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):ks0");
    }

    public static void a1(Context context, int i, long j, String str, vnb vnbVar, bu0 bu0Var, p pVar) {
        id idVar = new id(3, null, context);
        idVar.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = uc7.s1(i).o1(j);
        tL_messages_getPreparedInlineMessage.id = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getPreparedInlineMessage, new xr0(i, idVar, context, j, vnbVar, bu0Var, pVar));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.S1, 0, true, new c(this, (byte) 17), this.J0);
        this.U1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131752962, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.W1 && !this.X1) {
            this.X1 = true;
            p pVar = this.Y1;
            if (pVar != null) {
                pVar.a("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int b;
        super.onCreate(bundle);
        d79 d79Var = this.n1;
        if (d79Var.getAdapter() == null) {
            b = 0;
        } else {
            b = d79Var.getAdapter().b();
        }
        d79Var.x0(Math.max(b - 1, 0));
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = aob.v0(aob.a7, this.J0);
            if (v0 != this.Z1) {
                this.Z1 = v0;
                s0(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
