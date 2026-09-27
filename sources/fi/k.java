package fi;

import ai.y5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.f10;
import org.telegram.ui.g60;
import org.telegram.ui.io;
import org.telegram.ui.j70;
import org.telegram.ui.mo;
import org.telegram.ui.n50;
import org.telegram.ui.nd;
import org.telegram.ui.so;
public final class k implements Runnable {
    public final int f9106a;
    public final TLRPC.InputFile f9107b;
    public final TLRPC.InputFile f9108c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f9109f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9110n;
    public final w40 f9111r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9106a = 0;
        this.f9111r = pVar;
        this.h = photoSize;
        this.f9107b = inputFile;
        this.f9108c = inputFile2;
        this.d = videoSize;
        this.f9109f = d;
        this.e = str;
        this.f9110n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9106a) {
            case 0:
                p pVar = (p) this.f9111r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9107b;
                TLRPC.InputFile inputFile2 = this.f9108c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f9148y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f9140b, null, inputFile, inputFile2, videoSize, this.f9109f, this.e, photoSize.location, this.f9110n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.Y2.N(z10);
                return;
            case 1:
                nd ndVar = (nd) this.f9111r;
                TLRPC.InputFile inputFile3 = this.f9107b;
                TLRPC.InputFile inputFile4 = this.f9108c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.f35964x = fileLocation2;
                    ndVar.f35965y = this.f9110n.location;
                    ndVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.f35957s, null);
                    ndVar.e0(true, false);
                    return;
                }
                ndVar.f35949l0 = inputFile3;
                ndVar.m0 = inputFile4;
                ndVar.f35951n0 = this.d;
                ndVar.f35952o0 = this.e;
                ndVar.f35953p0 = this.f9109f;
                if (ndVar.f35954q0) {
                    c2 c2Var = ndVar.f35960u0;
                    if (c2Var != null) {
                        try {
                            c2Var.dismiss();
                            ndVar.f35960u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ndVar.g0(false);
                    ndVar.f35956r0 = false;
                    ndVar.f35934a.performClick();
                }
                ndVar.e0(false, true);
                ndVar.h.setImageDrawable(null);
                return;
            case 2:
                so soVar = (so) this.f9111r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                soVar.f37530v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9107b;
                TLRPC.InputFile inputFile6 = this.f9108c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    y5 y5Var = soVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = soVar.f37524r;
                    Object obj = soVar.D0;
                    if (obj == null) {
                        obj = soVar.f37534x0;
                    }
                    y5Var.h(forLocal, "50_50", h9Var, obj);
                    soVar.f37506b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (soVar.R0 == null) {
                        soVar.R0 = new kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    soVar.f37506b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    soVar.f37506b0.e.setAnimation(soVar.R0);
                    soVar.n0(true, false);
                    return;
                }
                long j3 = soVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f9110n;
                double d = this.f9109f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = soVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = soVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f18343id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f18343id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        soVar.getMessagesController().putUser(soVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = soVar.getMessagesController().getInputUser(soVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    soVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new io(soVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = soVar.getMessagesController();
                    long j11 = soVar.f37532w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                }
                if (soVar.M0) {
                    try {
                        c2 c2Var2 = soVar.f37505b;
                        if (c2Var2 != null && c2Var2.isShowing()) {
                            soVar.f37505b.dismiss();
                            soVar.f37505b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    soVar.N0 = z11;
                    soVar.f37503a.performClick();
                }
                soVar.n0(z11, true);
                return;
            case 3:
                n50 n50Var = (n50) this.f9111r;
                long j12 = n50Var.e;
                g60 g60Var = n50Var.f35818f;
                AccountInstance accountInstance = g60Var.d;
                TLRPC.InputFile inputFile7 = this.f9107b;
                TLRPC.InputFile inputFile8 = this.f9108c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9110n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    n50Var.f35817c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    n50Var.f35816b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    n50Var.d = forLocal2;
                    g60Var.f33728b.A(forLocal2, ImageLocation.getForLocal(n50Var.f35817c));
                    AndroidUtilities.updateVisibleRows(g60Var.Q);
                    return;
                }
                double d10 = this.f9109f;
                String str = this.e;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new mo(23, n50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new f10(n50Var, 6));
                return;
            case 4:
                j70 j70Var = (j70) this.f9111r;
                TLRPC.InputFile inputFile9 = this.f9107b;
                TLRPC.InputFile inputFile10 = this.f9108c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    j70Var.f34653y = fileLocation7;
                    j70Var.E = this.f9110n.location;
                    j70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", j70Var.f34649r, null);
                    j70Var.Z(true, false);
                    return;
                }
                j70Var.F = inputFile9;
                j70Var.G = inputFile10;
                j70Var.H = videoSize4;
                j70Var.I = this.e;
                j70Var.J = this.f9109f;
                if (j70Var.L) {
                    j70Var.getMessagesController().createChat(j70Var.f34646c.getText().toString(), j70Var.K, null, j70Var.P, j70Var.S, j70Var.U, j70Var.T, j70Var.W, j70Var);
                }
                j70Var.Z(false, true);
                j70Var.f34647f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9111r, this.f9107b, this.f9108c, this.d, this.f9109f, this.e, this.h, this.f9110n);
                return;
            default:
                a91.X((a91) this.f9111r, this.f9107b, this.f9108c, this.d, this.f9109f, this.e, this.h, this.f9110n);
                return;
        }
    }

    public k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9106a = i10;
        this.f9111r = (w40) o2Var;
        this.f9107b = inputFile;
        this.f9108c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f9109f = d;
        this.h = photoSize;
        this.f9110n = photoSize2;
    }

    public k(so soVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9106a = 2;
        this.f9111r = soVar;
        this.h = photoSize;
        this.f9107b = inputFile;
        this.f9108c = inputFile2;
        this.d = videoSize;
        this.f9110n = photoSize2;
        this.f9109f = d;
        this.e = str;
    }

    public k(w40 w40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9106a = i10;
        this.f9111r = w40Var;
        this.f9107b = inputFile;
        this.f9108c = inputFile2;
        this.d = videoSize;
        this.f9109f = d;
        this.e = str;
        this.h = photoSize;
        this.f9110n = photoSize2;
    }
}
