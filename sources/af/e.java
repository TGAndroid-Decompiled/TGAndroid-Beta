package af;

import ag.c2;
import ag.d3;
import ag.f3;
import ag.i1;
import ag.l3;
import ag.p3;
import ag.s1;
import ag.y2;
import ag.z0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.activity.k;
import androidx.activity.m;
import androidx.emoji2.text.p;
import androidx.fragment.app.j0;
import androidx.fragment.app.l;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import c2.x;
import cg.f1;
import cg.g1;
import cg.v0;
import com.google.firebase.messaging.t;
import f2.k0;
import g7.l8;
import g7.u;
import g7.v;
import g7.x7;
import g7.y7;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import o0.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.ib0;
import org.telegram.ui.q91;

public final class e implements Runnable {

    public final int f256a;

    public final Object f257b;

    public e(l lVar, u0 u0Var) {
        this.f256a = 11;
        this.f257b = lVar;
    }

    private final void a() {
        h hVar = (h) this.f257b;
        synchronized (((ArrayDeque) hVar.d)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) hVar.f274a).edit();
            String str = (String) hVar.f275b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) hVar.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) hVar.f276c);
            }
            editorEdit.putString(str, sb2.toString()).commit();
        }
    }

    @Override
    public final void run() {
        int i10 = 2;
        switch (this.f256a) {
            case 0:
                ((h) this.f257b).B();
                return;
            case 1:
                i1 i1Var = ((z0) this.f257b).f736c;
                i1Var.f31855n.presentFragment(q91.d0(i1Var.s1(), true));
                return;
            case 2:
                ri0 ri0Var = ((s1) this.f257b).f651y;
                ri0Var.getAnimatedDrawable().L(0, true, false);
                ri0Var.d();
                return;
            case 3:
                ((c2) this.f257b).f318b.z();
                return;
            case 4:
                d3 d3Var = (d3) this.f257b;
                int size = 1073741823 - (1073741823 % d3Var.T2.size());
                k0 k0Var = d3Var.U2;
                d3Var.f341h3 = size;
                k0Var.h1(size, (d3Var.getMeasuredHeight() - d3Var.getChildAt(0).getMeasuredHeight()) >> 1);
                d3Var.w1(null, false);
                return;
            case 5:
                ((f3) this.f257b).invalidate();
                return;
            case 6:
                ((p3) this.f257b).a();
                return;
            case 7:
                ((androidx.activity.l) this.f257b).invalidateOptionsMenu();
                return;
            case 8:
                k kVar = (k) this.f257b;
                Runnable runnable = kVar.f878b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f878b = null;
                    return;
                }
                return;
            case 9:
                m.a((m) this.f257b);
                return;
            case 10:
                p pVar = (p) this.f257b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h == null) {
                            return;
                        }
                        try {
                            j jVarD = pVar.d();
                            int i11 = jVarD.f19112e;
                            if (i11 == 2) {
                                synchronized (pVar.d) {
                                }
                            }
                            if (i11 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                            }
                            try {
                                int i12 = n0.g.f18080a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                za.b bVar = pVar.f1373c;
                                Context context = pVar.f1371a;
                                bVar.getClass();
                                j[] jVarArr = {jVarD};
                                x7 x7Var = i0.f.f10495a;
                                l8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceB = i0.f.f10495a.b(context, jVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferE = y7.e(pVar.f1371a, jVarD.f19109a);
                                    if (mappedByteBufferE == null || typefaceB == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        t tVar = new t(typefaceB, v.a(mappedByteBufferE));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (pVar.d) {
                                            try {
                                                u uVar = pVar.h;
                                                if (uVar != null) {
                                                    uVar.b(tVar);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        pVar.b();
                                        return;
                                    } catch (Throwable th2) {
                                        int i13 = n0.g.f18080a;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                int i14 = n0.g.f18080a;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (pVar.d) {
                                try {
                                    u uVar2 = pVar.h;
                                    if (uVar2 != null) {
                                        uVar2.a(th5);
                                    }
                                    pVar.b();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 11:
                l this$0 = (l) this.f257b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 12:
                Iterator it = ((j0) this.f257b).f1456n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 13:
                e0 e0Var = (e0) this.f257b;
                androidx.lifecycle.v vVar = e0Var.f1597f;
                if (e0Var.f1594b == 0) {
                    e0Var.f1595c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1593a == 0 && e0Var.f1595c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 14:
                ((b) ((bf.e) this.f257b).f2086c).a(false);
                return;
            case 15:
                ((c1.e) this.f257b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 16:
                ((c2.e) this.f257b).k();
                return;
            case 17:
                ((c2.h) this.f257b).f2289n = -1;
                return;
            case 18:
                ((x) this.f257b).b();
                return;
            case 19:
                t tVar2 = (t) this.f257b;
                ((d3.h) ((e3.c) tVar2.f4621e)).f(new a1.c(tVar2, 6));
                return;
            case 20:
                CharSequence charSequence = (CharSequence) this.f257b;
                mc mcVarX = mc.X();
                if (mcVarX != null) {
                    mcVarX.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 21:
                ((cg.z0) this.f257b).run(null);
                return;
            case 22:
                ((ib0) this.f257b).run(Collections.EMPTY_LIST);
                return;
            case 23:
                ((v0) this.f257b).run(null);
                return;
            case 24:
                g1 g1Var = ((f1) this.f257b).f2680r;
                y2 y2Var = new y2(g1Var.f31855n, ((e3) g1Var).currentAccount, null, null, null, ((e3) g1Var).resourcesProvider);
                y2Var.F0 = true;
                y2Var.Y = true;
                g1Var.f31855n.showDialog(y2Var);
                return;
            case 25:
                ((e3) this.f257b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new l3(i10), 220L);
                return;
            case 26:
                ((ch.h) this.f257b).Z.N(true);
                return;
            case 27:
                com.google.firebase.messaging.j.a((Intent) this.f257b);
                return;
            case 28:
                a();
                return;
            default:
                com.google.firebase.messaging.e0 e0Var2 = (com.google.firebase.messaging.e0) this.f257b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var2.f4581a.getAction() + " finishing.");
                e0Var2.f4582b.trySetResult(null);
                return;
        }
    }

    public e(com.google.firebase.messaging.j jVar, Intent intent) {
        this.f256a = 27;
        this.f257b = intent;
    }

    public e(Object obj, int i10) {
        this.f256a = i10;
        this.f257b = obj;
    }
}
