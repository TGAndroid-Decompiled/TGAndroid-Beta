package fi;

import ai.z5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g60;
import org.telegram.ui.h91;
import org.telegram.ui.j70;
import org.telegram.ui.ko;
import org.telegram.ui.ld;
import org.telegram.ui.n50;
import org.telegram.ui.oo;
import org.telegram.ui.tz;
import org.telegram.ui.uo;
public final class k implements Runnable {
    public final int f9982a;
    public final TLRPC.InputFile f9983b;
    public final TLRPC.InputFile f9984c;
    public final TLRPC.VideoSize d;
    public final String f9985e;
    public final double f9986f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9987n;
    public final m50 f9988r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9982a = 0;
        this.f9988r = pVar;
        this.h = photoSize;
        this.f9983b = inputFile;
        this.f9984c = inputFile2;
        this.d = videoSize;
        this.f9986f = d;
        this.f9985e = str;
        this.f9987n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9982a) {
            case 0:
                p pVar = (p) this.f9988r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9983b;
                TLRPC.InputFile inputFile2 = this.f9984c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f10030y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f10021b, null, inputFile, inputFile2, videoSize, this.f9986f, this.f9985e, photoSize.location, this.f9987n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.W2.N(z10);
                return;
            case 1:
                ld ldVar = (ld) this.f9988r;
                TLRPC.InputFile inputFile3 = this.f9983b;
                TLRPC.InputFile inputFile4 = this.f9984c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ldVar.f39623x = fileLocation2;
                    ldVar.f39624y = this.f9987n.location;
                    ldVar.f39599e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ldVar.f39616s, null);
                    ldVar.e0(true, false);
                    return;
                }
                ldVar.f39608l0 = inputFile3;
                ldVar.m0 = inputFile4;
                ldVar.f39610n0 = this.d;
                ldVar.f39611o0 = this.f9985e;
                ldVar.f39612p0 = this.f9986f;
                if (ldVar.f39613q0) {
                    a2 a2Var = ldVar.f39619u0;
                    if (a2Var != null) {
                        try {
                            a2Var.dismiss();
                            ldVar.f39619u0 = null;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    ldVar.g0(false);
                    ldVar.f39615r0 = false;
                    ldVar.f39592a.performClick();
                }
                ldVar.e0(false, true);
                ldVar.h.setImageDrawable(null);
                return;
            case 2:
                uo uoVar = (uo) this.f9988r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                uoVar.f42682v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9983b;
                TLRPC.InputFile inputFile6 = this.f9984c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    z5 z5Var = uoVar.f42661e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    j9 j9Var = uoVar.f42676r;
                    Object obj = uoVar.D0;
                    if (obj == null) {
                        obj = uoVar.f42686x0;
                    }
                    z5Var.h(forLocal, "50_50", j9Var, obj);
                    uoVar.f42657b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (uoVar.R0 == null) {
                        uoVar.R0 = new ek0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    uoVar.f42657b0.f22712e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    uoVar.f42657b0.f22712e.setAnimation(uoVar.R0);
                    uoVar.n0(true, false);
                    return;
                }
                int i10 = (uoVar.C0 > 0L ? 1 : (uoVar.C0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f9987n;
                long j3 = 0;
                double d = this.f9986f;
                if (i10 != 0) {
                    TLRPC.User user = uoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = uoVar.D0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f20046id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f20046id;
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
                    uoVar.getMessagesController().changeChatAvatar(uoVar.f42684w0, null, inputFile5, inputFile6, videoSize2, d, this.f9985e, photoSize2.location, photoSize3.location, null);
                }
                if (uoVar.M0) {
                    try {
                        a2 a2Var2 = uoVar.f42656b;
                        if (a2Var2 != null && a2Var2.isShowing()) {
                            uoVar.f42656b.dismiss();
                            uoVar.f42656b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    uoVar.N0 = z11;
                    uoVar.f42654a.performClick();
                }
                uoVar.n0(z11, true);
                return;
            case 3:
                n50 n50Var = (n50) this.f9988r;
                long j10 = n50Var.f40130e;
                g60 g60Var = n50Var.f40131f;
                AccountInstance accountInstance = g60Var.d;
                TLRPC.InputFile inputFile7 = this.f9983b;
                TLRPC.InputFile inputFile8 = this.f9984c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9987n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    n50Var.f40129c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    n50Var.f40128b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    n50Var.d = forLocal2;
                    g60Var.f37871b.A(forLocal2, ImageLocation.getForLocal(n50Var.f40129c));
                    AndroidUtilities.updateVisibleRows(g60Var.Q);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f9986f;
                String str = this.f9985e;
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
                accountInstance.getMessagesController().changeChatAvatar(-j10, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new tz(n50Var, 7));
                return;
            case 4:
                j70 j70Var = (j70) this.f9988r;
                TLRPC.InputFile inputFile9 = this.f9983b;
                TLRPC.InputFile inputFile10 = this.f9984c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    j70Var.f38872y = fileLocation5;
                    j70Var.E = this.f9987n.location;
                    j70Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", j70Var.f38868r, null);
                    j70Var.Z(true, false);
                    return;
                }
                j70Var.F = inputFile9;
                j70Var.G = inputFile10;
                j70Var.H = videoSize4;
                j70Var.I = this.f9985e;
                j70Var.J = this.f9986f;
                if (j70Var.L) {
                    j70Var.getMessagesController().createChat(j70Var.f38864c.getText().toString(), j70Var.K, null, j70Var.P, j70Var.S, j70Var.U, j70Var.T, j70Var.W, j70Var);
                }
                j70Var.Z(false, true);
                j70Var.f38866f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9988r, this.f9983b, this.f9984c, this.d, this.f9986f, this.f9985e, this.h, this.f9987n);
                return;
            default:
                h91.e0((h91) this.f9988r, this.f9983b, this.f9984c, this.d, this.f9986f, this.f9985e, this.h, this.f9987n);
                return;
        }
    }

    public k(m2 m2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9982a = i10;
        this.f9988r = (m50) m2Var;
        this.f9983b = inputFile;
        this.f9984c = inputFile2;
        this.d = videoSize;
        this.f9985e = str;
        this.f9986f = d;
        this.h = photoSize;
        this.f9987n = photoSize2;
    }

    public k(uo uoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9982a = 2;
        this.f9988r = uoVar;
        this.h = photoSize;
        this.f9983b = inputFile;
        this.f9984c = inputFile2;
        this.d = videoSize;
        this.f9987n = photoSize2;
        this.f9986f = d;
        this.f9985e = str;
    }

    public k(m50 m50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9982a = i10;
        this.f9988r = m50Var;
        this.f9983b = inputFile;
        this.f9984c = inputFile2;
        this.d = videoSize;
        this.f9986f = d;
        this.f9985e = str;
        this.h = photoSize;
        this.f9987n = photoSize2;
    }
}
