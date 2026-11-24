package defpackage;

import android.graphics.RectF;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ph1 implements Runnable {
    public final byte a;
    public final TLRPC.PhotoSize b;
    public final TLRPC.InputFile c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize e;
    public final TLRPC.PhotoSize f;
    public final double h;
    public final String n;
    public final vl5 r;

    public ph1(d dVar, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, byte b) {
        this.a = b;
        this.r = (vl5) dVar;
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
        vl5 vl5Var = this.r;
        switch (b) {
            case 0:
                yh1 yh1Var = (yh1) vl5Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation = photoSize2.location;
                    yh1Var.E = fileLocation;
                    yh1Var.F = photoSize.location;
                    yh1Var.f.m(gl5.e(fileLocation), "50_50", yh1Var.w, null);
                    yh1Var.i0(true, false);
                    return;
                }
                yh1Var.n0 = inputFile2;
                yh1Var.o0 = inputFile;
                yh1Var.p0 = videoSize;
                yh1Var.q0 = str;
                yh1Var.r0 = d;
                if (yh1Var.s0) {
                    hd hdVar = yh1Var.w0;
                    if (hdVar != null) {
                        try {
                            hdVar.dismiss();
                            yh1Var.w0 = null;
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                    yh1Var.l0(false);
                    yh1Var.t0 = false;
                    yh1Var.a.performClick();
                }
                yh1Var.i0(false, true);
                yh1Var.n.setImageDrawable(null);
                return;
            case 1:
                p82 p82Var = (p82) vl5Var;
                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                p82Var.v0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    kb0 kb0Var = p82Var.e;
                    gl5 e2 = gl5.e(fileLocation2);
                    pb0 pb0Var = p82Var.r;
                    Object obj = p82Var.D0;
                    if (obj == null) {
                        obj = p82Var.x0;
                    }
                    kb0Var.m(e2, "50_50", pb0Var, obj);
                    p82Var.c0.o(2131232052, k96.M0(2131752201, "ChatSetNewPhoto"), true);
                    if (p82Var.S0 == null) {
                        p82Var.S0 = new oy8(2131623965, gl.L(50.0f), gl.L(50.0f), false, null);
                    }
                    p82Var.c0.e.setTranslationX(-gl.L(8.0f));
                    p82Var.c0.e.setAnimation(p82Var.S0);
                    p82Var.r0(true, false);
                    return;
                }
                int i = (p82Var.C0 > 0L ? 1 : (p82Var.C0 == 0L ? 0 : -1));
                double d2 = this.h;
                if (i != 0) {
                    TLRPC.User user = p82Var.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = p82Var.D0.photo;
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
                        p82Var.getMessagesController().Z3(p82Var.D0, true, false);
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
                    tL_photos_uploadProfilePhoto.bot = p82Var.getMessagesController().o1(p82Var.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    p82Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new i82(p82Var, (byte) 1));
                } else {
                    p82Var.getMessagesController().x(p82Var.w0, null, inputFile3, inputFile4, videoSize2, d2, this.n, photoSize2.location, photoSize.location, null);
                }
                if (p82Var.N0) {
                    try {
                        hd hdVar2 = p82Var.b;
                        if (hdVar2 != null && hdVar2.isShowing()) {
                            p82Var.b.dismiss();
                            p82Var.b = null;
                        }
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                    p82Var.O0 = false;
                    p82Var.a.performClick();
                }
                p82Var.r0(false, true);
                return;
            case 2:
                en2 en2Var = (en2) vl5Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                en2Var.H = fileLocation3;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    en2Var.x.m(gl5.e(fileLocation3), "50_50", en2Var.F, en2Var.J);
                    en2Var.e0(true, false);
                } else {
                    en2Var.getMessagesController().x(en2Var.c, null, inputFile5, inputFile6, videoSize3, this.h, this.n, photoSize2.location, photoSize.location, null);
                    en2Var.e0(false, true);
                }
                en2Var.e.g3.O(true);
                return;
            case 3:
                t65 t65Var = (t65) vl5Var;
                long j2 = t65Var.e;
                h75 h75Var = t65Var.f;
                j5 j5Var = h75Var.n1;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    t65Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    t65Var.b = fileLocation4;
                    gl5 e4 = gl5.e(fileLocation4);
                    t65Var.d = e4;
                    h75Var.l1.A(e4, gl5.e(t65Var.c));
                    gl.W3(h75Var.J1);
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
                    ConnectionsManager.getInstance(j5Var.a).sendRequest(tL_photos_uploadProfilePhoto2, new rv3(t65Var, str2, (byte) 9));
                    return;
                }
                na7.q1(j5Var.a).x(-j2, null, inputFile7, inputFile8, videoSize4, d3, str2, photoSize2.location, photoSize.location, new iu4(t65Var, (byte) 12));
                return;
            case 4:
                wa5 wa5Var = (wa5) vl5Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    wa5Var.E = fileLocation5;
                    wa5Var.F = photoSize.location;
                    wa5Var.d.m(gl5.e(fileLocation5), "50_50", wa5Var.r, null);
                    wa5Var.d0(true, false);
                    return;
                }
                wa5Var.G = inputFile2;
                wa5Var.H = inputFile;
                wa5Var.I = videoSize;
                wa5Var.J = str;
                wa5Var.K = d;
                if (wa5Var.M) {
                    wa5Var.getMessagesController().Q(wa5Var.c.getText().toString(), wa5Var.L, null, wa5Var.Q, wa5Var.T, wa5Var.V, wa5Var.U, wa5Var.X, wa5Var);
                }
                wa5Var.d0(false, true);
                wa5Var.f.setImageDrawable(null);
                return;
            case 5:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) vl5Var).B2(this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                return;
            default:
                ((d8a) vl5Var).e0(this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                return;
        }
    }

    public ph1(en2 en2Var, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = (byte) 2;
        this.r = en2Var;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.f = photoSize2;
    }

    public ph1(vl5 vl5Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, byte b) {
        this.a = b;
        this.r = vl5Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public ph1(p82 p82Var, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = (byte) 1;
        this.r = p82Var;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }
}
