package fi;

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
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
public final class ga implements Utilities.Callback2 {
    public final int f10929a;
    public final boolean f10930b;
    public final Object f10931c;

    public ga(int i10, Object obj, boolean z10) {
        this.f10929a = i10;
        this.f10931c = obj;
        this.f10930b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        float f7;
        rw0 rw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        int i10 = this.f10929a;
        int i11 = 0;
        boolean z11 = this.f10930b;
        Object obj3 = this.f10931c;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i12 = sbVar.f11611c;
                if (obj != null && sbVar.f11653p2 == null && !sbVar.W && sbVar.I()) {
                    if (z11) {
                        if (sbVar.K1 != null) {
                            sbVar.t();
                            sbVar.K1.f11907j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                ta taVar = sbVar.f11672v1;
                                taVar.b0(taVar.h0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                ta taVar2 = sbVar.f11672v1;
                                TLObject tLObject = (TLObject) obj;
                                taVar2.a2 = true;
                                y5 y5Var = taVar2.G0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f7 = closestPhotoSizeWithSize.f22053w / closestPhotoSizeWithSize.h;
                                } else {
                                    f7 = 1.0f;
                                }
                                if (f7 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(taVar2.G1, y5Var.getMeasuredWidth()) * 0.5d);
                                    rw0Var = new rw0(floor, floor / f7);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(taVar2.H1, y5Var.getMeasuredHeight()) * 0.5d);
                                    rw0Var = new rw0(f7 * floor2, floor2);
                                }
                                sg.y1 y1Var = new sg.y1(taVar2.getContext(), taVar2.c0(), rw0Var, tLObject);
                                y1Var.setDelegate(taVar2);
                                y5Var.addView(y1Var);
                                taVar2.d0();
                                taVar2.b0(y1Var);
                            }
                            sbVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        sbVar.h0(false, true);
                        sbVar.Q0.a(sbVar.O1);
                        w6 w6Var = sbVar.O0;
                        if (sbVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w6Var.f11869n0 = -1.0f;
                        w6Var.f11870o0 = z10;
                        w6Var.invalidate();
                        sbVar.e(false);
                        boolean z12 = obj instanceof MediaController.PhotoEntry;
                        if (z12) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            sbVar.O1 = i11;
                            w7 l4 = w7.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = sbVar.f11671v0;
                            l4.K0 = sbVar.f11675w0;
                            l4.A();
                            sbVar.L1 = true;
                            if (sbVar.A0.j()) {
                                sbVar.G1 = null;
                                l4.P = 1.0f;
                                if (sbVar.A0.l(l4)) {
                                    sbVar.K1 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
                                }
                                sbVar.l0(true);
                            } else {
                                l4.B();
                                sbVar.K1 = l4;
                                if (z12) {
                                    o9.a(i12, l4);
                                }
                                sbVar.J(1, true);
                            }
                        } else if (obj instanceof w7) {
                            w7 w7Var = (w7) obj;
                            if (w7Var.L == null && !w7Var.v()) {
                                sbVar.f11619e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i12).getStoriesController().f8647w.b(w7Var);
                                return;
                            }
                            w7Var.J0 = sbVar.f11671v0;
                            w7Var.K0 = sbVar.f11675w0;
                            sbVar.O1 = w7Var.K ? 1 : 0;
                            w7Var.M0 = bitmap;
                            sbVar.L1 = false;
                            sbVar.A0.n(w7Var);
                            sbVar.K1 = w7Var;
                            if (z12) {
                                o9.a(i12, w7Var);
                            }
                            sbVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    qa qaVar = sbVar.M0;
                    if (qaVar != null) {
                        sbVar.f11641l2 = qaVar.e.e0();
                        sbVar.f11643m2 = sbVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                ii.j0.m((ii.j0) obj3, z11, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = ProfileActivity.R6;
                if (!profileActivity.V3()) {
                    if (wc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            wc.l(null, profileActivity, z11).j();
                        } else if (num.intValue() == 2) {
                            wc.l(DialogObject.getShortName(profileActivity.f36003e1), profileActivity, z11).j();
                        } else if (tL_error != null) {
                            wc.e0(tL_error);
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
                org.telegram.ui.Wallet.d0 d0Var = (org.telegram.ui.Wallet.d0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = d0Var.f36467b;
                ArrayList arrayList2 = d0Var.f36468c;
                d0Var.f36474l = -1;
                d0Var.f36472j = false;
                d0Var.f36471i = false;
                if (nftitems != null) {
                    if (z11) {
                        arrayList.clear();
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                if (org.telegram.ui.Wallet.l0.b(((TL_wallet.nftItem) arrayList.get(i15)).address, nftitem2.address)) {
                                    arrayList.set(i15, nftitem2);
                                } else {
                                    i15++;
                                }
                            } else {
                                arrayList.add(nftitem2);
                            }
                        }
                    }
                    String str2 = nftitems.next_offset;
                    d0Var.f36469f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    d0Var.f36470g = isEmpty;
                    d0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    d0Var.h();
                } else {
                    if (z11) {
                        d0Var.f36470g = false;
                        d0Var.h = false;
                    }
                    if (tL_error2 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error2.text;
                    }
                    d0Var.f36473k = str;
                }
                d0Var.g();
                return;
        }
    }
}
