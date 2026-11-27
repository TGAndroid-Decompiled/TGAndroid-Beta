package defpackage;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class z4b extends c79 {
    public int E;
    public ImageView M;
    public TextView N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public String S;
    public final vnb U;
    public final Context d;
    public final q5c e;
    public final TLRPC.StickerSetCovered[] f;
    public final LongSparseArray h;
    public final LongSparseArray n;
    public final int c = yac.t0;
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray w = new SparseArray();
    public final SparseIntArray x = new SparseIntArray();
    public final SparseArray y = new SparseArray();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final y4b T = new y4b(this);

    public z4b(Context context, q5c q5cVar, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, vnb vnbVar) {
        this.d = context;
        this.e = q5cVar;
        this.f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.n = longSparseArray2;
        this.U = vnbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void E(defpackage.h94 r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4b.E(h94, int, boolean):void");
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r8, defpackage.h94 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4b.F(org.telegram.tgnet.TLRPC$StickerSetCovered, h94):void");
    }

    @Override
    public final int b() {
        return Math.max(1, this.E + 1);
    }

    @Override
    public final int d(int i) {
        if (i == 0 && this.E == 0) {
            return 5;
        }
        if (i == b() - 1) {
            return 4;
        }
        Object obj = this.s.get(i);
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
        q5c q5cVar;
        int i;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.L;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.y;
        sparseArray5.clear();
        this.E = 0;
        ArrayList arrayList5 = this.F;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.G;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.K;
        int i3 = !arrayList7.isEmpty();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size + size2 + i3) {
            SparseArray sparseArray6 = this.w;
            q5c q5cVar2 = this.e;
            if (i4 < size2) {
                q5cVar = q5cVar2;
                ?? r6 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i4);
                i = size;
                arrayList3 = r6.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i2 = i3;
                stickerSetCovered = r6;
            } else {
                q5cVar = q5cVar2;
                i = size;
                int i6 = i4 - size2;
                if (i6 < i3) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i2 = i3;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size3) {
                        int i9 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i7);
                        int i10 = i7;
                        String str2 = (String) this.J.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.E + i8, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i11 = 0;
                        while (i11 < size4) {
                            String str3 = str;
                            int i12 = this.E + i8;
                            int i13 = size4;
                            int a = (i8 / q5cVar.a()) + i5;
                            int i14 = i11;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i11);
                            sparseArray3.put(i12, document);
                            ArrayList arrayList9 = arrayList7;
                            int i15 = i8;
                            TLRPC.TL_messages_stickerSet p0 = ls6.d0(this.c).p0(ls6.r0(document));
                            if (p0 != null) {
                                sparseArray6.put(i12, p0);
                            }
                            sparseIntArray.put(i12, a);
                            i8 = i15 + 1;
                            i11 = i14 + 1;
                            str = str3;
                            size4 = i13;
                            arrayList7 = arrayList9;
                        }
                        i7 = i10 + 1;
                        size3 = i9;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i8 / q5cVar.a());
                    for (int i16 = 0; i16 < ceil; i16++) {
                        sparseArray2.put(i5 + i16, Integer.valueOf(i8));
                    }
                    this.E = (q5cVar.a() * ceil) + this.E;
                    i5 += ceil;
                    arrayList4 = arrayList5;
                    i4++;
                    size = i;
                    arrayList6 = arrayList;
                    i3 = i2;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i2 = i3;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i6 - i2);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / q5cVar.a());
                sparseArray3.put(this.E, stickerSetCovered);
                if (i4 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.E, stickerSetCovered);
                }
                sparseIntArray.put(this.E, i5);
                int size5 = arrayList3.size();
                int i17 = 0;
                while (i17 < size5) {
                    int i18 = i17 + 1;
                    int i19 = ceil2;
                    int i20 = this.E + i18;
                    int a2 = i17 / q5cVar.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i20, arrayList3.get(i17));
                    sparseArray6.put(i20, stickerSetCovered);
                    sparseIntArray.put(i20, a2 + i5 + 1);
                    if (i4 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i20, stickerSetCovered);
                    }
                    i17 = i18;
                    ceil2 = i19;
                    arrayList5 = arrayList10;
                }
                int i21 = ceil2;
                arrayList4 = arrayList5;
                int i22 = i21 + 1;
                for (int i23 = 0; i23 < i22; i23++) {
                    sparseArray2.put(i5 + i23, stickerSetCovered);
                }
                this.E = (q5cVar.a() * i21) + 1 + this.E;
                i5 += i22;
                i4++;
                size = i;
                arrayList6 = arrayList;
                i3 = i2;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i4++;
            size = i;
            arrayList6 = arrayList;
            i3 = i2;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.f();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        SparseArray sparseArray = this.s;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        E((h94) view, i, false);
                        return;
                    }
                    return;
                }
                u3b u3bVar = (u3b) view;
                Object obj = sparseArray.get(i);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.S) && this.H.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            u3bVar.a(0, stickerSet.title);
                        }
                        u3bVar.c(this.S.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.I.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.S)) {
                            i2 = this.S.length();
                        } else {
                            i2 = 0;
                        }
                        u3bVar.b(str, 0, null, intValue, i2);
                    }
                    u3bVar.c(0, null);
                    return;
                }
                return;
            }
            ((t24) view).setHeight(0);
            return;
        }
        ((x2b) view).d((TLRPC.Document) sparseArray.get(i), null, this.w.get(i), (String) this.y.get(i), false, false);
    }

    @Override
    public final void u(f89 f89Var, int i, List list) {
        if (list.contains(0) && f89Var.f == 3) {
            E((h94) f89Var.a, i, true);
        } else {
            t(f89Var, i);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        vnb vnbVar = this.U;
        Context context = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            view = null;
                            if (i == 5) {
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.M = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.M.setImageResource(2131232784);
                                ImageView imageView2 = this.M;
                                int i2 = aob.Df;
                                yob.s(imageView2, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                                linearLayout.addView(this.M, tre.o(-2, -2));
                                linearLayout.addView(new Space(context), tre.o(-1, 15));
                                TextView textView = new TextView(context);
                                this.N = textView;
                                textView.setText(ob6.M0(2131747880, null));
                                this.N.setTextSize(1, 16.0f);
                                yob.X(this.N, i2, vnbVar);
                                linearLayout.addView(this.N, tre.o(-2, -2));
                                linearLayout.setMinimumHeight(hl.L(112.0f));
                                linearLayout.setLayoutParams(tre.c(-1.0f, -1));
                                view = linearLayout;
                            }
                        } else {
                            view = new View(context);
                        }
                    } else {
                        h94 h94Var = new h94(17, this.U, this.d, true, true);
                        h94Var.setAddOnClickListener(new kla(this, (byte) 12));
                        view = h94Var;
                    }
                } else {
                    view = new u3b(this.d, false, true, this.U, false);
                }
            } else {
                view = new t24(context);
            }
        } else {
            f24 f24Var = new f24(context, false, vnbVar, (byte) 2);
            f24Var.getImageView().m0(3);
            view = f24Var;
        }
        return new f89(view);
    }
}
