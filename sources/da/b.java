package da;

import ai.a4;
import ai.x9;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.p1;
import ci.v7;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.k0;
import e9.n0;
import e9.x1;
import hi.f;
import i5.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.t3;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
import x2.d;
import x2.e;
import x2.i;
import x2.k;
import x2.n;
import x9.w;
public final class b implements g, MessagesStorage.LongCallback, a2, MessagesController.ErrorDelegate, k {
    public final int f7909a;
    public final boolean f7910b;
    public final Object f7911c;
    public final Object d;
    public final Object e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f7909a = i10;
        this.f7911c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7910b = z10;
    }

    @Override
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        n nVar = (n) this.f7911c;
        i iVar = (i) this.d;
        nVar.getClass();
        d dVar = new d(nVar, iVar);
        int i11 = ((int[]) this.e)[i10];
        k0 t10 = n0.t();
        for (int i12 = 0; i12 < p1Var.f3900a; i12++) {
            t10.c(new e(i10, p1Var, i12, iVar, iArr[i12], this.f7910b, dVar, i11));
        }
        return t10.f();
    }

    @Override
    public void c(Exception exc) {
        c cVar = (c) this.f7911c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        x9.b bVar = (x9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f7910b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new v7(11, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = w.f49746a;
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
    public void g(b2 b2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        ci.b bVar;
        switch (this.f7909a) {
            case 2:
                boolean z10 = this.f7910b;
                x9 x9Var = (x9) this.f7911c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                t3 t3Var = (t3) this.e;
                int i11 = t3Var.f15528b;
                if (!z10) {
                    x9Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = t3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = t3Var.d();
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
                        t3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qn qnVar = (qn) this.f7911c;
                boolean z11 = this.f7910b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", qnVar.getMessagesController().secretWebpagePreview).commit();
                qnVar.H5 = null;
                qnVar.cb((CharSequence) this.e, z11);
                return;
            case 4:
                boolean z12 = this.f7910b;
                Context context = (Context) this.f7911c;
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
                ty0 ty0Var = (ty0) this.f7911c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.f7910b;
                String trim2 = ty0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(ty0Var);
                    if (z13) {
                        bVar = null;
                    } else {
                        bVar = new ci.b();
                    }
                    b2 b2Var2 = new b2(context2, 3, bVar);
                    b2Var2.r(250L);
                    callback2.run(trim2, new a4(b2Var2, b2Var, ty0Var, 9));
                    return;
                }
                ty0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(ty0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(ty0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.j0((ProfileActivity) this.f7911c, (boolean[]) this.d, this.f7910b, (n2) this.e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f7909a = i10;
        this.f7911c = obj;
        this.d = obj2;
        this.f7910b = z10;
        this.e = obj3;
    }

    @Override
    public void run(long j10) {
        f fVar = (f) this.f7911c;
        String str = (String) this.e;
        fVar.getClass();
        ((b2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.f12141a = -j10;
        fVar.f12142b = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.V(str, this.f7910b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f7909a = i10;
        this.f7910b = z10;
        this.f7911c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
