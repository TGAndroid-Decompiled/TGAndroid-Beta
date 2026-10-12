package di;

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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.ProfileActivity;
public final class ya implements Utilities.Callback2 {
    public final int f8136a;
    public final boolean f8137b;
    public final Object f8138c;

    public ya(int i10, Object obj, boolean z10) {
        this.f8136a = i10;
        this.f8138c = obj;
        this.f8137b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        iw0 iw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        switch (this.f8136a) {
            case 0:
                kc kcVar = (kc) this.f8138c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = kcVar.f7241c;
                if (obj != null && kcVar.f7283p2 == null && !kcVar.W && kcVar.I()) {
                    int i11 = 0;
                    if (this.f8137b) {
                        if (kcVar.K1 != null) {
                            kcVar.t();
                            kcVar.K1.f7192j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                mb mbVar = kcVar.f7302v1;
                                mbVar.d0(mbVar.j0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                mb mbVar2 = kcVar.f7302v1;
                                TLObject tLObject = (TLObject) obj;
                                mbVar2.f7533l2 = true;
                                i6 i6Var = mbVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f19241w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(mbVar2.R1, i6Var.getMeasuredWidth()) * 0.5d);
                                    iw0Var = new iw0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(mbVar2.S1, i6Var.getMeasuredHeight()) * 0.5d);
                                    iw0Var = new iw0(f7 * floor2, floor2);
                                }
                                rg.z1 z1Var = new rg.z1(mbVar2.getContext(), mbVar2.e0(), iw0Var, tLObject);
                                z1Var.setDelegate(mbVar2);
                                i6Var.addView(z1Var);
                                mbVar2.f0();
                                mbVar2.d0(z1Var);
                            }
                            kcVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        kcVar.h0(false, true);
                        kcVar.Q0.a(kcVar.O1);
                        i7 i7Var = kcVar.O0;
                        if (kcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i7Var.f7062n0 = -1.0f;
                        i7Var.f7063o0 = z10;
                        i7Var.invalidate();
                        kcVar.e(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            kcVar.O1 = i11;
                            k8 l4 = k8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = kcVar.f7301v0;
                            l4.K0 = kcVar.f7305w0;
                            l4.A();
                            kcVar.L1 = true;
                            if (kcVar.A0.j()) {
                                kcVar.G1 = null;
                                l4.P = 1.0f;
                                if (kcVar.A0.l(l4)) {
                                    kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                                }
                                kcVar.l0(true);
                            } else {
                                l4.B();
                                kcVar.K1 = l4;
                                if (z11) {
                                    fa.a(i10, l4);
                                }
                                kcVar.J(1, true);
                            }
                        } else if (obj instanceof k8) {
                            k8 k8Var = (k8) obj;
                            if (k8Var.L == null && !k8Var.v()) {
                                kcVar.f7249e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f3980w.b(k8Var);
                                return;
                            }
                            k8Var.J0 = kcVar.f7301v0;
                            k8Var.K0 = kcVar.f7305w0;
                            kcVar.O1 = k8Var.K ? 1 : 0;
                            k8Var.M0 = bitmap;
                            kcVar.L1 = false;
                            kcVar.A0.n(k8Var);
                            kcVar.K1 = k8Var;
                            if (z11) {
                                fa.a(i10, k8Var);
                            }
                            kcVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    jb jbVar = kcVar.M0;
                    if (jbVar != null) {
                        kcVar.f7271l2 = jbVar.e.e0();
                        kcVar.f7273m2 = kcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                gi.k0.n((gi.k0) this.f8138c, this.f8137b, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.f8138c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.zc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f8137b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.zc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.zc.l(DialogObject.getShortName(profileActivity.f32559e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.zc.d0(tL_error);
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
                org.telegram.ui.Wallet.b0 b0Var = (org.telegram.ui.Wallet.b0) this.f8138c;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = b0Var.f32941b;
                ArrayList arrayList2 = b0Var.f32942c;
                b0Var.f32948l = -1;
                b0Var.f32946j = false;
                b0Var.f32945i = false;
                boolean z13 = this.f8137b;
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
                                if (org.telegram.ui.Wallet.j0.b(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
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
                    b0Var.f32943f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    b0Var.f32944g = isEmpty;
                    b0Var.h = true;
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
                                        if (org.telegram.ui.Wallet.j0.b(((TL_wallet.nftItem) obj3).address, str3)) {
                                            break;
                                        }
                                    } else {
                                        arrayList2.remove(size2);
                                    }
                                }
                            }
                        }
                    }
                    b0Var.g();
                } else {
                    if (z13) {
                        b0Var.f32944g = false;
                        b0Var.h = false;
                    }
                    if (tL_error2 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error2.text;
                    }
                    b0Var.f32947k = str;
                }
                b0Var.f();
                return;
        }
    }
}
