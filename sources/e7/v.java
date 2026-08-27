package e7;

import android.content.Context;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.upstream.d0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.t5;
import org.telegram.ui.hn;
import org.telegram.ui.ou0;
import p8.l0;
import p8.z;
import y3.x;

public final class v implements androidx.car.app.messaging.model.b, Continuation, com.google.android.exoplayer2.upstream.l, f3.a, j6.d, ke.b, kf.a, lf.a, m3.c, m9.b, n9.a, oa.m, ag, j1, t0, mg.a, z8.d, y3.j, OnFailureListener {

    public static v f5345b;

    public static v f5346c;

    public final int f5347a;

    public v(int i10) {
        this.f5347a = i10;
    }

    public static MediaCodec r2(y3.i iVar) throws IOException {
        iVar.f49490a.getClass();
        String str = iVar.f49490a.f49495a;
        d5.a.c("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        d5.a.q();
        return mediaCodecCreateByCodecName;
    }

    public static Calendar s2() {
        if (f5346c == null) {
            f5346c = new v(7);
        }
        f5346c.getClass();
        return Calendar.getInstance();
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public int C1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int iMin = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < iMin; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public long E() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public CharacterStyle F1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean H1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public int J1() {
        return 0;
    }

    @Override
    public int K0() {
        return 352321535;
    }

    @Override
    public boolean L0(long j10) {
        return false;
    }

    @Override
    public boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public ou0 O1() {
        return null;
    }

    @Override
    public hn P() {
        return null;
    }

    @Override
    public int P0() {
        return 0;
    }

    @Override
    public m9.a P1(ab.a aVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar2 = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        jb.d dVar = new jb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new m9.a(jCurrentTimeMillis, aVar2, dVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean S0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public ke.a V0(g5.b bVar) {
        return new ge.j(bVar);
    }

    @Override
    public boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean W(s1 s1Var) {
        return false;
    }

    @Override
    public boolean X() {
        return false;
    }

    @Override
    public boolean X0(long j10) {
        return false;
    }

    @Override
    public boolean Y0(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public b8.b Y1(Context context, String str, j6.c cVar) {
        b8.b bVar = new b8.b();
        int iG = cVar.g(context, str, true);
        bVar.f2042b = iG;
        if (iG != 0) {
            bVar.f2043c = 1;
            return bVar;
        }
        int iA = cVar.A(context, str);
        bVar.f2041a = iA;
        if (iA != 0) {
            bVar.f2043c = -1;
        }
        return bVar;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public StackTraceElement[] a0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i10 = i11;
                i13 = 1;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i11 - iIntValue;
            if (i11 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i11 - num.intValue();
                        if (i13 < 10) {
                            System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, iIntValue2);
                            i12 += iIntValue2;
                            i13++;
                        }
                        i10 = (iIntValue2 - 1) + i11;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                        i12++;
                        i10 = i11;
                        i13 = 1;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i10 = i11;
                i13 = 1;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        return rl.a(messageObject);
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
    public boolean b1() {
        return false;
    }

    @Override
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            lf.a.f15574q.c0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            lf.a.f15573p.c0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override
    public boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new d0(false);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public qg.a d0() {
        return null;
    }

    @Override
    public boolean e0(s1 s1Var) {
        return false;
    }

    @Override
    public boolean f() {
        switch (this.f5347a) {
        }
        return true;
    }

    @Override
    public boolean f0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public Object f2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean g1() {
        return false;
    }

    @Override
    public boolean g2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override
    public String h(s1 s1Var) {
        return null;
    }

    @Override
    public int h0() {
        return 872415231;
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public boolean k2(int i10) {
        return false;
    }

    @Override
    public TLRPC.Peer l() {
        return null;
    }

    @Override
    public int l0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean n0() {
        return true;
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public k9 o2() {
        return null;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public int p2() {
        return 1711276032;
    }

    @Override
    public boolean s0(t5 t5Var) {
        return false;
    }

    @Override
    public boolean s1() {
        return false;
    }

    @Override
    public y3.k t1(y3.i iVar) {
        MediaCodec mediaCodecR2 = null;
        try {
            mediaCodecR2 = r2(iVar);
            d5.a.c("configureCodec");
            mediaCodecR2.configure(iVar.f49491b, iVar.d, iVar.f49493e, 0);
            d5.a.q();
            d5.a.c("startCodec");
            mediaCodecR2.start();
            d5.a.q();
            return new x(mediaCodecR2);
        } catch (IOException | RuntimeException e9) {
            if (mediaCodecR2 != null) {
                mediaCodecR2.release();
            }
            throw e9;
        }
    }

    @Override
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override
    public Object u0(af.h hVar) {
        switch (this.f5347a) {
            case 24:
                return new za.h();
            default:
                synchronized (t.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    try {
                        if (b10 != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if ((b10 & 1) == 0) {
                                sb2.append(" enableFirelog");
                            }
                            if ((b10 & 2) == 0) {
                                sb2.append(" firelogEventType");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                        t.d(new o());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new xa.a(0);
        }
    }

    @Override
    public boolean x1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public n2 y0() {
        return null;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    @Override
    public boolean z1() {
        return false;
    }

    public v() {
        this.f5347a = 8;
        p8.x xVar = z.f45604b;
        l0 l0Var = l0.f45555e;
    }

    @Override
    public void C0() {
    }

    @Override
    public void F() {
    }

    @Override
    public void I0() {
    }

    @Override
    public void I1() {
    }

    @Override
    public void N() {
    }

    @Override
    public void N1() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void c() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void e() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l2() {
    }

    @Override
    public void m() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void r1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void w1() {
    }

    @Override
    public long B(long j10) {
        return j10;
    }

    @Override
    public void B0(s1 s1Var) {
    }

    @Override
    public void B1(s1 s1Var) {
    }

    @Override
    public void D(s1 s1Var) {
    }

    @Override
    public void D1(MessageObject messageObject) {
    }

    @Override
    public void G(boolean z10) {
    }

    @Override
    public void G0(s1 s1Var) {
    }

    @Override
    public void H(s1 s1Var) {
    }

    @Override
    public void H0(s1 s1Var) {
    }

    @Override
    public void I(v0 v0Var) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void K(v0 v0Var) {
    }

    @Override
    public void M(s1 s1Var) {
    }

    @Override
    public void M0(s1 s1Var) {
    }

    @Override
    public void N0(int i10) {
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void Q(s1 s1Var) {
    }

    @Override
    public void S(v0 v0Var) {
    }

    @Override
    public void S1(int i10) {
    }

    @Override
    public void T(MessageObject messageObject) {
    }

    @Override
    public void U0(s1 s1Var) {
    }

    @Override
    public void W0(s1 s1Var) {
    }

    @Override
    public void W1(boolean z10) {
    }

    @Override
    public void Z(s1 s1Var) {
    }

    @Override
    public void Z1(s1 s1Var) {
    }

    @Override
    public void d2(s1 s1Var) {
    }

    @Override
    public void i0(int i10) {
    }

    @Override
    public void m0(s1 s1Var) {
    }

    @Override
    public void n(float f10) {
    }

    @Override
    public void n1(CharSequence charSequence) {
    }

    @Override
    public void p(s1 s1Var) {
    }

    @Override
    public void p1(long j10) {
    }

    @Override
    public void q1(v0 v0Var) {
    }

    @Override
    public void r(boolean z10) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void t(s1 s1Var) {
    }

    @Override
    public void u1(s1 s1Var) {
    }

    @Override
    public void v(s1 s1Var) {
    }

    @Override
    public void x(s1 s1Var) {
    }

    @Override
    public void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void A(float f10, int i10) {
    }

    @Override
    public void C(v0 v0Var, int i10) {
    }

    @Override
    public void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i10, s1 s1Var) {
    }

    @Override
    public void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void R(int i10, s1 s1Var) {
    }

    @Override
    public void T1(v0 v0Var, String str) {
    }

    @Override
    public void a2(s1 s1Var, fh.f fVar) {
    }

    @Override
    public void b2(s1 s1Var, long j10) {
    }

    @Override
    public void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void h1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void o0(int i10, int i11) {
    }

    @Override
    public void v1(s1 s1Var, boolean z10) {
    }

    @Override
    public void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void A1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void J(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void Z0(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void c1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void k0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void m1(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void n2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void t0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void x0(s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void j2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override
    public void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
