package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f17779a;
    public final long f17780b;
    public long f17782e;
    public long f17783f;
    public long f17784g;
    public long h;
    public boolean f17785i;
    public final RectF f17781c = new RectF();
    public float f17786j = 0.0f;
    public float f17787k = 0.0f;
    public float f17788l = Float.MAX_VALUE;
    public float f17789m = 0.0f;
    public final long d = Utilities.f22808b.nextLong();

    public d(int i7, long j3) {
        this.f17779a = i7;
        this.f17780b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f17779a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f17784g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f17787k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f17786j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f17786j;
        if (f10 != 0.0f) {
            float f11 = this.f17788l;
            float f12 = this.f17789m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
