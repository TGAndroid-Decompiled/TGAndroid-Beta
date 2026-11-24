package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class c4c extends q59 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final d4c y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public c4c(d4c d4cVar, Context context) {
        this.y = d4cVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int r19, android.view.View r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4c.E(int, android.view.View, boolean):void");
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4c.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i;
        int i2;
        d4c d4cVar = this.y;
        int measuredWidth = d4cVar.getMeasuredWidth();
        int i3 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / gm.L(72.0f));
            this.w = max;
            u3c u3cVar = d4cVar.r;
            if (u3cVar.J != max) {
                u3cVar.x1(max);
                d4cVar.K = false;
            }
        }
        if (d4cVar.K) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.x = 0;
        hs6 d0 = hs6.d0(d4cVar.a);
        ArrayList arrayList2 = new ArrayList(d0.t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.n);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i4 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i4);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i4 == size) {
                    int i7 = this.x;
                    this.x = i7 + 1;
                    sparseArray.put(i7, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.x));
                int i8 = this.x;
                this.x = i8 + 1;
                int i9 = i5 + 1;
                sparseArray.put(i8, Integer.valueOf(i5));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i6 = (int) Math.ceil(stickerSetCovered.covers.size() / this.w);
                    for (int i10 = i3; i10 < stickerSetCovered.covers.size(); i10++) {
                        sparseArray.put(this.x + i10, stickerSetCovered.covers.get(i10));
                    }
                } else {
                    sparseArray.put(this.x, stickerSetCovered.cover);
                }
                int i11 = 0;
                while (true) {
                    i = this.w * i6;
                    i2 = this.x;
                    if (i11 >= i) {
                        break;
                    }
                    sparseArray2.put(i2 + i11, stickerSetCovered);
                    i11++;
                }
                this.x = i + i2;
                i5 = i9;
            }
            i4++;
            i3 = 0;
        }
        if (this.x != 0) {
            d4cVar.K = true;
            d4cVar.L = d0.Z();
        }
        f();
    }

    @Override
    public final int b() {
        return this.x + 1;
    }

    @Override
    public final int d(int i) {
        if (i == this.x) {
            return 3;
        }
        Object obj = this.d.get(i);
        if (obj != null) {
            if (obj instanceof TLRPC.Document) {
                return 0;
            }
            if (obj.equals(-1)) {
                return 4;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    } else {
                        ((l55) view).setText(jb6.M0(2131747497, null));
                        return;
                    }
                }
                E(i, view, false);
                return;
            }
            ((j34) view).setHeight(gm.L(82.0f));
            return;
        }
        ((y0b) view).d((TLRPC.Document) this.d.get(i), null, this.f.get(i), null, false, false);
    }

    @Override
    public final void w(u69 u69Var, int i, List list) {
        if (list.contains(0)) {
            int i2 = u69Var.f;
            if (i2 != 2 && i2 != 5) {
                return;
            }
            E(i, u69Var.a, true);
            return;
        }
        t(u69Var, i);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        r94 r94Var;
        d4c d4cVar = this.y;
        ylb ylbVar = d4cVar.Q;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                r94Var = null;
                            } else {
                                r94 r94Var2 = new r94(context, ylbVar);
                                r94Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final c4c b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        byte b = r2;
                                        c4c c4cVar = this.b;
                                        switch (b) {
                                            case 0:
                                                v94 v94Var = (v94) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = v94Var.getStickerSet();
                                                d4c d4cVar2 = c4cVar.y;
                                                LongSparseArray longSparseArray = d4cVar2.d;
                                                LongSparseArray longSparseArray2 = d4cVar2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                                    if (v94Var.r) {
                                                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                                                        d4cVar2.b.h(stickerSet);
                                                        return;
                                                    }
                                                    c4cVar.F(stickerSet, v94Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                r94 r94Var3 = (r94) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = r94Var3.getStickerSet();
                                                d4c d4cVar3 = c4cVar.y;
                                                LongSparseArray longSparseArray3 = d4cVar3.d;
                                                LongSparseArray longSparseArray4 = d4cVar3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                                    if (r94Var3.w) {
                                                        longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                                        d4cVar3.b.h(stickerSet2);
                                                        return;
                                                    }
                                                    c4cVar.F(stickerSet2, r94Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                r94Var2.getImageView().setLayerNum(3);
                                r94Var = r94Var2;
                            }
                        } else {
                            r94Var = new l55(context, ylbVar);
                        }
                    } else {
                        r94Var = new View(context);
                    }
                } else {
                    v94 v94Var = new v94(17, d4cVar.Q, this.c, true, true);
                    v94Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final c4c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            c4c c4cVar = this.b;
                            switch (b) {
                                case 0:
                                    v94 v94Var2 = (v94) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = v94Var2.getStickerSet();
                                    d4c d4cVar2 = c4cVar.y;
                                    LongSparseArray longSparseArray = d4cVar2.d;
                                    LongSparseArray longSparseArray2 = d4cVar2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                        if (v94Var2.r) {
                                            longSparseArray2.put(stickerSet.set.id, stickerSet);
                                            d4cVar2.b.h(stickerSet);
                                            return;
                                        }
                                        c4cVar.F(stickerSet, v94Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    r94 r94Var3 = (r94) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = r94Var3.getStickerSet();
                                    d4c d4cVar3 = c4cVar.y;
                                    LongSparseArray longSparseArray3 = d4cVar3.d;
                                    LongSparseArray longSparseArray4 = d4cVar3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                        if (r94Var3.w) {
                                            longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                            d4cVar3.b.h(stickerSet2);
                                            return;
                                        }
                                        c4cVar.F(stickerSet2, r94Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    r94Var = v94Var;
                }
            } else {
                r94Var = new j34(context);
            }
        } else {
            v24 v24Var = new v24(context, false, ylbVar, (byte) 3);
            v24Var.getImageView().m0(3);
            r94Var = v24Var;
        }
        return new u69(r94Var);
    }
}
