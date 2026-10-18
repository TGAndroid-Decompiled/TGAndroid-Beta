package hi;

import ci.k4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a50;
import org.telegram.ui.bo;
import org.telegram.ui.fz;
import org.telegram.ui.ko;
import org.telegram.ui.od;
import org.telegram.ui.s50;
import org.telegram.ui.u60;
import org.telegram.ui.z40;
import org.telegram.ui.z71;
public final class k implements Runnable {
    public final int f12165a;
    public final TLRPC.InputFile f12166b;
    public final TLRPC.InputFile f12167c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f12168f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f12169n;
    public final d50 f12170r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f12165a = 0;
        this.f12170r = oVar;
        this.h = photoSize;
        this.f12166b = inputFile;
        this.f12167c = inputFile2;
        this.d = videoSize;
        this.f12168f = d;
        this.e = str;
        this.f12169n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f12165a) {
            case 0:
                o oVar = (o) this.f12170r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f12166b;
                TLRPC.InputFile inputFile2 = this.f12167c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.f12203y, oVar.H);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f12195b, null, inputFile, inputFile2, videoSize, this.f12168f, this.e, photoSize.location, this.f12169n.location, null);
                    oVar.a0(false, true);
                }
                oVar.d.W2.N(z10);
                return;
            case 1:
                od odVar = (od) this.f12170r;
                TLRPC.InputFile inputFile3 = this.f12166b;
                TLRPC.InputFile inputFile4 = this.f12167c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    odVar.f39761x = fileLocation2;
                    odVar.f39762y = this.f12169n.location;
                    odVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", odVar.f39754s, null);
                    odVar.e0(true, false);
                    return;
                }
                odVar.f39746l0 = inputFile3;
                odVar.m0 = inputFile4;
                odVar.f39748n0 = this.d;
                odVar.f39749o0 = this.e;
                odVar.f39750p0 = this.f12168f;
                if (odVar.f39751q0) {
                    b2 b2Var = odVar.f39757u0;
                    if (b2Var != null) {
                        try {
                            b2Var.dismiss();
                            odVar.f39757u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    odVar.g0(false);
                    odVar.f39753r0 = false;
                    odVar.f39731a.performClick();
                }
                odVar.e0(false, true);
                odVar.h.setImageDrawable(null);
                return;
            case 2:
                ko koVar = (ko) this.f12170r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                koVar.f38618v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f12166b;
                TLRPC.InputFile inputFile6 = this.f12167c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    k4 k4Var = koVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = koVar.f38612r;
                    Object obj = koVar.D0;
                    if (obj == null) {
                        obj = koVar.f38622x0;
                    }
                    k4Var.h(forLocal, "50_50", h9Var, obj);
                    koVar.f38594b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (koVar.R0 == null) {
                        koVar.R0 = new uj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    koVar.f38594b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    koVar.f38594b0.e.setAnimation(koVar.R0);
                    koVar.n0(true, false);
                    return;
                }
                int i10 = (koVar.C0 > 0L ? 1 : (koVar.C0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f12169n;
                long j10 = 0;
                double d = this.f12168f;
                if (i10 != 0) {
                    TLRPC.User user = koVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = koVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f20293id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f20293id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        koVar.getMessagesController().putUser(koVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = koVar.getMessagesController().getInputUser(koVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    koVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bo(koVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    koVar.getMessagesController().changeChatAvatar(koVar.f38620w0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                }
                if (koVar.M0) {
                    try {
                        b2 b2Var2 = koVar.f38593b;
                        if (b2Var2 != null && b2Var2.isShowing()) {
                            koVar.f38593b.dismiss();
                            koVar.f38593b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    koVar.N0 = z11;
                    koVar.f38591a.performClick();
                }
                koVar.n0(z11, true);
                return;
            case 3:
                a50 a50Var = (a50) this.f12170r;
                long j11 = a50Var.e;
                s50 s50Var = a50Var.f35319f;
                AccountInstance accountInstance = s50Var.d;
                TLRPC.InputFile inputFile7 = this.f12166b;
                TLRPC.InputFile inputFile8 = this.f12167c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f12169n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    a50Var.f35318c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    a50Var.f35317b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    a50Var.d = forLocal2;
                    s50Var.f40936b.A(forLocal2, ImageLocation.getForLocal(a50Var.f35318c));
                    AndroidUtilities.updateVisibleRows(s50Var.Q);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d10 = this.f12168f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new z40(0, a50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j11, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new fz(a50Var, 7));
                return;
            case 4:
                u60 u60Var = (u60) this.f12170r;
                TLRPC.InputFile inputFile9 = this.f12166b;
                TLRPC.InputFile inputFile10 = this.f12167c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    u60Var.f41914y = fileLocation5;
                    u60Var.E = this.f12169n.location;
                    u60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", u60Var.f41910r, null);
                    u60Var.Z(true, false);
                    return;
                }
                u60Var.F = inputFile9;
                u60Var.G = inputFile10;
                u60Var.H = videoSize4;
                u60Var.I = this.e;
                u60Var.J = this.f12168f;
                if (u60Var.L) {
                    u60Var.getMessagesController().createChat(u60Var.f41907c.getText().toString(), u60Var.K, null, u60Var.P, u60Var.S, u60Var.U, u60Var.T, u60Var.W, u60Var);
                }
                u60Var.Z(false, true);
                u60Var.f41908f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.X((ProfileActivity) this.f12170r, this.f12166b, this.f12167c, this.d, this.f12168f, this.e, this.h, this.f12169n);
                return;
            default:
                z71.e0((z71) this.f12170r, this.f12166b, this.f12167c, this.d, this.f12168f, this.e, this.h, this.f12169n);
                return;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f12165a = i10;
        this.f12170r = (d50) n2Var;
        this.f12166b = inputFile;
        this.f12167c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f12168f = d;
        this.h = photoSize;
        this.f12169n = photoSize2;
    }

    public k(ko koVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f12165a = 2;
        this.f12170r = koVar;
        this.h = photoSize;
        this.f12166b = inputFile;
        this.f12167c = inputFile2;
        this.d = videoSize;
        this.f12169n = photoSize2;
        this.f12168f = d;
        this.e = str;
    }

    public k(d50 d50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f12165a = i10;
        this.f12170r = d50Var;
        this.f12166b = inputFile;
        this.f12167c = inputFile2;
        this.d = videoSize;
        this.f12168f = d;
        this.e = str;
        this.h = photoSize;
        this.f12169n = photoSize2;
    }
}
