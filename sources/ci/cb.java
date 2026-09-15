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
import org.telegram.ui.Components.jv0;
import org.telegram.ui.ProfileActivity;
public final class cb implements Utilities.Callback2 {
    public final int f4435a;
    public final boolean f4436b;
    public final NotificationCenter.NotificationCenterDelegate f4437c;

    public cb(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f4435a = i10;
        this.f4437c = notificationCenterDelegate;
        this.f4436b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        jv0 jv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f4435a) {
            case 0:
                oc ocVar = (oc) this.f4437c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = ocVar.f5206c;
                if (obj != null && ocVar.f5248p2 == null && !ocVar.W && ocVar.J()) {
                    int i11 = 0;
                    if (this.f4436b) {
                        if (ocVar.K1 != null) {
                            ocVar.u();
                            ocVar.K1.f5157j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                qb qbVar = ocVar.f5267v1;
                                qbVar.d0(qbVar.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                qb qbVar2 = ocVar.f5267v1;
                                TLObject tLObject = (TLObject) obj;
                                qbVar2.f5425l2 = true;
                                k6 k6Var = qbVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f18137w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(qbVar2.R1, k6Var.getMeasuredWidth()) * 0.5d);
                                    jv0Var = new jv0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(qbVar2.S1, k6Var.getMeasuredHeight()) * 0.5d);
                                    jv0Var = new jv0(f7 * floor2, floor2);
                                }
                                qg.a2 a2Var = new qg.a2(qbVar2.getContext(), qbVar2.e0(), jv0Var, tLObject);
                                a2Var.setDelegate(qbVar2);
                                k6Var.addView(a2Var);
                                qbVar2.g0();
                                qbVar2.d0(a2Var);
                            }
                            ocVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        ocVar.i0(false, true);
                        ocVar.Q0.a(ocVar.O1);
                        l7 l7Var = ocVar.O0;
                        if (ocVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l7Var.f4952n0 = -1.0f;
                        l7Var.f4953o0 = z10;
                        l7Var.invalidate();
                        ocVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            ocVar.O1 = i11;
                            o8 l4 = o8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = ocVar.f5266v0;
                            l4.K0 = ocVar.f5270w0;
                            l4.A();
                            ocVar.L1 = true;
                            if (ocVar.A0.j()) {
                                ocVar.G1 = null;
                                l4.P = 1.0f;
                                if (ocVar.A0.l(l4)) {
                                    ocVar.K1 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
                                }
                                ocVar.m0(true);
                            } else {
                                l4.B();
                                ocVar.K1 = l4;
                                if (z11) {
                                    ja.a(i10, l4);
                                }
                                ocVar.K(1, true);
                            }
                        } else if (obj instanceof o8) {
                            o8 o8Var = (o8) obj;
                            if (o8Var.L == null && !o8Var.v()) {
                                ocVar.f5214e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f1206w.b(o8Var);
                                return;
                            }
                            o8Var.J0 = ocVar.f5266v0;
                            o8Var.K0 = ocVar.f5270w0;
                            ocVar.O1 = o8Var.K ? 1 : 0;
                            o8Var.M0 = bitmap;
                            ocVar.L1 = false;
                            ocVar.A0.n(o8Var);
                            ocVar.K1 = o8Var;
                            if (z11) {
                                ja.a(i10, o8Var);
                            }
                            ocVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    nb nbVar = ocVar.M0;
                    if (nbVar != null) {
                        ocVar.f5236l2 = nbVar.e.e0();
                        ocVar.f5238m2 = ocVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                fi.k0.m((fi.k0) this.f4437c, this.f4436b, (TLRPC.TL_error) obj2);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f4437c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.vc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f4436b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.vc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.vc.l(DialogObject.getShortName(profileActivity.f31269e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.vc.b0(tL_error);
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
