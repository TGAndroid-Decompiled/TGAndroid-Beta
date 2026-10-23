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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u20;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
import org.telegram.ui.web.b1;
import org.telegram.ui.yu0;
import r0.n;
import r4.c;
import rg.o2;
import rg.w1;
import s4.d0;
import s4.g0;
import u2.g1;
import u2.h1;
import v7.h5;
import v7.i8;
import v8.e;
import x9.w;
public final class b implements OnCompleteListener, l, d, o0.a, g1, k1, h, a81, n, v9, c, o, w1, d0, n5.b, s0, r {
    public final int f16071a;
    public Object f16072b;

    public b(int i10) {
        this.f16071a = i10;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        cn0 cn0Var = (cn0) this.f16072b;
        cn0Var.v.setPadding(defaultWindowInsets.f12315a, defaultWindowInsets.f12316b, defaultWindowInsets.f12317c, defaultWindowInsets.d);
        cn0Var.f25389s.requestLayout();
        return r0.k1.f45250b;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void E(String str) {
        b1 b1Var = (b1) this.f16072b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override
    public void H(float f7, int i10) {
        ((j) this.f16072b).h(f7);
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.f16072b;
        g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22440s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void J(bh.a aVar) {
        aVar.a(((ti) this.f16072b).getThemedColor(k6.f21183d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void M0(int i10, t1 t1Var) {
        ga gaVar = (ga) this.f16072b;
        g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22440s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
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
    public yu0 P1() {
        return null;
    }

    @Override
    public boolean Q(t1 t1Var) {
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
    public void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.f16072b;
        g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22440s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void U(float f7) {
        ((o2) this.f16072b).setOutlineWidth(f7);
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
        for (v1.c cVar : (v1.c[]) this.f16072b) {
            if (cVar.f48313a.equals(cls)) {
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
        ((g0) this.f16072b).s(i10, i11);
    }

    @Override
    public boolean Z(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, t1 t1Var) {
        if (i10 == ((ga) this.f16072b).f22440s) {
            return true;
        }
        return false;
    }

    @Override
    public void a1(int i10, int i11) {
        ((g0) this.f16072b).r(i10, i11, null);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.f16072b;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8404a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8412a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            h5.a(Status.h, Boolean.FALSE, aVar.f8403b);
        }
    }

    @Override
    public void b(h1 h1Var) {
        q qVar = (q) h1Var;
        k kVar = (k) this.f16072b;
        kVar.G.b(kVar);
    }

    @Override
    public boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public p0 c(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16072b;
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
        k kVar = (k) this.f16072b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.f();
            i11 += qVar.Y.f47888a;
        }
        p1[] p1VarArr = new p1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.f();
            int i13 = qVar2.Y.f47888a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.f();
                p1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.t1(p1VarArr);
        kVar.G.a(kVar);
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.b1.a(messageObject);
    }

    @Override
    public boolean e() {
        return ((ga) this.f16072b).a();
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public Object mo27get() {
        String packageName = ((Context) ((hd.a) this.f16072b).mo27get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public void h(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.o oVar = ((r7.i) this.f16072b).f45464b;
        synchronized (oVar) {
            oVar.f2674a = false;
            nVar = ((p) oVar.f2675b).f6489c;
        }
        if (nVar != null) {
            ((r7.c) oVar.f2676c).c(nVar, 2441);
        }
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public void invalidate() {
        ((dh0) this.f16072b).h.invalidate();
    }

    public boolean k(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: le.b.k(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean l0() {
        return e();
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        ((j) this.f16072b).h(f7);
    }

    @Override
    public boolean o0(a6 a6Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        m mVar = (m) this.f16072b;
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
        b1 b1Var = (b1) this.f16072b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.f43054h0 = false;
    }

    @Override
    public String p0() {
        return ((b1) this.f16072b).f43055i0;
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16072b;
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
    public void t0(int i10, int i11) {
        ((g0) this.f16072b).t(i10, i11);
    }

    public String toString() {
        switch (this.f16071a) {
            case 14:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f16072b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public void u(ea.b bVar, Thread thread, Throwable th2) {
        x9.m mVar = (x9.m) this.f16072b;
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
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
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
        ((ProfileInstallReceiver) this.f16072b).setResultCode(i10);
    }

    @Override
    public void y(int i10, int i11) {
        ((g0) this.f16072b).p(i10, i11);
    }

    @Override
    public void z(Canvas canvas) {
        ti tiVar = (ti) this.f16072b;
        canvas.drawColor(tiVar.getThemedColor(k6.f21183d6));
        if (SharedConfig.chatBlurEnabled()) {
            tiVar.I2.b(canvas, -2);
        }
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public b(Object obj, int i10) {
        this.f16071a = i10;
        this.f16072b = obj;
    }

    public b() {
        this.f16071a = 3;
        this.f16072b = n0.t();
    }

    @Override
    public float get() {
        return ((o2) this.f16072b).F;
    }

    public b(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f16071a = 16;
        this.f16072b = new GestureDetector(context, onGestureListener, null);
    }

    public b(v1.c[] initializers) {
        this.f16071a = 25;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f16072b = initializers;
    }

    public b(EditText editText) {
        this.f16071a = 15;
        this.f16072b = new mi.q(editText);
    }

    public b(Context context, Uri uri) {
        this.f16071a = 5;
        this.f16072b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public b(Context context, u20 u20Var) {
        this.f16071a = 9;
        this.f16072b = new t20(context, u20Var);
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
    public void A(t1 t1Var) {
    }

    @Override
    public void B(t1 t1Var) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void D1(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
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
    public void G0(t1 t1Var) {
    }

    @Override
    public void I(t1 t1Var) {
    }

    @Override
    public void K0(t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void T0(t1 t1Var) {
    }

    @Override
    public void U1(t1 t1Var) {
    }

    @Override
    public void V0(t1 t1Var) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void m(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void w1(t1 t1Var) {
    }

    @Override
    public void x0(t1 t1Var) {
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K(int i10, t1 t1Var) {
    }

    @Override
    public void K1(t1 t1Var, t tVar) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(t1 t1Var, long j10) {
    }

    @Override
    public void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(t1 t1Var, boolean z10) {
    }

    @Override
    public void A0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void o2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void p1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
