package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f16411a;
    public final ArrayList f16412b;

    public g(ArrayList arrayList, int i10) {
        this.f16411a = i10;
        this.f16412b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16411a) {
            case 0:
                AndroidUtilities.B(this.f16412b);
                return;
            case 1:
                AndroidUtilities.j(this.f16412b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f16412b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f16412b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f16412b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f16412b);
                return;
        }
    }
}
