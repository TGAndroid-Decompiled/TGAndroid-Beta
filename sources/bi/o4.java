package bi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ds;
import org.telegram.messenger.f8;
import org.telegram.messenger.hp;
import org.telegram.messenger.k20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class o4 implements org.telegram.ui.ActionBar.u1, i5.g, hp, x2.l, ds {
    public final int f3264a;
    public final boolean f3265b;
    public final Object f3266c;
    public final Object d;
    public final Object e;

    public o4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f3264a = i10;
        this.f3266c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3265b = z10;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return ProfileActivity.f0((ProfileActivity) this.f3266c, (boolean[]) this.d, this.f3265b, (org.telegram.ui.ActionBar.k2) this.e, tL_error);
    }

    @Override
    public e9.x1 b(int i10, b2.p1 p1Var, int[] iArr) {
        x2.o oVar = (x2.o) this.f3266c;
        x2.j jVar = (x2.j) this.d;
        oVar.getClass();
        x2.d dVar = new x2.d(oVar, jVar);
        int i11 = ((int[]) this.e)[i10];
        e9.k0 t10 = e9.n0.t();
        for (int i12 = 0; i12 < p1Var.f2187a; i12++) {
            t10.c(new x2.f(i10, p1Var, i12, jVar, iArr[i12], this.f3265b, dVar, i11));
        }
        return t10.f();
    }

    @Override
    public void c(Exception exc) {
        da.b bVar = (da.b) this.f3266c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        x9.b bVar2 = (x9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f3265b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new d1.e(1, bVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = x9.x.f53537a;
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
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        switch (this.f3264a) {
            case 0:
                boolean z10 = this.f3265b;
                n4 n4Var = (n4) this.f3266c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                a4 a4Var = (a4) this.e;
                int i11 = a4Var.f2841b;
                if (!z10) {
                    n4Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = a4Var.d();
                    TL_keyboard.InlineButtonType inlineButtonType2 = null;
                    if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
                        pageButton = d.buttons.get(i11);
                    } else {
                        pageButton = null;
                    }
                    if (pageButton == null) {
                        inlineButtonType = null;
                    } else {
                        inlineButtonType = pageButton.type;
                    }
                    long j11 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d10 = a4Var.d();
                        if (d10 != null && i11 >= 0 && i11 < d10.buttons.size()) {
                            pageButton2 = d10.buttons.get(i11);
                        } else {
                            pageButton2 = null;
                        }
                        if (pageButton2 != null) {
                            inlineButtonType2 = pageButton2.type;
                        }
                        if (inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                            j11 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id;
                        }
                        tL_inlineButtonTypeUserProfile.user_id = j11;
                        a4Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 1:
            default:
                gx0 gx0Var = (gx0) this.f3266c;
                k20 k20Var = (k20) this.d;
                Context context = (Context) this.e;
                boolean z11 = this.f3265b;
                String trim2 = gx0Var.getText().toString().trim();
                th.b bVar = null;
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(org.telegram.messenger.i0.N3(trim2.toString()))) {
                    org.telegram.messenger.i0.v1(gx0Var);
                    if (!z11) {
                        bVar = new th.b();
                    }
                    org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, context, bVar);
                    x1Var2.r(250L);
                    k20Var.a(trim2, new kg.d0(x1Var2, x1Var, gx0Var, 4));
                    return;
                }
                gx0Var.setErrorText(".");
                org.telegram.messenger.i0.F3(-6.0f, gx0Var, null);
                org.telegram.messenger.t2.APP_ERROR.a();
                org.telegram.messenger.i0.J3(gx0Var);
                return;
            case 2:
                un unVar = (un) this.f3266c;
                boolean z12 = this.f3265b;
                ((wp) this.d).G2 = 1;
                wp.d1().edit().putInt("secretWebpage2", unVar.getMessagesController().G2).commit();
                unVar.X5 = null;
                unVar.tb((CharSequence) this.e, z12);
                return;
            case 3:
                boolean z13 = this.f3265b;
                Context context2 = (Context) this.f3266c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (z13) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                        context2.startActivity(intent);
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
        }
    }

    @Override
    public void run(long j10) {
        yh.e eVar = (yh.e) this.f3266c;
        String str = (String) this.e;
        eVar.getClass();
        ((org.telegram.ui.ActionBar.x1) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        eVar.f54487b = -j10;
        eVar.f54488c = eVar.getMessagesController().L0(Long.valueOf(j10));
        eVar.a0(str, this.f3265b);
    }

    public o4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f3264a = i10;
        this.f3266c = obj;
        this.d = obj2;
        this.f3265b = z10;
        this.e = obj3;
    }

    public o4(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f3264a = i10;
        this.f3265b = z10;
        this.f3266c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
