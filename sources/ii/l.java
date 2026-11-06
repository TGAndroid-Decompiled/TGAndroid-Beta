package ii;

import di.c4;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.c40;
import org.telegram.ui.d50;
import org.telegram.ui.hz;
import org.telegram.ui.jn;
import org.telegram.ui.l30;
import org.telegram.ui.ld;
import org.telegram.ui.m31;
import org.telegram.ui.pn;
public final class l implements Runnable {
    public final int f15551a;
    public final TLRPC.InputFile f15552b;
    public final TLRPC.InputFile f15553c;
    public final TLRPC.VideoSize d;
    public final String f15554e;
    public final double f15555f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f15556n;
    public final i30 f15557r;

    public l(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f15551a = 0;
        this.f15557r = pVar;
        this.h = photoSize;
        this.f15552b = inputFile;
        this.f15553c = inputFile2;
        this.d = videoSize;
        this.f15555f = d;
        this.f15554e = str;
        this.f15556n = photoSize2;
    }

    @Override
    public final void run() {
        long j3;
        int i7 = this.f15551a;
        double d = this.f15555f;
        String str = this.f15554e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f15553c;
        TLRPC.InputFile inputFile2 = this.f15552b;
        TLRPC.PhotoSize photoSize = this.f15556n;
        TLRPC.PhotoSize photoSize2 = this.h;
        i30 i30Var = this.f15557r;
        switch (i7) {
            case 0:
                p pVar = (p) i30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                pVar.G = fileLocation;
                TLRPC.InputFile inputFile3 = this.f15552b;
                TLRPC.InputFile inputFile4 = this.f15553c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pVar.f15589x.j(hc.e(fileLocation), "50_50", pVar.E, pVar.I);
                    pVar.f0(true, false);
                } else {
                    pVar.getMessagesController().B(pVar.f15582c, null, inputFile3, inputFile4, videoSize2, this.f15555f, this.f15554e, photoSize2.location, photoSize.location, null);
                    pVar.f0(false, true);
                }
                pVar.f15583e.f36781f3.O(true);
                return;
            case 1:
                bd bdVar = (bd) i30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    bdVar.D = fileLocation2;
                    bdVar.E = photoSize.location;
                    bdVar.f44260f.j(hc.e(fileLocation2), "50_50", bdVar.f44280w, null);
                    bdVar.k0(true, false);
                    return;
                }
                bdVar.m0 = inputFile2;
                bdVar.f44269n0 = inputFile;
                bdVar.f44270o0 = videoSize;
                bdVar.f44271p0 = str;
                bdVar.f44272q0 = d;
                if (bdVar.f44274r0) {
                    u1 u1Var = bdVar.f44279v0;
                    if (u1Var != null) {
                        try {
                            u1Var.dismiss();
                            bdVar.f44279v0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    bdVar.m0(false);
                    bdVar.f44276s0 = false;
                    bdVar.f44251a.performClick();
                }
                bdVar.k0(false, true);
                bdVar.f44268n.setImageDrawable(null);
                return;
            case 2:
                pn pnVar = (pn) i30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                pnVar.f48884u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f15552b;
                TLRPC.InputFile inputFile6 = this.f15553c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    c4 c4Var = pnVar.f48864e;
                    hc e11 = hc.e(fileLocation3);
                    w8 w8Var = pnVar.f48879r;
                    Object obj = pnVar.C0;
                    if (obj == null) {
                        obj = pnVar.f48887w0;
                    }
                    c4Var.j(e11, "50_50", w8Var, obj);
                    pnVar.f48860b0.o(2131232047, hd.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (pnVar.R0 == null) {
                        pnVar.R0 = new zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    pnVar.f48860b0.f29566e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    pnVar.f48860b0.f29566e.setAnimation(pnVar.R0);
                    pnVar.s0(true, false);
                    return;
                }
                int i10 = (pnVar.B0 > 0L ? 1 : (pnVar.B0 == 0L ? 0 : -1));
                double d2 = this.f15555f;
                if (i10 != 0) {
                    TLRPC.User user = pnVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = pnVar.C0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f26966id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f26966id;
                        } else {
                            j3 = 0;
                        }
                        userProfilePhoto.photo_id = j3;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        pnVar.getMessagesController().X3(pnVar.C0, true, false);
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
                    tL_photos_uploadProfilePhoto.bot = pnVar.getMessagesController().q1(pnVar.C0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    pnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jn(pnVar, 1));
                } else {
                    pnVar.getMessagesController().B(pnVar.f48885v0, null, inputFile5, inputFile6, videoSize3, d2, this.f15554e, photoSize2.location, photoSize.location, null);
                }
                if (pnVar.M0) {
                    try {
                        u1 u1Var2 = pnVar.f48859b;
                        if (u1Var2 != null && u1Var2.isShowing()) {
                            pnVar.f48859b.dismiss();
                            pnVar.f48859b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    pnVar.N0 = false;
                    pnVar.f48857a.performClick();
                }
                pnVar.s0(false, true);
                return;
            case 3:
                l30 l30Var = (l30) i30Var;
                long j10 = l30Var.f47399e;
                c40 c40Var = l30Var.f47400f;
                org.telegram.messenger.c cVar = c40Var.f44586k1;
                TLRPC.InputFile inputFile7 = this.f15552b;
                TLRPC.InputFile inputFile8 = this.f15553c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    l30Var.f47398c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    l30Var.f47397b = fileLocation4;
                    hc e13 = hc.e(fileLocation4);
                    l30Var.d = e13;
                    c40Var.f44577i1.A(e13, hc.e(l30Var.f47398c));
                    org.telegram.messenger.g0.b4(c40Var.H1);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f15555f;
                String str2 = this.f15554e;
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
                    ConnectionsManager.getInstance(cVar.f21723a).sendRequest(tL_photos_uploadProfilePhoto2, new ld(29, l30Var, str2));
                    return;
                }
                qp.s1(cVar.f21723a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new hz(l30Var, 7));
                return;
            case 4:
                d50 d50Var = (d50) i30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    d50Var.D = fileLocation5;
                    d50Var.E = photoSize.location;
                    d50Var.d.j(hc.e(fileLocation5), "50_50", d50Var.f44953r, null);
                    d50Var.e0(true, false);
                    return;
                }
                d50Var.F = inputFile2;
                d50Var.G = inputFile;
                d50Var.H = videoSize;
                d50Var.I = str;
                d50Var.J = d;
                if (d50Var.L) {
                    d50Var.getMessagesController().U(d50Var.f44949c.getText().toString(), d50Var.K, null, d50Var.P, d50Var.S, d50Var.U, d50Var.T, d50Var.W, d50Var);
                }
                d50Var.e0(false, true);
                d50Var.f44951f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.j0((ProfileActivity) i30Var, this.f15552b, this.f15553c, this.d, this.f15555f, this.f15554e, this.h, this.f15556n);
                return;
            default:
                m31.e0((m31) i30Var, this.f15552b, this.f15553c, this.d, this.f15555f, this.f15554e, this.h, this.f15556n);
                return;
        }
    }

    public l(f2 f2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f15551a = i7;
        this.f15557r = (i30) f2Var;
        this.f15552b = inputFile;
        this.f15553c = inputFile2;
        this.d = videoSize;
        this.f15554e = str;
        this.f15555f = d;
        this.h = photoSize;
        this.f15556n = photoSize2;
    }

    public l(pn pnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f15551a = 2;
        this.f15557r = pnVar;
        this.h = photoSize;
        this.f15552b = inputFile;
        this.f15553c = inputFile2;
        this.d = videoSize;
        this.f15556n = photoSize2;
        this.f15555f = d;
        this.f15554e = str;
    }

    public l(i30 i30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f15551a = i7;
        this.f15557r = i30Var;
        this.f15552b = inputFile;
        this.f15553c = inputFile2;
        this.d = videoSize;
        this.f15555f = d;
        this.f15554e = str;
        this.h = photoSize;
        this.f15556n = photoSize2;
    }
}
