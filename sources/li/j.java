package li;

import fi.v3;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.t8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.b00;
import org.telegram.ui.c40;
import org.telegram.ui.c50;
import org.telegram.ui.iz;
import org.telegram.ui.jn;
import org.telegram.ui.k31;
import org.telegram.ui.qn;
public final class j implements Runnable {
    public final int f19580a;
    public final TLRPC.InputFile f19581b;
    public final TLRPC.InputFile f19582c;
    public final TLRPC.VideoSize d;
    public final String f19583e;
    public final double f19584f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f19585n;
    public final l30 f19586r;

    public j(n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f19580a = 0;
        this.f19586r = nVar;
        this.h = photoSize;
        this.f19581b = inputFile;
        this.f19582c = inputFile2;
        this.d = videoSize;
        this.f19584f = d;
        this.f19583e = str;
        this.f19585n = photoSize2;
    }

    @Override
    public final void run() {
        long j3;
        int i7 = this.f19580a;
        double d = this.f19584f;
        String str = this.f19583e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f19582c;
        TLRPC.InputFile inputFile2 = this.f19581b;
        TLRPC.PhotoSize photoSize = this.f19585n;
        TLRPC.PhotoSize photoSize2 = this.h;
        l30 l30Var = this.f19586r;
        switch (i7) {
            case 0:
                n nVar = (n) l30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                nVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.f19581b;
                TLRPC.InputFile inputFile4 = this.f19582c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    nVar.f19618x.j(gc.e(fileLocation), "50_50", nVar.F, nVar.J);
                    nVar.f0(true, false);
                } else {
                    nVar.getMessagesController().B(nVar.f19611c, null, inputFile3, inputFile4, videoSize2, this.f19584f, this.f19583e, photoSize2.location, photoSize.location, null);
                    nVar.f0(false, true);
                }
                nVar.f19612e.f39892g3.O(true);
                return;
            case 1:
                ad adVar = (ad) l30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    adVar.E = fileLocation2;
                    adVar.F = photoSize.location;
                    adVar.f45004f.j(gc.e(fileLocation2), "50_50", adVar.f45024w, null);
                    adVar.k0(true, false);
                    return;
                }
                adVar.f45013n0 = inputFile2;
                adVar.f45014o0 = inputFile;
                adVar.f45015p0 = videoSize;
                adVar.f45016q0 = str;
                adVar.f45018r0 = d;
                if (adVar.f45020s0) {
                    t1 t1Var = adVar.f45025w0;
                    if (t1Var != null) {
                        try {
                            t1Var.dismiss();
                            adVar.f45025w0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    adVar.m0(false);
                    adVar.f45021t0 = false;
                    adVar.f44995a.performClick();
                }
                adVar.k0(false, true);
                adVar.f45012n.setImageDrawable(null);
                return;
            case 2:
                qn qnVar = (qn) l30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                qnVar.f50688v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f19581b;
                TLRPC.InputFile inputFile6 = this.f19582c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    v3 v3Var = qnVar.f50667e;
                    gc e11 = gc.e(fileLocation3);
                    t8 t8Var = qnVar.f50682r;
                    Object obj = qnVar.D0;
                    if (obj == null) {
                        obj = qnVar.f50692x0;
                    }
                    v3Var.j(e11, "50_50", t8Var, obj);
                    qnVar.f50665c0.o(2131232048, hd.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (qnVar.S0 == null) {
                        qnVar.S0 = new ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    qnVar.f50665c0.f30656e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    qnVar.f50665c0.f30656e.setAnimation(qnVar.S0);
                    qnVar.s0(true, false);
                    return;
                }
                int i10 = (qnVar.C0 > 0L ? 1 : (qnVar.C0 == 0L ? 0 : -1));
                double d2 = this.f19584f;
                if (i10 != 0) {
                    TLRPC.User user = qnVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = qnVar.D0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f28065id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f28065id;
                        } else {
                            j3 = 0;
                        }
                        userProfilePhoto.photo_id = j3;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        qnVar.getMessagesController().X3(qnVar.D0, true, false);
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
                    tL_photos_uploadProfilePhoto.bot = qnVar.getMessagesController().q1(qnVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    qnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jn(qnVar, 1));
                } else {
                    qnVar.getMessagesController().B(qnVar.f50690w0, null, inputFile5, inputFile6, videoSize3, d2, this.f19583e, photoSize2.location, photoSize.location, null);
                }
                if (qnVar.N0) {
                    try {
                        t1 t1Var2 = qnVar.f50662b;
                        if (t1Var2 != null && t1Var2.isShowing()) {
                            qnVar.f50662b.dismiss();
                            qnVar.f50662b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    qnVar.O0 = false;
                    qnVar.f50660a.performClick();
                }
                qnVar.s0(false, true);
                return;
            case 3:
                org.telegram.ui.l30 l30Var2 = (org.telegram.ui.l30) l30Var;
                long j10 = l30Var2.f48818e;
                c40 c40Var = l30Var2.f48819f;
                org.telegram.messenger.c cVar = c40Var.f45940o1;
                TLRPC.InputFile inputFile7 = this.f19581b;
                TLRPC.InputFile inputFile8 = this.f19582c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    l30Var2.f48817c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    l30Var2.f48816b = fileLocation4;
                    gc e13 = gc.e(fileLocation4);
                    l30Var2.d = e13;
                    c40Var.f45931m1.A(e13, gc.e(l30Var2.f48817c));
                    org.telegram.messenger.g0.a4(c40Var.L1);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f19584f;
                String str2 = this.f19583e;
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
                    ConnectionsManager.getInstance(cVar.f22782a).sendRequest(tL_photos_uploadProfilePhoto2, new b00(1, l30Var2, str2));
                    return;
                }
                np.s1(cVar.f22782a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new iz(l30Var2, 7));
                return;
            case 4:
                c50 c50Var = (c50) l30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    c50Var.E = fileLocation5;
                    c50Var.F = photoSize.location;
                    c50Var.d.j(gc.e(fileLocation5), "50_50", c50Var.f46012r, null);
                    c50Var.e0(true, false);
                    return;
                }
                c50Var.G = inputFile2;
                c50Var.H = inputFile;
                c50Var.I = videoSize;
                c50Var.J = str;
                c50Var.K = d;
                if (c50Var.M) {
                    c50Var.getMessagesController().U(c50Var.f46008c.getText().toString(), c50Var.L, null, c50Var.Q, c50Var.T, c50Var.V, c50Var.U, c50Var.X, c50Var);
                }
                c50Var.e0(false, true);
                c50Var.f46010f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.r0((ProfileActivity) l30Var, this.f19581b, this.f19582c, this.d, this.f19584f, this.f19583e, this.h, this.f19585n);
                return;
            default:
                k31.e0((k31) l30Var, this.f19581b, this.f19582c, this.d, this.f19584f, this.f19583e, this.h, this.f19585n);
                return;
        }
    }

    public j(e2 e2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f19580a = i7;
        this.f19586r = (l30) e2Var;
        this.f19581b = inputFile;
        this.f19582c = inputFile2;
        this.d = videoSize;
        this.f19583e = str;
        this.f19584f = d;
        this.h = photoSize;
        this.f19585n = photoSize2;
    }

    public j(qn qnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f19580a = 2;
        this.f19586r = qnVar;
        this.h = photoSize;
        this.f19581b = inputFile;
        this.f19582c = inputFile2;
        this.d = videoSize;
        this.f19585n = photoSize2;
        this.f19584f = d;
        this.f19583e = str;
    }

    public j(l30 l30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f19580a = i7;
        this.f19586r = l30Var;
        this.f19581b = inputFile;
        this.f19582c = inputFile2;
        this.d = videoSize;
        this.f19584f = d;
        this.f19583e = str;
        this.h = photoSize;
        this.f19585n = photoSize2;
    }
}
