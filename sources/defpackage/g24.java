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
import org.telegram.ui.ActionBar.e;
public final class g24 extends c79 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final o24 w;

    public g24(o24 o24Var, Context context) {
        this.w = o24Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return f89Var.a instanceof d79;
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
        o24 o24Var = this.w;
        ArrayList arrayList = o24Var.e1;
        Object obj = this.h.get(i);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i == 0) {
                i = 1;
            }
            if (this.d == 0) {
                int measuredWidth = o24Var.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = hl.q.x;
                }
                this.d = measuredWidth / hl.L(72.0f);
            }
            int i3 = this.r.get(i, Integer.MIN_VALUE);
            if (i3 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i2 = o24Var.F1;
            } else {
                Object obj2 = this.e.get(i3);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return o24Var.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return o24Var.G1;
                    }
                    return o24Var.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i2 = o24Var.F1;
            }
            return indexOf + i2;
        }
        int i4 = o24Var.H1;
        if (i4 >= 0) {
            return i4;
        }
        int i5 = o24Var.G1;
        if (i5 >= 0) {
            return i5;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g24.G():void");
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
    public final void t(f89 f89Var, int i) {
        int i2;
        TLRPC.Chat chat;
        String str;
        int i3;
        o24 o24Var = this.w;
        int i4 = o24Var.d1;
        int i5 = f89Var.f;
        View view = f89Var.a;
        SparseArray sparseArray = this.h;
        if (i5 != 0) {
            int i6 = 1;
            boolean z = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 5) {
                            u3b u3bVar = (u3b) view;
                            if (ls6.d0(i4).s0) {
                                i3 = 2131750797;
                            } else {
                                i3 = 2131750798;
                            }
                            u3bVar.b(ob6.M0(i3, null), 2131232101, ob6.M0(2131754894, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    r3b r3bVar = (r3b) view;
                    if (i != this.s - 1) {
                        z = false;
                    }
                    r3bVar.setIsLast(z);
                    return;
                }
                u3b u3bVar2 = (u3b) view;
                u3bVar2.setHeaderOnClick(null);
                if (i == o24Var.g1) {
                    if (o24Var.h1 && o24Var.i1 == null) {
                        i2 = 0;
                    } else if (o24Var.i1 != null) {
                        i2 = 2131232242;
                    } else {
                        i2 = 2131232101;
                    }
                    if (o24Var.K1 != null) {
                        chat = uc7.s1(i4).M0(Long.valueOf(o24Var.K1.id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    u3bVar2.a(i2, ob6.a0("CurrentGroupStickers", null, 2131751659, str));
                    return;
                }
                Object obj = sparseArray.get(i);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        u3bVar2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !o24Var.S2) {
                            u3bVar2.setEdit(new View.OnClickListener(this) {
                                public final g24 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    byte b = r3;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                    g24 g24Var = this.b;
                                    switch (b) {
                                        case 0:
                                            g24Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                            return;
                                        default:
                                            g24Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        u3bVar2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final g24 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b = r3;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                g24 g24Var = this.b;
                                switch (b) {
                                    case 0:
                                        g24Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                        return;
                                    default:
                                        g24Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == o24Var.k1) {
                    u3bVar2.b(ob6.M0(2131746091, null), 2131232101, ob6.M0(2131752028, null), 0, 0);
                    return;
                } else if (obj == o24Var.l1) {
                    u3bVar2.a(0, ob6.M0(2131750806, null));
                    return;
                } else if (obj == o24Var.m1) {
                    u3bVar2.a(0, ob6.M0(2131746676, null));
                    return;
                } else {
                    return;
                }
            }
            t24 t24Var = (t24) view;
            if (i == this.s) {
                int i7 = this.r.get(i - 1, Integer.MIN_VALUE);
                if (i7 == Integer.MIN_VALUE) {
                    t24Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i7);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = o24Var.k1;
                    } else {
                        arrayList = o24Var.l1;
                    }
                }
                if (arrayList == null) {
                    t24Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    t24Var.setHeight(hl.L(8.0f));
                    return;
                } else {
                    int height = o24Var.h.getHeight() - (hl.L(82.0f) * ((int) Math.ceil(arrayList.size() / this.d)));
                    if (height > 0) {
                        i6 = height;
                    }
                    t24Var.setHeight(i6);
                    return;
                }
            }
            t24Var.setHeight(hl.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
        x2b x2bVar = (x2b) view;
        x2bVar.d(document, null, this.n.get(i), null, false, false);
        x2bVar.setRecent(o24Var.k1.contains(document));
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        o24 o24Var = this.w;
        vnb vnbVar = o24Var.a2;
        Context context = this.c;
        FrameLayout frameLayout = null;
        switch (i) {
            case 0:
                frameLayout = new f24(context, true, vnbVar, (byte) 0);
                break;
            case 1:
                frameLayout = new t24(context);
                break;
            case 2:
                u3b u3bVar = new u3b(this.c, false, false, o24Var.a2, o24Var.j2);
                u3bVar.setOnIconClickListener(new je3(this, u3bVar, (byte) 10));
                frameLayout = u3bVar;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                yob.X(textView, aob.Of, null);
                bs2.r(14.0f, 1, 2131749150, textView, null);
                linearLayout.addView(textView, tre.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.a = textView2;
                textView2.setPadding(hl.L(17.0f), 0, hl.L(17.0f), 0);
                textView2.setGravity(17);
                qd4.w(textView2, aob.Ji, null, 1, 14.0f);
                textView2.setBackground(rnb.f(aob.Fi, 4.0f));
                textView2.setText(ob6.M0(2131752081, null).toUpperCase());
                linearLayout.addView(textView2, tre.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final g24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        g24 g24Var = this.b;
                        switch (b) {
                            case 0:
                                o24 o24Var2 = g24Var.w;
                                p14 p14Var = o24Var2.u1;
                                if (p14Var != null) {
                                    p14Var.y(o24Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                o24 o24Var3 = g24Var.w;
                                int i2 = o24Var3.d1;
                                ArrayList arrayList = ls6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    uc7.s1(i2).Z3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    g24 g24Var2 = o24Var3.z0;
                                    if (g24Var2 != null) {
                                        g24Var2.q(1, 2);
                                    }
                                    o24Var3.X(false);
                                    return;
                                }
                                return;
                            default:
                                e eVar = g24Var.w.Z1;
                                if (eVar instanceof zu1) {
                                    ((zu1) eVar).oa();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new r79(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new r79(-1, o24Var.c1));
                frameLayout = view;
                break;
            case 5:
                u3b u3bVar2 = new u3b(this.c, false, false, o24Var.a2, o24Var.j2);
                u3bVar2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final g24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        byte b = r2;
                        g24 g24Var = this.b;
                        switch (b) {
                            case 0:
                                o24 o24Var2 = g24Var.w;
                                p14 p14Var = o24Var2.u1;
                                if (p14Var != null) {
                                    p14Var.y(o24Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                o24 o24Var3 = g24Var.w;
                                int i2 = o24Var3.d1;
                                ArrayList arrayList = ls6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    uc7.s1(i2).Z3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    g24 g24Var2 = o24Var3.z0;
                                    if (g24Var2 != null) {
                                        g24Var2.q(1, 2);
                                    }
                                    o24Var3.X(false);
                                    return;
                                }
                                return;
                            default:
                                e eVar = g24Var.w.Z1;
                                if (eVar instanceof zu1) {
                                    ((zu1) eVar).oa();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = u3bVar2;
                break;
            case 6:
                m24 m24Var = new m24(o24Var, false);
                o24Var.G0 = m24Var;
                gu guVar = new gu(o24Var, context, m24Var);
                guVar.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
                guVar.setClipToPadding(false);
                guVar.i(new br1((byte) 3));
                guVar.setOnItemClickListener(new u(this, (byte) 25));
                guVar.setLayoutParams(new r79(-1, hl.L(52.0f)));
                frameLayout = guVar;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = hl.L(13.0f);
                int i2 = aob.Ef;
                ShapeDrawable b0 = aob.b0(L, aob.p1(0.12f, o24Var.y(i2)));
                uob K = yob.K(0.12f, i2);
                linearLayout2.setBackground(b0);
                yob.j(linearLayout2, b0, K, null, vnbVar);
                iye.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final g24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        byte b = r2;
                        g24 g24Var = this.b;
                        switch (b) {
                            case 0:
                                o24 o24Var2 = g24Var.w;
                                p14 p14Var = o24Var2.u1;
                                if (p14Var != null) {
                                    p14Var.y(o24Var2.K1.id);
                                    return;
                                }
                                return;
                            case 1:
                                o24 o24Var3 = g24Var.w;
                                int i22 = o24Var3.d1;
                                ArrayList arrayList = ls6.d0(i22).t0[0];
                                if (!arrayList.isEmpty()) {
                                    uc7.s1(i22).Z3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    g24 g24Var2 = o24Var3.z0;
                                    if (g24Var2 != null) {
                                        g24Var2.q(1, 2);
                                    }
                                    o24Var3.X(false);
                                    return;
                                }
                                return;
                            default:
                                e eVar = g24Var.w.Z1;
                                if (eVar instanceof zu1) {
                                    ((zu1) eVar).oa();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231896);
                yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, tre.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                qd4.w(textView3, i2, vnbVar, 1, 11.0f);
                textView3.setText(ob6.M0(2131751718, null));
                linearLayout2.addView(textView3, tre.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, tre.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new f89(frameLayout);
    }
}
