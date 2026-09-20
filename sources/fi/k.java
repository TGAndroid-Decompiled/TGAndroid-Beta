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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g10;
import org.telegram.ui.i60;
import org.telegram.ui.i91;
import org.telegram.ui.ko;
import org.telegram.ui.l70;
import org.telegram.ui.md;
import org.telegram.ui.oo;
import org.telegram.ui.p50;
import org.telegram.ui.uo;
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
                md mdVar = (md) this.f9124r;
                TLRPC.InputFile inputFile3 = this.f9120b;
                TLRPC.InputFile inputFile4 = this.f9121c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.f35687x = fileLocation2;
                    mdVar.f35688y = this.f9123n.location;
                    mdVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.f35680s, null);
                    mdVar.e0(true, false);
                    return;
                }
                mdVar.f35672l0 = inputFile3;
                mdVar.m0 = inputFile4;
                mdVar.f35674n0 = this.d;
                mdVar.f35675o0 = this.e;
                mdVar.f35676p0 = this.f9122f;
                if (mdVar.f35677q0) {
                    b2 b2Var = mdVar.f35683u0;
                    if (b2Var != null) {
                        try {
                            b2Var.dismiss();
                            mdVar.f35683u0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    mdVar.g0(false);
                    mdVar.f35679r0 = false;
                    mdVar.f35657a.performClick();
                }
                mdVar.e0(false, true);
                mdVar.h.setImageDrawable(null);
                return;
            case 2:
                uo uoVar = (uo) this.f9124r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                uoVar.f38170v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f9120b;
                TLRPC.InputFile inputFile6 = this.f9121c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    z5 z5Var = uoVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    g9 g9Var = uoVar.f38164r;
                    Object obj = uoVar.D0;
                    if (obj == null) {
                        obj = uoVar.f38174x0;
                    }
                    z5Var.h(forLocal, "50_50", g9Var, obj);
                    uoVar.f38146b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (uoVar.R0 == null) {
                        uoVar.R0 = new hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    uoVar.f38146b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    uoVar.f38146b0.e.setAnimation(uoVar.R0);
                    uoVar.n0(true, false);
                    return;
                }
                long j3 = uoVar.C0;
                TLRPC.PhotoSize photoSize3 = this.f9123n;
                double d = this.f9122f;
                long j10 = 0;
                if (j3 != 0) {
                    TLRPC.User user = uoVar.D0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = uoVar.D0.photo;
                        if (inputFile5 != null) {
                            j10 = inputFile5.f18342id;
                        } else if (inputFile6 != null) {
                            j10 = inputFile6.f18342id;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize3.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        uoVar.getMessagesController().putUser(uoVar.D0, true);
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
                    tL_photos_uploadProfilePhoto.bot = uoVar.getMessagesController().getInputUser(uoVar.D0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    uoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ko(uoVar, 1));
                    z11 = false;
                } else {
                    MessagesController messagesController = uoVar.getMessagesController();
                    long j11 = uoVar.f38172w0;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    TLRPC.FileLocation fileLocation5 = photoSize3.location;
                    z11 = false;
                    messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                }
                if (uoVar.M0) {
                    try {
                        b2 b2Var2 = uoVar.f38145b;
                        if (b2Var2 != null && b2Var2.isShowing()) {
                            uoVar.f38145b.dismiss();
                            uoVar.f38145b = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    uoVar.N0 = z11;
                    uoVar.f38143a.performClick();
                }
                uoVar.n0(z11, true);
                return;
            case 3:
                p50 p50Var = (p50) this.f9124r;
                long j12 = p50Var.e;
                i60 i60Var = p50Var.f36472f;
                AccountInstance accountInstance = i60Var.d;
                TLRPC.InputFile inputFile7 = this.f9120b;
                TLRPC.InputFile inputFile8 = this.f9121c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f9123n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    p50Var.f36471c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    p50Var.f36470b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    p50Var.d = forLocal2;
                    i60Var.f34362b.A(forLocal2, ImageLocation.getForLocal(p50Var.f36471c));
                    AndroidUtilities.updateVisibleRows(i60Var.Q);
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new oo(23, p50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new g10(p50Var, 6));
                return;
            case 4:
                l70 l70Var = (l70) this.f9124r;
                TLRPC.InputFile inputFile9 = this.f9120b;
                TLRPC.InputFile inputFile10 = this.f9121c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    l70Var.f35343y = fileLocation7;
                    l70Var.E = this.f9123n.location;
                    l70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", l70Var.f35339r, null);
                    l70Var.Z(true, false);
                    return;
                }
                l70Var.F = inputFile9;
                l70Var.G = inputFile10;
                l70Var.H = videoSize4;
                l70Var.I = this.e;
                l70Var.J = this.f9122f;
                if (l70Var.L) {
                    l70Var.getMessagesController().createChat(l70Var.f35336c.getText().toString(), l70Var.K, null, l70Var.P, l70Var.S, l70Var.U, l70Var.T, l70Var.W, l70Var);
                }
                l70Var.Z(false, true);
                l70Var.f35337f.setImageDrawable(null);
                return;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f9124r, this.f9120b, this.f9121c, this.d, this.f9122f, this.e, this.h, this.f9123n);
                return;
            default:
                i91.e0((i91) this.f9124r, this.f9120b, this.f9121c, this.d, this.f9122f, this.e, this.h, this.f9123n);
                return;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f9119a = i10;
        this.f9124r = (t40) n2Var;
        this.f9120b = inputFile;
        this.f9121c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f9122f = d;
        this.h = photoSize;
        this.f9123n = photoSize2;
    }

    public k(uo uoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f9119a = 2;
        this.f9124r = uoVar;
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
