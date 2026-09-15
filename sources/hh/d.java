package hh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f10498a;
    public final long f10499b;
    public long e;
    public long f10501f;
    public long f10502g;
    public long h;
    public boolean f10503i;
    public final RectF f10500c = new RectF();
    public float f10504j = 0.0f;
    public float f10505k = 0.0f;
    public float f10506l = Float.MAX_VALUE;
    public float f10507m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f10498a = i10;
        this.f10499b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f10498a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f10502g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f10505k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f10504j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f10504j;
        if (f7 != 0.0f) {
            float f10 = this.f10506l;
            float f11 = this.f10507m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
