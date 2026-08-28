package af;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.activity.m;
import androidx.activity.n;
import androidx.emoji2.text.p;
import androidx.fragment.app.j0;
import androidx.fragment.app.l;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import bg.d1;
import bg.d2;
import bg.k1;
import bg.l1;
import bg.z0;
import bh.j;
import c2.y;
import com.google.firebase.messaging.t;
import f7.j8;
import f7.k8;
import f7.r8;
import f7.w;
import f7.x;
import ff.q;
import fh.r0;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import n0.g;
import o0.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.oc;
import org.telegram.ui.eb0;
import w0.h;
public final class e implements Runnable {
    public final int f156a;
    public final Object f157b;

    public e(l lVar, u0 u0Var) {
        this.f156a = 5;
        this.f157b = lVar;
    }

    private final void a() {
        b3.b bVar = (b3.b) this.f157b;
        synchronized (((ArrayDeque) bVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) bVar.f1413a).edit();
            String str = (String) bVar.f1414b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) bVar.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) bVar.f1415c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    @Override
    public final void run() {
        switch (this.f156a) {
            case 0:
                ((ze.b) ((f) this.f157b).f160c).a(false);
                return;
            case 1:
                ((m) this.f157b).invalidateOptionsMenu();
                return;
            case 2:
                androidx.activity.l lVar = (androidx.activity.l) this.f157b;
                Runnable runnable = lVar.f372b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f372b = null;
                    return;
                }
                return;
            case 3:
                n.a((n) this.f157b);
                return;
            case 4:
                p pVar = (p) this.f157b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h != null) {
                            try {
                                i d = pVar.d();
                                int i9 = d.f18768e;
                                if (i9 == 2) {
                                    synchronized (pVar.d) {
                                    }
                                }
                                if (i9 == 0) {
                                    int i10 = g.f18255a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    v9.d dVar = pVar.f876c;
                                    Context context = pVar.f874a;
                                    dVar.getClass();
                                    i[] iVarArr = {d};
                                    j8 j8Var = i0.e.f10854a;
                                    r8.a("TypefaceCompat.createFromFontInfo");
                                    Typeface b10 = i0.e.f10854a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e10 = k8.e(pVar.f874a, d.f18765a);
                                    if (e10 != null && b10 != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        t tVar = new t(b10, x.a(e10));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (pVar.d) {
                                            w wVar = pVar.h;
                                            if (wVar != null) {
                                                wVar.b(tVar);
                                            }
                                        }
                                        pVar.b();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            } catch (Throwable th) {
                                synchronized (pVar.d) {
                                    try {
                                        w wVar2 = pVar.h;
                                        if (wVar2 != null) {
                                            wVar2.a(th);
                                        }
                                        pVar.b();
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
                l this$0 = (l) this.f157b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 6:
                Iterator it = ((j0) this.f157b).f959n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            case 7:
                e0 e0Var = (e0) this.f157b;
                v vVar = e0Var.f1100f;
                if (e0Var.f1097b == 0) {
                    e0Var.f1098c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1096a == 0 && e0Var.f1098c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 8:
                CharSequence charSequence = (CharSequence) this.f157b;
                oc X = oc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 9:
                ((d1) this.f157b).run(null);
                return;
            case 10:
                ((eb0) this.f157b).run(Collections.EMPTY_LIST);
                return;
            case 11:
                ((z0) this.f157b).run(null);
                return;
            case 12:
                l1 l1Var = ((k1) this.f157b).f1859r;
                zf.k1 k1Var = new zf.k1(l1Var.f32410n, l1.P(l1Var), null, null, null, l1.Q(l1Var));
                k1Var.F0 = true;
                k1Var.Y = true;
                l1Var.f32410n.showDialog(k1Var);
                return;
            case 13:
                ((f3) this.f157b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new d2(0), 220L);
                return;
            case 14:
                ((j) this.f157b).Z.N(true);
                return;
            case 15:
                ((c1.e) this.f157b).e().onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 16:
                ((c2.e) this.f157b).k();
                return;
            case 17:
                ((c2.h) this.f157b).f2176n = -1;
                return;
            case 18:
                ((y) this.f157b).b();
                return;
            case 19:
                t tVar2 = (t) this.f157b;
                ((d3.h) ((e3.c) tVar2.f4179e)).f(new a1.c(tVar2, 12));
                return;
            case 20:
                com.google.firebase.messaging.j.a((Intent) this.f157b);
                return;
            case 21:
                a();
                return;
            case 22:
                com.google.firebase.messaging.e0 e0Var2 = (com.google.firebase.messaging.e0) this.f157b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var2.f4139a.getAction() + " finishing.");
                e0Var2.f4140b.trySetResult(null);
                return;
            case 23:
                eh.w wVar3 = (eh.w) this.f157b;
                wVar3.f();
                wVar3.e(true);
                return;
            case 24:
                RecyclerView recyclerView = (RecyclerView) this.f157b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 25:
                try {
                    ((Bitmap) this.f157b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                q qVar = (q) this.f157b;
                long j10 = qVar.f6250b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    qVar.f6250b = j11;
                    qVar.f6249a.h(j11);
                }
                if (qVar.f6250b <= 0) {
                    qVar.f6251c = false;
                }
                if (qVar.f6251c) {
                    AndroidUtilities.runOnUIThread(qVar.d, 1000L);
                    return;
                }
                return;
            case 27:
                ((fg.c) this.f157b).f();
                return;
            case 28:
                fh.x xVar = (fh.x) this.f157b;
                xVar.f6843d0.setTranslationX(xVar.f6842c0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            default:
                ((r0) this.f157b).onBackPressed();
                return;
        }
    }

    public e(com.google.firebase.messaging.j jVar, Intent intent) {
        this.f156a = 20;
        this.f157b = intent;
    }

    public e(Object obj, int i9) {
        this.f156a = i9;
        this.f157b = obj;
    }
}
