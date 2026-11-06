package fi;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.an;
public final class d5 extends an {
    public final v10 f11788rd;
    public final o5 f11789sd;

    public d5(o5 o5Var, v10 v10Var) {
        super(null);
        this.f11789sd = o5Var;
        this.f11788rd = v10Var;
    }

    @Override
    public final boolean T9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint;
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
            tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
            long j10 = tL_messageMediaVenue.query_id;
            if (j10 != -1 && j10 != -2) {
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
                Utilities.f21333e.c(new f2.h(6, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        } else {
            return;
        }
        this.f11788rd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f11789sd.getContext());
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f11789sd.f12540p1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return p10.i(this.currentAccount).f();
    }
}
