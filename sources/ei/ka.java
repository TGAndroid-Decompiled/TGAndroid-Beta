package ei;

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
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
public final class ka implements Utilities.Callback2 {
    public final int f9337a;
    public final boolean f9338b;
    public final Object f9339c;

    public ka(int i10, Object obj, boolean z10) {
        this.f9337a = i10;
        this.f9339c = obj;
        this.f9338b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        dw0 dw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        switch (this.f9337a) {
            case 0:
                vb vbVar = (vb) this.f9339c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = vbVar.f9955c;
                if (obj != null && vbVar.f9997p2 == null && !vbVar.W && vbVar.I()) {
                    int i11 = 0;
                    if (this.f9338b) {
                        if (vbVar.K1 != null) {
                            vbVar.t();
                            vbVar.K1.f8716j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                xa xaVar = vbVar.f10016v1;
                                xaVar.d0(xaVar.j0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                xa xaVar2 = vbVar.f10016v1;
                                TLObject tLObject = (TLObject) obj;
                                xaVar2.f9022l2 = true;
                                z5 z5Var = xaVar2.R0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f20297w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(xaVar2.R1, z5Var.getMeasuredWidth()) * 0.5d);
                                    dw0Var = new dw0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(xaVar2.S1, z5Var.getMeasuredHeight()) * 0.5d);
                                    dw0Var = new dw0(f7 * floor2, floor2);
                                }
                                rg.x1 x1Var = new rg.x1(xaVar2.getContext(), xaVar2.e0(), dw0Var, tLObject);
                                x1Var.setDelegate(xaVar2);
                                z5Var.addView(x1Var);
                                xaVar2.f0();
                                xaVar2.d0(x1Var);
                            }
                            vbVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        vbVar.h0(false, true);
                        vbVar.Q0.a(vbVar.O1);
                        z6 z6Var = vbVar.O0;
                        if (vbVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z6Var.f10223n0 = -1.0f;
                        z6Var.f10224o0 = z10;
                        z6Var.invalidate();
                        vbVar.e(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            vbVar.O1 = i11;
                            a8 l4 = a8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = vbVar.f10015v0;
                            l4.K0 = vbVar.f10019w0;
                            l4.A();
                            vbVar.L1 = true;
                            if (vbVar.A0.j()) {
                                vbVar.G1 = null;
                                l4.P = 1.0f;
                                if (vbVar.A0.l(l4)) {
                                    vbVar.K1 = a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
                                }
                                vbVar.l0(true);
                            } else {
                                l4.B();
                                vbVar.K1 = l4;
                                if (z11) {
                                    s9.a(i10, l4);
                                }
                                vbVar.J(1, true);
                            }
                        } else if (obj instanceof a8) {
                            a8 a8Var = (a8) obj;
                            if (a8Var.L == null && !a8Var.v()) {
                                vbVar.f9963e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f5511w.b(a8Var);
                                return;
                            }
                            a8Var.J0 = vbVar.f10015v0;
                            a8Var.K0 = vbVar.f10019w0;
                            vbVar.O1 = a8Var.K ? 1 : 0;
                            a8Var.M0 = bitmap;
                            vbVar.L1 = false;
                            vbVar.A0.n(a8Var);
                            vbVar.K1 = a8Var;
                            if (z11) {
                                s9.a(i10, a8Var);
                            }
                            vbVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    ua uaVar = vbVar.M0;
                    if (uaVar != null) {
                        vbVar.f9985l2 = uaVar.e.e0();
                        vbVar.f9987m2 = vbVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                hi.k0.n((hi.k0) this.f9339c, this.f9338b, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.f9339c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (xc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.f9338b;
                        if (intValue == 1) {
                            xc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            xc.l(DialogObject.getShortName(profileActivity.f33607f1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            xc.d0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.Y1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f9339c;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = e0Var.f34147b;
                ArrayList arrayList2 = e0Var.f34148c;
                e0Var.f34154l = -1;
                e0Var.f34152j = false;
                e0Var.f34151i = false;
                boolean z13 = this.f9338b;
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
                                if (org.telegram.ui.Wallet.m0.a(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
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
                    e0Var.f34149f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    e0Var.f34150g = isEmpty;
                    e0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    e0Var.h();
                } else {
                    if (z13) {
                        e0Var.f34150g = false;
                        e0Var.h = false;
                    }
                    if (tL_error2 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error2.text;
                    }
                    e0Var.f34153k = str;
                }
                e0Var.g();
                return;
        }
    }
}
