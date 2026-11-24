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
public final class c2c extends n39 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final d2c y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public c2c(d2c d2cVar, Context context) {
        this.y = d2cVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int r19, android.view.View r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2c.E(int, android.view.View, boolean):void");
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2c.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i;
        int i2;
        d2c d2cVar = this.y;
        int measuredWidth = d2cVar.getMeasuredWidth();
        int i3 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / gl.L(72.0f));
            this.w = max;
            u1c u1cVar = d2cVar.r;
            if (u1cVar.J != max) {
                u1cVar.x1(max);
                d2cVar.K = false;
            }
        }
        if (d2cVar.K) {
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
        hq6 d0 = hq6.d0(d2cVar.a);
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
            d2cVar.K = true;
            d2cVar.L = d0.Z();
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
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    } else {
                        ((l35) view).setText(k96.M0(2131747571, null));
                        return;
                    }
                }
                E(i, view, false);
                return;
            }
            ((y14) view).setHeight(gl.L(82.0f));
            return;
        }
        ((xya) view).d((TLRPC.Document) this.d.get(i), null, this.f.get(i), null, false, false);
    }

    @Override
    public final void u(s49 s49Var, int i, List list) {
        if (list.contains(0)) {
            int i2 = s49Var.f;
            if (i2 != 2 && i2 != 5) {
                return;
            }
            E(i, s49Var.a, true);
            return;
        }
        t(s49Var, i);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        i84 i84Var;
        d2c d2cVar = this.y;
        wjb wjbVar = d2cVar.Q;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                i84Var = null;
                            } else {
                                i84 i84Var2 = new i84(context, wjbVar);
                                i84Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final c2c b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        byte b = r2;
                                        c2c c2cVar = this.b;
                                        switch (b) {
                                            case 0:
                                                m84 m84Var = (m84) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = m84Var.getStickerSet();
                                                d2c d2cVar2 = c2cVar.y;
                                                LongSparseArray longSparseArray = d2cVar2.d;
                                                LongSparseArray longSparseArray2 = d2cVar2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                                    if (m84Var.r) {
                                                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                                                        d2cVar2.b.h(stickerSet);
                                                        return;
                                                    }
                                                    c2cVar.F(stickerSet, m84Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                i84 i84Var3 = (i84) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = i84Var3.getStickerSet();
                                                d2c d2cVar3 = c2cVar.y;
                                                LongSparseArray longSparseArray3 = d2cVar3.d;
                                                LongSparseArray longSparseArray4 = d2cVar3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                                    if (i84Var3.w) {
                                                        longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                                        d2cVar3.b.h(stickerSet2);
                                                        return;
                                                    }
                                                    c2cVar.F(stickerSet2, i84Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                i84Var2.getImageView().setLayerNum(3);
                                i84Var = i84Var2;
                            }
                        } else {
                            i84Var = new l35(context, wjbVar);
                        }
                    } else {
                        i84Var = new View(context);
                    }
                } else {
                    m84 m84Var = new m84(17, d2cVar.Q, this.c, true, true);
                    m84Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final c2c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            c2c c2cVar = this.b;
                            switch (b) {
                                case 0:
                                    m84 m84Var2 = (m84) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = m84Var2.getStickerSet();
                                    d2c d2cVar2 = c2cVar.y;
                                    LongSparseArray longSparseArray = d2cVar2.d;
                                    LongSparseArray longSparseArray2 = d2cVar2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                        if (m84Var2.r) {
                                            longSparseArray2.put(stickerSet.set.id, stickerSet);
                                            d2cVar2.b.h(stickerSet);
                                            return;
                                        }
                                        c2cVar.F(stickerSet, m84Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    i84 i84Var3 = (i84) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = i84Var3.getStickerSet();
                                    d2c d2cVar3 = c2cVar.y;
                                    LongSparseArray longSparseArray3 = d2cVar3.d;
                                    LongSparseArray longSparseArray4 = d2cVar3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                        if (i84Var3.w) {
                                            longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                            d2cVar3.b.h(stickerSet2);
                                            return;
                                        }
                                        c2cVar.F(stickerSet2, i84Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    i84Var = m84Var;
                }
            } else {
                i84Var = new y14(context);
            }
        } else {
            k14 k14Var = new k14(context, false, wjbVar, (byte) 3);
            k14Var.getImageView().m0(3);
            i84Var = k14Var;
        }
        return new s49(i84Var);
    }
}
