package b3;

import a5.m;
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
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.k2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.w6;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.z1;
import d5.f0;
import g9.s0;
import hg.r0;
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
import kh.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.di1;
import r4.f;
import x2.d;
import x5.l;
import y4.e;
import y8.p;
import y8.r;
public final class b implements y2.b, tj0, td.b, f, y8.b {
    public Object f1413a;
    public Object f1414b;
    public Object f1415c;
    public Object d;
    public Object f1416e;

    public b(Context context) {
        this(context, new o5.b(-1, 0, 0));
    }

    public static void D(b bVar, w6 w6Var) {
        int i9 = w6Var.f3265e;
        if (i9 == 2 && ((v6) bVar.d) != null) {
            bVar.F();
        }
        if (i9 == 2) {
            bVar.d = new v6((p0) bVar.f1413a, (String) bVar.f1415c);
        } else {
            bVar.d = bVar.E();
        }
        v6 v6Var = (v6) bVar.d;
        l.h(v6Var);
        w6Var.d = v6Var.h;
        v6Var.f3249b.add(w6Var);
    }

    public static b o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f1413a = sharedPreferences;
        obj.f1414b = "topic_operation_queue";
        obj.f1415c = ",";
        obj.f1416e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f1413a).getString((String) obj.f1414b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f1415c)) {
                    String[] split = string.split((String) obj.f1415c, -1);
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
        int i9;
        Context context = (Context) this.f1413a;
        if (uri == null) {
            C();
        } else if (!uri.equals((Uri) this.f1415c)) {
            C();
            this.f1415c = uri;
            o5.b bVar = (o5.b) this.f1414b;
            int i10 = bVar.f18956b;
            if (i10 != 0 && (i9 = bVar.f18957c) != 0) {
                this.d = new p5.b(context, i10, i9, this);
            } else {
                this.d = new p5.b(context, 0, 0, this);
            }
            p5.b bVar2 = (p5.b) this.d;
            l.h(bVar2);
            Uri uri2 = (Uri) this.f1415c;
            l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void C() {
        p5.b bVar = (p5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f1415c = null;
    }

    public v6 E() {
        if (((v6) this.d) == null) {
            v6 v6Var = new v6((p0) this.f1413a, (String) this.f1415c);
            this.d = v6Var;
            v6Var.b(1);
        }
        return (v6) this.d;
    }

    public void F() {
        r1 r1Var;
        int i9;
        int i10;
        long j10;
        v6 v6Var = (v6) this.d;
        if (v6Var != null) {
            Map map = v6Var.f3251e;
            List<h3> list = v6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = v6Var.f3250c;
            List<w6> list3 = v6Var.f3249b;
            n5.c cVar = v6Var.f3255j;
            if (cVar != null) {
                cVar.f18483l = null;
                v6Var.f3255j = null;
            }
            long j11 = v6Var.f3254i;
            r1 m10 = s1.m();
            m10.c();
            s1.t((s1) m10.f3095b, j11);
            String str = v6Var.f3257l;
            if (str != null) {
                m10.c();
                s1.y((s1) m10.f3095b, str);
            }
            String str2 = v6Var.f3258m;
            if (str2 != null) {
                m10.c();
                s1.u((s1) m10.f3095b, str2);
            }
            k1 l10 = l1.l();
            String str3 = v6.f3246o;
            l10.c();
            l1.n((l1) l10.f3095b, str3);
            String str4 = v6Var.f3253g;
            l10.c();
            l1.m((l1) l10.f3095b, str4);
            m10.c();
            s1.r((s1) m10.f3095b, (l1) l10.a());
            d0 d0Var = v6Var.f3248a;
            x1 l11 = y1.l();
            Object zza = d0Var.zza();
            if (zza != null) {
                j2 l12 = k2.l();
                l12.c();
                k2.m((k2) l12.f3095b, (String) zza);
                l11.c();
                y1.m((y1) l11.f3095b, (k2) l12.a());
            }
            String str5 = v6Var.f3256k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    q5.b bVar = v6.f3245n;
                    Log.w(bVar.f46009a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j10 = 0;
                }
                l11.c();
                y1.n((y1) l11.f3095b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (w6 w6Var : list3) {
                    w6Var.getClass();
                    v1 l13 = w1.l();
                    int i11 = w6Var.f3265e;
                    l13.c();
                    w1.p((w1) l13.f3095b, i11);
                    l13.c();
                    w1.m((w1) l13.f3095b, (int) (w6Var.f3263b - w6Var.d));
                    Integer num = w6Var.f3262a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        w1.n((w1) l13.f3095b, intValue);
                    }
                    Boolean bool = w6Var.f3264c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        w1.o((w1) l13.f3095b, booleanValue);
                    }
                    arrayList.add((w1) l13.a());
                }
                l11.c();
                y1.o((y1) l11.f3095b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    b2 l14 = c2.l();
                    l14.c();
                    c2.m((c2) l14.f3095b, (int) (bVar2.f3009b - bVar2.f3010c));
                    int i12 = bVar2.f3008a;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                i10 = 1;
                            } else {
                                i10 = 4;
                            }
                        } else {
                            i10 = 3;
                        }
                    } else {
                        i10 = 2;
                    }
                    l14.c();
                    c2.n((c2) l14.f3095b, i10);
                    arrayList2.add((c2) l14.a());
                }
                l11.c();
                y1.q((y1) l11.f3095b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (h3 h3Var : list) {
                    String str6 = h3Var.f3121a;
                    t1 l15 = u1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i9 = 13;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13);
                                int i14 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i9 = 22;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132);
                                int i142 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i9 = 15;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322);
                                int i1422 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i9 = 19;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222);
                                int i14222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i9 = 23;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132222);
                                int i142222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i9 = 9;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322222);
                                int i1422222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i9 = 21;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222222);
                                int i14222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i9 = 10;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132222222);
                                int i142222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i9 = 14;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322222222);
                                int i1422222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i9 = 7;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222222222);
                                int i14222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i9 = 20;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132222222222);
                                int i142222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i9 = 2;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322222222222);
                                int i1422222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i9 = 8;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222222222222);
                                int i14222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i9 = 3;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132222222222222);
                                int i142222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i9 = 6;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322222222222222);
                                int i1422222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i9 = 5;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222222222222222);
                                int i14222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i9 = 4;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132222222222222222);
                                int i142222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i9 = 18;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322222222222222222);
                                int i1422222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i9 = 16;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222222222222222222);
                                int i14222222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i9 = 12;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i132222222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i132222222222222222222);
                                int i142222222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i142222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i152222222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i152222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i9 = 11;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i1322222222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i1322222222222222222222);
                                int i1422222222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i1422222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i1522222222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i1522222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i9 = 17;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3095b, i9);
                                int i13222222222222222222222 = (int) h3Var.f3122b;
                                l15.c();
                                u1.m((u1) l15.f3095b, i13222222222222222222222);
                                int i14222222222222222222222 = h3Var.f3123c;
                                l15.c();
                                u1.n((u1) l15.f3095b, i14222222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                                int i15222222222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                                l15.c();
                                u1.p((u1) l15.f3095b, i15222222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m10 = m10;
                            }
                            break;
                    }
                    i9 = 1;
                    l15.c();
                    u1.q((u1) l15.f3095b, i9);
                    int i132222222222222222222222 = (int) h3Var.f3122b;
                    l15.c();
                    u1.m((u1) l15.f3095b, i132222222222222222222222);
                    int i142222222222222222222222 = h3Var.f3123c;
                    l15.c();
                    u1.n((u1) l15.f3095b, i142222222222222222222222);
                    l15.c();
                    u1.o((u1) l15.f3095b, (int) (h3Var.d - h3Var.f3125f));
                    int i152222222222222222222222 = (int) (h3Var.f3124e - h3Var.f3125f);
                    l15.c();
                    u1.p((u1) l15.f3095b, i152222222222222222222222);
                    arrayList3.add((u1) l15.a());
                    m10 = m10;
                }
                r1Var = m10;
                l11.c();
                y1.p((y1) l11.f3095b, arrayList3);
            } else {
                r1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    z1 l16 = a2.l();
                    int i16 = cVar2.f3027e;
                    l16.c();
                    a2.p((a2) l16.f3095b, i16);
                    int i17 = cVar2.d.get();
                    l16.c();
                    a2.m((a2) l16.f3095b, i17);
                    int i18 = (int) (cVar2.f3024a - cVar2.f3026c);
                    l16.c();
                    a2.n((a2) l16.f3095b, i18);
                    l16.c();
                    a2.o((a2) l16.f3095b, (int) (cVar2.f3025b - cVar2.f3026c));
                    arrayList4.add((a2) l16.a());
                }
                l11.c();
                y1.r((y1) l11.f3095b, arrayList4);
            }
            r1Var.c();
            s1.q((s1) r1Var.f3095b, (y1) l11.a());
            v6Var.f3252f.a((s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        ((TextView) this.f1414b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((td.a) this.d).f47775e));
        ((rg.c) this.f1416e).b(this);
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f1413a).contains(r.a(cls))) {
            Object a2 = ((y8.b) this.f1416e).a(cls);
            if (!cls.equals(u9.a.class)) {
                return a2;
            }
            u9.a aVar = (u9.a) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public int b(long j10) {
        long[] jArr = (long[]) this.f1414b;
        int b10 = f0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public Object c(r rVar) {
        if (((Set) this.f1413a).contains(rVar)) {
            return ((y8.b) this.f1416e).c(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override
    public void d(View view, r0 r0Var, boolean z10, boolean z11) {
        g6 g6Var = (g6) this.f1416e;
        yf.a2 a2Var = g6Var.W1;
        if (a2Var == null) {
            return;
        }
        a2Var.s(r0Var, true);
        g6Var.O0(false);
    }

    @Override
    public x9.b e(Class cls) {
        return g(r.a(cls));
    }

    @Override
    public p f(r rVar) {
        if (((Set) this.f1415c).contains(rVar)) {
            return ((y8.b) this.f1416e).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public x9.b g(r rVar) {
        if (((Set) this.f1414b).contains(rVar)) {
            return ((y8.b) this.f1416e).g(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public Object mo28get() {
        return new a((Executor) ((nc.a) this.f1413a).mo28get(), (d) ((nc.a) this.f1414b).mo28get(), (m) ((m) this.f1416e).mo28get(), (d3.d) ((nc.a) this.f1415c).mo28get(), (e3.c) ((nc.a) this.d).mo28get());
    }

    @Override
    public long h(int i9) {
        return ((long[]) this.f1414b)[i9];
    }

    @Override
    public Set i(r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((y8.b) this.f1416e).i(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    public byte[] j() {
        byte[] bArr = (byte[]) this.f1414b;
        byte[] bArr2 = (byte[]) this.f1413a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = di1.f37552b;
        BigInteger bigInteger3 = di1.f37551a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = di1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a3 = di1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = di1.b(new byte[][]{a3, bArr2, bArr3});
                byte[] b11 = di1.b(new byte[][]{a3, bArr});
                this.d = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i9 = 0; i9 < 4; i9++) {
                    int i10 = i9 * 8;
                    arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % 200)]);
                }
                this.f1416e = arrayList;
                FileLog.d("wear-auth: built answer; session " + di1.d(bArr2) + " emojis=" + ((ArrayList) this.f1416e));
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

    public s0 k() {
        String str;
        if (((Long) this.f1413a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f1414b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = ta.b.j(str, " offset");
        }
        if (((Integer) this.f1416e) == null) {
            str = ta.b.j(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.f1413a).longValue(), (String) this.f1414b, (String) this.f1415c, ((Long) this.d).longValue(), ((Integer) this.f1416e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void l(Canvas canvas, boolean z10, boolean z11, int i9, float f10) {
        int i10;
        RectF rectF = (RectF) this.f1414b;
        float[] fArr = (float[]) this.f1415c;
        Paint paint = (Paint) this.f1416e;
        m3 m3Var = (m3) this.f1413a;
        Path path = (Path) this.d;
        if (z11) {
            i10 = 0;
        } else {
            i10 = (int) m3Var.C;
        }
        int i11 = (int) (i10 * f10);
        int dp = AndroidUtilities.dp(10.0f) * Math.min(1, i11 / AndroidUtilities.dp(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f11 = dp;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.rewind();
        rectF.set(0.0f, 0.0f, i9, (m3Var.getY() + m3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public List m(long j10) {
        y4.a[] aVarArr;
        y4.d dVar = (y4.d) this.f1413a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.f1416e;
        ArrayList arrayList = new ArrayList();
        dVar.g(j10, dVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j10, false, dVar.h, treeMap);
        dVar.h(j10, (Map) this.f1415c, hashMap, dVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new r4.b(null, null, null, decodeByteArray, eVar.f49587c, 0, eVar.f49588e, eVar.f49586b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f49589f, eVar.f49590g, false, -16777216, eVar.f49592j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) hashMap.get(entry.getKey());
            eVar2.getClass();
            r4.a aVar = (r4.a) entry.getValue();
            CharSequence charSequence = aVar.f47030a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (y4.a aVar2 : (y4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y4.a.class)) {
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
            float f10 = eVar2.f49587c;
            int i18 = eVar2.d;
            aVar.f47033e = f10;
            aVar.f47034f = i18;
            aVar.f47035g = eVar2.f49588e;
            aVar.h = eVar2.f49586b;
            aVar.f47039l = eVar2.f49589f;
            float f11 = eVar2.f49591i;
            int i19 = eVar2.h;
            aVar.f47038k = f11;
            aVar.f47037j = i19;
            aVar.f47043p = eVar2.f49592j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public boolean p() {
        return false;
    }

    public p q(Class cls) {
        return f(r.a(cls));
    }

    @Override
    public int r() {
        return ((long[]) this.f1414b).length;
    }

    @Override
    public void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
        Paint paint;
        ba baVar;
        Path path = (Path) this.f1414b;
        fa faVar = (fa) this.f1415c;
        Paint paint2 = (Paint) this.d;
        g6 g6Var = (g6) this.f1416e;
        if (!z10 && (baVar = g6Var.a2) != null && baVar.c()) {
            if (z10) {
                faVar = (fa) this.f1413a;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            faVar.b(canvas, true);
            paint2.setAlpha((int) (i9 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((fa) this.f1413a) == null) {
                this.f1413a = new fa(g6Var.a2, g6Var.V1.getReactionsWindow().f10576c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((fa) this.f1413a).e(f13, f14, g6Var.getMeasuredWidth() + f13, g6Var.getMeasuredHeight() + f14);
            paint = ((fa) this.f1413a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            faVar.e(f15, f16, g6Var.getMeasuredWidth() + f15, g6Var.getMeasuredHeight() + f16);
            paint = faVar.h;
        }
        paint.setAlpha(i9);
        paint2.setAlpha((int) (i9 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    @Override
    public boolean u() {
        return true;
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
                ((ScheduledThreadPoolExecutor) this.f1416e).execute(new af.e(this, 21));
            }
        }
        return remove;
    }

    public Set x(Class cls) {
        return i(r.a(cls));
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f1413a;
        View view2 = (View) this.f1414b;
        if (((Bitmap) this.f1415c) != bitmap) {
            if (((vc) this.f1416e) != null) {
                view.setBackground(null);
                this.f1416e = null;
            }
            if (((vc) this.d) == null && ((vc) this.f1416e) == null && (bitmap2 = (Bitmap) this.f1415c) != null) {
                bitmap2.recycle();
                this.f1415c = null;
            }
            z();
            this.f1415c = bitmap;
            vc vcVar = new vc((Bitmap) this.f1415c);
            this.f1416e = vcVar;
            view.setBackground(vcVar);
            if (view2 != null) {
                vc vcVar2 = new vc((Bitmap) this.f1415c);
                this.d = vcVar2;
                view2.setBackground(vcVar2);
            }
        }
    }

    public void z() {
        Bitmap bitmap;
        if (((vc) this.d) != null) {
            this.d = null;
            View view = (View) this.f1414b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((vc) this.d) == null && ((vc) this.f1416e) == null && (bitmap = (Bitmap) this.f1415c) != null) {
            bitmap.recycle();
            this.f1415c = null;
        }
    }

    public b(Context context, o5.b bVar) {
        this.f1413a = context;
        this.f1414b = bVar;
        C();
    }

    public b(y4.d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f1413a = dVar;
        this.d = hashMap2;
        this.f1416e = hashMap3;
        this.f1415c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        this.f1414b = jArr;
    }

    public b(rg.c cVar) {
        this.f1416e = cVar;
        gr grVar = gr.h;
        this.f1415c = new td.a(0, this, grVar, 320L, true);
        this.d = new td.a(1, this, grVar, 320L, true);
    }

    public b(m3 m3Var) {
        this.f1414b = new RectF();
        this.f1415c = new float[8];
        this.d = new Path();
        this.f1416e = new Paint(1);
        this.f1413a = m3Var;
    }

    @Override
    public void t() {
    }

    @Override
    public void B(float f10, int i9) {
    }
}
