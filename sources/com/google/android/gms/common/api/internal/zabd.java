package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
public final class zabd extends zabw {
    private final WeakReference zaa;

    public zabd(zabe zabeVar) {
        this.zaa = new WeakReference(zabeVar);
    }

    @Override
    public final void zaa() {
        zabe zabeVar = (zabe) this.zaa.get();
        if (zabeVar == null) {
            return;
        }
        zabe.zai(zabeVar);
    }
}
