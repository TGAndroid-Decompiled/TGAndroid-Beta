package fi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.ProfileActivity;
public final class m9 implements v10 {
    public final int f12461a;
    public final boolean f12462b;
    public final Object f12463c;

    public m9(int i7, Object obj, boolean z9) {
        this.f12461a = i7;
        this.f12463c = obj;
        this.f12462b = z9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        float f10;
        mt0 mt0Var;
        TLRPC.PhotoSize w10;
        String str;
        int i7 = this.f12461a;
        int i10 = 0;
        boolean z10 = this.f12462b;
        Object obj3 = this.f12463c;
        switch (i7) {
            case 0:
                va vaVar = (va) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = vaVar.f12942c;
                if (obj != null && vaVar.f12983p2 == null && !vaVar.W && vaVar.I()) {
                    if (z10) {
                        if (vaVar.K1 != null) {
                            vaVar.t();
                            vaVar.K1.f11897j = true;
                            if (obj instanceof gf) {
                                x9 x9Var = vaVar.f13002v1;
                                x9Var.b0(x9Var.h0(((gf) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                x9 x9Var2 = vaVar.f13002v1;
                                TLObject tLObject = (TLObject) obj;
                                x9Var2.U1 = true;
                                j5 j5Var = x9Var2.A0;
                                if ((tLObject instanceof TLRPC.Photo) && (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f10 = w10.f26981w / w10.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(x9Var2.A1, j5Var.getMeasuredWidth()) * 0.5d);
                                    mt0Var = new mt0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(x9Var2.B1, j5Var.getMeasuredHeight()) * 0.5d);
                                    mt0Var = new mt0(f10 * floor2, floor2);
                                }
                                tg.n1 n1Var = new tg.n1(x9Var2.getContext(), x9Var2.c0(), mt0Var, tLObject);
                                n1Var.setDelegate(x9Var2);
                                j5Var.addView(n1Var);
                                x9Var2.d0();
                                x9Var2.b0(n1Var);
                            }
                            vaVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        vaVar.h0(false, true);
                        vaVar.Q0.a(vaVar.O1);
                        g6 g6Var = vaVar.O0;
                        if (vaVar.O1 == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        g6Var.f12089n0 = -1.0f;
                        g6Var.f12090o0 = z9;
                        g6Var.invalidate();
                        vaVar.e(false);
                        boolean z11 = obj instanceof gf;
                        if (z11) {
                            gf gfVar = (gf) obj;
                            if (gfVar.f26845b && !gfVar.d()) {
                                i10 = 1;
                            }
                            vaVar.O1 = i10;
                            e7 l10 = e7.l(gfVar);
                            l10.M0 = bitmap;
                            l10.J0 = vaVar.f13001v0;
                            l10.K0 = vaVar.f13005w0;
                            l10.A();
                            vaVar.L1 = true;
                            if (vaVar.A0.j()) {
                                vaVar.G1 = null;
                                l10.P = 1.0f;
                                if (vaVar.A0.l(l10)) {
                                    vaVar.K1 = e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
                                }
                                vaVar.l0(true);
                            } else {
                                l10.B();
                                vaVar.K1 = l10;
                                if (z11) {
                                    t8.a(i11, l10);
                                }
                                vaVar.J(1, true);
                            }
                        } else if (obj instanceof e7) {
                            e7 e7Var = (e7) obj;
                            if (e7Var.L == null && !e7Var.v()) {
                                vaVar.f12950e1.c("Failed to load draft");
                                qp.s1(i11).P1().f9982w.b(e7Var);
                                return;
                            }
                            e7Var.J0 = vaVar.f13001v0;
                            e7Var.K0 = vaVar.f13005w0;
                            vaVar.O1 = e7Var.K ? 1 : 0;
                            e7Var.M0 = bitmap;
                            vaVar.L1 = false;
                            vaVar.A0.n(e7Var);
                            vaVar.K1 = e7Var;
                            if (z11) {
                                t8.a(i11, e7Var);
                            }
                            vaVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    i3 i3Var = vaVar.M0;
                    if (i3Var != null) {
                        vaVar.f12972l2 = i3Var.f11963e.e0();
                        vaVar.f12974m2 = vaVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ii.d0 d0Var = (ii.d0) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        ii.m0.f(new hc((FrameLayout) d0Var.f28619b, d0Var.I0), 2, z10);
                        d0Var.f15505k1.E(0);
                        return;
                    }
                    org.telegram.ui.Cells.f1.r((FrameLayout) d0Var.f28619b, d0Var.I0, tL_error, false);
                    return;
                }
                ii.m0.f(new hc((FrameLayout) d0Var.f28619b, d0Var.I0), 1, z10);
                d0Var.f15505k1.E(0);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.S6;
                if (!profileActivity.c4()) {
                    if (hc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            hc.l(null, profileActivity, z10).j();
                        } else if (num.intValue() == 2) {
                            hc.l(org.telegram.messenger.m5.t(profileActivity.f41716d1), profileActivity, z10).j();
                        } else if (tL_error2 != null) {
                            hc.d0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var = profileActivity.W1;
                    if (n6Var != null) {
                        n6Var.g();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = e0Var.f42411b;
                ArrayList arrayList2 = e0Var.f42412c;
                e0Var.f42419l = -1;
                e0Var.f42417j = false;
                e0Var.f42416i = false;
                if (nftitems != null) {
                    if (z10) {
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
                                if (org.telegram.ui.Wallet.m0.b(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
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
                    e0Var.f42414f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    e0Var.f42415g = isEmpty;
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
                    if (z10) {
                        e0Var.f42415g = false;
                        e0Var.h = false;
                    }
                    if (tL_error3 == null) {
                        str = "Could not load collectibles";
                    } else {
                        str = tL_error3.text;
                    }
                    e0Var.f42418k = str;
                }
                e0Var.g();
                return;
        }
    }
}
