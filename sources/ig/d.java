package ig;
public final class d extends h {
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
        return 2131624125;
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
