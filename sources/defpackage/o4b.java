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
public final class o4b extends c79 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final s4b r;

    public o4b(s4b s4bVar, Context context) {
        this.r = s4bVar;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i) {
        s4b s4bVar = this.r;
        if (s4bVar.Q1 != null) {
            Object obj = this.e.get(i);
            if (obj != null) {
                if (!(obj instanceof TLRPC.Document)) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
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
        s4b s4bVar = this.r;
        int i4 = 0;
        if (s4bVar.Q1 != null) {
            int measuredWidth = s4bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = hl.q.x;
            }
            int L = measuredWidth / hl.L(72.0f);
            this.d = L;
            s4bVar.G1.x1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i5 = 0; i5 < s4bVar.Q1.size(); i5++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s4bVar.Q1.get(i5);
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
            ArrayList arrayList = s4bVar.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
                if (tL_messages_stickerSet != null) {
                    i4 = tL_messages_stickerSet.documents.size();
                }
                this.h = i4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s4bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = s4bVar.M1.set;
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
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        s4b s4bVar = this.r;
        ArrayList arrayList = s4bVar.Q1;
        if (arrayList != null) {
            int i2 = f89Var.f;
            SparseArray sparseArray = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ((h94) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((t24) view).setHeight(hl.L(82.0f));
                return;
            }
            ((x2b) view).d((TLRPC.Document) sparseArray.get(i), null, this.f.get(i), null, false, false);
        } else if (s4bVar.R1 != null) {
            ((x2b) view).setSticker((k7a) s4bVar.S1.get(i));
        } else if (f89Var.f != 3) {
            x2b x2bVar = (x2b) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
            if (tL_messages_stickerSet != null) {
                x2bVar.d(tL_messages_stickerSet.documents.get(i), null, s4bVar.M1, null, s4bVar.b2, s4bVar.L1);
                x2bVar.K.setOnClickListener(new jy8(this, x2bVar, (byte) 24));
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        s4b s4bVar = this.r;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        frameLayout = null;
                    } else {
                        vnb vnbVar = s4bVar.J0;
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.a = vnbVar;
                        View view = new View(context);
                        frameLayout2.c = view;
                        int L = hl.L(28.0f);
                        int i2 = aob.Ef;
                        ShapeDrawable b0 = aob.b0(L, aob.p1(0.12f, aob.v0(i2, vnbVar)));
                        frameLayout2.b = b0;
                        Drawable e = c00.e(context, 2131231082);
                        yob.x(frameLayout2, e, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                        zm2 zm2Var = new zm2(b0, e);
                        int L2 = hl.L(56.0f);
                        int L3 = hl.L(56.0f);
                        zm2Var.h = L2;
                        zm2Var.n = L3;
                        int L4 = hl.L(24.0f);
                        int L5 = hl.L(24.0f);
                        zm2Var.e = L4;
                        zm2Var.f = L5;
                        view.setBackground(zm2Var);
                        iye.a(view);
                        frameLayout2.addView(view, tre.e(56, 56, 17));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new h94(8, s4bVar.J0, this.c, true, false);
                }
            } else {
                frameLayout = new t24(context);
            }
        } else {
            n4b n4bVar = new n4b(this, context, s4bVar.J0);
            n4bVar.getImageView().m0(7);
            frameLayout = n4bVar;
        }
        return new f89(frameLayout);
    }
}
