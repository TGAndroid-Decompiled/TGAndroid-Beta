package ab;

import a4.h;
import af.g;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.biometric.k;
import c9.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.i;
import d4.j;
import d4.z;
import g5.b0;
import g5.e0;
import g5.g0;
import g5.j0;
import g5.l0;
import g5.n;
import g5.o0;
import j$.util.concurrent.ConcurrentHashMap;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import jh.f;
import l7.w0;
import m6.d;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.u5;
import org.telegram.ui.vu0;
import p2.w;
import p9.b;
import r0.s;
import ra.m;
import u4.l;
import u4.o;
import u4.p;
import x6.c;
public final class a implements h, OnFailureListener, j, Continuation, j0, kf.a, d, of.a, k1, b, s, m, p, com.google.android.gms.common.api.internal.s, e {
    public static a f147b;
    public final int f148a;

    public a(int i10) {
        this.f148a = i10;
    }

    public static c4.e m3(g0 g0Var, w wVar) {
        IOException iOException = (IOException) wVar.f41030c;
        if (iOException instanceof e0) {
            int i10 = ((e0) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (g0Var.a(1)) {
                    return new c4.e(1, 300000L);
                }
                if (g0Var.a(2)) {
                    return new c4.e(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long o3(w wVar) {
        Throwable th2 = (IOException) wVar.f41030c;
        if (!(th2 instanceof r1) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof b0) && !(th2 instanceof l0)) {
            int i10 = n.f6395b;
            while (th2 != null) {
                if (!(th2 instanceof n) || ((n) th2).f6396a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((wVar.f41029b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static boolean p3(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: ab.a.p3(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static MediaCodec x(i iVar) {
        iVar.f4160a.getClass();
        String str = iVar.f4160a.f4164a;
        h5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        h5.a.q();
        return createByCodecName;
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f148a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void A2() {
        int i10 = this.f148a;
    }

    @Override
    public void B0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void B2(t1 t1Var, int i10, int i11) {
        int i12 = this.f148a;
    }

    @Override
    public void C0() {
        int i10 = this.f148a;
    }

    @Override
    public n9 C2() {
        switch (this.f148a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean D1() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f148a;
    }

    @Override
    public void E0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f148a;
    }

    @Override
    public void E1(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void F0(t1 t1Var, float f10, float f11) {
        int i10 = this.f148a;
    }

    @Override
    public void G1(t1 t1Var, boolean z4) {
        int i10 = this.f148a;
    }

    @Override
    public void H0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f148a;
    }

    @Override
    public boolean I1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public o0 J() {
        return new o(l.f45056n, null);
    }

    @Override
    public void J0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f148a;
    }

    @Override
    public boolean K1() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void L0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void M(t1 t1Var, f fVar) {
        int i10 = this.f148a;
    }

    @Override
    public void M1(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void N(int i10, t1 t1Var) {
        int i11 = this.f148a;
    }

    @Override
    public void O(MessageObject messageObject) {
        int i10 = this.f148a;
    }

    @Override
    public boolean O0(long j10) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(MessageObject messageObject) {
        int i10 = this.f148a;
    }

    @Override
    public boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f148a) {
            case 16:
            default:
                g.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean Q() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R(t1 t1Var) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(int i10, t1 t1Var) {
        int i11 = this.f148a;
    }

    @Override
    public CharacterStyle R1(t1 t1Var) {
        switch (this.f148a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean S() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f148a;
    }

    @Override
    public void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f148a;
    }

    @Override
    public void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f148a;
    }

    @Override
    public boolean T1(t1 t1Var, MessageObject messageObject) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void V1() {
        int i10 = this.f148a;
    }

    @Override
    public int W() {
        switch (this.f148a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f148a;
    }

    @Override
    public void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f148a;
    }

    @Override
    public boolean Y0(t1 t1Var, boolean z4) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f148a;
    }

    @Override
    public ug.a Z() {
        switch (this.f148a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a() {
        synchronized (h5.a.h) {
            Object obj = h5.a.f6922i;
            synchronized (obj) {
                if (h5.a.f6923j) {
                    return;
                }
                long a2 = h5.a.a();
                synchronized (obj) {
                    h5.a.f6924k = a2;
                    h5.a.f6923j = true;
                }
            }
        }
    }

    @Override
    public boolean a0(t1 t1Var) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public vu0 a2() {
        switch (this.f148a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x6.d dVar = (x6.d) ((x6.e) obj).u();
        p6.b bVar = new p6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = c.f46829a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f46830a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public boolean b(Context context) {
        return false;
    }

    @Override
    public long c(r3.l lVar) {
        return -1L;
    }

    @Override
    public boolean d() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d0(t1 t1Var, TLRPC.User user) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d1(int i10, t1 t1Var) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d2(long j10) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f148a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f148a;
    }

    @Override
    public o0 f(l lVar, u4.i iVar) {
        return new o(lVar, iVar);
    }

    @Override
    public Object f0(c5.j jVar) {
        cb.a aVar = new cb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(1);
        ReferenceQueue referenceQueue = aVar.f2209a;
        Set set = aVar.f2210b;
        set.add(new cb.n(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new k(referenceQueue, set, false, 1), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f148a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(int i10) {
        int i11 = this.f148a;
    }

    @Override
    public p9.a h(db.a aVar, JSONObject jSONObject) {
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
        return new p9.a(currentTimeMillis, cVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public boolean h0() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f148a;
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.f148a;
    }

    @Override
    public void i2(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void j() {
        int i10 = this.f148a;
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        int i10 = this.f148a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public r3.s k() {
        return new r3.n(-9223372036854775807L);
    }

    @Override
    public int k0(t1 t1Var) {
        switch (this.f148a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k2(t1 t1Var, long j10) {
        int i10 = this.f148a;
    }

    @Override
    public boolean l(Context context) {
        return false;
    }

    @Override
    public void l0(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void l1() {
        int i10 = this.f148a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f148a;
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public boolean n0() {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    public int n3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void o() {
        int i10 = this.f148a;
    }

    @Override
    public void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f148a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public e8.a p(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        int p10 = cVar.p(context, str, true);
        aVar.f5157b = p10;
        if (p10 != 0) {
            aVar.f5158c = 1;
            return aVar;
        }
        int C = cVar.C(context, str);
        aVar.f5156a = C;
        if (C != 0) {
            aVar.f5158c = -1;
        }
        return aVar;
    }

    @Override
    public void p0(String str) {
        int i10 = this.f148a;
    }

    @Override
    public boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public boolean q0(u5 u5Var) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q2(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void r1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f148a;
    }

    @Override
    public void s() {
        int i10 = this.f148a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.f148a;
    }

    @Override
    public Object s2() {
        switch (this.f148a) {
            case 22:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void t2() {
        int i10 = this.f148a;
    }

    @Override
    public Object then(Task task) {
        switch (this.f148a) {
            case 6:
                if (!task.isSuccessful()) {
                    Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    @Override
    public void u(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f148a;
    }

    @Override
    public String w(long j10) {
        switch (this.f148a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public d4.k w1(i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = x(iVar);
            h5.a.c("configureCodec");
            mediaCodec.configure(iVar.f4161b, iVar.d, iVar.e, 0);
            h5.a.q();
            h5.a.c("startCodec");
            mediaCodec.start();
            h5.a.q();
            return new z(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override
    public void x1(t1 t1Var, float f10, float f11) {
        int i10 = this.f148a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f148a;
    }

    @Override
    public void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f148a;
    }

    @Override
    public boolean y2(int i10) {
        switch (this.f148a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.f148a;
    }

    public a(x6.a aVar) {
        this.f148a = 25;
    }

    public a(Context context, r3.i iVar) {
        this.f148a = 14;
        f7.b bVar = new f7.b(context, 4);
        w0 w0Var = new w0(iVar, 16);
        if (bVar != ((f7.b) w0Var.d)) {
            w0Var.d = bVar;
            ((HashMap) w0Var.f11676b).clear();
            ((HashMap) w0Var.f11677c).clear();
        }
    }

    private final void A1() {
    }

    private final void B1() {
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void E2() {
    }

    private final void F2() {
    }

    private final void G() {
    }

    private final void H() {
    }

    private final void b0() {
    }

    private final void c0() {
    }

    private final void q3() {
    }

    private final void r3() {
    }

    private final void u3() {
    }

    private final void v3() {
    }

    private final void y3() {
    }

    private final void z3() {
    }

    @Override
    public void r() {
    }

    private final void A3(MessageObject messageObject) {
    }

    private final void B3(MessageObject messageObject) {
    }

    private final void D0(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void G0(t1 t1Var) {
    }

    private final void I0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void K(t1 t1Var) {
    }

    private final void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void M0(t1 t1Var) {
    }

    private final void M2(String str) {
    }

    private final void N0(t1 t1Var) {
    }

    private final void N2(String str) {
    }

    private final void S2(t1 t1Var) {
    }

    private final void T2(t1 t1Var) {
    }

    private final void V(t1 t1Var) {
    }

    private final void V0(t1 t1Var) {
    }

    private final void W2(t1 t1Var) {
    }

    private final void X(t1 t1Var) {
    }

    private final void X0(t1 t1Var) {
    }

    private final void X2(t1 t1Var) {
    }

    private final void Y(t1 t1Var) {
    }

    private final void Y2(MessageObject messageObject) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a3(t1 t1Var) {
    }

    private final void b3(t1 t1Var) {
    }

    private final void c2(t1 t1Var) {
    }

    private final void e0(t1 t1Var) {
    }

    private final void e1(t1 t1Var) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void g2(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j0(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void l2(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final void m2(t1 t1Var) {
    }

    private final void n2(t1 t1Var) {
    }

    private final void o2(t1 t1Var) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void q1(t1 t1Var) {
    }

    private final void r0(t1 t1Var) {
    }

    private final void r2(t1 t1Var) {
    }

    private final void s1(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void t1(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void w3(int i10) {
    }

    private final void x3(int i10) {
    }

    private final void z2(t1 t1Var) {
    }

    @Override
    public void v(long j10) {
    }

    private final void C(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void D(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O2(t1 t1Var, long j10) {
    }

    private final void P2(t1 t1Var, long j10) {
    }

    private final void Q0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void S0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void b1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void c1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void c3(t1 t1Var, f fVar) {
    }

    private final void d3(t1 t1Var, f fVar) {
    }

    private final void h2(t1 t1Var, TLRPC.Document document) {
    }

    private final void h3(t1 t1Var, boolean z4) {
    }

    private final void i1(int i10, t1 t1Var) {
    }

    private final void j2(t1 t1Var, TLRPC.Document document) {
    }

    private final void j3(t1 t1Var, boolean z4) {
    }

    private final void k1(int i10, t1 t1Var) {
    }

    private final void m0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void m1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void n1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void o0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y1(int i10, t1 t1Var) {
    }

    private final void z1(int i10, t1 t1Var) {
    }

    private final void B(t1 t1Var, float f10, float f11) {
    }

    private final void C1(t1 t1Var, float f10, float f11) {
    }

    private final void F1(t1 t1Var, float f10, float f11) {
    }

    private final void G2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void H2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void U2(t1 t1Var, float f10, float f11) {
    }

    private final void V2(t1 t1Var, float f10, float f11) {
    }

    private final void g1(t1 t1Var, int i10, int i11) {
    }

    private final void h1(t1 t1Var, int i10, int i11) {
    }

    private final void w0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void w2(t1 t1Var, float f10, float f11) {
    }

    private final void x0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void x2(t1 t1Var, float f10, float f11) {
    }

    private final void z(t1 t1Var, float f10, float f11) {
    }

    @Override
    public int N1(int i10, int i11, int i12) {
        return i10;
    }

    private final void H1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void I2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void J2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void K2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void L1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void L2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void u1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void v1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z4) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final void Q1(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void Q2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void R2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void U1(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void W1(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void b2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void u0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void v0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void s3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
