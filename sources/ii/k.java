package ii;

import di.k4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c50;
import org.telegram.ui.d81;
import org.telegram.ui.eo;
import org.telegram.ui.j10;
import org.telegram.ui.mo;
import org.telegram.ui.nd;
import org.telegram.ui.p00;
import org.telegram.ui.v50;
import org.telegram.ui.x60;
public final class k implements Runnable {
    public final int f14367a;
    public final TLRPC.InputFile f14368b;
    public final TLRPC.InputFile f14369c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f14370f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f14371n;
    public final f50 f14372r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f14367a = 0;
        this.f14372r = oVar;
        this.h = photoSize;
        this.f14368b = inputFile;
        this.f14369c = inputFile2;
        this.d = videoSize;
        this.f14370f = d;
        this.e = str;
        this.f14371n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f14367a) {
            case 0:
                o oVar = (o) this.f14372r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.G = fileLocation;
                TLRPC.InputFile inputFile = this.f14368b;
                TLRPC.InputFile inputFile2 = this.f14369c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.f14397w.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.E, oVar.I);
                    oVar.b0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f14392c, null, inputFile, inputFile2, videoSize, this.f14370f, this.e, photoSize.location, this.f14371n.location, null);
                    oVar.b0(false, true);
                }
                oVar.e.f32150g3.O(z10);
                return;
            case 1:
                nd ndVar = (nd) this.f14372r;
                TLRPC.InputFile inputFile3 = this.f14368b;
                TLRPC.InputFile inputFile4 = this.f14369c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.f41871y = fileLocation2;
                    ndVar.E = this.f14371n.location;
                    ndVar.f41847f.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.v, null);
                    ndVar.g0(true, false);
                    return;
                }
                ndVar.m0 = inputFile3;
                ndVar.f41856n0 = inputFile4;
                ndVar.f41857o0 = this.d;
                ndVar.f41858p0 = this.e;
                ndVar.f41859q0 = this.f14370f;
                if (ndVar.f41861r0) {
                    e2 e2Var = ndVar.f41866v0;
                    if (e2Var != null) {
                        try {
                            e2Var.dismiss();
                            ndVar.f41866v0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ndVar.i0(false);
                    ndVar.f41863s0 = false;
                    ndVar.f41839a.performClick();
                }
                ndVar.g0(false, true);
                ndVar.f41855n.setImageDrawable(null);
                return;
            case 2:
                mo moVar = (mo) this.f14372r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                moVar.f41620u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f14368b;
                TLRPC.InputFile inputFile6 = this.f14369c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    k4 k4Var = moVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    j9 j9Var = moVar.f41615r;
                    Object obj = moVar.C0;
                    if (obj == null) {
                        obj = moVar.f41623w0;
                    }
                    k4Var.h(forLocal, "50_50", j9Var, obj);
                    moVar.f41597b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (moVar.Q0 == null) {
                        moVar.Q0 = new xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    moVar.f41597b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    moVar.f41597b0.e.setAnimation(moVar.Q0);
                    moVar.o0(true, false);
                    return;
                }
                int i10 = (moVar.B0 > 0L ? 1 : (moVar.B0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f14371n;
                long j10 = 0;
                double d = this.f14370f;
                if (i10 != 0) {
                    TLRPC.User user = moVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = moVar.C0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f22041id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f22041id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        moVar.getMessagesController().putUser(moVar.C0, true);
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
                    tL_photos_uploadProfilePhoto.bot = moVar.getMessagesController().getInputUser(moVar.C0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    moVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new eo(moVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    moVar.getMessagesController().changeChatAvatar(moVar.f41621v0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                }
                if (moVar.L0) {
                    try {
                        e2 e2Var2 = moVar.f41596b;
                        if (e2Var2 != null && e2Var2.isShowing()) {
                            moVar.f41596b.dismiss();
                            moVar.f41596b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    moVar.M0 = z11;
                    moVar.f41594a.performClick();
                }
                moVar.o0(z11, true);
                return;
            case 3:
                c50 c50Var = (c50) this.f14372r;
                long j11 = c50Var.e;
                v50 v50Var = c50Var.f38269f;
                AccountInstance accountInstance = v50Var.d;
                TLRPC.InputFile inputFile7 = this.f14368b;
                TLRPC.InputFile inputFile8 = this.f14369c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f14371n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    c50Var.f38268c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    c50Var.f38267b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    c50Var.d = forLocal2;
                    v50Var.f44609b.A(forLocal2, ImageLocation.getForLocal(c50Var.f38268c));
                    AndroidUtilities.updateVisibleRows(v50Var.Q);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d10 = this.f14370f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new j10(1, c50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j11, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new p00(c50Var, 6));
                return;
            case 4:
                x60 x60Var = (x60) this.f14372r;
                TLRPC.InputFile inputFile9 = this.f14368b;
                TLRPC.InputFile inputFile10 = this.f14369c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    x60Var.f45671y = fileLocation5;
                    x60Var.E = this.f14371n.location;
                    x60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", x60Var.f45667r, null);
                    x60Var.a0(true, false);
                    return;
                }
                x60Var.F = inputFile9;
                x60Var.G = inputFile10;
                x60Var.H = videoSize4;
                x60Var.I = this.e;
                x60Var.J = this.f14370f;
                if (x60Var.L) {
                    x60Var.getMessagesController().createChat(x60Var.f45664c.getText().toString(), x60Var.K, null, x60Var.P, x60Var.S, x60Var.U, x60Var.T, x60Var.W, x60Var);
                }
                x60Var.a0(false, true);
                x60Var.f45665f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.l0((ProfileActivity) this.f14372r, this.f14368b, this.f14369c, this.d, this.f14370f, this.e, this.h, this.f14371n);
                return;
            default:
                d81.e0((d81) this.f14372r, this.f14368b, this.f14369c, this.d, this.f14370f, this.e, this.h, this.f14371n);
                return;
        }
    }

    public k(r2 r2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f14367a = i10;
        this.f14372r = (f50) r2Var;
        this.f14368b = inputFile;
        this.f14369c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f14370f = d;
        this.h = photoSize;
        this.f14371n = photoSize2;
    }

    public k(mo moVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f14367a = 2;
        this.f14372r = moVar;
        this.h = photoSize;
        this.f14368b = inputFile;
        this.f14369c = inputFile2;
        this.d = videoSize;
        this.f14371n = photoSize2;
        this.f14370f = d;
        this.e = str;
    }

    public k(f50 f50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f14367a = i10;
        this.f14372r = f50Var;
        this.f14368b = inputFile;
        this.f14369c = inputFile2;
        this.d = videoSize;
        this.f14370f = d;
        this.e = str;
        this.h = photoSize;
        this.f14371n = photoSize2;
    }
}
