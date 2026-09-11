package ob;

import ah.i0;
import ah.u;
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
import e0.b;
import fb.n;
import i2.g;
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
import of.f;
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
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import q9.d;
import q9.e;
import qb.k;
import r4.c;
import v2.l;
import v7.l8;
public class a implements bg.a, q, e, cg.a, n, d, k1, c, Continuation, l, xf.a, y6.d {
    public final int f16988a;

    public a(int i10) {
        this.f16988a = i10;
    }

    public static final CharSequence D3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static boolean l3(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: ob.a.l3(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static short p3(short s10, short s11) {
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

    public static w w3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).f2127b == null) {
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
        int i10 = this.f16988a;
    }

    @Override
    public void A0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean B1() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void C0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public Object D(cf.c cVar) {
        switch (this.f16988a) {
            case 15:
                qb.a aVar = new qb.a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(7);
                ReferenceQueue referenceQueue = aVar.f44269a;
                Set set = aVar.f44270b;
                set.add(new qb.l(aVar, referenceQueue, set, nVar));
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
    public void D1(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean E0(Context context) {
        return b.p(context);
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void F1(MessageObject messageObject) {
        int i10 = this.f16988a;
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f16988a) {
            case 17:
            default:
                f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        switch (this.f16988a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean I0(long j3) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f16988a;
    }

    @Override
    public void J0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K1(t1 t1Var, u uVar) {
        int i10 = this.f16988a;
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void L0(int i10, t1 t1Var) {
        int i11 = this.f16988a;
    }

    @Override
    public void L1() {
        int i10 = this.f16988a;
    }

    @Override
    public void M(int i10, t1 t1Var) {
        int i11 = this.f16988a;
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f16988a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f16988a;
    }

    @Override
    public void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f16988a;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(p3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean Q(t1 t1Var) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f16988a;
    }

    @Override
    public ov0 Q1() {
        switch (this.f16988a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean R() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(t1 t1Var, boolean z10) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h0 R1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16988a;
    }

    @Override
    public void S0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean S1(long j3) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16988a;
    }

    @Override
    public void U0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int V() {
        switch (this.f16988a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W1(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean X0(int i10, t1 t1Var) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public ih.a Y() {
        switch (this.f16988a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y1(t1 t1Var, long j3) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean Z(t1 t1Var) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long a() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean a0(t1 t1Var, TLRPC.User user) {
        switch (this.f16988a) {
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
            String str = aVar.f44209a;
            if (str != null) {
                aVar = new q9.a(str, aVar.f44210b, aVar.f44211c, aVar.d, aVar.f44212e, new i0(6, str, aVar), aVar.f44214g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean c() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f16988a;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        int i10 = this.f16988a;
        return vl.a(messageObject);
    }

    @Override
    public long d() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean d0() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e(Context context) {
        return b.l(context);
    }

    @Override
    public void e0(t1 t1Var, float f7, float f10) {
        int i10 = this.f16988a;
    }

    @Override
    public void e1() {
        int i10 = this.f16988a;
    }

    @Override
    public void e2(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean f() {
        switch (this.f16988a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(t1 t1Var) {
        switch (this.f16988a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f16988a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16988a;
    }

    @Override
    public a3.k h(Context context, String str, y6.c cVar) {
        a3.k kVar = new a3.k();
        kVar.f129a = cVar.e(context, str);
        int i10 = 1;
        int b10 = cVar.b(context, str, true);
        kVar.f130b = b10;
        int i11 = kVar.f129a;
        if (i11 == 0) {
            i11 = 0;
            if (b10 == 0) {
                i10 = 0;
                kVar.f131c = i10;
                return kVar;
            }
        }
        if (b10 < i11) {
            i10 = -1;
        }
        kVar.f131c = i10;
        return kVar;
    }

    @Override
    public Object h2() {
        switch (this.f16988a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f16988a;
    }

    @Override
    public void i2() {
        int i10 = this.f16988a;
    }

    @Override
    public void j() {
        int i10 = this.f16988a;
    }

    @Override
    public boolean j0() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f16988a;
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f16988a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f16988a;
    }

    @Override
    public void m0(String str) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean m2(int i10) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public boolean n0(z5 z5Var) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public void o() {
        int i10 = this.f16988a;
    }

    @Override
    public void o1(t1 t1Var, float f7, float f10) {
        int i10 = this.f16988a;
    }

    @Override
    public void o2() {
        int i10 = this.f16988a;
    }

    public boolean o3(CharSequence charSequence) {
        return false;
    }

    @Override
    public void p0(t1 t1Var, float f7, float f10) {
        int i10 = this.f16988a;
    }

    @Override
    public void p2(t1 t1Var, int i10, int i11) {
        int i12 = this.f16988a;
    }

    @Override
    public r9 q2() {
        switch (this.f16988a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void r(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void s() {
        int i10 = this.f16988a;
    }

    @Override
    public void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f16988a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void t0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f16988a;
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
        int i10 = this.f16988a;
    }

    @Override
    public boolean u0(MessageObject messageObject) {
        switch (this.f16988a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean u1() {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void v0(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void v1(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public String w(long j3) {
        switch (this.f16988a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0() {
        int i10 = this.f16988a;
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
        int i10 = this.f16988a;
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
    public void x0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f16988a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f16988a;
    }

    @Override
    public void y0(t1 t1Var, float f7, float f10) {
        int i10 = this.f16988a;
    }

    @Override
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(g.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f16988a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    public a(Context context) {
        this.f16988a = 11;
    }

    private final void B() {
    }

    private final void B3() {
    }

    private final void C() {
    }

    private final void C1() {
    }

    private final void C3() {
    }

    private final void D2() {
    }

    private final void E2() {
    }

    private final void U() {
    }

    private final void V1() {
    }

    private final void W() {
    }

    private final void m3() {
    }

    private final void n3() {
    }

    private final void s3() {
    }

    private final void t3() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    private final void A3(MessageObject messageObject) {
    }

    private final void B0(t1 t1Var) {
    }

    private final void B2(t1 t1Var) {
    }

    private final void C2(t1 t1Var) {
    }

    private final void D0(t1 t1Var) {
    }

    private final void G(t1 t1Var) {
    }

    private final void G0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void H(t1 t1Var) {
    }

    private final void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void J(t1 t1Var) {
    }

    private final void K(t1 t1Var) {
    }

    private final void K0(t1 t1Var) {
    }

    private final void L2(String str) {
    }

    private final void M0(t1 t1Var) {
    }

    private final void M2(String str) {
    }

    private final void R2(t1 t1Var) {
    }

    private final void S2(t1 t1Var) {
    }

    private final void V0(t1 t1Var) {
    }

    private final void V2(t1 t1Var) {
    }

    private final void W0(t1 t1Var) {
    }

    private final void W2(t1 t1Var) {
    }

    private final void X(t1 t1Var) {
    }

    private final void X2(MessageObject messageObject) {
    }

    private final void Y2(MessageObject messageObject) {
    }

    private final void Z2(t1 t1Var) {
    }

    private final void a3(t1 t1Var) {
    }

    private final void b0(t1 t1Var) {
    }

    private final void b1(t1 t1Var) {
    }

    private final void d1(t1 t1Var) {
    }

    private final void d3(t1 t1Var) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k0(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void l0(t1 t1Var) {
    }

    private final void l2(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n2(t1 t1Var) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void q1(t1 t1Var) {
    }

    private final void r1(t1 t1Var) {
    }

    private final void t2(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void u3(int i10) {
    }

    private final void v2(t1 t1Var) {
    }

    private final void v3(int i10) {
    }

    private final void w2(t1 t1Var) {
    }

    private final void x2(t1 t1Var) {
    }

    private final void y2(t1 t1Var) {
    }

    private final void z3(MessageObject messageObject) {
    }

    private final void N2(t1 t1Var, long j3) {
    }

    private final void O2(t1 t1Var, long j3) {
    }

    private final void P0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void T0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Y0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void a1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void b3(t1 t1Var, u uVar) {
    }

    private final void c3(t1 t1Var, u uVar) {
    }

    private final void g3(t1 t1Var, boolean z10) {
    }

    private final void h0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void i0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void i1(int i10, t1 t1Var) {
    }

    private final void i3(t1 t1Var, boolean z10) {
    }

    private final void k1(int i10, t1 t1Var) {
    }

    private final void l1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void m1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void p(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void r2(t1 t1Var, TLRPC.Document document) {
    }

    private final void s2(t1 t1Var, TLRPC.Document document) {
    }

    private final void x1(int i10, t1 t1Var) {
    }

    private final void y1(int i10, t1 t1Var) {
    }

    private final void A2(t1 t1Var, float f7, float f10) {
    }

    private final void F2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void G2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void T2(t1 t1Var, float f7, float f10) {
    }

    private final void U2(t1 t1Var, float f7, float f10) {
    }

    private final void X1(t1 t1Var, float f7, float f10) {
    }

    private final void Z1(t1 t1Var, float f7, float f10) {
    }

    private final void f1(t1 t1Var, int i10, int i11) {
    }

    private final void h1(t1 t1Var, int i10, int i11) {
    }

    private final void k(t1 t1Var, float f7, float f10) {
    }

    private final void l(t1 t1Var, float f7, float f10) {
    }

    private final void r0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void z2(t1 t1Var, float f7, float f10) {
    }

    private final void H2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void I2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void J2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void K2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void a2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void b2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void s1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void t1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void P2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void Q2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void c2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void f2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void g2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void j2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void o0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void q0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
