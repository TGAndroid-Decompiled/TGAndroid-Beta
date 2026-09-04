package na;

import a3.k0;
import ah.u;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fb.n;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import l.x;
import n6.k;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.i71;
import org.telegram.ui.ov0;
import org.telegram.ui.yd;
import p2.l;
import p2.r;
import p2.s;
import qb.h;
import y2.j;
import y2.o;
public final class d implements k0, i71, bg.a, c3.g, cg.a, ea.a, n, g2.g, eh.a, x, k, q9.d, eo0, k1, s, OnFailureListener, r4.c, u9.a, SuccessContinuation, x9.c, y6.d, j {
    public static d f16716a;

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
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
    public Object D(cf.c cVar) {
        return new qb.d(cVar.c(h.class));
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        bg.a aVar;
        if (i11 == 6) {
            aVar = bg.a.f2647l;
        } else if (i11 > i12) {
            aVar = bg.a.f2644i;
        } else if (i11 < i12) {
            aVar = bg.a.f2645j;
        } else {
            aVar = bg.a.f2646k;
        }
        return aVar.E1(i10, i11, i12);
    }

    @Override
    public int G() {
        return 352321535;
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean I0(long j3) {
        return false;
    }

    @Override
    public int J() {
        return 0;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        bg.a aVar;
        if (i10 == 6) {
            aVar = bg.a.f2647l;
        } else if (i10 > i11) {
            aVar = bg.a.f2644i;
        } else if (i10 < i11) {
            aVar = bg.a.f2645j;
        } else {
            aVar = bg.a.f2646k;
        }
        aVar.O0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public ov0 Q1() {
        return null;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(long j3) {
        return false;
    }

    @Override
    public o U() {
        return new r(p2.o.f43738n, null);
    }

    @Override
    public boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void X(float f7, boolean z10) {
        yd.f43079b = f7 * 2.0f;
    }

    @Override
    public boolean X0(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public boolean Z(t1 t1Var) {
        return false;
    }

    @Override
    public void a() {
        synchronized (z2.c.f50679a) {
            Object obj = z2.c.f50680b;
            synchronized (obj) {
                if (z2.c.f50681c) {
                    return;
                }
                long a2 = z2.c.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.c.d = a2;
                    z2.c.f50681c = true;
                }
            }
        }
    }

    @Override
    public boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b0(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public String e() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(t1 t1Var) {
        return 0;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public a3.k h(Context context, String str, y6.c cVar) {
        a3.k kVar = new a3.k();
        int b10 = cVar.b(context, str, true);
        kVar.f130b = b10;
        if (b10 != 0) {
            kVar.f131c = 1;
            return kVar;
        }
        int e7 = cVar.e(context, str);
        kVar.f129a = e7;
        if (e7 != 0) {
            kVar.f131c = -1;
        }
        return kVar;
    }

    @Override
    public Object h2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public o i0(p2.o oVar, l lVar) {
        return new r(oVar, lVar);
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public Object k(q qVar) {
        return null;
    }

    @Override
    public int k0() {
        return 1711276032;
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public boolean m2(int i10) {
        return false;
    }

    @Override
    public boolean n0(z5 z5Var) {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public int p() {
        return 872415231;
    }

    @Override
    public boolean q(l.l lVar) {
        return false;
    }

    @Override
    public r9 q2() {
        return null;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean u1() {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void B() {
    }

    @Override
    public void H() {
    }

    @Override
    public void K() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void b() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void s() {
    }

    @Override
    public void v() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void D1(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void S0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void W1(t1 t1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void g0(t1 t1Var) {
    }

    @Override
    public long l(long j3) {
        return j3;
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void v0(t1 t1Var) {
    }

    @Override
    public void v1(t1 t1Var) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(t1 t1Var, u uVar) {
    }

    @Override
    public void L0(int i10, t1 t1Var) {
    }

    @Override
    public void M(int i10, t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(t1 t1Var, long j3) {
    }

    @Override
    public void d(l.l lVar, boolean z10) {
    }

    @Override
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
    }

    @Override
    public void x(int i10, Object obj) {
    }

    @Override
    public void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void o1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void x0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void y0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void t0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
