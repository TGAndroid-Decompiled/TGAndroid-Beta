package lh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.rn;

public final class p5 extends rn {
    public final Utilities.Callback2 Mc;
    public final f6 Nc;

    public p5(f6 f6Var, Utilities.Callback2 callback2) {
        super(null);
        this.Nc = f6Var;
        this.Mc = callback2;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Object obj;
        Object obj2;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = new TL_stories.TL_mediaAreaGeoPoint();
            tL_mediaAreaGeoPoint.geo = messageMedia.geo;
            obj2 = tL_mediaAreaGeoPoint;
        } else {
            if (!(messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                return;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
            long j11 = tL_messageMediaVenue.query_id;
            if (j11 == -1 || j11 == -2) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint2.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint2.flags |= 1;
                }
                Utilities.globalQueue.postRunnable(new jh.p6(22, messageMedia, tL_mediaAreaGeoPoint2));
                obj = tL_mediaAreaGeoPoint2;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                obj = tL_inputMediaAreaVenue;
            }
            obj2 = obj;
        }
        this.Mc.run(messageMedia, obj2);
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Nc.getContext());
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.Nc.C1;
    }

    @Override
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final boolean x9() {
        return false;
    }
}
