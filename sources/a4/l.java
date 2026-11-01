package a4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.text.Editable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.p;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b2.w0;
import bi.d4;
import bi.e1;
import bi.j3;
import bi.m0;
import bi.m1;
import bi.n1;
import bi.o2;
import bi.p5;
import bi.r5;
import bi.u0;
import bi.v2;
import bi.y3;
import c7.v;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import e9.l1;
import g2.c0;
import g2.n;
import ig.c1;
import ig.s0;
import ig.z0;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import jg.a1;
import jg.c2;
import m.e2;
import m.s3;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import r0.h0;
import r0.j1;
import r0.m;
import u2.u;
import v7.t6;
import w7.f9;
import y2.o;
public final class l implements z3.d, a0, androidx.activity.result.b, s, m0, m1, OnCompleteListener, l1, f6.a, m, c2, e2, y2.g, m.k {
    public final int f278a;
    public Object f279b;

    public l(a6.i iVar) {
        this.f278a = 10;
        this.f279b = (r) iVar.f307b;
    }

    public void A(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f279b).putParcelable(str, bitmap);
    }

    @Override
    public void B(Editable editable) {
        ((r5) this.f279b).g();
    }

    public void C(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f279b).putLong("android.media.metadata.DURATION", j10);
    }

    public void D(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f279b).putCharSequence(str, str2);
    }

    @Override
    public void F(CharSequence charSequence) {
        y3 y3Var = ((e1) this.f279b).S;
        if (y3Var != null) {
            y3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                y3Var.f3465a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void G(float f7) {
        a1 a1Var = (a1) this.f279b;
        s0.e(a1Var.f9878a).k("-1", f7);
        a1Var.e.setBrushSize(f7);
    }

    @Override
    public boolean H(boolean z10) {
        return false;
    }

    @Override
    public boolean I(n1 n1Var) {
        return false;
    }

    @Override
    public j9 J() {
        return (e1) this.f279b;
    }

    @Override
    public bi.a L() {
        return ((e1) this.f279b).f2881a;
    }

    @Override
    public void M(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.f279b).x((o) iVar, j10, j11);
    }

    @Override
    public boolean O() {
        e1 e1Var = (e1) this.f279b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.f2881a;
            if (y3Var.f3465a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void R(int i10, int i11) {
        e1 e1Var = (e1) this.f279b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.f2881a;
            o2 o2Var = y3Var.f3465a.Q3;
            if (o2Var != null) {
                o2Var.f(i10, i11);
            }
        }
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        boolean z10;
        j1 j1Var2;
        int b10;
        int c10;
        boolean z11;
        int color;
        int d = j1Var.d();
        g.r rVar = (g.r) this.f279b;
        Context context = rVar.e;
        int d10 = j1Var.d();
        ActionBarContextView actionBarContextView = rVar.D;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.D.getLayoutParams();
            boolean z12 = true;
            if (rVar.D.isShown()) {
                if (rVar.f7236l0 == null) {
                    rVar.f7236l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f7236l0;
                Rect rect2 = rVar.m0;
                rect.set(j1Var.b(), j1Var.d(), j1Var.c(), j1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = s3.f12548a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = h0.f46134a;
                j1 a2 = r0.a0.a(viewGroup2);
                if (a2 == null) {
                    b10 = 0;
                } else {
                    b10 = a2.b();
                }
                if (a2 == null) {
                    c10 = 0;
                } else {
                    c10 = a2.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && rVar.L == null) {
                    View view2 = new View(context);
                    rVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                } else {
                    View view3 = rVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = rVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!rVar.Q && z12) {
                    d10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                rVar.D.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = rVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            j1Var2 = j1Var.f(j1Var.b(), d10, j1Var.c(), j1Var.a());
        } else {
            j1Var2 = j1Var;
        }
        return h0.g(view, j1Var2);
    }

    @Override
    public void W() {
        e1 e1Var = (e1) this.f279b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.f2881a;
            d4 d4Var = y3Var.f3465a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.f2938o3.onContentChanged();
        }
    }

    @Override
    public int a(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f278a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n7.m1 m1Var = (n7.m1) ((n7.l1) obj).v();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.f13698b);
                int i10 = n7.j.f13684a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) this.f279b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.f13697a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f45500a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (g7.f) this.f279b);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).v())).H0(obtain3, 6);
                return;
        }
    }

    @Override
    public void b(n1 n1Var) {
        switch (this.f278a) {
            case 6:
                y3 y3Var = ((e1) this.f279b).S;
                if (y3Var != null) {
                    d4 d4Var = y3Var.f3465a;
                    d4.P1(d4Var, n1Var);
                    d4Var.f2938o3.h(n1Var, true);
                    return;
                }
                return;
            default:
                p5 p5Var = ((r5) this.f279b).f3327s;
                if (p5Var != null) {
                    d4 d4Var2 = ((j3) p5Var).f3119a;
                    d4.P1(d4Var2, n1Var);
                    d4Var2.f2938o3.h(n1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public Object c(Object obj, Object obj2) {
        return ((d9.k) this.f279b).apply(obj2);
    }

    @Override
    public void d(l.l lVar, MenuItem menuItem) {
        ((l.f) this.f279b).f11480f.removeCallbacksAndMessages(lVar);
    }

    @Override
    public void e(n1 n1Var) {
        bi.a aVar;
        r5 r5Var = (r5) this.f279b;
        p5 p5Var = r5Var.f3327s;
        if (p5Var != null && (aVar = r5Var.f2881a) != null) {
            d4 d4Var = ((j3) p5Var).f3119a;
            ArrayList arrayList = d4Var.f2946s3;
            long j10 = aVar.f2833t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((bi.a) arrayList.get(i11)).f2824k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    bi.a aVar2 = new bi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f2824k;
                    ArrayList arrayList3 = aVar2.f2824k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a1.g.x(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    d4Var.v4();
                    d4Var.f31183f3.O(false);
                    o2 o2Var2 = d4Var.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    d4Var.post(new v2(d4Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public long g(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        return 0L;
    }

    @Override
    public float get() {
        a1 a1Var = (a1) this.f279b;
        int i10 = a1Var.f9878a;
        ig.h currentBrush = a1Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return s0.e(i10).f8457i;
        }
        return s0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public void h0() {
        e1 e1Var = (e1) this.f279b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.f2881a;
            d4.R1(y3Var.f3465a);
        }
    }

    @Override
    public void i(n1 n1Var, int i10, int i11) {
        p5 p5Var;
        k9 textSelectionHelper;
        r5 r5Var = (r5) this.f279b;
        if (!r5Var.f3329x && i10 != i11 && (p5Var = r5Var.f3327s) != null && (textSelectionHelper = ((j3) p5Var).f3119a.getTextSelectionHelper()) != null) {
            n1Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 1));
        }
    }

    @Override
    public void j() {
        e1 e1Var = (e1) this.f279b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            d4.S1(y3Var.f3465a, e1Var.f2881a);
        }
    }

    public c6.o k() {
        c6.o oVar = (c6.o) this.f279b;
        if (oVar.f3914a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f3917f) && oVar.f3917f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void k0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.f279b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f1115l0.d(null);
        }
    }

    @Override
    public k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        o oVar = (o) iVar;
        l2.h hVar = (l2.h) this.f279b;
        long j12 = oVar.f54188a;
        n nVar = oVar.f54189b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        int i11 = oVar.f54190c;
        hVar.f11594m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).f7305a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f54184f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        hVar.f11598q.s(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public void m(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.f279b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.f1464a;
        int i10 = f0Var.f1465b;
        androidx.fragment.app.s s10 = j0Var.f1478c.s(str);
        if (s10 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        s10.x(i10, aVar.f964a, aVar.f965b);
    }

    @Override
    public void n(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        o oVar = (o) iVar;
        l2.h hVar = (l2.h) this.f279b;
        if (i10 == 0) {
            long j12 = oVar.f54188a;
            uVar = new u(oVar.f54189b, j10);
        } else {
            long j13 = oVar.f54188a;
            n nVar = oVar.f54189b;
            c0 c0Var = oVar.d;
            uVar = new u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        }
        hVar.f11598q.u(uVar, oVar.f54190c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void o(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        o oVar = (o) iVar;
        l2.h hVar = (l2.h) this.f279b;
        long j13 = oVar.f54188a;
        n nVar = oVar.f54189b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        hVar.f11594m.getClass();
        hVar.f11598q.q(uVar, oVar.f54190c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f54191f;
        m2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f12640m.size();
        }
        long j14 = cVar.b(0).f12657b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).f12657b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f12640m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = hVar.M;
                j12 = -9223372036854775807L;
                if (j15 != -9223372036854775807L && cVar.h * 1000 <= j15) {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                } else {
                    hVar.L = 0;
                }
            }
            int i11 = hVar.L;
            hVar.L = i11 + 1;
            if (i11 < hVar.f11594m.q0(oVar.f54190c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        j12 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j10 - j11;
        hVar.J = j10;
        hVar.N += i10;
        synchronized (hVar.f11601t) {
            try {
                if (oVar.f54189b.f7315a.equals(hVar.E)) {
                    Uri uri = hVar.G.f12638k;
                    if (uri == null) {
                        uri = f9.a(oVar.d.f7285c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j12) {
            c5.a aVar = cVar3.f12636i;
            if (aVar != null) {
                String str = aVar.f3731b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.w();
                                return;
                            }
                        }
                        hVar.A(aVar, new kb.a(10));
                        return;
                    }
                    hVar.A(aVar, new Object());
                    return;
                }
                try {
                    hVar.K = l0.V(aVar.f3732c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (w0 e) {
                    hVar.y(e);
                    return;
                }
            }
            hVar.w();
            return;
        }
        hVar.z(true);
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f279b).f5781c, "launchApplication", task);
    }

    @Override
    public List p(long j10) {
        if (j10 >= 0) {
            return (List) this.f279b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void q(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a1.g.A(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (A - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, A, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f279b).e(bitmap2, 0);
    }

    @Override
    public int s() {
        return 1;
    }

    @Override
    public void t(l.l lVar, l.n nVar) {
        l.f fVar = (l.f) this.f279b;
        Handler handler = fVar.f11480f;
        l.e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f11481n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((l.e) arrayList.get(i10)).f11475b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            eVar = (l.e) arrayList.get(i11);
        }
        handler.postAtTime(new com.google.android.gms.internal.cast.o(this, eVar, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    public void u() {
        ig.a1 a1Var = ((c1) this.f279b).d;
        if (a1Var != null) {
            z0 z0Var = a1Var.f8275s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.f8275s = null;
            }
            z0 z0Var2 = new z0(a1Var, 1);
            a1Var.f8275s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    public String v(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.f279b;
            la.e eVar = new la.e(stringWriter, dVar.f11728a, dVar.f11729b, dVar.f11730c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f11732b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean x(n1 n1Var) {
        return false;
    }

    @Override
    public k9 y() {
        y3 y3Var = ((e1) this.f279b).S;
        if (y3Var == null) {
            return null;
        }
        return y3Var.f3465a.getTextSelectionHelper();
    }

    public ea.c z(JSONObject jSONObject) {
        ea.e dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new kb.a(5);
        } else {
            dVar = new oa.d(5);
        }
        return dVar.h1((t7.u) this.f279b, jSONObject);
    }

    public l(b7.a aVar, v vVar) {
        this.f278a = 5;
        this.f279b = vVar;
    }

    public l(Object obj, int i10) {
        this.f278a = i10;
        this.f279b = obj;
    }

    public l(MediaInfo mediaInfo) {
        this.f278a = 11;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f279b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public l(JSONObject jSONObject) {
        this.f278a = 11;
        this.f279b = new c6.o(jSONObject);
    }

    public l(int i10) {
        this.f278a = i10;
        switch (i10) {
            case 20:
                return;
            default:
                this.f279b = new Bundle();
                return;
        }
    }

    public l(MediaMetadataCompat mediaMetadataCompat) {
        this.f278a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f844a);
        this.f279b = bundle;
        android.support.v4.media.session.a0.k(bundle);
    }

    @Override
    public void r() {
    }

    @Override
    public void w(CharSequence charSequence) {
    }

    @Override
    public void h(int i10, int i11) {
    }
}
