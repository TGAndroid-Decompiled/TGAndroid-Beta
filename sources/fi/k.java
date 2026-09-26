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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c10;
import org.telegram.ui.d60;
import org.telegram.ui.g70;
import org.telegram.ui.ho;
import org.telegram.ui.k50;
import org.telegram.ui.ld;
import org.telegram.ui.lo;
import org.telegram.ui.ro;
import org.telegram.ui.z81;
public final class k implements Runnable {
    public final int f9101a;
    public final TLRPC.InputFile f9102b;
    public final TLRPC.InputFile f9103c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f9104f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9105n;
    public final u40 f9106r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9101a = 0;
        this.f9106r = pVar;
        this.h = photoSize;
        this.f9102b = inputFile;
        this.f9103c = inputFile2;
        this.d = videoSize;
        this.f9104f = d;
        this.e = str;
        this.f9105n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9101a) {
            case 0:
                p pVar = (p) this.f9106r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9102b;
                TLRPC.InputFile inputFile2 = this.f9103c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f9143y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f9135b, null, inputFile, inputFile2, videoSize, this.f9104f, this.e, photoSize.location, this.f9105n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.Y2.N(z10);
                return;
            case 1:
                ld ldVar = (ld) this.f9106r;
                TLRPC.InputFile inputFile3 = this.f9102b;
                TLRPC.InputFile inputFile4 = this.f9103c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ldVar.f35329x = fileLocation2;
                    ldVar.f35330y = this.f9105n.location;
                    ldVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ldVar.f35322s, null);
                    ldVar.e0(true, false);
                    return;
                }
                ldVar.f35314l0 = inputFile3;
                ldVar.m0 = inputFile4;
                ldVar.f35316n0 = this.d;
                ldVar.f35317o0 = this.e;
                ldVar.f35318p0 = this.f9104f;
                if (ldVar.f35319q0) {
                    a2 a2Var = ldVar.f35325u0;
                    if (a2Var != null) {
                        try {
                            a2Var.dismiss();
                            ldVar.f35325u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ldVar.g0(false);
                    ldVar.f35321r0 = false;
                    ldVar.f35299a.performClick();
                }
                ldVar.e0(false, true);
                ldVar.h.setImageDrawable(null);
                return;
            case 2:
                ro roVar = (ro) this.f9106r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                roVar.f37416v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9102b;
                TLRPC.InputFile inputFile6 = this.f9103c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    y5 y5Var = roVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = roVar.f37410r;
                    Object obj = roVar.D0;
                    if (obj == null) {
                        obj = roVar.f37420x0;
                    }
                    y5Var.h(forLocal, "50_50", h9Var, obj);
                    roVar.f37392b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (roVar.R0 == null) {
                        roVar.R0 = new ij0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    roVar.f37392b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    roVar.f37392b0.e.setAnimation(roVar.R0);
                    roVar.n0(true, false);
                    return;
                }
                long j3 = roVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f9105n;
                double d = this.f9104f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = roVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = roVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f18349id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f18349id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        roVar.getMessagesController().putUser(roVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = roVar.getMessagesController().getInputUser(roVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    roVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ho(roVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = roVar.getMessagesController();
                    long j11 = roVar.f37418w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                }
                if (roVar.M0) {
                    try {
                        a2 a2Var2 = roVar.f37391b;
                        if (a2Var2 != null && a2Var2.isShowing()) {
                            roVar.f37391b.dismiss();
                            roVar.f37391b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    roVar.N0 = z11;
                    roVar.f37389a.performClick();
                }
                roVar.n0(z11, true);
                return;
            case 3:
                k50 k50Var = (k50) this.f9106r;
                long j12 = k50Var.e;
                d60 d60Var = k50Var.f34937f;
                AccountInstance accountInstance = d60Var.d;
                TLRPC.InputFile inputFile7 = this.f9102b;
                TLRPC.InputFile inputFile8 = this.f9103c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9105n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    k50Var.f34936c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    k50Var.f34935b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    k50Var.d = forLocal2;
                    d60Var.f32937b.A(forLocal2, ImageLocation.getForLocal(k50Var.f34936c));
                    AndroidUtilities.updateVisibleRows(d60Var.Q);
                    return;
                }
                double d10 = this.f9104f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new lo(23, k50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new c10(k50Var, 6));
                return;
            case 4:
                g70 g70Var = (g70) this.f9106r;
                TLRPC.InputFile inputFile9 = this.f9102b;
                TLRPC.InputFile inputFile10 = this.f9103c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    g70Var.f33844y = fileLocation7;
                    g70Var.E = this.f9105n.location;
                    g70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", g70Var.f33840r, null);
                    g70Var.Z(true, false);
                    return;
                }
                g70Var.F = inputFile9;
                g70Var.G = inputFile10;
                g70Var.H = videoSize4;
                g70Var.I = this.e;
                g70Var.J = this.f9104f;
                if (g70Var.L) {
                    g70Var.getMessagesController().createChat(g70Var.f33837c.getText().toString(), g70Var.K, null, g70Var.P, g70Var.S, g70Var.U, g70Var.T, g70Var.W, g70Var);
                }
                g70Var.Z(false, true);
                g70Var.f33838f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9106r, this.f9102b, this.f9103c, this.d, this.f9104f, this.e, this.h, this.f9105n);
                return;
            default:
                z81.e0((z81) this.f9106r, this.f9102b, this.f9103c, this.d, this.f9104f, this.e, this.h, this.f9105n);
                return;
        }
    }

    public k(m2 m2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9101a = i10;
        this.f9106r = (u40) m2Var;
        this.f9102b = inputFile;
        this.f9103c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f9104f = d;
        this.h = photoSize;
        this.f9105n = photoSize2;
    }

    public k(ro roVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9101a = 2;
        this.f9106r = roVar;
        this.h = photoSize;
        this.f9102b = inputFile;
        this.f9103c = inputFile2;
        this.d = videoSize;
        this.f9105n = photoSize2;
        this.f9104f = d;
        this.e = str;
    }

    public k(u40 u40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9101a = i10;
        this.f9106r = u40Var;
        this.f9102b = inputFile;
        this.f9103c = inputFile2;
        this.d = videoSize;
        this.f9104f = d;
        this.e = str;
        this.h = photoSize;
        this.f9105n = photoSize2;
    }
}
