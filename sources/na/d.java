package na;

import a3.m0;
import ai.j;
import android.content.Context;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.k0;
import bi.u6;
import c3.b0;
import c3.h0;
import c3.p;
import c3.q;
import c3.t;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import fb.n;
import i9.s;
import i9.w;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import n7.a1;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import v2.l;
import v7.o8;
import y2.k;
import ye.h;
public class d implements m0, ag.a, bg.a, q, cf.b, n, q9.d, k1, r4.c, Continuation, l, x3.g, y6.d, k {
    public final int f14025a;

    public d(int i10) {
        this.f14025a = i10;
    }

    public static w B3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).f1771b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return o8.b(list);
    }

    public static final CharSequence I3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static boolean r3(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: na.d.r3(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void A0() {
        int i10 = this.f14025a;
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f14025a;
    }

    @Override
    public void B1(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
        int i10 = this.f14025a;
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
        int i10 = this.f14025a;
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f14025a;
    }

    @Override
    public void E(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void E0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f14025a;
    }

    @Override
    public void G0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean G1() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f14025a;
    }

    @Override
    public h0 I(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void I1(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public int J1(int i10, int i11, int i12) {
        ag.a aVar;
        if (i11 == 6) {
            aVar = ag.a.f407l;
        } else if (i11 > i12) {
            aVar = ag.a.f404i;
        } else if (i11 < i12) {
            aVar = ag.a.f405j;
        } else {
            aVar = ag.a.f406k;
        }
        return aVar.J1(i10, i11, i12);
    }

    @Override
    public void K(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void K1(MessageObject messageObject) {
        int i10 = this.f14025a;
    }

    @Override
    public void L(int i10, t1 t1Var) {
        int i11 = this.f14025a;
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f14025a) {
            case 17:
            default:
                nf.f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean M0(long j3) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        switch (this.f14025a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f14025a;
    }

    @Override
    public boolean O() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P(t1 t1Var) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        int i11 = this.f14025a;
    }

    @Override
    public Object P1(u6 u6Var) {
        switch (this.f14025a) {
            case 15:
                qb.a aVar = new qb.a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(6);
                ReferenceQueue referenceQueue = aVar.f40608a;
                Set set = aVar.f40609b;
                set.add(new qb.l(aVar, referenceQueue, set, nVar));
                Thread thread = new Thread(new s(24, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            case 20:
                return new qb.k((Context) u6Var.a(Context.class));
            default:
                return new Object();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1() {
        int i10 = this.f14025a;
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f14025a;
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f14025a;
    }

    @Override
    public void S(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        ag.a aVar;
        if (i10 == 6) {
            aVar = ag.a.f407l;
        } else if (i10 > i11) {
            aVar = ag.a.f404i;
        } else if (i10 < i11) {
            aVar = ag.a.f405j;
        } else {
            aVar = ag.a.f406k;
        }
        aVar.S0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public void S1(t1 t1Var, j jVar) {
        int i10 = this.f14025a;
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f14025a;
    }

    @Override
    public int U() {
        switch (this.f14025a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f14025a;
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public gh.a X() {
        switch (this.f14025a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public rv0 X1() {
        switch (this.f14025a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Y(t1 t1Var) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y1(long j3) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f14025a;
    }

    @Override
    public void a() {
        synchronized (z2.b.f47193a) {
            Object obj = z2.b.f47194b;
            synchronized (obj) {
                if (z2.b.f47195c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f47195c = true;
                }
            }
        }
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long b() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long c(p pVar) {
        return -1L;
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f14025a;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public long d() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean d0() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2(t1 t1Var, long j3) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean f() {
        switch (this.f14025a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.f14025a;
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f14025a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        int i10 = this.f14025a;
        return em.a(messageObject);
    }

    @Override
    public b0 h() {
        return new t(-9223372036854775807L);
    }

    @Override
    public int h0(t1 t1Var) {
        switch (this.f14025a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f14025a;
    }

    @Override
    public void i0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void j() {
        int i10 = this.f14025a;
    }

    @Override
    public void j1() {
        int i10 = this.f14025a;
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void k2(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean l0() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f14025a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f14025a;
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f14025a;
    }

    @Override
    public Object n2() {
        switch (this.f14025a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public void o() {
        int i10 = this.f14025a;
    }

    @Override
    public boolean o0(y5 y5Var) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f14025a;
    }

    @Override
    public void o2() {
        int i10 = this.f14025a;
    }

    @Override
    public a3.l p(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int h = cVar.h(context, str, true);
        lVar.f141b = h;
        if (h != 0) {
            lVar.f142c = 1;
            return lVar;
        }
        int F = cVar.F(context, str);
        lVar.f140a = F;
        if (F != 0) {
            lVar.f142c = -1;
        }
        return lVar;
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.f14025a;
    }

    @Override
    public void r() {
        int i10 = this.f14025a;
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f14025a;
    }

    @Override
    public void s(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void s0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hc.b.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f7 = ceil;
            float f10 = f7 / f7;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f7;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f12 = i13 / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean t2(int i10) {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
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
    public cf.a u(a1 a1Var) {
        return new h(a1Var);
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f14025a;
    }

    public boolean u3(CharSequence charSequence) {
        return false;
    }

    @Override
    public String v(long j3) {
        switch (this.f14025a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void v2() {
        int i10 = this.f14025a;
    }

    @Override
    public void w() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f14025a;
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
        int i12 = this.f14025a;
    }

    @Override
    public void x(int i10, Object obj) {
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
    public boolean x0(MessageObject messageObject) {
        switch (this.f14025a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public t9 x2() {
        switch (this.f14025a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public void z0(t1 t1Var) {
        int i10 = this.f14025a;
    }

    @Override
    public boolean z1() {
        switch (this.f14025a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void J2() {
    }

    private final void K2() {
    }

    private final void W1() {
    }

    private final void Z() {
    }

    private final void a0() {
    }

    private final void b2() {
    }

    private final void m0() {
    }

    private final void p0() {
    }

    private final void s3() {
    }

    private final void t3() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    @Override
    public void B() {
    }

    @Override
    public void C() {
    }

    @Override
    public void T() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    private final void A2(t1 t1Var) {
    }

    private final void A3(int i10) {
    }

    private final void B2(t1 t1Var) {
    }

    private final void C2(t1 t1Var) {
    }

    private final void D0(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void E2(t1 t1Var) {
    }

    private final void E3(MessageObject messageObject) {
    }

    private final void F0(t1 t1Var) {
    }

    private final void F3(MessageObject messageObject) {
    }

    private final void H2(t1 t1Var) {
    }

    private final void I2(t1 t1Var) {
    }

    private final void O0(t1 t1Var) {
    }

    private final void Q0(t1 t1Var) {
    }

    private final void R2(String str) {
    }

    private final void S2(String str) {
    }

    private final void T0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void U0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void X2(t1 t1Var) {
    }

    private final void Y0(t1 t1Var) {
    }

    private final void Y2(t1 t1Var) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void b3(t1 t1Var) {
    }

    private final void c3(t1 t1Var) {
    }

    private final void d3(MessageObject messageObject) {
    }

    private final void e0(t1 t1Var) {
    }

    private final void e1(t1 t1Var) {
    }

    private final void e3(MessageObject messageObject) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void g0(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void j0(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k0(t1 t1Var) {
    }

    private final void k1(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final void m1(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void p3(t1 t1Var) {
    }

    private final void q2(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r0(t1 t1Var) {
    }

    private final void s2(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void v1(t1 t1Var) {
    }

    private final void w1(t1 t1Var) {
    }

    private final void x1(t1 t1Var) {
    }

    private final void y1(t1 t1Var) {
    }

    private final void z2(t1 t1Var) {
    }

    private final void z3(int i10) {
    }

    @Override
    public void G(b0 b0Var) {
    }

    @Override
    public void y(long j3) {
    }

    private final void H1(int i10, t1 t1Var) {
    }

    private final void R1(int i10, t1 t1Var) {
    }

    private final void T2(t1 t1Var, long j3) {
    }

    private final void U2(t1 t1Var, long j3) {
    }

    private final void V(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void W(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void b1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void d1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void h1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h3(t1 t1Var, j jVar) {
    }

    private final void i1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void i3(t1 t1Var, j jVar) {
    }

    private final void m3(t1 t1Var, boolean z10) {
    }

    private final void o3(t1 t1Var, boolean z10) {
    }

    private final void q1(int i10, t1 t1Var) {
    }

    private final void r1(int i10, t1 t1Var) {
    }

    private final void s1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void u1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void u2(t1 t1Var, TLRPC.Document document) {
    }

    private final void v0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y2(t1 t1Var, TLRPC.Document document) {
    }

    private final void F(t1 t1Var, float f7, float f10) {
    }

    private final void F2(t1 t1Var, float f7, float f10) {
    }

    private final void G2(t1 t1Var, float f7, float f10) {
    }

    private final void J(t1 t1Var, float f7, float f10) {
    }

    private final void K0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void L0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void L2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void M2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void Z2(t1 t1Var, float f7, float f10) {
    }

    private final void a3(t1 t1Var, float f7, float f10) {
    }

    private final void d2(t1 t1Var, float f7, float f10) {
    }

    private final void f2(t1 t1Var, float f7, float f10) {
    }

    private final void n1(t1 t1Var, int i10, int i11) {
    }

    private final void p1(t1 t1Var, int i10, int i11) {
    }

    private final void A1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void D1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void N2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void O2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void P2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Q2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void g2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void h2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void V2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void W2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void m2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void p2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void H0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void J0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void v3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void w3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
