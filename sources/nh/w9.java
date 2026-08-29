package nh;

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
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
public final class w9 implements Utilities.Callback2 {
    public final int f18803a;
    public final boolean f18804b;
    public final NotificationCenter.NotificationCenterDelegate f18805c;

    public w9(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f18803a = i10;
        this.f18805c = notificationCenterDelegate;
        this.f18804b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f9;
        bv0 bv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f18803a) {
            case 0:
                gb gbVar = (gb) this.f18805c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = gbVar.f17743c;
                if (obj != null && gbVar.f17774l2 == null && !gbVar.S && gbVar.J()) {
                    int i11 = 0;
                    if (this.f18804b) {
                        if (gbVar.G1 != null) {
                            gbVar.u();
                            gbVar.G1.f18275j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                ja jaVar = gbVar.f17792r1;
                                jaVar.d0(jaVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                ja jaVar2 = gbVar.f17792r1;
                                TLObject tLObject = (TLObject) obj;
                                jaVar2.f18637h2 = true;
                                n5 n5Var = jaVar2.N0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f9 = closestPhotoSizeWithSize.f22417w / closestPhotoSizeWithSize.h;
                                } else {
                                    f9 = 1.0f;
                                }
                                if (f9 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(jaVar2.N1, n5Var.getMeasuredWidth()) * 0.5d);
                                    bv0Var = new bv0(floor, floor / f9);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(jaVar2.O1, n5Var.getMeasuredHeight()) * 0.5d);
                                    bv0Var = new bv0(f9 * floor2, floor2);
                                }
                                bg.y2 y2Var = new bg.y2(jaVar2.getContext(), jaVar2.e0(), bv0Var, tLObject);
                                y2Var.setDelegate(jaVar2);
                                n5Var.addView(y2Var);
                                jaVar2.g0();
                                jaVar2.d0(y2Var);
                            }
                            gbVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        gbVar.i0(false, true);
                        gbVar.M0.a(gbVar.K1);
                        o6 o6Var = gbVar.K0;
                        if (gbVar.K1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o6Var.f18232j0 = -1.0f;
                        o6Var.f18233k0 = z10;
                        o6Var.invalidate();
                        gbVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            gbVar.K1 = i11;
                            o7 l10 = o7.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = gbVar.f17791r0;
                            l10.K0 = gbVar.f17795s0;
                            l10.A();
                            gbVar.H1 = true;
                            if (gbVar.f17808w0.j()) {
                                gbVar.C1 = null;
                                l10.P = 1.0f;
                                if (gbVar.f17808w0.l(l10)) {
                                    gbVar.G1 = o7.a(gbVar.f17808w0.getLayout(), gbVar.f17808w0.getContent());
                                }
                                gbVar.m0(true);
                            } else {
                                l10.B();
                                gbVar.G1 = l10;
                                if (z11) {
                                    f9.a(i10, l10);
                                }
                                gbVar.K(1, true);
                            }
                        } else if (obj instanceof o7) {
                            o7 o7Var = (o7) obj;
                            if (o7Var.L == null && !o7Var.v()) {
                                gbVar.f17738a1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f16237w.c(o7Var);
                                return;
                            }
                            o7Var.J0 = gbVar.f17791r0;
                            o7Var.K0 = gbVar.f17795s0;
                            gbVar.K1 = o7Var.K ? 1 : 0;
                            o7Var.M0 = bitmap;
                            gbVar.H1 = false;
                            gbVar.f17808w0.n(o7Var);
                            gbVar.G1 = o7Var;
                            if (z11) {
                                f9.a(i10, o7Var);
                            }
                            gbVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    ga gaVar = gbVar.I0;
                    if (gaVar != null) {
                        gbVar.f17763h2 = gaVar.f18174e.e0();
                        gbVar.f17766i2 = gbVar.I0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18805c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (tc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f18804b;
                        if (intValue == 1) {
                            tc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            tc.l(DialogObject.getShortName(profileActivity.f35986a1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            tc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.T1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                qh.i0.m((qh.i0) this.f18805c, this.f18804b, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
