package ob;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.s;
import c3.b0;
import c3.h0;
import c3.p;
import c3.q;
import c3.t;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d2.b;
import da.d;
import e2.d0;
import e9.i0;
import fb.o;
import g2.k;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n2.j;
import n2.l;
import n2.m;
import of.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.m71;
import org.telegram.ui.sv0;
import org.telegram.ui.tn;
import r4.c;
import x3.g;
import y2.n;
public final class a implements bg.a, q, cg.a, d, o, yi, n, m, q9.d, sg, l1, t0, c, Continuation, u5.a, s0, g, y6.d, m71 {
    public final int f16854a;

    public a(int i10) {
        this.f16854a = i10;
    }

    public static byte[] I2(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(b.f8065x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static boolean J2(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: ob.a.J2(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static String K2(bd.c cVar) {
        String str = cVar.f3865a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    @Override
    public b0 A1() {
        return new t(-9223372036854775807L);
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean C2(int i10) {
        return false;
    }

    @Override
    public boolean D1() {
        return false;
    }

    @Override
    public p9 G2() {
        return null;
    }

    @Override
    public boolean H0() {
        return true;
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public long L0(p pVar) {
        return -1L;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public int Q0(s sVar) {
        if (sVar.v != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public m2 T0() {
        return null;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(u1Var.getContext(), str);
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public long W() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public boolean Y1() {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public p0 c(Class cls) {
        return new w1.b();
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public void d0(lh lhVar) {
        lhVar.run();
    }

    @Override
    public n2.g d1(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new Exception()));
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public sv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        switch (this.f16854a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public p0 f1(Class cls, v1.b bVar) {
        return c(cls);
    }

    @Override
    public h0 f2(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public int h1() {
        return 0;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int j0(u1 u1Var) {
        return 0;
    }

    @Override
    public TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public void l0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean l1(long j3) {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public l m0(j jVar, s sVar) {
        return l.f16270u;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int a2 = cVar.a(context, str, true);
        lVar.f156b = a2;
        if (a2 != 0) {
            lVar.f157c = 1;
            return lVar;
        }
        int c10 = cVar.c(context, str);
        lVar.f155a = c10;
        if (c10 != 0) {
            lVar.f157c = -1;
        }
        return lVar;
    }

    @Override
    public void q0(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(b6 b6Var) {
        return false;
    }

    @Override
    public tn t0() {
        return null;
    }

    @Override
    public Object t2(Uri uri, k kVar) {
        return Long.valueOf(d0.S(new BufferedReader(new InputStreamReader(kVar)).readLine()));
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
    public boolean u1() {
        return false;
    }

    @Override
    public int v() {
        return 0;
    }

    @Override
    public da.b v2(t7.t tVar, JSONObject jSONObject) {
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
        ac.d dVar = new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j3 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j3 * 1000) + System.currentTimeMillis();
        }
        return new da.b(currentTimeMillis, aVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public void w0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.f4657q.w0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.f4656p.w0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public Object w2() {
        switch (this.f16854a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public TLRPC.Peer x() {
        return null;
    }

    @Override
    public Object x0(u5 u5Var) {
        switch (this.f16854a) {
            case 14:
                qb.g gVar = (qb.g) u5Var.a(qb.g.class);
                return new rb.a(0, false);
            case 15:
                qb.a aVar = (qb.a) u5Var.a(qb.a.class);
                return new qb.b(0);
            default:
                return new qb.k((Context) u5Var.a(Context.class));
        }
    }

    @Override
    public boolean y2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override
    public void A0() {
    }

    @Override
    public void D2() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void G() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void H2() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void M0() {
    }

    @Override
    public void O0() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void X() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void Y0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void h() {
    }

    @Override
    public void j2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void p() {
    }

    @Override
    public void p0() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void x1() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void y() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void y1() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void A2(long j3) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void C1(CharSequence charSequence) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void E1(long j3) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F1(w0 w0Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void Z(boolean z10) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void b0(w0 w0Var) {
    }

    @Override
    public void c1(u1 u1Var) {
    }

    @Override
    public void d2(b0 b0Var) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e1(u1 u1Var) {
    }

    @Override
    public void g1(int i10) {
    }

    @Override
    public void k0(u1 u1Var) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void l2(int i10) {
    }

    @Override
    public void n0(w0 w0Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void p1(TLRPC.User user) {
    }

    @Override
    public void p2(boolean z10) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void v0(w0 w0Var) {
    }

    @Override
    public void z(float f7) {
    }

    @Override
    public void D(Looper looper, j2.k kVar) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void K(float f7, int i10) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void U(w0 w0Var, int i10) {
    }

    @Override
    public void U0(int i10, u1 u1Var) {
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void n2(w0 w0Var, String str) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void P1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void i0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void m1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void r1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void B2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
