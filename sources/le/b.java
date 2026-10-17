package le;

import ah.t;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b2.p1;
import bh.h;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hg.z1;
import i0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import m.l;
import ne.d;
import ne.j;
import o2.k;
import o2.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.g;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Wallet.t9;
import org.telegram.ui.xu0;
import qg.b1;
import qg.c1;
import qg.u0;
import r0.k1;
import r0.n;
import r2.m;
import rg.v1;
import rg.w0;
import s4.h1;
import s4.n0;
import s4.o0;
import s6.e;
import s6.f;
import t7.u;
import u2.e1;
import u2.f1;
import u2.r1;
import v7.i8;
public final class b implements OnCompleteListener, l, d, o0.a, e1, l1, h, q71, n, z1, r, m, o, v1, h1, w2.d, Continuation {
    public final int f16002a;
    public Object f16003b;

    public b(int i10, boolean z10) {
        this.f16002a = i10;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ym0 ym0Var = (ym0) this.f16003b;
        ym0Var.v.setPadding(defaultWindowInsets.f12284a, defaultWindowInsets.f12285b, defaultWindowInsets.f12286c, defaultWindowInsets.d);
        ym0Var.f32707s.requestLayout();
        return k1.f44852b;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void E(float f7, int i10) {
        ((j) this.f16003b).h(f7);
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public void H(bh.a aVar) {
        aVar.a(((ti) this.f16003b).getThemedColor(h6.f20986d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        fa faVar = (fa) this.f16003b;
        g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f22272s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public View L(int i10) {
        return ((n0) this.f16003b).q(i10);
    }

    @Override
    public void M0(int i10, u1 u1Var) {
        fa faVar = (fa) this.f16003b;
        g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f22272s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public xu0 P1() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        fa faVar = (fa) this.f16003b;
        g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f22272s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean S0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void U(float f7) {
        w0 w0Var = (w0) this.f16003b;
        u0.e(w0Var.f45697a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public ih.a W() {
        return null;
    }

    @Override
    public int X(View view) {
        return n0.v(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, u1 u1Var) {
        if (i10 == ((fa) this.f16003b).f22272s) {
            return true;
        }
        return false;
    }

    @Override
    public void a(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f16003b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public void a0() {
        c1 c1Var = ((qg.e1) this.f16003b).d;
        if (c1Var != null) {
            b1 b1Var = c1Var.f44505s;
            if (b1Var != null) {
                c1Var.cancelRunnable(b1Var);
                c1Var.f44505s = null;
            }
            b1 b1Var2 = new b1(c1Var, 1);
            c1Var.f44505s = b1Var2;
            c1Var.postRunnable(b1Var2, 1L);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16002a) {
            case 15:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.o) this.f16003b);
                try {
                    aVar.f318b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            default:
                f fVar = new f(1, (TaskCompletionSource) obj2);
                e eVar = (e) ((s6.h) obj).u();
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, (s6.a) this.f16003b);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
        }
    }

    @Override
    public void b(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f16003b).queueSecureInputBuffer(i10, 0, dVar.f11631i, j10, i11);
    }

    public void b0(androidx.biometric.e eVar) {
        h8.j jVar = (h8.j) this.f16003b;
        jVar.f11693a = eVar;
        Iterator it = jVar.f11695c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f11695c.clear();
        jVar.f11694b = null;
    }

    @Override
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return ((fa) this.f16003b).a();
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16003b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public int d(View view) {
        return n0.z(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).topMargin;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return t0.a(messageObject);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void f(int i10) {
        t9 t9Var = (t9) this.f16003b;
        if (!t9Var.f34910n && i10 == t9Var.I) {
            t9Var.d0(t9Var.M.getText().toString().trim());
        }
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    public void g0() {
        q[] qVarArr;
        q[] qVarArr2;
        k kVar = (k) this.f16003b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f47440a;
        }
        p1[] p1VarArr = new p1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f47440a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                p1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new r1(p1VarArr);
        kVar.G.h(kVar);
    }

    @Override
    public float get() {
        w0 w0Var = (w0) this.f16003b;
        int i10 = w0Var.f45697a;
        qg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f44697i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public void invalidate() {
        ((zg0) this.f16003b).h.invalidate();
    }

    public boolean j0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: le.b.j0(android.view.MotionEvent):boolean");
    }

    @Override
    public int k() {
        return ((n0) this.f16003b).G();
    }

    @Override
    public boolean l0() {
        return c();
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public void o(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f16003b);
    }

    @Override
    public boolean o0(a6 a6Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        be.m mVar = (be.m) this.f16003b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(i8.a(exception));
    }

    @Override
    public o9 p2() {
        return null;
    }

    @Override
    public void r(Canvas canvas) {
        ti tiVar = (ti) this.f16003b;
        canvas.drawColor(tiVar.getThemedColor(h6.f20986d6));
        if (SharedConfig.chatBlurEnabled()) {
            tiVar.F2.b(canvas, -2);
        }
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f16003b).setParameters(bundle);
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f16003b).call();
    }

    public String toString() {
        switch (this.f16002a) {
            case 22:
                te.b bVar = te.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.f16003b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10, float f7, float f10, ne.e eVar) {
        ((j) this.f16003b).h(f7);
    }

    @Override
    public void v(f1 f1Var) {
        q qVar = (q) f1Var;
        k kVar = (k) this.f16003b;
        kVar.G.v(kVar);
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public Cursor x(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16003b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public int z() {
        n0 n0Var = (n0) this.f16003b;
        return n0Var.f46040n - n0Var.C();
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public b(Object obj, int i10) {
        this.f16002a = i10;
        this.f16003b = obj;
    }

    public b(s6.g gVar, s6.a aVar) {
        this.f16002a = 21;
        this.f16003b = aVar;
    }

    public b(int i10) {
        this.f16002a = i10;
        switch (i10) {
            case 25:
                this.f16003b = new u(28);
                return;
            case 28:
                this.f16003b = new CopyOnWriteArrayList();
                return;
            default:
                this.f16003b = e9.n0.t();
                return;
        }
    }

    public b(Context context, Uri uri) {
        this.f16002a = 5;
        this.f16003b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public b(Context context, u20 u20Var) {
        this.f16002a = 9;
        this.f16003b = new t20(context, u20Var);
    }

    @Override
    public void C() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C0(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(u1 u1Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void T0(u1 u1Var) {
    }

    @Override
    public void U1(u1 u1Var) {
    }

    @Override
    public void V0(u1 u1Var) {
    }

    @Override
    public void Y(ArrayList arrayList) {
    }

    @Override
    public void c2(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void m(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(u1 u1Var) {
    }

    @Override
    public void s(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void w1(u1 u1Var) {
    }

    @Override
    public void x0(u1 u1Var) {
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K(int i10, u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var, t tVar) {
    }

    @Override
    public void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(u1 u1Var, long j10) {
    }

    @Override
    public void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void o2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
