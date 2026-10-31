package hb;

import a3.n0;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.b2;
import b2.w0;
import c3.b0;
import c3.g;
import c3.p;
import c3.t;
import c5.x;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.v;
import g2.y;
import gf.f;
import ib.b;
import j7.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;
import ki.h;
import li.c0;
import n6.k;
import org.telegram.messenger.c20;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.o61;
import org.telegram.ui.qs0;
import r4.c;
import r9.d;
import z3.m;
public final class a implements n0, g, fa.a, d, s, h, k, o61, l1, c, uf.a, v9.a, ai, x3.g, cn0, z3.k {
    public static a f7647b;
    public static a f7648c;
    public static a d;
    public final int f7649a;

    public a(int i10) {
        this.f7649a = i10;
    }

    public static short B0(short s10, short s11) {
        int i10;
        int i11 = s10 + 32768;
        int i12 = s11 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    public static void E0(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new nc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new nc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static Calendar k0() {
        if (f7648c == null) {
            f7648c = new a(18);
        }
        f7648c.getClass();
        return Calendar.getInstance();
    }

    public static k4.d p0(c0 c0Var, x xVar) {
        IOException iOException = (IOException) xVar.f3828c;
        if (iOException instanceof y) {
            int i10 = ((y) iOException).f7347c;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (c0Var.a(1)) {
                    return new k4.d(1, 300000L);
                }
                if (c0Var.a(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long t0(x xVar) {
        for (Throwable th2 = (IOException) xVar.f3828c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof w0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof v) && !(th2 instanceof y2.k)) {
                if ((th2 instanceof g2.k) && ((g2.k) th2).f7304a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((xVar.f3827b - 1) * 1000, 5000);
    }

    @Override
    public boolean A1(q1 q1Var, jj jjVar) {
        return false;
    }

    @Override
    public void B(boolean z10, float[] fArr) {
        t6.A0().e(z10, fArr);
    }

    @Override
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public b0 E() {
        return new t(-9223372036854775807L);
    }

    @Override
    public boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean F(b2.x xVar) {
        return false;
    }

    @Override
    public qs0 H1() {
        return null;
    }

    @Override
    public void I(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean I0(long j10) {
        return false;
    }

    @Override
    public Object K(bh.d dVar) {
        switch (this.f7649a) {
            case 7:
                return new ib.c(dVar.J(b.class));
            default:
                return new b(dVar.c(a.class));
        }
    }

    @Override
    public boolean K1(long j10) {
        return false;
    }

    @Override
    public boolean M0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(q1 q1Var) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S0(jj jjVar) {
        return f1.a(jjVar);
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public zg.a Y() {
        return null;
    }

    @Override
    public boolean Z(q1 q1Var) {
        return false;
    }

    @Override
    public boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((e) obj).v();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f9704a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f9705a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c2(int i10) {
        return false;
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public Object e(q qVar) {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(q1 q1Var) {
        return 0;
    }

    @Override
    public l9 g2() {
        return null;
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public StackTraceElement[] h0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public boolean k() {
        if (t6.A0().f32400i != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean k1(q1 q1Var, int i10) {
        return false;
    }

    @Override
    public m m(b2.x xVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public boolean m0(o5 o5Var) {
        return false;
    }

    @Override
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    public int q0(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void r(int i10, Object obj) {
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
    public boolean r1() {
        return false;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(B0(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public long w(p pVar) {
        return -1L;
    }

    @Override
    public boolean w0(jj jjVar) {
        return true;
    }

    @Override
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.r(q1Var.getContext(), str);
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public int y(b2.x xVar) {
        return 1;
    }

    @Override
    public CharacterStyle y1(q1 q1Var) {
        return null;
    }

    public a(j7.a aVar) {
        this.f7649a = 9;
    }

    public a() {
        this.f7649a = 11;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    @Override
    public void B1() {
    }

    @Override
    public void N() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void V() {
    }

    @Override
    public void X() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void finish() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void o() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void s() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A(q1 q1Var) {
    }

    @Override
    public void C0(q1 q1Var) {
    }

    @Override
    public void F0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void J(gj gjVar) {
    }

    @Override
    public void J0(q1 q1Var) {
    }

    @Override
    public void L(v2 v2Var) {
    }

    @Override
    public void M(q1 q1Var) {
    }

    @Override
    public void N0(q1 q1Var) {
    }

    @Override
    public void O(jj jjVar) {
    }

    @Override
    public void O0(q1 q1Var) {
    }

    @Override
    public void P1(q1 q1Var) {
    }

    @Override
    public void U(q1 q1Var) {
    }

    @Override
    public void X1(q1 q1Var) {
    }

    @Override
    public void a(float f7) {
    }

    @Override
    public void b0(long j10) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void d(b2 b2Var) {
    }

    @Override
    public long g(long j10) {
        return j10;
    }

    @Override
    public void g0(q1 q1Var) {
    }

    @Override
    public void l0(String str) {
    }

    @Override
    public void m1(q1 q1Var) {
    }

    @Override
    public void n(q1 q1Var) {
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void q(q1 q1Var) {
    }

    @Override
    public void t(q1 q1Var) {
    }

    @Override
    public void u(String str) {
    }

    @Override
    public void u1(q1 q1Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    @Override
    public void v1(jj jjVar) {
    }

    @Override
    public void x0(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void F1(q1 q1Var, c20 c20Var) {
    }

    @Override
    public void G(q1 q1Var, s2 s2Var) {
    }

    @Override
    public void J1(String str, String str2) {
    }

    @Override
    public void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(q1 q1Var, long j10) {
    }

    @Override
    public void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public void b(String str, Throwable th2) {
    }

    @Override
    public void c1(q1 q1Var, int i10) {
    }

    @Override
    public void n1(q1 q1Var, boolean z10) {
    }

    @Override
    public void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void s1(q1 q1Var, int i10) {
    }

    @Override
    public void A0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void D0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f1(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f2(q1 q1Var, int i10, int i11) {
    }

    @Override
    public void l1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void o0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void z0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void s0(q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
