package oa;

import a3.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.style.CharacterStyle;
import b2.p0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e9.n0;
import j9.y;
import java.io.ByteArrayOutputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import ki.h;
import l5.p;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.f8;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.messenger.v2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.o5;
import org.telegram.ui.h31;
import org.telegram.ui.qs0;
import org.xml.sax.Attributes;
import r2.k;
import r2.o;
import rf.i;
import rf.j;
import t7.u;
import v7.p8;
import v7.t6;
public final class d implements androidx.car.app.messaging.model.b, ai, ea.e, r9.d, n5.b, h, l1, k, h31, u5.a, uf.a, vf.a, we.b, SuccessContinuation, y6.d {
    public final int f14119a;

    public d(int i10) {
        this.f14119a = i10;
    }

    public static j B4(Editable editable, int i10) {
        Object[] objArr = (j[]) editable.getSpans(0, editable.length(), j.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    j jVar = objArr[i11];
                    if (jVar.f46542a == i10) {
                        return jVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean C4(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = i.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new o5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), o5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (o5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } else if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new j(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object B4 = B4(editable, 0);
            if (B4 != null) {
                int spanStart2 = editable.getSpanStart(B4);
                editable.removeSpan(B4);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(B4, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = i.a("language", attributes);
                if (a10 == null) {
                    a10 = i.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = i.a("lng", attributes);
                }
                editable.setSpan(new j(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object B42 = B4(editable, 1);
            if (B42 != null) {
                int spanStart3 = editable.getSpanStart(B42);
                editable.removeSpan(B42);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(B42, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = i.a("class", attributes);
                    if (i.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i12 = 2;
                    }
                    editable.setSpan(new j(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                j[] jVarArr = (j[]) editable.getSpans(0, editable.length(), j.class);
                for (int length2 = jVarArr.length - 1; length2 >= 0; length2--) {
                    j jVar = jVarArr[length2];
                    if (editable.getSpanFlags(jVar) == 17 && ((i10 = jVar.f46542a) == 2 || i10 == 3)) {
                        obj = jVar;
                        break;
                    }
                }
                if (obj != null) {
                    int spanStart4 = editable.getSpanStart(obj);
                    editable.removeSpan(obj);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(obj, spanStart4, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new j(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object B43 = B4(editable, 3);
                if (B43 != null) {
                    int spanStart5 = editable.getSpanStart(B43);
                    editable.removeSpan(B43);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(B43, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static y P4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).f2182b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return p8.b(list);
    }

    public static MediaCodec k(j2.f fVar) {
        String str = ((o) fVar.f9347a).f46241a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] o4(n0 n0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                t6.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.f5663x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override
    public void A(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void A0(q1 q1Var, float f7, float f10) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean A1(q1 q1Var, jj jjVar) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B1() {
        int i10 = this.f14119a;
    }

    @Override
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public void C0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void D0(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.f14119a;
    }

    @Override
    public void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void F1(q1 q1Var, c20 c20Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void G(q1 q1Var, s2 s2Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void H(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public qs0 H1() {
        switch (this.f14119a) {
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean I0(long j10) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(gj gjVar) {
        int i10 = this.f14119a;
    }

    @Override
    public void J0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void J1(String str, String str2) {
        int i10 = this.f14119a;
    }

    @Override
    public Object K(bh.d dVar) {
        switch (this.f14119a) {
            case 6:
                jb.g gVar = (jb.g) dVar.b(jb.g.class);
                return new kb.a(0);
            case 7:
                jb.a aVar = (jb.a) dVar.b(jb.a.class);
                return new jb.b(0);
            default:
                return new jb.k((Context) dVar.b(Context.class));
        }
    }

    @Override
    public void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean K1(long j10) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f14119a;
    }

    @Override
    public void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f14119a;
    }

    @Override
    public void M(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean M0(q1 q1Var, boolean z10) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O(jj jjVar) {
        int i10 = this.f14119a;
    }

    @Override
    public void O0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P1(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean Q() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R(q1 q1Var) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S0(jj jjVar) {
        int i10 = this.f14119a;
        return f1.a(jjVar);
    }

    @Override
    public void S1(q1 q1Var, long j10) {
        int i10 = this.f14119a;
    }

    @Override
    public void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f14119a;
    }

    @Override
    public void U(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void U0() {
        int i10 = this.f14119a;
    }

    @Override
    public int W() {
        switch (this.f14119a) {
            case 14:
                return 0;
            case 15:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X1(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public zg.a Y() {
        switch (this.f14119a) {
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(q1 q1Var) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z0(q1 q1Var, TLRPC.Document document) {
        int i10 = this.f14119a;
    }

    @Override
    public void Z1() {
        int i10 = this.f14119a;
    }

    @Override
    public we.a a(m5.e eVar) {
        return new se.h(eVar);
    }

    @Override
    public boolean a0(q1 q1Var, TLRPC.User user) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public void b(String str, Throwable th2) {
        f8.e("AudioRecorderV2 " + str, th2);
    }

    @Override
    public void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean c() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f14119a;
    }

    @Override
    public void c1(q1 q1Var, int i10) {
        int i11 = this.f14119a;
    }

    @Override
    public boolean c2(int i10) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public r2.l d(j2.f r6) {
        throw new UnsupportedOperationException("Method not decompiled: oa.d.d(j2.f):r2.l");
    }

    @Override
    public boolean d0() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public l e(Context context, String str, y6.c cVar) {
        l lVar = new l();
        lVar.f139a = cVar.x1(context, str);
        int i10 = 1;
        int p02 = cVar.p0(context, str, true);
        lVar.f140b = p02;
        int i11 = lVar.f139a;
        if (i11 == 0) {
            i11 = 0;
            if (p02 == 0) {
                i10 = 0;
                lVar.f141c = i10;
                return lVar;
            }
        }
        if (p02 < i11) {
            i10 = -1;
        }
        lVar.f141c = i10;
        return lVar;
    }

    @Override
    public void e0(q1 q1Var, float f7, float f10) {
        int i10 = this.f14119a;
    }

    @Override
    public void e2() {
        int i10 = this.f14119a;
    }

    @Override
    public boolean f() {
        switch (this.f14119a) {
            case 14:
                return true;
            case 15:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(q1 q1Var) {
        switch (this.f14119a) {
            case 14:
                return 0;
            case 15:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void f1(q1 q1Var, float f7, float f10) {
        int i10 = this.f14119a;
    }

    @Override
    public void f2(q1 q1Var, int i10, int i11) {
        int i12 = this.f14119a;
    }

    @Override
    public long g() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void g0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public l9 g2() {
        switch (this.f14119a) {
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public Object get() {
        return new p(Executors.newSingleThreadExecutor());
    }

    @Override
    public String h(q1 q1Var) {
        switch (this.f14119a) {
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public ea.c h1(u uVar, JSONObject jSONObject) {
        ae.j jVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            jVar = new ae.j(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            jVar = new ae.j(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        ae.j jVar2 = jVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ea.b bVar = new ea.b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new ea.c(currentTimeMillis, jVar2, bVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f14119a;
    }

    @Override
    public boolean i0() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        int i10 = this.f14119a;
    }

    @Override
    public boolean j1() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean k1(q1 q1Var, int i10) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f14119a;
    }

    @Override
    public void l0(String str) {
        int i10 = this.f14119a;
    }

    @Override
    public void l1(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean m0(o5 o5Var) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m1(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void n(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void n1(q1 q1Var, boolean z10) {
        int i10 = this.f14119a;
    }

    @Override
    public void o() {
        int i10 = this.f14119a;
    }

    @Override
    public void o0(q1 q1Var, float f7, float f10) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean p1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f14119a;
    }

    @Override
    public void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean r1() {
        switch (this.f14119a) {
            case 14:
                return false;
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f14119a;
    }

    @Override
    public void s0(q1 q1Var, float f7, float f10, boolean z10) {
        int i10 = this.f14119a;
    }

    @Override
    public void s1(q1 q1Var, int i10) {
        int i11 = this.f14119a;
    }

    @Override
    public void t(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u(String str) {
        if (v2.f18448a) {
            f8.b("AudioRecorderV2 " + str);
        }
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public void u1(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void v(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void v1(jj jjVar) {
        int i10 = this.f14119a;
    }

    @Override
    public boolean w0(jj jjVar) {
        switch (this.f14119a) {
            case 14:
                return true;
            case 15:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f14119a) {
            case 14:
            case 15:
            default:
                gf.f.r(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public String x(long j10) {
        switch (this.f14119a) {
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x0(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void y0() {
        int i10 = this.f14119a;
    }

    @Override
    public CharacterStyle y1(q1 q1Var) {
        switch (this.f14119a) {
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z(q1 q1Var) {
        int i10 = this.f14119a;
    }

    @Override
    public void z0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f14119a;
    }

    @Override
    public void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f14119a;
    }

    private final void A3() {
    }

    private final void B0() {
    }

    private final void D4() {
    }

    private final void E() {
    }

    private final void E4() {
    }

    private final void F() {
    }

    private final void F4() {
    }

    private final void I() {
    }

    private final void J4() {
    }

    private final void K4() {
    }

    private final void L2() {
    }

    private final void L4() {
    }

    private final void M2() {
    }

    private final void N2() {
    }

    private final void Q4() {
    }

    private final void R4() {
    }

    private final void S4() {
    }

    private final void W4() {
    }

    private final void X4() {
    }

    private final void Y4() {
    }

    private final void q0() {
    }

    private final void t0() {
    }

    private final void y3() {
    }

    private final void z3() {
    }

    @Override
    public void N() {
    }

    @Override
    public void j0() {
    }

    private final void A2(q1 q1Var) {
    }

    private final void B2(q1 q1Var) {
    }

    private final void C2(q1 q1Var) {
    }

    private final void D2(q1 q1Var) {
    }

    private final void E0(q1 q1Var) {
    }

    private final void E2(q1 q1Var) {
    }

    private final void G0(q1 q1Var) {
    }

    private final void G1(q1 q1Var) {
    }

    private final void I1(q1 q1Var) {
    }

    private final void K3(String str) {
    }

    private final void L3(String str) {
    }

    private final void M1(q1 q1Var) {
    }

    private final void M3(String str) {
    }

    private final void M4(int i10) {
    }

    private final void N4(int i10) {
    }

    private final void O1(gj gjVar) {
    }

    private final void O4(int i10) {
    }

    private final void P0(q1 q1Var) {
    }

    private final void Q1(gj gjVar) {
    }

    private final void R1(gj gjVar) {
    }

    private final void T1(q1 q1Var) {
    }

    private final void T3(q1 q1Var) {
    }

    private final void T4(jj jjVar) {
    }

    private final void U1(q1 q1Var) {
    }

    private final void U3(q1 q1Var) {
    }

    private final void U4(jj jjVar) {
    }

    private final void V(q1 q1Var) {
    }

    private final void V0(q1 q1Var) {
    }

    private final void V1(q1 q1Var) {
    }

    private final void V3(q1 q1Var) {
    }

    private final void V4(jj jjVar) {
    }

    private final void X(q1 q1Var) {
    }

    private final void X0(q1 q1Var) {
    }

    private final void Y0(q1 q1Var) {
    }

    private final void Z3(q1 q1Var) {
    }

    private final void a3(q1 q1Var) {
    }

    private final void a4(q1 q1Var) {
    }

    private final void b0(q1 q1Var) {
    }

    private final void b3(q1 q1Var) {
    }

    private final void b4(q1 q1Var) {
    }

    private final void c3(q1 q1Var) {
    }

    private final void c4(jj jjVar) {
    }

    private final void d4(jj jjVar) {
    }

    private final void e4(jj jjVar) {
    }

    private final void f4(q1 q1Var) {
    }

    private final void g4(q1 q1Var) {
    }

    private final void h0(q1 q1Var) {
    }

    private final void h2(q1 q1Var) {
    }

    private final void h4(q1 q1Var) {
    }

    private final void i2(q1 q1Var) {
    }

    private final void j2(q1 q1Var) {
    }

    private final void j3(q1 q1Var) {
    }

    private final void k0(q1 q1Var) {
    }

    private final void k3(q1 q1Var) {
    }

    private final void l3(q1 q1Var) {
    }

    private final void l4(q1 q1Var) {
    }

    private final void m3(q1 q1Var) {
    }

    private final void m4(q1 q1Var) {
    }

    private final void n2(q1 q1Var) {
    }

    private final void n3(q1 q1Var) {
    }

    private final void n4(q1 q1Var) {
    }

    private final void o2(q1 q1Var) {
    }

    private final void o3(q1 q1Var) {
    }

    private final void p0(q1 q1Var) {
    }

    private final void p2(q1 q1Var) {
    }

    private final void p3(q1 q1Var) {
    }

    private final void q3(q1 q1Var) {
    }

    private final void r3(q1 q1Var) {
    }

    private final void v3(q1 q1Var) {
    }

    private final void v4(q1 q1Var) {
    }

    private final void w3(q1 q1Var) {
    }

    private final void x3(q1 q1Var) {
    }

    private final void x4(q1 q1Var) {
    }

    private final void z2(q1 q1Var) {
    }

    private final void z4(q1 q1Var) {
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    private final void B(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I2(q1 q1Var, int i10) {
    }

    private final void J2(q1 q1Var, int i10) {
    }

    private final void K2(q1 q1Var, int i10) {
    }

    private final void N3(q1 q1Var, long j10) {
    }

    private final void O3(q1 q1Var, long j10) {
    }

    private final void P3(q1 q1Var, long j10) {
    }

    private final void Q0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void R0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Y1(q1 q1Var, s2 s2Var) {
    }

    private final void a2(q1 q1Var, s2 s2Var) {
    }

    private final void d2(q1 q1Var, s2 s2Var) {
    }

    private final void d3(String str, String str2) {
    }

    private final void e3(String str, String str2) {
    }

    private final void f3(String str, String str2) {
    }

    private final void g3(q1 q1Var, TLRPC.Document document) {
    }

    private final void h3(q1 q1Var, TLRPC.Document document) {
    }

    private final void i3(q1 q1Var, TLRPC.Document document) {
    }

    private final void i4(q1 q1Var, c20 c20Var) {
    }

    private final void j4(q1 q1Var, c20 c20Var) {
    }

    private final void k2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k4(q1 q1Var, c20 c20Var) {
    }

    private final void l2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void m2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void p4(q1 q1Var, boolean z10) {
    }

    private final void r4(q1 q1Var, boolean z10) {
    }

    private final void t2(q1 q1Var, int i10) {
    }

    private final void t4(q1 q1Var, boolean z10) {
    }

    private final void u2(q1 q1Var, int i10) {
    }

    private final void v2(q1 q1Var, int i10) {
    }

    private final void w(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void w2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void x2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void A4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void B3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void C3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void D3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void O2(q1 q1Var, float f7, float f10) {
    }

    private final void P2(q1 q1Var, float f7, float f10) {
    }

    private final void Q2(q1 q1Var, float f7, float f10) {
    }

    private final void W3(q1 q1Var, float f7, float f10) {
    }

    private final void X3(q1 q1Var, float f7, float f10) {
    }

    private final void Y3(q1 q1Var, float f7, float f10) {
    }

    private final void i1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void m(q1 q1Var, float f7, float f10) {
    }

    private final void o1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void p(q1 q1Var, float f7, float f10) {
    }

    private final void q2(q1 q1Var, int i10, int i11) {
    }

    private final void q4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void r(q1 q1Var, float f7, float f10) {
    }

    private final void r2(q1 q1Var, int i10, int i11) {
    }

    private final void s2(q1 q1Var, int i10, int i11) {
    }

    private final void s3(q1 q1Var, float f7, float f10) {
    }

    private final void s4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void t3(q1 q1Var, float f7, float f10) {
    }

    private final void u3(q1 q1Var, float f7, float f10) {
    }

    private final void u4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void w4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void x1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void y4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void E3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void F2(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final void F3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void G2(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final void G3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void H2(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final void H3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void I3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void J3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void R2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void S2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void T2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void Q3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void R3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void S3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void U2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void V2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void W2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void X2(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void Y2(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void Z2(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void d1(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void e1(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void g1(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    private final void G4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void H4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void I4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
