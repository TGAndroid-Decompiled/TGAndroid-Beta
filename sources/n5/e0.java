package n5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.UUID;
import m.t3;
import nh.p0;
import nh.q0;
import of.u1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.x60;
import org.telegram.ui.nu0;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import qh.a4;
import qh.b2;
import qh.c3;
import qh.d1;
import qh.g0;
import qh.h3;
import qh.i3;
import qh.l3;
import qh.l4;
import qh.m3;
import qh.n3;
import qh.o3;
import qh.s5;
import qh.x1;
import yf.m2;
import yf.v1;
public class e0 implements OnCompleteListener, na.n, p0, q5.o, u1, k1, ig.g, ud.a, p5.a, ii, g0, m3, com.google.android.gms.common.api.internal.s, td.b, y2.b, v1 {
    public final int f18487a;
    public Object f18488b;

    public e0(Object obj, int i9) {
        this.f18487a = i9;
        this.f18488b = obj;
    }

    @Override
    public void B(float f10, int i9) {
        ((td.h) this.f18488b).i(f10);
    }

    @Override
    public String C(long j10) {
        return null;
    }

    @Override
    public void C0() {
        x1 x1Var = (x1) this.f18488b;
        x1Var.E0 = x1Var.G0;
        x1.Y(x1Var, false, false);
        x1Var.w0(2, true);
    }

    @Override
    public n9 D() {
        switch (this.f18487a) {
            case 17:
                i3 i3Var = ((qh.x) this.f18488b).K;
                if (i3Var != null) {
                    return i3Var.f46445a.getTextSelectionHelper();
                }
                return null;
            default:
                h3 h3Var = ((l4) this.f18488b).J;
                if (h3Var != null) {
                    return h3Var.f46419a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        fa faVar = (fa) this.f18488b;
        org.telegram.ui.Cells.g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f24357s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void G(CharSequence charSequence) {
        switch (this.f18487a) {
            case 17:
                i3 i3Var = ((qh.x) this.f18488b).K;
                if (i3Var != null) {
                    i3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        i3Var.f46445a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                h3 h3Var = ((l4) this.f18488b).J;
                if (h3Var != null) {
                    h3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        h3Var.f46419a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public m9 H() {
        switch (this.f18487a) {
            case 17:
                return (qh.x) this.f18488b;
            default:
                return (l4) this.f18488b;
        }
    }

    @Override
    public void H0(ArrayList arrayList) {
        boolean z10;
        an0 an0Var = (an0) this.f18488b;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            an0Var.F.add(((of.t1) arrayList.get(i9)).f19510a);
        }
        ox oxVar = an0Var.Q;
        if (oxVar != null) {
            if (an0Var.f19319z0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            oxVar.d(z10, false);
        }
        an0Var.l();
    }

    @Override
    public qh.a I() {
        switch (this.f18487a) {
            case 17:
                return ((qh.x) this.f18488b).f46834a;
            default:
                return ((l4) this.f18488b).f46834a;
        }
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        ((td.h) this.f18488b).i(f10);
    }

    @Override
    public x60 J1(View view) {
        return x60.H((x1) this.f18488b, view);
    }

    @Override
    public boolean K() {
        switch (this.f18487a) {
            case 17:
                qh.x xVar = (qh.x) this.f18488b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.f46834a;
                    if (i3Var.f46445a.S4()) {
                        return true;
                    }
                }
                return false;
            default:
                l4 l4Var = (l4) this.f18488b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.f46834a;
                    if (h3Var.f46419a.S4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    public float L0(qb.c cVar, qb.c cVar2) {
        int i9 = (int) cVar.f14749b;
        int i10 = (int) cVar2.f14749b;
        float i12 = i1((int) cVar.f14748a, i9, (int) cVar2.f14748a, i10);
        float i13 = i1((int) cVar2.f14748a, i10, (int) cVar.f14748a, i9);
        if (Float.isNaN(i12)) {
            return i13 / 7.0f;
        }
        if (Float.isNaN(i13)) {
            return i12 / 7.0f;
        }
        return (i12 + i13) / 14.0f;
    }

    @Override
    public void N0() {
        switch (this.f18487a) {
            case 17:
                qh.x xVar = (qh.x) this.f18488b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.f46834a;
                    o3.O1(i3Var.f46445a);
                    return;
                }
                return;
            default:
                l4 l4Var = (l4) this.f18488b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.f46834a;
                    o3.O1(h3Var.f46419a);
                    return;
                }
                return;
        }
    }

    @Override
    public void N1() {
        x1 x1Var = (x1) this.f18488b;
        x1Var.y0();
        x1Var.B0();
    }

    @Override
    public a0.h O() {
        return null;
    }

    @Override
    public void O0(int i9, t1 t1Var) {
        fa faVar = (fa) this.f18488b;
        org.telegram.ui.Cells.g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f24357s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public s0.d P0(int i9) {
        return null;
    }

    @Override
    public nu0 P1() {
        return null;
    }

    @Override
    public void Q(int i9, int i10) {
        switch (this.f18487a) {
            case 17:
                qh.x xVar = (qh.x) this.f18488b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.f46834a;
                    b2 b2Var = i3Var.f46445a.F3;
                    if (b2Var != null) {
                        b2Var.f(i9, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                l4 l4Var = (l4) this.f18488b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.f46834a;
                    b2 b2Var2 = h3Var.f46419a.F3;
                    if (b2Var2 != null) {
                        b2Var2.f(i9, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean R1(long j10) {
        return false;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
        fa faVar = (fa) this.f18488b;
        org.telegram.ui.Cells.g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f24357s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void T() {
        switch (this.f18487a) {
            case 17:
                qh.x xVar = (qh.x) this.f18488b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.f46834a;
                    o3 o3Var = i3Var.f46445a;
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.g();
                    }
                    o3Var.f46565d3.onContentChanged();
                    return;
                }
                return;
            default:
                l4 l4Var = (l4) this.f18488b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.f46834a;
                    o3 o3Var2 = h3Var.f46419a;
                    b2 b2Var2 = o3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.g();
                    }
                    o3Var2.f46565d3.onContentChanged();
                    return;
                }
                return;
        }
    }

    public qb.a T0(float f10, float f11, int i9, int i10) {
        int i11;
        qb.a b10;
        qb.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i9 - i12);
        lb.b bVar = (lb.b) this.f18488b;
        int min = Math.min(bVar.f16735a - 1, i9 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i10 - i12);
            int min2 = Math.min(bVar.f16736b - 1, i10 + i12) - max2;
            if (min2 >= f12) {
                lb.b bVar2 = (lb.b) this.f18488b;
                qb.b bVar3 = new qb.b(bVar2, max, max2, min, min2, f10);
                int i13 = bVar3.f46128e;
                int i14 = bVar3.f46127c;
                int i15 = i13 + i14;
                int i16 = bVar3.f46129f;
                int i17 = (i16 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i18 = 0; i18 < i16; i18++) {
                    if ((i18 & 1) == 0) {
                        i11 = (i18 + 1) / 2;
                    } else {
                        i11 = -((i18 + 1) / 2);
                    }
                    int i19 = i11 + i17;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i20 = i14;
                    while (i20 < i15 && !bVar2.b(i20, i19)) {
                        i20++;
                    }
                    int i21 = 0;
                    while (i20 < i15) {
                        if (bVar2.b(i20, i19)) {
                            if (i21 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i21 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i21 = 1;
                            } else {
                                i21++;
                                iArr[i21] = iArr[i21] + 1;
                            }
                        } else {
                            if (i21 == 1) {
                                i21++;
                            }
                            iArr[i21] = iArr[i21] + 1;
                        }
                        i20++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f46126b;
                if (!arrayList.isEmpty()) {
                    return (qb.a) arrayList.get(0);
                }
                throw kb.e.a();
            }
            throw kb.e.a();
        }
        throw kb.e.a();
    }

    @Override
    public boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean X(t1 t1Var) {
        return false;
    }

    public s0.d X0(int i9) {
        return null;
    }

    @Override
    public void X1(n3 n3Var, View view) {
        x1 x1Var = (x1) this.f18488b;
        x60 H = x60.H(x1Var, view);
        H.Q = true;
        x1Var.getParentActivity();
        x1Var.getResourceProvider();
        x1Var.f46817t0 = a4.b(H, x1Var, n3Var, false);
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Y0(int i9, t1 t1Var) {
        if (i9 == ((fa) this.f18488b).f24357s) {
            return true;
        }
        return false;
    }

    @Override
    public Object Y1() {
        Type type = (Type) this.f18488b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override
    public void a(long j10) {
        ((nh.r) this.f18488b).presentFragment(qn.R9(j10));
    }

    public boolean a1(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: n5.e0.a1(android.view.MotionEvent):boolean");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f18487a) {
            case 20:
                r6.f fVar = new r6.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i9 = a7.b.f104a;
                obtain.writeStrongBinder(fVar);
                a7.b.b(obtain, (q6.f) this.f18488b);
                a7.b.b(obtain, gVar);
                ((r6.b) ((r6.d) ((r6.e) obj).u())).E0(obtain, 6);
                return;
            default:
                k5.l lVar = new k5.l((TaskCompletionSource) obj2);
                s6.i iVar = (s6.i) ((s6.c) obj).u();
                Parcel I0 = iVar.I0();
                int i10 = s6.f.f47457a;
                I0.writeStrongBinder(lVar);
                s6.f.c(I0, (h5.e) this.f18488b);
                iVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public void b(String str, long j10, long j11, long j12) {
        o5.n nVar = (o5.n) this.f18488b;
        try {
            nVar.a(new o5.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            q5.b bVar = o5.h.f18983k;
            Log.e(bVar.f46009a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = nVar.f19004q.f18990i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public void c() {
        boolean z10;
        nh.r rVar = (nh.r) this.f18488b;
        td.a aVar = rVar.f18714a;
        q0 q0Var = rVar.v;
        if (q0Var.f18709n && q0Var.f18707l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        rVar.d.U2.N(true);
    }

    @Override
    public void c0(int i9) {
        ((x1) this.f18488b).n0(74, i9);
    }

    public boolean c1(int i9, int i10, Bundle bundle) {
        return false;
    }

    @Override
    public void c2(s5 s5Var, String str) {
        x1 x1Var = (x1) this.f18488b;
        if (x1Var.f46819v0 == null) {
            x1Var.f46819v0 = new t3(new kh.p(this, 22), x1Var.getResourceProvider());
        }
        x1Var.f46819v0.f(s5Var, str);
    }

    @Override
    public void close() {
        ((nh.r) this.f18488b).finishFragment();
    }

    @Override
    public void d(d1 d1Var) {
        switch (this.f18487a) {
            case 17:
                i3 i3Var = ((qh.x) this.f18488b).K;
                if (i3Var != null) {
                    o3 o3Var = i3Var.f46445a;
                    o3.M1(o3Var, d1Var);
                    o3Var.f46565d3.f1(d1Var, true);
                    return;
                }
                return;
            default:
                h3 h3Var = ((l4) this.f18488b).J;
                if (h3Var != null) {
                    o3 o3Var2 = h3Var.f46419a;
                    o3.M1(o3Var2, d1Var);
                    o3Var2.f46565d3.f1(d1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public pg.a d0() {
        return null;
    }

    @Override
    public void d2(l3 l3Var, View view) {
        x1 x1Var = (x1) this.f18488b;
        x60 H = x60.H(x1Var, view);
        H.Q = true;
        x1Var.f46817t0 = a4.c(H, x1Var, x1Var.getParentActivity(), x1Var.getResourceProvider(), l3Var, false);
    }

    @Override
    public void e(int i9) {
        boolean z10;
        an0 an0Var = (an0) this.f18488b;
        an0Var.f19319z0--;
        an0Var.f19286a0 = i9;
        if (an0Var.f19287b0 != i9) {
            an0Var.f19308s.clear();
        }
        if (an0Var.f19289c0 != i9) {
            an0Var.E.clear();
        }
        an0Var.J = true;
        ox oxVar = an0Var.Q;
        if (oxVar != null) {
            if (an0Var.f19319z0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            oxVar.d(z10, true);
        }
        an0Var.l();
        ox oxVar2 = an0Var.Q;
        if (oxVar2 != null) {
            oxVar2.c();
        }
    }

    @Override
    public boolean e0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return ((fa) this.f18488b).a();
    }

    @Override
    public boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g() {
        switch (this.f18487a) {
            case 17:
                qh.x xVar = (qh.x) this.f18488b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    o3.P1(i3Var.f46445a, xVar.f46834a);
                    return;
                }
                return;
            default:
                l4 l4Var = (l4) this.f18488b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    o3.P1(h3Var.f46419a, l4Var.f46834a);
                    return;
                }
                return;
        }
    }

    @Override
    public void g0(float f10) {
        ((m2) this.f18488b).setOutlineWidth(f10);
    }

    @Override
    public Object mo28get() {
        switch (this.f18487a) {
            case 25:
                return new t5.c((Context) ((e0) this.f18488b).f18488b, new ya.b(7), new wa.a(7), 9);
            default:
                return this.f18488b;
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void h0() {
        int i9;
        x1 x1Var = (x1) this.f18488b;
        c3 c3Var = x1Var.L.f46577j3;
        if (c3Var != null && c3Var.y() && x1Var.L.C4()) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        x1Var.w0(i9, true);
        x1Var.x0();
        x1Var.v0();
    }

    public float h1(int i9, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i20 = 1;
        if (Math.abs(i12 - i10) > Math.abs(i11 - i9)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = i9;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i9;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = (-abs) / 2;
        int i22 = -1;
        if (i13 < i15) {
            i17 = 1;
        } else {
            i17 = -1;
        }
        if (i14 < i16) {
            i22 = 1;
        }
        int i23 = i15 + i17;
        int i24 = i13;
        int i25 = i14;
        int i26 = 0;
        while (i24 != i23) {
            if (z10) {
                i18 = i25;
            } else {
                i18 = i24;
            }
            if (z10) {
                i19 = i24;
            } else {
                i19 = i25;
            }
            boolean z12 = z10;
            if (i26 == i20) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i27 = abs;
            if (z11 == ((lb.b) this.f18488b).b(i18, i19)) {
                if (i26 == 2) {
                    return g7.w.b(i24, i25, i13, i14);
                }
                i26++;
            }
            i21 += abs2;
            if (i21 > 0) {
                if (i25 == i16) {
                    break;
                }
                i25 += i22;
                i21 -= i27;
            }
            i24 += i17;
            abs = i27;
            z10 = z12;
            i20 = 1;
        }
        if (i26 == 2) {
            return g7.w.b(i23, i16, i13, i14);
        }
        return Float.NaN;
    }

    @Override
    public String i(t1 t1Var) {
        return null;
    }

    public float i1(int i9, int i10, int i11, int i12) {
        float f10;
        float f11;
        lb.b bVar = (lb.b) this.f18488b;
        float h12 = h1(i9, i10, i11, i12);
        int i13 = i9 - (i11 - i9);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i9 / (i9 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f16735a;
            if (i13 >= i15) {
                int i16 = i15 - 1;
                f10 = ((i15 - 1) - i9) / (i13 - i9);
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i10;
        int i17 = (int) (f12 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f12 / (i10 - i17);
        } else {
            int i18 = bVar.f16736b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (h1(i9, i10, (int) (((i13 - i9) * f11) + i9), i14) + h12) - 1.0f;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void k(Canvas canvas) {
        switch (this.f18487a) {
            case 8:
                ki kiVar = (ki) this.f18488b;
                canvas.drawColor(kiVar.getThemedColor(f6.f23001d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kiVar.f30177y2.b(canvas, -2);
                    return;
                }
                return;
            default:
                rp0 rp0Var = (rp0) this.f18488b;
                canvas.drawColor(rp0Var.getThemedColor(f6.f23001d6));
                if (SharedConfig.chatBlurEnabled()) {
                    rp0Var.K0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public int l0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean n(float f10) {
        boolean z10;
        x1 x1Var = (x1) this.f18488b;
        FrameLayout frameLayout = x1Var.f46814r0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f10 >= iArr[1]) {
                z10 = true;
                x1.Y(x1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        x1.Y(x1Var, z10, true);
        return z10;
    }

    @Override
    public void n0(qh.a aVar) {
        x1 x1Var = (x1) this.f18488b;
        if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(x1Var)) {
            ki kiVar = new ki(x1Var.getParentActivity(), x1Var, false, false, false, x1Var.getResourceProvider());
            kiVar.V1 = new ya.b(21);
            kiVar.L = true;
            kiVar.f30158t1.setVisibility(8);
            kiVar.f30145p2 = new hq0(x1Var, aVar, kiVar, 5);
            kiVar.r1();
            kiVar.show();
        }
    }

    @Override
    public boolean n2(int i9) {
        return false;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        l51 l51Var = (l51) this.f18488b;
        float f12 = -dp;
        l51Var.f30366g.inset(f12, f12);
        boolean contains = l51Var.f30366g.contains(f10, f11);
        float f13 = dp;
        l51Var.f30366g.inset(f13, f13);
        return contains;
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override
    public boolean o0() {
        return f();
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((l51) this.f18488b).f30368j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        ((l51) this.f18488b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        ((l51) this.f18488b).h.c(false);
    }

    @Override
    public void onComplete(Task task) {
        c.h((c) ((j) this.f18488b).f18497c, "launchApplication", task);
    }

    @Override
    public void onContentChanged() {
        x1 x1Var = (x1) this.f18488b;
        if (x1Var.f46818u0 != null) {
            boolean m32 = x1Var.L.m3();
            x1Var.H0 = m32;
            x1Var.f46818u0.h(m32);
            x1Var.f46818u0.invalidate();
        }
        x1Var.B0();
        Runnable runnable = x1Var.I0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public void p(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: n5.e0.p(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public boolean p0(int i9) {
        if (i9 == ((an0) this.f18488b).Z) {
            return true;
        }
        return false;
    }

    @Override
    public o9 q2() {
        return null;
    }

    @Override
    public boolean r0(t5 t5Var) {
        return false;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public void t(wg wgVar) {
        NotificationCenter.getInstance(pf.l.Z((pf.l) this.f18488b)).doOnIdle(wgVar);
    }

    @Override
    public boolean t0() {
        return false;
    }

    @Override
    public void v1() {
        x1 x1Var = (x1) this.f18488b;
        int i9 = 0;
        x1.Y(x1Var, false, true);
        int i10 = x1Var.E0;
        if (i10 != 2) {
            i9 = i10;
        }
        x1Var.w0(i9, true);
    }

    @Override
    public void x0(g.x xVar) {
        switch (this.f18487a) {
            case 8:
                xVar.a(((ki) this.f18488b).getThemedColor(f6.f23001d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((rp0) this.f18488b).getThemedColor(f6.f23001d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void y0(Bitmap bitmap) {
        ((p5.h) this.f18488b).e(bitmap, 3);
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean z1() {
        return false;
    }

    public e0(s6.b bVar, h5.e eVar) {
        this.f18487a = 22;
        this.f18488b = eVar;
    }

    public e0(TextView textView) {
        this.f18487a = 15;
        this.f18488b = new q1.g(textView);
    }

    public e0(int i9) {
        this.f18487a = i9;
        switch (i9) {
            case 28:
                return;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f18488b = new lg0(this);
                    return;
                } else {
                    this.f18488b = new lg0(this);
                    return;
                }
        }
    }

    @Override
    public float get() {
        return ((m2) this.f18488b).B;
    }

    public e0(UUID uuid, int i9, byte[] bArr) {
        this.f18487a = 24;
        this.f18488b = uuid;
    }

    public e0(Context context, w10 w10Var) {
        this.f18487a = 9;
        this.f18488b = new v10(context, w10Var);
    }

    public e0(int i9, int i10) {
        this.f18487a = 10;
        this.f18488b = ApplicationLoader.applicationContext.getSharedPreferences(aa.d.k(i9, i10, "pip_layout_", "_"), 0);
    }

    @Override
    public void B0() {
    }

    @Override
    public void I1() {
    }

    @Override
    public void V0() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void k2() {
    }

    @Override
    public void m() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w() {
    }

    @Override
    public void A(Object obj) {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void A1(t1 t1Var) {
    }

    @Override
    public void C1(MessageObject messageObject) {
    }

    @Override
    public void E(TLRPC.User user) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void J(t1 t1Var) {
    }

    @Override
    public void M0(t1 t1Var) {
    }

    @Override
    public void N(t1 t1Var) {
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void R(t1 t1Var) {
    }

    @Override
    public void U(MessageObject messageObject) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void W0(t1 t1Var) {
    }

    @Override
    public void a0(t1 t1Var) {
    }

    @Override
    public void b1(int i9) {
    }

    @Override
    public void b2(t1 t1Var) {
    }

    @Override
    public void g2(t1 t1Var) {
    }

    @Override
    public void i0(int i9) {
    }

    @Override
    public void m0(t1 t1Var) {
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void s1(t1 t1Var) {
    }

    @Override
    public void v(t1 t1Var) {
    }

    @Override
    public void x(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S(int i9, t1 t1Var) {
    }

    @Override
    public void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void e2(t1 t1Var, long j10) {
    }

    @Override
    public void f1(d1 d1Var, boolean z10) {
    }

    @Override
    public void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void t1(t1 t1Var, boolean z10) {
    }

    @Override
    public void w1(t1 t1Var, eh.f fVar) {
    }

    @Override
    public void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void E0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void k0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void l1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override
    public void p2(t1 t1Var, int i9, int i10) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override
    public void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
