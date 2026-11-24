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
public final class f implements i8c {
    public final byte a;
    public final Object b;

    public f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        l5c l5cVar;
        y31 y31Var = (y31) this.b;
        y31Var.M.dismiss();
        y31Var.E = (String) obj;
        y31Var.F = (TLRPC.InputDocument) obj2;
        y31Var.x = false;
        gl.r(y31Var.e);
        y31Var.n.setSticker(y31Var.E);
        y31Var.f0(true);
        va vaVar = y31Var.a;
        if (vaVar != null && (l5cVar = vaVar.g3) != null) {
            l5cVar.O(true);
        }
    }

    private final void c(Object obj, Object obj2) {
        TLRPC.Chat K0;
        z81 z81Var = (z81) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        boolean isEmpty = z81Var.G.isEmpty();
        ArrayList arrayList2 = z81Var.x;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty || !isEmpty2) {
            c4c c = c4c.c(1, 2131231774, k96.M0(2131749298, null));
            c.r = true;
            arrayList.add(c);
            if (!z81Var.getUserConfig().X) {
                c4c c2 = c4c.c(2, 2131231768, k96.M0(2131749269, null));
                c2.r = true;
                arrayList.add(c2);
            }
            arrayList.add(c4c.C(null));
        }
        int i = 0;
        if (!isEmpty) {
            ArrayList arrayList3 = z81Var.G;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                Long l = (Long) obj3;
                if (l != null && (K0 = z81Var.getMessagesController().K0(l)) != null) {
                    d81 d81Var = new d81(z81Var, (byte) 0);
                    int i3 = x81.b;
                    c4c K = c4c.K(x81.class);
                    K.H = K0;
                    K.E = d81Var;
                    arrayList.add(K);
                }
            }
            arrayList.add(c4c.C(null));
        }
        if (!isEmpty2) {
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj4 = arrayList2.get(i);
                i++;
                w81 w81Var = (w81) obj4;
                t tVar = new t(z81Var, w81Var, (byte) 29);
                int i4 = u81.b;
                c4c K2 = c4c.K(u81.class);
                K2.H = w81Var;
                K2.E = tVar;
                K2.L(z81Var.e0(w81Var.c));
                arrayList.add(K2);
            }
            if (!z81Var.F) {
                arrayList.add(c4c.q(-1, 8));
                arrayList.add(c4c.q(-2, 8));
                arrayList.add(c4c.q(-3, 8));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        int i;
        ib1 ib1Var = (ib1) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = ib1Var.J;
        RectF rectF = ib1Var.z0;
        cb1 cb1Var = ib1Var.f;
        if (ib1Var.g()) {
            if (ib1Var.H == null) {
                runnable.run();
                return;
            }
            gt3 editText = cb1Var.getEditText();
            canvas.translate(-editText.q0, 0.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, ib1Var.H.getWidth(), ib1Var.H.getHeight(), 255, 31);
            rectF.set(0.0f, 1.0f, ib1Var.H.getWidth(), ib1Var.H.getHeight() - 1);
            ib1Var.h(ib1Var.Q, canvas, rectF, 0.0f, true, (-cb1Var.getX()) - editText.getPaddingLeft(), ((-cb1Var.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
            canvas.save();
            paint.setAlpha(165);
            canvas.drawBitmap(ib1Var.H, 0.0f, 0.0f, paint);
            canvas.restore();
            canvas.restore();
            return;
        }
        Paint c = ib1Var.Q.c(1.0f);
        gt3 editText2 = cb1Var.getEditText();
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
        gt3 editText3 = cb1Var.getEditText();
        canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
        runnable.run();
        canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c);
        canvas.restore();
    }

    private final void e(Object obj, Object obj2) {
        ((eg1) this.b).C0((ArrayList) obj, (l5c) obj2);
    }

    private final void f(Object obj, Object obj2) {
        int i;
        int i2;
        gxa gxaVar;
        zi1 zi1Var = (zi1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        zi1Var.R0 = -1;
        TLRPC.Chat K0 = na7.q1(zi1Var.o0).K0(Long.valueOf(-zi1Var.p0));
        TLRPC.ChatFull L0 = na7.q1(zi1Var.o0).L0(-zi1Var.p0);
        if (L0 != null) {
            i = L0.stats_dc;
        } else {
            i = -1;
        }
        if (zi1Var.b1) {
            arrayList.add(c4c.g(zi1Var.s0));
            gxa gxaVar2 = zi1Var.l1;
            if (gxaVar2 != null && !gxaVar2.l) {
                arrayList.add(c4c.h(5, i, gxaVar2));
                arrayList.add(c4c.B(-1, null));
            }
            gxa gxaVar3 = zi1Var.m1;
            if (gxaVar3 != null && !gxaVar3.l) {
                arrayList.add(c4c.h(2, i, gxaVar3));
                arrayList.add(c4c.B(-2, null));
            }
        }
        if (zi1Var.c1 && (gxaVar = zi1Var.n1) != null && !gxaVar.l) {
            arrayList.add(c4c.h(2, i, gxaVar));
            arrayList.add(c4c.B(-3, null));
        }
        if (zi1Var.o1) {
            arrayList.add(c4c.b(k96.M0(2131748193, null)));
            arrayList.add(c4c.v(zi1Var.p1));
            arrayList.add(c4c.v(zi1Var.q1));
            arrayList.add(c4c.v(zi1Var.r1));
            arrayList.add(c4c.B(-4, zi1Var.u0));
        }
        if (K0 != null && K0.creator) {
            if (zi1Var.b1) {
                arrayList.add(c4c.b(k96.M0(2131748214, null)));
                arrayList.add(c4c.k(zi1Var.w0));
                arrayList.add(c4c.B(-5, zi1Var.t0));
                int f = na7.q1(zi1Var.o0).k4.T1.f();
                String M0 = k96.M0(2131748173, null);
                boolean z = false;
                if (zi1Var.r0 < f) {
                    i2 = f;
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    Context context = a.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    spannableStringBuilder.append((CharSequence) "  L");
                    cm2 cm2Var = new cm2(0, new gc(i2, null, context, false));
                    cm2Var.s = gl.L(1.0f);
                    spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    M0 = spannableStringBuilder;
                }
                c4c i3 = c4c.i(1, M0);
                if (zi1Var.r0 >= f && zi1Var.j1) {
                    z = true;
                }
                i3.L(z);
                arrayList.add(i3);
                arrayList.add(c4c.B(-8, k96.M0(2131748172, null)));
            }
            if (zi1Var.c1) {
                arrayList.add(c4c.b(k96.M0(2131748181, null)));
                arrayList.add(c4c.j(3, zi1Var.C0));
                arrayList.add(c4c.B(-6, zi1Var.v0));
            }
        }
        if (hc2.V(na7.q1(zi1Var.o0).K0(Long.valueOf(-zi1Var.p0))) && na7.q1(zi1Var.o0).k4.C2.f) {
            arrayList.add(xb.i(4, bkb.v0(bkb.kk, zi1Var.n0), p82.a0(k96.M0(2131752462, null)), k96.M0(2131752463, null)));
            arrayList.add(c4c.B(-7, null));
        }
        if (zi1Var.a1.a()) {
            zi1Var.R0 = arrayList.size();
            arrayList.add(c4c.n(zi1Var.T0, -2));
            return;
        }
        arrayList.add(c4c.B(-10, null));
    }

    private final void g(Object obj, Object obj2) {
        ArrayList arrayList;
        String str;
        ti1 ti1Var = (ti1) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        vi1 vi1Var = ti1Var.f;
        int i = ti1Var.d;
        int i2 = vi1.y;
        if (i == 0) {
            arrayList = vi1Var.r;
        } else {
            arrayList = vi1Var.n;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            int i4 = dva.b;
            c4c K = c4c.K(dva.class);
            K.H = (TL_stars.StarsTransaction) obj3;
            K.r = true;
            arrayList2.add(K);
        }
        if (i == 0) {
            str = vi1Var.s;
        } else {
            str = vi1Var.h;
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            arrayList2.add(c4c.q(arrayList2.size(), 7));
        }
    }

    private final void h(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.b).v0((Canvas) obj, (h8c) obj2);
    }

    private final void i(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.i(java.lang.Object, java.lang.Object):void");
    }

    private final void j(Object obj, Object obj2) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ((Runnable) obj2).run();
        ((ChatAttachAlertPhotoLayout) this.b).setStarsPrice(((Long) obj).longValue());
    }

    @Override
    public final void a(java.lang.Object r36, java.lang.Object r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.a(java.lang.Object, java.lang.Object):void");
    }
}
