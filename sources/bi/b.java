package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import di.ab;
import di.bb;
import di.fb;
import di.jb;
import di.mb;
import di.wa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.r00;
import org.telegram.messenger.w10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n41;
public final class b implements p10 {
    public final int f3384a;
    public final Object f3385b;

    public b(Object obj, int i7) {
        this.f3384a = i7;
        this.f3385b = obj;
    }

    private final void b(Object obj, Object obj2) {
        String str;
        di.h1 h1Var = (di.h1) this.f3385b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ArrayList arrayList2 = h1Var.Z1;
        boolean z10 = h1Var.f8902q2;
        com.google.android.gms.common.api.internal.p pVar = h1Var.f8889c2;
        ArrayList arrayList3 = h1Var.X1;
        ArrayList arrayList4 = h1Var.W1;
        com.google.android.gms.common.api.internal.p pVar2 = h1Var.f8888b2;
        com.google.android.gms.common.api.internal.p pVar3 = h1Var.f8887a2;
        ArrayList arrayList5 = h1Var.Y1;
        if (arrayList5 != null && arrayList4 != null && arrayList3 != null) {
            arrayList.add(n41.D(org.telegram.messenger.g0.L(315.0f)));
            pVar3.f6333a = 0;
            pVar3.c();
            pVar2.f6333a = 0;
            pVar2.c();
            pVar.f6333a = 0;
            pVar.c();
            int i7 = h1Var.f8891f2.f8846s;
            if (i7 == 0) {
                String str2 = "GiftPreviewCountModels";
                if (!z10) {
                    str = "GiftPreviewCountModels";
                } else {
                    str = "GiftPreviewCountModelsCrafting";
                }
                arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', str, arrayList5.size()))));
                int size = arrayList5.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList5.get(i10);
                    i10++;
                    arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj3)));
                }
                if (!arrayList2.isEmpty()) {
                    if (z10) {
                        str2 = "GiftPreviewCountModelsCrafting2";
                    }
                    arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', str2, arrayList5.size()))));
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj4)));
                    }
                }
            } else if (i7 == 1) {
                arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
                int size3 = arrayList4.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) pVar.c())));
                }
            } else if (i7 == 2) {
                arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
                int size4 = arrayList3.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj6 = arrayList3.get(i13);
                    i13++;
                    arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) pVar.c())));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        String f10;
        ab abVar = (ab) this.f3385b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        arrayList.add(n41.k(abVar.T1));
        arrayList.add(n41.u(gd.N0(2131743969, null)));
        ArrayList u10 = di.y8.y(abVar.f30223a, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (!abVar.Y1 && tL_starsGiftOption.extended) {
                    i10++;
                } else {
                    int i13 = i11 + 1;
                    int i14 = bb.f8566b;
                    n41 K = n41.K(bb.class);
                    K.d = i12;
                    K.A = i11;
                    long j3 = tL_starsGiftOption.stars;
                    K.C = j3;
                    K.f37655m = gd.H(' ', "StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        f10 = null;
                    } else {
                        f10 = org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    K.f37656n = f10;
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i11 = i13;
                }
            }
            boolean z10 = abVar.Y1;
            if (!z10 && i10 > 0) {
                if (z10) {
                    i7 = 2131747651;
                } else {
                    i7 = 2131747642;
                }
                String N0 = gd.N0(i7, null);
                int i15 = wa.f9975b;
                n41 K2 = n41.K(wa.class);
                K2.d = -1;
                K2.f37655m = N0;
                K2.f37649f = !abVar.Y1;
                K2.f37660r = true;
                arrayList.add(K2);
            }
        } else {
            arrayList.add(n41.p(31));
            arrayList.add(n41.p(31));
            arrayList.add(n41.p(31));
        }
        arrayList.add(n41.k(abVar.U1));
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        int i10;
        fb fbVar = (fb) this.f3385b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        long j3 = fbVar.T1;
        ah.a aVar = fbVar.U1;
        arrayList.add(n41.m(aVar));
        boolean z10 = fbVar.Z1;
        if (z10) {
            i5.c.s(2131743969, null, arrayList);
        }
        ArrayList z11 = di.y8.y(fbVar.f30223a, false).z();
        if (z10) {
            if (z11 != null && !z11.isEmpty()) {
                int i11 = 0;
                int i12 = 0;
                boolean z12 = false;
                int i13 = 1;
                for (int i14 = 0; i14 < z11.size(); i14++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i14);
                    if (tL_starsTopupOption.stars >= j3) {
                        if (tL_starsTopupOption.extended && !fbVar.f8835b2 && z12) {
                            i12++;
                        } else {
                            arrayList.add(bb.i(i14, i13, tL_starsTopupOption));
                            i11++;
                            i13++;
                            z12 = true;
                        }
                    }
                }
                if (i11 < 3) {
                    arrayList.clear();
                    arrayList.add(n41.k(aVar));
                    arrayList.add(n41.u(gd.N0(2131743969, null)));
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(bb.i(i16, i13, tL_starsTopupOption2));
                            i15++;
                            i13++;
                        }
                    }
                    if (i15 == 0) {
                        int i17 = 0;
                        while (i17 < z11.size()) {
                            arrayList.add(bb.i(i17, i13, (TL_stars.TL_starsTopupOption) z11.get(i17)));
                            i17++;
                            i13++;
                        }
                        boolean z13 = fbVar.f8835b2;
                        if (!z13 && i12 > 0) {
                            if (z13) {
                                i10 = 2131747651;
                            } else {
                                i10 = 2131747642;
                            }
                            String N0 = gd.N0(i10, null);
                            int i18 = wa.f9975b;
                            n41 K = n41.K(wa.class);
                            K.d = -1;
                            K.f37655m = N0;
                            K.f37649f = !fbVar.f8835b2;
                            K.f37660r = true;
                            arrayList.add(K);
                        }
                    } else {
                        fbVar.f8835b2 = true;
                    }
                } else if (i11 > 0) {
                    boolean z14 = fbVar.f8835b2;
                    if (!z14 && i12 > 0) {
                        if (z14) {
                            i7 = 2131747651;
                        } else {
                            i7 = 2131747642;
                        }
                        String N02 = gd.N0(i7, null);
                        int i19 = wa.f9975b;
                        n41 K2 = n41.K(wa.class);
                        K2.d = -1;
                        K2.f37655m = N02;
                        K2.f37649f = !fbVar.f8835b2;
                        K2.f37660r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i20 = 0;
                    while (i20 < z11.size()) {
                        arrayList.add(bb.i(i20, i13, (TL_stars.TL_starsTopupOption) z11.get(i20)));
                        i20++;
                        i13++;
                    }
                }
            } else {
                arrayList.add(n41.p(31));
                arrayList.add(n41.p(31));
                arrayList.add(n41.p(31));
            }
        }
        arrayList.add(n41.k(fbVar.V1));
    }

    private final void e(Object obj, Object obj2) {
        int i7;
        ArrayList arrayList;
        int i10;
        String str;
        boolean z10;
        mb mbVar = (mb) this.f3385b;
        ArrayList arrayList2 = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        boolean z11 = mbVar.f9325e;
        int i11 = mbVar.d;
        int i12 = mbVar.f9324c;
        long j3 = mbVar.f9326f;
        if (j3 != 0) {
            di.e0 g10 = di.e0.g(i12);
            ArrayList arrayList3 = g10.k(j3).f8628a[i11];
            int size = arrayList3.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                int i14 = jb.f9091b;
                n41 K = n41.K(jb.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.f37660r = true;
                arrayList2.add(K);
            }
            if (!g10.k(j3).f8631e[i11]) {
                arrayList2.add(n41.q(arrayList2.size(), 7));
                arrayList2.add(n41.q(arrayList2.size(), 7));
                arrayList2.add(n41.q(arrayList2.size(), 7));
                return;
            }
            return;
        }
        di.y8 y10 = di.y8.y(i12, z11);
        ArrayList[] arrayListArr = y10.f10060q;
        if (z11 && ii.n.c(i12)) {
            if (mbVar.f9327n == null) {
                mbVar.f9327n = new org.telegram.ui.Wallet.f4();
            }
            mbVar.f9328r = org.telegram.ui.Wallet.v0.D(i12).y();
            ArrayList arrayList4 = arrayListArr[i11];
            org.telegram.ui.Wallet.f4 f4Var = mbVar.f9327n;
            ii.m mVar = ii.n.f16414b[i12];
            String y11 = org.telegram.ui.Wallet.v0.D(i12).y();
            HashSet hashSet = f4Var.f44281a;
            HashSet hashSet2 = f4Var.f44281a;
            HashMap hashMap = f4Var.f44282b;
            hashSet.clear();
            hashMap.clear();
            if (y11 != null && !y11.isEmpty()) {
                hashSet2.add(y11);
            }
            hashMap.clear();
            f4Var.b(4, new ArrayList(hashSet2));
            if (mVar != null && mVar.f16412g == null && System.currentTimeMillis() - mVar.f16410e <= 600000 && i11 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.f28755id = "earnings:" + mVar.f16408b;
                wallettransaction.pending = true;
                wallettransaction.amount = mVar.f16409c;
                wallettransaction.date = mVar.d;
                wallettransaction.peer = new org.telegram.ui.Wallet.c4(y11);
                arrayList2.add(org.telegram.ui.Wallet.e4.i(wallettransaction, f4Var));
            }
            HashSet e10 = ii.n.e(i12);
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj4 = arrayList4.get(i15);
                i15++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.f28723id;
                if (str2 == null || ((!e10.contains(str2) && (mVar == null || !starsTransaction.f28723id.equals(mVar.f16412g))) || starsTransaction.amount == null)) {
                    arrayList = arrayList4;
                    i10 = i11;
                    int i16 = jb.f9091b;
                    n41 K2 = n41.K(jb.class);
                    K2.H = starsTransaction;
                    K2.f37660r = false;
                    arrayList2.add(K2);
                } else {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb2 = new StringBuilder("earnings:");
                    if (mVar != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.f28723id.equals(mVar.f16412g)) {
                            str = mVar.f16408b;
                            sb2.append(str);
                            wallettransaction2.f28755id = sb2.toString();
                            if (!starsTransaction.pending && !starsTransaction.failed) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            wallettransaction2.pending = z10;
                            wallettransaction2.failed = starsTransaction.failed;
                            i10 = i11;
                            wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                            wallettransaction2.date = starsTransaction.date;
                            wallettransaction2.peer = new org.telegram.ui.Wallet.c4(y11);
                            arrayList2.add(org.telegram.ui.Wallet.e4.i(wallettransaction2, f4Var));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    str = starsTransaction.f28723id;
                    sb2.append(str);
                    wallettransaction2.f28755id = sb2.toString();
                    if (!starsTransaction.pending) {
                    }
                    z10 = false;
                    wallettransaction2.pending = z10;
                    wallettransaction2.failed = starsTransaction.failed;
                    i10 = i11;
                    wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                    wallettransaction2.date = starsTransaction.date;
                    wallettransaction2.peer = new org.telegram.ui.Wallet.c4(y11);
                    arrayList2.add(org.telegram.ui.Wallet.e4.i(wallettransaction2, f4Var));
                }
                i11 = i10;
                arrayList4 = arrayList;
            }
            i7 = i11;
        } else {
            i7 = i11;
            ArrayList arrayList5 = arrayListArr[i7];
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj5 = arrayList5.get(i17);
                i17++;
                int i18 = jb.f9091b;
                n41 K3 = n41.K(jb.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.f37660r = false;
                arrayList2.add(K3);
            }
        }
        if (!y10.f10064u[i7]) {
            arrayList2.add(n41.q(arrayList2.size(), 7));
            arrayList2.add(n41.q(arrayList2.size(), 7));
            arrayList2.add(n41.q(arrayList2.size(), 7));
        }
    }

    private final void f(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ((gi.p) this.f3385b).getClass();
        ArrayList n10 = y00.n();
        int size = n10.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = n10.get(i7);
            i7++;
            int i10 = gi.n.f13655b;
            n41 K = n41.K(gi.n.class);
            K.H = (r00) obj3;
            arrayList.add(K);
        }
    }

    private final void g(Object obj, Object obj2) {
        int i7;
        hi.n nVar = (hi.n) this.f3385b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = nVar.J;
        RectF rectF = nVar.f14962z0;
        hi.h hVar = nVar.f14936f;
        if (nVar.g()) {
            if (nVar.H == null) {
                runnable.run();
                return;
            }
            mt editText = hVar.getEditText();
            canvas.translate(-editText.f33032q0, 0.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, nVar.H.getWidth(), nVar.H.getHeight(), 255, 31);
            rectF.set(0.0f, 1.0f, nVar.H.getWidth(), nVar.H.getHeight() - 1);
            nVar.h(nVar.Q, canvas, rectF, 0.0f, true, (-hVar.getX()) - editText.getPaddingLeft(), ((-hVar.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
            canvas.save();
            paint.setAlpha(165);
            canvas.drawBitmap(nVar.H, 0.0f, 0.0f, paint);
            canvas.restore();
            canvas.restore();
            return;
        }
        Paint c10 = nVar.Q.c(1.0f);
        mt editText2 = hVar.getEditText();
        if (c10 != null) {
            i7 = -1;
        } else {
            i7 = -2130706433;
        }
        editText2.setHintColor(i7);
        if (c10 == null) {
            runnable.run();
            return;
        }
        mt editText3 = hVar.getEditText();
        canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
        runnable.run();
        canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c10);
        canvas.restore();
    }

    private final void h(Object obj, Object obj2) {
        hi.g2 g2Var = (hi.g2) this.f3385b;
        String str = (String) obj;
        hi.r2 r2Var = g2Var.f14526s;
        r2Var.f15276m1 = str;
        r2Var.n1 = ((Integer) obj2).intValue();
        g2Var.f14521c.D(str);
    }

    private final void i(Object obj, Object obj2) {
        w10 w10Var;
        hi.q3 q3Var = (hi.q3) this.f3385b;
        Bitmap bitmap = (Bitmap) obj2;
        if (obj != null) {
            if (q3Var.f15217p1 == null && (obj instanceof ef) && (w10Var = q3Var.f15218q1) != null) {
                w10Var.a((ef) obj);
                return;
            }
            return;
        }
        q3Var.getClass();
    }

    @Override
    public final void a(java.lang.Object r31, java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.b.a(java.lang.Object, java.lang.Object):void");
    }
}
