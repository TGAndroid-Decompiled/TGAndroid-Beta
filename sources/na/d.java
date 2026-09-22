package na;

import a3.m0;
import ai.z9;
import android.content.Context;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.k0;
import c3.b0;
import c3.h0;
import c3.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
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
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.x5;
import org.telegram.ui.pv0;
import qb.k;
import v2.l;
import v7.l8;
public class d implements m0, bg.a, q, q9.e, cg.a, n, q9.d, k1, r4.c, Continuation, l, xf.a, y6.d {
    public final int f15193a;

    public d(int i10) {
        this.f15193a = i10;
    }

    public static final CharSequence G3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static boolean o3(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: na.d.o3(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static short s3(short s10, short s11) {
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

    public static w z3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).f3075b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return l8.b(list);
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void A0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean A1() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B0(t1 t1Var, float f7, float f10) {
        int i10 = this.f15193a;
    }

    @Override
    public void C1(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void D0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void D1(t1 t1Var, boolean z10) {
        int i10 = this.f15193a;
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f15193a;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f15193a) {
            case 15:
                qb.a aVar = new qb.a();
                z9 z9Var = new z9(7);
                ReferenceQueue referenceQueue = aVar.f41227a;
                Set set = aVar.f41228b;
                set.add(new qb.l(aVar, referenceQueue, set, z9Var));
                Thread thread = new Thread(new s(24, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            case 20:
                return new k((Context) cVar.a(Context.class));
            default:
                return new Object();
        }
    }

    @Override
    public boolean G1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean H0(Context context) {
        return e0.b.p(context);
    }

    @Override
    public void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f15193a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f15193a;
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean I1() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K1(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void M(int i10, t1 t1Var) {
        int i11 = this.f15193a;
    }

    @Override
    public boolean M0(long j3) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void M1(MessageObject messageObject) {
        int i10 = this.f15193a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f15193a;
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f15193a) {
            case 17:
            default:
                nf.f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle O1(t1 t1Var) {
        switch (this.f15193a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean P() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        int i11 = this.f15193a;
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f15193a;
    }

    @Override
    public boolean Q(t1 t1Var) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q1(t1 t1Var, MessageObject messageObject) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f15193a;
    }

    @Override
    public void R1() {
        int i10 = this.f15193a;
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f15193a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(s3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f15193a;
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f15193a;
    }

    @Override
    public int V() {
        switch (this.f15193a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void X1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public hh.a Y() {
        switch (this.f15193a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public pv0 Y1() {
        switch (this.f15193a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public h0 Z1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long a() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean a0(t1 t1Var) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a2(long j3) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (q9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f41170a;
            if (str != null) {
                aVar = new q9.a(str, aVar.f41171b, aVar.f41172c, aVar.d, aVar.e, new ah.b(5, str, aVar), aVar.f41174g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f15193a;
    }

    @Override
    public boolean c(Context context) {
        return e0.b.l(context);
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public a3.l d(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.f142a = cVar.l(context, str);
        int i10 = 1;
        int d = cVar.d(context, str, true);
        lVar.f143b = d;
        int i11 = lVar.f142a;
        if (i11 == 0) {
            i11 = 0;
            if (d == 0) {
                i10 = 0;
                lVar.f144c = i10;
                return lVar;
            }
        }
        if (d < i11) {
            i10 = -1;
        }
        lVar.f144c = i10;
        return lVar;
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f15193a;
    }

    @Override
    public boolean e() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void e2(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean f() {
        switch (this.f15193a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.f15193a;
    }

    @Override
    public long g() {
        throw new NoSuchElementException();
    }

    @Override
    public void g2(t1 t1Var, long j3) {
        int i10 = this.f15193a;
    }

    @Override
    public String h(t1 t1Var) {
        switch (this.f15193a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int h0(t1 t1Var) {
        switch (this.f15193a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        int i10 = this.f15193a;
        return vl.a(messageObject);
    }

    @Override
    public void i(t1 t1Var, bi.f fVar) {
        int i10 = this.f15193a;
    }

    @Override
    public void i0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f15193a;
    }

    @Override
    public void k() {
        int i10 = this.f15193a;
    }

    @Override
    public void k1() {
        int i10 = this.f15193a;
    }

    @Override
    public boolean l0() {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f15193a;
    }

    @Override
    public void m2(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f15193a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public void o(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean o0(x5 x5Var) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p() {
        int i10 = this.f15193a;
    }

    @Override
    public void p1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f15193a;
    }

    @Override
    public Object p2() {
        switch (this.f15193a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.f15193a;
    }

    @Override
    public void q2() {
        int i10 = this.f15193a;
    }

    @Override
    public void r(t1 t1Var) {
        int i10 = this.f15193a;
    }

    public boolean r3(CharSequence charSequence) {
        return false;
    }

    @Override
    public void s() {
        int i10 = this.f15193a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f15193a;
    }

    @Override
    public void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f15193a;
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
    public void u(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void u1(t1 t1Var, float f7, float f10) {
        int i10 = this.f15193a;
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f15193a;
    }

    @Override
    public boolean v2(int i10) {
        switch (this.f15193a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f15193a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f15193a) {
            case 17:
                return true;
            default:
                return true;
        }
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
    public void x2() {
        int i10 = this.f15193a;
    }

    @Override
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hg.c.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f7 = remaining;
            float f10 = f7 / f7;
            float f11 = ceil;
            float f12 = f11 / f11;
            while (remaining > 0 && ceil > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f10 = remaining / f7;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f12 = ceil / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public void y0(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void y2(t1 t1Var, int i10, int i11) {
        int i12 = this.f15193a;
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f15193a;
    }

    @Override
    public void z0() {
        int i10 = this.f15193a;
    }

    @Override
    public r9 z2() {
        switch (this.f15193a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    public d(Context context) {
        this.f15193a = 11;
    }

    private final void A3() {
    }

    private final void B1() {
    }

    private final void B3() {
    }

    private final void E1() {
    }

    private final void E3() {
    }

    private final void F3() {
    }

    private final void G2() {
    }

    private final void H() {
    }

    private final void H2() {
    }

    private final void K() {
    }

    private final void c0() {
    }

    private final void g0() {
    }

    private final void p3() {
    }

    private final void q3() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    @Override
    public void B() {
    }

    @Override
    public void C() {
    }

    @Override
    public void J() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    private final void A2(t1 t1Var) {
    }

    private final void B2(t1 t1Var) {
    }

    private final void C3(MessageObject messageObject) {
    }

    private final void D3(MessageObject messageObject) {
    }

    private final void E2(t1 t1Var) {
    }

    private final void F2(t1 t1Var) {
    }

    private final void G0(t1 t1Var) {
    }

    private final void J0(t1 t1Var) {
    }

    private final void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O0(t1 t1Var) {
    }

    private final void O2(String str) {
    }

    private final void P2(String str) {
    }

    private final void Q0(t1 t1Var) {
    }

    private final void U(t1 t1Var) {
    }

    private final void U2(t1 t1Var) {
    }

    private final void V2(t1 t1Var) {
    }

    private final void W(t1 t1Var) {
    }

    private final void X(t1 t1Var) {
    }

    private final void Y0(t1 t1Var) {
    }

    private final void Y2(t1 t1Var) {
    }

    private final void Z(t1 t1Var) {
    }

    private final void Z2(t1 t1Var) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b3(MessageObject messageObject) {
    }

    private final void c3(t1 t1Var) {
    }

    private final void d3(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void g1(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j0(t1 t1Var) {
    }

    private final void j2(t1 t1Var) {
    }

    private final void k0(t1 t1Var) {
    }

    private final void k2(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void r0(t1 t1Var) {
    }

    private final void r1(t1 t1Var) {
    }

    private final void r2(t1 t1Var) {
    }

    private final void s0(t1 t1Var) {
    }

    private final void s1(t1 t1Var) {
    }

    private final void s2(t1 t1Var) {
    }

    private final void t1(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void v1(t1 t1Var) {
    }

    private final void w2(t1 t1Var) {
    }

    private final void x3(int i10) {
    }

    private final void y3(int i10) {
    }

    private final void D(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Q2(t1 t1Var, long j3) {
    }

    private final void R2(t1 t1Var, long j3) {
    }

    private final void T0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void U0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void b1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void e3(t1 t1Var, bi.f fVar) {
    }

    private final void f3(t1 t1Var, bi.f fVar) {
    }

    private final void j3(t1 t1Var, boolean z10) {
    }

    private final void l1(int i10, t1 t1Var) {
    }

    private final void l3(t1 t1Var, boolean z10) {
    }

    private final void m0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void n1(int i10, t1 t1Var) {
    }

    private final void n2(t1 t1Var, TLRPC.Document document) {
    }

    private final void o1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void o2(t1 t1Var, TLRPC.Document document) {
    }

    private final void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void v(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y1(int i10, t1 t1Var) {
    }

    private final void z1(int i10, t1 t1Var) {
    }

    private final void C0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void C2(t1 t1Var, float f7, float f10) {
    }

    private final void D2(t1 t1Var, float f7, float f10) {
    }

    private final void E0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void F1(t1 t1Var, float f7, float f10) {
    }

    private final void I2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void J1(t1 t1Var, float f7, float f10) {
    }

    private final void J2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void W2(t1 t1Var, float f7, float f10) {
    }

    private final void X2(t1 t1Var, float f7, float f10) {
    }

    private final void i1(t1 t1Var, int i10, int i11) {
    }

    private final void j1(t1 t1Var, int i10, int i11) {
    }

    private final void l(t1 t1Var, float f7, float f10) {
    }

    private final void m(t1 t1Var, float f7, float f10) {
    }

    private final void K2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void L2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void M2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void N2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void S1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void W1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void w1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void x1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void S2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void T2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void d2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void f2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void h2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void i2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void u0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void x0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
