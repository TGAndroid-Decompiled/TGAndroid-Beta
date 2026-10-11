package hh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f11477a;
    public final long f11478b;
    public long f11480e;
    public long f11481f;
    public long f11482g;
    public long h;
    public boolean f11483i;
    public final RectF f11479c = new RectF();
    public float f11484j = 0.0f;
    public float f11485k = 0.0f;
    public float f11486l = Float.MAX_VALUE;
    public float f11487m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f11477a = i10;
        this.f11478b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f11477a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f11482g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f11485k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f11484j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f11484j;
        if (f7 != 0.0f) {
            float f10 = this.f11486l;
            float f11 = this.f11487m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
