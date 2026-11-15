package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f17368a;
    public final long f17369b;
    public long f17371e;
    public long f17372f;
    public long f17373g;
    public long h;
    public boolean f17374i;
    public final RectF f17370c = new RectF();
    public float f17375j = 0.0f;
    public float f17376k = 0.0f;
    public float f17377l = Float.MAX_VALUE;
    public float f17378m = 0.0f;
    public final long d = Utilities.f22414b.nextLong();

    public d(int i7, long j3) {
        this.f17368a = i7;
        this.f17369b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f17368a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f17373g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f17376k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f17375j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f17375j;
        if (f10 != 0.0f) {
            float f11 = this.f17377l;
            float f12 = this.f17378m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
