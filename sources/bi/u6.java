package bi;

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
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.pj1;
public final class u6 implements ok0, z3.d, le.d, n5.b, q9.b {
    public Object f3719a;
    public Object f3720b;
    public Object f3721c;
    public Object d;
    public Object e;

    public u6(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public static void D(u6 u6Var, com.google.android.gms.internal.cast.y6 y6Var) {
        int i10 = y6Var.e;
        if (i10 == 2 && ((com.google.android.gms.internal.cast.x6) u6Var.d) != null) {
            u6Var.F();
        }
        if (i10 == 2) {
            u6Var.d = new com.google.android.gms.internal.cast.x6((com.google.android.gms.internal.cast.r0) u6Var.f3719a, (String) u6Var.f3721c);
        } else {
            u6Var.d = u6Var.E();
        }
        com.google.android.gms.internal.cast.x6 x6Var = (com.google.android.gms.internal.cast.x6) u6Var.d;
        n6.l.h(x6Var);
        y6Var.d = x6Var.h;
        x6Var.f5307b.add(y6Var);
    }

    public static u6 o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f3719a = sharedPreferences;
        obj.f3720b = "topic_operation_queue";
        obj.f3721c = ",";
        obj.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f3719a).getString((String) obj.f3720b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f3721c)) {
                    String[] split = string.split((String) obj.f3721c, -1);
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

    public void A(Uri uri) {
        int i10;
        Context context = (Context) this.f3719a;
        if (uri == null) {
            C();
        } else if (!uri.equals((Uri) this.f3721c)) {
            C();
            this.f3721c = uri;
            e6.b bVar = (e6.b) this.f3720b;
            int i11 = bVar.f7288b;
            if (i11 != 0 && (i10 = bVar.f7289c) != 0) {
                this.d = new f6.b(context, i11, i10, this);
            } else {
                this.d = new f6.b(context, 0, 0, this);
            }
            f6.b bVar2 = (f6.b) this.d;
            n6.l.h(bVar2);
            Uri uri2 = (Uri) this.f3721c;
            n6.l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void C() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f3721c = null;
    }

    public com.google.android.gms.internal.cast.x6 E() {
        if (((com.google.android.gms.internal.cast.x6) this.d) == null) {
            com.google.android.gms.internal.cast.x6 x6Var = new com.google.android.gms.internal.cast.x6((com.google.android.gms.internal.cast.r0) this.f3719a, (String) this.f3721c);
            this.d = x6Var;
            x6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.x6) this.d;
    }

    public void F() {
        com.google.android.gms.internal.cast.t1 t1Var;
        int i10;
        int i11;
        long j3;
        com.google.android.gms.internal.cast.x6 x6Var = (com.google.android.gms.internal.cast.x6) this.d;
        if (x6Var != null) {
            Map map = x6Var.e;
            List<com.google.android.gms.internal.cast.j3> list = x6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = x6Var.f5308c;
            List<com.google.android.gms.internal.cast.y6> list3 = x6Var.f5307b;
            d6.c cVar = x6Var.f5312j;
            if (cVar != null) {
                cVar.f6311l = null;
                x6Var.f5312j = null;
            }
            long j10 = x6Var.f5311i;
            com.google.android.gms.internal.cast.t1 m10 = com.google.android.gms.internal.cast.u1.m();
            m10.c();
            com.google.android.gms.internal.cast.u1.t((com.google.android.gms.internal.cast.u1) m10.f5169b, j10);
            String str = x6Var.f5314l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.u1.y((com.google.android.gms.internal.cast.u1) m10.f5169b, str);
            }
            String str2 = x6Var.f5315m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.u1.u((com.google.android.gms.internal.cast.u1) m10.f5169b, str2);
            }
            com.google.android.gms.internal.cast.m1 l4 = com.google.android.gms.internal.cast.n1.l();
            String str3 = com.google.android.gms.internal.cast.x6.f5304o;
            l4.c();
            com.google.android.gms.internal.cast.n1.n((com.google.android.gms.internal.cast.n1) l4.f5169b, str3);
            String str4 = x6Var.f5310g;
            l4.c();
            com.google.android.gms.internal.cast.n1.m((com.google.android.gms.internal.cast.n1) l4.f5169b, str4);
            m10.c();
            com.google.android.gms.internal.cast.u1.r((com.google.android.gms.internal.cast.u1) m10.f5169b, (com.google.android.gms.internal.cast.n1) l4.a());
            com.google.android.gms.internal.cast.f0 f0Var = x6Var.f5306a;
            com.google.android.gms.internal.cast.z1 l10 = com.google.android.gms.internal.cast.a2.l();
            Object zza = f0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.l2 l11 = com.google.android.gms.internal.cast.m2.l();
                l11.c();
                com.google.android.gms.internal.cast.m2.m((com.google.android.gms.internal.cast.m2) l11.f5169b, (String) zza);
                l10.c();
                com.google.android.gms.internal.cast.a2.m((com.google.android.gms.internal.cast.a2) l10.f5169b, (com.google.android.gms.internal.cast.m2) l11.a());
            }
            String str5 = x6Var.f5313k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    g6.b bVar = com.google.android.gms.internal.cast.x6.f5303n;
                    Log.w(bVar.f8558a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j3 = 0;
                }
                l10.c();
                com.google.android.gms.internal.cast.a2.n((com.google.android.gms.internal.cast.a2) l10.f5169b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.y6 y6Var : list3) {
                    y6Var.getClass();
                    com.google.android.gms.internal.cast.x1 l12 = com.google.android.gms.internal.cast.y1.l();
                    int i12 = y6Var.e;
                    l12.c();
                    com.google.android.gms.internal.cast.y1.p((com.google.android.gms.internal.cast.y1) l12.f5169b, i12);
                    l12.c();
                    com.google.android.gms.internal.cast.y1.m((com.google.android.gms.internal.cast.y1) l12.f5169b, (int) (y6Var.f5319b - y6Var.d));
                    Integer num = y6Var.f5318a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        com.google.android.gms.internal.cast.y1.n((com.google.android.gms.internal.cast.y1) l12.f5169b, intValue);
                    }
                    Boolean bool = y6Var.f5320c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        com.google.android.gms.internal.cast.y1.o((com.google.android.gms.internal.cast.y1) l12.f5169b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.y1) l12.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.a2.o((com.google.android.gms.internal.cast.a2) l10.f5169b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.d2 l13 = com.google.android.gms.internal.cast.e2.l();
                    l13.c();
                    com.google.android.gms.internal.cast.e2.m((com.google.android.gms.internal.cast.e2) l13.f5169b, (int) (bVar2.f5030b - bVar2.f5031c));
                    int i13 = bVar2.f5029a;
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
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
                    l13.c();
                    com.google.android.gms.internal.cast.e2.n((com.google.android.gms.internal.cast.e2) l13.f5169b, i11);
                    arrayList2.add((com.google.android.gms.internal.cast.e2) l13.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.a2.q((com.google.android.gms.internal.cast.a2) l10.f5169b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.j3 j3Var : list) {
                    String str6 = j3Var.f5191a;
                    com.google.android.gms.internal.cast.v1 l14 = com.google.android.gms.internal.cast.w1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14);
                                int i15 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142);
                                int i152 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422);
                                int i1522 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222);
                                int i15222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222);
                                int i152222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422222);
                                int i1522222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222222);
                                int i15222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222222);
                                int i152222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422222222);
                                int i1522222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222222222);
                                int i15222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222222222);
                                int i152222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = 2;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422222222222);
                                int i1522222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222222222222);
                                int i15222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222222222222);
                                int i152222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422222222222222);
                                int i1522222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222222222222222);
                                int i15222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222222222222222);
                                int i152222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422222222222222222);
                                int i1522222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222222222222222222);
                                int i15222222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i142222222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222222222222222222);
                                int i152222222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i162222222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i1422222222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i1422222222222222222222);
                                int i1522222222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i1522222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i1622222222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i1622222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                                int i14222222222222222222222 = (int) j3Var.f5192b;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i14222222222222222222222);
                                int i15222222222222222222222 = j3Var.f5193c;
                                l14.c();
                                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i15222222222222222222222);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                                int i16222222222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                                l14.c();
                                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i16222222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                                m10 = m10;
                            }
                            break;
                    }
                    i10 = 1;
                    l14.c();
                    com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l14.f5169b, i10);
                    int i142222222222222222222222 = (int) j3Var.f5192b;
                    l14.c();
                    com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l14.f5169b, i142222222222222222222222);
                    int i152222222222222222222222 = j3Var.f5193c;
                    l14.c();
                    com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l14.f5169b, i152222222222222222222222);
                    l14.c();
                    com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l14.f5169b, (int) (j3Var.d - j3Var.f5194f));
                    int i162222222222222222222222 = (int) (j3Var.e - j3Var.f5194f);
                    l14.c();
                    com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l14.f5169b, i162222222222222222222222);
                    arrayList3.add((com.google.android.gms.internal.cast.w1) l14.a());
                    m10 = m10;
                }
                t1Var = m10;
                l10.c();
                com.google.android.gms.internal.cast.a2.p((com.google.android.gms.internal.cast.a2) l10.f5169b, arrayList3);
            } else {
                t1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    com.google.android.gms.internal.cast.b2 l15 = com.google.android.gms.internal.cast.c2.l();
                    int i17 = cVar2.e;
                    l15.c();
                    com.google.android.gms.internal.cast.c2.p((com.google.android.gms.internal.cast.c2) l15.f5169b, i17);
                    int i18 = cVar2.d.get();
                    l15.c();
                    com.google.android.gms.internal.cast.c2.m((com.google.android.gms.internal.cast.c2) l15.f5169b, i18);
                    int i19 = (int) (cVar2.f5073a - cVar2.f5075c);
                    l15.c();
                    com.google.android.gms.internal.cast.c2.n((com.google.android.gms.internal.cast.c2) l15.f5169b, i19);
                    l15.c();
                    com.google.android.gms.internal.cast.c2.o((com.google.android.gms.internal.cast.c2) l15.f5169b, (int) (cVar2.f5074b - cVar2.f5075c));
                    arrayList4.add((com.google.android.gms.internal.cast.c2) l15.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.a2.r((com.google.android.gms.internal.cast.a2) l10.f5169b, arrayList4);
            }
            t1Var.c();
            com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) t1Var.f5169b, (com.google.android.gms.internal.cast.a2) l10.a());
            x6Var.f5309f.a((com.google.android.gms.internal.cast.u1) t1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        ((TextView) this.f3720b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((le.b) this.d).e));
        ((ih.c) this.e).b(this);
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f3719a).contains(q9.r.a(cls))) {
            Object a2 = ((q9.b) this.e).a(cls);
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
        if (((Set) this.f3721c).contains(rVar)) {
            return ((q9.b) this.e).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public pa.b c(Class cls) {
        return e(q9.r.a(cls));
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.f3720b;
        int a2 = e2.d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    @Override
    public pa.b e(q9.r rVar) {
        if (((Set) this.f3720b).contains(rVar)) {
            return ((q9.b) this.e).e(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public Set f(q9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((q9.b) this.e).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public long g(int i10) {
        return ((long[]) this.f3720b)[i10];
    }

    @Override
    public Object mo28get() {
        return new q5.a((Executor) ((fd.a) this.f3719a).mo28get(), (m5.d) ((fd.a) this.f3720b).mo28get(), (m.e3) ((m.e3) this.f3721c).mo28get(), (s5.d) ((fd.a) this.d).mo28get(), (t5.c) ((fd.a) this.e).mo28get());
    }

    @Override
    public Object h(q9.r rVar) {
        if (((Set) this.f3719a).contains(rVar)) {
            return ((q9.b) this.e).h(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    public byte[] i() {
        byte[] bArr = (byte[]) this.f3720b;
        byte[] bArr2 = (byte[]) this.f3719a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = pj1.f35853b;
        BigInteger bigInteger3 = pj1.f35852a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = pj1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = pj1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = pj1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = pj1.b(new byte[][]{a10, bArr});
                this.d = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.e = arrayList;
                FileLog.d("wear-auth: built answer; session " + pj1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
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

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        r7 r7Var = (r7) this.e;
        pg.a2 a2Var = r7Var.a2;
        if (a2Var == null) {
            return;
        }
        a2Var.s(p0Var, true);
        r7Var.O0(false);
    }

    public y9.s0 m() {
        String str;
        if (((Long) this.f3719a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f3720b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = org.telegram.ui.Cells.r6.t(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = org.telegram.ui.Cells.r6.t(str, " importance");
        }
        if (str.isEmpty()) {
            return new y9.s0(((Long) this.f3719a).longValue(), (String) this.f3720b, (String) this.f3721c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void n(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        int i11;
        RectF rectF = (RectF) this.f3720b;
        float[] fArr = (float[]) this.e;
        Paint paint = (Paint) this.d;
        org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.f3719a;
        Path path = (Path) this.f3721c;
        if (z11) {
            i11 = 0;
        } else {
            i11 = (int) q3Var.G;
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
        rectF.set(0.0f, 0.0f, i10, (q3Var.getY() + q3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public q9.p p(Class cls) {
        return b(q9.r.a(cls));
    }

    @Override
    public List q(long j3) {
        f4.a[] aVarArr;
        f4.c cVar = (f4.c) this.f3719a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, (Map) this.f3721c, hashMap, cVar.h, treeMap);
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
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, fVar.f7768c, 0, fVar.e, fVar.f7767b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f7769f, fVar.f7770g, false, -16777216, fVar.f7772j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f4.f fVar2 = (f4.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            d2.a aVar = (d2.a) entry.getValue();
            CharSequence charSequence = aVar.f6187a;
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
            float f7 = fVar2.f7768c;
            int i19 = fVar2.d;
            aVar.e = f7;
            aVar.f6190f = i19;
            aVar.f6191g = fVar2.e;
            aVar.h = fVar2.f7767b;
            aVar.f6195l = fVar2.f7769f;
            float f10 = fVar2.f7771i;
            int i20 = fVar2.h;
            aVar.f6194k = f10;
            aVar.f6193j = i20;
            aVar.f6199p = fVar2.f7772j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.ia iaVar;
        Path path = (Path) this.f3721c;
        org.telegram.ui.Components.ma maVar = (org.telegram.ui.Components.ma) this.f3720b;
        Paint paint2 = (Paint) this.d;
        r7 r7Var = (r7) this.e;
        if (!z10 && (iaVar = r7Var.f3508e2) != null && iaVar.c()) {
            if (z10) {
                maVar = (org.telegram.ui.Components.ma) this.f3719a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            maVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.ma) this.f3719a) == null) {
                this.f3719a = new org.telegram.ui.Components.ma(r7Var.f3508e2, r7Var.Z1.getReactionsWindow().f46952c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((org.telegram.ui.Components.ma) this.f3719a).e(f12, f13, r7Var.getMeasuredWidth() + f12, r7Var.getMeasuredHeight() + f13);
            paint = ((org.telegram.ui.Components.ma) this.f3719a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            maVar.e(f14, f15, r7Var.getMeasuredWidth() + f14, r7Var.getMeasuredHeight() + f15);
            paint = maVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    @Override
    public boolean t() {
        return true;
    }

    @Override
    public int u() {
        return ((long[]) this.f3720b).length;
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
                ((ScheduledThreadPoolExecutor) this.e).execute(new wc(this, 10));
            }
        }
        return remove;
    }

    public Set x(Class cls) {
        return f(q9.r.a(cls));
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f3719a;
        View view2 = (View) this.f3720b;
        if (((Bitmap) this.f3721c) != bitmap) {
            if (((org.telegram.ui.Components.dd) this.e) != null) {
                view.setBackground(null);
                this.e = null;
            }
            if (((org.telegram.ui.Components.dd) this.d) == null && ((org.telegram.ui.Components.dd) this.e) == null && (bitmap2 = (Bitmap) this.f3721c) != null) {
                bitmap2.recycle();
                this.f3721c = null;
            }
            z();
            this.f3721c = bitmap;
            org.telegram.ui.Components.dd ddVar = new org.telegram.ui.Components.dd((Bitmap) this.f3721c);
            this.e = ddVar;
            view.setBackground(ddVar);
            if (view2 != null) {
                org.telegram.ui.Components.dd ddVar2 = new org.telegram.ui.Components.dd((Bitmap) this.f3721c);
                this.d = ddVar2;
                view2.setBackground(ddVar2);
            }
        }
    }

    public void z() {
        Bitmap bitmap;
        if (((org.telegram.ui.Components.dd) this.d) != null) {
            this.d = null;
            View view = (View) this.f3720b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((org.telegram.ui.Components.dd) this.d) == null && ((org.telegram.ui.Components.dd) this.e) == null && (bitmap = (Bitmap) this.f3721c) != null) {
            bitmap.recycle();
            this.f3721c = null;
        }
    }

    public u6(Context context, e6.b bVar) {
        this.f3719a = context;
        this.f3720b = bVar;
        C();
    }

    public u6(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f3719a = cVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.f3721c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f3720b = jArr;
    }

    public u6(ih.c cVar) {
        this.e = cVar;
        wr wrVar = wr.h;
        this.f3721c = new le.b(0, this, wrVar, 320L, true);
        this.d = new le.b(1, this, wrVar, 320L, true);
    }

    public u6(org.telegram.ui.ActionBar.q3 q3Var) {
        this.f3720b = new RectF();
        this.e = new float[8];
        this.f3721c = new Path();
        this.d = new Paint(1);
        this.f3719a = q3Var;
    }

    @Override
    public void s() {
    }

    @Override
    public void B(float f7, int i10) {
    }
}
