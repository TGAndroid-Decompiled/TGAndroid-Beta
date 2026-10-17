package ih;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f13104a;
    public final long f13105b;
    public long e;
    public long f13107f;
    public long f13108g;
    public long h;
    public boolean f13109i;
    public final RectF f13106c = new RectF();
    public float f13110j = 0.0f;
    public float f13111k = 0.0f;
    public float f13112l = Float.MAX_VALUE;
    public float f13113m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j10) {
        this.f13104a = i10;
        this.f13105b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f13104a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f13108g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f13111k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f13110j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f13110j;
        if (f7 != 0.0f) {
            float f10 = this.f13112l;
            float f11 = this.f13113m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
