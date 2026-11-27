package defpackage;
public abstract class oee {
    public static xbe a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return xbe.NEVER;
                    }
                    return xbe.FAST_IF_RADIO_AWAKE;
                }
                return xbe.UNMETERED_OR_DAILY;
            }
            return xbe.UNMETERED_ONLY;
        }
        return xbe.DEFAULT;
    }
}
