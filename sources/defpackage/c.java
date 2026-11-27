package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class c implements icc {
    public final byte a;
    public final Object b;

    public c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        l9c l9cVar;
        g41 g41Var = (g41) this.b;
        g41Var.M.dismiss();
        g41Var.E = (String) obj;
        g41Var.F = (TLRPC.InputDocument) obj2;
        g41Var.x = false;
        hl.r(g41Var.e);
        g41Var.n.setSticker(g41Var.E);
        g41Var.f0(true);
        wa waVar = g41Var.a;
        if (waVar != null && (l9cVar = waVar.g3) != null) {
            l9cVar.O(true);
        }
    }

    private final void c(Object obj, Object obj2) {
        TLRPC.Chat M0;
        i91 i91Var = (i91) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        boolean isEmpty = i91Var.G.isEmpty();
        ArrayList arrayList2 = i91Var.x;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty || !isEmpty2) {
            b8c c = b8c.c(1, 2131231774, ob6.M0(2131749244, null));
            c.r = true;
            arrayList.add(c);
            if (!i91Var.getUserConfig().X && !i91Var.getMessagesController().E3()) {
                b8c c2 = b8c.c(2, 2131231768, ob6.M0(2131749215, null));
                c2.r = true;
                arrayList.add(c2);
            }
            arrayList.add(b8c.C(null));
        }
        int i = 0;
        if (!isEmpty) {
            ArrayList arrayList3 = i91Var.G;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                Long l = (Long) obj3;
                if (l != null && (M0 = i91Var.getMessagesController().M0(l)) != null) {
                    k81 k81Var = new k81(i91Var, (byte) 0);
                    int i3 = g91.b;
                    b8c K = b8c.K(g91.class);
                    K.H = M0;
                    K.E = k81Var;
                    arrayList.add(K);
                }
            }
            arrayList.add(b8c.C(null));
        }
        if (!isEmpty2) {
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj4 = arrayList2.get(i);
                i++;
                f91 f91Var = (f91) obj4;
                t tVar = new t(i91Var, f91Var, (byte) 29);
                int i4 = d91.b;
                b8c K2 = b8c.K(d91.class);
                K2.H = f91Var;
                K2.E = tVar;
                K2.L(i91Var.e0(f91Var.c));
                arrayList.add(K2);
            }
            if (!i91Var.F) {
                arrayList.add(b8c.q(-1, 8));
                arrayList.add(b8c.q(-2, 8));
                arrayList.add(b8c.q(-3, 8));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        int i;
        qb1 qb1Var = (qb1) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = qb1Var.J;
        RectF rectF = qb1Var.z0;
        kb1 kb1Var = qb1Var.f;
        if (qb1Var.g()) {
            if (qb1Var.H == null) {
                runnable.run();
                return;
            }
            xt3 editText = kb1Var.getEditText();
            canvas.translate(-editText.q0, 0.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, qb1Var.H.getWidth(), qb1Var.H.getHeight(), 255, 31);
            rectF.set(0.0f, 1.0f, qb1Var.H.getWidth(), qb1Var.H.getHeight() - 1);
            qb1Var.h(qb1Var.Q, canvas, rectF, 0.0f, true, (-kb1Var.getX()) - editText.getPaddingLeft(), ((-kb1Var.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
            canvas.save();
            paint.setAlpha(165);
            canvas.drawBitmap(qb1Var.H, 0.0f, 0.0f, paint);
            canvas.restore();
            canvas.restore();
            return;
        }
        Paint c = qb1Var.Q.c(1.0f);
        xt3 editText2 = kb1Var.getEditText();
        if (c != null) {
            i = -1;
        } else {
            i = -2130706433;
        }
        editText2.setHintColor(i);
        if (c == null) {
            runnable.run();
            return;
        }
        xt3 editText3 = kb1Var.getEditText();
        canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
        runnable.run();
        canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c);
        canvas.restore();
    }

    private final void e(Object obj, Object obj2) {
        ((ng1) this.b).D0((ArrayList) obj, (l9c) obj2);
    }

    private final void f(Object obj, Object obj2) {
        int i;
        int i2;
        i1b i1bVar;
        ij1 ij1Var = (ij1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        ij1Var.R0 = -1;
        TLRPC.Chat M0 = uc7.s1(ij1Var.o0).M0(Long.valueOf(-ij1Var.p0));
        TLRPC.ChatFull N0 = uc7.s1(ij1Var.o0).N0(-ij1Var.p0);
        if (N0 != null) {
            i = N0.stats_dc;
        } else {
            i = -1;
        }
        if (ij1Var.b1) {
            arrayList.add(b8c.g(ij1Var.s0));
            i1b i1bVar2 = ij1Var.l1;
            if (i1bVar2 != null && !i1bVar2.l) {
                arrayList.add(b8c.h(5, i, i1bVar2));
                arrayList.add(b8c.B(-1, null));
            }
            i1b i1bVar3 = ij1Var.m1;
            if (i1bVar3 != null && !i1bVar3.l) {
                arrayList.add(b8c.h(2, i, i1bVar3));
                arrayList.add(b8c.B(-2, null));
            }
        }
        if (ij1Var.c1 && (i1bVar = ij1Var.n1) != null && !i1bVar.l) {
            arrayList.add(b8c.h(2, i, i1bVar));
            arrayList.add(b8c.B(-3, null));
        }
        if (ij1Var.o1) {
            arrayList.add(b8c.b(ob6.M0(2131748139, null)));
            arrayList.add(b8c.v(ij1Var.p1));
            arrayList.add(b8c.v(ij1Var.q1));
            arrayList.add(b8c.v(ij1Var.r1));
            arrayList.add(b8c.B(-4, ij1Var.u0));
        }
        if (M0 != null && M0.creator) {
            if (ij1Var.b1) {
                arrayList.add(b8c.b(ob6.M0(2131748160, null)));
                arrayList.add(b8c.k(ij1Var.w0));
                arrayList.add(b8c.B(-5, ij1Var.t0));
                int f = uc7.s1(ij1Var.o0).l4.b2.f();
                String M02 = ob6.M0(2131748119, null);
                boolean z = false;
                if (ij1Var.r0 < f) {
                    i2 = f;
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    Context context = a.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M02);
                    spannableStringBuilder.append((CharSequence) "  L");
                    wm2 wm2Var = new wm2(0, new hc(i2, null, context, false));
                    wm2Var.s = hl.L(1.0f);
                    spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    M02 = spannableStringBuilder;
                }
                b8c i3 = b8c.i(1, M02);
                if (ij1Var.r0 >= f && ij1Var.j1) {
                    z = true;
                }
                i3.L(z);
                arrayList.add(i3);
                arrayList.add(b8c.B(-8, ob6.M0(2131748118, null)));
            }
            if (ij1Var.c1) {
                arrayList.add(b8c.b(ob6.M0(2131748127, null)));
                arrayList.add(b8c.j(3, ij1Var.C0));
                arrayList.add(b8c.B(-6, ij1Var.v0));
            }
        }
        if (xc2.V(uc7.s1(ij1Var.o0).M0(Long.valueOf(-ij1Var.p0))) && uc7.s1(ij1Var.o0).l4.K2.f) {
            arrayList.add(yb.i(4, aob.v0(aob.lk, ij1Var.n0), g92.a0(ob6.M0(2131752449, null)), ob6.M0(2131752450, null)));
            arrayList.add(b8c.B(-7, null));
        }
        if (ij1Var.a1.a()) {
            ij1Var.R0 = arrayList.size();
            arrayList.add(b8c.n(ij1Var.T0, -2));
            return;
        }
        arrayList.add(b8c.B(-10, null));
    }

    private final void g(Object obj, Object obj2) {
        ArrayList arrayList;
        String str;
        cj1 cj1Var = (cj1) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        ej1 ej1Var = cj1Var.f;
        int i = cj1Var.d;
        int i2 = ej1.y;
        if (i == 0) {
            arrayList = ej1Var.r;
        } else {
            arrayList = ej1Var.n;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            int i4 = hza.b;
            b8c K = b8c.K(hza.class);
            K.H = (TL_stars.StarsTransaction) obj3;
            K.r = true;
            arrayList2.add(K);
        }
        if (i == 0) {
            str = ej1Var.s;
        } else {
            str = ej1Var.h;
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            arrayList2.add(b8c.q(arrayList2.size(), 7));
        }
    }

    private final void h(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.b).y0((Canvas) obj, (hcc) obj2);
    }

    private final void i(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.i(java.lang.Object, java.lang.Object):void");
    }

    private final void j(Object obj, Object obj2) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ((Runnable) obj2).run();
        ((ChatAttachAlertPhotoLayout) this.b).setStarsPrice(((Long) obj).longValue());
    }

    @Override
    public final void a(java.lang.Object r30, java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.a(java.lang.Object, java.lang.Object):void");
    }
}
