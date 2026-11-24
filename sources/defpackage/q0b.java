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
public final class q0b extends n39 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final u0b r;

    public q0b(u0b u0bVar, Context context) {
        this.r = u0bVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i) {
        u0b u0bVar = this.r;
        if (u0bVar.Q1 != null) {
            Object obj = this.e.get(i);
            if (obj != null) {
                if (!(obj instanceof TLRPC.Document)) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
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
        u0b u0bVar = this.r;
        int i4 = 0;
        if (u0bVar.Q1 != null) {
            int measuredWidth = u0bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gl.q.x;
            }
            int L = measuredWidth / gl.L(72.0f);
            this.d = L;
            u0bVar.G1.x1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i5 = 0; i5 < u0bVar.Q1.size(); i5++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) u0bVar.Q1.get(i5);
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
            ArrayList arrayList = u0bVar.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
                if (tL_messages_stickerSet != null) {
                    i4 = tL_messages_stickerSet.documents.size();
                }
                this.h = i4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u0bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = u0bVar.M1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override
    public final void r(int i) {
        ArrayList arrayList = this.r.S1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.r(i);
    }

    @Override
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        u0b u0bVar = this.r;
        ArrayList arrayList = u0bVar.Q1;
        if (arrayList != null) {
            int i2 = s49Var.f;
            SparseArray sparseArray = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ((m84) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((y14) view).setHeight(gl.L(82.0f));
                return;
            }
            ((xya) view).d((TLRPC.Document) sparseArray.get(i), null, this.f.get(i), null, false, false);
        } else if (u0bVar.R1 != null) {
            ((xya) view).setSticker((s3a) u0bVar.S1.get(i));
        } else if (s49Var.f != 3) {
            xya xyaVar = (xya) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
            if (tL_messages_stickerSet != null) {
                xyaVar.d(tL_messages_stickerSet.documents.get(i), null, u0bVar.M1, null, u0bVar.b2, u0bVar.L1);
                xyaVar.K.setOnClickListener(new b99(this, xyaVar, (byte) 21));
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        u0b u0bVar = this.r;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        frameLayout = null;
                    } else {
                        wjb wjbVar = u0bVar.J0;
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.a = wjbVar;
                        View view = new View(context);
                        frameLayout2.c = view;
                        int L = gl.L(28.0f);
                        int i2 = bkb.Df;
                        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.12f, bkb.v0(i2, wjbVar)));
                        frameLayout2.b = b0;
                        Drawable d = b00.d(context, 2131231082);
                        zkb.x(frameLayout2, d, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
                        fm2 fm2Var = new fm2(b0, d);
                        int L2 = gl.L(56.0f);
                        int L3 = gl.L(56.0f);
                        fm2Var.h = L2;
                        fm2Var.n = L3;
                        int L4 = gl.L(24.0f);
                        int L5 = gl.L(24.0f);
                        fm2Var.e = L4;
                        fm2Var.f = L5;
                        view.setBackground(fm2Var);
                        ote.a(view);
                        frameLayout2.addView(view, nme.e(56, 56, 17));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m84(8, u0bVar.J0, this.c, true, false);
                }
            } else {
                frameLayout = new y14(context);
            }
        } else {
            p0b p0bVar = new p0b(this, context, u0bVar.J0);
            p0bVar.getImageView().m0(7);
            frameLayout = p0bVar;
        }
        return new s49(frameLayout);
    }
}
