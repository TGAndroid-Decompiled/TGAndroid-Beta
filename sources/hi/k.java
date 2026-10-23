package hi;

import ci.j4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a50;
import org.telegram.ui.b50;
import org.telegram.ui.bo;
import org.telegram.ui.c81;
import org.telegram.ui.fz;
import org.telegram.ui.ko;
import org.telegram.ui.md;
import org.telegram.ui.u50;
import org.telegram.ui.w60;
public final class k implements Runnable {
    public final int f12193a;
    public final TLRPC.InputFile f12194b;
    public final TLRPC.InputFile f12195c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f12196f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f12197n;
    public final d50 f12198r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f12193a = 0;
        this.f12198r = oVar;
        this.h = photoSize;
        this.f12194b = inputFile;
        this.f12195c = inputFile2;
        this.d = videoSize;
        this.f12196f = d;
        this.e = str;
        this.f12197n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f12193a) {
            case 0:
                o oVar = (o) this.f12198r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.G = fileLocation;
                TLRPC.InputFile inputFile = this.f12194b;
                TLRPC.InputFile inputFile2 = this.f12195c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.f12229w.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.E, oVar.I);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f12224c, null, inputFile, inputFile2, videoSize, this.f12196f, this.e, photoSize.location, this.f12197n.location, null);
                    oVar.a0(false, true);
                }
                oVar.e.Z2.N(z10);
                return;
            case 1:
                md mdVar = (md) this.f12198r;
                TLRPC.InputFile inputFile3 = this.f12194b;
                TLRPC.InputFile inputFile4 = this.f12195c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.f39506y = fileLocation2;
                    mdVar.E = this.f12197n.location;
                    mdVar.f39482f.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.v, null);
                    mdVar.f0(true, false);
                    return;
                }
                mdVar.m0 = inputFile3;
                mdVar.f39491n0 = inputFile4;
                mdVar.f39492o0 = this.d;
                mdVar.f39493p0 = this.e;
                mdVar.f39494q0 = this.f12196f;
                if (mdVar.f39496r0) {
                    c2 c2Var = mdVar.f39501v0;
                    if (c2Var != null) {
                        try {
                            c2Var.dismiss();
                            mdVar.f39501v0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    mdVar.h0(false);
                    mdVar.f39498s0 = false;
                    mdVar.f39474a.performClick();
                }
                mdVar.f0(false, true);
                mdVar.f39490n.setImageDrawable(null);
                return;
            case 2:
                ko koVar = (ko) this.f12198r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                koVar.f39009u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f12194b;
                TLRPC.InputFile inputFile6 = this.f12195c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    j4 j4Var = koVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = koVar.f39004r;
                    Object obj = koVar.C0;
                    if (obj == null) {
                        obj = koVar.f39012w0;
                    }
                    j4Var.h(forLocal, "50_50", h9Var, obj);
                    koVar.f38986b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (koVar.Q0 == null) {
                        koVar.Q0 = new yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    koVar.f38986b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    koVar.f38986b0.e.setAnimation(koVar.Q0);
                    koVar.n0(true, false);
                    return;
                }
                int i10 = (koVar.B0 > 0L ? 1 : (koVar.B0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f12197n;
                long j10 = 0;
                double d = this.f12196f;
                if (i10 != 0) {
                    TLRPC.User user = koVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = koVar.C0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f20357id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f20357id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        koVar.getMessagesController().putUser(koVar.C0, true);
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
                    tL_photos_uploadProfilePhoto.bot = koVar.getMessagesController().getInputUser(koVar.C0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    koVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bo(koVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    koVar.getMessagesController().changeChatAvatar(koVar.f39010v0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                }
                if (koVar.L0) {
                    try {
                        c2 c2Var2 = koVar.f38985b;
                        if (c2Var2 != null && c2Var2.isShowing()) {
                            koVar.f38985b.dismiss();
                            koVar.f38985b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    koVar.M0 = z11;
                    koVar.f38983a.performClick();
                }
                koVar.n0(z11, true);
                return;
            case 3:
                b50 b50Var = (b50) this.f12198r;
                long j11 = b50Var.e;
                u50 u50Var = b50Var.f35881f;
                AccountInstance accountInstance = u50Var.d;
                TLRPC.InputFile inputFile7 = this.f12194b;
                TLRPC.InputFile inputFile8 = this.f12195c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f12197n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    b50Var.f35880c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    b50Var.f35879b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    b50Var.d = forLocal2;
                    u50Var.f42173b.A(forLocal2, ImageLocation.getForLocal(b50Var.f35880c));
                    AndroidUtilities.updateVisibleRows(u50Var.Q);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d10 = this.f12196f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new a50(0, b50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j11, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new fz(b50Var, 7));
                return;
            case 4:
                w60 w60Var = (w60) this.f12198r;
                TLRPC.InputFile inputFile9 = this.f12194b;
                TLRPC.InputFile inputFile10 = this.f12195c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    w60Var.f42944y = fileLocation5;
                    w60Var.E = this.f12197n.location;
                    w60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", w60Var.f42940r, null);
                    w60Var.Z(true, false);
                    return;
                }
                w60Var.F = inputFile9;
                w60Var.G = inputFile10;
                w60Var.H = videoSize4;
                w60Var.I = this.e;
                w60Var.J = this.f12196f;
                if (w60Var.L) {
                    w60Var.getMessagesController().createChat(w60Var.f42937c.getText().toString(), w60Var.K, null, w60Var.P, w60Var.S, w60Var.U, w60Var.T, w60Var.W, w60Var);
                }
                w60Var.Z(false, true);
                w60Var.f42938f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.X((ProfileActivity) this.f12198r, this.f12194b, this.f12195c, this.d, this.f12196f, this.e, this.h, this.f12197n);
                return;
            default:
                c81.e0((c81) this.f12198r, this.f12194b, this.f12195c, this.d, this.f12196f, this.e, this.h, this.f12197n);
                return;
        }
    }

    public k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f12193a = i10;
        this.f12198r = (d50) o2Var;
        this.f12194b = inputFile;
        this.f12195c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f12196f = d;
        this.h = photoSize;
        this.f12197n = photoSize2;
    }

    public k(ko koVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f12193a = 2;
        this.f12198r = koVar;
        this.h = photoSize;
        this.f12194b = inputFile;
        this.f12195c = inputFile2;
        this.d = videoSize;
        this.f12197n = photoSize2;
        this.f12196f = d;
        this.e = str;
    }

    public k(d50 d50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f12193a = i10;
        this.f12198r = d50Var;
        this.f12194b = inputFile;
        this.f12195c = inputFile2;
        this.d = videoSize;
        this.f12196f = d;
        this.e = str;
        this.h = photoSize;
        this.f12197n = photoSize2;
    }
}
