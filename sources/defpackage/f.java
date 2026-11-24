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
public final class f implements jac {
    public final byte a;
    public final Object b;

    public f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        l7c l7cVar;
        f51 f51Var = (f51) this.b;
        f51Var.M.dismiss();
        f51Var.E = (String) obj;
        f51Var.F = (TLRPC.InputDocument) obj2;
        f51Var.x = false;
        gm.r(f51Var.e);
        f51Var.n.setSticker(f51Var.E);
        f51Var.g0(true);
        va vaVar = f51Var.a;
        if (vaVar != null && (l7cVar = vaVar.g3) != null) {
            l7cVar.O(true);
        }
    }

    private final void c(Object obj, Object obj2) {
        TLRPC.Chat L0;
        ia1 ia1Var = (ia1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        boolean isEmpty = ia1Var.G.isEmpty();
        ArrayList arrayList2 = ia1Var.x;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty || !isEmpty2) {
            c6c c = c6c.c(1, 2131231775, jb6.M0(2131749247, null));
            c.r = true;
            arrayList.add(c);
            arrayList.add(c6c.C(null));
        }
        int i = 0;
        if (!isEmpty) {
            ArrayList arrayList3 = ia1Var.G;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                Long l = (Long) obj3;
                if (l != null && (L0 = ia1Var.getMessagesController().L0(l)) != null) {
                    m91 m91Var = new m91(ia1Var, (byte) 0);
                    int i3 = ga1.b;
                    c6c K = c6c.K(ga1.class);
                    K.H = L0;
                    K.E = m91Var;
                    arrayList.add(K);
                }
            }
            arrayList.add(c6c.C(null));
        }
        if (!isEmpty2) {
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj4 = arrayList2.get(i);
                i++;
                fa1 fa1Var = (fa1) obj4;
                t tVar = new t(ia1Var, fa1Var, (byte) 29);
                int i4 = da1.b;
                c6c K2 = c6c.K(da1.class);
                K2.H = fa1Var;
                K2.E = tVar;
                K2.L(ia1Var.f0(fa1Var.c));
                arrayList.add(K2);
            }
            if (!ia1Var.F) {
                arrayList.add(c6c.q(-1, 8));
                arrayList.add(c6c.q(-2, 8));
                arrayList.add(c6c.q(-3, 8));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        int i;
        pc1 pc1Var = (pc1) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = pc1Var.J;
        RectF rectF = pc1Var.z0;
        jc1 jc1Var = pc1Var.f;
        if (pc1Var.g()) {
            if (pc1Var.H == null) {
                runnable.run();
                return;
            }
            qu3 editText = jc1Var.getEditText();
            canvas.translate(-editText.q0, 0.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, pc1Var.H.getWidth(), pc1Var.H.getHeight(), 255, 31);
            rectF.set(0.0f, 1.0f, pc1Var.H.getWidth(), pc1Var.H.getHeight() - 1);
            pc1Var.h(pc1Var.Q, canvas, rectF, 0.0f, true, (-jc1Var.getX()) - editText.getPaddingLeft(), ((-jc1Var.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
            canvas.save();
            paint.setAlpha(165);
            canvas.drawBitmap(pc1Var.H, 0.0f, 0.0f, paint);
            canvas.restore();
            canvas.restore();
            return;
        }
        Paint c = pc1Var.Q.c(1.0f);
        qu3 editText2 = jc1Var.getEditText();
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
        qu3 editText3 = jc1Var.getEditText();
        canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
        runnable.run();
        canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c);
        canvas.restore();
    }

    private final void e(Object obj, Object obj2) {
        ((mh1) this.b).D0((ArrayList) obj, (l7c) obj2);
    }

    private final void f(Object obj, Object obj2) {
        int i;
        int i2;
        jza jzaVar;
        ik1 ik1Var = (ik1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        ik1Var.R0 = -1;
        TLRPC.Chat L0 = oc7.r1(ik1Var.o0).L0(Long.valueOf(-ik1Var.p0));
        TLRPC.ChatFull M0 = oc7.r1(ik1Var.o0).M0(-ik1Var.p0);
        if (M0 != null) {
            i = M0.stats_dc;
        } else {
            i = -1;
        }
        if (ik1Var.b1) {
            arrayList.add(c6c.g(ik1Var.s0));
            jza jzaVar2 = ik1Var.l1;
            if (jzaVar2 != null && !jzaVar2.l) {
                arrayList.add(c6c.h(5, i, jzaVar2));
                arrayList.add(c6c.B(-1, null));
            }
            jza jzaVar3 = ik1Var.m1;
            if (jzaVar3 != null && !jzaVar3.l) {
                arrayList.add(c6c.h(2, i, jzaVar3));
                arrayList.add(c6c.B(-2, null));
            }
        }
        if (ik1Var.c1 && (jzaVar = ik1Var.n1) != null && !jzaVar.l) {
            arrayList.add(c6c.h(2, i, jzaVar));
            arrayList.add(c6c.B(-3, null));
        }
        if (ik1Var.o1) {
            arrayList.add(c6c.b(jb6.M0(2131748142, null)));
            arrayList.add(c6c.v(ik1Var.p1));
            arrayList.add(c6c.v(ik1Var.q1));
            arrayList.add(c6c.v(ik1Var.r1));
            arrayList.add(c6c.B(-4, ik1Var.u0));
        }
        if (L0 != null && L0.creator) {
            if (ik1Var.b1) {
                arrayList.add(c6c.b(jb6.M0(2131748163, null)));
                arrayList.add(c6c.k(ik1Var.w0));
                arrayList.add(c6c.B(-5, ik1Var.t0));
                int f = oc7.r1(ik1Var.o0).l4.T1.f();
                String M02 = jb6.M0(2131748122, null);
                boolean z = false;
                if (ik1Var.r0 < f) {
                    i2 = f;
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    Context context = a.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M02);
                    spannableStringBuilder.append((CharSequence) "  L");
                    pn2 pn2Var = new pn2(0, new hd(i2, null, context, false));
                    pn2Var.s = gm.L(1.0f);
                    spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    M02 = spannableStringBuilder;
                }
                c6c i3 = c6c.i(1, M02);
                if (ik1Var.r0 >= f && ik1Var.j1) {
                    z = true;
                }
                i3.L(z);
                arrayList.add(i3);
                arrayList.add(c6c.B(-8, jb6.M0(2131748121, null)));
            }
            if (ik1Var.c1) {
                arrayList.add(c6c.b(jb6.M0(2131748130, null)));
                arrayList.add(c6c.j(3, ik1Var.C0));
                arrayList.add(c6c.B(-6, ik1Var.v0));
            }
        }
        if (sd2.V(oc7.r1(ik1Var.o0).L0(Long.valueOf(-ik1Var.p0))) && oc7.r1(ik1Var.o0).l4.C2.f) {
            arrayList.add(xb.i(4, cmb.v0(cmb.kk, ik1Var.n0), ba2.b0(jb6.M0(2131752421, null)), jb6.M0(2131752422, null)));
            arrayList.add(c6c.B(-7, null));
        }
        if (ik1Var.a1.a()) {
            ik1Var.R0 = arrayList.size();
            arrayList.add(c6c.n(ik1Var.T0, -2));
            return;
        }
        arrayList.add(c6c.B(-10, null));
    }

    private final void g(Object obj, Object obj2) {
        ArrayList arrayList;
        String str;
        ck1 ck1Var = (ck1) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        ek1 ek1Var = ck1Var.f;
        int i = ck1Var.d;
        int i2 = ek1.y;
        if (i == 0) {
            arrayList = ek1Var.r;
        } else {
            arrayList = ek1Var.n;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            int i4 = hxa.b;
            c6c K = c6c.K(hxa.class);
            K.H = (TL_stars.StarsTransaction) obj3;
            K.r = true;
            arrayList2.add(K);
        }
        if (i == 0) {
            str = ek1Var.s;
        } else {
            str = ek1Var.h;
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            arrayList2.add(c6c.q(arrayList2.size(), 7));
        }
    }

    private final void h(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.b).v0((Canvas) obj, (iac) obj2);
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
