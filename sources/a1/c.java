package a1;

import ab.e0;
import ab.f0;
import ai.ga;
import ai.h1;
import ai.jd;
import ai.m7;
import ai.md;
import ai.r0;
import ai.tc;
import ai.u1;
import ai.u6;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ci.aa;
import ci.n2;
import ci.o9;
import ci.p8;
import ci.p9;
import ci.q7;
import ci.q8;
import ci.r8;
import ci.t5;
import ci.u;
import ci.u0;
import ci.u9;
import ci.v0;
import ci.w0;
import ci.x0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.y;
import h2.i;
import h2.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.fo0;
import r0.k1;
import r0.n;
import s4.l0;
import wh.k;
import zf.m;
public final class c implements OnSuccessListener, i, i5.e, e5, a2, m, ne.d, Utilities.Callback5, fo0, yl0, Utilities.Callback2Return, xl0, q7, u9, k, n, Continuation, OnCompleteListener {
    public final int f34a;
    public final Object f35b;

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        int a2;
        aa aaVar = (aa) this.f35b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aaVar.v.getLayoutParams();
        if (!aaVar.f5183c) {
            i10 = k1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (aaVar.f5183c) {
            a2 = k1Var.f44873a.f(2).d;
        } else {
            a2 = k1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f12286a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f12288c;
        o9 o9Var = aaVar.f5217s;
        if (o9Var != null) {
            o9Var.requestLayout();
        }
        p9 p9Var = aaVar.v;
        if (p9Var != null) {
            p9Var.requestLayout();
        }
        return k1.f44872b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        h1 h1Var = (h1) this.f35b;
        if (z10) {
            long j10 = i10;
            if (h1Var.I != j10) {
                h1Var.I = j10;
                h1Var.f1398r.setText(h1.p(j10));
            }
            h1Var.o(true);
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.a(int, android.view.View):boolean");
    }

    @Override
    public Object apply(Object obj) {
        ((a6.m) this.f35b).getClass();
        String m10 = f0.f399b.m((e0) obj);
        kotlin.jvm.internal.i.d(m10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(m10));
        byte[] bytes = m10.getBytes(zd.a.f51555a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(boolean z10) {
        t5 t5Var = (t5) this.f35b;
        if (t5Var != null) {
            t5Var.c();
        }
    }

    @Override
    public void c(int i10) {
        switch (this.f34a) {
            case 8:
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
            case 9:
                s1 s1Var = (s1) this.f35b;
                if (i10 == 1) {
                    s1Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    s1Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                tc tcVar = (tc) this.f35b;
                if (i10 == 1) {
                    tcVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    tcVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        n2 n2Var = (n2) this.f35b;
        u1 u1Var = n2Var.f6136c;
        ArrayList arrayList = n2Var.f6144r;
        w0 w0Var = ((u0) view).f6036f;
        int i14 = n2Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= w0Var.f6103f.size()) {
                break;
            }
            v0 v0Var = (v0) w0Var.f6103f.get(i16);
            long j12 = v0Var.f6071g;
            if (j12 > 0 && currentTime - v0Var.d <= u.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(v0Var.f6067a));
            }
            i16++;
        }
        ci.h1 h1Var = n2Var.P;
        if (h1Var != null) {
            j10 = h1Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            v0 v0Var2 = (v0) arrayList.get(i17);
            if (!v0Var2.f6068b && v0Var2.e && v0Var2.f6071g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(v0Var2.f6067a))) {
                    j11 = j10;
                    if (n2Var.f6146w != w0Var.f6101b || (i13 = n2Var.f6147x) == 0 || v0Var2.f6067a < i13) {
                        i11 = v0Var2.f6067a;
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
                    v0 v0Var3 = (v0) arrayList.get(i15);
                    if (v0Var3.f6068b || !v0Var3.e || v0Var3.f6071g >= j11) {
                        if (hashSet.contains(Integer.valueOf(v0Var3.f6067a))) {
                            i12 = v0Var3.f6067a;
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
        n2Var.f6146w = w0Var.f6101b;
        n2Var.f6147x = i12;
        n2Var.f6148y = true;
        l0 itemAnimator = u1Var.getItemAnimator();
        u1Var.setItemAnimator(null);
        n2Var.d.i1(i18, u1Var.getHeight() / 2, true);
        n2Var.e.m(i18);
        u1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void e(float f7, Canvas canvas, RectF rectF, boolean z10) {
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
    public void f(j jVar) {
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        ((a4.k) this.f35b).f274b.add(jVar2);
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f34a) {
            case 4:
                ((Utilities.Callback) this.f35b).run(b2Var.g(i10, true, true));
                return;
            default:
                ((Runnable) this.f35b).run();
                return;
        }
    }

    @Override
    public void i(long j10) {
        ((u6) this.f35b).h();
    }

    @Override
    public void o(wh.g gVar, float f7, float f10) {
        r8 r8Var;
        q8 q8Var = (q8) this.f35b;
        if (!q8Var.v.f5939x) {
            gVar.f49106q = new p8(q8Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(r8Var.getHeight(), 2.0d) + Math.pow(r8Var.getWidth(), 2.0d));
            ArrayList arrayList = q8Var.f5856i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((wh.g) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 24:
                b0.b((Intent) this.f35b);
                return;
            case 25:
                ((d0) this.f35b).f7632b.trySetResult(null);
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
            case 12:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 22:
                y yVar = (y) obj;
                if (((FirebaseMessaging) this.f35b).e.q() && yVar.h.a() != null) {
                    synchronized (yVar) {
                        z10 = yVar.f7688g;
                    }
                    if (!z10) {
                        yVar.h(0L);
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
        switch (this.f34a) {
            case 14:
                Long l4 = (Long) obj;
                return x0.a((x0) this.f35b, (Long) obj2);
            default:
                hs0 hs0Var = (hs0) this.f35b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new di.u(hs0Var.f8071a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new r0(hs0Var, 10)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public Object then(Task task) {
        ((l) this.f35b).getClass();
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
    public void u(int i10, float f7, float f10, ne.e eVar) {
        View view = ((m7) this.f35b).f1823b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).N();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34a) {
            case 7:
                ga.b((ga) this.f35b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                jd jdVar = (jd) this.f35b;
                f61 f61Var = (f61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                jdVar.getClass();
                if (f61Var.G instanceof TL_stars.StarsTransaction) {
                    md.i1(jdVar.getContext(), false, 0L, jdVar.f1584c, (TL_stars.StarsTransaction) f61Var.G, jdVar.f1583b);
                    return;
                }
                return;
        }
    }

    @Override
    public void E(float f7, int i10) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
