package org.telegram.messenger;

import android.content.DialogInterface;
public final class SharedConfig$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public static final SharedConfig$$ExternalSyntheticLambda0 INSTANCE = new SharedConfig$$ExternalSyntheticLambda0();

    private SharedConfig$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        SharedConfig.lambda$checkSdCard$1(dialogInterface, i);
    }
}
