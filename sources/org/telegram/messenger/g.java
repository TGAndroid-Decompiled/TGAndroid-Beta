package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f15229a;
    public final ArrayList f15230b;

    public g(ArrayList arrayList, int i10) {
        this.f15229a = i10;
        this.f15230b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15229a) {
            case 0:
                AndroidUtilities.B(this.f15230b);
                return;
            case 1:
                AndroidUtilities.j(this.f15230b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f15230b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f15230b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f15230b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f15230b);
                return;
        }
    }
}
