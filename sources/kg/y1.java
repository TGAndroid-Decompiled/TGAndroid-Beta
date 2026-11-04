package kg;

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
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i8;
import org.telegram.ui.Cells.m3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.sj0;
public final class y1 extends sj0 {
    public int E;
    public ImageView M;
    public TextView N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public String S;
    public final e6 U;
    public final Context d;
    public final b31 f17235e;
    public final TLRPC.StickerSetCovered[] f17236f;
    public final LongSparseArray h;
    public final LongSparseArray f17237n;
    public final int f17234c = h10.f22829t0;
    public final SparseArray f17238r = new SparseArray();
    public final SparseArray f17239s = new SparseArray();
    public final SparseArray f17240w = new SparseArray();
    public final SparseIntArray f17241x = new SparseIntArray();
    public final SparseArray f17242y = new SparseArray();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final w1 T = new w1(this);

    public y1(Context context, b31 b31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, e6 e6Var) {
        this.d = context;
        this.f17235e = b31Var;
        this.f17236f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f17237n = longSparseArray2;
        this.U = e6Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E(u3 u3Var, int i3, boolean z10) {
        boolean z11;
        boolean z12;
        int A1;
        u3 u3Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = this.f17234c;
        li b02 = li.b0(i10);
        boolean z17 = false;
        ArrayList arrayList = b02.f24055v0[0];
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f17239s.get(i3);
        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSetCovered.set.f27028id))) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f17236f;
            if (i11 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i11] != null) {
                    TLRPC.TL_messages_stickerSet o02 = li.b0(i10).o0(stickerSetCoveredArr[i11].set.f27028id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i11] = null;
                    } else if (stickerSetCoveredArr[i11].set.f27028id == stickerSetCovered.set.f27028id) {
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
            u3Var2 = u3Var;
            z13 = z10;
            u3Var2.c(stickerSetCovered, z11, z13, i12, this.S.length(), z12);
        } else {
            u3Var2 = u3Var;
            z13 = z10;
            u3Var2.c(stickerSetCovered, z11, z13, 0, 0, z12);
            if (!TextUtils.isEmpty(this.S) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.S) == 0) {
                u3Var2.d(this.S.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z11) {
            b02.e1(stickerSetCovered.set.f27028id);
        }
        long j10 = stickerSetCovered.set.f27028id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j10) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long j11 = stickerSetCovered.set.f27028id;
        LongSparseArray longSparseArray2 = this.f17237n;
        if (longSparseArray2.indexOfKey(j11) >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 || z15) {
            if (z14 && u3Var2.f30644r) {
                longSparseArray.remove(stickerSetCovered.set.f27028id);
                z14 = false;
            } else if (z15 && !u3Var2.f30644r) {
                longSparseArray2.remove(stickerSetCovered.set.f27028id);
            }
        }
        if (!z12 && z14) {
            z16 = true;
        } else {
            z16 = false;
        }
        u3Var2.b(z16, z13);
        b02.p1(stickerSetCovered);
        if (i3 > 0) {
            z17 = true;
        }
        u3Var2.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r8, org.telegram.ui.Cells.u3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: kg.y1.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.u3):void");
    }

    @Override
    public final int b() {
        return Math.max(1, this.E + 1);
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0 && this.E == 0) {
            return 5;
        }
        if (i3 == b() - 1) {
            return 4;
        }
        Object obj = this.f17239s.get(i3);
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
        b31 b31Var;
        int i3;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f17238r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f17241x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f17239s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.L;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f17242y;
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
            SparseArray sparseArray6 = this.f17240w;
            b31 b31Var2 = this.f17235e;
            if (i12 < size2) {
                b31Var = b31Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i12);
                i3 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i10 = i11;
                stickerSetCovered = r62;
            } else {
                b31Var = b31Var2;
                i3 = size;
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
                            int a10 = (i16 / b31Var.a()) + i13;
                            int i22 = i19;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i19);
                            sparseArray3.put(i20, document);
                            ArrayList arrayList9 = arrayList7;
                            int i23 = i16;
                            TLRPC.TL_messages_stickerSet o02 = li.b0(this.f17234c).o0(li.q0(document));
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
                    int ceil = (int) Math.ceil(i16 / b31Var.a());
                    for (int i24 = 0; i24 < ceil; i24++) {
                        sparseArray2.put(i13 + i24, Integer.valueOf(i16));
                    }
                    this.E = (b31Var.a() * ceil) + this.E;
                    i13 += ceil;
                    arrayList4 = arrayList5;
                    i12++;
                    size = i3;
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
                int ceil2 = (int) Math.ceil(arrayList3.size() / b31Var.a());
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
                    int a11 = i25 / b31Var.a();
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
                this.E = (b31Var.a() * i29) + 1 + this.E;
                i13 += i30;
                i12++;
                size = i3;
                arrayList6 = arrayList;
                i11 = i10;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i12++;
            size = i3;
            arrayList6 = arrayList;
            i11 = i10;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.f();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        SparseArray sparseArray = this.f17239s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        E((u3) view, i3, false);
                        return;
                    }
                    return;
                }
                i8 i8Var = (i8) view;
                Object obj = sparseArray.get(i3);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.S) && this.H.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            i8Var.a(0, stickerSet.title);
                        }
                        i8Var.c(this.S.length(), tL_messages_stickerSet.set.short_name);
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
                        i8Var.b(str, 0, null, intValue, i10);
                    }
                    i8Var.c(0, null);
                    return;
                }
                return;
            }
            ((m3) view).setHeight(0);
            return;
        }
        ((y7) view).d((TLRPC.Document) sparseArray.get(i3), null, this.f17240w.get(i3), (String) this.f17242y.get(i3), false, false);
    }

    @Override
    public final void v(u4.d1 d1Var, int i3, List list) {
        if (list.contains(0) && d1Var.f55544f == 3) {
            E((u3) d1Var.f55540a, i3, true);
        } else {
            t(d1Var, i3);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        u3 u3Var;
        e6 e6Var = this.U;
        Context context = this.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            u3Var = null;
                            if (i3 == 5) {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.M = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.M.setImageResource(2131232759);
                                ImageView imageView2 = this.M;
                                int i10 = k6.Af;
                                r6.t(imageView2, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                                linearLayout.addView(this.M, mf.o(-2, -2));
                                linearLayout.addView(new Space(context), mf.o(-1, 15));
                                TextView textView = new TextView(context);
                                this.N = textView;
                                textView.setText(bd.M0(2131748157, null));
                                this.N.setTextSize(1, 16.0f);
                                r6.V(this.N, i10, e6Var);
                                linearLayout.addView(this.N, mf.o(-2, -2));
                                linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(112.0f));
                                linearLayout.setLayoutParams(mf.c(-1.0f, -1));
                                u3Var = linearLayout;
                            }
                        } else {
                            u3Var = new View(context);
                        }
                    } else {
                        u3 u3Var2 = new u3(17, this.d, this.U, true, true);
                        u3Var2.setAddOnClickListener(new ii.m(this, 9));
                        u3Var = u3Var2;
                    }
                } else {
                    u3Var = new i8(this.d, false, true, this.U, false);
                }
            } else {
                u3Var = new m3(context);
            }
        } else {
            x1 x1Var = new x1(0, context, e6Var, false);
            x1Var.getImageView().E0(3);
            u3Var = x1Var;
        }
        return new u4.d1(u3Var);
    }
}
