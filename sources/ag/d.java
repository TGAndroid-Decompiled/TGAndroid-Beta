package ag;

import org.telegram.messenger.R;
public final class d extends m {
    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final float d() {
        return 1.0f;
    }

    @Override
    public final int e() {
        return R.raw.photo_eraser;
    }

    @Override
    public final float g() {
        return 0.35f;
    }

    @Override
    public final String i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return "brush";
            }
            return "compositeWithMaskEraser";
        }
        return "blitWithMaskEraser";
    }
}
