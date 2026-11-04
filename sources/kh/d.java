package kh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f17258a;
    public final long f17259b;
    public long f17261e;
    public long f17262f;
    public long f17263g;
    public long h;
    public boolean f17264i;
    public final RectF f17260c = new RectF();
    public float f17265j = 0.0f;
    public float f17266k = 0.0f;
    public float f17267l = Float.MAX_VALUE;
    public float f17268m = 0.0f;
    public final long d = Utilities.f21385b.nextLong();

    public d(int i3, long j10) {
        this.f17258a = i3;
        this.f17259b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f17258a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f17263g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f17266k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f17265j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f17265j;
        if (f10 != 0.0f) {
            float f11 = this.f17267l;
            float f12 = this.f17268m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
