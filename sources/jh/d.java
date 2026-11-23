package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f17745a;
    public final long f17746b;
    public long f17748e;
    public long f17749f;
    public long f17750g;
    public long h;
    public boolean f17751i;
    public final RectF f17747c = new RectF();
    public float f17752j = 0.0f;
    public float f17753k = 0.0f;
    public float f17754l = Float.MAX_VALUE;
    public float f17755m = 0.0f;
    public final long d = Utilities.f22772b.nextLong();

    public d(int i7, long j3) {
        this.f17745a = i7;
        this.f17746b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f17745a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f17750g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f17753k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f17752j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f17752j;
        if (f10 != 0.0f) {
            float f11 = this.f17754l;
            float f12 = this.f17755m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
