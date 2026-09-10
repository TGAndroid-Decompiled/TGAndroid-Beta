package bi;

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
import org.telegram.ui.Components.tv0;
import org.telegram.ui.ProfileActivity;
public final class lc implements Utilities.Callback2 {
    public final int f3054a;
    public final boolean f3055b;
    public final NotificationCenter.NotificationCenterDelegate f3056c;

    public lc(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f3054a = i10;
        this.f3056c = notificationCenterDelegate;
        this.f3055b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        tv0 tv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f3054a) {
            case 0:
                ce ceVar = (ce) this.f3056c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = ceVar.f2437c;
                if (obj != null && ceVar.f2479p2 == null && !ceVar.W && ceVar.J()) {
                    int i11 = 0;
                    if (this.f3055b) {
                        if (ceVar.K1 != null) {
                            ceVar.u();
                            ceVar.K1.f3579j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                ad adVar = ceVar.f2498v1;
                                adVar.d0(adVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                ad adVar2 = ceVar.f2498v1;
                                TLObject tLObject = (TLObject) obj;
                                adVar2.f3521l2 = true;
                                j7 j7Var = adVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f17220w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(adVar2.R1, j7Var.getMeasuredWidth()) * 0.5d);
                                    tv0Var = new tv0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(adVar2.S1, j7Var.getMeasuredHeight()) * 0.5d);
                                    tv0Var = new tv0(f7 * floor2, floor2);
                                }
                                pg.x1 x1Var = new pg.x1(adVar2.getContext(), adVar2.e0(), tv0Var, tLObject);
                                x1Var.setDelegate(adVar2);
                                j7Var.addView(x1Var);
                                adVar2.g0();
                                adVar2.d0(x1Var);
                            }
                            ceVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        ceVar.i0(false, true);
                        ceVar.Q0.a(ceVar.O1);
                        m8 m8Var = ceVar.O0;
                        if (ceVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m8Var.f3121n0 = -1.0f;
                        m8Var.f3122o0 = z10;
                        m8Var.invalidate();
                        ceVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            ceVar.O1 = i11;
                            r9 l4 = r9.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = ceVar.f2497v0;
                            l4.K0 = ceVar.f2501w0;
                            l4.A();
                            ceVar.L1 = true;
                            if (ceVar.A0.j()) {
                                ceVar.G1 = null;
                                l4.P = 1.0f;
                                if (ceVar.A0.l(l4)) {
                                    ceVar.K1 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
                                }
                                ceVar.m0(true);
                            } else {
                                l4.B();
                                ceVar.K1 = l4;
                                if (z11) {
                                    sb.a(i10, l4);
                                }
                                ceVar.K(1, true);
                            }
                        } else if (obj instanceof r9) {
                            r9 r9Var = (r9) obj;
                            if (r9Var.L == null && !r9Var.v()) {
                                ceVar.f2445e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f48517w.b(r9Var);
                                return;
                            }
                            r9Var.J0 = ceVar.f2497v0;
                            r9Var.K0 = ceVar.f2501w0;
                            ceVar.O1 = r9Var.K ? 1 : 0;
                            r9Var.M0 = bitmap;
                            ceVar.L1 = false;
                            ceVar.A0.n(r9Var);
                            ceVar.K1 = r9Var;
                            if (z11) {
                                sb.a(i10, r9Var);
                            }
                            ceVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    xc xcVar = ceVar.M0;
                    if (xcVar != null) {
                        ceVar.f2467l2 = xcVar.e.e0();
                        ceVar.f2469m2 = ceVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                ei.k0.m((ei.k0) this.f3056c, this.f3055b, (TLRPC.TL_error) obj2);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f3056c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.wc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f3055b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.wc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.wc.l(DialogObject.getShortName(profileActivity.f30381e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.wc.b0(tL_error);
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
