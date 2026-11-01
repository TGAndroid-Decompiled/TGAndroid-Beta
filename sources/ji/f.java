package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Message;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.emoji2.text.o;
import androidx.emoji2.text.s;
import bb.l;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import k1.n;
import kg.i1;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.u0;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.hr0;
import org.telegram.ui.sz0;
import org.telegram.ui.wz0;
import td.b0;
import td.c0;
import td.e0;
import td.f1;
import u2.r1;
import w7.b6;
import z9.w0;
import z9.x0;
public final class f implements mj0, wz0 {
    public static volatile f f10440f;
    public final int f10441a;
    public Object f10442b;
    public Object f10443c;
    public Object d;
    public Object e;

    public f(int i10, boolean z10) {
        this.f10441a = i10;
    }

    public static final Message a(f fVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    @Override
    public boolean A() {
        switch (this.f10441a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b() {
        i0.h3(new sz0((k2) this.f10442b, (Context) this.f10443c, (p6) this.d, (hi0) this.e, 2), 200L);
    }

    @Override
    public void c() {
        i0.h3(new hr0(28, (k2) this.f10442b, (hi0) this.e), 200L);
    }

    @Override
    public void d() {
        k2 k2Var = (k2) this.f10442b;
        k2Var.showDialog(new i1(k2Var, 3, true));
    }

    public w0 e() {
        String str;
        if (((x0) this.f10442b) == null) {
            str = " rolloutVariant";
        } else {
            str = "";
        }
        if (((String) this.f10443c) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = sc.e.A(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.f10442b, (String) this.f10443c, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public boolean f() {
        switch (this.f10441a) {
            case 10:
                return true;
            default:
                return true;
        }
    }

    public void g(Canvas canvas, int i10) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i10, i0.L(14.66f));
        RectF rectF = i0.P;
        float f7 = i10;
        rectF.set(0.0f, 0.0f, f7, i0.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (dd.X) {
            canvas.translate(f7, 0.0f);
        }
        int L = i10 - i0.L(25.0f);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            wr wrVar = (wr) arrayList.get(i11);
            L = a30.w(4.0f, wrVar.f32301g, L);
            if (L < 0) {
                break;
            }
            if (dd.X) {
                canvas.translate(-wrVar.f32301g, 0.0f);
                wrVar.a(canvas);
                canvas.translate(-i0.L(4.0f), 0.0f);
            } else {
                wrVar.a(canvas);
                canvas.translate(i0.L(4.0f) + wrVar.f32301g, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            wr wrVar2 = (wr) this.e;
            if (wrVar2 == null || wrVar2.f32297a != size) {
                ?? obj = new Object();
                obj.f32297a = size;
                rz0 rz0Var = new rz0(i0.a.i(size, "+"), 10.0f, i0.o());
                rz0Var.r((v2) this.f10442b);
                obj.f32299c = rz0Var;
                int L2 = i0.L(9.32f);
                rz0 rz0Var2 = obj.f32299c;
                obj.f32301g = L2 + ((int) rz0Var2.f30126c);
                rz0Var2.i();
                int i12 = t6.f21118n8;
                obj.f32300f = i12;
                obj.e = true;
                obj.d = t6.x0(null, i12, false);
                this.e = obj;
            }
            if (dd.X) {
                canvas.translate(-((wr) this.e).f32301g, 0.0f);
                ((wr) this.e).a(canvas);
                canvas.translate(-i0.L(4.0f), 0.0f);
            } else {
                ((wr) this.e).a(canvas);
                canvas.translate(i0.L(4.0f) + ((wr) this.e).f32301g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override
    public boolean h() {
        switch (this.f10441a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    public void k(e eVar) {
        if (((e) this.f10443c) != eVar) {
            return;
        }
        c cVar = (c) this.d;
        if (cVar != null) {
            i0.r(cVar);
            this.d = null;
        }
        c cVar2 = (c) this.e;
        if (cVar2 != null) {
            i0.r(cVar2);
            this.e = null;
        }
        synchronized (k.f10451y) {
            try {
                k kVar = k.A;
                if (kVar != null) {
                    kVar.q();
                    k.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f10443c = null;
        eVar.f10439c.run(-1L);
        q();
    }

    public boolean l() {
        return ((ArrayList) this.d).isEmpty();
    }

    public void m(k1.l r35) {
        throw new UnsupportedOperationException("Method not decompiled: ji.f.m(k1.l):void");
    }

    public ve.f p(String str) {
        if (str != null) {
            se.d dVar = new se.d((ArrayList) this.f10442b, (we.b) this.d, (ArrayList) this.f10443c);
            int i10 = 0;
            while (true) {
                int length = str.length();
                int i11 = i10;
                while (true) {
                    if (i11 < length) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    break;
                }
                dVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                dVar.i(str.substring(i10));
            }
            dVar.f(dVar.f48218n);
            we.a a2 = dVar.f48214j.a(new m5.e(24, dVar.f48215k, dVar.f48217m));
            for (xe.a aVar : dVar.f48219o) {
                aVar.g(a2);
            }
            ve.f fVar = (ve.f) dVar.f48216l.f48205b;
            Iterator it = ((ArrayList) this.e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            throw a1.g.h(it);
        }
        throw new NullPointerException("input must not be null");
    }

    public void q() {
        boolean z10;
        if (((e) this.f10443c) == null) {
            e eVar = (e) ((ArrayDeque) this.f10442b).pollFirst();
            this.f10443c = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.d = cVar;
                i0.h3(cVar, 10000L);
                b bVar = eVar.f10438b;
                String str = bVar.f10429b;
                String str2 = bVar.f10431f;
                d dVar = new d(this, eVar);
                a0 k10 = k.k(str);
                byte[] f7 = k.f(str2);
                int i10 = 0;
                if (k10 != null && f7 != null) {
                    try {
                        z10 = a.a.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        f8.g(th2, true);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (k.f10451y) {
                            k kVar = k.A;
                            if (kVar != null) {
                                kVar.q();
                                k.A = null;
                            }
                            try {
                                k kVar2 = new k(k10, str2, f7);
                                k.A = kVar2;
                                kVar2.f10472x = dVar;
                                u0 u0Var = u0.f18330f;
                                if (u0Var != null) {
                                    u0Var.d.add(kVar2);
                                }
                                kVar2.f10459j.execute(new g(kVar2, 1));
                                i0.g3(new g(kVar2, 2));
                                i10 = k.A.f10458i.getLocalPort();
                            } catch (Exception e) {
                                f8.g(e, true);
                                k kVar3 = k.A;
                                if (kVar3 != null) {
                                    kVar3.q();
                                    k.A = null;
                                }
                            }
                        }
                    }
                }
                eVar.d = i10;
                if (i10 == 0) {
                    k(eVar);
                }
            }
        }
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = this.f10441a;
    }

    public void s(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    @Override
    public void t() {
        int i10 = this.f10441a;
    }

    public String toString() {
        switch (this.f10441a) {
            case 6:
                return ((za.c) this.e).toString();
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((cd.h) this.f10442b), new l(this, arrayList, null, 2));
    }

    public void v(View view) {
        l.d dVar = (l.d) this.e;
        if (((View) this.f10443c) == view) {
            return;
        }
        w(null);
        View view2 = (View) this.f10443c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(dVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(dVar);
            if (view.isAttachedToWindow()) {
                w(view.getViewTreeObserver());
            }
        }
        this.f10443c = view;
    }

    public void w(ViewTreeObserver viewTreeObserver) {
        jf.d dVar = (jf.d) this.f10442b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(dVar);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
        }
        this.d = viewTreeObserver;
    }

    @Override
    public void x(android.view.View r13, sg.o0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ji.f.x(android.view.View, sg.o0, boolean, boolean):void");
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10441a = i10;
        this.f10442b = obj;
        this.f10443c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f10441a = i10;
        this.e = obj;
        this.f10442b = obj2;
        this.f10443c = obj3;
        this.d = obj4;
    }

    public f(jf.d dVar) {
        this.f10441a = 7;
        this.e = new l.d(this, 2);
        this.f10442b = dVar;
    }

    public f(c0 c0Var, ce.g gVar, n nVar) {
        this.f10441a = 5;
        this.f10442b = c0Var;
        this.f10443c = nVar;
        vd.a[] aVarArr = vd.a.f50782a;
        this.d = new vd.b(Integer.MAX_VALUE);
        this.e = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(b0.f48612b);
        if (f1Var == null) {
            return;
        }
        f1Var.invokeOnCompletion(new k1.i(0, gVar, this));
    }

    public f(bh.d dVar) {
        this.f10441a = 15;
        LinkedHashSet linkedHashSet = se.d.f48206p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) dVar.f2777a);
        for (Class cls : (LinkedHashSet) dVar.d) {
            arrayList.add(se.d.f48207q.get(cls));
        }
        this.f10442b = arrayList;
        we.b bVar = (u9.b) dVar.e;
        bVar = bVar == null ? new oa.d(25) : bVar;
        this.d = bVar;
        this.e = (ArrayList) dVar.f2779c;
        ArrayList arrayList2 = (ArrayList) dVar.f2778b;
        this.f10443c = arrayList2;
        bVar.a(new m5.e(24, arrayList2, Collections.EMPTY_MAP));
    }

    public f(v2 v2Var) {
        this.f10441a = 9;
        this.f10443c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.f10442b = v2Var;
    }

    public f(cd.h hVar) {
        this.f10441a = 2;
        this.f10442b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new a9.d(this, 1);
    }

    public f(int i10) {
        this.f10441a = i10;
        switch (i10) {
            case 8:
                this.f10442b = new ArrayList();
                this.f10443c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                return;
            default:
                this.f10442b = new ArrayDeque();
                return;
        }
    }

    public f(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f10441a = 1;
        this.e = typeface;
        this.f10442b = bVar;
        this.d = new s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.f44541a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f10443c = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.f44541a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            o oVar = new o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.f44541a) : 0, (char[]) this.f10443c, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.f44541a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                s sVar = (s) this.d;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.f44541a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public f(dg.f fVar) {
        this.f10441a = 3;
        LinearLayout linearLayout = new LinearLayout(fVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(i0.L(4.0f), i0.L(2.0f), i0.L(4.0f), i0.L(2.0f));
        if (fVar.E) {
            TextView textView = new TextView(fVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = i0.L(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(i0.o());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(fVar.getContext());
        this.f10443c = textView2;
        linearLayout.addView(textView2, b6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        n5 n5Var = new n5(fVar.getContext());
        this.f10442b = n5Var;
        linearLayout.addView(n5Var, b6.o(-1, -2));
        textView2.setGravity(8388611);
        n5Var.setGravity(8388613);
        n5Var.setTypeface(i0.o());
        n5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public f(r1 r1Var, boolean[] zArr) {
        this.f10441a = 14;
        this.f10442b = r1Var;
        this.f10443c = zArr;
        int i10 = r1Var.f50007a;
        this.d = new boolean[i10];
        this.e = new boolean[i10];
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void i(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }

    private final void j(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
