package lh;

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
import org.telegram.ui.Components.tu0;
import org.telegram.ui.ProfileActivity;

public final class ia implements Utilities.Callback2 {

    public final int f16139a;

    public final boolean f16140b;

    public final NotificationCenter.NotificationCenterDelegate f16141c;

    public ia(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f16139a = i10;
        this.f16141c = notificationCenterDelegate;
        this.f16140b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        tu0 tu0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f16139a) {
            case 0:
                sb sbVar = (sb) this.f16141c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = sbVar.f16749c;
                if (obj != null && sbVar.f16780l2 == null && !sbVar.S && sbVar.J()) {
                    int i11 = 0;
                    if (!this.f16140b) {
                        sbVar.i0(false, true);
                        sbVar.M0.a(sbVar.K1);
                        y6 y6Var = sbVar.K0;
                        boolean z10 = sbVar.K1 == 1;
                        y6Var.f17098j0 = -1.0f;
                        y6Var.f17099k0 = z10;
                        y6Var.invalidate();
                        sbVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof z7) {
                                z7 z7Var = (z7) obj;
                                if (z7Var.L == null && !z7Var.v()) {
                                    sbVar.f16744a1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().f13974w.c(z7Var);
                                } else {
                                    z7Var.J0 = sbVar.f16797r0;
                                    z7Var.K0 = sbVar.f16801s0;
                                    sbVar.K1 = z7Var.K ? 1 : 0;
                                    z7Var.M0 = bitmap;
                                    sbVar.H1 = false;
                                    sbVar.f16814w0.n(z7Var);
                                    sbVar.G1 = z7Var;
                                    if (z11) {
                                        r9.a(i10, z7Var);
                                    }
                                    sbVar.K(1, true);
                                }
                            }
                            break;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            sbVar.K1 = i11;
                            z7 z7VarL = z7.l(photoEntry);
                            z7VarL.M0 = bitmap;
                            z7VarL.J0 = sbVar.f16797r0;
                            z7VarL.K0 = sbVar.f16801s0;
                            z7VarL.A();
                            sbVar.H1 = true;
                            if (sbVar.f16814w0.j()) {
                                sbVar.C1 = null;
                                z7VarL.P = 1.0f;
                                if (sbVar.f16814w0.l(z7VarL)) {
                                    sbVar.G1 = z7.a(sbVar.f16814w0.getLayout(), sbVar.f16814w0.getContent());
                                }
                                sbVar.m0(true);
                            } else {
                                z7VarL.B();
                                sbVar.G1 = z7VarL;
                                if (z11) {
                                    r9.a(i10, z7VarL);
                                }
                                sbVar.K(1, true);
                            }
                        }
                    } else if (sbVar.G1 != null) {
                        sbVar.u();
                        sbVar.G1.f17214j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            va vaVar = sbVar.f16798r1;
                            vaVar.d0(vaVar.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            va vaVar2 = sbVar.f16798r1;
                            TLObject tLObject = (TLObject) obj;
                            vaVar2.f15972h2 = true;
                            z5 z5Var = vaVar2.N0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) == null) ? 1.0f : closestPhotoSizeWithSize.f22405w / closestPhotoSizeWithSize.h;
                            if (f10 > 1.0f) {
                                float fFloor = (float) Math.floor(((double) Math.max(vaVar2.N1, z5Var.getMeasuredWidth())) * 0.5d);
                                tu0Var = new tu0(fFloor, fFloor / f10);
                            } else {
                                float fFloor2 = (float) Math.floor(((double) Math.max(vaVar2.O1, z5Var.getMeasuredHeight())) * 0.5d);
                                tu0Var = new tu0(f10 * fFloor2, fFloor2);
                            }
                            zf.x1 x1Var = new zf.x1(vaVar2.getContext(), vaVar2.e0(), tu0Var, tLObject);
                            x1Var.setDelegate(vaVar2);
                            z5Var.addView(x1Var);
                            vaVar2.g0();
                            vaVar2.d0(x1Var);
                        }
                        sbVar.f(false);
                    }
                    sa saVar = sbVar.I0;
                    if (saVar != null) {
                        sbVar.f16769h2 = saVar.f16514e.e0();
                        sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                    }
                    break;
                }
                break;
            case 1:
                oh.j0.m((oh.j0) this.f16141c, this.f16140b, (TLRPC.TL_error) obj2);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f16141c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.mc.a(profileActivity)) {
                        int iIntValue = num.intValue();
                        boolean z12 = this.f16140b;
                        if (iIntValue == 1) {
                            org.telegram.ui.Components.mc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.mc.l(DialogObject.getShortName(profileActivity.f35923a1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.mc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.T1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                    }
                    break;
                }
                break;
        }
    }
}
