package defpackage;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ov7 extends yv1 {
    public final jac Gd;
    public final xv7 Hd;

    public ov7(xv7 xv7Var, jac jacVar) {
        super(null);
        this.Hd = xv7Var;
        this.Gd = jacVar;
    }

    @Override
    public final boolean Y7() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint;
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
            tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
            long j2 = tL_messageMediaVenue.query_id;
            if (j2 != -1 && j2 != -2) {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            } else {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new bl7(messageMedia, tL_mediaAreaGeoPoint3, (byte) 16));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        } else {
            return;
        }
        this.Gd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override
    public final Activity getParentActivity() {
        return gm.W(this.Hd.getContext());
    }

    @Override
    public final ylb getResourceProvider() {
        return this.Hd.w1;
    }

    @Override
    public final TLRPC.User h() {
        return z8c.h(this.currentAccount).f();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }
}
