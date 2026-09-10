package ei;

import gg.i1;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.th;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i10;
import org.telegram.ui.j60;
import org.telegram.ui.k70;
import org.telegram.ui.k91;
import org.telegram.ui.nd;
import org.telegram.ui.oo;
import org.telegram.ui.q50;
import org.telegram.ui.yo;
public final class k implements Runnable {
    public final int f7563a;
    public final TLRPC.InputFile f7564b;
    public final TLRPC.InputFile f7565c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f7566f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f7567n;
    public final d50 f7568r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f7563a = 0;
        this.f7568r = pVar;
        this.h = photoSize;
        this.f7564b = inputFile;
        this.f7565c = inputFile2;
        this.d = videoSize;
        this.f7566f = d;
        this.e = str;
        this.f7567n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f7563a) {
            case 0:
                p pVar = (p) this.f7568r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f7564b;
                TLRPC.InputFile inputFile2 = this.f7565c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f7605y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f7597b, null, inputFile, inputFile2, videoSize, this.f7566f, this.e, photoSize.location, this.f7567n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.Y2.N(z10);
                return;
            case 1:
                nd ndVar = (nd) this.f7568r;
                TLRPC.InputFile inputFile3 = this.f7564b;
                TLRPC.InputFile inputFile4 = this.f7565c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.f35248x = fileLocation2;
                    ndVar.f35249y = this.f7567n.location;
                    ndVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.f35241s, null);
                    ndVar.e0(true, false);
                    return;
                }
                ndVar.f35233l0 = inputFile3;
                ndVar.m0 = inputFile4;
                ndVar.f35235n0 = this.d;
                ndVar.f35236o0 = this.e;
                ndVar.f35237p0 = this.f7566f;
                if (ndVar.f35238q0) {
                    d2 d2Var = ndVar.f35244u0;
                    if (d2Var != null) {
                        try {
                            d2Var.dismiss();
                            ndVar.f35244u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ndVar.g0(false);
                    ndVar.f35240r0 = false;
                    ndVar.f35218a.performClick();
                }
                ndVar.e0(false, true);
                ndVar.h.setImageDrawable(null);
                return;
            case 2:
                yo yoVar = (yo) this.f7568r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                yoVar.f39066v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f7564b;
                TLRPC.InputFile inputFile6 = this.f7565c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    i1 i1Var = yoVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    g9 g9Var = yoVar.f39060r;
                    Object obj = yoVar.D0;
                    if (obj == null) {
                        obj = yoVar.f39070x0;
                    }
                    i1Var.h(forLocal, "50_50", g9Var, obj);
                    yoVar.f39042b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (yoVar.R0 == null) {
                        yoVar.R0 = new hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    yoVar.f39042b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    yoVar.f39042b0.e.setAnimation(yoVar.R0);
                    yoVar.n0(true, false);
                    return;
                }
                long j3 = yoVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f7567n;
                double d = this.f7566f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = yoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = yoVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f17209id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f17209id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        yoVar.getMessagesController().putUser(yoVar.D0, true);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile5;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile6;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = yoVar.getMessagesController().getInputUser(yoVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    yoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new oo(yoVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = yoVar.getMessagesController();
                    long j11 = yoVar.f39068w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                }
                if (yoVar.M0) {
                    try {
                        d2 d2Var2 = yoVar.f39041b;
                        if (d2Var2 != null && d2Var2.isShowing()) {
                            yoVar.f39041b.dismiss();
                            yoVar.f39041b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    yoVar.N0 = z11;
                    yoVar.f39039a.performClick();
                }
                yoVar.n0(z11, true);
                return;
            case 3:
                q50 q50Var = (q50) this.f7568r;
                long j12 = q50Var.e;
                j60 j60Var = q50Var.f35974f;
                AccountInstance accountInstance = j60Var.d;
                TLRPC.InputFile inputFile7 = this.f7564b;
                TLRPC.InputFile inputFile8 = this.f7565c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f7567n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    q50Var.f35973c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    q50Var.f35972b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    q50Var.d = forLocal2;
                    j60Var.f33938b.A(forLocal2, ImageLocation.getForLocal(q50Var.f35973c));
                    AndroidUtilities.updateVisibleRows(j60Var.Q);
                    return;
                }
                double d10 = this.f7566f;
                String str = this.e;
                if (j12 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile7 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile7;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile8 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile8;
                        int i11 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new th(18, q50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new i10(q50Var, 6));
                return;
            case 4:
                k70 k70Var = (k70) this.f7568r;
                TLRPC.InputFile inputFile9 = this.f7564b;
                TLRPC.InputFile inputFile10 = this.f7565c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    k70Var.f34256y = fileLocation7;
                    k70Var.E = this.f7567n.location;
                    k70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", k70Var.f34252r, null);
                    k70Var.Z(true, false);
                    return;
                }
                k70Var.F = inputFile9;
                k70Var.G = inputFile10;
                k70Var.H = videoSize4;
                k70Var.I = this.e;
                k70Var.J = this.f7566f;
                if (k70Var.L) {
                    k70Var.getMessagesController().createChat(k70Var.f34249c.getText().toString(), k70Var.K, null, k70Var.P, k70Var.S, k70Var.U, k70Var.T, k70Var.W, k70Var);
                }
                k70Var.Z(false, true);
                k70Var.f34250f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f7568r, this.f7564b, this.f7565c, this.d, this.f7566f, this.e, this.h, this.f7567n);
                return;
            default:
                k91.e0((k91) this.f7568r, this.f7564b, this.f7565c, this.d, this.f7566f, this.e, this.h, this.f7567n);
                return;
        }
    }

    public k(p2 p2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f7563a = i10;
        this.f7568r = (d50) p2Var;
        this.f7564b = inputFile;
        this.f7565c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f7566f = d;
        this.h = photoSize;
        this.f7567n = photoSize2;
    }

    public k(yo yoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f7563a = 2;
        this.f7568r = yoVar;
        this.h = photoSize;
        this.f7564b = inputFile;
        this.f7565c = inputFile2;
        this.d = videoSize;
        this.f7567n = photoSize2;
        this.f7566f = d;
        this.e = str;
    }

    public k(d50 d50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f7563a = i10;
        this.f7568r = d50Var;
        this.f7564b = inputFile;
        this.f7565c = inputFile2;
        this.d = videoSize;
        this.f7566f = d;
        this.e = str;
        this.h = photoSize;
        this.f7567n = photoSize2;
    }
}
