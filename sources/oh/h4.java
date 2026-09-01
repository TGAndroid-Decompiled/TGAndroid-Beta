package oh;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bz0;
import org.telegram.ui.ti0;
import org.telegram.ui.vz0;
import qh.ca;
import qh.ga;
public final class h4 implements e9, org.telegram.ui.Components.y4, og.g, h71, k81, androidx.activity.result.b, SuccessContinuation, zf.m, ga, g5.n0, OnSuccessListener, ra.m, u5.o, t5.a, uf.j1, androidx.lifecycle.s0, v4.f, wh.d1, xd.b {
    public final int f17179a;
    public Object f17180b;

    public h4(int i10, boolean z4) {
        this.f17179a = i10;
    }

    @Override
    public void A(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.G = f10;
        s6Var.f46062j = true;
        j5Var.c();
    }

    @Override
    public void B(long j10, boolean z4) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        if (!z4) {
            j5Var.m(j10);
            return;
        }
        k71 k71Var = j5Var.f45469e;
        if (k71Var != null) {
            k71Var.L(j10, true);
        } else if (j5Var.j()) {
            j5Var.B.m(j10, true);
        } else {
            k71 k71Var2 = j5Var.f45495y;
            if (k71Var2 != null) {
                k71Var2.L(j10, false);
            }
        }
    }

    @Override
    public androidx.lifecycle.p0 C(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f17180b) {
            if (cVar.f48844a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public boolean D(wh.e1 e1Var) {
        return false;
    }

    public void E(StringBuilder sb, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) ((String) this.f17180b));
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override
    public void E0(int i10, long j10) {
        ArrayList arrayList;
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var != null && (arrayList = s6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((qh.s6) j5Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void G() {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        j5Var.s(null, null, true);
        ca caVar = ((qh.q9) j5Var).f45919z0;
        qh.q9 q9Var = caVar.U0;
        if (q9Var != null) {
            q9Var.s(null, null, true);
        }
        qh.f9 f9Var = caVar.f45134s1;
        if (f9Var != null) {
            f9Var.q0();
        }
        qh.r9 r9Var = caVar.Z0;
        if (r9Var != null) {
            r9Var.setHasRoundVideo(false);
        }
        qh.s6 s6Var = caVar.H1;
        if (s6Var != null) {
            File file = s6Var.f46072o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                caVar.H1.f46072o0 = null;
            }
            if (caVar.H1.f46074p0 != null) {
                try {
                    new File(caVar.H1.f46074p0).delete();
                } catch (Exception unused2) {
                }
                caVar.H1.f46074p0 = null;
            }
        }
    }

    @Override
    public void H(CharSequence charSequence) {
        wh.y2 y2Var = ((wh.i5) this.f17180b).B;
        if (y2Var != null && charSequence != null && charSequence.length() > 0) {
            y2Var.f50171a.t4(charSequence.toString());
        }
    }

    @Override
    public void H0(long j10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.D = j10;
        s6Var.f46062j = true;
        j5Var.w(true);
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f17179a) {
            case 1:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.f17180b;
                f0Var.l0(i10, i11, z4);
                f0Var.dismiss();
                return;
            case 25:
                ((wh.q) this.f17180b).H(i10, z4, i11, false, 0L);
                wh.q qVar = (wh.q) this.f17180b;
                ti0 ti0Var = qVar.L;
                if (ti0Var != null) {
                    ti0Var.i();
                    qVar.L = null;
                    return;
                }
                return;
            default:
                ((wh.z1) this.f17180b).s0(i10, i11, z4);
                return;
        }
    }

    @Override
    public void J(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.f46080s0 = f10;
        s6Var.f46062j = true;
        j5Var.y(true);
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((xd.h) this.f17180b).i(f10);
    }

    public q5.o M() {
        q5.o oVar = (q5.o) this.f17180b;
        if (oVar.f44595a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f44598e)) {
                if (!Double.isNaN(oVar.f44599f) && oVar.f44599f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void O(Editable editable) {
        wh.i5 i5Var = (wh.i5) this.f17180b;
        wh.a aVar = i5Var.f50175a;
        if (aVar != null) {
            aVar.f49632s = true;
            aVar.f49631r = i5Var.f49798r.B;
        }
        i5Var.u();
        wh.y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f50175a != null) {
            y2Var.a();
        }
    }

    @Override
    public void P(g.x xVar) {
        switch (this.f17179a) {
            case 2:
                xVar.a(((mi) this.f17180b).getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((mq0) this.f17180b).getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    public boolean Q(int i10) {
        e81 e81Var = ((m81) this.f17180b).I;
        if (e81Var == null) {
            return false;
        }
        return e81Var.c(i10);
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public boolean T(boolean z4) {
        return false;
    }

    @Override
    public void U(boolean z4) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        if (j5Var.j()) {
            j5Var.B.getClass();
        }
        j5Var.x(-4, z4);
    }

    @Override
    public void V(ArrayList arrayList) {
        uf.u0 u0Var = (uf.u0) this.f17180b;
        String str = u0Var.W;
        if (str != null) {
            u0Var.U(str, u0Var.Z, u0Var.f48693a0, u0Var.Y, u0Var.X);
        }
    }

    @Override
    public void W(float f10, int i10) {
        ArrayList arrayList;
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var != null && (arrayList = s6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((qh.s6) j5Var.d.T.get(i10)).P = f10;
        }
    }

    @Override
    public void X(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.P = f10;
        j5Var.c();
    }

    public void Y(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f17180b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void Z() {
        HashMap hashMap = (HashMap) this.f17180b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    @Override
    public void a() {
        r4.g gVar = (r4.g) this.f17180b;
        gVar.B.a();
        b7.y0 y0Var = gVar.D;
        if (y0Var == null) {
            return;
        }
        throw y0Var;
    }

    public void a0(StringBuilder sb) {
        String str;
        if (((Boolean) e2.c.g(1, (ArrayList) this.f17180b)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb.append(str);
    }

    @Override
    public void b0(long j10, int i10, l3 l3Var) {
        int i11 = ProfileStoriesView.f34841p0;
        ((bz0) this.f17180b).f(true, false);
        l3Var.run();
    }

    @Override
    public void c(wh.e1 e1Var) {
        wh.y2 y2Var = ((wh.i5) this.f17180b).B;
        if (y2Var != null) {
            wh.r3 r3Var = y2Var.f50171a;
            wh.r3.M1(r3Var, e1Var);
            r3Var.f49980e3.h(e1Var, true);
        }
    }

    public void c0(StringBuilder sb) {
        while (!((ArrayList) this.f17180b).isEmpty()) {
            a0(sb);
        }
    }

    @Override
    public int d(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void d0(float f10, boolean z4) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var != null) {
            s6Var.Z = f10;
            s6Var.f46062j = true;
            k71 k71Var = j5Var.f45469e;
            if (k71Var != null && k71Var.p() != -9223372036854775807L) {
                j5Var.m(f10 * ((float) j5Var.f45469e.p()));
            }
        }
    }

    @Override
    public boolean e() {
        wh.i5 i5Var = (wh.i5) this.f17180b;
        wh.y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f50175a != null) {
            return y2Var.f50171a.S4();
        }
        return false;
    }

    public int e0(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        rb.a aVar = (rb.a) this.f17180b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z4 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f46790a[aVar.f46795g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            rb.a aVar2 = rb.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z4 = false;
                }
            }
            if (z4) {
                return 0;
            }
            rb.b bVar = new rb.b(aVar, iArr5);
            rb.b a2 = aVar.a(i10, 1);
            rb.b bVar2 = aVar.f46792c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            rb.b bVar3 = aVar.d;
            rb.b bVar4 = a2;
            rb.b bVar5 = bVar;
            rb.b bVar6 = bVar4;
            rb.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    rb.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c3 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c3));
                        bVar5 = bVar5.a(bVar6.h(d, c3));
                    }
                    rb.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        rb.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c10 = bVar3.c(0);
            if (c10 != 0) {
                int b11 = aVar.b(c10);
                rb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                rb.b bVar10 = bVarArr[0];
                rb.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.f46793e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c11 = aVar.c(iArr3[i24], b12);
                            if ((c11 & 1) == 0) {
                                i11 = c11 | 1;
                            } else {
                                i11 = c11 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c12 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c12;
                    if (aVar.f46795g != 0) {
                        iArr7[i22] = aVar.c(c12, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f46791b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void f(int i10) {
        qh.y yVar = ((qh.j5) this.f17180b).B;
        if (yVar != null) {
            ArrayList arrayList = yVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                qh.x xVar = (qh.x) obj;
                if (xVar.f46244a == i10) {
                    xVar.f46245b.d(1.0f, true);
                    yVar.invalidate();
                    return;
                }
            }
        }
    }

    public void f0(float f10) {
        m81 m81Var = (m81) this.f17180b;
        if (f10 == 1.0f) {
            View[] viewArr = m81Var.f28987e;
            View[] viewArr2 = m81Var.f28987e;
            if (viewArr[1] != null) {
                m81Var.F();
                m81Var.h.put(m81Var.f28988f[1], viewArr2[1]);
                m81Var.removeView(viewArr2[1]);
                m81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            m81Var.z(m81Var.f28985b);
            return;
        }
        View[] viewArr3 = m81Var.f28987e;
        View[] viewArr4 = m81Var.f28987e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (m81Var.f28994y) {
            m81Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            m81Var.E(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            m81Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            m81Var.E(view3, view3.getMeasuredWidth() * f10);
        }
        m81Var.w(false);
    }

    @Override
    public void g(int i10) {
        ((uf.u0) this.f17180b).l();
    }

    @Override
    public androidx.lifecycle.p0 h(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void h0(long j10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.f46078r0 = j10;
        s6Var.f46062j = true;
        j5Var.y(true);
    }

    @Override
    public void i(Canvas canvas) {
        switch (this.f17179a) {
            case 2:
                mi miVar = (mi) this.f17180b;
                canvas.drawColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                if (SharedConfig.chatBlurEnabled()) {
                    miVar.f29117z2.b(canvas, -3);
                    return;
                }
                return;
            default:
                mq0 mq0Var = (mq0) this.f17180b;
                canvas.drawColor(mq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                if (SharedConfig.chatBlurEnabled()) {
                    mq0Var.L0.b(canvas, -3);
                    return;
                }
                return;
        }
    }

    @Override
    public void j(int i10, int i11) {
        wh.d2 d2Var;
        wh.i5 i5Var = (wh.i5) this.f17180b;
        wh.y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f50175a != null && (d2Var = y2Var.f50171a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public void j0(boolean z4) {
        eg.z2 z2Var;
        ca caVar = ((qh.q9) ((qh.j5) this.f17180b)).f45919z0;
        qh.f9 f9Var = caVar.f45134s1;
        if (f9Var != null) {
            eg.z2 z2Var2 = null;
            if (!z4 && (f9Var.getSelectedEntity() instanceof eg.z2)) {
                caVar.f45134s1.D0(null, true);
            } else if (z4 && !(caVar.f45134s1.getSelectedEntity() instanceof eg.z2)) {
                qh.w4 w4Var = caVar.f45134s1.O0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < w4Var.getChildCount()) {
                        View childAt = w4Var.getChildAt(i11);
                        if (childAt instanceof eg.z2) {
                            z2Var = (eg.z2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        z2Var = null;
                        break;
                    }
                }
                if (z2Var != null) {
                    qh.f9 f9Var2 = caVar.f45134s1;
                    qh.w4 w4Var2 = f9Var2.O0;
                    while (true) {
                        if (i10 >= w4Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = w4Var2.getChildAt(i10);
                        if (childAt2 instanceof eg.z2) {
                            z2Var2 = (eg.z2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    f9Var2.D0(z2Var2, true);
                }
            }
        }
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f17180b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f368b;
        int i10 = aVar.f367a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f44145a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.L;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public boolean k1(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        i4 i4Var;
        i4 i4Var2;
        i4 i4Var3;
        i4 i4Var4;
        f9Var.f17145b = null;
        f9Var.f17146c = null;
        bz0 bz0Var = (bz0) this.f17180b;
        vz0 vz0Var = bz0Var.h;
        ArrayList arrayList = bz0Var.f34864w;
        if (bz0Var.K < 0.2f) {
            f9Var.f17145b = vz0Var.getImageReceiver();
            f9Var.f17146c = null;
            f9Var.f17144a = vz0Var;
            f9Var.h = 0.0f;
            f9Var.f17150i = AndroidUtilities.displaySize.y;
            f9Var.f17149g = (View) bz0Var.getParent();
            f9Var.d = bz0Var.f34866y;
            f9Var.f17155n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                i4 i4Var5 = (i4) arrayList.get(i13);
                if (i4Var5.f17210e >= 1.0f && i4Var5.f17207a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        i4Var3 = (i4) arrayList.get(i14);
                    } else {
                        i4Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        i4Var4 = (i4) arrayList.get(i15);
                    } else {
                        i4Var4 = null;
                    }
                    i4 d = ProfileStoriesView.d(i4Var3, i4Var4, i4Var5);
                    imageReceiver = i4Var5.f17208b;
                    i4Var2 = d;
                    i4Var = i4Var5;
                }
                i13++;
            } else {
                imageReceiver = null;
                i4Var = null;
                i4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.f17146c = imageReceiver;
        f9Var.f17145b = null;
        f9Var.f17144a = bz0Var;
        f9Var.h = 0.0f;
        f9Var.f17150i = AndroidUtilities.displaySize.y;
        f9Var.f17149g = (View) bz0Var.getParent();
        if (i4Var != null && i4Var2 != null) {
            f9Var.f17148f = new f1.a(this, new RectF(i4Var.f17217m), i4Var, new RectF(i4Var2.f17217m), i4Var2);
            return true;
        }
        f9Var.f17148f = null;
        return true;
    }

    @Override
    public long l(int i10) {
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        return 0L;
    }

    @Override
    public void m(String str, long j10, long j11, long j12) {
        s5.o oVar = (s5.o) this.f17180b;
        try {
            oVar.a(new s5.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e6) {
            u5.b bVar = s5.h.f47044k;
            Log.e(bVar.f48349a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e6);
        }
        Iterator it = oVar.f47068q.f47051i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void m0(float f10, int i10) {
        ArrayList arrayList;
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var != null && (arrayList = s6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((qh.s6) j5Var.d.T.get(i10)).V = f10;
        }
    }

    @Override
    public void n(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: oh.h4.n(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void onError(k71 k71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        z50 z50Var;
        VideoEditedInfo videoEditedInfo;
        y50 y50Var = (y50) this.f17180b;
        k71 k71Var = y50Var.E0.L;
        if (k71Var != null && k71Var.y() && i10 == 4 && (videoEditedInfo = (z50Var = y50Var.E0).K) != null) {
            k71 k71Var2 = z50Var.L;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            k71Var2.K(j10);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((r5.a) this.f17180b).getClass();
        j7.r5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p(HashMap hashMap) {
        if (((SparseArray) this.f17180b) == null) {
            this.f17180b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f17180b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public List q(long j10) {
        if (j10 >= 0) {
            return (List) this.f17180b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public boolean r(wh.e1 e1Var) {
        return false;
    }

    @Override
    public void r0(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.F = f10;
        s6Var.f46062j = true;
        j5Var.w(true);
    }

    @Override
    public void s(wh.e1 e1Var, int i10, int i11) {
        wh.y2 y2Var;
        org.telegram.ui.Cells.m9 textSelectionHelper;
        wh.i5 i5Var = (wh.i5) this.f17180b;
        if (!i5Var.D && i10 != i11 && (y2Var = i5Var.B) != null && (textSelectionHelper = y2Var.f50171a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != i5Var) {
                i5Var.post(new org.telegram.messenger.p6(this, e1Var, i11, textSelectionHelper, i10, 6));
            }
        }
    }

    @Override
    public void t(Bitmap bitmap) {
        u5.b bVar = t5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) android.support.v4.media.a.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((t5.h) this.f17180b).e(bitmap2, 0);
    }

    @Override
    public void t0(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.E = f10;
        s6Var.f46062j = true;
        j5Var.w(true);
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        e3.g gVar = (e3.g) this.f17180b;
        hc.a aVar = (hc.a) gVar.f4935f;
        p9.c cVar = (p9.c) gVar.f4932b;
        String str = aVar.f7370a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = hc.a.b(cVar);
            l7.w0 w0Var = new l7.w0(str, b10);
            w0Var.w("User-Agent", "Crashlytics Android SDK/18.6.0");
            w0Var.w("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            hc.a.a(w0Var, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(w0Var.p());
        } catch (IOException e6) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e6);
            jSONObject = null;
        }
        if (jSONObject != null) {
            p9.a i10 = ((org.telegram.ui.web.e0) gVar.f4933c).i(jSONObject);
            org.telegram.ui.Cells.f1 f1Var = (org.telegram.ui.Cells.f1) gVar.f4934e;
            long j10 = i10.f44219c;
            f1Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) f1Var.f22788b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        i9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.g.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f44226f;
                        SharedPreferences.Editor edit = ((Context) gVar.f4931a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) gVar.h).set(i10);
                        ((TaskCompletionSource) ((AtomicReference) gVar.f4937i).get()).trySetResult(i10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    i9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                i9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            i9.h.c(fileWriter, "Failed to close settings writer.");
            e3.g.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f44226f;
            SharedPreferences.Editor edit2 = ((Context) gVar.f4931a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) gVar.h).set(i10);
            ((TaskCompletionSource) ((AtomicReference) gVar.f4937i).get()).trySetResult(i10);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.f46084u0 = f10;
        s6Var.f46062j = true;
        j5Var.c();
    }

    @Override
    public void u0(float f10, int i10) {
        ArrayList arrayList;
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var != null && (arrayList = s6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((qh.s6) j5Var.d.T.get(i10)).W = f10;
        }
    }

    @Override
    public void v0(float f10) {
        qh.s6 s6Var = ((qh.j5) this.f17180b).d;
        if (s6Var == null) {
            return;
        }
        s6Var.f46042a0 = f10;
        s6Var.f46062j = true;
    }

    @Override
    public void w() {
        ((qh.c0) this.f17180b).d.invalidate();
    }

    @Override
    public void w0() {
        ((qh.j5) this.f17180b).p(null);
    }

    @Override
    public int x() {
        return 1;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void y0(float f10) {
        qh.j5 j5Var = (qh.j5) this.f17180b;
        qh.s6 s6Var = j5Var.d;
        if (s6Var == null) {
            return;
        }
        s6Var.f46082t0 = f10;
        s6Var.f46062j = true;
        j5Var.y(true);
    }

    @Override
    public Object y2() {
        Type type = (Type) this.f17180b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public void z(float f10, int i10) {
        ((xd.h) this.f17180b).i(f10);
    }

    public h4(Object obj, int i10) {
        this.f17179a = i10;
        this.f17180b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public h4(MediaInfo mediaInfo) {
        this.f17179a = 10;
        q5.o oVar = new q5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f17180b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public h4(JSONObject jSONObject) {
        this.f17179a = 10;
        this.f17180b = new q5.o(jSONObject);
    }

    public h4(int i10) {
        this.f17179a = i10;
        switch (i10) {
            case 27:
                this.f17180b = new ArrayList();
                return;
            default:
                this.f17180b = new HashMap();
                return;
        }
    }

    public h4(String str) {
        this.f17179a = 15;
        str.getClass();
        this.f17180b = str;
    }

    public h4(v1.c[] initializers) {
        this.f17179a = 22;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f17180b = initializers;
    }

    @Override
    public void S() {
    }

    @Override
    public void v() {
    }

    @Override
    public void F(boolean z4) {
    }

    @Override
    public void N(boolean z4) {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void o(wh.e1 e1Var) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
