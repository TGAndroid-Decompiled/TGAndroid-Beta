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
public final class o14 extends q59 {
    public int E;
    public int F;
    public final e34 G;
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

    public o14(e34 e34Var) {
        this.G = e34Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        e34 e34Var = this.G;
        ArrayList arrayList = e34Var.r1;
        int i2 = this.x.get(i);
        if (i2 >= 0 && i2 < arrayList.size()) {
            s14 s14Var = (s14) arrayList.get(i2);
            if (!s14Var.h) {
                if (i2 + 1 == arrayList.size()) {
                    z = true;
                } else {
                    z = false;
                }
                int intValue = ((Integer) this.y.get(i2)).intValue();
                e34Var.p1.add(Long.valueOf(s14Var.b.id));
                if (!z8c.h(e34Var.d1).p() && !e34Var.V0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i3 = e34Var.R.J * 3;
                if ((s14Var.f && !s14Var.g && (s14Var.e || z2)) || s14Var.h) {
                    min = s14Var.c.size();
                } else {
                    min = Math.min(i3, s14Var.c.size());
                }
                Integer num2 = null;
                if (s14Var.c.size() > i3) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                s14Var.h = true;
                int size = s14Var.c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    e34Var.s2 = view;
                    e34Var.t2 = num.intValue();
                    e34Var.u2 = num2.intValue() + num.intValue();
                    e34Var.v2 = SystemClock.elapsedRealtime();
                    p(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i3 / 2) {
                            f = 1.5f;
                        } else {
                            f = 4.0f;
                        }
                        e34Var.post(new n14(this, f, intValue2, (byte) 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z) {
        e34 e34Var = this.G;
        ArrayList arrayList = e34Var.o1;
        if (e34Var.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        hs6 d0 = hs6.d0(e34Var.d1);
        ArrayList arrayList3 = d0.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i);
            if (!d0.D0(stickerSetCovered.set.id, true) || e34Var.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z);
        H();
        c34 c34Var = e34Var.U;
        if (c34Var != null) {
            c34Var.f();
        }
        ww7.a(new tk3(this, arrayList2, (byte) 1), false).c(this);
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        e34 e34Var = this.G;
        ArrayList arrayList2 = e34Var.o1;
        ArrayList arrayList3 = e34Var.p1;
        int i = e34Var.d1;
        ArrayList arrayList4 = e34Var.r1;
        arrayList4.clear();
        if (e34Var.d2) {
            hs6 d0 = hs6.d0(i);
            if (z || (arrayList = this.h) == null) {
                arrayList = new ArrayList(d0.t0(5));
                this.h = arrayList;
            }
            if (!z8c.h(i).p() && !e34Var.V0) {
                z2 = false;
            } else {
                z2 = true;
            }
            TLRPC.ChatFull chatFull = e34Var.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a0 = d0.a0(stickerSet)) != null) {
                s14 s14Var = new s14();
                s14Var.b = e34Var.K1.emojiset;
                s14Var.c = new ArrayList(a0.documents);
                s14Var.e = true;
                s14Var.f = true;
                s14Var.g = false;
                s14Var.h = true;
                s14Var.i = true;
                arrayList4.add(s14Var);
                TLRPC.StickerSet stickerSet2 = s14Var.b;
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
                    if (tL_messages_stickerSet2 != null && !k47.U3(tL_messages_stickerSet2)) {
                        s14 s14Var2 = new s14();
                        s14Var2.b = tL_messages_stickerSet2.set;
                        s14Var2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        s14Var2.e = true;
                        s14Var2.f = d0.D0(tL_messages_stickerSet2.set.id, true);
                        s14Var2.g = false;
                        s14Var2.h = true;
                        arrayList4.add(s14Var2);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                if (z2) {
                    s14 s14Var3 = new s14();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    s14Var3.b = stickerSet3;
                    s14Var3.c = tL_messages_stickerSet3.documents;
                    s14Var3.e = false;
                    s14Var3.f = d0.D0(stickerSet3.id, true);
                    s14Var3.g = false;
                    s14Var3.h = true;
                    arrayList4.add(s14Var3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                            boolean m3 = k47.m3(tL_messages_stickerSet3.documents.get(i5));
                            ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet3.documents;
                            if (m3) {
                                arrayList5.add(arrayList7.get(i5));
                            } else {
                                arrayList6.add(arrayList7.get(i5));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        s14 s14Var4 = new s14();
                        s14Var4.b = tL_messages_stickerSet3.set;
                        s14Var4.c = new ArrayList(arrayList5);
                        s14Var4.e = true;
                        s14Var4.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        s14Var4.g = false;
                        s14Var4.h = true;
                        arrayList4.add(s14Var4);
                    }
                    if (arrayList6.size() > 0) {
                        s14 s14Var5 = new s14();
                        s14Var5.b = tL_messages_stickerSet3.set;
                        s14Var5.c = new ArrayList(arrayList6);
                        s14Var5.e = false;
                        s14Var5.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        s14Var5.g = false;
                        s14Var5.h = arrayList3.contains(Long.valueOf(s14Var5.b.id));
                        arrayList4.add(s14Var5);
                    }
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i6);
                s14 s14Var6 = new s14();
                s14Var6.f = d0.D0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                s14Var6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    s14Var6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet m0 = d0.m0(hs6.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (m0 != null) {
                        s14Var6.c = m0.documents;
                    } else {
                        s14Var6.d = hs6.b0(stickerSetCovered.set);
                    }
                } else {
                    s14Var6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList8 = s14Var6.c;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < s14Var6.c.size()) {
                            if (!k47.m3((TLRPC.Document) s14Var6.c.get(i7))) {
                                z3 = true;
                                break;
                            }
                            i7++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    s14Var6.e = !z3;
                    s14Var6.h = arrayList3.contains(Long.valueOf(s14Var6.b.id));
                    s14Var6.g = true;
                    arrayList4.add(s14Var6);
                }
            }
            j14 j14Var = e34Var.J;
            if (j14Var != null) {
                j14Var.p(e34Var.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.H():void");
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
                char[] cArr = zx3.a;
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
    public final void t(u69 u69Var, int i) {
        String str;
        String str2;
        Long l;
        TLRPC.Document document;
        int min;
        int i2;
        Long valueOf;
        s14 s14Var;
        int i3 = i;
        e34 e34Var = this.G;
        String[] strArr = e34Var.b1;
        f14 f14Var = e34Var.R;
        int i4 = e34Var.d1;
        ArrayList arrayList = e34Var.r1;
        int i5 = u69Var.f;
        View view = u69Var.a;
        int i6 = 8;
        boolean z = true;
        s14 s14Var2 = null;
        if (i5 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i5 != 1) {
                if (i5 != 5) {
                    if (i5 == 6) {
                        u14 u14Var = (u14) view;
                        int i7 = this.x.get(i3);
                        int i8 = f14Var.J * 3;
                        if (i7 >= 0 && i7 < arrayList.size()) {
                            s14Var2 = (s14) arrayList.get(i7);
                        }
                        if (s14Var2 != null) {
                            u14Var.a.setText("+" + ((s14Var2.c.size() - i8) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                w14 w14Var = (w14) view;
                int length = sparseIntArray.get(i3) - strArr.length;
                s14 s14Var3 = (s14) arrayList.get(length);
                int i9 = length - 1;
                if (i9 >= 0) {
                    s14Var = (s14) arrayList.get(i9);
                } else {
                    s14Var = null;
                }
                if (s14Var3 == null || !s14Var3.g || (s14Var != null && !s14Var.e && s14Var.f && !z8c.h(i4).p())) {
                    z = false;
                }
                if (s14Var3 != null && s14Var3.d != null) {
                    hs6.d0(i4).n0(s14Var3.d, false);
                    s14Var3.d = null;
                }
                cj8 cj8Var = w14Var.r;
                if (s14Var3 != null) {
                    w14Var.x = s14Var3;
                    w14Var.y = z;
                    w14Var.d.l(s14Var3.b.title, false);
                    TextView textView = w14Var.e;
                    if (s14Var3.i) {
                        i6 = 0;
                    }
                    textView.setVisibility(i6);
                    if (s14Var3.f && !s14Var3.b.official) {
                        cj8Var.b(jb6.M0(2131745815, null), new v14(w14Var, (byte) 5), false);
                    } else {
                        cj8Var.b(jb6.M0(2131743563, null), new v14(w14Var, (byte) 6), false);
                    }
                    w14Var.a(false);
                    return;
                }
                return;
            }
            w1b w1bVar = (w1b) view;
            w1bVar.getClass();
            int i10 = sparseIntArray.get(i3);
            if (i3 == this.c) {
                w1bVar.b(jb6.M0(2131750772, null), 2131232102, jb6.M0(2131754899, null), 0, 0);
                return;
            } else if (i3 == this.f) {
                w1bVar.a(0, jb6.M0(2131746094, null));
                return;
            } else if (i10 >= strArr.length) {
                try {
                    w1bVar.a(0, ((s14) arrayList.get(i10 - strArr.length)).b.title);
                    return;
                } catch (Exception unused) {
                    w1bVar.a(0, "");
                    return;
                }
            } else {
                w1bVar.a(0, strArr[i10]);
                return;
            }
        }
        n24 n24Var = (n24) view;
        n24Var.a = i3;
        n24Var.e = null;
        if (e34Var.e0) {
            i3--;
        }
        if (this.f >= 0) {
            i3--;
        }
        if (this.d >= 0) {
            i3 -= 2;
        }
        int size = e34Var.getRecentEmoji().size();
        if (i3 < size) {
            String str3 = e34Var.getRecentEmoji().get(i3);
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
                String[][] strArr2 = zx3.f;
                if (i11 < 8) {
                    String[] strArr3 = strArr2[i11];
                    int length2 = strArr3.length + 1;
                    int i12 = (i3 - size) - 1;
                    if (i12 >= 0 && i3 < size + length2) {
                        str = strArr3[i12];
                        String str4 = (String) gw3.j.get(str);
                        if (str4 != null) {
                            String c = e34.c(str, str4);
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
                boolean p = z8c.h(i4).p();
                int i13 = f14Var.J * 3;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i14 >= arrayList2.size()) {
                        break;
                    }
                    s14 s14Var4 = (s14) arrayList.get(i14);
                    int intValue = ((Integer) arrayList2.get(i14)).intValue() + 1;
                    if ((s14Var4.f && !s14Var4.g && (s14Var4.e || p)) || s14Var4.h) {
                        min = s14Var4.c.size();
                    } else {
                        min = Math.min(i13, s14Var4.c.size());
                    }
                    int i15 = n24Var.a;
                    if (i15 >= intValue && (i2 = i15 - intValue) < min) {
                        n24Var.e = s14Var4;
                        TLRPC.Document document2 = (TLRPC.Document) s14Var4.c.get(i2);
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
            n24Var.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
            n24Var.a(null, z);
            if (n24Var.getSpan() == null || n24Var.getSpan().getDocumentId() != l.longValue()) {
                if (document != null) {
                    n24Var.setSpan(new gn(document, (Paint.FontMetricsInt) null));
                } else {
                    n24Var.setSpan(new gn(l.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            n24Var.setPadding(0, 0, 0, 0);
            n24Var.a(gw3.f(str), z);
            n24Var.setSpan(null);
        }
        n24Var.setTag(str2);
        n24Var.setContentDescription(str);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        w1b w1bVar;
        e34 e34Var = this.G;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                View view = new View(e34Var.getContext());
                                view.setLayoutParams(new g69(-1, e34Var.c1));
                                w1bVar = view;
                            } else {
                                Context context = e34Var.getContext();
                                ylb ylbVar = e34Var.a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.a = textView;
                                textView.setTextSize(1, 13.0f);
                                anb.X(textView, cmb.c6, ylbVar);
                                int L = gm.L(11.0f);
                                int i2 = cmb.Kf;
                                ShapeDrawable b0 = cmb.b0(L, on2.p(cmb.v0(i2, ylbVar), 99));
                                wmb g = anb.g(i2, 99);
                                textView.setBackground(b0);
                                anb.j(textView, b0, g, null, ylbVar);
                                textView.setTypeface(gm.o());
                                textView.setPadding(gm.L(6.0f), gm.L(1.66f), gm.L(6.0f), gm.L(2.0f));
                                frameLayout.addView(textView, qoe.e(-2, -2, 17));
                                w1bVar = frameLayout;
                            }
                        } else {
                            w1bVar = new w14(e34Var, e34Var.getContext());
                        }
                    } else {
                        Context context2 = e34Var.getContext();
                        c34 c34Var = new c34(e34Var, true);
                        e34Var.U = c34Var;
                        fv fvVar = new fv(e34Var, context2, c34Var);
                        fvVar.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
                        fvVar.setClipToPadding(false);
                        fvVar.i(new as1((byte) 2));
                        fvVar.setOnItemClickListener(new u(this, (byte) 25));
                        w1bVar = fvVar;
                    }
                } else {
                    w1bVar = new t14(e34Var, e34Var.getContext());
                }
            } else {
                w1b w1bVar2 = new w1b(e34Var.getContext(), true, false, e34Var.a2, e34Var.j2);
                w1bVar2.setOnIconClickListener(new sf3(this, (byte) 8));
                w1bVar = w1bVar2;
            }
        } else {
            w1bVar = new n24(e34Var.getContext());
        }
        return new u69(w1bVar);
    }
}
