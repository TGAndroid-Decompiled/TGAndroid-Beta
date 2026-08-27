package l9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.b0;
import gh.i;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.p6;
import oh.f;
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
import org.telegram.ui.Components.ix0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;
import rh.m3;
import t2.g;

public final class b implements g, MessagesStorage.LongCallback, a2, MessagesController.ErrorDelegate {

    public final int f15493a;

    public final boolean f15494b;

    public final Object f15495c;
    public final Object d;

    public final Object f15496e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f15493a = i10;
        this.f15495c = obj;
        this.d = obj2;
        this.f15496e = obj3;
        this.f15494b = z10;
    }

    @Override
    public void d(Exception exc) throws Throwable {
        c cVar = (c) this.f15495c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        f9.b bVar = (f9.b) this.f15496e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f15494b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new p6(16, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = b0.f5926a;
            boolean z11 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z11 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f15493a) {
            case 2:
                rn rnVar = (rn) this.f15495c;
                MessagesController messagesController = (MessagesController) this.d;
                CharSequence charSequence = (CharSequence) this.f15496e;
                boolean z10 = this.f15494b;
                messagesController.secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", rnVar.getMessagesController().secretWebpagePreview).commit();
                rnVar.D5 = null;
                rnVar.Ya(charSequence, z10);
                break;
            case 3:
                boolean z11 = this.f15494b;
                Context context = (Context) this.f15495c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f15496e;
                if (!z11) {
                    atomicBoolean.set(true);
                    aVar.accept(Boolean.TRUE);
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            case 4:
                ix0 ix0Var = (ix0) this.f15495c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.f15496e;
                boolean z12 = this.f15494b;
                String strTrim = ix0Var.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(AndroidUtilities.translitSafe(strTrim.toString()))) {
                    ix0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(ix0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(ix0Var);
                } else {
                    AndroidUtilities.hideKeyboard(ix0Var);
                    b2 b2Var2 = new b2(context2, 3, z12 ? null : new jh.b());
                    b2Var2.q(250L);
                    callback2.run(strTrim, new i(b2Var2, b2Var, ix0Var, 10));
                }
                break;
            default:
                boolean z13 = this.f15494b;
                cg.c cVar = (cg.c) this.f15495c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                m3 m3Var = (m3) this.f15496e;
                int i11 = m3Var.f47270b;
                if (!z13) {
                    cVar.run();
                    break;
                } else {
                    String strTrim2 = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrowD = m3Var.d();
                        TL_keyboard.PageButton pageButton = (pageblockbuttonrowD == null || i11 < 0 || i11 >= pageblockbuttonrowD.buttons.size()) ? null : pageblockbuttonrowD.buttons.get(i11);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow pageblockbuttonrowD2 = m3Var.d();
                            TL_keyboard.PageButton pageButton2 = (pageblockbuttonrowD2 == null || i11 < 0 || i11 >= pageblockbuttonrowD2.buttons.size()) ? null : pageblockbuttonrowD2.buttons.get(i11);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            m3Var.a(strTrim2, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f15495c, (boolean[]) this.d, this.f15494b, (n2) this.f15496e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f15493a = i10;
        this.f15495c = obj;
        this.d = obj2;
        this.f15494b = z10;
        this.f15496e = obj3;
    }

    @Override
    public void run(long j10) {
        f fVar = (f) this.f15495c;
        b2 b2Var = (b2) this.d;
        String str = (String) this.f15496e;
        fVar.getClass();
        b2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.f19477a = -j10;
        fVar.f19478b = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.V(str, this.f15494b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f15493a = i10;
        this.f15494b = z10;
        this.f15495c = obj;
        this.d = obj2;
        this.f15496e = obj3;
    }
}
