package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class j24 extends c79 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final o24 R;
    public final j14 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final Context h;
    public int y;
    public final SparseArray n = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseArray x = new SparseArray();
    public ArrayList F = new ArrayList();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public HashMap I = new HashMap();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final i24 P = new i24(this);
    public int Q = -1;

    public j24(o24 o24Var, Context context) {
        this.R = o24Var;
        this.h = context;
        j14 j14Var = new j14(context, o24Var.d1, new n82(this, (byte) 26), new lu3(this, (byte) 5), o24Var.a2);
        this.c = j14Var;
        j14Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), hl.L(5.0f));
        j14Var.setClipToPadding(false);
        j14Var.g3.r = false;
        j14Var.setNestedScrollingEnabled(false);
        j14Var.setDrawSelection(false);
        j14Var.setOnTouchListener(new k14(this, (byte) 2));
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i = this.y;
        if (i != 1) {
            return i + 1;
        }
        return 2;
    }

    @Override
    public final int d(int i) {
        if (this.d != 0 && i == b() - 1) {
            return 8;
        }
        if (i == this.Q) {
            return 7;
        }
        if (i == 0) {
            return 4;
        }
        if (i == 1 && this.y == 1) {
            return 5;
        }
        Object obj = this.r.get(i);
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
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        o24 o24Var = this.R;
        int i5 = o24Var.d1;
        g24 g24Var = o24Var.z0;
        this.Q = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.x;
        sparseArray3.clear();
        this.y = 0;
        int size = this.H.size() + this.F.size();
        this.c.g3.O(false);
        int i6 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (i6 != 0) {
            ArrayList arrayList = this.f;
            int i7 = this.y;
            this.y = i7 + 1;
            sparseArray2.put(i7, "search");
            if (size > 0) {
                int i8 = this.y;
                this.y = i8 + 1;
                this.Q = i8;
                sparseArray2.put(i8, "packs");
                int i9 = this.y;
                this.y = i9 + 1;
                sparseArray2.put(i9, ob6.G(this.e.count, "Stickers", new Object[0]));
                i4 = 3;
            } else {
                i4 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.y, str2);
            }
            int size2 = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size2) {
                int i12 = this.y + i11;
                int i13 = (i11 / g24Var.d) + i4;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                sparseArray2.put(i12, document);
                ArrayList arrayList2 = arrayList;
                int i14 = i10;
                TLRPC.TL_messages_stickerSet p0 = ls6.d0(i5).p0(ls6.r0(document));
                if (p0 != null) {
                    sparseArray4.put(i12, p0);
                }
                sparseIntArray.put(i12, i13);
                i11++;
                i10 = i14 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i11 / g24Var.d);
            for (int i15 = 0; i15 < ceil; i15++) {
                sparseArray.put(i4 + i15, Integer.valueOf(i11));
            }
            this.y = (ceil * g24Var.d) + this.y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            int i16 = this.y;
            this.y = i16 + 1;
            sparseArray2.put(i16, "search");
            if (size > 0) {
                int i17 = this.y;
                this.y = i17 + 1;
                this.Q = i17;
                sparseArray2.put(i17, "packs");
                i = 2;
            } else {
                i = 1;
            }
            if (!isEmpty) {
                int i18 = this.y;
                this.y = i18 + 1;
                sparseArray2.put(i18, ob6.M0(2131744531, null));
                int i19 = i + 1;
                int size3 = this.J.size();
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    i2 = i5;
                    if (i21 >= size3) {
                        break;
                    }
                    ArrayList arrayList4 = (ArrayList) this.J.get(i21);
                    boolean z4 = isEmpty;
                    String str3 = (String) this.I.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.y + i20, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z5 = z;
                    int i22 = 0;
                    while (i22 < size4) {
                        int i23 = size4;
                        int i24 = this.y + i20;
                        int i25 = size;
                        int i26 = (i20 / g24Var.d) + i19;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i22);
                        sparseArray2.put(i24, document2);
                        String str4 = str;
                        int i27 = i19;
                        TLRPC.TL_messages_stickerSet p02 = ls6.d0(i2).p0(ls6.r0(document2));
                        if (p02 != null) {
                            sparseArray4.put(i24, p02);
                        }
                        sparseIntArray.put(i24, i26);
                        i20++;
                        i22++;
                        size4 = i23;
                        size = i25;
                        arrayList4 = arrayList5;
                        i19 = i27;
                        str = str4;
                    }
                    i21++;
                    i5 = i2;
                    isEmpty = z4;
                    z = z5;
                }
                z2 = isEmpty;
                z3 = z;
                i3 = size;
                int i28 = i19;
                int ceil2 = (int) Math.ceil(i20 / g24Var.d);
                for (int i29 = 0; i29 < ceil2; i29++) {
                    sparseArray.put(i28 + i29, Integer.valueOf(i20));
                }
                this.y = (g24Var.d * ceil2) + this.y;
                i = i28 + ceil2;
            } else {
                i2 = i5;
                z2 = isEmpty;
                z3 = z;
                i3 = size;
            }
            if (z3) {
                int i30 = this.y;
                this.y = i30 + 1;
                sparseArray2.put(i30, ob6.M0(2131744532, null));
                int i31 = i + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.L.size();
                int i32 = 0;
                for (int i33 = 0; i33 < size5; i33++) {
                    int i34 = this.y + i32;
                    int i35 = (i32 / g24Var.d) + i31;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i33);
                    sparseArray2.put(i34, document3);
                    TLRPC.TL_messages_stickerSet p03 = ls6.d0(i2).p0(ls6.r0(document3));
                    if (p03 != null) {
                        sparseArray4.put(i34, p03);
                    }
                    sparseIntArray.put(i34, i35);
                    i32++;
                }
                int ceil3 = (int) Math.ceil(i32 / g24Var.d);
                for (int i36 = 0; i36 < ceil3; i36++) {
                    sparseArray.put(i31 + i36, Integer.valueOf(i32));
                }
                this.y = (ceil3 * g24Var.d) + this.y;
            }
            if (z2 && !z3 && i3 == 0) {
                this.y = 1;
            }
        }
        super.f();
    }

    @Override
    public final void t(defpackage.f89 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j24.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        o24 o24Var = this.R;
        vnb vnbVar = o24Var.a2;
        Context context = this.h;
        View view = null;
        switch (i) {
            case 0:
                view = new f24(context, true, vnbVar, (byte) 1);
                break;
            case 1:
                view = new t24(context);
                break;
            case 2:
                view = new u3b(this.h, false, false, o24Var.a2, o24Var.j2);
                break;
            case 3:
                h94 h94Var = new h94(17, o24Var.a2, this.h, false, true);
                h94Var.setAddOnClickListener(new mh3(this, (byte) 8));
                view = h94Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new r79(-1, o24Var.c1));
                break;
            case 5:
                zc zcVar = new zc((byte) 19, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232784);
                int i2 = aob.Df;
                yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-hl.L(24.0f));
                zcVar.addView(imageView, tre.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                qd4.u(16.0f, 2131747880, 1, textView, null);
                yob.X(textView, i2, vnbVar);
                zcVar.addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                zcVar.setLayoutParams(new r79(-1, -2));
                view = zcVar;
                break;
            case 7:
                r79 r79Var = new r79(-1, hl.L(79.0f));
                view = this.c;
                view.setLayoutParams(r79Var);
                break;
            case 8:
                view = new View(o24Var.getContext());
                view.setLayoutParams(new r79(-1, hl.L(68.0f)));
                break;
        }
        return new f89(view);
    }
}
