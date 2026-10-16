package ih;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f11722a;
    public final long f11723b;
    public long e;
    public long f11725f;
    public long f11726g;
    public long h;
    public boolean f11727i;
    public final RectF f11724c = new RectF();
    public float f11728j = 0.0f;
    public float f11729k = 0.0f;
    public float f11730l = Float.MAX_VALUE;
    public float f11731m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j10) {
        this.f11722a = i10;
        this.f11723b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f11722a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f11726g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f11729k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f11728j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f11728j;
        if (f7 != 0.0f) {
            float f10 = this.f11730l;
            float f11 = this.f11731m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
