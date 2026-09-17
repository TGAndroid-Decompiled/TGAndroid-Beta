package cf;

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
import ci.r6;
import ci.uc;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c2;
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
import lf.i;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.qr;
import org.telegram.ui.kj1;
import q9.p;
import q9.r;
import y9.s0;
import z3.d;
import zg.p0;
public final class c implements fk0, d, le.d, n5.b, q9.b {
    public Object f4260a;
    public Object f4261b;
    public Object f4262c;
    public Object d;
    public Object e;

    public c(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public static void E(c cVar, y6 y6Var) {
        int i10 = y6Var.e;
        if (i10 == 2 && ((x6) cVar.d) != null) {
            cVar.G();
        }
        if (i10 == 2) {
            cVar.d = new x6((r0) cVar.f4260a, (String) cVar.f4262c);
        } else {
            cVar.d = cVar.F();
        }
        x6 x6Var = (x6) cVar.d;
        l.h(x6Var);
        y6Var.d = x6Var.h;
        x6Var.f6533b.add(y6Var);
    }

    public static c s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.d = new ArrayDeque();
        obj.f4260a = sharedPreferences;
        obj.f4261b = "topic_operation_queue";
        obj.f4262c = ",";
        obj.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.d)) {
            try {
                ((ArrayDeque) obj.d).clear();
                String string = ((SharedPreferences) obj.f4260a).getString((String) obj.f4261b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f4262c)) {
                    String[] split = string.split((String) obj.f4262c, -1);
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

    @Override
    public int A() {
        return ((long[]) this.f4261b).length;
    }

    public void B() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f4262c = null;
    }

    @Override
    public void D(int i10, float f7, float f10, e eVar) {
        ((TextView) this.f4261b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((le.b) this.d).e));
        ((jh.c) this.e).b(this);
    }

    public x6 F() {
        if (((x6) this.d) == null) {
            x6 x6Var = new x6((r0) this.f4260a, (String) this.f4262c);
            this.d = x6Var;
            x6Var.b(1);
        }
        return (x6) this.d;
    }

    public void G() {
        t1 t1Var;
        int i10;
        int i11;
        long j3;
        x6 x6Var = (x6) this.d;
        if (x6Var != null) {
            Map map = x6Var.e;
            List<j3> list = x6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = x6Var.f6534c;
            List<y6> list3 = x6Var.f6533b;
            d6.c cVar = x6Var.f6538j;
            if (cVar != null) {
                cVar.f7539l = null;
                x6Var.f6538j = null;
            }
            long j10 = x6Var.f6537i;
            t1 m10 = u1.m();
            m10.c();
            u1.t((u1) m10.f6395b, j10);
            String str = x6Var.f6540l;
            if (str != null) {
                m10.c();
                u1.y((u1) m10.f6395b, str);
            }
            String str2 = x6Var.f6541m;
            if (str2 != null) {
                m10.c();
                u1.u((u1) m10.f6395b, str2);
            }
            m1 l4 = n1.l();
            String str3 = x6.f6530o;
            l4.c();
            n1.n((n1) l4.f6395b, str3);
            String str4 = x6Var.f6536g;
            l4.c();
            n1.m((n1) l4.f6395b, str4);
            m10.c();
            u1.r((u1) m10.f6395b, (n1) l4.a());
            f0 f0Var = x6Var.f6532a;
            z1 l10 = a2.l();
            Object zza = f0Var.zza();
            if (zza != null) {
                l2 l11 = m2.l();
                l11.c();
                m2.m((m2) l11.f6395b, (String) zza);
                l10.c();
                a2.m((a2) l10.f6395b, (m2) l11.a());
            }
            String str5 = x6Var.f6539k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    g6.b bVar = x6.f6529n;
                    Log.w(bVar.f9430a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j3 = 0;
                }
                l10.c();
                a2.n((a2) l10.f6395b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (y6 y6Var : list3) {
                    y6Var.getClass();
                    x1 l12 = y1.l();
                    int i12 = y6Var.e;
                    l12.c();
                    y1.p((y1) l12.f6395b, i12);
                    l12.c();
                    y1.m((y1) l12.f6395b, (int) (y6Var.f6545b - y6Var.d));
                    Integer num = y6Var.f6544a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        y1.n((y1) l12.f6395b, intValue);
                    }
                    Boolean bool = y6Var.f6546c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        y1.o((y1) l12.f6395b, booleanValue);
                    }
                    arrayList.add((y1) l12.a());
                }
                l10.c();
                a2.o((a2) l10.f6395b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    d2 l13 = e2.l();
                    l13.c();
                    e2.m((e2) l13.f6395b, (int) (bVar2.f6256b - bVar2.f6257c));
                    int i13 = bVar2.f6255a;
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
                    e2.n((e2) l13.f6395b, i11);
                    arrayList2.add((e2) l13.a());
                }
                l10.c();
                a2.q((a2) l10.f6395b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (j3 j3Var : list) {
                    String str6 = j3Var.f6417a;
                    v1 l14 = w1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14);
                                int i15 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142);
                                int i152 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422);
                                int i1522 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222);
                                int i15222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142222);
                                int i152222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422222);
                                int i1522222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222222);
                                int i15222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142222222);
                                int i152222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422222222);
                                int i1522222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222222222);
                                int i15222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142222222222);
                                int i152222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = 2;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422222222222);
                                int i1522222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222222222222);
                                int i15222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142222222222222);
                                int i152222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422222222222222);
                                int i1522222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222222222222222);
                                int i15222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142222222222222222);
                                int i152222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422222222222222222);
                                int i1522222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222222222222222222);
                                int i15222222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i142222222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i142222222222222222222);
                                int i152222222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i152222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i162222222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i162222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i1422222222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i1422222222222222222222);
                                int i1522222222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i1522222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i1622222222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i1622222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l14.c();
                                w1.q((w1) l14.f6395b, i10);
                                int i14222222222222222222222 = (int) j3Var.f6418b;
                                l14.c();
                                w1.m((w1) l14.f6395b, i14222222222222222222222);
                                int i15222222222222222222222 = j3Var.f6419c;
                                l14.c();
                                w1.n((w1) l14.f6395b, i15222222222222222222222);
                                l14.c();
                                w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                                int i16222222222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                                l14.c();
                                w1.p((w1) l14.f6395b, i16222222222222222222222);
                                arrayList3.add((w1) l14.a());
                                m10 = m10;
                            }
                            break;
                    }
                    i10 = 1;
                    l14.c();
                    w1.q((w1) l14.f6395b, i10);
                    int i142222222222222222222222 = (int) j3Var.f6418b;
                    l14.c();
                    w1.m((w1) l14.f6395b, i142222222222222222222222);
                    int i152222222222222222222222 = j3Var.f6419c;
                    l14.c();
                    w1.n((w1) l14.f6395b, i152222222222222222222222);
                    l14.c();
                    w1.o((w1) l14.f6395b, (int) (j3Var.d - j3Var.f6420f));
                    int i162222222222222222222222 = (int) (j3Var.e - j3Var.f6420f);
                    l14.c();
                    w1.p((w1) l14.f6395b, i162222222222222222222222);
                    arrayList3.add((w1) l14.a());
                    m10 = m10;
                }
                t1Var = m10;
                l10.c();
                a2.p((a2) l10.f6395b, arrayList3);
            } else {
                t1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    b2 l15 = c2.l();
                    int i17 = cVar2.e;
                    l15.c();
                    c2.p((c2) l15.f6395b, i17);
                    int i18 = cVar2.d.get();
                    l15.c();
                    c2.m((c2) l15.f6395b, i18);
                    int i19 = (int) (cVar2.f6299a - cVar2.f6301c);
                    l15.c();
                    c2.n((c2) l15.f6395b, i19);
                    l15.c();
                    c2.o((c2) l15.f6395b, (int) (cVar2.f6300b - cVar2.f6301c));
                    arrayList4.add((c2) l15.a());
                }
                l10.c();
                a2.r((a2) l10.f6395b, arrayList4);
            }
            t1Var.c();
            u1.q((u1) t1Var.f6395b, (a2) l10.a());
            x6Var.f6535f.a((u1) t1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f4260a).contains(r.a(cls))) {
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
    public p b(r rVar) {
        if (((Set) this.f4262c).contains(rVar)) {
            return ((q9.b) this.e).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override
    public pa.b c(Class cls) {
        return e(r.a(cls));
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.f4261b;
        int a2 = d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    @Override
    public pa.b e(r rVar) {
        if (((Set) this.f4261b).contains(rVar)) {
            return ((q9.b) this.e).e(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override
    public Set f(r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((q9.b) this.e).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override
    public long g(int i10) {
        return ((long[]) this.f4261b)[i10];
    }

    @Override
    public Object mo28get() {
        return new q5.a((Executor) ((fd.a) this.f4260a).mo28get(), (m5.d) ((fd.a) this.f4261b).mo28get(), (i) ((i) this.f4262c).mo28get(), (s5.d) ((fd.a) this.d).mo28get(), (t5.c) ((fd.a) this.e).mo28get());
    }

    @Override
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
        r6 r6Var = (r6) this.e;
        qg.d2 d2Var = r6Var.a2;
        if (d2Var == null) {
            return;
        }
        d2Var.s(p0Var, true);
        r6Var.O0(false);
    }

    @Override
    public Object i(r rVar) {
        if (((Set) this.f4260a).contains(rVar)) {
            return ((q9.b) this.e).i(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
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
    public List l(long j3) {
        f4.a[] aVarArr;
        f4.c cVar = (f4.c) this.f4260a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, (Map) this.f4262c, hashMap, cVar.h, treeMap);
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
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, fVar.f8886c, 0, fVar.e, fVar.f8885b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f8887f, fVar.f8888g, false, -16777216, fVar.f8890j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) hashMap.get(entry.getKey());
            fVar2.getClass();
            d2.a aVar = (d2.a) entry.getValue();
            CharSequence charSequence = aVar.f7414a;
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
            float f7 = fVar2.f8886c;
            int i19 = fVar2.d;
            aVar.e = f7;
            aVar.f7417f = i19;
            aVar.f7418g = fVar2.e;
            aVar.h = fVar2.f8885b;
            aVar.f7422l = fVar2.f8887f;
            float f10 = fVar2.f8889i;
            int i20 = fVar2.h;
            aVar.f7421k = f10;
            aVar.f7420j = i20;
            aVar.f7426p = fVar2.f8890j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public byte[] m() {
        byte[] bArr = (byte[]) this.f4262c;
        byte[] bArr2 = (byte[]) this.f4261b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = kj1.f35295b;
        BigInteger bigInteger3 = kj1.f35294a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a2 = kj1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a10 = kj1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = kj1.b(new byte[][]{a10, bArr2, bArr3});
                byte[] b11 = kj1.b(new byte[][]{a10, bArr});
                this.e = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = i10 * 8;
                    arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
                }
                this.f4260a = arrayList;
                FileLog.d("wear-auth: built answer; session " + kj1.d(bArr2) + " emojis=" + ((ArrayList) this.f4260a));
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
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        ha haVar;
        Path path = (Path) this.f4261b;
        la laVar = (la) this.f4262c;
        Paint paint2 = (Paint) this.d;
        r6 r6Var = (r6) this.e;
        if (!z10 && (haVar = r6Var.f5417e2) != null && haVar.c()) {
            if (z10) {
                laVar = (la) this.f4260a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            laVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((la) this.f4260a) == null) {
                this.f4260a = new la(r6Var.f5417e2, r6Var.Z1.getReactionsWindow().f49008c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((la) this.f4260a).e(f12, f13, r6Var.getMeasuredWidth() + f12, r6Var.getMeasuredHeight() + f13);
            paint = ((la) this.f4260a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            laVar.e(f14, f15, r6Var.getMeasuredWidth() + f14, r6Var.getMeasuredHeight() + f15);
            paint = laVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    public s0 p() {
        String str;
        if (((Long) this.f4260a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f4261b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = p6.t(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = p6.t(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.f4260a).longValue(), (String) this.f4261b, (String) this.f4262c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public boolean q() {
        return true;
    }

    public void r(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        int i11;
        RectF rectF = (RectF) this.f4261b;
        float[] fArr = (float[]) this.f4262c;
        Paint paint = (Paint) this.e;
        p3 p3Var = (p3) this.f4260a;
        Path path = (Path) this.d;
        if (z11) {
            i11 = 0;
        } else {
            i11 = (int) p3Var.G;
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
        rectF.set(0.0f, 0.0f, i10, (p3Var.getY() + p3Var.getHeight()) - i12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public p t(Class cls) {
        return b(r.a(cls));
    }

    public String u() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean v(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new uc(this, 2));
            }
        }
        return remove;
    }

    public Set w(Class cls) {
        return f(r.a(cls));
    }

    public void x(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f4260a;
        View view2 = (View) this.f4261b;
        if (((Bitmap) this.f4262c) != bitmap) {
            if (((cd) this.e) != null) {
                view.setBackground(null);
                this.e = null;
            }
            if (((cd) this.d) == null && ((cd) this.e) == null && (bitmap2 = (Bitmap) this.f4262c) != null) {
                bitmap2.recycle();
                this.f4262c = null;
            }
            y();
            this.f4262c = bitmap;
            cd cdVar = new cd((Bitmap) this.f4262c);
            this.e = cdVar;
            view.setBackground(cdVar);
            if (view2 != null) {
                cd cdVar2 = new cd((Bitmap) this.f4262c);
                this.d = cdVar2;
                view2.setBackground(cdVar2);
            }
        }
    }

    public void y() {
        Bitmap bitmap;
        if (((cd) this.d) != null) {
            this.d = null;
            View view = (View) this.f4261b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((cd) this.d) == null && ((cd) this.e) == null && (bitmap = (Bitmap) this.f4262c) != null) {
            bitmap.recycle();
            this.f4262c = null;
        }
    }

    public void z(Uri uri) {
        int i10;
        Context context = (Context) this.f4260a;
        if (uri == null) {
            B();
        } else if (!uri.equals((Uri) this.f4262c)) {
            B();
            this.f4262c = uri;
            e6.b bVar = (e6.b) this.f4261b;
            int i11 = bVar.f7988b;
            if (i11 != 0 && (i10 = bVar.f7989c) != 0) {
                this.d = new f6.b(context, i11, i10, this);
            } else {
                this.d = new f6.b(context, 0, 0, this);
            }
            f6.b bVar2 = (f6.b) this.d;
            l.h(bVar2);
            Uri uri2 = (Uri) this.f4262c;
            l.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public c(Context context, e6.b bVar) {
        this.f4260a = context;
        this.f4261b = bVar;
        B();
    }

    public c(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f4260a = cVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.f4262c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f4261b = jArr;
    }

    public c(jh.c cVar) {
        this.e = cVar;
        qr qrVar = qr.h;
        this.f4262c = new le.b(0, this, qrVar, 320L, true);
        this.d = new le.b(1, this, qrVar, 320L, true);
    }

    public c(p3 p3Var) {
        this.f4261b = new RectF();
        this.f4262c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.f4260a = p3Var;
    }

    @Override
    public void o() {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
