package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
public final class j5 extends AbstractThreadedSyncAdapter {
    @Override
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            j5 j5Var = ContactsSyncAdapterService.f21220a;
            if (r2.f25040a) {
                a8.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e10) {
            a8.g(e10, true);
        }
    }
}
