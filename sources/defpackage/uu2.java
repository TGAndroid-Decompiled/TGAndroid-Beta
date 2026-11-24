package defpackage;

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import org.telegram.messenger.ContactsSyncAdapterService;
public final class uu2 extends AbstractThreadedSyncAdapter {
    @Override
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            uu2 uu2Var = ContactsSyncAdapterService.a;
            if (w01.a) {
                fa4.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e) {
            fa4.g(e, true);
        }
    }
}
