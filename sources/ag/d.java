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
import androidx.activity.m;
import androidx.activity.n;
import androidx.emoji2.text.q;
import androidx.fragment.app.j0;
import androidx.fragment.app.l;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import c2.z;
import c5.j;
import cg.c1;
import cg.d1;
import cg.h2;
import cg.i2;
import cg.n1;
import cg.s1;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.k;
import com.google.firebase.messaging.r;
import dg.b4;
import dg.o3;
import dh.u;
import j7.a8;
import j7.b8;
import j7.j8;
import j7.s;
import j7.t;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import n0.g;
import o0.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.sf1;
import org.telegram.ui.zn;
import ph.o4;
import w0.h;
public final class d implements Runnable {
    public final int f197a;
    public final Object f198b;

    public d(l lVar, u0 u0Var) {
        this.f197a = 5;
        this.f198b = lVar;
    }

    private final void a() {
        j jVar = (j) this.f198b;
        synchronized (((ArrayDeque) jVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) jVar.f2152a).edit();
            String str = (String) jVar.f2153b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) jVar.d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) jVar.f2154c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    private final void b() {
        d4.f fVar = (d4.f) this.f198b;
        synchronized (fVar.f4126a) {
            try {
                if (fVar.f4134l) {
                    return;
                }
                long j10 = fVar.f4133k - 1;
                fVar.f4133k = j10;
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
        switch (this.f197a) {
            case 0:
                sf1 sf1Var = (sf1) this.f198b;
                if (sf1Var.getParentLayout() != null) {
                    sf1Var.E = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", sf1Var.f38175a);
                    zn znVar = new zn(bundle);
                    znVar.f40598ga = true;
                    sf1Var.presentFragment(znVar);
                    return;
                }
                return;
            case 1:
                ((m) this.f198b).invalidateOptionsMenu();
                return;
            case 2:
                androidx.activity.l lVar = (androidx.activity.l) this.f198b;
                Runnable runnable = lVar.f318b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f318b = null;
                    return;
                }
                return;
            case 3:
                n.a((n) this.f198b);
                return;
            case 4:
                q qVar = (q) this.f198b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h != null) {
                            try {
                                i d = qVar.d();
                                int i10 = d.e;
                                if (i10 == 2) {
                                    synchronized (qVar.d) {
                                    }
                                }
                                if (i10 == 0) {
                                    int i11 = g.f14194a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    ab.a aVar = qVar.f797c;
                                    Context context = qVar.f795a;
                                    aVar.getClass();
                                    i[] iVarArr = {d};
                                    a8 a8Var = i0.e.f7202a;
                                    j8.a("TypefaceCompat.createFromFontInfo");
                                    try {
                                        Typeface b10 = i0.e.f7202a.b(context, iVarArr, 0);
                                        Trace.endSection();
                                        MappedByteBuffer e = b8.e(qVar.f795a, d.f16146a);
                                        if (e != null && b10 != null) {
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                r rVar = new r(b10, t.a(e));
                                                Trace.endSection();
                                                synchronized (qVar.d) {
                                                    s sVar = qVar.h;
                                                    if (sVar != null) {
                                                        sVar.b(rVar);
                                                    }
                                                }
                                                qVar.b();
                                                return;
                                            } catch (Throwable th2) {
                                                int i12 = g.f14194a;
                                                throw th2;
                                            }
                                        }
                                        throw new RuntimeException("Unable to open file.");
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            } catch (Throwable th3) {
                                synchronized (qVar.d) {
                                    try {
                                        s sVar2 = qVar.h;
                                        if (sVar2 != null) {
                                            sVar2.a(th3);
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
                l this$0 = (l) this.f198b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 6:
                Iterator it = ((j0) this.f198b).f876n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            case 7:
                e0 e0Var = (e0) this.f198b;
                v vVar = e0Var.f1007f;
                if (e0Var.f1005b == 0) {
                    e0Var.f1006c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1004a == 0 && e0Var.f1006c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 8:
                ((c1.f) this.f198b).e().onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 9:
                ((c2.e) this.f198b).k();
                return;
            case 10:
                ((c2.h) this.f198b).f1979n = -1;
                return;
            case 11:
                ((z) this.f198b).b();
                return;
            case 12:
                o5.i iVar = ((c1) this.f198b).f2309b.f2317a;
                if (iVar != null) {
                    iVar.q();
                    return;
                }
                return;
            case 13:
                d1 d1Var = ((c1) this.f198b).f2309b;
                if (d1Var.d == null) {
                    d1Var.L = null;
                    return;
                }
                int currentColor = d1Var.f2320f.getCurrentColor();
                d1Var.l(d1Var.f2318b, false, false);
                b4.e0 d10 = d1Var.d(d1Var.f2318b, currentColor, new RectF(d1Var.h));
                d1Var.b();
                s1 s1Var = d1Var.d;
                RectF rectF = new RectF();
                d1Var.h = rectF;
                s1Var.a(rectF);
                d1Var.p(d1Var.e(s1Var, currentColor, new RectF(d1Var.h)), false);
                d1Var.p(d10, false);
                d1Var.e(s1Var, currentColor, null);
                d1Var.d = null;
                d1Var.J = 0.0f;
                d1Var.L = null;
                return;
            case 14:
                ((n1) ((androidx.activity.i) this.f198b).f315b).f2468y.f2475a.a();
                return;
            case 15:
                h2 h2Var = ((i2) this.f198b).f2411a;
                if (h2Var != null) {
                    h2Var.g();
                    return;
                }
                return;
            case 16:
                ch.c cVar = (ch.c) this.f198b;
                ch.b bVar = cVar.f2583c;
                if (bVar == ch.b.f2579b) {
                    cVar.a(ch.b.f2578a, true);
                    return;
                } else if (bVar == ch.b.f2580c) {
                    cVar.a(ch.b.d, true);
                    return;
                } else {
                    return;
                }
            case 17:
                k.a((Intent) this.f198b);
                return;
            case 18:
                a();
                return;
            case 19:
                c0 c0Var = (c0) this.f198b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + c0Var.f3972a.getAction() + " finishing.");
                c0Var.f3973b.trySetResult(null);
                return;
            case 20:
                b();
                return;
            case 21:
                ((j) this.f198b).A();
                return;
            case 22:
                o4 o4Var = (o4) this.f198b;
                o4Var.f4363u0 = true;
                o4Var.s();
                return;
            case 23:
                ((View) this.f198b).performClick();
                return;
            case 24:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((o3) this.f198b).f4706f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((b4) this.f198b).f4412n0);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((dh.f) this.f198b).f4897a);
                return;
            case 27:
                dh.f fVar = (dh.f) ((dh.b) this.f198b).d;
                org.telegram.ui.Cells.s1 s1Var2 = fVar.f4901n;
                if (s1Var2 != null && s1Var2.getDelegate() != null) {
                    fVar.f4901n.getDelegate().I1(fVar.f4901n, false);
                    return;
                }
                return;
            case 28:
                ((u) this.f198b).f4949c.V2.N(true);
                return;
            default:
                ((dh.t) this.f198b).a();
                return;
        }
    }

    public d(k kVar, Intent intent) {
        this.f197a = 17;
        this.f198b = intent;
    }

    public d(Object obj, int i10) {
        this.f197a = i10;
        this.f198b = obj;
    }
}
