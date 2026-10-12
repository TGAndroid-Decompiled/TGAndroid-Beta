package hh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f11476a;
    public final long f11477b;
    public long f11479e;
    public long f11480f;
    public long f11481g;
    public long h;
    public boolean f11482i;
    public final RectF f11478c = new RectF();
    public float f11483j = 0.0f;
    public float f11484k = 0.0f;
    public float f11485l = Float.MAX_VALUE;
    public float f11486m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f11476a = i10;
        this.f11477b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f11476a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f11481g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f11484k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f11483j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f11483j;
        if (f7 != 0.0f) {
            float f10 = this.f11485l;
            float f11 = this.f11486m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
