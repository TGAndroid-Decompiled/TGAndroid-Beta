package nh;

import ih.d4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.o00;
import org.telegram.ui.o50;
import org.telegram.ui.r60;
import org.telegram.ui.v40;
import org.telegram.ui.w40;
import org.telegram.ui.z71;
import org.telegram.ui.zn;
public final class k implements Runnable {
    public final int f18659a;
    public final TLRPC.InputFile f18660b;
    public final TLRPC.InputFile f18661c;
    public final TLRPC.VideoSize d;
    public final String f18662e;
    public final double f18663f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f18664n;
    public final d40 f18665r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f18659a = 0;
        this.f18665r = oVar;
        this.h = photoSize;
        this.f18660b = inputFile;
        this.f18661c = inputFile2;
        this.d = videoSize;
        this.f18663f = d;
        this.f18662e = str;
        this.f18664n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f18659a) {
            case 0:
                o oVar = (o) this.f18665r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.B = fileLocation;
                TLRPC.InputFile inputFile = this.f18660b;
                TLRPC.InputFile inputFile2 = this.f18661c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.f18692y, oVar.D);
                    oVar.Z(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f18683b, null, inputFile, inputFile2, videoSize, this.f18663f, this.f18662e, photoSize.location, this.f18664n.location, null);
                    oVar.Z(false, true);
                }
                oVar.d.U2.N(z10);
                return;
            case 1:
                id idVar = (id) this.f18665r;
                TLRPC.InputFile inputFile3 = this.f18660b;
                TLRPC.InputFile inputFile4 = this.f18661c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    idVar.f39128x = fileLocation2;
                    idVar.f39129y = this.f18664n.location;
                    idVar.f39108e.h(ImageLocation.getForLocal(fileLocation2), "50_50", idVar.f39125s, null);
                    idVar.d0(true, false);
                    return;
                }
                idVar.f39113h0 = inputFile3;
                idVar.f39114i0 = inputFile4;
                idVar.f39115j0 = this.d;
                idVar.f39116k0 = this.f18662e;
                idVar.f39117l0 = this.f18663f;
                if (idVar.m0) {
                    c2 c2Var = idVar.f39122q0;
                    if (c2Var != null) {
                        try {
                            c2Var.dismiss();
                            idVar.f39122q0 = null;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    idVar.f0(false);
                    idVar.f39119n0 = false;
                    idVar.f39101a.performClick();
                }
                idVar.d0(false, true);
                idVar.h.setImageDrawable(null);
                return;
            case 2:
                ho hoVar = (ho) this.f18665r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                hoVar.f38858r0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f18660b;
                TLRPC.InputFile inputFile6 = this.f18661c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    d4 d4Var = hoVar.f38842e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    z8 z8Var = hoVar.f38857r;
                    Object obj = hoVar.f38870z0;
                    if (obj == null) {
                        obj = hoVar.f38861t0;
                    }
                    d4Var.h(forLocal, "50_50", z8Var, obj);
                    hoVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (hoVar.N0 == null) {
                        hoVar.N0 = new mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    hoVar.X.f24875e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    hoVar.X.f24875e.setAnimation(hoVar.N0);
                    hoVar.m0(true, false);
                    return;
                }
                long j10 = hoVar.f38869y0;
                TLRPC.PhotoSize photoSize3 = this.f18664n;
                double d = this.f18663f;
                long j11 = 0;
                if (j10 != 0) {
                    TLRPC.User user = hoVar.f38870z0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = hoVar.f38870z0.photo;
                        if (inputFile5 != null) {
                            j11 = inputFile5.f22394id;
                        } else if (inputFile6 != null) {
                            j11 = inputFile6.f22394id;
                        }
                        userProfilePhoto.photo_id = j11;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        hoVar.getMessagesController().putUser(hoVar.f38870z0, true);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile5;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile6;
                        int i9 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i9 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = hoVar.getMessagesController().getInputUser(hoVar.f38870z0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    hoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new zn(hoVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = hoVar.getMessagesController();
                    long j12 = hoVar.f38860s0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j12, null, inputFile5, inputFile6, videoSize2, d, this.f18662e, fileLocation4, fileLocation5, null);
                }
                if (hoVar.I0) {
                    try {
                        c2 c2Var2 = hoVar.f38837b;
                        if (c2Var2 != null && c2Var2.isShowing()) {
                            hoVar.f38837b.dismiss();
                            hoVar.f38837b = null;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    hoVar.J0 = z11;
                    hoVar.f38835a.performClick();
                }
                hoVar.m0(z11, true);
                return;
            case 3:
                w40 w40Var = (w40) this.f18665r;
                long j13 = w40Var.f43666e;
                o50 o50Var = w40Var.f43667f;
                AccountInstance accountInstance = o50Var.d;
                TLRPC.InputFile inputFile7 = this.f18660b;
                TLRPC.InputFile inputFile8 = this.f18661c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f18664n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    w40Var.f43665c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    w40Var.f43664b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    w40Var.d = forLocal2;
                    o50Var.f40883b.A(forLocal2, ImageLocation.getForLocal(w40Var.f43665c));
                    AndroidUtilities.updateVisibleRows(o50Var.M);
                    return;
                }
                double d9 = this.f18663f;
                String str = this.f18662e;
                if (j13 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile7 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile7;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile8 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile8;
                        int i10 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d9;
                        tL_photos_uploadProfilePhoto2.flags = i10 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new v40(0, w40Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile7, inputFile8, videoSize3, d9, str, photoSize4.location, photoSize5.location, new o00(w40Var, 6));
                return;
            case 4:
                r60 r60Var = (r60) this.f18665r;
                TLRPC.InputFile inputFile9 = this.f18660b;
                TLRPC.InputFile inputFile10 = this.f18661c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    r60Var.f42287y = fileLocation7;
                    r60Var.A = this.f18664n.location;
                    r60Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", r60Var.f42283r, null);
                    r60Var.Y(true, false);
                    return;
                }
                r60Var.B = inputFile9;
                r60Var.C = inputFile10;
                r60Var.D = videoSize4;
                r60Var.E = this.f18662e;
                r60Var.F = this.f18663f;
                if (r60Var.H) {
                    r60Var.getMessagesController().createChat(r60Var.f42279c.getText().toString(), r60Var.G, null, r60Var.L, r60Var.O, r60Var.Q, r60Var.P, r60Var.S, r60Var);
                }
                r60Var.Y(false, true);
                r60Var.f42281f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.c0((ProfileActivity) this.f18665r, this.f18660b, this.f18661c, this.d, this.f18663f, this.f18662e, this.h, this.f18664n);
                return;
            default:
                z71.c0((z71) this.f18665r, this.f18660b, this.f18661c, this.d, this.f18663f, this.f18662e, this.h, this.f18664n);
                return;
        }
    }

    public k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i9) {
        this.f18659a = i9;
        this.f18665r = (d40) o2Var;
        this.f18660b = inputFile;
        this.f18661c = inputFile2;
        this.d = videoSize;
        this.f18662e = str;
        this.f18663f = d;
        this.h = photoSize;
        this.f18664n = photoSize2;
    }

    public k(ho hoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f18659a = 2;
        this.f18665r = hoVar;
        this.h = photoSize;
        this.f18660b = inputFile;
        this.f18661c = inputFile2;
        this.d = videoSize;
        this.f18664n = photoSize2;
        this.f18663f = d;
        this.f18662e = str;
    }

    public k(d40 d40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i9) {
        this.f18659a = i9;
        this.f18665r = d40Var;
        this.f18660b = inputFile;
        this.f18661c = inputFile2;
        this.d = videoSize;
        this.f18663f = d;
        this.f18662e = str;
        this.h = photoSize;
        this.f18664n = photoSize2;
    }
}
