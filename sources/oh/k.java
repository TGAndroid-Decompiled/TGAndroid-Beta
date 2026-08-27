package oh;

import jh.z3;
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
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ao;
import org.telegram.ui.gg;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.r00;
import org.telegram.ui.s50;
import org.telegram.ui.u60;
import org.telegram.ui.x71;
import org.telegram.ui.z40;

public final class k implements Runnable {

    public final int f19508a;

    public final TLRPC.InputFile f19509b;

    public final TLRPC.InputFile f19510c;
    public final TLRPC.VideoSize d;

    public final String f19511e;

    public final double f19512f;
    public final TLRPC.PhotoSize h;

    public final TLRPC.PhotoSize f19513n;

    public final i40 f19514r;

    public k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f19508a = 0;
        this.f19514r = oVar;
        this.h = photoSize;
        this.f19509b = inputFile;
        this.f19510c = inputFile2;
        this.d = videoSize;
        this.f19512f = d;
        this.f19511e = str;
        this.f19513n = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f19508a) {
            case 0:
                o oVar = (o) this.f19514r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.B = fileLocation;
                TLRPC.InputFile inputFile = this.f19509b;
                TLRPC.InputFile inputFile2 = this.f19510c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.f19541y, oVar.D);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.f19532b, null, inputFile, inputFile2, videoSize, this.f19512f, this.f19511e, photoSize.location, this.f19513n.location, null);
                    oVar.a0(false, true);
                }
                oVar.d.U2.N(z10);
                break;
            case 1:
                id idVar = (id) this.f19514r;
                TLRPC.InputFile inputFile3 = this.f19509b;
                TLRPC.InputFile inputFile4 = this.f19510c;
                if (inputFile3 == null && inputFile4 == null) {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    idVar.f39056x = fileLocation2;
                    idVar.f39057y = this.f19513n.location;
                    idVar.f39036e.h(ImageLocation.getForLocal(fileLocation2), "50_50", idVar.f39053s, null);
                    idVar.e0(true, false);
                } else {
                    idVar.f39041h0 = inputFile3;
                    idVar.f39042i0 = inputFile4;
                    idVar.f39043j0 = this.d;
                    idVar.f39044k0 = this.f19511e;
                    idVar.f39045l0 = this.f19512f;
                    if (idVar.m0) {
                        b2 b2Var = idVar.f39050q0;
                        if (b2Var != null) {
                            try {
                                b2Var.dismiss();
                                idVar.f39050q0 = null;
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                        idVar.g0(false);
                        idVar.f39047n0 = false;
                        idVar.f39029a.performClick();
                    }
                    idVar.e0(false, true);
                    idVar.h.setImageDrawable(null);
                }
                break;
            case 2:
                jo joVar = (jo) this.f19514r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                joVar.f39426r0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.f19509b;
                TLRPC.InputFile inputFile6 = this.f19510c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    z3 z3Var = joVar.f39410e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    y8 y8Var = joVar.f39425r;
                    Object obj = joVar.f39438z0;
                    if (obj == null) {
                        obj = joVar.f39429t0;
                    }
                    z3Var.h(forLocal, "50_50", y8Var, obj);
                    joVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (joVar.N0 == null) {
                        joVar.N0 = new oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    joVar.X.f24631e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    joVar.X.f24631e.setAnimation(joVar.N0);
                    joVar.n0(true, false);
                } else {
                    long j10 = joVar.f39437y0;
                    TLRPC.PhotoSize photoSize3 = this.f19513n;
                    double d = this.f19512f;
                    long j11 = 0;
                    if (j10 != 0) {
                        TLRPC.User user = joVar.f39438z0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = joVar.f39438z0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.f22394id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.f22394id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            joVar.getMessagesController().putUser(joVar.f39438z0, true);
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
                        tL_photos_uploadProfilePhoto.bot = joVar.getMessagesController().getInputUser(joVar.f39438z0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        joVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ao(joVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = joVar.getMessagesController();
                        long j12 = joVar.f39428s0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j12, null, inputFile5, inputFile6, videoSize2, d, this.f19511e, fileLocation4, fileLocation5, null);
                    }
                    if (joVar.I0) {
                        try {
                            b2 b2Var2 = joVar.f39405b;
                            if (b2Var2 != null && b2Var2.isShowing()) {
                                joVar.f39405b.dismiss();
                                joVar.f39405b = null;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        joVar.J0 = z11;
                        joVar.f39403a.performClick();
                    }
                    joVar.n0(z11, true);
                }
                break;
            case 3:
                z40 z40Var = (z40) this.f19514r;
                long j13 = z40Var.f45026e;
                s50 s50Var = z40Var.f45027f;
                AccountInstance accountInstance = s50Var.d;
                TLRPC.InputFile inputFile7 = this.f19509b;
                TLRPC.InputFile inputFile8 = this.f19510c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.f19513n;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    z40Var.f45025c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    z40Var.f45024b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    z40Var.d = forLocal2;
                    s50Var.f42412b.A(forLocal2, ImageLocation.getForLocal(z40Var.f45025c));
                    AndroidUtilities.updateVisibleRows(s50Var.M);
                } else {
                    double d10 = this.f19512f;
                    String str = this.f19511e;
                    if (j13 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new r00(z40Var, 6));
                    } else {
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new gg(27, z40Var, str));
                    }
                }
                break;
            case 4:
                u60 u60Var = (u60) this.f19514r;
                TLRPC.InputFile inputFile9 = this.f19509b;
                TLRPC.InputFile inputFile10 = this.f19510c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    u60Var.f43143y = fileLocation7;
                    u60Var.A = this.f19513n.location;
                    u60Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", u60Var.f43139r, null);
                    u60Var.Z(true, false);
                } else {
                    u60Var.B = inputFile9;
                    u60Var.C = inputFile10;
                    u60Var.D = videoSize4;
                    u60Var.E = this.f19511e;
                    u60Var.F = this.f19512f;
                    if (u60Var.H) {
                        u60Var.getMessagesController().createChat(u60Var.f43135c.getText().toString(), u60Var.G, null, u60Var.L, u60Var.O, u60Var.Q, u60Var.P, u60Var.S, u60Var);
                    }
                    u60Var.Z(false, true);
                    u60Var.f43137f.setImageDrawable(null);
                }
                break;
            case 5:
                ProfileActivity.d0((ProfileActivity) this.f19514r, this.f19509b, this.f19510c, this.d, this.f19512f, this.f19511e, this.h, this.f19513n);
                break;
            default:
                x71.d0((x71) this.f19514r, this.f19509b, this.f19510c, this.d, this.f19512f, this.f19511e, this.h, this.f19513n);
                break;
        }
    }

    public k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f19508a = i10;
        this.f19514r = (i40) n2Var;
        this.f19509b = inputFile;
        this.f19510c = inputFile2;
        this.d = videoSize;
        this.f19511e = str;
        this.f19512f = d;
        this.h = photoSize;
        this.f19513n = photoSize2;
    }

    public k(jo joVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f19508a = 2;
        this.f19514r = joVar;
        this.h = photoSize;
        this.f19509b = inputFile;
        this.f19510c = inputFile2;
        this.d = videoSize;
        this.f19513n = photoSize2;
        this.f19512f = d;
        this.f19511e = str;
    }

    public k(i40 i40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f19508a = i10;
        this.f19514r = i40Var;
        this.f19509b = inputFile;
        this.f19510c = inputFile2;
        this.d = videoSize;
        this.f19512f = d;
        this.f19511e = str;
        this.h = photoSize;
        this.f19513n = photoSize2;
    }
}
