package fi;

import ai.y5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.g10;
import org.telegram.ui.h60;
import org.telegram.ui.jo;
import org.telegram.ui.k70;
import org.telegram.ui.nd;
import org.telegram.ui.no;
import org.telegram.ui.p50;
import org.telegram.ui.to;
public final class k implements Runnable {
    public final int f9907a;
    public final TLRPC.InputFile f9908b;
    public final TLRPC.InputFile f9909c;
    public final TLRPC.VideoSize d;
    public final String f9910e;
    public final double f9911f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9912n;
    public final x40 f9913r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9907a = 0;
        this.f9913r = pVar;
        this.h = photoSize;
        this.f9908b = inputFile;
        this.f9909c = inputFile2;
        this.d = videoSize;
        this.f9911f = d;
        this.f9910e = str;
        this.f9912n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9907a) {
            case 0:
                p pVar = (p) this.f9913r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9908b;
                TLRPC.InputFile inputFile2 = this.f9909c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f9955y, pVar.H);
                    pVar.Z(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f9946b, null, inputFile, inputFile2, videoSize, this.f9911f, this.f9910e, photoSize.location, this.f9912n.location, null);
                    pVar.Z(false, true);
                }
                pVar.d.f25244f3.N(z10);
                return;
            case 1:
                nd ndVar = (nd) this.f9913r;
                TLRPC.InputFile inputFile3 = this.f9908b;
                TLRPC.InputFile inputFile4 = this.f9909c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.f38934x = fileLocation2;
                    ndVar.f38935y = this.f9912n.location;
                    ndVar.f38910e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.f38927s, null);
                    ndVar.e0(true, false);
                    return;
                }
                ndVar.f38919l0 = inputFile3;
                ndVar.m0 = inputFile4;
                ndVar.f38921n0 = this.d;
                ndVar.f38922o0 = this.f9910e;
                ndVar.f38923p0 = this.f9911f;
                if (ndVar.f38924q0) {
                    b2 b2Var = ndVar.f38930u0;
                    if (b2Var != null) {
                        try {
                            b2Var.dismiss();
                            ndVar.f38930u0 = null;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    ndVar.g0(false);
                    ndVar.f38926r0 = false;
                    ndVar.f38903a.performClick();
                }
                ndVar.e0(false, true);
                ndVar.h.setImageDrawable(null);
                return;
            case 2:
                to toVar = (to) this.f9913r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                toVar.f40909v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9908b;
                TLRPC.InputFile inputFile6 = this.f9909c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    y5 y5Var = toVar.f40888e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = toVar.f40903r;
                    Object obj = toVar.D0;
                    if (obj == null) {
                        obj = toVar.f40913x0;
                    }
                    y5Var.h(forLocal, "50_50", h9Var, obj);
                    toVar.f40884b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (toVar.R0 == null) {
                        toVar.R0 = new kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    toVar.f40884b0.f22722e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    toVar.f40884b0.f22722e.setAnimation(toVar.R0);
                    toVar.n0(true, false);
                    return;
                }
                long j3 = toVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f9912n;
                double d = this.f9911f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = toVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = toVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f20051id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f20051id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        toVar.getMessagesController().putUser(toVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = toVar.getMessagesController().getInputUser(toVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    toVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jo(toVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = toVar.getMessagesController();
                    long j11 = toVar.f40911w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.f9910e, fileLocation4, fileLocation5, null);
                }
                if (toVar.M0) {
                    try {
                        b2 b2Var2 = toVar.f40883b;
                        if (b2Var2 != null && b2Var2.isShowing()) {
                            toVar.f40883b.dismiss();
                            toVar.f40883b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    toVar.N0 = z11;
                    toVar.f40881a.performClick();
                }
                toVar.n0(z11, true);
                return;
            case 3:
                p50 p50Var = (p50) this.f9913r;
                long j12 = p50Var.f39344e;
                h60 h60Var = p50Var.f39345f;
                AccountInstance accountInstance = h60Var.d;
                TLRPC.InputFile inputFile7 = this.f9908b;
                TLRPC.InputFile inputFile8 = this.f9909c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9912n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    p50Var.f39343c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    p50Var.f39342b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    p50Var.d = forLocal2;
                    h60Var.f36875b.A(forLocal2, ImageLocation.getForLocal(p50Var.f39343c));
                    AndroidUtilities.updateVisibleRows(h60Var.Q);
                    return;
                }
                double d10 = this.f9911f;
                String str = this.f9910e;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new no(23, p50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new g10(p50Var, 6));
                return;
            case 4:
                k70 k70Var = (k70) this.f9913r;
                TLRPC.InputFile inputFile9 = this.f9908b;
                TLRPC.InputFile inputFile10 = this.f9909c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    k70Var.f37849y = fileLocation7;
                    k70Var.E = this.f9912n.location;
                    k70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", k70Var.f37845r, null);
                    k70Var.Y(true, false);
                    return;
                }
                k70Var.F = inputFile9;
                k70Var.G = inputFile10;
                k70Var.H = videoSize4;
                k70Var.I = this.f9910e;
                k70Var.J = this.f9911f;
                if (k70Var.L) {
                    k70Var.getMessagesController().createChat(k70Var.f37841c.getText().toString(), k70Var.K, null, k70Var.P, k70Var.S, k70Var.U, k70Var.T, k70Var.W, k70Var);
                }
                k70Var.Y(false, true);
                k70Var.f37843f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9913r, this.f9908b, this.f9909c, this.d, this.f9911f, this.f9910e, this.h, this.f9912n);
                return;
            default:
                a91.X((a91) this.f9913r, this.f9908b, this.f9909c, this.d, this.f9911f, this.f9910e, this.h, this.f9912n);
                return;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9907a = i10;
        this.f9913r = (x40) n2Var;
        this.f9908b = inputFile;
        this.f9909c = inputFile2;
        this.d = videoSize;
        this.f9910e = str;
        this.f9911f = d;
        this.h = photoSize;
        this.f9912n = photoSize2;
    }

    public k(to toVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9907a = 2;
        this.f9913r = toVar;
        this.h = photoSize;
        this.f9908b = inputFile;
        this.f9909c = inputFile2;
        this.d = videoSize;
        this.f9912n = photoSize2;
        this.f9911f = d;
        this.f9910e = str;
    }

    public k(x40 x40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9907a = i10;
        this.f9913r = x40Var;
        this.f9908b = inputFile;
        this.f9909c = inputFile2;
        this.d = videoSize;
        this.f9911f = d;
        this.f9910e = str;
        this.h = photoSize;
        this.f9912n = photoSize2;
    }
}
