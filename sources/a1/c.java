package a1;

import a4.l;
import ag.s;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import bb.e0;
import bb.f0;
import bi.ad;
import bi.ca;
import bi.dd;
import bi.g1;
import bi.j7;
import bi.lc;
import bi.q6;
import bi.x;
import bi.y;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.w;
import com.google.firebase.messaging.z;
import di.h1;
import di.m2;
import di.m8;
import di.m9;
import di.n8;
import di.n9;
import di.o8;
import di.p7;
import di.s5;
import di.s9;
import di.u;
import di.u0;
import di.w0;
import di.x0;
import di.y9;
import h2.i;
import h2.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.oo0;
import r0.k1;
import r0.n;
import s4.m0;
import xh.k;
public final class c implements OnSuccessListener, i, j5.e, Utilities.Callback5, e5, b2, s, oe.d, oo0, Continuation, OnCompleteListener, bm0, Utilities.Callback2Return, am0, p7, s9, k, n {
    public final int f34a;
    public final Object f35b;

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        View view = ((j7) this.f35b).f4876b;
        if (view instanceof v0) {
            ((v0) view).M();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        g1 g1Var = (g1) this.f35b;
        if (z10) {
            long j10 = i10;
            if (g1Var.I != j10) {
                g1Var.I = j10;
                g1Var.f4637r.setText(g1.o(j10));
            }
            g1Var.n(true);
        }
    }

    @Override
    public k1 P0(View view, k1 k1Var) {
        int a2;
        y9 y9Var = (y9) this.f35b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y9Var.v.getLayoutParams();
        if (!y9Var.f9422c) {
            i10 = k1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (y9Var.f9422c) {
            a2 = k1Var.f47115a.f(2).d;
        } else {
            a2 = k1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f13450a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f13452c;
        m9 m9Var = y9Var.f9456s;
        if (m9Var != null) {
            m9Var.requestLayout();
        }
        n9 n9Var = y9Var.v;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
        return k1.f47114b;
    }

    @Override
    public void a(int i10) {
        switch (this.f34a) {
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 11:
                r1 r1Var = (r1) this.f35b;
                if (i10 == 1) {
                    r1Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    r1Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                lc lcVar = (lc) this.f35b;
                if (i10 == 1) {
                    lcVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    lcVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        ((l) this.f35b).getClass();
        String c10 = f0.f3756b.c((e0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(ae.a.f1238a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(boolean z10) {
        s5 s5Var = (s5) this.f35b;
        if (s5Var != null) {
            s5Var.c();
        }
    }

    @Override
    public boolean c(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.c(int, android.view.View):boolean");
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f35b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        m2 m2Var = (m2) this.f35b;
        bi.r1 r1Var = m2Var.f9344c;
        ArrayList arrayList = m2Var.f9352r;
        w0 w0Var = ((u0) view).f9220f;
        int i14 = m2Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= w0Var.f9287f.size()) {
                break;
            }
            di.v0 v0Var = (di.v0) w0Var.f9287f.get(i16);
            long j12 = v0Var.f9242g;
            if (j12 > 0 && currentTime - v0Var.d <= u.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(v0Var.f9238a));
            }
            i16++;
        }
        h1 h1Var = m2Var.P;
        if (h1Var != null) {
            j10 = h1Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            di.v0 v0Var2 = (di.v0) arrayList.get(i17);
            if (!v0Var2.f9239b && v0Var2.e && v0Var2.f9242g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(v0Var2.f9238a))) {
                    j11 = j10;
                    if (m2Var.f9354w != w0Var.f9285b || (i13 = m2Var.f9355x) == 0 || v0Var2.f9238a < i13) {
                        i11 = v0Var2.f9238a;
                        break;
                    }
                } else {
                    j11 = j10;
                }
                i18++;
            }
            i17++;
            j10 = j11;
        }
        j11 = j10;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 < arrayList.size()) {
                    di.v0 v0Var3 = (di.v0) arrayList.get(i15);
                    if (v0Var3.f9239b || !v0Var3.e || v0Var3.f9242g >= j11) {
                        if (hashSet.contains(Integer.valueOf(v0Var3.f9238a))) {
                            i12 = v0Var3.f9238a;
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                    i15++;
                } else {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        m2Var.f9354w = w0Var.f9285b;
        m2Var.f9355x = i12;
        m2Var.f9356y = true;
        m0 itemAnimator = r1Var.getItemAnimator();
        r1Var.setItemAnimator(null);
        m2Var.d.i1(i18, r1Var.getHeight() / 2, true);
        m2Var.e.m(i18);
        r1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void f(long j10) {
        ((q6) this.f35b).h();
    }

    @Override
    public void g(j jVar) {
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        ((a4.k) this.f35b).f274b.add(jVar2);
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f34a) {
            case 6:
                ((Utilities.Callback) this.f35b).run(e2Var.h(i10, true, true));
                return;
            default:
                ((Runnable) this.f35b).run();
                return;
        }
    }

    @Override
    public void o(xh.g gVar, float f7, float f10) {
        o8 o8Var;
        n8 n8Var = (n8) this.f35b;
        if (!n8Var.v.f8891x) {
            gVar.f51870q = new m8(n8Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(o8Var.getHeight(), 2.0d) + Math.pow(o8Var.getWidth(), 2.0d));
            ArrayList arrayList = n8Var.f8842i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((xh.g) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 17:
                z.b((Intent) this.f35b);
                return;
            case 18:
                ((b0) this.f35b).f7728b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f34a) {
            case 0:
                ((b) this.f35b).invoke(obj);
                return;
            case 14:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 15:
                w wVar = (w) obj;
                if (((FirebaseMessaging) this.f35b).e.q() && wVar.h.a() != null) {
                    synchronized (wVar) {
                        z10 = wVar.f7781g;
                    }
                    if (!z10) {
                        wVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((b1.f) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Long l4 = (Long) obj;
        return x0.a((x0) this.f35b, (Long) obj2);
    }

    @Override
    public Object then(Task task) {
        ((aa.m0) this.f35b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34a) {
            case 4:
                x xVar = (x) this.f35b;
                t61 t61Var = (t61) obj;
                View view = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                y yVar = xVar.f5639r;
                if (t61Var.G instanceof TL_stars.StarsTransaction) {
                    dd.g1(xVar.getContext(), true, yVar.f5716b, y.l0(yVar), (TL_stars.StarsTransaction) t61Var.G, y.m0(yVar));
                    return;
                } else if (xVar.h) {
                    xVar.h = false;
                    xVar.a();
                    return;
                } else {
                    return;
                }
            case 9:
                ca.b((ca) this.f35b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                ad adVar = (ad) this.f35b;
                t61 t61Var2 = (t61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                adVar.getClass();
                if (t61Var2.G instanceof TL_stars.StarsTransaction) {
                    dd.g1(adVar.getContext(), false, 0L, adVar.f4291c, (TL_stars.StarsTransaction) t61Var2.G, adVar.f4290b);
                    return;
                }
                return;
        }
    }

    @Override
    public void z(float f7, int i10) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
