package a3;

import aa.d0;
import aa.g0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bi.v3;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.m1;
import h9.f0;
import h9.i0;
import h9.t1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import li.q3;
import org.telegram.messenger.a8;
import org.telegram.messenger.bp;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
public final class g implements p, l5.g, tr, r1, bp {
    public final int f83a;
    public final boolean f84b;
    public final Object f85c;
    public final Object d;
    public final Object f86e;

    public g(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f83a = i7;
        this.f85c = obj;
        this.d = obj2;
        this.f86e = obj3;
        this.f84b = z9;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return ProfileActivity.d0((ProfileActivity) this.f85c, (boolean[]) this.d, this.f84b, (f2) this.f86e, tL_error);
    }

    @Override
    public void b(Exception exc) {
        ha.c cVar = (ha.c) this.f85c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        aa.b bVar = (aa.b) this.f86e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f84b) {
            boolean z9 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            boolean z10 = false;
            new Thread(new ha.b(0, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = g0.f811a;
            try {
                long nanos = timeUnit.toNanos(2L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            if (z9) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z9 = z10;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override
    public void g(u1 u1Var, int i7) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        switch (this.f83a) {
            case 3:
                boolean z9 = this.f84b;
                d0 d0Var = (d0) this.f85c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                q3 q3Var = (q3) this.f86e;
                int i10 = q3Var.f18789b;
                if (!z9) {
                    d0Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = q3Var.d();
                    TL_keyboard.InlineButtonType inlineButtonType2 = null;
                    if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
                        pageButton = d.buttons.get(i10);
                    } else {
                        pageButton = null;
                    }
                    if (pageButton == null) {
                        inlineButtonType = null;
                    } else {
                        inlineButtonType = pageButton.type;
                    }
                    long j10 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j3 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j3 = 0;
                    }
                    if (j3 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d2 = q3Var.d();
                        if (d2 != null && i10 >= 0 && i10 < d2.buttons.size()) {
                            pageButton2 = d2.buttons.get(i10);
                        } else {
                            pageButton2 = null;
                        }
                        if (pageButton2 != null) {
                            inlineButtonType2 = pageButton2.type;
                        }
                        if (inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                            j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id;
                        }
                        tL_inlineButtonTypeUserProfile.user_id = j10;
                        q3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                cn cnVar = (cn) this.f85c;
                boolean z10 = this.f84b;
                ((qp) this.d).G2 = 1;
                qp.e1().edit().putInt("secretWebpage2", cnVar.getMessagesController().G2).commit();
                cnVar.X5 = null;
                cnVar.Bb((CharSequence) this.f86e, z10);
                return;
            case 5:
                boolean z11 = this.f84b;
                Context context = (Context) this.f85c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f86e;
                if (z11) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + t0.f25566b.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            default:
                cw0 cw0Var = (cw0) this.f85c;
                v10 v10Var = (v10) this.d;
                Context context2 = (Context) this.f86e;
                boolean z12 = this.f84b;
                String trim2 = cw0Var.getText().toString().trim();
                di.b bVar = null;
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(org.telegram.messenger.g0.O3(trim2.toString()))) {
                    org.telegram.messenger.g0.v1(cw0Var);
                    if (!z12) {
                        bVar = new di.b();
                    }
                    u1 u1Var2 = new u1(3, context2, bVar);
                    u1Var2.r(250L);
                    v10Var.a(trim2, new v3(u1Var2, u1Var, cw0Var, 9));
                    return;
                }
                cw0Var.setErrorText(".");
                org.telegram.messenger.g0.G3(-6.0f, cw0Var, null);
                p2.APP_ERROR.a();
                org.telegram.messenger.g0.K3(cw0Var);
                return;
        }
    }

    @Override
    public t1 h(int i7, m1 m1Var, int[] iArr) {
        s sVar = (s) this.f85c;
        n nVar = (n) this.d;
        sVar.getClass();
        e eVar = new e(sVar, nVar);
        int i10 = ((int[]) this.f86e)[i7];
        f0 p10 = i0.p();
        for (int i11 = 0; i11 < m1Var.f10373a; i11++) {
            p10.c(new i(i7, m1Var, i11, nVar, iArr[i11], this.f84b, eVar, i10));
        }
        return p10.f();
    }

    @Override
    public void run(long j3) {
        ii.f fVar = (ii.f) this.f85c;
        String str = (String) this.f86e;
        fVar.getClass();
        ((u1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.f15526b = -j3;
        fVar.f15527c = fVar.getMessagesController().M0(Long.valueOf(j3));
        fVar.a0(str, this.f84b);
    }

    public g(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f83a = i7;
        this.f85c = obj;
        this.d = obj2;
        this.f84b = z9;
        this.f86e = obj3;
    }

    public g(boolean z9, Object obj, Object obj2, Object obj3, int i7) {
        this.f83a = i7;
        this.f84b = z9;
        this.f85c = obj;
        this.d = obj2;
        this.f86e = obj3;
    }
}
