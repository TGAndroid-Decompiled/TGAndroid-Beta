package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import org.telegram.messenger.NotificationCenter;
public final class ContactsLoadingObserver {
    private final Callback callback;
    private final ContactsController contactsController;
    private final int currentAccount;
    private final Handler handler;
    private final NotificationCenter notificationCenter;
    private final NotificationCenter.NotificationCenterDelegate observer = new y1(this, 0);
    private final Runnable releaseRunnable;
    private boolean released;

    public interface Callback {
        void onResult(boolean z4);
    }

    private ContactsLoadingObserver(Callback callback) {
        this.callback = callback;
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.releaseRunnable = new e1(this, 17);
        this.contactsController = ContactsController.getInstance(i10);
        this.notificationCenter = NotificationCenter.getInstance(i10);
        this.handler = new Handler(Looper.myLooper());
    }

    public void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            onContactsLoadingStateUpdated(i11, false);
        }
    }

    public void lambda$new$1() {
        onContactsLoadingStateUpdated(this.currentAccount, true);
    }

    public static void observe(Callback callback, long j10) {
        new ContactsLoadingObserver(callback).start(j10);
    }

    private boolean onContactsLoadingStateUpdated(int i10, boolean z4) {
        if (!this.released) {
            boolean z10 = this.contactsController.contactsLoaded;
            if (z10 || z4) {
                release();
                this.callback.onResult(z10);
                return true;
            }
            return false;
        }
        return false;
    }

    public void release() {
        if (!this.released) {
            NotificationCenter notificationCenter = this.notificationCenter;
            if (notificationCenter != null) {
                notificationCenter.removeObserver(this.observer, NotificationCenter.contactsDidLoad);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }

    public void start(long j10) {
        if (!onContactsLoadingStateUpdated(this.currentAccount, false)) {
            this.notificationCenter.addObserver(this.observer, NotificationCenter.contactsDidLoad);
            this.handler.postDelayed(this.releaseRunnable, j10);
        }
    }
}
