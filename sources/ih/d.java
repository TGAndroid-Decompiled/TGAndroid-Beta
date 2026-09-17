package ih;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f12306a;
    public final long f12307b;
    public long f12309e;
    public long f12310f;
    public long f12311g;
    public long h;
    public boolean f12312i;
    public final RectF f12308c = new RectF();
    public float f12313j = 0.0f;
    public float f12314k = 0.0f;
    public float f12315l = Float.MAX_VALUE;
    public float f12316m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f12306a = i10;
        this.f12307b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f12306a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f12311g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f12314k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f12313j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f12313j;
        if (f7 != 0.0f) {
            float f10 = this.f12315l;
            float f11 = this.f12316m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
