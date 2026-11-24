package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ex9 extends n39 {
    public int c;
    public int d;
    public int h;
    public final tx9 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public ex9(tx9 tx9Var) {
        this.s = tx9Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z) {
        tx9 tx9Var = this.s;
        int i = tx9Var.a0;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z2 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = tx9Var.C1;
        if (arrayList2 != null) {
            if (i == 4 && !arrayList2.isEmpty()) {
                int i2 = this.n;
                this.n = i2 + 1;
                this.e = i2;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i3 = 0; i3 < tx9Var.C1.size(); i3++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, tx9Var.C1.get(i3))));
            }
        }
        if (i == 14) {
            ArrayList arrayList3 = tx9Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i4 = this.n;
                this.n = i4 + 1;
                this.f = i4;
                arrayList.add(2);
                this.c = this.n;
                for (int i5 = 0; i5 < tx9Var.D1.size(); i5++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, tx9Var.D1.get(i5))));
                }
            }
        } else {
            ArrayList arrayList4 = tx9Var.E1;
            if (arrayList4 != null) {
                if (i == 4 && !arrayList4.isEmpty()) {
                    int i6 = this.n;
                    this.n = i6 + 1;
                    this.f = i6;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i7 = 0; i7 < tx9Var.E1.size(); i7++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, tx9Var.E1.get(i7))));
                }
            }
        }
        ArrayList arrayList5 = tx9Var.F1;
        if (arrayList5 != null) {
            int i8 = this.n;
            this.h = i8;
            this.n = arrayList5.size() + i8;
        }
        f();
        if (tx9Var.A1 && this.n == 0) {
            z2 = true;
        }
        if (tx9Var.I1 != z2) {
            tx9Var.I1 = z2;
            ValueAnimator valueAnimator = tx9Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            tx9Var.J1 = ofFloat;
            ofFloat.addUpdateListener(new zv9(tx9Var, z2, (byte) 1));
            tx9Var.J1.addListener(new nw9(tx9Var, z2, (byte) 1));
            tx9Var.J1.setInterpolator(s33.h);
            tx9Var.J1.setDuration(100L);
            tx9Var.J1.start();
            if (z2) {
                tx9.D(tx9Var.W, tx9Var.m0);
            }
        }
    }

    @Override
    public final int b() {
        return this.n;
    }

    @Override
    public final int d(int i) {
        int i2;
        tx9 tx9Var = this.s;
        int i3 = tx9Var.a0;
        if (i != this.e && i != this.f) {
            if (i3 == 14) {
                ArrayList arrayList = tx9Var.D1;
                if (arrayList != null && i >= (i2 = this.c) && i - i2 < arrayList.size()) {
                    return 4;
                }
            } else {
                int i4 = this.c;
                if (i > i4 && (i - i4) - 1 < tx9Var.E1.size()) {
                    return 5;
                }
            }
            ArrayList arrayList2 = tx9Var.C1;
            if (arrayList2 != null) {
                int i5 = this.d;
                if (i <= i5 || (i - i5) - 1 >= arrayList2.size() || (i3 != 13 && ((h19) tx9Var.C1.get((i - this.d) - 1)).g == 0)) {
                    int i6 = i - this.h;
                    if (i6 >= 0 && i6 < tx9Var.F1.size()) {
                        if (!(tx9Var.F1.get(i - this.h) instanceof qx9)) {
                            return 3;
                        }
                        return 6;
                    }
                    return 4;
                }
                return 3;
            }
            return 3;
        }
        return 6;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLRPC.Document document;
        Long l;
        int i2;
        boolean contains;
        int cacheType;
        int i3;
        h19 h19Var;
        int cacheType2;
        int i4;
        int indexOf;
        tx9 tx9Var = this.s;
        HashSet hashSet = tx9Var.L;
        int i5 = tx9Var.a0;
        int i6 = tx9Var.W;
        hw9 hw9Var = tx9Var.j0;
        int i7 = s49Var.f;
        View view = s49Var.a;
        if (i7 == 6) {
            zw9 zw9Var = (zw9) view;
            ArrayList arrayList = tx9Var.F1;
            if (arrayList != null && (i4 = i - this.h) >= 0 && i4 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) tx9Var.F1.get(i - this.h);
                if (document2 instanceof qx9) {
                    CharSequence charSequence = ((qx9) document2).a;
                    String str = tx9Var.B1;
                    zw9Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(bkb.v0(bkb.Lf, zw9Var.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    zw9Var.a.setText(charSequence);
                    zw9Var.b(false);
                }
            } else if (i == this.e) {
                zw9Var.a(k96.M0(2131751184, null), false);
            } else if (i5 == 14) {
                zw9Var.a(k96.M0(2131744639, null), false);
            } else {
                zw9Var.a(k96.M0(2131754755, null), false);
            }
            zw9Var.c.setVisibility(8);
        } else if (i7 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) tx9Var.E1.get((i - this.c) - 1);
            dx9 dx9Var = (dx9) view;
            dx9Var.a(hw9Var);
            dx9Var.h.Z(gl5.b(document3), "100_100_firstframe", null, null, uo3.f(document3, bkb.l6, 0.2f, null), 0L, "tgs", document3, 0);
            dx9Var.R = true;
            dx9Var.d = document3;
            dx9Var.e = null;
        } else if (i7 == 4) {
            dx9 dx9Var2 = (dx9) view;
            dx9Var2.c = i;
            ImageReceiver imageReceiver = dx9Var2.n;
            ArrayList arrayList2 = tx9Var.C1;
            if (arrayList2 != null && i >= 0 && i < arrayList2.size()) {
                h19Var = (h19) tx9Var.C1.get(i);
            } else {
                ArrayList arrayList3 = tx9Var.D1;
                if (arrayList3 != null && i >= (i3 = this.c) && i - i3 < arrayList3.size()) {
                    h19Var = (h19) tx9Var.D1.get(i - this.c);
                } else {
                    return;
                }
            }
            if (dx9Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(dx9Var2);
                dx9Var2.h = imageReceiver2;
                imageReceiver2.m0(7);
                dx9Var2.h.I();
            }
            dx9Var2.h.p0(hw9Var);
            dx9Var2.y = h19Var;
            dx9Var2.E = false;
            dx9Var2.d(tx9Var.K.contains(h19Var), false);
            dx9Var2.b = false;
            dx9Var2.invalidate();
            if (i5 == 13) {
                dx9Var2.setDrawable(vu3.g(h19Var.f));
            } else if (!h19Var.b && h19Var.f != null) {
                dx9Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i6).r.get(h19Var.f);
                if (tL_availableReaction != null) {
                    kcb f = uo3.f(tL_availableReaction.activate_animation, bkb.l6, 0.2f, null);
                    boolean e = e66.e(8200);
                    ImageReceiver imageReceiver3 = dx9Var2.h;
                    TLRPC.Document document4 = tL_availableReaction.select_animation;
                    if (!e) {
                        imageReceiver3.Z(gl5.b(document4), "60_60_firstframe", null, null, f, 0L, "tgs", h19Var, 0);
                    } else {
                        h19 h19Var2 = h19Var;
                        imageReceiver3.Y(gl5.b(document4), "60_60_pcache", gl5.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f, 0L, "tgs", h19Var2, 0);
                        h19Var = h19Var2;
                    }
                    hq6.d0(i6);
                    hq6.n1(imageReceiver, gl5.b(tL_availableReaction.around_animation), d19.a());
                } else {
                    dx9Var2.h.f();
                    imageReceiver.f();
                }
                dx9Var2.e = null;
                dx9Var2.d = null;
                dx9Var2.setDrawable(null);
                cx9 cx9Var = dx9Var2.K;
                if (cx9Var != null) {
                    cx9Var.setVisibility(8);
                    dx9Var2.K.setImageReceiver(null);
                }
                if (tL_availableReaction == null && h19Var.b) {
                    dx9Var2.setDrawable(vu3.g(h19Var.f));
                }
            } else {
                dx9Var2.s = false;
                dx9Var2.e = new gm(h19Var.g, (Paint.FontMetricsInt) null);
                dx9Var2.d = null;
                dx9Var2.h.f();
                imageReceiver.f();
                vl vlVar = (vl) hw9Var.l3.get(dx9Var2.e.getDocumentId());
                if (vlVar == null) {
                    cacheType2 = tx9Var.getCacheType();
                    vlVar = vl.m(i6, dx9Var2.e.getDocumentId(), null, cacheType2);
                    hw9Var.l3.put(dx9Var2.e.getDocumentId(), vlVar);
                }
                dx9Var2.setDrawable(vlVar);
            }
            if (!y6c.h(i6).p() && i5 == 14 && h19Var.b && h19Var.d) {
                dx9Var2.b();
                dx9Var2.K.setVisibility(0);
                dx9Var2.setEmojicon(null);
                return;
            }
            if (h19Var.e) {
                dx9Var2.setEmojicon(h19Var.f);
            } else {
                dx9Var2.setEmojicon(null);
            }
            cx9 cx9Var2 = dx9Var2.K;
            if (cx9Var2 != null) {
                cx9Var2.setVisibility(4);
            }
        } else if (i7 == 3) {
            dx9 dx9Var3 = (dx9) view;
            dx9Var3.a = false;
            dx9Var3.c = i;
            dx9Var3.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
            dx9Var3.setDrawable(null);
            ArrayList arrayList4 = tx9Var.C1;
            if (arrayList4 != null && i >= 0 && i < arrayList4.size()) {
                h19 h19Var3 = (h19) tx9Var.C1.get(i);
                dx9Var3.y = h19Var3;
                long j = h19Var3.g;
                if (j == 0) {
                    boolean contains2 = tx9Var.K.contains(h19Var3);
                    dx9Var3.E = true;
                    dx9Var3.setDrawable(vu3.g(h19Var3.f));
                    dx9Var3.d(contains2, false);
                    return;
                }
                l = Long.valueOf(j);
                if (i5 == 14 && !y6c.h(i6).p() && h19Var3.b && h19Var3.d) {
                    dx9Var3.b();
                    dx9Var3.K.setVisibility(0);
                } else {
                    cx9 cx9Var3 = dx9Var3.K;
                    if (cx9Var3 != null) {
                        cx9Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = tx9Var.F1;
                if (arrayList5 != null && (i2 = i - this.h) >= 0 && i2 < arrayList5.size()) {
                    document = (TLRPC.Document) tx9Var.F1.get(i - this.h);
                    if (!(document instanceof qx9)) {
                        l = null;
                    }
                }
                document = null;
                l = null;
            }
            if (l == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    dx9Var3.e = new gm(document, (Paint.FontMetricsInt) null);
                    dx9Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.id));
                } else {
                    gm gmVar = new gm(l.longValue(), (Paint.FontMetricsInt) null);
                    dx9Var3.e = gmVar;
                    dx9Var3.d = gmVar.document;
                    contains = hashSet.contains(l);
                }
                vl vlVar2 = (vl) hw9Var.l3.get(dx9Var3.e.getDocumentId());
                if (vlVar2 == null) {
                    cacheType = tx9Var.getCacheType();
                    vlVar2 = vl.m(i6, dx9Var3.e.getDocumentId(), null, cacheType);
                    hw9Var.l3.put(dx9Var3.e.getDocumentId(), vlVar2);
                }
                dx9Var3.setDrawable(vlVar2);
            }
            dx9Var3.d(contains, false);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View dx9Var;
        boolean z;
        tx9 tx9Var = this.s;
        if (i == 6) {
            Context context = tx9Var.getContext();
            if (tx9Var.a0 == 6) {
                z = true;
            } else {
                z = false;
            }
            dx9Var = new zw9(tx9Var, context, z);
        } else if (i == 7) {
            dx9Var = new d62(tx9Var.getContext(), (byte) 25);
            dx9Var.setTag("searchbox");
        } else {
            dx9Var = new dx9(tx9Var, tx9Var.getContext());
        }
        if (tx9Var.g()) {
            dx9Var.setScaleX(0.0f);
            dx9Var.setScaleY(0.0f);
        }
        return new s49(dx9Var);
    }
}
