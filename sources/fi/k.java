package fi;

import ai.z5;
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
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g91;
import org.telegram.ui.i10;
import org.telegram.ui.k60;
import org.telegram.ui.mo;
import org.telegram.ui.n70;
import org.telegram.ui.nd;
import org.telegram.ui.qo;
import org.telegram.ui.r50;
import org.telegram.ui.wo;
public final class k implements Runnable {
    public final int f9119a;
    public final TLRPC.InputFile f9120b;
    public final TLRPC.InputFile f9121c;
    public final TLRPC.VideoSize d;
    public final String e;
    public final double f9122f;
    public final TLRPC.PhotoSize h;
    public final TLRPC.PhotoSize f9123n;
    public final t40 f9124r;

    public k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f9119a = 0;
        this.f9124r = pVar;
        this.h = photoSize;
        this.f9120b = inputFile;
        this.f9121c = inputFile2;
        this.d = videoSize;
        this.f9122f = d;
        this.e = str;
        this.f9123n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9119a) {
            case 0:
                p pVar = (p) this.f9124r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.f9120b;
                TLRPC.InputFile inputFile2 = this.f9121c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.f9161y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.f9153b, null, inputFile, inputFile2, videoSize, this.f9122f, this.e, photoSize.location, this.f9123n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.Y2.N(z10);
                return;
            case 1:
                nd ndVar = (nd) this.f9124r;
                TLRPC.InputFile inputFile3 = this.f9120b;
                TLRPC.InputFile inputFile4 = this.f9121c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.f36072x = fileLocation2;
                    ndVar.f36073y = this.f9123n.location;
                    ndVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.f36065s, null);
                    ndVar.e0(true, false);
                    return;
                }
                ndVar.f36057l0 = inputFile3;
                ndVar.m0 = inputFile4;
                ndVar.f36059n0 = this.d;
                ndVar.f36060o0 = this.e;
                ndVar.f36061p0 = this.f9122f;
                if (ndVar.f36062q0) {
                    c2 c2Var = ndVar.f36068u0;
                    if (c2Var != null) {
                        try {
                            c2Var.dismiss();
                            ndVar.f36068u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ndVar.g0(false);
                    ndVar.f36064r0 = false;
                    ndVar.f36042a.performClick();
                }
                ndVar.e0(false, true);
                ndVar.h.setImageDrawable(null);
                return;
            case 2:
                wo woVar = (wo) this.f9124r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                woVar.f39114v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9120b;
                TLRPC.InputFile inputFile6 = this.f9121c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    z5 z5Var = woVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    f9 f9Var = woVar.f39108r;
                    Object obj = woVar.D0;
                    if (obj == null) {
                        obj = woVar.f39118x0;
                    }
                    z5Var.h(forLocal, "50_50", f9Var, obj);
                    woVar.f39090b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (woVar.R0 == null) {
                        woVar.R0 = new yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    woVar.f39090b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    woVar.f39090b0.e.setAnimation(woVar.R0);
                    woVar.n0(true, false);
                    return;
                }
                long j3 = woVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f9123n;
                double d = this.f9122f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = woVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = woVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f18135id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f18135id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        woVar.getMessagesController().putUser(woVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = woVar.getMessagesController().getInputUser(woVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    woVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new mo(woVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = woVar.getMessagesController();
                    long j11 = woVar.f39116w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                }
                if (woVar.M0) {
                    try {
                        c2 c2Var2 = woVar.f39089b;
                        if (c2Var2 != null && c2Var2.isShowing()) {
                            woVar.f39089b.dismiss();
                            woVar.f39089b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    woVar.N0 = z11;
                    woVar.f39087a.performClick();
                }
                woVar.n0(z11, true);
                return;
            case 3:
                r50 r50Var = (r50) this.f9124r;
                long j12 = r50Var.e;
                k60 k60Var = r50Var.f37089f;
                AccountInstance accountInstance = k60Var.d;
                TLRPC.InputFile inputFile7 = this.f9120b;
                TLRPC.InputFile inputFile8 = this.f9121c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9123n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    r50Var.f37088c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    r50Var.f37087b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    r50Var.d = forLocal2;
                    k60Var.f35019b.A(forLocal2, ImageLocation.getForLocal(r50Var.f37088c));
                    AndroidUtilities.updateVisibleRows(k60Var.Q);
                    return;
                }
                double d10 = this.f9122f;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new qo(23, r50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new i10(r50Var, 6));
                return;
            case 4:
                n70 n70Var = (n70) this.f9124r;
                TLRPC.InputFile inputFile9 = this.f9120b;
                TLRPC.InputFile inputFile10 = this.f9121c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    n70Var.f35970y = fileLocation7;
                    n70Var.E = this.f9123n.location;
                    n70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", n70Var.f35966r, null);
                    n70Var.Z(true, false);
                    return;
                }
                n70Var.F = inputFile9;
                n70Var.G = inputFile10;
                n70Var.H = videoSize4;
                n70Var.I = this.e;
                n70Var.J = this.f9122f;
                if (n70Var.L) {
                    n70Var.getMessagesController().createChat(n70Var.f35963c.getText().toString(), n70Var.K, null, n70Var.P, n70Var.S, n70Var.U, n70Var.T, n70Var.W, n70Var);
                }
                n70Var.Z(false, true);
                n70Var.f35964f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9124r, this.f9120b, this.f9121c, this.d, this.f9122f, this.e, this.h, this.f9123n);
                return;
            default:
                g91.e0((g91) this.f9124r, this.f9120b, this.f9121c, this.d, this.f9122f, this.e, this.h, this.f9123n);
                return;
        }
    }

    public k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9119a = i10;
        this.f9124r = (t40) o2Var;
        this.f9120b = inputFile;
        this.f9121c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f9122f = d;
        this.h = photoSize;
        this.f9123n = photoSize2;
    }

    public k(wo woVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9119a = 2;
        this.f9124r = woVar;
        this.h = photoSize;
        this.f9120b = inputFile;
        this.f9121c = inputFile2;
        this.d = videoSize;
        this.f9123n = photoSize2;
        this.f9122f = d;
        this.e = str;
    }

    public k(t40 t40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9119a = i10;
        this.f9124r = t40Var;
        this.f9120b = inputFile;
        this.f9121c = inputFile2;
        this.d = videoSize;
        this.f9122f = d;
        this.e = str;
        this.h = photoSize;
        this.f9123n = photoSize2;
    }
}
