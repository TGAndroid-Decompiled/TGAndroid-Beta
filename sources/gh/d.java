package gh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f9112a;
    public final long f9113b;
    public long e;
    public long f9115f;
    public long f9116g;
    public long h;
    public boolean f9117i;
    public final RectF f9114c = new RectF();
    public float f9118j = 0.0f;
    public float f9119k = 0.0f;
    public float f9120l = Float.MAX_VALUE;
    public float f9121m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f9112a = i10;
        this.f9113b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f9112a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f9116g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f9119k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f9118j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f9118j;
        if (f7 != 0.0f) {
            float f10 = this.f9120l;
            float f11 = this.f9121m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
