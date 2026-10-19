package le;

import ah.t;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.p1;
import be.m;
import bh.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e8.i;
import e9.n0;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import m.l;
import ne.d;
import ne.j;
import o2.k;
import o2.q;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.g;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
import org.telegram.ui.vu0;
import org.telegram.ui.web.a1;
import r0.k1;
import r0.n;
import rg.n2;
import rg.v1;
import s4.d0;
import s4.g0;
import u2.e1;
import u2.f1;
import u2.r1;
import v1.c;
import v7.h5;
import v7.i8;
import v8.e;
import x9.w;
public final class b implements OnCompleteListener, l, d, o0.a, e1, l1, h, r71, n, v9, r4.d, o, v1, d0, n5.b, s0, r {
    public final int f16010a;
    public Object f16011b;

    public b(int i10) {
        this.f16010a = i10;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ym0 ym0Var = (ym0) this.f16011b;
        ym0Var.v.setPadding(defaultWindowInsets.f12285a, defaultWindowInsets.f12286b, defaultWindowInsets.f12287c, defaultWindowInsets.d);
        ym0Var.f32701s.requestLayout();
        return k1.f44824b;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void E(String str) {
        a1 a1Var = (a1) this.f16011b;
        try {
            a1Var.P = System.currentTimeMillis();
            a1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public void H(float f7, int i10) {
        ((j) this.f16011b).h(f7);
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        fa faVar = (fa) this.f16011b;
        g gVar = faVar.v;
        if (faVar.a()) {
            faVar.f22272s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void J(bh.a aVar) {
        aVar.a(((ti) this.f16011b).getThemedColor(h6.f20989d6));
        aVar.b(SharedConfig.chatBlurEnabled());
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
    public void M0(int i10, u1 u1Var) {
        fa faVar = (fa) this.f16011b;
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
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public vu0 P1() {
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
        fa faVar = (fa) this.f16011b;
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
        ((n2) this.f16011b).setOutlineWidth(f7);
    }

    @Override
    public boolean U0(String str, n9 n9Var) {
        return false;
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
    public p0 W0(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (c cVar : (c[]) this.f16011b) {
            if (cVar.f47864a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void X(int i10, int i11) {
        ((g0) this.f16011b).s(i10, i11);
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, u1 u1Var) {
        if (i10 == ((fa) this.f16011b).f22272s) {
            return true;
        }
        return false;
    }

    @Override
    public void a1(int i10, int i11) {
        ((g0) this.f16011b).r(i10, i11, null);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.f16011b;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8399a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8407a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            h5.a(Status.h, Boolean.FALSE, aVar.f8398b);
        }
    }

    @Override
    public void b(Canvas canvas) {
        ti tiVar = (ti) this.f16011b;
        canvas.drawColor(tiVar.getThemedColor(h6.f20989d6));
        if (SharedConfig.chatBlurEnabled()) {
            tiVar.F2.b(canvas, -2);
        }
    }

    @Override
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return ((fa) this.f16011b).a();
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16011b;
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

    public void d() {
        q[] qVarArr;
        q[] qVarArr2;
        k kVar = (k) this.f16011b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.f();
            i11 += qVar.Y.f47417a;
        }
        p1[] p1VarArr = new p1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.f();
            int i13 = qVar2.Y.f47417a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.f();
                p1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new r1(p1VarArr);
        kVar.G.a(kVar);
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return c1.a(messageObject);
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
    public p0 f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public Object mo27get() {
        String packageName = ((Context) ((hd.a) this.f16011b).mo27get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public void h(f1 f1Var) {
        q qVar = (q) f1Var;
        k kVar = (k) this.f16011b;
        kVar.G.h(kVar);
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public void invalidate() {
        ((zg0) this.f16011b).h.invalidate();
    }

    public boolean k(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: le.b.k(android.view.MotionEvent):boolean");
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
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.o oVar = ((r7.i) this.f16011b).f45038b;
        synchronized (oVar) {
            oVar.f2669a = false;
            nVar = ((p) oVar.f2670b).f6479c;
        }
        if (nVar != null) {
            ((r7.c) oVar.f2671c).c(nVar, 2441);
        }
    }

    @Override
    public boolean o0(a6 a6Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        m mVar = (m) this.f16011b;
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
    public void onDismiss() {
        a1 a1Var = (a1) this.f16011b;
        a1Var.y("scan_qr_popup_closed", null);
        a1Var.f42565h0 = false;
    }

    @Override
    public String p0() {
        return ((a1) this.f16011b).f42566i0;
    }

    @Override
    public o9 p2() {
        return null;
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        ((j) this.f16011b).h(f7);
    }

    @Override
    public void t0(int i10, int i11) {
        ((g0) this.f16011b).t(i10, i11);
    }

    public String toString() {
        switch (this.f16010a) {
            case 14:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f16011b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public Cursor u(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16011b;
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

    public void v(ea.b bVar, Thread thread, Throwable th2) {
        x9.m mVar = (x9.m) this.f16011b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.e.w(new x9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
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
    public void x() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void y(int i10, int i11) {
        ((g0) this.f16011b).p(i10, i11);
    }

    @Override
    public void z(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f16011b).setResultCode(i10);
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public b(Object obj, int i10) {
        this.f16010a = i10;
        this.f16011b = obj;
    }

    public b() {
        this.f16010a = 3;
        this.f16011b = n0.t();
    }

    @Override
    public float get() {
        return ((n2) this.f16011b).F;
    }

    public b(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f16010a = 16;
        this.f16011b = new GestureDetector(context, onGestureListener, null);
    }

    public b(c[] initializers) {
        this.f16010a = 25;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f16011b = initializers;
    }

    public b(EditText editText) {
        this.f16010a = 15;
        this.f16011b = new mi.q(editText);
    }

    public b(Context context, Uri uri) {
        this.f16010a = 5;
        this.f16011b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public b(Context context, u20 u20Var) {
        this.f16010a = 9;
        this.f16011b = new t20(context, u20Var);
    }

    @Override
    public void L1() {
    }

    @Override
    public void f1() {
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
    public void F0(MrzRecognizer.Result result) {
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
