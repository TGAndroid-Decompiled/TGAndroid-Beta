package a8;

import a8.r7;
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
import org.telegram.messenger.id;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xq;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.hy0;
import org.telegram.ui.mm0;
import org.telegram.ui.vc1;
import org.telegram.ui.zy0;
public final class r7 implements hi0, ib.b, c4.d, te.b, org.telegram.messenger.za, lm0, q5.b, u9.b {
    public final int f613a;
    public Object f614b;
    public Object f615c;
    public Object d;
    public Object f616e;
    public Object f617f;

    public r7(int i7, byte b10) {
        this.f613a = i7;
    }

    public static void K(r7 r7Var, com.google.android.gms.internal.cast.s6 s6Var) {
        int i7 = s6Var.f6990e;
        if (i7 == 2 && ((com.google.android.gms.internal.cast.r6) r7Var.f616e) != null) {
            r7Var.O();
        }
        if (i7 == 2) {
            r7Var.f616e = new com.google.android.gms.internal.cast.r6((com.google.android.gms.internal.cast.m0) r7Var.f614b, (String) r7Var.d);
        } else {
            r7Var.f616e = r7Var.N();
        }
        com.google.android.gms.internal.cast.r6 r6Var = (com.google.android.gms.internal.cast.r6) r7Var.f616e;
        q6.m.g(r6Var);
        s6Var.d = r6Var.h;
        r6Var.f6968b.add(s6Var);
    }

    public static r7 m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        r7 r7Var = new r7(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) r7Var.f616e)) {
            try {
                ((ArrayDeque) r7Var.f616e).clear();
                String string = ((SharedPreferences) r7Var.f614b).getString((String) r7Var.f615c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) r7Var.d)) {
                    String[] split = string.split((String) r7Var.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) r7Var.f616e).add(str);
                        }
                    }
                    return r7Var;
                }
                return r7Var;
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
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
        if (f2Var != null) {
            Activity parentActivity = f2Var.getParentActivity();
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
            mm0 mm0Var = new mm0(2, false, false, null);
            mm0Var.f47844y = false;
            mm0Var.V = new vy(this, 6);
            f2Var.presentFragment(mm0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        ((Activity) this.f615c).startActivityForResult(intent, 11);
    }

    public String B() {
        String str;
        synchronized (((ArrayDeque) this.f616e)) {
            str = (String) ((ArrayDeque) this.f616e).peek();
        }
        return str;
    }

    public Task C() {
        Task forException;
        int i7;
        boolean r10 = r();
        if (r10 && ((ab.v) this.f617f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new f5.r("Firebase-Messaging-Network-Io"));
            return ((va.c) ((va.d) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final r7 f995b;

                {
                    this.f995b = this;
                }

                @Override
                public final Object then(Task task) {
                    int i10 = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    r7 r7Var = this.f995b;
                    switch (i10) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            o9.g gVar = (o9.g) r7Var.f615c;
                            gVar.a();
                            o9.i iVar = gVar.f20877c;
                            String str3 = iVar.f20887a;
                            gVar.a();
                            m6.b bVar = new m6.b(v.b(gVar), iVar.f20888b, str3, str, str2);
                            o7.d dVar = (o7.d) r7Var.f614b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new n6.c[]{m6.i.f19905a};
                            b10.f6682c = new j2.n(dVar, bVar, false, 10);
                            b10.f6680a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new t(str, 0));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.q(task));
                            }
                            return ((va.c) ((va.d) r7Var.d)).e().continueWithTask(executorService, new t(r7Var, ((va.a) task.getResult()).f57283a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final r7 f995b;

                {
                    this.f995b = this;
                }

                @Override
                public final Object then(Task task) {
                    int i10 = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    r7 r7Var = this.f995b;
                    switch (i10) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            o9.g gVar = (o9.g) r7Var.f615c;
                            gVar.a();
                            o9.i iVar = gVar.f20877c;
                            String str3 = iVar.f20887a;
                            gVar.a();
                            m6.b bVar = new m6.b(v.b(gVar), iVar.f20888b, str3, str, str2);
                            o7.d dVar = (o7.d) r7Var.f614b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new n6.c[]{m6.i.f19905a};
                            b10.f6682c = new j2.n(dVar, bVar, false, 10);
                            b10.f6680a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new t(str, 0));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.q(task));
                            }
                            return ((va.c) ((va.d) r7Var.d)).e().continueWithTask(executorService, new t(r7Var, ((va.a) task.getResult()).f57283a));
                    }
                }
            });
        }
        b8 b8Var = (b8) this.f616e;
        String b10 = ab.v.b((o9.g) b8Var.f335a);
        Bundle bundle = new Bundle();
        try {
            b8Var.l(b10, bundle, r10);
            m6.c cVar = (m6.c) b8Var.f337c;
            m6.d dVar = m6.d.f19896b;
            cc.c cVar2 = cVar.f19892c;
            if (cVar2.i() < 12000000) {
                if (cVar2.h() != 0) {
                    forException = cVar.d(bundle).continueWithTask(dVar, new m4.d0(cVar, bundle));
                } else {
                    forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
            } else {
                m6.n i10 = m6.n.i(cVar.f19891b);
                synchronized (i10) {
                    i7 = i10.f19920a;
                    i10.f19920a = i7 + 1;
                }
                forException = i10.k(new m6.m(i7, 1, bundle, 1)).continueWith(dVar, qb.a.f54060b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            forException = Tasks.forException(e10);
        }
        return forException.continueWith(new d3.b(3), new a1.c(b8Var, 4));
    }

    @Override
    public boolean E() {
        return false;
    }

    public boolean G(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f616e)) {
            remove = ((ArrayDeque) this.f616e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f617f).execute(new a3.f(this, 1));
            }
        }
        return remove;
    }

    public Set H(Class cls) {
        return g(u9.r.a(cls));
    }

    public void I(Uri uri) {
        int i7;
        Context context = (Context) this.f614b;
        if (uri == null) {
            J();
        } else if (!uri.equals((Uri) this.d)) {
            J();
            this.d = uri;
            h6.b bVar = (h6.b) this.f615c;
            int i10 = bVar.f14219b;
            if (i10 != 0 && (i7 = bVar.f14220c) != 0) {
                this.f616e = new i6.b(context, i10, i7, this);
            } else {
                this.f616e = new i6.b(context, 0, 0, this);
            }
            i6.b bVar2 = (i6.b) this.f616e;
            q6.m.g(bVar2);
            Uri uri2 = (Uri) this.d;
            q6.m.g(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void J() {
        i6.b bVar = (i6.b) this.f616e;
        if (bVar != null) {
            bVar.cancel(true);
            this.f616e = null;
        }
        this.d = null;
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        Paint paint;
        org.telegram.ui.Components.y9 y9Var;
        Path path = (Path) this.f615c;
        org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) this.d;
        Paint paint2 = (Paint) this.f616e;
        fi.o5 o5Var = (fi.o5) this.f617f;
        if (!z9 && (y9Var = o5Var.N1) != null && y9Var.c()) {
            if (z9) {
                caVar = (org.telegram.ui.Components.ca) this.f614b;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            caVar.b(canvas, true);
            paint2.setAlpha((int) (i7 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z9) {
            if (((org.telegram.ui.Components.ca) this.f614b) == null) {
                this.f614b = new org.telegram.ui.Components.ca(o5Var.N1, o5Var.I1.getReactionsWindow().f6185c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((org.telegram.ui.Components.ca) this.f614b).e(f13, f14, o5Var.getMeasuredWidth() + f13, o5Var.getMeasuredHeight() + f14);
            paint = ((org.telegram.ui.Components.ca) this.f614b).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            caVar.e(f15, f16, o5Var.getMeasuredWidth() + f15, o5Var.getMeasuredHeight() + f16);
            paint = caVar.h;
        }
        paint.setAlpha(i7);
        paint2.setAlpha((int) (i7 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public com.google.android.gms.internal.cast.r6 N() {
        if (((com.google.android.gms.internal.cast.r6) this.f616e) == null) {
            com.google.android.gms.internal.cast.r6 r6Var = new com.google.android.gms.internal.cast.r6((com.google.android.gms.internal.cast.m0) this.f614b, (String) this.d);
            this.f616e = r6Var;
            r6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.r6) this.f616e;
    }

    public void O() {
        int i7;
        com.google.android.gms.internal.cast.o1 o1Var;
        int i10;
        int i11;
        long j3;
        com.google.android.gms.internal.cast.r6 r6Var = (com.google.android.gms.internal.cast.r6) this.f616e;
        if (r6Var != null) {
            Map map = r6Var.f6970e;
            List<com.google.android.gms.internal.cast.e3> list = r6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = r6Var.f6969c;
            List<com.google.android.gms.internal.cast.s6> list3 = r6Var.f6968b;
            g6.c cVar = r6Var.f6974j;
            if (cVar != null) {
                cVar.f13551l = null;
                r6Var.f6974j = null;
            }
            long j10 = r6Var.f6973i;
            com.google.android.gms.internal.cast.o1 m10 = com.google.android.gms.internal.cast.p1.m();
            m10.c();
            com.google.android.gms.internal.cast.p1.t((com.google.android.gms.internal.cast.p1) m10.f6805b, j10);
            String str = r6Var.f6976l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.y((com.google.android.gms.internal.cast.p1) m10.f6805b, str);
            }
            String str2 = r6Var.f6977m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.u((com.google.android.gms.internal.cast.p1) m10.f6805b, str2);
            }
            com.google.android.gms.internal.cast.h1 l10 = com.google.android.gms.internal.cast.i1.l();
            String str3 = com.google.android.gms.internal.cast.r6.f6965o;
            l10.c();
            com.google.android.gms.internal.cast.i1.n((com.google.android.gms.internal.cast.i1) l10.f6805b, str3);
            String str4 = r6Var.f6972g;
            l10.c();
            com.google.android.gms.internal.cast.i1.m((com.google.android.gms.internal.cast.i1) l10.f6805b, str4);
            m10.c();
            com.google.android.gms.internal.cast.p1.r((com.google.android.gms.internal.cast.p1) m10.f6805b, (com.google.android.gms.internal.cast.i1) l10.a());
            com.google.android.gms.internal.cast.b0 b0Var = r6Var.f6967a;
            com.google.android.gms.internal.cast.u1 l11 = com.google.android.gms.internal.cast.v1.l();
            Object zza = b0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.g2 l12 = com.google.android.gms.internal.cast.h2.l();
                l12.c();
                com.google.android.gms.internal.cast.h2.m((com.google.android.gms.internal.cast.h2) l12.f6805b, (String) zza);
                l11.c();
                com.google.android.gms.internal.cast.v1.m((com.google.android.gms.internal.cast.v1) l11.f6805b, (com.google.android.gms.internal.cast.h2) l12.a());
            }
            String str5 = r6Var.f6975k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    j6.b bVar = com.google.android.gms.internal.cast.r6.f6964n;
                    Log.w(bVar.f16508a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j3 = 0;
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.n((com.google.android.gms.internal.cast.v1) l11.f6805b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.s6 s6Var : list3) {
                    s6Var.getClass();
                    com.google.android.gms.internal.cast.s1 l13 = com.google.android.gms.internal.cast.t1.l();
                    int i12 = s6Var.f6990e;
                    l13.c();
                    com.google.android.gms.internal.cast.t1.p((com.google.android.gms.internal.cast.t1) l13.f6805b, i12);
                    l13.c();
                    com.google.android.gms.internal.cast.t1.m((com.google.android.gms.internal.cast.t1) l13.f6805b, (int) (s6Var.f6988b - s6Var.d));
                    Integer num = s6Var.f6987a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        com.google.android.gms.internal.cast.t1.n((com.google.android.gms.internal.cast.t1) l13.f6805b, intValue);
                    }
                    Boolean bool = s6Var.f6989c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        com.google.android.gms.internal.cast.t1.o((com.google.android.gms.internal.cast.t1) l13.f6805b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.t1) l13.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.o((com.google.android.gms.internal.cast.v1) l11.f6805b, arrayList);
            }
            int i13 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    com.google.android.gms.internal.cast.y1 l14 = com.google.android.gms.internal.cast.z1.l();
                    l14.c();
                    com.google.android.gms.internal.cast.z1.m((com.google.android.gms.internal.cast.z1) l14.f6805b, (int) (aVar.f6756b - aVar.f6757c));
                    int i14 = aVar.f6755a;
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
                    com.google.android.gms.internal.cast.z1.n((com.google.android.gms.internal.cast.z1) l14.f6805b, i11);
                    arrayList2.add((com.google.android.gms.internal.cast.z1) l14.a());
                }
                i7 = 1;
                l11.c();
                com.google.android.gms.internal.cast.v1.q((com.google.android.gms.internal.cast.v1) l11.f6805b, arrayList2);
            } else {
                i7 = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.e3 e3Var : list) {
                    String str6 = e3Var.f6846a;
                    com.google.android.gms.internal.cast.q1 l15 = com.google.android.gms.internal.cast.r1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15);
                                int i16 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152);
                                int i162 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522);
                                int i1622 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222);
                                int i16222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222);
                                int i162222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522222);
                                int i1622222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222222);
                                int i16222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222222);
                                int i162222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522222222);
                                int i1622222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222222222);
                                int i16222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222222222);
                                int i162222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = i13;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522222222222);
                                int i1622222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222222222222);
                                int i16222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222222222222);
                                int i162222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522222222222222);
                                int i1622222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222222222222222);
                                int i16222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222222222222222);
                                int i162222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522222222222222222);
                                int i1622222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222222222222222222);
                                int i16222222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i152222222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222222222222222222);
                                int i162222222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i172222222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i1522222222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i1522222222222222222222);
                                int i1622222222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i1622222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i1722222222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i1722222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                                int i15222222222222222222222 = (int) e3Var.f6847b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i15222222222222222222222);
                                int i16222222222222222222222 = e3Var.f6848c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i16222222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                                int i17222222222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i17222222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                    }
                    i10 = i7;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6805b, i10);
                    int i152222222222222222222222 = (int) e3Var.f6847b;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6805b, i152222222222222222222222);
                    int i162222222222222222222222 = e3Var.f6848c;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6805b, i162222222222222222222222);
                    l15.c();
                    com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6805b, (int) (e3Var.d - e3Var.f6850f));
                    int i172222222222222222222222 = (int) (e3Var.f6849e - e3Var.f6850f);
                    l15.c();
                    com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6805b, i172222222222222222222222);
                    arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                    m10 = m10;
                    i13 = 2;
                }
                o1Var = m10;
                l11.c();
                com.google.android.gms.internal.cast.v1.p((com.google.android.gms.internal.cast.v1) l11.f6805b, arrayList3);
            } else {
                o1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.w1 l16 = com.google.android.gms.internal.cast.x1.l();
                    int i18 = bVar2.f6812e;
                    l16.c();
                    com.google.android.gms.internal.cast.x1.p((com.google.android.gms.internal.cast.x1) l16.f6805b, i18);
                    int i19 = bVar2.d.get();
                    l16.c();
                    com.google.android.gms.internal.cast.x1.m((com.google.android.gms.internal.cast.x1) l16.f6805b, i19);
                    int i20 = (int) (bVar2.f6809a - bVar2.f6811c);
                    l16.c();
                    com.google.android.gms.internal.cast.x1.n((com.google.android.gms.internal.cast.x1) l16.f6805b, i20);
                    l16.c();
                    com.google.android.gms.internal.cast.x1.o((com.google.android.gms.internal.cast.x1) l16.f6805b, (int) (bVar2.f6810b - bVar2.f6811c));
                    arrayList4.add((com.google.android.gms.internal.cast.x1) l16.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.r((com.google.android.gms.internal.cast.v1) l11.f6805b, arrayList4);
            }
            o1Var.c();
            com.google.android.gms.internal.cast.p1.q((com.google.android.gms.internal.cast.p1) o1Var.f6805b, (com.google.android.gms.internal.cast.v1) l11.a());
            r6Var.f6971f.a((com.google.android.gms.internal.cast.p1) o1Var.a(), 233);
            this.f616e = null;
        }
    }

    @Override
    public boolean U() {
        return true;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((TextView) this.f615c).setAlpha(org.telegram.messenger.g0.T1(0.5f, 1.0f, ((te.a) this.f616e).f55487e));
        ((lh.c) this.f617f).b(this);
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f614b).contains(u9.r.a(cls))) {
            Object a10 = ((u9.b) this.f617f).a(cls);
            if (!cls.equals(ra.a.class)) {
                return a10;
            }
            ra.a aVar = (ra.a) a10;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public u9.p b(u9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((u9.b) this.f617f).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public ua.b c(Class cls) {
        return f(u9.r.a(cls));
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.f615c;
        int b10 = h2.m0.b(jArr, j3, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public Object e(u9.r rVar) {
        if (((Set) this.f614b).contains(rVar)) {
            return ((u9.b) this.f617f).e(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override
    public ua.b f(u9.r rVar) {
        if (((Set) this.f615c).contains(rVar)) {
            return ((u9.b) this.f617f).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public Set g(u9.r rVar) {
        if (((Set) this.f616e).contains(rVar)) {
            return ((u9.b) this.f617f).g(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public Object mo24get() {
        switch (this.f613a) {
            case 7:
                return new gb.u0((o9.g) ((d9.o) this.f614b).f8253a, (va.d) ((ib.c) this.f615c).mo24get(), (jb.l) ((ib.c) this.d).mo24get(), (gb.l) ((ib.c) this.f616e).mo24get(), (id.h) ((ib.c) this.f617f).mo24get());
            case 10:
                return new jb.d((gb.j1) ((ib.c) this.f614b).mo24get(), (va.d) ((ib.c) this.f615c).mo24get(), (gb.b) ((ib.c) this.d).mo24get(), (jb.f) ((ib.c) this.f616e).mo24get(), (jb.p) ((ib.c) this.f617f).mo24get());
            default:
                return new t5.a((Executor) ((fd.a) this.f614b).mo24get(), (p5.d) ((fd.a) this.f615c).mo24get(), (hy0) ((hy0) this.d).mo24get(), (v5.d) ((fd.a) this.f616e).mo24get(), (w5.c) ((fd.a) this.f617f).mo24get());
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    public byte[] h() {
        byte[] bArr = (byte[]) this.f615c;
        byte[] bArr2 = (byte[]) this.f614b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = vc1.f50640b;
        BigInteger bigInteger3 = vc1.f50639a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a10 = vc1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a11 = vc1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = vc1.b(new byte[][]{a11, bArr2, bArr3});
                byte[] b11 = vc1.b(new byte[][]{a11, bArr});
                this.f616e = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i7 = 0; i7 < 4; i7++) {
                    int i10 = i7 * 8;
                    arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % 200)]);
                }
                this.f617f = arrayList;
                org.telegram.messenger.a8.b("wear-auth: built answer; session " + vc1.d(bArr2) + " emojis=" + ((ArrayList) this.f617f));
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

    @Override
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        fi.o5 o5Var = (fi.o5) this.f617f;
        tg.q1 q1Var = o5Var.J1;
        if (q1Var == null) {
            return;
        }
        q1Var.s(o0Var, true);
        o5Var.L0(false);
    }

    public void j(Canvas canvas, boolean z9, boolean z10, int i7, float f10) {
        int i10;
        RectF rectF = (RectF) this.f615c;
        float[] fArr = (float[]) this.d;
        Paint paint = (Paint) this.f617f;
        org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.f614b;
        Path path = (Path) this.f616e;
        if (z10) {
            i10 = 0;
        } else {
            i10 = (int) d3Var.G;
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
        rectF.set(0.0f, 0.0f, i7, (d3Var.getY() + d3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z9) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public long k(int i7) {
        return ((long[]) this.f615c)[i7];
    }

    @Override
    public void l(boolean z9, float f10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((zy0) this.f617f).d;
        bz0 bz0Var = (bz0) this.f616e;
        bz0 bz0Var2 = (bz0) this.f615c;
        bz0 bz0Var3 = (bz0) this.d;
        boolean isAttachedToWindow = ((org.telegram.ui.Components.mm0) this.f614b).isAttachedToWindow();
        if (f10 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        if (f10 >= 1.0f) {
            bz0Var2.e(false, isAttachedToWindow);
            bz0Var3.e(false, isAttachedToWindow);
            bz0Var.e(true, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(bz0Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            bz0Var2.e(true, isAttachedToWindow);
            bz0Var3.e(false, isAttachedToWindow);
            bz0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(bz0Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            bz0Var3.c(id.a0("UpToFileSize", null, 2131743826, org.telegram.messenger.g0.i0(j3, true, false)), false, true);
            bz0Var2.e(false, isAttachedToWindow);
            bz0Var3.e(true, isAttachedToWindow);
            bz0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(bz0Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z9) {
            saveToGallerySettingsActivity.c0().f25347c = j3;
            saveToGallerySettingsActivity.d0();
        }
    }

    public void n(View view) {
        if (view instanceof GLSurfaceView) {
            this.f617f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                n(viewGroup.getChildAt(i7));
            }
        }
    }

    public u9.p o(Class cls) {
        return b(u9.r.a(cls));
    }

    public void p(q0.a aVar) {
        bi.x5 x5Var = (bi.x5) this.f614b;
        org.telegram.messenger.ha haVar = new org.telegram.messenger.ha(this, aVar);
        x5Var.getClass();
        q6.m.d("getMapAsync() must be called on the main thread");
        m.q3 q3Var = (m.q3) x5Var.f5026b;
        h6.m mVar = (h6.m) q3Var.f19229b;
        if (mVar != null) {
            mVar.t(haVar);
        } else {
            ((ArrayList) q3Var.f19233g).add(haVar);
        }
    }

    @Override
    public int q0() {
        return 0;
    }

    public boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = (o9.g) this.f615c;
        gVar.a();
        Context context = gVar.f20875a;
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
    public List s(long j3) {
        i4.a[] aVarArr;
        i4.c cVar = (i4.c) this.f614b;
        HashMap hashMap = (HashMap) this.f616e;
        HashMap hashMap2 = (HashMap) this.f617f;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, (Map) this.d, hashMap, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                i4.e eVar = (i4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new g2.b(null, null, null, decodeByteArray, eVar.f15258c, 0, eVar.f15259e, eVar.f15257b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f15260f, eVar.f15261g, false, -16777216, eVar.f15263j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            i4.e eVar2 = (i4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            g2.a aVar = (g2.a) entry.getValue();
            CharSequence charSequence = aVar.f13414a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (i4.a aVar2 : (i4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), i4.a.class)) {
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
            float f10 = eVar2.f15258c;
            int i18 = eVar2.d;
            aVar.f13417e = f10;
            aVar.f13418f = i18;
            aVar.f13419g = eVar2.f15259e;
            aVar.h = eVar2.f15257b;
            aVar.f13423l = eVar2.f15260f;
            float f11 = eVar2.f15262i;
            int i19 = eVar2.h;
            aVar.f13422k = f11;
            aVar.f13421j = i19;
            aVar.f13427p = eVar2.f15263j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public void t(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: a8.r7.t(int, int, android.content.Intent):void");
    }

    public void u() {
        bi.x5 x5Var = (bi.x5) this.f614b;
        m.q3 q3Var = (m.q3) x5Var.f5026b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            q3Var.getClass();
            q3Var.b(new a7.c(q3Var, 0));
            if (((h6.m) q3Var.f19229b) == null) {
                m.q3.a(x5Var);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override
    public boolean v() {
        return true;
    }

    public void w() {
        m.q3 q3Var = (m.q3) ((bi.x5) this.f614b).f5026b;
        h6.m mVar = (h6.m) q3Var.f19229b;
        if (mVar != null) {
            try {
                l8.f fVar = (l8.f) mVar.f14265c;
                fVar.t1(fVar.p1(), 5);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        while (!((LinkedList) q3Var.f19230c).isEmpty() && ((a7.c) ((LinkedList) q3Var.f19230c).getLast()).a() >= 1) {
            ((LinkedList) q3Var.f19230c).removeLast();
        }
    }

    public void x() {
        m.q3 q3Var = (m.q3) ((bi.x5) this.f614b).f5026b;
        h6.m mVar = (h6.m) q3Var.f19229b;
        if (mVar != null) {
            try {
                l8.f fVar = (l8.f) mVar.f14265c;
                fVar.t1(fVar.p1(), 4);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        while (!((LinkedList) q3Var.f19230c).isEmpty() && ((a7.c) ((LinkedList) q3Var.f19230c).getLast()).a() >= 5) {
            ((LinkedList) q3Var.f19230c).removeLast();
        }
    }

    @Override
    public int y() {
        return ((long[]) this.f615c).length;
    }

    public void z() {
        m.q3 q3Var = (m.q3) ((bi.x5) this.f614b).f5026b;
        q3Var.getClass();
        q3Var.b(new a7.c(q3Var, 1));
    }

    public r7(com.google.android.gms.internal.cast.m0 m0Var, com.google.android.gms.internal.cast.c cVar, String str) {
        this.f613a = 5;
        this.f614b = m0Var;
        this.f615c = cVar;
        this.d = str;
        this.f617f = new com.google.android.gms.internal.cast.l4(this);
    }

    public r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f613a = i7;
        this.f614b = obj;
        this.f615c = obj2;
        this.d = obj3;
        this.f616e = obj4;
        this.f617f = obj5;
    }

    public r7(Context context) {
        this(context, new h6.b(-1, 0, 0));
        this.f613a = 9;
    }

    public r7(Context context, o9.g gVar, va.d dVar, b8 b8Var, ab.v vVar) {
        this.f613a = 1;
        this.f614b = new com.google.android.gms.common.api.j(context, o7.d.f20855l, com.google.android.gms.common.api.b.f6532j, com.google.android.gms.common.api.i.f6542c);
        this.f615c = gVar;
        this.d = dVar;
        this.f616e = b8Var;
        this.f617f = vVar;
    }

    public r7(Context context, h6.b bVar) {
        this.f613a = 9;
        this.f614b = context;
        this.f615c = bVar;
        J();
    }

    public r7(u9.a aVar, u9.b bVar) {
        this.f613a = 22;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<u9.j> set = aVar.f56454c;
        Set set2 = aVar.f56457g;
        for (u9.j jVar : set) {
            int i7 = jVar.f56476c;
            int i10 = jVar.f56475b;
            boolean z9 = i7 == 0;
            u9.r rVar = jVar.f56474a;
            if (z9) {
                if (i10 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(rVar);
            } else if (i10 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(u9.r.a(ra.a.class));
        }
        this.f614b = DesugarCollections.unmodifiableSet(hashSet);
        this.f615c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.f616e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f617f = bVar;
    }

    @Override
    public void D() {
    }

    @Override
    public void M() {
    }

    public r7(i4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f613a = 8;
        this.f614b = cVar;
        this.f616e = hashMap2;
        this.f617f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f615c = jArr;
    }

    @Override
    public void F(float f10, int i7) {
    }

    public r7(Activity activity, WallpapersListActivity wallpapersListActivity, a71 a71Var) {
        this.f613a = 16;
        this.f615c = activity;
        this.d = wallpapersListActivity;
        this.f616e = a71Var;
    }

    public r7(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f613a = 2;
        this.f616e = new ArrayDeque();
        this.f614b = sharedPreferences;
        this.f615c = "topic_operation_queue";
        this.d = ",";
        this.f617f = scheduledThreadPoolExecutor;
    }

    public r7(byte[] bArr, byte[] bArr2, String str) {
        this.f613a = 19;
        this.f614b = bArr;
        this.f615c = bArr2;
        this.d = str;
    }

    public r7() {
        this.f613a = 11;
        this.f614b = new ArrayList();
        this.f615c = new ArrayList();
        this.d = new ArrayList();
        this.f616e = gf.h.f13890p;
    }

    public r7(lh.c cVar) {
        this.f613a = 12;
        this.f617f = cVar;
        xq xqVar = xq.h;
        this.d = new te.a(0, this, xqVar, 320L, true);
        this.f616e = new te.a(1, this, xqVar, 320L, true);
    }

    public r7(int i7) {
        this.f613a = 20;
        this.f614b = new int[i7];
        this.f615c = new int[i7];
        this.d = new float[i7];
        this.f616e = new float[i7];
        this.f617f = new float[i7];
    }

    public r7(zy0 zy0Var, org.telegram.ui.Components.mm0 mm0Var, bz0 bz0Var, bz0 bz0Var2, bz0 bz0Var3) {
        this.f613a = 18;
        this.f617f = zy0Var;
        this.f614b = mm0Var;
        this.f615c = bz0Var;
        this.d = bz0Var2;
        this.f616e = bz0Var3;
    }

    public r7(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f613a = 14;
        this.f615c = new RectF();
        this.d = new float[8];
        this.f616e = new Path();
        this.f617f = new Paint(1);
        this.f614b = d3Var;
    }

    public r7(fi.o5 o5Var, org.telegram.ui.Components.ca caVar, Paint paint) {
        this.f613a = 6;
        this.f617f = o5Var;
        this.d = caVar;
        this.f616e = paint;
        this.f615c = new Path();
    }
}
