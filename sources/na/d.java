package na;

import a3.m0;
import ai.aa;
import android.content.Context;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.k0;
import c3.b0;
import c3.h0;
import c3.q;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import fb.o;
import i9.s;
import i9.w;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.sv0;
import pi.k;
import qb.l;
import t7.t;
import v7.j8;
public final class d implements m0, bg.a, q, q9.e, da.d, o, q9.d, l1, k, OnFailureListener, r4.c, y6.c {
    public final int f16585a;

    public d(int i10) {
        this.f16585a = i10;
    }

    public static final CharSequence C3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static da.b d(t tVar) {
        return new da.b(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short o3(short s10, short s11) {
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

    public static w v3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).f3398b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return j8.b(list);
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f16585a;
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        switch (this.f16585a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean C2(int i10) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f16585a;
    }

    @Override
    public void E0() {
        int i10 = this.f16585a;
    }

    @Override
    public void E2() {
        int i10 = this.f16585a;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f16585a;
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
        int i12 = this.f16585a;
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16585a;
    }

    @Override
    public p9 G2() {
        switch (this.f16585a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean H1() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f16585a;
    }

    @Override
    public void I0(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void J1(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void K0(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
        int i10 = this.f16585a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f16585a;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f16585a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean R() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16585a;
    }

    @Override
    public void S0(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void S1(MessageObject messageObject) {
        int i10 = this.f16585a;
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f16585a) {
            case 17:
            default:
                of.f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void U0(int i10, u1 u1Var) {
        int i11 = this.f16585a;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        switch (this.f16585a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int V() {
        switch (this.f16585a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f16585a;
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(o3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void X1() {
        int i10 = this.f16585a;
    }

    @Override
    public hh.a Y() {
        switch (this.f16585a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f16585a;
    }

    @Override
    public int a(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public boolean a0(u1 u1Var) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f16585a;
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f16585a;
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (q9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f45944a;
            if (str != null) {
                aVar = new q9.a(str, aVar.f45945b, aVar.f45946c, aVar.d, aVar.f45947e, new ah.b(5, str, aVar), aVar.f45949g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int c(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void d2(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e0(int i10) {
        int i11 = this.f16585a;
    }

    @Override
    public void e1(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public sv0 e2() {
        switch (this.f16585a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean f() {
        switch (this.f16585a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean f0() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h0 f2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f16585a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g2(long j3) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16585a;
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16585a;
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f16585a;
    }

    @Override
    public int j0(u1 u1Var) {
        switch (this.f16585a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k() {
        int i10 = this.f16585a;
    }

    @Override
    public void k0(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void k1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void k2(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void m2(u1 u1Var, long j3) {
        int i10 = this.f16585a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f16585a;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        int i10 = this.f16585a;
        return c1.a(messageObject);
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean o0() {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public void p() {
        int i10 = this.f16585a;
    }

    @Override
    public void q1() {
        int i10 = this.f16585a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void r0(String str) {
        int i10 = this.f16585a;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f16585a;
    }

    @Override
    public boolean s0(b6 b6Var) {
        switch (this.f16585a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16585a;
    }

    @Override
    public void s2(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f16585a;
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16585a;
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f16585a;
    }

    @Override
    public da.b v2(t tVar, JSONObject jSONObject) {
        return d(tVar);
    }

    @Override
    public String w(long j3) {
        switch (this.f16585a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public Object w2() {
        switch (this.f16585a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public Object x0(u5 u5Var) {
        qb.a aVar = new qb.a();
        aa aaVar = new aa(7);
        ReferenceQueue referenceQueue = aVar.f46004a;
        Set set = aVar.f46005b;
        set.add(new l(aVar, referenceQueue, set, aaVar));
        Thread thread = new Thread(new s(25, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public void x2() {
        int i10 = this.f16585a;
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f16585a;
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f16585a;
    }

    public d(Context context) {
        this.f16585a = 11;
    }

    private final void A2() {
    }

    private final void A3() {
    }

    private final void B2() {
    }

    private final void B3() {
    }

    private final void J() {
    }

    private final void U() {
    }

    private final void m3() {
    }

    private final void n3() {
    }

    private final void r3() {
    }

    private final void s3() {
    }

    private final void v() {
    }

    private final void w1() {
    }

    private final void w3() {
    }

    private final void x() {
    }

    private final void x1() {
    }

    private final void x3() {
    }

    @Override
    public void C() {
    }

    @Override
    public void H() {
    }

    @Override
    public void K() {
    }

    @Override
    public void l0() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    private final void A0(u1 u1Var) {
    }

    private final void D(u1 u1Var) {
    }

    private final void G(u1 u1Var) {
    }

    private final void H0(u1 u1Var) {
    }

    private final void I1(u1 u1Var) {
    }

    private final void L1(u1 u1Var) {
    }

    private final void M0(u1 u1Var) {
    }

    private final void M2(String str) {
    }

    private final void N2(String str) {
    }

    private final void O0(u1 u1Var) {
    }

    private final void S2(u1 u1Var) {
    }

    private final void T0(u1 u1Var) {
    }

    private final void T2(u1 u1Var) {
    }

    private final void V0(u1 u1Var) {
    }

    private final void W(u1 u1Var) {
    }

    private final void W2(u1 u1Var) {
    }

    private final void X(u1 u1Var) {
    }

    private final void X2(u1 u1Var) {
    }

    private final void Y2(MessageObject messageObject) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a3(u1 u1Var) {
    }

    private final void b3(u1 u1Var) {
    }

    private final void c2(u1 u1Var) {
    }

    private final void d0(u1 u1Var) {
    }

    private final void e3(u1 u1Var) {
    }

    private final void f3(u1 u1Var) {
    }

    private final void g0(u1 u1Var) {
    }

    private final void g3(u1 u1Var) {
    }

    private final void i3(u1 u1Var) {
    }

    private final void j1(u1 u1Var) {
    }

    private final void j2(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final void l1(u1 u1Var) {
    }

    private final void l2(u1 u1Var) {
    }

    private final void l3(u1 u1Var) {
    }

    private final void m1(u1 u1Var) {
    }

    private final void n2(u1 u1Var) {
    }

    private final void o1(u1 u1Var) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void p2(u1 u1Var) {
    }

    private final void t0(u1 u1Var) {
    }

    private final void t3(int i10) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void u3(int i10) {
    }

    private final void v0(u1 u1Var) {
    }

    private final void w0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void y(u1 u1Var) {
    }

    private final void y0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void y2(u1 u1Var) {
    }

    private final void y3(MessageObject messageObject) {
    }

    private final void z(u1 u1Var) {
    }

    private final void z3(MessageObject messageObject) {
    }

    @Override
    public void log(String str) {
    }

    private final void J0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void L0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void O2(u1 u1Var, long j3) {
    }

    private final void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void P1(u1 u1Var, TLRPC.Document document) {
    }

    private final void P2(u1 u1Var, long j3) {
    }

    private final void Q0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void Y1(u1 u1Var, TLRPC.Document document) {
    }

    private final void Z(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void b0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void c3(u1 u1Var, bi.f fVar) {
    }

    private final void d1(int i10, u1 u1Var) {
    }

    private final void d3(u1 u1Var, bi.f fVar) {
    }

    private final void f1(int i10, u1 u1Var) {
    }

    private final void g1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void h1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void h3(u1 u1Var, boolean z10) {
    }

    private final void j3(u1 u1Var, boolean z10) {
    }

    private final void m(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void t1(int i10, u1 u1Var) {
    }

    private final void u1(int i10, u1 u1Var) {
    }

    @Override
    public void error(String str, Throwable th2) {
    }

    @Override
    public void q0(int i10, Object obj) {
    }

    private final void D2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void H2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void U2(u1 u1Var, float f7, float f10) {
    }

    private final void V2(u1 u1Var, float f7, float f10) {
    }

    private final void Y0(u1 u1Var, int i10, int i11) {
    }

    private final void Z0(u1 u1Var, int i10, int i11) {
    }

    private final void h(u1 u1Var, float f7, float f10) {
    }

    private final void l(u1 u1Var, float f7, float f10) {
    }

    private final void n0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void p0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void q2(u1 u1Var, float f7, float f10) {
    }

    private final void t2(u1 u1Var, float f7, float f10) {
    }

    private final void y1(u1 u1Var, float f7, float f10) {
    }

    private final void z1(u1 u1Var, float f7, float f10) {
    }

    private final void A1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void C1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void I2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void J2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void K2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void L2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void p1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void r1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void D1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void E1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void F1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void G1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void Q2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void R2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void i0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void m0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void p3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
