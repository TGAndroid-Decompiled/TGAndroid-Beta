package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f17776a;
    public final long f17777b;
    public long f17779e;
    public long f17780f;
    public long f17781g;
    public long h;
    public boolean f17782i;
    public final RectF f17778c = new RectF();
    public float f17783j = 0.0f;
    public float f17784k = 0.0f;
    public float f17785l = Float.MAX_VALUE;
    public float f17786m = 0.0f;
    public final long d = Utilities.f22805b.nextLong();

    public d(int i7, long j3) {
        this.f17776a = i7;
        this.f17777b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f17776a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f17781g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f17784k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f17783j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f17783j;
        if (f10 != 0.0f) {
            float f11 = this.f17785l;
            float f12 = this.f17786m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
