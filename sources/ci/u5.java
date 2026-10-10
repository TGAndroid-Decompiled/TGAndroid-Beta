package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.nj1;
public final class u5 implements kl0, z3.d, me.d, n5.b, q9.b {
    public Object f6065a;
    public Object f6066b;
    public Object f6067c;
    public Object d;
    public Object f6068e;

    public u5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f6065a = obj;
        this.f6066b = obj2;
        this.f6067c = obj3;
        this.d = obj4;
        this.f6068e = obj5;
    }

    public static void E(u5 u5Var, com.google.android.gms.internal.cast.w6 w6Var) {
        int i10 = w6Var.f7044e;
        if (i10 == 2 && ((com.google.android.gms.internal.cast.v6) u5Var.d) != null) {
            u5Var.G();
        }
        if (i10 == 2) {
            u5Var.d = new com.google.android.gms.internal.cast.v6((com.google.android.gms.internal.cast.p0) u5Var.f6065a, (String) u5Var.f6067c);
        } else {
            u5Var.d = u5Var.F();
        }
        com.google.android.gms.internal.cast.v6 v6Var = (com.google.android.gms.internal.cast.v6) u5Var.d;
        n6.l.h(v6Var);
        w6Var.d = v6Var.h;
        v6Var.f7028b.add(w6Var);
    }

    public static u5 k(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f6065a = sharedPreferences;
        obj.f6066b = "topic_operation_queue";
        obj.f6067c = ",";
        obj.f6068e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f6065a).getString((String) obj.f6066b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f6067c)) {
                    String[] split = string.split((String) obj.f6067c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) obj.d).add(str);
                        }
                    }
                    return obj;
                }
                return obj;
            } finally {
            }
        }
    }

    public void B() {
        Bitmap bitmap;
        if (((org.telegram.ui.Components.hd) this.d) != null) {
            this.d = null;
            View view = (View) this.f6066b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((org.telegram.ui.Components.hd) this.d) == null && ((org.telegram.ui.Components.hd) this.f6068e) == null && (bitmap = (Bitmap) this.f6067c) != null) {
            bitmap.recycle();
            this.f6067c = null;
        }
    }

    public void C(Uri uri) {
        int i10;
        Context context = (Context) this.f6065a;
        if (uri == null) {
            D();
        } else if (!uri.equals((Uri) this.f6067c)) {
            D();
            this.f6067c = uri;
            e6.b bVar = (e6.b) this.f6066b;
            int i11 = bVar.f8643b;
            if (i11 != 0 && (i10 = bVar.f8644c) != 0) {
                this.d = new f6.b(context, i11, i10, this);
            } else {
                this.d = new f6.b(context, 0, 0, this);
            }
            f6.b bVar2 = (f6.b) this.d;
            n6.l.h(bVar2);
            Uri uri2 = (Uri) this.f6067c;
            n6.l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void D() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f6067c = null;
    }

    public com.google.android.gms.internal.cast.v6 F() {
        if (((com.google.android.gms.internal.cast.v6) this.d) == null) {
            com.google.android.gms.internal.cast.v6 v6Var = new com.google.android.gms.internal.cast.v6((com.google.android.gms.internal.cast.p0) this.f6065a, (String) this.f6067c);
            this.d = v6Var;
            v6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.v6) this.d;
    }

    public void G() {
        int i10;
        com.google.android.gms.internal.cast.r1 r1Var;
        int i11;
        int i12;
        long j3;
        com.google.android.gms.internal.cast.v6 v6Var = (com.google.android.gms.internal.cast.v6) this.d;
        if (v6Var != null) {
            Map map = v6Var.f7030e;
            List<com.google.android.gms.internal.cast.h3> list = v6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = v6Var.f7029c;
            List<com.google.android.gms.internal.cast.w6> list3 = v6Var.f7028b;
            d6.c cVar = v6Var.f7034j;
            if (cVar != null) {
                cVar.f8186l = null;
                v6Var.f7034j = null;
            }
            long j10 = v6Var.f7033i;
            com.google.android.gms.internal.cast.r1 m10 = com.google.android.gms.internal.cast.s1.m();
            m10.c();
            com.google.android.gms.internal.cast.s1.t((com.google.android.gms.internal.cast.s1) m10.f6870b, j10);
            String str = v6Var.f7036l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.s1.y((com.google.android.gms.internal.cast.s1) m10.f6870b, str);
            }
            String str2 = v6Var.f7037m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.s1.u((com.google.android.gms.internal.cast.s1) m10.f6870b, str2);
            }
            com.google.android.gms.internal.cast.k1 l4 = com.google.android.gms.internal.cast.l1.l();
            String str3 = com.google.android.gms.internal.cast.v6.f7025o;
            l4.c();
            com.google.android.gms.internal.cast.l1.n((com.google.android.gms.internal.cast.l1) l4.f6870b, str3);
            String str4 = v6Var.f7032g;
            l4.c();
            com.google.android.gms.internal.cast.l1.m((com.google.android.gms.internal.cast.l1) l4.f6870b, str4);
            m10.c();
            com.google.android.gms.internal.cast.s1.r((com.google.android.gms.internal.cast.s1) m10.f6870b, (com.google.android.gms.internal.cast.l1) l4.a());
            com.google.android.gms.internal.cast.d0 d0Var = v6Var.f7027a;
            com.google.android.gms.internal.cast.x1 l10 = com.google.android.gms.internal.cast.y1.l();
            Object zza = d0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.j2 l11 = com.google.android.gms.internal.cast.k2.l();
                l11.c();
                com.google.android.gms.internal.cast.k2.m((com.google.android.gms.internal.cast.k2) l11.f6870b, (String) zza);
                l10.c();
                com.google.android.gms.internal.cast.y1.m((com.google.android.gms.internal.cast.y1) l10.f6870b, (com.google.android.gms.internal.cast.k2) l11.a());
            }
            String str5 = v6Var.f7035k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e7) {
                    g6.b bVar = com.google.android.gms.internal.cast.v6.f7024n;
                    Log.w(bVar.f10323a, bVar.d("receiverSessionId %s is not valid for hash", str5), e7);
                    j3 = 0;
                }
                l10.c();
                com.google.android.gms.internal.cast.y1.n((com.google.android.gms.internal.cast.y1) l10.f6870b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.w6 w6Var : list3) {
                    w6Var.getClass();
                    com.google.android.gms.internal.cast.v1 l12 = com.google.android.gms.internal.cast.w1.l();
                    int i13 = w6Var.f7044e;
                    l12.c();
                    com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l12.f6870b, i13);
                    l12.c();
                    com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l12.f6870b, (int) (w6Var.f7042b - w6Var.d));
                    Integer num = w6Var.f7041a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l12.f6870b, intValue);
                    }
                    Boolean bool = w6Var.f7043c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l12.f6870b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.w1) l12.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.y1.o((com.google.android.gms.internal.cast.y1) l10.f6870b, arrayList);
            }
            int i14 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.b2 l13 = com.google.android.gms.internal.cast.c2.l();
                    l13.c();
                    com.google.android.gms.internal.cast.c2.m((com.google.android.gms.internal.cast.c2) l13.f6870b, (int) (bVar2.f6780b - bVar2.f6781c));
                    int i15 = bVar2.f6779a;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                i12 = 1;
                            } else {
                                i12 = 4;
                            }
                        } else {
                            i12 = 3;
                        }
                    } else {
                        i12 = 2;
                    }
                    l13.c();
                    com.google.android.gms.internal.cast.c2.n((com.google.android.gms.internal.cast.c2) l13.f6870b, i12);
                    arrayList2.add((com.google.android.gms.internal.cast.c2) l13.a());
                }
                i10 = 1;
                l10.c();
                com.google.android.gms.internal.cast.y1.q((com.google.android.gms.internal.cast.y1) l10.f6870b, arrayList2);
            } else {
                i10 = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.h3 h3Var : list) {
                    String str6 = h3Var.f6896a;
                    com.google.android.gms.internal.cast.t1 l14 = com.google.android.gms.internal.cast.u1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i11 = 13;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16);
                                int i17 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i11 = 22;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162);
                                int i172 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i11 = 15;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622);
                                int i1722 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i11 = 19;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222);
                                int i17222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i11 = 23;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222);
                                int i172222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i11 = 9;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622222);
                                int i1722222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i11 = 21;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222222);
                                int i17222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i11 = 10;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222222);
                                int i172222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i11 = 14;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622222222);
                                int i1722222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i11 = 7;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222222222);
                                int i17222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i11 = 20;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222222222);
                                int i172222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i11 = i14;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622222222222);
                                int i1722222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i11 = 8;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222222222222);
                                int i17222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i11 = 3;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222222222222);
                                int i172222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i11 = 6;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622222222222222);
                                int i1722222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i11 = 5;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222222222222222);
                                int i17222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i11 = 4;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222222222222222);
                                int i172222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i11 = 18;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622222222222222222);
                                int i1722222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i11 = 16;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222222222222222222);
                                int i17222222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i11 = 12;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i162222222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222222222222222222);
                                int i172222222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i182222222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i11 = 11;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i1622222222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i1622222222222222222222);
                                int i1722222222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i1722222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i1822222222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i1822222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i11 = 17;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                                int i16222222222222222222222 = (int) h3Var.f6897b;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i16222222222222222222222);
                                int i17222222222222222222222 = h3Var.f6898c;
                                l14.c();
                                com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i17222222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                                int i18222222222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                                l14.c();
                                com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i18222222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                    }
                    i11 = i10;
                    l14.c();
                    com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.f6870b, i11);
                    int i162222222222222222222222 = (int) h3Var.f6897b;
                    l14.c();
                    com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.f6870b, i162222222222222222222222);
                    int i172222222222222222222222 = h3Var.f6898c;
                    l14.c();
                    com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.f6870b, i172222222222222222222222);
                    l14.c();
                    com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.f6870b, (int) (h3Var.d - h3Var.f6900f));
                    int i182222222222222222222222 = (int) (h3Var.f6899e - h3Var.f6900f);
                    l14.c();
                    com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.f6870b, i182222222222222222222222);
                    arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                    m10 = m10;
                    i14 = 2;
                }
                r1Var = m10;
                l10.c();
                com.google.android.gms.internal.cast.y1.p((com.google.android.gms.internal.cast.y1) l10.f6870b, arrayList3);
            } else {
                r1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    com.google.android.gms.internal.cast.z1 l15 = com.google.android.gms.internal.cast.a2.l();
                    int i19 = cVar2.f6798e;
                    l15.c();
                    com.google.android.gms.internal.cast.a2.p((com.google.android.gms.internal.cast.a2) l15.f6870b, i19);
                    int i20 = cVar2.d.get();
                    l15.c();
                    com.google.android.gms.internal.cast.a2.m((com.google.android.gms.internal.cast.a2) l15.f6870b, i20);
                    int i21 = (int) (cVar2.f6795a - cVar2.f6797c);
                    l15.c();
                    com.google.android.gms.internal.cast.a2.n((com.google.android.gms.internal.cast.a2) l15.f6870b, i21);
                    l15.c();
                    com.google.android.gms.internal.cast.a2.o((com.google.android.gms.internal.cast.a2) l15.f6870b, (int) (cVar2.f6796b - cVar2.f6797c));
                    arrayList4.add((com.google.android.gms.internal.cast.a2) l15.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.y1.r((com.google.android.gms.internal.cast.y1) l10.f6870b, arrayList4);
            }
            r1Var.c();
            com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) r1Var.f6870b, (com.google.android.gms.internal.cast.y1) l10.a());
            v6Var.f7031f.a((com.google.android.gms.internal.cast.s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f6065a).contains(q9.r.a(cls))) {
            Object a2 = ((q9.b) this.f6068e).a(cls);
            if (!cls.equals(ma.a.class)) {
                return a2;
            }
            ma.a aVar = (ma.a) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public q9.p b(q9.r rVar) {
        if (((Set) this.f6067c).contains(rVar)) {
            return ((q9.b) this.f6068e).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public pa.b c(Class cls) {
        return d(q9.r.a(cls));
    }

    @Override
    public pa.b d(q9.r rVar) {
        if (((Set) this.f6066b).contains(rVar)) {
            return ((q9.b) this.f6068e).d(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public int e(long j3) {
        long[] jArr = (long[]) this.f6066b;
        int a2 = e2.d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    @Override
    public Set f(q9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((q9.b) this.f6068e).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public Object g(q9.r rVar) {
        if (((Set) this.f6065a).contains(rVar)) {
            return ((q9.b) this.f6068e).g(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override
    public Object mo27get() {
        return new q5.a((Executor) ((gd.a) this.f6065a).mo27get(), (m5.d) ((gd.a) this.f6066b).mo27get(), (la.h) ((la.h) this.f6067c).mo27get(), (s5.d) ((gd.a) this.d).mo27get(), (t5.c) ((gd.a) this.f6068e).mo27get());
    }

    public byte[] h() {
        byte[] bArr = (byte[]) this.f6066b;
        byte[] bArr2 = (byte[]) this.f6065a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = nj1.f40272b;
        BigInteger bigInteger3 = nj1.f40271a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = nj1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = nj1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = nj1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = nj1.b(new byte[][]{a10, bArr});
                this.d = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.f6068e = arrayList;
                FileLog.d("wear-auth: built answer; session " + nj1.d(bArr2) + " emojis=" + ((ArrayList) this.f6068e));
                byte[] bArr4 = new byte[288];
                System.arraycopy(bArr2, 0, bArr4, 0, 16);
                System.arraycopy(bArr3, 0, bArr4, 16, 16);
                System.arraycopy(a2, 0, bArr4, 32, 256);
                return bArr4;
            }
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
    }

    public y9.s0 i() {
        String str;
        if (((Long) this.f6065a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f6066b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = sc.v.v(str, " offset");
        }
        if (((Integer) this.f6068e) == null) {
            str = sc.v.v(str, " importance");
        }
        if (str.isEmpty()) {
            return new y9.s0(((Long) this.f6065a).longValue(), (String) this.f6066b, (String) this.f6067c, ((Long) this.d).longValue(), ((Integer) this.f6068e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void j(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        int i11;
        RectF rectF = (RectF) this.f6066b;
        float[] fArr = (float[]) this.f6068e;
        Paint paint = (Paint) this.d;
        org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f6065a;
        Path path = (Path) this.f6067c;
        if (z11) {
            i11 = 0;
        } else {
            i11 = (int) n3Var.G;
        }
        int i12 = (int) (i11 * f7);
        int dp = AndroidUtilities.dp(10.0f) * Math.min(1, i12 / AndroidUtilities.dp(60.0f));
        if (i12 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f10 = dp;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        path.rewind();
        rectF.set(0.0f, 0.0f, i10, (n3Var.getY() + n3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public long l(int i10) {
        return ((long[]) this.f6066b)[i10];
    }

    @Override
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        q6 q6Var = (q6) this.f6068e;
        qg.b2 b2Var = q6Var.a2;
        if (b2Var == null) {
            return;
        }
        b2Var.s(n0Var, true);
        q6Var.N0(false);
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        ((TextView) this.f6066b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((me.b) this.d).f16341e));
        ((jh.c) this.f6068e).b(this);
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public List p(long j3) {
        f4.a[] aVarArr;
        f4.c cVar = (f4.c) this.f6065a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.f6068e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, (Map) this.f6067c, hashMap, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f4.f fVar = (f4.f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, fVar.f9656c, 0, fVar.f9657e, fVar.f9655b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f9658f, fVar.f9659g, false, -16777216, fVar.f9661j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f4.f fVar2 = (f4.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            d2.a aVar = (d2.a) entry.getValue();
            CharSequence charSequence = aVar.f8049a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (f4.a aVar2 : (f4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length(); i11++) {
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == '\n') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        spannableStringBuilder.delete(i16, i15 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
                if (spannableStringBuilder.charAt(i17) == ' ') {
                    int i18 = i17 + 1;
                    if (spannableStringBuilder.charAt(i18) == '\n') {
                        spannableStringBuilder.delete(i17, i18);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f7 = fVar2.f9656c;
            int i19 = fVar2.d;
            aVar.f8052e = f7;
            aVar.f8053f = i19;
            aVar.f8054g = fVar2.f9657e;
            aVar.h = fVar2.f9655b;
            aVar.f8058l = fVar2.f9658f;
            float f10 = fVar2.f9660i;
            int i20 = fVar2.h;
            aVar.f8057k = f10;
            aVar.f8056j = i20;
            aVar.f8062p = fVar2.f9661j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.ma maVar;
        Path path = (Path) this.f6067c;
        org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) this.f6066b;
        Paint paint2 = (Paint) this.d;
        q6 q6Var = (q6) this.f6068e;
        if (!z10 && (maVar = q6Var.f5798e2) != null && maVar.c()) {
            if (z10) {
                qaVar = (org.telegram.ui.Components.qa) this.f6065a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            qaVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.qa) this.f6065a) == null) {
                this.f6065a = new org.telegram.ui.Components.qa(q6Var.f5798e2, q6Var.Z1.getReactionsWindow().f54495c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((org.telegram.ui.Components.qa) this.f6065a).e(f12, f13, q6Var.getMeasuredWidth() + f12, q6Var.getMeasuredHeight() + f13);
            paint = ((org.telegram.ui.Components.qa) this.f6065a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            qaVar.e(f14, f15, q6Var.getMeasuredWidth() + f14, q6Var.getMeasuredHeight() + f15);
            paint = qaVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    public q9.p t(Class cls) {
        return b(q9.r.a(cls));
    }

    public String u() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public int w() {
        return ((long[]) this.f6066b).length;
    }

    public boolean x(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f6068e).execute(new rc(this, 2));
            }
        }
        return remove;
    }

    public Set y(Class cls) {
        return f(q9.r.a(cls));
    }

    public void z(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f6065a;
        View view2 = (View) this.f6066b;
        if (((Bitmap) this.f6067c) != bitmap) {
            if (((org.telegram.ui.Components.hd) this.f6068e) != null) {
                view.setBackground(null);
                this.f6068e = null;
            }
            if (((org.telegram.ui.Components.hd) this.d) == null && ((org.telegram.ui.Components.hd) this.f6068e) == null && (bitmap2 = (Bitmap) this.f6067c) != null) {
                bitmap2.recycle();
                this.f6067c = null;
            }
            B();
            this.f6067c = bitmap;
            org.telegram.ui.Components.hd hdVar = new org.telegram.ui.Components.hd((Bitmap) this.f6067c);
            this.f6068e = hdVar;
            view.setBackground(hdVar);
            if (view2 != null) {
                org.telegram.ui.Components.hd hdVar2 = new org.telegram.ui.Components.hd((Bitmap) this.f6067c);
                this.d = hdVar2;
                view2.setBackground(hdVar2);
            }
        }
    }

    public u5(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public u5(Context context, e6.b bVar) {
        this.f6065a = context;
        this.f6066b = bVar;
        D();
    }

    public u5(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f6065a = cVar;
        this.d = hashMap2;
        this.f6068e = hashMap3;
        this.f6067c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f6066b = jArr;
    }

    public u5(jh.c cVar) {
        this.f6068e = cVar;
        is isVar = is.h;
        this.f6067c = new me.b(0, this, isVar, 320L, true);
        this.d = new me.b(1, this, isVar, 320L, true);
    }

    public u5(org.telegram.ui.ActionBar.n3 n3Var) {
        this.f6066b = new RectF();
        this.f6068e = new float[8];
        this.f6067c = new Path();
        this.d = new Paint(1);
        this.f6065a = n3Var;
    }

    @Override
    public void s() {
    }

    @Override
    public void A(float f7, int i10) {
    }
}
