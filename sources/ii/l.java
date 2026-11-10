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
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.f40;
import org.telegram.ui.g50;
import org.telegram.ui.kz;
import org.telegram.ui.ld;
import org.telegram.ui.ln;
import org.telegram.ui.o30;
import org.telegram.ui.o31;
import org.telegram.ui.rn;
public final class l implements Runnable {
    public final int f15553a;
    public final TLRPC.InputFile f15554b;
    public final TLRPC.InputFile f15555c;
    public final TLRPC.VideoSize d;
    public final String f15556e;
    public final double f15557f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f15558n;
    public final i30 f15559r;

    public l(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f15553a = 0;
        this.f15559r = pVar;
        this.h = photoSize;
        this.f15554b = inputFile;
        this.f15555c = inputFile2;
        this.d = videoSize;
        this.f15557f = d;
        this.f15556e = str;
        this.f15558n = photoSize2;
    }

    @Override
    public final void run() {
        long j3;
        int i7 = this.f15553a;
        double d = this.f15557f;
        String str = this.f15556e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.f15555c;
        TLRPC.InputFile inputFile2 = this.f15554b;
        TLRPC.PhotoSize photoSize = this.f15558n;
        TLRPC.PhotoSize photoSize2 = this.h;
        i30 i30Var = this.f15559r;
        switch (i7) {
            case 0:
                p pVar = (p) i30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                pVar.G = fileLocation;
                TLRPC.InputFile inputFile3 = this.f15554b;
                TLRPC.InputFile inputFile4 = this.f15555c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pVar.f15591x.j(hc.e(fileLocation), "50_50", pVar.E, pVar.I);
                    pVar.f0(true, false);
                } else {
                    pVar.getMessagesController().B(pVar.f15584c, null, inputFile3, inputFile4, videoSize2, this.f15557f, this.f15556e, photoSize2.location, photoSize.location, null);
                    pVar.f0(false, true);
                }
                pVar.f15585e.f37496f3.O(true);
                return;
            case 1:
                bd bdVar = (bd) i30Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    bdVar.D = fileLocation2;
                    bdVar.E = photoSize.location;
                    bdVar.f44017f.j(hc.e(fileLocation2), "50_50", bdVar.f44037w, null);
                    bdVar.k0(true, false);
                    return;
                }
                bdVar.m0 = inputFile2;
                bdVar.f44026n0 = inputFile;
                bdVar.f44027o0 = videoSize;
                bdVar.f44028p0 = str;
                bdVar.f44029q0 = d;
                if (bdVar.f44031r0) {
                    u1 u1Var = bdVar.f44036v0;
                    if (u1Var != null) {
                        try {
                            u1Var.dismiss();
                            bdVar.f44036v0 = null;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    bdVar.m0(false);
                    bdVar.f44033s0 = false;
                    bdVar.f44008a.performClick();
                }
                bdVar.k0(false, true);
                bdVar.f44025n.setImageDrawable(null);
                return;
            case 2:
                rn rnVar = (rn) i30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                rnVar.f49474u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f15554b;
                TLRPC.InputFile inputFile6 = this.f15555c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    d4 d4Var = rnVar.f49454e;
                    hc e11 = hc.e(fileLocation3);
                    v8 v8Var = rnVar.f49469r;
                    Object obj = rnVar.C0;
                    if (obj == null) {
                        obj = rnVar.f49477w0;
                    }
                    d4Var.j(e11, "50_50", v8Var, obj);
                    rnVar.f49450b0.o(2131232047, id.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (rnVar.R0 == null) {
                        rnVar.R0 = new zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    rnVar.f49450b0.f29585e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    rnVar.f49450b0.f29585e.setAnimation(rnVar.R0);
                    rnVar.s0(true, false);
                    return;
                }
                int i10 = (rnVar.B0 > 0L ? 1 : (rnVar.B0 == 0L ? 0 : -1));
                double d2 = this.f15557f;
                if (i10 != 0) {
                    TLRPC.User user = rnVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = rnVar.C0.photo;
                        if (inputFile5 != null) {
                            j3 = inputFile5.f26974id;
                        } else if (inputFile6 != null) {
                            j3 = inputFile6.f26974id;
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
                    rnVar.getMessagesController().B(rnVar.f49475v0, null, inputFile5, inputFile6, videoSize3, d2, this.f15556e, photoSize2.location, photoSize.location, null);
                }
                if (rnVar.M0) {
                    try {
                        u1 u1Var2 = rnVar.f49449b;
                        if (u1Var2 != null && u1Var2.isShowing()) {
                            rnVar.f49449b.dismiss();
                            rnVar.f49449b = null;
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    rnVar.N0 = false;
                    rnVar.f49447a.performClick();
                }
                rnVar.s0(false, true);
                return;
            case 3:
                o30 o30Var = (o30) i30Var;
                long j10 = o30Var.f48406e;
                f40 f40Var = o30Var.f48407f;
                org.telegram.messenger.c cVar = f40Var.n1;
                TLRPC.InputFile inputFile7 = this.f15554b;
                TLRPC.InputFile inputFile8 = this.f15555c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    o30Var.f48405c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    o30Var.f48404b = fileLocation4;
                    hc e13 = hc.e(fileLocation4);
                    o30Var.d = e13;
                    f40Var.l1.A(e13, hc.e(o30Var.f48405c));
                    org.telegram.messenger.g0.b4(f40Var.K1);
                    return;
                }
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                double d10 = this.f15557f;
                String str2 = this.f15556e;
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
                    ConnectionsManager.getInstance(cVar.f21770a).sendRequest(tL_photos_uploadProfilePhoto2, new ld(29, o30Var, str2));
                    return;
                }
                qp.s1(cVar.f21770a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new kz(o30Var, 7));
                return;
            case 4:
                g50 g50Var = (g50) i30Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    g50Var.D = fileLocation5;
                    g50Var.E = photoSize.location;
                    g50Var.d.j(hc.e(fileLocation5), "50_50", g50Var.f45984r, null);
                    g50Var.e0(true, false);
                    return;
                }
                g50Var.F = inputFile2;
                g50Var.G = inputFile;
                g50Var.H = videoSize;
                g50Var.I = str;
                g50Var.J = d;
                if (g50Var.L) {
                    g50Var.getMessagesController().U(g50Var.f45980c.getText().toString(), g50Var.K, null, g50Var.P, g50Var.S, g50Var.U, g50Var.T, g50Var.W, g50Var);
                }
                g50Var.e0(false, true);
                g50Var.f45982f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.r0((ProfileActivity) i30Var, this.f15554b, this.f15555c, this.d, this.f15557f, this.f15556e, this.h, this.f15558n);
                return;
            default:
                o31.e0((o31) i30Var, this.f15554b, this.f15555c, this.d, this.f15557f, this.f15556e, this.h, this.f15558n);
                return;
        }
    }

    public l(f2 f2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f15553a = i7;
        this.f15559r = (i30) f2Var;
        this.f15554b = inputFile;
        this.f15555c = inputFile2;
        this.d = videoSize;
        this.f15556e = str;
        this.f15557f = d;
        this.h = photoSize;
        this.f15558n = photoSize2;
    }

    public l(rn rnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f15553a = 2;
        this.f15559r = rnVar;
        this.h = photoSize;
        this.f15554b = inputFile;
        this.f15555c = inputFile2;
        this.d = videoSize;
        this.f15558n = photoSize2;
        this.f15557f = d;
        this.f15556e = str;
    }

    public l(i30 i30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.f15553a = i7;
        this.f15559r = i30Var;
        this.f15554b = inputFile;
        this.f15555c = inputFile2;
        this.d = videoSize;
        this.f15557f = d;
        this.f15556e = str;
        this.h = photoSize;
        this.f15558n = photoSize2;
    }
}
