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
import org.telegram.ui.Components.vj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz;
import org.telegram.ui.io;
import org.telegram.ui.md;
import org.telegram.ui.q50;
import org.telegram.ui.s60;
import org.telegram.ui.x40;
import org.telegram.ui.x71;
import org.telegram.ui.y40;
import org.telegram.ui.zn;
public final class k implements Runnable {
    public final int f12162a;
    public final TLRPC.InputFile f12163b;
    public final TLRPC.InputFile f12164c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f12165f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f12166n;
    public final d50 f12167r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f12162a = 0;
        this.f12167r = oVar;
        this.h = photoSize;
        this.f12163b = inputFile;
        this.f12164c = inputFile2;
        this.d = videoSize;
        this.f12165f = d;
        this.e = str;
        this.f12166n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f12162a) {
            case 0:
                o oVar = (o) this.f12167r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f12163b;
                TLRPC.InputFile inputFile2 = this.f12164c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.f12200y, oVar.H);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f12192b, null, inputFile, inputFile2, videoSize, this.f12165f, this.e, photoSize.location, this.f12166n.location, null);
                    oVar.a0(false, true);
                }
                oVar.d.W2.N(z10);
                return;
            case 1:
                md mdVar = (md) this.f12167r;
                TLRPC.InputFile inputFile3 = this.f12163b;
                TLRPC.InputFile inputFile4 = this.f12164c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.f39208x = fileLocation2;
                    mdVar.f39209y = this.f12166n.location;
                    mdVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.f39201s, null);
                    mdVar.e0(true, false);
                    return;
                }
                mdVar.f39193l0 = inputFile3;
                mdVar.m0 = inputFile4;
                mdVar.f39195n0 = this.d;
                mdVar.f39196o0 = this.e;
                mdVar.f39197p0 = this.f12165f;
                if (mdVar.f39198q0) {
                    b2 b2Var = mdVar.f39204u0;
                    if (b2Var != null) {
                        try {
                            b2Var.dismiss();
                            mdVar.f39204u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    mdVar.g0(false);
                    mdVar.f39200r0 = false;
                    mdVar.f39178a.performClick();
                }
                mdVar.e0(false, true);
                mdVar.h.setImageDrawable(null);
                return;
            case 2:
                io ioVar = (io) this.f12167r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                ioVar.f38060v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f12163b;
                TLRPC.InputFile inputFile6 = this.f12164c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    k4 k4Var = ioVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = ioVar.f38054r;
                    Object obj = ioVar.D0;
                    if (obj == null) {
                        obj = ioVar.f38064x0;
                    }
                    k4Var.h(forLocal, "50_50", h9Var, obj);
                    ioVar.f38036b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (ioVar.R0 == null) {
                        ioVar.R0 = new vj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    ioVar.f38036b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    ioVar.f38036b0.e.setAnimation(ioVar.R0);
                    ioVar.n0(true, false);
                    return;
                }
                int i10 = (ioVar.C0 > 0L ? 1 : (ioVar.C0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f12166n;
                long j10 = 0;
                double d = this.f12165f;
                if (i10 != 0) {
                    TLRPC.User user = ioVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = ioVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f20290id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f20290id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        ioVar.getMessagesController().putUser(ioVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = ioVar.getMessagesController().getInputUser(ioVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    ioVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new zn(ioVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    ioVar.getMessagesController().changeChatAvatar(ioVar.f38062w0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                }
                if (ioVar.M0) {
                    try {
                        b2 b2Var2 = ioVar.f38035b;
                        if (b2Var2 != null && b2Var2.isShowing()) {
                            ioVar.f38035b.dismiss();
                            ioVar.f38035b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    ioVar.N0 = z11;
                    ioVar.f38033a.performClick();
                }
                ioVar.n0(z11, true);
                return;
            case 3:
                y40 y40Var = (y40) this.f12167r;
                long j11 = y40Var.e;
                q50 q50Var = y40Var.f43351f;
                AccountInstance accountInstance = q50Var.d;
                TLRPC.InputFile inputFile7 = this.f12163b;
                TLRPC.InputFile inputFile8 = this.f12164c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f12166n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    y40Var.f43350c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    y40Var.f43349b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    y40Var.d = forLocal2;
                    q50Var.f40378b.A(forLocal2, ImageLocation.getForLocal(y40Var.f43350c));
                    AndroidUtilities.updateVisibleRows(q50Var.Q);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d10 = this.f12165f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new x40(0, y40Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j11, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new dz(y40Var, 7));
                return;
            case 4:
                s60 s60Var = (s60) this.f12167r;
                TLRPC.InputFile inputFile9 = this.f12163b;
                TLRPC.InputFile inputFile10 = this.f12164c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    s60Var.f41383y = fileLocation5;
                    s60Var.E = this.f12166n.location;
                    s60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", s60Var.f41379r, null);
                    s60Var.Z(true, false);
                    return;
                }
                s60Var.F = inputFile9;
                s60Var.G = inputFile10;
                s60Var.H = videoSize4;
                s60Var.I = this.e;
                s60Var.J = this.f12165f;
                if (s60Var.L) {
                    s60Var.getMessagesController().createChat(s60Var.f41376c.getText().toString(), s60Var.K, null, s60Var.P, s60Var.S, s60Var.U, s60Var.T, s60Var.W, s60Var);
                }
                s60Var.Z(false, true);
                s60Var.f41377f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.X((ProfileActivity) this.f12167r, this.f12163b, this.f12164c, this.d, this.f12165f, this.e, this.h, this.f12166n);
                return;
            default:
                x71.e0((x71) this.f12167r, this.f12163b, this.f12164c, this.d, this.f12165f, this.e, this.h, this.f12166n);
                return;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f12162a = i10;
        this.f12167r = (d50) n2Var;
        this.f12163b = inputFile;
        this.f12164c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f12165f = d;
        this.h = photoSize;
        this.f12166n = photoSize2;
    }

    public k(io ioVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f12162a = 2;
        this.f12167r = ioVar;
        this.h = photoSize;
        this.f12163b = inputFile;
        this.f12164c = inputFile2;
        this.d = videoSize;
        this.f12166n = photoSize2;
        this.f12165f = d;
        this.e = str;
    }

    public k(d50 d50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f12162a = i10;
        this.f12167r = d50Var;
        this.f12163b = inputFile;
        this.f12164c = inputFile2;
        this.d = videoSize;
        this.f12165f = d;
        this.e = str;
        this.h = photoSize;
        this.f12166n = photoSize2;
    }
}
