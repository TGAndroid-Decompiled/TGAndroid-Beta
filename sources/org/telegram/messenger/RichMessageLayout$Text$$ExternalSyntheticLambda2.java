package org.telegram.messenger;

import android.view.View;

public final class RichMessageLayout$Text$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId = 0;
    public final RichMessageLayout.Text f$0;
    public final View f$1;
    public final RichMessageLayout f$2;

    public RichMessageLayout$Text$$ExternalSyntheticLambda2(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f$0 = text;
        this.f$1 = view;
        this.f$2 = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$revealSpoilers$4(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$revealSpoilers$3(this.f$2, this.f$1);
                break;
        }
    }

    public RichMessageLayout$Text$$ExternalSyntheticLambda2(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f$0 = text;
        this.f$2 = richMessageLayout;
        this.f$1 = view;
    }
}
