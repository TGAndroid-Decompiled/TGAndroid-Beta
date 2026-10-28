package ea;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.q1;
import bi.s9;
import bi.v3;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.q0;
import f9.f0;
import f9.i0;
import f9.s1;
import j5.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import li.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
import x2.d;
import x2.f;
import x2.j;
import x2.l;
import x2.o;
import y9.x;
public final class b implements g, MessagesStorage.LongCallback, b2, MessagesController.ErrorDelegate, l {
    public final int f9861a;
    public final boolean f9862b;
    public final Object f9863c;
    public final Object d;
    public final Object e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f9861a = i10;
        this.f9863c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9862b = z10;
    }

    @Override
    public s1 a(int i10, q1 q1Var, int[] iArr) {
        o oVar = (o) this.f9863c;
        j jVar = (j) this.d;
        oVar.getClass();
        d dVar = new d(oVar, jVar);
        int i11 = ((int[]) this.e)[i10];
        f0 t10 = i0.t();
        for (int i12 = 0; i12 < q1Var.f3358a; i12++) {
            t10.c(new f(i10, q1Var, i12, jVar, iArr[i12], this.f9862b, dVar, i11));
        }
        return t10.f();
    }

    @Override
    public void d(Exception exc) {
        c cVar = (c) this.f9863c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        y9.b bVar = (y9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f9862b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new q0(1, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = x.f52551a;
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
    public void h(e2 e2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        di.b bVar;
        switch (this.f9861a) {
            case 2:
                boolean z10 = this.f9862b;
                s9 s9Var = (s9) this.f9863c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                s3 s3Var = (s3) this.e;
                int i11 = s3Var.f17469b;
                if (!z10) {
                    s9Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = s3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = s3Var.d();
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
                        s3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wn wnVar = (wn) this.f9863c;
                boolean z11 = this.f9862b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", wnVar.getMessagesController().secretWebpagePreview).commit();
                wnVar.X5 = null;
                wnVar.lb((CharSequence) this.e, z11);
                return;
            case 4:
                boolean z12 = this.f9862b;
                Context context = (Context) this.f9863c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (z12) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            default:
                gz0 gz0Var = (gz0) this.f9863c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.f9862b;
                String trim2 = gz0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(gz0Var);
                    if (z13) {
                        bVar = null;
                    } else {
                        bVar = new di.b();
                    }
                    e2 e2Var2 = new e2(context2, 3, bVar);
                    e2Var2.r(250L);
                    callback2.run(trim2, new v3(e2Var2, e2Var, gz0Var, 9));
                    return;
                }
                gz0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(gz0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(gz0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.i0((ProfileActivity) this.f9863c, (boolean[]) this.d, this.f9862b, (r2) this.e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f9861a = i10;
        this.f9863c = obj;
        this.d = obj2;
        this.f9862b = z10;
        this.e = obj3;
    }

    @Override
    public void run(long j10) {
        ii.f fVar = (ii.f) this.f9863c;
        String str = (String) this.e;
        fVar.getClass();
        ((e2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.f14338b = -j10;
        fVar.f14339c = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.W(str, this.f9862b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f9861a = i10;
        this.f9862b = z10;
        this.f9863c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
