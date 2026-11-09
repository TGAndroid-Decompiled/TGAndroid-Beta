package ii;

import di.d4;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.w8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.e40;
import org.telegram.ui.f50;
import org.telegram.ui.jz;
import org.telegram.ui.ld;
import org.telegram.ui.ln;
import org.telegram.ui.n30;
import org.telegram.ui.n31;
import org.telegram.ui.rn;
public final class l implements Runnable {
    public final int f15554a;
    public final TLRPC.InputFile f15555b;
    public final TLRPC.InputFile f15556c;
    public final TLRPC.VideoSize d;
    public final String f15557e;
    public final double f15558f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f15559n;
    public final j30 f15560r;

    public l(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f15554a = 0;
        this.f15560r = pVar;
        this.h = photoSize;
        this.f15555b = inputFile;
        this.f15556c = inputFile2;
        this.d = videoSize;
        this.f15558f = d;
        this.f15557e = str;
        this.f15559n = photoSize2;
    }

    @Override
    public final void run() {
        long j3;
        int i7 = this.f15554a;
        double d = this.f15558f;
        String str = this.f15557e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f15556c;
        TLRPC.InputFile inputFile2 = this.f15555b;
        TLRPC.PhotoSize photoSize = this.f15559n;
        TLRPC.PhotoSize photoSize2 = this.h;
        j30 j30Var = this.f15560r;
        switch (i7) {
            case 0:
                p pVar = (p) j30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                pVar.G = fileLocation;
                TLRPC.InputFile inputFile3 = this.f15555b;
                TLRPC.InputFile inputFile4 = this.f15556c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pVar.f15592x.j(hc.e(fileLocation), "50_50", pVar.E, pVar.I);
                    pVar.f0(true, false);
                } else {
                    pVar.getMessagesController().B(pVar.f15585c, null, inputFile3, inputFile4, videoSize2, this.f15558f, this.f15557e, photoSize2.location, photoSize.location, null);
                    pVar.f0(false, true);
                }
                pVar.f15586e.f37556f3.O(true);
                return;
            case 1:
                bd bdVar = (bd) j30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    bdVar.D = fileLocation2;
                    bdVar.E = photoSize.location;
                    bdVar.f43988f.j(hc.e(fileLocation2), "50_50", bdVar.f44008w, null);
                    bdVar.k0(true, false);
                    return;
                }
                bdVar.m0 = inputFile2;
                bdVar.f43997n0 = inputFile;
                bdVar.f43998o0 = videoSize;
                bdVar.f43999p0 = str;
                bdVar.f44000q0 = d;
                if (bdVar.f44002r0) {
                    u1 u1Var = bdVar.f44007v0;
                    if (u1Var != null) {
                        try {
                            u1Var.dismiss();
                            bdVar.f44007v0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    bdVar.m0(false);
                    bdVar.f44004s0 = false;
                    bdVar.f43979a.performClick();
                }
                bdVar.k0(false, true);
                bdVar.f43996n.setImageDrawable(null);
                return;
            case 2:
                rn rnVar = (rn) j30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                rnVar.f49536u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f15555b;
                TLRPC.InputFile inputFile6 = this.f15556c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    d4 d4Var = rnVar.f49516e;
                    hc e11 = hc.e(fileLocation3);
                    w8 w8Var = rnVar.f49531r;
                    Object obj = rnVar.C0;
                    if (obj == null) {
                        obj = rnVar.f49539w0;
                    }
                    d4Var.j(e11, "50_50", w8Var, obj);
                    rnVar.f49512b0.o(2131232047, id.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (rnVar.R0 == null) {
                        rnVar.R0 = new ah0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    rnVar.f49512b0.f29574e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    rnVar.f49512b0.f29574e.setAnimation(rnVar.R0);
                    rnVar.s0(true, false);
                    return;
                }
                int i10 = (rnVar.B0 > 0L ? 1 : (rnVar.B0 == 0L ? 0 : -1));
                double d2 = this.f15558f;
                if (i10 != 0) {
                    TLRPC.User user = rnVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = rnVar.C0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f26970id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f26970id;
                        } else {
                            j3 = 0;
                        }
                        userProfilePhoto.photo_id = j3;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        rnVar.getMessagesController().X3(rnVar.C0, true, false);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile5;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile6;
                        int i11 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d2;
                        tL_photos_uploadProfilePhoto.flags = i11 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = rnVar.getMessagesController().q1(rnVar.C0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    rnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ln(rnVar, 1));
                } else {
                    rnVar.getMessagesController().B(rnVar.f49537v0, null, inputFile5, inputFile6, videoSize3, d2, this.f15557e, photoSize2.location, photoSize.location, null);
                }
                if (rnVar.M0) {
                    try {
                        u1 u1Var2 = rnVar.f49511b;
                        if (u1Var2 != null && u1Var2.isShowing()) {
                            rnVar.f49511b.dismiss();
                            rnVar.f49511b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    rnVar.N0 = false;
                    rnVar.f49509a.performClick();
                }
                rnVar.s0(false, true);
                return;
            case 3:
                n30 n30Var = (n30) j30Var;
                long j10 = n30Var.f48072e;
                e40 e40Var = n30Var.f48073f;
                org.telegram.messenger.c cVar = e40Var.f45228k1;
                TLRPC.InputFile inputFile7 = this.f15555b;
                TLRPC.InputFile inputFile8 = this.f15556c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    n30Var.f48071c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    n30Var.f48070b = fileLocation4;
                    hc e13 = hc.e(fileLocation4);
                    n30Var.d = e13;
                    e40Var.f45219i1.A(e13, hc.e(n30Var.f48071c));
                    org.telegram.messenger.g0.b4(e40Var.H1);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f15558f;
                String str2 = this.f15557e;
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
                    if (videoSize4 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize4;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    ConnectionsManager.getInstance(cVar.f21765a).sendRequest(tL_photos_uploadProfilePhoto2, new ld(29, n30Var, str2));
                    return;
                }
                qp.s1(cVar.f21765a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new jz(n30Var, 7));
                return;
            case 4:
                f50 f50Var = (f50) j30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    f50Var.D = fileLocation5;
                    f50Var.E = photoSize.location;
                    f50Var.d.j(hc.e(fileLocation5), "50_50", f50Var.f45590r, null);
                    f50Var.e0(true, false);
                    return;
                }
                f50Var.F = inputFile2;
                f50Var.G = inputFile;
                f50Var.H = videoSize;
                f50Var.I = str;
                f50Var.J = d;
                if (f50Var.L) {
                    f50Var.getMessagesController().U(f50Var.f45586c.getText().toString(), f50Var.K, null, f50Var.P, f50Var.S, f50Var.U, f50Var.T, f50Var.W, f50Var);
                }
                f50Var.e0(false, true);
                f50Var.f45588f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.r0((ProfileActivity) j30Var, this.f15555b, this.f15556c, this.d, this.f15558f, this.f15557e, this.h, this.f15559n);
                return;
            default:
                n31.e0((n31) j30Var, this.f15555b, this.f15556c, this.d, this.f15558f, this.f15557e, this.h, this.f15559n);
                return;
        }
    }

    public l(f2 f2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f15554a = i7;
        this.f15560r = (j30) f2Var;
        this.f15555b = inputFile;
        this.f15556c = inputFile2;
        this.d = videoSize;
        this.f15557e = str;
        this.f15558f = d;
        this.h = photoSize;
        this.f15559n = photoSize2;
    }

    public l(rn rnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f15554a = 2;
        this.f15560r = rnVar;
        this.h = photoSize;
        this.f15555b = inputFile;
        this.f15556c = inputFile2;
        this.d = videoSize;
        this.f15559n = photoSize2;
        this.f15558f = d;
        this.f15557e = str;
    }

    public l(j30 j30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f15554a = i7;
        this.f15560r = j30Var;
        this.f15555b = inputFile;
        this.f15556c = inputFile2;
        this.d = videoSize;
        this.f15558f = d;
        this.f15557e = str;
        this.h = photoSize;
        this.f15559n = photoSize2;
    }
}
