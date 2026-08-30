package ja;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.biometric.r;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.k0;
import f2.o0;
import g.x;
import h5.d0;
import j$.util.DesugarCollections;
import j7.r5;
import j8.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import la.b0;
import m.j1;
import m.y0;
import ng.g;
import o4.n0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.u5;
import org.telegram.ui.vu0;
import ph.c0;
import s7.i;
import v2.d;
import v2.f;
import v7.j;
import yf.m;
public class c implements a0, androidx.activity.result.b, k0, a3.b, o, j1, Continuation, s, y0, o0.a, n0, k1, g, yd.a, m {
    public static volatile c f9352c;
    public final int f9353a;
    public Object f9354b;

    public c(int i10, boolean z4) {
        this.f9353a = i10;
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean C(long j10) {
        n0[] n0VarArr;
        boolean z4;
        boolean z10;
        boolean z11 = false;
        do {
            long l10 = l();
            if (l10 == Long.MIN_VALUE) {
                return z11;
            }
            z4 = false;
            for (n0 n0Var : (n0[]) this.f9354b) {
                long l11 = n0Var.l();
                if (l11 != Long.MIN_VALUE && l11 <= j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (l11 == l10 || z10) {
                    z4 |= n0Var.C(j10);
                }
            }
            z11 |= z4;
        } while (z4);
        return z11;
    }

    @Override
    public n9 C2() {
        return null;
    }

    @Override
    public void D(int i10, int i11) {
        ((o0) this.f9354b).p(i10, i11);
    }

    @Override
    public boolean D1() {
        return false;
    }

    @Override
    public void G() {
        ((c0) this.f9354b).d.invalidate();
    }

    @Override
    public boolean I1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Cursor J(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f9354b;
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
    public boolean K1() {
        return false;
    }

    @Override
    public void M0(int i10, int i11) {
        ((o0) this.f9354b).t(i10, i11);
    }

    @Override
    public boolean O0(long j10) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(t1 t1Var) {
        return false;
    }

    @Override
    public void R0(int i10, t1 t1Var) {
        ea eaVar = (ea) this.f9354b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.f21039s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public CharacterStyle R1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ea eaVar = (ea) this.f9354b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.f21039s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean T1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public long X() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.f9354b) {
            long X = n0Var.X();
            if (X != Long.MIN_VALUE) {
                j10 = Math.min(j10, X);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public void Y(x xVar) {
        switch (this.f9353a) {
            case 24:
                xVar.a(((li) this.f9354b).getThemedColor(j6.f19906d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((lq0) this.f9354b).getThemedColor(j6.f19906d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public boolean Y0(t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public vu0 a2() {
        return null;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.f9354b;
        s7.b bVar = (s7.b) obj;
        bVar.getClass();
        s7.a aVar = new s7.a(1, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = s7.c.f44100a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f44108a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            r5.a(Status.h, Boolean.FALSE, aVar.f44099b);
        }
    }

    @Override
    public boolean b() {
        for (n0 n0Var : (n0[]) this.f9354b) {
            if (n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f9354b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public boolean d() {
        return ((ea) this.f9354b).a();
    }

    @Override
    public boolean d0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d1(int i10, t1 t1Var) {
        if (i10 == ((ea) this.f9354b).f21039s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean d2(long j10) {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void e0(int i10, int i11) {
        ((o0) this.f9354b).s(i10, i11);
    }

    @Override
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        ea eaVar = (ea) this.f9354b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.f21039s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f9353a) {
            case 2:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f9354b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f843a;
                int i10 = f0Var.f844b;
                androidx.fragment.app.s v = j0Var.f857c.v(str);
                if (v == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                v.x(i10, aVar.f329a, aVar.f330b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f9354b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f330b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f40993a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.K;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f329a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void f0(long j10) {
        for (n0 n0Var : (n0[]) this.f9354b) {
            n0Var.f0(j10);
        }
    }

    @Override
    public boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
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
    public Object mo0get() {
        String packageName = ((Context) ((rc.a) this.f9354b).mo0get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    public void j0(int i10, boolean z4) {
        c2.u uVar = (c2.u) this.f9354b;
        if (z4) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void k(Canvas canvas) {
        switch (this.f9353a) {
            case 24:
                li liVar = (li) this.f9354b;
                canvas.drawColor(liVar.getThemedColor(j6.f19906d6));
                if (SharedConfig.chatBlurEnabled()) {
                    liVar.f26765z2.b(canvas, -2);
                    return;
                }
                return;
            default:
                lq0 lq0Var = (lq0) this.f9354b;
                canvas.drawColor(lq0Var.getThemedColor(j6.f19906d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public int k0(t1 t1Var) {
        return 0;
    }

    @Override
    public void k1(int i10, int i11) {
        ((o0) this.f9354b).r(i10, i11, null);
    }

    @Override
    public long l() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.f9354b) {
            long l10 = n0Var.l();
            if (l10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, l10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public void m0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        r rVar = (r) this.f9354b;
        if (charSequence != null) {
            if (rVar.R()) {
                rVar.W(charSequence);
            }
            rVar.f504i0.d(null);
        }
    }

    @Override
    public boolean n0() {
        return d();
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        j61 j61Var = (j61) this.f9354b;
        float f12 = -dp;
        j61Var.f25909g.inset(f12, f12);
        boolean contains = j61Var.f25909g.contains(f10, f11);
        float f13 = dp;
        j61Var.f25909g.inset(f13, f13);
        return contains;
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        return false;
    }

    public Set o0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f9354b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f9354b);
        }
        return unmodifiableSet;
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((j61) this.f9354b).f25911j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        ((j61) this.f9354b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        ((j61) this.f9354b).h.c(false);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public void r(Object obj) {
        ((u7.c) obj).onLocationAvailability((LocationAvailability) this.f9354b);
    }

    public boolean r0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f9354b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public void t0(b0 b0Var) {
        ((y2.o) ((f) ((ba.b) this.f9354b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new gg.f(this, 24)).a(new v2.a(null, b0Var, d.f45560a, null), new s0.b(28));
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f9354b).call();
    }

    public void u0(s5.m mVar) {
        j jVar = (j) this.f9354b;
        jVar.f45631a = mVar;
        Iterator it = jVar.f45633c.iterator();
        while (it.hasNext()) {
            ((l6.e) it.next()).b();
        }
        jVar.f45633c.clear();
        jVar.f45632b = null;
    }

    public boolean v0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ja.c.v0(android.view.MotionEvent):boolean");
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean y2(int i10) {
        return false;
    }

    public c(Object obj, int i10) {
        this.f9353a = i10;
        this.f9354b = obj;
    }

    public c(int i10) {
        this.f9353a = i10;
        switch (i10) {
            case 11:
                this.f9354b = new CopyOnWriteArrayList();
                return;
            case 13:
                this.f9354b = new c2.u();
                return;
            case 19:
                this.f9354b = new f7.b[mf.b.values().length];
                return;
            default:
                this.f9354b = new HashSet();
                return;
        }
    }

    public c(l3.d dVar) {
        this.f9353a = 15;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f11133a).setFlags(dVar.f11134b).setUsage(dVar.f11135c);
        int i10 = d0.f6937a;
        if (i10 >= 29) {
            l3.b.a(usage, dVar.d);
        }
        if (i10 >= 32) {
            l3.c.a(usage, dVar.e);
        }
        this.f9354b = usage.build();
    }

    public c(Context context, Uri uri) {
        this.f9353a = 20;
        this.f9354b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(Context context, m20 m20Var) {
        this.f9353a = 25;
        this.f9354b = new l20(context, m20Var);
    }

    @Override
    public void A2() {
    }

    @Override
    public void C0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void c0() {
    }

    @Override
    public void j() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t2() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B0(t1 t1Var) {
    }

    @Override
    public void E1(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void H(boolean z4) {
    }

    @Override
    public void H0(t1 t1Var) {
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
    public void L0(t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(MessageObject messageObject) {
    }

    @Override
    public void P0(t1 t1Var) {
    }

    @Override
    public void U(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void a(int i10) {
    }

    @Override
    public void a1(t1 t1Var) {
    }

    @Override
    public void b0(boolean z4) {
    }

    @Override
    public void c(int i10) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void i2(t1 t1Var) {
    }

    @Override
    public void l0(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void q2(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void G1(t1 t1Var, boolean z4) {
    }

    @Override
    public void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(t1 t1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, t1 t1Var) {
    }

    @Override
    public void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void k2(t1 t1Var, long j10) {
    }

    @Override
    public void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void E0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void F0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void x1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
