package ca;

import ai.ca;
import ai.d5;
import ai.t4;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.l1;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.f0;
import e9.i0;
import fi.f;
import i5.g;
import ii.u3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
import w9.x;
import x2.d;
import x2.e;
import x2.i;
import x2.m;
import x2.p;
public final class b implements g, MessagesStorage.LongCallback, z1, MessagesController.ErrorDelegate, m {
    public final int f4567a;
    public final boolean f4568b;
    public final Object f4569c;
    public final Object d;
    public final Object f4570e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4567a = i10;
        this.f4569c = obj;
        this.d = obj2;
        this.f4570e = obj3;
        this.f4568b = z10;
    }

    @Override
    public void a(Exception exc) {
        c cVar = (c) this.f4569c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        w9.b bVar = (w9.b) this.f4570e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f4568b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ca(12, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = x.f50390a;
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
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        p pVar = (p) this.f4569c;
        i iVar = (i) this.d;
        pVar.getClass();
        d dVar = new d(pVar, iVar);
        int i11 = ((int[]) this.f4570e)[i10];
        f0 u10 = i0.u();
        for (int i12 = 0; i12 < l1Var.f3415a; i12++) {
            u10.b(new e(i10, l1Var, i12, iVar, iArr[i12], this.f4568b, dVar, i11));
        }
        return u10.i();
    }

    @Override
    public void f(a2 a2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        ai.d dVar;
        switch (this.f4567a) {
            case 2:
                boolean z10 = this.f4568b;
                t4 t4Var = (t4) this.f4569c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                u3 u3Var = (u3) this.f4570e;
                int i11 = u3Var.f12731b;
                if (!z10) {
                    t4Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = u3Var.d();
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
                    long j10 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j3 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j3 = 0;
                    }
                    if (j3 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d10 = u3Var.d();
                        if (d10 != null && i11 >= 0 && i11 < d10.buttons.size()) {
                            pageButton2 = d10.buttons.get(i11);
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
                        u3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zn znVar = (zn) this.f4569c;
                boolean z11 = this.f4568b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", znVar.getMessagesController().secretWebpagePreview).commit();
                znVar.H5 = null;
                znVar.cb((CharSequence) this.f4570e, z11);
                return;
            case 4:
                boolean z12 = this.f4568b;
                Context context = (Context) this.f4569c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f4570e;
                if (z12) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            default:
                cz0 cz0Var = (cz0) this.f4569c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.f4570e;
                boolean z13 = this.f4568b;
                String trim2 = cz0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(cz0Var);
                    if (z13) {
                        dVar = null;
                    } else {
                        dVar = new ai.d();
                    }
                    a2 a2Var2 = new a2(context2, 3, dVar);
                    a2Var2.q(250L);
                    callback2.run(trim2, new d5(a2Var2, a2Var, cz0Var, 8));
                    return;
                }
                cz0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(cz0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(cz0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f4569c, (boolean[]) this.d, this.f4568b, (m2) this.f4570e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4567a = i10;
        this.f4569c = obj;
        this.d = obj2;
        this.f4568b = z10;
        this.f4570e = obj3;
    }

    @Override
    public void run(long j3) {
        f fVar = (f) this.f4569c;
        String str = (String) this.f4570e;
        fVar.getClass();
        ((a2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.f9959a = -j3;
        fVar.f9960b = fVar.getMessagesController().getChat(Long.valueOf(j3));
        fVar.V(str, this.f4568b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f4567a = i10;
        this.f4568b = z10;
        this.f4569c = obj;
        this.d = obj2;
        this.f4570e = obj3;
    }
}
