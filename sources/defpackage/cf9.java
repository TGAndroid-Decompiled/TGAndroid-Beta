package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class cf9 implements ah9, rd9, me9, u84, hdc, au9, cx9, ln5, OnCompleteListener, nu4, e9, e58, h89, OnSuccessListener, r9, mae {
    public final byte a;
    public Object b;

    public cf9(Context context) {
        boolean isEmpty;
        this.a = (byte) 12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        h();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    @Override
    public final void A() {
        jf9 jf9Var = (jf9) this.b;
        int i = 0;
        jf9Var.z0(false, true);
        int i2 = jf9Var.J0;
        if (i2 != 2) {
            i = i2;
        }
        jf9Var.C0(i, true);
    }

    @Override
    public final void B() {
        ((u84) this.b).B();
    }

    @Override
    public final bu5 C(View view) {
        return bu5.I((jf9) this.b, view);
    }

    public final void D() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long J = J();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + J);
    }

    @Override
    public final void E() {
        jf9 jf9Var = (jf9) this.b;
        jf9Var.E0();
        vi3 vi3Var = jf9Var.z0;
        if (vi3Var == null) {
            return;
        }
        vi3Var.setLocked(jf9Var.j0());
    }

    @Override
    public final void E1() {
        vg9 vg9Var = ((zh9) this.b).O;
        if (vg9Var != null) {
            ch9 ch9Var = vg9Var.a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    public final void F(long j) {
        long J = J();
        if (J != j) {
            if (J != -1) {
                if (J == -2) {
                    J = -2;
                } else {
                    return;
                }
            }
            StringBuilder o = wi8.o(j, "expected non-string scope or scope ", " but found ");
            o.append(J);
            throw new IOException(o.toString());
        }
    }

    @Override
    public final boolean F1(int i) {
        if (i == ((qca) this.b).r) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean G(ne9 ne9Var) {
        return false;
    }

    @Override
    public final vh6 G0() {
        return null;
    }

    @Override
    public final gkb H0() {
        vg9 vg9Var = ((zh9) this.b).O;
        if (vg9Var != null) {
            return vg9Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public final void I(zg9 zg9Var, View view) {
        jf9 jf9Var = (jf9) this.b;
        bu5 I = bu5.I(jf9Var, view);
        I.T = true;
        jf9Var.y0 = ph9.c(I, jf9Var, jf9Var.getParentActivity(), jf9Var.getResourceProvider(), zg9Var, false);
    }

    public final long J() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public final void K(int i, Object obj, cde cdeVar) {
        fyd fydVar = (fyd) this.b;
        fydVar.m(i, 3);
        cdeVar.d((utd) obj, fydVar.a);
        fydVar.m(i, 4);
    }

    @Override
    public final void M(CharSequence charSequence) {
        kg9 kg9Var = ((kk9) this.b).F;
        if (kg9Var != null && charSequence != null && charSequence.length() > 0) {
            kg9Var.a.u4(charSequence.toString());
        }
    }

    public final void N(int i, Object obj, cde cdeVar) {
        utd utdVar = (utd) obj;
        fyd fydVar = (fyd) this.b;
        fydVar.o((i << 3) | 2);
        fydVar.o(utdVar.b(cdeVar));
        cdeVar.d(utdVar, fydVar.a);
    }

    @Override
    public final void O0(CharSequence charSequence) {
        vg9 vg9Var = ((zh9) this.b).O;
        if (vg9Var != null && charSequence != null && charSequence.length() > 0) {
            vg9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final void S(Editable editable) {
        kk9 kk9Var = (kk9) this.b;
        ll0 ll0Var = kk9Var.a;
        if (ll0Var != null) {
            ll0Var.s = true;
            ll0Var.r = kk9Var.r.q2;
        }
        kk9Var.w();
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null) {
            kg9Var.a();
        }
    }

    @Override
    public final fkb Y0() {
        return (zh9) this.b;
    }

    @Override
    public final boolean Z(boolean z) {
        return false;
    }

    @Override
    public final boolean a(float f) {
        int[] iArr;
        jf9 jf9Var = (jf9) this.b;
        FrameLayout frameLayout = jf9Var.w0;
        boolean z = false;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f >= iArr[1]) {
                z = true;
            }
        }
        jf9Var.z0(z, true);
        return z;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 22:
                q5d q5dVar = new q5d((TaskCompletionSource) obj2);
                n6d n6dVar = (n6d) ((t5d) obj).k();
                Parcel e = n6dVar.e();
                int i = y5d.a;
                e.writeStrongBinder(q5dVar);
                y5d.c(e, (hi0) this.b);
                n6dVar.f(e, 1);
                return;
            default:
                voe voeVar = new voe((TaskCompletionSource) obj2, (byte) 0);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i2 = zid.a;
                obtain.writeStrongBinder(voeVar);
                obtain.writeInt(1);
                ((b64) this.b).writeToParcel(obtain, 0);
                ((s0e) ((b2f) obj).k()).a(obtain, 2);
                return;
        }
    }

    @Override
    public final void b(xk9 xk9Var, String str) {
        jf9 jf9Var = (jf9) this.b;
        pr2 pr2Var = jf9Var.A0;
        if (pr2Var == null) {
            pr2Var = new pr2(new h68(this, (byte) 29), jf9Var.getResourceProvider());
            jf9Var.A0 = pr2Var;
        }
        pr2Var.z(xk9Var, str);
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        p09 y;
        boolean[] zArr = (boolean[]) this.b;
        if (z && (y = imageReceiver.y()) != null && !zArr[0]) {
            y.I(0, false, false);
            gm.c3(new xl1(y, (byte) 0));
            zArr[0] = true;
        }
    }

    @Override
    public final void c(int i) {
        ((jf9) this.b).q0(74, i);
    }

    @Override
    public final yzb c0(int i, int i2) {
        yzb c0 = ((u84) this.b).c0(i, i2);
        if (i2 != 1) {
            return c0;
        }
        return new uo4(c0);
    }

    @Override
    public final void d(ne9 ne9Var) {
        switch (this.a) {
            case 1:
                vg9 vg9Var = ((zh9) this.b).O;
                if (vg9Var != null) {
                    ch9 ch9Var = vg9Var.a;
                    ch9Var.i4(ne9Var);
                    ch9Var.p3.j(ne9Var, true);
                    return;
                }
                return;
            default:
                kg9 kg9Var = ((kk9) this.b).F;
                if (kg9Var != null) {
                    ch9 ch9Var2 = kg9Var.a;
                    ch9Var2.i4(ne9Var);
                    ch9Var2.p3.j(ne9Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final ll0 d1() {
        return ((zh9) this.b).a;
    }

    @Override
    public final void e() {
        int i;
        jf9 jf9Var = (jf9) this.b;
        qg9 qg9Var = jf9Var.Q.v3;
        if (qg9Var != null && qg9Var.w() && jf9Var.Q.E4()) {
            i = 1;
        } else {
            i = 0;
        }
        jf9Var.C0(i, true);
        jf9Var.D0();
        jf9Var.B0();
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final void f() {
        jf9 jf9Var = (jf9) this.b;
        jf9Var.J0 = jf9Var.L0;
        jf9Var.z0(false, false);
        jf9Var.C0(2, true);
    }

    @Override
    public final void f0(ix9 ix9Var) {
        ((u84) this.b).f0(ix9Var);
    }

    public final void g(y79 y79Var) {
        for (int i = 0; i < y79Var.d; i++) {
            ((HashSet) this.b).add(new r7a(((Integer) y79Var.get(i)).intValue()));
        }
    }

    @Override
    public final boolean g1() {
        vg9 vg9Var = ((zh9) this.b).O;
        if (vg9Var != null && vg9Var.a.V4()) {
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence getContentDescription() {
        kac kacVar;
        jla jlaVar = (jla) this.b;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(jlaVar.s)) {
                sb.append(jlaVar.s);
            }
            ila ilaVar = jlaVar.r;
            if (ilaVar != null && (kacVar = ilaVar.e) != null) {
                CharSequence charSequence = (CharSequence) kacVar.j(0, Integer.valueOf(jlaVar.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) jlaVar.r.e.j(-1, Integer.valueOf(jlaVar.r.b()));
                CharSequence charSequence3 = (CharSequence) jlaVar.r.e.j(1, Integer.valueOf(jlaVar.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence2);
                    sb.append(" – ");
                    sb.append(charSequence3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            fc4.g(th, true);
            return jlaVar.s;
        }
    }

    public final synchronized void h() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override
    public final boolean i() {
        kk9 kk9Var = (kk9) this.b;
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null) {
            return kg9Var.a.V4();
        }
        return false;
    }

    @Override
    public final int j0() {
        ila ilaVar = ((jla) this.b).r;
        if (ilaVar == null) {
            return 0;
        }
        int[] iArr = ilaVar.c;
        if (iArr != null) {
            return (iArr.length - 1) * ilaVar.d;
        }
        return ilaVar.a() - ilaVar.b();
    }

    @Override
    public final void j2() {
        vg9 vg9Var = ((zh9) this.b).O;
        if (vg9Var != null) {
            vg9Var.a.W3();
        }
    }

    @Override
    public final void k(int i, int i2) {
        of9 of9Var;
        kk9 kk9Var = (kk9) this.b;
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null && (of9Var = kg9Var.a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final boolean l() {
        if (((tw9) this.b).W.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = yid.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i, extras);
        }
        int i2 = q9Var.a;
        if (i2 != -1 || i != 0) {
            yid.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public final void n(boolean z, float f) {
        int[] iArr;
        int round;
        jla jlaVar = (jla) this.b;
        ila ilaVar = jlaVar.r;
        if (ilaVar != null && jlaVar.n != null) {
            if (ilaVar.c != null) {
                double length = f * (iArr.length - 1);
                int j = Utilities.j((int) Math.floor(length), jlaVar.r.c.length - 1, 0);
                int j2 = Utilities.j((int) Math.ceil(length), jlaVar.r.c.length - 1, 0);
                int[] iArr2 = jlaVar.r.c;
                round = Math.round(gm.U1(Math.round(((float) (length - Math.floor(length))) * jlaVar.r.d) / jlaVar.r.d, iArr2[j], iArr2[j2]));
            } else {
                round = Math.round(((jlaVar.r.a() - jlaVar.r.b()) * f) + ilaVar.b());
            }
            int i = jlaVar.h;
            if (i != Integer.MIN_VALUE) {
                round = Math.max(round, i);
            }
            int i2 = jlaVar.f;
            if (i2 != round) {
                if (jlaVar.c(i2) != jlaVar.c(round)) {
                    gm.W3(jlaVar.e);
                }
                jlaVar.f = round;
                jlaVar.e(round, true);
                qac qacVar = jlaVar.n;
                if (qacVar != null) {
                    qacVar.a(Integer.valueOf(jlaVar.f));
                }
            }
        }
    }

    @Override
    public final Object n0(uc9 uc9Var) {
        cr9 cr9Var = (cr9) this.b;
        cr9Var.a = uc9Var;
        return cr9Var;
    }

    @Override
    public final void o(int i) {
        qca qcaVar = (qca) this.b;
        tca tcaVar = qcaVar.L;
        qcaVar.s = i;
        if (qcaVar.w != i) {
            qcaVar.d.clear();
        }
        int i2 = qcaVar.K;
        if (qcaVar.b() == 0 && !qcaVar.e.e() && !qcaVar.J) {
            tcaVar.L1.e(false, true);
        } else {
            tcaVar.s2.b(i2);
        }
        qcaVar.f();
        int i3 = tca.T2;
        tcaVar.D0(true);
    }

    @Override
    public final void onComplete(Task task) {
        vb1 vb1Var = (vb1) this.b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                vb1Var.m(null);
                return;
            } else {
                vb1Var.resumeWith(task.getResult());
                return;
            }
        }
        vb1Var.resumeWith(new sc9(exception));
    }

    @Override
    public final void onContentChanged() {
        jf9 jf9Var = (jf9) this.b;
        if (jf9Var.z0 != null) {
            boolean i3 = jf9Var.Q.i3();
            jf9Var.M0 = i3;
            jf9Var.z0.h(i3);
            jf9Var.z0.invalidate();
        }
        vi3 vi3Var = jf9Var.z0;
        if (vi3Var != null) {
            vi3Var.setLocked(jf9Var.j0());
        }
        Runnable runnable = jf9Var.N0;
        gm.r(runnable);
        gm.d3(runnable, 1000L);
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = ((rob) this.b).c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        rob robVar = (rob) this.b;
        Scroller scroller = robVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
            robVar.c.fling((int) robVar.Z1, 0, Math.round(-f), Math.round(f2), 0, (int) robVar.Y1, 0, Integer.MAX_VALUE);
            robVar.z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        rob robVar = (rob) this.b;
        Scroller scroller = robVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        robVar.Z1 = Utilities.i(robVar.Z1 + f, robVar.Y1, 0.0f);
        robVar.X0();
        robVar.z0.invalidate();
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onSuccess(Object obj) {
        zfd zfdVar = (zfd) this.b;
        zfdVar.h = (r8a) obj;
        ta1 ta1Var = zfdVar.g;
        if (ta1Var != null) {
            ta1Var.a();
        }
    }

    @Override
    public final void p() {
        zh9 zh9Var = (zh9) this.b;
        vg9 vg9Var = zh9Var.O;
        if (vg9Var != null) {
            vg9Var.a.T3(zh9Var.a);
        }
    }

    @Override
    public final void r(ne9 ne9Var, int i, int i2) {
        kg9 kg9Var;
        gkb textSelectionHelper;
        kk9 kk9Var = (kk9) this.b;
        if (!kk9Var.H && i != i2 && (kg9Var = kk9Var.F) != null && (textSelectionHelper = kg9Var.a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.w() || textSelectionHelper.W != kk9Var) {
                kk9Var.post(new g01(this, ne9Var, i2, textSelectionHelper, i, (byte) 5));
            }
        }
    }

    @Override
    public final void r1(int i, int i2) {
        of9 of9Var;
        vg9 vg9Var = ((zh9) this.b).O;
        if (vg9Var != null && (of9Var = vg9Var.a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final void s(boolean z, float[] fArr) {
        ((tw9) this.b).W.d(z, fArr);
    }

    @Override
    public final void t(ll0 ll0Var) {
        jf9 jf9Var = (jf9) this.b;
        if (ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockMap) && gm.H1(jf9Var)) {
            i22 i22Var = new i22(jf9Var.getParentActivity(), jf9Var, false, false, false, jf9Var.getResourceProvider());
            i22Var.W3 = new dhf((byte) 24);
            i22Var.J1 = true;
            i22Var.u3.setVisibility(8);
            i22Var.t4 = new wu2(jf9Var, ll0Var, i22Var, (byte) 27);
            i22Var.Z0();
            i22Var.show();
        }
    }

    @Override
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override
    public final void w(bh9 bh9Var, View view) {
        jf9 jf9Var = (jf9) this.b;
        bu5 I = bu5.I(jf9Var, view);
        I.T = true;
        jf9Var.getParentActivity();
        jf9Var.getResourceProvider();
        jf9Var.y0 = ph9.b(I, jf9Var, bh9Var, false);
    }

    public final void z(wm9 wm9Var) {
        pr2 pr2Var = (pr2) this.b;
        pr2Var.a = wm9Var;
        Iterator it = ((LinkedList) pr2Var.b).iterator();
        while (it.hasNext()) {
            ((f4d) it.next()).b();
        }
        ((LinkedList) pr2Var.b).clear();
    }

    @Override
    public final wce zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            mae maeVar = ((mae[]) this.b)[i];
            if (maeVar.zzc(cls)) {
                return maeVar.zzb(cls);
            }
        }
        rjb.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((mae[]) this.b)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void W(ne9 ne9Var) {
    }

    @Override
    public final void a2(ArrayList arrayList) {
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void u(int i) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }

    @Override
    public final void j(ne9 ne9Var, boolean z) {
    }

    public cf9(s5d s5dVar, hi0 hi0Var) {
        this.a = (byte) 22;
        this.b = hi0Var;
    }

    public cf9(fyd fydVar) {
        this.a = (byte) 26;
        Charset charset = k5e.a;
        this.b = fydVar;
        fydVar.a = this;
    }

    public cf9(byte b) {
        this.a = b;
        switch (b) {
            case 18:
                return;
            case 29:
                this.b = new ArrayDeque(16);
                return;
            default:
                this.b = new HashSet();
                return;
        }
    }

    public cf9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public cf9(ArrayList arrayList) {
        this.a = (byte) 10;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}
