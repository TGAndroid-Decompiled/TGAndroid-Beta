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
import org.telegram.ui.Components.uv0;
import org.telegram.ui.ProfileActivity;
public final class za implements Utilities.Callback2 {
    public final int f5919a;
    public final boolean f5920b;
    public final NotificationCenter.NotificationCenterDelegate f5921c;

    public za(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5919a = i10;
        this.f5921c = notificationCenterDelegate;
        this.f5920b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        uv0 uv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f5919a) {
            case 0:
                lc lcVar = (lc) this.f5921c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = lcVar.f5033c;
                if (obj != null && lcVar.f5075p2 == null && !lcVar.W && lcVar.J()) {
                    int i11 = 0;
                    if (this.f5920b) {
                        if (lcVar.K1 != null) {
                            lcVar.u();
                            lcVar.K1.f4984j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                nb nbVar = lcVar.f5094v1;
                                nbVar.d0(nbVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                nb nbVar2 = lcVar.f5094v1;
                                TLObject tLObject = (TLObject) obj;
                                nbVar2.f5352l2 = true;
                                j6 j6Var = nbVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f18360w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(nbVar2.R1, j6Var.getMeasuredWidth()) * 0.5d);
                                    uv0Var = new uv0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(nbVar2.S1, j6Var.getMeasuredHeight()) * 0.5d);
                                    uv0Var = new uv0(f7 * floor2, floor2);
                                }
                                qg.y1 y1Var = new qg.y1(nbVar2.getContext(), nbVar2.e0(), uv0Var, tLObject);
                                y1Var.setDelegate(nbVar2);
                                j6Var.addView(y1Var);
                                nbVar2.g0();
                                nbVar2.d0(y1Var);
                            }
                            lcVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        lcVar.i0(false, true);
                        lcVar.Q0.a(lcVar.O1);
                        j7 j7Var = lcVar.O0;
                        if (lcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j7Var.f4845n0 = -1.0f;
                        j7Var.f4846o0 = z10;
                        j7Var.invalidate();
                        lcVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            lcVar.O1 = i11;
                            l8 l4 = l8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = lcVar.f5093v0;
                            l4.K0 = lcVar.f5097w0;
                            l4.A();
                            lcVar.L1 = true;
                            if (lcVar.A0.j()) {
                                lcVar.G1 = null;
                                l4.P = 1.0f;
                                if (lcVar.A0.l(l4)) {
                                    lcVar.K1 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
                                }
                                lcVar.m0(true);
                            } else {
                                l4.B();
                                lcVar.K1 = l4;
                                if (z11) {
                                    ga.a(i10, l4);
                                }
                                lcVar.K(1, true);
                            }
                        } else if (obj instanceof l8) {
                            l8 l8Var = (l8) obj;
                            if (l8Var.L == null && !l8Var.v()) {
                                lcVar.f5041e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f1210w.b(l8Var);
                                return;
                            }
                            l8Var.J0 = lcVar.f5093v0;
                            l8Var.K0 = lcVar.f5097w0;
                            lcVar.O1 = l8Var.K ? 1 : 0;
                            l8Var.M0 = bitmap;
                            lcVar.L1 = false;
                            lcVar.A0.n(l8Var);
                            lcVar.K1 = l8Var;
                            if (z11) {
                                ga.a(i10, l8Var);
                            }
                            lcVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    kb kbVar = lcVar.M0;
                    if (kbVar != null) {
                        lcVar.f5063l2 = kbVar.e.e0();
                        lcVar.f5065m2 = lcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                fi.k0.m((fi.k0) this.f5921c, this.f5920b, (TLRPC.TL_error) obj2);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f5921c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.xc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f5920b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.xc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.xc.l(DialogObject.getShortName(profileActivity.f31555e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.xc.b0(tL_error);
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
