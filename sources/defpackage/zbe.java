package defpackage;
public abstract class zbe {
    public static i9e a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return i9e.NEVER;
                    }
                    return i9e.FAST_IF_RADIO_AWAKE;
                }
                return i9e.UNMETERED_OR_DAILY;
            }
            return i9e.UNMETERED_ONLY;
        }
        return i9e.DEFAULT;
    }
}
