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
public final class x0a extends c79 {
    public int c;
    public int d;
    public int h;
    public final n1a s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public x0a(n1a n1aVar) {
        this.s = n1aVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z) {
        n1a n1aVar = this.s;
        int i = n1aVar.a0;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z2 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = n1aVar.C1;
        if (arrayList2 != null) {
            if (i == 4 && !arrayList2.isEmpty()) {
                int i2 = this.n;
                this.n = i2 + 1;
                this.e = i2;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i3 = 0; i3 < n1aVar.C1.size(); i3++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, n1aVar.C1.get(i3))));
            }
        }
        if (i == 14) {
            ArrayList arrayList3 = n1aVar.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i4 = this.n;
                this.n = i4 + 1;
                this.f = i4;
                arrayList.add(2);
                this.c = this.n;
                for (int i5 = 0; i5 < n1aVar.D1.size(); i5++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, n1aVar.D1.get(i5))));
                }
            }
        } else {
            ArrayList arrayList4 = n1aVar.E1;
            if (arrayList4 != null) {
                if (i == 4 && !arrayList4.isEmpty()) {
                    int i6 = this.n;
                    this.n = i6 + 1;
                    this.f = i6;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i7 = 0; i7 < n1aVar.E1.size(); i7++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, n1aVar.E1.get(i7))));
                }
            }
        }
        ArrayList arrayList5 = n1aVar.F1;
        if (arrayList5 != null) {
            int i8 = this.n;
            this.h = i8;
            this.n = arrayList5.size() + i8;
        }
        f();
        if (n1aVar.A1 && this.n == 0) {
            z2 = true;
        }
        if (n1aVar.I1 != z2) {
            n1aVar.I1 = z2;
            ValueAnimator valueAnimator = n1aVar.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            n1aVar.J1 = ofFloat;
            ofFloat.addUpdateListener(new tz9(n1aVar, z2, (byte) 1));
            n1aVar.J1.addListener(new g0a(n1aVar, z2, (byte) 1));
            n1aVar.J1.setInterpolator(k43.h);
            n1aVar.J1.setDuration(100L);
            n1aVar.J1.start();
            if (z2) {
                n1a.D(n1aVar.W, n1aVar.m0);
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
        n1a n1aVar = this.s;
        int i3 = n1aVar.a0;
        if (i != this.e && i != this.f) {
            if (i3 == 14) {
                ArrayList arrayList = n1aVar.D1;
                if (arrayList != null && i >= (i2 = this.c) && i - i2 < arrayList.size()) {
                    return 4;
                }
            } else {
                int i4 = this.c;
                if (i > i4 && (i - i4) - 1 < n1aVar.E1.size()) {
                    return 5;
                }
            }
            ArrayList arrayList2 = n1aVar.C1;
            if (arrayList2 != null) {
                int i5 = this.d;
                if (i <= i5 || (i - i5) - 1 >= arrayList2.size() || (i3 != 13 && ((w49) n1aVar.C1.get((i - this.d) - 1)).g == 0)) {
                    int i6 = i - this.h;
                    if (i6 >= 0 && i6 < n1aVar.F1.size()) {
                        if (!(n1aVar.F1.get(i - this.h) instanceof k1a)) {
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
    public final void t(f89 f89Var, int i) {
        TLRPC.Document document;
        Long l;
        int i2;
        boolean contains;
        int cacheType;
        int i3;
        w49 w49Var;
        int cacheType2;
        int i4;
        int indexOf;
        n1a n1aVar = this.s;
        HashSet hashSet = n1aVar.L;
        int i5 = n1aVar.a0;
        int i6 = n1aVar.W;
        a0a a0aVar = n1aVar.j0;
        int i7 = f89Var.f;
        View view = f89Var.a;
        if (i7 == 6) {
            s0a s0aVar = (s0a) view;
            ArrayList arrayList = n1aVar.F1;
            if (arrayList != null && (i4 = i - this.h) >= 0 && i4 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) n1aVar.F1.get(i - this.h);
                if (document2 instanceof k1a) {
                    CharSequence charSequence = ((k1a) document2).a;
                    String str = n1aVar.B1;
                    s0aVar.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(aob.v0(aob.Mf, s0aVar.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    s0aVar.a.setText(charSequence);
                    s0aVar.b(false);
                }
            } else if (i == this.e) {
                s0aVar.a(ob6.M0(2131751161, null), false);
            } else if (i5 == 14) {
                s0aVar.a(ob6.M0(2131744533, null), false);
            } else {
                s0aVar.a(ob6.M0(2131754751, null), false);
            }
            s0aVar.c.setVisibility(8);
        } else if (i7 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) n1aVar.E1.get((i - this.c) - 1);
            w0a w0aVar = (w0a) view;
            w0aVar.a(a0aVar);
            w0aVar.h.Z(jn5.b(document3), "100_100_firstframe", null, null, lp3.f(document3, aob.m6, 0.2f, null), 0L, "tgs", document3, 0);
            w0aVar.R = true;
            w0aVar.d = document3;
            w0aVar.e = null;
        } else if (i7 == 4) {
            w0a w0aVar2 = (w0a) view;
            w0aVar2.c = i;
            ImageReceiver imageReceiver = w0aVar2.n;
            ArrayList arrayList2 = n1aVar.C1;
            if (arrayList2 != null && i >= 0 && i < arrayList2.size()) {
                w49Var = (w49) n1aVar.C1.get(i);
            } else {
                ArrayList arrayList3 = n1aVar.D1;
                if (arrayList3 != null && i >= (i3 = this.c) && i - i3 < arrayList3.size()) {
                    w49Var = (w49) n1aVar.D1.get(i - this.c);
                } else {
                    return;
                }
            }
            if (w0aVar2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(w0aVar2);
                w0aVar2.h = imageReceiver2;
                imageReceiver2.m0(7);
                w0aVar2.h.I();
            }
            w0aVar2.h.p0(a0aVar);
            w0aVar2.y = w49Var;
            w0aVar2.E = false;
            w0aVar2.d(n1aVar.K.contains(w49Var), false);
            w0aVar2.b = false;
            w0aVar2.invalidate();
            if (i5 == 13) {
                w0aVar2.setDrawable(pv3.g(w49Var.f));
            } else if (!w49Var.b && w49Var.f != null) {
                w0aVar2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i6).r.get(w49Var.f);
                if (tL_availableReaction != null) {
                    ggb f = lp3.f(tL_availableReaction.activate_animation, aob.m6, 0.2f, null);
                    boolean e = i86.e(8200);
                    ImageReceiver imageReceiver3 = w0aVar2.h;
                    TLRPC.Document document4 = tL_availableReaction.select_animation;
                    if (!e) {
                        imageReceiver3.Z(jn5.b(document4), "60_60_firstframe", null, null, f, 0L, "tgs", w49Var, 0);
                    } else {
                        w49 w49Var2 = w49Var;
                        imageReceiver3.Y(jn5.b(document4), "60_60_pcache", jn5.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f, 0L, "tgs", w49Var2, 0);
                        w49Var = w49Var2;
                    }
                    ls6.d0(i6);
                    ls6.n1(imageReceiver, jn5.b(tL_availableReaction.around_animation), s49.a());
                } else {
                    w0aVar2.h.f();
                    imageReceiver.f();
                }
                w0aVar2.e = null;
                w0aVar2.d = null;
                w0aVar2.setDrawable(null);
                v0a v0aVar = w0aVar2.K;
                if (v0aVar != null) {
                    v0aVar.setVisibility(8);
                    w0aVar2.K.setImageReceiver(null);
                }
                if (tL_availableReaction == null && w49Var.b) {
                    w0aVar2.setDrawable(pv3.g(w49Var.f));
                }
            } else {
                w0aVar2.s = false;
                w0aVar2.e = new hm(w49Var.g, (Paint.FontMetricsInt) null);
                w0aVar2.d = null;
                w0aVar2.h.f();
                imageReceiver.f();
                wl wlVar = (wl) a0aVar.l3.get(w0aVar2.e.getDocumentId());
                if (wlVar == null) {
                    cacheType2 = n1aVar.getCacheType();
                    wlVar = wl.m(i6, w0aVar2.e.getDocumentId(), null, cacheType2);
                    a0aVar.l3.put(w0aVar2.e.getDocumentId(), wlVar);
                }
                w0aVar2.setDrawable(wlVar);
            }
            if (!yac.h(i6).p() && i5 == 14 && w49Var.b && w49Var.d) {
                w0aVar2.b();
                w0aVar2.K.setVisibility(0);
                w0aVar2.setEmojicon(null);
                return;
            }
            if (w49Var.e) {
                w0aVar2.setEmojicon(w49Var.f);
            } else {
                w0aVar2.setEmojicon(null);
            }
            v0a v0aVar2 = w0aVar2.K;
            if (v0aVar2 != null) {
                v0aVar2.setVisibility(4);
            }
        } else if (i7 == 3) {
            w0a w0aVar3 = (w0a) view;
            w0aVar3.a = false;
            w0aVar3.c = i;
            w0aVar3.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
            w0aVar3.setDrawable(null);
            ArrayList arrayList4 = n1aVar.C1;
            if (arrayList4 != null && i >= 0 && i < arrayList4.size()) {
                w49 w49Var3 = (w49) n1aVar.C1.get(i);
                w0aVar3.y = w49Var3;
                long j = w49Var3.g;
                if (j == 0) {
                    boolean contains2 = n1aVar.K.contains(w49Var3);
                    w0aVar3.E = true;
                    w0aVar3.setDrawable(pv3.g(w49Var3.f));
                    w0aVar3.d(contains2, false);
                    return;
                }
                l = Long.valueOf(j);
                if (i5 == 14 && !yac.h(i6).p() && w49Var3.b && w49Var3.d) {
                    w0aVar3.b();
                    w0aVar3.K.setVisibility(0);
                } else {
                    v0a v0aVar3 = w0aVar3.K;
                    if (v0aVar3 != null) {
                        v0aVar3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = n1aVar.F1;
                if (arrayList5 != null && (i2 = i - this.h) >= 0 && i2 < arrayList5.size()) {
                    document = (TLRPC.Document) n1aVar.F1.get(i - this.h);
                    if (!(document instanceof k1a)) {
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
                    w0aVar3.e = new hm(document, (Paint.FontMetricsInt) null);
                    w0aVar3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.id));
                } else {
                    hm hmVar = new hm(l.longValue(), (Paint.FontMetricsInt) null);
                    w0aVar3.e = hmVar;
                    w0aVar3.d = hmVar.document;
                    contains = hashSet.contains(l);
                }
                wl wlVar2 = (wl) a0aVar.l3.get(w0aVar3.e.getDocumentId());
                if (wlVar2 == null) {
                    cacheType = n1aVar.getCacheType();
                    wlVar2 = wl.m(i6, w0aVar3.e.getDocumentId(), null, cacheType);
                    a0aVar.l3.put(w0aVar3.e.getDocumentId(), wlVar2);
                }
                w0aVar3.setDrawable(wlVar2);
            }
            w0aVar3.d(contains, false);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View w0aVar;
        boolean z;
        n1a n1aVar = this.s;
        if (i == 6) {
            Context context = n1aVar.getContext();
            if (n1aVar.a0 == 6) {
                z = true;
            } else {
                z = false;
            }
            w0aVar = new s0a(n1aVar, context, z);
        } else if (i == 7) {
            w0aVar = new t62(n1aVar.getContext(), (byte) 25);
            w0aVar.setTag("searchbox");
        } else {
            w0aVar = new w0a(n1aVar, n1aVar.getContext());
        }
        if (n1aVar.g()) {
            w0aVar.setScaleX(0.0f);
            w0aVar.setScaleY(0.0f);
        }
        return new f89(w0aVar);
    }
}
