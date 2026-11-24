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
public final class d04 extends n39 {
    public int E;
    public int F;
    public final t14 G;
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

    public d04(t14 t14Var) {
        this.G = t14Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
        t14 t14Var = this.G;
        ArrayList arrayList = t14Var.r1;
        int i2 = this.x.get(i);
        if (i2 >= 0 && i2 < arrayList.size()) {
            h04 h04Var = (h04) arrayList.get(i2);
            if (!h04Var.h) {
                if (i2 + 1 == arrayList.size()) {
                    z = true;
                } else {
                    z = false;
                }
                int intValue = ((Integer) this.y.get(i2)).intValue();
                t14Var.p1.add(Long.valueOf(h04Var.b.id));
                if (!y6c.h(t14Var.d1).p() && !t14Var.V0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i3 = t14Var.R.J * 3;
                if ((h04Var.f && !h04Var.g && (h04Var.e || z2)) || h04Var.h) {
                    min = h04Var.c.size();
                } else {
                    min = Math.min(i3, h04Var.c.size());
                }
                Integer num2 = null;
                if (h04Var.c.size() > i3) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                h04Var.h = true;
                int size = h04Var.c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    t14Var.s2 = view;
                    t14Var.t2 = num.intValue();
                    t14Var.u2 = num2.intValue() + num.intValue();
                    t14Var.v2 = SystemClock.elapsedRealtime();
                    p(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i3 / 2) {
                            f = 1.5f;
                        } else {
                            f = 4.0f;
                        }
                        t14Var.post(new c04(this, f, intValue2, (byte) 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z) {
        t14 t14Var = this.G;
        ArrayList arrayList = t14Var.o1;
        if (t14Var.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        hq6 d0 = hq6.d0(t14Var.d1);
        ArrayList arrayList3 = d0.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i);
            if (!d0.D0(stickerSetCovered.set.id, true) || t14Var.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z);
        H();
        r14 r14Var = t14Var.U;
        if (r14Var != null) {
            r14Var.f();
        }
        vu7.a(new ij3(this, arrayList2, (byte) 1), false).c(this);
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        t14 t14Var = this.G;
        ArrayList arrayList2 = t14Var.o1;
        ArrayList arrayList3 = t14Var.p1;
        int i = t14Var.d1;
        ArrayList arrayList4 = t14Var.r1;
        arrayList4.clear();
        if (t14Var.d2) {
            hq6 d0 = hq6.d0(i);
            if (z || (arrayList = this.h) == null) {
                arrayList = new ArrayList(d0.t0(5));
                this.h = arrayList;
            }
            if (!y6c.h(i).p() && !t14Var.V0) {
                z2 = false;
            } else {
                z2 = true;
            }
            TLRPC.ChatFull chatFull = t14Var.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a0 = d0.a0(stickerSet)) != null) {
                h04 h04Var = new h04();
                h04Var.b = t14Var.K1.emojiset;
                h04Var.c = new ArrayList(a0.documents);
                h04Var.e = true;
                h04Var.f = true;
                h04Var.g = false;
                h04Var.h = true;
                h04Var.i = true;
                arrayList4.add(h04Var);
                TLRPC.StickerSet stickerSet2 = h04Var.b;
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
                    if (tL_messages_stickerSet2 != null && !k27.U3(tL_messages_stickerSet2)) {
                        h04 h04Var2 = new h04();
                        h04Var2.b = tL_messages_stickerSet2.set;
                        h04Var2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        h04Var2.e = true;
                        h04Var2.f = d0.D0(tL_messages_stickerSet2.set.id, true);
                        h04Var2.g = false;
                        h04Var2.h = true;
                        arrayList4.add(h04Var2);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                if (z2) {
                    h04 h04Var3 = new h04();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    h04Var3.b = stickerSet3;
                    h04Var3.c = tL_messages_stickerSet3.documents;
                    h04Var3.e = false;
                    h04Var3.f = d0.D0(stickerSet3.id, true);
                    h04Var3.g = false;
                    h04Var3.h = true;
                    arrayList4.add(h04Var3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                            boolean m3 = k27.m3(tL_messages_stickerSet3.documents.get(i5));
                            ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet3.documents;
                            if (m3) {
                                arrayList5.add(arrayList7.get(i5));
                            } else {
                                arrayList6.add(arrayList7.get(i5));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        h04 h04Var4 = new h04();
                        h04Var4.b = tL_messages_stickerSet3.set;
                        h04Var4.c = new ArrayList(arrayList5);
                        h04Var4.e = true;
                        h04Var4.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        h04Var4.g = false;
                        h04Var4.h = true;
                        arrayList4.add(h04Var4);
                    }
                    if (arrayList6.size() > 0) {
                        h04 h04Var5 = new h04();
                        h04Var5.b = tL_messages_stickerSet3.set;
                        h04Var5.c = new ArrayList(arrayList6);
                        h04Var5.e = false;
                        h04Var5.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        h04Var5.g = false;
                        h04Var5.h = arrayList3.contains(Long.valueOf(h04Var5.b.id));
                        arrayList4.add(h04Var5);
                    }
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i6);
                h04 h04Var6 = new h04();
                h04Var6.f = d0.D0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                h04Var6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    h04Var6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet m0 = d0.m0(hq6.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (m0 != null) {
                        h04Var6.c = m0.documents;
                    } else {
                        h04Var6.d = hq6.b0(stickerSetCovered.set);
                    }
                } else {
                    h04Var6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList8 = h04Var6.c;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < h04Var6.c.size()) {
                            if (!k27.m3((TLRPC.Document) h04Var6.c.get(i7))) {
                                z3 = true;
                                break;
                            }
                            i7++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    h04Var6.e = !z3;
                    h04Var6.h = arrayList3.contains(Long.valueOf(h04Var6.b.id));
                    h04Var6.g = true;
                    arrayList4.add(h04Var6);
                }
            }
            yz3 yz3Var = t14Var.J;
            if (yz3Var != null) {
                yz3Var.p(t14Var.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.H():void");
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
                char[] cArr = ow3.a;
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
    public final void t(s49 s49Var, int i) {
        String str;
        String str2;
        Long l;
        TLRPC.Document document;
        int min;
        int i2;
        Long valueOf;
        h04 h04Var;
        int i3 = i;
        t14 t14Var = this.G;
        String[] strArr = t14Var.b1;
        uz3 uz3Var = t14Var.R;
        int i4 = t14Var.d1;
        ArrayList arrayList = t14Var.r1;
        int i5 = s49Var.f;
        View view = s49Var.a;
        int i6 = 8;
        boolean z = true;
        h04 h04Var2 = null;
        if (i5 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i5 != 1) {
                if (i5 != 5) {
                    if (i5 == 6) {
                        j04 j04Var = (j04) view;
                        int i7 = this.x.get(i3);
                        int i8 = uz3Var.J * 3;
                        if (i7 >= 0 && i7 < arrayList.size()) {
                            h04Var2 = (h04) arrayList.get(i7);
                        }
                        if (h04Var2 != null) {
                            j04Var.a.setText("+" + ((h04Var2.c.size() - i8) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                l04 l04Var = (l04) view;
                int length = sparseIntArray.get(i3) - strArr.length;
                h04 h04Var3 = (h04) arrayList.get(length);
                int i9 = length - 1;
                if (i9 >= 0) {
                    h04Var = (h04) arrayList.get(i9);
                } else {
                    h04Var = null;
                }
                if (h04Var3 == null || !h04Var3.g || (h04Var != null && !h04Var.e && h04Var.f && !y6c.h(i4).p())) {
                    z = false;
                }
                if (h04Var3 != null && h04Var3.d != null) {
                    hq6.d0(i4).n0(h04Var3.d, false);
                    h04Var3.d = null;
                }
                ah8 ah8Var = l04Var.r;
                if (h04Var3 != null) {
                    l04Var.x = h04Var3;
                    l04Var.y = z;
                    l04Var.d.l(h04Var3.b.title, false);
                    TextView textView = l04Var.e;
                    if (h04Var3.i) {
                        i6 = 0;
                    }
                    textView.setVisibility(i6);
                    if (h04Var3.f && !h04Var3.b.official) {
                        ah8Var.b(k96.M0(2131745889, null), new k04(l04Var, (byte) 5), false);
                    } else {
                        ah8Var.b(k96.M0(2131743637, null), new k04(l04Var, (byte) 6), false);
                    }
                    l04Var.a(false);
                    return;
                }
                return;
            }
            vza vzaVar = (vza) view;
            vzaVar.getClass();
            int i10 = sparseIntArray.get(i3);
            if (i3 == this.c) {
                vzaVar.b(k96.M0(2131750823, null), 2131232101, k96.M0(2131754899, null), 0, 0);
                return;
            } else if (i3 == this.f) {
                vzaVar.a(0, k96.M0(2131746168, null));
                return;
            } else if (i10 >= strArr.length) {
                try {
                    vzaVar.a(0, ((h04) arrayList.get(i10 - strArr.length)).b.title);
                    return;
                } catch (Exception unused) {
                    vzaVar.a(0, "");
                    return;
                }
            } else {
                vzaVar.a(0, strArr[i10]);
                return;
            }
        }
        c14 c14Var = (c14) view;
        c14Var.a = i3;
        c14Var.e = null;
        if (t14Var.e0) {
            i3--;
        }
        if (this.f >= 0) {
            i3--;
        }
        if (this.d >= 0) {
            i3 -= 2;
        }
        int size = t14Var.getRecentEmoji().size();
        if (i3 < size) {
            String str3 = t14Var.getRecentEmoji().get(i3);
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
                String[][] strArr2 = ow3.f;
                if (i11 < 8) {
                    String[] strArr3 = strArr2[i11];
                    int length2 = strArr3.length + 1;
                    int i12 = (i3 - size) - 1;
                    if (i12 >= 0 && i3 < size + length2) {
                        str = strArr3[i12];
                        String str4 = (String) vu3.j.get(str);
                        if (str4 != null) {
                            String c = t14.c(str, str4);
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
                boolean p = y6c.h(i4).p();
                int i13 = uz3Var.J * 3;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i14 >= arrayList2.size()) {
                        break;
                    }
                    h04 h04Var4 = (h04) arrayList.get(i14);
                    int intValue = ((Integer) arrayList2.get(i14)).intValue() + 1;
                    if ((h04Var4.f && !h04Var4.g && (h04Var4.e || p)) || h04Var4.h) {
                        min = h04Var4.c.size();
                    } else {
                        min = Math.min(i13, h04Var4.c.size());
                    }
                    int i15 = c14Var.a;
                    if (i15 >= intValue && (i2 = i15 - intValue) < min) {
                        c14Var.e = h04Var4;
                        TLRPC.Document document2 = (TLRPC.Document) h04Var4.c.get(i2);
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
            c14Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
            c14Var.a(null, z);
            if (c14Var.getSpan() == null || c14Var.getSpan().getDocumentId() != l.longValue()) {
                if (document != null) {
                    c14Var.setSpan(new gm(document, (Paint.FontMetricsInt) null));
                } else {
                    c14Var.setSpan(new gm(l.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            c14Var.setPadding(0, 0, 0, 0);
            c14Var.a(vu3.f(str), z);
            c14Var.setSpan(null);
        }
        c14Var.setTag(str2);
        c14Var.setContentDescription(str);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        vza vzaVar;
        t14 t14Var = this.G;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                View view = new View(t14Var.getContext());
                                view.setLayoutParams(new e49(-1, t14Var.c1));
                                vzaVar = view;
                            } else {
                                Context context = t14Var.getContext();
                                wjb wjbVar = t14Var.a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.a = textView;
                                textView.setTextSize(1, 13.0f);
                                zkb.X(textView, bkb.c6, wjbVar);
                                int L = gl.L(11.0f);
                                int i2 = bkb.Kf;
                                ShapeDrawable b0 = bkb.b0(L, bm2.o(bkb.v0(i2, wjbVar), 99));
                                vkb g = zkb.g(i2, 99);
                                textView.setBackground(b0);
                                zkb.j(textView, b0, g, null, wjbVar);
                                textView.setTypeface(gl.o());
                                textView.setPadding(gl.L(6.0f), gl.L(1.66f), gl.L(6.0f), gl.L(2.0f));
                                frameLayout.addView(textView, nme.e(-2, -2, 17));
                                vzaVar = frameLayout;
                            }
                        } else {
                            vzaVar = new l04(t14Var, t14Var.getContext());
                        }
                    } else {
                        Context context2 = t14Var.getContext();
                        r14 r14Var = new r14(t14Var, true);
                        t14Var.U = r14Var;
                        fu fuVar = new fu(t14Var, context2, r14Var);
                        fuVar.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
                        fuVar.setClipToPadding(false);
                        fuVar.i(new oq1((byte) 2));
                        fuVar.setOnItemClickListener(new u(this, (byte) 24));
                        vzaVar = fuVar;
                    }
                } else {
                    vzaVar = new i04(t14Var, t14Var.getContext());
                }
            } else {
                vza vzaVar2 = new vza(t14Var.getContext(), true, false, t14Var.a2, t14Var.j2);
                vzaVar2.setOnIconClickListener(new yj3(this, (byte) 5));
                vzaVar = vzaVar2;
            }
        } else {
            vzaVar = new c14(t14Var.getContext());
        }
        return new s49(vzaVar);
    }
}
