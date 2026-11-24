package defpackage;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zy1 {
    public final int a;
    public final long b;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public final RectF c = new RectF();
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = Float.MAX_VALUE;
    public float m = 0.0f;
    public final long d = Utilities.b.nextLong();

    public zy1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f = this.k;
        if (f == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.j / f) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f = this.j;
        if (f != 0.0f) {
            float f2 = this.l;
            float f3 = this.m;
            if (f2 <= f3) {
                return Math.round(((f3 - f2) / f) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
