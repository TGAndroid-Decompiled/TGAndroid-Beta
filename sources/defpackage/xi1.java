package defpackage;

import android.graphics.RectF;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class xi1 implements Runnable {
    public final byte a;
    public final TLRPC.PhotoSize b;
    public final TLRPC.InputFile c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize e;
    public final TLRPC.PhotoSize f;
    public final double h;
    public final String n;
    public final vn5 r;

    public xi1(d dVar, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, byte b) {
        this.a = b;
        this.r = (vn5) dVar;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.n = str;
        this.h = d;
        this.b = photoSize;
        this.f = photoSize2;
    }

    @Override
    public final void run() {
        long j;
        byte b = this.a;
        double d = this.h;
        String str = this.n;
        TLRPC.VideoSize videoSize = this.e;
        TLRPC.InputFile inputFile = this.d;
        TLRPC.InputFile inputFile2 = this.c;
        TLRPC.PhotoSize photoSize = this.f;
        TLRPC.PhotoSize photoSize2 = this.b;
        vn5 vn5Var = this.r;
        switch (b) {
            case 0:
                fj1 fj1Var = (fj1) vn5Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation = photoSize2.location;
                    fj1Var.E = fileLocation;
                    fj1Var.F = photoSize.location;
                    fj1Var.f.m(gn5.e(fileLocation), "50_50", fj1Var.w, null);
                    fj1Var.j0(true, false);
                    return;
                }
                fj1Var.n0 = inputFile2;
                fj1Var.o0 = inputFile;
                fj1Var.p0 = videoSize;
                fj1Var.q0 = str;
                fj1Var.r0 = d;
                if (fj1Var.s0) {
                    he heVar = fj1Var.w0;
                    if (heVar != null) {
                        try {
                            heVar.dismiss();
                            fj1Var.w0 = null;
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                    fj1Var.m0(false);
                    fj1Var.t0 = false;
                    fj1Var.a.performClick();
                }
                fj1Var.j0(false, true);
                fj1Var.n.setImageDrawable(null);
                return;
            case 1:
                ba2 ba2Var = (ba2) vn5Var;
                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                ba2Var.v0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    kc0 kc0Var = ba2Var.e;
                    gn5 e2 = gn5.e(fileLocation2);
                    pc0 pc0Var = ba2Var.r;
                    Object obj = ba2Var.D0;
                    if (obj == null) {
                        obj = ba2Var.x0;
                    }
                    kc0Var.m(e2, "50_50", pc0Var, obj);
                    ba2Var.c0.o(2131232053, jb6.M0(2131752150, "ChatSetNewPhoto"), true);
                    if (ba2Var.S0 == null) {
                        ba2Var.S0 = new p09(2131623965, gm.L(50.0f), gm.L(50.0f), false, null);
                    }
                    ba2Var.c0.e.setTranslationX(-gm.L(8.0f));
                    ba2Var.c0.e.setAnimation(ba2Var.S0);
                    ba2Var.s0(true, false);
                    return;
                }
                int i = (ba2Var.C0 > 0L ? 1 : (ba2Var.C0 == 0L ? 0 : -1));
                double d2 = this.h;
                if (i != 0) {
                    TLRPC.User user = ba2Var.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = ba2Var.D0.photo;
                        if (inputFile3 != null) {
                            j = inputFile3.id;
                        } else if (inputFile4 != null) {
                            j = inputFile4.id;
                        } else {
                            j = 0;
                        }
                        userProfilePhoto.photo_id = j;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        ba2Var.getMessagesController().c4(ba2Var.D0, true, false);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i2 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d2;
                        tL_photos_uploadProfilePhoto.flags = i2 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = ba2Var.getMessagesController().p1(ba2Var.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    ba2Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new t92(ba2Var, (byte) 1));
                } else {
                    ba2Var.getMessagesController().x(ba2Var.w0, null, inputFile3, inputFile4, videoSize2, d2, this.n, photoSize2.location, photoSize.location, null);
                }
                if (ba2Var.N0) {
                    try {
                        he heVar2 = ba2Var.b;
                        if (heVar2 != null && heVar2.isShowing()) {
                            ba2Var.b.dismiss();
                            ba2Var.b = null;
                        }
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                    ba2Var.O0 = false;
                    ba2Var.a.performClick();
                }
                ba2Var.s0(false, true);
                return;
            case 2:
                po2 po2Var = (po2) vn5Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                po2Var.H = fileLocation3;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    po2Var.x.m(gn5.e(fileLocation3), "50_50", po2Var.F, po2Var.J);
                    po2Var.f0(true, false);
                } else {
                    po2Var.getMessagesController().x(po2Var.c, null, inputFile5, inputFile6, videoSize3, this.h, this.n, photoSize2.location, photoSize.location, null);
                    po2Var.f0(false, true);
                }
                po2Var.e.g3.O(true);
                return;
            case 3:
                r85 r85Var = (r85) vn5Var;
                long j2 = r85Var.e;
                g95 g95Var = r85Var.f;
                j5 j5Var = g95Var.n1;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    r85Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    r85Var.b = fileLocation4;
                    gn5 e4 = gn5.e(fileLocation4);
                    r85Var.d = e4;
                    g95Var.l1.A(e4, gn5.e(r85Var.c));
                    gm.V3(g95Var.J1);
                    return;
                }
                int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                double d3 = this.h;
                String str2 = this.n;
                if (i3 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile7 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile7;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile8 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile8;
                        int i4 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d3;
                        tL_photos_uploadProfilePhoto2.flags = i4 | 6;
                    }
                    if (videoSize4 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize4;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    ConnectionsManager.getInstance(j5Var.a).sendRequest(tL_photos_uploadProfilePhoto2, new cx3(r85Var, str2, (byte) 9));
                    return;
                }
                oc7.r1(j5Var.a).x(-j2, null, inputFile7, inputFile8, videoSize4, d3, str2, photoSize2.location, photoSize.location, new qn4(r85Var, (byte) 19));
                return;
            case 4:
                uc5 uc5Var = (uc5) vn5Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    uc5Var.E = fileLocation5;
                    uc5Var.F = photoSize.location;
                    uc5Var.d.m(gn5.e(fileLocation5), "50_50", uc5Var.r, null);
                    uc5Var.e0(true, false);
                    return;
                }
                uc5Var.G = inputFile2;
                uc5Var.H = inputFile;
                uc5Var.I = videoSize;
                uc5Var.J = str;
                uc5Var.K = d;
                if (uc5Var.M) {
                    uc5Var.getMessagesController().Q(uc5Var.c.getText().toString(), uc5Var.L, null, uc5Var.Q, uc5Var.T, uc5Var.V, uc5Var.U, uc5Var.X, uc5Var);
                }
                uc5Var.e0(false, true);
                uc5Var.f.setImageDrawable(null);
                return;
            case 5:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) vn5Var).E2(this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                return;
            default:
                ((daa) vn5Var).f0(this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                return;
        }
    }

    public xi1(po2 po2Var, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = (byte) 2;
        this.r = po2Var;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.f = photoSize2;
    }

    public xi1(vn5 vn5Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, byte b) {
        this.a = b;
        this.r = vn5Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public xi1(ba2 ba2Var, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = (byte) 1;
        this.r = ba2Var;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }
}
