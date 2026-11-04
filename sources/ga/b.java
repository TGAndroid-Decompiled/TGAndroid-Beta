package ga;

import ai.m;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import ci.u8;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.o1;
import g9.f0;
import g9.i0;
import g9.s1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.g;
import mi.q3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.lr;
import org.telegram.messenger.n10;
import org.telegram.messenger.p2;
import org.telegram.messenger.so;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
import z2.d;
import z2.e;
import z2.i;
import z2.k;
import z2.n;
import z9.y;
public final class b implements g, lr, p1, so, k {
    public final int f12186a;
    public final boolean f12187b;
    public final Object f12188c;
    public final Object d;
    public final Object f12189e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f12186a = i3;
        this.f12188c = obj;
        this.d = obj2;
        this.f12189e = obj3;
        this.f12187b = z10;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return ProfileActivity.f0((ProfileActivity) this.f12188c, (boolean[]) this.d, this.f12187b, (d2) this.f12189e, tL_error);
    }

    @Override
    public void b(Exception exc) {
        c cVar = (c) this.f12188c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        z9.b bVar = (z9.b) this.f12189e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f12187b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new g2.c(6, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = y.f60263a;
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
        taskCompletionSource.trySetResult(bVar);
    }

    @Override
    public s1 c(int i3, o1 o1Var, int[] iArr) {
        n nVar = (n) this.f12188c;
        i iVar = (i) this.d;
        nVar.getClass();
        d dVar = new d(nVar, iVar);
        int i10 = ((int[]) this.f12189e)[i3];
        f0 p10 = i0.p();
        for (int i11 = 0; i11 < o1Var.f8252a; i11++) {
            p10.c(new e(i3, o1Var, i11, iVar, iArr[i11], this.f12187b, dVar, i10));
        }
        return p10.f();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        switch (this.f12186a) {
            case 2:
                boolean z10 = this.f12187b;
                u8 u8Var = (u8) this.f12188c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                q3 q3Var = (q3) this.f12189e;
                int i10 = q3Var.f19838b;
                if (!z10) {
                    u8Var.run();
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
                    long j11 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d10 = q3Var.d();
                        if (d10 != null && i10 >= 0 && i10 < d10.buttons.size()) {
                            pageButton2 = d10.buttons.get(i10);
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
                        q3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wm wmVar = (wm) this.f12188c;
                boolean z11 = this.f12187b;
                ((hp) this.d).H2 = 1;
                hp.e1().edit().putInt("secretWebpage2", wmVar.getMessagesController().H2).commit();
                wmVar.Y5 = null;
                wmVar.yb((CharSequence) this.f12189e, z11);
                return;
            case 4:
                boolean z12 = this.f12187b;
                Context context = (Context) this.f12188c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f12189e;
                if (z12) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + t0.f25457b.getPackageName()));
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
                aw0 aw0Var = (aw0) this.f12188c;
                n10 n10Var = (n10) this.d;
                Context context2 = (Context) this.f12189e;
                boolean z13 = this.f12187b;
                String trim2 = aw0Var.getText().toString().trim();
                ei.b bVar = null;
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(g0.O3(trim2.toString()))) {
                    g0.v1(aw0Var);
                    if (!z13) {
                        bVar = new ei.b();
                    }
                    org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, context2, bVar);
                    s1Var2.r(250L);
                    n10Var.a(trim2, new m(s1Var2, s1Var, aw0Var, 11));
                    return;
                }
                aw0Var.setErrorText(".");
                g0.G3(-6.0f, aw0Var, null);
                p2.APP_ERROR.a();
                g0.K3(aw0Var);
                return;
        }
    }

    @Override
    public void run(long j10) {
        ji.e eVar = (ji.e) this.f12188c;
        String str = (String) this.f12189e;
        eVar.getClass();
        ((org.telegram.ui.ActionBar.s1) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        eVar.f16294b = -j10;
        eVar.f16295c = eVar.getMessagesController().M0(Long.valueOf(j10));
        eVar.a0(str, this.f12187b);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.f12186a = i3;
        this.f12188c = obj;
        this.d = obj2;
        this.f12187b = z10;
        this.f12189e = obj3;
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i3) {
        this.f12186a = i3;
        this.f12187b = z10;
        this.f12188c = obj;
        this.d = obj2;
        this.f12189e = obj3;
    }
}
