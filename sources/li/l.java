package li;

import fi.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.e00;
import org.telegram.ui.f40;
import org.telegram.ui.f50;
import org.telegram.ui.kn;
import org.telegram.ui.lz;
import org.telegram.ui.o30;
import org.telegram.ui.o31;
import org.telegram.ui.rn;
public final class l implements Runnable {
    public final int f19961a;
    public final TLRPC.InputFile f19962b;
    public final TLRPC.InputFile f19963c;
    public final TLRPC.VideoSize d;
    public final String f19964e;
    public final double f19965f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f19966n;
    public final w30 f19967r;

    public l(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f19961a = 0;
        this.f19967r = pVar;
        this.h = photoSize;
        this.f19962b = inputFile;
        this.f19963c = inputFile2;
        this.d = videoSize;
        this.f19965f = d;
        this.f19964e = str;
        this.f19966n = photoSize2;
    }

    @Override
    public final void run() {
        long j3;
        int i7 = this.f19961a;
        double d = this.f19965f;
        String str = this.f19964e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f19963c;
        TLRPC.InputFile inputFile2 = this.f19962b;
        TLRPC.PhotoSize photoSize = this.f19966n;
        TLRPC.PhotoSize photoSize2 = this.h;
        w30 w30Var = this.f19967r;
        switch (i7) {
            case 0:
                p pVar = (p) w30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                pVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.f19962b;
                TLRPC.InputFile inputFile4 = this.f19963c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pVar.f19983x.j(gc.e(fileLocation), "50_50", pVar.F, pVar.J);
                    pVar.f0(true, false);
                } else {
                    pVar.getMessagesController().B(pVar.f19976c, null, inputFile3, inputFile4, videoSize2, this.f19965f, this.f19964e, photoSize2.location, photoSize.location, null);
                    pVar.f0(false, true);
                }
                pVar.f19977e.f35742g3.O(true);
                return;
            case 1:
                ad adVar = (ad) w30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    adVar.E = fileLocation2;
                    adVar.F = photoSize.location;
                    adVar.f45551f.j(gc.e(fileLocation2), "50_50", adVar.f45571w, null);
                    adVar.k0(true, false);
                    return;
                }
                adVar.f45560n0 = inputFile2;
                adVar.f45561o0 = inputFile;
                adVar.f45562p0 = videoSize;
                adVar.f45563q0 = str;
                adVar.f45565r0 = d;
                if (adVar.f45567s0) {
                    t1 t1Var = adVar.f45572w0;
                    if (t1Var != null) {
                        try {
                            t1Var.dismiss();
                            adVar.f45572w0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    adVar.m0(false);
                    adVar.f45568t0 = false;
                    adVar.f45542a.performClick();
                }
                adVar.k0(false, true);
                adVar.f45559n.setImageDrawable(null);
                return;
            case 2:
                rn rnVar = (rn) w30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                rnVar.f51703v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f19962b;
                TLRPC.InputFile inputFile6 = this.f19963c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    t3 t3Var = rnVar.f51682e;
                    gc e11 = gc.e(fileLocation3);
                    b9 b9Var = rnVar.f51697r;
                    Object obj = rnVar.D0;
                    if (obj == null) {
                        obj = rnVar.f51707x0;
                    }
                    t3Var.j(e11, "50_50", b9Var, obj);
                    rnVar.f51680c0.o(2131232049, hd.N0(2131752201, "ChatSetNewPhoto"), true);
                    if (rnVar.S0 == null) {
                        rnVar.S0 = new oh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    rnVar.f51680c0.f31134e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    rnVar.f51680c0.f31134e.setAnimation(rnVar.S0);
                    rnVar.s0(true, false);
                    return;
                }
                int i10 = (rnVar.C0 > 0L ? 1 : (rnVar.C0 == 0L ? 0 : -1));
                double d2 = this.f19965f;
                if (i10 != 0) {
                    TLRPC.User user = rnVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = rnVar.D0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f28412id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f28412id;
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
                    rnVar.getMessagesController().B(rnVar.f51705w0, null, inputFile5, inputFile6, videoSize3, d2, this.f19964e, photoSize2.location, photoSize.location, null);
                }
                if (rnVar.N0) {
                    try {
                        t1 t1Var2 = rnVar.f51677b;
                        if (t1Var2 != null && t1Var2.isShowing()) {
                            rnVar.f51677b.dismiss();
                            rnVar.f51677b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    rnVar.O0 = false;
                    rnVar.f51675a.performClick();
                }
                rnVar.s0(false, true);
                return;
            case 3:
                o30 o30Var = (o30) w30Var;
                long j10 = o30Var.f50438e;
                f40 f40Var = o30Var.f50439f;
                org.telegram.messenger.c cVar = f40Var.f47488o1;
                TLRPC.InputFile inputFile7 = this.f19962b;
                TLRPC.InputFile inputFile8 = this.f19963c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    o30Var.f50437c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    o30Var.f50436b = fileLocation4;
                    gc e13 = gc.e(fileLocation4);
                    o30Var.d = e13;
                    f40Var.f47479m1.A(e13, gc.e(o30Var.f50437c));
                    org.telegram.messenger.g0.Z3(f40Var.L1);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f19965f;
                String str2 = this.f19964e;
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
                    ConnectionsManager.getInstance(cVar.f23166a).sendRequest(tL_photos_uploadProfilePhoto2, new e00(1, o30Var, str2));
                    return;
                }
                np.u1(cVar.f23166a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new lz(o30Var, 7));
                return;
            case 4:
                f50 f50Var = (f50) w30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    f50Var.E = fileLocation5;
                    f50Var.F = photoSize.location;
                    f50Var.d.j(gc.e(fileLocation5), "50_50", f50Var.f47561r, null);
                    f50Var.e0(true, false);
                    return;
                }
                f50Var.G = inputFile2;
                f50Var.H = inputFile;
                f50Var.I = videoSize;
                f50Var.J = str;
                f50Var.K = d;
                if (f50Var.M) {
                    f50Var.getMessagesController().U(f50Var.f47557c.getText().toString(), f50Var.L, null, f50Var.Q, f50Var.T, f50Var.V, f50Var.U, f50Var.X, f50Var);
                }
                f50Var.e0(false, true);
                f50Var.f47559f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.r0((ProfileActivity) w30Var, this.f19962b, this.f19963c, this.d, this.f19965f, this.f19964e, this.h, this.f19966n);
                return;
            default:
                o31.e0((o31) w30Var, this.f19962b, this.f19963c, this.d, this.f19965f, this.f19964e, this.h, this.f19966n);
                return;
        }
    }

    public l(g2 g2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f19961a = i7;
        this.f19967r = (w30) g2Var;
        this.f19962b = inputFile;
        this.f19963c = inputFile2;
        this.d = videoSize;
        this.f19964e = str;
        this.f19965f = d;
        this.h = photoSize;
        this.f19966n = photoSize2;
    }

    public l(rn rnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f19961a = 2;
        this.f19967r = rnVar;
        this.h = photoSize;
        this.f19962b = inputFile;
        this.f19963c = inputFile2;
        this.d = videoSize;
        this.f19966n = photoSize2;
        this.f19965f = d;
        this.f19964e = str;
    }

    public l(w30 w30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f19961a = i7;
        this.f19967r = w30Var;
        this.f19962b = inputFile;
        this.f19963c = inputFile2;
        this.d = videoSize;
        this.f19965f = d;
        this.f19964e = str;
        this.h = photoSize;
        this.f19966n = photoSize2;
    }
}
