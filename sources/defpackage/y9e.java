package defpackage;
public abstract class y9e {
    public static h7e a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return h7e.NEVER;
                    }
                    return h7e.FAST_IF_RADIO_AWAKE;
                }
                return h7e.UNMETERED_OR_DAILY;
            }
            return h7e.UNMETERED_ONLY;
        }
        return h7e.DEFAULT;
    }
}
