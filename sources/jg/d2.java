package jg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Cells.m3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.pj0;
public final class d2 extends pj0 {
    public int D;
    public ImageView L;
    public TextView M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public String R;
    public final g6 T;
    public final Context d;
    public final h31 f16700e;
    public final TLRPC.StickerSetCovered[] f16701f;
    public final LongSparseArray h;
    public final LongSparseArray f16702n;
    public final int f16699c = p10.f24470s0;
    public final SparseArray f16703r = new SparseArray();
    public final SparseArray f16704s = new SparseArray();
    public final SparseArray f16705w = new SparseArray();
    public final SparseIntArray f16706x = new SparseIntArray();
    public final SparseArray f16707y = new SparseArray();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final HashMap G = new HashMap();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final b2 S = new b2(this);

    public d2(Context context, h31 h31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, g6 g6Var) {
        this.d = context;
        this.f16700e = h31Var;
        this.f16701f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f16702n = longSparseArray2;
        this.T = g6Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(u3 u3Var, int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int A1;
        u3 u3Var2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10 = this.f16699c;
        ui b02 = ui.b0(i10);
        boolean z16 = false;
        ArrayList arrayList = b02.f25844u0[0];
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f16704s.get(i7);
        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSetCovered.set.f26983id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f16701f;
            if (i11 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i11] != null) {
                    TLRPC.TL_messages_stickerSet o02 = ui.b0(i10).o0(stickerSetCoveredArr[i11].set.f26983id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i11] = null;
                    } else if (stickerSetCoveredArr[i11].set.f26983id == stickerSetCovered.set.f26983id) {
                        z11 = true;
                        break;
                    }
                }
                i11++;
            } else {
                z11 = false;
                break;
            }
        }
        if (TextUtils.isEmpty(this.R)) {
            A1 = -1;
        } else {
            A1 = org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.R);
        }
        int i12 = A1;
        if (i12 >= 0) {
            u3Var2 = u3Var;
            z12 = z9;
            u3Var2.c(stickerSetCovered, z10, z12, i12, this.R.length(), z11);
        } else {
            u3Var2 = u3Var;
            z12 = z9;
            u3Var2.c(stickerSetCovered, z10, z12, 0, 0, z11);
            if (!TextUtils.isEmpty(this.R) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.R) == 0) {
                u3Var2.d(this.R.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z10) {
            b02.e1(stickerSetCovered.set.f26983id);
        }
        long j3 = stickerSetCovered.set.f26983id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j3) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        long j10 = stickerSetCovered.set.f26983id;
        LongSparseArray longSparseArray2 = this.f16702n;
        if (longSparseArray2.indexOfKey(j10) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 || z14) {
            if (z13 && u3Var2.f30576r) {
                longSparseArray.remove(stickerSetCovered.set.f26983id);
                z13 = false;
            } else if (z14 && !u3Var2.f30576r) {
                longSparseArray2.remove(stickerSetCovered.set.f26983id);
            }
        }
        if (!z11 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        u3Var2.b(z15, z12);
        b02.p1(stickerSetCovered);
        if (i7 > 0) {
            z16 = true;
        }
        u3Var2.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r8, org.telegram.ui.Cells.u3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.d2.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.u3):void");
    }

    @Override
    public final int b() {
        return Math.max(1, this.D + 1);
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0 && this.D == 0) {
            return 5;
        }
        if (i7 == b() - 1) {
            return 4;
        }
        Object obj = this.f16704s.get(i7);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return 3;
        }
        return 2;
    }

    @Override
    public final void f() {
        h31 h31Var;
        int i7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f16703r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f16706x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f16704s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.K;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f16707y;
        sparseArray5.clear();
        this.D = 0;
        ArrayList arrayList5 = this.E;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.F;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.J;
        int i11 = !arrayList7.isEmpty();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size + size2 + i11) {
            SparseArray sparseArray6 = this.f16705w;
            h31 h31Var2 = this.f16700e;
            if (i12 < size2) {
                h31Var = h31Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i12);
                i7 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i10 = i11;
                stickerSetCovered = r62;
            } else {
                h31Var = h31Var2;
                i7 = size;
                int i14 = i12 - size2;
                if (i14 < i11) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i10 = i11;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < size3) {
                        int i17 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i15);
                        int i18 = i15;
                        String str2 = (String) this.I.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.D + i16, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i19 = 0;
                        while (i19 < size4) {
                            String str3 = str;
                            int i20 = this.D + i16;
                            int i21 = size4;
                            int a10 = (i16 / h31Var.a()) + i13;
                            int i22 = i19;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i19);
                            sparseArray3.put(i20, document);
                            ArrayList arrayList9 = arrayList7;
                            int i23 = i16;
                            TLRPC.TL_messages_stickerSet o02 = ui.b0(this.f16699c).o0(ui.q0(document));
                            if (o02 != null) {
                                sparseArray6.put(i20, o02);
                            }
                            sparseIntArray.put(i20, a10);
                            i16 = i23 + 1;
                            i19 = i22 + 1;
                            str = str3;
                            size4 = i21;
                            arrayList7 = arrayList9;
                        }
                        i15 = i18 + 1;
                        size3 = i17;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i16 / h31Var.a());
                    for (int i24 = 0; i24 < ceil; i24++) {
                        sparseArray2.put(i13 + i24, Integer.valueOf(i16));
                    }
                    this.D = (h31Var.a() * ceil) + this.D;
                    i13 += ceil;
                    arrayList4 = arrayList5;
                    i12++;
                    size = i7;
                    arrayList6 = arrayList;
                    i11 = i10;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i10 = i11;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i14 - i10);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / h31Var.a());
                sparseArray3.put(this.D, stickerSetCovered);
                if (i12 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.D, stickerSetCovered);
                }
                sparseIntArray.put(this.D, i13);
                int size5 = arrayList3.size();
                int i25 = 0;
                while (i25 < size5) {
                    int i26 = i25 + 1;
                    int i27 = ceil2;
                    int i28 = this.D + i26;
                    int a11 = i25 / h31Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i28, arrayList3.get(i25));
                    sparseArray6.put(i28, stickerSetCovered);
                    sparseIntArray.put(i28, a11 + i13 + 1);
                    if (i12 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i28, stickerSetCovered);
                    }
                    i25 = i26;
                    ceil2 = i27;
                    arrayList5 = arrayList10;
                }
                int i29 = ceil2;
                arrayList4 = arrayList5;
                int i30 = i29 + 1;
                for (int i31 = 0; i31 < i30; i31++) {
                    sparseArray2.put(i13 + i31, stickerSetCovered);
                }
                this.D = (h31Var.a() * i29) + 1 + this.D;
                i13 += i30;
                i12++;
                size = i7;
                arrayList6 = arrayList;
                i11 = i10;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i12++;
            size = i7;
            arrayList6 = arrayList;
            i11 = i10;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        SparseArray sparseArray = this.f16704s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        E((u3) view, i7, false);
                        return;
                    }
                    return;
                }
                j8 j8Var = (j8) view;
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.R) && this.G.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            j8Var.a(0, stickerSet.title);
                        }
                        j8Var.c(this.R.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.H.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.R)) {
                            i10 = this.R.length();
                        } else {
                            i10 = 0;
                        }
                        j8Var.b(str, 0, null, intValue, i10);
                    }
                    j8Var.c(0, null);
                    return;
                }
                return;
            }
            ((m3) view).setHeight(0);
            return;
        }
        ((z7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f16705w.get(i7), (String) this.f16707y.get(i7), false, false);
    }

    @Override
    public final void v(v4.d1 d1Var, int i7, List list) {
        if (list.contains(0) && d1Var.f57060f == 3) {
            E((u3) d1Var.f57056a, i7, true);
        } else {
            t(d1Var, i7);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        u3 u3Var;
        g6 g6Var = this.T;
        Context context = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            u3Var = null;
                            if (i7 == 5) {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.L = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.L.setImageResource(2131232761);
                                ImageView imageView2 = this.L;
                                int i10 = l6.Af;
                                s6.s(imageView2, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                                linearLayout.addView(this.L, ha.o(-2, -2));
                                linearLayout.addView(new Space(context), ha.o(-1, 15));
                                TextView textView = new TextView(context);
                                this.M = textView;
                                textView.setText(id.M0(2131748149, null));
                                this.M.setTextSize(1, 16.0f);
                                s6.U(this.M, i10, g6Var);
                                linearLayout.addView(this.M, ha.o(-2, -2));
                                linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(112.0f));
                                linearLayout.setLayoutParams(ha.c(-1.0f, -1));
                                u3Var = linearLayout;
                            }
                        } else {
                            u3Var = new View(context);
                        }
                    } else {
                        u3 u3Var2 = new u3(17, this.d, this.T, true, true);
                        u3Var2.setAddOnClickListener(new ii.g(this, 6));
                        u3Var = u3Var2;
                    }
                } else {
                    u3Var = new j8(this.d, false, true, this.T, false);
                }
            } else {
                u3Var = new m3(context);
            }
        } else {
            c2 c2Var = new c2(0, context, g6Var, false);
            c2Var.getImageView().E0(3);
            u3Var = c2Var;
        }
        return new v4.d1(u3Var);
    }
}
