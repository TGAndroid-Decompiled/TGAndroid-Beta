package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
public final class l5 extends AbstractThreadedSyncAdapter {
    @Override
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            l5 l5Var = ContactsSyncAdapterService.f22643a;
            if (s2.f26730a) {
                a8.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e10) {
            a8.g(e10, true);
        }
    }
}
