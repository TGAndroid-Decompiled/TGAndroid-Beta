package a5;

import a9.t;
import a9.v;
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
import bg.e3;
import cg.m2;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.i3;
import com.google.android.gms.internal.cast.k2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.l2;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.p0;
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
import i9.s0;
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
import kg.q0;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ka;
import org.telegram.ui.ei1;
import z5.l;
public final class j implements t4.f, a9.c, a3.b, ek0, vd.b {
    public Object f211a;
    public Object f212b;
    public Object f213c;
    public Object d;
    public Object f214e;

    public j(Context context) {
        this(context, new q5.b(-1, 0, 0));
    }

    public static j l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f211a = sharedPreferences;
        obj.f212b = "topic_operation_queue";
        obj.f213c = ",";
        obj.f214e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f211a).getString((String) obj.f212b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f213c)) {
                    String[] split = string.split((String) obj.f213c, -1);
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

    public static void y(j jVar, w6 w6Var) {
        int i10 = w6Var.f4308e;
        if (i10 == 2 && ((v6) jVar.d) != null) {
            jVar.B();
        }
        if (i10 == 2) {
            jVar.d = new v6((p0) jVar.f211a, (String) jVar.f213c);
        } else {
            jVar.d = jVar.A();
        }
        v6 v6Var = (v6) jVar.d;
        l.h(v6Var);
        w6Var.d = v6Var.h;
        v6Var.f4292b.add(w6Var);
    }

    public v6 A() {
        if (((v6) this.d) == null) {
            v6 v6Var = new v6((p0) this.f211a, (String) this.f213c);
            this.d = v6Var;
            v6Var.b(1);
        }
        return (v6) this.d;
    }

    public void B() {
        s1 s1Var;
        int i10;
        int i11;
        long j10;
        v6 v6Var = (v6) this.d;
        if (v6Var != null) {
            Map map = v6Var.f4294e;
            List<i3> list = v6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = v6Var.f4293c;
            List<w6> list3 = v6Var.f4292b;
            p5.c cVar = v6Var.f4298j;
            if (cVar != null) {
                cVar.f45631l = null;
                v6Var.f4298j = null;
            }
            long j11 = v6Var.f4297i;
            s1 m10 = t1.m();
            m10.c();
            t1.t((t1) m10.f4132b, j11);
            String str = v6Var.f4300l;
            if (str != null) {
                m10.c();
                t1.y((t1) m10.f4132b, str);
            }
            String str2 = v6Var.f4301m;
            if (str2 != null) {
                m10.c();
                t1.u((t1) m10.f4132b, str2);
            }
            l1 l10 = m1.l();
            String str3 = v6.f4289o;
            l10.c();
            m1.n((m1) l10.f4132b, str3);
            String str4 = v6Var.f4296g;
            l10.c();
            m1.m((m1) l10.f4132b, str4);
            m10.c();
            t1.r((t1) m10.f4132b, (m1) l10.a());
            d0 d0Var = v6Var.f4291a;
            y1 l11 = z1.l();
            Object zza = d0Var.zza();
            if (zza != null) {
                k2 l12 = l2.l();
                l12.c();
                l2.m((l2) l12.f4132b, (String) zza);
                l11.c();
                z1.m((z1) l11.f4132b, (l2) l12.a());
            }
            String str5 = v6Var.f4299k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    s5.b bVar = v6.f4288n;
                    Log.w(bVar.f47580a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j10 = 0;
                }
                l11.c();
                z1.n((z1) l11.f4132b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (w6 w6Var : list3) {
                    w6Var.getClass();
                    w1 l13 = x1.l();
                    int i12 = w6Var.f4308e;
                    l13.c();
                    x1.p((x1) l13.f4132b, i12);
                    l13.c();
                    x1.m((x1) l13.f4132b, (int) (w6Var.f4306b - w6Var.d));
                    Integer num = w6Var.f4305a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        x1.n((x1) l13.f4132b, intValue);
                    }
                    Boolean bool = w6Var.f4307c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        x1.o((x1) l13.f4132b, booleanValue);
                    }
                    arrayList.add((x1) l13.a());
                }
                l11.c();
                z1.o((z1) l11.f4132b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    c2 l14 = d2.l();
                    l14.c();
                    d2.m((d2) l14.f4132b, (int) (bVar2.f4039b - bVar2.f4040c));
                    int i13 = bVar2.f4038a;
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
                    d2.n((d2) l14.f4132b, i11);
                    arrayList2.add((d2) l14.a());
                }
                l11.c();
                z1.q((z1) l11.f4132b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (i3 i3Var : list) {
                    String str6 = i3Var.f4166a;
                    u1 l15 = v1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14);
                                int i15 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142);
                                int i152 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422);
                                int i1522 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222);
                                int i15222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142222);
                                int i152222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422222);
                                int i1522222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222222);
                                int i15222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142222222);
                                int i152222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422222222);
                                int i1522222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222222222);
                                int i15222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142222222222);
                                int i152222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = 2;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422222222222);
                                int i1522222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222222222222);
                                int i15222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142222222222222);
                                int i152222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422222222222222);
                                int i1522222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222222222222222);
                                int i15222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142222222222222222);
                                int i152222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422222222222222222);
                                int i1522222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222222222222222222);
                                int i15222222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i142222222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i142222222222222222222);
                                int i152222222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i152222222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i162222222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i162222222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i1422222222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i1422222222222222222222);
                                int i1522222222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i1522222222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i1622222222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i1622222222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l15.c();
                                v1.q((v1) l15.f4132b, i10);
                                int i14222222222222222222222 = (int) i3Var.f4167b;
                                l15.c();
                                v1.m((v1) l15.f4132b, i14222222222222222222222);
                                int i15222222222222222222222 = i3Var.f4168c;
                                l15.c();
                                v1.n((v1) l15.f4132b, i15222222222222222222222);
                                l15.c();
                                v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                                int i16222222222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                                l15.c();
                                v1.p((v1) l15.f4132b, i16222222222222222222222);
                                arrayList3.add((v1) l15.a());
                                m10 = m10;
                            }
                            break;
                    }
                    i10 = 1;
                    l15.c();
                    v1.q((v1) l15.f4132b, i10);
                    int i142222222222222222222222 = (int) i3Var.f4167b;
                    l15.c();
                    v1.m((v1) l15.f4132b, i142222222222222222222222);
                    int i152222222222222222222222 = i3Var.f4168c;
                    l15.c();
                    v1.n((v1) l15.f4132b, i152222222222222222222222);
                    l15.c();
                    v1.o((v1) l15.f4132b, (int) (i3Var.d - i3Var.f4170f));
                    int i162222222222222222222222 = (int) (i3Var.f4169e - i3Var.f4170f);
                    l15.c();
                    v1.p((v1) l15.f4132b, i162222222222222222222222);
                    arrayList3.add((v1) l15.a());
                    m10 = m10;
                }
                s1Var = m10;
                l11.c();
                z1.p((z1) l11.f4132b, arrayList3);
            } else {
                s1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    a2 l16 = b2.l();
                    int i17 = cVar2.f4059e;
                    l16.c();
                    b2.p((b2) l16.f4132b, i17);
                    int i18 = cVar2.d.get();
                    l16.c();
                    b2.m((b2) l16.f4132b, i18);
                    int i19 = (int) (cVar2.f4056a - cVar2.f4058c);
                    l16.c();
                    b2.n((b2) l16.f4132b, i19);
                    l16.c();
                    b2.o((b2) l16.f4132b, (int) (cVar2.f4057b - cVar2.f4058c));
                    arrayList4.add((b2) l16.a());
                }
                l11.c();
                z1.r((z1) l11.f4132b, arrayList4);
            }
            s1Var.c();
            t1.q((t1) s1Var.f4132b, (z1) l11.a());
            v6Var.f4295f.a((t1) s1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        ga gaVar;
        Path path = (Path) this.f212b;
        ka kaVar = (ka) this.f213c;
        Paint paint2 = (Paint) this.d;
        t5 t5Var = (t5) this.f214e;
        if (!z10 && (gaVar = t5Var.a2) != null && gaVar.c()) {
            if (z10) {
                kaVar = (ka) this.f211a;
            }
            path.rewind();
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            kaVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((ka) this.f211a) == null) {
                this.f211a = new ka(t5Var.a2, t5Var.V1.getReactionsWindow().f13683c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((ka) this.f211a).e(f12, f13, t5Var.getMeasuredWidth() + f12, t5Var.getMeasuredHeight() + f13);
            paint = ((ka) this.f211a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            kaVar.e(f14, f15, t5Var.getMeasuredWidth() + f14, t5Var.getMeasuredHeight() + f15);
            paint = kaVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f9, f9, paint);
        canvas.drawRoundRect(rectF, f9, f9, paint2);
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        ((TextView) this.f212b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((vd.a) this.d).f49505e));
        ((ug.c) this.f214e).b(this);
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void Q(View view, q0 q0Var, boolean z10, boolean z11) {
        t5 t5Var = (t5) this.f214e;
        e3 e3Var = t5Var.W1;
        if (e3Var == null) {
            return;
        }
        e3Var.s(q0Var, true);
        t5Var.O0(false);
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f211a).contains(v.a(cls))) {
            Object a2 = ((a9.c) this.f214e).a(cls);
            if (!cls.equals(w9.a.class)) {
                return a2;
            }
            w9.a aVar = (w9.a) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public t b(v vVar) {
        if (((Set) this.f213c).contains(vVar)) {
            return ((a9.c) this.f214e).b(vVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + vVar + ">.");
    }

    @Override
    public z9.b c(Class cls) {
        return g(v.a(cls));
    }

    @Override
    public Object d(v vVar) {
        if (((Set) this.f211a).contains(vVar)) {
            return ((a9.c) this.f214e).d(vVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + vVar + ".");
    }

    @Override
    public int e(long j10) {
        long[] jArr = (long[]) this.f212b;
        int b10 = f5.d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public Set f(v vVar) {
        if (((Set) this.d).contains(vVar)) {
            return ((a9.c) this.f214e).f(vVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + vVar + ">.");
    }

    @Override
    public z9.b g(v vVar) {
        if (((Set) this.f212b).contains(vVar)) {
            return ((a9.c) this.f214e).g(vVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + vVar + ">.");
    }

    @Override
    public Object mo18get() {
        return new d3.a((Executor) ((pc.a) this.f211a).mo18get(), (z2.d) ((pc.a) this.f212b).mo18get(), (androidx.biometric.e) ((androidx.biometric.e) this.f213c).mo18get(), (f3.d) ((pc.a) this.d).mo18get(), (g3.c) ((pc.a) this.f214e).mo18get());
    }

    public byte[] h() {
        byte[] bArr = (byte[]) this.f212b;
        byte[] bArr2 = (byte[]) this.f211a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = ei1.f37845b;
        BigInteger bigInteger3 = ei1.f37844a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = ei1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = ei1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = ei1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = ei1.b(new byte[][]{a10, bArr});
                this.d = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.f214e = arrayList;
                FileLog.d("wear-auth: built answer; session " + ei1.d(bArr2) + " emojis=" + ((ArrayList) this.f214e));
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

    public s0 i() {
        String str;
        if (((Long) this.f211a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f212b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = u3.c.k(str, " offset");
        }
        if (((Integer) this.f214e) == null) {
            str = u3.c.k(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.f211a).longValue(), (String) this.f212b, (String) this.f213c, ((Long) this.d).longValue(), ((Integer) this.f214e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public boolean j() {
        return true;
    }

    public void k(Canvas canvas, boolean z10, boolean z11, int i10, float f9) {
        int i11;
        RectF rectF = (RectF) this.f212b;
        float[] fArr = (float[]) this.f213c;
        Paint paint = (Paint) this.f214e;
        m3 m3Var = (m3) this.f211a;
        Path path = (Path) this.d;
        if (z11) {
            i11 = 0;
        } else {
            i11 = (int) m3Var.C;
        }
        int i12 = (int) (i11 * f9);
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
        rectF.set(0.0f, 0.0f, i10, (m3Var.getY() + m3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public long m(int i10) {
        return ((long[]) this.f212b)[i10];
    }

    public t n(Class cls) {
        return b(v.a(cls));
    }

    public String o() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean p(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f214e).execute(new m2(this, 3));
            }
        }
        return remove;
    }

    @Override
    public List q(long j10) {
        a[] aVarArr;
        g gVar = (g) this.f211a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.f214e;
        ArrayList arrayList = new ArrayList();
        gVar.g(j10, gVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        gVar.i(j10, false, gVar.h, treeMap);
        gVar.h(j10, (Map) this.f213c, hashMap, gVar.h, treeMap);
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
                arrayList2.add(new t4.b(null, null, null, decodeByteArray, hVar.f188c, 0, hVar.f189e, hVar.f187b, 0, Integer.MIN_VALUE, -3.4028235E38f, hVar.f190f, hVar.f191g, false, -16777216, hVar.f193j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            h hVar2 = (h) hashMap.get(entry.getKey());
            hVar2.getClass();
            t4.a aVar = (t4.a) entry.getValue();
            CharSequence charSequence = aVar.f48113a;
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
            float f9 = hVar2.f188c;
            int i19 = hVar2.d;
            aVar.f48116e = f9;
            aVar.f48117f = i19;
            aVar.f48118g = hVar2.f189e;
            aVar.h = hVar2.f187b;
            aVar.f48122l = hVar2.f190f;
            float f10 = hVar2.f192i;
            int i20 = hVar2.h;
            aVar.f48121k = f10;
            aVar.f48120j = i20;
            aVar.f48126p = hVar2.f193j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public Set r(Class cls) {
        return f(v.a(cls));
    }

    public void s(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f211a;
        View view2 = (View) this.f212b;
        if (((Bitmap) this.f213c) != bitmap) {
            if (((cf.f) this.f214e) != null) {
                view.setBackground(null);
                this.f214e = null;
            }
            if (((cf.f) this.d) == null && ((cf.f) this.f214e) == null && (bitmap2 = (Bitmap) this.f213c) != null) {
                bitmap2.recycle();
                this.f213c = null;
            }
            t();
            this.f213c = bitmap;
            cf.f fVar = new cf.f((Bitmap) this.f213c);
            this.f214e = fVar;
            view.setBackground(fVar);
            if (view2 != null) {
                cf.f fVar2 = new cf.f((Bitmap) this.f213c);
                this.d = fVar2;
                view2.setBackground(fVar2);
            }
        }
    }

    public void t() {
        Bitmap bitmap;
        if (((cf.f) this.d) != null) {
            this.d = null;
            View view = (View) this.f212b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((cf.f) this.d) == null && ((cf.f) this.f214e) == null && (bitmap = (Bitmap) this.f213c) != null) {
            bitmap.recycle();
            this.f213c = null;
        }
    }

    public void u(Uri uri) {
        int i10;
        Context context = (Context) this.f211a;
        if (uri == null) {
            x();
        } else if (!uri.equals((Uri) this.f213c)) {
            x();
            this.f213c = uri;
            q5.b bVar = (q5.b) this.f212b;
            int i11 = bVar.f46363b;
            if (i11 != 0 && (i10 = bVar.f46364c) != 0) {
                this.d = new r5.b(context, i11, i10, this);
            } else {
                this.d = new r5.b(context, 0, 0, this);
            }
            r5.b bVar2 = (r5.b) this.d;
            l.h(bVar2);
            Uri uri2 = (Uri) this.f213c;
            l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    @Override
    public int v() {
        return ((long[]) this.f212b).length;
    }

    @Override
    public boolean w() {
        return false;
    }

    public void x() {
        r5.b bVar = (r5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f213c = null;
    }

    public j(Context context, q5.b bVar) {
        this.f211a = context;
        this.f212b = bVar;
        x();
    }

    public j(g gVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f211a = gVar;
        this.d = hashMap2;
        this.f214e = hashMap3;
        this.f213c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        gVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f212b = jArr;
    }

    public j(ug.c cVar) {
        this.f214e = cVar;
        jr jrVar = jr.h;
        this.f213c = new vd.a(0, this, jrVar, 320L, true);
        this.d = new vd.a(1, this, jrVar, 320L, true);
    }

    public j(m3 m3Var) {
        this.f212b = new RectF();
        this.f213c = new float[8];
        this.d = new Path();
        this.f214e = new Paint(1);
        this.f211a = m3Var;
    }

    @Override
    public void H() {
    }

    @Override
    public void z(float f9, int i10) {
    }
}
