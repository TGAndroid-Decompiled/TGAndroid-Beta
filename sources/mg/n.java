package mg;

import ah.u;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import b2.l1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import rg.o2;
import rg.x1;
import s4.e0;
import s4.h0;
import u2.c1;
import u2.d1;
import u2.o1;
import v7.t7;
import w9.w;
public class n implements o0.b, c1, k1, bh.h, me.a, com.google.android.gms.common.api.internal.o, x1, e0, n5.b, v0.i, s {
    public final int f16291a;
    public Object f16292b;

    public n(int i10, boolean z10) {
        this.f16291a = i10;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void D(int i10, int i11) {
        ((h0) this.f16292b).p(i10, i11);
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override
    public void H(float f7) {
        ((o2) this.f16292b).setOutlineWidth(f7);
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
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ia iaVar = (ia) this.f16292b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f22135s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void L0(int i10, t1 t1Var) {
        ia iaVar = (ia) this.f16292b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f22135s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
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
    public void P0(int i10, int i11) {
        ((h0) this.f16292b).t(i10, i11);
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
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ia iaVar = (ia) this.f16292b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f22135s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
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
    public boolean X0(int i10, t1 t1Var) {
        if (i10 == ((ia) this.f16292b).f22135s) {
            return true;
        }
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
    public boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.f16292b;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8906a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8914a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e7) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override
    public void b(d1 d1Var) {
        o2.q qVar = (o2.q) d1Var;
        o2.k kVar = (o2.k) this.f16292b;
        kVar.G.b(kVar);
    }

    @Override
    public boolean c() {
        return ((ia) this.f16292b).a();
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        return vl.a(messageObject);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16292b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    public n4.a d() {
        return new n4.a(((AudioAttributes.Builder) this.f16292b).build());
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public void e() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f16292b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f46773a;
        }
        l1[] l1VarArr = new l1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f46773a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new o1(l1VarArr);
        kVar.G.a(kVar);
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
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f16292b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public boolean h(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: mg.n.h(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public boolean j0() {
        return c();
    }

    @Override
    public void k(Canvas canvas) {
        switch (this.f16291a) {
            case 5:
                vi viVar = (vi) this.f16292b;
                canvas.drawColor(viVar.getThemedColor(j6.f20663d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -2);
                    return;
                }
                return;
            default:
                hq0 hq0Var = (hq0) this.f16292b;
                canvas.drawColor(hq0Var.getThemedColor(j6.f20663d6));
                if (SharedConfig.chatBlurEnabled()) {
                    hq0Var.O0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void k0(int i10, int i11) {
        ((h0) this.f16292b).s(i10, i11);
    }

    @Override
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16292b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override
    public void m1(int i10, int i11) {
        ((h0) this.f16292b).r(i10, i11, null);
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
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        g61 g61Var = (g61) this.f16292b;
        float f11 = -dp;
        g61Var.f26271g.inset(f11, f11);
        boolean contains = g61Var.f26271g.contains(f7, f10);
        float f12 = dp;
        g61Var.f26271g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((g61) this.f16292b).f26273j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((g61) this.f16292b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((g61) this.f16292b).h.c(false);
    }

    @Override
    public void onError(Object obj) {
        w0.d e7 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        zd.m mVar = (zd.m) this.f16292b;
        if (mVar.w()) {
            mVar.resumeWith(t7.a(e7));
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        zd.m mVar = (zd.m) this.f16292b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void p(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f16292b);
    }

    public void q(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.f16292b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.f48405e.i(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }

    @Override
    public r9 q2() {
        return null;
    }

    public String toString() {
        switch (this.f16291a) {
            case 13:
                re.b bVar = re.b.f45107e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f16292b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
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
    public void v(bh.a aVar) {
        switch (this.f16291a) {
            case 5:
                aVar.a(((vi) this.f16292b).getThemedColor(j6.f20663d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((hq0) this.f16292b).getThemedColor(j6.f20663d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public String w(long j3) {
        return null;
    }

    public n x(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f16292b).setUsage(i10);
        return this;
    }

    public void z(int i10) {
        x(i10);
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public n(Object obj, int i10) {
        this.f16291a = i10;
        this.f16292b = obj;
    }

    public n(Context context, Uri uri) {
        this.f16291a = 2;
        this.f16292b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public float get() {
        return ((o2) this.f16292b).F;
    }

    public n(Context context, l20 l20Var) {
        this.f16291a = 6;
        this.f16292b = new k20(context, l20Var);
    }

    public n(int i10) {
        this.f16291a = i10;
        switch (i10) {
            case 24:
                this.f16292b = new z0[zf.b.values().length];
                return;
            default:
                this.f16292b = new AudioAttributes.Builder();
                return;
        }
    }

    public n(int i10, int i11) {
        this.f16291a = 7;
        this.f16292b = ApplicationLoader.applicationContext.getSharedPreferences(a4.a.l(i10, i11, "pip_layout_", "_"), 0);
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
    public void L1() {
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
    public void e1() {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void g0(t1 t1Var) {
    }

    @Override
    public void i2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void s() {
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
    public void w0() {
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
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
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
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
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
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
