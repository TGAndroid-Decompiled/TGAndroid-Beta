package ci;

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
import org.telegram.ui.Components.fw0;
import org.telegram.ui.ProfileActivity;
public final class ya implements Utilities.Callback2 {
    public final int f6349a;
    public final boolean f6350b;
    public final NotificationCenter.NotificationCenterDelegate f6351c;

    public ya(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6349a = i10;
        this.f6351c = notificationCenterDelegate;
        this.f6350b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        fw0 fw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f6349a) {
            case 0:
                kc kcVar = (kc) this.f6351c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = kcVar.f5380c;
                if (obj != null && kcVar.f5423p2 == null && !kcVar.W && kcVar.J()) {
                    int i11 = 0;
                    if (this.f6350b) {
                        if (kcVar.K1 != null) {
                            kcVar.u();
                            kcVar.K1.f5330j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                mb mbVar = kcVar.f5442v1;
                                mbVar.d0(mbVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                mb mbVar2 = kcVar.f5442v1;
                                TLObject tLObject = (TLObject) obj;
                                mbVar2.f5766l2 = true;
                                j6 j6Var = mbVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f20063w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(mbVar2.R1, j6Var.getMeasuredWidth()) * 0.5d);
                                    fw0Var = new fw0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(mbVar2.S1, j6Var.getMeasuredHeight()) * 0.5d);
                                    fw0Var = new fw0(f7 * floor2, floor2);
                                }
                                qg.x1 x1Var = new qg.x1(mbVar2.getContext(), mbVar2.e0(), fw0Var, tLObject);
                                x1Var.setDelegate(mbVar2);
                                j6Var.addView(x1Var);
                                mbVar2.g0();
                                mbVar2.d0(x1Var);
                            }
                            kcVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        kcVar.i0(false, true);
                        kcVar.Q0.a(kcVar.O1);
                        j7 j7Var = kcVar.O0;
                        if (kcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j7Var.f5233n0 = -1.0f;
                        j7Var.f5234o0 = z10;
                        j7Var.invalidate();
                        kcVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            kcVar.O1 = i11;
                            k8 l4 = k8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = kcVar.f5441v0;
                            l4.K0 = kcVar.f5445w0;
                            l4.A();
                            kcVar.L1 = true;
                            if (kcVar.A0.j()) {
                                kcVar.G1 = null;
                                l4.P = 1.0f;
                                if (kcVar.A0.l(l4)) {
                                    kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                                }
                                kcVar.m0(true);
                            } else {
                                l4.B();
                                kcVar.K1 = l4;
                                if (z11) {
                                    fa.a(i10, l4);
                                }
                                kcVar.K(1, true);
                            }
                        } else if (obj instanceof k8) {
                            k8 k8Var = (k8) obj;
                            if (k8Var.L == null && !k8Var.v()) {
                                kcVar.f5389e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f1309w.b(k8Var);
                                return;
                            }
                            k8Var.J0 = kcVar.f5441v0;
                            k8Var.K0 = kcVar.f5445w0;
                            kcVar.O1 = k8Var.K ? 1 : 0;
                            k8Var.M0 = bitmap;
                            kcVar.L1 = false;
                            kcVar.A0.n(k8Var);
                            kcVar.K1 = k8Var;
                            if (z11) {
                                fa.a(i10, k8Var);
                            }
                            kcVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    jb jbVar = kcVar.M0;
                    if (jbVar != null) {
                        kcVar.f5411l2 = jbVar.f6214e.e0();
                        kcVar.f5413m2 = kcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                fi.k0.m((fi.k0) this.f6351c, this.f6350b, (TLRPC.TL_error) obj2);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f6351c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.yc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f6350b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.yc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.yc.l(DialogObject.getShortName(profileActivity.f34234e1), profileActivity, z12).j();
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
