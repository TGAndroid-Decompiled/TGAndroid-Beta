package fi;

import ai.z5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g60;
import org.telegram.ui.i91;
import org.telegram.ui.j70;
import org.telegram.ui.ko;
import org.telegram.ui.md;
import org.telegram.ui.n50;
import org.telegram.ui.oo;
import org.telegram.ui.uo;
import org.telegram.ui.uz;
public final class k implements Runnable {
    public final int f9983a;
    public final TLRPC.InputFile f9984b;
    public final TLRPC.InputFile f9985c;
    public final TLRPC.VideoSize d;
    public final String f9986e;
    public final double f9987f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9988n;
    public final l50 f9989r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9983a = 0;
        this.f9989r = pVar;
        this.h = photoSize;
        this.f9984b = inputFile;
        this.f9985c = inputFile2;
        this.d = videoSize;
        this.f9987f = d;
        this.f9986e = str;
        this.f9988n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9983a) {
            case 0:
                p pVar = (p) this.f9989r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9984b;
                TLRPC.InputFile inputFile2 = this.f9985c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f10031y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f10022b, null, inputFile, inputFile2, videoSize, this.f9987f, this.f9986e, photoSize.location, this.f9988n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.W2.N(z10);
                return;
            case 1:
                md mdVar = (md) this.f9989r;
                TLRPC.InputFile inputFile3 = this.f9984b;
                TLRPC.InputFile inputFile4 = this.f9985c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.f39869x = fileLocation2;
                    mdVar.f39870y = this.f9988n.location;
                    mdVar.f39845e.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.f39862s, null);
                    mdVar.e0(true, false);
                    return;
                }
                mdVar.f39854l0 = inputFile3;
                mdVar.m0 = inputFile4;
                mdVar.f39856n0 = this.d;
                mdVar.f39857o0 = this.f9986e;
                mdVar.f39858p0 = this.f9987f;
                if (mdVar.f39859q0) {
                    b2 b2Var = mdVar.f39865u0;
                    if (b2Var != null) {
                        try {
                            b2Var.dismiss();
                            mdVar.f39865u0 = null;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    mdVar.g0(false);
                    mdVar.f39861r0 = false;
                    mdVar.f39838a.performClick();
                }
                mdVar.e0(false, true);
                mdVar.h.setImageDrawable(null);
                return;
            case 2:
                uo uoVar = (uo) this.f9989r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                uoVar.f42492v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9984b;
                TLRPC.InputFile inputFile6 = this.f9985c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    z5 z5Var = uoVar.f42471e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    j9 j9Var = uoVar.f42486r;
                    Object obj = uoVar.D0;
                    if (obj == null) {
                        obj = uoVar.f42496x0;
                    }
                    z5Var.h(forLocal, "50_50", j9Var, obj);
                    uoVar.f42467b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (uoVar.R0 == null) {
                        uoVar.R0 = new ck0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    uoVar.f42467b0.f22720e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    uoVar.f42467b0.f22720e.setAnimation(uoVar.R0);
                    uoVar.n0(true, false);
                    return;
                }
                int i10 = (uoVar.C0 > 0L ? 1 : (uoVar.C0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f9988n;
                long j3 = 0;
                double d = this.f9987f;
                if (i10 != 0) {
                    TLRPC.User user = uoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = uoVar.D0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f20052id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f20052id;
                        }
                        userProfilePhoto.photo_id = j3;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        uoVar.getMessagesController().putUser(uoVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = uoVar.getMessagesController().getInputUser(uoVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    uoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ko(uoVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    uoVar.getMessagesController().changeChatAvatar(uoVar.f42494w0, null, inputFile5, inputFile6, videoSize2, d, this.f9986e, photoSize2.location, photoSize3.location, null);
                }
                if (uoVar.M0) {
                    try {
                        b2 b2Var2 = uoVar.f42466b;
                        if (b2Var2 != null && b2Var2.isShowing()) {
                            uoVar.f42466b.dismiss();
                            uoVar.f42466b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    uoVar.N0 = z11;
                    uoVar.f42464a.performClick();
                }
                uoVar.n0(z11, true);
                return;
            case 3:
                n50 n50Var = (n50) this.f9989r;
                long j10 = n50Var.f40079e;
                g60 g60Var = n50Var.f40080f;
                AccountInstance accountInstance = g60Var.d;
                TLRPC.InputFile inputFile7 = this.f9984b;
                TLRPC.InputFile inputFile8 = this.f9985c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9988n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    n50Var.f40078c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    n50Var.f40077b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    n50Var.d = forLocal2;
                    g60Var.f37791b.A(forLocal2, ImageLocation.getForLocal(n50Var.f40078c));
                    AndroidUtilities.updateVisibleRows(g60Var.Q);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f9987f;
                String str = this.f9986e;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new oo(23, n50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j10, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new uz(n50Var, 7));
                return;
            case 4:
                j70 j70Var = (j70) this.f9989r;
                TLRPC.InputFile inputFile9 = this.f9984b;
                TLRPC.InputFile inputFile10 = this.f9985c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    j70Var.f38855y = fileLocation5;
                    j70Var.E = this.f9988n.location;
                    j70Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", j70Var.f38851r, null);
                    j70Var.Z(true, false);
                    return;
                }
                j70Var.F = inputFile9;
                j70Var.G = inputFile10;
                j70Var.H = videoSize4;
                j70Var.I = this.f9986e;
                j70Var.J = this.f9987f;
                if (j70Var.L) {
                    j70Var.getMessagesController().createChat(j70Var.f38847c.getText().toString(), j70Var.K, null, j70Var.P, j70Var.S, j70Var.U, j70Var.T, j70Var.W, j70Var);
                }
                j70Var.Z(false, true);
                j70Var.f38849f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9989r, this.f9984b, this.f9985c, this.d, this.f9987f, this.f9986e, this.h, this.f9988n);
                return;
            default:
                i91.e0((i91) this.f9989r, this.f9984b, this.f9985c, this.d, this.f9987f, this.f9986e, this.h, this.f9988n);
                return;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9983a = i10;
        this.f9989r = (l50) n2Var;
        this.f9984b = inputFile;
        this.f9985c = inputFile2;
        this.d = videoSize;
        this.f9986e = str;
        this.f9987f = d;
        this.h = photoSize;
        this.f9988n = photoSize2;
    }

    public k(uo uoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9983a = 2;
        this.f9989r = uoVar;
        this.h = photoSize;
        this.f9984b = inputFile;
        this.f9985c = inputFile2;
        this.d = videoSize;
        this.f9988n = photoSize2;
        this.f9987f = d;
        this.f9986e = str;
    }

    public k(l50 l50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9983a = i10;
        this.f9989r = l50Var;
        this.f9984b = inputFile;
        this.f9985c = inputFile2;
        this.d = videoSize;
        this.f9987f = d;
        this.f9986e = str;
        this.h = photoSize;
        this.f9988n = photoSize2;
    }
}
