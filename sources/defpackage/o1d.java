package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class o1d extends xx4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (queryLocalInterface instanceof y2d) {
            return (y2d) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 1);
    }

    @Override
    public final f84[] f() {
        return udd.c;
    }

    @Override
    public final int i() {
        return 253600000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override
    public final boolean p() {
        return true;
    }
}
