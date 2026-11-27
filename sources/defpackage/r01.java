package defpackage;
public final class r01 extends v01 {
    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final float c() {
        return 1.0f;
    }

    @Override
    public final int d() {
        return 2131624128;
    }

    @Override
    public final float f() {
        return 0.35f;
    }

    @Override
    public final String h(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return "brush";
            }
            return "compositeWithMaskEraser";
        }
        return "blitWithMaskEraser";
    }
}
