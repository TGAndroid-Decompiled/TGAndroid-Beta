package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f17847a;
    public final long f17848b;
    public long f17850e;
    public long f17851f;
    public long f17852g;
    public long h;
    public boolean f17853i;
    public final RectF f17849c = new RectF();
    public float f17854j = 0.0f;
    public float f17855k = 0.0f;
    public float f17856l = Float.MAX_VALUE;
    public float f17857m = 0.0f;
    public final long d = Utilities.f22875b.nextLong();

    public d(int i7, long j3) {
        this.f17847a = i7;
        this.f17848b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f17847a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f17852g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f17855k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f17854j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f17854j;
        if (f10 != 0.0f) {
            float f11 = this.f17856l;
            float f12 = this.f17857m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
