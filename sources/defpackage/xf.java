package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class xf implements ed, vc7, pc3, jl3, z97, j1c {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xf(y0b y0bVar, i8c i8cVar, Context context, boolean z) {
        this.a = (byte) 8;
        this.d = y0bVar;
        this.e = i8cVar;
        this.c = context;
        this.b = z;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        RectF rectF = ProfileActivity.Z6;
        return ((ProfileActivity) this.c).D2((boolean[]) this.d, this.b, (d) this.e, tL_error);
    }

    @Override
    public final void c(TLRPC.TL_error tL_error, String str) {
        boolean z;
        jm3 jm3Var = (jm3) this.c;
        kl3 kl3Var = (kl3) this.d;
        kl3 kl3Var2 = (kl3) this.e;
        if (jm3Var.r != 4) {
            return;
        }
        if (str == null) {
            jm3Var.r = (byte) 3;
            jm3Var.K = kl3Var;
            jm3Var.F.f(false);
            jm3Var.j(0L, 240L);
            if (!this.b) {
                jm3Var.J = null;
            }
            jm3Var.w.d(kl3Var.a(), false);
            an3 an3Var = jm3Var.w;
            if (jm3Var.J != null) {
                z = true;
            } else {
                z = false;
            }
            an3Var.setRevert(z);
            jm3Var.D(false);
            jm3.G(tL_error);
            return;
        }
        gl.e3(new mg3(jm3Var, str, kl3Var2, (byte) 8), Math.max(0L, (jm3Var.V + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public final void e(Exception exc) {
        f89 f89Var = (f89) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        b80 b80Var = (b80) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new lw8(f89Var, countDownLatch, (byte) 15)).start();
            ExecutorService executorService = u8c.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            j = nanoTime - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(b80Var);
    }

    @Override
    public final w59 j(int i, sxb sxbVar, int[] iArr) {
        sc3 sc3Var = (sc3) this.c;
        nc3 nc3Var = (nc3) this.d;
        sc3Var.getClass();
        ic3 ic3Var = new ic3(sc3Var, nc3Var);
        int i2 = ((int[]) this.e)[i];
        jm5 p = mm5.p();
        for (int i3 = 0; i3 < sxbVar.a; i3++) {
            p.c(new jc3(i, sxbVar, i3, nc3Var, iArr[i3], this.b, ic3Var, i2));
        }
        return p.f();
    }

    @Override
    public final void run(long j) {
        xm2 xm2Var = (xm2) this.c;
        String str = (String) this.e;
        ((hd) this.d).dismiss();
        if (j == 0) {
            return;
        }
        xm2Var.b = -j;
        xm2Var.c = xm2Var.getMessagesController().K0(Long.valueOf(j));
        xm2Var.Y(str, this.b);
    }

    @Override
    public final void u(hd hdVar, int i) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j;
        TL_keyboard.PageButton pageButton2;
        TL_keyboard.InlineButtonType inlineButtonType2 = null;
        f53 f53Var = null;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                vs2 vs2Var = (vs2) this.e;
                if (z) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                atomicBoolean.set(true);
                vs2Var.accept(Boolean.TRUE);
                return;
            case 1:
                mu1 mu1Var = (mu1) this.c;
                boolean z2 = this.b;
                mu1Var.getClass();
                ((na7) this.d).z2 = 1;
                na7.c1().edit().putInt("secretWebpage2", mu1Var.getMessagesController().z2).commit();
                mu1Var.Z5 = null;
                mu1Var.hb((CharSequence) this.e, z2);
                return;
            case 7:
                boolean z3 = this.b;
                d97 d97Var = (d97) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ve9 ve9Var = (ve9) this.e;
                int i2 = ve9Var.b;
                if (!z3) {
                    d97Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = ve9Var.d();
                    if (d != null && i2 >= 0 && i2 < d.buttons.size()) {
                        pageButton = d.buttons.get(i2);
                    } else {
                        pageButton = null;
                    }
                    if (pageButton == null) {
                        inlineButtonType = null;
                    } else {
                        inlineButtonType = pageButton.type;
                    }
                    long j2 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j = 0;
                    }
                    if (j > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d2 = ve9Var.d();
                        if (d2 != null && i2 >= 0 && i2 < d2.buttons.size()) {
                            pageButton2 = d2.buttons.get(i2);
                        } else {
                            pageButton2 = null;
                        }
                        if (pageButton2 != null) {
                            inlineButtonType2 = pageButton2.type;
                        }
                        if (inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                            j2 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id;
                        }
                        tL_inlineButtonTypeUserProfile.user_id = j2;
                        ve9Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            default:
                y0b y0bVar = (y0b) this.d;
                i8c i8cVar = (i8c) this.e;
                Context context2 = (Context) this.c;
                boolean z4 = this.b;
                String trim2 = y0bVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(gl.J3(trim2.toString()))) {
                    gl.t1(y0bVar);
                    if (!z4) {
                        f53Var = new f53();
                    }
                    hd hdVar2 = new hd(3, f53Var, context2);
                    hdVar2.q(250L);
                    i8cVar.a(trim2, new f28(hdVar2, hdVar, y0bVar, (byte) 10));
                    return;
                }
                y0bVar.setErrorText(".");
                gl.B3(-6.0f, y0bVar, null);
                pw0.APP_ERROR.a();
                gl.F3(y0bVar);
                return;
        }
    }

    public xf(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public xf(d dVar, gk7 gk7Var, CharSequence charSequence, boolean z, byte b) {
        this.a = b;
        this.c = dVar;
        this.d = gk7Var;
        this.e = charSequence;
        this.b = z;
    }

    public xf(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
