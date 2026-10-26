package a8;

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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.el0;
import org.telegram.ui.ii1;
public final class me implements z3.d, el0, oe.d, o5.b, s9.b {
    public Object f614a;
    public Object f615b;
    public Object f616c;
    public Object d;
    public Object e;

    public me(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f614a = obj;
        this.f615b = obj2;
        this.f616c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public static void D(me meVar, com.google.android.gms.internal.cast.t6 t6Var) {
        int i10 = t6Var.e;
        if (i10 == 2 && ((com.google.android.gms.internal.cast.s6) meVar.d) != null) {
            meVar.G();
        }
        if (i10 == 2) {
            meVar.d = new com.google.android.gms.internal.cast.s6((com.google.android.gms.internal.cast.m0) meVar.f614a, (String) meVar.f616c);
        } else {
            meVar.d = meVar.F();
        }
        com.google.android.gms.internal.cast.s6 s6Var = (com.google.android.gms.internal.cast.s6) meVar.d;
        o6.l.h(s6Var);
        t6Var.d = s6Var.h;
        s6Var.f6887b.add(t6Var);
    }

    public static me t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f614a = sharedPreferences;
        obj.f615b = "topic_operation_queue";
        obj.f616c = ",";
        obj.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f614a).getString((String) obj.f615b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f616c)) {
                    String[] split = string.split((String) obj.f616c, -1);
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

    public void A() {
        Bitmap bitmap;
        if (((org.telegram.ui.Components.dd) this.d) != null) {
            this.d = null;
            View view = (View) this.f615b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((org.telegram.ui.Components.dd) this.d) == null && ((org.telegram.ui.Components.dd) this.e) == null && (bitmap = (Bitmap) this.f616c) != null) {
            bitmap.recycle();
            this.f616c = null;
        }
    }

    public void B(Uri uri) {
        int i10;
        Context context = (Context) this.f614a;
        if (uri == null) {
            C();
        } else if (!uri.equals((Uri) this.f616c)) {
            C();
            this.f616c = uri;
            f6.b bVar = (f6.b) this.f615b;
            int i11 = bVar.f10188b;
            if (i11 != 0 && (i10 = bVar.f10189c) != 0) {
                this.d = new g6.b(context, i11, i10, this);
            } else {
                this.d = new g6.b(context, 0, 0, this);
            }
            g6.b bVar2 = (g6.b) this.d;
            o6.l.h(bVar2);
            Uri uri2 = (Uri) this.f616c;
            o6.l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void C() {
        g6.b bVar = (g6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f616c = null;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((TextView) this.f615b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((oe.b) this.d).e));
        ((lh.c) this.e).b(this);
    }

    public com.google.android.gms.internal.cast.s6 F() {
        if (((com.google.android.gms.internal.cast.s6) this.d) == null) {
            com.google.android.gms.internal.cast.s6 s6Var = new com.google.android.gms.internal.cast.s6((com.google.android.gms.internal.cast.m0) this.f614a, (String) this.f616c);
            this.d = s6Var;
            s6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.s6) this.d;
    }

    public void G() {
        int i10;
        com.google.android.gms.internal.cast.o1 o1Var;
        int i11;
        int i12;
        long j10;
        com.google.android.gms.internal.cast.s6 s6Var = (com.google.android.gms.internal.cast.s6) this.d;
        if (s6Var != null) {
            Map map = s6Var.e;
            List<com.google.android.gms.internal.cast.e3> list = s6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = s6Var.f6888c;
            List<com.google.android.gms.internal.cast.t6> list3 = s6Var.f6887b;
            e6.c cVar = s6Var.f6892j;
            if (cVar != null) {
                cVar.f9810l = null;
                s6Var.f6892j = null;
            }
            long j11 = s6Var.f6891i;
            com.google.android.gms.internal.cast.o1 m10 = com.google.android.gms.internal.cast.p1.m();
            m10.c();
            com.google.android.gms.internal.cast.p1.t((com.google.android.gms.internal.cast.p1) m10.f6748b, j11);
            String str = s6Var.f6894l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.y((com.google.android.gms.internal.cast.p1) m10.f6748b, str);
            }
            String str2 = s6Var.f6895m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.u((com.google.android.gms.internal.cast.p1) m10.f6748b, str2);
            }
            com.google.android.gms.internal.cast.h1 l4 = com.google.android.gms.internal.cast.i1.l();
            String str3 = com.google.android.gms.internal.cast.s6.f6884o;
            l4.c();
            com.google.android.gms.internal.cast.i1.n((com.google.android.gms.internal.cast.i1) l4.f6748b, str3);
            String str4 = s6Var.f6890g;
            l4.c();
            com.google.android.gms.internal.cast.i1.m((com.google.android.gms.internal.cast.i1) l4.f6748b, str4);
            m10.c();
            com.google.android.gms.internal.cast.p1.r((com.google.android.gms.internal.cast.p1) m10.f6748b, (com.google.android.gms.internal.cast.i1) l4.a());
            com.google.android.gms.internal.cast.b0 b0Var = s6Var.f6886a;
            com.google.android.gms.internal.cast.u1 l10 = com.google.android.gms.internal.cast.v1.l();
            Object zza = b0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.g2 l11 = com.google.android.gms.internal.cast.h2.l();
                l11.c();
                com.google.android.gms.internal.cast.h2.m((com.google.android.gms.internal.cast.h2) l11.f6748b, (String) zza);
                l10.c();
                com.google.android.gms.internal.cast.v1.m((com.google.android.gms.internal.cast.v1) l10.f6748b, (com.google.android.gms.internal.cast.h2) l11.a());
            }
            String str5 = s6Var.f6893k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    h6.b bVar = com.google.android.gms.internal.cast.s6.f6883n;
                    Log.w(bVar.f12621a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j10 = 0;
                }
                l10.c();
                com.google.android.gms.internal.cast.v1.n((com.google.android.gms.internal.cast.v1) l10.f6748b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.t6 t6Var : list3) {
                    t6Var.getClass();
                    com.google.android.gms.internal.cast.s1 l12 = com.google.android.gms.internal.cast.t1.l();
                    int i13 = t6Var.e;
                    l12.c();
                    com.google.android.gms.internal.cast.t1.p((com.google.android.gms.internal.cast.t1) l12.f6748b, i13);
                    l12.c();
                    com.google.android.gms.internal.cast.t1.m((com.google.android.gms.internal.cast.t1) l12.f6748b, (int) (t6Var.f6899b - t6Var.d));
                    Integer num = t6Var.f6898a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        com.google.android.gms.internal.cast.t1.n((com.google.android.gms.internal.cast.t1) l12.f6748b, intValue);
                    }
                    Boolean bool = t6Var.f6900c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        com.google.android.gms.internal.cast.t1.o((com.google.android.gms.internal.cast.t1) l12.f6748b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.t1) l12.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.v1.o((com.google.android.gms.internal.cast.v1) l10.f6748b, arrayList);
            }
            int i14 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    com.google.android.gms.internal.cast.y1 l13 = com.google.android.gms.internal.cast.z1.l();
                    l13.c();
                    com.google.android.gms.internal.cast.z1.m((com.google.android.gms.internal.cast.z1) l13.f6748b, (int) (aVar.f6689b - aVar.f6690c));
                    int i15 = aVar.f6688a;
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
                    com.google.android.gms.internal.cast.z1.n((com.google.android.gms.internal.cast.z1) l13.f6748b, i12);
                    arrayList2.add((com.google.android.gms.internal.cast.z1) l13.a());
                }
                i10 = 1;
                l10.c();
                com.google.android.gms.internal.cast.v1.q((com.google.android.gms.internal.cast.v1) l10.f6748b, arrayList2);
            } else {
                i10 = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.e3 e3Var : list) {
                    String str6 = e3Var.f6773a;
                    com.google.android.gms.internal.cast.q1 l14 = com.google.android.gms.internal.cast.r1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i11 = 13;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16);
                                int i17 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i11 = 22;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162);
                                int i172 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i11 = 15;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622);
                                int i1722 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i11 = 19;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222);
                                int i17222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i11 = 23;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222);
                                int i172222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i11 = 9;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622222);
                                int i1722222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i11 = 21;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222222);
                                int i17222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i11 = 10;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222222);
                                int i172222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i11 = 14;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622222222);
                                int i1722222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i11 = 7;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222222222);
                                int i17222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i11 = 20;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222222222);
                                int i172222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i11 = i14;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622222222222);
                                int i1722222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i11 = 8;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222222222222);
                                int i17222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i11 = 3;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222222222222);
                                int i172222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i11 = 6;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622222222222222);
                                int i1722222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i11 = 5;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222222222222222);
                                int i17222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i11 = 4;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222222222222222);
                                int i172222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i11 = 18;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622222222222222222);
                                int i1722222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i11 = 16;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222222222222222222);
                                int i17222222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i11 = 12;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i162222222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222222222222222222);
                                int i172222222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i182222222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i11 = 11;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i1622222222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i1622222222222222222222);
                                int i1722222222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i1722222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i1822222222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i1822222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i11 = 17;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                                int i16222222222222222222222 = (int) e3Var.f6774b;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i16222222222222222222222);
                                int i17222222222222222222222 = e3Var.f6775c;
                                l14.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i17222222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                                int i18222222222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                                l14.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i18222222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                                m10 = m10;
                                i14 = 2;
                            }
                            break;
                    }
                    i11 = i10;
                    l14.c();
                    com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l14.f6748b, i11);
                    int i162222222222222222222222 = (int) e3Var.f6774b;
                    l14.c();
                    com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l14.f6748b, i162222222222222222222222);
                    int i172222222222222222222222 = e3Var.f6775c;
                    l14.c();
                    com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l14.f6748b, i172222222222222222222222);
                    l14.c();
                    com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l14.f6748b, (int) (e3Var.d - e3Var.f6776f));
                    int i182222222222222222222222 = (int) (e3Var.e - e3Var.f6776f);
                    l14.c();
                    com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l14.f6748b, i182222222222222222222222);
                    arrayList3.add((com.google.android.gms.internal.cast.r1) l14.a());
                    m10 = m10;
                    i14 = 2;
                }
                o1Var = m10;
                l10.c();
                com.google.android.gms.internal.cast.v1.p((com.google.android.gms.internal.cast.v1) l10.f6748b, arrayList3);
            } else {
                o1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.w1 l15 = com.google.android.gms.internal.cast.x1.l();
                    int i19 = bVar2.e;
                    l15.c();
                    com.google.android.gms.internal.cast.x1.p((com.google.android.gms.internal.cast.x1) l15.f6748b, i19);
                    int i20 = bVar2.d.get();
                    l15.c();
                    com.google.android.gms.internal.cast.x1.m((com.google.android.gms.internal.cast.x1) l15.f6748b, i20);
                    int i21 = (int) (bVar2.f6736a - bVar2.f6738c);
                    l15.c();
                    com.google.android.gms.internal.cast.x1.n((com.google.android.gms.internal.cast.x1) l15.f6748b, i21);
                    l15.c();
                    com.google.android.gms.internal.cast.x1.o((com.google.android.gms.internal.cast.x1) l15.f6748b, (int) (bVar2.f6737b - bVar2.f6738c));
                    arrayList4.add((com.google.android.gms.internal.cast.x1) l15.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.v1.r((com.google.android.gms.internal.cast.v1) l10.f6748b, arrayList4);
            }
            o1Var.c();
            com.google.android.gms.internal.cast.p1.q((com.google.android.gms.internal.cast.p1) o1Var.f6748b, (com.google.android.gms.internal.cast.v1) l10.a());
            s6Var.f6889f.a((com.google.android.gms.internal.cast.p1) o1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f614a).contains(s9.r.a(cls))) {
            Object a2 = ((s9.b) this.e).a(cls);
            if (!cls.equals(oa.a.class)) {
                return a2;
            }
            oa.a aVar = (oa.a) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public ra.b b(s9.r rVar) {
        if (((Set) this.f615b).contains(rVar)) {
            return ((s9.b) this.e).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public int c(long j10) {
        long[] jArr = (long[]) this.f615b;
        int b10 = e2.n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public ra.b d(Class cls) {
        return b(s9.r.a(cls));
    }

    @Override
    public long e(int i10) {
        return ((long[]) this.f615b)[i10];
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public List g(long j10) {
        f4.a[] aVarArr;
        f4.c cVar = (f4.c) this.f614a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j10, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.h, treeMap);
        cVar.h(j10, (Map) this.f616c, hashMap, cVar.h, treeMap);
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
                f4.e eVar = (f4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, eVar.f10159c, 0, eVar.e, eVar.f10158b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f10160f, eVar.f10161g, false, -16777216, eVar.f10163j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f4.e eVar2 = (f4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            d2.a aVar = (d2.a) entry.getValue();
            CharSequence charSequence = aVar.f7836a;
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
            float f7 = eVar2.f10159c;
            int i19 = eVar2.d;
            aVar.e = f7;
            aVar.f7839f = i19;
            aVar.f7840g = eVar2.e;
            aVar.h = eVar2.f10158b;
            aVar.f7844l = eVar2.f10160f;
            float f10 = eVar2.f10162i;
            int i20 = eVar2.h;
            aVar.f7843k = f10;
            aVar.f7842j = i20;
            aVar.f7848p = eVar2.f10163j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public Object mo27get() {
        return new r5.a((Executor) ((id.a) this.f614a).mo27get(), (n5.d) ((id.a) this.f615b).mo27get(), (s4.d) ((k6.c) this.f616c).mo27get(), (t5.d) ((id.a) this.d).mo27get(), (u5.c) ((id.a) this.e).mo27get());
    }

    @Override
    public s9.p h(s9.r rVar) {
        if (((Set) this.f616c).contains(rVar)) {
            return ((s9.b) this.e).h(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public Set j(s9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((s9.b) this.e).j(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public int k() {
        return ((long[]) this.f615b).length;
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.la laVar;
        Path path = (Path) this.f615b;
        org.telegram.ui.Components.pa paVar = (org.telegram.ui.Components.pa) this.f616c;
        Paint paint2 = (Paint) this.d;
        fi.e6 e6Var = (fi.e6) this.e;
        if (!z10 && (laVar = e6Var.T1) != null && laVar.c()) {
            if (z10) {
                paVar = (org.telegram.ui.Components.pa) this.f614a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            paVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.pa) this.f614a) == null) {
                this.f614a = new org.telegram.ui.Components.pa(e6Var.T1, e6Var.O1.getReactionsWindow().f4049c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((org.telegram.ui.Components.pa) this.f614a).e(f12, f13, e6Var.getMeasuredWidth() + f12, e6Var.getMeasuredHeight() + f13);
            paint = ((org.telegram.ui.Components.pa) this.f614a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            paVar.e(f14, f15, e6Var.getMeasuredWidth() + f14, e6Var.getMeasuredHeight() + f15);
            paint = paVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    @Override
    public Object n(s9.r rVar) {
        if (((Set) this.f614a).contains(rVar)) {
            return ((s9.b) this.e).n(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        fi.e6 e6Var = (fi.e6) this.e;
        sg.c2 c2Var = e6Var.P1;
        if (c2Var == null) {
            return;
        }
        c2Var.s(x0Var, true);
        e6Var.L0(false);
    }

    public byte[] q() {
        byte[] bArr = (byte[]) this.f615b;
        byte[] bArr2 = (byte[]) this.f614a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = ii1.f40251b;
        BigInteger bigInteger3 = ii1.f40250a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = ii1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = ii1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = ii1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = ii1.b(new byte[][]{a10, bArr});
                this.d = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.e = arrayList;
                FileLog.d("wear-auth: built answer; session " + ii1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
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

    public aa.u0 r() {
        String str;
        if (((Long) this.f614a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f615b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = b10.u(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = b10.u(str, " importance");
        }
        if (str.isEmpty()) {
            long longValue = ((Long) this.f614a).longValue();
            return new aa.u0((String) this.f615b, ((Integer) this.e).intValue(), (String) this.f616c, longValue, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void s(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        int i11;
        RectF rectF = (RectF) this.f615b;
        float[] fArr = (float[]) this.f616c;
        Paint paint = (Paint) this.e;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.f614a;
        Path path = (Path) this.d;
        if (z11) {
            i11 = 0;
        } else {
            i11 = (int) s3Var.G;
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
        rectF.set(0.0f, 0.0f, i10, (s3Var.getY() + s3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public s9.p u(Class cls) {
        return h(s9.r.a(cls));
    }

    public String v() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean w(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new bi.u6(this, 11));
            }
        }
        return remove;
    }

    public Set x(Class cls) {
        return j(s9.r.a(cls));
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f614a;
        View view2 = (View) this.f615b;
        if (((Bitmap) this.f616c) != bitmap) {
            if (((org.telegram.ui.Components.dd) this.e) != null) {
                view.setBackground(null);
                this.e = null;
            }
            if (((org.telegram.ui.Components.dd) this.d) == null && ((org.telegram.ui.Components.dd) this.e) == null && (bitmap2 = (Bitmap) this.f616c) != null) {
                bitmap2.recycle();
                this.f616c = null;
            }
            A();
            this.f616c = bitmap;
            org.telegram.ui.Components.dd ddVar = new org.telegram.ui.Components.dd((Bitmap) this.f616c);
            this.e = ddVar;
            view.setBackground(ddVar);
            if (view2 != null) {
                org.telegram.ui.Components.dd ddVar2 = new org.telegram.ui.Components.dd((Bitmap) this.f616c);
                this.d = ddVar2;
                view2.setBackground(ddVar2);
            }
        }
    }

    public me(Context context) {
        this(context, new f6.b(-1, 0, 0));
    }

    public me(Context context, f6.b bVar) {
        this.f614a = context;
        this.f615b = bVar;
        C();
    }

    public me(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f614a = cVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.f616c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f615b = jArr;
    }

    public me(lh.c cVar) {
        this.e = cVar;
        ds dsVar = ds.h;
        this.f616c = new oe.b(0, this, dsVar, 320L, true);
        this.d = new oe.b(1, this, dsVar, 320L, true);
    }

    public me(org.telegram.ui.ActionBar.s3 s3Var) {
        this.f615b = new RectF();
        this.f616c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.f614a = s3Var;
    }

    @Override
    public void m() {
    }

    @Override
    public void z(float f7, int i10) {
    }
}
