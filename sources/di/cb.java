package di;

import android.graphics.Bitmap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.ProfileActivity;
public final class cb implements Utilities.Callback2 {
    public final int f6998a;
    public final boolean f6999b;
    public final NotificationCenter.NotificationCenterDelegate f7000c;

    public cb(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6998a = i10;
        this.f7000c = notificationCenterDelegate;
        this.f6999b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        iv0 iv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f6998a) {
            case 0:
                pc pcVar = (pc) this.f7000c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = pcVar.f7848c;
                if (obj != null && pcVar.f7891p2 == null && !pcVar.W && pcVar.J()) {
                    int i11 = 0;
                    if (this.f6999b) {
                        if (pcVar.K1 != null) {
                            pcVar.u();
                            pcVar.K1.f7761j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                rb rbVar = pcVar.f7910v1;
                                rbVar.d0(rbVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                rb rbVar2 = pcVar.f7910v1;
                                TLObject tLObject = (TLObject) obj;
                                rbVar2.f7974l2 = true;
                                k6 k6Var = rbVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f19894w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(rbVar2.R1, k6Var.getMeasuredWidth()) * 0.5d);
                                    iv0Var = new iv0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(rbVar2.S1, k6Var.getMeasuredHeight()) * 0.5d);
                                    iv0Var = new iv0(f7 * floor2, floor2);
                                }
                                rg.z1 z1Var = new rg.z1(rbVar2.getContext(), rbVar2.e0(), iv0Var, tLObject);
                                z1Var.setDelegate(rbVar2);
                                k6Var.addView(z1Var);
                                rbVar2.g0();
                                rbVar2.d0(z1Var);
                            }
                            pcVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        pcVar.i0(false, true);
                        pcVar.Q0.a(pcVar.O1);
                        l7 l7Var = pcVar.O0;
                        if (pcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l7Var.f7552n0 = -1.0f;
                        l7Var.f7553o0 = z10;
                        l7Var.invalidate();
                        pcVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            pcVar.O1 = i11;
                            o8 l4 = o8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = pcVar.f7909v0;
                            l4.K0 = pcVar.f7913w0;
                            l4.A();
                            pcVar.L1 = true;
                            if (pcVar.A0.j()) {
                                pcVar.G1 = null;
                                l4.P = 1.0f;
                                if (pcVar.A0.l(l4)) {
                                    pcVar.K1 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
                                }
                                pcVar.m0(true);
                            } else {
                                l4.B();
                                pcVar.K1 = l4;
                                if (z11) {
                                    ja.a(i10, l4);
                                }
                                pcVar.K(1, true);
                            }
                        } else if (obj instanceof o8) {
                            o8 o8Var = (o8) obj;
                            if (o8Var.L == null && !o8Var.v()) {
                                pcVar.f7857e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f3824w.b(o8Var);
                                return;
                            }
                            o8Var.J0 = pcVar.f7909v0;
                            o8Var.K0 = pcVar.f7913w0;
                            pcVar.O1 = o8Var.K ? 1 : 0;
                            o8Var.M0 = bitmap;
                            pcVar.L1 = false;
                            pcVar.A0.n(o8Var);
                            pcVar.K1 = o8Var;
                            if (z11) {
                                ja.a(i10, o8Var);
                            }
                            pcVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    ob obVar = pcVar.M0;
                    if (obVar != null) {
                        pcVar.f7879l2 = obVar.f8369e.e0();
                        pcVar.f7881m2 = pcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                gi.k0.m((gi.k0) this.f7000c, this.f6999b, (TLRPC.TL_error) obj2);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f7000c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.yc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f6999b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.yc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.yc.l(DialogObject.getShortName(profileActivity.f33888e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.yc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.X1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
