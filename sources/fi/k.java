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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.o50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i60;
import org.telegram.ui.k91;
import org.telegram.ui.l70;
import org.telegram.ui.oo;
import org.telegram.ui.p50;
import org.telegram.ui.qd;
import org.telegram.ui.so;
import org.telegram.ui.wz;
import org.telegram.ui.xo;
public final class k implements Runnable {
    public final int f9981a;
    public final TLRPC.InputFile f9982b;
    public final TLRPC.InputFile f9983c;
    public final TLRPC.VideoSize d;
    public final String f9984e;
    public final double f9985f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9986n;
    public final o50 f9987r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9981a = 0;
        this.f9987r = pVar;
        this.h = photoSize;
        this.f9982b = inputFile;
        this.f9983c = inputFile2;
        this.d = videoSize;
        this.f9985f = d;
        this.f9984e = str;
        this.f9986n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9981a) {
            case 0:
                p pVar = (p) this.f9987r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9982b;
                TLRPC.InputFile inputFile2 = this.f9983c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f10029y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f10020b, null, inputFile, inputFile2, videoSize, this.f9985f, this.f9984e, photoSize.location, this.f9986n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.W2.N(z10);
                return;
            case 1:
                qd qdVar = (qd) this.f9987r;
                TLRPC.InputFile inputFile3 = this.f9982b;
                TLRPC.InputFile inputFile4 = this.f9983c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    qdVar.f41301x = fileLocation2;
                    qdVar.f41302y = this.f9986n.location;
                    qdVar.f41277e.h(ImageLocation.getForLocal(fileLocation2), "50_50", qdVar.f41294s, null);
                    qdVar.e0(true, false);
                    return;
                }
                qdVar.f41286l0 = inputFile3;
                qdVar.m0 = inputFile4;
                qdVar.f41288n0 = this.d;
                qdVar.f41289o0 = this.f9984e;
                qdVar.f41290p0 = this.f9985f;
                if (qdVar.f41291q0) {
                    a2 a2Var = qdVar.f41297u0;
                    if (a2Var != null) {
                        try {
                            a2Var.dismiss();
                            qdVar.f41297u0 = null;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    qdVar.g0(false);
                    qdVar.f41293r0 = false;
                    qdVar.f41270a.performClick();
                }
                qdVar.e0(false, true);
                qdVar.h.setImageDrawable(null);
                return;
            case 2:
                xo xoVar = (xo) this.f9987r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                xoVar.f44075v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9982b;
                TLRPC.InputFile inputFile6 = this.f9983c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    z5 z5Var = xoVar.f44054e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    j9 j9Var = xoVar.f44069r;
                    Object obj = xoVar.D0;
                    if (obj == null) {
                        obj = xoVar.f44079x0;
                    }
                    z5Var.h(forLocal, "50_50", j9Var, obj);
                    xoVar.f44050b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (xoVar.R0 == null) {
                        xoVar.R0 = new fk0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    xoVar.f44050b0.f22483e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    xoVar.f44050b0.f22483e.setAnimation(xoVar.R0);
                    xoVar.n0(true, false);
                    return;
                }
                int i10 = (xoVar.C0 > 0L ? 1 : (xoVar.C0 == 0L ? 0 : -1));
                TLRPC.PhotoSize photoSize3 = this.f9986n;
                long j3 = 0;
                double d = this.f9985f;
                if (i10 != 0) {
                    TLRPC.User user = xoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = xoVar.D0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f19816id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f19816id;
                        }
                        userProfilePhoto.photo_id = j3;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        xoVar.getMessagesController().putUser(xoVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = xoVar.getMessagesController().getInputUser(xoVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    xoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new oo(xoVar, 1));
                    z11 = false;
                } else {
                    z11 = false;
                    xoVar.getMessagesController().changeChatAvatar(xoVar.f44077w0, null, inputFile5, inputFile6, videoSize2, d, this.f9984e, photoSize2.location, photoSize3.location, null);
                }
                if (xoVar.M0) {
                    try {
                        a2 a2Var2 = xoVar.f44049b;
                        if (a2Var2 != null && a2Var2.isShowing()) {
                            xoVar.f44049b.dismiss();
                            xoVar.f44049b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    xoVar.N0 = z11;
                    xoVar.f44047a.performClick();
                }
                xoVar.n0(z11, true);
                return;
            case 3:
                p50 p50Var = (p50) this.f9987r;
                long j10 = p50Var.f40853e;
                i60 i60Var = p50Var.f40854f;
                AccountInstance accountInstance = i60Var.d;
                TLRPC.InputFile inputFile7 = this.f9982b;
                TLRPC.InputFile inputFile8 = this.f9983c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9986n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    p50Var.f40852c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    p50Var.f40851b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    p50Var.d = forLocal2;
                    i60Var.f38680b.A(forLocal2, ImageLocation.getForLocal(p50Var.f40852c));
                    AndroidUtilities.updateVisibleRows(i60Var.Q);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f9985f;
                String str = this.f9984e;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new so(23, p50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j10, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new wz(p50Var, 7));
                return;
            case 4:
                l70 l70Var = (l70) this.f9987r;
                TLRPC.InputFile inputFile9 = this.f9982b;
                TLRPC.InputFile inputFile10 = this.f9983c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    l70Var.f39660y = fileLocation5;
                    l70Var.E = this.f9986n.location;
                    l70Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", l70Var.f39656r, null);
                    l70Var.Z(true, false);
                    return;
                }
                l70Var.F = inputFile9;
                l70Var.G = inputFile10;
                l70Var.H = videoSize4;
                l70Var.I = this.f9984e;
                l70Var.J = this.f9985f;
                if (l70Var.L) {
                    l70Var.getMessagesController().createChat(l70Var.f39652c.getText().toString(), l70Var.K, null, l70Var.P, l70Var.S, l70Var.U, l70Var.T, l70Var.W, l70Var);
                }
                l70Var.Z(false, true);
                l70Var.f39654f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9987r, this.f9982b, this.f9983c, this.d, this.f9985f, this.f9984e, this.h, this.f9986n);
                return;
            default:
                k91.e0((k91) this.f9987r, this.f9982b, this.f9983c, this.d, this.f9985f, this.f9984e, this.h, this.f9986n);
                return;
        }
    }

    public k(m2 m2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9981a = i10;
        this.f9987r = (o50) m2Var;
        this.f9982b = inputFile;
        this.f9983c = inputFile2;
        this.d = videoSize;
        this.f9984e = str;
        this.f9985f = d;
        this.h = photoSize;
        this.f9986n = photoSize2;
    }

    public k(xo xoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9981a = 2;
        this.f9987r = xoVar;
        this.h = photoSize;
        this.f9982b = inputFile;
        this.f9983c = inputFile2;
        this.d = videoSize;
        this.f9986n = photoSize2;
        this.f9985f = d;
        this.f9984e = str;
    }

    public k(o50 o50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9981a = i10;
        this.f9987r = o50Var;
        this.f9982b = inputFile;
        this.f9983c = inputFile2;
        this.d = videoSize;
        this.f9985f = d;
        this.f9984e = str;
        this.h = photoSize;
        this.f9986n = photoSize2;
    }
}
