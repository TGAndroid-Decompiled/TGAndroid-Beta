package a3;

import aa.c0;
import aa.f0;
import ai.k1;
import ai.n0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.m1;
import fi.a6;
import h9.i0;
import h9.t1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oi.p3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.messenger.q10;
import org.telegram.messenger.q2;
import org.telegram.messenger.t0;
import org.telegram.messenger.xo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class g implements p, ai.f, l5.g, or, r1, xo {
    public final int f83a;
    public final boolean f84b;
    public final Object f85c;
    public final Object d;
    public final Object f86e;

    public g(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f83a = i7;
        this.f85c = obj;
        this.d = obj2;
        this.f86e = obj3;
        this.f84b = z10;
    }

    @Override
    public void a(Exception exc) {
        ha.b bVar = (ha.b) this.f85c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        aa.b bVar2 = (aa.b) this.f86e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f84b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new a6(27, bVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = f0.f808a;
            boolean z11 = false;
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
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
            }
        }
        taskCompletionSource.trySetResult(bVar2);
    }

    @Override
    public void c(TLRPC.TL_error tL_error, String str) {
        boolean z10;
        n0 n0Var = (n0) this.f85c;
        ai.g gVar = (ai.g) this.d;
        ai.g gVar2 = (ai.g) this.f86e;
        if (n0Var.f1377r != 4) {
            return;
        }
        if (str == null) {
            n0Var.f1377r = 3;
            n0Var.K = gVar;
            n0Var.F.f(false);
            n0Var.e(0L, 240L);
            if (!this.f84b) {
                n0Var.J = null;
            }
            n0Var.f1384w.d(gVar.a(), false);
            k1 k1Var = n0Var.f1384w;
            if (n0Var.J != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            k1Var.setRevert(z10);
            n0Var.B(false);
            n0.E(tL_error);
            return;
        }
        g0.h3(new aa.r(n0Var, str, gVar2, 3), Math.max(0L, (n0Var.V + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        return ProfileActivity.d0((ProfileActivity) this.f85c, (boolean[]) this.d, this.f84b, (h2) this.f86e, tL_error);
    }

    @Override
    public t1 f(int i7, m1 m1Var, int[] iArr) {
        s sVar = (s) this.f85c;
        n nVar = (n) this.d;
        sVar.getClass();
        e eVar = new e(sVar, nVar);
        int i10 = ((int[]) this.f86e)[i7];
        h9.f0 p10 = i0.p();
        for (int i11 = 0; i11 < m1Var.f10527a; i11++) {
            p10.c(new i(i7, m1Var, i11, nVar, iArr[i11], this.f84b, eVar, i10));
        }
        return p10.f();
    }

    @Override
    public void h(u1 u1Var, int i7) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        switch (this.f83a) {
            case 4:
                boolean z10 = this.f84b;
                c0 c0Var = (c0) this.f85c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                p3 p3Var = (p3) this.f86e;
                int i10 = p3Var.f22242b;
                if (!z10) {
                    c0Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = p3Var.d();
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
                        TL_iv.pageBlockButtonRow d2 = p3Var.d();
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
                        p3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                bn bnVar = (bn) this.f85c;
                boolean z11 = this.f84b;
                ((mp) this.d).J2 = 1;
                mp.g1().edit().putInt("secretWebpage2", bnVar.getMessagesController().J2).commit();
                bnVar.Z5 = null;
                bnVar.Cb((CharSequence) this.f86e, z11);
                return;
            case 6:
                boolean z12 = this.f84b;
                Context context = (Context) this.f85c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f86e;
                if (z12) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + t0.f26915b.getPackageName()));
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
                lw0 lw0Var = (lw0) this.f85c;
                q10 q10Var = (q10) this.d;
                Context context2 = (Context) this.f86e;
                boolean z13 = this.f84b;
                String trim2 = lw0Var.getText().toString().trim();
                fi.b bVar = null;
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(g0.M3(trim2.toString()))) {
                    g0.v1(lw0Var);
                    if (!z13) {
                        bVar = new fi.b();
                    }
                    u1 u1Var2 = new u1(3, context2, bVar);
                    u1Var2.r(250L);
                    q10Var.a(trim2, new bi.j(u1Var2, u1Var, lw0Var, 14));
                    return;
                }
                lw0Var.setErrorText(".");
                g0.E3(-6.0f, lw0Var, null);
                q2.APP_ERROR.a();
                g0.I3(lw0Var);
                return;
        }
    }

    @Override
    public void run(long j3) {
        li.g gVar = (li.g) this.f85c;
        String str = (String) this.f86e;
        gVar.getClass();
        ((u1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        gVar.f19932b = -j3;
        gVar.f19933c = gVar.getMessagesController().O0(Long.valueOf(j3));
        gVar.a0(str, this.f84b);
    }

    public g(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f83a = i7;
        this.f85c = obj;
        this.d = obj2;
        this.f84b = z10;
        this.f86e = obj3;
    }

    public g(boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.f83a = i7;
        this.f84b = z10;
        this.f85c = obj;
        this.d = obj2;
        this.f86e = obj3;
    }
}
