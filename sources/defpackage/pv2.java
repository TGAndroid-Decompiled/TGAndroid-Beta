package defpackage;

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import org.telegram.messenger.ContactsSyncAdapterService;
public final class pv2 extends AbstractThreadedSyncAdapter {
    @Override
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            pv2 pv2Var = ContactsSyncAdapterService.a;
            if (f11.a) {
                cc4.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e) {
            cc4.g(e, true);
        }
    }
}
