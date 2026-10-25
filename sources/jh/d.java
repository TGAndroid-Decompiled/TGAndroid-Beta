package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f15923a;
    public final long f15924b;
    public long e;
    public long f15926f;
    public long f15927g;
    public long h;
    public boolean f15928i;
    public final RectF f15925c = new RectF();
    public float f15929j = 0.0f;
    public float f15930k = 0.0f;
    public float f15931l = Float.MAX_VALUE;
    public float f15932m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j10) {
        this.f15923a = i10;
        this.f15924b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f15923a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f15927g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f15930k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f15929j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f15929j;
        if (f7 != 0.0f) {
            float f10 = this.f15931l;
            float f11 = this.f15932m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
