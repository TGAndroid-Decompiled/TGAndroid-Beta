package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class w24 extends q59 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final e34 w;

    public w24(e34 e34Var, Context context) {
        this.w = e34Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return u69Var.a instanceof r59;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i) {
        int indexOf;
        int i2;
        e34 e34Var = this.w;
        ArrayList arrayList = e34Var.e1;
        Object obj = this.h.get(i);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i == 0) {
                i = 1;
            }
            if (this.d == 0) {
                int measuredWidth = e34Var.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = gm.q.x;
                }
                this.d = measuredWidth / gm.L(72.0f);
            }
            int i3 = this.r.get(i, Integer.MIN_VALUE);
            if (i3 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i2 = e34Var.F1;
            } else {
                Object obj2 = this.e.get(i3);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return e34Var.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return e34Var.G1;
                    }
                    return e34Var.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i2 = e34Var.F1;
            }
            return indexOf + i2;
        }
        int i4 = e34Var.H1;
        if (i4 >= 0) {
            return i4;
        }
        int i5 = e34Var.G1;
        if (i5 >= 0) {
            return i5;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w24.G():void");
    }

    @Override
    public final int b() {
        int i = this.s;
        if (i != 0) {
            return i + 1;
        }
        return 0;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 4;
        }
        Object obj = this.h.get(i);
        if (obj != null) {
            if (obj instanceof TLRPC.Document) {
                if (obj instanceof TLRPC.TL_documentEmpty) {
                    return 7;
                }
                return 0;
            } else if (obj instanceof String) {
                if ("trend1".equals(obj)) {
                    return 5;
                }
                if ("trend2".equals(obj)) {
                    return 6;
                }
                return 3;
            } else {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void f() {
        G();
        super.f();
    }

    @Override
    public final void q(int i, int i2) {
        G();
        super.q(i, i2);
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        TLRPC.Chat chat;
        String str;
        int i3;
        e34 e34Var = this.w;
        int i4 = e34Var.d1;
        int i5 = u69Var.f;
        View view = u69Var.a;
        SparseArray sparseArray = this.h;
        if (i5 != 0) {
            int i6 = 1;
            boolean z = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 5) {
                            w1b w1bVar = (w1b) view;
                            if (hs6.d0(i4).s0) {
                                i3 = 2131750769;
                            } else {
                                i3 = 2131750770;
                            }
                            w1bVar.b(jb6.M0(i3, null), 2131232102, jb6.M0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    t1b t1bVar = (t1b) view;
                    if (i != this.s - 1) {
                        z = false;
                    }
                    t1bVar.setIsLast(z);
                    return;
                }
                w1b w1bVar2 = (w1b) view;
                w1bVar2.setHeaderOnClick(null);
                if (i == e34Var.g1) {
                    if (e34Var.h1 && e34Var.i1 == null) {
                        i2 = 0;
                    } else if (e34Var.i1 != null) {
                        i2 = 2131232243;
                    } else {
                        i2 = 2131232102;
                    }
                    if (e34Var.K1 != null) {
                        chat = oc7.r1(i4).L0(Long.valueOf(e34Var.K1.id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    w1bVar2.a(i2, jb6.a0("CurrentGroupStickers", null, 2131751631, str));
                    return;
                }
                Object obj = sparseArray.get(i);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        w1bVar2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !e34Var.S2) {
                            w1bVar2.setEdit(new View.OnClickListener(this) {
                                public final w24 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    byte b = r3;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                    w24 w24Var = this.b;
                                    switch (b) {
                                        case 0:
                                            w24Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                            return;
                                        default:
                                            w24Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        w1bVar2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final w24 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b = r3;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                w24 w24Var = this.b;
                                switch (b) {
                                    case 0:
                                        w24Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                        return;
                                    default:
                                        w24Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == e34Var.k1) {
                    w1bVar2.b(jb6.M0(2131746097, null), 2131232102, jb6.M0(2131752000, null), 0, 0);
                    return;
                } else if (obj == e34Var.l1) {
                    w1bVar2.a(0, jb6.M0(2131750778, null));
                    return;
                } else if (obj == e34Var.m1) {
                    w1bVar2.a(0, jb6.M0(2131746682, null));
                    return;
                } else {
                    return;
                }
            }
            j34 j34Var = (j34) view;
            if (i == this.s) {
                int i7 = this.r.get(i - 1, Integer.MIN_VALUE);
                if (i7 == Integer.MIN_VALUE) {
                    j34Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i7);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = e34Var.k1;
                    } else {
                        arrayList = e34Var.l1;
                    }
                }
                if (arrayList == null) {
                    j34Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    j34Var.setHeight(gm.L(8.0f));
                    return;
                } else {
                    int height = e34Var.h.getHeight() - (gm.L(82.0f) * ((int) Math.ceil(arrayList.size() / this.d)));
                    if (height > 0) {
                        i6 = height;
                    }
                    j34Var.setHeight(i6);
                    return;
                }
            }
            j34Var.setHeight(gm.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
        y0b y0bVar = (y0b) view;
        y0bVar.d(document, null, this.n.get(i), null, false, false);
        y0bVar.setRecent(e34Var.k1.contains(document));
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        e34 e34Var = this.w;
        ylb ylbVar = e34Var.a2;
        Context context = this.c;
        FrameLayout frameLayout = null;
        switch (i) {
            case 0:
                frameLayout = new v24(context, true, ylbVar, (byte) 0);
                break;
            case 1:
                frameLayout = new j34(context);
                break;
            case 2:
                w1b w1bVar = new w1b(this.c, false, false, e34Var.a2, e34Var.j2);
                w1bVar.setOnIconClickListener(new tf3(this, w1bVar, (byte) 9));
                frameLayout = w1bVar;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                anb.X(textView, cmb.Nf, null);
                ts2.q(14.0f, 1, 2131749153, textView, null);
                linearLayout.addView(textView, qoe.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.a = textView2;
                textView2.setPadding(gm.L(17.0f), 0, gm.L(17.0f), 0);
                textView2.setGravity(17);
                td4.x(textView2, cmb.Ii, null, 1, 14.0f);
                textView2.setBackground(ulb.f(cmb.Ei, 4.0f));
                textView2.setText(jb6.M0(2131752053, null).toUpperCase());
                linearLayout.addView(textView2, qoe.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final w24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        w24 w24Var = this.b;
                        switch (b) {
                            case 0:
                                e34 e34Var2 = w24Var.w;
                                f24 f24Var = e34Var2.u1;
                                if (f24Var != null) {
                                    f24Var.y(e34Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                e34 e34Var3 = w24Var.w;
                                int i2 = e34Var3.d1;
                                ArrayList arrayList = hs6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    oc7.r1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    w24 w24Var2 = e34Var3.z0;
                                    if (w24Var2 != null) {
                                        w24Var2.q(1, 2);
                                    }
                                    e34Var3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                d dVar = w24Var.w.Z1;
                                if (dVar instanceof yv1) {
                                    ((yv1) dVar).na();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new g69(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new g69(-1, e34Var.c1));
                frameLayout = view;
                break;
            case 5:
                w1b w1bVar2 = new w1b(this.c, false, false, e34Var.a2, e34Var.j2);
                w1bVar2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final w24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        byte b = r2;
                        w24 w24Var = this.b;
                        switch (b) {
                            case 0:
                                e34 e34Var2 = w24Var.w;
                                f24 f24Var = e34Var2.u1;
                                if (f24Var != null) {
                                    f24Var.y(e34Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                e34 e34Var3 = w24Var.w;
                                int i2 = e34Var3.d1;
                                ArrayList arrayList = hs6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    oc7.r1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    w24 w24Var2 = e34Var3.z0;
                                    if (w24Var2 != null) {
                                        w24Var2.q(1, 2);
                                    }
                                    e34Var3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                d dVar = w24Var.w.Z1;
                                if (dVar instanceof yv1) {
                                    ((yv1) dVar).na();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = w1bVar2;
                break;
            case 6:
                c34 c34Var = new c34(e34Var, false);
                e34Var.G0 = c34Var;
                fv fvVar = new fv(e34Var, context, c34Var);
                fvVar.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
                fvVar.setClipToPadding(false);
                fvVar.i(new as1((byte) 3));
                fvVar.setOnItemClickListener(new u(this, (byte) 26));
                fvVar.setLayoutParams(new g69(-1, gm.L(52.0f)));
                frameLayout = fvVar;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = gm.L(13.0f);
                int i2 = cmb.Df;
                ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.12f, e34Var.x(i2)));
                wmb K = anb.K(0.12f, i2);
                linearLayout2.setBackground(b0);
                anb.j(linearLayout2, b0, K, null, ylbVar);
                rve.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final w24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        byte b = r2;
                        w24 w24Var = this.b;
                        switch (b) {
                            case 0:
                                e34 e34Var2 = w24Var.w;
                                f24 f24Var = e34Var2.u1;
                                if (f24Var != null) {
                                    f24Var.y(e34Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                e34 e34Var3 = w24Var.w;
                                int i22 = e34Var3.d1;
                                ArrayList arrayList = hs6.d0(i22).t0[0];
                                if (!arrayList.isEmpty()) {
                                    oc7.r1(i22).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    w24 w24Var2 = e34Var3.z0;
                                    if (w24Var2 != null) {
                                        w24Var2.q(1, 2);
                                    }
                                    e34Var3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                d dVar = w24Var.w.Z1;
                                if (dVar instanceof yv1) {
                                    ((yv1) dVar).na();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231897);
                anb.s(imageView, i2, ylbVar, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, qoe.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                td4.x(textView3, i2, ylbVar, 1, 11.0f);
                textView3.setText(jb6.M0(2131751690, null));
                linearLayout2.addView(textView3, qoe.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, qoe.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new u69(frameLayout);
    }
}
