package c5;

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
import b6.m;
import c9.s;
import c9.u;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.k2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.z1;
import dg.a3;
import h5.d0;
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
import k9.s0;
import mg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.zi1;
import ph.c5;
import vh.w2;
public final class j implements v4.f, c9.c, a3.b, ok0, xd.b {
    public Object f2152a;
    public Object f2153b;
    public Object f2154c;
    public Object d;
    public Object e;

    public j(Context context) {
        this(context, new s5.b(-1, 0, 0));
    }

    public static void D(j jVar, v6 v6Var) {
        int i10 = v6Var.e;
        if (i10 == 2 && ((u6) jVar.d) != null) {
            jVar.F();
        }
        if (i10 == 2) {
            jVar.d = new u6((o0) jVar.f2152a, (String) jVar.f2154c);
        } else {
            jVar.d = jVar.E();
        }
        u6 u6Var = (u6) jVar.d;
        m.h(u6Var);
        v6Var.d = u6Var.h;
        u6Var.f3156b.add(v6Var);
    }

    public static j t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f2152a = sharedPreferences;
        obj.f2153b = "topic_operation_queue";
        obj.f2154c = ",";
        obj.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f2152a).getString((String) obj.f2153b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f2154c)) {
                    String[] split = string.split((String) obj.f2154c, -1);
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
        if (((df.f) this.d) != null) {
            this.d = null;
            View view = (View) this.f2153b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((df.f) this.d) == null && ((df.f) this.e) == null && (bitmap = (Bitmap) this.f2154c) != null) {
            bitmap.recycle();
            this.f2154c = null;
        }
    }

    public void B(Uri uri) {
        int i10;
        Context context = (Context) this.f2152a;
        if (uri == null) {
            C();
        } else if (!uri.equals((Uri) this.f2154c)) {
            C();
            this.f2154c = uri;
            s5.b bVar = (s5.b) this.f2153b;
            int i11 = bVar.f44111b;
            if (i11 != 0 && (i10 = bVar.f44112c) != 0) {
                this.d = new t5.b(context, i11, i10, this);
            } else {
                this.d = new t5.b(context, 0, 0, this);
            }
            t5.b bVar2 = (t5.b) this.d;
            m.h(bVar2);
            Uri uri2 = (Uri) this.f2154c;
            m.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void C() {
        t5.b bVar = (t5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f2154c = null;
    }

    public u6 E() {
        if (((u6) this.d) == null) {
            u6 u6Var = new u6((o0) this.f2152a, (String) this.f2154c);
            this.d = u6Var;
            u6Var.b(1);
        }
        return (u6) this.d;
    }

    public void F() {
        r1 r1Var;
        int i10;
        int i11;
        long j10;
        u6 u6Var = (u6) this.d;
        if (u6Var != null) {
            Map map = u6Var.e;
            List<h3> list = u6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = u6Var.f3157c;
            List<v6> list3 = u6Var.f3156b;
            r5.c cVar = u6Var.f3161j;
            if (cVar != null) {
                cVar.f43385l = null;
                u6Var.f3161j = null;
            }
            long j11 = u6Var.f3160i;
            r1 m9 = s1.m();
            m9.c();
            s1.t((s1) m9.f3015b, j11);
            String str = u6Var.f3163l;
            if (str != null) {
                m9.c();
                s1.y((s1) m9.f3015b, str);
            }
            String str2 = u6Var.f3164m;
            if (str2 != null) {
                m9.c();
                s1.u((s1) m9.f3015b, str2);
            }
            k1 l10 = l1.l();
            String str3 = u6.f3153o;
            l10.c();
            l1.n((l1) l10.f3015b, str3);
            String str4 = u6Var.f3159g;
            l10.c();
            l1.m((l1) l10.f3015b, str4);
            m9.c();
            s1.r((s1) m9.f3015b, (l1) l10.a());
            c0 c0Var = u6Var.f3155a;
            x1 l11 = y1.l();
            Object zza = c0Var.zza();
            if (zza != null) {
                j2 l12 = k2.l();
                l12.c();
                k2.m((k2) l12.f3015b, (String) zza);
                l11.c();
                y1.m((y1) l11.f3015b, (k2) l12.a());
            }
            String str5 = u6Var.f3162k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    u5.b bVar = u6.f3152n;
                    Log.w(bVar.f45160a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j10 = 0;
                }
                l11.c();
                y1.n((y1) l11.f3015b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (v6 v6Var : list3) {
                    v6Var.getClass();
                    v1 l13 = w1.l();
                    int i12 = v6Var.e;
                    l13.c();
                    w1.p((w1) l13.f3015b, i12);
                    l13.c();
                    w1.m((w1) l13.f3015b, (int) (v6Var.f3170b - v6Var.d));
                    Integer num = v6Var.f3169a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        w1.n((w1) l13.f3015b, intValue);
                    }
                    Boolean bool = v6Var.f3171c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        w1.o((w1) l13.f3015b, booleanValue);
                    }
                    arrayList.add((w1) l13.a());
                }
                l11.c();
                y1.o((y1) l11.f3015b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    b2 l14 = c2.l();
                    l14.c();
                    c2.m((c2) l14.f3015b, (int) (aVar.f2931b - aVar.f2932c));
                    int i13 = aVar.f2930a;
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
                    l14.c();
                    c2.n((c2) l14.f3015b, i11);
                    arrayList2.add((c2) l14.a());
                }
                l11.c();
                y1.q((y1) l11.f3015b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (h3 h3Var : list) {
                    String str6 = h3Var.f3046a;
                    t1 l15 = u1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14);
                                int i15 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142);
                                int i152 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422);
                                int i1522 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222);
                                int i15222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142222);
                                int i152222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422222);
                                int i1522222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222222);
                                int i15222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142222222);
                                int i152222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422222222);
                                int i1522222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222222222);
                                int i15222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142222222222);
                                int i152222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = 2;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422222222222);
                                int i1522222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222222222222);
                                int i15222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142222222222222);
                                int i152222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422222222222222);
                                int i1522222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222222222222222);
                                int i15222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142222222222222222);
                                int i152222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422222222222222222);
                                int i1522222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222222222222222222);
                                int i15222222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i142222222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i142222222222222222222);
                                int i152222222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i152222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i162222222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i162222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i1422222222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i1422222222222222222222);
                                int i1522222222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i1522222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i1622222222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i1622222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l15.c();
                                u1.q((u1) l15.f3015b, i10);
                                int i14222222222222222222222 = (int) h3Var.f3047b;
                                l15.c();
                                u1.m((u1) l15.f3015b, i14222222222222222222222);
                                int i15222222222222222222222 = h3Var.f3048c;
                                l15.c();
                                u1.n((u1) l15.f3015b, i15222222222222222222222);
                                l15.c();
                                u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                                int i16222222222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                                l15.c();
                                u1.p((u1) l15.f3015b, i16222222222222222222222);
                                arrayList3.add((u1) l15.a());
                                m9 = m9;
                            }
                            break;
                    }
                    i10 = 1;
                    l15.c();
                    u1.q((u1) l15.f3015b, i10);
                    int i142222222222222222222222 = (int) h3Var.f3047b;
                    l15.c();
                    u1.m((u1) l15.f3015b, i142222222222222222222222);
                    int i152222222222222222222222 = h3Var.f3048c;
                    l15.c();
                    u1.n((u1) l15.f3015b, i152222222222222222222222);
                    l15.c();
                    u1.o((u1) l15.f3015b, (int) (h3Var.d - h3Var.f3049f));
                    int i162222222222222222222222 = (int) (h3Var.e - h3Var.f3049f);
                    l15.c();
                    u1.p((u1) l15.f3015b, i162222222222222222222222);
                    arrayList3.add((u1) l15.a());
                    m9 = m9;
                }
                r1Var = m9;
                l11.c();
                y1.p((y1) l11.f3015b, arrayList3);
            } else {
                r1Var = m9;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    z1 l16 = a2.l();
                    int i17 = bVar2.e;
                    l16.c();
                    a2.p((a2) l16.f3015b, i17);
                    int i18 = bVar2.d.get();
                    l16.c();
                    a2.m((a2) l16.f3015b, i18);
                    int i19 = (int) (bVar2.f2946a - bVar2.f2948c);
                    l16.c();
                    a2.n((a2) l16.f3015b, i19);
                    l16.c();
                    a2.o((a2) l16.f3015b, (int) (bVar2.f2947b - bVar2.f2948c));
                    arrayList4.add((a2) l16.a());
                }
                l11.c();
                y1.r((y1) l11.f3015b, arrayList4);
            }
            r1Var.c();
            s1.q((s1) r1Var.f3015b, (y1) l11.a());
            u6Var.f3158f.a((s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((TextView) this.f2153b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((xd.a) this.d).e));
        ((wg.c) this.e).b(this);
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f2152a).contains(u.a(cls))) {
            Object a2 = ((c9.c) this.e).a(cls);
            if (!cls.equals(y9.a.class)) {
                return a2;
            }
            y9.a aVar = (y9.a) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public ba.b b(u uVar) {
        if (((Set) this.f2153b).contains(uVar)) {
            return ((c9.c) this.e).b(uVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + uVar + ">.");
    }

    @Override
    public ba.b c(Class cls) {
        return b(u.a(cls));
    }

    @Override
    public s d(u uVar) {
        if (((Set) this.f2154c).contains(uVar)) {
            return ((c9.c) this.e).d(uVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + uVar + ">.");
    }

    @Override
    public int e(long j10) {
        long[] jArr = (long[]) this.f2153b;
        int b10 = d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public Object f(u uVar) {
        if (((Set) this.f2152a).contains(uVar)) {
            return ((c9.c) this.e).f(uVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + uVar + ".");
    }

    @Override
    public Set g(u uVar) {
        if (((Set) this.d).contains(uVar)) {
            return ((c9.c) this.e).g(uVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + uVar + ">.");
    }

    @Override
    public Object mo28get() {
        return new d3.a((Executor) ((rc.a) this.f2152a).mo28get(), (z2.d) ((rc.a) this.f2153b).mo28get(), (af.d) ((af.d) this.f2154c).mo28get(), (f3.d) ((rc.a) this.d).mo28get(), (g3.c) ((rc.a) this.e).mo28get());
    }

    @Override
    public long h(int i10) {
        return ((long[]) this.f2153b)[i10];
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void j(View view, q0 q0Var, boolean z4, boolean z10) {
        c5 c5Var = (c5) this.e;
        a3 a3Var = c5Var.X1;
        if (a3Var == null) {
            return;
        }
        a3Var.s(q0Var, true);
        c5Var.O0(false);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint;
        ba baVar;
        Path path = (Path) this.f2153b;
        fa faVar = (fa) this.f2154c;
        Paint paint2 = (Paint) this.d;
        c5 c5Var = (c5) this.e;
        if (!z4 && (baVar = c5Var.f41368b2) != null && baVar.c()) {
            if (z4) {
                faVar = (fa) this.f2152a;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            faVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z4) {
            if (((fa) this.f2152a) == null) {
                this.f2152a = new fa(c5Var.f41368b2, c5Var.W1.getReactionsWindow().f13962c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((fa) this.f2152a).e(f13, f14, c5Var.getMeasuredWidth() + f13, c5Var.getMeasuredHeight() + f14);
            paint = ((fa) this.f2152a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            faVar.e(f15, f16, c5Var.getMeasuredWidth() + f15, c5Var.getMeasuredHeight() + f16);
            paint = faVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public byte[] n() {
        byte[] bArr = (byte[]) this.f2153b;
        byte[] bArr2 = (byte[]) this.f2152a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = zi1.f40490b;
        BigInteger bigInteger3 = zi1.f40489a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = zi1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = zi1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = zi1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = zi1.b(new byte[][]{a10, bArr});
                this.d = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.e = arrayList;
                FileLog.d("wear-auth: built answer; session " + zi1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
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
    public boolean o() {
        return true;
    }

    public s0 p() {
        String str;
        if (((Long) this.f2152a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f2153b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = w2.k(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = w2.k(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.f2152a).longValue(), (String) this.f2153b, (String) this.f2154c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public List q(long j10) {
        a[] aVarArr;
        g gVar = (g) this.f2152a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        gVar.g(j10, gVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        gVar.i(j10, false, gVar.h, treeMap);
        gVar.h(j10, (Map) this.f2154c, hashMap, gVar.h, treeMap);
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
                h hVar = (h) hashMap.get(pair.first);
                hVar.getClass();
                arrayList2.add(new v4.b(null, null, null, decodeByteArray, hVar.f2131c, 0, hVar.e, hVar.f2130b, 0, Integer.MIN_VALUE, -3.4028235E38f, hVar.f2132f, hVar.f2133g, false, -16777216, hVar.f2135j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            h hVar2 = (h) hashMap.get(entry.getKey());
            hVar2.getClass();
            v4.a aVar = (v4.a) entry.getValue();
            CharSequence charSequence = aVar.f45648a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
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
            float f10 = hVar2.f2131c;
            int i19 = hVar2.d;
            aVar.e = f10;
            aVar.f45651f = i19;
            aVar.f45652g = hVar2.e;
            aVar.h = hVar2.f2130b;
            aVar.f45656l = hVar2.f2132f;
            float f11 = hVar2.f2134i;
            int i20 = hVar2.h;
            aVar.f45655k = f11;
            aVar.f45654j = i20;
            aVar.f45660p = hVar2.f2135j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public int r() {
        return ((long[]) this.f2153b).length;
    }

    public void s(Canvas canvas, boolean z4, boolean z10, int i10, float f10) {
        int i11;
        RectF rectF = (RectF) this.f2153b;
        float[] fArr = (float[]) this.f2154c;
        Paint paint = (Paint) this.e;
        n3 n3Var = (n3) this.f2152a;
        Path path = (Path) this.d;
        if (z10) {
            i11 = 0;
        } else {
            i11 = (int) n3Var.D;
        }
        int i12 = (int) (i11 * f10);
        int dp = AndroidUtilities.dp(10.0f) * Math.min(1, i12 / AndroidUtilities.dp(60.0f));
        if (i12 <= 0) {
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
        rectF.set(0.0f, 0.0f, i10, (n3Var.getY() + n3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z4) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public s u(Class cls) {
        return d(u.a(cls));
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
                ((ScheduledThreadPoolExecutor) this.e).execute(new ag.d(this, 18));
            }
        }
        return remove;
    }

    public Set x(Class cls) {
        return g(u.a(cls));
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f2152a;
        View view2 = (View) this.f2153b;
        if (((Bitmap) this.f2154c) != bitmap) {
            if (((df.f) this.e) != null) {
                view.setBackground(null);
                this.e = null;
            }
            if (((df.f) this.d) == null && ((df.f) this.e) == null && (bitmap2 = (Bitmap) this.f2154c) != null) {
                bitmap2.recycle();
                this.f2154c = null;
            }
            A();
            this.f2154c = bitmap;
            df.f fVar = new df.f((Bitmap) this.f2154c);
            this.e = fVar;
            view.setBackground(fVar);
            if (view2 != null) {
                df.f fVar2 = new df.f((Bitmap) this.f2154c);
                this.d = fVar2;
                view2.setBackground(fVar2);
            }
        }
    }

    public j(Context context, s5.b bVar) {
        this.f2152a = context;
        this.f2153b = bVar;
        C();
    }

    public j(g gVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f2152a = gVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.f2154c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        gVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f2153b = jArr;
    }

    public j(wg.c cVar) {
        this.e = cVar;
        mr mrVar = mr.h;
        this.f2154c = new xd.a(0, this, mrVar, 320L, true);
        this.d = new xd.a(1, this, mrVar, 320L, true);
    }

    public j(n3 n3Var) {
        this.f2153b = new RectF();
        this.f2154c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.f2152a = n3Var;
    }

    @Override
    public void m() {
    }

    @Override
    public void z(float f10, int i10) {
    }
}
