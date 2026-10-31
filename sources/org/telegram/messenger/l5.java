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
            l5 l5Var = ContactsSyncAdapterService.f14359a;
            if (v2.f18448a) {
                f8.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e) {
            f8.g(e, true);
        }
    }
}
