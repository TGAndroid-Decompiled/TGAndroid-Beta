package hh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final int f11429a;
    public final long f11430b;
    public long f11432e;
    public long f11433f;
    public long f11434g;
    public long h;
    public boolean f11435i;
    public final RectF f11431c = new RectF();
    public float f11436j = 0.0f;
    public float f11437k = 0.0f;
    public float f11438l = Float.MAX_VALUE;
    public float f11439m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j3) {
        this.f11429a = i10;
        this.f11430b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f11429a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f11434g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f11437k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f11436j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f11436j;
        if (f7 != 0.0f) {
            float f10 = this.f11438l;
            float f11 = this.f11439m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
