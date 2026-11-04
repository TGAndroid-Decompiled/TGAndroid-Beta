package b8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.ke;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xq;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hm0;
import org.telegram.ui.py0;
import org.telegram.ui.qc1;
import org.telegram.ui.ry0;
import ug.m1;
public final class ke implements fb.b, ki0, b4.d, qe.b, org.telegram.messenger.sa, om0, p5.b, t9.b {
    public final int f2715a;
    public Object f2716b;
    public Object f2717c;
    public Object d;
    public Object f2718e;
    public Object f2719f;

    public ke(int i3) {
        this.f2715a = i3;
    }

    public static void P(ke keVar, com.google.android.gms.internal.cast.t6 t6Var) {
        int i3 = t6Var.f7056e;
        if (i3 == 2 && ((com.google.android.gms.internal.cast.s6) keVar.f2718e) != null) {
            keVar.R();
        }
        if (i3 == 2) {
            keVar.f2718e = new com.google.android.gms.internal.cast.s6((com.google.android.gms.internal.cast.n0) keVar.f2716b, (String) keVar.d);
        } else {
            keVar.f2718e = keVar.Q();
        }
        com.google.android.gms.internal.cast.s6 s6Var = (com.google.android.gms.internal.cast.s6) keVar.f2718e;
        p6.m.g(s6Var);
        t6Var.d = s6Var.h;
        s6Var.f7034b.add(t6Var);
    }

    public static ke l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ke keVar = new ke(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) keVar.f2718e)) {
            try {
                ((ArrayDeque) keVar.f2718e).clear();
                String string = ((SharedPreferences) keVar.f2716b).getString((String) keVar.f2717c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) keVar.d)) {
                    String[] split = string.split((String) keVar.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) keVar.f2718e).add(str);
                        }
                    }
                    return keVar;
                }
                return keVar;
            } finally {
            }
        }
    }

    public static Exception q(Task task) {
        if (task.getException() != null) {
            return task.getException();
        }
        return new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public void A() {
        m.o3 o3Var = (m.o3) ((ai.c0) this.f2716b).f536b;
        o3Var.getClass();
        o3Var.b(new z6.d(o3Var, 1));
    }

    public void B() {
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
        if (d2Var != null) {
            Activity parentActivity = d2Var.getParentActivity();
            if (parentActivity != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            hm0 hm0Var = new hm0(2, false, false, null);
            hm0Var.f45945y = false;
            hm0Var.W = new nh(this, 7);
            d2Var.presentFragment(hm0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        ((Activity) this.f2717c).startActivityForResult(intent, 11);
    }

    public String C() {
        String str;
        synchronized (((ArrayDeque) this.f2718e)) {
            str = (String) ((ArrayDeque) this.f2718e).peek();
        }
        return str;
    }

    @Override
    public void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.x9 x9Var;
        Path path = (Path) this.f2717c;
        org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) this.d;
        Paint paint2 = (Paint) this.f2718e;
        gi.m5 m5Var = (gi.m5) this.f2719f;
        if (!z10 && (x9Var = m5Var.O1) != null && x9Var.c()) {
            if (z10) {
                baVar = (org.telegram.ui.Components.ba) this.f2716b;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            baVar.b(canvas, true);
            paint2.setAlpha((int) (i3 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.ba) this.f2716b) == null) {
                this.f2716b = new org.telegram.ui.Components.ba(m5Var.O1, m5Var.J1.getReactionsWindow().f8933c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((org.telegram.ui.Components.ba) this.f2716b).e(f13, f14, m5Var.getMeasuredWidth() + f13, m5Var.getMeasuredHeight() + f14);
            paint = ((org.telegram.ui.Components.ba) this.f2716b).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            baVar.e(f15, f16, m5Var.getMeasuredWidth() + f15, m5Var.getMeasuredHeight() + f16);
            paint = baVar.h;
        }
        paint.setAlpha(i3);
        paint2.setAlpha((int) (i3 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public Task G() {
        Task forException;
        int i3;
        boolean s6 = s();
        if (s6 && ((org.telegram.ui.ActionBar.h4) this.f2719f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new e5.r("Firebase-Messaging-Network-Io"));
            return ((ua.d) ((ua.e) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final ke f60302b;

                {
                    this.f60302b = this;
                }

                @Override
                public final Object then(Task task) {
                    int i10 = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    ke keVar = this.f60302b;
                    switch (i10) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(ke.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            n9.h hVar = (n9.h) keVar.f2717c;
                            hVar.a();
                            n9.k kVar = hVar.f20298c;
                            String str3 = kVar.f20309a;
                            hVar.a();
                            l6.b bVar = new l6.b(h4.b(hVar), kVar.f20310b, str3, str, str2);
                            n7.d dVar = (n7.d) keVar.f2716b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new m6.c[]{l6.h.f18073a};
                            b10.f6737c = new m2.t(dVar, bVar, false, 2);
                            b10.f6735a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new m1(str, 1));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(ke.q(task));
                            }
                            return ((ua.d) ((ua.e) keVar.d)).e().continueWithTask(executorService, new m1(keVar, ((ua.a) task.getResult()).f55779a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final ke f60302b;

                {
                    this.f60302b = this;
                }

                @Override
                public final Object then(Task task) {
                    int i10 = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    ke keVar = this.f60302b;
                    switch (i10) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(ke.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            n9.h hVar = (n9.h) keVar.f2717c;
                            hVar.a();
                            n9.k kVar = hVar.f20298c;
                            String str3 = kVar.f20309a;
                            hVar.a();
                            l6.b bVar = new l6.b(h4.b(hVar), kVar.f20310b, str3, str, str2);
                            n7.d dVar = (n7.d) keVar.f2716b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new m6.c[]{l6.h.f18073a};
                            b10.f6737c = new m2.t(dVar, bVar, false, 2);
                            b10.f6735a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new m1(str, 1));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(ke.q(task));
                            }
                            return ((ua.d) ((ua.e) keVar.d)).e().continueWithTask(executorService, new m1(keVar, ((ua.a) task.getResult()).f55779a));
                    }
                }
            });
        }
        l2.e eVar = (l2.e) this.f2718e;
        String b10 = org.telegram.ui.ActionBar.h4.b((n9.h) eVar.f17689a);
        Bundle bundle = new Bundle();
        try {
            eVar.n(b10, bundle, s6);
            l6.c cVar = (l6.c) eVar.f17691c;
            l6.d dVar = l6.d.f18065b;
            d4.d dVar2 = cVar.f18061c;
            if (dVar2.i() < 12000000) {
                if (dVar2.h() != 0) {
                    forException = cVar.d(bundle).continueWithTask(dVar, new tf.b(cVar, bundle));
                } else {
                    forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
            } else {
                l6.n i10 = l6.n.i(cVar.f18060b);
                synchronized (i10) {
                    i3 = i10.f18088a;
                    i10.f18088a = i3 + 1;
                }
                forException = i10.k(new l6.l(i3, 1, bundle, 1)).continueWith(dVar, v7.s.f56474c);
            }
        } catch (InterruptedException | ExecutionException e10) {
            forException = Tasks.forException(e10);
        }
        return forException.continueWith(new c3.b(3), new xg.c(eVar, 8));
    }

    public boolean H(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f2718e)) {
            remove = ((ArrayDeque) this.f2718e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f2719f).execute(new xf.c(this, 7));
            }
        }
        return remove;
    }

    public Set I(Class cls) {
        return b(t9.r.a(cls));
    }

    public void K(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f2716b;
        View view2 = (View) this.f2717c;
        if (((Bitmap) this.d) != bitmap) {
            if (((org.telegram.ui.Components.mc) this.f2719f) != null) {
                view.setBackground(null);
                this.f2719f = null;
            }
            if (((org.telegram.ui.Components.mc) this.f2718e) == null && ((org.telegram.ui.Components.mc) this.f2719f) == null && (bitmap2 = (Bitmap) this.d) != null) {
                bitmap2.recycle();
                this.d = null;
            }
            L();
            this.d = bitmap;
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc((Bitmap) this.d);
            this.f2719f = mcVar;
            view.setBackground(mcVar);
            if (view2 != null) {
                org.telegram.ui.Components.mc mcVar2 = new org.telegram.ui.Components.mc((Bitmap) this.d);
                this.f2718e = mcVar2;
                view2.setBackground(mcVar2);
            }
        }
    }

    public void L() {
        Bitmap bitmap;
        if (((org.telegram.ui.Components.mc) this.f2718e) != null) {
            this.f2718e = null;
            View view = (View) this.f2717c;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((org.telegram.ui.Components.mc) this.f2718e) == null && ((org.telegram.ui.Components.mc) this.f2719f) == null && (bitmap = (Bitmap) this.d) != null) {
            bitmap.recycle();
            this.d = null;
        }
    }

    public void M(Uri uri) {
        int i3;
        Context context = (Context) this.f2716b;
        if (uri == null) {
            N();
        } else if (!uri.equals((Uri) this.d)) {
            N();
            this.d = uri;
            g6.b bVar = (g6.b) this.f2717c;
            int i10 = bVar.f11978b;
            if (i10 != 0 && (i3 = bVar.f11979c) != 0) {
                this.f2718e = new h6.b(context, i10, i3, this);
            } else {
                this.f2718e = new h6.b(context, 0, 0, this);
            }
            h6.b bVar2 = (h6.b) this.f2718e;
            p6.m.g(bVar2);
            Uri uri2 = (Uri) this.d;
            p6.m.g(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void N() {
        h6.b bVar = (h6.b) this.f2718e;
        if (bVar != null) {
            bVar.cancel(true);
            this.f2718e = null;
        }
        this.d = null;
    }

    @Override
    public boolean O() {
        return true;
    }

    public com.google.android.gms.internal.cast.s6 Q() {
        if (((com.google.android.gms.internal.cast.s6) this.f2718e) == null) {
            com.google.android.gms.internal.cast.s6 s6Var = new com.google.android.gms.internal.cast.s6((com.google.android.gms.internal.cast.n0) this.f2716b, (String) this.d);
            this.f2718e = s6Var;
            s6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.s6) this.f2718e;
    }

    public void R() {
        int i3;
        com.google.android.gms.internal.cast.p1 p1Var;
        int i10;
        int i11;
        long j10;
        com.google.android.gms.internal.cast.s6 s6Var = (com.google.android.gms.internal.cast.s6) this.f2718e;
        if (s6Var != null) {
            Map map = s6Var.f7036e;
            List<com.google.android.gms.internal.cast.f3> list = s6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = s6Var.f7035c;
            List<com.google.android.gms.internal.cast.t6> list3 = s6Var.f7034b;
            f6.c cVar = s6Var.f7040j;
            if (cVar != null) {
                cVar.f11475l = null;
                s6Var.f7040j = null;
            }
            long j11 = s6Var.f7039i;
            com.google.android.gms.internal.cast.p1 m10 = com.google.android.gms.internal.cast.q1.m();
            m10.c();
            com.google.android.gms.internal.cast.q1.t((com.google.android.gms.internal.cast.q1) m10.f6874b, j11);
            String str = s6Var.f7042l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.q1.y((com.google.android.gms.internal.cast.q1) m10.f6874b, str);
            }
            String str2 = s6Var.f7043m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.q1.u((com.google.android.gms.internal.cast.q1) m10.f6874b, str2);
            }
            com.google.android.gms.internal.cast.i1 l10 = com.google.android.gms.internal.cast.j1.l();
            String str3 = com.google.android.gms.internal.cast.s6.f7031o;
            l10.c();
            com.google.android.gms.internal.cast.j1.n((com.google.android.gms.internal.cast.j1) l10.f6874b, str3);
            String str4 = s6Var.f7038g;
            l10.c();
            com.google.android.gms.internal.cast.j1.m((com.google.android.gms.internal.cast.j1) l10.f6874b, str4);
            m10.c();
            com.google.android.gms.internal.cast.q1.r((com.google.android.gms.internal.cast.q1) m10.f6874b, (com.google.android.gms.internal.cast.j1) l10.a());
            com.google.android.gms.internal.cast.c0 c0Var = s6Var.f7033a;
            com.google.android.gms.internal.cast.v1 l11 = com.google.android.gms.internal.cast.w1.l();
            Object zza = c0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.h2 l12 = com.google.android.gms.internal.cast.i2.l();
                l12.c();
                com.google.android.gms.internal.cast.i2.m((com.google.android.gms.internal.cast.i2) l12.f6874b, (String) zza);
                l11.c();
                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l11.f6874b, (com.google.android.gms.internal.cast.i2) l12.a());
            }
            String str5 = s6Var.f7041k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    i6.b bVar = com.google.android.gms.internal.cast.s6.f7030n;
                    Log.w(bVar.f14620a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j10 = 0;
                }
                l11.c();
                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l11.f6874b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.t6 t6Var : list3) {
                    t6Var.getClass();
                    com.google.android.gms.internal.cast.t1 l13 = com.google.android.gms.internal.cast.u1.l();
                    int i12 = t6Var.f7056e;
                    l13.c();
                    com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l13.f6874b, i12);
                    l13.c();
                    com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l13.f6874b, (int) (t6Var.f7054b - t6Var.d));
                    Integer num = t6Var.f7053a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l13.f6874b, intValue);
                    }
                    Boolean bool = t6Var.f7055c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l13.f6874b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.u1) l13.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l11.f6874b, arrayList);
            }
            int i13 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    com.google.android.gms.internal.cast.z1 l14 = com.google.android.gms.internal.cast.a2.l();
                    l14.c();
                    com.google.android.gms.internal.cast.a2.m((com.google.android.gms.internal.cast.a2) l14.f6874b, (int) (aVar.f6813b - aVar.f6814c));
                    int i14 = aVar.f6812a;
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                i11 = 1;
                            } else {
                                i11 = 4;
                            }
                        } else {
                            i11 = 3;
                        }
                    } else {
                        i11 = 2;
                    }
                    l14.c();
                    com.google.android.gms.internal.cast.a2.n((com.google.android.gms.internal.cast.a2) l14.f6874b, i11);
                    arrayList2.add((com.google.android.gms.internal.cast.a2) l14.a());
                }
                i3 = 1;
                l11.c();
                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l11.f6874b, arrayList2);
            } else {
                i3 = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.f3 f3Var : list) {
                    String str6 = f3Var.f6911a;
                    com.google.android.gms.internal.cast.r1 l15 = com.google.android.gms.internal.cast.s1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15);
                                int i16 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152);
                                int i162 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522);
                                int i1622 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222);
                                int i16222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222);
                                int i162222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522222);
                                int i1622222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222222);
                                int i16222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222222);
                                int i162222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522222222);
                                int i1622222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222222222);
                                int i16222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222222222);
                                int i162222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = i13;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522222222222);
                                int i1622222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222222222222);
                                int i16222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222222222222);
                                int i162222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522222222222222);
                                int i1622222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222222222222222);
                                int i16222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222222222222222);
                                int i162222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522222222222222222);
                                int i1622222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222222222222222222);
                                int i16222222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i152222222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222222222222222222);
                                int i162222222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i172222222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i1522222222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i1522222222222222222222);
                                int i1622222222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i1622222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i1722222222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i1722222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                                int i15222222222222222222222 = (int) f3Var.f6912b;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i15222222222222222222222);
                                int i16222222222222222222222 = f3Var.f6913c;
                                l15.c();
                                com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i16222222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                                int i17222222222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                                l15.c();
                                com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i17222222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                    }
                    i10 = i3;
                    l15.c();
                    com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.f6874b, i10);
                    int i152222222222222222222222 = (int) f3Var.f6912b;
                    l15.c();
                    com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.f6874b, i152222222222222222222222);
                    int i162222222222222222222222 = f3Var.f6913c;
                    l15.c();
                    com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.f6874b, i162222222222222222222222);
                    l15.c();
                    com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.f6874b, (int) (f3Var.d - f3Var.f6915f));
                    int i172222222222222222222222 = (int) (f3Var.f6914e - f3Var.f6915f);
                    l15.c();
                    com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.f6874b, i172222222222222222222222);
                    arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                    m10 = m10;
                    i13 = 2;
                }
                p1Var = m10;
                l11.c();
                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l11.f6874b, arrayList3);
            } else {
                p1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.x1 l16 = com.google.android.gms.internal.cast.y1.l();
                    int i18 = bVar2.f6825e;
                    l16.c();
                    com.google.android.gms.internal.cast.y1.p((com.google.android.gms.internal.cast.y1) l16.f6874b, i18);
                    int i19 = bVar2.d.get();
                    l16.c();
                    com.google.android.gms.internal.cast.y1.m((com.google.android.gms.internal.cast.y1) l16.f6874b, i19);
                    int i20 = (int) (bVar2.f6822a - bVar2.f6824c);
                    l16.c();
                    com.google.android.gms.internal.cast.y1.n((com.google.android.gms.internal.cast.y1) l16.f6874b, i20);
                    l16.c();
                    com.google.android.gms.internal.cast.y1.o((com.google.android.gms.internal.cast.y1) l16.f6874b, (int) (bVar2.f6823b - bVar2.f6824c));
                    arrayList4.add((com.google.android.gms.internal.cast.y1) l16.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.w1.r((com.google.android.gms.internal.cast.w1) l11.f6874b, arrayList4);
            }
            p1Var.c();
            com.google.android.gms.internal.cast.q1.q((com.google.android.gms.internal.cast.q1) p1Var.f6874b, (com.google.android.gms.internal.cast.w1) l11.a());
            s6Var.f7037f.a((com.google.android.gms.internal.cast.q1) p1Var.a(), 233);
            this.f2718e = null;
        }
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((TextView) this.f2717c).setAlpha(org.telegram.messenger.g0.T1(0.5f, 1.0f, ((qe.a) this.f2718e).f53840e));
        ((mh.c) this.f2719f).b(this);
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f2716b).contains(t9.r.a(cls))) {
            Object a10 = ((t9.b) this.f2719f).a(cls);
            if (!cls.equals(qa.a.class)) {
                return a10;
            }
            qa.a aVar = (qa.a) a10;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public Set b(t9.r rVar) {
        if (((Set) this.f2718e).contains(rVar)) {
            return ((t9.b) this.f2719f).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public ta.b c(t9.r rVar) {
        if (((Set) this.f2717c).contains(rVar)) {
            return ((t9.b) this.f2719f).c(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public int d(long j10) {
        long[] jArr = (long[]) this.f2717c;
        int b10 = g2.n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public t9.p e(t9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((t9.b) this.f2719f).e(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public ta.b f(Class cls) {
        return c(t9.r.a(cls));
    }

    @Override
    public Object g(t9.r rVar) {
        if (((Set) this.f2716b).contains(rVar)) {
            return ((t9.b) this.f2719f).g(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override
    public Object mo5get() {
        switch (this.f2715a) {
            case 3:
                return new db.t0((n9.h) ((e.a) this.f2716b).f9205a, (ua.e) ((fb.c) this.f2717c).mo5get(), (gb.l) ((fb.c) this.d).mo5get(), (db.l) ((fb.c) this.f2718e).mo5get(), (fd.h) ((fb.c) this.f2719f).mo5get());
            case 4:
                return new gb.d((db.i1) ((fb.c) this.f2716b).mo5get(), (ua.e) ((fb.c) this.f2717c).mo5get(), (db.b) ((fb.c) this.d).mo5get(), (gb.f) ((fb.c) this.f2718e).mo5get(), (gb.p) ((fb.c) this.f2719f).mo5get());
            default:
                return new s5.a((Executor) ((cd.a) this.f2716b).mo5get(), (o5.d) ((cd.a) this.f2717c).mo5get(), (p7.d) ((p7.d) this.d).mo5get(), (u5.d) ((cd.a) this.f2718e).mo5get(), (v5.c) ((cd.a) this.f2719f).mo5get());
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public long h(int i3) {
        return ((long[]) this.f2717c)[i3];
    }

    public byte[] i() {
        byte[] bArr = (byte[]) this.f2717c;
        byte[] bArr2 = (byte[]) this.f2716b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = qc1.f48861b;
        BigInteger bigInteger3 = qc1.f48860a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a10 = qc1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a11 = qc1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = qc1.b(new byte[][]{a11, bArr2, bArr3});
                byte[] b11 = qc1.b(new byte[][]{a11, bArr});
                this.f2718e = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i3 = 0; i3 < 4; i3++) {
                    int i10 = i3 * 8;
                    arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % 200)]);
                }
                this.f2719f = arrayList;
                org.telegram.messenger.a8.b("wear-auth: built answer; session " + qc1.d(bArr2) + " emojis=" + ((ArrayList) this.f2719f));
                byte[] bArr4 = new byte[288];
                System.arraycopy(bArr2, 0, bArr4, 0, 16);
                System.arraycopy(bArr3, 0, bArr4, 16, 16);
                System.arraycopy(a10, 0, bArr4, 32, 256);
                return bArr4;
            }
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
    }

    public void j(Canvas canvas, boolean z10, boolean z11, int i3, float f10) {
        int i10;
        RectF rectF = (RectF) this.f2717c;
        float[] fArr = (float[]) this.d;
        Paint paint = (Paint) this.f2719f;
        org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.f2716b;
        Path path = (Path) this.f2718e;
        if (z11) {
            i10 = 0;
        } else {
            i10 = (int) b3Var.H;
        }
        int i11 = (int) (i10 * f10);
        int L = org.telegram.messenger.g0.L(10.0f) * Math.min(1, i11 / org.telegram.messenger.g0.L(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f11 = L;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.rewind();
        rectF.set(0.0f, 0.0f, i3, (b3Var.getY() + b3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public void k(boolean z10, float f10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((py0) this.f2719f).d;
        ry0 ry0Var = (ry0) this.f2718e;
        ry0 ry0Var2 = (ry0) this.f2717c;
        ry0 ry0Var3 = (ry0) this.d;
        boolean isAttachedToWindow = ((pm0) this.f2716b).isAttachedToWindow();
        if (f10 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        if (f10 >= 1.0f) {
            ry0Var2.e(false, isAttachedToWindow);
            ry0Var3.e(false, isAttachedToWindow);
            ry0Var.e(true, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ry0Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            ry0Var2.e(true, isAttachedToWindow);
            ry0Var3.e(false, isAttachedToWindow);
            ry0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ry0Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            ry0Var3.c(org.telegram.messenger.bd.a0("UpToFileSize", null, 2131743833, org.telegram.messenger.g0.i0(j10, true, false)), false, true);
            ry0Var2.e(false, isAttachedToWindow);
            ry0Var3.e(true, isAttachedToWindow);
            ry0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ry0Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.c0().f23729c = j10;
            saveToGallerySettingsActivity.d0();
        }
    }

    public void m(View view) {
        if (view instanceof GLSurfaceView) {
            this.f2719f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m(viewGroup.getChildAt(i3));
            }
        }
    }

    public t9.p n(Class cls) {
        return e(t9.r.a(cls));
    }

    public void o(q0.a aVar) {
        ai.c0 c0Var = (ai.c0) this.f2716b;
        org.telegram.messenger.ba baVar = new org.telegram.messenger.ba(this, aVar);
        c0Var.getClass();
        p6.m.d("getMapAsync() must be called on the main thread");
        m.o3 o3Var = (m.o3) c0Var.f536b;
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) o3Var.f18683b;
        if (a0Var != null) {
            a0Var.k(baVar);
        } else {
            ((ArrayList) o3Var.f18687g).add(baVar);
        }
    }

    @Override
    public List p(long j10) {
        h4.a[] aVarArr;
        h4.c cVar = (h4.c) this.f2716b;
        HashMap hashMap = (HashMap) this.f2718e;
        HashMap hashMap2 = (HashMap) this.f2719f;
        ArrayList arrayList = new ArrayList();
        cVar.g(j10, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.h, treeMap);
        cVar.h(j10, (Map) this.d, hashMap, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                h4.e eVar = (h4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new f2.b(null, null, null, decodeByteArray, eVar.f14211c, 0, eVar.f14212e, eVar.f14210b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f14213f, eVar.f14214g, false, -16777216, eVar.f14216j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            h4.e eVar2 = (h4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            f2.a aVar = (f2.a) entry.getValue();
            CharSequence charSequence = aVar.f11339a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (h4.a aVar2 : (h4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f14211c;
            int i18 = eVar2.d;
            aVar.f11342e = f10;
            aVar.f11343f = i18;
            aVar.f11344g = eVar2.f14212e;
            aVar.h = eVar2.f14210b;
            aVar.f11348l = eVar2.f14213f;
            float f11 = eVar2.f14215i;
            int i19 = eVar2.h;
            aVar.f11347k = f11;
            aVar.f11346j = i19;
            aVar.f11352p = eVar2.f14216j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public boolean r() {
        return true;
    }

    public boolean s() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        n9.h hVar = (n9.h) this.f2717c;
        hVar.a();
        Context context = hVar.f20296a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) != null && bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override
    public int t() {
        return ((long[]) this.f2717c).length;
    }

    public void u(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: b8.ke.u(int, int, android.content.Intent):void");
    }

    @Override
    public boolean v() {
        return false;
    }

    public void w() {
        ai.c0 c0Var = (ai.c0) this.f2716b;
        m.o3 o3Var = (m.o3) c0Var.f536b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            o3Var.getClass();
            o3Var.b(new z6.d(o3Var, 0));
            if (((android.support.v4.media.session.a0) o3Var.f18683b) == null) {
                m.o3.a(c0Var);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void x() {
        m.o3 o3Var = (m.o3) ((ai.c0) this.f2716b).f536b;
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) o3Var.f18683b;
        if (a0Var != null) {
            try {
                k8.f fVar = (k8.f) a0Var.f1187c;
                fVar.T0(fVar.P0(), 5);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        while (!((LinkedList) o3Var.f18684c).isEmpty() && ((z6.d) ((LinkedList) o3Var.f18684c).getLast()).a() >= 1) {
            ((LinkedList) o3Var.f18684c).removeLast();
        }
    }

    public void y() {
        m.o3 o3Var = (m.o3) ((ai.c0) this.f2716b).f536b;
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) o3Var.f18683b;
        if (a0Var != null) {
            try {
                k8.f fVar = (k8.f) a0Var.f1187c;
                fVar.T0(fVar.P0(), 4);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        while (!((LinkedList) o3Var.f18684c).isEmpty() && ((z6.d) ((LinkedList) o3Var.f18684c).getLast()).a() >= 5) {
            ((LinkedList) o3Var.f18684c).removeLast();
        }
    }

    @Override
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        gi.m5 m5Var = (gi.m5) this.f2719f;
        ug.q1 q1Var = m5Var.K1;
        if (q1Var == null) {
            return;
        }
        q1Var.s(n0Var, true);
        m5Var.L0(false);
    }

    public ke(com.google.android.gms.internal.cast.n0 n0Var, com.google.android.gms.internal.cast.c cVar, String str) {
        this.f2715a = 2;
        this.f2716b = n0Var;
        this.f2717c = cVar;
        this.d = str;
        this.f2719f = new com.google.android.gms.internal.cast.m4(this);
    }

    public ke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f2715a = i3;
        this.f2716b = obj;
        this.f2717c = obj2;
        this.d = obj3;
        this.f2718e = obj4;
        this.f2719f = obj5;
    }

    public ke(Context context) {
        this(context, new g6.b(-1, 0, 0));
        this.f2715a = 7;
    }

    public ke(Context context, n9.h hVar, ua.e eVar, l2.e eVar2, org.telegram.ui.ActionBar.h4 h4Var) {
        this.f2715a = 22;
        this.f2716b = new com.google.android.gms.common.api.j(context, n7.d.f20274l, com.google.android.gms.common.api.b.f6584j, com.google.android.gms.common.api.i.f6594c);
        this.f2717c = hVar;
        this.d = eVar;
        this.f2718e = eVar2;
        this.f2719f = h4Var;
    }

    public ke(Context context, g6.b bVar) {
        this.f2715a = 7;
        this.f2716b = context;
        this.f2717c = bVar;
        N();
    }

    public ke(View view, View view2) {
        this.f2715a = 19;
        this.f2716b = view;
        this.f2717c = view2;
    }

    public ke(t9.a aVar, t9.b bVar) {
        this.f2715a = 18;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<t9.j> set = aVar.f55043c;
        Set set2 = aVar.f55046g;
        for (t9.j jVar : set) {
            int i3 = jVar.f55063c;
            int i10 = jVar.f55062b;
            boolean z10 = i3 == 0;
            t9.r rVar = jVar.f55061a;
            if (z10) {
                if (i10 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i3 == 2) {
                hashSet3.add(rVar);
            } else if (i10 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(t9.r.a(qa.a.class));
        }
        this.f2716b = DesugarCollections.unmodifiableSet(hashSet);
        this.f2717c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.f2718e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f2719f = bVar;
    }

    @Override
    public void D() {
    }

    @Override
    public void J() {
    }

    public ke(h4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f2715a = 6;
        this.f2716b = cVar;
        this.f2718e = hashMap2;
        this.f2719f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i3 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        this.f2717c = jArr;
    }

    @Override
    public void F(float f10, int i3) {
    }

    public ke(Activity activity, WallpapersListActivity wallpapersListActivity, s61 s61Var) {
        this.f2715a = 13;
        this.f2717c = activity;
        this.d = wallpapersListActivity;
        this.f2718e = s61Var;
    }

    public ke(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f2715a = 23;
        this.f2718e = new ArrayDeque();
        this.f2716b = sharedPreferences;
        this.f2717c = "topic_operation_queue";
        this.d = ",";
        this.f2719f = scheduledThreadPoolExecutor;
    }

    public ke(byte[] bArr, byte[] bArr2, String str) {
        this.f2715a = 16;
        this.f2716b = bArr;
        this.f2717c = bArr2;
        this.d = str;
    }

    public ke() {
        this.f2715a = 8;
        this.f2716b = new ArrayList();
        this.f2717c = new ArrayList();
        this.d = new ArrayList();
        this.f2718e = df.g.f8860p;
    }

    public ke(mh.c cVar) {
        this.f2715a = 9;
        this.f2719f = cVar;
        xq xqVar = xq.h;
        this.d = new qe.a(0, this, xqVar, 320L, true);
        this.f2718e = new qe.a(1, this, xqVar, 320L, true);
    }

    public ke(py0 py0Var, pm0 pm0Var, ry0 ry0Var, ry0 ry0Var2, ry0 ry0Var3) {
        this.f2715a = 15;
        this.f2719f = py0Var;
        this.f2716b = pm0Var;
        this.f2717c = ry0Var;
        this.d = ry0Var2;
        this.f2718e = ry0Var3;
    }

    public ke(org.telegram.ui.ActionBar.b3 b3Var) {
        this.f2715a = 11;
        this.f2717c = new RectF();
        this.d = new float[8];
        this.f2718e = new Path();
        this.f2719f = new Paint(1);
        this.f2716b = b3Var;
    }

    public ke(gi.m5 m5Var, org.telegram.ui.Components.ba baVar, Paint paint) {
        this.f2715a = 5;
        this.f2719f = m5Var;
        this.d = baVar;
        this.f2718e = paint;
        this.f2717c = new Path();
    }
}
