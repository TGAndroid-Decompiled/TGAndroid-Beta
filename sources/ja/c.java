package ja;

import ag.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.i0;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.o3;
import eg.q2;
import f0.e;
import f2.q1;
import f2.w0;
import g.q;
import g5.h0;
import g5.m0;
import hg.y1;
import i5.p;
import j$.util.DesugarCollections;
import j3.g0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l3.n0;
import l3.t;
import l8.m;
import lh.c3;
import m.u3;
import m.x0;
import m8.e0;
import ng.q0;
import ng.v;
import o7.d;
import o7.f;
import oh.f4;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.tu0;
import r0.m1;
import r4.g;
public class c implements ko0, a0, androidx.activity.result.b, q2, q1, o, r0.o, h0, p, t, OnCompleteListener, x0, qk0, s, tu0 {
    public static volatile c f9987b;
    public Object f9988a;

    public c(Object obj) {
        this.f9988a = obj;
    }

    public Set B() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f9988a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f9988a);
        }
        return unmodifiableSet;
    }

    public boolean C() {
        com.google.android.gms.common.api.internal.x0 x0Var = ((j0) this.f9988a).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public void D(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f9988a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void G(MessageObject messageObject) {
        ((z8) ((f4) this.f9988a).N1).f(false);
    }

    @Override
    public void H(float f10) {
        ((o3) this.f9988a).setOutlineWidth(f10);
    }

    @Override
    public View I(int i10) {
        return ((w0) this.f9988a).q(i10);
    }

    @Override
    public int J(View view) {
        return w0.v(view) + ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public m1 M0(View view, m1 m1Var) {
        boolean z4;
        m1 m1Var2;
        int b10;
        int c3;
        boolean z10;
        int c10;
        int d = m1Var.d();
        q qVar = (q) this.f9988a;
        Context context = qVar.f6769e;
        int d10 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.f6784y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f6784y.getLayoutParams();
            boolean z11 = true;
            if (qVar.f6784y.isShown()) {
                if (qVar.f6775i0 == null) {
                    qVar.f6775i0 = new Rect();
                    qVar.f6776j0 = new Rect();
                }
                Rect rect = qVar.f6775i0;
                Rect rect2 = qVar.f6776j0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.G;
                Method method = u3.f13356a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e6) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                m1 f10 = r0.j0.f(qVar.G);
                if (f10 == null) {
                    b10 = 0;
                } else {
                    b10 = f10.b();
                }
                if (f10 == null) {
                    c3 = 0;
                } else {
                    c3 = f10.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
                if (i11 > 0 && qVar.I == null) {
                    View view2 = new View(context);
                    qVar.I = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c3;
                    qVar.G.addView(qVar.I, -1, layoutParams);
                } else {
                    View view3 = qVar.I;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c3;
                            qVar.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = qVar.I;
                if (view4 == null) {
                    z11 = false;
                }
                if (z11 && view4.getVisibility() != 0) {
                    View view5 = qVar.I;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c10 = e.c(context, 2131099654);
                    } else {
                        c10 = e.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c10);
                }
                if (!qVar.N && z11) {
                    d10 = 0;
                }
                z4 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z11 = false;
            }
            if (z11) {
                qVar.f6784y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z4 = false;
        }
        View view6 = qVar.I;
        if (view6 != null) {
            if (z4) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            m1Var2 = m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a());
        } else {
            m1Var2 = m1Var;
        }
        return r0.j0.h(view, m1Var2);
    }

    @Override
    public void W(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        i0 i0Var = (i0) this.f9988a;
        Handler handler = i0Var.f540x0;
        i iVar = i0Var.f541y0;
        handler.removeCallbacks(iVar);
        TextView textView = i0Var.D0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override
    public void X(float f10, boolean z4) {
        n nVar = (n) this.f9988a;
        float f11 = nVar.f217b;
        float w10 = e2.c.w(nVar.f218c, f11, f10, f11);
        nVar.d = w10;
        if (z4) {
            m6 m6Var = nVar.f219e;
            m6Var.getClass();
            m6Var.b(null, w10);
        }
        nVar.invalidate();
    }

    @Override
    public void a(long j10) {
        f7.b bVar = ((n0) this.f9988a).S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        d dVar = new d(0, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i10 = o7.a.f16618a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        ((z7.a) this.f9988a).writeToParcel(obtain, 0);
        ((o7.c) ((f) obj).u()).E0(obtain, 2);
    }

    @Override
    public void b() {
        g0 g0Var = ((n0) this.f9988a).f11567c1;
        if (g0Var != null) {
            g0Var.f9152a.T = true;
        }
    }

    @Override
    public int d(View view) {
        return w0.z(view) - ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).topMargin;
    }

    @Override
    public void e(int i10, long j10, long j11) {
        f7.b bVar = ((n0) this.f9988a).S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void f(Object obj) {
        ((u7.c) obj).onLocationResult((LocationResult) this.f9988a);
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public float get() {
        return ((o3) this.f9988a).C;
    }

    @Override
    public CharSequence getContentDescription() {
        n nVar = (n) this.f9988a;
        float f10 = nVar.f217b;
        return String.valueOf(Math.round((nVar.f216a.getProgress() * (nVar.f218c - f10)) + f10));
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public TextureView h0() {
        return null;
    }

    @Override
    public void i() {
        f5.p pVar;
        n0 n0Var = (n0) this.f9988a;
        synchronized (n0Var.f9051a) {
            pVar = n0Var.f9061y;
        }
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override
    public void k(Object obj) {
        int i10;
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f9988a;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((Boolean) arrayList.get(i11)).booleanValue()) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            iArr[i11] = i10;
        }
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = f0Var.f915a;
        if (j0Var.f929c.r(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public void l(Exception exc) {
        h5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((n0) this.f9988a).S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public int n() {
        return ((w0) this.f9988a).G();
    }

    @Override
    public void o(View view, q0 q0Var, boolean z4, boolean z10) {
        v vVar = (v) this.f9988a;
        vVar.f16223a.ab(null, vVar.f16226e, vVar.f16224b, view, 0.0f, 0.0f, q0Var, false, z4, z10, false);
        AndroidUtilities.runOnUIThread(new c3(this, 19));
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f9988a;
        if (task.isSuccessful()) {
            m.K0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        m.K0(e0Var, false, null);
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((n0) this.f9988a).S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new kh.f(1, bVar, z4));
        }
    }

    @Override
    public void p() {
        ((n0) this.f9988a).f11565a1 = true;
    }

    @Override
    public c4.e q(g5.j0 j0Var, IOException iOException, int i10) {
        g gVar = ((r4.d) this.f9988a).f46616a;
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.f6873e;
    }

    @Override
    public void r(hg.f fVar) {
        fVar.a(((WindowManager) this.f9988a).getDefaultDisplay());
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public int v() {
        w0 w0Var = (w0) this.f9988a;
        return w0Var.f5951n - w0Var.C();
    }

    @Override
    public void x(g5.j0 j0Var, long j10, long j11) {
        boolean z4;
        r4.d dVar = (r4.d) this.f9988a;
        synchronized (h5.a.f7222i) {
            z4 = h5.a.f7223j;
        }
        if (!z4) {
            IOException iOException = new IOException(new ConcurrentModificationException());
            g gVar = dVar.f46616a;
            h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
            gVar.u(true);
            return;
        }
        dVar.a();
    }

    @Override
    public void y() {
        g0 g0Var = ((n0) this.f9988a).f11567c1;
        if (g0Var != null) {
            g0Var.f9152a.f9229n.d(2);
        }
    }

    @Override
    public void y0(MessageObject messageObject) {
        ((z8) ((f4) this.f9988a).N1).f(true);
    }

    public synchronized void z() {
        ((SharedPreferences) this.f9988a).edit().clear().commit();
    }

    public c(int i10) {
        switch (i10) {
            case 4:
                this.f9988a = new LinkedHashMap(0, 0.75f, true);
                return;
            case 24:
                this.f9988a = new f7.b[mf.b.values().length];
                return;
            default:
                this.f9988a = new HashSet();
                return;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f9988a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                z();
            }
        } catch (IOException e6) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e6.getMessage());
            }
        }
    }

    @Override
    public void A() {
    }

    @Override
    public void m() {
    }

    @Override
    public void s() {
    }

    @Override
    public void c(int i10) {
    }

    @Override
    public void w(int i10) {
    }

    @Override
    public void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
    }

    @Override
    public void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
