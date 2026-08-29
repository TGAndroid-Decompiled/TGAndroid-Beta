package cg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ih.x3;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import jh.va;
import jh.z9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tm;
public final class m2 implements Runnable {
    public final int f3216a;
    public final Object f3217b;

    public m2(int i10, Object obj, Object obj2) {
        this.f3216a = i10;
        this.f3217b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f3216a) {
            case 0:
                ((n2) this.f3217b).invalidate();
                return;
            case 1:
                ((w2) this.f3217b).a();
                return;
            case 2:
                com.google.firebase.messaging.k.a((Intent) this.f3217b);
                return;
            case 3:
                a5.j jVar = (a5.j) this.f3217b;
                synchronized (((ArrayDeque) jVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) jVar.f211a).edit();
                    String str = (String) jVar.f212b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) jVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) jVar.f213c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 4:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.f3217b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.f5153a.getAction() + " finishing.");
                e0Var.f5154b.trySetResult(null);
                return;
            case 5:
                ((cf.b) ((c2.p) this.f3217b).f2878c).a(false);
                return;
            case 6:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f3217b;
                ((f3.h) ((g3.c) sVar.f5187e)).f(new a1.c(sVar, 26));
                return;
            case 7:
                CharSequence charSequence = (CharSequence) this.f3217b;
                tc X = tc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 8:
                ((eg.y0) this.f3217b).run(null);
                return;
            case 9:
                ((tm) this.f3217b).run(Collections.EMPTY_LIST);
                return;
            case 10:
                ((eg.u0) this.f3217b).run(null);
                return;
            case 11:
                eg.f1 f1Var = ((eg.e1) this.f3217b).f5980r;
                f2 f2Var = new f2(f1Var.f34662n, eg.f1.Q(f1Var), null, null, null, eg.f1.R(f1Var));
                f2Var.F0 = true;
                f2Var.Y = true;
                f1Var.f34662n.showDialog(f2Var);
                return;
            case 12:
                ((f3) this.f3217b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new ag.o0(6), 220L);
                return;
            case 13:
                ((eh.f) this.f3217b).Z.N(true);
                return;
            case 14:
                RecyclerView recyclerView = (RecyclerView) this.f3217b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 15:
                ((f5.b0) this.f3217b).getClass();
                return;
            case 16:
                hh.u uVar = (hh.u) this.f3217b;
                uVar.f();
                uVar.e(true);
                return;
            case 17:
                ((ig.c) this.f3217b).f();
                return;
            case 18:
                ih.t tVar = (ih.t) this.f3217b;
                tVar.f9381d0.setTranslationX(tVar.f9380c0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 19:
                ((ih.n0) this.f3217b).onBackPressed();
                return;
            case 20:
                k51 k51Var = ((ih.h2) this.f3217b).U;
                if (k51Var != null) {
                    k51Var.N(false);
                    return;
                }
                return;
            case 21:
                ((ih.v1) this.f3217b).c();
                return;
            case 22:
                ih.d2 d2Var = (ih.d2) this.f3217b;
                va vaVar = d2Var.f9092e;
                if (vaVar != null) {
                    vaVar.d();
                    d2Var.invalidateSelf();
                    return;
                }
                return;
            case 23:
                ((x3) this.f3217b).o();
                return;
            case 24:
                j3.k0 k0Var = ((j3.h0) this.f3217b).f10477a;
                k0Var.g0(null);
                k0Var.a0(0, 0);
                return;
            case 25:
                try {
                    j3.q0.d((j3.e2) this.f3217b);
                    return;
                } catch (j3.n e10) {
                    f5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 26:
                ((j3.m2) this.f3217b).d();
                return;
            case 27:
                try {
                    ((Bitmap) this.f3217b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                jf.p pVar = (jf.p) this.f3217b;
                long j10 = pVar.f11664b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.f11664b = j11;
                    pVar.f11663a.e(j11);
                }
                if (pVar.f11664b <= 0) {
                    pVar.f11665c = false;
                }
                if (pVar.f11665c) {
                    AndroidUtilities.runOnUIThread(pVar.d, 1000L);
                    return;
                }
                return;
            default:
                jh.b bVar = (jh.b) this.f3217b;
                bVar.getClass();
                new z9(bVar.getContext(), bVar.f11768b).show();
                return;
        }
    }

    public m2(j3.h0 h0Var, SurfaceTexture surfaceTexture) {
        this.f3216a = 24;
        this.f3217b = h0Var;
    }

    public m2(Object obj, int i10) {
        this.f3216a = i10;
        this.f3217b = obj;
    }
}
