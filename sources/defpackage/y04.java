package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y04 extends c79 {
    public int E;
    public int F;
    public final o24 G;
    public ArrayList h;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public final ArrayList n = new ArrayList();
    public final SparseIntArray r = new SparseIntArray();
    public final SparseIntArray s = new SparseIntArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseIntArray x = new SparseIntArray();
    public final ArrayList y = new ArrayList();

    public y04(o24 o24Var) {
        this.G = o24Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 0 && i != 4 && i != 3 && i != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i, View view) {
        boolean z;
        boolean z2;
        int min;
        Integer num;
        float f;
        o24 o24Var = this.G;
        ArrayList arrayList = o24Var.r1;
        int i2 = this.x.get(i);
        if (i2 >= 0 && i2 < arrayList.size()) {
            c14 c14Var = (c14) arrayList.get(i2);
            if (!c14Var.h) {
                if (i2 + 1 == arrayList.size()) {
                    z = true;
                } else {
                    z = false;
                }
                int intValue = ((Integer) this.y.get(i2)).intValue();
                o24Var.p1.add(Long.valueOf(c14Var.b.id));
                if (!yac.h(o24Var.d1).p() && !o24Var.V0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i3 = o24Var.R.J * 3;
                if ((c14Var.f && !c14Var.g && (c14Var.e || z2)) || c14Var.h) {
                    min = c14Var.c.size();
                } else {
                    min = Math.min(i3, c14Var.c.size());
                }
                Integer num2 = null;
                if (c14Var.c.size() > i3) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                c14Var.h = true;
                int size = c14Var.c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    o24Var.s2 = view;
                    o24Var.t2 = num.intValue();
                    o24Var.u2 = num2.intValue() + num.intValue();
                    o24Var.v2 = SystemClock.elapsedRealtime();
                    p(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i3 / 2) {
                            f = 1.5f;
                        } else {
                            f = 4.0f;
                        }
                        o24Var.post(new x04(this, f, intValue2, (byte) 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z) {
        o24 o24Var = this.G;
        ArrayList arrayList = o24Var.o1;
        if (o24Var.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        ls6 d0 = ls6.d0(o24Var.d1);
        ArrayList arrayList3 = d0.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i);
            if (!d0.D0(stickerSetCovered.set.id, true) || o24Var.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z);
        H();
        m24 m24Var = o24Var.U;
        if (m24Var != null) {
            m24Var.f();
        }
        cy7.a(new ak3(this, arrayList2, (byte) 1), false).c(this);
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        o24 o24Var = this.G;
        ArrayList arrayList2 = o24Var.o1;
        ArrayList arrayList3 = o24Var.p1;
        int i = o24Var.d1;
        ArrayList arrayList4 = o24Var.r1;
        arrayList4.clear();
        if (o24Var.d2) {
            ls6 d0 = ls6.d0(i);
            if (z || (arrayList = this.h) == null) {
                arrayList = new ArrayList(d0.t0(5));
                this.h = arrayList;
            }
            if (!yac.h(i).p() && !o24Var.V0) {
                z2 = false;
            } else {
                z2 = true;
            }
            TLRPC.ChatFull chatFull = o24Var.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a0 = d0.a0(stickerSet)) != null) {
                c14 c14Var = new c14();
                c14Var.b = o24Var.K1.emojiset;
                c14Var.c = new ArrayList(a0.documents);
                c14Var.e = true;
                c14Var.f = true;
                c14Var.g = false;
                c14Var.h = true;
                c14Var.i = true;
                arrayList4.add(c14Var);
                TLRPC.StickerSet stickerSet2 = c14Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                        arrayList.remove(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (!z2) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    if (tL_messages_stickerSet2 != null && !r47.U3(tL_messages_stickerSet2)) {
                        c14 c14Var2 = new c14();
                        c14Var2.b = tL_messages_stickerSet2.set;
                        c14Var2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        c14Var2.e = true;
                        c14Var2.f = d0.D0(tL_messages_stickerSet2.set.id, true);
                        c14Var2.g = false;
                        c14Var2.h = true;
                        arrayList4.add(c14Var2);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                if (z2) {
                    c14 c14Var3 = new c14();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    c14Var3.b = stickerSet3;
                    c14Var3.c = tL_messages_stickerSet3.documents;
                    c14Var3.e = false;
                    c14Var3.f = d0.D0(stickerSet3.id, true);
                    c14Var3.g = false;
                    c14Var3.h = true;
                    arrayList4.add(c14Var3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                            boolean m3 = r47.m3(tL_messages_stickerSet3.documents.get(i5));
                            ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet3.documents;
                            if (m3) {
                                arrayList5.add(arrayList7.get(i5));
                            } else {
                                arrayList6.add(arrayList7.get(i5));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        c14 c14Var4 = new c14();
                        c14Var4.b = tL_messages_stickerSet3.set;
                        c14Var4.c = new ArrayList(arrayList5);
                        c14Var4.e = true;
                        c14Var4.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        c14Var4.g = false;
                        c14Var4.h = true;
                        arrayList4.add(c14Var4);
                    }
                    if (arrayList6.size() > 0) {
                        c14 c14Var5 = new c14();
                        c14Var5.b = tL_messages_stickerSet3.set;
                        c14Var5.c = new ArrayList(arrayList6);
                        c14Var5.e = false;
                        c14Var5.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        c14Var5.g = false;
                        c14Var5.h = arrayList3.contains(Long.valueOf(c14Var5.b.id));
                        arrayList4.add(c14Var5);
                    }
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i6);
                c14 c14Var6 = new c14();
                c14Var6.f = d0.D0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                c14Var6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    c14Var6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet m0 = d0.m0(ls6.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (m0 != null) {
                        c14Var6.c = m0.documents;
                    } else {
                        c14Var6.d = ls6.b0(stickerSetCovered.set);
                    }
                } else {
                    c14Var6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList8 = c14Var6.c;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < c14Var6.c.size()) {
                            if (!r47.m3((TLRPC.Document) c14Var6.c.get(i7))) {
                                z3 = true;
                                break;
                            }
                            i7++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    c14Var6.e = !z3;
                    c14Var6.h = arrayList3.contains(Long.valueOf(c14Var6.b.id));
                    c14Var6.g = true;
                    arrayList4.add(c14Var6);
                }
            }
            t04 t04Var = o24Var.J;
            if (t04Var != null) {
                t04Var.p(o24Var.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y04.H():void");
    }

    @Override
    public final int b() {
        return this.E;
    }

    @Override
    public final long c(int i) {
        return i;
    }

    @Override
    public final int d(int i) {
        if (i == this.d) {
            return 4;
        }
        if (i != this.c && i != this.f) {
            SparseIntArray sparseIntArray = this.r;
            if (sparseIntArray.indexOfKey(i) >= 0) {
                int i2 = sparseIntArray.get(i);
                char[] cArr = jx3.a;
                if (i2 >= 8) {
                    return 5;
                }
                return 1;
            } else if (this.G.e0 && i == 0) {
                return 2;
            } else {
                if (this.w.indexOfKey(i) >= 0) {
                    return 3;
                }
                if (this.x.indexOfKey(i) >= 0) {
                    return 6;
                }
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void f() {
        F(false);
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        String str2;
        Long l;
        TLRPC.Document document;
        int min;
        int i2;
        Long valueOf;
        c14 c14Var;
        int i3 = i;
        o24 o24Var = this.G;
        String[] strArr = o24Var.b1;
        p04 p04Var = o24Var.R;
        int i4 = o24Var.d1;
        ArrayList arrayList = o24Var.r1;
        int i5 = f89Var.f;
        View view = f89Var.a;
        int i6 = 8;
        boolean z = true;
        c14 c14Var2 = null;
        if (i5 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i5 != 1) {
                if (i5 != 5) {
                    if (i5 == 6) {
                        e14 e14Var = (e14) view;
                        int i7 = this.x.get(i3);
                        int i8 = p04Var.J * 3;
                        if (i7 >= 0 && i7 < arrayList.size()) {
                            c14Var2 = (c14) arrayList.get(i7);
                        }
                        if (c14Var2 != null) {
                            e14Var.a.setText("+" + ((c14Var2.c.size() - i8) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                g14 g14Var = (g14) view;
                int length = sparseIntArray.get(i3) - strArr.length;
                c14 c14Var3 = (c14) arrayList.get(length);
                int i9 = length - 1;
                if (i9 >= 0) {
                    c14Var = (c14) arrayList.get(i9);
                } else {
                    c14Var = null;
                }
                if (c14Var3 == null || !c14Var3.g || (c14Var != null && !c14Var.e && c14Var.f && !yac.h(i4).p())) {
                    z = false;
                }
                if (c14Var3 != null && c14Var3.d != null) {
                    ls6.d0(i4).n0(c14Var3.d, false);
                    c14Var3.d = null;
                }
                ok8 ok8Var = g14Var.r;
                if (c14Var3 != null) {
                    g14Var.x = c14Var3;
                    g14Var.y = z;
                    g14Var.d.l(c14Var3.b.title, false);
                    TextView textView = g14Var.e;
                    if (c14Var3.i) {
                        i6 = 0;
                    }
                    textView.setVisibility(i6);
                    if (c14Var3.f && !c14Var3.b.official) {
                        ok8Var.b(ob6.M0(2131745809, null), new f14(g14Var, (byte) 5), false);
                    } else {
                        ok8Var.b(ob6.M0(2131743531, null), new f14(g14Var, (byte) 6), false);
                    }
                    g14Var.a(false);
                    return;
                }
                return;
            }
            u3b u3bVar = (u3b) view;
            u3bVar.getClass();
            int i10 = sparseIntArray.get(i3);
            if (i3 == this.c) {
                u3bVar.b(ob6.M0(2131750800, null), 2131232101, ob6.M0(2131754895, null), 0, 0);
                return;
            } else if (i3 == this.f) {
                u3bVar.a(0, ob6.M0(2131746088, null));
                return;
            } else if (i10 >= strArr.length) {
                try {
                    u3bVar.a(0, ((c14) arrayList.get(i10 - strArr.length)).b.title);
                    return;
                } catch (Exception unused) {
                    u3bVar.a(0, "");
                    return;
                }
            } else {
                u3bVar.a(0, strArr[i10]);
                return;
            }
        }
        x14 x14Var = (x14) view;
        x14Var.a = i3;
        x14Var.e = null;
        if (o24Var.e0) {
            i3--;
        }
        if (this.f >= 0) {
            i3--;
        }
        if (this.d >= 0) {
            i3 -= 2;
        }
        int size = o24Var.getRecentEmoji().size();
        if (i3 < size) {
            String str3 = o24Var.getRecentEmoji().get(i3);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l = null;
            str2 = str;
            document = null;
        } else {
            int i11 = 0;
            while (true) {
                String[][] strArr2 = jx3.f;
                if (i11 < 8) {
                    String[] strArr3 = strArr2[i11];
                    int length2 = strArr3.length + 1;
                    int i12 = (i3 - size) - 1;
                    if (i12 >= 0 && i3 < size + length2) {
                        str = strArr3[i12];
                        String str4 = (String) pv3.j.get(str);
                        if (str4 != null) {
                            String c = o24.c(str, str4);
                            str2 = str;
                            str = c;
                        }
                    } else {
                        size += length2;
                        i11++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean p = yac.h(i4).p();
                int i13 = p04Var.J * 3;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i14 >= arrayList2.size()) {
                        break;
                    }
                    c14 c14Var4 = (c14) arrayList.get(i14);
                    int intValue = ((Integer) arrayList2.get(i14)).intValue() + 1;
                    if ((c14Var4.f && !c14Var4.g && (c14Var4.e || p)) || c14Var4.h) {
                        min = c14Var4.c.size();
                    } else {
                        min = Math.min(i13, c14Var4.c.size());
                    }
                    int i15 = x14Var.a;
                    if (i15 >= intValue && (i2 = i15 - intValue) < min) {
                        x14Var.e = c14Var4;
                        TLRPC.Document document2 = (TLRPC.Document) c14Var4.c.get(i2);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.id);
                        }
                        Long l2 = valueOf;
                        document = document2;
                        l = l2;
                    } else {
                        i14++;
                    }
                }
            }
            l = null;
            document = null;
            z = false;
        }
        if (l != null) {
            x14Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
            x14Var.a(null, z);
            if (x14Var.getSpan() == null || x14Var.getSpan().getDocumentId() != l.longValue()) {
                if (document != null) {
                    x14Var.setSpan(new hm(document, (Paint.FontMetricsInt) null));
                } else {
                    x14Var.setSpan(new hm(l.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            x14Var.setPadding(0, 0, 0, 0);
            x14Var.a(pv3.f(str), z);
            x14Var.setSpan(null);
        }
        x14Var.setTag(str2);
        x14Var.setContentDescription(str);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        u3b u3bVar;
        o24 o24Var = this.G;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                View view = new View(o24Var.getContext());
                                view.setLayoutParams(new r79(-1, o24Var.c1));
                                u3bVar = view;
                            } else {
                                Context context = o24Var.getContext();
                                vnb vnbVar = o24Var.a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.a = textView;
                                textView.setTextSize(1, 13.0f);
                                yob.X(textView, aob.d6, vnbVar);
                                int L = hl.L(11.0f);
                                int i2 = aob.Lf;
                                ShapeDrawable b0 = aob.b0(L, vm2.o(aob.v0(i2, vnbVar), 99));
                                uob g = yob.g(i2, 99);
                                textView.setBackground(b0);
                                yob.j(textView, b0, g, null, vnbVar);
                                textView.setTypeface(hl.o());
                                textView.setPadding(hl.L(6.0f), hl.L(1.66f), hl.L(6.0f), hl.L(2.0f));
                                frameLayout.addView(textView, tre.e(-2, -2, 17));
                                u3bVar = frameLayout;
                            }
                        } else {
                            u3bVar = new g14(o24Var, o24Var.getContext());
                        }
                    } else {
                        Context context2 = o24Var.getContext();
                        m24 m24Var = new m24(o24Var, true);
                        o24Var.U = m24Var;
                        gu guVar = new gu(o24Var, context2, m24Var);
                        guVar.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
                        guVar.setClipToPadding(false);
                        guVar.i(new br1((byte) 2));
                        guVar.setOnItemClickListener(new u(this, (byte) 24));
                        u3bVar = guVar;
                    }
                } else {
                    u3bVar = new d14(o24Var, o24Var.getContext());
                }
            } else {
                u3b u3bVar2 = new u3b(o24Var.getContext(), true, false, o24Var.a2, o24Var.j2);
                u3bVar2.setOnIconClickListener(new mh3(this, (byte) 7));
                u3bVar = u3bVar2;
            }
        } else {
            u3bVar = new x14(o24Var.getContext());
        }
        return new f89(u3bVar);
    }
}
