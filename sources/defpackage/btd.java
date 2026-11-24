package defpackage;
public final class btd {
    public static final btd b = new btd((byte) 0);
    public static final btd c = new btd((byte) 1);
    public static final btd d = new btd((byte) 2);
    public static final btd e = new btd((byte) 3);
    public static final btd f = new btd((byte) 4);
    public static final btd g = new btd((byte) 5);
    public static final btd h = new btd((byte) 6);
    public static final btd i = new btd((byte) 7);
    public final byte a;

    public btd(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i2) {
        fme fmeVar;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                }
                return true;
            case 2:
                if (mlb.d(i2) == 0) {
                    return false;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                fmeVar = null;
                            } else {
                                fmeVar = fme.ALTERNATIVE_BILLING_ACTION;
                            }
                        } else {
                            fmeVar = fme.LOCAL_PURCHASES_UPDATED_ACTION;
                        }
                    } else {
                        fmeVar = fme.PURCHASES_UPDATED_ACTION;
                    }
                } else {
                    fmeVar = fme.BROADCAST_ACTION_UNSPECIFIED;
                }
                if (fmeVar == null) {
                    return false;
                }
                return true;
            case 4:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                    return false;
                }
                return true;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                if (i2 != 0 && i2 != 1) {
                    return false;
                }
                return true;
        }
    }
}
