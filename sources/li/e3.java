package li;

import a8.aa;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ka;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.ev0;
import org.telegram.ui.p9;
import org.telegram.ui.x9;
public class e3 implements f1, m.x0, org.telegram.ui.Cells.j1, ig.z1, x9, s4.e0, com.google.android.gms.common.api.internal.r, o5.b, Continuation, y2.g {
    public final int f17208a;
    public Object f17209b;

    public e3(int i10) {
        this.f17208a = i10;
    }

    @Override
    public void A(int i10, int i11) {
        ((s4.h0) this.f17209b).p(i10, i11);
    }

    @Override
    public void B(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.f17209b;
        synchronized (z2.b.f52694b) {
            z10 = z2.b.f52695c;
        }
        if (!z10) {
            dVar.f16798a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    public int B0() {
        return ((z0() & 255) << 24) | ((z0() & 255) << 16) | ((z0() & 255) << 8) | (z0() & 255);
    }

    @Override
    public boolean C0(long j10) {
        return false;
    }

    @Override
    public boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void E(g1 g1Var, int i10, int i11) {
        e5 e5Var;
        s9 textSelectionHelper;
        g5 g5Var = (g5) this.f17209b;
        if (!g5Var.f17266w && i10 != i11 && (e5Var = g5Var.f17265s) != null && (textSelectionHelper = ((a3) e5Var).f17079a.getTextSelectionHelper()) != null) {
            g1Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        ka kaVar = (ka) this.f17209b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.f24367s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public ev0 E1() {
        return null;
    }

    public int G0() {
        return ((z0() & Byte.MAX_VALUE) << 21) | ((z0() & Byte.MAX_VALUE) << 14) | ((z0() & Byte.MAX_VALUE) << 7) | (z0() & Byte.MAX_VALUE);
    }

    @Override
    public boolean G1(long j10) {
        return false;
    }

    @Override
    public void H(String str) {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f17209b;
        try {
            a1Var.P = System.currentTimeMillis();
            a1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public String H0() {
        return ((org.telegram.ui.web.a1) this.f17209b).f44677i0;
    }

    @Override
    public void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
        ka kaVar = (ka) this.f17209b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.f24367s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean M() {
        return false;
    }

    public void M0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f17209b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public void N0(int i10, int i11) {
        ((s4.h0) this.f17209b).t(i10, i11);
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        if (i10 == ((ka) this.f17209b).f24367s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public int S() {
        return 0;
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        return org.telegram.ui.d3.a(messageObject);
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public jh.a V() {
        return null;
    }

    @Override
    public boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean X1(int i10) {
        return false;
    }

    @Override
    public void Y(Editable editable) {
        ((g5) this.f17209b).g();
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f17208a) {
            case 18:
                s7.z zVar = (s7.z) ((s7.k) obj).u();
                s7.f fVar = new s7.f(1, (TaskCompletionSource) obj2);
                Parcel N0 = zVar.N0();
                s7.d.c(N0, (h8.e) this.f17209b);
                s7.d.d(N0, fVar);
                N0.writeString(null);
                zVar.R0(N0, 63);
                return;
            default:
                w8.e eVar = (w8.e) this.f17209b;
                f8.b bVar = (f8.b) obj;
                bVar.getClass();
                f8.a aVar = new f8.a(1, (TaskCompletionSource) obj2);
                try {
                    f8.i iVar = (f8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = f8.c.f10241a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f10249a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    aa.a(Status.h, Boolean.FALSE, aVar.f10240b);
                    return;
                }
        }
    }

    @Override
    public void b(g1 g1Var) {
        e5 e5Var = ((g5) this.f17209b).f17265s;
        if (e5Var != null) {
            v3 v3Var = ((a3) e5Var).f17079a;
            v3.S1(v3Var, g1Var);
            v3Var.f17556p3.s(g1Var, true);
        }
    }

    @Override
    public t9 b2() {
        return null;
    }

    @Override
    public boolean c() {
        return ((ka) this.f17209b).a();
    }

    @Override
    public int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return c();
    }

    @Override
    public void f(int i10) {
        jr0 jr0Var = (jr0) this.f17209b;
        nr0 nr0Var = jr0Var.K;
        jr0Var.f29753s = i10;
        if (jr0Var.v != i10) {
            jr0Var.d.clear();
        }
        int i11 = jr0Var.J;
        if (jr0Var.h() == 0 && !jr0Var.e.e() && !jr0Var.I) {
            nr0Var.R.e(false, true);
        } else {
            nr0Var.f31062y0.b(i11);
        }
        jr0Var.l();
        int i12 = nr0.Z0;
        nr0Var.M0(true);
    }

    @Override
    public boolean f0(boolean z10) {
        return false;
    }

    @Override
    public boolean g(g1 g1Var) {
        return false;
    }

    @Override
    public void g1(int i10, int i11) {
        ((s4.h0) this.f17209b).r(i10, i11, null);
    }

    @Override
    public Object mo27get() {
        String packageName = ((Context) ((id.a) this.f17209b).mo27get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean h0(org.telegram.ui.Components.c6 c6Var) {
        return false;
    }

    @Override
    public void i0(int i10, int i11) {
        ((s4.h0) this.f17209b).s(i10, i11);
    }

    @Override
    public boolean k0(int i10) {
        if (i10 == ((jr0) this.f17209b).f29752r) {
            return true;
        }
        return false;
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public boolean o(g1 g1Var) {
        return false;
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f17209b;
        a1Var.y("scan_qr_popup_closed", null);
        a1Var.f44676h0 = false;
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public void t(g1 g1Var) {
        a aVar;
        g5 g5Var = (g5) this.f17209b;
        e5 e5Var = g5Var.f17265s;
        if (e5Var != null && (aVar = g5Var.f17652a) != null) {
            v3 v3Var = ((a3) e5Var).f17079a;
            ArrayList arrayList = v3Var.f17564t3;
            long j10 = aVar.f17068t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((a) arrayList.get(i11)).f17059k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f17059k;
                    ArrayList arrayList3 = aVar2.f17059k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a1.g.A(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    v3Var.y4();
                    v3Var.f32504g3.O(false);
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    v3Var.post(new m2(v3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f17209b).call();
    }

    public String toString() {
        switch (this.f17208a) {
            case 14:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f17209b).flattenToShortString() + " }";
            case 21:
                ue.b bVar = ue.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.f17209b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public String u(long j10) {
        return null;
    }

    public void v0() {
        rg.a1 a1Var = ((rg.c1) this.f17209b).d;
        if (a1Var != null) {
            rg.z0 z0Var = a1Var.f47400s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.f47400s = null;
            }
            rg.z0 z0Var2 = new rg.z0(a1Var, 1);
            a1Var.f47400s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override
    public void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.f17209b).f16798a.y(iOException);
        return y2.l.e;
    }

    @Override
    public CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    public void x0(a8.h0 h0Var) {
        i8.j jVar = (i8.j) this.f17209b;
        jVar.f13892a = h0Var;
        Iterator it = jVar.f13894c.iterator();
        while (it.hasNext()) {
            ((y6.e) it.next()).b();
        }
        jVar.f13894c.clear();
        jVar.f13893b = null;
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ka kaVar = (ka) this.f17209b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.f24367s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    public byte z0() {
        int read = ((com.google.firebase.messaging.d) this.f17209b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public e3(Object obj, int i10) {
        this.f17208a = i10;
        this.f17209b = obj;
    }

    public e3(TextView textView) {
        this.f17208a = 15;
        this.f17209b = new q1.g(textView);
    }

    public e3(int i10, int i11) {
        this.f17208a = 10;
        this.f17209b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void G(int i10) {
    }

    @Override
    public void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K(MessageObject messageObject) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void R0(MrzRecognizer.Result result) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void T(CharSequence charSequence) {
    }

    @Override
    public void Z(int i10) {
    }

    @Override
    public void a(int i10) {
    }

    @Override
    public void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void g0(String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void p0(ArrayList arrayList) {
    }

    @Override
    public void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void u1(MessageObject messageObject) {
    }

    @Override
    public void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void R() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void k(int i10, int i11) {
    }

    @Override
    public void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override
    public void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void l0(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override
    public void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void z(y2.i iVar, long j10, long j11, int i10) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
