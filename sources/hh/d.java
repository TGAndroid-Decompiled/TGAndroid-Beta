package hh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f10504a;
    public final long f10505b;
    public long e;
    public long f10507f;
    public long f10508g;
    public long h;
    public boolean f10509i;
    public final RectF f10506c = new RectF();
    public float f10510j = 0.0f;
    public float f10511k = 0.0f;
    public float f10512l = Float.MAX_VALUE;
    public float f10513m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f10504a = i10;
        this.f10505b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f10504a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f10508g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f10511k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f10510j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f10510j;
        if (f7 != 0.0f) {
            float f10 = this.f10512l;
            float f11 = this.f10513m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
