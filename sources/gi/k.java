package gi;

import bi.i5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g10;
import org.telegram.ui.i91;
import org.telegram.ui.j60;
import org.telegram.ui.l70;
import org.telegram.ui.md;
import org.telegram.ui.no;
import org.telegram.ui.q50;
import org.telegram.ui.ro;
import org.telegram.ui.xo;
public final class k implements Runnable {
    public final int f10730a;
    public final TLRPC.InputFile f10731b;
    public final TLRPC.InputFile f10732c;
    public final TLRPC.VideoSize d;
    public final String f10733e;
    public final double f10734f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f10735n;
    public final t40 f10736r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f10730a = 0;
        this.f10736r = pVar;
        this.h = photoSize;
        this.f10731b = inputFile;
        this.f10732c = inputFile2;
        this.d = videoSize;
        this.f10734f = d;
        this.f10733e = str;
        this.f10735n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f10730a) {
            case 0:
                p pVar = (p) this.f10736r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f10731b;
                TLRPC.InputFile inputFile2 = this.f10732c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f10778y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f10769b, null, inputFile, inputFile2, videoSize, this.f10734f, this.f10733e, photoSize.location, this.f10735n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.Y2.N(z10);
                return;
            case 1:
                md mdVar = (md) this.f10736r;
                TLRPC.InputFile inputFile3 = this.f10731b;
                TLRPC.InputFile inputFile4 = this.f10732c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.f38691x = fileLocation2;
                    mdVar.f38692y = this.f10735n.location;
                    mdVar.f38667e.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.f38684s, null);
                    mdVar.e0(true, false);
                    return;
                }
                mdVar.f38676l0 = inputFile3;
                mdVar.m0 = inputFile4;
                mdVar.f38678n0 = this.d;
                mdVar.f38679o0 = this.f10733e;
                mdVar.f38680p0 = this.f10734f;
                if (mdVar.f38681q0) {
                    b2 b2Var = mdVar.f38687u0;
                    if (b2Var != null) {
                        try {
                            b2Var.dismiss();
                            mdVar.f38687u0 = null;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    mdVar.g0(false);
                    mdVar.f38683r0 = false;
                    mdVar.f38660a.performClick();
                }
                mdVar.e0(false, true);
                mdVar.h.setImageDrawable(null);
                return;
            case 2:
                xo xoVar = (xo) this.f10736r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                xoVar.f42822v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f10731b;
                TLRPC.InputFile inputFile6 = this.f10732c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    i5 i5Var = xoVar.f42801e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    i9 i9Var = xoVar.f42816r;
                    Object obj = xoVar.D0;
                    if (obj == null) {
                        obj = xoVar.f42826x0;
                    }
                    i5Var.h(forLocal, "50_50", i9Var, obj);
                    xoVar.f42797b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (xoVar.R0 == null) {
                        xoVar.R0 = new xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    xoVar.f42797b0.f22710e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    xoVar.f42797b0.f22710e.setAnimation(xoVar.R0);
                    xoVar.n0(true, false);
                    return;
                }
                long j3 = xoVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f10735n;
                double d = this.f10734f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = xoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = xoVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f19910id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f19910id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        xoVar.getMessagesController().putUser(xoVar.D0, true);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile5;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile6;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = xoVar.getMessagesController().getInputUser(xoVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    xoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new no(xoVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = xoVar.getMessagesController();
                    long j11 = xoVar.f42824w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.f10733e, fileLocation4, fileLocation5, null);
                }
                if (xoVar.M0) {
                    try {
                        b2 b2Var2 = xoVar.f42796b;
                        if (b2Var2 != null && b2Var2.isShowing()) {
                            xoVar.f42796b.dismiss();
                            xoVar.f42796b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    xoVar.N0 = z11;
                    xoVar.f42794a.performClick();
                }
                xoVar.n0(z11, true);
                return;
            case 3:
                q50 q50Var = (q50) this.f10736r;
                long j12 = q50Var.f39761e;
                j60 j60Var = q50Var.f39762f;
                AccountInstance accountInstance = j60Var.d;
                TLRPC.InputFile inputFile7 = this.f10731b;
                TLRPC.InputFile inputFile8 = this.f10732c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f10735n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    q50Var.f39760c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    q50Var.f39759b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    q50Var.d = forLocal2;
                    j60Var.f37542b.A(forLocal2, ImageLocation.getForLocal(q50Var.f39760c));
                    AndroidUtilities.updateVisibleRows(j60Var.Q);
                    return;
                }
                double d10 = this.f10734f;
                String str = this.f10733e;
                if (j12 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile7 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile7;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile8 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile8;
                        int i11 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new ro(23, q50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new g10(q50Var, 6));
                return;
            case 4:
                l70 l70Var = (l70) this.f10736r;
                TLRPC.InputFile inputFile9 = this.f10731b;
                TLRPC.InputFile inputFile10 = this.f10732c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    l70Var.f38244y = fileLocation7;
                    l70Var.E = this.f10735n.location;
                    l70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", l70Var.f38240r, null);
                    l70Var.Z(true, false);
                    return;
                }
                l70Var.F = inputFile9;
                l70Var.G = inputFile10;
                l70Var.H = videoSize4;
                l70Var.I = this.f10733e;
                l70Var.J = this.f10734f;
                if (l70Var.L) {
                    l70Var.getMessagesController().createChat(l70Var.f38236c.getText().toString(), l70Var.K, null, l70Var.P, l70Var.S, l70Var.U, l70Var.T, l70Var.W, l70Var);
                }
                l70Var.Z(false, true);
                l70Var.f38238f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f10736r, this.f10731b, this.f10732c, this.d, this.f10734f, this.f10733e, this.h, this.f10735n);
                return;
            default:
                i91.e0((i91) this.f10736r, this.f10731b, this.f10732c, this.d, this.f10734f, this.f10733e, this.h, this.f10735n);
                return;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f10730a = i10;
        this.f10736r = (t40) n2Var;
        this.f10731b = inputFile;
        this.f10732c = inputFile2;
        this.d = videoSize;
        this.f10733e = str;
        this.f10734f = d;
        this.h = photoSize;
        this.f10735n = photoSize2;
    }

    public k(xo xoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f10730a = 2;
        this.f10736r = xoVar;
        this.h = photoSize;
        this.f10731b = inputFile;
        this.f10732c = inputFile2;
        this.d = videoSize;
        this.f10735n = photoSize2;
        this.f10734f = d;
        this.f10733e = str;
    }

    public k(t40 t40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f10730a = i10;
        this.f10736r = t40Var;
        this.f10731b = inputFile;
        this.f10732c = inputFile2;
        this.d = videoSize;
        this.f10734f = d;
        this.f10733e = str;
        this.h = photoSize;
        this.f10735n = photoSize2;
    }
}
