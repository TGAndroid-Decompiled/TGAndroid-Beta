package dg;

import org.telegram.messenger.R;
public final class e extends m {
    @Override
    public final float a() {
        return 0.7f;
    }

    @Override
    public final int c() {
        return -13318311;
    }

    @Override
    public final float d() {
        return 0.5f;
    }

    @Override
    public final int e() {
        return R.raw.photo_neon;
    }

    @Override
    public final float g() {
        return 0.2f;
    }

    @Override
    public final float h() {
        return 1.45f;
    }

    @Override
    public final String i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return "brushLight";
            }
            return "compositeWithMaskLight";
        }
        return "blitWithMaskLight";
    }

    @Override
    public final float k() {
        return 0.07f;
    }

    @Override
    public final int l() {
        return R.drawable.paint_neon_brush;
    }
}
