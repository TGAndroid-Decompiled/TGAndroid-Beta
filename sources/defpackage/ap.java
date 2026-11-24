package defpackage;

import com.google.android.gms.common.api.Status;
public class ap extends Exception {
    @Deprecated
    protected final Status mStatus;

    public ap(com.google.android.gms.common.api.Status r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap.<init>(com.google.android.gms.common.api.Status):void");
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.b;
    }
}
