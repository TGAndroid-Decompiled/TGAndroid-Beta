package ii;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import gi.y5;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class j1 extends ma {
    public final int Q1;
    public final String R1;
    public f41 S1;
    public final g1 T1;
    public boolean U1;
    public boolean V1;
    public final ai.n0 W1;
    public int X1;

    public j1(Context context, int i3, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        super(context, null, false, false, e6Var);
        ?? r11;
        int i10;
        i1 d12;
        char c2;
        char c10;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int lastIndexOf;
        int i11;
        TLRPC.TL_photo tL_photo2;
        this.U1 = false;
        this.V1 = false;
        this.Q1 = i3;
        this.R1 = l10.p(hp.s1(i3).a2(Long.valueOf(j10)));
        this.W1 = n0Var;
        Y0();
        this.A1 = org.telegram.messenger.g0.L(4.0f);
        this.B1 = org.telegram.messenger.g0.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file == null || !file.exists() || webPage != null) {
            r11 = 1;
            i10 = i3;
            d12 = d1(i10, j10, botInlineResult, null, null, webPage);
        } else {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            boolean z10 = true;
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
                case 106642994:
                    if (str.equals("photo")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        c2 = 6;
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
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                    TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                    tL_document2.f27007id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i3).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
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
                        case 112202875:
                            if (str.equals("video")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c10 = 5;
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
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] h12 = zi.h1(botInlineResult);
                            tL_documentAttributeImageSize.f27008w = h12[0];
                            tL_documentAttributeImageSize.h = h12[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K = zb.K(new File(w7.z(4), Utilities.a(botInlineResult.thumb.url) + "." + zb.B(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K != null) {
                                        TLRPC.PhotoSize Z = zb.Z(K, 90.0f, 90.0f, 55, false);
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
                            tL_documentAttributeAudio.duration = zi.g1(botInlineResult);
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
                            int[] h13 = zi.h1(botInlineResult);
                            tL_documentAttributeVideo.f27008w = h13[0];
                            tL_documentAttributeVideo.h = h13[1];
                            tL_documentAttributeVideo.duration = zi.g1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K2 = zb.K(new File(w7.z(4), Utilities.a(botInlineResult.thumb.url) + "." + zb.B(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K2 != null) {
                                        TLRPC.PhotoSize Z2 = zb.Z(K2, 90.0f, 90.0f, 55, false);
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
                            tL_documentAttributeAudio2.duration = zi.g1(botInlineResult);
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
                        int[] h14 = zi.h1(botInlineResult);
                        tL_photoSize.f27026w = h14[0];
                        z10 = true;
                        tL_photoSize.h = h14[1];
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
                        tL_photo2 = yy.C(i3).A(absolutePath, null, false);
                    } else {
                        i11 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i3).getCurrentTime();
                        tL_photo2.file_reference = new byte[i11];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] h15 = zi.h1(botInlineResult);
                        tL_photoSize2.f27026w = h15[i11];
                        tL_photoSize2.h = h15[1];
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
            i10 = i3;
            r11 = z10;
            d12 = d1(i10, j10, botInlineResult, tL_photo, tL_document, null);
        }
        i1 i1Var = d12;
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, e6Var, false);
        t0Var.setDelegate(new Object());
        t0Var.setCustomText(bd.M0(2131752979, null));
        org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(context, i10);
        q1Var.setDelegate(new Object());
        q1Var.u3(i1Var, null, false, false, false, false);
        LinearLayout f10 = k5.f(context, r11);
        f10.addView(t0Var, mf.o(-1, -2));
        f10.addView(q1Var, mf.o(-1, -2));
        ?? qt0Var = new qt0(context, null);
        this.T1 = qt0Var;
        qt0Var.U(y5.e(null, i10, j10, k6.I.q()));
        qt0Var.addView(f10, mf.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        gi.d h = k5.h(24, context, e6Var, r11);
        h.i(bd.M0(2131752978, null), false, r11);
        h.setOnClickListener(new ci.w0(this, tL_messages_preparedInlineMessage, n0Var, i10, j10, rVar));
        frameLayout.addView(h, mf.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.f28586b;
        int i13 = this.f28618u0;
        viewGroup.addView(frameLayout, mf.f(-2.0f, -1, 87, i13, 0, i13, 0));
        tj0 tj0Var = this.f36102l1;
        int i14 = this.f28618u0;
        tj0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(68.0f) + r11);
        this.f36102l1.r1();
        int i15 = k6.f27824a7;
        v0(k6.w0(i15, this.J0));
        P(i15);
        this.S1.O(false);
    }

    public static ii.i1 d1(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: ii.j1.d1(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):ii.i1");
    }

    public static void e1(Context context, int i3, long j10, String str, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        s1Var.r(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = hp.s1(i3).o1(j10);
        tL_messages_getPreparedInlineMessage.f27101id = str;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getPreparedInlineMessage, new x0(i3, s1Var, context, j10, e6Var, rVar, n0Var));
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.Q1, 0, true, new gi.q4(this, 9), this.J0);
        this.S1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131752981, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.U1 && !this.V1) {
            this.V1 = true;
            ai.n0 n0Var = this.W1;
            if (n0Var != null) {
                n0Var.a("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int b10;
        super.onCreate(bundle);
        tj0 tj0Var = this.f36102l1;
        if (tj0Var.getAdapter() == null) {
            b10 = 0;
        } else {
            b10 = tj0Var.getAdapter().b();
        }
        tj0Var.v0(Math.max(b10 - 1, 0));
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = k6.w0(k6.f27824a7, this.J0);
            if (w02 != this.X1) {
                this.X1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
