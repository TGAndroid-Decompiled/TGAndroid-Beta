package ji;

import ei.d4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.u8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.c31;
import org.telegram.ui.fn;
import org.telegram.ui.fz;
import org.telegram.ui.g30;
import org.telegram.ui.ln;
import org.telegram.ui.x30;
import org.telegram.ui.xy;
import org.telegram.ui.y40;
public final class j implements Runnable {
    public final int f16329a;
    public final TLRPC.InputFile f16330b;
    public final TLRPC.InputFile f16331c;
    public final TLRPC.VideoSize d;
    public final String f16332e;
    public final double f16333f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f16334n;
    public final e30 f16335r;

    public j(n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f16329a = 0;
        this.f16335r = nVar;
        this.h = photoSize;
        this.f16330b = inputFile;
        this.f16331c = inputFile2;
        this.d = videoSize;
        this.f16333f = d;
        this.f16332e = str;
        this.f16334n = photoSize2;
    }

    @Override
    public final void run() {
        long j10;
        int i3 = this.f16329a;
        double d = this.f16333f;
        String str = this.f16332e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f16331c;
        TLRPC.InputFile inputFile2 = this.f16330b;
        TLRPC.PhotoSize photoSize = this.f16334n;
        TLRPC.PhotoSize photoSize2 = this.h;
        e30 e30Var = this.f16335r;
        switch (i3) {
            case 0:
                n nVar = (n) e30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                nVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.f16330b;
                TLRPC.InputFile inputFile4 = this.f16331c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    nVar.f16351x.j(ac.e(fileLocation), "50_50", nVar.F, nVar.J);
                    nVar.f0(true, false);
                } else {
                    nVar.getMessagesController().B(nVar.f16344c, null, inputFile3, inputFile4, videoSize2, this.f16333f, this.f16332e, photoSize2.location, photoSize.location, null);
                    nVar.f0(false, true);
                }
                nVar.f16345e.f35594g3.O(true);
                return;
            case 1:
                ad adVar = (ad) e30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    adVar.E = fileLocation2;
                    adVar.F = photoSize.location;
                    adVar.f43734f.j(ac.e(fileLocation2), "50_50", adVar.f43754w, null);
                    adVar.k0(true, false);
                    return;
                }
                adVar.f43743n0 = inputFile2;
                adVar.f43744o0 = inputFile;
                adVar.f43745p0 = videoSize;
                adVar.f43746q0 = str;
                adVar.f43748r0 = d;
                if (adVar.f43750s0) {
                    s1 s1Var = adVar.f43755w0;
                    if (s1Var != null) {
                        try {
                            s1Var.dismiss();
                            adVar.f43755w0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    adVar.m0(false);
                    adVar.f43751t0 = false;
                    adVar.f43725a.performClick();
                }
                adVar.k0(false, true);
                adVar.f43742n.setImageDrawable(null);
                return;
            case 2:
                ln lnVar = (ln) e30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                lnVar.f47392v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f16330b;
                TLRPC.InputFile inputFile6 = this.f16331c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    d4 d4Var = lnVar.f47371e;
                    ac e11 = ac.e(fileLocation3);
                    u8 u8Var = lnVar.f47386r;
                    Object obj = lnVar.D0;
                    if (obj == null) {
                        obj = lnVar.f47396x0;
                    }
                    d4Var.j(e11, "50_50", u8Var, obj);
                    lnVar.f47369c0.o(2131232047, bd.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (lnVar.S0 == null) {
                        lnVar.S0 = new ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    lnVar.f47369c0.f29595e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    lnVar.f47369c0.f29595e.setAnimation(lnVar.S0);
                    lnVar.s0(true, false);
                    return;
                }
                int i10 = (lnVar.C0 > 0L ? 1 : (lnVar.C0 == 0L ? 0 : -1));
                double d10 = this.f16333f;
                if (i10 != 0) {
                    TLRPC.User user = lnVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = lnVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f27015id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f27015id;
                        } else {
                            j10 = 0;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        lnVar.getMessagesController().X3(lnVar.D0, true, false);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile5;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile6;
                        int i11 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto.flags = i11 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = lnVar.getMessagesController().q1(lnVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    lnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new fn(lnVar, 1));
                } else {
                    lnVar.getMessagesController().B(lnVar.f47394w0, null, inputFile5, inputFile6, videoSize3, d10, this.f16332e, photoSize2.location, photoSize.location, null);
                }
                if (lnVar.N0) {
                    try {
                        s1 s1Var2 = lnVar.f47366b;
                        if (s1Var2 != null && s1Var2.isShowing()) {
                            lnVar.f47366b.dismiss();
                            lnVar.f47366b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    lnVar.O0 = false;
                    lnVar.f47364a.performClick();
                }
                lnVar.s0(false, true);
                return;
            case 3:
                g30 g30Var = (g30) e30Var;
                long j11 = g30Var.f45510e;
                x30 x30Var = g30Var.f45511f;
                org.telegram.messenger.c cVar = x30Var.f51759l1;
                TLRPC.InputFile inputFile7 = this.f16330b;
                TLRPC.InputFile inputFile8 = this.f16331c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    g30Var.f45509c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    g30Var.f45508b = fileLocation4;
                    ac e13 = ac.e(fileLocation4);
                    g30Var.d = e13;
                    x30Var.f51750j1.A(e13, ac.e(g30Var.f45509c));
                    org.telegram.messenger.g0.b4(x30Var.I1);
                    return;
                }
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d11 = this.f16333f;
                String str2 = this.f16332e;
                if (i12 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile7 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile7;
                        tL_photos_uploadProfilePhoto2.flags = 1 | tL_photos_uploadProfilePhoto2.flags;
                    }
                    if (inputFile8 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile8;
                        int i13 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d11;
                        tL_photos_uploadProfilePhoto2.flags = i13 | 6;
                    }
                    if (videoSize4 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize4;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    ConnectionsManager.getInstance(cVar.f21919a).sendRequest(tL_photos_uploadProfilePhoto2, new xy(2, g30Var, str2));
                    return;
                }
                hp.s1(cVar.f21919a).B(-j11, null, inputFile7, inputFile8, videoSize4, d11, str2, photoSize2.location, photoSize.location, new fz(g30Var, 6));
                return;
            case 4:
                y40 y40Var = (y40) e30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    y40Var.E = fileLocation5;
                    y40Var.F = photoSize.location;
                    y40Var.d.j(ac.e(fileLocation5), "50_50", y40Var.f52186r, null);
                    y40Var.e0(true, false);
                    return;
                }
                y40Var.G = inputFile2;
                y40Var.H = inputFile;
                y40Var.I = videoSize;
                y40Var.J = str;
                y40Var.K = d;
                if (y40Var.M) {
                    y40Var.getMessagesController().U(y40Var.f52182c.getText().toString(), y40Var.L, null, y40Var.Q, y40Var.T, y40Var.V, y40Var.U, y40Var.X, y40Var);
                }
                y40Var.e0(false, true);
                y40Var.f52184f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.j0((ProfileActivity) e30Var, this.f16330b, this.f16331c, this.d, this.f16333f, this.f16332e, this.h, this.f16334n);
                return;
            default:
                c31.e0((c31) e30Var, this.f16330b, this.f16331c, this.d, this.f16333f, this.f16332e, this.h, this.f16334n);
                return;
        }
    }

    public j(d2 d2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i3) {
        this.f16329a = i3;
        this.f16335r = (e30) d2Var;
        this.f16330b = inputFile;
        this.f16331c = inputFile2;
        this.d = videoSize;
        this.f16332e = str;
        this.f16333f = d;
        this.h = photoSize;
        this.f16334n = photoSize2;
    }

    public j(ln lnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f16329a = 2;
        this.f16335r = lnVar;
        this.h = photoSize;
        this.f16330b = inputFile;
        this.f16331c = inputFile2;
        this.d = videoSize;
        this.f16334n = photoSize2;
        this.f16333f = d;
        this.f16332e = str;
    }

    public j(e30 e30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i3) {
        this.f16329a = i3;
        this.f16335r = e30Var;
        this.f16330b = inputFile;
        this.f16331c = inputFile2;
        this.d = videoSize;
        this.f16333f = d;
        this.f16332e = str;
        this.h = photoSize;
        this.f16334n = photoSize2;
    }
}
