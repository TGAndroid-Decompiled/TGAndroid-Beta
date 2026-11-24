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
public final class l14 extends n39 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final t14 w;

    public l14(t14 t14Var, Context context) {
        this.w = t14Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return s49Var.a instanceof o39;
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
        t14 t14Var = this.w;
        ArrayList arrayList = t14Var.e1;
        Object obj = this.h.get(i);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i == 0) {
                i = 1;
            }
            if (this.d == 0) {
                int measuredWidth = t14Var.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = gl.q.x;
                }
                this.d = measuredWidth / gl.L(72.0f);
            }
            int i3 = this.r.get(i, Integer.MIN_VALUE);
            if (i3 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i2 = t14Var.F1;
            } else {
                Object obj2 = this.e.get(i3);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return t14Var.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return t14Var.G1;
                    }
                    return t14Var.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i2 = t14Var.F1;
            }
            return indexOf + i2;
        }
        int i4 = t14Var.H1;
        if (i4 >= 0) {
            return i4;
        }
        int i5 = t14Var.G1;
        if (i5 >= 0) {
            return i5;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l14.G():void");
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
    public final void t(s49 s49Var, int i) {
        int i2;
        TLRPC.Chat chat;
        String str;
        int i3;
        t14 t14Var = this.w;
        int i4 = t14Var.d1;
        int i5 = s49Var.f;
        View view = s49Var.a;
        SparseArray sparseArray = this.h;
        if (i5 != 0) {
            int i6 = 1;
            boolean z = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 5) {
                            vza vzaVar = (vza) view;
                            if (hq6.d0(i4).s0) {
                                i3 = 2131750820;
                            } else {
                                i3 = 2131750821;
                            }
                            vzaVar.b(k96.M0(i3, null), 2131232101, k96.M0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    sza szaVar = (sza) view;
                    if (i != this.s - 1) {
                        z = false;
                    }
                    szaVar.setIsLast(z);
                    return;
                }
                vza vzaVar2 = (vza) view;
                vzaVar2.setHeaderOnClick(null);
                if (i == t14Var.g1) {
                    if (t14Var.h1 && t14Var.i1 == null) {
                        i2 = 0;
                    } else if (t14Var.i1 != null) {
                        i2 = 2131232242;
                    } else {
                        i2 = 2131232101;
                    }
                    if (t14Var.K1 != null) {
                        chat = na7.q1(i4).K0(Long.valueOf(t14Var.K1.id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    vzaVar2.a(i2, k96.a0("CurrentGroupStickers", null, 2131751682, str));
                    return;
                }
                Object obj = sparseArray.get(i);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        vzaVar2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !t14Var.S2) {
                            vzaVar2.setEdit(new View.OnClickListener(this) {
                                public final l14 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    byte b = r3;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                    l14 l14Var = this.b;
                                    switch (b) {
                                        case 0:
                                            l14Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                            return;
                                        default:
                                            l14Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        vzaVar2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final l14 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b = r3;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                l14 l14Var = this.b;
                                switch (b) {
                                    case 0:
                                        l14Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                        return;
                                    default:
                                        l14Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == t14Var.k1) {
                    vzaVar2.b(k96.M0(2131746171, null), 2131232101, k96.M0(2131752051, null), 0, 0);
                    return;
                } else if (obj == t14Var.l1) {
                    vzaVar2.a(0, k96.M0(2131750829, null));
                    return;
                } else if (obj == t14Var.m1) {
                    vzaVar2.a(0, k96.M0(2131746756, null));
                    return;
                } else {
                    return;
                }
            }
            y14 y14Var = (y14) view;
            if (i == this.s) {
                int i7 = this.r.get(i - 1, Integer.MIN_VALUE);
                if (i7 == Integer.MIN_VALUE) {
                    y14Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i7);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = t14Var.k1;
                    } else {
                        arrayList = t14Var.l1;
                    }
                }
                if (arrayList == null) {
                    y14Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    y14Var.setHeight(gl.L(8.0f));
                    return;
                } else {
                    int height = t14Var.h.getHeight() - (gl.L(82.0f) * ((int) Math.ceil(arrayList.size() / this.d)));
                    if (height > 0) {
                        i6 = height;
                    }
                    y14Var.setHeight(i6);
                    return;
                }
            }
            y14Var.setHeight(gl.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
        xya xyaVar = (xya) view;
        xyaVar.d(document, null, this.n.get(i), null, false, false);
        xyaVar.setRecent(t14Var.k1.contains(document));
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        t14 t14Var = this.w;
        wjb wjbVar = t14Var.a2;
        Context context = this.c;
        FrameLayout frameLayout = null;
        switch (i) {
            case 0:
                frameLayout = new k14(context, true, wjbVar, (byte) 0);
                break;
            case 1:
                frameLayout = new y14(context);
                break;
            case 2:
                vza vzaVar = new vza(this.c, false, false, t14Var.a2, t14Var.j2);
                vzaVar.setOnIconClickListener(new xf3(this, vzaVar, (byte) 8));
                frameLayout = vzaVar;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                zkb.X(textView, bkb.Nf, null);
                ir2.r(14.0f, 1, 2131749204, textView, null);
                linearLayout.addView(textView, nme.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.a = textView2;
                textView2.setPadding(gl.L(17.0f), 0, gl.L(17.0f), 0);
                textView2.setGravity(17);
                tb4.w(textView2, bkb.Ii, null, 1, 14.0f);
                textView2.setBackground(sjb.f(bkb.Ei, 4.0f));
                textView2.setText(k96.M0(2131752104, null).toUpperCase());
                linearLayout.addView(textView2, nme.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final l14 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        l14 l14Var = this.b;
                        switch (b) {
                            case 0:
                                t14 t14Var2 = l14Var.w;
                                u04 u04Var = t14Var2.u1;
                                if (u04Var != null) {
                                    u04Var.y(t14Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                t14 t14Var3 = l14Var.w;
                                int i2 = t14Var3.d1;
                                ArrayList arrayList = hq6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    na7.q1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    l14 l14Var2 = t14Var3.z0;
                                    if (l14Var2 != null) {
                                        l14Var2.q(1, 2);
                                    }
                                    t14Var3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                d dVar = l14Var.w.Z1;
                                if (dVar instanceof mu1) {
                                    ((mu1) dVar).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new e49(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new e49(-1, t14Var.c1));
                frameLayout = view;
                break;
            case 5:
                vza vzaVar2 = new vza(this.c, false, false, t14Var.a2, t14Var.j2);
                vzaVar2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final l14 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        byte b = r2;
                        l14 l14Var = this.b;
                        switch (b) {
                            case 0:
                                t14 t14Var2 = l14Var.w;
                                u04 u04Var = t14Var2.u1;
                                if (u04Var != null) {
                                    u04Var.y(t14Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                t14 t14Var3 = l14Var.w;
                                int i2 = t14Var3.d1;
                                ArrayList arrayList = hq6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    na7.q1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    l14 l14Var2 = t14Var3.z0;
                                    if (l14Var2 != null) {
                                        l14Var2.q(1, 2);
                                    }
                                    t14Var3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                d dVar = l14Var.w.Z1;
                                if (dVar instanceof mu1) {
                                    ((mu1) dVar).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = vzaVar2;
                break;
            case 6:
                r14 r14Var = new r14(t14Var, false);
                t14Var.G0 = r14Var;
                fu fuVar = new fu(t14Var, context, r14Var);
                fuVar.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
                fuVar.setClipToPadding(false);
                fuVar.i(new oq1((byte) 3));
                fuVar.setOnItemClickListener(new u(this, (byte) 25));
                fuVar.setLayoutParams(new e49(-1, gl.L(52.0f)));
                frameLayout = fuVar;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = gl.L(13.0f);
                int i2 = bkb.Df;
                ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.12f, t14Var.y(i2)));
                vkb K = zkb.K(0.12f, i2);
                linearLayout2.setBackground(b0);
                zkb.j(linearLayout2, b0, K, null, wjbVar);
                ote.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final l14 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        byte b = r2;
                        l14 l14Var = this.b;
                        switch (b) {
                            case 0:
                                t14 t14Var2 = l14Var.w;
                                u04 u04Var = t14Var2.u1;
                                if (u04Var != null) {
                                    u04Var.y(t14Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                t14 t14Var3 = l14Var.w;
                                int i22 = t14Var3.d1;
                                ArrayList arrayList = hq6.d0(i22).t0[0];
                                if (!arrayList.isEmpty()) {
                                    na7.q1(i22).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    l14 l14Var2 = t14Var3.z0;
                                    if (l14Var2 != null) {
                                        l14Var2.q(1, 2);
                                    }
                                    t14Var3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                d dVar = l14Var.w.Z1;
                                if (dVar instanceof mu1) {
                                    ((mu1) dVar).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231896);
                zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, nme.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                tb4.w(textView3, i2, wjbVar, 1, 11.0f);
                textView3.setText(k96.M0(2131751741, null));
                linearLayout2.addView(textView3, nme.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, nme.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new s49(frameLayout);
    }
}
