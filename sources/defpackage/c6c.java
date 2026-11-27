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
public final class c6c extends c79 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final d6c y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public c6c(d6c d6cVar, Context context) {
        this.y = d6cVar;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int r19, android.view.View r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6c.E(int, android.view.View, boolean):void");
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6c.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i;
        int i2;
        d6c d6cVar = this.y;
        int measuredWidth = d6cVar.getMeasuredWidth();
        int i3 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / hl.L(72.0f));
            this.w = max;
            t5c t5cVar = d6cVar.r;
            if (t5cVar.J != max) {
                t5cVar.x1(max);
                d6cVar.K = false;
            }
        }
        if (d6cVar.K) {
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
        ls6 d0 = ls6.d0(d6cVar.a);
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
            d6cVar.K = true;
            d6cVar.L = d0.Z();
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
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    } else {
                        ((p55) view).setText(ob6.M0(2131747491, null));
                        return;
                    }
                }
                E(i, view, false);
                return;
            }
            ((t24) view).setHeight(hl.L(82.0f));
            return;
        }
        ((x2b) view).d((TLRPC.Document) this.d.get(i), null, this.f.get(i), null, false, false);
    }

    @Override
    public final void u(f89 f89Var, int i, List list) {
        if (list.contains(0)) {
            int i2 = f89Var.f;
            if (i2 != 2 && i2 != 5) {
                return;
            }
            E(i, f89Var.a, true);
            return;
        }
        t(f89Var, i);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        d94 d94Var;
        d6c d6cVar = this.y;
        vnb vnbVar = d6cVar.Q;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                d94Var = null;
                            } else {
                                d94 d94Var2 = new d94(context, vnbVar);
                                d94Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final c6c b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        byte b = r2;
                                        c6c c6cVar = this.b;
                                        switch (b) {
                                            case 0:
                                                h94 h94Var = (h94) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = h94Var.getStickerSet();
                                                d6c d6cVar2 = c6cVar.y;
                                                LongSparseArray longSparseArray = d6cVar2.d;
                                                LongSparseArray longSparseArray2 = d6cVar2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                                    if (h94Var.r) {
                                                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                                                        d6cVar2.b.h(stickerSet);
                                                        return;
                                                    }
                                                    c6cVar.F(stickerSet, h94Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                d94 d94Var3 = (d94) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = d94Var3.getStickerSet();
                                                d6c d6cVar3 = c6cVar.y;
                                                LongSparseArray longSparseArray3 = d6cVar3.d;
                                                LongSparseArray longSparseArray4 = d6cVar3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                                    if (d94Var3.w) {
                                                        longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                                        d6cVar3.b.h(stickerSet2);
                                                        return;
                                                    }
                                                    c6cVar.F(stickerSet2, d94Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                d94Var2.getImageView().setLayerNum(3);
                                d94Var = d94Var2;
                            }
                        } else {
                            d94Var = new p55(context, vnbVar);
                        }
                    } else {
                        d94Var = new View(context);
                    }
                } else {
                    h94 h94Var = new h94(17, d6cVar.Q, this.c, true, true);
                    h94Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final c6c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            c6c c6cVar = this.b;
                            switch (b) {
                                case 0:
                                    h94 h94Var2 = (h94) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = h94Var2.getStickerSet();
                                    d6c d6cVar2 = c6cVar.y;
                                    LongSparseArray longSparseArray = d6cVar2.d;
                                    LongSparseArray longSparseArray2 = d6cVar2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                        if (h94Var2.r) {
                                            longSparseArray2.put(stickerSet.set.id, stickerSet);
                                            d6cVar2.b.h(stickerSet);
                                            return;
                                        }
                                        c6cVar.F(stickerSet, h94Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    d94 d94Var3 = (d94) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = d94Var3.getStickerSet();
                                    d6c d6cVar3 = c6cVar.y;
                                    LongSparseArray longSparseArray3 = d6cVar3.d;
                                    LongSparseArray longSparseArray4 = d6cVar3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                        if (d94Var3.w) {
                                            longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                            d6cVar3.b.h(stickerSet2);
                                            return;
                                        }
                                        c6cVar.F(stickerSet2, d94Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    d94Var = h94Var;
                }
            } else {
                d94Var = new t24(context);
            }
        } else {
            f24 f24Var = new f24(context, false, vnbVar, (byte) 3);
            f24Var.getImageView().m0(3);
            d94Var = f24Var;
        }
        return new f89(d94Var);
    }
}
