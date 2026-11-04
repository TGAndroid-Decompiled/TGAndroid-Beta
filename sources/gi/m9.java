package gi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.ProfileActivity;
public final class m9 implements n10 {
    public final int f13266a;
    public final boolean f13267b;
    public final Object f13268c;

    public m9(int i3, Object obj, boolean z10) {
        this.f13266a = i3;
        this.f13268c = obj;
        this.f13267b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        float f10;
        lt0 lt0Var;
        TLRPC.PhotoSize w10;
        String str;
        int i3 = this.f13266a;
        int i10 = 0;
        boolean z11 = this.f13267b;
        Object obj3 = this.f13268c;
        switch (i3) {
            case 0:
                va vaVar = (va) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = vaVar.f13706c;
                if (obj != null && vaVar.f13750q2 == null && !vaVar.X && vaVar.I()) {
                    if (z11) {
                        if (vaVar.L1 != null) {
                            vaVar.t();
                            vaVar.L1.f12723j = true;
                            if (obj instanceof ye) {
                                x9 x9Var = vaVar.f13770w1;
                                x9Var.b0(x9Var.h0(((ye) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                x9 x9Var2 = vaVar.f13770w1;
                                TLObject tLObject = (TLObject) obj;
                                x9Var2.V1 = true;
                                h5 h5Var = x9Var2.B0;
                                if ((tLObject instanceof TLRPC.Photo) && (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f10 = w10.f27026w / w10.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(x9Var2.B1, h5Var.getMeasuredWidth()) * 0.5d);
                                    lt0Var = new lt0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(x9Var2.C1, h5Var.getMeasuredHeight()) * 0.5d);
                                    lt0Var = new lt0(f10 * floor2, floor2);
                                }
                                ug.n1 n1Var = new ug.n1(x9Var2.getContext(), x9Var2.c0(), lt0Var, tLObject);
                                n1Var.setDelegate(x9Var2);
                                h5Var.addView(n1Var);
                                x9Var2.d0();
                                x9Var2.b0(n1Var);
                            }
                            vaVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        vaVar.h0(false, true);
                        vaVar.R0.a(vaVar.P1);
                        h6 h6Var = vaVar.P0;
                        if (vaVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h6Var.f12902o0 = -1.0f;
                        h6Var.f12903p0 = z10;
                        h6Var.invalidate();
                        vaVar.e(false);
                        boolean z12 = obj instanceof ye;
                        if (z12) {
                            ye yeVar = (ye) obj;
                            if (yeVar.f25310b && !yeVar.d()) {
                                i10 = 1;
                            }
                            vaVar.P1 = i10;
                            f7 l10 = f7.l(yeVar);
                            l10.M0 = bitmap;
                            l10.J0 = vaVar.f13769w0;
                            l10.K0 = vaVar.f13773x0;
                            l10.A();
                            vaVar.M1 = true;
                            if (vaVar.B0.j()) {
                                vaVar.H1 = null;
                                l10.P = 1.0f;
                                if (vaVar.B0.l(l10)) {
                                    vaVar.L1 = f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
                                }
                                vaVar.l0(true);
                            } else {
                                l10.B();
                                vaVar.L1 = l10;
                                if (z12) {
                                    u8.a(i11, l10);
                                }
                                vaVar.J(1, true);
                            }
                        } else if (obj instanceof f7) {
                            f7 f7Var = (f7) obj;
                            if (f7Var.L == null && !f7Var.v()) {
                                vaVar.f13718f1.c("Failed to load draft");
                                hp.s1(i11).P1().f11293w.b(f7Var);
                                return;
                            }
                            f7Var.J0 = vaVar.f13769w0;
                            f7Var.K0 = vaVar.f13773x0;
                            vaVar.P1 = f7Var.K ? 1 : 0;
                            f7Var.M0 = bitmap;
                            vaVar.M1 = false;
                            vaVar.B0.n(f7Var);
                            vaVar.L1 = f7Var;
                            if (z12) {
                                u8.a(i11, f7Var);
                            }
                            vaVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    g3 g3Var = vaVar.N0;
                    if (g3Var != null) {
                        vaVar.f13737m2 = g3Var.f12566e.e0();
                        vaVar.f13741n2 = vaVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ji.b0 b0Var = (ji.b0) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        ji.j0.f(new fc((FrameLayout) b0Var.f28586b, b0Var.J0), 2, z11);
                        b0Var.f16265l1.D(0);
                        return;
                    }
                    org.telegram.ui.Cells.f1.v((FrameLayout) b0Var.f28586b, b0Var.J0, tL_error, false);
                    return;
                }
                ji.j0.f(new fc((FrameLayout) b0Var.f28586b, b0Var.J0), 1, z11);
                b0Var.f16265l1.D(0);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.T6;
                if (!profileActivity.c4()) {
                    if (fc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            fc.l(null, profileActivity, z11).j();
                        } else if (num.intValue() == 2) {
                            fc.l(org.telegram.messenger.m5.t(profileActivity.f41751e1), profileActivity, z11).j();
                        } else if (tL_error2 != null) {
                            fc.d0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var = profileActivity.X1;
                    if (n6Var != null) {
                        n6Var.g();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c0 c0Var = (org.telegram.ui.Wallet.c0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = c0Var.f42361b;
                ArrayList arrayList2 = c0Var.f42362c;
                c0Var.f42369l = -1;
                c0Var.f42367j = false;
                c0Var.f42366i = false;
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
                                if (org.telegram.ui.Wallet.k0.b(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
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
                    c0Var.f42364f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    c0Var.f42365g = isEmpty;
                    c0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !c0Var.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    c0Var.h();
                } else {
                    if (z11) {
                        c0Var.f42365g = false;
                        c0Var.h = false;
                    }
                    if (tL_error3 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error3.text;
                    }
                    c0Var.f42368k = str;
                }
                c0Var.g();
                return;
        }
    }
}
