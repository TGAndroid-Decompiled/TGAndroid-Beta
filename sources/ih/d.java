package ih;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f13109a;
    public final long f13110b;
    public long e;
    public long f13112f;
    public long f13113g;
    public long h;
    public boolean f13114i;
    public final RectF f13111c = new RectF();
    public float f13115j = 0.0f;
    public float f13116k = 0.0f;
    public float f13117l = Float.MAX_VALUE;
    public float f13118m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j10) {
        this.f13109a = i10;
        this.f13110b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f13109a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f13113g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f13116k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f13115j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f13115j;
        if (f7 != 0.0f) {
            float f10 = this.f13117l;
            float f11 = this.f13118m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
