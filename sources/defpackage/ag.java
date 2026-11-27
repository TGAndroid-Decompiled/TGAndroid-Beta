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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class ag implements fd, ef7, id3, bm3, gc7, i5c {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ag(v4b v4bVar, icc iccVar, Context context, boolean z) {
        this.a = (byte) 8;
        this.d = v4bVar;
        this.e = iccVar;
        this.c = context;
        this.b = z;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        RectF rectF = ProfileActivity.Z6;
        return ((ProfileActivity) this.c).E2((boolean[]) this.d, this.b, (e) this.e, tL_error);
    }

    @Override
    public final void c(TLRPC.TL_error tL_error, String str) {
        boolean z;
        bn3 bn3Var = (bn3) this.c;
        cm3 cm3Var = (cm3) this.d;
        cm3 cm3Var2 = (cm3) this.e;
        if (bn3Var.r != 4) {
            return;
        }
        if (str == null) {
            bn3Var.J(3);
            bn3Var.K = cm3Var;
            bn3Var.F.f(false);
            bn3Var.l(0L, 240L);
            if (!this.b) {
                bn3Var.J = null;
            }
            bn3Var.w.e(cm3Var.a(), false);
            rn3 rn3Var = bn3Var.w;
            if (bn3Var.J != null) {
                z = true;
            } else {
                z = false;
            }
            rn3Var.setRevert(z);
            bn3Var.G(false);
            bn3.K(tL_error);
            return;
        }
        hl.d3(new cv2(bn3Var, str, cm3Var2, (byte) 12), Math.max(0L, (bn3Var.W + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public final void d(Exception exc) {
        rb9 rb9Var = (rb9) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        d80 d80Var = (d80) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new z09(rb9Var, countDownLatch, (byte) 13)).start();
            ExecutorService executorService = ucc.a;
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
        taskCompletionSource.trySetResult(d80Var);
    }

    @Override
    public final j99 l(int i, t1c t1cVar, int[] iArr) {
        ld3 ld3Var = (ld3) this.c;
        gd3 gd3Var = (gd3) this.d;
        ld3Var.getClass();
        bd3 bd3Var = new bd3(ld3Var, gd3Var);
        int i2 = ((int[]) this.e)[i];
        mo5 p = po5.p();
        for (int i3 = 0; i3 < t1cVar.a; i3++) {
            p.c(new cd3(i, t1cVar, i3, gd3Var, iArr[i3], this.b, bd3Var, i2));
        }
        return p.f();
    }

    @Override
    public final void run(long j) {
        qn2 qn2Var = (qn2) this.c;
        String str = (String) this.e;
        ((id) this.d).dismiss();
        if (j == 0) {
            return;
        }
        qn2Var.b = -j;
        qn2Var.c = qn2Var.getMessagesController().M0(Long.valueOf(j));
        qn2Var.Y(str, this.b);
    }

    @Override
    public final void w(id idVar, int i) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j;
        TL_keyboard.PageButton pageButton2;
        TL_keyboard.InlineButtonType inlineButtonType2 = null;
        x53 x53Var = null;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                pt2 pt2Var = (pt2) this.e;
                if (z) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                atomicBoolean.set(true);
                pt2Var.accept(Boolean.TRUE);
                return;
            case 1:
                zu1 zu1Var = (zu1) this.c;
                boolean z2 = this.b;
                zu1Var.getClass();
                ((uc7) this.d).z2 = 1;
                uc7.e1().edit().putInt("secretWebpage2", zu1Var.getMessagesController().z2).commit();
                zu1Var.Z5 = null;
                zu1Var.ub((CharSequence) this.e, z2);
                return;
            case 7:
                boolean z3 = this.b;
                lb7 lb7Var = (lb7) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                mi9 mi9Var = (mi9) this.e;
                int i2 = mi9Var.b;
                if (!z3) {
                    lb7Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = mi9Var.d();
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
                        TL_iv.pageBlockButtonRow d2 = mi9Var.d();
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
                        mi9Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            default:
                v4b v4bVar = (v4b) this.d;
                icc iccVar = (icc) this.e;
                Context context2 = (Context) this.c;
                boolean z4 = this.b;
                String trim2 = v4bVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(hl.I3(trim2.toString()))) {
                    hl.t1(v4bVar);
                    if (!z4) {
                        x53Var = new x53();
                    }
                    id idVar2 = new id(3, x53Var, context2);
                    idVar2.q(250L);
                    iccVar.a(trim2, new v58(idVar2, idVar, v4bVar, (byte) 10));
                    return;
                }
                v4bVar.setErrorText(".");
                hl.A3(-6.0f, v4bVar, null);
                yw0.APP_ERROR.a();
                hl.E3(v4bVar);
                return;
        }
    }

    public ag(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public ag(e eVar, fn7 fn7Var, CharSequence charSequence, boolean z, byte b) {
        this.a = b;
        this.c = eVar;
        this.d = fn7Var;
        this.e = charSequence;
        this.b = z;
    }

    public ag(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
