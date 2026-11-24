package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class t2b extends q59 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final x2b r;

    public t2b(x2b x2bVar, Context context) {
        this.r = x2bVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i) {
        x2b x2bVar = this.r;
        if (x2bVar.Q1 != null) {
            Object obj = this.e.get(i);
            if (obj != null) {
                if (!(obj instanceof TLRPC.Document)) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() == i) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        List list;
        int i;
        int i2;
        int i3;
        x2b x2bVar = this.r;
        int i4 = 0;
        if (x2bVar.Q1 != null) {
            int measuredWidth = x2bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gm.q.x;
            }
            int L = measuredWidth / gm.L(72.0f);
            this.d = L;
            x2bVar.G1.x1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i5 = 0; i5 < x2bVar.Q1.size(); i5++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) x2bVar.Q1.get(i5);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i6 = this.h;
                    this.h = i6 + 1;
                    sparseArray.put(i6, Integer.valueOf(i5));
                    int i7 = this.h / this.d;
                    if (!list.isEmpty()) {
                        i = (int) Math.ceil(list.size() / this.d);
                        for (int i8 = 0; i8 < list.size(); i8++) {
                            sparseArray.put(this.h + i8, list.get(i8));
                        }
                    } else {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i = 1;
                    }
                    int i9 = 0;
                    while (true) {
                        i2 = this.d * i;
                        i3 = this.h;
                        if (i9 >= i2) {
                            break;
                        }
                        sparseArray2.put(i3 + i9, stickerSetCovered);
                        i9++;
                    }
                    this.h = i2 + i3;
                }
            }
        } else {
            ArrayList arrayList = x2bVar.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
                if (tL_messages_stickerSet != null) {
                    i4 = tL_messages_stickerSet.documents.size();
                }
                this.h = i4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = x2bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = x2bVar.M1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override
    public final void s(int i) {
        ArrayList arrayList = this.r.S1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i);
    }

    @Override
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        x2b x2bVar = this.r;
        ArrayList arrayList = x2bVar.Q1;
        if (arrayList != null) {
            int i2 = u69Var.f;
            SparseArray sparseArray = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ((v94) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((j34) view).setHeight(gm.L(82.0f));
                return;
            }
            ((y0b) view).d((TLRPC.Document) sparseArray.get(i), null, this.f.get(i), null, false, false);
        } else if (x2bVar.R1 != null) {
            ((y0b) view).setSticker((t5a) x2bVar.S1.get(i));
        } else if (u69Var.f != 3) {
            y0b y0bVar = (y0b) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
            if (tL_messages_stickerSet != null) {
                y0bVar.d(tL_messages_stickerSet.documents.get(i), null, x2bVar.M1, null, x2bVar.b2, x2bVar.L1);
                y0bVar.K.setOnClickListener(new r39(this, y0bVar, (byte) 22));
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        x2b x2bVar = this.r;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        frameLayout = null;
                    } else {
                        ylb ylbVar = x2bVar.J0;
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.a = ylbVar;
                        View view = new View(context);
                        frameLayout2.c = view;
                        int L = gm.L(28.0f);
                        int i2 = cmb.Df;
                        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.12f, cmb.v0(i2, ylbVar)));
                        frameLayout2.b = b0;
                        Drawable d = b10.d(context, 2131231083);
                        anb.x(frameLayout2, d, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
                        sn2 sn2Var = new sn2(b0, d);
                        int L2 = gm.L(56.0f);
                        int L3 = gm.L(56.0f);
                        sn2Var.h = L2;
                        sn2Var.n = L3;
                        int L4 = gm.L(24.0f);
                        int L5 = gm.L(24.0f);
                        sn2Var.e = L4;
                        sn2Var.f = L5;
                        view.setBackground(sn2Var);
                        rve.a(view);
                        frameLayout2.addView(view, qoe.e(56, 56, 17));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new v94(8, x2bVar.J0, this.c, true, false);
                }
            } else {
                frameLayout = new j34(context);
            }
        } else {
            s2b s2bVar = new s2b(this, context, x2bVar.J0);
            s2bVar.getImageView().m0(7);
            frameLayout = s2bVar;
        }
        return new u69(frameLayout);
    }
}
