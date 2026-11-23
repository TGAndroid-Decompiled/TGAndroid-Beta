package ki;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c8.ma;
import hi.d7;
import hi.v5;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.sa;
public final class g1 extends sa {
    public final int T1;
    public final String U1;
    public c51 V1;
    public final d1 W1;
    public boolean X1;
    public boolean Y1;
    public final bi.h0 Z1;
    public int f18724a2;

    public g1(Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        super(context, null, false, false, h6Var);
        ?? r11;
        int i10;
        f1 e12;
        char c10;
        char c11;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int lastIndexOf;
        int i11;
        TLRPC.TL_photo tL_photo2;
        this.X1 = false;
        this.Y1 = false;
        this.T1 = i7;
        this.U1 = p10.q(np.u1(i7).c2(Long.valueOf(j3)));
        this.Z1 = h0Var;
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file == null || !file.exists() || webPage != null) {
            r11 = 1;
            i10 = i7;
            e12 = e1(i10, j3, botInlineResult, null, null, webPage);
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
                    tL_document2.f28440id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i7).getCurrentTime();
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
                            int[] g12 = gj.g1(botInlineResult);
                            tL_documentAttributeImageSize.f28441w = g12[0];
                            tL_documentAttributeImageSize.h = g12[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K = fc.K(new File(w7.z(4), Utilities.a(botInlineResult.thumb.url) + "." + fc.B(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K != null) {
                                        TLRPC.PhotoSize Z = fc.Z(K, 90.0f, 90.0f, 55, false);
                                        if (Z != null) {
                                            tL_document2.thumbs.add(Z);
                                            tL_document2.flags |= 1;
                                        }
                                        K.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                a8.g(th2, true);
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
                            tL_documentAttributeAudio.duration = gj.f1(botInlineResult);
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
                            int[] g13 = gj.g1(botInlineResult);
                            tL_documentAttributeVideo.f28441w = g13[0];
                            tL_documentAttributeVideo.h = g13[1];
                            tL_documentAttributeVideo.duration = gj.f1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K2 = fc.K(new File(w7.z(4), Utilities.a(botInlineResult.thumb.url) + "." + fc.B(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K2 != null) {
                                        TLRPC.PhotoSize Z2 = fc.Z(K2, 90.0f, 90.0f, 55, false);
                                        if (Z2 != null) {
                                            tL_document2.thumbs.add(Z2);
                                            tL_document2.flags |= 1;
                                        }
                                        K2.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                a8.g(th3, true);
                                break;
                            }
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = gj.f1(botInlineResult);
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
                        int[] g14 = gj.g1(botInlineResult);
                        tL_photoSize.f28459w = g14[0];
                        z10 = true;
                        tL_photoSize.h = g14[1];
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
                        i11 = 0;
                        tL_photo2 = az.C(i7).A(absolutePath, null, false);
                    } else {
                        i11 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i7).getCurrentTime();
                        tL_photo2.file_reference = new byte[i11];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] g15 = gj.g1(botInlineResult);
                        tL_photoSize2.f28459w = g15[i11];
                        tL_photoSize2.h = g15[1];
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
            i10 = i7;
            r11 = z10;
            e12 = e1(i10, j3, botInlineResult, tL_photo, tL_document, null);
        }
        f1 f1Var = e12;
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, h6Var, false);
        v0Var.setDelegate(new Object());
        v0Var.setCustomText(hd.N0(2131752967, null));
        org.telegram.ui.Cells.r1 r1Var = new org.telegram.ui.Cells.r1(context, i10);
        r1Var.setDelegate(new Object());
        r1Var.y3(f1Var, null, false, false, false, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, r11);
        g10.addView(v0Var, ma.o(-1, -2));
        g10.addView(r1Var, ma.o(-1, -2));
        ?? du0Var = new du0(context, null);
        this.W1 = du0Var;
        du0Var.U(v5.e(null, i10, j3, m6.I.q()));
        du0Var.addView(g10, ma.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        hi.e g11 = o10.g(24, context, h6Var, r11);
        g11.i(hd.N0(2131752966, null), false, r11);
        g11.setOnClickListener(new di.q0(this, tL_messages_preparedInlineMessage, h0Var, i10, j3, qVar));
        frameLayout.addView(g11, ma.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.f30176b;
        int i13 = this.f30211u0;
        viewGroup.addView(frameLayout, ma.f(-2.0f, -1, 87, i13, 0, i13, 0));
        ek0 ek0Var = this.f39532o1;
        int i14 = this.f30211u0;
        ek0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(68.0f) + r11);
        this.f39532o1.r1();
        int i15 = m6.f29324a7;
        v0(m6.w0(i15, this.J0));
        Q(i15);
        this.V1.O(false);
    }

    public static ki.f1 e1(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: ki.g1.e1(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):ki.f1");
    }

    public static void f1(Context context, int i7, long j3, String str, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        t1Var.r(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = np.u1(i7).q1(j3);
        tL_messages_getPreparedInlineMessage.f28534id = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getPreparedInlineMessage, new ii.f(i7, t1Var, context, j3, h6Var, qVar, h0Var));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.T1, 0, true, new d7(this, 19), this.J0);
        this.V1 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131752969, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.X1 && !this.Y1) {
            this.Y1 = true;
            bi.h0 h0Var = this.Z1;
            if (h0Var != null) {
                h0Var.a("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int b10;
        super.onCreate(bundle);
        ek0 ek0Var = this.f39532o1;
        if (ek0Var.getAdapter() == null) {
            b10 = 0;
        } else {
            b10 = ek0Var.getAdapter().b();
        }
        ek0Var.v0(Math.max(b10 - 1, 0));
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = m6.w0(m6.f29324a7, this.J0);
            if (w02 != this.f18724a2) {
                this.f18724a2 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
