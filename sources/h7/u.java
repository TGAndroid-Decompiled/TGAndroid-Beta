package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.tasks.OnFailureListener;
import d4.w;
import g5.o0;
import h5.d0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kf.k0;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;
public class u implements s0, OnFailureListener, w, c9.f, h3.a, m6.c, nf.a, of.a, j1, p9.c, q9.a, o0, ra.m {
    public static u f7022b;
    public static u f7023c;
    public final int f7024a;

    public u(int i10) {
        this.f7024a = i10;
    }

    @Override
    public void A(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void A0(s1 s1Var, float f10, float f11, boolean z4) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        switch (this.f7024a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void B2() {
        int i10 = this.f7024a;
    }

    @Override
    public void C2(s1 s1Var, int i10, int i11) {
        int i12 = this.f7024a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public m9 D2() {
        switch (this.f7024a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f7024a;
    }

    @Override
    public void E0() {
        int i10 = this.f7024a;
    }

    @Override
    public void F(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void F0(s1 s1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean F1() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void G0(s1 s1Var, float f10, float f11) {
        int i10 = this.f7024a;
    }

    @Override
    public void H1(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f7024a;
    }

    @Override
    public void I0(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void I1(s1 s1Var, boolean z4) {
        int i10 = this.f7024a;
    }

    @Override
    public p9.b K(cb.b bVar, JSONObject jSONObject) {
        c5.c cVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            cVar = new c5.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            cVar = new c5.c(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        c5.c cVar2 = cVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        mb.d dVar = new mb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new p9.b(currentTimeMillis, cVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public void K0(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean K1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f7024a;
    }

    @Override
    public void M(s1 s1Var, jh.f fVar) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean M1() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(int i10, s1 s1Var) {
        int i11 = this.f7024a;
    }

    @Override
    public void N0(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void O(MessageObject messageObject) {
        int i10 = this.f7024a;
    }

    @Override
    public void O1(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(MessageObject messageObject) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean R(s1 s1Var) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f7024a) {
            case 16:
            default:
                ze.d.s(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean S() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public CharacterStyle S1(s1 s1Var) {
        switch (this.f7024a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f7024a;
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f7024a;
    }

    @Override
    public void U(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void U0(int i10, s1 s1Var) {
        int i11 = this.f7024a;
    }

    @Override
    public boolean U1(s1 s1Var, MessageObject messageObject) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void V1() {
        int i10 = this.f7024a;
    }

    @Override
    public int W() {
        switch (this.f7024a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f7024a;
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f7024a;
    }

    @Override
    public ug.a Z() {
        switch (this.f7024a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f7024a;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean a0(s1 s1Var) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 b(Class cls) {
        switch (this.f7024a) {
            case 2:
                return new m0(true);
            default:
                return new w1.b();
        }
    }

    @Override
    public void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c0(s1 s1Var, TLRPC.User user) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c1(s1 s1Var, boolean z4) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public cv0 c2() {
        switch (this.f7024a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public Object d0(c5.j jVar) {
        switch (this.f7024a) {
            case 6:
                return new Object();
            default:
                return new cb.d(jVar.c(cb.i.class));
        }
    }

    @Override
    public void d1(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean e() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e1(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean e2(long j10) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f() {
        switch (this.f7024a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(int i10) {
        int i11 = this.f7024a;
    }

    @Override
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f7024a;
    }

    @Override
    public String g(s1 s1Var) {
        switch (this.f7024a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int h(Context context, String str, boolean z4) {
        return m6.e.d(context, str, z4);
    }

    @Override
    public boolean h1(int i10, s1 s1Var) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f7024a;
    }

    @Override
    public void i0(s1 s1Var, float f10, float f11) {
        int i10 = this.f7024a;
    }

    @Override
    public void j() {
        int i10 = this.f7024a;
    }

    @Override
    public void j2(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public Object k(Uri uri, g5.o oVar) {
        return Long.valueOf(d0.J(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override
    public int k0(s1 s1Var) {
        switch (this.f7024a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public long l() {
        return System.currentTimeMillis();
    }

    @Override
    public void l0(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void l2(s1 s1Var, long j10) {
        int i10 = this.f7024a;
    }

    @Override
    public void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f7024a;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        int i10 = this.f7024a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void n(s1 s1Var) {
        int i10 = this.f7024a;
    }

    public Signature[] n3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void o() {
        int i10 = this.f7024a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public p0 p(Class cls, v1.b bVar) {
        switch (this.f7024a) {
            case 2:
                return b(cls);
            default:
                return b(cls);
        }
    }

    @Override
    public boolean p0() {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p1() {
        int i10 = this.f7024a;
    }

    @Override
    public void q(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(k0.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f10 = ceil;
            float f11 = f10 / f10;
            float f12 = i13;
            float f13 = f12 / f12;
            while (ceil > 0 && i13 > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f11 = ceil / f10;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f13 = i13 / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f7024a;
    }

    @Override
    public void s0(String str) {
        int i10 = this.f7024a;
    }

    @Override
    public void s2(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void t(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean t0(u5 u5Var) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void u(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void u1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f7024a;
    }

    @Override
    public Object u2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = i11;
            i13 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void v0(s1 s1Var, float f10, float f11) {
        int i10 = this.f7024a;
    }

    @Override
    public void v2() {
        int i10 = this.f7024a;
    }

    @Override
    public String w(long j10) {
        switch (this.f7024a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int x() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f7024a;
    }

    @Override
    public void y(s1 s1Var) {
        int i10 = this.f7024a;
    }

    @Override
    public void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f7024a;
    }

    @Override
    public int z(Context context, String str) {
        return m6.e.a(context, str);
    }

    @Override
    public void z1(s1 s1Var, float f10, float f11) {
        int i10 = this.f7024a;
    }

    @Override
    public boolean z2(int i10) {
        switch (this.f7024a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    private final void A3() {
    }

    private final void B1() {
    }

    private final void B3() {
    }

    private final void C1() {
    }

    private final void F2() {
    }

    private final void G2() {
    }

    private final void J() {
    }

    private final void V() {
    }

    private final void h0() {
    }

    private final void j0() {
    }

    private final void o3() {
    }

    private final void p3() {
    }

    private final void s3() {
    }

    private final void t3() {
    }

    private final void w3() {
    }

    private final void x3() {
    }

    private final void A2(s1 s1Var) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void H0(s1 s1Var) {
    }

    private final void J0(s1 s1Var) {
    }

    private final void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void M0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void N2(String str) {
    }

    private final void O0(s1 s1Var) {
    }

    private final void O2(String str) {
    }

    private final void P0(s1 s1Var) {
    }

    private final void T2(s1 s1Var) {
    }

    private final void U2(s1 s1Var) {
    }

    private final void V0(s1 s1Var) {
    }

    private final void X(s1 s1Var) {
    }

    private final void X2(s1 s1Var) {
    }

    private final void Y(s1 s1Var) {
    }

    private final void Y0(s1 s1Var) {
    }

    private final void Y2(s1 s1Var) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b0(s1 s1Var) {
    }

    private final void b3(s1 s1Var) {
    }

    private final void c3(s1 s1Var) {
    }

    private final void d2(s1 s1Var) {
    }

    private final void e0(s1 s1Var) {
    }

    private final void f1(s1 s1Var) {
    }

    private final void f3(s1 s1Var) {
    }

    private final void g1(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final void h2(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m0(s1 s1Var) {
    }

    private final void m2(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void n0(s1 s1Var) {
    }

    private final void n2(s1 s1Var) {
    }

    private final void o2(s1 s1Var) {
    }

    private final void p2(s1 s1Var) {
    }

    private final void q1(s1 s1Var) {
    }

    private final void q2(s1 s1Var) {
    }

    private final void r0(s1 s1Var) {
    }

    private final void s1(s1 s1Var) {
    }

    private final void t1(s1 s1Var) {
    }

    private final void t2(s1 s1Var) {
    }

    private final void u0(s1 s1Var) {
    }

    private final void u3(int i10) {
    }

    private final void v1(s1 s1Var) {
    }

    private final void v3(int i10) {
    }

    private final void y3(MessageObject messageObject) {
    }

    private final void z3(MessageObject messageObject) {
    }

    private final void A1(int i10, s1 s1Var) {
    }

    private final void G(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void H(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void P2(s1 s1Var, long j10) {
    }

    private final void Q0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Q2(s1 s1Var, long j10) {
    }

    private final void T0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Z0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void a1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d3(s1 s1Var, jh.f fVar) {
    }

    private final void e3(s1 s1Var, jh.f fVar) {
    }

    private final void i2(s1 s1Var, TLRPC.Document document) {
    }

    private final void i3(s1 s1Var, boolean z4) {
    }

    private final void k1(int i10, s1 s1Var) {
    }

    private final void k2(s1 s1Var, TLRPC.Document document) {
    }

    private final void k3(s1 s1Var, boolean z4) {
    }

    private final void l1(int i10, s1 s1Var) {
    }

    private final void n1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void q0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y1(int i10, s1 s1Var) {
    }

    private final void C(s1 s1Var, float f10, float f11) {
    }

    private final void C0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final void D(s1 s1Var, float f10, float f11) {
    }

    private final void D1(s1 s1Var, float f10, float f11) {
    }

    private final void E1(s1 s1Var, float f10, float f11) {
    }

    private final void H2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void I2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void V2(s1 s1Var, float f10, float f11) {
    }

    private final void W2(s1 s1Var, float f10, float f11) {
    }

    private final void i1(s1 s1Var, int i10, int i11) {
    }

    private final void j1(s1 s1Var, int i10, int i11) {
    }

    private final void w2(s1 s1Var, float f10, float f11) {
    }

    private final void y2(s1 s1Var, float f10, float f11) {
    }

    private final void z0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public int P1(int i10, int i11, int i12) {
        return i10;
    }

    private final void G1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void J1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void J2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void K2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void w1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final void x1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final void N1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void X1(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void b2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void w0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void x0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
