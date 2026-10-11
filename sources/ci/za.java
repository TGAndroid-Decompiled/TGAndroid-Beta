package ci;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.ProfileActivity;
public final class za implements Utilities.Callback2 {
    public final int f6429a;
    public final boolean f6430b;
    public final Object f6431c;

    public za(int i10, Object obj, boolean z10) {
        this.f6429a = i10;
        this.f6431c = obj;
        this.f6430b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        ow0 ow0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        switch (this.f6429a) {
            case 0:
                lc lcVar = (lc) this.f6431c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = lcVar.f5464c;
                if (obj != null && lcVar.f5507p2 == null && !lcVar.W && lcVar.I()) {
                    int i11 = 0;
                    if (this.f6430b) {
                        if (lcVar.K1 != null) {
                            lcVar.t();
                            lcVar.K1.f5414j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                nb nbVar = lcVar.f5526v1;
                                nbVar.d0(nbVar.j0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                nb nbVar2 = lcVar.f5526v1;
                                TLObject tLObject = (TLObject) obj;
                                nbVar2.f5810l2 = true;
                                j6 j6Var = nbVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f20057w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(nbVar2.R1, j6Var.getMeasuredWidth()) * 0.5d);
                                    ow0Var = new ow0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(nbVar2.S1, j6Var.getMeasuredHeight()) * 0.5d);
                                    ow0Var = new ow0(f7 * floor2, floor2);
                                }
                                qg.x1 x1Var = new qg.x1(nbVar2.getContext(), nbVar2.e0(), ow0Var, tLObject);
                                x1Var.setDelegate(nbVar2);
                                j6Var.addView(x1Var);
                                nbVar2.f0();
                                nbVar2.d0(x1Var);
                            }
                            lcVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        lcVar.h0(false, true);
                        lcVar.Q0.a(lcVar.O1);
                        j7 j7Var = lcVar.O0;
                        if (lcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j7Var.f5267n0 = -1.0f;
                        j7Var.f5268o0 = z10;
                        j7Var.invalidate();
                        lcVar.e(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            lcVar.O1 = i11;
                            l8 l4 = l8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = lcVar.f5525v0;
                            l4.K0 = lcVar.f5529w0;
                            l4.A();
                            lcVar.L1 = true;
                            if (lcVar.A0.j()) {
                                lcVar.G1 = null;
                                l4.P = 1.0f;
                                if (lcVar.A0.l(l4)) {
                                    lcVar.K1 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
                                }
                                lcVar.l0(true);
                            } else {
                                l4.B();
                                lcVar.K1 = l4;
                                if (z11) {
                                    ga.a(i10, l4);
                                }
                                lcVar.J(1, true);
                            }
                        } else if (obj instanceof l8) {
                            l8 l8Var = (l8) obj;
                            if (l8Var.L == null && !l8Var.v()) {
                                lcVar.f5473e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f1425w.b(l8Var);
                                return;
                            }
                            l8Var.J0 = lcVar.f5525v0;
                            l8Var.K0 = lcVar.f5529w0;
                            lcVar.O1 = l8Var.K ? 1 : 0;
                            l8Var.M0 = bitmap;
                            lcVar.L1 = false;
                            lcVar.A0.n(l8Var);
                            lcVar.K1 = l8Var;
                            if (z11) {
                                ga.a(i10, l8Var);
                            }
                            lcVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    kb kbVar = lcVar.M0;
                    if (kbVar != null) {
                        lcVar.f5495l2 = kbVar.f6134e.e0();
                        lcVar.f5497m2 = lcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                fi.k0.o((fi.k0) this.f6431c, this.f6430b, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.f6431c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.ad.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f6430b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.ad.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.ad.l(DialogObject.getShortName(profileActivity.f34271e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.ad.d0(tL_error);
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
            default:
                org.telegram.ui.Wallet.d0 d0Var = (org.telegram.ui.Wallet.d0) this.f6431c;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = d0Var.f34788b;
                ArrayList arrayList2 = d0Var.f34789c;
                d0Var.f34796l = -1;
                d0Var.f34794j = false;
                d0Var.f34793i = false;
                boolean z13 = this.f6430b;
                if (nftitems != null) {
                    if (z13) {
                        arrayList.clear();
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList.size()) {
                                if (org.telegram.ui.Wallet.l0.b(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
                                    arrayList.set(i13, nftitem2);
                                } else {
                                    i13++;
                                }
                            } else {
                                arrayList.add(nftitem2);
                            }
                        }
                    }
                    String str2 = nftitems.next_offset;
                    d0Var.f34791f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    d0Var.f34792g = isEmpty;
                    d0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed) {
                                String str3 = wallettransaction.nft.address;
                                int size3 = arrayList.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size3) {
                                        Object obj3 = arrayList.get(i14);
                                        i14++;
                                        if (org.telegram.ui.Wallet.l0.b(((TL_wallet.nftItem) obj3).address, str3)) {
                                            break;
                                        }
                                    } else {
                                        arrayList2.remove(size2);
                                    }
                                }
                            }
                        }
                    }
                    d0Var.g();
                } else {
                    if (z13) {
                        d0Var.f34792g = false;
                        d0Var.h = false;
                    }
                    if (tL_error2 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error2.text;
                    }
                    d0Var.f34795k = str;
                }
                d0Var.f();
                return;
        }
    }
}
