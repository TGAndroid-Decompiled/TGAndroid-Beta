package ag;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.emoji2.text.q;
import androidx.fragment.app.j0;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import c2.y;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.s;
import dg.b1;
import dg.c1;
import dg.g2;
import dg.h2;
import dg.m1;
import dg.r1;
import eg.m3;
import eg.z3;
import j7.a8;
import j7.b8;
import j7.j8;
import j7.t;
import j7.u;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.sf1;
import org.telegram.ui.xn;
import qh.n4;
public final class e implements Runnable {
    public final int f195a;
    public final Object f196b;

    public e(androidx.fragment.app.l lVar, u0 u0Var) {
        this.f195a = 5;
        this.f196b = lVar;
    }

    private final void a() {
        c5.j jVar = (c5.j) this.f196b;
        synchronized (((ArrayDeque) jVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) jVar.f2315a).edit();
            String str = (String) jVar.f2316b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) jVar.d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) jVar.f2317c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    private final void b() {
        d4.f fVar = (d4.f) this.f196b;
        synchronized (fVar.f4214a) {
            try {
                if (fVar.f4223l) {
                    return;
                }
                long j10 = fVar.f4222k - 1;
                fVar.f4222k = j10;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 > 0) {
                    return;
                }
                if (i10 < 0) {
                    fVar.c(new IllegalStateException());
                } else {
                    fVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f195a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (j6) this.f196b, Boolean.TRUE, null, -1);
                return;
            case 1:
                ((androidx.activity.m) this.f196b).invalidateOptionsMenu();
                return;
            case 2:
                androidx.activity.l lVar = (androidx.activity.l) this.f196b;
                Runnable runnable = lVar.f340b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f340b = null;
                    return;
                }
                return;
            case 3:
                androidx.activity.n.a((androidx.activity.n) this.f196b);
                return;
            case 4:
                q qVar = (q) this.f196b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h != null) {
                            try {
                                o0.i d = qVar.d();
                                int i10 = d.f16306e;
                                if (i10 == 2) {
                                    synchronized (qVar.d) {
                                    }
                                }
                                if (i10 == 0) {
                                    int i11 = n0.g.f15182a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    cb.b bVar = qVar.f854c;
                                    Context context = qVar.f852a;
                                    bVar.getClass();
                                    o0.i[] iVarArr = {d};
                                    a8 a8Var = i0.e.f7763a;
                                    j8.a("TypefaceCompat.createFromFontInfo");
                                    Typeface b10 = i0.e.f7763a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e6 = b8.e(qVar.f852a, d.f16303a);
                                    if (e6 != null && b10 != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        s sVar = new s(b10, u.a(e6));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            t tVar = qVar.h;
                                            if (tVar != null) {
                                                tVar.b(sVar);
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            } catch (Throwable th2) {
                                synchronized (qVar.d) {
                                    try {
                                        t tVar2 = qVar.h;
                                        if (tVar2 != null) {
                                            tVar2.a(th2);
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 5:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f196b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 6:
                Iterator it = ((j0) this.f196b).f938n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            case 7:
                e0 e0Var = (e0) this.f196b;
                v vVar = e0Var.f1080f;
                if (e0Var.f1077b == 0) {
                    e0Var.f1078c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1076a == 0 && e0Var.f1078c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 8:
                sf1 sf1Var = (sf1) this.f196b;
                if (sf1Var.getParentLayout() != null) {
                    sf1Var.E = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", sf1Var.f41188a);
                    xn xnVar = new xn(bundle);
                    xnVar.f43179ga = true;
                    sf1Var.presentFragment(xnVar);
                    return;
                }
                return;
            case 9:
                ((c1.f) this.f196b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 10:
                ((c2.e) this.f196b).k();
                return;
            case 11:
                ((c2.h) this.f196b).f2118n = -1;
                return;
            case 12:
                ((y) this.f196b).b();
                return;
            case 13:
                com.google.firebase.messaging.k.a((Intent) this.f196b);
                return;
            case 14:
                a();
                return;
            case 15:
                d0 d0Var = (d0) this.f196b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f4047a.getAction() + " finishing.");
                d0Var.f4048b.trySetResult(null);
                return;
            case 16:
                b();
                return;
            case 17:
                o5.i iVar = ((b1) this.f196b).f4442b.f4451a;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            case 18:
                c1 c1Var = ((b1) this.f196b).f4442b;
                if (c1Var.d == null) {
                    c1Var.L = null;
                    return;
                }
                int currentColor = c1Var.f4455f.getCurrentColor();
                c1Var.l(c1Var.f4452b, false, false);
                b4.e0 d10 = c1Var.d(c1Var.f4452b, currentColor, new RectF(c1Var.h));
                c1Var.b();
                r1 r1Var = c1Var.d;
                RectF rectF = new RectF();
                c1Var.h = rectF;
                r1Var.a(rectF);
                c1Var.p(c1Var.e(r1Var, currentColor, new RectF(c1Var.h)), false);
                c1Var.p(d10, false);
                c1Var.e(r1Var, currentColor, null);
                c1Var.d = null;
                c1Var.J = 0.0f;
                c1Var.L = null;
                return;
            case 19:
                ((m1) ((androidx.activity.i) this.f196b).f337b).f4615y.f4624a.a();
                return;
            case 20:
                g2 g2Var = ((h2) this.f196b).f4556a;
                if (g2Var != null) {
                    g2Var.e();
                    return;
                }
                return;
            case 21:
                dh.c cVar = (dh.c) this.f196b;
                dh.b bVar2 = cVar.f4750c;
                if (bVar2 == dh.b.f4745b) {
                    cVar.a(dh.b.f4744a, true);
                    return;
                } else if (bVar2 == dh.b.f4746c) {
                    cVar.a(dh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 22:
                s sVar2 = (s) this.f196b;
                ((f3.h) ((g3.c) sVar2.d)).f(new a1.c(sVar2, 16));
                return;
            case 23:
                ((c5.j) this.f196b).A();
                return;
            case 24:
                n4 n4Var = (n4) this.f196b;
                n4Var.f5559u0 = true;
                n4Var.s();
                return;
            case 25:
                ((View) this.f196b).performClick();
                return;
            case 26:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((m3) this.f196b).f5360f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((z3) this.f196b).f5599n0);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((eh.f) this.f196b).f5623a);
                return;
            default:
                eh.f fVar = (eh.f) ((eh.b) this.f196b).d;
                t1 t1Var = fVar.f5628n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    fVar.f5628n.getDelegate().L1(fVar.f5628n, false);
                    return;
                }
                return;
        }
    }

    public e(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f195a = 13;
        this.f196b = intent;
    }

    public e(Object obj, int i10) {
        this.f195a = i10;
        this.f196b = obj;
    }
}
