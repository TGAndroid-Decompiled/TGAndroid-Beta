package hi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.ProfileActivity;
public final class j9 implements s10 {
    public final int f14477a;
    public final boolean f14478b;
    public final Object f14479c;

    public j9(int i7, Object obj, boolean z10) {
        this.f14477a = i7;
        this.f14479c = obj;
        this.f14478b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        float f10;
        nt0 nt0Var;
        TLRPC.PhotoSize w10;
        String str;
        int i7 = this.f14477a;
        int i10 = 0;
        boolean z11 = this.f14478b;
        Object obj3 = this.f14479c;
        switch (i7) {
            case 0:
                sa saVar = (sa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = saVar.f15043c;
                if (obj != null && saVar.f15087q2 == null && !saVar.X && saVar.I()) {
                    if (z11) {
                        if (saVar.L1 != null) {
                            saVar.t();
                            saVar.L1.f14144j = true;
                            if (obj instanceof ff) {
                                u9 u9Var = saVar.f15107w1;
                                u9Var.b0(u9Var.h0(((ff) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                u9 u9Var2 = saVar.f15107w1;
                                TLObject tLObject = (TLObject) obj;
                                u9Var2.V1 = true;
                                h5 h5Var = u9Var2.B0;
                                if ((tLObject instanceof TLRPC.Photo) && (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f10 = w10.f28076w / w10.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(u9Var2.B1, h5Var.getMeasuredWidth()) * 0.5d);
                                    nt0Var = new nt0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(u9Var2.C1, h5Var.getMeasuredHeight()) * 0.5d);
                                    nt0Var = new nt0(f10 * floor2, floor2);
                                }
                                tg.n1 n1Var = new tg.n1(u9Var2.getContext(), u9Var2.c0(), nt0Var, tLObject);
                                n1Var.setDelegate(u9Var2);
                                h5Var.addView(n1Var);
                                u9Var2.d0();
                                u9Var2.b0(n1Var);
                            }
                            saVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        saVar.h0(false, true);
                        saVar.R0.a(saVar.P1);
                        f6 f6Var = saVar.P0;
                        if (saVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f6Var.f14294o0 = -1.0f;
                        f6Var.f14295p0 = z10;
                        f6Var.invalidate();
                        saVar.e(false);
                        boolean z12 = obj instanceof ff;
                        if (z12) {
                            ff ffVar = (ff) obj;
                            if (ffVar.f27708b && !ffVar.d()) {
                                i10 = 1;
                            }
                            saVar.P1 = i10;
                            d7 l10 = d7.l(ffVar);
                            l10.M0 = bitmap;
                            l10.J0 = saVar.f15106w0;
                            l10.K0 = saVar.f15110x0;
                            l10.A();
                            saVar.M1 = true;
                            if (saVar.B0.j()) {
                                saVar.H1 = null;
                                l10.P = 1.0f;
                                if (saVar.B0.l(l10)) {
                                    saVar.L1 = d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                                }
                                saVar.l0(true);
                            } else {
                                l10.B();
                                saVar.L1 = l10;
                                if (z12) {
                                    r8.a(i11, l10);
                                }
                                saVar.J(1, true);
                            }
                        } else if (obj instanceof d7) {
                            d7 d7Var = (d7) obj;
                            if (d7Var.L == null && !d7Var.v()) {
                                saVar.f15055f1.c("Failed to load draft");
                                np.s1(i11).P1().f12338w.b(d7Var);
                                return;
                            }
                            d7Var.J0 = saVar.f15106w0;
                            d7Var.K0 = saVar.f15110x0;
                            saVar.P1 = d7Var.K ? 1 : 0;
                            d7Var.M0 = bitmap;
                            saVar.M1 = false;
                            saVar.B0.n(d7Var);
                            saVar.L1 = d7Var;
                            if (z12) {
                                r8.a(i11, d7Var);
                            }
                            saVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    g3 g3Var = saVar.N0;
                    if (g3Var != null) {
                        saVar.f15075m2 = g3Var.f14106e.e0();
                        saVar.f15078n2 = saVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                li.d0 d0Var = (li.d0) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        li.l0.f(new cc((FrameLayout) d0Var.f29682b, d0Var.J0), 2, z11);
                        d0Var.f19541o1.C(0);
                        return;
                    }
                    org.telegram.ui.Cells.y0.q((FrameLayout) d0Var.f29682b, d0Var.J0, tL_error, false);
                    return;
                }
                li.l0.f(new cc((FrameLayout) d0Var.f29682b, d0Var.J0), 1, z11);
                d0Var.f19541o1.C(0);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.X6;
                if (!profileActivity.b4()) {
                    if (cc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            cc.l(null, profileActivity, z11).j();
                        } else if (num.intValue() == 2) {
                            cc.l(org.telegram.messenger.m5.t(profileActivity.f43094e1), profileActivity, z11).j();
                        } else if (tL_error2 != null) {
                            cc.d0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var = profileActivity.Y1;
                    if (n6Var != null) {
                        n6Var.g();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d0 d0Var2 = (org.telegram.ui.Wallet.d0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = d0Var2.f43713b;
                ArrayList arrayList2 = d0Var2.f43714c;
                d0Var2.f43721l = -1;
                d0Var2.f43719j = false;
                d0Var2.f43718i = false;
                if (nftitems != null) {
                    if (z11) {
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
                    d0Var2.f43716f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    d0Var2.f43717g = isEmpty;
                    d0Var2.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !d0Var2.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    d0Var2.h();
                } else {
                    if (z11) {
                        d0Var2.f43717g = false;
                        d0Var2.h = false;
                    }
                    if (tL_error3 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error3.text;
                    }
                    d0Var2.f43720k = str;
                }
                d0Var2.g();
                return;
        }
    }
}
