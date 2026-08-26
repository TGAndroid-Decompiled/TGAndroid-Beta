package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public final class FileLoadOperation$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final int f$3;
    public final TLObject f$4;

    public FileLoadOperation$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2, TLObject tLObject, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoadOperation) this.f$0).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.f$1, this.f$2, this.f$3, this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((DialogsSearchAdapter) this.f$0).lambda$searchForumMessagesInternal$1((String) this.f$1, this.f$2, this.f$3, (TLRPC.TL_messages_search) this.f$4, tLObject, tL_error);
                break;
            default:
                ((DialogsSearchAdapter) this.f$0).lambda$searchMessagesInternal$4((String) this.f$1, this.f$2, this.f$3, (TLRPC.TL_messages_searchGlobal) this.f$4, tLObject, tL_error);
                break;
        }
    }
}
