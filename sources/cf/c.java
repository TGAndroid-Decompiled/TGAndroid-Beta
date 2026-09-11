package cf;

import ah.j1;
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
import bi.oa;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j3;
import com.google.android.gms.internal.cast.l2;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.m2;
import com.google.android.gms.internal.cast.n1;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.y6;
import com.google.android.gms.internal.cast.z1;
import di.q6;
import e2.d0;
import f4.f;
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
import le.e;
import m2.t;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pr;
import org.telegram.ui.lj1;
import q9.p;
import q9.r;
import rg.c2;
import y9.s0;
import z3.d;
public final class c implements ek0, d, le.d, n5.b, q9.b {
    public Object f4796a;
    public Object f4797b;
    public Object f4798c;
    public Object d;
    public Object f4799e;

    public c(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public static c o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f4796a = sharedPreferences;
        obj.f4797b = "topic_operation_queue";
        obj.f4798c = ",";
        obj.f4799e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f4796a).getString((String) obj.f4797b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f4798c)) {
                    String[] split = string.split((String) obj.f4798c, -1);
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

    public static void y(c cVar, y6 y6Var) {
        int i10 = y6Var.f5520e;
        if (i10 == 2 && ((x6) cVar.d) != null) {
            cVar.C();
        }
        if (i10 == 2) {
            cVar.d = new x6((r0) cVar.f4796a, (String) cVar.f4798c);
        } else {
            cVar.d = cVar.A();
        }
        x6 x6Var = (x6) cVar.d;
        l.h(x6Var);
        y6Var.d = x6Var.h;
        x6Var.f5505b.add(y6Var);
    }

    public x6 A() {
        if (((x6) this.d) == null) {
            x6 x6Var = new x6((r0) this.f4796a, (String) this.f4798c);
            this.d = x6Var;
            x6Var.b(1);
        }
        return (x6) this.d;
    }

    @Override
    public void B(View view, j1 j1Var, boolean z10, boolean z11) {
        q6 q6Var = (q6) this.f4799e;
        c2 c2Var = q6Var.a2;
        if (c2Var == null) {
            return;
        }
        c2Var.s(j1Var, true);
        q6Var.O0(false);
    }

    public void C() {
        t1 t1Var;
        int i10;
        int i11;
        long j3;
        x6 x6Var = (x6) this.d;
        if (x6Var != null) {
            Map map = x6Var.f5507e;
            List<j3> list = x6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = x6Var.f5506c;
            List<y6> list3 = x6Var.f5505b;
            d6.c cVar = x6Var.f5511j;
            if (cVar != null) {
                cVar.f6606l = null;
                x6Var.f5511j = null;
            }
            long j10 = x6Var.f5510i;
            t1 m10 = u1.m();
            m10.c();
            u1.t((u1) m10.f5349b, j10);
            String str = x6Var.f5513l;
            if (str != null) {
                m10.c();
                u1.y((u1) m10.f5349b, str);
            }
            String str2 = x6Var.f5514m;
            if (str2 != null) {
                m10.c();
                u1.u((u1) m10.f5349b, str2);
            }
            m1 l4 = n1.l();
            String str3 = x6.f5502o;
            l4.c();
            n1.n((n1) l4.f5349b, str3);
            String str4 = x6Var.f5509g;
            l4.c();
            n1.m((n1) l4.f5349b, str4);
            m10.c();
            u1.r((u1) m10.f5349b, (n1) l4.a());
            f0 f0Var = x6Var.f5504a;
            z1 l10 = a2.l();
            Object zza = f0Var.zza();
            if (zza != null) {
                l2 l11 = m2.l();
                l11.c();
                m2.m((m2) l11.f5349b, (String) zza);
                l10.c();
                a2.m((a2) l10.f5349b, (m2) l11.a());
            }
            String str5 = x6Var.f5512k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e7) {
                    g6.b bVar = x6.f5501n;
                    Log.w(bVar.f10386a, bVar.d("receiverSessionId %s is not valid for hash", str5), e7);
                    j3 = 0;
                }
                l10.c();
                a2.n((a2) l10.f5349b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (y6 y6Var : list3) {
                    y6Var.getClass();
                    x1 l12 = y1.l();
                    int i12 = y6Var.f5520e;
                    l12.c();
                    y1.p((y1) l12.f5349b, i12);
                    l12.c();
                    y1.m((y1) l12.f5349b, (int) (y6Var.f5518b - y6Var.d));
                    Integer num = y6Var.f5517a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        y1.n((y1) l12.f5349b, intValue);
                    }
                    Boolean bool = y6Var.f5519c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        y1.o((y1) l12.f5349b, booleanValue);
                    }
                    arrayList.add((y1) l12.a());
                }
                l10.c();
                a2.o((a2) l10.f5349b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    d2 l13 = e2.l();
                    l13.c();
                    e2.m((e2) l13.f5349b, (int) (bVar2.f5196b - bVar2.f5197c));
                    int i13 = bVar2.f5195a;
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
                    e2.n((e2) l13.f5349b, i11);
                    arrayList2.add((e2) l13.a());
                }
                l10.c();
                a2.q((a2) l10.f5349b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (j3 j3Var : list) {
                    String str6 = j3Var.f5373a;
                    v1 l14 = w1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14);
                                int i15 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142);
                                int i152 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422);
                                int i1522 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222);
                                int i15222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142222);
                                int i152222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422222);
                                int i1522222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222222);
                                int i15222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142222222);
                                int i152222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422222222);
                                int i1522222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222222222);
                                int i15222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142222222222);
                                int i152222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = 2;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422222222222);
                                int i1522222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222222222222);
                                int i15222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142222222222222);
                                int i152222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422222222222222);
                                int i1522222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222222222222222);
                                int i15222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142222222222222222);
                                int i152222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422222222222222222);
                                int i1522222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222222222222222222);
                                int i15222222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i142222222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i142222222222222222222);
                                int i152222222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i152222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i162222222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i162222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i1422222222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i1422222222222222222222);
                                int i1522222222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i1522222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i1622222222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i1622222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f5349b, i10);
                                int i14222222222222222222222 = (int) j3Var.f5374b;
                                l14.c();
                                w1.m((w1) l14.f5349b, i14222222222222222222222);
                                int i15222222222222222222222 = j3Var.f5375c;
                                l14.c();
                                w1.n((w1) l14.f5349b, i15222222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                                int i16222222222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                                l14.c();
                                w1.p((w1) l14.f5349b, i16222222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                    }
                    i10 = 1;
                    l14.c();
                    w1.q((w1) l14.f5349b, i10);
                    int i142222222222222222222222 = (int) j3Var.f5374b;
                    l14.c();
                    w1.m((w1) l14.f5349b, i142222222222222222222222);
                    int i152222222222222222222222 = j3Var.f5375c;
                    l14.c();
                    w1.n((w1) l14.f5349b, i152222222222222222222222);
                    l14.c();
                    w1.o((w1) l14.f5349b, (int) (j3Var.d - j3Var.f5377f));
                    int i162222222222222222222222 = (int) (j3Var.f5376e - j3Var.f5377f);
                    l14.c();
                    w1.p((w1) l14.f5349b, i162222222222222222222222);
                    arrayList3.add((w1) l14.a());
                    m10 = m10;
                }
                t1Var = m10;
                l10.c();
                a2.p((a2) l10.f5349b, arrayList3);
            } else {
                t1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    b2 l15 = com.google.android.gms.internal.cast.c2.l();
                    int i17 = cVar2.f5245e;
                    l15.c();
                    com.google.android.gms.internal.cast.c2.p((com.google.android.gms.internal.cast.c2) l15.f5349b, i17);
                    int i18 = cVar2.d.get();
                    l15.c();
                    com.google.android.gms.internal.cast.c2.m((com.google.android.gms.internal.cast.c2) l15.f5349b, i18);
                    int i19 = (int) (cVar2.f5242a - cVar2.f5244c);
                    l15.c();
                    com.google.android.gms.internal.cast.c2.n((com.google.android.gms.internal.cast.c2) l15.f5349b, i19);
                    l15.c();
                    com.google.android.gms.internal.cast.c2.o((com.google.android.gms.internal.cast.c2) l15.f5349b, (int) (cVar2.f5243b - cVar2.f5244c));
                    arrayList4.add((com.google.android.gms.internal.cast.c2) l15.a());
                }
                l10.c();
                a2.r((a2) l10.f5349b, arrayList4);
            }
            t1Var.c();
            u1.q((u1) t1Var.f5349b, (a2) l10.a());
            x6Var.f5508f.a((u1) t1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public void E(int i10, float f7, float f10, e eVar) {
        ((TextView) this.f4797b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((le.b) this.d).f15368e));
        ((kh.c) this.f4799e).b(this);
    }

    @Override
    public void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        ja jaVar;
        Path path = (Path) this.f4797b;
        na naVar = (na) this.f4798c;
        Paint paint2 = (Paint) this.d;
        q6 q6Var = (q6) this.f4799e;
        if (!z10 && (jaVar = q6Var.f7961e2) != null && jaVar.c()) {
            if (z10) {
                naVar = (na) this.f4796a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            naVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((na) this.f4796a) == null) {
                this.f4796a = new na(q6Var.f7961e2, q6Var.Z1.getReactionsWindow().f687c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((na) this.f4796a).e(f12, f13, q6Var.getMeasuredWidth() + f12, q6Var.getMeasuredHeight() + f13);
            paint = ((na) this.f4796a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            naVar.e(f14, f15, q6Var.getMeasuredWidth() + f14, q6Var.getMeasuredHeight() + f15);
            paint = naVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f4796a).contains(r.a(cls))) {
            Object a2 = ((q9.b) this.f4799e).a(cls);
            if (!cls.equals(ma.a.class)) {
                return a2;
            }
            ma.a aVar = (ma.a) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public p b(r rVar) {
        if (((Set) this.f4798c).contains(rVar)) {
            return ((q9.b) this.f4799e).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public pa.b c(Class cls) {
        return f(r.a(cls));
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.f4797b;
        int a2 = d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    @Override
    public long e(int i10) {
        return ((long[]) this.f4797b)[i10];
    }

    @Override
    public pa.b f(r rVar) {
        if (((Set) this.f4797b).contains(rVar)) {
            return ((q9.b) this.f4799e).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public Set g(r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((q9.b) this.f4799e).g(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public Object mo28get() {
        return new q5.a((Executor) ((fd.a) this.f4796a).mo28get(), (m5.d) ((fd.a) this.f4797b).mo28get(), (t) ((t) this.f4798c).mo28get(), (s5.d) ((fd.a) this.d).mo28get(), (t5.c) ((fd.a) this.f4799e).mo28get());
    }

    @Override
    public List h(long j3) {
        f4.a[] aVarArr;
        f4.c cVar = (f4.c) this.f4796a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.f4799e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, (Map) this.f4798c, hashMap, cVar.h, treeMap);
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
                f fVar = (f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, fVar.f9268c, 0, fVar.f9269e, fVar.f9267b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f9270f, fVar.f9271g, false, -16777216, fVar.f9273j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) hashMap.get(entry.getKey());
            fVar2.getClass();
            d2.a aVar = (d2.a) entry.getValue();
            CharSequence charSequence = aVar.f6470a;
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
            float f7 = fVar2.f9268c;
            int i19 = fVar2.d;
            aVar.f6473e = f7;
            aVar.f6474f = i19;
            aVar.f6475g = fVar2.f9269e;
            aVar.h = fVar2.f9267b;
            aVar.f6479l = fVar2.f9270f;
            float f10 = fVar2.f9272i;
            int i20 = fVar2.h;
            aVar.f6478k = f10;
            aVar.f6477j = i20;
            aVar.f6483p = fVar2.f9273j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public Object i(r rVar) {
        if (((Set) this.f4796a).contains(rVar)) {
            return ((q9.b) this.f4799e).i(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    public byte[] j() {
        byte[] bArr = (byte[]) this.f4798c;
        byte[] bArr2 = (byte[]) this.f4797b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = lj1.f38396b;
        BigInteger bigInteger3 = lj1.f38395a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = lj1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = lj1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = lj1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = lj1.b(new byte[][]{a10, bArr});
                this.f4799e = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.f4796a = arrayList;
                FileLog.d("wear-auth: built answer; session " + lj1.d(bArr2) + " emojis=" + ((ArrayList) this.f4796a));
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
    public int k() {
        return ((long[]) this.f4797b).length;
    }

    public s0 l() {
        String str;
        if (((Long) this.f4796a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f4797b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = p6.t(str, " offset");
        }
        if (((Integer) this.f4799e) == null) {
            str = p6.t(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.f4796a).longValue(), (String) this.f4797b, (String) this.f4798c, ((Long) this.d).longValue(), ((Integer) this.f4799e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void m(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        int i11;
        RectF rectF = (RectF) this.f4797b;
        float[] fArr = (float[]) this.f4798c;
        Paint paint = (Paint) this.f4799e;
        o3 o3Var = (o3) this.f4796a;
        Path path = (Path) this.d;
        if (z11) {
            i11 = 0;
        } else {
            i11 = (int) o3Var.G;
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
        rectF.set(0.0f, 0.0f, i10, (o3Var.getY() + o3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public boolean n() {
        return true;
    }

    public p p(Class cls) {
        return b(r.a(cls));
    }

    public String q() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean r(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f4799e).execute(new oa(this, 9));
            }
        }
        return remove;
    }

    public Set s(Class cls) {
        return g(r.a(cls));
    }

    @Override
    public boolean t() {
        return false;
    }

    public void u(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f4796a;
        View view2 = (View) this.f4797b;
        if (((Bitmap) this.f4798c) != bitmap) {
            if (((fd) this.f4799e) != null) {
                view.setBackground(null);
                this.f4799e = null;
            }
            if (((fd) this.d) == null && ((fd) this.f4799e) == null && (bitmap2 = (Bitmap) this.f4798c) != null) {
                bitmap2.recycle();
                this.f4798c = null;
            }
            v();
            this.f4798c = bitmap;
            fd fdVar = new fd((Bitmap) this.f4798c);
            this.f4799e = fdVar;
            view.setBackground(fdVar);
            if (view2 != null) {
                fd fdVar2 = new fd((Bitmap) this.f4798c);
                this.d = fdVar2;
                view2.setBackground(fdVar2);
            }
        }
    }

    public void v() {
        Bitmap bitmap;
        if (((fd) this.d) != null) {
            this.d = null;
            View view = (View) this.f4797b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((fd) this.d) == null && ((fd) this.f4799e) == null && (bitmap = (Bitmap) this.f4798c) != null) {
            bitmap.recycle();
            this.f4798c = null;
        }
    }

    public void w(Uri uri) {
        int i10;
        Context context = (Context) this.f4796a;
        if (uri == null) {
            x();
        } else if (!uri.equals((Uri) this.f4798c)) {
            x();
            this.f4798c = uri;
            e6.b bVar = (e6.b) this.f4797b;
            int i11 = bVar.f8848b;
            if (i11 != 0 && (i10 = bVar.f8849c) != 0) {
                this.d = new f6.b(context, i11, i10, this);
            } else {
                this.d = new f6.b(context, 0, 0, this);
            }
            f6.b bVar2 = (f6.b) this.d;
            l.h(bVar2);
            Uri uri2 = (Uri) this.f4798c;
            l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void x() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f4798c = null;
    }

    public c(Context context, e6.b bVar) {
        this.f4796a = context;
        this.f4797b = bVar;
        x();
    }

    public c(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f4796a = cVar;
        this.d = hashMap2;
        this.f4799e = hashMap3;
        this.f4798c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f4797b = jArr;
    }

    public c(kh.c cVar) {
        this.f4799e = cVar;
        pr prVar = pr.h;
        this.f4798c = new le.b(0, this, prVar, 320L, true);
        this.d = new le.b(1, this, prVar, 320L, true);
    }

    public c(o3 o3Var) {
        this.f4797b = new RectF();
        this.f4798c = new float[8];
        this.d = new Path();
        this.f4799e = new Paint(1);
        this.f4796a = o3Var;
    }

    @Override
    public void J() {
    }

    @Override
    public void z(float f7, int i10) {
    }
}
