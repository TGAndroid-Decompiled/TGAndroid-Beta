package kh;

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
import org.telegram.ui.Components.qu0;
import org.telegram.ui.ProfileActivity;
public final class la implements Utilities.Callback2 {
    public final int f15614a;
    public final boolean f15615b;
    public final NotificationCenter.NotificationCenterDelegate f15616c;

    public la(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f15614a = i9;
        this.f15616c = notificationCenterDelegate;
        this.f15615b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f10;
        qu0 qu0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f15614a) {
            case 0:
                wb wbVar = (wb) this.f15616c;
                Bitmap bitmap = (Bitmap) obj2;
                int i9 = wbVar.f16253c;
                if (obj != null && wbVar.f16284l2 == null && !wbVar.S && wbVar.J()) {
                    int i10 = 0;
                    if (this.f15615b) {
                        if (wbVar.G1 != null) {
                            wbVar.u();
                            wbVar.G1.f14922j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                ya yaVar = wbVar.f16302r1;
                                yaVar.d0(yaVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                ya yaVar2 = wbVar.f16302r1;
                                TLObject tLObject = (TLObject) obj;
                                yaVar2.f15282h2 = true;
                                a6 a6Var = yaVar2.N0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f10 = closestPhotoSizeWithSize.f22405w / closestPhotoSizeWithSize.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(yaVar2.N1, a6Var.getMeasuredWidth()) * 0.5d);
                                    qu0Var = new qu0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(yaVar2.O1, a6Var.getMeasuredHeight()) * 0.5d);
                                    qu0Var = new qu0(f10 * floor2, floor2);
                                }
                                yf.x1 x1Var = new yf.x1(yaVar2.getContext(), yaVar2.e0(), qu0Var, tLObject);
                                x1Var.setDelegate(yaVar2);
                                a6Var.addView(x1Var);
                                yaVar2.g0();
                                yaVar2.d0(x1Var);
                            }
                            wbVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        wbVar.i0(false, true);
                        wbVar.M0.a(wbVar.K1);
                        z6 z6Var = wbVar.K0;
                        if (wbVar.K1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z6Var.f16442j0 = -1.0f;
                        z6Var.f16443k0 = z10;
                        z6Var.invalidate();
                        wbVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i10 = 1;
                            }
                            wbVar.K1 = i10;
                            a8 l10 = a8.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = wbVar.f16301r0;
                            l10.K0 = wbVar.f16305s0;
                            l10.A();
                            wbVar.H1 = true;
                            if (wbVar.f16318w0.j()) {
                                wbVar.C1 = null;
                                l10.P = 1.0f;
                                if (wbVar.f16318w0.l(l10)) {
                                    wbVar.G1 = a8.a(wbVar.f16318w0.getLayout(), wbVar.f16318w0.getContent());
                                }
                                wbVar.m0(true);
                            } else {
                                l10.B();
                                wbVar.G1 = l10;
                                if (z11) {
                                    u9.a(i9, l10);
                                }
                                wbVar.K(1, true);
                            }
                        } else if (obj instanceof a8) {
                            a8 a8Var = (a8) obj;
                            if (a8Var.L == null && !a8Var.v()) {
                                wbVar.f16248a1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i9).getStoriesController().f12255w.c(a8Var);
                                return;
                            }
                            a8Var.J0 = wbVar.f16301r0;
                            a8Var.K0 = wbVar.f16305s0;
                            wbVar.K1 = a8Var.K ? 1 : 0;
                            a8Var.M0 = bitmap;
                            wbVar.H1 = false;
                            wbVar.f16318w0.n(a8Var);
                            wbVar.G1 = a8Var;
                            if (z11) {
                                u9.a(i9, a8Var);
                            }
                            wbVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    va vaVar = wbVar.I0;
                    if (vaVar != null) {
                        wbVar.f16273h2 = vaVar.f15865e.e0();
                        wbVar.f16276i2 = wbVar.I0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                nh.j0.m((nh.j0) this.f15616c, this.f15615b, (TLRPC.TL_error) obj2);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f15616c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.oc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f15615b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.oc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.oc.l(DialogObject.getShortName(profileActivity.f35920a1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.oc.b0(tL_error);
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
        }
    }
}
