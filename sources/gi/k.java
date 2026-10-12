package gi;

import bi.k5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n60;
import org.telegram.ui.o91;
import org.telegram.ui.p70;
import org.telegram.ui.po;
import org.telegram.ui.sd;
import org.telegram.ui.to;
import org.telegram.ui.u50;
import org.telegram.ui.zo;
import org.telegram.ui.zz;
public final class k implements Runnable {
    public final int f10194a;
    public final TLRPC.InputFile f10195b;
    public final TLRPC.InputFile f10196c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f10197f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f10198n;
    public final h50 f10199r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f10194a = 0;
        this.f10199r = pVar;
        this.h = photoSize;
        this.f10195b = inputFile;
        this.f10196c = inputFile2;
        this.d = videoSize;
        this.f10197f = d;
        this.e = str;
        this.f10198n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f10194a) {
            case 0:
                p pVar = (p) this.f10199r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f10195b;
                TLRPC.InputFile inputFile2 = this.f10196c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f10236y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f10228b, null, inputFile, inputFile2, videoSize, this.f10197f, this.e, photoSize.location, this.f10198n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.W2.N(z10);
                return;
            case 1:
                sd sdVar = (sd) this.f10199r;
                TLRPC.InputFile inputFile3 = this.f10195b;
                TLRPC.InputFile inputFile4 = this.f10196c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    sdVar.f40093x = fileLocation2;
                    sdVar.f40094y = this.f10198n.location;
                    sdVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", sdVar.f40086s, null);
                    sdVar.e0(true, false);
                    return;
                }
                sdVar.f40078l0 = inputFile3;
                sdVar.m0 = inputFile4;
                sdVar.f40080n0 = this.d;
                sdVar.f40081o0 = this.e;
                sdVar.f40082p0 = this.f10197f;
                if (sdVar.f40083q0) {
                    a2 a2Var = sdVar.f40089u0;
                    if (a2Var != null) {
                        try {
                            a2Var.dismiss();
                            sdVar.f40089u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    sdVar.g0(false);
                    sdVar.f40085r0 = false;
                    sdVar.f40063a.performClick();
                }
                sdVar.e0(false, true);
                sdVar.h.setImageDrawable(null);
                return;
            case 2:
                zo zoVar = (zo) this.f10199r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                zoVar.f42681v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f10195b;
                TLRPC.InputFile inputFile6 = this.f10196c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    k5 k5Var = zoVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    k9 k9Var = zoVar.f42675r;
                    Object obj = zoVar.D0;
                    if (obj == null) {
                        obj = zoVar.f42685x0;
                    }
                    k5Var.h(forLocal, "50_50", k9Var, obj);
                    zoVar.f42657b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (zoVar.R0 == null) {
                        zoVar.R0 = new yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    zoVar.f42657b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    zoVar.f42657b0.e.setAnimation(zoVar.R0);
                    zoVar.n0(true, false);
                    return;
                }
                int i10 = (zoVar.C0 > 0L ? 1 : (zoVar.C0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f10198n;
                long j10 = 0;
                double d = this.f10197f;
                if (i10 != 0) {
                    TLRPC.User user = zoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = zoVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f19230id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f19230id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        zoVar.getMessagesController().putUser(zoVar.D0, true);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile5;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile6;
                        int i11 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i11 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = zoVar.getMessagesController().getInputUser(zoVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    zoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new po(zoVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    zoVar.getMessagesController().changeChatAvatar(zoVar.f42683w0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                }
                if (zoVar.M0) {
                    try {
                        a2 a2Var2 = zoVar.f42656b;
                        if (a2Var2 != null && a2Var2.isShowing()) {
                            zoVar.f42656b.dismiss();
                            zoVar.f42656b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    zoVar.N0 = z11;
                    zoVar.f42654a.performClick();
                }
                zoVar.n0(z11, true);
                return;
            case 3:
                u50 u50Var = (u50) this.f10199r;
                long j11 = u50Var.e;
                n60 n60Var = u50Var.f40543f;
                AccountInstance accountInstance = n60Var.d;
                TLRPC.InputFile inputFile7 = this.f10195b;
                TLRPC.InputFile inputFile8 = this.f10196c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f10198n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    u50Var.f40542c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    u50Var.f40541b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    u50Var.d = forLocal2;
                    n60Var.f38444b.A(forLocal2, ImageLocation.getForLocal(u50Var.f40542c));
                    AndroidUtilities.updateVisibleRows(n60Var.Q);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d10 = this.f10197f;
                String str = this.e;
                if (i12 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile7 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile7;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile8 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile8;
                        int i13 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto2.flags = i13 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new to(23, u50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j11, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new zz(u50Var, 7));
                return;
            case 4:
                p70 p70Var = (p70) this.f10199r;
                TLRPC.InputFile inputFile9 = this.f10195b;
                TLRPC.InputFile inputFile10 = this.f10196c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    p70Var.f39139y = fileLocation5;
                    p70Var.E = this.f10198n.location;
                    p70Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", p70Var.f39135r, null);
                    p70Var.Z(true, false);
                    return;
                }
                p70Var.F = inputFile9;
                p70Var.G = inputFile10;
                p70Var.H = videoSize4;
                p70Var.I = this.e;
                p70Var.J = this.f10197f;
                if (p70Var.L) {
                    p70Var.getMessagesController().createChat(p70Var.f39132c.getText().toString(), p70Var.K, null, p70Var.P, p70Var.S, p70Var.U, p70Var.T, p70Var.W, p70Var);
                }
                p70Var.Z(false, true);
                p70Var.f39133f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f10199r, this.f10195b, this.f10196c, this.d, this.f10197f, this.e, this.h, this.f10198n);
                return;
            default:
                o91.e0((o91) this.f10199r, this.f10195b, this.f10196c, this.d, this.f10197f, this.e, this.h, this.f10198n);
                return;
        }
    }

    public k(m2 m2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f10194a = i10;
        this.f10199r = (h50) m2Var;
        this.f10195b = inputFile;
        this.f10196c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f10197f = d;
        this.h = photoSize;
        this.f10198n = photoSize2;
    }

    public k(zo zoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f10194a = 2;
        this.f10199r = zoVar;
        this.h = photoSize;
        this.f10195b = inputFile;
        this.f10196c = inputFile2;
        this.d = videoSize;
        this.f10198n = photoSize2;
        this.f10197f = d;
        this.e = str;
    }

    public k(h50 h50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f10194a = i10;
        this.f10199r = h50Var;
        this.f10195b = inputFile;
        this.f10196c = inputFile2;
        this.d = videoSize;
        this.f10197f = d;
        this.e = str;
        this.h = photoSize;
        this.f10198n = photoSize2;
    }
}
