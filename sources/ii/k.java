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
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e50;
import org.telegram.ui.f81;
import org.telegram.ui.go;
import org.telegram.ui.l10;
import org.telegram.ui.nd;
import org.telegram.ui.oo;
import org.telegram.ui.r00;
import org.telegram.ui.x50;
import org.telegram.ui.z60;
public final class k implements Runnable {
    public final int f14366a;
    public final TLRPC.InputFile f14367b;
    public final TLRPC.InputFile f14368c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f14369f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f14370n;
    public final f50 f14371r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f14366a = 0;
        this.f14371r = oVar;
        this.h = photoSize;
        this.f14367b = inputFile;
        this.f14368c = inputFile2;
        this.d = videoSize;
        this.f14369f = d;
        this.e = str;
        this.f14370n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f14366a) {
            case 0:
                o oVar = (o) this.f14371r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.G = fileLocation;
                TLRPC.InputFile inputFile = this.f14367b;
                TLRPC.InputFile inputFile2 = this.f14368c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.f14396w.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.E, oVar.I);
                    oVar.b0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f14391c, null, inputFile, inputFile2, videoSize, this.f14369f, this.e, photoSize.location, this.f14370n.location, null);
                    oVar.b0(false, true);
                }
                oVar.e.f32504g3.O(z10);
                return;
            case 1:
                nd ndVar = (nd) this.f14371r;
                TLRPC.InputFile inputFile3 = this.f14367b;
                TLRPC.InputFile inputFile4 = this.f14368c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.f41775y = fileLocation2;
                    ndVar.E = this.f14370n.location;
                    ndVar.f41751f.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.v, null);
                    ndVar.g0(true, false);
                    return;
                }
                ndVar.m0 = inputFile3;
                ndVar.f41760n0 = inputFile4;
                ndVar.f41761o0 = this.d;
                ndVar.f41762p0 = this.e;
                ndVar.f41763q0 = this.f14369f;
                if (ndVar.f41765r0) {
                    e2 e2Var = ndVar.f41770v0;
                    if (e2Var != null) {
                        try {
                            e2Var.dismiss();
                            ndVar.f41770v0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ndVar.i0(false);
                    ndVar.f41767s0 = false;
                    ndVar.f41743a.performClick();
                }
                ndVar.g0(false, true);
                ndVar.f41759n.setImageDrawable(null);
                return;
            case 2:
                oo ooVar = (oo) this.f14371r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                ooVar.f42155u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f14367b;
                TLRPC.InputFile inputFile6 = this.f14368c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    k4 k4Var = ooVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    j9 j9Var = ooVar.f42150r;
                    Object obj = ooVar.C0;
                    if (obj == null) {
                        obj = ooVar.f42158w0;
                    }
                    k4Var.h(forLocal, "50_50", j9Var, obj);
                    ooVar.f42132b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (ooVar.Q0 == null) {
                        ooVar.Q0 = new yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    ooVar.f42132b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    ooVar.f42132b0.e.setAnimation(ooVar.Q0);
                    ooVar.o0(true, false);
                    return;
                }
                int i10 = (ooVar.B0 > 0L ? 1 : (ooVar.B0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f14370n;
                long j10 = 0;
                double d = this.f14369f;
                if (i10 != 0) {
                    TLRPC.User user = ooVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = ooVar.C0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f22042id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f22042id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        ooVar.getMessagesController().putUser(ooVar.C0, true);
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
                    tL_photos_uploadProfilePhoto.bot = ooVar.getMessagesController().getInputUser(ooVar.C0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    ooVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new go(ooVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    ooVar.getMessagesController().changeChatAvatar(ooVar.f42156v0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                }
                if (ooVar.L0) {
                    try {
                        e2 e2Var2 = ooVar.f42131b;
                        if (e2Var2 != null && e2Var2.isShowing()) {
                            ooVar.f42131b.dismiss();
                            ooVar.f42131b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    ooVar.M0 = z11;
                    ooVar.f42129a.performClick();
                }
                ooVar.o0(z11, true);
                return;
            case 3:
                e50 e50Var = (e50) this.f14371r;
                long j11 = e50Var.e;
                x50 x50Var = e50Var.f38760f;
                AccountInstance accountInstance = x50Var.d;
                TLRPC.InputFile inputFile7 = this.f14367b;
                TLRPC.InputFile inputFile8 = this.f14368c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f14370n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    e50Var.f38759c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    e50Var.f38758b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    e50Var.d = forLocal2;
                    x50Var.f45493b.A(forLocal2, ImageLocation.getForLocal(e50Var.f38759c));
                    AndroidUtilities.updateVisibleRows(x50Var.Q);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d10 = this.f14369f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new l10(1, e50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j11, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new r00(e50Var, 6));
                return;
            case 4:
                z60 z60Var = (z60) this.f14371r;
                TLRPC.InputFile inputFile9 = this.f14367b;
                TLRPC.InputFile inputFile10 = this.f14368c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    z60Var.f46181y = fileLocation5;
                    z60Var.E = this.f14370n.location;
                    z60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", z60Var.f46177r, null);
                    z60Var.a0(true, false);
                    return;
                }
                z60Var.F = inputFile9;
                z60Var.G = inputFile10;
                z60Var.H = videoSize4;
                z60Var.I = this.e;
                z60Var.J = this.f14369f;
                if (z60Var.L) {
                    z60Var.getMessagesController().createChat(z60Var.f46174c.getText().toString(), z60Var.K, null, z60Var.P, z60Var.S, z60Var.U, z60Var.T, z60Var.W, z60Var);
                }
                z60Var.a0(false, true);
                z60Var.f46175f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.l0((ProfileActivity) this.f14371r, this.f14367b, this.f14368c, this.d, this.f14369f, this.e, this.h, this.f14370n);
                return;
            default:
                f81.e0((f81) this.f14371r, this.f14367b, this.f14368c, this.d, this.f14369f, this.e, this.h, this.f14370n);
                return;
        }
    }

    public k(r2 r2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f14366a = i10;
        this.f14371r = (f50) r2Var;
        this.f14367b = inputFile;
        this.f14368c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f14369f = d;
        this.h = photoSize;
        this.f14370n = photoSize2;
    }

    public k(oo ooVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f14366a = 2;
        this.f14371r = ooVar;
        this.h = photoSize;
        this.f14367b = inputFile;
        this.f14368c = inputFile2;
        this.d = videoSize;
        this.f14370n = photoSize2;
        this.f14369f = d;
        this.e = str;
    }

    public k(f50 f50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f14366a = i10;
        this.f14371r = f50Var;
        this.f14367b = inputFile;
        this.f14368c = inputFile2;
        this.d = videoSize;
        this.f14369f = d;
        this.e = str;
        this.h = photoSize;
        this.f14370n = photoSize2;
    }
}
