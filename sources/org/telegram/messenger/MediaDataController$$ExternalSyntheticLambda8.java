package org.telegram.messenger;

import org.telegram.ui.Components.Bulletin;

public final class MediaDataController$$ExternalSyntheticLambda8 implements Runnable {
    public final Bulletin.UndoButton f$0;

    public MediaDataController$$ExternalSyntheticLambda8(Bulletin.UndoButton undoButton) {
        this.f$0 = undoButton;
    }

    @Override
    public final void run() {
        this.f$0.undo();
    }
}
