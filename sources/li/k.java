package li;

import fi.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.d00;
import org.telegram.ui.e40;
import org.telegram.ui.e50;
import org.telegram.ui.kn;
import org.telegram.ui.kz;
import org.telegram.ui.n30;
import org.telegram.ui.n31;
import org.telegram.ui.rn;
public final class k implements Runnable {
    public final int f20058a;
    public final TLRPC.InputFile f20059b;
    public final TLRPC.InputFile f20060c;
    public final TLRPC.VideoSize d;
    public final String f20061e;
    public final double f20062f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f20063n;
    public final t30 f20064r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f20058a = 0;
        this.f20064r = oVar;
        this.h = photoSize;
        this.f20059b = inputFile;
        this.f20060c = inputFile2;
        this.d = videoSize;
        this.f20062f = d;
        this.f20061e = str;
        this.f20063n = photoSize2;
    }

    @Override
    public final void run() {
        long j3;
        int i7 = this.f20058a;
        double d = this.f20062f;
        String str = this.f20061e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f20060c;
        TLRPC.InputFile inputFile2 = this.f20059b;
        TLRPC.PhotoSize photoSize = this.f20063n;
        TLRPC.PhotoSize photoSize2 = this.h;
        t30 t30Var = this.f20064r;
        switch (i7) {
            case 0:
                o oVar = (o) t30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                oVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.f20059b;
                TLRPC.InputFile inputFile4 = this.f20060c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    oVar.f20080x.j(fc.e(fileLocation), "50_50", oVar.F, oVar.J);
                    oVar.f0(true, false);
                } else {
                    oVar.getMessagesController().B(oVar.f20073c, null, inputFile3, inputFile4, videoSize2, this.f20062f, this.f20061e, photoSize2.location, photoSize.location, null);
                    oVar.f0(false, true);
                }
                oVar.f20074e.f35323g3.O(true);
                return;
            case 1:
                ad adVar = (ad) t30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    adVar.E = fileLocation2;
                    adVar.F = photoSize.location;
                    adVar.f45667f.j(fc.e(fileLocation2), "50_50", adVar.f45687w, null);
                    adVar.k0(true, false);
                    return;
                }
                adVar.f45676n0 = inputFile2;
                adVar.f45677o0 = inputFile;
                adVar.f45678p0 = videoSize;
                adVar.f45679q0 = str;
                adVar.f45681r0 = d;
                if (adVar.f45683s0) {
                    t1 t1Var = adVar.f45688w0;
                    if (t1Var != null) {
                        try {
                            t1Var.dismiss();
                            adVar.f45688w0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    adVar.m0(false);
                    adVar.f45684t0 = false;
                    adVar.f45658a.performClick();
                }
                adVar.k0(false, true);
                adVar.f45675n.setImageDrawable(null);
                return;
            case 2:
                rn rnVar = (rn) t30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                rnVar.f51792v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f20059b;
                TLRPC.InputFile inputFile6 = this.f20060c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    t3 t3Var = rnVar.f51771e;
                    fc e11 = fc.e(fileLocation3);
                    a9 a9Var = rnVar.f51786r;
                    Object obj = rnVar.D0;
                    if (obj == null) {
                        obj = rnVar.f51796x0;
                    }
                    t3Var.j(e11, "50_50", a9Var, obj);
                    rnVar.f51769c0.o(2131232052, gd.N0(2131752201, "ChatSetNewPhoto"), true);
                    if (rnVar.S0 == null) {
                        rnVar.S0 = new nh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    rnVar.f51769c0.f31176e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    rnVar.f51769c0.f31176e.setAnimation(rnVar.S0);
                    rnVar.s0(true, false);
                    return;
                }
                int i10 = (rnVar.C0 > 0L ? 1 : (rnVar.C0 == 0L ? 0 : -1));
                double d2 = this.f20062f;
                if (i10 != 0) {
                    TLRPC.User user = rnVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = rnVar.D0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f28506id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f28506id;
                        } else {
                            j3 = 0;
                        }
                        userProfilePhoto.photo_id = j3;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        rnVar.getMessagesController().e4(rnVar.D0, true, false);
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
                    tL_photos_uploadProfilePhoto.bot = rnVar.getMessagesController().s1(rnVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    rnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new kn(rnVar, 1));
                } else {
                    rnVar.getMessagesController().B(rnVar.f51794w0, null, inputFile5, inputFile6, videoSize3, d2, this.f20061e, photoSize2.location, photoSize.location, null);
                }
                if (rnVar.N0) {
                    try {
                        t1 t1Var2 = rnVar.f51766b;
                        if (t1Var2 != null && t1Var2.isShowing()) {
                            rnVar.f51766b.dismiss();
                            rnVar.f51766b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    rnVar.O0 = false;
                    rnVar.f51764a.performClick();
                }
                rnVar.s0(false, true);
                return;
            case 3:
                n30 n30Var = (n30) t30Var;
                long j10 = n30Var.f50186e;
                e40 e40Var = n30Var.f50187f;
                org.telegram.messenger.c cVar = e40Var.f47376o1;
                TLRPC.InputFile inputFile7 = this.f20059b;
                TLRPC.InputFile inputFile8 = this.f20060c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    n30Var.f50185c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    n30Var.f50184b = fileLocation4;
                    fc e13 = fc.e(fileLocation4);
                    n30Var.d = e13;
                    e40Var.f47367m1.A(e13, fc.e(n30Var.f50185c));
                    org.telegram.messenger.g0.Z3(e40Var.L1);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f20062f;
                String str2 = this.f20061e;
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
                    ConnectionsManager.getInstance(cVar.f23343a).sendRequest(tL_photos_uploadProfilePhoto2, new d00(1, n30Var, str2));
                    return;
                }
                mp.u1(cVar.f23343a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new kz(n30Var, 7));
                return;
            case 4:
                e50 e50Var = (e50) t30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    e50Var.E = fileLocation5;
                    e50Var.F = photoSize.location;
                    e50Var.d.j(fc.e(fileLocation5), "50_50", e50Var.f47442r, null);
                    e50Var.e0(true, false);
                    return;
                }
                e50Var.G = inputFile2;
                e50Var.H = inputFile;
                e50Var.I = videoSize;
                e50Var.J = str;
                e50Var.K = d;
                if (e50Var.M) {
                    e50Var.getMessagesController().U(e50Var.f47438c.getText().toString(), e50Var.L, null, e50Var.Q, e50Var.T, e50Var.V, e50Var.U, e50Var.X, e50Var);
                }
                e50Var.e0(false, true);
                e50Var.f47440f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.r0((ProfileActivity) t30Var, this.f20059b, this.f20060c, this.d, this.f20062f, this.f20061e, this.h, this.f20063n);
                return;
            default:
                n31.e0((n31) t30Var, this.f20059b, this.f20060c, this.d, this.f20062f, this.f20061e, this.h, this.f20063n);
                return;
        }
    }

    public k(g2 g2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f20058a = i7;
        this.f20064r = (t30) g2Var;
        this.f20059b = inputFile;
        this.f20060c = inputFile2;
        this.d = videoSize;
        this.f20061e = str;
        this.f20062f = d;
        this.h = photoSize;
        this.f20063n = photoSize2;
    }

    public k(rn rnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f20058a = 2;
        this.f20064r = rnVar;
        this.h = photoSize;
        this.f20059b = inputFile;
        this.f20060c = inputFile2;
        this.d = videoSize;
        this.f20063n = photoSize2;
        this.f20062f = d;
        this.f20061e = str;
    }

    public k(t30 t30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f20058a = i7;
        this.f20064r = t30Var;
        this.f20059b = inputFile;
        this.f20060c = inputFile2;
        this.d = videoSize;
        this.f20062f = d;
        this.f20061e = str;
        this.h = photoSize;
        this.f20063n = photoSize2;
    }
}
