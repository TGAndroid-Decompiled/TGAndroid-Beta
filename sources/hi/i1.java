package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c8.ha;
import fi.y5;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.st0;
public final class i1 extends ma {
    public final int S1;
    public final String T1;
    public m41 U1;
    public final f1 V1;
    public boolean W1;
    public boolean X1;
    public final bi.t0 Y1;
    public int Z1;

    public i1(Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        super(context, null, false, false, h6Var);
        ?? r11;
        int i10;
        h1 d12;
        char c10;
        char c11;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int lastIndexOf;
        int i11;
        TLRPC.TL_photo tL_photo2;
        this.W1 = false;
        this.X1 = false;
        this.S1 = i7;
        this.T1 = t10.p(qp.s1(i7).a2(Long.valueOf(j3)));
        this.Y1 = t0Var;
        Y0();
        this.C1 = org.telegram.messenger.g0.L(4.0f);
        this.D1 = org.telegram.messenger.g0.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file == null || !file.exists() || webPage != null) {
            r11 = 1;
            i10 = i7;
            d12 = d1(i10, j3, botInlineResult, null, null, webPage);
        } else {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            boolean z9 = true;
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
                    tL_document2.f26966id = 0L;
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
                            int[] g12 = ij.g1(botInlineResult);
                            tL_documentAttributeImageSize.f26967w = g12[0];
                            tL_documentAttributeImageSize.h = g12[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K = gc.K(new File(w7.z(4), Utilities.a(botInlineResult.thumb.url) + "." + gc.B(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K != null) {
                                        TLRPC.PhotoSize Z = gc.Z(K, 90.0f, 90.0f, 55, false);
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
                            tL_documentAttributeAudio.duration = ij.f1(botInlineResult);
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
                            int[] g13 = ij.g1(botInlineResult);
                            tL_documentAttributeVideo.f26967w = g13[0];
                            tL_documentAttributeVideo.h = g13[1];
                            tL_documentAttributeVideo.duration = ij.f1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K2 = gc.K(new File(w7.z(4), Utilities.a(botInlineResult.thumb.url) + "." + gc.B(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K2 != null) {
                                        TLRPC.PhotoSize Z2 = gc.Z(K2, 90.0f, 90.0f, 55, false);
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
                            tL_documentAttributeAudio2.duration = ij.f1(botInlineResult);
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
                        int[] g14 = ij.g1(botInlineResult);
                        tL_photoSize.f26985w = g14[0];
                        z9 = true;
                        tL_photoSize.h = g14[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    } else {
                        z9 = true;
                    }
                    tL_document = tL_document2;
                    tL_photo = null;
                    break;
                case 4:
                    if (file.exists()) {
                        i11 = 0;
                        tL_photo2 = gz.C(i7).A(absolutePath, null, false);
                    } else {
                        i11 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i7).getCurrentTime();
                        tL_photo2.file_reference = new byte[i11];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] g15 = ij.g1(botInlineResult);
                        tL_photoSize2.f26985w = g15[i11];
                        tL_photoSize2.h = g15[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    z9 = true;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i10 = i7;
            r11 = z9;
            d12 = d1(i10, j3, botInlineResult, tL_photo, tL_document, null);
        }
        h1 h1Var = d12;
        org.telegram.ui.Cells.t0 t0Var2 = new org.telegram.ui.Cells.t0(context, h6Var, false);
        t0Var2.setDelegate(new Object());
        t0Var2.setCustomText(id.M0(2131752979, null));
        org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(context, i10);
        q1Var.setDelegate(new Object());
        q1Var.w3(h1Var, null, false, false, false, false);
        LinearLayout f10 = k5.f(context, r11);
        f10.addView(t0Var2, ha.o(-1, -2));
        f10.addView(q1Var, ha.o(-1, -2));
        ?? st0Var = new st0(context, null);
        this.V1 = st0Var;
        st0Var.U(y5.e(null, i10, j3, m6.I.q()));
        st0Var.addView(f10, ha.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        fi.d h = k5.h(24, context, h6Var, r11);
        h.i(id.M0(2131752978, null), false, r11);
        h.setOnClickListener(new bi.d1(this, tL_messages_preparedInlineMessage, t0Var, i10, j3, pVar));
        frameLayout.addView(h, ha.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.f28672b;
        int i13 = this.f28705t0;
        viewGroup.addView(frameLayout, ha.f(-2.0f, -1, 87, i13, 0, i13, 0));
        pj0 pj0Var = this.n1;
        int i14 = this.f28705t0;
        pj0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(68.0f) + r11);
        this.n1.r1();
        int i15 = m6.f27834a7;
        v0(m6.w0(i15, this.I0));
        P(i15);
        this.U1.O(false);
    }

    public static hi.h1 d1(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.i1.d1(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):hi.h1");
    }

    public static void e1(Context context, int i7, long j3, String str, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        u1Var.r(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = qp.s1(i7).o1(j3);
        tL_messages_getPreparedInlineMessage.f27060id = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getPreparedInlineMessage, new w0(i7, u1Var, context, j3, h6Var, pVar, t0Var));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.S1, 0, true, new ai.e(this, 29), this.I0);
        this.U1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131752981, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.W1 && !this.X1) {
            this.X1 = true;
            bi.t0 t0Var = this.Y1;
            if (t0Var != null) {
                t0Var.a("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int b10;
        super.onCreate(bundle);
        pj0 pj0Var = this.n1;
        if (pj0Var.getAdapter() == null) {
            b10 = 0;
        } else {
            b10 = pj0Var.getAdapter().b();
        }
        pj0Var.v0(Math.max(b10 - 1, 0));
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = m6.w0(m6.f27834a7, this.I0);
            if (w02 != this.Z1) {
                this.Z1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
