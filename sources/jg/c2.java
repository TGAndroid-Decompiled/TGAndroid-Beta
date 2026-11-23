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
import c8.na;
import hi.z4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Cells.n3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.x31;
public final class c2 extends dk0 {
    public int E;
    public ImageView M;
    public TextView N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public String S;
    public final i6 U;
    public final Context d;
    public final x31 f17516e;
    public final TLRPC.StickerSetCovered[] f17517f;
    public final LongSparseArray h;
    public final LongSparseArray f17518n;
    public final int f17515c = i10.f24637t0;
    public final SparseArray f17519r = new SparseArray();
    public final SparseArray f17520s = new SparseArray();
    public final SparseArray f17521w = new SparseArray();
    public final SparseIntArray f17522x = new SparseIntArray();
    public final SparseArray f17523y = new SparseArray();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final a2 T = new a2(this);

    public c2(Context context, x31 x31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, i6 i6Var) {
        this.d = context;
        this.f17516e = x31Var;
        this.f17517f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f17518n = longSparseArray2;
        this.U = i6Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(v3 v3Var, int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int A1;
        v3 v3Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = this.f17515c;
        ri d02 = ri.d0(i10);
        boolean z17 = false;
        ArrayList arrayList = d02.f26744v0[0];
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f17520s.get(i7);
        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSetCovered.set.f28519id))) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f17517f;
            if (i11 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i11] != null) {
                    TLRPC.TL_messages_stickerSet q02 = ri.d0(i10).q0(stickerSetCoveredArr[i11].set.f28519id);
                    if (q02 != null && !q02.set.archived) {
                        stickerSetCoveredArr[i11] = null;
                    } else if (stickerSetCoveredArr[i11].set.f28519id == stickerSetCovered.set.f28519id) {
                        z12 = true;
                        break;
                    }
                }
                i11++;
            } else {
                z12 = false;
                break;
            }
        }
        if (TextUtils.isEmpty(this.S)) {
            A1 = -1;
        } else {
            A1 = org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.S);
        }
        int i12 = A1;
        if (i12 >= 0) {
            v3Var2 = v3Var;
            z13 = z10;
            v3Var2.c(stickerSetCovered, z11, z13, i12, this.S.length(), z12);
        } else {
            v3Var2 = v3Var;
            z13 = z10;
            v3Var2.c(stickerSetCovered, z11, z13, 0, 0, z12);
            if (!TextUtils.isEmpty(this.S) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.S) == 0) {
                v3Var2.d(this.S.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z11) {
            d02.h1(stickerSetCovered.set.f28519id);
        }
        long j3 = stickerSetCovered.set.f28519id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j3) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long j10 = stickerSetCovered.set.f28519id;
        LongSparseArray longSparseArray2 = this.f17518n;
        if (longSparseArray2.indexOfKey(j10) >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 || z15) {
            if (z14 && v3Var2.f32242r) {
                longSparseArray.remove(stickerSetCovered.set.f28519id);
                z14 = false;
            } else if (z15 && !v3Var2.f32242r) {
                longSparseArray2.remove(stickerSetCovered.set.f28519id);
            }
        }
        if (!z12 && z14) {
            z16 = true;
        } else {
            z16 = false;
        }
        v3Var2.b(z16, z13);
        d02.s1(stickerSetCovered);
        if (i7 > 0) {
            z17 = true;
        }
        v3Var2.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r8, org.telegram.ui.Cells.v3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.c2.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.v3):void");
    }

    @Override
    public final int b() {
        return Math.max(1, this.E + 1);
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0 && this.E == 0) {
            return 5;
        }
        if (i7 == b() - 1) {
            return 4;
        }
        Object obj = this.f17520s.get(i7);
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
        x31 x31Var;
        int i7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f17519r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f17522x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f17520s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.L;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f17523y;
        sparseArray5.clear();
        this.E = 0;
        ArrayList arrayList5 = this.F;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.G;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.K;
        int i11 = !arrayList7.isEmpty();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size + size2 + i11) {
            SparseArray sparseArray6 = this.f17521w;
            x31 x31Var2 = this.f17516e;
            if (i12 < size2) {
                x31Var = x31Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i12);
                i7 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i10 = i11;
                stickerSetCovered = r62;
            } else {
                x31Var = x31Var2;
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
                        String str2 = (String) this.J.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.E + i16, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i19 = 0;
                        while (i19 < size4) {
                            String str3 = str;
                            int i20 = this.E + i16;
                            int i21 = size4;
                            int a10 = (i16 / x31Var.a()) + i13;
                            int i22 = i19;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i19);
                            sparseArray3.put(i20, document);
                            ArrayList arrayList9 = arrayList7;
                            int i23 = i16;
                            TLRPC.TL_messages_stickerSet q02 = ri.d0(this.f17515c).q0(ri.s0(document));
                            if (q02 != null) {
                                sparseArray6.put(i20, q02);
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
                    int ceil = (int) Math.ceil(i16 / x31Var.a());
                    for (int i24 = 0; i24 < ceil; i24++) {
                        sparseArray2.put(i13 + i24, Integer.valueOf(i16));
                    }
                    this.E = (x31Var.a() * ceil) + this.E;
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
                int ceil2 = (int) Math.ceil(arrayList3.size() / x31Var.a());
                sparseArray3.put(this.E, stickerSetCovered);
                if (i12 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.E, stickerSetCovered);
                }
                sparseIntArray.put(this.E, i13);
                int size5 = arrayList3.size();
                int i25 = 0;
                while (i25 < size5) {
                    int i26 = i25 + 1;
                    int i27 = ceil2;
                    int i28 = this.E + i26;
                    int a11 = i25 / x31Var.a();
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
                this.E = (x31Var.a() * i29) + 1 + this.E;
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        SparseArray sparseArray = this.f17520s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        E((v3) view, i7, false);
                        return;
                    }
                    return;
                }
                j8 j8Var = (j8) view;
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.S) && this.H.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            j8Var.a(0, stickerSet.title);
                        }
                        j8Var.c(this.S.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.I.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.S)) {
                            i10 = this.S.length();
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
            ((n3) view).setHeight(0);
            return;
        }
        ((z7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f17521w.get(i7), (String) this.f17523y.get(i7), false, false);
    }

    @Override
    public final void v(v4.f1 f1Var, int i7, List list) {
        if (list.contains(0) && f1Var.f59249f == 3) {
            E((v3) f1Var.f59245a, i7, true);
        } else {
            t(f1Var, i7);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        v3 v3Var;
        i6 i6Var = this.U;
        Context context = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            v3Var = null;
                            if (i7 == 5) {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.M = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.M.setImageResource(2131232766);
                                ImageView imageView2 = this.M;
                                int i10 = n6.Df;
                                u6.s(imageView2, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                                linearLayout.addView(this.M, na.o(-2, -2));
                                linearLayout.addView(new Space(context), na.o(-1, 15));
                                TextView textView = new TextView(context);
                                this.N = textView;
                                textView.setText(gd.N0(2131747956, null));
                                this.N.setTextSize(1, 16.0f);
                                u6.U(this.N, i10, i6Var);
                                linearLayout.addView(this.N, na.o(-2, -2));
                                linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(112.0f));
                                linearLayout.setLayoutParams(na.c(-1.0f, -1));
                                v3Var = linearLayout;
                            }
                        } else {
                            v3Var = new View(context);
                        }
                    } else {
                        v3 v3Var2 = new v3(17, this.d, this.U, true, true);
                        v3Var2.setAddOnClickListener(new z4(this, 6));
                        v3Var = v3Var2;
                    }
                } else {
                    v3Var = new j8(this.d, false, true, this.U, false);
                }
            } else {
                v3Var = new n3(context);
            }
        } else {
            b2 b2Var = new b2(0, context, i6Var, false);
            b2Var.getImageView().F0(3);
            v3Var = b2Var;
        }
        return new v4.f1(v3Var);
    }
}
