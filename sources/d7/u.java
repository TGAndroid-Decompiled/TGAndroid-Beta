package d7;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import d5.f0;
import j$.util.Objects;
import j3.r0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.t5;
import org.telegram.ui.gn;
import org.telegram.ui.nu0;
import org.xml.sax.Attributes;
public final class u implements Continuation, c9.a, ef.a, i6.d, je.b, jf.a, kf.a, l9.b, s0, na.n, eg, k1, t0, r0.s, y8.d, OnFailureListener {
    public static u f4449b;
    public final int f4450a;

    public u(int i9) {
        this.f4450a = i9;
    }

    public static ff.n h2(Editable editable, int i9) {
        Object[] objArr = (ff.n[]) editable.getSpans(0, editable.length(), ff.n.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i10 = length - 1;
                if (editable.getSpanFlags(objArr[i10]) == 17) {
                    ff.n nVar = objArr[i10];
                    if (nVar.f6240a == i9) {
                        return nVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean i2(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: d7.u.i2(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean j2(boolean z10, String str, Editable editable, Attributes attributes) {
        int i9;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = ff.m.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new t5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), t5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (t5) obj;
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
                editable.setSpan(new ff.n(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object h22 = h2(editable, 0);
            if (h22 != null) {
                int spanStart2 = editable.getSpanStart(h22);
                editable.removeSpan(h22);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(h22, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a3 = ff.m.a("language", attributes);
                if (a3 == null) {
                    a3 = ff.m.a("lang", attributes);
                }
                if (a3 == null) {
                    a3 = ff.m.a("lng", attributes);
                }
                editable.setSpan(new ff.n(a3), editable.length(), editable.length(), 17);
                return true;
            }
            Object h23 = h2(editable, 1);
            if (h23 != null) {
                int spanStart3 = editable.getSpanStart(h23);
                editable.removeSpan(h23);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(h23, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i11 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a10 = ff.m.a("class", attributes);
                    if (ff.m.a("data-collapsed", attributes) != null || (a10 != null && a10.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i11 = 2;
                    }
                    editable.setSpan(new ff.n(i11), editable.length(), editable.length(), 17);
                    return true;
                }
                ff.n[] nVarArr = (ff.n[]) editable.getSpans(0, editable.length(), ff.n.class);
                for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
                    ff.n nVar = nVarArr[length2];
                    if (editable.getSpanFlags(nVar) == 17 && ((i9 = nVar.f6240a) == 2 || i9 == 3)) {
                        obj = nVar;
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
                    editable.setSpan(new ff.n(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object h24 = h2(editable, 3);
                if (h24 != null) {
                    int spanStart5 = editable.getSpanStart(h24);
                    editable.removeSpan(h24);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(h24, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static final CharSequence m2(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers A() {
        return null;
    }

    @Override
    public int B1(int i9, int i10, int i11) {
        return i9 * 2;
    }

    @Override
    public String C(long j10) {
        return null;
    }

    @Override
    public Object D(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        return Long.valueOf(f0.K(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public Object H1(b3.b bVar) {
        return new ya.d(bVar.e(ya.h.class));
    }

    @Override
    public a8.b K(Context context, String str, i6.c cVar) {
        a8.b bVar = new a8.b();
        bVar.f109a = cVar.H(context, str);
        int i9 = 1;
        int k10 = cVar.k(context, str, true);
        bVar.f110b = k10;
        int i10 = bVar.f109a;
        if (i10 == 0) {
            i10 = 0;
            if (k10 == 0) {
                i9 = 0;
                bVar.f111c = i9;
                return bVar;
            }
        }
        if (k10 < i10) {
            i9 = -1;
        }
        bVar.f111c = i9;
        return bVar;
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    @Override
    public int N0() {
        return 0;
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public nu0 P1() {
        return null;
    }

    @Override
    public boolean R1(long j10) {
        return false;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public gn T() {
        return null;
    }

    @Override
    public boolean T0(long j10) {
        return false;
    }

    @Override
    public boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void V1(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean X(t1 t1Var) {
        return false;
    }

    @Override
    public boolean X0() {
        return false;
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Y0(int i9, t1 t1Var) {
        return false;
    }

    @Override
    public Object Y1() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override
    public boolean Z1(w0 w0Var, float f10, float f11) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public je.a a1(we.b bVar) {
        return new fe.j(bVar);
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public boolean d(Context context) {
        return e0.b.j(context);
    }

    @Override
    public pg.a d0() {
        return null;
    }

    @Override
    public boolean e0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean f1() {
        return false;
    }

    @Override
    public boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 <= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(r0.l(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = ((int) Math.ceil((i10 / i9) * remaining)) - remaining;
            float f10 = remaining;
            float f11 = f10 / f10;
            float f12 = ceil;
            float f13 = f12 / f12;
            while (remaining > 0 && ceil > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f11 = remaining / f10;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    }
                    ceil--;
                    f13 = ceil / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public boolean h() {
        switch (this.f4450a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public String i(t1 t1Var) {
        return null;
    }

    @Override
    public int j() {
        return 0;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public TLRPC.Peer k() {
        return null;
    }

    @Override
    public int l0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean n0() {
        return true;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public boolean n2(int i9) {
        return false;
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public o9 q2() {
        return null;
    }

    @Override
    public boolean r0(t5 t5Var) {
        return false;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public l9.a t(ya.b bVar, JSONObject jSONObject) {
        com.google.android.gms.internal.cast.a aVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            aVar = new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            aVar = new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        com.google.android.gms.internal.cast.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ib.d dVar = new ib.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new l9.a(currentTimeMillis, aVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }
        return null;
    }

    @Override
    public boolean v0(Context context) {
        return e0.b.m(context);
    }

    @Override
    public boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public o2 y0() {
        return null;
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void B0() {
    }

    @Override
    public void G() {
    }

    @Override
    public void I1() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void J1() {
    }

    @Override
    public void Q() {
    }

    @Override
    public void Q1() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void c() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void c2() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k2() {
    }

    @Override
    public void m() {
    }

    @Override
    public void n() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void u() {
    }

    @Override
    public void u1() {
    }

    @Override
    public void w() {
    }

    @Override
    public void x0() {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void A1(t1 t1Var) {
    }

    @Override
    public void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void C1(MessageObject messageObject) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void H(boolean z10) {
    }

    @Override
    public void I(w0 w0Var) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void J(t1 t1Var) {
    }

    @Override
    public void K1(int i9) {
    }

    @Override
    public void L0(int i9) {
    }

    @Override
    public void M0(t1 t1Var) {
    }

    @Override
    public void N(t1 t1Var) {
    }

    @Override
    public void O(w0 w0Var) {
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void R(t1 t1Var) {
    }

    @Override
    public void T1(boolean z10) {
    }

    @Override
    public void U(MessageObject messageObject) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void W0(t1 t1Var) {
    }

    @Override
    public void a0(t1 t1Var) {
    }

    @Override
    public void b2(t1 t1Var) {
    }

    @Override
    public void c0(w0 w0Var) {
    }

    @Override
    public void g2(t1 t1Var) {
    }

    @Override
    public void i0(int i9) {
    }

    @Override
    public void m0(t1 t1Var) {
    }

    @Override
    public void m1(CharSequence charSequence) {
    }

    @Override
    public void o(float f10) {
    }

    @Override
    public void o1(long j10) {
    }

    @Override
    public void p(boolean z10) {
    }

    @Override
    public void p1(w0 w0Var) {
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void s1(t1 t1Var) {
    }

    @Override
    public void v(t1 t1Var) {
    }

    @Override
    public void x(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void B(float f10, int i9) {
    }

    @Override
    public void E(w0 w0Var, int i9) {
    }

    @Override
    public void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void N1(w0 w0Var, String str) {
    }

    @Override
    public void O0(int i9, t1 t1Var) {
    }

    @Override
    public void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S(int i9, t1 t1Var) {
    }

    @Override
    public void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void e2(t1 t1Var, long j10) {
    }

    @Override
    public void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void p0(int i9, int i10) {
    }

    @Override
    public void t1(t1 t1Var, boolean z10) {
    }

    @Override
    public void w1(t1 t1Var, eh.f fVar) {
    }

    @Override
    public void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void E0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void L(w0 w0Var, int i9, int i10) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void V0(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void b1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void k0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void l1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void p2(t1 t1Var, int i9, int i10) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void v1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void onScrollLimit(int i9, int i10, int i11, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i9, int i10, int i11, int i12) {
    }

    @Override
    public void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void a2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
    }

    @Override
    public void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }

    @Override
    public void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
